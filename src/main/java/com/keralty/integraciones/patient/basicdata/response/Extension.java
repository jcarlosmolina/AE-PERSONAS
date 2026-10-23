package com.keralty.integraciones.patient.basicdata.response;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Extension {
    private ValueAddress valueAddress;
    private String url;
    private ValueCodeableConcept valueCodeableConcept;

    @JsonProperty("valueAddress")
    public ValueAddress getValueAddress() { return valueAddress; }
    @JsonProperty("valueAddress")
    public void setValueAddress(ValueAddress value) { this.valueAddress = value; }

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }
    
    @JsonProperty("valueCodeableConcept")
    public ValueCodeableConcept getValueCodeableConcept() { return valueCodeableConcept; }
    @JsonProperty("valueCodeableConcept")
    public void setValueCodeableConcept(ValueCodeableConcept value) { this.valueCodeableConcept = value; }
    
}
