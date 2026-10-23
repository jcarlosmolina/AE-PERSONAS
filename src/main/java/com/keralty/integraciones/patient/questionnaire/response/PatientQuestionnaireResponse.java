package com.keralty.integraciones.patient.questionnaire.response;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PatientQuestionnaireResponse {

    private String resourceType;
    private String type;
    private List<Entry> entry;

    @JsonProperty("resourceType")
    public String getResourceType() { return resourceType; }
    @JsonProperty("resourceType")
    public void setResourceType(String value) { this.resourceType = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("entry")
    public List<Entry> getEntry() { return entry; }
    @JsonProperty("entry")
    public void setEntry(List<Entry> value) { this.entry = value; }
}
