package com.keralty.aepersonas.viewmodel;

public class QueryResponse extends Response {

    private int totalItems;

    public QueryResponse() {
        super();
        this.totalItems = 0;
    }

    public QueryResponse(String resultCode, String resultDescription) {
        super();
        this.resultCode = resultCode;
        this.resultDescription = resultDescription;
        this.totalItems = 0;
    }

    public QueryResponse(String resultCode, String resultDescription, int totalItems) {
        super();
        this.resultCode = resultCode;
        this.resultDescription = resultDescription;
        this.totalItems = totalItems;
    }

    public QueryResponse(int totalItems) {
        super();
        this.resultCode = "000";
        this.resultDescription = "OK";
        this.totalItems = totalItems;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    @Override
    public void setException(Exception e) {
        super.setException(e);
        this.totalItems = 0;
    }
}
