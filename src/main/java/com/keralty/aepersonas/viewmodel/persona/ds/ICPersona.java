package com.keralty.aepersonas.viewmodel.persona.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Persona;
public class ICPersona {

    @JsonProperty("tipoidentificacion_nombrecorto")
    private String iCPersonaTipoIdentificacionDotNombreCorto;

    @JsonProperty("numidentificacion")
    private String iCPersonaNumIdentificacion;

    public ICPersona() {
    
    }

    public ICPersona(Persona instance) {
        if (instance != null) {
            try {
                this.iCPersonaTipoIdentificacionDotNombreCorto = instance.getTipoIdentificacion().getTipoIdentificacionNombreCorto();
                this.iCPersonaNumIdentificacion = instance.getPersonaNumIdentificacion();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getICPersonaTipoIdentificacionDotNombreCorto() {
        return this.iCPersonaTipoIdentificacionDotNombreCorto;
    }
    
    public void setICPersonaTipoIdentificacionDotNombreCorto(String iCPersonaTipoIdentificacionDotNombreCorto) {
        this.iCPersonaTipoIdentificacionDotNombreCorto = iCPersonaTipoIdentificacionDotNombreCorto;
    }

    @JsonIgnore
    public String getICPersonaNumIdentificacion() {
        return this.iCPersonaNumIdentificacion;
    }
    
    public void setICPersonaNumIdentificacion(String iCPersonaNumIdentificacion) {
        this.iCPersonaNumIdentificacion = iCPersonaNumIdentificacion;
    }
}
