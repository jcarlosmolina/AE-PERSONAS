package com.keralty.aepersonas.exception;

public class InstanceExistsException extends ModelException {

    /**
     * Serialization UID.
     */
    private static final long serialVersionUID = 1L;
    
    public InstanceExistsException(String classAlias) {
    	super(ErrorInfo.EXISTS_INSTANCE, "Instance of " + classAlias + " already exists");
    }
}
