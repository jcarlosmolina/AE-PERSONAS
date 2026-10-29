package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FuObtenerDocumentoRequest {

    @JsonProperty("p_pathcompleto")
    private String pPathCompleto;

    public FuObtenerDocumentoRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public String getPPathCompleto() {
        return this.pPathCompleto;
    }
    
    public void setPPathCompleto(String pPathCompleto) {
        this.pPathCompleto = pPathCompleto;
    }
}
