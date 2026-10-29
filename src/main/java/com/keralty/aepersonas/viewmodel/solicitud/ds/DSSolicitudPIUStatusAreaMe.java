package com.keralty.aepersonas.viewmodel.solicitud.ds;

import java.sql.Date;
import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Solicitud;
public class DSSolicitudPIUStatusAreaMe {

    @JsonProperty("aesolicitudes_productot_descripcion")
    private String dSSolicitudPIUStatusAreaMeAesolicitudesDotProductoTDotDescripcion;

    @JsonProperty("aesolicitudes_plant_nombre")
    private String dSSolicitudPIUStatusAreaMeAesolicitudesDotPlanTDotNombre;

    @JsonProperty("estadodoc")
    private Long dSSolicitudPIUStatusAreaMeEstadoDoc;

    @JsonProperty("drvestadohomologado")
    private Long dSSolicitudPIUStatusAreaMeDrvEstadoHomologado;

    @JsonProperty("fechacompletada")
    private Timestamp dSSolicitudPIUStatusAreaMeFechaCompletada;

    @JsonProperty("fechaultimodoc")
    private Timestamp dSSolicitudPIUStatusAreaMeFechaUltimoDoc;

    @JsonProperty("finiciocontrato")
    private Date dSSolicitudPIUStatusAreaMeFInicioContrato;

    @JsonProperty("aesolicitudes_numerosolicitud")
    private String dSSolicitudPIUStatusAreaMeAesolicitudesDotNumerosolicitud;

    @JsonProperty("tramite")
    private Long dSSolicitudPIUStatusAreaMeTramite;

    @JsonProperty("drvnumcontrato")
    private String dSSolicitudPIUStatusAreaMeDrvNumContrato;

    @JsonProperty("prioridad")
    private Long dSSolicitudPIUStatusAreaMePrioridad;

    @JsonProperty("drvsemaforoareamed")
    private Double dSSolicitudPIUStatusAreaMeDrvSemaforoAreaMed;

    @JsonProperty("agente_drvnombrecompleto")
    private String dSSolicitudPIUStatusAreaMeAgenteDotDrvNombreCompleto;

    public DSSolicitudPIUStatusAreaMe() {
    
    }

