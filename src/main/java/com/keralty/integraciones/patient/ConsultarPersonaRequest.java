package com.keralty.integraciones.patient;

import com.fasterxml.jackson.annotation.*;

public class ConsultarPersonaRequest {
    private String tipoIdentificacion;
    private String numeroIdentificacion;
    private String numSolicitud;
    private boolean soloDatosBasicos = false;
    
	@JsonProperty("tipoIdentificacion")
    public String getTipoIdentificacion() { return tipoIdentificacion; }
	@JsonProperty("tipoIdentificacion")
	public void setTipoIdentificacion(String tipoIdentificacion) { this.tipoIdentificacion = tipoIdentificacion; }

	@JsonProperty("numeroIdentificacion")
	public String getNumeroIdentificacion() { return numeroIdentificacion; }
	@JsonProperty("numeroIdentificacion")
	public void setNumeroIdentificacion(String numeroIdentificacion) { this.numeroIdentificacion = numeroIdentificacion; }

	@JsonProperty("numSolicitud")
    public String getNumSolicitud() { return numSolicitud; }
    @JsonProperty("numSolicitud")
    public void setNumSolicitud(String value) { this.numSolicitud = value; }
	
	@JsonProperty("soloDatosBasicos")
    public boolean isSoloDatosBasicos() { return soloDatosBasicos; }
	@JsonProperty("soloDatosBasicos")
	public void setSoloDatosBasicos(boolean soloDatosBasicos) { this.soloDatosBasicos = soloDatosBasicos; }
    
    
}
