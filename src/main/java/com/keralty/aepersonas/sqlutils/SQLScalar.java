package com.keralty.aepersonas.sqlutils;

import java.util.Collection;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.persistence.oid.IOid;

/**
 * Provides the functionality to set up an SQL select statement that returns a scalar value.
 *
 */
public class SQLScalar extends SQLSelect {

    /** Path role expression. */
    private String targetPathToAttribute;

    /** Attribute name. */
    private String targetAttributeName;

    /** Name of the table field of the used attribute. */
    private String targetTableFieldName;

    /** Class name reached by the role path. */
    private String pathDefinitionClass;

    /** Attribute definition class. */
    private String attributeDefinitionClass;

    /** Inverse role path. */
    private String inversePath;

    /** Alias of the attribute used in the expression. */
    private SQLAlias attributeAlias;

    /** Parameter definition class. */
    private String parameterClassName;

    private String initialTable;
    
    private String commonPath;

    private String effectivePath;

    private SQLAlias currentAlias;
    
    /**
     * Constructor for a SQL scalar operation.
     * @param superQuery Super SQL. This one will be a sub query
     * @param sourceEntityName Formula definition class
     * @param targetPathToAttribute Role path to the attribute, it may be empty string
     * @param targetAttributeName Attribute name to be used in the scalar operation
     * @param instance OID of the starting instance
     * @param parameterClassName Parameter definition formula
     * @param parameterName Parameter name
     * @throws SystemException if any system error raised during the execution of the method.
     */
    public SQLScalar(SQLSelect superQuery, String sourceEntityName, String targetPathToAttribute, String targetAttributeName, IOid instance, String parameterClassName, String parameterName) throws SystemException {
        super(superQuery);
        setClassNameInGlobalService("");

        setSourceEntityName(sourceEntityName);

        setTargetAttributeName(targetAttributeName);

        if (parameterClassName.equalsIgnoreCase("")) {
            initializeFromInstance(targetPathToAttribute, instance);
        } else {
            initializeFromParameter(targetPathToAttribute, instance, parameterClassName, parameterName);
        }
    }

    /**
    * Initialize the class members and process the operator when the path is starting in a Role.
    * @param targetPathToAttribute Attribute name to be used in the scalar operation
    * @param instance OID of the starting instance
    * @throws SystemException if any system error raised during the execution of the method.
    */
    private void initializeFromInstance(String targetPathToAttribute, IOid instance) throws SystemException {
        setClassNameInGlobalService("");

        this.setObjectValuedParameterName("");

        setTargetPathToAttribute(targetPathToAttribute);

        locateRolePathDefinitionClass();

        locateAttributeDefinitionClass();

        // Name of the field table
        if (!getTargetAttributeName().equalsIgnoreCase("")) {
            targetTableFieldName = Constants.nameField(this.attributeDefinitionClass, this.targetAttributeName);
        }

        addFromPart();

        addFieldsDistinctPart();

        if (instance != null) {
            SQLAlias instancePathAlias = null;
            if (this.getAliases().get(0).getFacet().equalsIgnoreCase(getSourceEntityName())) {
                instancePathAlias = getAliases().get(0);
            } else {
                if (inversePath.length() == 0)
                    instancePathAlias = getAlias(getTargetPathToAttribute(), getSourceEntityName());
                else
                    instancePathAlias = getAlias(getTargetPathToAttribute() + "." + inversePath, getSourceEntityName());
            }
            if (instancePathAlias != null) {
                addFixInstance(instance, instancePathAlias);
            }
        }
    }

    private void locateRolePathDefinitionClass() {
        int pointIndex = -1;
        if (!getSourceEntityName().equalsIgnoreCase("")) {
            pathDefinitionClass = Constants.pathTargetClass(getSourceEntityName(), getTargetPathToAttribute());
        } else {
            // Formula in global service
            pointIndex = targetPathToAttribute.indexOf('.');
            // Assign the path, without the class name
            if (pointIndex != -1) {
                setClassNameInGlobalService(getTargetPathToAttribute().substring(0, pointIndex));
                setTargetPathToAttribute(getTargetPathToAttribute().substring(pointIndex + 1));
                pathDefinitionClass = Constants.pathTargetClass(getClassNameInGlobalService(),
                        getTargetPathToAttribute());
            } else {
                setClassNameInGlobalService(getTargetPathToAttribute());
                setTargetPathToAttribute("");
                pathDefinitionClass = getClassNameInGlobalService();
            }
        }
    }

