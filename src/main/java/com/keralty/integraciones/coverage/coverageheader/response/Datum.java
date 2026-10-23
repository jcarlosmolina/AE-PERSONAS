package com.keralty.integraciones.coverage.coverageheader.response;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Datum {
    private Contract insurancePlan;
    private Contract contract;
    private List<Coverage> coverage;

    @JsonProperty("insurancePlan")
    public Contract getInsurancePlan() { return insurancePlan; }
    @JsonProperty("insurancePlan")
    public void setInsurancePlan(Contract value) { this.insurancePlan = value; }

    @JsonProperty("contract")
    public Contract getContract() { return contract; }
    @JsonProperty("contract")
    public void setContract(Contract value) { this.contract = value; }

    @JsonProperty("coverage")
    public List<Coverage> getCoverage() { return coverage; }
    @JsonProperty("coverage")
    public void setCoverage(List<Coverage> value) { this.coverage = value; }
    
    public String getValue4Type(List<Identifier> lista, String type) {
    	String value = "";
    	if (lista != null && type != null) {
    		for (Identifier ident : lista) {
    			if (type.equals(ident.getType())) {
    				value = ident.getValue();
    				break;
    			}
    		}
    	}
    	return value;
    }
}
