package com.keralty.aepersonas.viewmodel.estadocivil.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.EstadoCivil;
public class ICEstadoCivil {

    @JsonProperty("descripcion")
    private String iCEstadoCivilDescripcion;

    public ICEstadoCivil() {
    
    }

    public ICEstadoCivil(EstadoCivil instance) {
        if (instance != null) {
            this.iCEstadoCivilDescripcion = instance.getEstadoCivilDescripcion();
        }
    }

    @JsonIgnore
    public String getICEstadoCivilDescripcion() {
        return this.iCEstadoCivilDescripcion;
    }
    
    public void setICEstadoCivilDescripcion(String iCEstadoCivilDescripcion) {
        this.iCEstadoCivilDescripcion = iCEstadoCivilDescripcion;
    }
}
