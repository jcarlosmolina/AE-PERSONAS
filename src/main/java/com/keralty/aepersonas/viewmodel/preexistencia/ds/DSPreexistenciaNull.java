package com.keralty.aepersonas.viewmodel.preexistencia.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Preexistencia;
public class DSPreexistenciaNull {

    @JsonProperty("identificador")
    private Long dSPreexistenciaNullIdentificador;

    public DSPreexistenciaNull() {
    
    }

    public DSPreexistenciaNull(Preexistencia instance) {
        if (instance != null) {
            this.dSPreexistenciaNullIdentificador = instance.getPreexistenciaIdentificador();
        }
    }

    @JsonIgnore
    public Long getDSPreexistenciaNullIdentificador() {
        return this.dSPreexistenciaNullIdentificador;
    }
    
    public void setDSPreexistenciaNullIdentificador(Long dSPreexistenciaNullIdentificador) {
        this.dSPreexistenciaNullIdentificador = dSPreexistenciaNullIdentificador;
    }
}
