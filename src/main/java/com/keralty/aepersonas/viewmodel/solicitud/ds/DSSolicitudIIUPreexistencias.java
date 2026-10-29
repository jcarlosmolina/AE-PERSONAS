package com.keralty.aepersonas.viewmodel.solicitud.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Solicitud;
public class DSSolicitudIIUPreexistencias {

    @JsonProperty("aesolicitudes_numerosolicitud")
    private String dSSolicitudIIUPreexistenciasAesolicitudesDotNumerosolicitud;

    @JsonProperty("numcontrato")
    private String dSSolicitudIIUPreexistenciasNumContrato;

    public DSSolicitudIIUPreexistencias() {
    
    }

    public DSSolicitudIIUPreexistencias(Solicitud instance) {
        if (instance != null) {
            try {
                this.dSSolicitudIIUPreexistenciasAesolicitudesDotNumerosolicitud = instance.getAesolicitudes().getAesolicitudesNumerosolicitud();
                this.dSSolicitudIIUPreexistenciasNumContrato = instance.getSolicitudNumContrato();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getDSSolicitudIIUPreexistenciasAesolicitudesDotNumerosolicitud() {
        return this.dSSolicitudIIUPreexistenciasAesolicitudesDotNumerosolicitud;
    }
    
    public void setDSSolicitudIIUPreexistenciasAesolicitudesDotNumerosolicitud(String dSSolicitudIIUPreexistenciasAesolicitudesDotNumerosolicitud) {
        this.dSSolicitudIIUPreexistenciasAesolicitudesDotNumerosolicitud = dSSolicitudIIUPreexistenciasAesolicitudesDotNumerosolicitud;
    }

    @JsonIgnore
    public String getDSSolicitudIIUPreexistenciasNumContrato() {
        return this.dSSolicitudIIUPreexistenciasNumContrato;
    }
    
    public void setDSSolicitudIIUPreexistenciasNumContrato(String dSSolicitudIIUPreexistenciasNumContrato) {
        this.dSSolicitudIIUPreexistenciasNumContrato = dSSolicitudIIUPreexistenciasNumContrato;
    }
}
