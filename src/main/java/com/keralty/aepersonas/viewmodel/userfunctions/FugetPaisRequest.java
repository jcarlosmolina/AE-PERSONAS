package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FugetPaisRequest {

    @JsonProperty("pfu_codigo")
    private String pfuCodigo;

    public FugetPaisRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public String getPfuCodigo() {
        return this.pfuCodigo;
    }
    
    public void setPfuCodigo(String pfuCodigo) {
        this.pfuCodigo = pfuCodigo;
    }
}
