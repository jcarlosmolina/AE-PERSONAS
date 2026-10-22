package com.keralty.aepersonas.repository;

public class SPParameter {

	private String name;
	
	private Object value;
	
	private boolean in;
	
	private boolean out;

	public static final String INPUT = "IN";
	
	public static final String OUTPUT = "OUT";
	
	public static final String INOUT = "INOUT";
	
	public SPParameter(String name, Object value, String mode) {
		this.name = name;
		this.value = value;
		this.in = mode.equalsIgnoreCase(INPUT) || mode.equalsIgnoreCase(INOUT);
		this.out = mode.equalsIgnoreCase(OUTPUT) || mode.equalsIgnoreCase(INOUT);
	}
	
	public String getName() {
		return this.name;
	}
	
	public Object getValue() {
		return this.value;
	}
	
	public boolean isInput() {
		return in;
	}
	
	public boolean isOutput() {
		return out;
	}
	
	public boolean isInOut() {
		return in && out;
	}
}
