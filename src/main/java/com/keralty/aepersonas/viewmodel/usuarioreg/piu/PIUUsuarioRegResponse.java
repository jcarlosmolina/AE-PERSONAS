package com.keralty.aepersonas.viewmodel.usuarioreg.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.usuarioreg.ds.DSUsuarioRegPIU;

public class PIUUsuarioRegResponse extends QueryResponse {

    private List<DSUsuarioRegPIU> results;

    public PIUUsuarioRegResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUUsuarioRegResponse(List<DSUsuarioRegPIU> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSUsuarioRegPIU> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSUsuarioRegPIU> results) {
        this.results = results;
    }
}
