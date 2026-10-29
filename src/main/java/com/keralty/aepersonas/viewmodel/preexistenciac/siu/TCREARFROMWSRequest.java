package com.keralty.aepersonas.viewmodel.preexistenciac.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PreexistenciaCConstants;
import com.keralty.aepersonas.persistence.oid.PersonaCOid;
import com.keralty.aepersonas.persistence.oid.PreexistenciaCOid;
import com.keralty.aepersonas.persistence.PersonaC;
import com.keralty.aepersonas.persistence.PreexistenciaC;

public class TCREARFROMWSRequest {

    @JsonProperty("ppersonac_oid")
    private PersonaCOid preexistenciaCTCREARFROMWSpPersonaC;
    
    @JsonIgnore
    private PersonaC preexistenciaCTCREARFROMWSpPersonaCInstance;

    @JsonProperty("ppreexistenciac_oid")
    private PreexistenciaCOid preexistenciaCTCREARFROMWSpPreexistenciaC;
    
    @JsonIgnore
    private PreexistenciaC preexistenciaCTCREARFROMWSpPreexistenciaCInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkPreexistenciaCTCREARFROMWSpPersonaC();
        checkPreexistenciaCTCREARFROMWSpPreexistenciaC();
    }

    @JsonIgnore
    public PersonaCOid getPreexistenciaCTCREARFROMWSpPersonaC() {
        return this.preexistenciaCTCREARFROMWSpPersonaC;
    }
    
    public void setPreexistenciaCTCREARFROMWSpPersonaC(PersonaCOid preexistenciaCTCREARFROMWSpPersonaC) {
        this.preexistenciaCTCREARFROMWSpPersonaC = preexistenciaCTCREARFROMWSpPersonaC;
    }

    @JsonIgnore
    public PersonaC getPreexistenciaCTCREARFROMWSpPersonaCInstance() {
        return this.preexistenciaCTCREARFROMWSpPersonaCInstance;
    }
    
    public void setPreexistenciaCTCREARFROMWSpPersonaCInstance(PersonaC preexistenciaCTCREARFROMWSpPersonaC) {
        this.preexistenciaCTCREARFROMWSpPersonaCInstance = preexistenciaCTCREARFROMWSpPersonaC;
        this.preexistenciaCTCREARFROMWSpPersonaC = preexistenciaCTCREARFROMWSpPersonaC != null ? preexistenciaCTCREARFROMWSpPersonaC.getOid() : null;
    }

    private void checkPreexistenciaCTCREARFROMWSpPersonaC() throws NotNullArgumentException {
        if(this.getPreexistenciaCTCREARFROMWSpPersonaCInstance() == null || this.getPreexistenciaCTCREARFROMWSpPersonaCInstance().isNull()) {
            throw new NotNullArgumentException(PreexistenciaCConstants.SERV_ID_TCREARFROMWS, PreexistenciaCConstants.CLASS_ID, PreexistenciaCConstants.ARG_ID_TCREARFROMWS_PREEXISTENCIACTCREARFROMWSPPERSONAC, PreexistenciaCConstants.SERV_ALIAS_TCREARFROMWS, PreexistenciaCConstants.CLASS_ALIAS, PreexistenciaCConstants.ARG_ALIAS_TCREARFROMWS_PREEXISTENCIACTCREARFROMWSPPERSONAC);
        }
    }

    @JsonIgnore
    public PreexistenciaCOid getPreexistenciaCTCREARFROMWSpPreexistenciaC() {
        return this.preexistenciaCTCREARFROMWSpPreexistenciaC;
    }
    
    public void setPreexistenciaCTCREARFROMWSpPreexistenciaC(PreexistenciaCOid preexistenciaCTCREARFROMWSpPreexistenciaC) {
        this.preexistenciaCTCREARFROMWSpPreexistenciaC = preexistenciaCTCREARFROMWSpPreexistenciaC;
    }

    @JsonIgnore
    public PreexistenciaC getPreexistenciaCTCREARFROMWSpPreexistenciaCInstance() {
        return this.preexistenciaCTCREARFROMWSpPreexistenciaCInstance;
    }
    
    public void setPreexistenciaCTCREARFROMWSpPreexistenciaCInstance(PreexistenciaC preexistenciaCTCREARFROMWSpPreexistenciaC) {
        this.preexistenciaCTCREARFROMWSpPreexistenciaCInstance = preexistenciaCTCREARFROMWSpPreexistenciaC;
        this.preexistenciaCTCREARFROMWSpPreexistenciaC = preexistenciaCTCREARFROMWSpPreexistenciaC != null ? preexistenciaCTCREARFROMWSpPreexistenciaC.getOid() : null;
    }

    private void checkPreexistenciaCTCREARFROMWSpPreexistenciaC() throws NotNullArgumentException {
        if(this.getPreexistenciaCTCREARFROMWSpPreexistenciaCInstance() == null || this.getPreexistenciaCTCREARFROMWSpPreexistenciaCInstance().isNull()) {
            throw new NotNullArgumentException(PreexistenciaCConstants.SERV_ID_TCREARFROMWS, PreexistenciaCConstants.CLASS_ID, PreexistenciaCConstants.ARG_ID_TCREARFROMWS_PREEXISTENCIACTCREARFROMWSPPREEXISTENCIAC, PreexistenciaCConstants.SERV_ALIAS_TCREARFROMWS, PreexistenciaCConstants.CLASS_ALIAS, PreexistenciaCConstants.ARG_ALIAS_TCREARFROMWS_PREEXISTENCIACTCREARFROMWSPPREEXISTENCIAC);
        }
    }
}
