package com.keralty.aepersonas.viewmodel;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class SqlDateWithoutTimezoneSerializer  extends StdSerializer<java.sql.Date> {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SqlDateWithoutTimezoneSerializer() {
        super(java.sql.Date.class);
    }

	@Override
	public void serialize(Date value, JsonGenerator gen, SerializerProvider provider) throws IOException {
		
		if (value == null) {
			return ;
		}

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		gen.writeString(df.format(value));
	}
}

