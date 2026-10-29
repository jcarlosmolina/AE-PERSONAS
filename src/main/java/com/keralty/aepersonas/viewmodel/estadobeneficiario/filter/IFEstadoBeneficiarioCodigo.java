package com.keralty.aepersonas.viewmodel.estadobeneficiario.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.keralty.aepersonas.global.EstadoBeneficiarioConstants;
import com.keralty.aepersonas.viewmodel.FilterRequest;

public class IFEstadoBeneficiarioCodigo {

    @JsonProperty("v_codigo")
    private Long vCodigo;

    public IFEstadoBeneficiarioCodigo() {
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
        filterRequest.setName(EstadoBeneficiarioConstants.FILTER_NAME_IFESTADOBENEFICIARIOCODIGO);
        filterRequest.addFilterVariable(EstadoBeneficiarioConstants.VAR_NAME_IFESTADOBENEFICIARIOCODIGO_VCODIGO, vCodigo);
        return filterRequest;
    }
}
