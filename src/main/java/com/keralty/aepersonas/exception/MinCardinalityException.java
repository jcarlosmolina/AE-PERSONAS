package com.keralty.aepersonas.exception;

public class MinCardinalityException extends ModelException {

    /**
     * Serialization UID.
     */
    private static final long serialVersionUID = 1L;
    
    public MinCardinalityException(String classAlias, String roleAlias) {
    	super(ErrorInfo.LOW_CARD, "Instance of " + classAlias + " cannot be deleted as it is related with at least one instance of " + roleAlias);
    }
}
