package com.keralty.aepersonas.sqlutils;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.LoggerFactory;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.persistence.oid.IOid;
import com.keralty.aepersonas.utils.Agent;
import com.keralty.aepersonas.utils.Utilities;

/**
 * Provides the functionality to set up an SQL select statement. Topmost class
 * in a hierarchy of helper classes each of one specialized
 *
 */
public class SQLSelect {

    private static final String FROM_CLAUSE = " FROM ";
    
    private static final String REPOSITORY_PACKAGE = "com.keralty.aepersonas.repository.";
    
    private static final String REPOSITORY_IMPLEMENTATION_SUFFIX = "JpaRepositoryImpl";

    /** SQL sentence text. */
    private String sqlSentence;

    /** Source Entity name. */
    private String sourceEntityName;

    /** Target Entity name. */
    private String targetEntityName;

    /** List of the select clauses of the SQL statement. */
    private List<String> selectPart;

    /** List of from clauses of the SQL statement. */
    private List<SQLFrom> fromPart;

    /** Where part of the SQL Statement. */
    private SQLWhere wherePart;

    /** OrderBy part of the SQL Statement. */
    private SQLOrderBy orderByPart;

    /** List of aliases of the SQL Statement. */
    private List<SQLAlias> aliases;

    /** List of aliases used names of the SQL Statement. */
    private List<String> aliasesUsedNames;

    /** List of parameters of the SQL Statement. */
    private List<SQLParam> parameters;

    /** Connected agent. */
    private Agent connectedAgent;

    /** Selected object OID. */
    private IOid selectedObjectOID;

    /** Parameter name when the operator is over a object valued parameter. */
    private String objectValuedParameterName;

    /** Class name used in global service formula. */
    private String classNameInGlobalService;

    /** List of the filter variables. */
    private Map<String, Object> filterVariables;

    /** List of the filter variables types. */
    private Map<String, String> filterVariablesTypes;

    /** List of the service arguments. */
    private Map<String, Object> serviceArguments;

    /** List of the service arguments types. */
    private Map<String, String> serviceArgumentsTypes;

    /** Is a DISTINCT clause. */
    private Boolean isDistinct;

    /** Has TEXT or BLOB fields */
    private Boolean isTextBlob = false;

    Map<String, SQLAlias> processedAliases;

    /**
     * Setter of the isTextBlob property
     * 
     * @param isTextBlob true is is text o blob
     */
    public void setIsTextBlob(Boolean isTextBlob) {
        this.isTextBlob = isTextBlob;
    }

    /**
     * Getter of the isTextBlob property
     * 
     * @return the value of isTextBlob property
     */
    public Boolean getIsTextBlob() {
        return this.isTextBlob;
    }

    /** Super select sentence. */
    private SQLSelect superSelect;

    /** Original path. */
    private String originalPath;

    /**
     * Alias of the starting point instance. Its related instances will be
     * calculated.
     */
    private SQLAlias startingClassAlias;

    /**
     * Get of parameters
     * 
     * @return The parameters list
     */
    public List<SQLParam> getArrayParameters() {
        return parameters;
    }

    /**
     * Set of parameters
     * 
     * @param parameters The collection of parameters
     */
    public void setArrayParameters(List<SQLParam> parameters) {
        this.parameters = parameters;
    }

    /**
     * Creates a new SQL Select as a subquery of another superSelect.
     * 
     * @param superSelect Nesting select
     */
    public SQLSelect(SQLSelect superSelect) {
        this.superSelect = superSelect;
        initialize();
        if (superSelect != null) {
            connectedAgent = superSelect.getConnectedAgent();
            selectedObjectOID = superSelect.getSelectedObjectOID();
            filterVariables.putAll(superSelect.getFilterVariables());
            filterVariablesTypes.putAll(superSelect.getFilterVariablesTypes());
            serviceArguments.putAll(superSelect.getServiceArguments());
            serviceArgumentsTypes.putAll(superSelect.getServiceArgumentsTypes());
            // Used aliases names is unique
            aliasesUsedNames = superSelect.getAliasesUsedNames();
        }
    }

    /**
     * Initialize all the members.
     */
    private void initialize() {
        sqlSentence = "";
        sourceEntityName = "";
        targetEntityName = "";
        selectPart = new ArrayList<>();
        fromPart = new ArrayList<>();
        wherePart = new SQLWhere();
        orderByPart = new SQLOrderBy(this);
        aliases = new ArrayList<>();
        aliasesUsedNames = new ArrayList<>();
        parameters = new ArrayList<>();
        connectedAgent = null;
        selectedObjectOID = null;
        objectValuedParameterName = "";
        classNameInGlobalService = "";
        filterVariables = new HashMap<>();
        serviceArguments = new HashMap<>();
        filterVariablesTypes = new HashMap<>();
        serviceArguments = new HashMap<>();
        serviceArgumentsTypes = new HashMap<>();
        isDistinct = false;
        originalPath = "";
    }

