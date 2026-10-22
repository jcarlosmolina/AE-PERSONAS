package com.keralty.aepersonas.viewmodel.solicitud.ds;

import java.sql.Date;
import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Solicitud;
public class DSSolicitudPIUStatusAsesor {

    @JsonProperty("aesolicitudes_productot_descripcion")
    private String dSSolicitudPIUStatusAsesorAesolicitudesDotProductoTDotDescripcion;

    @JsonProperty("aesolicitudes_plant_nombre")
    private String dSSolicitudPIUStatusAsesorAesolicitudesDotPlanTDotNombre;

    @JsonProperty("estadodoc")
    private Long dSSolicitudPIUStatusAsesorEstadoDoc;

    @JsonProperty("drvestadohomologado")
    private Long dSSolicitudPIUStatusAsesorDrvEstadoHomologado;

    @JsonProperty("fechacompletada")
    private Timestamp dSSolicitudPIUStatusAsesorFechaCompletada;

    @JsonProperty("fechaultimodoc")
    private Timestamp dSSolicitudPIUStatusAsesorFechaUltimoDoc;

    @JsonProperty("finiciocontrato")
    private Date dSSolicitudPIUStatusAsesorFInicioContrato;

    @JsonProperty("aesolicitudes_numerosolicitud")
    private String dSSolicitudPIUStatusAsesorAesolicitudesDotNumerosolicitud;

    @JsonProperty("tramite")
    private Long dSSolicitudPIUStatusAsesorTramite;

    @JsonProperty("drvnumcontrato")
    private String dSSolicitudPIUStatusAsesorDrvNumContrato;

    @JsonProperty("prioridad")
    private Long dSSolicitudPIUStatusAsesorPrioridad;

    @JsonProperty("agente_drvnombrecompleto")
    private String dSSolicitudPIUStatusAsesorAgenteDotDrvNombreCompleto;

    public DSSolicitudPIUStatusAsesor() {
    
    }

