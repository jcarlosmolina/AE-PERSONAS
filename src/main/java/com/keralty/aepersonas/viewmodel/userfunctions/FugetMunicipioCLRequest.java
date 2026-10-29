package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FugetMunicipioCLRequest {

    @JsonProperty("pfcodlegal")
    private String pfCodLegal;

    public FugetMunicipioCLRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public String getPfCodLegal() {
        return this.pfCodLegal;
    }
    
    public void setPfCodLegal(String pfCodLegal) {
        this.pfCodLegal = pfCodLegal;
    }
}
