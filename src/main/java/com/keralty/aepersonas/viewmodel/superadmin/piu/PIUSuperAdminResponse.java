package com.keralty.aepersonas.viewmodel.superadmin.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.superadmin.ds.AutoDS;

public class PIUSuperAdminResponse extends QueryResponse {

    private List<AutoDS> results;

    public PIUSuperAdminResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUSuperAdminResponse(List<AutoDS> results) {
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
