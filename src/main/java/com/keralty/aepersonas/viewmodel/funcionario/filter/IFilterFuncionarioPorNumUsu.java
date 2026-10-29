package com.keralty.aepersonas.viewmodel.funcionario.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.keralty.aepersonas.global.FuncionarioConstants;
import com.keralty.aepersonas.viewmodel.FilterRequest;

public class IFilterFuncionarioPorNumUsu {

    @JsonProperty("vfnumusu")
    private String vfNumUsu;

    public IFilterFuncionarioPorNumUsu() {
        // Default constructor
    }

    @JsonIgnore
    public String getVfNumUsu() {
        return this.vfNumUsu;
    }
    
    public void setVfNumUsu(String vfNumUsu) {
        this.vfNumUsu = vfNumUsu;
    }

    public FilterRequest buildFilterRequest() {
        FilterRequest filterRequest = new FilterRequest();
        filterRequest.setName(FuncionarioConstants.FILTER_NAME_IFILTERFUNCIONARIOPORNUMUSU);
        filterRequest.addFilterVariable(FuncionarioConstants.VAR_NAME_IFILTERFUNCIONARIOPORNUMUSU_VFNUMUSU, vfNumUsu);
        return filterRequest;
    }
}
