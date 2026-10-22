package com.keralty.aepersonas.viewmodel.usuario.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.usuario.ds.DSUsuarioPIUUsuariosCont;

public class PIUUsuariosDeContratoResponse extends QueryResponse {

    private List<DSUsuarioPIUUsuariosCont> results;

    public PIUUsuariosDeContratoResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUUsuariosDeContratoResponse(List<DSUsuarioPIUUsuariosCont> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSUsuarioPIUUsuariosCont> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSUsuarioPIUUsuariosCont> results) {
        this.results = results;
    }
}
