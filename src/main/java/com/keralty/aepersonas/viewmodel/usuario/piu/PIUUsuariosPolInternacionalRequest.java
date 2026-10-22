package com.keralty.aepersonas.viewmodel.usuario.piu;

import com.keralty.aepersonas.viewmodel.PopulationRequestViewModel;
import com.keralty.aepersonas.viewmodel.QueryRequest;
import com.keralty.aepersonas.viewmodel.usuario.filter.FUsuariosPolizaInter;

public class PIUUsuariosPolInternacionalRequest extends PopulationRequestViewModel{

    private FUsuariosPolizaInter fUsuariosPolizaInter;
    
    public void setFUsuariosPolizaInter(FUsuariosPolizaInter fUsuariosPolizaInter) {
        this.fUsuariosPolizaInter = fUsuariosPolizaInter;
    }
    
    public FUsuariosPolizaInter getFUsuariosPolizaInter() {
        return fUsuariosPolizaInter;
    }

    @Override
    public QueryRequest buildQueryRequest() {
        QueryRequest queryRequest = super.buildQueryRequest();

        if (fUsuariosPolizaInter != null)
            queryRequest.addFilterRequest(fUsuariosPolizaInter.buildFilterRequest());
        return queryRequest;
    }
}
