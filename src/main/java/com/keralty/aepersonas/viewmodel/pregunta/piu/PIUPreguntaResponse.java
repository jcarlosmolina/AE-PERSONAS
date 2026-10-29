package com.keralty.aepersonas.viewmodel.pregunta.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.pregunta.ds.AutoDS;

public class PIUPreguntaResponse extends QueryResponse {

    private List<AutoDS> results;

    public PIUPreguntaResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUPreguntaResponse(List<AutoDS> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<AutoDS> getResults() {
        return this.results;
    }
    
    public void setResults(List<AutoDS> results) {
        this.results = results;
    }
}
