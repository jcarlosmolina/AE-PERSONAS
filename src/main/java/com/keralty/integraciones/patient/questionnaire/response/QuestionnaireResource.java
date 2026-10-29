package com.keralty.integraciones.patient.questionnaire.response;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QuestionnaireResource {
    private String resourceType;
    private String type;
    private Long total;
    private List<ResourceEntry> entry;

    @JsonProperty("resourceType")
    public String getResourceType() { return resourceType; }
    @JsonProperty("resourceType")
    public void setResourceType(String value) { this.resourceType = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("total")
    public Long getTotal() { return total; }
    @JsonProperty("total")
    public void setTotal(Long value) { this.total = value; }

    @JsonProperty("entry")
    public List<ResourceEntry> getEntry() { return entry; }
    @JsonProperty("entry")
    public void setEntry(List<ResourceEntry> value) { this.entry = value; }
}
