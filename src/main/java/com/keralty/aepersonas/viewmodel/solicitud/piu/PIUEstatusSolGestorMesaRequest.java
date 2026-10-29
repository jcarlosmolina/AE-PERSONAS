package com.keralty.aepersonas.viewmodel.solicitud.piu;

import com.keralty.aepersonas.viewmodel.PopulationRequestViewModel;
import com.keralty.aepersonas.viewmodel.QueryRequest;
import com.keralty.aepersonas.viewmodel.solicitud.filter.FSolicitudStatusEstHomo;

public class PIUEstatusSolGestorMesaRequest extends PopulationRequestViewModel{

    private FSolicitudStatusEstHomo fSolicitudStatusEstHomo;
    
    public void setFSolicitudStatusEstHomo(FSolicitudStatusEstHomo fSolicitudStatusEstHomo) {
        this.fSolicitudStatusEstHomo = fSolicitudStatusEstHomo;
    }
    
    public FSolicitudStatusEstHomo getFSolicitudStatusEstHomo() {
        return fSolicitudStatusEstHomo;
    }

    @Override
    public QueryRequest buildQueryRequest() {
        QueryRequest queryRequest = super.buildQueryRequest();

        if (fSolicitudStatusEstHomo != null)
            queryRequest.addFilterRequest(fSolicitudStatusEstHomo.buildFilterRequest());
        return queryRequest;
    }
}
