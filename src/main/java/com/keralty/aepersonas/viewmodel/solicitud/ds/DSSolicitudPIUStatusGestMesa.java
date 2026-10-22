package com.keralty.aepersonas.viewmodel.solicitud.ds;

import java.sql.Date;
import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Solicitud;
public class DSSolicitudPIUStatusGestMesa {

    @JsonProperty("aesolicitudes_productot_descripcion")
    private String dSSolicitudPIUStatusGestMesaAesolicitudesDotProductoTDotDescripcion;

    @JsonProperty("aesolicitudes_plant_nombre")
    private String dSSolicitudPIUStatusGestMesaAesolicitudesDotPlanTDotNombre;

    @JsonProperty("estadodoc")
    private Long dSSolicitudPIUStatusGestMesaEstadoDoc;

    @JsonProperty("drvestadohomologado")
    private Long dSSolicitudPIUStatusGestMesaDrvEstadoHomologado;

    @JsonProperty("fechacompletada")
    private Timestamp dSSolicitudPIUStatusGestMesaFechaCompletada;

    @JsonProperty("fechaultimodoc")
    private Timestamp dSSolicitudPIUStatusGestMesaFechaUltimoDoc;

    @JsonProperty("finiciocontrato")
    private Date dSSolicitudPIUStatusGestMesaFInicioContrato;

    @JsonProperty("aesolicitudes_numerosolicitud")
    private String dSSolicitudPIUStatusGestMesaAesolicitudesDotNumerosolicitud;

    @JsonProperty("tramite")
    private Long dSSolicitudPIUStatusGestMesaTramite;

    @JsonProperty("drvnumcontrato")
    private String dSSolicitudPIUStatusGestMesaDrvNumContrato;

    @JsonProperty("agente_drvnombrecompleto")
    private String dSSolicitudPIUStatusGestMesaAgenteDotDrvNombreCompleto;

    @JsonProperty("prioridad")
    private Long dSSolicitudPIUStatusGestMesaPrioridad;

    @JsonProperty("drvsemaforograbase")
    private Double dSSolicitudPIUStatusGestMesaDrvSemaforoGrabAse;

    @JsonProperty("usrafiliacion_drvnombrecompleto")
    private String dSSolicitudPIUStatusGestMesaUsrAfiliacionDotDrvNombreCompleto;

    @JsonProperty("drvsemaforoareamed")
    private Double dSSolicitudPIUStatusGestMesaDrvSemaforoAreaMed;

    @JsonProperty("usrareamedica_drvnombrecompleto")
    private String dSSolicitudPIUStatusGestMesaUsrAreaMedicaDotDrvNombreCompleto;

    public DSSolicitudPIUStatusGestMesa() {
    
    }

