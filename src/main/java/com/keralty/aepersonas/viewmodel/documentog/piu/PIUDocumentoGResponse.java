package com.keralty.aepersonas.viewmodel.documentog.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.documentog.ds.DSDocumentoGPIU;

public class PIUDocumentoGResponse extends QueryResponse {

    private List<DSDocumentoGPIU> results;

    public PIUDocumentoGResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUDocumentoGResponse(List<DSDocumentoGPIU> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSDocumentoGPIU> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSDocumentoGPIU> results) {
        this.results = results;
    }
}
