package com.keralty.aepersonas.viewmodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PopulationRequestViewModel {
	
    @JsonIgnore
    private String relatedInstanceJsonOid;

    private String relatedInstancePath;

    private int pageNumber;

    private int pageSize;
    
    private String dsItemSort;
    
    private boolean dsItemSortAscending;
    
    public PopulationRequestViewModel() {
    	relatedInstanceJsonOid = "";
    	relatedInstancePath = "";
    	pageNumber = 1;
    	pageSize = 0;
    	dsItemSort = "";
    	dsItemSortAscending = true;
    }
    
    public void setRelatedInstanceJsonOid(String relatedInstanceJsonOid) {
        this.relatedInstanceJsonOid = relatedInstanceJsonOid;
    }
    
    public String getRelatedInstanceJsonOid() {
        return relatedInstanceJsonOid;
    }
    
    public void setRelatedInstancePath(String relatedInstancePath) {
        this.relatedInstancePath = relatedInstancePath;
    }
    
    public String getRelatedInstancePath() {
        return relatedInstancePath;
    }
    
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
    
    public int getPageNumber() {
        return pageNumber;
    }
    
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    
    public int getPageSize() {
        return pageSize;
    }
    
    public void setDsItemSort(String dsItemSort) {
        this.dsItemSort = dsItemSort;
    }
    
    public String getDsItemSort() {
        return dsItemSort;
    }
    
    public void setDsItemSortAscending(boolean dsItemSortAscending) {
        this.dsItemSortAscending = dsItemSortAscending;
    }
    
    public boolean getDsItemSortAscending() {
        return dsItemSortAscending;
    }

    public QueryRequest buildQueryRequest() {
        QueryRequest queryRequest = new QueryRequest();
        queryRequest.setPageNumber(pageNumber);
        queryRequest.setPageSize(pageSize);
        queryRequest.setDsItemSort(dsItemSort);
        queryRequest.setDsItemSortAscending(dsItemSortAscending);
        
        if (!relatedInstanceJsonOid.isEmpty() && !relatedInstancePath.isEmpty()){
            queryRequest.addFilterByRelated(relatedInstanceJsonOid, relatedInstancePath);
        }

        return queryRequest;
    }
}
