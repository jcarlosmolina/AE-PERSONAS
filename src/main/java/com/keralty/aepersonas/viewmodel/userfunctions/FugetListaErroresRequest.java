package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Solicitud;
public class FugetListaErroresRequest {

    @JsonProperty("pfsolicitud")
    private SolicitudOid pfSolicitud;

    @JsonIgnore
    private Solicitud pfSolicitudInstance;

    public FugetListaErroresRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public SolicitudOid getPfSolicitud() {
        return this.pfSolicitud;
    }
    
    public void setPfSolicitud(SolicitudOid pfSolicitud) {
        this.pfSolicitud = pfSolicitud;
    }

    @JsonIgnore
    public Solicitud getPfSolicitudInstance() {
        if (this.pfSolicitudInstance == null)
            this.pfSolicitudInstance = new Solicitud();
        return this.pfSolicitudInstance;
    }
    
    public void setPfSolicitudInstance(Solicitud pfSolicitud) {
        this.pfSolicitudInstance = pfSolicitud;
        this.pfSolicitud = pfSolicitud != null ? pfSolicitud.getOid() : null;
    }
}