    public DSSolicitudPIUStatusAsesor(Solicitud instance) {
        if (instance != null) {
            try {
                this.dSSolicitudPIUStatusAsesorAesolicitudesDotProductoTDotDescripcion = instance.getAesolicitudes().getProductoT().getProductosDescripcion();
                this.dSSolicitudPIUStatusAsesorAesolicitudesDotPlanTDotNombre = instance.getAesolicitudes().getPlanT().getPlanesNombre();
                this.dSSolicitudPIUStatusAsesorEstadoDoc = instance.getSolicitudEstadoDoc();
                this.dSSolicitudPIUStatusAsesorDrvEstadoHomologado = instance.getSolicitudDrvEstadoHomologado();
                this.dSSolicitudPIUStatusAsesorFechaCompletada = instance.getSolicitudFechaCompletada();
                this.dSSolicitudPIUStatusAsesorFechaUltimoDoc = instance.getSolicitudFechaUltimoDoc();
                this.dSSolicitudPIUStatusAsesorFInicioContrato = instance.getSolicitudFInicioContrato();
                this.dSSolicitudPIUStatusAsesorAesolicitudesDotNumerosolicitud = instance.getAesolicitudes().getAesolicitudesNumerosolicitud();
                this.dSSolicitudPIUStatusAsesorTramite = instance.getSolicitudTramite();
                this.dSSolicitudPIUStatusAsesorDrvNumContrato = instance.getSolicituddrvNumContrato();
                this.dSSolicitudPIUStatusAsesorPrioridad = instance.getSolicitudPrioridad();
                this.dSSolicitudPIUStatusAsesorAgenteDotDrvNombreCompleto = instance.getAgente().getFuncionariodrvNombreCompleto();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusAsesorAesolicitudesDotProductoTDotDescripcion() {
        return this.dSSolicitudPIUStatusAsesorAesolicitudesDotProductoTDotDescripcion;
    }
    
    public void setDSSolicitudPIUStatusAsesorAesolicitudesDotProductoTDotDescripcion(String dSSolicitudPIUStatusAsesorAesolicitudesDotProductoTDotDescripcion) {
        this.dSSolicitudPIUStatusAsesorAesolicitudesDotProductoTDotDescripcion = dSSolicitudPIUStatusAsesorAesolicitudesDotProductoTDotDescripcion;
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusAsesorAesolicitudesDotPlanTDotNombre() {
        return this.dSSolicitudPIUStatusAsesorAesolicitudesDotPlanTDotNombre;
    }
    
    public void setDSSolicitudPIUStatusAsesorAesolicitudesDotPlanTDotNombre(String dSSolicitudPIUStatusAsesorAesolicitudesDotPlanTDotNombre) {
        this.dSSolicitudPIUStatusAsesorAesolicitudesDotPlanTDotNombre = dSSolicitudPIUStatusAsesorAesolicitudesDotPlanTDotNombre;
    }

    @JsonIgnore
    public Long getDSSolicitudPIUStatusAsesorEstadoDoc() {
        return this.dSSolicitudPIUStatusAsesorEstadoDoc;
    }
    
    public void setDSSolicitudPIUStatusAsesorEstadoDoc(Long dSSolicitudPIUStatusAsesorEstadoDoc) {
        this.dSSolicitudPIUStatusAsesorEstadoDoc = dSSolicitudPIUStatusAsesorEstadoDoc;
    }

    @JsonIgnore
    public Long getDSSolicitudPIUStatusAsesorDrvEstadoHomologado() {
        return this.dSSolicitudPIUStatusAsesorDrvEstadoHomologado;
    }
    
    public void setDSSolicitudPIUStatusAsesorDrvEstadoHomologado(Long dSSolicitudPIUStatusAsesorDrvEstadoHomologado) {
        this.dSSolicitudPIUStatusAsesorDrvEstadoHomologado = dSSolicitudPIUStatusAsesorDrvEstadoHomologado;
    }

    @JsonIgnore
    public Timestamp getDSSolicitudPIUStatusAsesorFechaCompletada() {
        return this.dSSolicitudPIUStatusAsesorFechaCompletada;
    }
    
    public void setDSSolicitudPIUStatusAsesorFechaCompletada(Timestamp dSSolicitudPIUStatusAsesorFechaCompletada) {
        this.dSSolicitudPIUStatusAsesorFechaCompletada = dSSolicitudPIUStatusAsesorFechaCompletada;
    }

    @JsonIgnore
    public Timestamp getDSSolicitudPIUStatusAsesorFechaUltimoDoc() {
        return this.dSSolicitudPIUStatusAsesorFechaUltimoDoc;
    }
    
    public void setDSSolicitudPIUStatusAsesorFechaUltimoDoc(Timestamp dSSolicitudPIUStatusAsesorFechaUltimoDoc) {
        this.dSSolicitudPIUStatusAsesorFechaUltimoDoc = dSSolicitudPIUStatusAsesorFechaUltimoDoc;
    }

    @JsonIgnore
    public Date getDSSolicitudPIUStatusAsesorFInicioContrato() {
        return this.dSSolicitudPIUStatusAsesorFInicioContrato;
    }
    
    public void setDSSolicitudPIUStatusAsesorFInicioContrato(Date dSSolicitudPIUStatusAsesorFInicioContrato) {
        this.dSSolicitudPIUStatusAsesorFInicioContrato = dSSolicitudPIUStatusAsesorFInicioContrato;
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusAsesorAesolicitudesDotNumerosolicitud() {
        return this.dSSolicitudPIUStatusAsesorAesolicitudesDotNumerosolicitud;
    }
    
    public void setDSSolicitudPIUStatusAsesorAesolicitudesDotNumerosolicitud(String dSSolicitudPIUStatusAsesorAesolicitudesDotNumerosolicitud) {
        this.dSSolicitudPIUStatusAsesorAesolicitudesDotNumerosolicitud = dSSolicitudPIUStatusAsesorAesolicitudesDotNumerosolicitud;
    }

    @JsonIgnore
    public Long getDSSolicitudPIUStatusAsesorTramite() {
        return this.dSSolicitudPIUStatusAsesorTramite;
    }
    
    public void setDSSolicitudPIUStatusAsesorTramite(Long dSSolicitudPIUStatusAsesorTramite) {
        this.dSSolicitudPIUStatusAsesorTramite = dSSolicitudPIUStatusAsesorTramite;
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusAsesorDrvNumContrato() {
        return this.dSSolicitudPIUStatusAsesorDrvNumContrato;
    }
    
    public void setDSSolicitudPIUStatusAsesorDrvNumContrato(String dSSolicitudPIUStatusAsesorDrvNumContrato) {
        this.dSSolicitudPIUStatusAsesorDrvNumContrato = dSSolicitudPIUStatusAsesorDrvNumContrato;
    }

    @JsonIgnore
    public Long getDSSolicitudPIUStatusAsesorPrioridad() {
        return this.dSSolicitudPIUStatusAsesorPrioridad;
    }
    
    public void setDSSolicitudPIUStatusAsesorPrioridad(Long dSSolicitudPIUStatusAsesorPrioridad) {
        this.dSSolicitudPIUStatusAsesorPrioridad = dSSolicitudPIUStatusAsesorPrioridad;
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusAsesorAgenteDotDrvNombreCompleto() {
        return this.dSSolicitudPIUStatusAsesorAgenteDotDrvNombreCompleto;
    }
    
    public void setDSSolicitudPIUStatusAsesorAgenteDotDrvNombreCompleto(String dSSolicitudPIUStatusAsesorAgenteDotDrvNombreCompleto) {
        this.dSSolicitudPIUStatusAsesorAgenteDotDrvNombreCompleto = dSSolicitudPIUStatusAsesorAgenteDotDrvNombreCompleto;
    }
}
