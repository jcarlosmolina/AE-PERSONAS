package com.keralty.aepersonas.viewmodel.preguntap.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PreguntaPConstants;
import com.keralty.aepersonas.persistence.oid.PreguntaOid;
import com.keralty.aepersonas.persistence.oid.PreguntaPOid;
import com.keralty.aepersonas.persistence.Pregunta;
import com.keralty.aepersonas.persistence.PreguntaP;

public class InsPreguntaAPersonaRequest {

    @JsonProperty("p_thispreguntap_oid")
    private PreguntaPOid preguntaPInsPreguntaAPersonapthisPreguntaP;
    
    @JsonIgnore
    private PreguntaP preguntaPInsPreguntaAPersonapthisPreguntaPInstance;

    @JsonProperty("p_evcpregunta_oid")
    private PreguntaOid preguntaPInsPreguntaAPersonapevcPregunta;
    
    @JsonIgnore
    private Pregunta preguntaPInsPreguntaAPersonapevcPreguntaInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkPreguntaPInsPreguntaAPersonapthisPreguntaP();
        checkPreguntaPInsPreguntaAPersonapevcPregunta();
    }

    @JsonIgnore
    public PreguntaPOid getPreguntaPInsPreguntaAPersonapthisPreguntaP() {
        return this.preguntaPInsPreguntaAPersonapthisPreguntaP;
    }
    
    public void setPreguntaPInsPreguntaAPersonapthisPreguntaP(PreguntaPOid preguntaPInsPreguntaAPersonapthisPreguntaP) {
        this.preguntaPInsPreguntaAPersonapthisPreguntaP = preguntaPInsPreguntaAPersonapthisPreguntaP;
    }

    @JsonIgnore
    public PreguntaP getPreguntaPInsPreguntaAPersonapthisPreguntaPInstance() {
        return this.preguntaPInsPreguntaAPersonapthisPreguntaPInstance;
    }
    
    public void setPreguntaPInsPreguntaAPersonapthisPreguntaPInstance(PreguntaP preguntaPInsPreguntaAPersonapthisPreguntaP) {
        this.preguntaPInsPreguntaAPersonapthisPreguntaPInstance = preguntaPInsPreguntaAPersonapthisPreguntaP;
        this.preguntaPInsPreguntaAPersonapthisPreguntaP = preguntaPInsPreguntaAPersonapthisPreguntaP != null ? preguntaPInsPreguntaAPersonapthisPreguntaP.getOid() : null;
    }

    private void checkPreguntaPInsPreguntaAPersonapthisPreguntaP() throws NotNullArgumentException {
        if(this.getPreguntaPInsPreguntaAPersonapthisPreguntaPInstance() == null || this.getPreguntaPInsPreguntaAPersonapthisPreguntaPInstance().isNull()) {
            throw new NotNullArgumentException(PreguntaPConstants.SERV_ID_INSPREGUNTAAPERSONA, PreguntaPConstants.CLASS_ID, PreguntaPConstants.ARG_ID_INSPREGUNTAAPERSONA_PREGUNTAPINSPREGUNTAAPERSONAPTHISPREGUNTAP, PreguntaPConstants.SERV_ALIAS_INSPREGUNTAAPERSONA, PreguntaPConstants.CLASS_ALIAS, PreguntaPConstants.ARG_ALIAS_INSPREGUNTAAPERSONA_PREGUNTAPINSPREGUNTAAPERSONAPTHISPREGUNTAP);
        }
    }

    @JsonIgnore
    public PreguntaOid getPreguntaPInsPreguntaAPersonapevcPregunta() {
        return this.preguntaPInsPreguntaAPersonapevcPregunta;
    }
    
    public void setPreguntaPInsPreguntaAPersonapevcPregunta(PreguntaOid preguntaPInsPreguntaAPersonapevcPregunta) {
        this.preguntaPInsPreguntaAPersonapevcPregunta = preguntaPInsPreguntaAPersonapevcPregunta;
    }

    @JsonIgnore
    public Pregunta getPreguntaPInsPreguntaAPersonapevcPreguntaInstance() {
        return this.preguntaPInsPreguntaAPersonapevcPreguntaInstance;
    }
    
    public void setPreguntaPInsPreguntaAPersonapevcPreguntaInstance(Pregunta preguntaPInsPreguntaAPersonapevcPregunta) {
        this.preguntaPInsPreguntaAPersonapevcPreguntaInstance = preguntaPInsPreguntaAPersonapevcPregunta;
        this.preguntaPInsPreguntaAPersonapevcPregunta = preguntaPInsPreguntaAPersonapevcPregunta != null ? preguntaPInsPreguntaAPersonapevcPregunta.getOid() : null;
    }

    private void checkPreguntaPInsPreguntaAPersonapevcPregunta() throws NotNullArgumentException {
        if(this.getPreguntaPInsPreguntaAPersonapevcPreguntaInstance() == null || this.getPreguntaPInsPreguntaAPersonapevcPreguntaInstance().isNull()) {
            throw new NotNullArgumentException(PreguntaPConstants.SERV_ID_INSPREGUNTAAPERSONA, PreguntaPConstants.CLASS_ID, PreguntaPConstants.ARG_ID_INSPREGUNTAAPERSONA_PREGUNTAPINSPREGUNTAAPERSONAPEVCPREGUNTA, PreguntaPConstants.SERV_ALIAS_INSPREGUNTAAPERSONA, PreguntaPConstants.CLASS_ALIAS, PreguntaPConstants.ARG_ALIAS_INSPREGUNTAAPERSONA_PREGUNTAPINSPREGUNTAAPERSONAPEVCPREGUNTA);
        }
    }
}
