package com.keralty.integraciones.patient.condition.response;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Entry {
    private EntryResource resource;

    @JsonProperty("resource")
    public EntryResource getResource() { return resource; }
    @JsonProperty("resource")
    public void setResource(EntryResource value) { this.resource = value; }
}
