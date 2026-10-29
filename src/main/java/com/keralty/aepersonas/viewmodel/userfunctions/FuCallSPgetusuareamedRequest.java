package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FuCallSPgetusuareamedRequest {

    @JsonProperty("pfidsolicitud")
    private Long pfIdSolicitud;

    public FuCallSPgetusuareamedRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public Long getPfIdSolicitud() {
        return this.pfIdSolicitud;
    }
    
    public void setPfIdSolicitud(Long pfIdSolicitud) {
        this.pfIdSolicitud = pfIdSolicitud;
    }
}
