package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FuSoloNumerosRequest {

    @JsonProperty("pfu_numero")
    private String pfuNumero;

    public FuSoloNumerosRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public String getPfuNumero() {
        return this.pfuNumero;
    }
    
    public void setPfuNumero(String pfuNumero) {
        this.pfuNumero = pfuNumero;
    }
}
