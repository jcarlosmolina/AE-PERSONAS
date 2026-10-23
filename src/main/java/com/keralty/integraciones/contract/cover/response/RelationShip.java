package com.keralty.integraciones.contract.cover.response;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RelationShip {
    private Long code;
    private String desc;

    @JsonProperty("code")
    public Long getCode() { return code; }
    @JsonProperty("code")
    public void setCode(Long value) { this.code = value; }

    @JsonProperty("desc")
    public String getDesc() { return desc; }
    @JsonProperty("desc")
    public void setDesc(String value) { this.desc = value; }
}
