package com.keralty.aepersonas.viewmodel.departamento.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.keralty.aepersonas.global.DepartamentoConstants;
import com.keralty.aepersonas.viewmodel.FilterRequest;

public class IFDepartamentoCodigo {

    @JsonProperty("v_codigo")
    private Long vCodigo;

    public IFDepartamentoCodigo() {
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
        filterRequest.setName(DepartamentoConstants.FILTER_NAME_IFDEPARTAMENTOCODIGO);
        filterRequest.addFilterVariable(DepartamentoConstants.VAR_NAME_IFDEPARTAMENTOCODIGO_VCODIGO, vCodigo);
        return filterRequest;
    }
}
