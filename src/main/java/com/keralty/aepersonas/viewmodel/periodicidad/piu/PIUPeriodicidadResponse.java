package com.keralty.aepersonas.viewmodel.periodicidad.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.periodicidad.ds.AutoDS;

public class PIUPeriodicidadResponse extends QueryResponse {

    private List<AutoDS> results;

    public PIUPeriodicidadResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUPeriodicidadResponse(List<AutoDS> results) {
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
