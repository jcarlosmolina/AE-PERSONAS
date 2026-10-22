package com.keralty.aepersonas.viewmodel;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.global.Constants;

public class QueryRequest {

    protected String jsonOID;

    protected String displaySetName;

    protected String displaySetItems;
    
    protected String piuName;

    protected List<FilterRequest> filters;

    protected String orderCriteriaName;

    private String dsItemSort;

    private boolean dsItemSortAscending;

    private int pageNumber;

    private int pageSize;

    public QueryRequest() {
        this.jsonOID = "";
        this.displaySetName = "";
        this.displaySetItems = "";
        this.piuName = "";
        this.filters = new ArrayList<>();
        this.orderCriteriaName = "";
        this.dsItemSort = "";
        this.dsItemSortAscending = true;
        this.pageNumber = 1;
        this.pageSize = 40;
    }

    public QueryRequest(FilterRequest filterRequest) {
        this.jsonOID = "";
        this.displaySetName = "";
        this.displaySetItems = "";
        this.piuName = "";
        this.filters = new ArrayList<>();
        this.filters.add(filterRequest);
        this.orderCriteriaName = "";
        this.dsItemSort = "";
        this.dsItemSortAscending = true;
        this.pageNumber = 1;
        this.pageSize = 40;
    }

    public String getJsonOID() {
        return jsonOID;
    }

    public void setJsonOID(String jsonOID) {
        this.jsonOID = jsonOID;
    }

    public String getDisplaySetName() {
        return displaySetName;
    }

    public void setDisplaySetName(String displaySetName) {
        this.displaySetName = displaySetName;
    }

    public String getDisplaySetItems() {
        return displaySetItems;
    }

    public void setDisplaySetItems(String displaySetItems) {
        this.displaySetItems = displaySetItems;
    }

    public String getPiuName() {
        return piuName;
    }

    public void setPiuName(String piuName) {
        this.piuName = piuName;
    }

    public List<FilterRequest> getFilters() {
        return filters;
    }

    public void setFilters(List<FilterRequest> filters) {
        this.filters = filters;
    }

    public String getOrderCriteriaName() {
        return orderCriteriaName;
    }

    public void setOrderCriteriaName(String orderCriteriaName) {
        this.orderCriteriaName = orderCriteriaName;
    }

    public String getDsItemSort() {
        return dsItemSort;
    }

    public void setDsItemSort(String dsItemSort) {
        this.dsItemSort = dsItemSort;
    }

    public boolean isDsItemSortAscending() {
        return dsItemSortAscending;
    }

    public void setDsItemSortAscending(boolean dsItemSortAscending) {
        this.dsItemSortAscending = dsItemSortAscending;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void addFilterRequest(FilterRequest filterRequest) {
        this.filters.add(filterRequest);
    }
    
    public void addFilterByRelated(String relatedInstanceOidJson, String relatedInstancePath) {
        FilterRequest filterRequest = new FilterRequest();
        filterRequest.setName(Constants.FILTER_BY_RELATED);
        filterRequest.addFilterVariable(Constants.FILTER_BY_RELATED_FVAR_OID, relatedInstanceOidJson);
        filterRequest.addFilterVariable(Constants.FILTER_BY_RELATED_FVAR_PATH, relatedInstancePath);
        addFilterRequest(filterRequest);
    }
    
    public boolean hasFilterByOid() {
    	return getFilterByOid() != null;
    }
    
    public FilterRequest getFilterByOid() {
    	for(FilterRequest fr : this.filters) {
    		if (fr.getName().equals(Constants.FILTER_BY_OID))
    			return fr;
    	}
    	return null;
    }
}
