package com.keralty.aepersonas.viewmodel.solicitud.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Solicitud;

public class CheckDatosPagoNoOkRequest {

    @JsonProperty("p_thissolicitud_oid")
    private SolicitudOid solicitudcheckDatosPagoNoOkpthisSolicitud;
    
    @JsonIgnore
    private Solicitud solicitudcheckDatosPagoNoOkpthisSolicitudInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkSolicitudcheckDatosPagoNoOkpthisSolicitud();
    }

    @JsonIgnore
    public SolicitudOid getSolicitudcheckDatosPagoNoOkpthisSolicitud() {
        return this.solicitudcheckDatosPagoNoOkpthisSolicitud;
    }
    
    public void setSolicitudcheckDatosPagoNoOkpthisSolicitud(SolicitudOid solicitudcheckDatosPagoNoOkpthisSolicitud) {
        this.solicitudcheckDatosPagoNoOkpthisSolicitud = solicitudcheckDatosPagoNoOkpthisSolicitud;
    }

    @JsonIgnore
    public Solicitud getSolicitudcheckDatosPagoNoOkpthisSolicitudInstance() {
        return this.solicitudcheckDatosPagoNoOkpthisSolicitudInstance;
    }
    
    public void setSolicitudcheckDatosPagoNoOkpthisSolicitudInstance(Solicitud solicitudcheckDatosPagoNoOkpthisSolicitud) {
        this.solicitudcheckDatosPagoNoOkpthisSolicitudInstance = solicitudcheckDatosPagoNoOkpthisSolicitud;
        this.solicitudcheckDatosPagoNoOkpthisSolicitud = solicitudcheckDatosPagoNoOkpthisSolicitud != null ? solicitudcheckDatosPagoNoOkpthisSolicitud.getOid() : null;
    }

    private void checkSolicitudcheckDatosPagoNoOkpthisSolicitud() throws NotNullArgumentException {
        if(this.getSolicitudcheckDatosPagoNoOkpthisSolicitudInstance() == null || this.getSolicitudcheckDatosPagoNoOkpthisSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_CHECKDATOSPAGONOOK, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_CHECKDATOSPAGONOOK_SOLICITUDCHECKDATOSPAGONOOKPTHISSOLICITUD, SolicitudConstants.SERV_ALIAS_CHECKDATOSPAGONOOK, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_CHECKDATOSPAGONOOK_SOLICITUDCHECKDATOSPAGONOOKPTHISSOLICITUD);
        }
    }
}
