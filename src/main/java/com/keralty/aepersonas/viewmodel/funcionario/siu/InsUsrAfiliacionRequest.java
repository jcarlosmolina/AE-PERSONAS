package com.keralty.aepersonas.viewmodel.funcionario.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.FuncionarioConstants;
import com.keralty.aepersonas.persistence.Funcionario;
import com.keralty.aepersonas.persistence.oid.FuncionarioOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Solicitud;

public class InsUsrAfiliacionRequest {

    @JsonProperty("p_thisfuncionario_oid")
    private FuncionarioOid funcionarioInsUsrAfiliacionpthisFuncionario;
    
    @JsonIgnore
    private Funcionario funcionarioInsUsrAfiliacionpthisFuncionarioInstance;

    @JsonProperty("p_evcsolicitud_oid")
    private SolicitudOid funcionarioInsUsrAfiliacionpevcSolicitud;
    
    @JsonIgnore
    private Solicitud funcionarioInsUsrAfiliacionpevcSolicitudInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkFuncionarioInsUsrAfiliacionpthisFuncionario();
        checkFuncionarioInsUsrAfiliacionpevcSolicitud();
    }

    @JsonIgnore
    public FuncionarioOid getFuncionarioInsUsrAfiliacionpthisFuncionario() {
        return this.funcionarioInsUsrAfiliacionpthisFuncionario;
    }
    
    public void setFuncionarioInsUsrAfiliacionpthisFuncionario(FuncionarioOid funcionarioInsUsrAfiliacionpthisFuncionario) {
        this.funcionarioInsUsrAfiliacionpthisFuncionario = funcionarioInsUsrAfiliacionpthisFuncionario;
    }

    @JsonIgnore
    public Funcionario getFuncionarioInsUsrAfiliacionpthisFuncionarioInstance() {
        return this.funcionarioInsUsrAfiliacionpthisFuncionarioInstance;
    }
    
    public void setFuncionarioInsUsrAfiliacionpthisFuncionarioInstance(Funcionario funcionarioInsUsrAfiliacionpthisFuncionario) {
        this.funcionarioInsUsrAfiliacionpthisFuncionarioInstance = funcionarioInsUsrAfiliacionpthisFuncionario;
        this.funcionarioInsUsrAfiliacionpthisFuncionario = funcionarioInsUsrAfiliacionpthisFuncionario != null ? funcionarioInsUsrAfiliacionpthisFuncionario.getOid() : null;
    }

    private void checkFuncionarioInsUsrAfiliacionpthisFuncionario() throws NotNullArgumentException {
        if(this.getFuncionarioInsUsrAfiliacionpthisFuncionarioInstance() == null || this.getFuncionarioInsUsrAfiliacionpthisFuncionarioInstance().isNull()) {
            throw new NotNullArgumentException(FuncionarioConstants.SERV_ID_INSUSRAFILIACION, FuncionarioConstants.CLASS_ID, FuncionarioConstants.ARG_ID_INSUSRAFILIACION_FUNCIONARIOINSUSRAFILIACIONPTHISFUNCIONARIO, FuncionarioConstants.SERV_ALIAS_INSUSRAFILIACION, FuncionarioConstants.CLASS_ALIAS, FuncionarioConstants.ARG_ALIAS_INSUSRAFILIACION_FUNCIONARIOINSUSRAFILIACIONPTHISFUNCIONARIO);
        }
    }

    @JsonIgnore
    public SolicitudOid getFuncionarioInsUsrAfiliacionpevcSolicitud() {
        return this.funcionarioInsUsrAfiliacionpevcSolicitud;
    }
    
    public void setFuncionarioInsUsrAfiliacionpevcSolicitud(SolicitudOid funcionarioInsUsrAfiliacionpevcSolicitud) {
        this.funcionarioInsUsrAfiliacionpevcSolicitud = funcionarioInsUsrAfiliacionpevcSolicitud;
    }

    @JsonIgnore
    public Solicitud getFuncionarioInsUsrAfiliacionpevcSolicitudInstance() {
        return this.funcionarioInsUsrAfiliacionpevcSolicitudInstance;
    }
    
    public void setFuncionarioInsUsrAfiliacionpevcSolicitudInstance(Solicitud funcionarioInsUsrAfiliacionpevcSolicitud) {
        this.funcionarioInsUsrAfiliacionpevcSolicitudInstance = funcionarioInsUsrAfiliacionpevcSolicitud;
        this.funcionarioInsUsrAfiliacionpevcSolicitud = funcionarioInsUsrAfiliacionpevcSolicitud != null ? funcionarioInsUsrAfiliacionpevcSolicitud.getOid() : null;
    }

    private void checkFuncionarioInsUsrAfiliacionpevcSolicitud() throws NotNullArgumentException {
        if(this.getFuncionarioInsUsrAfiliacionpevcSolicitudInstance() == null || this.getFuncionarioInsUsrAfiliacionpevcSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(FuncionarioConstants.SERV_ID_INSUSRAFILIACION, FuncionarioConstants.CLASS_ID, FuncionarioConstants.ARG_ID_INSUSRAFILIACION_FUNCIONARIOINSUSRAFILIACIONPEVCSOLICITUD, FuncionarioConstants.SERV_ALIAS_INSUSRAFILIACION, FuncionarioConstants.CLASS_ALIAS, FuncionarioConstants.ARG_ALIAS_INSUSRAFILIACION_FUNCIONARIOINSUSRAFILIACIONPEVCSOLICITUD);
        }
    }
}
