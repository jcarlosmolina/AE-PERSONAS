package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FuGetNombreFuncionarioRequest {

    @JsonProperty("pfusuario")
    private String pfUsuario;

    public FuGetNombreFuncionarioRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public String getPfUsuario() {
        return this.pfUsuario;
    }
    
    public void setPfUsuario(String pfUsuario) {
        this.pfUsuario = pfUsuario;
    }
}
