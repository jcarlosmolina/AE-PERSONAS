package com.keralty.integraciones.coverage;

import com.fasterxml.jackson.annotation.*;

public class ConsultarBeneficiarioRequest {
    private String numContrato;
    private String numeroFamilia;
    private String codigoLegalProducto;
    private String codigoLegalPlan;
    private String numSolicitud;
    private String tipoIdentificacion;
    private String numeroIdentificacion;

    @JsonProperty("numContrato")
    public String getNumContrato() { return numContrato; }
    @JsonProperty("numContrato")
    public void setNumContrato(String value) { this.numContrato = value; }

    @JsonProperty("numeroFamilia")
    public String getNumeroFamilia() { return numeroFamilia; }
    @JsonProperty("numeroFamilia")
    public void setNumeroFamilia(String value) { this.numeroFamilia = value; }

    @JsonProperty("codigoLegalProducto")
    public String getCodigoLegalProducto() { return codigoLegalProducto; }
    @JsonProperty("codigoLegalProducto")
    public void setCodigoLegalProducto(String value) { this.codigoLegalProducto = value; }

    @JsonProperty("codigoLegalPlan")
    public String getCodigoLegalPlan() { return codigoLegalPlan; }
    @JsonProperty("codigoLegalPlan")
    public void setCodigoLegalPlan(String value) { this.codigoLegalPlan = value; }

    @JsonProperty("numSolicitud")
    public String getNumSolicitud() { return numSolicitud; }
    @JsonProperty("numSolicitud")
    public void setNumSolicitud(String value) { this.numSolicitud = value; }
    
    @JsonProperty("tipoIdentificacion")
	public String getTipoIdentificacion() { return tipoIdentificacion; }
    @JsonProperty("tipoIdentificacion")
	public void setTipoIdentificacion(String tipoIdentificacion) { this.tipoIdentificacion = tipoIdentificacion; }

    @JsonProperty("numeroIdentificacion")
	public String getNumeroIdentificacion() { return numeroIdentificacion; }
    @JsonProperty("numeroIdentificacion")
	public void setNumeroIdentificacion(String numeroIdentificacion) { this.numeroIdentificacion = numeroIdentificacion; }
    
    
}
