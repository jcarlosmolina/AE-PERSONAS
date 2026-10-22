package com.keralty.aepersonas.viewmodel.usuario.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.usuario.ds.DSUsuarioNUll;

public class PIUUsuarioNullResponse extends QueryResponse {

    private List<DSUsuarioNUll> results;

    public PIUUsuarioNullResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUUsuarioNullResponse(List<DSUsuarioNUll> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSUsuarioNUll> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSUsuarioNUll> results) {
        this.results = results;
    }
}
