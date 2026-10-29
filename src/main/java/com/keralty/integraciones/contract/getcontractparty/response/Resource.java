package com.keralty.integraciones.contract.getcontractparty.response;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Resource {
    private String resourceType;

    private List<Term> term;

    @JsonProperty("resourceType")
    public String getResourceType() { return resourceType; }
    @JsonProperty("resourceType")
    public void setResourceType(String value) { this.resourceType = value; }

    @JsonProperty("term")
    public List<Term> getTerm() { return term; }
    @JsonProperty("term")
    public void setTerm(List<Term> value) { this.term = value; }
}
