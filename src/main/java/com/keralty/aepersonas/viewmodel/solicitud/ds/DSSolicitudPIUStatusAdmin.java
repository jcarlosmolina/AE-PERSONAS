package com.keralty.aepersonas.viewmodel.solicitud.ds;

import java.sql.Date;
import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Solicitud;
public class DSSolicitudPIUStatusAdmin {

    @JsonProperty("aesolicitudes_productot_descripcion")
    private String dSSolicitudPIUStatusAdminAesolicitudesDotProductoTDotDescripcion;

    @JsonProperty("aesolicitudes_plant_nombre")
    private String dSSolicitudPIUStatusAdminAesolicitudesDotPlanTDotNombre;

    @JsonProperty("estadodoc")
    private Long dSSolicitudPIUStatusAdminEstadoDoc;

    @JsonProperty("estado")
    private Long dSSolicitudPIUStatusAdminEstado;

    @JsonProperty("fechacompletada")
    private Timestamp dSSolicitudPIUStatusAdminFechaCompletada;

    @JsonProperty("fechaultimodoc")
    private Timestamp dSSolicitudPIUStatusAdminFechaUltimoDoc;

    @JsonProperty("finiciocontrato")
    private Date dSSolicitudPIUStatusAdminFInicioContrato;

    @JsonProperty("aesolicitudes_numerosolicitud")
    private String dSSolicitudPIUStatusAdminAesolicitudesDotNumerosolicitud;

    @JsonProperty("tramite")
    private Long dSSolicitudPIUStatusAdminTramite;

    @JsonProperty("drvnumcontrato")
    private String dSSolicitudPIUStatusAdminDrvNumContrato;

    @JsonProperty("agente_drvnombrecompleto")
    private String dSSolicitudPIUStatusAdminAgenteDotDrvNombreCompleto;

    @JsonProperty("prioridad")
    private Long dSSolicitudPIUStatusAdminPrioridad;

    @JsonProperty("drvsemaforograbase")
    private Double dSSolicitudPIUStatusAdminDrvSemaforoGrabAse;

    @JsonProperty("usrafiliacion_drvnombrecompleto")
    private String dSSolicitudPIUStatusAdminUsrAfiliacionDotDrvNombreCompleto;

    @JsonProperty("drvsemaforoareamed")
    private Double dSSolicitudPIUStatusAdminDrvSemaforoAreaMed;

    @JsonProperty("usrareamedica_drvnombrecompleto")
    private String dSSolicitudPIUStatusAdminUsrAreaMedicaDotDrvNombreCompleto;

    public DSSolicitudPIUStatusAdmin() {
    
    }

