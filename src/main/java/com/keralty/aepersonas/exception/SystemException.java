package com.keralty.aepersonas.exception;

public class SystemException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public static final String GENERIC_EXCEPTION_CODE = "999";
    public static final String GENERIC_EXCEPTION_MESSAGE = "Estamos presentando fallas técnicas. Pruebe de nuevo pasados unos minutos";

    private final String exceptionCode;

    public SystemException() {
        super();
        exceptionCode = GENERIC_EXCEPTION_CODE;
    }

    public SystemException(String message) {
        super(GENERIC_EXCEPTION_MESSAGE);
    	org.slf4j.LoggerFactory.getLogger(this.getClass()).error(message);
        exceptionCode = GENERIC_EXCEPTION_CODE;
    }

    public SystemException(Exception e) {
        super(GENERIC_EXCEPTION_MESSAGE);
    	org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
        exceptionCode = GENERIC_EXCEPTION_CODE;
    }

    public SystemException(Exception e, String message) {
        super(GENERIC_EXCEPTION_MESSAGE);
    	org.slf4j.LoggerFactory.getLogger(this.getClass()).error(message + "\n" + e.getMessage());
        exceptionCode = GENERIC_EXCEPTION_CODE;
    }

    public String getExceptionCode() {
        return exceptionCode;
    }
}