    private void locateAttributeDefinitionClass() throws SystemException {
        // Locate attribute definition class. 
        // If no attribute name, use the path definition class
        if (!getTargetAttributeName().equalsIgnoreCase("")) {
            attributeDefinitionClass = Constants.getTargetFacetElement(pathDefinitionClass, getTargetAttributeName());
        } else {
            attributeDefinitionClass = pathDefinitionClass;
        }

        // Locate inverse role path
        if (!getSourceEntityName().equalsIgnoreCase("")) {
            inversePath = Constants.getInverseRole(getSourceEntityName(), getTargetPathToAttribute());
        } else {
            if (!getTargetPathToAttribute().equalsIgnoreCase("")) {
                inversePath = Constants.getInverseRole(getClassNameInGlobalService(), getTargetPathToAttribute());
            } else {
                inversePath = "";
            }
        }

    }

    /**
     * Initialize the class members and process the operator when the path is starting in a object valued parameter.
     * @param targetPathToAttribute Attribute name to be used in the scalar operation
     * @param instance OID of the starting instance
     * @param parameterClassName Parameter definition formula
     * @param paramName Parameter name
     * @throws SystemException if any system error raised during the execution of the method.
     */
    private void initializeFromParameter(String targetPathToAttribute, IOid instance, String parameterClassName, String paramName) throws SystemException {
        this.parameterClassName = parameterClassName;

        separateParameterNameFromPath(targetPathToAttribute, paramName);

        // Locate role path definition class
        pathDefinitionClass = Constants.pathTargetClass(parameterClassName, getTargetPathToAttribute());

        // Locate attribute definition class
        if (!getTargetAttributeName().equalsIgnoreCase("")) {
            attributeDefinitionClass = Constants.getTargetFacetElement(pathDefinitionClass, getTargetAttributeName());
        } else {
            attributeDefinitionClass = pathDefinitionClass;
        }

        // Locate inverse role path
        inversePath = Constants.getInverseRole(parameterClassName, getTargetPathToAttribute());

        // Name of the field table
        if (!getTargetAttributeName().equalsIgnoreCase("")) {
            targetTableFieldName = Constants.nameField(this.attributeDefinitionClass, this.targetAttributeName);
        }

        addFromPart();

        addFieldsDistinctPart();

        if (instance != null) {
            SQLAlias instancePathAlias = null;
            if (this.getAliases().get(0).getFacet().equalsIgnoreCase(parameterClassName)) {
                instancePathAlias = getAliases().get(0);
            } else {
                if (inversePath.length() == 0)
                    instancePathAlias = getAlias(getTargetPathToAttribute(), getSourceEntityName());
                else
                    instancePathAlias = getAlias(getTargetPathToAttribute() + "." + inversePath, getSourceEntityName());
            }
            if (instancePathAlias != null) {
                addFixInstance(instance, instancePathAlias);
            }
        }
    }

    private void separateParameterNameFromPath(String targetPathToAttribute, String paramName) {
        int pointIndex = -1;
        // If parameter name is provided, change "." by "_"
        // Separate parameter name and Path
        if (!paramName.isEmpty()) {
            paramName = paramName.replace(".", "$");
            this.setObjectValuedParameterName(paramName);

            if (targetPathToAttribute.length() > paramName.length()) {
                setTargetPathToAttribute(targetPathToAttribute.substring(paramName.length() + 1));
            } else {
                setTargetPathToAttribute("");
            }
        } else {
            pointIndex = targetPathToAttribute.indexOf('.');

            if (pointIndex != -1) {
                this.setObjectValuedParameterName(targetPathToAttribute.substring(0, pointIndex));
                setTargetPathToAttribute(targetPathToAttribute.substring(pointIndex + 1));
            } else {
                this.setObjectValuedParameterName(targetPathToAttribute);
                setTargetPathToAttribute("");
            }
        }
    }

    /**
     * Add the from clause information of the attribute definition class.
     * @throws SystemException if any system error raised during the execution of the method.
     */
    private void addFromPart() throws SystemException {
        processFromPath();

        determineInitialTable();

        determineInitialCurrentAlias();

        if (!effectivePath.isEmpty()) {
            processEffectivePath();
        } else {
            if (this.getFromPart().isEmpty() && currentAlias != null) {
                this.createFrom(currentAlias.getFacet(), currentAlias);

                if (!this.getAliases().contains(currentAlias)) {
                    this.addAlias(currentAlias);
                }
            }
        }
        attributeAlias = currentAlias;
        setStartingClassAlias(attributeAlias);
    }

