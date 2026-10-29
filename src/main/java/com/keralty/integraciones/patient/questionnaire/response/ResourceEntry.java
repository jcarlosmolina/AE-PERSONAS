package com.keralty.integraciones.patient.questionnaire.response;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResourceEntry {
    private EntryResource resource;
    private String fullURL;

    @JsonProperty("resource")
    public EntryResource getResource() { return resource; }
    @JsonProperty("resource")
    public void setResource(EntryResource value) { this.resource = value; }

    @JsonProperty("fullUrl")
    public String getFullURL() { return fullURL; }
    @JsonProperty("fullUrl")
    public void setFullURL(String value) { this.fullURL = value; }
}
