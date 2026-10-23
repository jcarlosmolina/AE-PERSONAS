package com.keralty.aepersonas.exception;

public class MinCardinalityException extends ModelException {

    /**
     * Serialization UID.
     */
    private static final long serialVersionUID = 1L;
    
    public MinCardinalityException(String classAlias, String roleAlias) {
    	super(ErrorInfo.LOW_CARD, "Instancia de " + classAlias + " no puede ser borrada debido a que se relaciona con al menos una instancia de " + roleAlias);
    }
}
