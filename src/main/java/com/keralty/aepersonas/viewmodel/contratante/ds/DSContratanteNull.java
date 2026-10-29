package com.keralty.aepersonas.viewmodel.contratante.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Contratante;
public class DSContratanteNull {

    @JsonProperty("codigo")
    private Long dSContratanteNullCodigo;

    public DSContratanteNull() {
    
    }

    public DSContratanteNull(Contratante instance) {
        if (instance != null) {
            this.dSContratanteNullCodigo = instance.getContratanteCodigo();
        }
    }

    @JsonIgnore
    public Long getDSContratanteNullCodigo() {
        return this.dSContratanteNullCodigo;
    }
    
    public void setDSContratanteNullCodigo(Long dSContratanteNullCodigo) {
        this.dSContratanteNullCodigo = dSContratanteNullCodigo;
    }
}