    private void processFromPath() {
        String aliasPath = "";
        if (!getClassNameInGlobalService().isEmpty())
            aliasPath = getClassNameInGlobalService();
        if (!getObjectValuedParameterName().isEmpty())
            aliasPath = getObjectValuedParameterName();
        if (!getTargetPathToAttribute().isEmpty()) {
            aliasPath += (aliasPath.isEmpty() ? "" : ".") + getTargetPathToAttribute();
        }

        String originalPath = aliasPath;
        commonPath = this.calculateCommonPath();
        effectivePath = originalPath;
        if (!commonPath.isEmpty()) {
            if (effectivePath.equalsIgnoreCase(commonPath)) {
                // originalPath same as commonPath
                effectivePath = "";
            } else {
                // originalPath is larger than commonPath
                effectivePath = effectivePath.replace(commonPath + ".", "");
            }
        }
    }

    private String determineInitialTable() {
        if (!getObjectValuedParameterName().isEmpty()) {

            initialTable = this.parameterClassName; // Path starts with an argument
        } else if (!getSourceEntityName().isEmpty()) {
            initialTable = getSourceEntityName(); // Path starts with role name in the context of a class
        } else {
            initialTable = getClassNameInGlobalService(); // Path starts with a class name in the context of a global
                                                          // service
        }
        return initialTable;
    }

    private void determineInitialCurrentAlias() {
        if (commonPath.isEmpty()) {
            // If no common path but nested
            // try to obtain currentAlias from the superQuery
            if (getObjectValuedParameterName().isEmpty() && getSuperSelect() != null
                    && getSuperSelect().getSourceEntityName().equalsIgnoreCase(initialTable)) {
                currentAlias = this.getSuperSelect().getAlias(commonPath,
                        Constants.pathTargetClass(this.getSuperSelect().getSourceEntityName(), commonPath));
            }
        } else {
            // Get the alias of the common path
            SQLAlias commonPathAlias = this.getSuperSelect().getAlias(commonPath,
                    Constants.pathTargetClass(initialTable, commonPath));
            // Alias has not been found but it exists in the superSelect with an empty path
            if (commonPathAlias == null) {
                commonPathAlias = this.getSuperSelect().getAlias("", commonPath);
            }
            initialTable = commonPathAlias.getFacet();
            currentAlias = commonPathAlias;
        }

        determineInitialCurrentAlias4ArgumentInitiatedPath();

        determineInitialCurrentAlias4LocalContext();

        determineInitialCurrentAlias4GlobalContext();

    }

    private void determineInitialCurrentAlias4ArgumentInitiatedPath() {
        // If no currentAlias but path starts with an argument
        // create an alias for the domain of the argument with its name as the path
        // and add it to the FROM clause
        if (currentAlias == null && !getObjectValuedParameterName().isEmpty()) {
            currentAlias = this.createAlias(getObjectValuedParameterName().replace('$', '.'),
                    parameterClassName, getObjectValuedParameterName(), false, null);
            currentAlias.setAssignedParameterName(getObjectValuedParameterName());
            this.createFrom(this.parameterClassName, currentAlias);
        }
    }

    private void determineInitialCurrentAlias4LocalContext() {
        // If no currentAlias but in the context of a class (no global service, no
        // argument initiated path)
        // create and alias for the source entity with empty path
        // and add it to the FROM clause
        if (currentAlias == null && !getSourceEntityName().isEmpty()) {
            currentAlias = this.createAlias("", getSourceEntityName(), getSourceEntityName(),
                    false, null);
            this.createFrom(getSourceEntityName(), currentAlias);
        }
    }

    private void determineInitialCurrentAlias4GlobalContext() {
        // If no currentAlias but in a global context (the path starts with class name,
        // and we remove it)
        if (currentAlias == null && !getClassNameInGlobalService().isEmpty()) {
            currentAlias = this.createAlias("", getClassNameInGlobalService(),
                    getClassNameInGlobalService(), false, null);
            this.createFrom(getClassNameInGlobalService(), currentAlias);
            if (effectivePath.equalsIgnoreCase(getClassNameInGlobalService())) {
                effectivePath = "";
            }
            if (effectivePath.startsWith(getClassNameInGlobalService() + "."))
                effectivePath = effectivePath.replace(getClassNameInGlobalService() + ".", "");
        }
    }
	         
