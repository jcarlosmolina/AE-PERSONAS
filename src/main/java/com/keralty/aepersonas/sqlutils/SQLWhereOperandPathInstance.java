package com.keralty.aepersonas.sqlutils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;

/**
 * Provides the functionality to set up an operand that is a role expression.
 */
public class SQLWhereOperandPathInstance extends SQLWhereOperand {
	
    /** Origin class. */
    private String originClass; 

    /** Role expression. */
    private String path;
    
    /** Processed path */
    private StringBuilder processingPath;
    
    /** Target class. */
    private String targetClass;

    /** Initial path. */
    private String initialPath;
    
    /** Object alias. */ 
    private SQLAlias aliasObject;
    
    /** Original alias. */
    private SQLAlias aliasOriginal;
    
    /** Is a nullable path?. */
    private boolean isNullable;

    /** OID field expressions. */
    private List<String> oidExpressions = new ArrayList<>();

    /**
     * Creates a new path to be used as operand of the WHERE clause.
     * 
     * @param path       Path to be used as operand
     * @param facetClass Path to be used as operand
     */
    public SQLWhereOperandPathInstance(String path, String facetClass) {
        super(facetClass);
        this.path = path;
    }

    /**
     * Creates a new path to be used as operand of the WHERE clause.
     * 
     * @param path       Path to be used as operand
     * @param facetClass Path to be used as operand
     * @param isNullable Is a nullable path?
     * @throws SystemException if any system error raised during the execution of
     *                         the method
     */
    public SQLWhereOperandPathInstance(String path, String facetClass, boolean isNullable) throws SystemException {
        super(facetClass);
        this.path = path;
        this.isNullable = isNullable;
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
     * @param path the path to be used.
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Collections with the expressions to be used in the instance comparison.
     * 
     * @return {@link List}<{@link String}> expressions
     */
    public List<String> getOidExpressions() {
        return oidExpressions;
    }

    /**
     * Adds am oid expression to the list
     * @param oidExpression Oid expression to be added
     */
    public void addOidExpression(String oidExpression) {
    	oidExpressions.add(oidExpression);
    }
    
    /**
     * Processes operand.
     * 
     * @param sql SQL sentence
     */
    @Override
    public void processOperand(SQLSelect sql) {
        super.processOperand(sql);
        originClass = getSql().getSourceEntityName();
        processingPath = new StringBuilder("");
        targetClass = "";
        initialPath = "";
        aliasObject = null;
        aliasOriginal = null;
        processOperandInstance();
    }

    /**
     * Process the operand when it finish in an attribute.
     */
    private void processOperandInstance() {

        // Initialize variables
        if (!originClass.equalsIgnoreCase("")) {
            initializeVariablesForLocalScope();
        } else {
        	initializeVariablesForGlobalScope();
        }

        aliasObject = aliasOriginal;

        // Obtaining the alias for the path
        if (!processingPath.toString().isEmpty()) {
            aliasObject = getSql().getAlias(path, this.getType());
            // If not found, add joins
            if (aliasObject == null) {
                aliasObject = addJoins(processingPath.toString(), targetClass, aliasOriginal, originClass, initialPath);
            }
        }

        processOIDFields(addInheritanceJoins(aliasObject));

    }
    
    private void initializeVariablesForLocalScope() {
        targetClass = originClass;
        processingPath.append(Constants.normalizePath(originClass, path, false));
        // Get the initial Alias
        if (getSql().getSuperSelect() != null)
            aliasOriginal = getSql().getSuperSelect().getStartingClassAlias();
        else
            aliasOriginal = getSql().getStartingClassAlias();
    }
    
    private void initializeVariablesForGlobalScope() {
        // Formula in global service. First element is a class name
        int pointIndex = path.indexOf('.');
        if (pointIndex != -1) {
            originClass = path.substring(0, pointIndex);
            targetClass = originClass;
            processingPath.append(Constants.normalizePath(originClass, path.substring(pointIndex + 1), false));
        } else {
            originClass = path;
        }
        
        // Get the initial Alias
        determineInitialAlias();

        String processedPath = path;
        processingPath = new StringBuilder("");
        boolean found = false;
        while (!found && !processedPath.isEmpty()) {
            aliasOriginal = getSql().getAlias(processedPath,
                    Constants.pathTargetClass(originClass, processedPath, true));
            if (aliasOriginal == null) {
                aliasOriginal = getSql().getAlias("", Constants.pathTargetClass(originClass, processedPath, true));
            }
            if (aliasOriginal != null) {
                found = true;
                originClass = aliasOriginal.getFacet();
                targetClass = originClass;
                // If we can locate an alias for the initial path (as part of the actual 'path')
                // we flag so by setting initialPath to '*'
                SQLAlias temp = getSql().getAlias(processingPath.toString(),
                        Constants.pathTargetClass(originClass, processingPath.toString(), false));
                if (temp != null && !processedPath.isEmpty())
                    initialPath = "*";
            } else {
                processedPath = processPath(processedPath);
            }
        }
    }
    
    private String processPath(String path) {
    	String processedPath = path;
        int indexPoint = processedPath.lastIndexOf('.');
        if (indexPoint != -1) {
            processingPath.insert(0, processedPath.substring(indexPoint + 1)
                    + (processingPath.toString().isEmpty() ? "" : "."));
            processedPath = processedPath.substring(0, indexPoint);
        } else {
            processingPath.insert(0, processedPath + (processingPath.toString().isEmpty() ? "" : "."));
            processedPath = "";
        }
    	return processedPath;
    }
    
    private void determineInitialAlias() {
    	aliasOriginal = getSql().getAlias("", originClass);
        if (aliasOriginal == null) {
            aliasOriginal = getSql().getAlias("", originClass);
        }
        // If alias is null, get the SQL starting alias
        if (aliasOriginal == null) {
            aliasOriginal = getSql().getStartingClassAlias();
        }
    }
    
    private SQLAlias addInheritanceJoins(SQLAlias aliasObject) {
    	SQLAlias updatedAlias = aliasObject;
        // Check if the reached class matches with the definition class of this operand
        if (!this.getType().equalsIgnoreCase("") && aliasObject != null
                && !this.getType().equalsIgnoreCase(aliasObject.getFacet())) {
            // Add the join to the proper class and obtain the final alias
            updatedAlias = getSql().addInheritanceJoins(aliasObject, aliasObject.getFacet(), this.getType());
        }
        return updatedAlias;
    }
    
    private void processOIDFields(SQLAlias aliasObject) {
        // Get the OID fields
        Collection<String> oidFields = Constants.getOIDFields(this.getType());
        if (aliasObject != null) {
            for (String field : oidFields) {
                oidExpressions.add(aliasObject.getAlias() + "." + field);
            }
        }
    }

    /**
     * Add necessary joins
     * 
     * @param processingPath The processing path
     * @param targetClass    Target Class
     * @param aliasOriginal  Original alias
     * @param originClass    Origin class
     * @param initialPath    Initial path
     * @return The alias
     */
    public SQLAlias addJoins(String processingPath, String targetClass, SQLAlias aliasOriginal, String originClass,
            String initialPath) {
        aliasObject = null;
        if (getSql().getOriginalPath().length() != 0 && processingPath.startsWith(getSql().getOriginalPath() + ".")) {
            String processingPathAux = processingPath.replace(getSql().getOriginalPath() + ".", "");
            aliasObject = getSql().getAlias(getSql().getOriginalPath(),
                    Constants.pathTargetClass(targetClass, getSql().getOriginalPath()));
            if (aliasObject != null && !processingPathAux.equalsIgnoreCase("")) {
                // Add joins to complete the path
                aliasObject = getSql().addAggregationJoins(aliasObject,
                        Constants.pathTargetClass(targetClass, getSql().getOriginalPath()), processingPathAux,
                        isNullable ? Constants.LEFTJOIN : Constants.INNERJOIN, getSql().getOriginalPath());
            } else {
                // Add joins
                aliasObject = getSql().addAggregationJoins(aliasOriginal, originClass, processingPath,
                        isNullable ? Constants.LEFTJOIN : Constants.INNERJOIN, initialPath);
            }
        } else {
            // Add joins
            aliasObject = getSql().addAggregationJoins(aliasOriginal, originClass, processingPath,
                    isNullable ? Constants.LEFTJOIN : Constants.INNERJOIN, initialPath);
        }
        return aliasObject;
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

        StringBuilder operandTempText = new StringBuilder("");

        // Modify the OID fields expressions and add parameters to the SQL sentence
        List<String> newList = new ArrayList<>();
        for (String expression : getOidExpressions()) {
            if (operator.equalsIgnoreCase("<>")) {
                expression += " is not null";
            } else if (operator.equalsIgnoreCase("=")) {
                expression += " is null";
            } else {
                expression += " " + operator + " ?";
                addParameter(new SQLParam("", null, ""));
            }

            newList.add(expression);

            if (!operandTempText.toString().isEmpty()) {
                operandTempText.append(" AND ");
            }

            operandTempText.append(expression);
        }
        getOidExpressions().clear();
        getOidExpressions().addAll(newList);

        setOperandText(operandTempText.toString());

        super.setComparisonWithNull(operator);
    }
}
