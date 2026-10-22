package com.keralty.aepersonas.viewmodel.mesadeapoyo.piu;

import com.keralty.aepersonas.viewmodel.PopulationRequestViewModel;
import com.keralty.aepersonas.viewmodel.QueryRequest;
import com.keralty.aepersonas.viewmodel.mesadeapoyo.filter.FMesaDeApoyo;

public class PIUMesaDeApoyoRequest extends PopulationRequestViewModel{

    private FMesaDeApoyo fMesaDeApoyo;
    
    public void setFMesaDeApoyo(FMesaDeApoyo fMesaDeApoyo) {
        this.fMesaDeApoyo = fMesaDeApoyo;
    }
    
    public FMesaDeApoyo getFMesaDeApoyo() {
        return fMesaDeApoyo;
    }

    @Override
    public QueryRequest buildQueryRequest() {
        QueryRequest queryRequest = super.buildQueryRequest();

        if (fMesaDeApoyo != null)
            queryRequest.addFilterRequest(fMesaDeApoyo.buildFilterRequest());
        return queryRequest;
    }
}
