package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FugetEstadoContratoRequest {

    @JsonProperty("pfu_codigo")
    private Long pfuCodigo;

    public FugetEstadoContratoRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public Long getPfuCodigo() {
        return this.pfuCodigo;
    }
    
    public void setPfuCodigo(Long pfuCodigo) {
        this.pfuCodigo = pfuCodigo;
    }
}
