package com.keralty.aepersonas.viewmodel.seccionp.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.seccionp.ds.DSSeccionPNull;

public class PIUSeccionPNullResponse extends QueryResponse {

    private List<DSSeccionPNull> results;

    public PIUSeccionPNullResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUSeccionPNullResponse(List<DSSeccionPNull> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSSeccionPNull> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSSeccionPNull> results) {
        this.results = results;
    }
}
