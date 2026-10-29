package com.keralty.aepersonas.viewmodel.tipodireccion.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.keralty.aepersonas.global.TipoDireccionConstants;
import com.keralty.aepersonas.viewmodel.FilterRequest;

public class IFTipoDireccionCodigo {

    @JsonProperty("v_codigo")
    private Long vCodigo;

    public IFTipoDireccionCodigo() {
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
        filterRequest.setName(TipoDireccionConstants.FILTER_NAME_IFTIPODIRECCIONCODIGO);
        filterRequest.addFilterVariable(TipoDireccionConstants.VAR_NAME_IFTIPODIRECCIONCODIGO_VCODIGO, vCodigo);
        return filterRequest;
    }
}