    private void processEffectivePath() throws SystemException {
        StringBuilder pathInProgress = new StringBuilder(commonPath);
        String currentTable = initialTable;
        String[] pathItems = effectivePath.split(Constants.REGEXP_DOT_SEPARATOR);
        for (String pathItem : pathItems) {

            // Skip first pathItem if it equals the OV parameter name and no pathInProgress
            // so far
            if (pathInProgress.toString().isEmpty() && !this.getObjectValuedParameterName().isEmpty()
                    && this.getObjectValuedParameterName().equals(pathItem)) {
                continue;
            }

            if (pathInProgress.toString().isEmpty()) {
                pathInProgress.append(this.getObjectValuedParameterName().isEmpty() ? pathItem
                        : this.getObjectValuedParameterName() + "." + pathItem);
            } else {
                pathInProgress.append("." + pathItem);
            }

            String nextTable = Constants.pathTargetClass(currentTable, pathItem);
            String nextAliasTableExpr = (currentAlias != null ? currentAlias.getAlias() + "." + pathItem
                    : currentTable);

            // Create next alias...
            SQLAlias nextAlias = null;

            // ... for a FROM or for a JOIN
            if (this.getFromPart().isEmpty()) {
                // First item in the path --> Create FROM entry
                nextAlias = this.createAlias(pathInProgress.toString(), nextTable, nextTable, false,
                        null);
                this.createFrom(nextAliasTableExpr, nextAlias);
            } else {
                // Second to Nth item in the path --> Add as JOIN to initial FROM entry
                nextAlias = this.addAggregationJoins(currentAlias, currentTable, pathItem, Constants.INNERJOIN);
                nextAlias.setPath(pathInProgress.toString().replace('$', '.'));
            }
            // Update current alias, table
            currentAlias = nextAlias;
            currentTable = nextTable;
        }
    }

    /**
     * Returns the common path with the super query, if any.
     * @return common path with the super query.
     */
    private String calculateCommonPath() {
    	return calculateCommonPath(this.getOriginalPath());
    }

    /**
     * Returns the common path with the super query, if any.
     * @param originalPath path to be compared with that of the super query.
     * @return common path with the super query.
     */    
    @Override
    protected String calculateCommonPath(String originalPath) {
        StringBuilder calculatedCommonPath = new StringBuilder("");
        String superSelectPath = "";
        String myPath = originalPath.replace(".", ":");

        if (getSuperSelect() == null) {
            calculatedCommonPath = new StringBuilder("");
        } else {
            superSelectPath = getSuperSelect().getOriginalPath().replace(".", ":");

            String[] superRoleList = superSelectPath.split(":");
            String[] myRoleList = myPath.split(":");

            for (int i = 0; i < superRoleList.length; i++) {
                if (myRoleList.length <= i) {
                    break;
                }
                if (superRoleList[i].equalsIgnoreCase(myRoleList[i]) && !calculatedCommonPath.toString().isEmpty()) {
                    calculatedCommonPath.append(".");
                    calculatedCommonPath.append(superRoleList[i]);
                } else if (superRoleList[i].equalsIgnoreCase(myRoleList[i]) && calculatedCommonPath.toString().isEmpty()) {
                    calculatedCommonPath.append(superRoleList[i]);
                }
            }
        }
        return calculatedCommonPath.toString();
    }

    /**
     * Add the attribute definition class OID fields to the Select.
     */
    private void addFieldsDistinctPart() {

        String attrAlias = this.attributeAlias.getAlias();
        String attributeText = attrAlias + "." + getTargetTableFieldName();
        String fieldText = "";
        boolean addAttributeText = true;
        String attributeTextWithCast = attributeText;

        Collection<String> oidFields = Constants.getOIDFields(attributeDefinitionClass);

        for (String field : oidFields) {
            fieldText = attrAlias + "." + field;
            if (fieldText.equalsIgnoreCase(attributeText)) {
                addAttributeText = false;
                addToSelectPart(attributeTextWithCast);
            } else {
                addToSelectPart(fieldText);
            }
        }

        // Add the field
        if (addAttributeText && !this.getTargetAttributeName().equalsIgnoreCase("")) {
            addToSelectPart(attributeTextWithCast);
        }
    }

