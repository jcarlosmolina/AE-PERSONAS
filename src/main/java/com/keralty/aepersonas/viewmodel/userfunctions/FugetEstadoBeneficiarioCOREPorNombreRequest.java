package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FugetEstadoBeneficiarioCOREPorNombreRequest {

    @JsonProperty("pfnombre")
    private String pfNombre;

    public FugetEstadoBeneficiarioCOREPorNombreRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public String getPfNombre() {
        return this.pfNombre;
    }
    
    public void setPfNombre(String pfNombre) {
        this.pfNombre = pfNombre;
    }
}
