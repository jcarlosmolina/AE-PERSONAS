package com.keralty.aepersonas.viewmodel.solicitud.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Solicitud;
public class DSSolicitudIIUInfoPago {

    @JsonProperty("numradicado")
    private Long dSSolicitudIIUInfoPagoNumRadicado;

    public DSSolicitudIIUInfoPago() {
    
    }

    public DSSolicitudIIUInfoPago(Solicitud instance) {
        if (instance != null) {
            this.dSSolicitudIIUInfoPagoNumRadicado = instance.getSolicitudNumRadicado();
        }
    }

    @JsonIgnore
    public Long getDSSolicitudIIUInfoPagoNumRadicado() {
        return this.dSSolicitudIIUInfoPagoNumRadicado;
    }
    
    public void setDSSolicitudIIUInfoPagoNumRadicado(Long dSSolicitudIIUInfoPagoNumRadicado) {
        this.dSSolicitudIIUInfoPagoNumRadicado = dSSolicitudIIUInfoPagoNumRadicado;
    }
}
