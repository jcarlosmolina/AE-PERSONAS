package com.keralty.aepersonas.viewmodel.pregcuesmedc.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PregCuesMedCConstants;
import com.keralty.aepersonas.persistence.oid.PersonaCOid;
import com.keralty.aepersonas.persistence.oid.PregCuesMedCOid;
import com.keralty.aepersonas.persistence.PersonaC;
import com.keralty.aepersonas.persistence.PregCuesMedC;

public class TCREARFROMWSRequest {

    @JsonProperty("ppersonac_oid")
    private PersonaCOid pregCuesMedCTCREARFROMWSpPersonaC;
    
    @JsonIgnore
    private PersonaC pregCuesMedCTCREARFROMWSpPersonaCInstance;

    @JsonProperty("ppregcuesmedc_oid")
    private PregCuesMedCOid pregCuesMedCTCREARFROMWSpPregCuesMedC;
    
    @JsonIgnore
    private PregCuesMedC pregCuesMedCTCREARFROMWSpPregCuesMedCInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkPregCuesMedCTCREARFROMWSpPersonaC();
        checkPregCuesMedCTCREARFROMWSpPregCuesMedC();
    }

    @JsonIgnore
    public PersonaCOid getPregCuesMedCTCREARFROMWSpPersonaC() {
        return this.pregCuesMedCTCREARFROMWSpPersonaC;
    }
    
    public void setPregCuesMedCTCREARFROMWSpPersonaC(PersonaCOid pregCuesMedCTCREARFROMWSpPersonaC) {
        this.pregCuesMedCTCREARFROMWSpPersonaC = pregCuesMedCTCREARFROMWSpPersonaC;
    }

    @JsonIgnore
    public PersonaC getPregCuesMedCTCREARFROMWSpPersonaCInstance() {
        return this.pregCuesMedCTCREARFROMWSpPersonaCInstance;
    }
    
    public void setPregCuesMedCTCREARFROMWSpPersonaCInstance(PersonaC pregCuesMedCTCREARFROMWSpPersonaC) {
        this.pregCuesMedCTCREARFROMWSpPersonaCInstance = pregCuesMedCTCREARFROMWSpPersonaC;
        this.pregCuesMedCTCREARFROMWSpPersonaC = pregCuesMedCTCREARFROMWSpPersonaC != null ? pregCuesMedCTCREARFROMWSpPersonaC.getOid() : null;
    }

    private void checkPregCuesMedCTCREARFROMWSpPersonaC() throws NotNullArgumentException {
        if(this.getPregCuesMedCTCREARFROMWSpPersonaCInstance() == null || this.getPregCuesMedCTCREARFROMWSpPersonaCInstance().isNull()) {
            throw new NotNullArgumentException(PregCuesMedCConstants.SERV_ID_TCREARFROMWS, PregCuesMedCConstants.CLASS_ID, PregCuesMedCConstants.ARG_ID_TCREARFROMWS_PREGCUESMEDCTCREARFROMWSPPERSONAC, PregCuesMedCConstants.SERV_ALIAS_TCREARFROMWS, PregCuesMedCConstants.CLASS_ALIAS, PregCuesMedCConstants.ARG_ALIAS_TCREARFROMWS_PREGCUESMEDCTCREARFROMWSPPERSONAC);
        }
    }

    @JsonIgnore
    public PregCuesMedCOid getPregCuesMedCTCREARFROMWSpPregCuesMedC() {
        return this.pregCuesMedCTCREARFROMWSpPregCuesMedC;
    }
    
    public void setPregCuesMedCTCREARFROMWSpPregCuesMedC(PregCuesMedCOid pregCuesMedCTCREARFROMWSpPregCuesMedC) {
        this.pregCuesMedCTCREARFROMWSpPregCuesMedC = pregCuesMedCTCREARFROMWSpPregCuesMedC;
    }

    @JsonIgnore
    public PregCuesMedC getPregCuesMedCTCREARFROMWSpPregCuesMedCInstance() {
        return this.pregCuesMedCTCREARFROMWSpPregCuesMedCInstance;
    }
    
    public void setPregCuesMedCTCREARFROMWSpPregCuesMedCInstance(PregCuesMedC pregCuesMedCTCREARFROMWSpPregCuesMedC) {
        this.pregCuesMedCTCREARFROMWSpPregCuesMedCInstance = pregCuesMedCTCREARFROMWSpPregCuesMedC;
        this.pregCuesMedCTCREARFROMWSpPregCuesMedC = pregCuesMedCTCREARFROMWSpPregCuesMedC != null ? pregCuesMedCTCREARFROMWSpPregCuesMedC.getOid() : null;
    }

    private void checkPregCuesMedCTCREARFROMWSpPregCuesMedC() throws NotNullArgumentException {
        if(this.getPregCuesMedCTCREARFROMWSpPregCuesMedCInstance() == null || this.getPregCuesMedCTCREARFROMWSpPregCuesMedCInstance().isNull()) {
            throw new NotNullArgumentException(PregCuesMedCConstants.SERV_ID_TCREARFROMWS, PregCuesMedCConstants.CLASS_ID, PregCuesMedCConstants.ARG_ID_TCREARFROMWS_PREGCUESMEDCTCREARFROMWSPPREGCUESMEDC, PregCuesMedCConstants.SERV_ALIAS_TCREARFROMWS, PregCuesMedCConstants.CLASS_ALIAS, PregCuesMedCConstants.ARG_ALIAS_TCREARFROMWS_PREGCUESMEDCTCREARFROMWSPPREGCUESMEDC);
        }
    }
}
