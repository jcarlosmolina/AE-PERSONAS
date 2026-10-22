package com.keralty.aepersonas.exception;

import java.util.ArrayList;
import java.util.List;

public class ModelException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public static final int GENERIC_EXCEPTION_CODE = 999;

    private final int exceptionCode;

    private final String exceptionMessageId;

    private final List<String> exceptionMessageParts;

    public ModelException() {
        super();
        this.exceptionCode = GENERIC_EXCEPTION_CODE;
        this.exceptionMessageId = "";
        this.exceptionMessageParts = new ArrayList<>();
    }

    public ModelException(String message) {
        super(message);
        this.exceptionCode = GENERIC_EXCEPTION_CODE;
        this.exceptionMessageId = "";
        this.exceptionMessageParts = new ArrayList<>();
    }

    public ModelException(String message, Throwable cause) {
        super(message, cause);
        this.exceptionCode = GENERIC_EXCEPTION_CODE;
        this.exceptionMessageId = "";
        this.exceptionMessageParts = new ArrayList<>();
    }

    public ModelException(int code, String message) {
        super(message);
        this.exceptionCode = code;
        this.exceptionMessageId = "";
        this.exceptionMessageParts = new ArrayList<>();
    }

    public ModelException(int code, String message, Throwable cause) {
        super(message, cause);
        this.exceptionCode = code;
        this.exceptionMessageId = "";
        this.exceptionMessageParts = new ArrayList<>();
    }

    public ModelException(int exceptionCode, String message, String exceptionMessageId,
            List<String> exceptionMessageParts) {
        super(message);
        this.exceptionCode = exceptionCode;
        this.exceptionMessageId = exceptionMessageId;
        this.exceptionMessageParts = exceptionMessageParts;
    }

    public ModelException(int exceptionCode, String message, Throwable cause, String exceptionMessageId,
            List<String> exceptionMessageParts) {
        super(message, cause);
        this.exceptionCode = exceptionCode;
        this.exceptionMessageId = exceptionMessageId;
        this.exceptionMessageParts = exceptionMessageParts;
    }

    public int getExceptionCode() {
        return exceptionCode;
    }

    public String getExceptionMessageId() {
        return exceptionMessageId;
    }

    public List<String> getExceptionMessageParts() {
        return exceptionMessageParts;
    }
	
    public void addExceptionMessagePart(String exceptionMessagePart) {
    	exceptionMessageParts.add(exceptionMessagePart);
    }
}
