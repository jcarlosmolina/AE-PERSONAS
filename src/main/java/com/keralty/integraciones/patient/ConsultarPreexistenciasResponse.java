package com.keralty.integraciones.patient;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.integraciones.patient.condition.response.ConditionResponse;

public class ConsultarPreexistenciasResponse {
    private boolean exito = true;
    private String textoError = null;

    private ConditionResponse conditionResponse;

	@JsonProperty("exito")
    public boolean isExito() { return exito; }
    @JsonProperty("exito")
	public void setExito(boolean exito) { this.exito = exito; }
	
    @JsonProperty("textoError")
    public String getTextoError() { return textoError; }
    @JsonProperty("textoError")
	public void setTextoError(String textoError) { this.textoError = textoError; }
	
    @JsonProperty("conditionResponse")
    public ConditionResponse getConditionResponse() { return conditionResponse; }
    @JsonProperty("conditionResponse")
	public void setConditionResponse(ConditionResponse conditionResponse) { this.conditionResponse = conditionResponse; }
}
