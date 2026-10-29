package com.keralty.aepersonas.viewmodel.solicitud.piu;

import com.keralty.aepersonas.viewmodel.PopulationRequestViewModel;
import com.keralty.aepersonas.viewmodel.QueryRequest;
import com.keralty.aepersonas.viewmodel.solicitud.filter.FSolicitudEstatusAreaMed1;
import com.keralty.aepersonas.viewmodel.solicitud.filter.FSolicitudEstatusAreaMed2;
import com.keralty.aepersonas.viewmodel.solicitud.filter.FSolicitudEstatusAreaMed3;

public class PIUEstatusSolicitudesAreaMedRequest extends PopulationRequestViewModel{

    private FSolicitudEstatusAreaMed1 fSolicitudEstatusAreaMed1;

    private FSolicitudEstatusAreaMed2 fSolicitudEstatusAreaMed2;

    private FSolicitudEstatusAreaMed3 fSolicitudEstatusAreaMed3;
    
    public void setFSolicitudEstatusAreaMed1(FSolicitudEstatusAreaMed1 fSolicitudEstatusAreaMed1) {
        this.fSolicitudEstatusAreaMed1 = fSolicitudEstatusAreaMed1;
    }
    
    public FSolicitudEstatusAreaMed1 getFSolicitudEstatusAreaMed1() {
        return fSolicitudEstatusAreaMed1;
    }
    
    public void setFSolicitudEstatusAreaMed2(FSolicitudEstatusAreaMed2 fSolicitudEstatusAreaMed2) {
        this.fSolicitudEstatusAreaMed2 = fSolicitudEstatusAreaMed2;
    }
    
    public FSolicitudEstatusAreaMed2 getFSolicitudEstatusAreaMed2() {
        return fSolicitudEstatusAreaMed2;
    }
    
    public void setFSolicitudEstatusAreaMed3(FSolicitudEstatusAreaMed3 fSolicitudEstatusAreaMed3) {
        this.fSolicitudEstatusAreaMed3 = fSolicitudEstatusAreaMed3;
    }
    
    public FSolicitudEstatusAreaMed3 getFSolicitudEstatusAreaMed3() {
        return fSolicitudEstatusAreaMed3;
    }

    @Override
    public QueryRequest buildQueryRequest() {
        QueryRequest queryRequest = super.buildQueryRequest();

        if (fSolicitudEstatusAreaMed1 != null)
            queryRequest.addFilterRequest(fSolicitudEstatusAreaMed1.buildFilterRequest());

        if (fSolicitudEstatusAreaMed2 != null)
            queryRequest.addFilterRequest(fSolicitudEstatusAreaMed2.buildFilterRequest());

        if (fSolicitudEstatusAreaMed3 != null)
            queryRequest.addFilterRequest(fSolicitudEstatusAreaMed3.buildFilterRequest());
        return queryRequest;
    }
}
