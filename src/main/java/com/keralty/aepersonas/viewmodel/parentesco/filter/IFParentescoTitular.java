package com.keralty.aepersonas.viewmodel.parentesco.filter;


import com.keralty.aepersonas.global.ParentescoConstants;
import com.keralty.aepersonas.viewmodel.FilterRequest;

public class IFParentescoTitular {

    public IFParentescoTitular() {
        // Default constructor
    }

    public FilterRequest buildFilterRequest() {
        FilterRequest filterRequest = new FilterRequest();
        filterRequest.setName(ParentescoConstants.FILTER_NAME_IFPARENTESCOTITULAR);
        return filterRequest;
    }
}