    /**
     * SQL sentence.
     * 
     * @return {@link String} Text of the SQL sentence
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    public String getSQLSentence() {
        String sqlToReturn = "";
        if (this.sqlSentence.length() != 0) {
            sqlToReturn = this.sqlSentence;
        } else {
            String localSentence = "";
            localSentence += getSelectPartText();
            localSentence += FROM_CLAUSE + getFromText();
            localSentence += getWherePart().getText();
            localSentence += getOrderByPart().getText();
            sqlToReturn = localSentence;
        }
        if (this.getSuperSelect() == null)
            sqlToReturn = formatParameters(sqlToReturn);
        return sqlToReturn;
    }

    /**
     * SQL COUNT sentence.
     * 
     * @return {@link String} Text of the SQL COUNT sentence
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    public String getSQLCountSentence() throws SystemException {
        String classAlias = fromPart.get(0).getAlias();
        String localSentence = " SELECT COUNT ( " + classAlias + ") ";
        localSentence += FROM_CLAUSE + getFromText();
        localSentence += getWherePart().getText();
        if (getSuperSelect() == null)
            localSentence = formatParameters(localSentence);
        return localSentence;
    }

    /**
     * JPQL sentence.
     * 
     * @return {@link String} Text of the JPQL sentence
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    public String getJPQLSentence() throws SystemException {
        String localJPQLSentence = "";
        localJPQLSentence += "SELECT " + fromPart.get(0).getAlias();
        localJPQLSentence += FROM_CLAUSE + getFromText();
        localJPQLSentence += getWherePart().getText();
        localJPQLSentence += getOrderByPart().getText();

        if (getSuperSelect() == null)
            localJPQLSentence = formatParameters(localJPQLSentence);
        return localJPQLSentence;
    }

    private String formatParameters(String queryString) {
        StringBuilder buffer = new StringBuilder(queryString);
        int start = 0;
        int order = 1;
        while ((start = buffer.indexOf("?", start + 1)) > 0) {
            buffer.insert(start + 1, order);
            order++;
        }

        return buffer.toString();
    }

    /**
     * Sets the SQL sentence.
     * 
     * @param sQLSentence Text of the SQL sentence
     */
    public void setSQLSentence(String sQLSentence) {
        this.sqlSentence = sQLSentence;
    }

    /**
     * Name of the entity from which the SELECT is performed.
     * 
     * @return {@link String} Name of the entity from which the SELECT is performed
     */
    public String getSourceEntityName() {
        return sourceEntityName;
    }

    /**
     * Sets the connected agent, that is, who is carried out the query.
     * 
     * @param agent Agent who is carried out the query
     */
    public void setConnectedAgent(Agent agent) {
        this.connectedAgent = agent;
    }

    /**
     * Gets the connected agent.
     * 
     * @return {@link Agent} the agent who is carried out the query
     */
    public Agent getConnectedAgent() {
        return connectedAgent;
    }

    /**
     * Sets the object identifier of the selected object.
     * 
     * @param selectedObjectOID Object identifier of the selected object
     */
    public void setSelectedObjectOID(IOid selectedObjectOID) {
        this.selectedObjectOID = selectedObjectOID;
    }

    /**
     * Returns the object identified of the selected object.
     * 
     * @return {@link IOid} identifier of the selected object
     */
    public IOid getSelectedObjectOID() {
        return selectedObjectOID;
    }

    /**
     * Returns the name of the object valued parameter that initiates the path of
     * the operator
     * 
     * @return Name of the object valued parameter that initiates the path of the
     *         operator
     */
    public String getObjectValuedParameterName() {
        return objectValuedParameterName;
    }

    /**
     * Sets the name of the object valued parameter that initiates the path of the
     * operator
     * 
     * @param objectValuedParameterName Name of the object valued parameter that
     *                                  initiates the path of the operator
     */
    public void setObjectValuedParameterName(String objectValuedParameterName) {
        this.objectValuedParameterName = objectValuedParameterName;
    }

    /**
     * Returns the name of the class that initiates the path of the operator
     * 
     * @return Name of the class that initiates the path of the operator
     */
    public String getClassNameInGlobalService() {
        return classNameInGlobalService;
    }

    /**
     * Sets the name of the class that initiates the path of the operator
     * 
     * @param classNameInGlobalService Name of the class that initiates the path of
     *                                 the operator
     */
    public void setClassNameInGlobalService(String classNameInGlobalService) {
        try {
            this.classNameInGlobalService = Constants.getClassName(classNameInGlobalService);
        } catch (Exception e) {
            this.classNameInGlobalService = classNameInGlobalService;
        }
    }

    /**
     * Adds information about a filter variable that may be used in the sql
     * sentence.
     * 
     * @param variableName  Name of the filter variable
     * @param variableType  Data type of the filter variable
     * @param variableValue Value of the filter variable
     */
    public void addFilterVariable(String variableName, String variableType, Object variableValue) {
        this.filterVariables.put(variableName, variableValue);
        this.filterVariablesTypes.put(variableName, variableType);
    }

    /**
     * Returns true if there is an object-valued filter variable in the sql
     * sentence.
     * 
     * @param variableName Name of the object-valued filter variable
     * @return True if 'variableName' is an object-valued filter variable
     */
    public boolean hasOVFilterVariable(String variableName) {
        boolean returnValue = false;
        if (serviceArgumentsTypes.containsKey(variableName)) {
            returnValue = isObjectValued(filterVariablesTypes.get(variableName));
        }
        return returnValue;
    }

    /**
     * List of filter variables that may be used in the sql sentence.
     * 
     * @return {@link Map}<{@link String}, {@link Object}> List of filter variables
     *         that may be used in the sql sentence
     */
    protected Map<String, Object> getFilterVariables() {
        return filterVariables;
    }

    /**
     * Sets the list of filter variables that may be used in the sql sentence.
     * 
     * @param filterVariables List of filter variables that may be used in the sql
     *                        sentence
     */
    protected void setFilterVariables(Map<String, Object> filterVariables) {
        this.filterVariables = filterVariables;
    }

    /**
     * List of filter variables types that may be used in the sql sentence.
     * 
     * @return {@link Map}<{@link String}, {@link String}> List of filter variables
     *         types that may be used in the sql sentence
     */
    protected Map<String, String> getFilterVariablesTypes() {
        return filterVariablesTypes;
    }

    /**
     * Sets the list of filter variables types that may be used in the sql sentence.
     * 
     * @param filterVariablesTypes List of filter variables types that may be used
     *                             in the sql sentence
     */
    protected void setFilterVariablesTypes(Map<String, String> filterVariablesTypes) {
        this.filterVariablesTypes = filterVariablesTypes;
    }

