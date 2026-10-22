package com.keralty.aepersonas.viewmodel.departamento.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Departamento;
public class ICDepartamento {

    @JsonProperty("descripcion")
    private String iCDepartamentoDescripcion;

    public ICDepartamento() {
    
    }

    public ICDepartamento(Departamento instance) {
        if (instance != null) {
            this.iCDepartamentoDescripcion = instance.getDepartamentoDescripcion();
        }
    }

    @JsonIgnore
    public String getICDepartamentoDescripcion() {
        return this.iCDepartamentoDescripcion;
    }
    
    public void setICDepartamentoDescripcion(String iCDepartamentoDescripcion) {
        this.iCDepartamentoDescripcion = iCDepartamentoDescripcion;
    }
}
