package com.keralty.aepersonas.viewmodel.logasignaciones.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.LogAsignacionesConstants;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Solicitud;

public class TCREARRequest {

    @JsonProperty("pt_p_agrsolicitud_oid")
    private SolicitudOid logAsignacionesTCREARptpagrSolicitud;
    
    @JsonIgnore
    private Solicitud logAsignacionesTCREARptpagrSolicitudInstance;

    @JsonProperty("pt_p_atrtipo")
    private String logAsignacionesTCREARptpatrTipo;

    @JsonProperty("pt_p_atrusuario")
    private String logAsignacionesTCREARptpatrUsuario;

    public void checkArguments() throws NotNullArgumentException {
        checkLogAsignacionesTCREARptpagrSolicitud();
        checkLogAsignacionesTCREARptpatrTipo();
        checkLogAsignacionesTCREARptpatrUsuario();
    }

    @JsonIgnore
    public SolicitudOid getLogAsignacionesTCREARptpagrSolicitud() {
        return this.logAsignacionesTCREARptpagrSolicitud;
    }
    
    public void setLogAsignacionesTCREARptpagrSolicitud(SolicitudOid logAsignacionesTCREARptpagrSolicitud) {
        this.logAsignacionesTCREARptpagrSolicitud = logAsignacionesTCREARptpagrSolicitud;
    }

    @JsonIgnore
    public Solicitud getLogAsignacionesTCREARptpagrSolicitudInstance() {
        return this.logAsignacionesTCREARptpagrSolicitudInstance;
    }
    
    public void setLogAsignacionesTCREARptpagrSolicitudInstance(Solicitud logAsignacionesTCREARptpagrSolicitud) {
        this.logAsignacionesTCREARptpagrSolicitudInstance = logAsignacionesTCREARptpagrSolicitud;
        this.logAsignacionesTCREARptpagrSolicitud = logAsignacionesTCREARptpagrSolicitud != null ? logAsignacionesTCREARptpagrSolicitud.getOid() : null;
    }

    private void checkLogAsignacionesTCREARptpagrSolicitud() throws NotNullArgumentException {
        if(this.getLogAsignacionesTCREARptpagrSolicitudInstance() == null || this.getLogAsignacionesTCREARptpagrSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(LogAsignacionesConstants.SERV_ID_TCREAR, LogAsignacionesConstants.CLASS_ID, LogAsignacionesConstants.ARG_ID_TCREAR_LOGASIGNACIONESTCREARPTPAGRSOLICITUD, LogAsignacionesConstants.SERV_ALIAS_TCREAR, LogAsignacionesConstants.CLASS_ALIAS, LogAsignacionesConstants.ARG_ALIAS_TCREAR_LOGASIGNACIONESTCREARPTPAGRSOLICITUD);
        }
    }

    @JsonIgnore
    public String getLogAsignacionesTCREARptpatrTipo() {
        return this.logAsignacionesTCREARptpatrTipo;
    }
    
    public void setLogAsignacionesTCREARptpatrTipo(String logAsignacionesTCREARptpatrTipo) {
        this.logAsignacionesTCREARptpatrTipo = logAsignacionesTCREARptpatrTipo;
    }

    private void checkLogAsignacionesTCREARptpatrTipo() throws NotNullArgumentException {
        if(this.getLogAsignacionesTCREARptpatrTipo() == null) {
            throw new NotNullArgumentException(LogAsignacionesConstants.SERV_ID_TCREAR, LogAsignacionesConstants.CLASS_ID, LogAsignacionesConstants.ARG_ID_TCREAR_LOGASIGNACIONESTCREARPTPATRTIPO, LogAsignacionesConstants.SERV_ALIAS_TCREAR, LogAsignacionesConstants.CLASS_ALIAS, LogAsignacionesConstants.ARG_ALIAS_TCREAR_LOGASIGNACIONESTCREARPTPATRTIPO);
        }
    }

    @JsonIgnore
    public String getLogAsignacionesTCREARptpatrUsuario() {
        return this.logAsignacionesTCREARptpatrUsuario;
    }
    
    public void setLogAsignacionesTCREARptpatrUsuario(String logAsignacionesTCREARptpatrUsuario) {
        this.logAsignacionesTCREARptpatrUsuario = logAsignacionesTCREARptpatrUsuario;
    }

    private void checkLogAsignacionesTCREARptpatrUsuario() throws NotNullArgumentException {
        if(this.getLogAsignacionesTCREARptpatrUsuario() == null) {
            throw new NotNullArgumentException(LogAsignacionesConstants.SERV_ID_TCREAR, LogAsignacionesConstants.CLASS_ID, LogAsignacionesConstants.ARG_ID_TCREAR_LOGASIGNACIONESTCREARPTPATRUSUARIO, LogAsignacionesConstants.SERV_ALIAS_TCREAR, LogAsignacionesConstants.CLASS_ALIAS, LogAsignacionesConstants.ARG_ALIAS_TCREAR_LOGASIGNACIONESTCREARPTPATRUSUARIO);
        }
    }
}
