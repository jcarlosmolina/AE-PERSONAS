package com.keralty.integraciones.coverage.coverageheader.response;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Coverage {
    private Beneficiary beneficiary;
    private Period period;
    private Status status;
    private List<ContractRelationship> contractRelationship;

    @JsonProperty("beneficiary")
    public Beneficiary getBeneficiary() { return beneficiary; }
    @JsonProperty("beneficiary")
    public void setBeneficiary(Beneficiary value) { this.beneficiary = value; }

    @JsonProperty("period")
    public Period getPeriod() { return period; }
    @JsonProperty("period")
    public void setPeriod(Period value) { this.period = value; }

    @JsonProperty("status")
    public Status getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(Status value) { this.status = value; }

    @JsonProperty("contractRelationship")
    public List<ContractRelationship> getContractRelationship() { return contractRelationship; }
    @JsonProperty("contractRelationship")
    public void setContractRelationship(List<ContractRelationship> value) { this.contractRelationship = value; }
}
