package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FugetAsesorRequest {

    @JsonProperty("pfu_usuario")
    private String pfuUsuario;

    public FugetAsesorRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public String getPfuUsuario() {
        return this.pfuUsuario;
    }
    
    public void setPfuUsuario(String pfuUsuario) {
        this.pfuUsuario = pfuUsuario;
    }
}