    public DSSolicitudPIUStatusAdmin(Solicitud instance) {
        if (instance != null) {
            try {
                this.dSSolicitudPIUStatusAdminAesolicitudesDotProductoTDotDescripcion = instance.getAesolicitudes().getProductoT().getProductosDescripcion();
                this.dSSolicitudPIUStatusAdminAesolicitudesDotPlanTDotNombre = instance.getAesolicitudes().getPlanT().getPlanesNombre();
                this.dSSolicitudPIUStatusAdminEstadoDoc = instance.getSolicitudEstadoDoc();
                this.dSSolicitudPIUStatusAdminEstado = instance.getSolicitudEstado();
                this.dSSolicitudPIUStatusAdminFechaCompletada = instance.getSolicitudFechaCompletada();
                this.dSSolicitudPIUStatusAdminFechaUltimoDoc = instance.getSolicitudFechaUltimoDoc();
                this.dSSolicitudPIUStatusAdminFInicioContrato = instance.getSolicitudFInicioContrato();
                this.dSSolicitudPIUStatusAdminAesolicitudesDotNumerosolicitud = instance.getAesolicitudes().getAesolicitudesNumerosolicitud();
                this.dSSolicitudPIUStatusAdminTramite = instance.getSolicitudTramite();
                this.dSSolicitudPIUStatusAdminDrvNumContrato = instance.getSolicituddrvNumContrato();
                this.dSSolicitudPIUStatusAdminAgenteDotDrvNombreCompleto = instance.getAgente().getFuncionariodrvNombreCompleto();
                this.dSSolicitudPIUStatusAdminPrioridad = instance.getSolicitudPrioridad();
                this.dSSolicitudPIUStatusAdminDrvSemaforoGrabAse = instance.getSolicituddrvSemaforoGrabAse();
                this.dSSolicitudPIUStatusAdminUsrAfiliacionDotDrvNombreCompleto = instance.getUsrAfiliacion().getFuncionariodrvNombreCompleto();
                this.dSSolicitudPIUStatusAdminDrvSemaforoAreaMed = instance.getSolicituddrvSemaforoAreaMed();
                this.dSSolicitudPIUStatusAdminUsrAreaMedicaDotDrvNombreCompleto = instance.getUsrAreaMedica().getFuncionariodrvNombreCompleto();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusAdminAesolicitudesDotProductoTDotDescripcion() {
        return this.dSSolicitudPIUStatusAdminAesolicitudesDotProductoTDotDescripcion;
    }
    
    public void setDSSolicitudPIUStatusAdminAesolicitudesDotProductoTDotDescripcion(String dSSolicitudPIUStatusAdminAesolicitudesDotProductoTDotDescripcion) {
        this.dSSolicitudPIUStatusAdminAesolicitudesDotProductoTDotDescripcion = dSSolicitudPIUStatusAdminAesolicitudesDotProductoTDotDescripcion;
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusAdminAesolicitudesDotPlanTDotNombre() {
        return this.dSSolicitudPIUStatusAdminAesolicitudesDotPlanTDotNombre;
    }
    
    public void setDSSolicitudPIUStatusAdminAesolicitudesDotPlanTDotNombre(String dSSolicitudPIUStatusAdminAesolicitudesDotPlanTDotNombre) {
        this.dSSolicitudPIUStatusAdminAesolicitudesDotPlanTDotNombre = dSSolicitudPIUStatusAdminAesolicitudesDotPlanTDotNombre;
    }

    @JsonIgnore
    public Long getDSSolicitudPIUStatusAdminEstadoDoc() {
        return this.dSSolicitudPIUStatusAdminEstadoDoc;
    }
    
    public void setDSSolicitudPIUStatusAdminEstadoDoc(Long dSSolicitudPIUStatusAdminEstadoDoc) {
        this.dSSolicitudPIUStatusAdminEstadoDoc = dSSolicitudPIUStatusAdminEstadoDoc;
    }

    @JsonIgnore
    public Long getDSSolicitudPIUStatusAdminEstado() {
        return this.dSSolicitudPIUStatusAdminEstado;
    }
    
    public void setDSSolicitudPIUStatusAdminEstado(Long dSSolicitudPIUStatusAdminEstado) {
        this.dSSolicitudPIUStatusAdminEstado = dSSolicitudPIUStatusAdminEstado;
    }

    @JsonIgnore
    public Timestamp getDSSolicitudPIUStatusAdminFechaCompletada() {
        return this.dSSolicitudPIUStatusAdminFechaCompletada;
    }
    
    public void setDSSolicitudPIUStatusAdminFechaCompletada(Timestamp dSSolicitudPIUStatusAdminFechaCompletada) {
        this.dSSolicitudPIUStatusAdminFechaCompletada = dSSolicitudPIUStatusAdminFechaCompletada;
    }

    @JsonIgnore
    public Timestamp getDSSolicitudPIUStatusAdminFechaUltimoDoc() {
        return this.dSSolicitudPIUStatusAdminFechaUltimoDoc;
    }
    
    public void setDSSolicitudPIUStatusAdminFechaUltimoDoc(Timestamp dSSolicitudPIUStatusAdminFechaUltimoDoc) {
        this.dSSolicitudPIUStatusAdminFechaUltimoDoc = dSSolicitudPIUStatusAdminFechaUltimoDoc;
    }

    @JsonIgnore
    public Date getDSSolicitudPIUStatusAdminFInicioContrato() {
        return this.dSSolicitudPIUStatusAdminFInicioContrato;
    }
    
    public void setDSSolicitudPIUStatusAdminFInicioContrato(Date dSSolicitudPIUStatusAdminFInicioContrato) {
        this.dSSolicitudPIUStatusAdminFInicioContrato = dSSolicitudPIUStatusAdminFInicioContrato;
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusAdminAesolicitudesDotNumerosolicitud() {
        return this.dSSolicitudPIUStatusAdminAesolicitudesDotNumerosolicitud;
    }
    
    public void setDSSolicitudPIUStatusAdminAesolicitudesDotNumerosolicitud(String dSSolicitudPIUStatusAdminAesolicitudesDotNumerosolicitud) {
        this.dSSolicitudPIUStatusAdminAesolicitudesDotNumerosolicitud = dSSolicitudPIUStatusAdminAesolicitudesDotNumerosolicitud;
    }

    @JsonIgnore
    public Long getDSSolicitudPIUStatusAdminTramite() {
        return this.dSSolicitudPIUStatusAdminTramite;
    }
    
    public void setDSSolicitudPIUStatusAdminTramite(Long dSSolicitudPIUStatusAdminTramite) {
        this.dSSolicitudPIUStatusAdminTramite = dSSolicitudPIUStatusAdminTramite;
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusAdminDrvNumContrato() {
        return this.dSSolicitudPIUStatusAdminDrvNumContrato;
    }
    
    public void setDSSolicitudPIUStatusAdminDrvNumContrato(String dSSolicitudPIUStatusAdminDrvNumContrato) {
        this.dSSolicitudPIUStatusAdminDrvNumContrato = dSSolicitudPIUStatusAdminDrvNumContrato;
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusAdminAgenteDotDrvNombreCompleto() {
        return this.dSSolicitudPIUStatusAdminAgenteDotDrvNombreCompleto;
    }
    
    public void setDSSolicitudPIUStatusAdminAgenteDotDrvNombreCompleto(String dSSolicitudPIUStatusAdminAgenteDotDrvNombreCompleto) {
        this.dSSolicitudPIUStatusAdminAgenteDotDrvNombreCompleto = dSSolicitudPIUStatusAdminAgenteDotDrvNombreCompleto;
    }

    @JsonIgnore
    public Long getDSSolicitudPIUStatusAdminPrioridad() {
        return this.dSSolicitudPIUStatusAdminPrioridad;
    }
    
    public void setDSSolicitudPIUStatusAdminPrioridad(Long dSSolicitudPIUStatusAdminPrioridad) {
        this.dSSolicitudPIUStatusAdminPrioridad = dSSolicitudPIUStatusAdminPrioridad;
    }

    @JsonIgnore
    public Double getDSSolicitudPIUStatusAdminDrvSemaforoGrabAse() {
        return this.dSSolicitudPIUStatusAdminDrvSemaforoGrabAse;
    }
    
    public void setDSSolicitudPIUStatusAdminDrvSemaforoGrabAse(Double dSSolicitudPIUStatusAdminDrvSemaforoGrabAse) {
        this.dSSolicitudPIUStatusAdminDrvSemaforoGrabAse = dSSolicitudPIUStatusAdminDrvSemaforoGrabAse;
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusAdminUsrAfiliacionDotDrvNombreCompleto() {
        return this.dSSolicitudPIUStatusAdminUsrAfiliacionDotDrvNombreCompleto;
    }
    
    public void setDSSolicitudPIUStatusAdminUsrAfiliacionDotDrvNombreCompleto(String dSSolicitudPIUStatusAdminUsrAfiliacionDotDrvNombreCompleto) {
        this.dSSolicitudPIUStatusAdminUsrAfiliacionDotDrvNombreCompleto = dSSolicitudPIUStatusAdminUsrAfiliacionDotDrvNombreCompleto;
    }

    @JsonIgnore
    public Double getDSSolicitudPIUStatusAdminDrvSemaforoAreaMed() {
        return this.dSSolicitudPIUStatusAdminDrvSemaforoAreaMed;
    }
    
    public void setDSSolicitudPIUStatusAdminDrvSemaforoAreaMed(Double dSSolicitudPIUStatusAdminDrvSemaforoAreaMed) {
        this.dSSolicitudPIUStatusAdminDrvSemaforoAreaMed = dSSolicitudPIUStatusAdminDrvSemaforoAreaMed;
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusAdminUsrAreaMedicaDotDrvNombreCompleto() {
        return this.dSSolicitudPIUStatusAdminUsrAreaMedicaDotDrvNombreCompleto;
    }
    
    public void setDSSolicitudPIUStatusAdminUsrAreaMedicaDotDrvNombreCompleto(String dSSolicitudPIUStatusAdminUsrAreaMedicaDotDrvNombreCompleto) {
        this.dSSolicitudPIUStatusAdminUsrAreaMedicaDotDrvNombreCompleto = dSSolicitudPIUStatusAdminUsrAreaMedicaDotDrvNombreCompleto;
    }
}
