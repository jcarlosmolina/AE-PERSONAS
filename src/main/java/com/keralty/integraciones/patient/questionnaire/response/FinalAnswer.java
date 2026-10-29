package com.keralty.integraciones.patient.questionnaire.response;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FinalAnswer {
    private String valueString;

    @JsonProperty("valueString")
    public String getValueString() { return valueString; }
    @JsonProperty("valueString")
    public void setValueString(String value) { this.valueString = value; }
}
