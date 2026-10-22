package com.keralty.aepersonas.viewmodel.preguntap.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PreguntaPConstants;
import com.keralty.aepersonas.persistence.oid.PreguntaOid;
import com.keralty.aepersonas.persistence.oid.SeccionPOid;
import com.keralty.aepersonas.persistence.Pregunta;
import com.keralty.aepersonas.persistence.SeccionP;

public class TCREAR2Request {

    @JsonProperty("pt_p_agrseccion_oid")
    private SeccionPOid preguntaPTCREAR2ptpagrSeccion;
    
    @JsonIgnore
    private SeccionP preguntaPTCREAR2ptpagrSeccionInstance;

    @JsonProperty("pt_p_agrpregunta_oid")
    private PreguntaOid preguntaPTCREAR2ptpagrPregunta;
    
    @JsonIgnore
    private Pregunta preguntaPTCREAR2ptpagrPreguntaInstance;

    @JsonProperty("pt_p_atrnumero")
    private Long preguntaPTCREAR2ptpatrNumero;

    @JsonProperty("pt_p_atrnumorden")
    private Long preguntaPTCREAR2ptpatrNumOrden;

    @JsonProperty("pt_p_atrdescripcion")
    private String preguntaPTCREAR2ptpatrDescripcion;

    @JsonProperty("pt_p_atrseenviaacore")
    private Boolean preguntaPTCREAR2ptpatrSeEnviaACORE;

    public void checkArguments() throws NotNullArgumentException {
        checkPreguntaPTCREAR2ptpagrSeccion();
        checkPreguntaPTCREAR2ptpatrNumero();
        checkPreguntaPTCREAR2ptpatrNumOrden();
        checkPreguntaPTCREAR2ptpatrDescripcion();
        checkPreguntaPTCREAR2ptpatrSeEnviaACORE();
    }

    @JsonIgnore
    public SeccionPOid getPreguntaPTCREAR2ptpagrSeccion() {
        return this.preguntaPTCREAR2ptpagrSeccion;
    }
    
    public void setPreguntaPTCREAR2ptpagrSeccion(SeccionPOid preguntaPTCREAR2ptpagrSeccion) {
        this.preguntaPTCREAR2ptpagrSeccion = preguntaPTCREAR2ptpagrSeccion;
    }

    @JsonIgnore
    public SeccionP getPreguntaPTCREAR2ptpagrSeccionInstance() {
        return this.preguntaPTCREAR2ptpagrSeccionInstance;
    }
    
    public void setPreguntaPTCREAR2ptpagrSeccionInstance(SeccionP preguntaPTCREAR2ptpagrSeccion) {
        this.preguntaPTCREAR2ptpagrSeccionInstance = preguntaPTCREAR2ptpagrSeccion;
        this.preguntaPTCREAR2ptpagrSeccion = preguntaPTCREAR2ptpagrSeccion != null ? preguntaPTCREAR2ptpagrSeccion.getOid() : null;
    }

    private void checkPreguntaPTCREAR2ptpagrSeccion() throws NotNullArgumentException {
        if(this.getPreguntaPTCREAR2ptpagrSeccionInstance() == null || this.getPreguntaPTCREAR2ptpagrSeccionInstance().isNull()) {
            throw new NotNullArgumentException(PreguntaPConstants.SERV_ID_TCREAR2, PreguntaPConstants.CLASS_ID, PreguntaPConstants.ARG_ID_TCREAR2_PREGUNTAPTCREAR2PTPAGRSECCION, PreguntaPConstants.SERV_ALIAS_TCREAR2, PreguntaPConstants.CLASS_ALIAS, PreguntaPConstants.ARG_ALIAS_TCREAR2_PREGUNTAPTCREAR2PTPAGRSECCION);
        }
    }

    @JsonIgnore
    public PreguntaOid getPreguntaPTCREAR2ptpagrPregunta() {
        return this.preguntaPTCREAR2ptpagrPregunta;
    }
    
    public void setPreguntaPTCREAR2ptpagrPregunta(PreguntaOid preguntaPTCREAR2ptpagrPregunta) {
        this.preguntaPTCREAR2ptpagrPregunta = preguntaPTCREAR2ptpagrPregunta;
    }

    @JsonIgnore
    public Pregunta getPreguntaPTCREAR2ptpagrPreguntaInstance() {
        return this.preguntaPTCREAR2ptpagrPreguntaInstance;
    }
    
    public void setPreguntaPTCREAR2ptpagrPreguntaInstance(Pregunta preguntaPTCREAR2ptpagrPregunta) {
        this.preguntaPTCREAR2ptpagrPreguntaInstance = preguntaPTCREAR2ptpagrPregunta;
        this.preguntaPTCREAR2ptpagrPregunta = preguntaPTCREAR2ptpagrPregunta != null ? preguntaPTCREAR2ptpagrPregunta.getOid() : null;
    }

