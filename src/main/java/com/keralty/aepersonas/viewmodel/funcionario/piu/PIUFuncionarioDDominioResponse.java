package com.keralty.aepersonas.viewmodel.funcionario.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.funcionario.ds.DSFuncionarioDGrupo;

public class PIUFuncionarioDDominioResponse extends QueryResponse {

    private List<DSFuncionarioDGrupo> results;

    public PIUFuncionarioDDominioResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUFuncionarioDDominioResponse(List<DSFuncionarioDGrupo> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSFuncionarioDGrupo> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSFuncionarioDGrupo> results) {
        this.results = results;
    }
}
