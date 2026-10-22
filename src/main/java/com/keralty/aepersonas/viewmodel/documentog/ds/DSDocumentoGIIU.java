package com.keralty.aepersonas.viewmodel.documentog.ds;

import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.DocumentoG;
public class DSDocumentoGIIU {

    @JsonProperty("solicitud_aesolicitudes_numerosolicitud")
    private String dSDocumentoGIIUSolicitudDotAesolicitudesDotNumerosolicitud;

    @JsonProperty("drvnumcontrato")
    private String dSDocumentoGIIUDrvNumContrato;

    @JsonProperty("persona_drvtiponumdoc")
    private String dSDocumentoGIIUPersonaDotDrvTipoNumDoc;

    @JsonProperty("persona_drvnombrecompleto")
    private String dSDocumentoGIIUPersonaDotDrvNombreCompleto;

    @JsonProperty("estado")
    private Long dSDocumentoGIIUEstado;

    @JsonProperty("tipo")
    private Long dSDocumentoGIIUTipo;

    @JsonProperty("descripcion")
    private String dSDocumentoGIIUDescripcion;

    @JsonProperty("fechasubida")
    private Timestamp dSDocumentoGIIUFechaSubida;

    @JsonProperty("iddocengestor")
    private String dSDocumentoGIIUIdDocEnGestor;

    @JsonProperty("resultadosubida")
    private String dSDocumentoGIIUResultadoSubida;

    @JsonProperty("emailenviodevuelto")
    private String dSDocumentoGIIUEmailEnvioDevuelto;

    @JsonProperty("numdescargas")
    private Long dSDocumentoGIIUNumDescargas;

    public DSDocumentoGIIU() {
    
    }