    /**
     * Name of the attribute on which the query operates.
     * @return {@link String} Name of the attribute on which the query operates. Empty string if it operates on instances.
     */
    public String getTargetAttributeName() {
        return targetAttributeName;
    }

    /**
     * Path expression of the select clause.
     * @return {@link String} Path expression of the select clause (except the attribute, if any)
     */
    public String getTargetPathToAttribute() {
        return targetPathToAttribute;
    }

    /**
     * Gets the class name reached by the role path.
     * @return {@link String} Class name reached by the role path
     */
    public String getPathDefinitionClass() {
        return pathDefinitionClass;
    }

    /**
     * Sets the path expression of the select clause.
     * @param targetPathToAttribute String with the path expression
     */
    public void setTargetPathToAttribute(String targetPathToAttribute) {
    	String startingClass = this.getSourceEntityName();
    	boolean ignoreFirstItem = false;
    	if (getClassNameInGlobalService().length() != 0) {
            startingClass = getClassNameInGlobalService();
            ignoreFirstItem = true;
    	}
    	if (this.parameterClassName != null && this.parameterClassName.length() != 0) {
            startingClass = parameterClassName;
    	}
    	this.targetPathToAttribute = Constants.normalizePath(startingClass, targetPathToAttribute, ignoreFirstItem);
    }

    /**
     * Sets the attribute name.
     * @param targetAttributeName String with the attribute name
     */
    public void setTargetAttributeName(String targetAttributeName) {
        this.targetAttributeName = targetAttributeName;
    }

    /**
     * Sets the path definition class.
     * @param pathDefinitionClass String with the path definition class
     */
    public void setPathDefinitionClass(String pathDefinitionClass) {
        this.pathDefinitionClass = pathDefinitionClass;
    }

    /**
     * Gets the attribute definition class.
     * @return {@link String} Attribute definition class
     */
    public String getAttributeDefinitionClass() {
        return attributeDefinitionClass;
    }

    /**
     * Gets the inverse Path.
     * @return {@link String} Inverse path
     */
    public String getInversePath() {
        return inversePath;
    }

    /**
     * Sets the attribute definition class.
     * @param attributeDefinitionClass String with the attribute definition class
     */
    public void setAttributeDefinitionClass(String attributeDefinitionClass) {
        this.attributeDefinitionClass = attributeDefinitionClass;
    }

    /**
     * Sets the Inverse path of the select part.
     * @param inversePath String with the inverse path
     */
    public void setInversePath(String inversePath) {
        this.inversePath = inversePath;
    }

    /**
     * Gets the Name of the table field of the used attribute.
     * @return {@link String} String with the target table field name
     */
    public String getTargetTableFieldName() {
        return targetTableFieldName;
    }

    /**
     * Gets the Attribute alias.
     * @return {@link String} String with the attribute alias
     */
    protected SQLAlias getAttributeAlias() {
        return attributeAlias;
    }

    /**
     * Sets the Attribute alias.
     * @param attributeAlias String with the aatribute alias
     */
    protected void setAttributeAlias(SQLAlias attributeAlias) {
        this.attributeAlias = attributeAlias;
    }

    /**
     * Returns the original path for this operator. Role path including the class name if the formula
     * is defined in a global service, otherwise only the role path.
     * @return String, the original path for this operator
     */
    @Override
    protected String getOriginalPath() {
        String originalPath = "";

        if (!getClassNameInGlobalService().isEmpty()) {
            originalPath += getClassNameInGlobalService();
        }
        
        if (!getObjectValuedParameterName().isEmpty()) {
        	originalPath += getObjectValuedParameterName();
        }

        if (!getTargetPathToAttribute().isEmpty()) {
            originalPath += (!originalPath.isEmpty() ? "." : "") + getTargetPathToAttribute();
        }
        return originalPath;
    }

    /**
     * Returns an expression that concatenates the OID fields.
     * @return String
     */
    protected String getConcatenatedOID() {

        String attrAlias = this.attributeAlias.getAlias();
        StringBuilder returnValue = new StringBuilder("");

        Collection<String> oidFields = Constants.getOIDFields(attributeDefinitionClass);

        for (String field : oidFields) {
            if (!returnValue.toString().isEmpty())
                returnValue.append(" || '||' || ");
            returnValue.append(attrAlias + "." + field);
        }

        return returnValue.toString();
    }
}
