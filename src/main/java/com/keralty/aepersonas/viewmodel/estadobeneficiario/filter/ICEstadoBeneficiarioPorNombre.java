package com.keralty.aepersonas.viewmodel.estadobeneficiario.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.keralty.aepersonas.global.EstadoBeneficiarioConstants;
import com.keralty.aepersonas.viewmodel.FilterRequest;

public class ICEstadoBeneficiarioPorNombre {

    @JsonProperty("vnombre")
    private String vNombre;

    public ICEstadoBeneficiarioPorNombre() {
        // Default constructor
    }

    @JsonIgnore
    public String getVNombre() {
        return this.vNombre;
    }
    
    public void setVNombre(String vNombre) {
        this.vNombre = vNombre;
    }

    public FilterRequest buildFilterRequest() {
        FilterRequest filterRequest = new FilterRequest();
        filterRequest.setName(EstadoBeneficiarioConstants.FILTER_NAME_ICESTADOBENEFICIARIOPORNOMBRE);
        filterRequest.addFilterVariable(EstadoBeneficiarioConstants.VAR_NAME_ICESTADOBENEFICIARIOPORNOMBRE_VNOMBRE, vNombre);
        return filterRequest;
    }
}