    public DSSolicitudPIUStatusGestMesa(Solicitud instance) {
        if (instance != null) {
            try {
                this.dSSolicitudPIUStatusGestMesaAesolicitudesDotProductoTDotDescripcion = instance.getAesolicitudes().getProductoT().getProductosDescripcion();
                this.dSSolicitudPIUStatusGestMesaAesolicitudesDotPlanTDotNombre = instance.getAesolicitudes().getPlanT().getPlanesNombre();
                this.dSSolicitudPIUStatusGestMesaEstadoDoc = instance.getSolicitudEstadoDoc();
                this.dSSolicitudPIUStatusGestMesaDrvEstadoHomologado = instance.getSolicitudDrvEstadoHomologado();
                this.dSSolicitudPIUStatusGestMesaFechaCompletada = instance.getSolicitudFechaCompletada();
                this.dSSolicitudPIUStatusGestMesaFechaUltimoDoc = instance.getSolicitudFechaUltimoDoc();
                this.dSSolicitudPIUStatusGestMesaFInicioContrato = instance.getSolicitudFInicioContrato();
                this.dSSolicitudPIUStatusGestMesaAesolicitudesDotNumerosolicitud = instance.getAesolicitudes().getAesolicitudesNumerosolicitud();
                this.dSSolicitudPIUStatusGestMesaTramite = instance.getSolicitudTramite();
                this.dSSolicitudPIUStatusGestMesaDrvNumContrato = instance.getSolicituddrvNumContrato();
                this.dSSolicitudPIUStatusGestMesaAgenteDotDrvNombreCompleto = instance.getAgente().getFuncionariodrvNombreCompleto();
                this.dSSolicitudPIUStatusGestMesaPrioridad = instance.getSolicitudPrioridad();
                this.dSSolicitudPIUStatusGestMesaDrvSemaforoGrabAse = instance.getSolicituddrvSemaforoGrabAse();
                this.dSSolicitudPIUStatusGestMesaUsrAfiliacionDotDrvNombreCompleto = instance.getUsrAfiliacion().getFuncionariodrvNombreCompleto();
                this.dSSolicitudPIUStatusGestMesaDrvSemaforoAreaMed = instance.getSolicituddrvSemaforoAreaMed();
                this.dSSolicitudPIUStatusGestMesaUsrAreaMedicaDotDrvNombreCompleto = instance.getUsrAreaMedica().getFuncionariodrvNombreCompleto();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusGestMesaAesolicitudesDotProductoTDotDescripcion() {
        return this.dSSolicitudPIUStatusGestMesaAesolicitudesDotProductoTDotDescripcion;
    }
    
    public void setDSSolicitudPIUStatusGestMesaAesolicitudesDotProductoTDotDescripcion(String dSSolicitudPIUStatusGestMesaAesolicitudesDotProductoTDotDescripcion) {
        this.dSSolicitudPIUStatusGestMesaAesolicitudesDotProductoTDotDescripcion = dSSolicitudPIUStatusGestMesaAesolicitudesDotProductoTDotDescripcion;
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusGestMesaAesolicitudesDotPlanTDotNombre() {
        return this.dSSolicitudPIUStatusGestMesaAesolicitudesDotPlanTDotNombre;
    }
    
    public void setDSSolicitudPIUStatusGestMesaAesolicitudesDotPlanTDotNombre(String dSSolicitudPIUStatusGestMesaAesolicitudesDotPlanTDotNombre) {
        this.dSSolicitudPIUStatusGestMesaAesolicitudesDotPlanTDotNombre = dSSolicitudPIUStatusGestMesaAesolicitudesDotPlanTDotNombre;
    }

    @JsonIgnore
    public Long getDSSolicitudPIUStatusGestMesaEstadoDoc() {
        return this.dSSolicitudPIUStatusGestMesaEstadoDoc;
    }
    
    public void setDSSolicitudPIUStatusGestMesaEstadoDoc(Long dSSolicitudPIUStatusGestMesaEstadoDoc) {
        this.dSSolicitudPIUStatusGestMesaEstadoDoc = dSSolicitudPIUStatusGestMesaEstadoDoc;
    }

    @JsonIgnore
    public Long getDSSolicitudPIUStatusGestMesaDrvEstadoHomologado() {
        return this.dSSolicitudPIUStatusGestMesaDrvEstadoHomologado;
    }
    
    public void setDSSolicitudPIUStatusGestMesaDrvEstadoHomologado(Long dSSolicitudPIUStatusGestMesaDrvEstadoHomologado) {
        this.dSSolicitudPIUStatusGestMesaDrvEstadoHomologado = dSSolicitudPIUStatusGestMesaDrvEstadoHomologado;
    }

    @JsonIgnore
    public Timestamp getDSSolicitudPIUStatusGestMesaFechaCompletada() {
        return this.dSSolicitudPIUStatusGestMesaFechaCompletada;
    }
    
    public void setDSSolicitudPIUStatusGestMesaFechaCompletada(Timestamp dSSolicitudPIUStatusGestMesaFechaCompletada) {
        this.dSSolicitudPIUStatusGestMesaFechaCompletada = dSSolicitudPIUStatusGestMesaFechaCompletada;
    }

    @JsonIgnore
    public Timestamp getDSSolicitudPIUStatusGestMesaFechaUltimoDoc() {
        return this.dSSolicitudPIUStatusGestMesaFechaUltimoDoc;
    }
    
    public void setDSSolicitudPIUStatusGestMesaFechaUltimoDoc(Timestamp dSSolicitudPIUStatusGestMesaFechaUltimoDoc) {
        this.dSSolicitudPIUStatusGestMesaFechaUltimoDoc = dSSolicitudPIUStatusGestMesaFechaUltimoDoc;
    }

    @JsonIgnore
    public Date getDSSolicitudPIUStatusGestMesaFInicioContrato() {
        return this.dSSolicitudPIUStatusGestMesaFInicioContrato;
    }
    
    public void setDSSolicitudPIUStatusGestMesaFInicioContrato(Date dSSolicitudPIUStatusGestMesaFInicioContrato) {
        this.dSSolicitudPIUStatusGestMesaFInicioContrato = dSSolicitudPIUStatusGestMesaFInicioContrato;
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusGestMesaAesolicitudesDotNumerosolicitud() {
        return this.dSSolicitudPIUStatusGestMesaAesolicitudesDotNumerosolicitud;
    }
    
    public void setDSSolicitudPIUStatusGestMesaAesolicitudesDotNumerosolicitud(String dSSolicitudPIUStatusGestMesaAesolicitudesDotNumerosolicitud) {
        this.dSSolicitudPIUStatusGestMesaAesolicitudesDotNumerosolicitud = dSSolicitudPIUStatusGestMesaAesolicitudesDotNumerosolicitud;
    }

    @JsonIgnore
    public Long getDSSolicitudPIUStatusGestMesaTramite() {
        return this.dSSolicitudPIUStatusGestMesaTramite;
    }
    
    public void setDSSolicitudPIUStatusGestMesaTramite(Long dSSolicitudPIUStatusGestMesaTramite) {
        this.dSSolicitudPIUStatusGestMesaTramite = dSSolicitudPIUStatusGestMesaTramite;
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusGestMesaDrvNumContrato() {
        return this.dSSolicitudPIUStatusGestMesaDrvNumContrato;
    }
    
    public void setDSSolicitudPIUStatusGestMesaDrvNumContrato(String dSSolicitudPIUStatusGestMesaDrvNumContrato) {
        this.dSSolicitudPIUStatusGestMesaDrvNumContrato = dSSolicitudPIUStatusGestMesaDrvNumContrato;
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusGestMesaAgenteDotDrvNombreCompleto() {
        return this.dSSolicitudPIUStatusGestMesaAgenteDotDrvNombreCompleto;
    }
    
    public void setDSSolicitudPIUStatusGestMesaAgenteDotDrvNombreCompleto(String dSSolicitudPIUStatusGestMesaAgenteDotDrvNombreCompleto) {
        this.dSSolicitudPIUStatusGestMesaAgenteDotDrvNombreCompleto = dSSolicitudPIUStatusGestMesaAgenteDotDrvNombreCompleto;
    }

    @JsonIgnore
    public Long getDSSolicitudPIUStatusGestMesaPrioridad() {
        return this.dSSolicitudPIUStatusGestMesaPrioridad;
    }
    
    public void setDSSolicitudPIUStatusGestMesaPrioridad(Long dSSolicitudPIUStatusGestMesaPrioridad) {
        this.dSSolicitudPIUStatusGestMesaPrioridad = dSSolicitudPIUStatusGestMesaPrioridad;
    }

    @JsonIgnore
    public Double getDSSolicitudPIUStatusGestMesaDrvSemaforoGrabAse() {
        return this.dSSolicitudPIUStatusGestMesaDrvSemaforoGrabAse;
    }
    
    public void setDSSolicitudPIUStatusGestMesaDrvSemaforoGrabAse(Double dSSolicitudPIUStatusGestMesaDrvSemaforoGrabAse) {
        this.dSSolicitudPIUStatusGestMesaDrvSemaforoGrabAse = dSSolicitudPIUStatusGestMesaDrvSemaforoGrabAse;
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusGestMesaUsrAfiliacionDotDrvNombreCompleto() {
        return this.dSSolicitudPIUStatusGestMesaUsrAfiliacionDotDrvNombreCompleto;
    }
    
    public void setDSSolicitudPIUStatusGestMesaUsrAfiliacionDotDrvNombreCompleto(String dSSolicitudPIUStatusGestMesaUsrAfiliacionDotDrvNombreCompleto) {
        this.dSSolicitudPIUStatusGestMesaUsrAfiliacionDotDrvNombreCompleto = dSSolicitudPIUStatusGestMesaUsrAfiliacionDotDrvNombreCompleto;
    }

    @JsonIgnore
    public Double getDSSolicitudPIUStatusGestMesaDrvSemaforoAreaMed() {
        return this.dSSolicitudPIUStatusGestMesaDrvSemaforoAreaMed;
    }
    
    public void setDSSolicitudPIUStatusGestMesaDrvSemaforoAreaMed(Double dSSolicitudPIUStatusGestMesaDrvSemaforoAreaMed) {
        this.dSSolicitudPIUStatusGestMesaDrvSemaforoAreaMed = dSSolicitudPIUStatusGestMesaDrvSemaforoAreaMed;
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusGestMesaUsrAreaMedicaDotDrvNombreCompleto() {
        return this.dSSolicitudPIUStatusGestMesaUsrAreaMedicaDotDrvNombreCompleto;
    }
    
    public void setDSSolicitudPIUStatusGestMesaUsrAreaMedicaDotDrvNombreCompleto(String dSSolicitudPIUStatusGestMesaUsrAreaMedicaDotDrvNombreCompleto) {
        this.dSSolicitudPIUStatusGestMesaUsrAreaMedicaDotDrvNombreCompleto = dSSolicitudPIUStatusGestMesaUsrAreaMedicaDotDrvNombreCompleto;
    }
}
