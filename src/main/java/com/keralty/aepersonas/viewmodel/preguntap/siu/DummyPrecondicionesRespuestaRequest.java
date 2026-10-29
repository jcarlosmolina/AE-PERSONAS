package com.keralty.aepersonas.viewmodel.preguntap.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PreguntaPConstants;
import com.keralty.aepersonas.persistence.oid.PreguntaPOid;
import com.keralty.aepersonas.persistence.PreguntaP;

public class DummyPrecondicionesRespuestaRequest {

    @JsonProperty("p_thispreguntap_oid")
    private PreguntaPOid preguntaPdummyPrecondicionesRespuestapthisPreguntaP;
    
    @JsonIgnore
    private PreguntaP preguntaPdummyPrecondicionesRespuestapthisPreguntaPInstance;

    @JsonProperty("preconditionId")
    private String preconditionId;

    public void checkArguments() throws NotNullArgumentException {
        checkPreguntaPdummyPrecondicionesRespuestapthisPreguntaP();
    }

    @JsonIgnore
    public PreguntaPOid getPreguntaPdummyPrecondicionesRespuestapthisPreguntaP() {
        return this.preguntaPdummyPrecondicionesRespuestapthisPreguntaP;
    }
    
    public void setPreguntaPdummyPrecondicionesRespuestapthisPreguntaP(PreguntaPOid preguntaPdummyPrecondicionesRespuestapthisPreguntaP) {
        this.preguntaPdummyPrecondicionesRespuestapthisPreguntaP = preguntaPdummyPrecondicionesRespuestapthisPreguntaP;
    }

    @JsonIgnore
    public PreguntaP getPreguntaPdummyPrecondicionesRespuestapthisPreguntaPInstance() {
        return this.preguntaPdummyPrecondicionesRespuestapthisPreguntaPInstance;
    }
    
    public void setPreguntaPdummyPrecondicionesRespuestapthisPreguntaPInstance(PreguntaP preguntaPdummyPrecondicionesRespuestapthisPreguntaP) {
        this.preguntaPdummyPrecondicionesRespuestapthisPreguntaPInstance = preguntaPdummyPrecondicionesRespuestapthisPreguntaP;
        this.preguntaPdummyPrecondicionesRespuestapthisPreguntaP = preguntaPdummyPrecondicionesRespuestapthisPreguntaP != null ? preguntaPdummyPrecondicionesRespuestapthisPreguntaP.getOid() : null;
    }

    private void checkPreguntaPdummyPrecondicionesRespuestapthisPreguntaP() throws NotNullArgumentException {
        if(this.getPreguntaPdummyPrecondicionesRespuestapthisPreguntaPInstance() == null || this.getPreguntaPdummyPrecondicionesRespuestapthisPreguntaPInstance().isNull()) {
            throw new NotNullArgumentException(PreguntaPConstants.SERV_ID_DUMMYPRECONDICIONESRESPUESTA, PreguntaPConstants.CLASS_ID, PreguntaPConstants.ARG_ID_DUMMYPRECONDICIONESRESPUESTA_PREGUNTAPDUMMYPRECONDICIONESRESPUESTAPTHISPREGUNTAP, PreguntaPConstants.SERV_ALIAS_DUMMYPRECONDICIONESRESPUESTA, PreguntaPConstants.CLASS_ALIAS, PreguntaPConstants.ARG_ALIAS_DUMMYPRECONDICIONESRESPUESTA_PREGUNTAPDUMMYPRECONDICIONESRESPUESTAPTHISPREGUNTAP);
        }
    }

    @JsonIgnore
    public String getPreconditionId() {
        return this.preconditionId;
    }
    
    public void setPreconditionId(String preconditionId) {
        this.preconditionId = preconditionId;
    }
}
