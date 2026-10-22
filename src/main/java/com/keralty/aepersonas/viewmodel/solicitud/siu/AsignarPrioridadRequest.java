package com.keralty.aepersonas.viewmodel.solicitud.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Solicitud;

public class AsignarPrioridadRequest {

    @JsonProperty("p_thissolicitud_oid")
    private SolicitudOid solicitudasignarPrioridadpthisSolicitud;
    
    @JsonIgnore
    private Solicitud solicitudasignarPrioridadpthisSolicitudInstance;

    @JsonProperty("peprioridad")
    private Long solicitudasignarPrioridadpePrioridad;

    public void checkArguments() throws NotNullArgumentException {
        checkSolicitudasignarPrioridadpthisSolicitud();
        checkSolicitudasignarPrioridadpePrioridad();
    }

    @JsonIgnore
    public SolicitudOid getSolicitudasignarPrioridadpthisSolicitud() {
        return this.solicitudasignarPrioridadpthisSolicitud;
    }
    
    public void setSolicitudasignarPrioridadpthisSolicitud(SolicitudOid solicitudasignarPrioridadpthisSolicitud) {
        this.solicitudasignarPrioridadpthisSolicitud = solicitudasignarPrioridadpthisSolicitud;
    }

    @JsonIgnore
    public Solicitud getSolicitudasignarPrioridadpthisSolicitudInstance() {
        return this.solicitudasignarPrioridadpthisSolicitudInstance;
    }
    
    public void setSolicitudasignarPrioridadpthisSolicitudInstance(Solicitud solicitudasignarPrioridadpthisSolicitud) {
        this.solicitudasignarPrioridadpthisSolicitudInstance = solicitudasignarPrioridadpthisSolicitud;
        this.solicitudasignarPrioridadpthisSolicitud = solicitudasignarPrioridadpthisSolicitud != null ? solicitudasignarPrioridadpthisSolicitud.getOid() : null;
    }

    private void checkSolicitudasignarPrioridadpthisSolicitud() throws NotNullArgumentException {
        if(this.getSolicitudasignarPrioridadpthisSolicitudInstance() == null || this.getSolicitudasignarPrioridadpthisSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_ASIGNARPRIORIDAD, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_ASIGNARPRIORIDAD_SOLICITUDASIGNARPRIORIDADPTHISSOLICITUD, SolicitudConstants.SERV_ALIAS_ASIGNARPRIORIDAD, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_ASIGNARPRIORIDAD_SOLICITUDASIGNARPRIORIDADPTHISSOLICITUD);
        }
    }

    @JsonIgnore
    public Long getSolicitudasignarPrioridadpePrioridad() {
        return this.solicitudasignarPrioridadpePrioridad;
    }
    
    public void setSolicitudasignarPrioridadpePrioridad(Long solicitudasignarPrioridadpePrioridad) {
        this.solicitudasignarPrioridadpePrioridad = solicitudasignarPrioridadpePrioridad;
    }

    private void checkSolicitudasignarPrioridadpePrioridad() throws NotNullArgumentException {
        if(this.getSolicitudasignarPrioridadpePrioridad() == null) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_ASIGNARPRIORIDAD, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_ASIGNARPRIORIDAD_SOLICITUDASIGNARPRIORIDADPEPRIORIDAD, SolicitudConstants.SERV_ALIAS_ASIGNARPRIORIDAD, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_ASIGNARPRIORIDAD_SOLICITUDASIGNARPRIORIDADPEPRIORIDAD);
        }
    }
}
