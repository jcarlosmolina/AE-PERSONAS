package com.keralty.integraciones.contract.cover.response;

import java.util.List;
import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CoverFamilyResponse {
    private InsurancePlan insurancePlan;
    private Contract contract;

    @JsonProperty("insurancePlan")
    public InsurancePlan getInsurancePlan() { return insurancePlan; }
    @JsonProperty("insurancePlan")
    public void setInsurancePlan(InsurancePlan value) { this.insurancePlan = value; }

    @JsonProperty("contract")
    public Contract getContract() { return contract; }
    @JsonProperty("contract")
    public void setContract(Contract value) { this.contract = value; }
    @JsonIgnore()
    public String getIdentifierPorType(List<Identifier> listIdentifier, String type) {
    	if (listIdentifier != null && type != null) {
	    	for (Identifier ident : listIdentifier) {
				if (ident.getType().equalsIgnoreCase(type)) {
					return ident.getValue();
				}
			}
    	}
    	return null;
    }
    @JsonIgnore()
    public String getTelecomPorSystem(List<Telecom> listTelecom, String system) {
    	if (listTelecom != null && system != null) {
	    	for (Telecom ident : listTelecom) {
				if (ident.getSystem().equalsIgnoreCase(system)) {
					return ident.getValue();
				}
			}
    	}
    	return null;
    }
    @JsonIgnore()
    public String getNumFamilia() {
    	if (getContract() != null && getContract().getIdentifier() != null) {
    		return getIdentifierPorType(getContract().getIdentifier(), "FAMILIA");
    	}
    	return null;
    }    

    @JsonIgnore()
    public Person getTitular() {
//    	person:
//            type: object
//            description: >-
//              Contiene los datos del titular o cotizante, persona natural. Para
//              los valores en la llave 'TIPO_IDENTIFICACION' responde el codigo
//              legal de la parametrica de BH 'TipoIdentificacion'    	
    	if (getContract() != null && getContract().getSubject() != null && getContract().getSubject().getPerson() != null) {
    		return getContract().getSubject().getPerson();
    	}
    	return null;
    }    
    
}
