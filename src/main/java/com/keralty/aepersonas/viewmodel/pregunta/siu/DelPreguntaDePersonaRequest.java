package com.keralty.aepersonas.viewmodel.pregunta.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PreguntaConstants;
import com.keralty.aepersonas.persistence.oid.PreguntaOid;
import com.keralty.aepersonas.persistence.oid.PreguntaPOid;
import com.keralty.aepersonas.persistence.Pregunta;
import com.keralty.aepersonas.persistence.PreguntaP;

public class DelPreguntaDePersonaRequest {

    @JsonProperty("p_thispregunta_oid")
    private PreguntaOid preguntaDelPreguntaDePersonapthisPregunta;
    
    @JsonIgnore
    private Pregunta preguntaDelPreguntaDePersonapthisPreguntaInstance;

    @JsonProperty("p_evcpreguntap_oid")
    private PreguntaPOid preguntaDelPreguntaDePersonapevcPreguntaP;
    
    @JsonIgnore
    private PreguntaP preguntaDelPreguntaDePersonapevcPreguntaPInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkPreguntaDelPreguntaDePersonapthisPregunta();
        checkPreguntaDelPreguntaDePersonapevcPreguntaP();
    }

    @JsonIgnore
    public PreguntaOid getPreguntaDelPreguntaDePersonapthisPregunta() {
        return this.preguntaDelPreguntaDePersonapthisPregunta;
    }
    
    public void setPreguntaDelPreguntaDePersonapthisPregunta(PreguntaOid preguntaDelPreguntaDePersonapthisPregunta) {
        this.preguntaDelPreguntaDePersonapthisPregunta = preguntaDelPreguntaDePersonapthisPregunta;
    }

    @JsonIgnore
    public Pregunta getPreguntaDelPreguntaDePersonapthisPreguntaInstance() {
        return this.preguntaDelPreguntaDePersonapthisPreguntaInstance;
    }
    
    public void setPreguntaDelPreguntaDePersonapthisPreguntaInstance(Pregunta preguntaDelPreguntaDePersonapthisPregunta) {
        this.preguntaDelPreguntaDePersonapthisPreguntaInstance = preguntaDelPreguntaDePersonapthisPregunta;
        this.preguntaDelPreguntaDePersonapthisPregunta = preguntaDelPreguntaDePersonapthisPregunta != null ? preguntaDelPreguntaDePersonapthisPregunta.getOid() : null;
    }

    private void checkPreguntaDelPreguntaDePersonapthisPregunta() throws NotNullArgumentException {
        if(this.getPreguntaDelPreguntaDePersonapthisPreguntaInstance() == null || this.getPreguntaDelPreguntaDePersonapthisPreguntaInstance().isNull()) {
            throw new NotNullArgumentException(PreguntaConstants.SERV_ID_DELPREGUNTADEPERSONA, PreguntaConstants.CLASS_ID, PreguntaConstants.ARG_ID_DELPREGUNTADEPERSONA_PREGUNTADELPREGUNTADEPERSONAPTHISPREGUNTA, PreguntaConstants.SERV_ALIAS_DELPREGUNTADEPERSONA, PreguntaConstants.CLASS_ALIAS, PreguntaConstants.ARG_ALIAS_DELPREGUNTADEPERSONA_PREGUNTADELPREGUNTADEPERSONAPTHISPREGUNTA);
        }
    }

    @JsonIgnore
    public PreguntaPOid getPreguntaDelPreguntaDePersonapevcPreguntaP() {
        return this.preguntaDelPreguntaDePersonapevcPreguntaP;
    }
    
    public void setPreguntaDelPreguntaDePersonapevcPreguntaP(PreguntaPOid preguntaDelPreguntaDePersonapevcPreguntaP) {
        this.preguntaDelPreguntaDePersonapevcPreguntaP = preguntaDelPreguntaDePersonapevcPreguntaP;
    }

    @JsonIgnore
    public PreguntaP getPreguntaDelPreguntaDePersonapevcPreguntaPInstance() {
        return this.preguntaDelPreguntaDePersonapevcPreguntaPInstance;
    }
    
    public void setPreguntaDelPreguntaDePersonapevcPreguntaPInstance(PreguntaP preguntaDelPreguntaDePersonapevcPreguntaP) {
        this.preguntaDelPreguntaDePersonapevcPreguntaPInstance = preguntaDelPreguntaDePersonapevcPreguntaP;
        this.preguntaDelPreguntaDePersonapevcPreguntaP = preguntaDelPreguntaDePersonapevcPreguntaP != null ? preguntaDelPreguntaDePersonapevcPreguntaP.getOid() : null;
    }

    private void checkPreguntaDelPreguntaDePersonapevcPreguntaP() throws NotNullArgumentException {
        if(this.getPreguntaDelPreguntaDePersonapevcPreguntaPInstance() == null || this.getPreguntaDelPreguntaDePersonapevcPreguntaPInstance().isNull()) {
            throw new NotNullArgumentException(PreguntaConstants.SERV_ID_DELPREGUNTADEPERSONA, PreguntaConstants.CLASS_ID, PreguntaConstants.ARG_ID_DELPREGUNTADEPERSONA_PREGUNTADELPREGUNTADEPERSONAPEVCPREGUNTAP, PreguntaConstants.SERV_ALIAS_DELPREGUNTADEPERSONA, PreguntaConstants.CLASS_ALIAS, PreguntaConstants.ARG_ALIAS_DELPREGUNTADEPERSONA_PREGUNTADELPREGUNTADEPERSONAPEVCPREGUNTAP);
        }
    }
}
