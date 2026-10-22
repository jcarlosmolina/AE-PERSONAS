package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FugetFuncionarioPorLDAPRequest {

    @JsonProperty("pfusuldap")
    private String pfUsuLDAP;

    public FugetFuncionarioPorLDAPRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public String getPfUsuLDAP() {
        return this.pfUsuLDAP;
    }
    
    public void setPfUsuLDAP(String pfUsuLDAP) {
        this.pfUsuLDAP = pfUsuLDAP;
    }
}
