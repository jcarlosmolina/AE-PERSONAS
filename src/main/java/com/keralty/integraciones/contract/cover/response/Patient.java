package com.keralty.integraciones.contract.cover.response;

import com.fasterxml.jackson.annotation.*;

import java.sql.Date;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Patient {
    private List<Identifier> identifier;
    private String name;
    private List<Identifier> role;
    private RelationShip relationShip;
    private Applies applies;
    private String status;
    private SupportingInfo supportingInfo;
    private String colCentralBankCod;
    private Date afiliateSince;

    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() { return identifier; }
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> value) { this.identifier = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("role")
    public List<Identifier> getRole() { return role; }
    @JsonProperty("role")
    public void setRole(List<Identifier> value) { this.role = value; }

    @JsonProperty("relationShip")
    public RelationShip getRelationShip() { return relationShip; }
    @JsonProperty("relationShip")
    public void setRelationShip(RelationShip value) { this.relationShip = value; }

    @JsonProperty("applies")
    public Applies getApplies() { return applies; }
    @JsonProperty("applies")
    public void setApplies(Applies value) { this.applies = value; }

    @JsonProperty("status")
    public String getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(String value) { this.status = value; }

    @JsonProperty("supportingInfo")
    public SupportingInfo getSupportingInfo() { return supportingInfo; }
    @JsonProperty("supportingInfo")
    public void setSupportingInfo(SupportingInfo value) { this.supportingInfo = value; }
     
    @JsonProperty("colCentralBankCod")
    public String getColCentralBankCod() { return colCentralBankCod; }
    @JsonProperty("colCentralBankCod")
	public void setColCentralBankCod(String colCentralBankCod) { this.colCentralBankCod = colCentralBankCod; }
	
	@JsonProperty("afiliateSince")
    public Date getAfiliateSince() { return afiliateSince; }
    @JsonProperty("afiliateSince")
    public void setAfiliateSince(Date value) { this.afiliateSince = value; }
}
