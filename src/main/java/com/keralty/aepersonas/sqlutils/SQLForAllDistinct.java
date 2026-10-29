package com.keralty.aepersonas.sqlutils;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.persistence.oid.IOid;

/**
 * Provides the functionality to set up a For All Distinct operator Uses the Sum
 * operator (SQLSum) to solve the SQL.
 */
public class SQLForAllDistinct extends SQLSum {

    /**
     * Create a new SQL sentence to set up a For All Distinct operator starting in a
     * role path.
     * 
     * @param sourceEntityName    Class definition formula
     * @param targetPathAttribute Role path and attribute to be compare
     * @param instance            OID instance value
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    public SQLForAllDistinct(String sourceEntityName, String targetPathAttribute, IOid instance)
            throws SystemException {
        super(sourceEntityName, targetPathAttribute, instance);
    }

    /**
     * Create a new SQL sentence to set up a For All Distinct operator starting in
     * an object valued parameter.
     * 
     * @param sourceEntityName    Class definition formula
     * @param targetPathAttribute Role path and attribute to be compare
     * @param parameterDefClass   Parameter definition class
     * @param parameterValue      OID parameter value
     * @param parameterName       Parameter name
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    public SQLForAllDistinct(String sourceEntityName, String targetPathAttribute, String parameterDefClass,
            IOid parameterValue, String parameterName) throws SystemException {
        super(sourceEntityName, targetPathAttribute, parameterDefClass, parameterValue, parameterName);
    }

    /**
     * Create a new SQL sentence to set up a For All Distinct operator as a sub
     * query of the received one This sub query will be used as an operand in some
     * condition.
     * 
     * @param superQuery          Super query
     * @param sourceEntityName    Formula definition class
     * @param targetPathAttribute Role path and attribute to be compare
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    public SQLForAllDistinct(SQLSelect superQuery, String sourceEntityName, String targetPathAttribute)
            throws SystemException {
        super(superQuery, sourceEntityName, targetPathAttribute);
    }

    /**
     * Create a new SQL sentence to set up a For All Distinct operator as a sub
     * query of the received one This sub query will be used as an operand in some
     * condition.
     * 
     * @param superQuery          Super query
     * @param sourceEntityName    Formula definition class
     * @param targetPathAttribute Role path and attribute to be compare
     * @param parameterDefClass   Parameter definition class
     * @param parameterValue      Parameter OID value
     * @param parameterName       Parameter name
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    public SQLForAllDistinct(SQLSelect superQuery, String sourceEntityName, String targetPathAttribute,
            String parameterDefClass, IOid parameterValue, String parameterName) throws SystemException {
        super(superQuery, sourceEntityName, targetPathAttribute, parameterDefClass, parameterValue, parameterName);
    }

    /**
     * Returns the text of the SQL sentence.
     * 
     * @return {@link String}
     */
    @Override
    public String getSQLSentence() {
        // The SQL Sentences will be always the difference between the COUNT (*) and the
        // COUNT DISTINCT
        String localSentence = "";
        String superSelectPart = "";
        superSelectPart += super.getSelectPartText();
        superSelectPart += " FROM " + super.getFromText();
        superSelectPart += super.getWherePart().getText();

        String attributeText = getAttributeAlias().getAlias() + "." + getTargetTableFieldName();

        if (this.getIsDistinct()) {
            localSentence = "SELECT COUNT(*) - COUNT(DISTINCT lAux." + getTargetTableFieldName() + ")";
            localSentence += " FROM (";
            localSentence += superSelectPart;
            localSentence += ") lAux ";
        } else {
            localSentence = "SELECT COUNT(*) - COUNT(DISTINCT " + attributeText + ")";
            localSentence += " FROM " + getFromText();
            localSentence += getWherePart().getText();
        }

        // If it is a sub query, add the comparison equals to one
        if (getSuperSelect() != null) {
            localSentence = "(" + localSentence + ") = 0";
        }

        if (getSuperSelect() == null)
            localSentence = formatParameters(localSentence);
        return localSentence;
    }
}
