package com.keralty.aepersonas.sqlutils;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.persistence.oid.IOid;

/**
 * Solves the operands that starting in a object valued parameter finish with an
 * attribute.
 */
public class SQLWhereOperandOVParameterAttribute extends SQLWhereOperand {

    /** Expression containing the parameter, path and attribute. */
    private String path;

    /** Parameter definition Class. */
    private String parameterClass;

    /** OID parameter value. */
    private IOid parameterValue;

    /** Parameter name. */
    private String parameterName;

    private SQLAlias currentAlias;

    private String pendingPath;

    /**
     * Constructor for an operand starting with an object-valued parameter and
     * finish with an attribute.
     * 
     * @param path           Expression
     * @param parameterClass Parameter Class
     * @param parameterValue OID parameter value
     * @param parameterName  Parameter name
     * @param dataType       Data type
     * @throws SystemException if any system error raised during the execution of
     *                         the method
     */
    public SQLWhereOperandOVParameterAttribute(String path, String parameterClass, IOid parameterValue,
            String parameterName, String dataType) throws SystemException {
        super(dataType);
        this.path = path;
        this.parameterClass = parameterClass;
        this.parameterValue = parameterValue;

        int pointIndex = path.indexOf('.');

        // Assign the name replacing "." by "_". Dots are not allowed in SQL names
        if (!parameterName.equalsIgnoreCase("")) {
            this.parameterName = parameterName.replace(".", "$");
            if (this.parameterName.length() == path.length()) {
                this.path = "";
            } else {
                this.path = path.substring(this.parameterName.length() + 1);
            }
        } else {
            if (pointIndex != -1) {
                this.parameterName = path.substring(0, pointIndex);
                this.path = path.substring(pointIndex + 1);
            } else {
                this.parameterName = path;
                this.path = "";
            }
        }

    }

    /**
     * Returns the value of the parameter
     * 
     * @return Value of the parameter
     */
    public IOid getParameterValue() {
        return parameterValue;
    }

    /**
     * Processes operand.
     * 
     * @param sql SQL sentence
     */
    @Override
    public void processOperand(SQLSelect sql) {
        super.processOperand(sql);
        processOperandOVParameterAttribute();
    }

    /**
     * Process the operand.
     * 
     */
    private void processOperandOVParameterAttribute() {

        String rolePath = "";
        String attributeName = "";

        // Get rolePath and Attribute name
        this.path = Constants.normalizePath(parameterClass, path, false);

        int pointAttrIndex = this.path.lastIndexOf('.');
        if (pointAttrIndex != -1) {
            attributeName = this.path.substring(pointAttrIndex + 1);
            rolePath = this.path.substring(0, pointAttrIndex);
        } else {
            attributeName = this.path;
            rolePath = "";
        }

        // Process the path
        processPath(rolePath);

        // Check if the reached class matches with the owner class of the pendingPath
        String reachedClass = currentAlias != null
        		? Constants.getTargetFacetElement(currentAlias.getFacet(), pendingPath)
        		: "";
        if (!reachedClass.isEmpty() && currentAlias != null && !reachedClass.equalsIgnoreCase(currentAlias.getFacet())) {
            // Add the join to the proper class and obtain the final alias
            currentAlias = getSql().addInheritanceJoins(currentAlias, currentAlias.getFacet(), reachedClass);
        }

        // The pendingPath, if any, must be deterministic (traversing only unary
        // relations) and so it can be directly solved
        // Create the operand text for the attribute
        if (currentAlias != null)
        	setOperandText(currentAlias.getAlias() + "." + (pendingPath.isEmpty() ? "" : pendingPath + ".") + attributeName);
    }

    private void processPath(String rolePath) {
        // Determine effective path
        String effectivePath = (rolePath.isEmpty() ? parameterName : parameterName + "." + rolePath);

        // Check if all or part of the path has already been solved by the sql
        String processedPath = "";
        SQLAlias originalAlias = getSql().getStartingClassAlias();
        String originalPath = originalAlias.getPath();

        String commonPath = getSql().calculateCommonPath(effectivePath);

        if (!originalPath.isEmpty() && effectivePath.startsWith(originalPath)) {
            // There's a common path with respect to the current query
            commonPath = originalPath;
            processedPath = commonPath;
            // Strip the originalPath off the effectivePath and thus obtain the pendingPath
            if (effectivePath.startsWith(originalPath + ".")) {
                pendingPath = effectivePath.replace(originalPath + ".", "");
            } else {
                pendingPath = effectivePath.replace(originalPath, "");
            }
            currentAlias = getSql().getAlias(processedPath, originalAlias.getFacet());
        } else if (!commonPath.isEmpty()) {
            // There's a common path with respect to the superquery
            processedPath = commonPath;
            // Strip the originalPath off the effectivePath and thus obtain the pendingPath
            if (effectivePath.startsWith(processedPath + ".")) {
                pendingPath = effectivePath.replace(processedPath + ".", "");
            } else {
                pendingPath = effectivePath.replace(processedPath, "");
            }
            String processedPathReachedFacet = Constants.pathTargetClass(parameterClass, processedPath, true);
            currentAlias = getSql().getAlias(processedPath, processedPathReachedFacet);
        } else {
            // 'processedPath' is 'parameterName'
            pendingPath = rolePath;
            currentAlias = getSql().getAliasByParameter(parameterName);
        }
    }

    /**
     * Set the comparison of this operand with Null.
     * 
     * @param operator Operator to be used
     */
    @Override
    public void setComparisonWithNull(String operator) {
        if (this.getCompareWithNull()) {
            return;
        }

        if (operator.equalsIgnoreCase("<>")) {
            this.setOperandText(getOperandText() + " is not null");
        } else if (operator.equalsIgnoreCase("=")) {
            this.setOperandText(getOperandText() + " is null");
        } else {
            this.setOperandText(getOperandText() + " " + operator + " ?");
            addParameter(new SQLParam("", null, ""));
        }
        super.setComparisonWithNull(operator);
    }

    /**
     * This operand is in the right side of the 'Like' comparison. Concatenates the
     * field name with the special character
     */
    @Override
    public void processForLikeOperator() {
        // If it has been process, do nothing
        if (this.getProcessForLike()) {
            return;
        }

        if (getType().equalsIgnoreCase("String") && !getCompareWithNull()) {
            setOperandText("RTRIM(" + getOperandText() + ") || '%'");
        } else if (getType().equalsIgnoreCase("Text") && !getCompareWithNull()) {
            setOperandText(getOperandText()  + " || '%'");
        } else {
            setOperandText(getOperandText() + " || '%'");
        }
        super.processForLikeOperator();
    }

    /**
     * This operand is in the right side of the 'Contains' comparison. Concatenates
     * the field name with the special character
     */
    @Override
    public void processForContainsOperator() {
        // If it has been process, do nothing
        if (this.getProcessForContains()) {
            return;
        }

        if (getType().equalsIgnoreCase("String") && !getCompareWithNull()) {
            setOperandText("'%' || RTRIM(" + getOperandText() + ") || '%'");
        } else if (getType().equalsIgnoreCase("Text") && !getCompareWithNull()) {
            setOperandText("'%' || " + getOperandText() + " || '%'");
        } else {
            setOperandText("'%' || " + getOperandText() + " || '%'");
        }
        super.processForContainsOperator();
    }
}
