package com.keralty.aepersonas.viewmodel.gestor.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.gestor.ds.DSGestor;

public class PIUGestoresResponse extends QueryResponse {

    private List<DSGestor> results;

    public PIUGestoresResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUGestoresResponse(List<DSGestor> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSGestor> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSGestor> results) {
        this.results = results;
    }
}
