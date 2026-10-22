package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.oid.PersonaCOid;
import com.keralty.aepersonas.persistence.PersonaC;
public class FuCalcularIMCRequest {

    @JsonProperty("pfpersonac")
    private PersonaCOid pfPersonaC;

    @JsonIgnore
    private PersonaC pfPersonaCInstance;

    public FuCalcularIMCRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public PersonaCOid getPfPersonaC() {
        return this.pfPersonaC;
    }
    
    public void setPfPersonaC(PersonaCOid pfPersonaC) {
        this.pfPersonaC = pfPersonaC;
    }

    @JsonIgnore
    public PersonaC getPfPersonaCInstance() {
        if (this.pfPersonaCInstance == null)
            this.pfPersonaCInstance = new PersonaC();
        return this.pfPersonaCInstance;
    }
    
    public void setPfPersonaCInstance(PersonaC pfPersonaC) {
        this.pfPersonaCInstance = pfPersonaC;
        this.pfPersonaC = pfPersonaC != null ? pfPersonaC.getOid() : null;
    }
}
