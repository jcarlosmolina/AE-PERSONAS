package com.keralty.aepersonas.repository;

public class SPResultRowField {

	private String name;
	
	private Object value;
	
	public SPResultRowField(String name, Object value) {
		this.name = name;
		if (value != null && value.getClass().getName().startsWith("com.sun.proxy")) {
			this.value = null;
		} else {
			this.value = value;	
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	public Object getValue() {
		return this.value;
	}
}
