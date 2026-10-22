package com.keralty.aepersonas.viewmodel.estadopersona.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.estadopersona.ds.AutoDS;

public class PIUEstadoPersonaResponse extends QueryResponse {

    private List<AutoDS> results;

    public PIUEstadoPersonaResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUEstadoPersonaResponse(List<AutoDS> results) {
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
