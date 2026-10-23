package com.keralty.integraciones.contract.getcontractparty.response;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EntryEntry {
    private Resource resource;

    @JsonProperty("resource")
    public Resource getResource() { return resource; }
    @JsonProperty("resource")
    public void setResource(Resource value) { this.resource = value; }
}
