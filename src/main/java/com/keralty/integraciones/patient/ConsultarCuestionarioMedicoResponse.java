package com.keralty.integraciones.patient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.integraciones.patient.questionnaire.response.PatientQuestionnaireResponse;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ConsultarCuestionarioMedicoResponse {
    private boolean exito = true;
    private String textoError = null;

    private PatientQuestionnaireResponse questionnaireResponse;

	@JsonProperty("exito")
    public boolean isExito() { return exito; }
    @JsonProperty("exito")
	public void setExito(boolean exito) { this.exito = exito; }
	
    @JsonProperty("textoError")
    public String getTextoError() { return textoError; }
    @JsonProperty("textoError")
	public void setTextoError(String textoError) { this.textoError = textoError; }
	
    @JsonProperty("questionnaireResponse")
    public PatientQuestionnaireResponse getQuestionnaireResponse() { return questionnaireResponse; }
    @JsonProperty("questionnaireResponse")
    public void setQuestionnaireResponse(PatientQuestionnaireResponse questionnaireResponse) { this.questionnaireResponse = questionnaireResponse; }
    
    
}