    /**
     * Adds information about a service argument that may be used in the sql
     * sentence.
     * 
     * @param argumentName  Name of the argument
     * @param argumentType  Data type of the argument
     * @param argumentValue Value of the argument
     */
    public void addServiceArgument(String argumentName, String argumentType, Object argumentValue) {
        this.serviceArguments.put(argumentName, argumentValue);
        this.serviceArgumentsTypes.put(argumentName, argumentType);
    }

    /**
     * Returns true if there is an object-valued service argument in the sql
     * sentence.
     * 
     * @param argumentName Name of the object-valued service argument
     * @return True if 'argumentName' is an object-valued service argument
     */
    public boolean hasOVServiceArgument(String argumentName) {
        boolean returnValue = false;
        if (serviceArgumentsTypes.containsKey(argumentName)) {
            returnValue = isObjectValued(serviceArgumentsTypes.get(argumentName));
        }
        return returnValue;
    }

    /**
     * List of service arguments that may be used in the sql sentence.
     * 
     * @return {@link Map}<{@link String}, {@link Object}> List of service arguments
     *         that may be used in the sql sentence
     */
    protected Map<String, Object> getServiceArguments() {
        return serviceArguments;
    }

    /**
     * Sets the list of service arguments that may be used in the sql sentence.
     * 
     * @param serviceArguments List of service arguments that may be used in the sql
     *                         sentence
     */
    protected void setServiceArguments(Map<String, Object> serviceArguments) {
        this.serviceArguments = serviceArguments;
    }

    /**
     * List of service arguments types that may be used in the sql sentence.
     * 
     * @return {@link Map}<{@link String}, {@link String}> List of service arguments
     *         types that may be used in the sql sentence
     */
    protected Map<String, String> getServiceArgumentsTypes() {
        return serviceArgumentsTypes;
    }

    /**
     * Sets the list of service arguments types that may be used in the sql
     * sentence.
     * 
     * @param serviceArgumentsTypes List of service arguments types that may be used
     *                              in the sql sentence
     */
    protected void setServiceArgumentsTypes(Map<String, String> serviceArgumentsTypes) {
        this.serviceArgumentsTypes = serviceArgumentsTypes;
    }

    /**
     * Sets the name of the entity from which the SELECT is performed. It also sets
     * the alias of that entity.
     * 
     * @param sourceEntityName Name of the entity from which the SELECT is performed
     */
    public void setSourceEntityName(String sourceEntityName) {
        this.sourceEntityName = sourceEntityName;
    }

    /**
     * Name of the entity that is queried by the SQL sentence.
     * 
     * @return {@link String} Name of the entity that is queried by the SQL sentence
     */
    public String getTargetEntityName() {
        return targetEntityName;
    }

    /**
     * Sets the name of the entity that is queried by the SQL sentence.
     * 
     * @param targetEntityName Name of the entity that is queried by the SQL
     *                         sentence
     */
    public void setTargetEntityName(String targetEntityName) {
        this.targetEntityName = targetEntityName;
    }
   
    /**
     * Adds an item to the SELECT part
     * @param item Item to add
     */
    public void addToSelectPart(String item) {
    	selectPart.add(item);
    }

    /**
     * Sets the SELECT part of the SQL sentence.
     * 
     * @param selectPart SELECT part of the SQL sentence
     */
    public void setSelectPart(List<String> selectPart) {

        this.selectPart = selectPart;
    }

    /**
     * Text of the SELECT part.
     * 
     * @return {@link String} Text of the SELECT part
     */
    public String getSelectPartText() {
        StringBuilder select = new StringBuilder("");

        for (String sel : selectPart) {
            if (select.toString().isEmpty()) {
                select = new StringBuilder(sel);
            } else {
                select.append(", " + sel);
            }
        }

        if (isDistinct && !isTextBlob) {
            select.insert(0, "SELECT DISTINCT ");
        } else {
            select.insert(0, "SELECT ");
        }

        return select.toString();
    }

    /**
     * FROM part of the SQL sentence.
     * 
     * @return {@link List}<{@link String}> FROM part of the SQL sentence
     */
    public List<SQLFrom> getFromPart() {
        return fromPart;
    }

    /**
     * Text of the FROM part.
     * 
     * @return {@link String} Text of the FROM part
     */
    public String getFromText() {
        StringBuilder text = new StringBuilder("");
        for (SQLFrom from : fromPart) {
            // Add table and alias
            if (text.length() > 0) {
                text.append(", ");
            }
            text.append(from.getTable() + " " + from.getAlias());
            for (SQLJoin join : from.getJoins()) {
                // Add join type (inner or left)
                text.append(" " + join.getJoinType());

                // Add table and alias
                text.append(" " + join.getPath() + " " + join.getAlias());
            }
        }
        return text.toString();
    }

    /**
     * WHERE part of the SQL sentence.
     * 
     * @return {@link SQLWhere} WHERE part of the SQL sentence
     */
    public SQLWhere getWherePart() {
        return wherePart;
    }

    /**
     * Sets the WHERE part of the SQL sentence.
     * 
     * @param wherePart WHERE part of the SQL sentence
     */
    public void setWherePart(SQLWhere wherePart) {
        this.wherePart = wherePart;
    }

    /**
     * ORDER BY part of the SQL sentence.
     * 
     * @return {@link SQLOrderBy} ORDER BY part of the SQL sentence
     */
    public SQLOrderBy getOrderByPart() {
        return orderByPart;
    }

    /**
     * Sets the ORDER BY part of the SQL sentence.
     * 
     * @param orderByPart ORDER BY part of the SQL sentence
     */
    public void setOrderByPart(SQLOrderBy orderByPart) {
        this.orderByPart = orderByPart;
    }

    /**
     * Aliases used in the sql sentence.
     * 
     * @return {@link List}<{@link SQLAlias}> Aliases used in the sql sentence
     */
    protected List<SQLAlias> getAliases() {
        return aliases;
    }

