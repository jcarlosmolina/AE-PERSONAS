package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FuContieneCharEspecialRequest {

    @JsonProperty("pfu_string")
    private String pfustring;

    public FuContieneCharEspecialRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public String getPfustring() {
        return this.pfustring;
    }
    
    public void setPfustring(String pfustring) {
        this.pfustring = pfustring;
    }
}
