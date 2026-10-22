package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FuGetFechaFinVigenciaUsuarioRequest {

    @JsonProperty("pftipoidentificacion")
    private String pfTipoIdentificacion;

    @JsonProperty("pfnumidentificacion")
    private String pfNumIdentificacion;

    @JsonProperty("pfnumsolicitud")
    private String pfNumSolicitud;

    public FuGetFechaFinVigenciaUsuarioRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public String getPfTipoIdentificacion() {
        return this.pfTipoIdentificacion;
    }
    
    public void setPfTipoIdentificacion(String pfTipoIdentificacion) {
        this.pfTipoIdentificacion = pfTipoIdentificacion;
    }
    @JsonIgnore
    public String getPfNumIdentificacion() {
        return this.pfNumIdentificacion;
    }
    
    public void setPfNumIdentificacion(String pfNumIdentificacion) {
        this.pfNumIdentificacion = pfNumIdentificacion;
    }
    @JsonIgnore
    public String getPfNumSolicitud() {
        return this.pfNumSolicitud;
    }
    
    public void setPfNumSolicitud(String pfNumSolicitud) {
        this.pfNumSolicitud = pfNumSolicitud;
    }
}
