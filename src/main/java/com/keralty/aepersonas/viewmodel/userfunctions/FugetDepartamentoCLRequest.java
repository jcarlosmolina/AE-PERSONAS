package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FugetDepartamentoCLRequest {

    @JsonProperty("pfu_codigolegal")
    private String pfuCodigoLegal;

    public FugetDepartamentoCLRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public String getPfuCodigoLegal() {
        return this.pfuCodigoLegal;
    }
    
    public void setPfuCodigoLegal(String pfuCodigoLegal) {
        this.pfuCodigoLegal = pfuCodigoLegal;
    }
}
