package com.keralty.aepersonas.sqlutils;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.persistence.oid.IOid;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.ArrayList;

/**
 * Provides the functionality to set up an SQL select statement that returns a
 * set of instances.
 *
 */
public class SQLPopulation extends SQLSelect {

    /**
     * Collection of Strings that represent the displayset.
     */
    private Collection<String> displaySet;

    /**
     * Creates a new SQL sentence to query the instances of targetEntityName.
     * 
     * @param classDefinitionName Formula Class definition name
     * @param targetEntityName    Class to be query
     * @param displaySetarg       the displayset to be applied.
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    public SQLPopulation(String classDefinitionName, String targetEntityName, Collection<String> displaySetarg)
            throws SystemException {
        super(null);
        this.displaySet = displaySetarg;
        setSourceEntityName(classDefinitionName);
        setTargetEntityName(targetEntityName);
        initializeQuery("");
    }

    /**
     * Creates a new SQL sentence to query the instances of targetEntityName.
     * 
     * @param classDefinitionName Formula Class definition name
     * @param targetEntityName    Class to be query
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    public SQLPopulation(String classDefinitionName, String targetEntityName) throws SystemException {
        super(null);
        this.displaySet = new ArrayList<>();
        setSourceEntityName(classDefinitionName);
        setTargetEntityName(targetEntityName);
        initializeQuery("");
    }
    
    /**
     * Creates a new SQL sentence to query the instances of classDefinitionName.
     * 
     * @param classDefinitionName Class to be queried
     * @throws SystemException if any system error occurs
     */
    public SQLPopulation(String classDefinitionName) throws SystemException {
        super(null);
        this.displaySet = new ArrayList<>();
        setSourceEntityName(classDefinitionName);
        setTargetEntityName(classDefinitionName);
        initializeQuery("");
    }

