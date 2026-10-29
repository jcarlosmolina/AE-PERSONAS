package com.keralty.aepersonas.viewmodel.afiliaciones.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Afiliaciones;
public class DSAfiliacionesNull {

    @JsonProperty("id")
    private Long dSAfiliacionesNullId;

    public DSAfiliacionesNull() {
    
    }

    public DSAfiliacionesNull(Afiliaciones instance) {
        if (instance != null) {
            try {
                this.dSAfiliacionesNullId = instance.getFuncionarioId();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public Long getDSAfiliacionesNullId() {
        return this.dSAfiliacionesNullId;
    }
    
    public void setDSAfiliacionesNullId(Long dSAfiliacionesNullId) {
        this.dSAfiliacionesNullId = dSAfiliacionesNullId;
    }
}
