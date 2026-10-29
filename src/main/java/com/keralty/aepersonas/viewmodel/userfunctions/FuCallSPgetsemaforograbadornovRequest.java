package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FuCallSPgetsemaforograbadornovRequest {

    @JsonProperty("pfidsolcitudnov")
    private Long pfIdSolcitudNov;

    public FuCallSPgetsemaforograbadornovRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public Long getPfIdSolcitudNov() {
        return this.pfIdSolcitudNov;
    }
    
    public void setPfIdSolcitudNov(Long pfIdSolcitudNov) {
        this.pfIdSolcitudNov = pfIdSolcitudNov;
    }
}
