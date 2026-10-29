package com.keralty.aepersonas.viewmodel.solicitud.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Solicitud;
public class DSSolicitudPIUEnvioDoc {

    @JsonProperty("tramite")
    private Long dSSolicitudPIUEnvioDocTramite;

    @JsonProperty("aesolicitudes_productot_descripcion")
    private String dSSolicitudPIUEnvioDocAesolicitudesDotProductoTDotDescripcion;

    @JsonProperty("aesolicitudes_plant_nombre")
    private String dSSolicitudPIUEnvioDocAesolicitudesDotPlanTDotNombre;

    @JsonProperty("aesolicitudes_numerosolicitud")
    private String dSSolicitudPIUEnvioDocAesolicitudesDotNumerosolicitud;

    @JsonProperty("estado")
    private Long dSSolicitudPIUEnvioDocEstado;

    @JsonProperty("numcontrato")
    private String dSSolicitudPIUEnvioDocNumContrato;

    @JsonProperty("docsenviados")
    private Boolean dSSolicitudPIUEnvioDocDocsEnviados;

    @JsonProperty("agente_usuario")
    private String dSSolicitudPIUEnvioDocAgenteDotUsuario;

    @JsonProperty("tienedifliquidacion")
    private Boolean dSSolicitudPIUEnvioDocTieneDifLiquidacion;

    @JsonProperty("drvtienesegundafirma")
    private Boolean dSSolicitudPIUEnvioDocDrvTieneSegundaFirma;

    @JsonProperty("estadodoc")
    private Long dSSolicitudPIUEnvioDocEstadoDoc;

    public DSSolicitudPIUEnvioDoc() {
    
    }

