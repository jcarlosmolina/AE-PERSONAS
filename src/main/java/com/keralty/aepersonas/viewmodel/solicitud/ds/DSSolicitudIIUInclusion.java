package com.keralty.aepersonas.viewmodel.solicitud.ds;

import java.sql.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Solicitud;
public class DSSolicitudIIUInclusion {

    @JsonProperty("aesolicitudes_numerosolicitud")
    private String dSSolicitudIIUInclusionAesolicitudesDotNumerosolicitud;

    @JsonProperty("aesolicitudes_fechaasignacion")
    private Date dSSolicitudIIUInclusionAesolicitudesDotFechaasignacion;

    @JsonProperty("finiciocontrato")
    private Date dSSolicitudIIUInclusionFInicioContrato;

    @JsonProperty("tipocontrato")
    private Long dSSolicitudIIUInclusionTipoContrato;

    @JsonProperty("drvgrupoasociado")
    private String dSSolicitudIIUInclusionDrvGrupoAsociado;

    @JsonProperty("numcontratoinclusion")
    private String dSSolicitudIIUInclusionNumContratoInclusion;

    @JsonProperty("numfamilia")
    private String dSSolicitudIIUInclusionNumFamilia;

    @JsonProperty("enviocarnetfisico")
    private Boolean dSSolicitudIIUInclusionEnvioCarnetFisico;

    @JsonProperty("firma_imagenfirma")
    private byte[] dSSolicitudIIUInclusionFirmaDotImagenFirma;

    public DSSolicitudIIUInclusion() {
    
    }

    public DSSolicitudIIUInclusion(Solicitud instance) {
        if (instance != null) {
            try {
                this.dSSolicitudIIUInclusionAesolicitudesDotNumerosolicitud = instance.getAesolicitudes().getAesolicitudesNumerosolicitud();
                this.dSSolicitudIIUInclusionAesolicitudesDotFechaasignacion = instance.getAesolicitudes().getAesolicitudesFechaasignacion();
                this.dSSolicitudIIUInclusionFInicioContrato = instance.getSolicitudFInicioContrato();
                this.dSSolicitudIIUInclusionTipoContrato = instance.getSolicitudtipoContrato();
                this.dSSolicitudIIUInclusionDrvGrupoAsociado = instance.getSolicituddrvGrupoAsociado();
                this.dSSolicitudIIUInclusionNumContratoInclusion = instance.getSolicitudNumContratoInclusion();
                this.dSSolicitudIIUInclusionNumFamilia = instance.getSolicitudNumFamilia();
                this.dSSolicitudIIUInclusionEnvioCarnetFisico = instance.getSolicitudEnvioCarnetFisico();
                this.dSSolicitudIIUInclusionFirmaDotImagenFirma = instance.getFirma().getFirmaImagenFirma();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getDSSolicitudIIUInclusionAesolicitudesDotNumerosolicitud() {
        return this.dSSolicitudIIUInclusionAesolicitudesDotNumerosolicitud;
    }
    
    public void setDSSolicitudIIUInclusionAesolicitudesDotNumerosolicitud(String dSSolicitudIIUInclusionAesolicitudesDotNumerosolicitud) {
        this.dSSolicitudIIUInclusionAesolicitudesDotNumerosolicitud = dSSolicitudIIUInclusionAesolicitudesDotNumerosolicitud;
    }

    @JsonIgnore
    public Date getDSSolicitudIIUInclusionAesolicitudesDotFechaasignacion() {
        return this.dSSolicitudIIUInclusionAesolicitudesDotFechaasignacion;
    }
    
    public void setDSSolicitudIIUInclusionAesolicitudesDotFechaasignacion(Date dSSolicitudIIUInclusionAesolicitudesDotFechaasignacion) {
        this.dSSolicitudIIUInclusionAesolicitudesDotFechaasignacion = dSSolicitudIIUInclusionAesolicitudesDotFechaasignacion;
    }

    @JsonIgnore
    public Date getDSSolicitudIIUInclusionFInicioContrato() {
        return this.dSSolicitudIIUInclusionFInicioContrato;
    }
    
    public void setDSSolicitudIIUInclusionFInicioContrato(Date dSSolicitudIIUInclusionFInicioContrato) {
        this.dSSolicitudIIUInclusionFInicioContrato = dSSolicitudIIUInclusionFInicioContrato;
    }

    @JsonIgnore
    public Long getDSSolicitudIIUInclusionTipoContrato() {
        return this.dSSolicitudIIUInclusionTipoContrato;
    }
    
    public void setDSSolicitudIIUInclusionTipoContrato(Long dSSolicitudIIUInclusionTipoContrato) {
        this.dSSolicitudIIUInclusionTipoContrato = dSSolicitudIIUInclusionTipoContrato;
    }

    @JsonIgnore
    public String getDSSolicitudIIUInclusionDrvGrupoAsociado() {
        return this.dSSolicitudIIUInclusionDrvGrupoAsociado;
    }
    
    public void setDSSolicitudIIUInclusionDrvGrupoAsociado(String dSSolicitudIIUInclusionDrvGrupoAsociado) {
        this.dSSolicitudIIUInclusionDrvGrupoAsociado = dSSolicitudIIUInclusionDrvGrupoAsociado;
    }

    @JsonIgnore
    public String getDSSolicitudIIUInclusionNumContratoInclusion() {
        return this.dSSolicitudIIUInclusionNumContratoInclusion;
    }
    
    public void setDSSolicitudIIUInclusionNumContratoInclusion(String dSSolicitudIIUInclusionNumContratoInclusion) {
        this.dSSolicitudIIUInclusionNumContratoInclusion = dSSolicitudIIUInclusionNumContratoInclusion;
    }

    @JsonIgnore
    public String getDSSolicitudIIUInclusionNumFamilia() {
        return this.dSSolicitudIIUInclusionNumFamilia;
    }
    
    public void setDSSolicitudIIUInclusionNumFamilia(String dSSolicitudIIUInclusionNumFamilia) {
        this.dSSolicitudIIUInclusionNumFamilia = dSSolicitudIIUInclusionNumFamilia;
    }

    @JsonIgnore
    public Boolean getDSSolicitudIIUInclusionEnvioCarnetFisico() {
        return this.dSSolicitudIIUInclusionEnvioCarnetFisico;
    }
    
    public void setDSSolicitudIIUInclusionEnvioCarnetFisico(Boolean dSSolicitudIIUInclusionEnvioCarnetFisico) {
        this.dSSolicitudIIUInclusionEnvioCarnetFisico = dSSolicitudIIUInclusionEnvioCarnetFisico;
    }

    @JsonIgnore
    public byte[] getDSSolicitudIIUInclusionFirmaDotImagenFirma() {
        return this.dSSolicitudIIUInclusionFirmaDotImagenFirma;
    }
    
    public void setDSSolicitudIIUInclusionFirmaDotImagenFirma(byte[] dSSolicitudIIUInclusionFirmaDotImagenFirma) {
        this.dSSolicitudIIUInclusionFirmaDotImagenFirma = dSSolicitudIIUInclusionFirmaDotImagenFirma;
    }
}