    /**
     * Adds an alias
     * @param alias Alias to add
     */
    public void addAlias(SQLAlias alias) {
    	aliases.add(alias);
    }
    
    /**
     * Parameter names used in the SQL sentence.
     * 
     * @return {@link List}<{@link SQLParam}> Parameter names used in the SQL
     *         sentence
     */
    public List<SQLParam> getParameters() {
        // Clean the current list and obtain the parameters from the Where elements
        parameters.clear();
        getWherePart().gatherParameters(parameters);

        return parameters;
    }

    /**
     * Verifies if is a valued object.
     * 
     * @param dataType String with the objet data type
     * @return boolean
     */
    protected boolean isObjectValued(String dataType) {
        boolean returnValue = true;
        if (dataType.compareToIgnoreCase("String") == 0 || dataType.compareToIgnoreCase("Nat") == 0
                || dataType.compareToIgnoreCase("Int") == 0 || dataType.compareToIgnoreCase("Integer") == 0
                || dataType.compareToIgnoreCase("Real") == 0 || dataType.compareToIgnoreCase("Double") == 0
                || dataType.compareToIgnoreCase("Bool") == 0 || dataType.compareToIgnoreCase("Boolean") == 0
                || dataType.compareToIgnoreCase("Date") == 0 || dataType.compareToIgnoreCase("Time") == 0
                || dataType.compareToIgnoreCase("DateTime") == 0 || dataType.compareToIgnoreCase("Timestamp") == 0
                || dataType.compareToIgnoreCase("Text") == 0 || dataType.compareToIgnoreCase("") == 0) {
            returnValue = false;
        }
        return returnValue;
    }

    /**
     * This method returns the alias structure.
     * 
     * @param path  Path that represents the alias
     * @param facet Target class of the path
     * @return {@link SQLAlias} Alias structure
     */
    public SQLAlias getAlias(String path, String facet) {
        return getAlias(path, facet, false);
    }

    /**
     * Verify if the alias name is used in this SQL or in any super query.
     * 
     * @param aliasName Alias name
     * @return {@link Boolean} Alias structure
     */
    public Boolean existsAliasName(String aliasName) {

        // Search the alias in the used alias name list
        aliasName = aliasName.toUpperCase();
        return getAliasesUsedNames().contains(aliasName);
    }

    /**
     * This method returns the alias structure.
     * 
     * @param path         Path that represents the alias
     * @param facet        Target class of the path
     * @param intermediate If the alias to search is the intermediate table
     *                     (multivalued table)
     * @return {@link SQLAlias} Alias structure
     */
    public SQLAlias getAlias(String path, String facet, Boolean intermediate) {
        SQLAlias returnValue = null;
        // Search the alias in the alias list
        for (SQLAlias alias : getAliases()) {
            if ((alias.getPath().equalsIgnoreCase(path))
                    && ((facet.equalsIgnoreCase("")) || (alias.getFacet().equalsIgnoreCase(facet)))
                    && (alias.getIntermediate().equals(intermediate))) {
                returnValue = alias;
            }
        }
        if (returnValue == null && getSuperSelect() != null) {
            // Search in the super query
            returnValue = getSuperSelect().getAlias(path, facet, intermediate);
        }

        return returnValue;
    }

    /**
     * This method returns the Alias corresponding with the parameter name.
     * 
     * @param parameterName Searched parameter name
     * @return {@link SQLAlias} Alias structure
     */
    public SQLAlias getAliasByParameter(String parameterName) {
        SQLAlias returnValue = null;
        SQLSelect select = this;

        // Search the alias in the alias list
        for (SQLAlias alias : select.getAliases()) {
            if (alias.getAssignedParameterName().equalsIgnoreCase(parameterName)) {
                returnValue = alias;
            }
        }
        // If alias not found in this instance look in the superSelect (if any)
        if (returnValue == null && this.getSuperSelect() != null) {
            returnValue = this.getSuperSelect().getAliasByParameter(parameterName);
        }

        return returnValue;
    }

    /**
     * This method creates an alias structure with a valid name.
     * 
     * @param path         Path that represents the alias
     * @param facet        Target class of the path
     * @param intermediate If the alias to search is the intermediate table
     *                     (multivalued table)
     * @return {@link SQLAlias} Alias structure
     */
    public SQLAlias createAlias(String path, String facet, Boolean intermediate) {
        return createAlias(path, facet, facet, intermediate, null);
    }

    /**
     * Create a new SQLAlias with a valid name.
     * 
     * @param path          Path that represents the alias
     * @param facet         Target class of the path
     * @param proposedAlias Proposed alias name
     * @param intermediate  If the alias to search is the intermediate table
     *                      (multivalued table)
     * @param originAlias   original alias structure
     * @return {@link SQLAlias}
     */
    public SQLAlias createAlias(String path, String facet, String proposedAlias, Boolean intermediate,
            SQLAlias originAlias) {
        String aliasString = proposedAlias;

        // Search valid alias string (unique in the SQL statement)
        int count = 1;
        while (existsAliasName(aliasString)) {
            aliasString = proposedAlias + count;
            count++;
        }

        // Create Alias
        SQLAlias alias = new SQLAlias(path, facet, intermediate, aliasString);

        // Add the new alias to the list
        aliases.add(alias);

        // Copy counters and assign the From part
        if (originAlias != null) {
            alias.copyCounters(originAlias);
            alias.setSqlFrom(originAlias.getSqlFrom());
        }

        // Add the name to the used aliases list
        getAliasesUsedNames().add(aliasString.toUpperCase());

        return alias;
    }

    /**
     * This method creates a from structure.
     * 
     * @param table Table name of the from
     * @param alias Alias of the from
     * @return {@link SQLFrom} From structure
     */
    public SQLFrom createFrom(String table, SQLAlias alias) {
        // Create from structure
        SQLFrom from = new SQLFrom();
        from.setAlias(alias.getAlias());
        from.setTable(table);

        fromPart.add(from);
        alias.setSqlFrom(from);

        return from;
    }

