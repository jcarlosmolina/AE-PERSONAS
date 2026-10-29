package com.keralty.integraciones.contract.cover.request;

import com.fasterxml.jackson.annotation.*;

public class InsurancePlan {
    private String type;
    private String value;

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("value")
    public String getValue() { return value; }
    @JsonProperty("value")
    public void setValue(String value) { this.value = value; }
}
