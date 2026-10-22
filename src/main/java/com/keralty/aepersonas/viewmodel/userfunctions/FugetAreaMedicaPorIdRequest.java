package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FugetAreaMedicaPorIdRequest {

    @JsonProperty("pfidareamedica")
    private Long pfIdAreaMedica;

    public FugetAreaMedicaPorIdRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public Long getPfIdAreaMedica() {
        return this.pfIdAreaMedica;
    }
    
    public void setPfIdAreaMedica(Long pfIdAreaMedica) {
        this.pfIdAreaMedica = pfIdAreaMedica;
    }
}
