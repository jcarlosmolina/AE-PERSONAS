package com.keralty.aepersonas.viewmodel.funcionario.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.keralty.aepersonas.global.FuncionarioConstants;
import com.keralty.aepersonas.viewmodel.FilterRequest;

public class IFilterPorUsuarioLDAP {

    @JsonProperty("vfusuldap")
    private String vfUsuLDAP;

    public IFilterPorUsuarioLDAP() {
        // Default constructor
    }

    @JsonIgnore
    public String getVfUsuLDAP() {
        return this.vfUsuLDAP;
    }
    
    public void setVfUsuLDAP(String vfUsuLDAP) {
        this.vfUsuLDAP = vfUsuLDAP;
    }

    public FilterRequest buildFilterRequest() {
        FilterRequest filterRequest = new FilterRequest();
        filterRequest.setName(FuncionarioConstants.FILTER_NAME_IFILTERPORUSUARIOLDAP);
        filterRequest.addFilterVariable(FuncionarioConstants.VAR_NAME_IFILTERPORUSUARIOLDAP_VFUSULDAP, vfUsuLDAP);
        return filterRequest;
    }
}
