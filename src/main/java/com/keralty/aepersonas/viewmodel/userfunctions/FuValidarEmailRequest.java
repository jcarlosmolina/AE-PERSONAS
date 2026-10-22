package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FuValidarEmailRequest {

    @JsonProperty("pfu_email")
    private String pfuEmail;

    public FuValidarEmailRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public String getPfuEmail() {
        return this.pfuEmail;
    }
    
    public void setPfuEmail(String pfuEmail) {
        this.pfuEmail = pfuEmail;
    }
}
