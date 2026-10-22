package com.keralty.aepersonas.viewmodel.anexoneo.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.anexoneo.ds.DSAnexoNeoNull;

public class PIUAnexoNeoNullResponse extends QueryResponse {

    private List<DSAnexoNeoNull> results;

    public PIUAnexoNeoNullResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUAnexoNeoNullResponse(List<DSAnexoNeoNull> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSAnexoNeoNull> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSAnexoNeoNull> results) {
        this.results = results;
    }
}
