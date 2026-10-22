package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FuBuscarDocGestorSolicitudRequest {

    @JsonProperty("pfu_numsolicitud")
    private String pfuNumSolicitud;

    @JsonProperty("pfu_numidentidad")
    private String pfuNumIdentidad;

    public FuBuscarDocGestorSolicitudRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public String getPfuNumSolicitud() {
        return this.pfuNumSolicitud;
    }
    
    public void setPfuNumSolicitud(String pfuNumSolicitud) {
        this.pfuNumSolicitud = pfuNumSolicitud;
    }
    @JsonIgnore
    public String getPfuNumIdentidad() {
        return this.pfuNumIdentidad;
    }
    
    public void setPfuNumIdentidad(String pfuNumIdentidad) {
        this.pfuNumIdentidad = pfuNumIdentidad;
    }
}
