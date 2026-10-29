package com.keralty.integraciones.patient.basicdata.response;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ValueCodeableConcept {
    private List<Coding> coding;

    @JsonProperty("coding")
    public List<Coding> getCoding() { return coding; }
    @JsonProperty("coding")
    public void setCoding(List<Coding> value) { this.coding = value; }
}
