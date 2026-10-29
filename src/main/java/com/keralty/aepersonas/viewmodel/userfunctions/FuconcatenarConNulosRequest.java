package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FuconcatenarConNulosRequest {

    @JsonProperty("pfu_prefijo")
    private String pfuPrefijo;

    @JsonProperty("pfu_string")
    private String pfuString;

    public FuconcatenarConNulosRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public String getPfuPrefijo() {
        return this.pfuPrefijo;
    }
    
    public void setPfuPrefijo(String pfuPrefijo) {
        this.pfuPrefijo = pfuPrefijo;
    }
    @JsonIgnore
    public String getPfuString() {
        return this.pfuString;
    }
    
    public void setPfuString(String pfuString) {
        this.pfuString = pfuString;
    }
}
