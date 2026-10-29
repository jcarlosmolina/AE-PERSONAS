package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FugetEstadoContratoPorNombreRequest {

    @JsonProperty("pfnombre")
    private String pfNombre;

    public FugetEstadoContratoPorNombreRequest() {
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
