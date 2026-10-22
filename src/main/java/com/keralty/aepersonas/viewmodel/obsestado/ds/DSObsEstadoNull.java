package com.keralty.aepersonas.viewmodel.obsestado.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.ObsEstado;
public class DSObsEstadoNull {

    @JsonProperty("id")
    private Long dSObsEstadoNullId;

    public DSObsEstadoNull() {
    
    }

    public DSObsEstadoNull(ObsEstado instance) {
        if (instance != null) {
            this.dSObsEstadoNullId = instance.getObsEstadoId();
        }
    }

    @JsonIgnore
    public Long getDSObsEstadoNullId() {
        return this.dSObsEstadoNullId;
    }
    
    public void setDSObsEstadoNullId(Long dSObsEstadoNullId) {
        this.dSObsEstadoNullId = dSObsEstadoNullId;
    }
}