    /**
     * Gets super SELECT.
     * 
     * @return {@link SQLSelect}
     */
    public SQLSelect getSuperSelect() {
        return superSelect;
    }

    /**
     * Sets super SELECT.
     * 
     * @param superSelect SQL sentence
     */
    public void setSuperSelect(SQLSelect superSelect) {
        this.superSelect = superSelect;
    }

    /**
     * Adds inheritance joins.
     * 
     * @param initialAlias SQLAlias initial alias
     * @param sourceClass  the initial class of the path to evaluate.
     * @param targetClass  the final class of the path to evaluate.
     * @return {@link SQLAlias}
     */
    protected SQLAlias addInheritanceJoins(SQLAlias initialAlias, String sourceClass, String targetClass) {
        List<SQLJoin> joinList = new ArrayList<>();
        SQLAlias alias = addInheritanceJoins(initialAlias, sourceClass, targetClass, joinList);

        alias.getSqlFrom().addAllJoins(joinList);

        return alias;
    }

    /**
     * Adds inheritance joins.
     * 
     * @param initialAlias SQLAlias initial alias
     * @param sourceClass  the initial class of the path to evaluate.
     * @param targetClass  the final class of the path to evaluate.
     * @param joinList     Join list
     * @return {@link SQLAlias}
     */
    protected SQLAlias addInheritanceJoins(SQLAlias initialAlias, String sourceClass, String targetClass,
            List<SQLJoin> joinList) {
        SQLAlias nextAlias = null;

        // If the both classes are the same, do nothing
        if (!sourceClass.equalsIgnoreCase(targetClass)) {
            try {
                // Initialize the variable representing the alias of the current facet
                SQLAlias currentAlias = initialAlias;
                // Get the path from sourceClass to targetClass using reflection
                List<String> path = Constants.getSequenceFacetsFacet(sourceClass, targetClass);
                // Initialize the variable that will store the temporal sourceClass.
                String tempSourceClass = sourceClass;
                // Iterate on the arrayList to process all the paths.
                for (String nextFacet : path) {
                    // Check if the alias of the next facet already exists.
                    nextAlias = getAlias(initialAlias.getPath(), sanitizeFacetName(nextFacet));
                    if (nextAlias == null) {
                        // if the alias does not exist, a new one is created.
                        String nextTable = Constants.nameTable(sanitizeFacetName(nextFacet));
                        nextAlias = createAlias(initialAlias.getPath(), sanitizeFacetName(nextFacet), nextFacet, false,
                                currentAlias);
                        // add a new join
                        SQLJoin currentjoin = new SQLJoin(Constants.LEFTJOIN, nextTable, currentAlias, nextAlias);
                        joinList.add(currentjoin);

                        completeInheritanceJoin(tempSourceClass, nextFacet, currentAlias.getAlias(), currentjoin,
                                nextAlias.getAlias());
                    }
                    // Update the local variables representing the temporal sourceClass and the
                    // alias of the current facet
                    tempSourceClass = nextFacet;
                    currentAlias = nextAlias;
                }
            } catch (Exception e) {
                LoggerFactory.getLogger(SQLSelect.class).error(e.getMessage());
            }
        }
        return nextAlias;
    }

    private String sanitizeFacetName(String facetName) {
    	return facetName.startsWith(Constants.PARENT_PREFIX)
    		 ? sanitizeParentFacetName(facetName)
    	     : sanitizeChildFacetName(facetName);
    }
    
    private String sanitizeParentFacetName(String facetName) {
    	return facetName.startsWith(Constants.PARENT_PREFIX)
    		 ? facetName.substring(Constants.PARENT_PREFIX.length())
    		 : facetName;
    }
    
    private String sanitizeChildFacetName(String facetName) {
    	return facetName.startsWith(Constants.CHILD_PREFIX)
    		 ? facetName.substring(Constants.PARENT_PREFIX.length())
    		 : facetName;
    }

    /**
     * Adds aggregation joins.
     * 
     * @param initialAlias SQLAlias initial alias
     * @param sourceClass  the initial class of the path to evaluate
     * @param path         Path to be reached
     * @param joinType     Join Type (Left or inner join)
     * @return {@link SQLAlias}
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    protected SQLAlias addAggregationJoins(SQLAlias initialAlias, String sourceClass, String path, String joinType)
            throws SystemException {
        return this.addAggregationJoins(initialAlias, sourceClass, path, joinType, "");
    }

    /**
     * Adds aggregation joins.
     * 
     * @param initialAlias SQLAlias initial alias
     * @param sourceClass  the initial class of the path to evaluate
     * @param path         Path to be reached
     * @param joinType     Join Type (Left or inner join)
     * @param initialPath  Initial path
     * @return {@link SQLAlias} Alias of the last class in the Path
     */
    protected SQLAlias addAggregationJoins(SQLAlias initialAlias, String sourceClass, String path, String joinType,
            String initialPath) {

        List<SQLJoin> joinList = new ArrayList<>();
        SQLAlias alias = addAggregationJoins(initialAlias, sourceClass, path, joinType, initialPath, joinList);

        alias.getSqlFrom().addAllJoins(joinList);

        return alias;
    }

