package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FuEstadoSolicitudRequest {

    @JsonProperty("pfestadosol")
    private Long pfEstadoSol;

    public FuEstadoSolicitudRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public Long getPfEstadoSol() {
        return this.pfEstadoSol;
    }
    
    public void setPfEstadoSol(Long pfEstadoSol) {
        this.pfEstadoSol = pfEstadoSol;
    }
}
