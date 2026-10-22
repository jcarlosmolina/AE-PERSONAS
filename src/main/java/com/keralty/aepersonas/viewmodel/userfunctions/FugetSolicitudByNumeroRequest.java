package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FugetSolicitudByNumeroRequest {

    @JsonProperty("pfunumsolicitud")
    private String pfuNumSolicitud;

    public FugetSolicitudByNumeroRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public String getPfuNumSolicitud() {
        return this.pfuNumSolicitud;
    }
    
    public void setPfuNumSolicitud(String pfuNumSolicitud) {
        this.pfuNumSolicitud = pfuNumSolicitud;
    }
}
