package com.keralty.aepersonas.sqlutils;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.persistence.oid.IOid;

/**
 * Provides the functionality to set up an SQL select SUM statement.
 *
 */
public class SQLSum extends SQLScalar {

    /**
     * Creates a new SQL SUM sentence over an attribute reached through an
     * expression from a sourceEntity.
     * 
     * @param sourceEntityName Name of the source entity. Formula definition class
     * @param targetPath       Navigation path from the source entity to the
     *                         attribute on which the SUM is performed
     * @param instance         Starting expression instance. Its related instances
     *                         through expression path will be SUM
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    public SQLSum(String sourceEntityName, String targetPath, IOid instance) throws SystemException {
        super(null, sourceEntityName, targetPath.substring(0, targetPath.lastIndexOf('.')),
                targetPath.substring(targetPath.lastIndexOf('.') + 1), instance, "", "");
    }

    /**
     * Creates a new SQL SUM sentence over an attribute reached through an
     * expression from a sourceEntity.
     * 
     * @param superQuery       Super query
     * @param sourceEntityName Name of the source entity. Formula definition class
     * @param targetPath       Navigation path from the source entity to the
     *                         attribute on which the SUM is performed
     * @param instance         Starting expression instance. Its related instances
     *                         through expression path will be SUM
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    public SQLSum(SQLSelect superQuery, String sourceEntityName, String targetPath, IOid instance)
            throws SystemException {
        super(superQuery, sourceEntityName, targetPath.substring(0, targetPath.lastIndexOf('.')),
                targetPath.substring(targetPath.lastIndexOf('.') + 1), instance, "", "");
    }

    /**
     * Creates a new SQL SUM sentence over an attribute reached through an
     * expression from a object valued parameter.
     * 
     * @param sourceEntityName  Name of the source entity. Formula definition class
     * @param targetPath        Navigation path, including the parameter name, to
     *                          the attribute on which the SUM is performed
     * @param parameterDefClass Parameter definition class
     * @param parameterValue    Parameter value. Its related instances through
     *                          expression path will be SUM
     * @param parameterName     Parameter name
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    public SQLSum(String sourceEntityName, String targetPath, String parameterDefClass, IOid parameterValue,
            String parameterName) throws SystemException {
        super(null, sourceEntityName, targetPath.substring(0, targetPath.lastIndexOf('.')),
                targetPath.substring(targetPath.lastIndexOf('.') + 1), parameterValue, parameterDefClass,
                parameterName);
    }

    /**
     * Create a new SQL sentence as a sub query of the received one This sub query
     * will be used as an operand in some condition.
     * 
     * @param superQuery       Super query
     * @param sourceEntityName Formula definition class
     * @param targetPath       Navigation path from the source entity to the
     *                         attribute on which the SUM is performed
     * @throws SystemException if any system error raised during the execution of
     *                         the method.
     */
    public SQLSum(SQLSelect superQuery, String sourceEntityName, String targetPath) throws SystemException {
        super(superQuery, sourceEntityName, targetPath.substring(0, targetPath.lastIndexOf('.')),
                targetPath.substring(targetPath.lastIndexOf('.') + 1), null, "", "");
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
    public SQLSum(SQLSelect superQuery, String sourceEntityName, String targetPath, String parameterDefClass,
            IOid parameterValue, String parameterName) throws SystemException {
        super(superQuery, sourceEntityName, targetPath.substring(0, targetPath.lastIndexOf('.')),
                targetPath.substring(targetPath.lastIndexOf('.') + 1), parameterValue, parameterDefClass,
                parameterName);
    }

    /**
     * Returns the select part text of the SQL SUM sentence.
     * 
     * @return {@link String} Select part text of the SQL SUM sentence
     */
    @Override
    public String getSQLSentence() {
        String localSentence = "";
        String superSelectPart = super.getSQLSentence();

        // If the SQL requires a DISTINCT or not
        if (this.getIsDistinct()) {
            localSentence = " SELECT SUM( lAux." + getTargetTableFieldName() + " )";
            localSentence += " FROM (";
            localSentence += superSelectPart;
            localSentence += ") lAux ";
        } else {
            localSentence = " SELECT SUM(" + this.getAttributeAlias().getAlias() + "." + getTargetTableFieldName()
                    + ")";
            localSentence += " FROM " + getFromText();
            localSentence += getWherePart().getText();
            localSentence += getOrderByPart().getText();
        }
        if (getSuperSelect() == null)
            localSentence = formatParameters(localSentence);
        return localSentence;
    }

    protected String formatParameters(String queryString) {
        StringBuilder buffer = new StringBuilder(queryString);
        int start = 0;
        int order = 1;
        while ((start = buffer.indexOf("?", start + 1)) > 0) {
            buffer.insert(start + 1, order);
            order++;
        }

        return buffer.toString();
    }
}
