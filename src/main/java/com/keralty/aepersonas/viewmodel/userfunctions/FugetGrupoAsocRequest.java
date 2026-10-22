package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FugetGrupoAsocRequest {

    @JsonProperty("pfu_codiolegal")
    private String pfuCodioLegal;

    public FugetGrupoAsocRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public String getPfuCodioLegal() {
        return this.pfuCodioLegal;
    }
    
    public void setPfuCodioLegal(String pfuCodioLegal) {
        this.pfuCodioLegal = pfuCodioLegal;
    }
}