    public DSSolicitudPIUStatusAreaMe(Solicitud instance) {
        if (instance != null) {
            try {
                this.dSSolicitudPIUStatusAreaMeAesolicitudesDotProductoTDotDescripcion = instance.getAesolicitudes().getProductoT().getProductosDescripcion();
                this.dSSolicitudPIUStatusAreaMeAesolicitudesDotPlanTDotNombre = instance.getAesolicitudes().getPlanT().getPlanesNombre();
                this.dSSolicitudPIUStatusAreaMeEstadoDoc = instance.getSolicitudEstadoDoc();
                this.dSSolicitudPIUStatusAreaMeDrvEstadoHomologado = instance.getSolicitudDrvEstadoHomologado();
                this.dSSolicitudPIUStatusAreaMeFechaCompletada = instance.getSolicitudFechaCompletada();
                this.dSSolicitudPIUStatusAreaMeFechaUltimoDoc = instance.getSolicitudFechaUltimoDoc();
                this.dSSolicitudPIUStatusAreaMeFInicioContrato = instance.getSolicitudFInicioContrato();
                this.dSSolicitudPIUStatusAreaMeAesolicitudesDotNumerosolicitud = instance.getAesolicitudes().getAesolicitudesNumerosolicitud();
                this.dSSolicitudPIUStatusAreaMeTramite = instance.getSolicitudTramite();
                this.dSSolicitudPIUStatusAreaMeDrvNumContrato = instance.getSolicituddrvNumContrato();
                this.dSSolicitudPIUStatusAreaMePrioridad = instance.getSolicitudPrioridad();
                this.dSSolicitudPIUStatusAreaMeDrvSemaforoAreaMed = instance.getSolicituddrvSemaforoAreaMed();
                this.dSSolicitudPIUStatusAreaMeAgenteDotDrvNombreCompleto = instance.getAgente().getFuncionariodrvNombreCompleto();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusAreaMeAesolicitudesDotProductoTDotDescripcion() {
        return this.dSSolicitudPIUStatusAreaMeAesolicitudesDotProductoTDotDescripcion;
    }
    
    public void setDSSolicitudPIUStatusAreaMeAesolicitudesDotProductoTDotDescripcion(String dSSolicitudPIUStatusAreaMeAesolicitudesDotProductoTDotDescripcion) {
        this.dSSolicitudPIUStatusAreaMeAesolicitudesDotProductoTDotDescripcion = dSSolicitudPIUStatusAreaMeAesolicitudesDotProductoTDotDescripcion;
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusAreaMeAesolicitudesDotPlanTDotNombre() {
        return this.dSSolicitudPIUStatusAreaMeAesolicitudesDotPlanTDotNombre;
    }
    
    public void setDSSolicitudPIUStatusAreaMeAesolicitudesDotPlanTDotNombre(String dSSolicitudPIUStatusAreaMeAesolicitudesDotPlanTDotNombre) {
        this.dSSolicitudPIUStatusAreaMeAesolicitudesDotPlanTDotNombre = dSSolicitudPIUStatusAreaMeAesolicitudesDotPlanTDotNombre;
    }

    @JsonIgnore
    public Long getDSSolicitudPIUStatusAreaMeEstadoDoc() {
        return this.dSSolicitudPIUStatusAreaMeEstadoDoc;
    }
    
    public void setDSSolicitudPIUStatusAreaMeEstadoDoc(Long dSSolicitudPIUStatusAreaMeEstadoDoc) {
        this.dSSolicitudPIUStatusAreaMeEstadoDoc = dSSolicitudPIUStatusAreaMeEstadoDoc;
    }

    @JsonIgnore
    public Long getDSSolicitudPIUStatusAreaMeDrvEstadoHomologado() {
        return this.dSSolicitudPIUStatusAreaMeDrvEstadoHomologado;
    }
    
    public void setDSSolicitudPIUStatusAreaMeDrvEstadoHomologado(Long dSSolicitudPIUStatusAreaMeDrvEstadoHomologado) {
        this.dSSolicitudPIUStatusAreaMeDrvEstadoHomologado = dSSolicitudPIUStatusAreaMeDrvEstadoHomologado;
    }

    @JsonIgnore
    public Timestamp getDSSolicitudPIUStatusAreaMeFechaCompletada() {
        return this.dSSolicitudPIUStatusAreaMeFechaCompletada;
    }
    
    public void setDSSolicitudPIUStatusAreaMeFechaCompletada(Timestamp dSSolicitudPIUStatusAreaMeFechaCompletada) {
        this.dSSolicitudPIUStatusAreaMeFechaCompletada = dSSolicitudPIUStatusAreaMeFechaCompletada;
    }

    @JsonIgnore
    public Timestamp getDSSolicitudPIUStatusAreaMeFechaUltimoDoc() {
        return this.dSSolicitudPIUStatusAreaMeFechaUltimoDoc;
    }
    
    public void setDSSolicitudPIUStatusAreaMeFechaUltimoDoc(Timestamp dSSolicitudPIUStatusAreaMeFechaUltimoDoc) {
        this.dSSolicitudPIUStatusAreaMeFechaUltimoDoc = dSSolicitudPIUStatusAreaMeFechaUltimoDoc;
    }

    @JsonIgnore
    public Date getDSSolicitudPIUStatusAreaMeFInicioContrato() {
        return this.dSSolicitudPIUStatusAreaMeFInicioContrato;
    }
    
    public void setDSSolicitudPIUStatusAreaMeFInicioContrato(Date dSSolicitudPIUStatusAreaMeFInicioContrato) {
        this.dSSolicitudPIUStatusAreaMeFInicioContrato = dSSolicitudPIUStatusAreaMeFInicioContrato;
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusAreaMeAesolicitudesDotNumerosolicitud() {
        return this.dSSolicitudPIUStatusAreaMeAesolicitudesDotNumerosolicitud;
    }
    
    public void setDSSolicitudPIUStatusAreaMeAesolicitudesDotNumerosolicitud(String dSSolicitudPIUStatusAreaMeAesolicitudesDotNumerosolicitud) {
        this.dSSolicitudPIUStatusAreaMeAesolicitudesDotNumerosolicitud = dSSolicitudPIUStatusAreaMeAesolicitudesDotNumerosolicitud;
    }

    @JsonIgnore
    public Long getDSSolicitudPIUStatusAreaMeTramite() {
        return this.dSSolicitudPIUStatusAreaMeTramite;
    }
    
    public void setDSSolicitudPIUStatusAreaMeTramite(Long dSSolicitudPIUStatusAreaMeTramite) {
        this.dSSolicitudPIUStatusAreaMeTramite = dSSolicitudPIUStatusAreaMeTramite;
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusAreaMeDrvNumContrato() {
        return this.dSSolicitudPIUStatusAreaMeDrvNumContrato;
    }
    
    public void setDSSolicitudPIUStatusAreaMeDrvNumContrato(String dSSolicitudPIUStatusAreaMeDrvNumContrato) {
        this.dSSolicitudPIUStatusAreaMeDrvNumContrato = dSSolicitudPIUStatusAreaMeDrvNumContrato;
    }

    @JsonIgnore
    public Long getDSSolicitudPIUStatusAreaMePrioridad() {
        return this.dSSolicitudPIUStatusAreaMePrioridad;
    }
    
    public void setDSSolicitudPIUStatusAreaMePrioridad(Long dSSolicitudPIUStatusAreaMePrioridad) {
        this.dSSolicitudPIUStatusAreaMePrioridad = dSSolicitudPIUStatusAreaMePrioridad;
    }

    @JsonIgnore
    public Double getDSSolicitudPIUStatusAreaMeDrvSemaforoAreaMed() {
        return this.dSSolicitudPIUStatusAreaMeDrvSemaforoAreaMed;
    }
    
    public void setDSSolicitudPIUStatusAreaMeDrvSemaforoAreaMed(Double dSSolicitudPIUStatusAreaMeDrvSemaforoAreaMed) {
        this.dSSolicitudPIUStatusAreaMeDrvSemaforoAreaMed = dSSolicitudPIUStatusAreaMeDrvSemaforoAreaMed;
    }

    @JsonIgnore
    public String getDSSolicitudPIUStatusAreaMeAgenteDotDrvNombreCompleto() {
        return this.dSSolicitudPIUStatusAreaMeAgenteDotDrvNombreCompleto;
    }
    
    public void setDSSolicitudPIUStatusAreaMeAgenteDotDrvNombreCompleto(String dSSolicitudPIUStatusAreaMeAgenteDotDrvNombreCompleto) {
        this.dSSolicitudPIUStatusAreaMeAgenteDotDrvNombreCompleto = dSSolicitudPIUStatusAreaMeAgenteDotDrvNombreCompleto;
    }
}
