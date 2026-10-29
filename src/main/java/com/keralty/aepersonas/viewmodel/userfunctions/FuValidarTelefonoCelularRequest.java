package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FuValidarTelefonoCelularRequest {

    @JsonProperty("pfu_telefonocelular")
    private String pfuTelefonoCelular;

    public FuValidarTelefonoCelularRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public String getPfuTelefonoCelular() {
        return this.pfuTelefonoCelular;
    }
    
    public void setPfuTelefonoCelular(String pfuTelefonoCelular) {
        this.pfuTelefonoCelular = pfuTelefonoCelular;
    }
}
