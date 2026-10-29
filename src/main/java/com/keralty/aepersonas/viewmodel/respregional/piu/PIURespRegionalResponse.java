package com.keralty.aepersonas.viewmodel.respregional.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.respregional.ds.DSRespRegionalPIU;

public class PIURespRegionalResponse extends QueryResponse {

    private List<DSRespRegionalPIU> results;

    public PIURespRegionalResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIURespRegionalResponse(List<DSRespRegionalPIU> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSRespRegionalPIU> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSRespRegionalPIU> results) {
        this.results = results;
    }
}
