package com.keralty.aepersonas.viewmodel.funcionario.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.funcionario.ds.DSAgentePIU;

public class PIUFuncionarioObsResponse extends QueryResponse {

    private List<DSAgentePIU> results;

    public PIUFuncionarioObsResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUFuncionarioObsResponse(List<DSAgentePIU> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSAgentePIU> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSAgentePIU> results) {
        this.results = results;
    }
}
