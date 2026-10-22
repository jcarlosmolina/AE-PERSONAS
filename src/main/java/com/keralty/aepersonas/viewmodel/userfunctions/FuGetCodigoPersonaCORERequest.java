package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FuGetCodigoPersonaCORERequest {

    @JsonProperty("tipoid")
    private String tipoId;

    @JsonProperty("numid")
    private String numId;

    @JsonProperty("numsolicitud")
    private String numSolicitud;

    public FuGetCodigoPersonaCORERequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public String getTipoId() {
        return this.tipoId;
    }
    
    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }
    @JsonIgnore
    public String getNumId() {
        return this.numId;
    }
    
    public void setNumId(String numId) {
        this.numId = numId;
    }
    @JsonIgnore
    public String getNumSolicitud() {
        return this.numSolicitud;
    }
    
    public void setNumSolicitud(String numSolicitud) {
        this.numSolicitud = numSolicitud;
    }
}
