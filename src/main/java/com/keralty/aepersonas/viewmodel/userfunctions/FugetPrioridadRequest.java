package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FugetPrioridadRequest {

    @JsonProperty("pfestadosol")
    private Long pfEstadoSol;

    @JsonProperty("pfestadodoc")
    private Long pfEstadoDoc;

    public FugetPrioridadRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public Long getPfEstadoSol() {
        return this.pfEstadoSol;
    }
    
    public void setPfEstadoSol(Long pfEstadoSol) {
        this.pfEstadoSol = pfEstadoSol;
    }
    @JsonIgnore
    public Long getPfEstadoDoc() {
        return this.pfEstadoDoc;
    }
    
    public void setPfEstadoDoc(Long pfEstadoDoc) {
        this.pfEstadoDoc = pfEstadoDoc;
    }
}
