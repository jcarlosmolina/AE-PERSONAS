package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FuBuscarDocGestorNumIdRequest {

    @JsonProperty("pfu_numidentificacion")
    private String pfuNumIdentificacion;

    @JsonProperty("pfu_numsolicitud")
    private String pfuNumSolicitud;

    public FuBuscarDocGestorNumIdRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public String getPfuNumIdentificacion() {
        return this.pfuNumIdentificacion;
    }
    
    public void setPfuNumIdentificacion(String pfuNumIdentificacion) {
        this.pfuNumIdentificacion = pfuNumIdentificacion;
    }
    @JsonIgnore
    public String getPfuNumSolicitud() {
        return this.pfuNumSolicitud;
    }
    
    public void setPfuNumSolicitud(String pfuNumSolicitud) {
        this.pfuNumSolicitud = pfuNumSolicitud;
    }
}
