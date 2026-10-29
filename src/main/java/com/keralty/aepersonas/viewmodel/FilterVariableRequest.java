package com.keralty.aepersonas.viewmodel;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class FilterVariableRequest {
	
	public static final String AUTONUMERIC = "Autonumeric";
	public static final String BLOB = "Blob";
	public static final String BOOL = "Bool";
	public static final String DATE = "Date";
	public static final String DATETIME = "DateTime";
	public static final String INT = "Int";
	public static final String NAT = "Nat";
	public static final String REAL = "Real";
	public static final String STRING = "String";
	public static final String TEXT = "Text";
	public static final String TIME = "Time";

    private String name;

    private Object value;

    public FilterVariableRequest() {
        this.name = "";
        this.value = null;
    }

    public FilterVariableRequest(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }
    
    @JsonIgnore
    public Object getTypedValue(String dataType) {
    	Object typedValue;
    	switch(dataType) {
    		case AUTONUMERIC:
    		case NAT:
    		case INT:
    			typedValue = getLongValue();
    			break;
    		case REAL:
    			typedValue = getDoubleValue();
    			break;
    		case BOOL:
    			typedValue = getBooleanValue();
    			break;
    		case BLOB:
    			typedValue = getByteArrayValue();
    			break;
    		case STRING:
    		case TEXT:
    			typedValue = getStringValue();
    			break;
    		case DATE:
    			typedValue = getDateValue();
    			break;
    		case DATETIME:
    			typedValue = getTimestampValue();
    			break;
    		case TIME:
    			typedValue = getTimeValue();
    			break;
    		default:
    			typedValue = null;
    	}
    	return typedValue;
    }
    
    @JsonIgnore
    private Long getLongValue() {
        try {
            return Long.parseLong(value.toString());
        } catch (NumberFormatException e) {
            return null;
        }
    }
    
    @JsonIgnore
    private Double getDoubleValue() {
        try {
            return Double.parseDouble(value.toString());
        } catch (NumberFormatException e) {
            return null;
        }
    }
    
    @JsonIgnore
    private Boolean getBooleanValue() {
    	return Boolean.parseBoolean(value.toString());
    }

    @JsonIgnore
    private String getStringValue() {
    	return value.toString();
    }
    
    @JsonIgnore
    private byte[] getByteArrayValue() {
    	return (byte[]) value;
    }
    
    @JsonIgnore
    private Date getDateValue() {
    	if (value.toString().contains("T"))
    		return new Date(getTimestampValue().getTime());
    	else
    		return Date.valueOf(value.toString());
    }
    
    @JsonIgnore
    private Timestamp getTimestampValue() {
    	return Timestamp.valueOf(value.toString().replace("T", " ").replace("Z", ""));
    }
    
    @JsonIgnore
    private Time getTimeValue() {
    	if (value.toString().contains("T"))
    		return new Time(getTimestampValue().getTime());
    	else
    		return Time.valueOf(value.toString());
    }
    
    public void setValue(Object value) {
        this.value = value;
    }
}
