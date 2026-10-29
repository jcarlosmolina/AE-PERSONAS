package com.keralty.aepersonas.viewmodel.companyia.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.companyia.ds.AutoDS;

public class PIUCompanyiaResponse extends QueryResponse {

    private List<AutoDS> results;

    public PIUCompanyiaResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUCompanyiaResponse(List<AutoDS> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<AutoDS> getResults() {
        return this.results;
    }
    
    public void setResults(List<AutoDS> results) {
        this.results = results;
    }
}
