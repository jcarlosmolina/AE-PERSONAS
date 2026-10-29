package com.keralty.aepersonas.viewmodel.afiliaciones.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.afiliaciones.ds.DSAfiliaciones;

public class PIUAfiliacionesResponse extends QueryResponse {

    private List<DSAfiliaciones> results;

    public PIUAfiliacionesResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUAfiliacionesResponse(List<DSAfiliaciones> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSAfiliaciones> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSAfiliaciones> results) {
        this.results = results;
    }
}
