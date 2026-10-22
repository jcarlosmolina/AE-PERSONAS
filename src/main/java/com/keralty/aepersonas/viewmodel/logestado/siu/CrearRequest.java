package com.keralty.aepersonas.viewmodel.logestado.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.LogEstadoConstants;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Solicitud;

public class CrearRequest {

    @JsonProperty("p_agrsolicitud_oid")
    private SolicitudOid logEstadocrearpagrSolicitud;
    
    @JsonIgnore
    private Solicitud logEstadocrearpagrSolicitudInstance;

    @JsonProperty("p_atrloginfuncionario")
    private String logEstadocrearpatrLoginFuncionario;

    @JsonProperty("p_atrobservacion")
    private String logEstadocrearpatrObservacion;

    @JsonProperty("p_atrmotdevolucion")
    private String logEstadocrearpatrMotDevolucion;

    @JsonProperty("p_atrestado")
    private Long logEstadocrearpatrEstado;

    @JsonProperty("p_atrestadodoc")
    private Long logEstadocrearpatrEstadoDoc;

    public void checkArguments() throws NotNullArgumentException {
        checkLogEstadocrearpagrSolicitud();
        checkLogEstadocrearpatrLoginFuncionario();
        checkLogEstadocrearpatrEstado();
        checkLogEstadocrearpatrEstadoDoc();
    }

    @JsonIgnore
    public SolicitudOid getLogEstadocrearpagrSolicitud() {
        return this.logEstadocrearpagrSolicitud;
    }
    
    public void setLogEstadocrearpagrSolicitud(SolicitudOid logEstadocrearpagrSolicitud) {
        this.logEstadocrearpagrSolicitud = logEstadocrearpagrSolicitud;
    }

    @JsonIgnore
    public Solicitud getLogEstadocrearpagrSolicitudInstance() {
        return this.logEstadocrearpagrSolicitudInstance;
    }
    
    public void setLogEstadocrearpagrSolicitudInstance(Solicitud logEstadocrearpagrSolicitud) {
        this.logEstadocrearpagrSolicitudInstance = logEstadocrearpagrSolicitud;
        this.logEstadocrearpagrSolicitud = logEstadocrearpagrSolicitud != null ? logEstadocrearpagrSolicitud.getOid() : null;
    }

    private void checkLogEstadocrearpagrSolicitud() throws NotNullArgumentException {
        if(this.getLogEstadocrearpagrSolicitudInstance() == null || this.getLogEstadocrearpagrSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(LogEstadoConstants.SERV_ID_CREAR, LogEstadoConstants.CLASS_ID, LogEstadoConstants.ARG_ID_CREAR_LOGESTADOCREARPAGRSOLICITUD, LogEstadoConstants.SERV_ALIAS_CREAR, LogEstadoConstants.CLASS_ALIAS, LogEstadoConstants.ARG_ALIAS_CREAR_LOGESTADOCREARPAGRSOLICITUD);
        }
    }

    @JsonIgnore
    public String getLogEstadocrearpatrLoginFuncionario() {
        return this.logEstadocrearpatrLoginFuncionario;
    }
    
    public void setLogEstadocrearpatrLoginFuncionario(String logEstadocrearpatrLoginFuncionario) {
        this.logEstadocrearpatrLoginFuncionario = logEstadocrearpatrLoginFuncionario;
    }

    private void checkLogEstadocrearpatrLoginFuncionario() throws NotNullArgumentException {
        if(this.getLogEstadocrearpatrLoginFuncionario() == null) {
            throw new NotNullArgumentException(LogEstadoConstants.SERV_ID_CREAR, LogEstadoConstants.CLASS_ID, LogEstadoConstants.ARG_ID_CREAR_LOGESTADOCREARPATRLOGINFUNCIONARIO, LogEstadoConstants.SERV_ALIAS_CREAR, LogEstadoConstants.CLASS_ALIAS, LogEstadoConstants.ARG_ALIAS_CREAR_LOGESTADOCREARPATRLOGINFUNCIONARIO);
        }
    }

    @JsonIgnore
    public String getLogEstadocrearpatrObservacion() {
        return this.logEstadocrearpatrObservacion;
    }
    
    public void setLogEstadocrearpatrObservacion(String logEstadocrearpatrObservacion) {
        this.logEstadocrearpatrObservacion = logEstadocrearpatrObservacion;
    }

    @JsonIgnore
    public String getLogEstadocrearpatrMotDevolucion() {
        return this.logEstadocrearpatrMotDevolucion;
    }
    
    public void setLogEstadocrearpatrMotDevolucion(String logEstadocrearpatrMotDevolucion) {
        this.logEstadocrearpatrMotDevolucion = logEstadocrearpatrMotDevolucion;
    }

    @JsonIgnore
    public Long getLogEstadocrearpatrEstado() {
        return this.logEstadocrearpatrEstado;
    }
    
    public void setLogEstadocrearpatrEstado(Long logEstadocrearpatrEstado) {
        this.logEstadocrearpatrEstado = logEstadocrearpatrEstado;
    }

    private void checkLogEstadocrearpatrEstado() throws NotNullArgumentException {
        if(this.getLogEstadocrearpatrEstado() == null) {
            throw new NotNullArgumentException(LogEstadoConstants.SERV_ID_CREAR, LogEstadoConstants.CLASS_ID, LogEstadoConstants.ARG_ID_CREAR_LOGESTADOCREARPATRESTADO, LogEstadoConstants.SERV_ALIAS_CREAR, LogEstadoConstants.CLASS_ALIAS, LogEstadoConstants.ARG_ALIAS_CREAR_LOGESTADOCREARPATRESTADO);
        }
    }

    @JsonIgnore
    public Long getLogEstadocrearpatrEstadoDoc() {
        return this.logEstadocrearpatrEstadoDoc;
    }
    
    public void setLogEstadocrearpatrEstadoDoc(Long logEstadocrearpatrEstadoDoc) {
        this.logEstadocrearpatrEstadoDoc = logEstadocrearpatrEstadoDoc;
    }

    private void checkLogEstadocrearpatrEstadoDoc() throws NotNullArgumentException {
        if(this.getLogEstadocrearpatrEstadoDoc() == null) {
            throw new NotNullArgumentException(LogEstadoConstants.SERV_ID_CREAR, LogEstadoConstants.CLASS_ID, LogEstadoConstants.ARG_ID_CREAR_LOGESTADOCREARPATRESTADODOC, LogEstadoConstants.SERV_ALIAS_CREAR, LogEstadoConstants.CLASS_ALIAS, LogEstadoConstants.ARG_ALIAS_CREAR_LOGESTADOCREARPATRESTADODOC);
        }
    }
}
