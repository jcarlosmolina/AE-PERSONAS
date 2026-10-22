package com.keralty.aepersonas.viewmodel.solicitud.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Solicitud;
public class DSSolicitudIIUInfoObservacion {

    @JsonProperty("numradicado")
    private Long dSSolicitudIIUInfoObservacionNumRadicado;

    public DSSolicitudIIUInfoObservacion() {
    
    }

    public DSSolicitudIIUInfoObservacion(Solicitud instance) {
        if (instance != null) {
            this.dSSolicitudIIUInfoObservacionNumRadicado = instance.getSolicitudNumRadicado();
        }
    }

    @JsonIgnore
    public Long getDSSolicitudIIUInfoObservacionNumRadicado() {
        return this.dSSolicitudIIUInfoObservacionNumRadicado;
    }
    
    public void setDSSolicitudIIUInfoObservacionNumRadicado(Long dSSolicitudIIUInfoObservacionNumRadicado) {
        this.dSSolicitudIIUInfoObservacionNumRadicado = dSSolicitudIIUInfoObservacionNumRadicado;
    }
}
