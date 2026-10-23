package com.keralty.integraciones.contract.cover.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Organization {

    private List<Identifier> identifier;
    private String name;
    
    
    @JsonProperty("identifier")
	public List<Identifier> getIdentifier() { return identifier; }
    @JsonProperty("identifier")
	public void setIdentifier(List<Identifier> identifier) { this.identifier = identifier; }
	
    @JsonProperty("name")
	public String getName() { return name; }
    @JsonProperty("name")
	public void setName(String name) { this.name = name; }

    
}
