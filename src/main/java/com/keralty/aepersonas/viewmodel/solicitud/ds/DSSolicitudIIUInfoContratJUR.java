package com.keralty.aepersonas.viewmodel.solicitud.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Solicitud;
public class DSSolicitudIIUInfoContratJUR {

    @JsonProperty("contratante_razonsocial")
    private String dSSolicitudIIUInfoContratJURContratanteDotRazonSocial;

    public DSSolicitudIIUInfoContratJUR() {
    
    }

    public DSSolicitudIIUInfoContratJUR(Solicitud instance) {
        if (instance != null) {
            try {
                this.dSSolicitudIIUInfoContratJURContratanteDotRazonSocial = instance.getContratante().getContratanteRazonSocial();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getDSSolicitudIIUInfoContratJURContratanteDotRazonSocial() {
        return this.dSSolicitudIIUInfoContratJURContratanteDotRazonSocial;
    }
    
    public void setDSSolicitudIIUInfoContratJURContratanteDotRazonSocial(String dSSolicitudIIUInfoContratJURContratanteDotRazonSocial) {
        this.dSSolicitudIIUInfoContratJURContratanteDotRazonSocial = dSSolicitudIIUInfoContratJURContratanteDotRazonSocial;
    }
}
