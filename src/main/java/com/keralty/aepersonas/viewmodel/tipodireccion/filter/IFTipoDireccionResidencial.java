package com.keralty.aepersonas.viewmodel.tipodireccion.filter;


import com.keralty.aepersonas.global.TipoDireccionConstants;
import com.keralty.aepersonas.viewmodel.FilterRequest;

public class IFTipoDireccionResidencial {

    public IFTipoDireccionResidencial() {
        // Default constructor
    }

    public FilterRequest buildFilterRequest() {
        FilterRequest filterRequest = new FilterRequest();
        filterRequest.setName(TipoDireccionConstants.FILTER_NAME_IFTIPODIRECCIONRESIDENCIAL);
        return filterRequest;
    }
}
