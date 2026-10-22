package com.keralty.aepersonas.viewmodel.direccion.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.direccion.ds.DSDireccionNull;

public class PIUDireccionNullResponse extends QueryResponse {

    private List<DSDireccionNull> results;

    public PIUDireccionNullResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUDireccionNullResponse(List<DSDireccionNull> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSDireccionNull> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSDireccionNull> results) {
        this.results = results;
    }
}
