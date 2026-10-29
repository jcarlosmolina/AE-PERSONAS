package com.keralty.integraciones.patient.questionnaire.response;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EntryResource {
    private String resourceType;
    private String status;
    private Subject subject;
    private List<ResourceItem> item;

    @JsonProperty("resourceType")
    public String getResourceType() { return resourceType; }
    @JsonProperty("resourceType")
    public void setResourceType(String value) { this.resourceType = value; }

    @JsonProperty("status")
    public String getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(String value) { this.status = value; }

    @JsonProperty("subject")
    public Subject getSubject() { return subject; }
    @JsonProperty("subject")
    public void setSubject(Subject value) { this.subject = value; }

    @JsonProperty("item")
    public List<ResourceItem> getItem() { return item; }
    @JsonProperty("item")
    public void setItem(List<ResourceItem> value) { this.item = value; }
}
