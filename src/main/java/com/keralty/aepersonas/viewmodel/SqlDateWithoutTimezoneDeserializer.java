package com.keralty.aepersonas.viewmodel;

import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class SqlDateWithoutTimezoneDeserializer  extends StdDeserializer<java.sql.Date> {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SqlDateWithoutTimezoneDeserializer() {
        super(java.sql.Date.class);
    }

    @Override
    public java.sql.Date deserialize(com.fasterxml.jackson.core.JsonParser p, com.fasterxml.jackson.databind.DeserializationContext ctxt) throws java.io.IOException {
        String dateString = p.getText();
        if (dateString == null || dateString.isEmpty()) {
            return null;
        }
        
        java.sql.Date sqlDate = java.sql.Date.valueOf(dateString);

        return sqlDate;
    }
}

