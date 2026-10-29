package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FuCheckRegimenSubsidiadoRequest {

    @JsonProperty("pftipoid")
    private String pfTipoId;

    @JsonProperty("pfnumid")
    private String pfNumId;

    @JsonProperty("pfsolicitud")
    private String pfSolicitud;

    @JsonProperty("pfesvoluntario")
    private Boolean pfEsVoluntario;

    public FuCheckRegimenSubsidiadoRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public String getPfTipoId() {
        return this.pfTipoId;
    }
    
    public void setPfTipoId(String pfTipoId) {
        this.pfTipoId = pfTipoId;
    }
    @JsonIgnore
    public String getPfNumId() {
        return this.pfNumId;
    }
    
    public void setPfNumId(String pfNumId) {
        this.pfNumId = pfNumId;
    }
    @JsonIgnore
    public String getPfSolicitud() {
        return this.pfSolicitud;
    }
    
    public void setPfSolicitud(String pfSolicitud) {
        this.pfSolicitud = pfSolicitud;
    }
    @JsonIgnore
    public Boolean getPfEsVoluntario() {
        return this.pfEsVoluntario;
    }
    
    public void setPfEsVoluntario(Boolean pfEsVoluntario) {
        this.pfEsVoluntario = pfEsVoluntario;
    }
}
