package com.keralty.aepersonas.viewmodel.solicitud.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudPIUConsultaRad;

public class PIUConsultarRadicadoResponse extends QueryResponse {

    private List<DSSolicitudPIUConsultaRad> results;

    public PIUConsultarRadicadoResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUConsultarRadicadoResponse(List<DSSolicitudPIUConsultaRad> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSSolicitudPIUConsultaRad> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSSolicitudPIUConsultaRad> results) {
        this.results = results;
    }
}
