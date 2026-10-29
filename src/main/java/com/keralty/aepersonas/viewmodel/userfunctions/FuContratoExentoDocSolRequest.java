package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FuContratoExentoDocSolRequest {

    @JsonProperty("pfnumcontrato")
    private String pfNumContrato;

    public FuContratoExentoDocSolRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public String getPfNumContrato() {
        return this.pfNumContrato;
    }
    
    public void setPfNumContrato(String pfNumContrato) {
        this.pfNumContrato = pfNumContrato;
    }
}
