package com.keralty.aepersonas.viewmodel.solicitud.ds;

import java.sql.Date;
import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Solicitud;
public class DSSolicitudPIUStatusAfil {

    @JsonProperty("aesolicitudes_productot_descripcion")
    private String dSSolicitudPIUStatusAfilAesolicitudesDotProductoTDotDescripcion;

    @JsonProperty("aesolicitudes_plant_nombre")
    private String dSSolicitudPIUStatusAfilAesolicitudesDotPlanTDotNombre;

    @JsonProperty("estadodoc")
    private Long dSSolicitudPIUStatusAfilEstadoDoc;

    @JsonProperty("drvestadohomologado")
    private Long dSSolicitudPIUStatusAfilDrvEstadoHomologado;

    @JsonProperty("fechacompletada")
    private Timestamp dSSolicitudPIUStatusAfilFechaCompletada;

    @JsonProperty("fechaultimodoc")
    private Timestamp dSSolicitudPIUStatusAfilFechaUltimoDoc;

    @JsonProperty("finiciocontrato")
    private Date dSSolicitudPIUStatusAfilFInicioContrato;

    @JsonProperty("aesolicitudes_numerosolicitud")
    private String dSSolicitudPIUStatusAfilAesolicitudesDotNumerosolicitud;

    @JsonProperty("tramite")
    private Long dSSolicitudPIUStatusAfilTramite;

    @JsonProperty("drvnumcontrato")
    private String dSSolicitudPIUStatusAfilDrvNumContrato;

    @JsonProperty("prioridad")
    private Long dSSolicitudPIUStatusAfilPrioridad;

    @JsonProperty("drvsemaforograbase")
    private Double dSSolicitudPIUStatusAfilDrvSemaforoGrabAse;

    @JsonProperty("agente_drvnombrecompleto")
    private String dSSolicitudPIUStatusAfilAgenteDotDrvNombreCompleto;

    public DSSolicitudPIUStatusAfil() {
    
    }

