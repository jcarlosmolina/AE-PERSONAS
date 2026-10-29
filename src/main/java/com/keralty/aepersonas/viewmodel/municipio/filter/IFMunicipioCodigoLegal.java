package com.keralty.aepersonas.viewmodel.municipio.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.keralty.aepersonas.global.MunicipioConstants;
import com.keralty.aepersonas.viewmodel.FilterRequest;

public class IFMunicipioCodigoLegal {

    @JsonProperty("vfcodlegal")
    private String vfCodLegal;

    public IFMunicipioCodigoLegal() {
        // Default constructor
    }

    @JsonIgnore
    public String getVfCodLegal() {
        return this.vfCodLegal;
    }
    
    public void setVfCodLegal(String vfCodLegal) {
        this.vfCodLegal = vfCodLegal;
    }

    public FilterRequest buildFilterRequest() {
        FilterRequest filterRequest = new FilterRequest();
        filterRequest.setName(MunicipioConstants.FILTER_NAME_IFMUNICIPIOCODIGOLEGAL);
        filterRequest.addFilterVariable(MunicipioConstants.VAR_NAME_IFMUNICIPIOCODIGOLEGAL_VFCODLEGAL, vfCodLegal);
        return filterRequest;
    }
}
