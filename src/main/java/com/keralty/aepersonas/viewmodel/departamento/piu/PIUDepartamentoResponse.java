package com.keralty.aepersonas.viewmodel.departamento.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.departamento.ds.AutoDS;

public class PIUDepartamentoResponse extends QueryResponse {

    private List<AutoDS> results;

    public PIUDepartamentoResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUDepartamentoResponse(List<AutoDS> results) {
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
