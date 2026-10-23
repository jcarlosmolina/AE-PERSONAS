package com.keralty.integraciones.patient.basicdata.response;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MaritalStatus {
    private Long code;
    private String display;

    @JsonProperty("code")
    public Long getCode() { return code; }
    @JsonProperty("code")
    public void setCode(Long value) { this.code = value; }

    @JsonProperty("display")
    public String getDisplay() { return display; }
    @JsonProperty("display")
    public void setDisplay(String value) { this.display = value; }
}
