package com.keralty.aepersonas.viewmodel.preguntap.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PreguntaPConstants;
import com.keralty.aepersonas.persistence.oid.PersonaCOid;
import com.keralty.aepersonas.persistence.oid.PreguntaOid;
import com.keralty.aepersonas.persistence.oid.SeccionPOid;
import com.keralty.aepersonas.persistence.PersonaC;
import com.keralty.aepersonas.persistence.Pregunta;
import com.keralty.aepersonas.persistence.SeccionP;

public class TCREARRequest {

    @JsonProperty("pt_p_agrseccion_oid")
    private SeccionPOid preguntaPTCREARptpagrSeccion;
    
    @JsonIgnore
    private SeccionP preguntaPTCREARptpagrSeccionInstance;

    @JsonProperty("pt_p_agrpregunta_oid")
    private PreguntaOid preguntaPTCREARptpagrPregunta;
    
    @JsonIgnore
    private Pregunta preguntaPTCREARptpagrPreguntaInstance;

    @JsonProperty("pt_p_atrnumero")
    private Long preguntaPTCREARptpatrNumero;

    @JsonProperty("pt_p_atrnumorden")
    private Long preguntaPTCREARptpatrNumOrden;

    @JsonProperty("pt_p_atrdescripcion")
    private String preguntaPTCREARptpatrDescripcion;

    @JsonProperty("pt_p_atrseenviaacore")
    private Boolean preguntaPTCREARptpatrSeEnviaACORE;

    @JsonProperty("p_personac_oid")
    private PersonaCOid preguntaPTCREARpPersonaC;
    
