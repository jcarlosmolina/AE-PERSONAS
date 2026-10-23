package com.keralty.integraciones.contract.cover.request;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Subject {
    private List<InsurancePlan> identifier;

    @JsonProperty("identifier")
    public List<InsurancePlan> getIdentifier() { return identifier; }
    @JsonProperty("identifier")
    public void setIdentifier(List<InsurancePlan> value) { this.identifier = value; }
}
