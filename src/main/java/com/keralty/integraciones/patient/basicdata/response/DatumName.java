package com.keralty.integraciones.patient.basicdata.response;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DatumName {
    private NameName name;

    @JsonProperty("name")
    public NameName getName() { return name; }
    @JsonProperty("name")
    public void setName(NameName value) { this.name = value; }
}
