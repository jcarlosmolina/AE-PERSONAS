package com.keralty.aepersonas.viewmodel.preexistencia.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.preexistencia.ds.DSPreexistenciaNull;

public class PIUPreexistenciaNullResponse extends QueryResponse {

    private List<DSPreexistenciaNull> results;

    public PIUPreexistenciaNullResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUPreexistenciaNullResponse(List<DSPreexistenciaNull> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSPreexistenciaNull> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSPreexistenciaNull> results) {
        this.results = results;
    }
}
