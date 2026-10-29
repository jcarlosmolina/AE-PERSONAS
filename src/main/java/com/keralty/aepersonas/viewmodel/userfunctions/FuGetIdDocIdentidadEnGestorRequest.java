package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FuGetIdDocIdentidadEnGestorRequest {

    @JsonProperty("pfnumidentificacion")
    private String pfNumIdentificacion;

    @JsonProperty("pfnumradicado")
    private String pfNumRadicado;

    public FuGetIdDocIdentidadEnGestorRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public String getPfNumIdentificacion() {
        return this.pfNumIdentificacion;
    }
    
    public void setPfNumIdentificacion(String pfNumIdentificacion) {
        this.pfNumIdentificacion = pfNumIdentificacion;
    }
    @JsonIgnore
    public String getPfNumRadicado() {
        return this.pfNumRadicado;
    }
    
    public void setPfNumRadicado(String pfNumRadicado) {
        this.pfNumRadicado = pfNumRadicado;
    }
}
