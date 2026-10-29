package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FugetRolRequest {

    @JsonProperty("pfu_nombre")
    private String pfuNombre;

    public FugetRolRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public String getPfuNombre() {
        return this.pfuNombre;
    }
    
    public void setPfuNombre(String pfuNombre) {
        this.pfuNombre = pfuNombre;
    }
}
