package com.keralty.aepersonas.sqlutils;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.persistence.oid.IOid;

/**
 * Provides the functionality to set up an SQL select EXISTS statement to be
 * used as a sub query. Uses the Count operator (SQLCount) to solve the SQL
 */
public class SQLExists extends SQLCount {

    /**
     * Create a new SQL sentence to set up a SQL EXISTS statement starting in a role
     * path.
     * 
     * @param sourceEntityName Class definition formula
     * @param targetPath       Role path
     * @param instance         OID instance value
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    public SQLExists(String sourceEntityName, String targetPath, IOid instance) throws SystemException {
        super(sourceEntityName, targetPath, instance);
    }

    /**
     * Creates a new SQL EXIST sentence over a targetPath from a sourceEntity.
     * 
     * @param superQuery       Super query
     * @param sourceEntityName Name of the source entity
     * @param targetPath       Navigation path from the source entity to the
     *                         population to count
     * @param instance         Its related instance through expression path
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    public SQLExists(SQLSelect superQuery, String sourceEntityName, String targetPath, IOid instance)
            throws SystemException {
        super(superQuery, sourceEntityName, targetPath, instance);
    }

    /**
     * Create a new SQL sentence to set up a SQL EXISTS statement starting in an
     * object valued parameter.
     * 
     * @param sourceEntityName  Class definition formula
     * @param targetPath        Expression. Parameter name and role path
     * @param parameterDefClass Parameter definition class
     * @param parameterValue    OID parameter value
     * @param parameterName     OID parameter name
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    public SQLExists(String sourceEntityName, String targetPath, String parameterDefClass, IOid parameterValue,
            String parameterName) throws SystemException {
        super(sourceEntityName, targetPath, parameterDefClass, parameterValue, parameterName);
    }

    /**
     * Create a new SQL sentence as a sub query of the received one This sub query
     * will be used as an operand in some condition.
     * 
     * @param superQuery       Super query
     * @param sourceEntityName Formula definition class
     * @param targetPath       Navigation path from the source entity
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    public SQLExists(SQLSelect superQuery, String sourceEntityName, String targetPath) throws SystemException {
        super(superQuery, sourceEntityName, targetPath);
    }

    /**
     * Create a new SQL sentence as a sub query of the received one, using an Object
     * Valued argument This sub query will be used as an operand in some condition.
     * 
     * @param superQuery        Super query
     * @param sourceEntityName  Formula definition class
     * @param targetPath        Navigation path, including parameter name and
     *                          finishing in the attribute
     * @param parameterDefClass Parameter definition class
     * @param parameterValue    Parameter OID value
     * @param parameterName     Parameter OID name
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    public SQLExists(SQLSelect superQuery, String sourceEntityName, String targetPath, String parameterDefClass,
            IOid parameterValue, String parameterName) throws SystemException {
        super(superQuery, sourceEntityName, targetPath, parameterDefClass, parameterValue, parameterName);
    }

    /**
     * Returns the select part text of the SQL EXISTS sentence.
     * 
     * @return {@link String}
     */
    @Override
    public String getSQLSentence() {
        // If it is a sub query, use the EXISTS operator, if not use a COUNT operator
        String lReturn = null;
        if (getSuperSelect() != null) {
            lReturn = getSQLSentenceExists();
        } else {
            lReturn = getSQLSentenceCount();
        }
        return lReturn;
    }

    /**
     * Gets the EXIST part of the SQL.
     * 
     * @return {@link String}
     */
    private String getSQLSentenceExists() {
        String localSentence = "";

        localSentence += "(SELECT COUNT(" + getFromPart().get(0).getAlias() + ") FROM ";
        localSentence += getFromText();
        localSentence += getWherePart().getText();
        localSentence += ") > 0";

        return localSentence;
    }

    /**
     * Gets the SELECT COUNT of SQL.
     * 
     * @return {@link String}
     */
    private String getSQLSentenceCount() {
        String localSentence = "";

        localSentence = super.getSQLSentence();

        return localSentence;
    }
}
