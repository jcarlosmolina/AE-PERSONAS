package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FugetFuncionarioPorIdRequest {

    @JsonProperty("pfidfuncionario")
    private Long pfIdFuncionario;

    public FugetFuncionarioPorIdRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public Long getPfIdFuncionario() {
        return this.pfIdFuncionario;
    }
    
    public void setPfIdFuncionario(Long pfIdFuncionario) {
        this.pfIdFuncionario = pfIdFuncionario;
    }
}
