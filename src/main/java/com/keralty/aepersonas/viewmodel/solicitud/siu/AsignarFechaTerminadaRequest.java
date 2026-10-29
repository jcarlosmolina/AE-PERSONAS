package com.keralty.aepersonas.viewmodel.solicitud.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Solicitud;

public class AsignarFechaTerminadaRequest {

    @JsonProperty("p_thissolicitud_oid")
    private SolicitudOid solicitudasignarFechaTerminadapthisSolicitud;
    
    @JsonIgnore
    private Solicitud solicitudasignarFechaTerminadapthisSolicitudInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkSolicitudasignarFechaTerminadapthisSolicitud();
    }

    @JsonIgnore
    public SolicitudOid getSolicitudasignarFechaTerminadapthisSolicitud() {
        return this.solicitudasignarFechaTerminadapthisSolicitud;
    }
    
    public void setSolicitudasignarFechaTerminadapthisSolicitud(SolicitudOid solicitudasignarFechaTerminadapthisSolicitud) {
        this.solicitudasignarFechaTerminadapthisSolicitud = solicitudasignarFechaTerminadapthisSolicitud;
    }

    @JsonIgnore
    public Solicitud getSolicitudasignarFechaTerminadapthisSolicitudInstance() {
        return this.solicitudasignarFechaTerminadapthisSolicitudInstance;
    }
    
    public void setSolicitudasignarFechaTerminadapthisSolicitudInstance(Solicitud solicitudasignarFechaTerminadapthisSolicitud) {
        this.solicitudasignarFechaTerminadapthisSolicitudInstance = solicitudasignarFechaTerminadapthisSolicitud;
        this.solicitudasignarFechaTerminadapthisSolicitud = solicitudasignarFechaTerminadapthisSolicitud != null ? solicitudasignarFechaTerminadapthisSolicitud.getOid() : null;
    }

    private void checkSolicitudasignarFechaTerminadapthisSolicitud() throws NotNullArgumentException {
        if(this.getSolicitudasignarFechaTerminadapthisSolicitudInstance() == null || this.getSolicitudasignarFechaTerminadapthisSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_ASIGNARFECHATERMINADA, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_ASIGNARFECHATERMINADA_SOLICITUDASIGNARFECHATERMINADAPTHISSOLICITUD, SolicitudConstants.SERV_ALIAS_ASIGNARFECHATERMINADA, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_ASIGNARFECHATERMINADA_SOLICITUDASIGNARFECHATERMINADAPTHISSOLICITUD);
        }
    }
}
