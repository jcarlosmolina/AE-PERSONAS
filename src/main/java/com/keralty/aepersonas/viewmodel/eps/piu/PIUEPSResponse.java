package com.keralty.aepersonas.viewmodel.eps.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.eps.ds.AutoDS;

public class PIUEPSResponse extends QueryResponse {

    private List<AutoDS> results;

    public PIUEPSResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUEPSResponse(List<AutoDS> results) {
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
