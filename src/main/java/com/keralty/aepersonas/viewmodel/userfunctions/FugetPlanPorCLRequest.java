package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FugetPlanPorCLRequest {

    @JsonProperty("pfcodlegalplan")
    private String pfCodLegalPlan;

    public FugetPlanPorCLRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public String getPfCodLegalPlan() {
        return this.pfCodLegalPlan;
    }
    
    public void setPfCodLegalPlan(String pfCodLegalPlan) {
        this.pfCodLegalPlan = pfCodLegalPlan;
    }
}
