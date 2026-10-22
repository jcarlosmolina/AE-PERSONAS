package com.keralty.aepersonas.viewmodel.solicitud.piu;

import com.keralty.aepersonas.viewmodel.PopulationRequestViewModel;
import com.keralty.aepersonas.viewmodel.QueryRequest;
import com.keralty.aepersonas.viewmodel.solicitud.filter.FSolicitudStatusAfil1;
import com.keralty.aepersonas.viewmodel.solicitud.filter.FSolicitudStatusAfil2;
import com.keralty.aepersonas.viewmodel.solicitud.filter.FSolicitudStatusAfil3;

public class PIUEstatusSolicitudesAfilRequest extends PopulationRequestViewModel{

    private FSolicitudStatusAfil1 fSolicitudStatusAfil1;

    private FSolicitudStatusAfil2 fSolicitudStatusAfil2;

    private FSolicitudStatusAfil3 fSolicitudStatusAfil3;
    
    public void setFSolicitudStatusAfil1(FSolicitudStatusAfil1 fSolicitudStatusAfil1) {
        this.fSolicitudStatusAfil1 = fSolicitudStatusAfil1;
    }
    
    public FSolicitudStatusAfil1 getFSolicitudStatusAfil1() {
        return fSolicitudStatusAfil1;
    }
    
    public void setFSolicitudStatusAfil2(FSolicitudStatusAfil2 fSolicitudStatusAfil2) {
        this.fSolicitudStatusAfil2 = fSolicitudStatusAfil2;
    }
    
    public FSolicitudStatusAfil2 getFSolicitudStatusAfil2() {
        return fSolicitudStatusAfil2;
    }
    
    public void setFSolicitudStatusAfil3(FSolicitudStatusAfil3 fSolicitudStatusAfil3) {
        this.fSolicitudStatusAfil3 = fSolicitudStatusAfil3;
    }
    
    public FSolicitudStatusAfil3 getFSolicitudStatusAfil3() {
        return fSolicitudStatusAfil3;
    }

    @Override
    public QueryRequest buildQueryRequest() {
        QueryRequest queryRequest = super.buildQueryRequest();

        if (fSolicitudStatusAfil1 != null)
            queryRequest.addFilterRequest(fSolicitudStatusAfil1.buildFilterRequest());

        if (fSolicitudStatusAfil2 != null)
            queryRequest.addFilterRequest(fSolicitudStatusAfil2.buildFilterRequest());

        if (fSolicitudStatusAfil3 != null)
            queryRequest.addFilterRequest(fSolicitudStatusAfil3.buildFilterRequest());
        return queryRequest;
    }
}
