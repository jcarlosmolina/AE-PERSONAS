package com.keralty.integraciones.contract.cover.response;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Contract {
    private List<Identifier> identifier;
    private String scope;
    private String type;
    private Subject subject;
    private String status;
    private Boolean active;
    private Applies applies;
    private List<Address> address;
    private List<InsurancePlan> supportingInformation;
    
    private Organization organization;

    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() { return identifier; }
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> value) { this.identifier = value; }

    @JsonProperty("scope")
    public String getScope() { return scope; }
    @JsonProperty("scope")
    public void setScope(String value) { this.scope = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("subject")
    public Subject getSubject() { return subject; }
    @JsonProperty("subject")
    public void setSubject(Subject value) { this.subject = value; }

    @JsonProperty("status")
    public String getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(String value) { this.status = value; }

    @JsonProperty("active")
    public Boolean getActive() { return active; }
    @JsonProperty("active")
    public void setActive(Boolean value) { this.active = value; }

    @JsonProperty("applies")
    public Applies getApplies() { return applies; }
    @JsonProperty("applies")
    public void setApplies(Applies value) { this.applies = value; }

    @JsonProperty("address")
    public List<Address> getAddress() { return address; }
    @JsonProperty("address")
    public void setAddress(List<Address> value) { this.address = value; }

    @JsonProperty("supportingInformation")
    public List<InsurancePlan> getSupportingInformation() { return supportingInformation; }
    @JsonProperty("supportingInformation")
    public void setSupportingInformation(List<InsurancePlan> value) { this.supportingInformation = value; }
    
    @JsonProperty("organization")
    public Organization getOrganization() { return organization; }
    @JsonProperty("organization")
	public void setOrganization(Organization organization) { this.organization = organization; }
	
	@JsonIgnore()
    public String getTipoIdentificacionContratante() {
    	return getIdentifierPorType("TIPO_IDENT_CONTRATANTE");
    }
    @JsonIgnore()
    public String getNumIdentificacionContratante() {
    	return getIdentifierPorType("NUMERO_IDENT_CONTRATANTE");
    }

    @JsonIgnore()
    public String getIdentifierPorType(String type) {
    	for (Identifier ident : getIdentifier()) {
			if (ident.getType().equalsIgnoreCase(type)) {
				return ident.getValue();
			}
		}
    	return null;
    }

}
