package com.keralty.integraciones.contract.getcontractparty.response;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Term {
    private List<TermIdentifier> identifier;


    @JsonProperty("identifier")
    public List<TermIdentifier> getIdentifier() { return identifier; }
    @JsonProperty("identifier")
    public void setIdentifier(List<TermIdentifier> value) { this.identifier = value; }
}
