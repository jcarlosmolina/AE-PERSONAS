package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FuAnadirTextoRequest {

    @JsonProperty("pfu_texto")
    private String pfuTexto;

    @JsonProperty("pfu_anadir")
    private String pfuAnadir;

    public FuAnadirTextoRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public String getPfuTexto() {
        return this.pfuTexto;
    }
    
    public void setPfuTexto(String pfuTexto) {
        this.pfuTexto = pfuTexto;
    }
    @JsonIgnore
    public String getPfuAnadir() {
        return this.pfuAnadir;
    }
    
    public void setPfuAnadir(String pfuAnadir) {
        this.pfuAnadir = pfuAnadir;
    }
}
