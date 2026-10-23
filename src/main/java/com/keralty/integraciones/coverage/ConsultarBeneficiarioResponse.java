package com.keralty.integraciones.coverage;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.integraciones.contract.cover.response.CoverFamilyResponse;
import com.keralty.integraciones.contract.cover.response.CoverResponse;
import com.keralty.integraciones.coverage.coverageheader.response.CoverageHeaderResponse;

public class ConsultarBeneficiarioResponse {
    private CoverResponse coverResponse;
    private CoverageHeaderResponse coverageHeaderResponse;
    private boolean exito = true;
    private String textoError = null;

    @JsonProperty("coverageHeaderResponse")
    public CoverageHeaderResponse getCoverageHeaderResponse() { return coverageHeaderResponse; }
    @JsonProperty("coverageHeaderResponse")
	public void setCoverageHeaderResponse(CoverageHeaderResponse coverageHeaderResponse) { this.coverageHeaderResponse = coverageHeaderResponse; }

    @JsonProperty("exito")
    public boolean isExito() { return exito; }
    @JsonProperty("exito")
	public void setExito(boolean exito) { this.exito = exito; }
	
    @JsonProperty("textoError")
    public String getTextoError() { return textoError; }
    @JsonProperty("textoError")
	public void setTextoError(String textoError) { this.textoError = textoError; }

    @JsonProperty("coverResponse")
    public CoverResponse getCoverResponse() { return coverResponse; }
    @JsonProperty("coverResponse")
	public void setCoverResponse(CoverResponse coverResponse) { this.coverResponse = coverResponse; }
	
	/**
     * Comprueba si se ha producido algún error en la respuesta de BH y ajusta los valores de las variables 
     */
    public void checkError() {
    	
	}
    
    @JsonIgnore
    public String getTipoRegimen() {
    	// Contract	cover	
    	// coverFamilyResponse . Contract . Scope	
    	// Sera "CONTRIBUTIVO", si el valor es "CONTRIBUTIVO" 
    	//    del contrato que sea del producto 30
    	
    	
    	// Buscamos el contrato con el producto 30
    	if (getCoverResponse() != null && getCoverResponse().getCoverFamilyResponse() != null) {
    		for (CoverFamilyResponse ctr: getCoverResponse().getCoverFamilyResponse()) {
    			if ("30".equalsIgnoreCase(ctr.getIdentifierPorType(ctr.getInsurancePlan().getIdentifier(), "PRODUCTO"))) {
    				if ("CONTRIBUTIVO".equalsIgnoreCase( ctr.getContract().getScope())) {
    					return "C";
    				} else {
    					return "S";
    				}
    			}
    		}
    	}

    	return null;
    }    
}
