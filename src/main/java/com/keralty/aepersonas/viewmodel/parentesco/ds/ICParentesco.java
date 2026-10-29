package com.keralty.aepersonas.viewmodel.parentesco.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Parentesco;
public class ICParentesco {

    @JsonProperty("descripcion")
    private String iCParentescoDescripcion;

    public ICParentesco() {
    
    }

    public ICParentesco(Parentesco instance) {
        if (instance != null) {
            this.iCParentescoDescripcion = instance.getParentescoDescripcion();
        }
    }

    @JsonIgnore
    public String getICParentescoDescripcion() {
        return this.iCParentescoDescripcion;
    }
    
    public void setICParentescoDescripcion(String iCParentescoDescripcion) {
        this.iCParentescoDescripcion = iCParentescoDescripcion;
    }
}
