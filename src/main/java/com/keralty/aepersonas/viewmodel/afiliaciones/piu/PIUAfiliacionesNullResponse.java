package com.keralty.aepersonas.viewmodel.afiliaciones.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.afiliaciones.ds.DSAfiliacionesNull;

public class PIUAfiliacionesNullResponse extends QueryResponse {

    private List<DSAfiliacionesNull> results;

    public PIUAfiliacionesNullResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUAfiliacionesNullResponse(List<DSAfiliacionesNull> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSAfiliacionesNull> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSAfiliacionesNull> results) {
        this.results = results;
    }
}
