package com.keralty.aepersonas.viewmodel.municipio.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.keralty.aepersonas.global.MunicipioConstants;
import com.keralty.aepersonas.viewmodel.FilterRequest;

public class IFMunicipioCodigo {

    @JsonProperty("v_codigo")
    private Long vCodigo;

    public IFMunicipioCodigo() {
        // Default constructor
    }

    @JsonIgnore
    public Long getVCodigo() {
        return this.vCodigo;
    }
    
    public void setVCodigo(Long vCodigo) {
        this.vCodigo = vCodigo;
    }

    public FilterRequest buildFilterRequest() {
        FilterRequest filterRequest = new FilterRequest();
        filterRequest.setName(MunicipioConstants.FILTER_NAME_IFMUNICIPIOCODIGO);
        filterRequest.addFilterVariable(MunicipioConstants.VAR_NAME_IFMUNICIPIOCODIGO_VCODIGO, vCodigo);
        return filterRequest;
    }
}
