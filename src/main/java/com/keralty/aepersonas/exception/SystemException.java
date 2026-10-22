package com.keralty.aepersonas.exception;

public class SystemException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public static final String GENERIC_EXCEPTION_CODE = "999";

    private final String exceptionCode;

    public SystemException() {
        super();
        exceptionCode = GENERIC_EXCEPTION_CODE;
    }

    public SystemException(String message) {
        super(message);
        exceptionCode = GENERIC_EXCEPTION_CODE;
    }

    public SystemException(Exception e) {
        super(e);
        exceptionCode = GENERIC_EXCEPTION_CODE;
    }

    public SystemException(Exception e, String message) {
        super(message, e);
        exceptionCode = GENERIC_EXCEPTION_CODE;
    }

    public String getExceptionCode() {
        return exceptionCode;
    }
}
