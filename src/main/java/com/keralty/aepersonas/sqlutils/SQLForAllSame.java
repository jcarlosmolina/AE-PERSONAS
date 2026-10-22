package com.keralty.aepersonas.sqlutils;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.persistence.oid.IOid;

/**
 * Provides the functionality to set up a For All Same operator Uses the Sum
 * operator (SQLSum) to solve the SQL.
 */
public class SQLForAllSame extends SQLSum {

    /**
     * Create a new SQL sentence to set up a For All Same operator starting in a
     * role path.
     * 
     * @param sourceEntityName    Class definition formula
     * @param targetPathAttribute Role path and attribute to be compare
     * @param instance            OID instance value
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    public SQLForAllSame(String sourceEntityName, String targetPathAttribute, IOid instance) throws SystemException {
        super(sourceEntityName, targetPathAttribute, instance);
    }

    /**
     * Create a new SQL sentence to set up a For All Same operator starting in an
     * object valued parameter.
     * 
     * @param sourceEntityName    Class definition formula
     * @param targetPathAttribute Role path and attribute to be compare
     * @param parameterDefClass   Parameter definition class
     * @param parameterValue      OID parameter value
     * @param parameterName       Parameter name
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    public SQLForAllSame(String sourceEntityName, String targetPathAttribute, String parameterDefClass,
            IOid parameterValue, String parameterName) throws SystemException {
        super(sourceEntityName, targetPathAttribute, parameterDefClass, parameterValue, parameterName);
    }

    /**
     * Create a new SQL sentence to set up a For All Same operator as a sub query of
     * the received one This sub query will be used as an operand in some condition.
     * 
     * @param superQuery          Super query
     * @param sourceEntityName    Formula definition class
     * @param targetPathAttribute Role path and attribute to be compare
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    public SQLForAllSame(SQLSelect superQuery, String sourceEntityName, String targetPathAttribute)
            throws SystemException {
        super(superQuery, sourceEntityName, targetPathAttribute);
    }

    /**
     * Create a new SQL sentence to set up a For All Same operator as a sub query of
     * the received one This sub query will be used as an operand in some condition.
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
    public SQLForAllSame(SQLSelect superQuery, String sourceEntityName, String targetPathAttribute,
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

        String localSentence = "";

        String attributeText = "";
        attributeText = getAttributeAlias().getAlias() + "." + getTargetTableFieldName();

        // If the SQL requires a DISTINCT or not
        if (getSuperSelect() != null) {
            localSentence = "(SELECT COUNT(DISTINCT " + attributeText + ")";
            localSentence += " FROM " + getFromText();
            localSentence += getWherePart().getText() + ") <= 1";
        } else {
            localSentence = "SELECT COUNT(DISTINCT " + attributeText + ")";
            localSentence += " FROM " + getFromText();
            localSentence += getWherePart().getText();
        }
        if (getSuperSelect() == null)
            localSentence = formatParameters(localSentence);
        return localSentence;
    }
}