    @JsonIgnore
    private PersonaC preguntaPTCREARpPersonaCInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkPreguntaPTCREARptpagrSeccion();
        checkPreguntaPTCREARptpatrNumero();
        checkPreguntaPTCREARptpatrNumOrden();
        checkPreguntaPTCREARptpatrDescripcion();
        checkPreguntaPTCREARptpatrSeEnviaACORE();
    }

    @JsonIgnore
    public SeccionPOid getPreguntaPTCREARptpagrSeccion() {
        return this.preguntaPTCREARptpagrSeccion;
    }
    
    public void setPreguntaPTCREARptpagrSeccion(SeccionPOid preguntaPTCREARptpagrSeccion) {
        this.preguntaPTCREARptpagrSeccion = preguntaPTCREARptpagrSeccion;
    }

    @JsonIgnore
    public SeccionP getPreguntaPTCREARptpagrSeccionInstance() {
        return this.preguntaPTCREARptpagrSeccionInstance;
    }
    
    public void setPreguntaPTCREARptpagrSeccionInstance(SeccionP preguntaPTCREARptpagrSeccion) {
        this.preguntaPTCREARptpagrSeccionInstance = preguntaPTCREARptpagrSeccion;
        this.preguntaPTCREARptpagrSeccion = preguntaPTCREARptpagrSeccion != null ? preguntaPTCREARptpagrSeccion.getOid() : null;
    }

    private void checkPreguntaPTCREARptpagrSeccion() throws NotNullArgumentException {
        if(this.getPreguntaPTCREARptpagrSeccionInstance() == null || this.getPreguntaPTCREARptpagrSeccionInstance().isNull()) {
            throw new NotNullArgumentException(PreguntaPConstants.SERV_ID_TCREAR, PreguntaPConstants.CLASS_ID, PreguntaPConstants.ARG_ID_TCREAR_PREGUNTAPTCREARPTPAGRSECCION, PreguntaPConstants.SERV_ALIAS_TCREAR, PreguntaPConstants.CLASS_ALIAS, PreguntaPConstants.ARG_ALIAS_TCREAR_PREGUNTAPTCREARPTPAGRSECCION);
        }
    }

    @JsonIgnore
    public PreguntaOid getPreguntaPTCREARptpagrPregunta() {
        return this.preguntaPTCREARptpagrPregunta;
    }
    
    public void setPreguntaPTCREARptpagrPregunta(PreguntaOid preguntaPTCREARptpagrPregunta) {
        this.preguntaPTCREARptpagrPregunta = preguntaPTCREARptpagrPregunta;
    }

    @JsonIgnore
    public Pregunta getPreguntaPTCREARptpagrPreguntaInstance() {
        return this.preguntaPTCREARptpagrPreguntaInstance;
    }
    
    public void setPreguntaPTCREARptpagrPreguntaInstance(Pregunta preguntaPTCREARptpagrPregunta) {
        this.preguntaPTCREARptpagrPreguntaInstance = preguntaPTCREARptpagrPregunta;
        this.preguntaPTCREARptpagrPregunta = preguntaPTCREARptpagrPregunta != null ? preguntaPTCREARptpagrPregunta.getOid() : null;
    }

    @JsonIgnore
    public Long getPreguntaPTCREARptpatrNumero() {
        return this.preguntaPTCREARptpatrNumero;
    }
    
    public void setPreguntaPTCREARptpatrNumero(Long preguntaPTCREARptpatrNumero) {
        this.preguntaPTCREARptpatrNumero = preguntaPTCREARptpatrNumero;
    }

    private void checkPreguntaPTCREARptpatrNumero() throws NotNullArgumentException {
        if(this.getPreguntaPTCREARptpatrNumero() == null) {
            throw new NotNullArgumentException(PreguntaPConstants.SERV_ID_TCREAR, PreguntaPConstants.CLASS_ID, PreguntaPConstants.ARG_ID_TCREAR_PREGUNTAPTCREARPTPATRNUMERO, PreguntaPConstants.SERV_ALIAS_TCREAR, PreguntaPConstants.CLASS_ALIAS, PreguntaPConstants.ARG_ALIAS_TCREAR_PREGUNTAPTCREARPTPATRNUMERO);
        }
    }

    @JsonIgnore
    public Long getPreguntaPTCREARptpatrNumOrden() {
        return this.preguntaPTCREARptpatrNumOrden;
    }
    
    public void setPreguntaPTCREARptpatrNumOrden(Long preguntaPTCREARptpatrNumOrden) {
        this.preguntaPTCREARptpatrNumOrden = preguntaPTCREARptpatrNumOrden;
    }

    private void checkPreguntaPTCREARptpatrNumOrden() throws NotNullArgumentException {
        if(this.getPreguntaPTCREARptpatrNumOrden() == null) {
            throw new NotNullArgumentException(PreguntaPConstants.SERV_ID_TCREAR, PreguntaPConstants.CLASS_ID, PreguntaPConstants.ARG_ID_TCREAR_PREGUNTAPTCREARPTPATRNUMORDEN, PreguntaPConstants.SERV_ALIAS_TCREAR, PreguntaPConstants.CLASS_ALIAS, PreguntaPConstants.ARG_ALIAS_TCREAR_PREGUNTAPTCREARPTPATRNUMORDEN);
        }
    }

    @JsonIgnore
    public String getPreguntaPTCREARptpatrDescripcion() {
        return this.preguntaPTCREARptpatrDescripcion;
    }
    
    public void setPreguntaPTCREARptpatrDescripcion(String preguntaPTCREARptpatrDescripcion) {
        this.preguntaPTCREARptpatrDescripcion = preguntaPTCREARptpatrDescripcion;
    }

    private void checkPreguntaPTCREARptpatrDescripcion() throws NotNullArgumentException {
        if(this.getPreguntaPTCREARptpatrDescripcion() == null) {
            throw new NotNullArgumentException(PreguntaPConstants.SERV_ID_TCREAR, PreguntaPConstants.CLASS_ID, PreguntaPConstants.ARG_ID_TCREAR_PREGUNTAPTCREARPTPATRDESCRIPCION, PreguntaPConstants.SERV_ALIAS_TCREAR, PreguntaPConstants.CLASS_ALIAS, PreguntaPConstants.ARG_ALIAS_TCREAR_PREGUNTAPTCREARPTPATRDESCRIPCION);
        }
    }

    @JsonIgnore
    public Boolean getPreguntaPTCREARptpatrSeEnviaACORE() {
        return this.preguntaPTCREARptpatrSeEnviaACORE;
    }
    
    public void setPreguntaPTCREARptpatrSeEnviaACORE(Boolean preguntaPTCREARptpatrSeEnviaACORE) {
        this.preguntaPTCREARptpatrSeEnviaACORE = preguntaPTCREARptpatrSeEnviaACORE;
    }

    private void checkPreguntaPTCREARptpatrSeEnviaACORE() throws NotNullArgumentException {
        if(this.getPreguntaPTCREARptpatrSeEnviaACORE() == null) {
            throw new NotNullArgumentException(PreguntaPConstants.SERV_ID_TCREAR, PreguntaPConstants.CLASS_ID, PreguntaPConstants.ARG_ID_TCREAR_PREGUNTAPTCREARPTPATRSEENVIAACORE, PreguntaPConstants.SERV_ALIAS_TCREAR, PreguntaPConstants.CLASS_ALIAS, PreguntaPConstants.ARG_ALIAS_TCREAR_PREGUNTAPTCREARPTPATRSEENVIAACORE);
        }
    }

    @JsonIgnore
    public PersonaCOid getPreguntaPTCREARpPersonaC() {
        return this.preguntaPTCREARpPersonaC;
    }
    
    public void setPreguntaPTCREARpPersonaC(PersonaCOid preguntaPTCREARpPersonaC) {
        this.preguntaPTCREARpPersonaC = preguntaPTCREARpPersonaC;
    }

    @JsonIgnore
    public PersonaC getPreguntaPTCREARpPersonaCInstance() {
        return this.preguntaPTCREARpPersonaCInstance;
    }
    
    public void setPreguntaPTCREARpPersonaCInstance(PersonaC preguntaPTCREARpPersonaC) {
        this.preguntaPTCREARpPersonaCInstance = preguntaPTCREARpPersonaC;
        this.preguntaPTCREARpPersonaC = preguntaPTCREARpPersonaC != null ? preguntaPTCREARpPersonaC.getOid() : null;
    }
}
