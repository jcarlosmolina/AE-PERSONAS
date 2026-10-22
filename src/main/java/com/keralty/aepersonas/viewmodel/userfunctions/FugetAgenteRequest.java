package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FugetAgenteRequest {

    @JsonProperty("pfu_login")
    private String pfuLogin;

    public FugetAgenteRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public String getPfuLogin() {
        return this.pfuLogin;
    }
    
    public void setPfuLogin(String pfuLogin) {
        this.pfuLogin = pfuLogin;
    }
}
