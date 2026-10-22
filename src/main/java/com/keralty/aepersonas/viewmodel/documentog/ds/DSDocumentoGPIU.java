package com.keralty.aepersonas.viewmodel.documentog.ds;

import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.DocumentoG;
public class DSDocumentoGPIU {

    @JsonProperty("solicitud_aesolicitudes_numerosolicitud")
    private String dSDocumentoGPIUSolicitudDotAesolicitudesDotNumerosolicitud;

    @JsonProperty("persona_drvtiponumdoc")
    private String dSDocumentoGPIUPersonaDotDrvTipoNumDoc;

    @JsonProperty("persona_tieneepssanitas")
    private Boolean dSDocumentoGPIUPersonaDotTieneEPSSanitas;

    @JsonProperty("fechasubida")
    private Timestamp dSDocumentoGPIUFechaSubida;

    @JsonProperty("tipo")
    private Long dSDocumentoGPIUTipo;

    @JsonProperty("nombre")
    private String dSDocumentoGPIUNombre;

    @JsonProperty("estado")
    private Long dSDocumentoGPIUEstado;

    @JsonProperty("descripcion")
    private String dSDocumentoGPIUDescripcion;

    @JsonProperty("persona_datosbasicosmod")
    private Boolean dSDocumentoGPIUPersonaDotDatosBasicosMod;

    public DSDocumentoGPIU() {
    
    }

    public DSDocumentoGPIU(DocumentoG instance) {
        if (instance != null) {
            try {
                this.dSDocumentoGPIUSolicitudDotAesolicitudesDotNumerosolicitud = instance.getSolicitud().getAesolicitudes().getAesolicitudesNumerosolicitud();
                this.dSDocumentoGPIUPersonaDotDrvTipoNumDoc = instance.getPersona().getPersonadrvTipoNumDoc();
                this.dSDocumentoGPIUPersonaDotTieneEPSSanitas = instance.getPersona().getPersonaTieneEPSSanitas();
                this.dSDocumentoGPIUFechaSubida = instance.getDocumentoGFechaSubida();
                this.dSDocumentoGPIUTipo = instance.getDocumentoGTipo();
                this.dSDocumentoGPIUNombre = instance.getDocumentoGNombre();
                this.dSDocumentoGPIUEstado = instance.getDocumentoGEstado();
                this.dSDocumentoGPIUDescripcion = instance.getDocumentoGDescripcion();
                this.dSDocumentoGPIUPersonaDotDatosBasicosMod = instance.getPersona().getPersonaDatosBasicosMod();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getDSDocumentoGPIUSolicitudDotAesolicitudesDotNumerosolicitud() {
        return this.dSDocumentoGPIUSolicitudDotAesolicitudesDotNumerosolicitud;
    }
    
    public void setDSDocumentoGPIUSolicitudDotAesolicitudesDotNumerosolicitud(String dSDocumentoGPIUSolicitudDotAesolicitudesDotNumerosolicitud) {
        this.dSDocumentoGPIUSolicitudDotAesolicitudesDotNumerosolicitud = dSDocumentoGPIUSolicitudDotAesolicitudesDotNumerosolicitud;
    }

    @JsonIgnore
    public String getDSDocumentoGPIUPersonaDotDrvTipoNumDoc() {
        return this.dSDocumentoGPIUPersonaDotDrvTipoNumDoc;
    }
    
    public void setDSDocumentoGPIUPersonaDotDrvTipoNumDoc(String dSDocumentoGPIUPersonaDotDrvTipoNumDoc) {
        this.dSDocumentoGPIUPersonaDotDrvTipoNumDoc = dSDocumentoGPIUPersonaDotDrvTipoNumDoc;
    }

    @JsonIgnore
    public Boolean getDSDocumentoGPIUPersonaDotTieneEPSSanitas() {
        return this.dSDocumentoGPIUPersonaDotTieneEPSSanitas;
    }
    
    public void setDSDocumentoGPIUPersonaDotTieneEPSSanitas(Boolean dSDocumentoGPIUPersonaDotTieneEPSSanitas) {
        this.dSDocumentoGPIUPersonaDotTieneEPSSanitas = dSDocumentoGPIUPersonaDotTieneEPSSanitas;
    }

    @JsonIgnore
    public Timestamp getDSDocumentoGPIUFechaSubida() {
        return this.dSDocumentoGPIUFechaSubida;
    }
    
    public void setDSDocumentoGPIUFechaSubida(Timestamp dSDocumentoGPIUFechaSubida) {
        this.dSDocumentoGPIUFechaSubida = dSDocumentoGPIUFechaSubida;
    }

    @JsonIgnore
    public Long getDSDocumentoGPIUTipo() {
        return this.dSDocumentoGPIUTipo;
    }
    
    public void setDSDocumentoGPIUTipo(Long dSDocumentoGPIUTipo) {
        this.dSDocumentoGPIUTipo = dSDocumentoGPIUTipo;
    }

    @JsonIgnore
    public String getDSDocumentoGPIUNombre() {
        return this.dSDocumentoGPIUNombre;
    }
    
    public void setDSDocumentoGPIUNombre(String dSDocumentoGPIUNombre) {
        this.dSDocumentoGPIUNombre = dSDocumentoGPIUNombre;
    }

    @JsonIgnore
    public Long getDSDocumentoGPIUEstado() {
        return this.dSDocumentoGPIUEstado;
    }
    
    public void setDSDocumentoGPIUEstado(Long dSDocumentoGPIUEstado) {
        this.dSDocumentoGPIUEstado = dSDocumentoGPIUEstado;
    }

    @JsonIgnore
    public String getDSDocumentoGPIUDescripcion() {
        return this.dSDocumentoGPIUDescripcion;
    }
    
    public void setDSDocumentoGPIUDescripcion(String dSDocumentoGPIUDescripcion) {
        this.dSDocumentoGPIUDescripcion = dSDocumentoGPIUDescripcion;
    }

    @JsonIgnore
    public Boolean getDSDocumentoGPIUPersonaDotDatosBasicosMod() {
        return this.dSDocumentoGPIUPersonaDotDatosBasicosMod;
    }
    
    public void setDSDocumentoGPIUPersonaDotDatosBasicosMod(Boolean dSDocumentoGPIUPersonaDotDatosBasicosMod) {
        this.dSDocumentoGPIUPersonaDotDatosBasicosMod = dSDocumentoGPIUPersonaDotDatosBasicosMod;
    }
}
