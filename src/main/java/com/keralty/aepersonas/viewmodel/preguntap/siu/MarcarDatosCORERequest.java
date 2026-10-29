package com.keralty.aepersonas.viewmodel.preguntap.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PreguntaPConstants;
import com.keralty.aepersonas.persistence.oid.PreguntaPOid;
import com.keralty.aepersonas.persistence.PreguntaP;

public class MarcarDatosCORERequest {

    @JsonProperty("p_thispreguntap_oid")
    private PreguntaPOid preguntaPmarcarDatosCOREpthisPreguntaP;
    
    @JsonIgnore
    private PreguntaP preguntaPmarcarDatosCOREpthisPreguntaPInstance;

    @JsonProperty("p_respuestasino")
    private Boolean preguntaPmarcarDatosCOREpRespuestaSiNo;

    @JsonProperty("p_respuestaobs")
    private String preguntaPmarcarDatosCOREpRespuestaObs;

    public void checkArguments() throws NotNullArgumentException {
        checkPreguntaPmarcarDatosCOREpthisPreguntaP();
    }

    @JsonIgnore
    public PreguntaPOid getPreguntaPmarcarDatosCOREpthisPreguntaP() {
        return this.preguntaPmarcarDatosCOREpthisPreguntaP;
    }
    
    public void setPreguntaPmarcarDatosCOREpthisPreguntaP(PreguntaPOid preguntaPmarcarDatosCOREpthisPreguntaP) {
        this.preguntaPmarcarDatosCOREpthisPreguntaP = preguntaPmarcarDatosCOREpthisPreguntaP;
    }

    @JsonIgnore
    public PreguntaP getPreguntaPmarcarDatosCOREpthisPreguntaPInstance() {
        return this.preguntaPmarcarDatosCOREpthisPreguntaPInstance;
    }
    
    public void setPreguntaPmarcarDatosCOREpthisPreguntaPInstance(PreguntaP preguntaPmarcarDatosCOREpthisPreguntaP) {
        this.preguntaPmarcarDatosCOREpthisPreguntaPInstance = preguntaPmarcarDatosCOREpthisPreguntaP;
        this.preguntaPmarcarDatosCOREpthisPreguntaP = preguntaPmarcarDatosCOREpthisPreguntaP != null ? preguntaPmarcarDatosCOREpthisPreguntaP.getOid() : null;
    }

    private void checkPreguntaPmarcarDatosCOREpthisPreguntaP() throws NotNullArgumentException {
        if(this.getPreguntaPmarcarDatosCOREpthisPreguntaPInstance() == null || this.getPreguntaPmarcarDatosCOREpthisPreguntaPInstance().isNull()) {
            throw new NotNullArgumentException(PreguntaPConstants.SERV_ID_MARCARDATOSCORE, PreguntaPConstants.CLASS_ID, PreguntaPConstants.ARG_ID_MARCARDATOSCORE_PREGUNTAPMARCARDATOSCOREPTHISPREGUNTAP, PreguntaPConstants.SERV_ALIAS_MARCARDATOSCORE, PreguntaPConstants.CLASS_ALIAS, PreguntaPConstants.ARG_ALIAS_MARCARDATOSCORE_PREGUNTAPMARCARDATOSCOREPTHISPREGUNTAP);
        }
    }

    @JsonIgnore
    public Boolean getPreguntaPmarcarDatosCOREpRespuestaSiNo() {
        return this.preguntaPmarcarDatosCOREpRespuestaSiNo;
    }
    
    public void setPreguntaPmarcarDatosCOREpRespuestaSiNo(Boolean preguntaPmarcarDatosCOREpRespuestaSiNo) {
        this.preguntaPmarcarDatosCOREpRespuestaSiNo = preguntaPmarcarDatosCOREpRespuestaSiNo;
    }

    @JsonIgnore
    public String getPreguntaPmarcarDatosCOREpRespuestaObs() {
        return this.preguntaPmarcarDatosCOREpRespuestaObs;
    }
    
    public void setPreguntaPmarcarDatosCOREpRespuestaObs(String preguntaPmarcarDatosCOREpRespuestaObs) {
        this.preguntaPmarcarDatosCOREpRespuestaObs = preguntaPmarcarDatosCOREpRespuestaObs;
    }
}