    /**
     * Adds aggregation joins.
     * 
     * @param initialAlias SQLAlias initial alias
     * @param sourceClass  the initial class of the path to evaluate
     * @param path         Path to be reached
     * @param joinType     Join Type (Left or inner join)
     * @param initialPath  Initial path
     * @param joinList     List of joins
     * @return {@link SQLAlias} Alias of the last class in the Path
     */
    protected SQLAlias addAggregationJoins(SQLAlias initialAlias, String sourceClass, String path, String joinType,
            String initialPath, List<SQLJoin> joinList) {
        SQLAlias currentAlias = initialAlias;
        SQLAlias nextAlias = null;

        String ownerClass = sourceClass;
        String targetClass = null;
        String remainingRolePath = path;

        // If we have a non-empty initial path
        // other than '*' (which means the alias for the initial path has already been
        // located)
        StringBuilder processedPath = calculateProcessedPath(initialPath);
        processedAliases = new HashMap<>();

        String pathSeparator = initialPath.isEmpty() ? "" : ".";
        while (!remainingRolePath.isEmpty()) {
            String role = getFirstRole(remainingRolePath);
            remainingRolePath = stripFirstRole(remainingRolePath);

            processedPath.append(pathSeparator + role);
            pathSeparator = ".";

            // get the class owner of role
            targetClass = Constants.getTargetFacetElement(ownerClass, role);

            // Add Inheritance joins of necessary and update the current alias to be used
            if (!targetClass.equalsIgnoreCase(ownerClass)) {
                currentAlias = addInheritanceJoins(currentAlias, ownerClass, targetClass, joinList);
            }

            // Change departure class if there are more roles to navigate.
            ownerClass = Constants.roleTargetClass(targetClass, role);

            // Check if the alias of the next class already exists.
            // But only if it has not been previously located (in which case, initialPath is
            // '*')
            if (!initialPath.equals("*"))
                nextAlias = getAlias(processedPath.toString(), ownerClass);
            if (nextAlias == null) {

            	 nextAlias = calculateNextAlias(ownerClass, role, currentAlias, joinType, processedPath, joinList);

                if (!initialPath.isEmpty()) {
                    processedAliases.put(processedPath.toString(), nextAlias);
                }

            } else {
                if (joinType.equalsIgnoreCase(Constants.INNERJOIN)) {
                    nextAlias.setJoinsToInnerType();
                }
            }

            updatePaths4ProcessedAliases();

            // Set the current Alias
            currentAlias = nextAlias;
        }

        return currentAlias;
    }
    
    private StringBuilder calculateProcessedPath(String initialPath) {
    	return (!initialPath.isEmpty() && !initialPath.equals("*")
                ? new StringBuilder(initialPath)
                : new StringBuilder(""));
    }
    
    private SQLAlias calculateNextAlias(String ownerClass, String role, SQLAlias currentAlias, String joinType, StringBuilder processedPath, List<SQLJoin> joinList) {
    	SQLAlias nextAlias;
        // Check if the relationship is M:M
        String tableMMName = Constants.getManyToManyTableName(currentAlias.getFacet(), role);
        if (!tableMMName.isEmpty() && tableMMName.equalsIgnoreCase("-DEPRECATED-")) {
            // if the alias does not exist, a new one is created and a new one for the MM
            // table
            // Create the M to M table alias
            SQLAlias tableMMAlias = createAlias(processedPath.toString(), currentAlias.getFacet(),
                    tableMMName, true, currentAlias);
            // add a new join
            SQLJoin tableMMjoin = new SQLJoin(joinType, tableMMName, currentAlias, tableMMAlias);
            joinList.add(tableMMjoin);

            // Create the next table Alias
            String nextTable = Constants.nameTable(ownerClass);
            nextAlias = createAlias(processedPath.toString(), ownerClass, ownerClass, false,
                    tableMMAlias);
            // add a new join
            SQLJoin currentjoin = new SQLJoin(joinType, nextTable, tableMMAlias, nextAlias);
            joinList.add(currentjoin);

            completeJoin(currentAlias.getAlias(), tableMMjoin, tableMMAlias.getAlias(),
                    currentjoin, nextAlias.getAlias());

            // Increase the multivaluated counter
            increaseMultivaluatedCounter(nextAlias, currentjoin);
        } else {
            // if the alias does not exist, a new one is created.
            String nextTable = Constants.nameTable(ownerClass);
            nextAlias = createAlias(processedPath.toString(), ownerClass, ownerClass, false,
                    currentAlias);
            nextAlias.setSqlFrom(currentAlias.getSqlFrom());
            // add a new join
            SQLJoin currentjoin = new SQLJoin(joinType, nextTable, currentAlias, nextAlias);
            joinList.add(currentjoin);

            completeJoin(currentAlias.getAlias(), currentjoin, nextAlias.getAlias());

            // Increase the multivaluated counter
            increaseMultivaluatedCounter(nextAlias, currentjoin);
        }
        return nextAlias;
    }


    private String getFirstRole(String rolePath) {
        int indexOfSeparator = rolePath.indexOf('.');
        return (indexOfSeparator >= 0 ? rolePath.substring(0, indexOfSeparator) : rolePath);
    }

    private String stripFirstRole(String rolePath) {
        int indexOfSeparator = rolePath.indexOf('.');
        return (indexOfSeparator >= 0 ? rolePath.substring(indexOfSeparator + 1) : "");
    }

    private void updatePaths4ProcessedAliases() {
        for (Map.Entry<String, SQLAlias> item : processedAliases.entrySet()) {
            item.getValue().setPath(item.getKey());
        }
    }

    /**
     * Increase the multivaluated counter
     * 
     * @param nextalias   The alias
     * @param currentjoin The current join
     */
    private void increaseMultivaluatedCounter(SQLAlias nextalias, SQLJoin currentjoin) {
        if (nextalias.increaseCounters(currentjoin)) {
            this.setIsDistinct(true);
        }
    }

