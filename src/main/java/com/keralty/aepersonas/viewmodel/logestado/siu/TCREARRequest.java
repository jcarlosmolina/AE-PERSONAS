package com.keralty.aepersonas.viewmodel.logestado.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.LogEstadoConstants;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Solicitud;

public class TCREARRequest {

    @JsonProperty("pt_p_agrsolicitud_oid")
    private SolicitudOid logEstadoTCREARptpagrSolicitud;
    
    @JsonIgnore
    private Solicitud logEstadoTCREARptpagrSolicitudInstance;

    @JsonProperty("pt_p_atrobservacion")
    private String logEstadoTCREARptpatrObservacion;

    @JsonProperty("pt_p_atrmotdevolucion")
    private String logEstadoTCREARptpatrMotDevolucion;

    @JsonProperty("pt_p_atrestado")
    private Long logEstadoTCREARptpatrEstado;

    @JsonProperty("pt_p_atrestadodoc")
    private Long logEstadoTCREARptpatrEstadoDoc;

    public void checkArguments() throws NotNullArgumentException {
        checkLogEstadoTCREARptpagrSolicitud();
        checkLogEstadoTCREARptpatrEstado();
        checkLogEstadoTCREARptpatrEstadoDoc();
    }

    @JsonIgnore
    public SolicitudOid getLogEstadoTCREARptpagrSolicitud() {
        return this.logEstadoTCREARptpagrSolicitud;
    }
    
    public void setLogEstadoTCREARptpagrSolicitud(SolicitudOid logEstadoTCREARptpagrSolicitud) {
        this.logEstadoTCREARptpagrSolicitud = logEstadoTCREARptpagrSolicitud;
    }

    @JsonIgnore
    public Solicitud getLogEstadoTCREARptpagrSolicitudInstance() {
        return this.logEstadoTCREARptpagrSolicitudInstance;
    }
    
    public void setLogEstadoTCREARptpagrSolicitudInstance(Solicitud logEstadoTCREARptpagrSolicitud) {
        this.logEstadoTCREARptpagrSolicitudInstance = logEstadoTCREARptpagrSolicitud;
        this.logEstadoTCREARptpagrSolicitud = logEstadoTCREARptpagrSolicitud != null ? logEstadoTCREARptpagrSolicitud.getOid() : null;
    }

    private void checkLogEstadoTCREARptpagrSolicitud() throws NotNullArgumentException {
        if(this.getLogEstadoTCREARptpagrSolicitudInstance() == null || this.getLogEstadoTCREARptpagrSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(LogEstadoConstants.SERV_ID_TCREAR, LogEstadoConstants.CLASS_ID, LogEstadoConstants.ARG_ID_TCREAR_LOGESTADOTCREARPTPAGRSOLICITUD, LogEstadoConstants.SERV_ALIAS_TCREAR, LogEstadoConstants.CLASS_ALIAS, LogEstadoConstants.ARG_ALIAS_TCREAR_LOGESTADOTCREARPTPAGRSOLICITUD);
        }
    }

    @JsonIgnore
    public String getLogEstadoTCREARptpatrObservacion() {
        return this.logEstadoTCREARptpatrObservacion;
    }
    
    public void setLogEstadoTCREARptpatrObservacion(String logEstadoTCREARptpatrObservacion) {
        this.logEstadoTCREARptpatrObservacion = logEstadoTCREARptpatrObservacion;
    }

    @JsonIgnore
    public String getLogEstadoTCREARptpatrMotDevolucion() {
        return this.logEstadoTCREARptpatrMotDevolucion;
    }
    
    public void setLogEstadoTCREARptpatrMotDevolucion(String logEstadoTCREARptpatrMotDevolucion) {
        this.logEstadoTCREARptpatrMotDevolucion = logEstadoTCREARptpatrMotDevolucion;
    }

    @JsonIgnore
    public Long getLogEstadoTCREARptpatrEstado() {
        return this.logEstadoTCREARptpatrEstado;
    }
    
    public void setLogEstadoTCREARptpatrEstado(Long logEstadoTCREARptpatrEstado) {
        this.logEstadoTCREARptpatrEstado = logEstadoTCREARptpatrEstado;
    }

    private void checkLogEstadoTCREARptpatrEstado() throws NotNullArgumentException {
        if(this.getLogEstadoTCREARptpatrEstado() == null) {
            throw new NotNullArgumentException(LogEstadoConstants.SERV_ID_TCREAR, LogEstadoConstants.CLASS_ID, LogEstadoConstants.ARG_ID_TCREAR_LOGESTADOTCREARPTPATRESTADO, LogEstadoConstants.SERV_ALIAS_TCREAR, LogEstadoConstants.CLASS_ALIAS, LogEstadoConstants.ARG_ALIAS_TCREAR_LOGESTADOTCREARPTPATRESTADO);
        }
    }

    @JsonIgnore
    public Long getLogEstadoTCREARptpatrEstadoDoc() {
        return this.logEstadoTCREARptpatrEstadoDoc;
    }
    
    public void setLogEstadoTCREARptpatrEstadoDoc(Long logEstadoTCREARptpatrEstadoDoc) {
        this.logEstadoTCREARptpatrEstadoDoc = logEstadoTCREARptpatrEstadoDoc;
    }

    private void checkLogEstadoTCREARptpatrEstadoDoc() throws NotNullArgumentException {
        if(this.getLogEstadoTCREARptpatrEstadoDoc() == null) {
            throw new NotNullArgumentException(LogEstadoConstants.SERV_ID_TCREAR, LogEstadoConstants.CLASS_ID, LogEstadoConstants.ARG_ID_TCREAR_LOGESTADOTCREARPTPATRESTADODOC, LogEstadoConstants.SERV_ALIAS_TCREAR, LogEstadoConstants.CLASS_ALIAS, LogEstadoConstants.ARG_ALIAS_TCREAR_LOGESTADOTCREARPTPATRESTADODOC);
        }
    }
}
