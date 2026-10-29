package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FugetSolicitudNovedadByNumRadicadoRequest {

    @JsonProperty("pfnumradicado")
    private String pfNumRadicado;

    public FugetSolicitudNovedadByNumRadicadoRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public String getPfNumRadicado() {
        return this.pfNumRadicado;
    }
    
    public void setPfNumRadicado(String pfNumRadicado) {
        this.pfNumRadicado = pfNumRadicado;
    }
}
