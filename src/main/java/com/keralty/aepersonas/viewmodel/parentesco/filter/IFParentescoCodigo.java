package com.keralty.aepersonas.viewmodel.parentesco.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.keralty.aepersonas.global.ParentescoConstants;
import com.keralty.aepersonas.viewmodel.FilterRequest;

public class IFParentescoCodigo {

    @JsonProperty("v_codigo")
    private Long vCodigo;

    public IFParentescoCodigo() {
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
        filterRequest.setName(ParentescoConstants.FILTER_NAME_IFPARENTESCOCODIGO);
        filterRequest.addFilterVariable(ParentescoConstants.VAR_NAME_IFPARENTESCOCODIGO_VCODIGO, vCodigo);
        return filterRequest;
    }
}
