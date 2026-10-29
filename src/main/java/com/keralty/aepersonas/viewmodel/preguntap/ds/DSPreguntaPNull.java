package com.keralty.aepersonas.viewmodel.preguntap.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.PreguntaP;
public class DSPreguntaPNull {

    @JsonProperty("identificador")
    private Long dSPreguntaPNullIdentificador;

    public DSPreguntaPNull() {
    
    }

    public DSPreguntaPNull(PreguntaP instance) {
        if (instance != null) {
            this.dSPreguntaPNullIdentificador = instance.getPreguntaPIdentificador();
        }
    }

    @JsonIgnore
    public Long getDSPreguntaPNullIdentificador() {
        return this.dSPreguntaPNullIdentificador;
    }
    
    public void setDSPreguntaPNullIdentificador(Long dSPreguntaPNullIdentificador) {
        this.dSPreguntaPNullIdentificador = dSPreguntaPNullIdentificador;
    }
}
