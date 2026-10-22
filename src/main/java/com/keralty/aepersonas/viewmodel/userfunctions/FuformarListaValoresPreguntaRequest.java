package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.oid.PreguntaOid;
import com.keralty.aepersonas.persistence.Pregunta;
public class FuformarListaValoresPreguntaRequest {

    @JsonProperty("pfu_pregunta")
    private PreguntaOid pfuPregunta;

    @JsonIgnore
    private Pregunta pfuPreguntaInstance;

    public FuformarListaValoresPreguntaRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public PreguntaOid getPfuPregunta() {
        return this.pfuPregunta;
    }
    
    public void setPfuPregunta(PreguntaOid pfuPregunta) {
        this.pfuPregunta = pfuPregunta;
    }

    @JsonIgnore
    public Pregunta getPfuPreguntaInstance() {
        if (this.pfuPreguntaInstance == null)
            this.pfuPreguntaInstance = new Pregunta();
        return this.pfuPreguntaInstance;
    }
    
    public void setPfuPreguntaInstance(Pregunta pfuPregunta) {
        this.pfuPreguntaInstance = pfuPregunta;
        this.pfuPregunta = pfuPregunta != null ? pfuPregunta.getOid() : null;
    }
}
