package com.keralty.aepersonas.viewmodel.preguntap.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.preguntap.ds.DSPreguntaPNull;

public class PIUPreguntaPNullResponse extends QueryResponse {

    private List<DSPreguntaPNull> results;

    public PIUPreguntaPNullResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUPreguntaPNullResponse(List<DSPreguntaPNull> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSPreguntaPNull> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSPreguntaPNull> results) {
        this.results = results;
    }
}
