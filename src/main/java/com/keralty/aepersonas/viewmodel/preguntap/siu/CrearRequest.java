package com.keralty.aepersonas.viewmodel.preguntap.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PreguntaPConstants;
import com.keralty.aepersonas.persistence.oid.PreguntaOid;
import com.keralty.aepersonas.persistence.oid.SeccionPOid;
import com.keralty.aepersonas.persistence.Pregunta;
import com.keralty.aepersonas.persistence.SeccionP;

public class CrearRequest {

    @JsonProperty("p_agrseccion_oid")
    private SeccionPOid preguntaPcrearpagrSeccion;
    
    @JsonIgnore
    private SeccionP preguntaPcrearpagrSeccionInstance;

    @JsonProperty("p_agrpregunta_oid")
    private PreguntaOid preguntaPcrearpagrPregunta;
    
    @JsonIgnore
    private Pregunta preguntaPcrearpagrPreguntaInstance;

    @JsonProperty("p_atrnumero")
    private Long preguntaPcrearpatrNumero;

    @JsonProperty("p_atrnumorden")
    private Long preguntaPcrearpatrNumOrden;

    @JsonProperty("p_atrdescripcion")
    private String preguntaPcrearpatrDescripcion;

    @JsonProperty("p_atrseenviaacore")
    private Boolean preguntaPcrearpatrSeEnviaACORE;

    public void checkArguments() throws NotNullArgumentException {
        checkPreguntaPcrearpagrSeccion();
        checkPreguntaPcrearpatrNumero();
        checkPreguntaPcrearpatrNumOrden();
        checkPreguntaPcrearpatrDescripcion();
        checkPreguntaPcrearpatrSeEnviaACORE();
    }

    @JsonIgnore
    public SeccionPOid getPreguntaPcrearpagrSeccion() {
        return this.preguntaPcrearpagrSeccion;
    }
    
    public void setPreguntaPcrearpagrSeccion(SeccionPOid preguntaPcrearpagrSeccion) {
        this.preguntaPcrearpagrSeccion = preguntaPcrearpagrSeccion;
    }

    @JsonIgnore
    public SeccionP getPreguntaPcrearpagrSeccionInstance() {
        return this.preguntaPcrearpagrSeccionInstance;
    }
    
    public void setPreguntaPcrearpagrSeccionInstance(SeccionP preguntaPcrearpagrSeccion) {
        this.preguntaPcrearpagrSeccionInstance = preguntaPcrearpagrSeccion;
        this.preguntaPcrearpagrSeccion = preguntaPcrearpagrSeccion != null ? preguntaPcrearpagrSeccion.getOid() : null;
    }

    private void checkPreguntaPcrearpagrSeccion() throws NotNullArgumentException {
        if(this.getPreguntaPcrearpagrSeccionInstance() == null || this.getPreguntaPcrearpagrSeccionInstance().isNull()) {
            throw new NotNullArgumentException(PreguntaPConstants.SERV_ID_CREAR, PreguntaPConstants.CLASS_ID, PreguntaPConstants.ARG_ID_CREAR_PREGUNTAPCREARPAGRSECCION, PreguntaPConstants.SERV_ALIAS_CREAR, PreguntaPConstants.CLASS_ALIAS, PreguntaPConstants.ARG_ALIAS_CREAR_PREGUNTAPCREARPAGRSECCION);
        }
    }

    @JsonIgnore
    public PreguntaOid getPreguntaPcrearpagrPregunta() {
        return this.preguntaPcrearpagrPregunta;
    }
    
    public void setPreguntaPcrearpagrPregunta(PreguntaOid preguntaPcrearpagrPregunta) {
        this.preguntaPcrearpagrPregunta = preguntaPcrearpagrPregunta;
    }

    @JsonIgnore
    public Pregunta getPreguntaPcrearpagrPreguntaInstance() {
        return this.preguntaPcrearpagrPreguntaInstance;
    }
    
    public void setPreguntaPcrearpagrPreguntaInstance(Pregunta preguntaPcrearpagrPregunta) {
        this.preguntaPcrearpagrPreguntaInstance = preguntaPcrearpagrPregunta;
        this.preguntaPcrearpagrPregunta = preguntaPcrearpagrPregunta != null ? preguntaPcrearpagrPregunta.getOid() : null;
    }

