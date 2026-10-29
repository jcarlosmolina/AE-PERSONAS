package com.keralty.aepersonas.viewmodel.institucionmatneo.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.institucionmatneo.ds.DSInstitucionMatNeo;

public class PIUInstitucionMatNeoResponse extends QueryResponse {

    private List<DSInstitucionMatNeo> results;

    public PIUInstitucionMatNeoResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUInstitucionMatNeoResponse(List<DSInstitucionMatNeo> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSInstitucionMatNeo> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSInstitucionMatNeo> results) {
        this.results = results;
    }
}
