package com.keralty.aepersonas.viewmodel.solicitud.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudPIUStatusAsesor;

public class PIUEstatusSolicitudesAsesorResponse extends QueryResponse {

    private List<DSSolicitudPIUStatusAsesor> results;

    public PIUEstatusSolicitudesAsesorResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUEstatusSolicitudesAsesorResponse(List<DSSolicitudPIUStatusAsesor> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSSolicitudPIUStatusAsesor> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSSolicitudPIUStatusAsesor> results) {
        this.results = results;
    }
}
