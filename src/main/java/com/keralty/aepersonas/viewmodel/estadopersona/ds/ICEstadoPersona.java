package com.keralty.aepersonas.viewmodel.estadopersona.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.EstadoPersona;
public class ICEstadoPersona {

    @JsonProperty("descripcion")
    private String iCEstadoPersonaDescripcion;

    public ICEstadoPersona() {
    
    }

    public ICEstadoPersona(EstadoPersona instance) {
        if (instance != null) {
            this.iCEstadoPersonaDescripcion = instance.getEstadoPersonaDescripcion();
        }
    }

    @JsonIgnore
    public String getICEstadoPersonaDescripcion() {
        return this.iCEstadoPersonaDescripcion;
    }
    
    public void setICEstadoPersonaDescripcion(String iCEstadoPersonaDescripcion) {
        this.iCEstadoPersonaDescripcion = iCEstadoPersonaDescripcion;
    }
}
