package com.keralty.aepersonas.viewmodel.obsestado.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.obsestado.ds.DSObsEstadoNull;

public class PIUObsEstadoNullResponse extends QueryResponse {

    private List<DSObsEstadoNull> results;

    public PIUObsEstadoNullResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUObsEstadoNullResponse(List<DSObsEstadoNull> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSObsEstadoNull> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSObsEstadoNull> results) {
        this.results = results;
    }
}
