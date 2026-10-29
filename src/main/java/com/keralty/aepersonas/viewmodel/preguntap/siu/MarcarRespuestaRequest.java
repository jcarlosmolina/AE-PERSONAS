package com.keralty.aepersonas.viewmodel.preguntap.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PreguntaPConstants;
import com.keralty.aepersonas.persistence.oid.PreguntaPOid;
import com.keralty.aepersonas.persistence.PreguntaP;

public class MarcarRespuestaRequest {

    @JsonProperty("p_thispreguntap_oid")
    private PreguntaPOid preguntaPmarcarRespuestapthisPreguntaP;
    
    @JsonIgnore
    private PreguntaP preguntaPmarcarRespuestapthisPreguntaPInstance;

    @JsonProperty("p_respuestasino")
    private Boolean preguntaPmarcarRespuestapRespuestaSiNo;

    @JsonProperty("p_respuestaobs")
    private String preguntaPmarcarRespuestapRespuestaObs;

    @JsonProperty("pe_valoresrespuestas")
    private String preguntaPmarcarRespuestapeValoresRespuestas;

    public void checkArguments() throws NotNullArgumentException {
        checkPreguntaPmarcarRespuestapthisPreguntaP();
    }

    @JsonIgnore
    public PreguntaPOid getPreguntaPmarcarRespuestapthisPreguntaP() {
        return this.preguntaPmarcarRespuestapthisPreguntaP;
    }
    
    public void setPreguntaPmarcarRespuestapthisPreguntaP(PreguntaPOid preguntaPmarcarRespuestapthisPreguntaP) {
        this.preguntaPmarcarRespuestapthisPreguntaP = preguntaPmarcarRespuestapthisPreguntaP;
    }

    @JsonIgnore
    public PreguntaP getPreguntaPmarcarRespuestapthisPreguntaPInstance() {
        return this.preguntaPmarcarRespuestapthisPreguntaPInstance;
    }
    
    public void setPreguntaPmarcarRespuestapthisPreguntaPInstance(PreguntaP preguntaPmarcarRespuestapthisPreguntaP) {
        this.preguntaPmarcarRespuestapthisPreguntaPInstance = preguntaPmarcarRespuestapthisPreguntaP;
        this.preguntaPmarcarRespuestapthisPreguntaP = preguntaPmarcarRespuestapthisPreguntaP != null ? preguntaPmarcarRespuestapthisPreguntaP.getOid() : null;
    }

    private void checkPreguntaPmarcarRespuestapthisPreguntaP() throws NotNullArgumentException {
        if(this.getPreguntaPmarcarRespuestapthisPreguntaPInstance() == null || this.getPreguntaPmarcarRespuestapthisPreguntaPInstance().isNull()) {
            throw new NotNullArgumentException(PreguntaPConstants.SERV_ID_MARCARRESPUESTA, PreguntaPConstants.CLASS_ID, PreguntaPConstants.ARG_ID_MARCARRESPUESTA_PREGUNTAPMARCARRESPUESTAPTHISPREGUNTAP, PreguntaPConstants.SERV_ALIAS_MARCARRESPUESTA, PreguntaPConstants.CLASS_ALIAS, PreguntaPConstants.ARG_ALIAS_MARCARRESPUESTA_PREGUNTAPMARCARRESPUESTAPTHISPREGUNTAP);
        }
    }

    @JsonIgnore
    public Boolean getPreguntaPmarcarRespuestapRespuestaSiNo() {
        return this.preguntaPmarcarRespuestapRespuestaSiNo;
    }
    
    public void setPreguntaPmarcarRespuestapRespuestaSiNo(Boolean preguntaPmarcarRespuestapRespuestaSiNo) {
        this.preguntaPmarcarRespuestapRespuestaSiNo = preguntaPmarcarRespuestapRespuestaSiNo;
    }

    @JsonIgnore
    public String getPreguntaPmarcarRespuestapRespuestaObs() {
        return this.preguntaPmarcarRespuestapRespuestaObs;
    }
    
    public void setPreguntaPmarcarRespuestapRespuestaObs(String preguntaPmarcarRespuestapRespuestaObs) {
        this.preguntaPmarcarRespuestapRespuestaObs = preguntaPmarcarRespuestapRespuestaObs;
    }

    @JsonIgnore
    public String getPreguntaPmarcarRespuestapeValoresRespuestas() {
        return this.preguntaPmarcarRespuestapeValoresRespuestas;
    }
    
    public void setPreguntaPmarcarRespuestapeValoresRespuestas(String preguntaPmarcarRespuestapeValoresRespuestas) {
        this.preguntaPmarcarRespuestapeValoresRespuestas = preguntaPmarcarRespuestapeValoresRespuestas;
    }
}
