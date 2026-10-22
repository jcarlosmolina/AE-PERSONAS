package com.keralty.aepersonas.viewmodel.asesor.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Asesor;
public class DSAsesorNull {

    @JsonProperty("id")
    private Long dSAsesorNullId;

    public DSAsesorNull() {
    
    }

    public DSAsesorNull(Asesor instance) {
        if (instance != null) {
            try {
                this.dSAsesorNullId = instance.getFuncionarioId();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public Long getDSAsesorNullId() {
        return this.dSAsesorNullId;
    }
    
    public void setDSAsesorNullId(Long dSAsesorNullId) {
        this.dSAsesorNullId = dSAsesorNullId;
    }
}
