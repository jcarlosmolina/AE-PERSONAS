package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FuCallSPgetsemaforograbadorRequest {

    @JsonProperty("pfidsolicitud")
    private Long pfIdSolicitud;

    public FuCallSPgetsemaforograbadorRequest() {
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