    public DSSolicitudPIUStatusAfil(Solicitud instance) {
        if (instance != null) {
            try {
                this.dSSolicitudPIUStatusAfilAesolicitudesDotProductoTDotDescripcion = instance.getAesolicitudes().getProductoT().getProductosDescripcion();
                this.dSSolicitudPIUStatusAfilAesolicitudesDotPlanTDotNombre = instance.getAesolicitudes().getPlanT().getPlanesNombre();
                this.dSSolicitudPIUStatusAfilEstadoDoc = instance.getSolicitudEstadoDoc();
                this.dSSolicitudPIUStatusAfilDrvEstadoHomologado = instance.getSolicitudDrvEstadoHomologado();
                this.dSSolicitudPIUStatusAfilFechaCompletada = instance.getSolicitudFechaCompletada();
                this.dSSolicitudPIUStatusAfilFechaUltimoDoc = instance.getSolicitudFechaUltimoDoc();
                this.dSSolicitudPIUStatusAfilFInicioContrato = instance.getSolicitudFInicioContrato();
                this.dSSolicitudPIUStatusAfilAesolicitudesDotNumerosolicitud = instance.getAesolicitudes().getAesolicitudesNumerosolicitud();
                this.dSSolicitudPIUStatusAfilTramite = instance.getSolicitudTramite();
                this.dSSolicitudPIUStatusAfilDrvNumContrato = instance.getSolicituddrvNumContrato();
                this.dSSolicitudPIUStatusAfilPrioridad = instance.getSolicitudPrioridad();
                this.dSSolicitudPIUStatusAfilDrvSemaforoGrabAse = instance.getSolicituddrvSemaforoGrabAse();
                this.dSSolicitudPIUStatusAfilAgenteDotDrvNombreCompleto = instance.getAgente().getFuncionariodrvNombreCompleto();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusAfilAesolicitudesDotProductoTDotDescripcion() {
        return this.dSSolicitudPIUStatusAfilAesolicitudesDotProductoTDotDescripcion;
    }
    
    public void setDSSolicitudPIUStatusAfilAesolicitudesDotProductoTDotDescripcion(String dSSolicitudPIUStatusAfilAesolicitudesDotProductoTDotDescripcion) {
        this.dSSolicitudPIUStatusAfilAesolicitudesDotProductoTDotDescripcion = dSSolicitudPIUStatusAfilAesolicitudesDotProductoTDotDescripcion;
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusAfilAesolicitudesDotPlanTDotNombre() {
        return this.dSSolicitudPIUStatusAfilAesolicitudesDotPlanTDotNombre;
    }
    
    public void setDSSolicitudPIUStatusAfilAesolicitudesDotPlanTDotNombre(String dSSolicitudPIUStatusAfilAesolicitudesDotPlanTDotNombre) {
        this.dSSolicitudPIUStatusAfilAesolicitudesDotPlanTDotNombre = dSSolicitudPIUStatusAfilAesolicitudesDotPlanTDotNombre;
    }

    @JsonIgnore
    public Long getDSSolicitudPIUStatusAfilEstadoDoc() {
        return this.dSSolicitudPIUStatusAfilEstadoDoc;
    }
    
    public void setDSSolicitudPIUStatusAfilEstadoDoc(Long dSSolicitudPIUStatusAfilEstadoDoc) {
        this.dSSolicitudPIUStatusAfilEstadoDoc = dSSolicitudPIUStatusAfilEstadoDoc;
    }

    @JsonIgnore
    public Long getDSSolicitudPIUStatusAfilDrvEstadoHomologado() {
        return this.dSSolicitudPIUStatusAfilDrvEstadoHomologado;
    }
    
    public void setDSSolicitudPIUStatusAfilDrvEstadoHomologado(Long dSSolicitudPIUStatusAfilDrvEstadoHomologado) {
        this.dSSolicitudPIUStatusAfilDrvEstadoHomologado = dSSolicitudPIUStatusAfilDrvEstadoHomologado;
    }

    @JsonIgnore
    public Timestamp getDSSolicitudPIUStatusAfilFechaCompletada() {
        return this.dSSolicitudPIUStatusAfilFechaCompletada;
    }
    
    public void setDSSolicitudPIUStatusAfilFechaCompletada(Timestamp dSSolicitudPIUStatusAfilFechaCompletada) {
        this.dSSolicitudPIUStatusAfilFechaCompletada = dSSolicitudPIUStatusAfilFechaCompletada;
    }

    @JsonIgnore
    public Timestamp getDSSolicitudPIUStatusAfilFechaUltimoDoc() {
        return this.dSSolicitudPIUStatusAfilFechaUltimoDoc;
    }
    
    public void setDSSolicitudPIUStatusAfilFechaUltimoDoc(Timestamp dSSolicitudPIUStatusAfilFechaUltimoDoc) {
        this.dSSolicitudPIUStatusAfilFechaUltimoDoc = dSSolicitudPIUStatusAfilFechaUltimoDoc;
    }

    @JsonIgnore
    public Date getDSSolicitudPIUStatusAfilFInicioContrato() {
        return this.dSSolicitudPIUStatusAfilFInicioContrato;
    }
    
    public void setDSSolicitudPIUStatusAfilFInicioContrato(Date dSSolicitudPIUStatusAfilFInicioContrato) {
        this.dSSolicitudPIUStatusAfilFInicioContrato = dSSolicitudPIUStatusAfilFInicioContrato;
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusAfilAesolicitudesDotNumerosolicitud() {
        return this.dSSolicitudPIUStatusAfilAesolicitudesDotNumerosolicitud;
    }
    
    public void setDSSolicitudPIUStatusAfilAesolicitudesDotNumerosolicitud(String dSSolicitudPIUStatusAfilAesolicitudesDotNumerosolicitud) {
        this.dSSolicitudPIUStatusAfilAesolicitudesDotNumerosolicitud = dSSolicitudPIUStatusAfilAesolicitudesDotNumerosolicitud;
    }

    @JsonIgnore
    public Long getDSSolicitudPIUStatusAfilTramite() {
        return this.dSSolicitudPIUStatusAfilTramite;
    }
    
    public void setDSSolicitudPIUStatusAfilTramite(Long dSSolicitudPIUStatusAfilTramite) {
        this.dSSolicitudPIUStatusAfilTramite = dSSolicitudPIUStatusAfilTramite;
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusAfilDrvNumContrato() {
        return this.dSSolicitudPIUStatusAfilDrvNumContrato;
    }
    
    public void setDSSolicitudPIUStatusAfilDrvNumContrato(String dSSolicitudPIUStatusAfilDrvNumContrato) {
        this.dSSolicitudPIUStatusAfilDrvNumContrato = dSSolicitudPIUStatusAfilDrvNumContrato;
    }

    @JsonIgnore
    public Long getDSSolicitudPIUStatusAfilPrioridad() {
        return this.dSSolicitudPIUStatusAfilPrioridad;
    }
    
    public void setDSSolicitudPIUStatusAfilPrioridad(Long dSSolicitudPIUStatusAfilPrioridad) {
        this.dSSolicitudPIUStatusAfilPrioridad = dSSolicitudPIUStatusAfilPrioridad;
    }

    @JsonIgnore
    public Double getDSSolicitudPIUStatusAfilDrvSemaforoGrabAse() {
        return this.dSSolicitudPIUStatusAfilDrvSemaforoGrabAse;
    }
    
    public void setDSSolicitudPIUStatusAfilDrvSemaforoGrabAse(Double dSSolicitudPIUStatusAfilDrvSemaforoGrabAse) {
        this.dSSolicitudPIUStatusAfilDrvSemaforoGrabAse = dSSolicitudPIUStatusAfilDrvSemaforoGrabAse;
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusAfilAgenteDotDrvNombreCompleto() {
        return this.dSSolicitudPIUStatusAfilAgenteDotDrvNombreCompleto;
    }
    
    public void setDSSolicitudPIUStatusAfilAgenteDotDrvNombreCompleto(String dSSolicitudPIUStatusAfilAgenteDotDrvNombreCompleto) {
        this.dSSolicitudPIUStatusAfilAgenteDotDrvNombreCompleto = dSSolicitudPIUStatusAfilAgenteDotDrvNombreCompleto;
    }
}
