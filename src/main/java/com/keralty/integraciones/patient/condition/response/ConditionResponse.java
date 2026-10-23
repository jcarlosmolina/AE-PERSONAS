package com.keralty.integraciones.patient.condition.response;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ConditionResponse {
    private ConditionResponseResource resource;
    private Response response;

    @JsonProperty("resource")
    public ConditionResponseResource getResource() { return resource; }
    @JsonProperty("resource")
    public void setResource(ConditionResponseResource value) { this.resource = value; }

    @JsonProperty("response")
    public Response getResponse() { return response; }
    @JsonProperty("response")
    public void setResponse(Response value) { this.response = value; }
}
