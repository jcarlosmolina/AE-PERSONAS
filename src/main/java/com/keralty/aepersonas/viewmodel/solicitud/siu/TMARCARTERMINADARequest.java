package com.keralty.aepersonas.viewmodel.solicitud.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Solicitud;

public class TMARCARTERMINADARequest {

    @JsonProperty("p_thissolicitud_oid")
    private SolicitudOid solicitudTMARCARTERMINADApthisSolicitud;
    
    @JsonIgnore
    private Solicitud solicitudTMARCARTERMINADApthisSolicitudInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkSolicitudTMARCARTERMINADApthisSolicitud();
    }

    @JsonIgnore
    public SolicitudOid getSolicitudTMARCARTERMINADApthisSolicitud() {
        return this.solicitudTMARCARTERMINADApthisSolicitud;
    }
    
    public void setSolicitudTMARCARTERMINADApthisSolicitud(SolicitudOid solicitudTMARCARTERMINADApthisSolicitud) {
        this.solicitudTMARCARTERMINADApthisSolicitud = solicitudTMARCARTERMINADApthisSolicitud;
    }

    @JsonIgnore
    public Solicitud getSolicitudTMARCARTERMINADApthisSolicitudInstance() {
        return this.solicitudTMARCARTERMINADApthisSolicitudInstance;
    }
    
    public void setSolicitudTMARCARTERMINADApthisSolicitudInstance(Solicitud solicitudTMARCARTERMINADApthisSolicitud) {
        this.solicitudTMARCARTERMINADApthisSolicitudInstance = solicitudTMARCARTERMINADApthisSolicitud;
        this.solicitudTMARCARTERMINADApthisSolicitud = solicitudTMARCARTERMINADApthisSolicitud != null ? solicitudTMARCARTERMINADApthisSolicitud.getOid() : null;
    }

    private void checkSolicitudTMARCARTERMINADApthisSolicitud() throws NotNullArgumentException {
        if(this.getSolicitudTMARCARTERMINADApthisSolicitudInstance() == null || this.getSolicitudTMARCARTERMINADApthisSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_TMARCARTERMINADA, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_TMARCARTERMINADA_SOLICITUDTMARCARTERMINADAPTHISSOLICITUD, SolicitudConstants.SERV_ALIAS_TMARCARTERMINADA, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_TMARCARTERMINADA_SOLICITUDTMARCARTERMINADAPTHISSOLICITUD);
        }
    }
}
