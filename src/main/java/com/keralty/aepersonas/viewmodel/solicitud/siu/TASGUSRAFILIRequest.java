package com.keralty.aepersonas.viewmodel.solicitud.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.persistence.Funcionario;
import com.keralty.aepersonas.persistence.oid.FuncionarioOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Solicitud;

public class TASGUSRAFILIRequest {

    @JsonProperty("p_thissolicitud_oid")
    private SolicitudOid solicitudTASGUSRAFILIpthisSolicitud;
    
    @JsonIgnore
    private Solicitud solicitudTASGUSRAFILIpthisSolicitudInstance;

    @JsonProperty("ptafiliacion_oid")
    private FuncionarioOid solicitudTASGUSRAFILIptAfiliacion;
    
    @JsonIgnore
    private Funcionario solicitudTASGUSRAFILIptAfiliacionInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkSolicitudTASGUSRAFILIpthisSolicitud();
        checkSolicitudTASGUSRAFILIptAfiliacion();
    }

    @JsonIgnore
    public SolicitudOid getSolicitudTASGUSRAFILIpthisSolicitud() {
        return this.solicitudTASGUSRAFILIpthisSolicitud;
    }
    
    public void setSolicitudTASGUSRAFILIpthisSolicitud(SolicitudOid solicitudTASGUSRAFILIpthisSolicitud) {
        this.solicitudTASGUSRAFILIpthisSolicitud = solicitudTASGUSRAFILIpthisSolicitud;
    }

    @JsonIgnore
    public Solicitud getSolicitudTASGUSRAFILIpthisSolicitudInstance() {
        return this.solicitudTASGUSRAFILIpthisSolicitudInstance;
    }
    
    public void setSolicitudTASGUSRAFILIpthisSolicitudInstance(Solicitud solicitudTASGUSRAFILIpthisSolicitud) {
        this.solicitudTASGUSRAFILIpthisSolicitudInstance = solicitudTASGUSRAFILIpthisSolicitud;
        this.solicitudTASGUSRAFILIpthisSolicitud = solicitudTASGUSRAFILIpthisSolicitud != null ? solicitudTASGUSRAFILIpthisSolicitud.getOid() : null;
    }

    private void checkSolicitudTASGUSRAFILIpthisSolicitud() throws NotNullArgumentException {
        if(this.getSolicitudTASGUSRAFILIpthisSolicitudInstance() == null || this.getSolicitudTASGUSRAFILIpthisSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_TASGUSRAFILI, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_TASGUSRAFILI_SOLICITUDTASGUSRAFILIPTHISSOLICITUD, SolicitudConstants.SERV_ALIAS_TASGUSRAFILI, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_TASGUSRAFILI_SOLICITUDTASGUSRAFILIPTHISSOLICITUD);
        }
    }

    @JsonIgnore
    public FuncionarioOid getSolicitudTASGUSRAFILIptAfiliacion() {
        return this.solicitudTASGUSRAFILIptAfiliacion;
    }
    
    public void setSolicitudTASGUSRAFILIptAfiliacion(FuncionarioOid solicitudTASGUSRAFILIptAfiliacion) {
        this.solicitudTASGUSRAFILIptAfiliacion = solicitudTASGUSRAFILIptAfiliacion;
    }

    @JsonIgnore
    public Funcionario getSolicitudTASGUSRAFILIptAfiliacionInstance() {
        return this.solicitudTASGUSRAFILIptAfiliacionInstance;
    }
    
    public void setSolicitudTASGUSRAFILIptAfiliacionInstance(Funcionario solicitudTASGUSRAFILIptAfiliacion) {
        this.solicitudTASGUSRAFILIptAfiliacionInstance = solicitudTASGUSRAFILIptAfiliacion;
        this.solicitudTASGUSRAFILIptAfiliacion = solicitudTASGUSRAFILIptAfiliacion != null ? solicitudTASGUSRAFILIptAfiliacion.getOid() : null;
    }

    private void checkSolicitudTASGUSRAFILIptAfiliacion() throws NotNullArgumentException {
        if(this.getSolicitudTASGUSRAFILIptAfiliacionInstance() == null || this.getSolicitudTASGUSRAFILIptAfiliacionInstance().isNull()) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_TASGUSRAFILI, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_TASGUSRAFILI_SOLICITUDTASGUSRAFILIPTAFILIACION, SolicitudConstants.SERV_ALIAS_TASGUSRAFILI, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_TASGUSRAFILI_SOLICITUDTASGUSRAFILIPTAFILIACION);
        }
    }
}