    /**
     * Completes inheritance join.
     * 
     * @param targetClass  Target class name
     * @param roleName     Role name
     * @param currentAlias String with the current alias
     * @param join         SQLJoin
     * @param nextAlias    String with the next alias
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    protected void completeInheritanceJoin(String targetClass, String roleName, String currentAlias, SQLJoin join,
            String nextAlias) throws SystemException {
        try {
            Class<?> queryClass = Class.forName(REPOSITORY_PACKAGE + Utilities.normalize(targetClass) + REPOSITORY_IMPLEMENTATION_SUFFIX);
            Class<?>[] params = new Class[3];
            params[0] = String.class;
            params[1] = SQLJoin.class;
            params[2] = String.class;
            Object[] attr = new Object[3];
            attr[0] = currentAlias;
            attr[1] = join;
            attr[2] = nextAlias;
            Method getwheresMethod = queryClass.getMethod("addFacetWhere" + roleName.toLowerCase(), params);
            getwheresMethod.invoke(queryClass.getDeclaredConstructor().newInstance(), attr);
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }

    /**
     * Completes join.
     * 
     * @param currentAlias String with the current alias
     * @param join         SQLJoin
     * @param nextAlias    String with the next alias
     */
    protected void completeJoin(String currentAlias, SQLJoin join,
            String nextAlias) {
        Class<?>[] params = new Class[3];
        params[0] = String.class;
        params[1] = SQLJoin.class;
        params[2] = String.class;
        Object[] attr = new Object[3];
        attr[0] = currentAlias;
        attr[1] = join;
        attr[2] = nextAlias;
    }

    /**
     * Completes join.
     * 
     * @param currentAlias String with the current alias
     * @param tableMMjoin  SQLJoin with the MM table
     * @param aliasMM      MM table alias
     * @param join         SQL join
     * @param nextAlias    String with the next alias
     */
    protected void completeJoin(String currentAlias, SQLJoin tableMMjoin,
            String aliasMM, SQLJoin join, String nextAlias) {
        Class<?>[] params = new Class[5];
        params[0] = String.class;
        params[1] = SQLJoin.class;
        params[2] = String.class;
        params[3] = SQLJoin.class;
        params[4] = String.class;
        Object[] attr = new Object[5];
        attr[0] = currentAlias;
        attr[1] = tableMMjoin;
        attr[2] = aliasMM;
        attr[3] = join;
        attr[4] = nextAlias;
    }

    /**
     * Adds operand.
     * 
     * @param operand SQLWhereOperand to be added to the SQL Sentence
     */
    public void addOperand(SQLWhereOperand operand) {
        getWherePart().addOperand(operand);
    }

    /**
     * Adds comparison.
     * 
     * @param comparison SQLWhereComparison to be added to the SQL Sentence
     */
    public void addComparison(SQLWhereComparison comparison) {
        getWherePart().addComparison(comparison);
    }

    /**
     * Adds conjunction to wheres.
     * 
     * @param conjuntion SQLWhereConjunction to be added to the SQL Sentence
     */
    public void addConjunction(SQLWhereConjunction conjuntion) {
        getWherePart().addConjunction(conjuntion);
    }

    /**
     * Adds disjunction to wheres.
     * 
     * @param disjunction SQLWhereDisjunction to be added to the SQL Sentence
     */
    public void addDisjunction(SQLWhereDisjunction disjunction) {
        getWherePart().addDisjunction(disjunction);
    }

    /**
     * Checks if is a DISTINCT select.
     * 
     * @return {@link Boolean}
     */
    public Boolean getIsDistinct() {
        return isDistinct;
    }

    /**
     * Sets if is a DISTINCT select.
     * 
     * @param isDistinct true if it is a DISTINCT select, false in other case
     */
    public void setIsDistinct(Boolean isDistinct) {
        this.isDistinct = isDistinct;
    }

