package com.keralty.aepersonas.viewmodel.parentesco.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.keralty.aepersonas.global.ParentescoConstants;
import com.keralty.aepersonas.viewmodel.FilterRequest;

public class IFParentescoNombreCorto {

    @JsonProperty("vnomcorto")
    private String vNomCorto;

    public IFParentescoNombreCorto() {
        // Default constructor
    }

    @JsonIgnore
    public String getVNomCorto() {
        return this.vNomCorto;
    }
    
    public void setVNomCorto(String vNomCorto) {
        this.vNomCorto = vNomCorto;
    }

    public FilterRequest buildFilterRequest() {
        FilterRequest filterRequest = new FilterRequest();
        filterRequest.setName(ParentescoConstants.FILTER_NAME_IFPARENTESCONOMBRECORTO);
        filterRequest.addFilterVariable(ParentescoConstants.VAR_NAME_IFPARENTESCONOMBRECORTO_VNOMCORTO, vNomCorto);
        return filterRequest;
    }
}
