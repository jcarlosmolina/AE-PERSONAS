package com.keralty.integraciones.contract.getcontractparty.response;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetContractPartyResponse {
    private String resourcetype;
    private String type;
    private List<GetContractPartyResponseEntry> entry;

    @JsonProperty("resourcetype")
    public String getResourcetype() { return resourcetype; }
    @JsonProperty("resourcetype")
    public void setResourcetype(String value) { this.resourcetype = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("entry")
    public List<GetContractPartyResponseEntry> getEntry() { return entry; }
    @JsonProperty("entry")
    public void setEntry(List<GetContractPartyResponseEntry> value) { this.entry = value; }


    @JsonIgnore
    private LegalStatusCoding getCodingPorSystem(String system) {
    	
    	//	Los datos del contrato se encuentran en el elemento:
    	//  entry -> entry -> resource donde el campo "resourceType" tome el valor "Contract" ---Es Correcto----

    	List<Term> listaTerm = null;
    	if (getEntry() != null) {
    		for(GetContractPartyResponseEntry entry : getEntry()) {
    			if (entry.getEntry() != null) {
    				for (EntryEntry entryEntry : entry.getEntry()) {
    					if (entryEntry.getResource() != null && 
   							"Contract".equalsIgnoreCase( entryEntry.getResource().getResourceType()) ) {
    						listaTerm = entryEntry.getResource().getTerm();
    						break;
    					}
    				}
    			}
    			if (listaTerm != null) {
    				break;
    			}
    		}
    	}
    	
    	// Los datos del contrato se encuentran ...           
    	// Dentro del elemento term -> identifier -> coding 
    	//    donde el campo  "system" tome el valor a buscar, el valor buscado ea en "code"
    	
    	// Buscamos dentro de la lista el solicitado
    	if (listaTerm != null) {
    		for (Term term : listaTerm) {
    			if (term.getIdentifier() != null) {
    				for (TermIdentifier identifier : term.getIdentifier()) {
    					if (identifier.getCoding() != null) {
    						for (LegalStatusCoding coding : identifier.getCoding()) {
    							if (system.equals(coding.getSystem())) {
    								return coding;
    							}
    						}
    					}
    				}
    			}
    		}
    	}
    	return null;
    }    

    @JsonIgnore
    private String getValorCodePorSystem(String system) {
    	
    	//	Los datos del contrato se encuentran en el elemento:
    	//  entry -> entry -> resource donde el campo "resourceType" tome el valor "Contract" ---Es Correcto----
    	LegalStatusCoding coding = getCodingPorSystem(system);
    	if (coding != null) {
    		return coding.getCode();
    	}
    	return null;
    }

    @JsonIgnore
    private String getValorDisplayPorSystem(String system) {
    	
    	//	Los datos del contrato se encuentran en el elemento:
    	//  entry -> entry -> resource donde el campo "resourceType" tome el valor "Contract" ---Es Correcto----
    	LegalStatusCoding coding = getCodingPorSystem(system);
    	if (coding != null) {
    		return coding.getDisplay();
    	}
    	return null;
    }    
    
    @JsonIgnore
    public String getCodigoTarifa() {
    	return this.getValorCodePorSystem("SIE000000063/FEE");
    }
    @JsonIgnore
    public String getDescripcionTarifa() {
    	String desc = this.getValorDisplayPorSystem("SIE000000063/FEE");
    	if (desc == null) {
    		desc = this.getValorCodePorSystem("SIE000000063/FEE");
    	}
    	return desc;
    }
    @JsonIgnore
    public String getPeriodicidad() {
    	return this.getValorCodePorSystem("SIE000000063/PAYMENTFREQUENCY");
    }
    @JsonIgnore
    public String getCodigoFormaPago() {
    	return this.getValorCodePorSystem("SIE000000063/PAYMENTMETHODS");
    }
    @JsonIgnore
    public String getEnvioFactura() {
    	return this.getValorCodePorSystem("SIE000000063/INVOICESENDING");
    }
    @JsonIgnore
    public String getCodigoGrupoAsociado() {
    	return this.getValorCodePorSystem("SIE000000063/ASSOCIATEDGROUP");
    }
    @JsonIgnore
    public String getCausaExclusion() {
    	return this.getValorDisplayPorSystem("SIE000000063/EXCLUSIONCAUSE");
    }
    @JsonIgnore
    public String getCodigoConvenio() {
    	return this.getValorCodePorSystem("SIE000000063/AGREEMENT");
    }
    @JsonIgnore
    public String getDescripcionConvenio() {
    	return this.getValorDisplayPorSystem("SIE000000063/AGREEMENT");
    }
}
