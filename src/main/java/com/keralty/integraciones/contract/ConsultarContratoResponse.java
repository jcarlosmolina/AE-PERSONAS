package com.keralty.integraciones.contract;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.integraciones.contract.cover.response.CoverFamilyResponse;
import com.keralty.integraciones.contract.cover.response.CoverResponse;
import com.keralty.integraciones.contract.cover.response.Identifier;
import com.keralty.integraciones.contract.getcontractparty.response.GetContractPartyResponse;

public class ConsultarContratoResponse {
    private CoverResponse coverResponse;
    private GetContractPartyResponse getContractPartyResponse;
    private boolean exito = true;;
    private String textoError = null;
    private boolean tieneEPSSanitas = false;

    @JsonProperty("coverResponse")
    public CoverResponse getCoverResponse() { return coverResponse; }
    @JsonProperty("coverResponse")
	public void setCoverResponse(CoverResponse coverResponse) { this.coverResponse = coverResponse; }

    @JsonProperty("exito")
    public boolean isExito() { return exito; }
    @JsonProperty("exito")
	public void setExito(boolean exito) { this.exito = exito; }
	
    @JsonProperty("textoError")
    public String getTextoError() { return textoError; }
    @JsonProperty("textoError")
	public void setTextoError(String textoError) { this.textoError = textoError; }

    
    @JsonProperty("tieneEPSSanitas")
    public boolean isTieneEPSSanitas() { return tieneEPSSanitas; }
    @JsonProperty("tieneEPSSanitas")
	public void setTieneEPSSanitas(boolean tieneEPSSanitas) { this.tieneEPSSanitas = tieneEPSSanitas; }
	
    	
    @JsonProperty("getContractPartyResponse")
	public GetContractPartyResponse getGetContractPartyResponse() { return getContractPartyResponse; }
    @JsonProperty("getContractPartyResponse")
	public void setGetContractPartyResponse(GetContractPartyResponse getContractPartyResponse) { this.getContractPartyResponse = getContractPartyResponse; }
	

	/**
     * Comprueba si se ha producido algún error en la respuesta de BH y ajusta los valores de las variables 
     */
    public void checkError() {
    	if (getCoverResponse() != null && 
    		getCoverResponse().getCode() != null && !getCoverResponse().getCode().isEmpty()) {
    		setExito(false);
    		org.slf4j.LoggerFactory.getLogger(this.getClass().getName()).error("Contract cover. " + getCoverResponse().getCode());
    		anyadirTextoError("CTR-0100");    		
    		if (getCoverResponse().getValue() != null && !getCoverResponse().getValue().isEmpty()) {
    			org.slf4j.LoggerFactory.getLogger(this.getClass().getName()).error("Contract cover. " + getCoverResponse().getValue());
    		}
    	}
	}
    
    private void anyadirTextoError(String texto) {
    	if (texto == null || texto.isEmpty()) {
    		return;
    	}
    	if (getTextoError() == null || getTextoError().isEmpty()) {
    		setTextoError(texto);
    	} else {
    		setTextoError(getTextoError() + " " + texto);
    	}
    }
    
    public static String getValueIdentifierPorClave(List<Identifier> lista, String valorClave) {
    	
    	if (lista == null) {
    		return "";
    	}
    	for (Identifier ident : lista) {
    		if (ident.getType().equalsIgnoreCase(valorClave)) {
    			return ident.getValue();
    		}
    	}
    	
    	return "";
    }

    /**
     * Devuevle True si entre los contratos de la persona aparece uno del producto 30, plan 10
     * que esté vigente a la fecha 
     * @return
     */
    @JsonIgnore
    public void calcularTieneEPSSanitas(Date aFecha) {
    	
//    	Tiene EPS Sanitas
//    	Respuesta Keralty:  NO ES UN CAMPO, es una logica que deben desarrollar según requerimiento que plantean.
//    	   * Deben buscar en contract.cover producto 30, plan 10. 
//    	   * Saben que esta vigente según fechas de vigencia.
    	Date fecha = aFecha != null ? aFecha : new java.sql.Date(System.currentTimeMillis());
    	
    	if (getCoverResponse() != null && getCoverResponse().getCoverFamilyResponse() != null) {
    		for(CoverFamilyResponse cover : getCoverResponse().getCoverFamilyResponse()) {
    			// Vemos si es del producto 30 y del Plan 10 
    			if (cover.getInsurancePlan() != null && "30".equalsIgnoreCase(getValueIdentifierPorClave(cover.getInsurancePlan().getIdentifier(), "CODIGO_PRODUCTO")) && 
    				cover.getContract() != null && "10".equalsIgnoreCase(getValueIdentifierPorClave(cover.getContract().getIdentifier(), "PLAN")) &&
    				cover.getContract().getApplies() != null &&
					cover.getContract().getApplies().getStart() != null &&
					cover.getContract().getApplies().getStart().before(fecha) &&
					(cover.getContract().getApplies().getEnd() == null ||
					 cover.getContract().getApplies().getEnd().after(fecha)) ) {
    				setTieneEPSSanitas(true);
    				return;
				}
    		}
    	}
    	
    	setTieneEPSSanitas(false);
    }
    
    @JsonIgnore
    public CoverFamilyResponse getInfoContrato() {
    	if (getCoverResponse() != null && getCoverResponse().getCoverFamilyResponse() != null && 
    			!getCoverResponse().getCoverFamilyResponse().isEmpty()) {
    		return getCoverResponse().getCoverFamilyResponse().get(0);
    	}
    	if (getCoverResponse() != null && getCoverResponse().getCoverResponse() != null && 
    			!getCoverResponse().getCoverResponse().isEmpty()) {
    		return getCoverResponse().getCoverResponse().get(0);
    	}
    	return null;
    }
    
}
