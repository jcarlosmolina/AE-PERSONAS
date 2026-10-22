package com.keralty.aepersonas.viewmodel.obsestado.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.obsestado.ds.DSObsEstadoPIU;

public class PIUObsEstadoResponse extends QueryResponse {

    private List<DSObsEstadoPIU> results;

    public PIUObsEstadoResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUObsEstadoResponse(List<DSObsEstadoPIU> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSObsEstadoPIU> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSObsEstadoPIU> results) {
        this.results = results;
    }
}
