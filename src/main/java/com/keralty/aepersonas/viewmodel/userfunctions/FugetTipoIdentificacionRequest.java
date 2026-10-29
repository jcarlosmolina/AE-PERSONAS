package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FugetTipoIdentificacionRequest {

    @JsonProperty("pfu_nombrecorto")
    private String pfuNombreCorto;

    public FugetTipoIdentificacionRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public String getPfuNombreCorto() {
        return this.pfuNombreCorto;
    }
    
    public void setPfuNombreCorto(String pfuNombreCorto) {
        this.pfuNombreCorto = pfuNombreCorto;
    }
}
