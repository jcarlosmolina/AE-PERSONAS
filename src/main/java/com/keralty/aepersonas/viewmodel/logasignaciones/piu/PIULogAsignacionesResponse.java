package com.keralty.aepersonas.viewmodel.logasignaciones.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.logasignaciones.ds.DSLogAsignaciones;

public class PIULogAsignacionesResponse extends QueryResponse {

    private List<DSLogAsignaciones> results;

    public PIULogAsignacionesResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIULogAsignacionesResponse(List<DSLogAsignaciones> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSLogAsignaciones> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSLogAsignaciones> results) {
        this.results = results;
    }
}
