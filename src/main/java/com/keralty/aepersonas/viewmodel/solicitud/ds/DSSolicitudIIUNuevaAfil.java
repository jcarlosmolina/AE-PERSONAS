package com.keralty.aepersonas.viewmodel.solicitud.ds;

import java.sql.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Solicitud;
public class DSSolicitudIIUNuevaAfil {

    @JsonProperty("aesolicitudes_numerosolicitud")
    private String dSSolicitudIIUNuevaAfilAesolicitudesDotNumerosolicitud;

    @JsonProperty("aesolicitudes_fechaasignacion")
    private Date dSSolicitudIIUNuevaAfilAesolicitudesDotFechaasignacion;

    @JsonProperty("finiciocontrato")
    private Date dSSolicitudIIUNuevaAfilFInicioContrato;

    @JsonProperty("drvgrupoasociado")
    private String dSSolicitudIIUNuevaAfilDrvGrupoAsociado;

    @JsonProperty("estraslado")
    private Boolean dSSolicitudIIUNuevaAfilEsTraslado;

    @JsonProperty("enviocarnetfisico")
    private Boolean dSSolicitudIIUNuevaAfilEnvioCarnetFisico;

    @JsonProperty("firma_imagenfirma")
    private byte[] dSSolicitudIIUNuevaAfilFirmaDotImagenFirma;

    public DSSolicitudIIUNuevaAfil() {
    
    }

    public DSSolicitudIIUNuevaAfil(Solicitud instance) {
        if (instance != null) {
            try {
                this.dSSolicitudIIUNuevaAfilAesolicitudesDotNumerosolicitud = instance.getAesolicitudes().getAesolicitudesNumerosolicitud();
                this.dSSolicitudIIUNuevaAfilAesolicitudesDotFechaasignacion = instance.getAesolicitudes().getAesolicitudesFechaasignacion();
                this.dSSolicitudIIUNuevaAfilFInicioContrato = instance.getSolicitudFInicioContrato();
                this.dSSolicitudIIUNuevaAfilDrvGrupoAsociado = instance.getSolicituddrvGrupoAsociado();
                this.dSSolicitudIIUNuevaAfilEsTraslado = instance.getSolicitudEsTraslado();
                this.dSSolicitudIIUNuevaAfilEnvioCarnetFisico = instance.getSolicitudEnvioCarnetFisico();
                this.dSSolicitudIIUNuevaAfilFirmaDotImagenFirma = instance.getFirma().getFirmaImagenFirma();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getDSSolicitudIIUNuevaAfilAesolicitudesDotNumerosolicitud() {
        return this.dSSolicitudIIUNuevaAfilAesolicitudesDotNumerosolicitud;
    }
    
    public void setDSSolicitudIIUNuevaAfilAesolicitudesDotNumerosolicitud(String dSSolicitudIIUNuevaAfilAesolicitudesDotNumerosolicitud) {
        this.dSSolicitudIIUNuevaAfilAesolicitudesDotNumerosolicitud = dSSolicitudIIUNuevaAfilAesolicitudesDotNumerosolicitud;
    }

    @JsonIgnore
    public Date getDSSolicitudIIUNuevaAfilAesolicitudesDotFechaasignacion() {
        return this.dSSolicitudIIUNuevaAfilAesolicitudesDotFechaasignacion;
    }
    
    public void setDSSolicitudIIUNuevaAfilAesolicitudesDotFechaasignacion(Date dSSolicitudIIUNuevaAfilAesolicitudesDotFechaasignacion) {
        this.dSSolicitudIIUNuevaAfilAesolicitudesDotFechaasignacion = dSSolicitudIIUNuevaAfilAesolicitudesDotFechaasignacion;
    }

    @JsonIgnore
    public Date getDSSolicitudIIUNuevaAfilFInicioContrato() {
        return this.dSSolicitudIIUNuevaAfilFInicioContrato;
    }
    
    public void setDSSolicitudIIUNuevaAfilFInicioContrato(Date dSSolicitudIIUNuevaAfilFInicioContrato) {
        this.dSSolicitudIIUNuevaAfilFInicioContrato = dSSolicitudIIUNuevaAfilFInicioContrato;
    }

    @JsonIgnore
    public String getDSSolicitudIIUNuevaAfilDrvGrupoAsociado() {
        return this.dSSolicitudIIUNuevaAfilDrvGrupoAsociado;
    }
    
    public void setDSSolicitudIIUNuevaAfilDrvGrupoAsociado(String dSSolicitudIIUNuevaAfilDrvGrupoAsociado) {
        this.dSSolicitudIIUNuevaAfilDrvGrupoAsociado = dSSolicitudIIUNuevaAfilDrvGrupoAsociado;
    }

    @JsonIgnore
    public Boolean getDSSolicitudIIUNuevaAfilEsTraslado() {
        return this.dSSolicitudIIUNuevaAfilEsTraslado;
    }
    
    public void setDSSolicitudIIUNuevaAfilEsTraslado(Boolean dSSolicitudIIUNuevaAfilEsTraslado) {
        this.dSSolicitudIIUNuevaAfilEsTraslado = dSSolicitudIIUNuevaAfilEsTraslado;
    }

    @JsonIgnore
    public Boolean getDSSolicitudIIUNuevaAfilEnvioCarnetFisico() {
        return this.dSSolicitudIIUNuevaAfilEnvioCarnetFisico;
    }
    
    public void setDSSolicitudIIUNuevaAfilEnvioCarnetFisico(Boolean dSSolicitudIIUNuevaAfilEnvioCarnetFisico) {
        this.dSSolicitudIIUNuevaAfilEnvioCarnetFisico = dSSolicitudIIUNuevaAfilEnvioCarnetFisico;
    }

    @JsonIgnore
    public byte[] getDSSolicitudIIUNuevaAfilFirmaDotImagenFirma() {
        return this.dSSolicitudIIUNuevaAfilFirmaDotImagenFirma;
    }
    
    public void setDSSolicitudIIUNuevaAfilFirmaDotImagenFirma(byte[] dSSolicitudIIUNuevaAfilFirmaDotImagenFirma) {
        this.dSSolicitudIIUNuevaAfilFirmaDotImagenFirma = dSSolicitudIIUNuevaAfilFirmaDotImagenFirma;
    }
}