    @JsonIgnore
    public Long getPreguntaPcrearpatrNumero() {
        return this.preguntaPcrearpatrNumero;
    }
    
    public void setPreguntaPcrearpatrNumero(Long preguntaPcrearpatrNumero) {
        this.preguntaPcrearpatrNumero = preguntaPcrearpatrNumero;
    }

    private void checkPreguntaPcrearpatrNumero() throws NotNullArgumentException {
        if(this.getPreguntaPcrearpatrNumero() == null) {
            throw new NotNullArgumentException(PreguntaPConstants.SERV_ID_CREAR, PreguntaPConstants.CLASS_ID, PreguntaPConstants.ARG_ID_CREAR_PREGUNTAPCREARPATRNUMERO, PreguntaPConstants.SERV_ALIAS_CREAR, PreguntaPConstants.CLASS_ALIAS, PreguntaPConstants.ARG_ALIAS_CREAR_PREGUNTAPCREARPATRNUMERO);
        }
    }

    @JsonIgnore
    public Long getPreguntaPcrearpatrNumOrden() {
        return this.preguntaPcrearpatrNumOrden;
    }
    
    public void setPreguntaPcrearpatrNumOrden(Long preguntaPcrearpatrNumOrden) {
        this.preguntaPcrearpatrNumOrden = preguntaPcrearpatrNumOrden;
    }

    private void checkPreguntaPcrearpatrNumOrden() throws NotNullArgumentException {
        if(this.getPreguntaPcrearpatrNumOrden() == null) {
            throw new NotNullArgumentException(PreguntaPConstants.SERV_ID_CREAR, PreguntaPConstants.CLASS_ID, PreguntaPConstants.ARG_ID_CREAR_PREGUNTAPCREARPATRNUMORDEN, PreguntaPConstants.SERV_ALIAS_CREAR, PreguntaPConstants.CLASS_ALIAS, PreguntaPConstants.ARG_ALIAS_CREAR_PREGUNTAPCREARPATRNUMORDEN);
        }
    }

    @JsonIgnore
    public String getPreguntaPcrearpatrDescripcion() {
        return this.preguntaPcrearpatrDescripcion;
    }
    
    public void setPreguntaPcrearpatrDescripcion(String preguntaPcrearpatrDescripcion) {
        this.preguntaPcrearpatrDescripcion = preguntaPcrearpatrDescripcion;
    }

    private void checkPreguntaPcrearpatrDescripcion() throws NotNullArgumentException {
        if(this.getPreguntaPcrearpatrDescripcion() == null) {
            throw new NotNullArgumentException(PreguntaPConstants.SERV_ID_CREAR, PreguntaPConstants.CLASS_ID, PreguntaPConstants.ARG_ID_CREAR_PREGUNTAPCREARPATRDESCRIPCION, PreguntaPConstants.SERV_ALIAS_CREAR, PreguntaPConstants.CLASS_ALIAS, PreguntaPConstants.ARG_ALIAS_CREAR_PREGUNTAPCREARPATRDESCRIPCION);
        }
    }

    @JsonIgnore
    public Boolean getPreguntaPcrearpatrSeEnviaACORE() {
        return this.preguntaPcrearpatrSeEnviaACORE;
    }
    
    public void setPreguntaPcrearpatrSeEnviaACORE(Boolean preguntaPcrearpatrSeEnviaACORE) {
        this.preguntaPcrearpatrSeEnviaACORE = preguntaPcrearpatrSeEnviaACORE;
    }

    private void checkPreguntaPcrearpatrSeEnviaACORE() throws NotNullArgumentException {
        if(this.getPreguntaPcrearpatrSeEnviaACORE() == null) {
            throw new NotNullArgumentException(PreguntaPConstants.SERV_ID_CREAR, PreguntaPConstants.CLASS_ID, PreguntaPConstants.ARG_ID_CREAR_PREGUNTAPCREARPATRSEENVIAACORE, PreguntaPConstants.SERV_ALIAS_CREAR, PreguntaPConstants.CLASS_ALIAS, PreguntaPConstants.ARG_ALIAS_CREAR_PREGUNTAPCREARPATRSEENVIAACORE);
        }
    }
}
