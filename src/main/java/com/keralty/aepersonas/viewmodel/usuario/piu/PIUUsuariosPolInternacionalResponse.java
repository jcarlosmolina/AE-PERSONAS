package com.keralty.aepersonas.viewmodel.usuario.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.usuario.ds.DSUsuarioPolizaInter;

public class PIUUsuariosPolInternacionalResponse extends QueryResponse {

    private List<DSUsuarioPolizaInter> results;

    public PIUUsuariosPolInternacionalResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUUsuariosPolInternacionalResponse(List<DSUsuarioPolizaInter> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSUsuarioPolizaInter> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSUsuarioPolizaInter> results) {
        this.results = results;
    }
}
