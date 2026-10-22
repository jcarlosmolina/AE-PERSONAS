package com.keralty.aepersonas.viewmodel.areamedica.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.AreaMedica;
public class DSAreaMedicaNull {

    @JsonProperty("id")
    private Long dSAreaMedicaNullId;

    public DSAreaMedicaNull() {
    
    }

    public DSAreaMedicaNull(AreaMedica instance) {
        if (instance != null) {
            try {
                this.dSAreaMedicaNullId = instance.getFuncionarioId();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public Long getDSAreaMedicaNullId() {
        return this.dSAreaMedicaNullId;
    }
    
    public void setDSAreaMedicaNullId(Long dSAreaMedicaNullId) {
        this.dSAreaMedicaNullId = dSAreaMedicaNullId;
    }
}
