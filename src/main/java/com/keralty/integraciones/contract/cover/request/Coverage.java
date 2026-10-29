package com.keralty.integraciones.contract.cover.request;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Coverage {
    private InsurancePlan insurancePlan;
    private List<InsurancePlan> contract;

    @JsonProperty("insurancePlan")
    public InsurancePlan getInsurancePlan() { return insurancePlan; }
    @JsonProperty("insurancePlan")
    public void setInsurancePlan(InsurancePlan value) { this.insurancePlan = value; }

    @JsonProperty("contract")
    public List<InsurancePlan> getContract() { return contract; }
    @JsonProperty("contract")
    public void setContract(List<InsurancePlan> value) { this.contract = value; }
    
    public void addContract(InsurancePlan contract) {
    	this.contract.add(contract);
    }
}