    /**
     * Creates a new SQL sentence to query the instances of targetEntityName.
     * 
     * @param classDefinitionName Formula Class definition name
     * @param targetEntityName    Class to be query
     * @param relatedInstance     OID value of the related instance
     * @param rolePath            Role path from the related instance to the target
     *                            class
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    public SQLPopulation(String classDefinitionName, String targetEntityName, IOid relatedInstance, String rolePath)
            throws SystemException {
        super(null);
        this.displaySet = new ArrayList<>();
        setSourceEntityName(classDefinitionName);
        setTargetEntityName(targetEntityName);
        String normalizedRolePath = Constants.normalizePath(classDefinitionName, rolePath,
                classDefinitionName.isEmpty());
        initializeQuery(normalizedRolePath);
        if (relatedInstance != null) {
            // Locate inverse role path
            String instanceDefinitionClass = relatedInstance.getDefinitionClass();
            String inversePath = Constants.getInverseRole(instanceDefinitionClass, rolePath);

            // Obtain the alias through the role path
            SQLAlias initialAlias = getStartingClassAlias();
            SQLAlias alias = this.addAggregationJoins(initialAlias, this.getTargetEntityName(), inversePath,
                    Constants.INNERJOIN, "");

            // If the reached class is not the instance definition class, add the
            // inheritance Joins
            if (!alias.getFacet().equalsIgnoreCase(instanceDefinitionClass)) {
                alias = this.addInheritanceJoins(alias, alias.getFacet(), instanceDefinitionClass);
            }

            // Fix the related instance
            addFixInstance(relatedInstance, alias);

            // Set the reached alias as the initial alias for this SQL
            setStartingClassAlias(alias);
        }
    }

    /**
     * Creates a new SQL sentence to query the related instances with the parameter
     * through the parameterPath.
     * 
     * @param classDefinitionName Formula Class definition name
     * @param targetEntityName    Class to be query
     * @param parameterPath       Role path expression starting in the parameter
     *                            name
     * @param parameterValue      OID parameter value
     * @param parameterName       Parameter name
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    public SQLPopulation(String classDefinitionName, String targetEntityName, String parameterPath, IOid parameterValue,
            String parameterName) throws SystemException {
        super(null);
        displaySet = new ArrayList<>();
        setSourceEntityName(classDefinitionName);
        setTargetEntityName(targetEntityName);
        setObjectValuedParameterName(parameterName);
        String normalizedParameterPath = Constants.normalizePath(parameterValue.getDefinitionClass(), parameterPath,
                true);
        initializeQuery(normalizedParameterPath);

        String rolePath = "";
        if (!parameterPath.equalsIgnoreCase(parameterName))
            rolePath = parameterPath.substring(parameterName.length() + 1);

        // Locate inverse role path
        String instanceDefinitionClass = parameterValue.getDefinitionClass();
        String inversePath = Constants.getInverseRole(instanceDefinitionClass, rolePath);

        // Obtain the alias through the role path
        SQLAlias initialAlias = getStartingClassAlias();
        SQLAlias alias = this.addAggregationJoins(initialAlias, this.getTargetEntityName(), inversePath,
                Constants.INNERJOIN, initialAlias.getPath());

        // If the reached class is not the instance definition class, add the
        // inheritance Joins
        if (!alias.getFacet().equalsIgnoreCase(instanceDefinitionClass)) {
            alias = this.addInheritanceJoins(alias, alias.getFacet(), instanceDefinitionClass);
        }

        // Set the alias path
        alias.setPath(parameterName);

        // Set the parameter name to the alias
        alias.setAssignedParameterName(parameterName);

        // Fix the related instance
        addFixInstance(parameterValue, alias);
    }

    /**
     * Creates a new SQL sentence to query the related instances with the parameter
     * through the parameterPath.
     * 
     * @param aliasPath Alias path
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    private void initializeQuery(String aliasPath) throws SystemException {

        this.setOriginalPath(aliasPath);

        if (getSourceEntityName().isEmpty() && this.getObjectValuedParameterName().isEmpty()) {
            setClassNameInGlobalService(getTargetEntityName());
            aliasPath = getTargetEntityName();
        }

        // Get the default DisplaySet from the ConstantClass

        Object[] displaySetArray = processDisplaySet();

        String sourcetable = Constants.nameTable(getTargetEntityName());
        SQLAlias localAlias = createAlias(aliasPath, getTargetEntityName(), false);
        setStartingClassAlias(localAlias);
        createFrom(sourcetable, localAlias);
        for (Object displaySetMemberobject : displaySetArray) {
            String displaySetMember = (String) displaySetMemberobject;
            if (isRelated(displaySetMember)) {
                String displaySetMemberpath = "";
                SQLAlias nextalias = null;
                String tempOwnerClass = "";
                if (displaySetMember.contains(".")) {
                    displaySetMemberpath = displaySetMember.substring(0, displaySetMember.lastIndexOf('.'));
                    displaySetMember = displaySetMember.substring(displaySetMember.lastIndexOf('.') + 1);
                    nextalias = this.addAggregationJoins(localAlias, getTargetEntityName(), displaySetMemberpath,
                            Constants.LEFTJOIN);
                    tempOwnerClass = nextalias.getFacet();
                } else {
                    tempOwnerClass = localAlias.getFacet();
                    nextalias = localAlias;
                }
                String targetClass = Constants.getTargetFacetElement(tempOwnerClass, displaySetMember);
                if (tempOwnerClass.compareToIgnoreCase(targetClass) != 0) {
                    nextalias = this.addInheritanceJoins(nextalias, tempOwnerClass, targetClass);
                }
                addToSelectPart(nextalias.getAlias() + "." + displaySetMember.trim());
            } else {
                addToSelectPart(localAlias.getAlias() + "." + displaySetMember.trim());
            }
        }

    }

    private Object[] processDisplaySet() throws SystemException {
        Object[] displaySetArray;
        try {
            if (displaySet == null || displaySet.isEmpty()) {
                Class<?> constantClass = Constants.getConstantClass(getTargetEntityName());
                String displaySettemp = "";
                if (constantClass != null) {
                    Field displaySetField = constantClass.getField("DEFAULT_DISPLAYSET");
                    displaySettemp = (String) displaySetField.get(null);                	
                }
                displaySetArray = displaySettemp.split(",");
            } else {
                displaySetArray = displaySet.toArray();
            }
        } catch (Exception e) {
            throw new SystemException(e);
        }
        return displaySetArray;
    }

    private boolean isRelated(String displaySetMember) {
        boolean related;
        if (displaySetMember.contains(".")) {
            related = true;
        } else {
            related = (!getTargetFacet(displaySetMember).equals(getTargetEntityName()));
        }
        return related;
    }

    private String getTargetFacet(String displaySetMember) {
        String targetFacet;
        try {
            targetFacet = Constants.getTargetFacetElement(getTargetEntityName(), displaySetMember);
        } catch (Exception e) {
            targetFacet = "";
        }
        return targetFacet;
    }

    @Override
    public String getOriginalPath() {
        String originalPath = "";

        if (!getClassNameInGlobalService().equalsIgnoreCase("")) {
            originalPath += getClassNameInGlobalService();
            if (super.getOriginalPath().length() != 0)
                originalPath += "." + super.getOriginalPath();
        } else {
            originalPath += super.getOriginalPath();
        }

        return originalPath;
    }
}
