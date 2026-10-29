package com.keralty.aepersonas.viewmodel.preexistencia.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.preexistencia.ds.DSPreexistenciaPIU;

public class PIUPreexistenciaResponse extends QueryResponse {

    private List<DSPreexistenciaPIU> results;

    public PIUPreexistenciaResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUPreexistenciaResponse(List<DSPreexistenciaPIU> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSPreexistenciaPIU> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSPreexistenciaPIU> results) {
        this.results = results;
    }
}
