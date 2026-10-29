package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FuEnviarEmailDevDocRequest {

    @JsonProperty("pfasunto")
    private String pfAsunto;

    @JsonProperty("pfcuerpo")
    private String pfCuerpo;

    @JsonProperty("pfdestinatario")
    private String pfDestinatario;

    @JsonProperty("pfemailconf")
    private String pfEmailConf;

    @JsonProperty("ptobservaciones")
    private String ptObservaciones;

    @JsonProperty("pfnumsolicitud")
    private String pfNumSolicitud;

    public FuEnviarEmailDevDocRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public String getPfAsunto() {
        return this.pfAsunto;
    }
    
    public void setPfAsunto(String pfAsunto) {
        this.pfAsunto = pfAsunto;
    }
    @JsonIgnore
    public String getPfCuerpo() {
        return this.pfCuerpo;
    }
    
    public void setPfCuerpo(String pfCuerpo) {
        this.pfCuerpo = pfCuerpo;
    }
    @JsonIgnore
    public String getPfDestinatario() {
        return this.pfDestinatario;
    }
    
    public void setPfDestinatario(String pfDestinatario) {
        this.pfDestinatario = pfDestinatario;
    }
    @JsonIgnore
    public String getPfEmailConf() {
        return this.pfEmailConf;
    }
    
    public void setPfEmailConf(String pfEmailConf) {
        this.pfEmailConf = pfEmailConf;
    }
    @JsonIgnore
    public String getPtObservaciones() {
        return this.ptObservaciones;
    }
    
    public void setPtObservaciones(String ptObservaciones) {
        this.ptObservaciones = ptObservaciones;
    }
    @JsonIgnore
    public String getPfNumSolicitud() {
        return this.pfNumSolicitud;
    }
    
    public void setPfNumSolicitud(String pfNumSolicitud) {
        this.pfNumSolicitud = pfNumSolicitud;
    }
}
