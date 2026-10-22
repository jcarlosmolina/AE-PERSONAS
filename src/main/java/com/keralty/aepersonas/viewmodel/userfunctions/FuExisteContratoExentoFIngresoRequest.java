package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FuExisteContratoExentoFIngresoRequest {

    @JsonProperty("vfnumcontrato")
    private String vfNumContrato;

    public FuExisteContratoExentoFIngresoRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public String getVfNumContrato() {
        return this.vfNumContrato;
    }
    
    public void setVfNumContrato(String vfNumContrato) {
        this.vfNumContrato = vfNumContrato;
    }
}
