package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FuStrONullRequest {

    @JsonProperty("pfu_numero")
    private Long pfuNumero;

    public FuStrONullRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public Long getPfuNumero() {
        return this.pfuNumero;
    }
    
    public void setPfuNumero(Long pfuNumero) {
        this.pfuNumero = pfuNumero;
    }
}
