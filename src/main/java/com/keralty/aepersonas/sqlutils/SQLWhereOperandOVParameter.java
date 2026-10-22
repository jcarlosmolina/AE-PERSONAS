package com.keralty.aepersonas.sqlutils;

import java.util.Collection;

import org.slf4j.LoggerFactory;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.persistence.oid.IOid;

/**
 *
 * This class set up an operand for a object valued parameter.
 *
 */
public class SQLWhereOperandOVParameter extends SQLWhereOperandPathInstance {

    /** Parameter definition class. */
    private String parameterClass;

    /** OID parameter value. */
    private IOid parameterValue;

    /** Parameter name. */
    private String parameterName;

    /**
     * Creates a new operand to be used in a condition Its a object valued operand
     * starting in an object valued parameter.
     * 
     * @param path           Expression, including parameter name and role path
     * @param parameterClass Parameter definition class
     * @param facetClass     Facet that must be reached by the parameter
     * @param parameterValue OID value
     * @param parameterName  Parameter name
     */
    public SQLWhereOperandOVParameter(String path, String parameterClass, String facetClass, IOid parameterValue,
            String parameterName) {
        super(path, facetClass);
        this.parameterClass = parameterClass;
        this.parameterValue = parameterValue;
        int pointIndex = path.indexOf('.');

        // Assign the name replacing "." by "_". Dots are not allowed in SQL names
        if (!parameterName.equalsIgnoreCase("")) {
            this.parameterName = parameterName.replace(".", "$");
            if (this.parameterName.length() == path.length()) {
                setPath("");
            } else {
                setPath(path.substring(this.parameterName.length() + 1));
            }
        } else {
            if (pointIndex != -1) {
                this.parameterName = path.substring(0, pointIndex);
                setPath(path.substring(pointIndex + 1));
            } else {
                this.parameterName = path;
                setPath("");
            }
        }
    }

    /**
     * Processes operand.
     * 
     * @param sql SQL object
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    @Override
    public void processOperand(SQLSelect sql) {
        this.setSql(sql);
        processOperandOVArgument();
    }

    /**
     * Process the operand.
     * 
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    private void processOperandOVArgument() {
        // If role path doesn't exist, just compare the OID field values
        if (getPath().equalsIgnoreCase("")) {
            compareOIDFieldValue();
            return;
        }

        String rolePath = Constants.normalizePath(parameterClass, getPath(), false);
        SQLAlias aliasObject = null;

        // Check if the parameter appears in the alias list.
        aliasObject = getSql().getAliasByParameter(parameterName);

        // If doesn't exist create a new alias and add a new From to the sql sentence
        if (aliasObject == null) {
            try {
                String sourceTable = Constants.nameTable(parameterClass);
                aliasObject = getSql().createAlias(parameterName, parameterClass, parameterName, false,
                        null);
                // Set the parameter name to the alias
                aliasObject.setAssignedParameterName(parameterName);
                getSql().createFrom(sourceTable, aliasObject);
            } catch (Exception e) {
                LoggerFactory.getLogger(SQLWhereOperandOVParameter.class).error(e.getMessage());
            }

            // Add the Where and parameters to the SQL sentence
            fixInstance(aliasObject, parameterValue);
        }

        // Determine effective path
        String effectivePath = (rolePath.isEmpty() ? parameterName : parameterName + "." + rolePath);

        // Check if all or part of the path has already been solved by the sql
        String commonPath = "";
        String processedPath = "";
        String pendingPath = "";
        SQLAlias currentAlias = null;
        SQLAlias originalAlias = getSql().getStartingClassAlias();
        String originalPath = originalAlias.getPath();

        commonPath = getSql().calculateCommonPath(effectivePath);

        if (!originalPath.isEmpty() && effectivePath.startsWith(originalPath)) {
            // There's a common path with respect to the current query
            commonPath = originalPath;
            processedPath = commonPath;
            // Strip the originalPath off the effectivePath and thus obtain the pendingPath
            pendingPath = stripSubPathFromPath(originalPath, effectivePath);
            currentAlias = getSql().getAlias(processedPath, originalAlias.getFacet());
        } else if (!commonPath.isEmpty()) {
            // There's a common path with respect to the superquery
            processedPath = commonPath;
            // Strip the processedPath off the effectivePath and thus obtain the pendingPath
            pendingPath = stripSubPathFromPath(processedPath, effectivePath);
            String processedPathReachedFacet = Constants.pathTargetClass(parameterClass, processedPath, true);
            currentAlias = getSql().getAlias(processedPath, processedPathReachedFacet);
        } else {
            // There's no common path
            // 'processedPath' is 'parameterName'
            pendingPath = rolePath;
            currentAlias = getSql().getAliasByParameter(parameterName);
        }

        // Check if the reached class matches with the owner class of the pendingPath
        String reachedClass = Constants.getTargetFacetElement(currentAlias.getFacet(), pendingPath);
        if (!reachedClass.isEmpty() && !reachedClass.equalsIgnoreCase(currentAlias.getFacet())) {
            // Add the join to the proper class and obtain the final alias
            currentAlias = getSql().addInheritanceJoins(currentAlias, currentAlias.getFacet(), reachedClass);
        }

        // The pendingPath, if any, must be deterministic (traversing only unary
        // relations) and so it can be directly solved

        // Add the expressions to the SQL Where part. Expand the OID class reached by
        // the expression.
        String reachedFacet = (pendingPath.isEmpty() ? currentAlias.getFacet()
                : Constants.pathTargetClass(currentAlias.getFacet(), pendingPath));
        Collection<String> oidReachedClassFields = Constants.getOIDFields(reachedFacet);
        String expressionAlias = currentAlias.getAlias() + (pendingPath.isEmpty() ? "" : "." + pendingPath);
        for (String field : oidReachedClassFields) {
            String oidExpression = expressionAlias + "." + field;
            addOidExpression(oidExpression);
        }
    }

    private String stripSubPathFromPath(String subPath, String path) {
        return (path.startsWith(subPath + ".") ? path.replace(subPath + ".", "") : path.replace(subPath, ""));
    }

    /**
     * Prepares the SQL sentence part in order to compare the values of the
     * parameter OID.
     * 
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    private void compareOIDFieldValue() {

        Collection<String> oidFields = Constants.getOIDFields(getType());
        if (parameterValue != null) {
            Object[] oidValues = parameterValue.getValue();
            String[] oidDataTypes = parameterValue.getDataTypes();
            for (int i = 0; i < oidValues.length; i++) {
                addParameter(new SQLParam("", oidValues[i], oidDataTypes[i]));
                addOidExpression("?");
            }
        } else {
            for (int i = 0; i < oidFields.size(); i++) {
                addParameter(new SQLParam("", null, ""));
                addOidExpression("?");
            }
        }
    }
}