    public DSSolicitudPIUEnvioDoc(Solicitud instance) {
        if (instance != null) {
            try {
                this.dSSolicitudPIUEnvioDocTramite = instance.getSolicitudTramite();
                this.dSSolicitudPIUEnvioDocAesolicitudesDotProductoTDotDescripcion = instance.getAesolicitudes().getProductoT().getProductosDescripcion();
                this.dSSolicitudPIUEnvioDocAesolicitudesDotPlanTDotNombre = instance.getAesolicitudes().getPlanT().getPlanesNombre();
                this.dSSolicitudPIUEnvioDocAesolicitudesDotNumerosolicitud = instance.getAesolicitudes().getAesolicitudesNumerosolicitud();
                this.dSSolicitudPIUEnvioDocEstado = instance.getSolicitudEstado();
                this.dSSolicitudPIUEnvioDocNumContrato = instance.getSolicitudNumContrato();
                this.dSSolicitudPIUEnvioDocDocsEnviados = instance.getSolicitudDocsEnviados();
                this.dSSolicitudPIUEnvioDocAgenteDotUsuario = instance.getAgente().getFuncionarioUsuario();
                this.dSSolicitudPIUEnvioDocTieneDifLiquidacion = instance.getSolicitudTieneDifLiquidacion();
                this.dSSolicitudPIUEnvioDocDrvTieneSegundaFirma = instance.getSolicituddrvTieneSegundaFirma();
                this.dSSolicitudPIUEnvioDocEstadoDoc = instance.getSolicitudEstadoDoc();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public Long getDSSolicitudPIUEnvioDocTramite() {
        return this.dSSolicitudPIUEnvioDocTramite;
    }
    
    public void setDSSolicitudPIUEnvioDocTramite(Long dSSolicitudPIUEnvioDocTramite) {
        this.dSSolicitudPIUEnvioDocTramite = dSSolicitudPIUEnvioDocTramite;
    }

    @JsonIgnore
    public String getDSSolicitudPIUEnvioDocAesolicitudesDotProductoTDotDescripcion() {
        return this.dSSolicitudPIUEnvioDocAesolicitudesDotProductoTDotDescripcion;
    }
    
    public void setDSSolicitudPIUEnvioDocAesolicitudesDotProductoTDotDescripcion(String dSSolicitudPIUEnvioDocAesolicitudesDotProductoTDotDescripcion) {
        this.dSSolicitudPIUEnvioDocAesolicitudesDotProductoTDotDescripcion = dSSolicitudPIUEnvioDocAesolicitudesDotProductoTDotDescripcion;
    }

    @JsonIgnore
    public String getDSSolicitudPIUEnvioDocAesolicitudesDotPlanTDotNombre() {
        return this.dSSolicitudPIUEnvioDocAesolicitudesDotPlanTDotNombre;
    }
    
    public void setDSSolicitudPIUEnvioDocAesolicitudesDotPlanTDotNombre(String dSSolicitudPIUEnvioDocAesolicitudesDotPlanTDotNombre) {
        this.dSSolicitudPIUEnvioDocAesolicitudesDotPlanTDotNombre = dSSolicitudPIUEnvioDocAesolicitudesDotPlanTDotNombre;
    }

    @JsonIgnore
    public String getDSSolicitudPIUEnvioDocAesolicitudesDotNumerosolicitud() {
        return this.dSSolicitudPIUEnvioDocAesolicitudesDotNumerosolicitud;
    }
    
    public void setDSSolicitudPIUEnvioDocAesolicitudesDotNumerosolicitud(String dSSolicitudPIUEnvioDocAesolicitudesDotNumerosolicitud) {
        this.dSSolicitudPIUEnvioDocAesolicitudesDotNumerosolicitud = dSSolicitudPIUEnvioDocAesolicitudesDotNumerosolicitud;
    }

    @JsonIgnore
    public Long getDSSolicitudPIUEnvioDocEstado() {
        return this.dSSolicitudPIUEnvioDocEstado;
    }
    
    public void setDSSolicitudPIUEnvioDocEstado(Long dSSolicitudPIUEnvioDocEstado) {
        this.dSSolicitudPIUEnvioDocEstado = dSSolicitudPIUEnvioDocEstado;
    }

    @JsonIgnore
    public String getDSSolicitudPIUEnvioDocNumContrato() {
        return this.dSSolicitudPIUEnvioDocNumContrato;
    }
    
    public void setDSSolicitudPIUEnvioDocNumContrato(String dSSolicitudPIUEnvioDocNumContrato) {
        this.dSSolicitudPIUEnvioDocNumContrato = dSSolicitudPIUEnvioDocNumContrato;
    }

    @JsonIgnore
    public Boolean getDSSolicitudPIUEnvioDocDocsEnviados() {
        return this.dSSolicitudPIUEnvioDocDocsEnviados;
    }
    
    public void setDSSolicitudPIUEnvioDocDocsEnviados(Boolean dSSolicitudPIUEnvioDocDocsEnviados) {
        this.dSSolicitudPIUEnvioDocDocsEnviados = dSSolicitudPIUEnvioDocDocsEnviados;
    }

    @JsonIgnore
    public String getDSSolicitudPIUEnvioDocAgenteDotUsuario() {
        return this.dSSolicitudPIUEnvioDocAgenteDotUsuario;
    }
    
    public void setDSSolicitudPIUEnvioDocAgenteDotUsuario(String dSSolicitudPIUEnvioDocAgenteDotUsuario) {
        this.dSSolicitudPIUEnvioDocAgenteDotUsuario = dSSolicitudPIUEnvioDocAgenteDotUsuario;
    }

    @JsonIgnore
    public Boolean getDSSolicitudPIUEnvioDocTieneDifLiquidacion() {
        return this.dSSolicitudPIUEnvioDocTieneDifLiquidacion;
    }
    
    public void setDSSolicitudPIUEnvioDocTieneDifLiquidacion(Boolean dSSolicitudPIUEnvioDocTieneDifLiquidacion) {
        this.dSSolicitudPIUEnvioDocTieneDifLiquidacion = dSSolicitudPIUEnvioDocTieneDifLiquidacion;
    }

    @JsonIgnore
    public Boolean getDSSolicitudPIUEnvioDocDrvTieneSegundaFirma() {
        return this.dSSolicitudPIUEnvioDocDrvTieneSegundaFirma;
    }
    
    public void setDSSolicitudPIUEnvioDocDrvTieneSegundaFirma(Boolean dSSolicitudPIUEnvioDocDrvTieneSegundaFirma) {
        this.dSSolicitudPIUEnvioDocDrvTieneSegundaFirma = dSSolicitudPIUEnvioDocDrvTieneSegundaFirma;
    }

    @JsonIgnore
    public Long getDSSolicitudPIUEnvioDocEstadoDoc() {
        return this.dSSolicitudPIUEnvioDocEstadoDoc;
    }
    
    public void setDSSolicitudPIUEnvioDocEstadoDoc(Long dSSolicitudPIUEnvioDocEstadoDoc) {
        this.dSSolicitudPIUEnvioDocEstadoDoc = dSSolicitudPIUEnvioDocEstadoDoc;
    }
}
