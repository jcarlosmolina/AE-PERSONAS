package com.keralty.aepersonas.viewmodel.tipoidentificacion.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
public class DSTipoIdentificacionNull {

    @JsonProperty("codigo")
    private Long dSTipoIdentificacionNullCodigo;

    public DSTipoIdentificacionNull() {
    
    }

    public DSTipoIdentificacionNull(TipoIdentificacion instance) {
        if (instance != null) {
            this.dSTipoIdentificacionNullCodigo = instance.getTipoIdentificacionCodigo();
        }
    }

    @JsonIgnore
    public Long getDSTipoIdentificacionNullCodigo() {
        return this.dSTipoIdentificacionNullCodigo;
    }
    
    public void setDSTipoIdentificacionNullCodigo(Long dSTipoIdentificacionNullCodigo) {
        this.dSTipoIdentificacionNullCodigo = dSTipoIdentificacionNullCodigo;
    }
}
