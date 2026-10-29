package com.keralty.aepersonas.sqlutils;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.persistence.oid.IOid;

/**
 * Provides the functionality to set up a FOR ALL CONDITION operator Uses the
 * Count operator (SQLCount) to solve the SQL.
 */
public class SQLForAllCondition extends SQLCount {

    /**
     * Create a new SQL sentence starting in a role path.
     * 
     * @param sourceEntityName Class definition formula
     * @param targetPath       Role path
     * @param instance         OID instance value
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    public SQLForAllCondition(String sourceEntityName, String targetPath, IOid instance) throws SystemException {
        super(sourceEntityName, targetPath, instance);
    }

    /**
     * Create a new SQL sentence starting in an object valued parameter.
     * 
     * @param sourceEntityName  Class definition formula
     * @param targetPath        Expression. Parameter name and role path
     * @param parameterDefClass Parameter definition class
     * @param parameterValue    OID parameter value
     * @param parameterName     Parameter name
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    public SQLForAllCondition(String sourceEntityName, String targetPath, String parameterDefClass, IOid parameterValue,
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
    public SQLForAllCondition(SQLSelect superQuery, String sourceEntityName, String targetPath) throws SystemException {
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
     * @param parameterName     Parameter name
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    public SQLForAllCondition(SQLSelect superQuery, String sourceEntityName, String targetPath,
            String parameterDefClass, IOid parameterValue, String parameterName) throws SystemException {
        super(superQuery, sourceEntityName, targetPath, parameterDefClass, parameterValue, parameterName);
    }

    /**
     * Returns the select part text of the SQL EXISTS sentence.
     * 
     * @return {@link String}
     */
    @Override
    public String getSQLSentence() {
        String sqlToReturn = "";
        // If it is a sub query, uses the EXISTS SQL operator, if not uses a COUNT SQL
        // operator
        if (getSuperSelect() != null) {
            sqlToReturn = getSQLSentenceExists();
        } else {
            sqlToReturn = getSQLSentenceCount();
        }
        return sqlToReturn;
    }

    /**
     * Returns the select part text of the SQL EXISTS sentence.
     * 
     * @return {@link String}
     */
    private String getSQLSentenceExists() {
        String localSentence = "";

        localSentence = "NOT EXISTS ( SELECT " + getAliases().get(0).getAlias();
        localSentence += " FROM " + getFromText();
        localSentence += getWherePart().getText() + " )";
        return localSentence;
    }

    /**
     * Returns the select part text of the SQL EXISTS sentence.
     * 
     * @return {@link String}
     */
    private String getSQLSentenceCount() {
        String localSentence = "";

        localSentence = super.getSQLSentence();

        return localSentence;
    }
}
