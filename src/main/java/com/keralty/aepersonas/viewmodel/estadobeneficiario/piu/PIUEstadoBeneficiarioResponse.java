package com.keralty.aepersonas.viewmodel.estadobeneficiario.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.estadobeneficiario.ds.AutoDS;

public class PIUEstadoBeneficiarioResponse extends QueryResponse {

    private List<AutoDS> results;

    public PIUEstadoBeneficiarioResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUEstadoBeneficiarioResponse(List<AutoDS> results) {
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
