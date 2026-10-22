package com.keralty.aepersonas.viewmodel.solicitud.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudPIUStatusAfil;

public class PIUEstatusSolicitudesAfilResponse extends QueryResponse {

    private List<DSSolicitudPIUStatusAfil> results;

    public PIUEstatusSolicitudesAfilResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUEstatusSolicitudesAfilResponse(List<DSSolicitudPIUStatusAfil> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSSolicitudPIUStatusAfil> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSSolicitudPIUStatusAfil> results) {
        this.results = results;
    }
}