    public DSDocumentoGIIU(DocumentoG instance) {
        if (instance != null) {
            try {
                this.dSDocumentoGIIUSolicitudDotAesolicitudesDotNumerosolicitud = instance.getSolicitud().getAesolicitudes().getAesolicitudesNumerosolicitud();
                this.dSDocumentoGIIUDrvNumContrato = instance.getDocumentoGDrvNumContrato();
                this.dSDocumentoGIIUPersonaDotDrvTipoNumDoc = instance.getPersona().getPersonadrvTipoNumDoc();
                this.dSDocumentoGIIUPersonaDotDrvNombreCompleto = instance.getPersona().getPersonadrvNombreCompleto();
                this.dSDocumentoGIIUEstado = instance.getDocumentoGEstado();
                this.dSDocumentoGIIUTipo = instance.getDocumentoGTipo();
                this.dSDocumentoGIIUDescripcion = instance.getDocumentoGDescripcion();
                this.dSDocumentoGIIUFechaSubida = instance.getDocumentoGFechaSubida();
                this.dSDocumentoGIIUIdDocEnGestor = instance.getDocumentoGIdDocEnGestor();
                this.dSDocumentoGIIUResultadoSubida = instance.getDocumentoGResultadoSubida();
                this.dSDocumentoGIIUEmailEnvioDevuelto = instance.getDocumentoGEmailEnvioDevuelto();
                this.dSDocumentoGIIUNumDescargas = instance.getDocumentoGNumDescargas();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getDSDocumentoGIIUSolicitudDotAesolicitudesDotNumerosolicitud() {
        return this.dSDocumentoGIIUSolicitudDotAesolicitudesDotNumerosolicitud;
    }
    
    public void setDSDocumentoGIIUSolicitudDotAesolicitudesDotNumerosolicitud(String dSDocumentoGIIUSolicitudDotAesolicitudesDotNumerosolicitud) {
        this.dSDocumentoGIIUSolicitudDotAesolicitudesDotNumerosolicitud = dSDocumentoGIIUSolicitudDotAesolicitudesDotNumerosolicitud;
    }

    @JsonIgnore
    public String getDSDocumentoGIIUDrvNumContrato() {
        return this.dSDocumentoGIIUDrvNumContrato;
    }
    
    public void setDSDocumentoGIIUDrvNumContrato(String dSDocumentoGIIUDrvNumContrato) {
        this.dSDocumentoGIIUDrvNumContrato = dSDocumentoGIIUDrvNumContrato;
    }

    @JsonIgnore
    public String getDSDocumentoGIIUPersonaDotDrvTipoNumDoc() {
        return this.dSDocumentoGIIUPersonaDotDrvTipoNumDoc;
    }
    
    public void setDSDocumentoGIIUPersonaDotDrvTipoNumDoc(String dSDocumentoGIIUPersonaDotDrvTipoNumDoc) {
        this.dSDocumentoGIIUPersonaDotDrvTipoNumDoc = dSDocumentoGIIUPersonaDotDrvTipoNumDoc;
    }

    @JsonIgnore
    public String getDSDocumentoGIIUPersonaDotDrvNombreCompleto() {
        return this.dSDocumentoGIIUPersonaDotDrvNombreCompleto;
    }
    
    public void setDSDocumentoGIIUPersonaDotDrvNombreCompleto(String dSDocumentoGIIUPersonaDotDrvNombreCompleto) {
        this.dSDocumentoGIIUPersonaDotDrvNombreCompleto = dSDocumentoGIIUPersonaDotDrvNombreCompleto;
    }

    @JsonIgnore
    public Long getDSDocumentoGIIUEstado() {
        return this.dSDocumentoGIIUEstado;
    }
    
    public void setDSDocumentoGIIUEstado(Long dSDocumentoGIIUEstado) {
        this.dSDocumentoGIIUEstado = dSDocumentoGIIUEstado;
    }

    @JsonIgnore
    public Long getDSDocumentoGIIUTipo() {
        return this.dSDocumentoGIIUTipo;
    }
    
    public void setDSDocumentoGIIUTipo(Long dSDocumentoGIIUTipo) {
        this.dSDocumentoGIIUTipo = dSDocumentoGIIUTipo;
    }

    @JsonIgnore
    public String getDSDocumentoGIIUDescripcion() {
        return this.dSDocumentoGIIUDescripcion;
    }
    
    public void setDSDocumentoGIIUDescripcion(String dSDocumentoGIIUDescripcion) {
        this.dSDocumentoGIIUDescripcion = dSDocumentoGIIUDescripcion;
    }

    @JsonIgnore
    public Timestamp getDSDocumentoGIIUFechaSubida() {
        return this.dSDocumentoGIIUFechaSubida;
    }
    
    public void setDSDocumentoGIIUFechaSubida(Timestamp dSDocumentoGIIUFechaSubida) {
        this.dSDocumentoGIIUFechaSubida = dSDocumentoGIIUFechaSubida;
    }

    @JsonIgnore
    public String getDSDocumentoGIIUIdDocEnGestor() {
        return this.dSDocumentoGIIUIdDocEnGestor;
    }
    
    public void setDSDocumentoGIIUIdDocEnGestor(String dSDocumentoGIIUIdDocEnGestor) {
        this.dSDocumentoGIIUIdDocEnGestor = dSDocumentoGIIUIdDocEnGestor;
    }

    @JsonIgnore
    public String getDSDocumentoGIIUResultadoSubida() {
        return this.dSDocumentoGIIUResultadoSubida;
    }
    
    public void setDSDocumentoGIIUResultadoSubida(String dSDocumentoGIIUResultadoSubida) {
        this.dSDocumentoGIIUResultadoSubida = dSDocumentoGIIUResultadoSubida;
    }

    @JsonIgnore
    public String getDSDocumentoGIIUEmailEnvioDevuelto() {
        return this.dSDocumentoGIIUEmailEnvioDevuelto;
    }
    
    public void setDSDocumentoGIIUEmailEnvioDevuelto(String dSDocumentoGIIUEmailEnvioDevuelto) {
        this.dSDocumentoGIIUEmailEnvioDevuelto = dSDocumentoGIIUEmailEnvioDevuelto;
    }

    @JsonIgnore
    public Long getDSDocumentoGIIUNumDescargas() {
        return this.dSDocumentoGIIUNumDescargas;
    }
    
    public void setDSDocumentoGIIUNumDescargas(Long dSDocumentoGIIUNumDescargas) {
        this.dSDocumentoGIIUNumDescargas = dSDocumentoGIIUNumDescargas;
    }
}
