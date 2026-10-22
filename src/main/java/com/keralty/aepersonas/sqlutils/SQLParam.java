package com.keralty.aepersonas.sqlutils;

/**
 * Parameters of the WHERE clause.
 */
public class SQLParam {

    /** Parameter name. */
    private String paramName;

    /** Parameter Valued. */
    private Object paramValue;

    /** Parameter Data Type. */
    private String dataType;

    /**
     * Default constructor.
     * @param paramName Name of the parameter used in the WHERE clause
     * @param paramValue Value of the parameter used in the WHERE clause
     */
    public SQLParam(String paramName, Object paramValue) {
        this.paramName = paramName;
        this.paramValue = paramValue;
    }

    /**
     * Default constructor.
     * @param paramName Name of the parameter used in the WHERE clause
     * @param paramValue Value of the parameter used in the WHERE clause
     * @param dataType DataType of the parameter used in the WHERE clause
     */
    public SQLParam(String paramName, Object paramValue, String dataType) {
        this.paramName = paramName;
        this.paramValue = paramValue;
        this.dataType = dataType;
    }

    /**
     * Gets the parameter name used in the WHERE clause.
     * @return {@link String} Parameter name
     */
    public String getParamName() {
        return paramName;
    }

    /**
     * Sets the parameter name used in the WHERE clause.
     * @param paramName Parameter name
     */
    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    /**
     * Gets the parameter value used in the WHERE clause.
     * @return {@link Object} Parameter value
     */
    public Object getParamValue() {
        return paramValue;
    }

    /**
     * Sets the parameter value used in the WHERE clause.
     * @param paramValue Parameter name
     */
    public void setParamValue(Object paramValue) {
        this.paramValue = paramValue;
    }

    /**
     * Gets the data type.
     * @return {@link String} Parameter name
     */
    public String getParamType() {
        return dataType;
    }
}

