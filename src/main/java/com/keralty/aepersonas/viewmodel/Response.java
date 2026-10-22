package com.keralty.aepersonas.viewmodel;

import java.util.Arrays;

import com.keralty.aepersonas.exception.ModelException;

public class Response {

    protected String resultCode;

    protected String resultDescription;

    protected Long elapsedMillis;

    public Response() {
        this.resultCode = "000";
        this.resultDescription = "OK";
        this.elapsedMillis = 0L;
    }

    public Response(String resultCode, String resultDescription, Long elapsedMillis) {
        super();
        this.resultCode = resultCode;
        this.resultDescription = resultDescription;
        this.elapsedMillis = elapsedMillis;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultDescription() {
        return resultDescription;
    }

    public void setResultDescription(String resultDescription) {
        this.resultDescription = resultDescription;
    }

    public Long getElapsedMillis() {
        return elapsedMillis;
    }

    public void setElapsedMillis(Long elapsedMillis) {
        this.elapsedMillis = elapsedMillis;
    }

    public boolean isOk() {
        return "000".equals(resultCode);
    }

    public void setException(Exception e) {
        if (e instanceof ModelException) {
            setModelException((ModelException) e);
        } else {
            setGenericException((Exception) e);
        }
    }

    private void setModelException(ModelException e) {
        this.resultCode = String.valueOf(e.getExceptionCode());
        this.resultDescription = e.getMessage();
    }

    private void setGenericException(Exception e) {
        this.resultCode = String.valueOf(ModelException.GENERIC_EXCEPTION_CODE);
        String message = (e.getCause() != null ? e.getCause().getMessage() : e.getMessage());
        String stackTrace = Arrays.toString(e.getStackTrace());
        this.resultDescription = String.format("%s%n%s", message, stackTrace);
    }
}
