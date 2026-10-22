package com.keralty.aepersonas.viewmodel.seccionp.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.SeccionP;
public class DSSeccionPNull {

    @JsonProperty("identificador")
    private Long dSSeccionPNullIdentificador;

    public DSSeccionPNull() {
    
    }

    public DSSeccionPNull(SeccionP instance) {
        if (instance != null) {
            this.dSSeccionPNullIdentificador = instance.getSeccionPIdentificador();
        }
    }

    @JsonIgnore
    public Long getDSSeccionPNullIdentificador() {
        return this.dSSeccionPNullIdentificador;
    }
    
    public void setDSSeccionPNullIdentificador(Long dSSeccionPNullIdentificador) {
        this.dSSeccionPNullIdentificador = dSSeccionPNullIdentificador;
    }
}
