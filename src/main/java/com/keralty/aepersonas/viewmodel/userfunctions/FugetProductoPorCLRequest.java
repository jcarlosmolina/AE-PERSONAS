package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FugetProductoPorCLRequest {

    @JsonProperty("pfcodlegalprod")
    private String pfCodLegalProd;

    public FugetProductoPorCLRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public String getPfCodLegalProd() {
        return this.pfCodLegalProd;
    }
    
    public void setPfCodLegalProd(String pfCodLegalProd) {
        this.pfCodLegalProd = pfCodLegalProd;
    }
}
