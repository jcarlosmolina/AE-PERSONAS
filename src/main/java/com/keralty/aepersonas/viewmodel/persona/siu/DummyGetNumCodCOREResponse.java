package com.keralty.aepersonas.viewmodel.persona.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.viewmodel.ServiceResponse;
import java.util.HashMap;
import java.util.Map;

public class DummyGetNumCodCOREResponse extends ServiceResponse {

    @JsonProperty("pscodigo")
    private Long personadummyGetNumCodCOREpsCodigo;

    public DummyGetNumCodCOREResponse() {
        super();
    }

    @JsonIgnore
    public Long getPersonadummyGetNumCodCOREpsCodigo() {
        return this.personadummyGetNumCodCOREpsCodigo;
    }
    
    public void setPersonadummyGetNumCodCOREpsCodigo(Long personadummyGetNumCodCOREpsCodigo) {
        this.personadummyGetNumCodCOREpsCodigo = personadummyGetNumCodCOREpsCodigo;
    }

    @Override
    public Map<String, Object> buildOutArgs() {
        Map<String, Object> outArgs = new HashMap<>();
        outArgs.put("personadummyGetNumCodCOREpsCodigo", personadummyGetNumCodCOREpsCodigo);
        return outArgs;
    }
}
