package com.keralty.aepersonas.viewmodel.estadobeneficiario.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.EstadoBeneficiario;
public class ICEstadoBeneficiario {

    @JsonProperty("descripcion")
    private String iCEstadoBeneficiarioDescripcion;

    public ICEstadoBeneficiario() {
    
    }

    public ICEstadoBeneficiario(EstadoBeneficiario instance) {
        if (instance != null) {
            this.iCEstadoBeneficiarioDescripcion = instance.getEstadoBeneficiarioDescripcion();
        }
    }

    @JsonIgnore
    public String getICEstadoBeneficiarioDescripcion() {
        return this.iCEstadoBeneficiarioDescripcion;
    }
    
    public void setICEstadoBeneficiarioDescripcion(String iCEstadoBeneficiarioDescripcion) {
        this.iCEstadoBeneficiarioDescripcion = iCEstadoBeneficiarioDescripcion;
    }
}
