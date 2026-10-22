package com.keralty.aepersonas.viewmodel.solicitud.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Solicitud;

public class AsignarFARequest {

    @JsonProperty("p_thissolicitud_oid")
    private SolicitudOid solicitudasignarFApthisSolicitud;
    
    @JsonIgnore
    private Solicitud solicitudasignarFApthisSolicitudInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkSolicitudasignarFApthisSolicitud();
    }

    @JsonIgnore
    public SolicitudOid getSolicitudasignarFApthisSolicitud() {
        return this.solicitudasignarFApthisSolicitud;
    }
    
    public void setSolicitudasignarFApthisSolicitud(SolicitudOid solicitudasignarFApthisSolicitud) {
        this.solicitudasignarFApthisSolicitud = solicitudasignarFApthisSolicitud;
    }

    @JsonIgnore
    public Solicitud getSolicitudasignarFApthisSolicitudInstance() {
        return this.solicitudasignarFApthisSolicitudInstance;
    }
    
    public void setSolicitudasignarFApthisSolicitudInstance(Solicitud solicitudasignarFApthisSolicitud) {
        this.solicitudasignarFApthisSolicitudInstance = solicitudasignarFApthisSolicitud;
        this.solicitudasignarFApthisSolicitud = solicitudasignarFApthisSolicitud != null ? solicitudasignarFApthisSolicitud.getOid() : null;
    }

    private void checkSolicitudasignarFApthisSolicitud() throws NotNullArgumentException {
        if(this.getSolicitudasignarFApthisSolicitudInstance() == null || this.getSolicitudasignarFApthisSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_ASIGNARFA, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_ASIGNARFA_SOLICITUDASIGNARFAPTHISSOLICITUD, SolicitudConstants.SERV_ALIAS_ASIGNARFA, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_ASIGNARFA_SOLICITUDASIGNARFAPTHISSOLICITUD);
        }
    }
}
