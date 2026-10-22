package com.keralty.aepersonas.viewmodel.solicitud.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.persistence.Funcionario;
import com.keralty.aepersonas.persistence.oid.FuncionarioOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Solicitud;

public class InsUsrAfiliacionRequest {

    @JsonProperty("p_thissolicitud_oid")
    private SolicitudOid solicitudInsUsrAfiliacionpthisSolicitud;
    
    @JsonIgnore
    private Solicitud solicitudInsUsrAfiliacionpthisSolicitudInstance;

    @JsonProperty("p_evcfuncionario_oid")
    private FuncionarioOid solicitudInsUsrAfiliacionpevcFuncionario;
    
    @JsonIgnore
    private Funcionario solicitudInsUsrAfiliacionpevcFuncionarioInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkSolicitudInsUsrAfiliacionpthisSolicitud();
        checkSolicitudInsUsrAfiliacionpevcFuncionario();
    }

    @JsonIgnore
    public SolicitudOid getSolicitudInsUsrAfiliacionpthisSolicitud() {
        return this.solicitudInsUsrAfiliacionpthisSolicitud;
    }
    
    public void setSolicitudInsUsrAfiliacionpthisSolicitud(SolicitudOid solicitudInsUsrAfiliacionpthisSolicitud) {
        this.solicitudInsUsrAfiliacionpthisSolicitud = solicitudInsUsrAfiliacionpthisSolicitud;
    }

    @JsonIgnore
    public Solicitud getSolicitudInsUsrAfiliacionpthisSolicitudInstance() {
        return this.solicitudInsUsrAfiliacionpthisSolicitudInstance;
    }
    
    public void setSolicitudInsUsrAfiliacionpthisSolicitudInstance(Solicitud solicitudInsUsrAfiliacionpthisSolicitud) {
        this.solicitudInsUsrAfiliacionpthisSolicitudInstance = solicitudInsUsrAfiliacionpthisSolicitud;
        this.solicitudInsUsrAfiliacionpthisSolicitud = solicitudInsUsrAfiliacionpthisSolicitud != null ? solicitudInsUsrAfiliacionpthisSolicitud.getOid() : null;
    }

    private void checkSolicitudInsUsrAfiliacionpthisSolicitud() throws NotNullArgumentException {
        if(this.getSolicitudInsUsrAfiliacionpthisSolicitudInstance() == null || this.getSolicitudInsUsrAfiliacionpthisSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_INSUSRAFILIACION, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_INSUSRAFILIACION_SOLICITUDINSUSRAFILIACIONPTHISSOLICITUD, SolicitudConstants.SERV_ALIAS_INSUSRAFILIACION, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_INSUSRAFILIACION_SOLICITUDINSUSRAFILIACIONPTHISSOLICITUD);
        }
    }

    @JsonIgnore
    public FuncionarioOid getSolicitudInsUsrAfiliacionpevcFuncionario() {
        return this.solicitudInsUsrAfiliacionpevcFuncionario;
    }
    
    public void setSolicitudInsUsrAfiliacionpevcFuncionario(FuncionarioOid solicitudInsUsrAfiliacionpevcFuncionario) {
        this.solicitudInsUsrAfiliacionpevcFuncionario = solicitudInsUsrAfiliacionpevcFuncionario;
    }

    @JsonIgnore
    public Funcionario getSolicitudInsUsrAfiliacionpevcFuncionarioInstance() {
        return this.solicitudInsUsrAfiliacionpevcFuncionarioInstance;
    }
    
    public void setSolicitudInsUsrAfiliacionpevcFuncionarioInstance(Funcionario solicitudInsUsrAfiliacionpevcFuncionario) {
        this.solicitudInsUsrAfiliacionpevcFuncionarioInstance = solicitudInsUsrAfiliacionpevcFuncionario;
        this.solicitudInsUsrAfiliacionpevcFuncionario = solicitudInsUsrAfiliacionpevcFuncionario != null ? solicitudInsUsrAfiliacionpevcFuncionario.getOid() : null;
    }

    private void checkSolicitudInsUsrAfiliacionpevcFuncionario() throws NotNullArgumentException {
        if(this.getSolicitudInsUsrAfiliacionpevcFuncionarioInstance() == null || this.getSolicitudInsUsrAfiliacionpevcFuncionarioInstance().isNull()) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_INSUSRAFILIACION, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_INSUSRAFILIACION_SOLICITUDINSUSRAFILIACIONPEVCFUNCIONARIO, SolicitudConstants.SERV_ALIAS_INSUSRAFILIACION, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_INSUSRAFILIACION_SOLICITUDINSUSRAFILIACIONPEVCFUNCIONARIO);
        }
    }
}
