package com.keralty.aepersonas.viewmodel.persona.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.viewmodel.FilterRequest;

public class IFPersonaCodigoCORE {

    @JsonProperty("v_codigo")
    private Long vCodigo;

    public IFPersonaCodigoCORE() {
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
        filterRequest.setName(PersonaConstants.FILTER_NAME_IFPERSONACODIGOCORE);
        filterRequest.addFilterVariable(PersonaConstants.VAR_NAME_IFPERSONACODIGOCORE_VCODIGO, vCodigo);
        return filterRequest;
    }
}
