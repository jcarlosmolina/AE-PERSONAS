package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FuGetTextoAvisoFirmaRequest {

    @JsonProperty("pffirma")
    private Long pfFirma;

    public FuGetTextoAvisoFirmaRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public Long getPfFirma() {
        return this.pfFirma;
    }
    
    public void setPfFirma(Long pfFirma) {
        this.pfFirma = pfFirma;
    }
}
