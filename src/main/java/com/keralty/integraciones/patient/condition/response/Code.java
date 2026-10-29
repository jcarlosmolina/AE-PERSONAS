package com.keralty.integraciones.patient.condition.response;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Code {
    private List<Coding> coding;

    @JsonProperty("coding")
    public List<Coding> getCoding() { return coding; }
    @JsonProperty("coding")
    public void setCoding(List<Coding> value) { this.coding = value; }
}
