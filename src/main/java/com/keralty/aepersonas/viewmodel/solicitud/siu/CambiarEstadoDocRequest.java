package com.keralty.aepersonas.viewmodel.solicitud.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Solicitud;

public class CambiarEstadoDocRequest {

    @JsonProperty("p_thissolicitud_oid")
    private SolicitudOid solicitudcambiarEstadoDocpthisSolicitud;
    
    @JsonIgnore
    private Solicitud solicitudcambiarEstadoDocpthisSolicitudInstance;

    @JsonProperty("peestado")
    private Long solicitudcambiarEstadoDocpeEstado;

    public void checkArguments() throws NotNullArgumentException {
        checkSolicitudcambiarEstadoDocpthisSolicitud();
        checkSolicitudcambiarEstadoDocpeEstado();
    }

    @JsonIgnore
    public SolicitudOid getSolicitudcambiarEstadoDocpthisSolicitud() {
        return this.solicitudcambiarEstadoDocpthisSolicitud;
    }
    
    public void setSolicitudcambiarEstadoDocpthisSolicitud(SolicitudOid solicitudcambiarEstadoDocpthisSolicitud) {
        this.solicitudcambiarEstadoDocpthisSolicitud = solicitudcambiarEstadoDocpthisSolicitud;
    }

    @JsonIgnore
    public Solicitud getSolicitudcambiarEstadoDocpthisSolicitudInstance() {
        return this.solicitudcambiarEstadoDocpthisSolicitudInstance;
    }
    
    public void setSolicitudcambiarEstadoDocpthisSolicitudInstance(Solicitud solicitudcambiarEstadoDocpthisSolicitud) {
        this.solicitudcambiarEstadoDocpthisSolicitudInstance = solicitudcambiarEstadoDocpthisSolicitud;
        this.solicitudcambiarEstadoDocpthisSolicitud = solicitudcambiarEstadoDocpthisSolicitud != null ? solicitudcambiarEstadoDocpthisSolicitud.getOid() : null;
    }

    private void checkSolicitudcambiarEstadoDocpthisSolicitud() throws NotNullArgumentException {
        if(this.getSolicitudcambiarEstadoDocpthisSolicitudInstance() == null || this.getSolicitudcambiarEstadoDocpthisSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_CAMBIARESTADODOC, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_CAMBIARESTADODOC_SOLICITUDCAMBIARESTADODOCPTHISSOLICITUD, SolicitudConstants.SERV_ALIAS_CAMBIARESTADODOC, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_CAMBIARESTADODOC_SOLICITUDCAMBIARESTADODOCPTHISSOLICITUD);
        }
    }

    @JsonIgnore
    public Long getSolicitudcambiarEstadoDocpeEstado() {
        return this.solicitudcambiarEstadoDocpeEstado;
    }
    
    public void setSolicitudcambiarEstadoDocpeEstado(Long solicitudcambiarEstadoDocpeEstado) {
        this.solicitudcambiarEstadoDocpeEstado = solicitudcambiarEstadoDocpeEstado;
    }

    private void checkSolicitudcambiarEstadoDocpeEstado() throws NotNullArgumentException {
        if(this.getSolicitudcambiarEstadoDocpeEstado() == null) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_CAMBIARESTADODOC, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_CAMBIARESTADODOC_SOLICITUDCAMBIARESTADODOCPEESTADO, SolicitudConstants.SERV_ALIAS_CAMBIARESTADODOC, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_CAMBIARESTADODOC_SOLICITUDCAMBIARESTADODOCPEESTADO);
        }
    }
}
