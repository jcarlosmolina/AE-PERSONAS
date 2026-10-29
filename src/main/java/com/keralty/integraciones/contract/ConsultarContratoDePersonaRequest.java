package com.keralty.integraciones.contract;

import java.sql.Date;

import com.fasterxml.jackson.annotation.*;

public class ConsultarContratoDePersonaRequest {
    private String tipoIdentificacion;
    private String numeroIdentificacion;
    private Date fecha;
    private String numSolicitud;

    
    @JsonProperty("tipoIdentificacion")
    public String getTipoIdentificacion() { return tipoIdentificacion; }
    @JsonProperty("tipoIdentificacion")
	public void setTipoIdentificacion(String tipoIdentificacion) { this.tipoIdentificacion = tipoIdentificacion; }

    @JsonProperty("numeroIdentificacion")
	public String getNumeroIdentificacion() { return numeroIdentificacion; }
    @JsonProperty("numeroIdentificacion")
	public void setNumeroIdentificacion(String numeroIdentificacion) { this.numeroIdentificacion = numeroIdentificacion; }

    @JsonProperty("fecha")
	public Date getFecha() { return fecha; }
    @JsonProperty("fecha")
	public void setFecha(Date fecha) { this.fecha = fecha; }
	
	@JsonProperty("numSolicitud")
    public String getNumSolicitud() { return numSolicitud; }
    @JsonProperty("numSolicitud")
    public void setNumSolicitud(String value) { this.numSolicitud = value; }
}
