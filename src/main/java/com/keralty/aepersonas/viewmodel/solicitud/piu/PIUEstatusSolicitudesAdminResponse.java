package com.keralty.aepersonas.viewmodel.solicitud.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aepersonas.viewmodel.QueryResponse;
import com.keralty.aepersonas.viewmodel.solicitud.ds.DSSolicitudPIUStatusAdmin;

public class PIUEstatusSolicitudesAdminResponse extends QueryResponse {

    private List<DSSolicitudPIUStatusAdmin> results;

    public PIUEstatusSolicitudesAdminResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUEstatusSolicitudesAdminResponse(List<DSSolicitudPIUStatusAdmin> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSSolicitudPIUStatusAdmin> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSSolicitudPIUStatusAdmin> results) {
        this.results = results;
    }
}
