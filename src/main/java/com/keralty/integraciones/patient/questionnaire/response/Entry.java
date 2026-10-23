package com.keralty.integraciones.patient.questionnaire.response;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Entry {
    private QuestionnaireResource resource;

    @JsonProperty("resource")
    public QuestionnaireResource getResource() { return resource; }
    @JsonProperty("resource")
    public void setResource(QuestionnaireResource value) { this.resource = value; }
}
