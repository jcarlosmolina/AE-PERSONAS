package com.keralty.aepersonas.viewmodel.solicitud.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Solicitud;
public class DSSolicitudInfoContratanteID {

    @JsonProperty("contratante_drvidentificacion")
    private String dSSolicitudInfoContratanteIDContratanteDotDrvIdentificacion;

    @JsonProperty("contratante_tipoidentificacion_nit")
    private Boolean dSSolicitudInfoContratanteIDContratanteDotTipoIdentificacionDotNIT;

    public DSSolicitudInfoContratanteID() {
    
    }

    public DSSolicitudInfoContratanteID(Solicitud instance) {
        if (instance != null) {
            try {
                this.dSSolicitudInfoContratanteIDContratanteDotDrvIdentificacion = instance.getContratante().getContratantedrvIdentificacion();
                this.dSSolicitudInfoContratanteIDContratanteDotTipoIdentificacionDotNIT = instance.getContratante().getTipoIdentificacion().getTipoIdentificacionNIT();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getDSSolicitudInfoContratanteIDContratanteDotDrvIdentificacion() {
        return this.dSSolicitudInfoContratanteIDContratanteDotDrvIdentificacion;
    }
    
    public void setDSSolicitudInfoContratanteIDContratanteDotDrvIdentificacion(String dSSolicitudInfoContratanteIDContratanteDotDrvIdentificacion) {
        this.dSSolicitudInfoContratanteIDContratanteDotDrvIdentificacion = dSSolicitudInfoContratanteIDContratanteDotDrvIdentificacion;
    }

    @JsonIgnore
    public Boolean getDSSolicitudInfoContratanteIDContratanteDotTipoIdentificacionDotNIT() {
        return this.dSSolicitudInfoContratanteIDContratanteDotTipoIdentificacionDotNIT;
    }
    
    public void setDSSolicitudInfoContratanteIDContratanteDotTipoIdentificacionDotNIT(Boolean dSSolicitudInfoContratanteIDContratanteDotTipoIdentificacionDotNIT) {
        this.dSSolicitudInfoContratanteIDContratanteDotTipoIdentificacionDotNIT = dSSolicitudInfoContratanteIDContratanteDotTipoIdentificacionDotNIT;
    }
}
