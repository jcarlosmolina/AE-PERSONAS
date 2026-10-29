package com.keralty.aepersonas.viewmodel.tipodireccion.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.TipoDireccion;
public class ICTipoDireccion {

    @JsonProperty("descripcion")
    private String iCTipoDireccionDescripcion;

    public ICTipoDireccion() {
    
    }

    public ICTipoDireccion(TipoDireccion instance) {
        if (instance != null) {
            this.iCTipoDireccionDescripcion = instance.getTipoDireccionDescripcion();
        }
    }

    @JsonIgnore
    public String getICTipoDireccionDescripcion() {
        return this.iCTipoDireccionDescripcion;
    }
    
    public void setICTipoDireccionDescripcion(String iCTipoDireccionDescripcion) {
        this.iCTipoDireccionDescripcion = iCTipoDireccionDescripcion;
    }
}
