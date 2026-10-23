package com.keralty.integraciones.coverage.coverageheader.response;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Status {
    private String code;
    private ContractRelationship reason;
    private ContractRelationship causal;

    @JsonProperty("code")
    public String getCode() { return code; }
    @JsonProperty("code")
    public void setCode(String value) { this.code = value; }

    @JsonProperty("reason")
    public ContractRelationship getReason() { return reason; }
    @JsonProperty("reason")
    public void setReason(ContractRelationship value) { this.reason = value; }

    @JsonProperty("causal")
    public ContractRelationship getCausal() { return causal; }
    @JsonProperty("causal")
    public void setCausal(ContractRelationship value) { this.causal = value; }
}
