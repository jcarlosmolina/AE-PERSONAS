package com.keralty.aepersonas.viewmodel.pais.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Pais;
public class ICPais {

    @JsonProperty("descripcion")
    private String iCPaisDescripcion;

    public ICPais() {
    
    }

    public ICPais(Pais instance) {
        if (instance != null) {
            this.iCPaisDescripcion = instance.getPaisDescripcion();
        }
    }

    @JsonIgnore
    public String getICPaisDescripcion() {
        return this.iCPaisDescripcion;
    }
    
    public void setICPaisDescripcion(String iCPaisDescripcion) {
        this.iCPaisDescripcion = iCPaisDescripcion;
    }
}
