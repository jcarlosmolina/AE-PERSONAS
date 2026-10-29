package com.keralty.integraciones.coverage.coverageheader.request;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Patient {
    private List<InsurancePlan> identifier;

    @JsonProperty("identifier")
    public List<InsurancePlan> getIdentifier() { return identifier; }
    @JsonProperty("identifier")
    public void setIdentifier(List<InsurancePlan> value) { this.identifier = value; }
    
    public void addIdentifier(InsurancePlan identifier) {
    	this.identifier.add(identifier);
    }
}
