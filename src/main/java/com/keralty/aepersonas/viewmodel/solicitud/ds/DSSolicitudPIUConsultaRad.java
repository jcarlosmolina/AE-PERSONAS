package com.keralty.aepersonas.viewmodel.solicitud.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Solicitud;
public class DSSolicitudPIUConsultaRad {

    @JsonProperty("aesolicitudes_numerosolicitud")
    private String dSSolicitudPIUConsultaRadAesolicitudesDotNumerosolicitud;

    @JsonProperty("aesolicitudes_productot_descripcion")
    private String dSSolicitudPIUConsultaRadAesolicitudesDotProductoTDotDescripcion;

    @JsonProperty("aesolicitudes_plant_nombre")
    private String dSSolicitudPIUConsultaRadAesolicitudesDotPlanTDotNombre;

    @JsonProperty("tramite")
    private Long dSSolicitudPIUConsultaRadTramite;

    public DSSolicitudPIUConsultaRad() {
    
    }

    public DSSolicitudPIUConsultaRad(Solicitud instance) {
        if (instance != null) {
            try {
                this.dSSolicitudPIUConsultaRadAesolicitudesDotNumerosolicitud = instance.getAesolicitudes().getAesolicitudesNumerosolicitud();
                this.dSSolicitudPIUConsultaRadAesolicitudesDotProductoTDotDescripcion = instance.getAesolicitudes().getProductoT().getProductosDescripcion();
                this.dSSolicitudPIUConsultaRadAesolicitudesDotPlanTDotNombre = instance.getAesolicitudes().getPlanT().getPlanesNombre();
                this.dSSolicitudPIUConsultaRadTramite = instance.getSolicitudTramite();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getDSSolicitudPIUConsultaRadAesolicitudesDotNumerosolicitud() {
        return this.dSSolicitudPIUConsultaRadAesolicitudesDotNumerosolicitud;
    }
    
    public void setDSSolicitudPIUConsultaRadAesolicitudesDotNumerosolicitud(String dSSolicitudPIUConsultaRadAesolicitudesDotNumerosolicitud) {
        this.dSSolicitudPIUConsultaRadAesolicitudesDotNumerosolicitud = dSSolicitudPIUConsultaRadAesolicitudesDotNumerosolicitud;
    }

    @JsonIgnore
    public String getDSSolicitudPIUConsultaRadAesolicitudesDotProductoTDotDescripcion() {
        return this.dSSolicitudPIUConsultaRadAesolicitudesDotProductoTDotDescripcion;
    }
    
    public void setDSSolicitudPIUConsultaRadAesolicitudesDotProductoTDotDescripcion(String dSSolicitudPIUConsultaRadAesolicitudesDotProductoTDotDescripcion) {
        this.dSSolicitudPIUConsultaRadAesolicitudesDotProductoTDotDescripcion = dSSolicitudPIUConsultaRadAesolicitudesDotProductoTDotDescripcion;
    }

    @JsonIgnore
    public String getDSSolicitudPIUConsultaRadAesolicitudesDotPlanTDotNombre() {
        return this.dSSolicitudPIUConsultaRadAesolicitudesDotPlanTDotNombre;
    }
    
    public void setDSSolicitudPIUConsultaRadAesolicitudesDotPlanTDotNombre(String dSSolicitudPIUConsultaRadAesolicitudesDotPlanTDotNombre) {
        this.dSSolicitudPIUConsultaRadAesolicitudesDotPlanTDotNombre = dSSolicitudPIUConsultaRadAesolicitudesDotPlanTDotNombre;
    }

    @JsonIgnore
    public Long getDSSolicitudPIUConsultaRadTramite() {
        return this.dSSolicitudPIUConsultaRadTramite;
    }
    
    public void setDSSolicitudPIUConsultaRadTramite(Long dSSolicitudPIUConsultaRadTramite) {
        this.dSSolicitudPIUConsultaRadTramite = dSSolicitudPIUConsultaRadTramite;
    }
}