    @JsonIgnore
    public Long getPreguntaPTCREAR2ptpatrNumero() {
        return this.preguntaPTCREAR2ptpatrNumero;
    }
    
    public void setPreguntaPTCREAR2ptpatrNumero(Long preguntaPTCREAR2ptpatrNumero) {
        this.preguntaPTCREAR2ptpatrNumero = preguntaPTCREAR2ptpatrNumero;
    }

    private void checkPreguntaPTCREAR2ptpatrNumero() throws NotNullArgumentException {
        if(this.getPreguntaPTCREAR2ptpatrNumero() == null) {
            throw new NotNullArgumentException(PreguntaPConstants.SERV_ID_TCREAR2, PreguntaPConstants.CLASS_ID, PreguntaPConstants.ARG_ID_TCREAR2_PREGUNTAPTCREAR2PTPATRNUMERO, PreguntaPConstants.SERV_ALIAS_TCREAR2, PreguntaPConstants.CLASS_ALIAS, PreguntaPConstants.ARG_ALIAS_TCREAR2_PREGUNTAPTCREAR2PTPATRNUMERO);
        }
    }

    @JsonIgnore
    public Long getPreguntaPTCREAR2ptpatrNumOrden() {
        return this.preguntaPTCREAR2ptpatrNumOrden;
    }
    
    public void setPreguntaPTCREAR2ptpatrNumOrden(Long preguntaPTCREAR2ptpatrNumOrden) {
        this.preguntaPTCREAR2ptpatrNumOrden = preguntaPTCREAR2ptpatrNumOrden;
    }

    private void checkPreguntaPTCREAR2ptpatrNumOrden() throws NotNullArgumentException {
        if(this.getPreguntaPTCREAR2ptpatrNumOrden() == null) {
            throw new NotNullArgumentException(PreguntaPConstants.SERV_ID_TCREAR2, PreguntaPConstants.CLASS_ID, PreguntaPConstants.ARG_ID_TCREAR2_PREGUNTAPTCREAR2PTPATRNUMORDEN, PreguntaPConstants.SERV_ALIAS_TCREAR2, PreguntaPConstants.CLASS_ALIAS, PreguntaPConstants.ARG_ALIAS_TCREAR2_PREGUNTAPTCREAR2PTPATRNUMORDEN);
        }
    }

    @JsonIgnore
    public String getPreguntaPTCREAR2ptpatrDescripcion() {
        return this.preguntaPTCREAR2ptpatrDescripcion;
    }
    
    public void setPreguntaPTCREAR2ptpatrDescripcion(String preguntaPTCREAR2ptpatrDescripcion) {
        this.preguntaPTCREAR2ptpatrDescripcion = preguntaPTCREAR2ptpatrDescripcion;
    }

    private void checkPreguntaPTCREAR2ptpatrDescripcion() throws NotNullArgumentException {
        if(this.getPreguntaPTCREAR2ptpatrDescripcion() == null) {
            throw new NotNullArgumentException(PreguntaPConstants.SERV_ID_TCREAR2, PreguntaPConstants.CLASS_ID, PreguntaPConstants.ARG_ID_TCREAR2_PREGUNTAPTCREAR2PTPATRDESCRIPCION, PreguntaPConstants.SERV_ALIAS_TCREAR2, PreguntaPConstants.CLASS_ALIAS, PreguntaPConstants.ARG_ALIAS_TCREAR2_PREGUNTAPTCREAR2PTPATRDESCRIPCION);
        }
    }

    @JsonIgnore
    public Boolean getPreguntaPTCREAR2ptpatrSeEnviaACORE() {
        return this.preguntaPTCREAR2ptpatrSeEnviaACORE;
    }
    
    public void setPreguntaPTCREAR2ptpatrSeEnviaACORE(Boolean preguntaPTCREAR2ptpatrSeEnviaACORE) {
        this.preguntaPTCREAR2ptpatrSeEnviaACORE = preguntaPTCREAR2ptpatrSeEnviaACORE;
    }

    private void checkPreguntaPTCREAR2ptpatrSeEnviaACORE() throws NotNullArgumentException {
        if(this.getPreguntaPTCREAR2ptpatrSeEnviaACORE() == null) {
            throw new NotNullArgumentException(PreguntaPConstants.SERV_ID_TCREAR2, PreguntaPConstants.CLASS_ID, PreguntaPConstants.ARG_ID_TCREAR2_PREGUNTAPTCREAR2PTPATRSEENVIAACORE, PreguntaPConstants.SERV_ALIAS_TCREAR2, PreguntaPConstants.CLASS_ALIAS, PreguntaPConstants.ARG_ALIAS_TCREAR2_PREGUNTAPTCREAR2PTPATRSEENVIAACORE);
        }
    }
}
