package com.keralty.aepersonas.viewmodel.pregcuesmedc.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PregCuesMedCConstants;
import com.keralty.aepersonas.persistence.oid.PersonaCOid;
import com.keralty.aepersonas.persistence.PersonaC;

public class CrearRequest {

    @JsonProperty("p_agrpersonac_oid")
    private PersonaCOid pregCuesMedCcrearpagrPersonaC;
    
    @JsonIgnore
    private PersonaC pregCuesMedCcrearpagrPersonaCInstance;

    @JsonProperty("p_atrcodpregunta")
    private Long pregCuesMedCcrearpatrCodPregunta;

    @JsonProperty("p_atrrptapregunta")
    private Boolean pregCuesMedCcrearpatrRptaPregunta;

    @JsonProperty("p_atrobservacions")
    private String pregCuesMedCcrearpatrObservacions;

    public void checkArguments() throws NotNullArgumentException {
        checkPregCuesMedCcrearpagrPersonaC();
        checkPregCuesMedCcrearpatrCodPregunta();
        checkPregCuesMedCcrearpatrRptaPregunta();
    }

    @JsonIgnore
    public PersonaCOid getPregCuesMedCcrearpagrPersonaC() {
        return this.pregCuesMedCcrearpagrPersonaC;
    }
    
    public void setPregCuesMedCcrearpagrPersonaC(PersonaCOid pregCuesMedCcrearpagrPersonaC) {
        this.pregCuesMedCcrearpagrPersonaC = pregCuesMedCcrearpagrPersonaC;
    }

    @JsonIgnore
    public PersonaC getPregCuesMedCcrearpagrPersonaCInstance() {
        return this.pregCuesMedCcrearpagrPersonaCInstance;
    }
    
    public void setPregCuesMedCcrearpagrPersonaCInstance(PersonaC pregCuesMedCcrearpagrPersonaC) {
        this.pregCuesMedCcrearpagrPersonaCInstance = pregCuesMedCcrearpagrPersonaC;
        this.pregCuesMedCcrearpagrPersonaC = pregCuesMedCcrearpagrPersonaC != null ? pregCuesMedCcrearpagrPersonaC.getOid() : null;
    }

    private void checkPregCuesMedCcrearpagrPersonaC() throws NotNullArgumentException {
        if(this.getPregCuesMedCcrearpagrPersonaCInstance() == null || this.getPregCuesMedCcrearpagrPersonaCInstance().isNull()) {
            throw new NotNullArgumentException(PregCuesMedCConstants.SERV_ID_CREAR, PregCuesMedCConstants.CLASS_ID, PregCuesMedCConstants.ARG_ID_CREAR_PREGCUESMEDCCREARPAGRPERSONAC, PregCuesMedCConstants.SERV_ALIAS_CREAR, PregCuesMedCConstants.CLASS_ALIAS, PregCuesMedCConstants.ARG_ALIAS_CREAR_PREGCUESMEDCCREARPAGRPERSONAC);
        }
    }

    @JsonIgnore
    public Long getPregCuesMedCcrearpatrCodPregunta() {
        return this.pregCuesMedCcrearpatrCodPregunta;
    }
    
    public void setPregCuesMedCcrearpatrCodPregunta(Long pregCuesMedCcrearpatrCodPregunta) {
        this.pregCuesMedCcrearpatrCodPregunta = pregCuesMedCcrearpatrCodPregunta;
    }

    private void checkPregCuesMedCcrearpatrCodPregunta() throws NotNullArgumentException {
        if(this.getPregCuesMedCcrearpatrCodPregunta() == null) {
            throw new NotNullArgumentException(PregCuesMedCConstants.SERV_ID_CREAR, PregCuesMedCConstants.CLASS_ID, PregCuesMedCConstants.ARG_ID_CREAR_PREGCUESMEDCCREARPATRCODPREGUNTA, PregCuesMedCConstants.SERV_ALIAS_CREAR, PregCuesMedCConstants.CLASS_ALIAS, PregCuesMedCConstants.ARG_ALIAS_CREAR_PREGCUESMEDCCREARPATRCODPREGUNTA);
        }
    }

    @JsonIgnore
    public Boolean getPregCuesMedCcrearpatrRptaPregunta() {
        return this.pregCuesMedCcrearpatrRptaPregunta;
    }
    
    public void setPregCuesMedCcrearpatrRptaPregunta(Boolean pregCuesMedCcrearpatrRptaPregunta) {
        this.pregCuesMedCcrearpatrRptaPregunta = pregCuesMedCcrearpatrRptaPregunta;
    }

    private void checkPregCuesMedCcrearpatrRptaPregunta() throws NotNullArgumentException {
        if(this.getPregCuesMedCcrearpatrRptaPregunta() == null) {
            throw new NotNullArgumentException(PregCuesMedCConstants.SERV_ID_CREAR, PregCuesMedCConstants.CLASS_ID, PregCuesMedCConstants.ARG_ID_CREAR_PREGCUESMEDCCREARPATRRPTAPREGUNTA, PregCuesMedCConstants.SERV_ALIAS_CREAR, PregCuesMedCConstants.CLASS_ALIAS, PregCuesMedCConstants.ARG_ALIAS_CREAR_PREGCUESMEDCCREARPATRRPTAPREGUNTA);
        }
    }

    @JsonIgnore
    public String getPregCuesMedCcrearpatrObservacions() {
        return this.pregCuesMedCcrearpatrObservacions;
    }
    
    public void setPregCuesMedCcrearpatrObservacions(String pregCuesMedCcrearpatrObservacions) {
        this.pregCuesMedCcrearpatrObservacions = pregCuesMedCcrearpatrObservacions;
    }
}