    /**
     * Adds the necessary joins in order to find the related instances through the
     * path The path starts in the SQL definition class and targets the instance
     * definiton class.
     * 
     * @param rolePath Role path to be used
     * @param instance Related instance
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    public void addJoinTo(String rolePath, IOid instance) throws SystemException {

        SQLAlias sourceClassAlias = null;
        SQLAlias alias = null;
        String instanceDefinitionClass = "";
        if (instance == null) {
            return;
        }

        // Get the SQL definition class Alias
        sourceClassAlias = this.startingClassAlias;
        // Obtain the alias through the role path
        alias = this.addAggregationJoins(sourceClassAlias, this.getTargetEntityName(), rolePath, Constants.INNERJOIN);
        // If the reached class is not the instance definition class, add the
        // inheritance Joins
        instanceDefinitionClass = instance.getDefinitionClass();
        if (!alias.getFacet().equalsIgnoreCase(instanceDefinitionClass)) {
            alias = this.addInheritanceJoins(alias, alias.getFacet(), instanceDefinitionClass);
        }

        addFixInstance(instance, alias);
    }

    /**
     * Add the necessary joins in order to find the related instances through the
     * path The path starts in the instance and targets the SQL definition class.
     * 
     * @param instance Related instance
     * @param rolePath Role path to be used
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    public void addJoinTo(IOid instance, String rolePath) throws SystemException {

        String instanceDefinitionClass = "";
        String inversePath = "";
        if (instance == null) {
            return;
        }

        // Locate inverse role path
        instanceDefinitionClass = instance.getDefinitionClass();
        inversePath = Constants.getInverseRole(instanceDefinitionClass, rolePath);

        addJoinTo(inversePath, instance);
    }

    /**
     * Fix the received instance, adding the proper conditions in the SQL Where
     * clause using the received Alias.
     * 
     * @param instance Instance to be fixed
     * @param alias    Alias intance to be fixed
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    public void addFixInstance(IOid instance, SQLAlias alias) throws SystemException {

        // If no instance provided, do nothing
        if (instance == null) {
            return;
        }

        // Get the OID fields of the definition class or the parameter class
        Collection<String> oidFields = new ArrayList<>(Arrays.asList(instance.getKeys()));

        SQLWhereConjunction conjunction = new SQLWhereConjunction();

        String instanceAlias = alias.getAlias();
        for (String field : oidFields) {
            String oidExpression = instanceAlias + "." + field;
            SQLWhereComparison comparison = new SQLWhereComparison(this);
            comparison.setExplicitComparisonText(oidExpression + " = ?");
            conjunction.addComparison(comparison);
        }

        // Add the conjunction to the sql where part
        this.getWherePart().addConjunction(conjunction);

        Object[] oidValues = instance.getValue();
        String[] oidDataTypes = instance.getDataTypes();
        for (int i = 0; i < oidValues.length; i++) {
            conjunction.addParameter(new SQLParam("", oidValues[i], oidDataTypes[i]));
        }
    }

    /**
     * Fix the instances to a TM table SQL sentence using the received Alias.
     * 
     * @param instance1         First instance to be fixed
     * @param instance2         Second Instance to be fixed
     * @param intermediateTable Intermediate table name
     * @param reflexive         If it is a reflexive role
     * @param alias             Alias instance to be fixed
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    public void addFixTMInstance(IOid instance1, IOid instance2, SQLAlias alias, String intermediateTable,
            boolean reflexive) throws SystemException {
        // If no instance provided, do nothing
        if (instance1 == null || instance2 == null) {
            return;
        }

        // Get the OID fields of the definition class or the parameter class
        SQLWhereConjunction conjunction = new SQLWhereConjunction();

        Collection<String> oidFields = Constants.getTMOIDFields(instance1.getDefinitionClass(), intermediateTable);

        if (!reflexive)
            oidFields.addAll(Constants.getTMOIDFields(instance2.getDefinitionClass(), intermediateTable));

        String instanceAlias = alias.getAlias();
        for (String field : oidFields) {
            String oidExpression = instanceAlias + "." + field;
            SQLWhereComparison comparison = new SQLWhereComparison(this);
            comparison.setExplicitComparisonText(oidExpression + " = ?");
            conjunction.addComparison(comparison);
        }

        // Add the conjunction to the sql where part
        this.getWherePart().addConjunction(conjunction);

        Object[] oidValues = instance1.getValue();
        String[] oidDataTypes = instance1.getDataTypes();
        for (int i = 0; i < oidValues.length; i++) {
            conjunction.addParameter(new SQLParam("", oidValues[i], oidDataTypes[i]));
        }

        oidValues = instance2.getValue();
        oidDataTypes = instance2.getDataTypes();
        for (int i = 0; i < oidValues.length; i++) {
            conjunction.addParameter(new SQLParam("", oidValues[i], oidDataTypes[i]));
        }
    }

    /**
     * Fix the instances to a TM table SQL sentence using the received Alias.
     * 
     * @param instance1         First instance to be fixed
     * @param intermediateTable Intermediate table name
     * @param reflexive         If it is a reflexive role
     * @param alias             Alias instance to be fixed
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    public void addFixTMInstance(IOid instance1, SQLAlias alias, String intermediateTable, boolean reflexive)
            throws SystemException {
        // If no instance provided, do nothing
        if (instance1 == null) {
            return;
        }

        // Get the OID fields of the definition class or the parameter class
        SQLWhereDisjunction dis = new SQLWhereDisjunction();
        SQLWhereConjunction con = new SQLWhereConjunction();

        Collection<String> oidFields = Constants.getTMOIDFields(instance1.getDefinitionClass(), intermediateTable);

        String instanceAlias = alias.getAlias();
        for (String field : oidFields) {
            String oidExpression = instanceAlias + "." + field;
            SQLWhereComparison comparison = new SQLWhereComparison(this);
            comparison.setExplicitComparisonText(oidExpression + " = ?");
            dis.addComparison(comparison);
            con.addComparison(comparison);
        }

        // Add the conjunction to the sql where part
        if (reflexive)
            this.getWherePart().addDisjunction(dis);
        else
            this.getWherePart().addConjunction(con);

        Object[] oidValues = instance1.getValue();
        String[] oidDataTypes = instance1.getDataTypes();
        for (int i = 0; i < oidValues.length; i++) {
            dis.addParameter(new SQLParam("", oidValues[i], oidDataTypes[i]));
            con.addParameter(new SQLParam("", oidValues[i], oidDataTypes[i]));
        }

        if (reflexive) {
            oidValues = instance1.getValue();
            oidDataTypes = instance1.getDataTypes();
            for (int i = 0; i < oidValues.length; i++) {
                dis.addParameter(new SQLParam("", oidValues[i], oidDataTypes[i]));
            }
        }
    }

    /**
     * Adds the proper Where conditions in order to find the instance of the oid If
     * the oid definition class is not the SQL Source class, adds the inheritance
     * Joins.
     * 
     * @param oid OID instance
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    public void addWhereOID(IOid oid) throws SystemException {
        SQLAlias alias = getAlias("", getSourceEntityName());
        if (!alias.getFacet().equalsIgnoreCase(oid.getDefinitionClass())) {
            alias = addInheritanceJoins(alias, alias.getFacet(), oid.getDefinitionClass());
        }

        addFixInstance(oid, alias);
    }

    /**
     * Gets aliases used names.
     * 
     * @return {@link List}<{@link String}>
     */
    public List<String> getAliasesUsedNames() {
        return aliasesUsedNames;
    }

    /**
     * Returns the definition class alias. It will be the first alias on a single
     * query
     * 
     * @return {@link SQLAlias}
     */
    public SQLAlias getStartingClassAlias() {
        return startingClassAlias;
    }

    /**
     * Sets starting class alias.
     * 
     * @param startingClassAlias Starting class alias
     */
    public void setStartingClassAlias(SQLAlias startingClassAlias) {
        this.startingClassAlias = startingClassAlias;
    }

    /**
     * Gets original path.
     * 
     * @return {@link String}
     */
    protected String getOriginalPath() {
        return originalPath;
    }

    /**
     * Sets original path.
     * 
     * @param originalPath String with the original path
     */
    protected void setOriginalPath(String originalPath) {
        this.originalPath = originalPath;
    }

    protected String calculateCommonPath(String originalPath) {
        return originalPath.isEmpty() ? originalPath : "";
    }
}
