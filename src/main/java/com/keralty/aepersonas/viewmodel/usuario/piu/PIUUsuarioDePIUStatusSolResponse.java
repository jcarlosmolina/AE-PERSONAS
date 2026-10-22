package com.keralty.aepersonas.viewmodel.usuario.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.usuario.ds.DSUsuarioPIUDeStatusSol;

public class PIUUsuarioDePIUStatusSolResponse extends QueryResponse {

    private List<DSUsuarioPIUDeStatusSol> results;

    public PIUUsuarioDePIUStatusSolResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUUsuarioDePIUStatusSolResponse(List<DSUsuarioPIUDeStatusSol> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSUsuarioPIUDeStatusSol> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSUsuarioPIUDeStatusSol> results) {
        this.results = results;
    }
}
