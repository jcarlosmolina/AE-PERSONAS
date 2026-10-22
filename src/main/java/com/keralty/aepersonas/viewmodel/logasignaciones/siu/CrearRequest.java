package com.keralty.aepersonas.viewmodel.logasignaciones.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.LogAsignacionesConstants;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Solicitud;

public class CrearRequest {

    @JsonProperty("p_agrsolicitud_oid")
    private SolicitudOid logAsignacionescrearpagrSolicitud;
    
    @JsonIgnore
    private Solicitud logAsignacionescrearpagrSolicitudInstance;

    @JsonProperty("p_atrtipo")
    private String logAsignacionescrearpatrTipo;

    @JsonProperty("p_atrusuario")
    private String logAsignacionescrearpatrUsuario;

    @JsonProperty("p_atrquien")
    private String logAsignacionescrearpatrQuien;

    public void checkArguments() throws NotNullArgumentException {
        checkLogAsignacionescrearpagrSolicitud();
        checkLogAsignacionescrearpatrTipo();
        checkLogAsignacionescrearpatrUsuario();
        checkLogAsignacionescrearpatrQuien();
    }

    @JsonIgnore
    public SolicitudOid getLogAsignacionescrearpagrSolicitud() {
        return this.logAsignacionescrearpagrSolicitud;
    }
    
    public void setLogAsignacionescrearpagrSolicitud(SolicitudOid logAsignacionescrearpagrSolicitud) {
        this.logAsignacionescrearpagrSolicitud = logAsignacionescrearpagrSolicitud;
    }

    @JsonIgnore
    public Solicitud getLogAsignacionescrearpagrSolicitudInstance() {
        return this.logAsignacionescrearpagrSolicitudInstance;
    }
    
    public void setLogAsignacionescrearpagrSolicitudInstance(Solicitud logAsignacionescrearpagrSolicitud) {
        this.logAsignacionescrearpagrSolicitudInstance = logAsignacionescrearpagrSolicitud;
        this.logAsignacionescrearpagrSolicitud = logAsignacionescrearpagrSolicitud != null ? logAsignacionescrearpagrSolicitud.getOid() : null;
    }

    private void checkLogAsignacionescrearpagrSolicitud() throws NotNullArgumentException {
        if(this.getLogAsignacionescrearpagrSolicitudInstance() == null || this.getLogAsignacionescrearpagrSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(LogAsignacionesConstants.SERV_ID_CREAR, LogAsignacionesConstants.CLASS_ID, LogAsignacionesConstants.ARG_ID_CREAR_LOGASIGNACIONESCREARPAGRSOLICITUD, LogAsignacionesConstants.SERV_ALIAS_CREAR, LogAsignacionesConstants.CLASS_ALIAS, LogAsignacionesConstants.ARG_ALIAS_CREAR_LOGASIGNACIONESCREARPAGRSOLICITUD);
        }
    }

    @JsonIgnore
    public String getLogAsignacionescrearpatrTipo() {
        return this.logAsignacionescrearpatrTipo;
    }
    
    public void setLogAsignacionescrearpatrTipo(String logAsignacionescrearpatrTipo) {
        this.logAsignacionescrearpatrTipo = logAsignacionescrearpatrTipo;
    }

    private void checkLogAsignacionescrearpatrTipo() throws NotNullArgumentException {
        if(this.getLogAsignacionescrearpatrTipo() == null) {
            throw new NotNullArgumentException(LogAsignacionesConstants.SERV_ID_CREAR, LogAsignacionesConstants.CLASS_ID, LogAsignacionesConstants.ARG_ID_CREAR_LOGASIGNACIONESCREARPATRTIPO, LogAsignacionesConstants.SERV_ALIAS_CREAR, LogAsignacionesConstants.CLASS_ALIAS, LogAsignacionesConstants.ARG_ALIAS_CREAR_LOGASIGNACIONESCREARPATRTIPO);
        }
    }

    @JsonIgnore
    public String getLogAsignacionescrearpatrUsuario() {
        return this.logAsignacionescrearpatrUsuario;
    }
    
    public void setLogAsignacionescrearpatrUsuario(String logAsignacionescrearpatrUsuario) {
        this.logAsignacionescrearpatrUsuario = logAsignacionescrearpatrUsuario;
    }

    private void checkLogAsignacionescrearpatrUsuario() throws NotNullArgumentException {
        if(this.getLogAsignacionescrearpatrUsuario() == null) {
            throw new NotNullArgumentException(LogAsignacionesConstants.SERV_ID_CREAR, LogAsignacionesConstants.CLASS_ID, LogAsignacionesConstants.ARG_ID_CREAR_LOGASIGNACIONESCREARPATRUSUARIO, LogAsignacionesConstants.SERV_ALIAS_CREAR, LogAsignacionesConstants.CLASS_ALIAS, LogAsignacionesConstants.ARG_ALIAS_CREAR_LOGASIGNACIONESCREARPATRUSUARIO);
        }
    }

    @JsonIgnore
    public String getLogAsignacionescrearpatrQuien() {
        return this.logAsignacionescrearpatrQuien;
    }
    
    public void setLogAsignacionescrearpatrQuien(String logAsignacionescrearpatrQuien) {
        this.logAsignacionescrearpatrQuien = logAsignacionescrearpatrQuien;
    }

    private void checkLogAsignacionescrearpatrQuien() throws NotNullArgumentException {
        if(this.getLogAsignacionescrearpatrQuien() == null) {
            throw new NotNullArgumentException(LogAsignacionesConstants.SERV_ID_CREAR, LogAsignacionesConstants.CLASS_ID, LogAsignacionesConstants.ARG_ID_CREAR_LOGASIGNACIONESCREARPATRQUIEN, LogAsignacionesConstants.SERV_ALIAS_CREAR, LogAsignacionesConstants.CLASS_ALIAS, LogAsignacionesConstants.ARG_ALIAS_CREAR_LOGASIGNACIONESCREARPATRQUIEN);
        }
    }
}
