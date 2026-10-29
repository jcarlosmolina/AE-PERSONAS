package com.keralty.aepersonas.viewmodel.contratante.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.contratante.ds.DSContratanteNull;

public class PIUContratanteNullResponse extends QueryResponse {

    private List<DSContratanteNull> results;

    public PIUContratanteNullResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUContratanteNullResponse(List<DSContratanteNull> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSContratanteNull> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSContratanteNull> results) {
        this.results = results;
    }
}
