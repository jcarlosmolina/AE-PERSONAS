package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FuEnviarEmailRequest {

    @JsonProperty("pfu_asunto")
    private String pfuAsunto;

    @JsonProperty("pfu_destinatario")
    private String pfuDestinatario;

    @JsonProperty("pfu_emailconfirmacion")
    private String pfuEmailConfirmacion;

    @JsonProperty("pfu_cuerpo")
    private String pfuCuerpo;

    @JsonProperty("pfu_nombreadjunto")
    private String pfuNombreAdjunto;

    @JsonProperty("pfu_adjunto")
    private byte[] pfuAdjunto;

    @JsonProperty("pfu_numsolicitud")
    private String pfuNumSolicitud;

    public FuEnviarEmailRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public String getPfuAsunto() {
        return this.pfuAsunto;
    }
    
    public void setPfuAsunto(String pfuAsunto) {
        this.pfuAsunto = pfuAsunto;
    }
    @JsonIgnore
    public String getPfuDestinatario() {
        return this.pfuDestinatario;
    }
    
    public void setPfuDestinatario(String pfuDestinatario) {
        this.pfuDestinatario = pfuDestinatario;
    }
    @JsonIgnore
    public String getPfuEmailConfirmacion() {
        return this.pfuEmailConfirmacion;
    }
    
    public void setPfuEmailConfirmacion(String pfuEmailConfirmacion) {
        this.pfuEmailConfirmacion = pfuEmailConfirmacion;
    }
    @JsonIgnore
    public String getPfuCuerpo() {
        return this.pfuCuerpo;
    }
    
    public void setPfuCuerpo(String pfuCuerpo) {
        this.pfuCuerpo = pfuCuerpo;
    }
    @JsonIgnore
    public String getPfuNombreAdjunto() {
        return this.pfuNombreAdjunto;
    }
    
    public void setPfuNombreAdjunto(String pfuNombreAdjunto) {
        this.pfuNombreAdjunto = pfuNombreAdjunto;
    }
    @JsonIgnore
    public byte[] getPfuAdjunto() {
        return this.pfuAdjunto;
    }
    
    public void setPfuAdjunto(byte[] pfuAdjunto) {
        this.pfuAdjunto = pfuAdjunto;
    }
    @JsonIgnore
    public String getPfuNumSolicitud() {
        return this.pfuNumSolicitud;
    }
    
    public void setPfuNumSolicitud(String pfuNumSolicitud) {
        this.pfuNumSolicitud = pfuNumSolicitud;
    }
}
