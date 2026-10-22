package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FuValidarTelefonoFijoRequest {

    @JsonProperty("pfu_telefonofijo")
    private String pfuTelefonoFijo;

    public FuValidarTelefonoFijoRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public String getPfuTelefonoFijo() {
        return this.pfuTelefonoFijo;
    }
    
    public void setPfuTelefonoFijo(String pfuTelefonoFijo) {
        this.pfuTelefonoFijo = pfuTelefonoFijo;
    }
}
