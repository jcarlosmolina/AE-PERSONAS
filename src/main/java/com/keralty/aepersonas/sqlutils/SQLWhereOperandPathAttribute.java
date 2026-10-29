package com.keralty.aepersonas.sqlutils;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;

/**
 * This class set up an operand for an expression that starting in a role path
 * (optional) finish is an attribute.
 */
public class SQLWhereOperandPathAttribute extends SQLWhereOperand {

    /** Expression. Role path and attribute. */
    private String path;

    /** Alias. */
    private String alias;

    /**
     * Creates a new Operand to be used in a SQL sentence as part of the Where
     * clause.
     * 
     * @param pathAttribute Path expression ending in an attribute
     * @param dataType      Attribute data type
     */
    public SQLWhereOperandPathAttribute(String pathAttribute, String dataType) {
        super(dataType);
        this.path = pathAttribute;
    }

    /**
     * Path used as operand in the WHERE clause of an SQL sentence.
     * 
     * @return {@link String} Path
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the path used as operand in the WHERE clause of an SQL sentence.
     * 
     * @param path Path used as operand
     * @throws SystemException if any system error raised during the execution of
     *                         the method
     */
    public void setPath(String path) throws SystemException {
        this.path = path;
    }

    /**
     * Alias of the path used as operand in the WHERE clause of an SQL sentence.
     * 
     * @return {@link String} Alias
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the alias of the path used as operand in the WHERE clause of an SQL
     * sentence.
     * 
     * @param alias Alias of the path
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * Processes operand.
     * 
     * @param sql SQL sentence
     */
    @Override
    public void processOperand(SQLSelect sql) {
        super.processOperand(sql);
        processOperandAttribute();
    }

    /**
     * Process the operand attribute.
     * 
     */
    private void processOperandAttribute() {
        int pointIndex = -1;
        String targetClass = "";
        String originClass = getSql().getSourceEntityName();
        String processingPath = "";
        String attribute = "";
        String initialPath = "";
        SQLAlias aliasObject = null;
        SQLAlias aliasOriginal = null;

        // Initialize variables
        if (!originClass.isEmpty()) {
            targetClass = originClass;
            // Get the initial Alias
            aliasOriginal = getSql().getAlias("", originClass);
            attribute = Constants.normalizePath(targetClass, path, false);
        } else {
            // Formula in global service. First element is a class name
            pointIndex = path.indexOf('.');
            targetClass = path.substring(0, pointIndex);
            // Get the initial Alias
            aliasOriginal = getSql().getAlias("", targetClass);
            if (aliasOriginal == null) {
                aliasOriginal = getSql().getAlias(targetClass, targetClass);
            }
            attribute = Constants.normalizePath(targetClass, path.substring(pointIndex + 1), false);
        }

        // If definition class alias does not exists, get the SQL starting alias
        if (aliasOriginal == null) {
            aliasOriginal = getSql().getStartingClassAlias();
        }

        // Check if the expression contains a path
        pointIndex = attribute.lastIndexOf('.');
        if (pointIndex > -1) {
            processingPath = attribute.substring(0, pointIndex);
            attribute = attribute.substring(pointIndex + 1);
        }

        aliasObject = aliasOriginal;
        if (!processingPath.equalsIgnoreCase("")) {
            // Check if the path has been processed
            aliasObject = getSql().getAlias(processingPath, Constants.pathTargetClass(targetClass, processingPath));

            // If not found, obtain the alias of the remaining path
            if (aliasObject == null) {
                aliasObject = getSql().addAggregationJoins(aliasOriginal, targetClass, processingPath,
                        Constants.INNERJOIN, initialPath);
            }
        }

        // Get the attribute definition class
        String attributeDefClass = Constants.getTargetFacetElement(aliasObject.getFacet(), attribute);

        SQLAlias attributeAlias = null;
        attributeAlias = aliasObject;
        // If reached class by the alias is not the attribute definition class, add the
        // inheritance joins
        if (!attributeDefClass.equalsIgnoreCase(aliasObject.getFacet())) {
            attributeAlias = getSql().addInheritanceJoins(aliasObject, aliasObject.getFacet(), attributeDefClass);
        }

        // Get the table field name for this attribute
        String fieldName = Constants.nameField(attributeDefClass, attribute);

        // Create the select text for the attribute
        setOperandText(attributeAlias.getAlias() + "." + fieldName);
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
        // If it has been processed, do nothing
        if (this.getProcessForLike()) {
            return;
        }

        if (getType().equalsIgnoreCase("String") && !getCompareWithNull()) {
            setOperandText("RTRIM(" + getOperandText() + ") || '%'");
        } else if (getType().equalsIgnoreCase("Text") && !getCompareWithNull()) {
            setOperandText(getOperandText()  + " || '%'");
        } else {
            setOperandText( getOperandText() + " || '%'");
        }
        super.processForLikeOperator();
    }

    /**
     * This operand is in the right side of the 'Contains' comparison. Concatenates
     * the field name with the special character
     */
    @Override
    public void processForContainsOperator() {
        // If it has been processed, do nothing
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
