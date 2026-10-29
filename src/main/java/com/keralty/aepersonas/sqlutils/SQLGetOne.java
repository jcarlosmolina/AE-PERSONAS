package com.keralty.aepersonas.sqlutils;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.persistence.oid.IOid;

/**
 * Provides the functionality to set up a GetOne operator Creates a new SQL
 * sentence in order to retrieve the attribute value of any related instance.
 */
public class SQLGetOne extends SQLScalar {

    /**
     * Retrieves the attribute value starting in a role path.
     * 
     * @param sourceEntityName Formula definition class
     * @param targetPath       Navigation path from the source entity to the
     *                         attribute
     * @param instance         Starting expression instance.
     * @throws SystemException if occurs any error
     */
    public SQLGetOne(String sourceEntityName, String targetPath, IOid instance) throws SystemException {
        super(null, sourceEntityName, targetPath.substring(0, targetPath.lastIndexOf('.')),
                targetPath.substring(targetPath.lastIndexOf('.') + 1), instance, "", "");

    }

    /**
     * Retrieves the attribute value starting in a role path.
     * 
     * @param superQuery       Super query
     * @param sourceEntityName Formula definition class
     * @param targetPath       Navigation path from the source entity to the
     *                         attribute
     * @param instance         Starting expression instance.
     * @throws SystemException if occurs any error
     */
    public SQLGetOne(SQLSelect superQuery, String sourceEntityName, String targetPath, IOid instance)
            throws SystemException {
        super(superQuery, sourceEntityName, targetPath.substring(0, targetPath.lastIndexOf('.')),
                targetPath.substring(targetPath.lastIndexOf('.') + 1), instance, "", "");

    }

    /**
     * Retrieves the attribute value starting in a object valued parameter.
     * 
     * @param sourceEntityName  Formula definition class
     * @param targetPath        Navigation path, including the parameter name, to
     *                          the attribute
     * @param parameterDefClass Parameter definition class
     * @param parameterValue    Parameter value. Its related instances through
     *                          expression path
     * @param parameterName     Parameter name
     * @throws SystemException if occurs any error
     */
    public SQLGetOne(String sourceEntityName, String targetPath, String parameterDefClass, IOid parameterValue,
            String parameterName) throws SystemException {
        super(null, sourceEntityName, targetPath.substring(0, targetPath.lastIndexOf('.')),
                targetPath.substring(targetPath.lastIndexOf('.') + 1), parameterValue, parameterDefClass,
                parameterName);

    }

    /**
     * Retrieves the attribute value starting in a role path This sub query will be
     * used as an operand in some condition.
     * 
     * @param superQuery       Super query
     * @param sourceEntityName Formula definition class
     * @param targetPath       Navigation path from the source entity to the
     *                         attribute on which the MAX is performed
     * @throws SystemException if occurs any error
     */
    public SQLGetOne(SQLSelect superQuery, String sourceEntityName, String targetPath) throws SystemException {
        super(superQuery, sourceEntityName, targetPath.substring(0, targetPath.lastIndexOf('.')),
                targetPath.substring(targetPath.lastIndexOf('.') + 1), null, "", "");

    }

    /**
     * Retrieves the attribute value starting in a object valued parameter This sub
     * query will be used as an operand in some condition.
     * 
     * @param superQuery        Super query
     * @param sourceEntityName  Formula definition class
     * @param targetPath        Navigation path, including parameter name and
     *                          finishing in the attribute
     * @param parameterDefClass Parameter definition class
     * @param parameterValue    Parameter OID value
     * @param parameterName     Parameter name
     * @throws SystemException if occurs any error
     */
    public SQLGetOne(SQLSelect superQuery, String sourceEntityName, String targetPath, String parameterDefClass,
            IOid parameterValue, String parameterName) throws SystemException {
        super(superQuery, sourceEntityName, targetPath.substring(0, targetPath.lastIndexOf('.')),
                targetPath.substring(targetPath.lastIndexOf('.') + 1), parameterValue, parameterDefClass,
                parameterName);

    }

    /**
     * Returns the select part text of the SQL sentence.
     * 
     * @return {@link String}
     */
    @Override
    public String getSQLSentence() {
        String localSentence = "";

        localSentence = " SELECT " + this.getAttributeAlias().getAlias() + "." + getTargetTableFieldName();
        localSentence += " FROM " + getFromText();
        localSentence += getWherePart().getText();
        localSentence += getOrderByPart().getText();

        if (getSuperSelect() == null)
            localSentence = formatParameters(localSentence);
        return localSentence;
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
}
