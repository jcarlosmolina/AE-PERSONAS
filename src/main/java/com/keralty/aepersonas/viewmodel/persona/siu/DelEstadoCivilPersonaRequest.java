package com.keralty.aepersonas.viewmodel.persona.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.persistence.EstadoCivil;
import com.keralty.aepersonas.persistence.oid.EstadoCivilOid;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.Persona;

public class DelEstadoCivilPersonaRequest {

    @JsonProperty("p_thispersona_oid")
    private PersonaOid personaDelEstadoCivilPersonapthisPersona;
    
    @JsonIgnore
    private Persona personaDelEstadoCivilPersonapthisPersonaInstance;

    @JsonProperty("p_evcestadocivil_oid")
    private EstadoCivilOid personaDelEstadoCivilPersonapevcEstadoCivil;
    
    @JsonIgnore
    private EstadoCivil personaDelEstadoCivilPersonapevcEstadoCivilInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonaDelEstadoCivilPersonapthisPersona();
        checkPersonaDelEstadoCivilPersonapevcEstadoCivil();
    }

    @JsonIgnore
    public PersonaOid getPersonaDelEstadoCivilPersonapthisPersona() {
        return this.personaDelEstadoCivilPersonapthisPersona;
    }
    
    public void setPersonaDelEstadoCivilPersonapthisPersona(PersonaOid personaDelEstadoCivilPersonapthisPersona) {
        this.personaDelEstadoCivilPersonapthisPersona = personaDelEstadoCivilPersonapthisPersona;
    }

    @JsonIgnore
    public Persona getPersonaDelEstadoCivilPersonapthisPersonaInstance() {
        return this.personaDelEstadoCivilPersonapthisPersonaInstance;
    }
    
    public void setPersonaDelEstadoCivilPersonapthisPersonaInstance(Persona personaDelEstadoCivilPersonapthisPersona) {
        this.personaDelEstadoCivilPersonapthisPersonaInstance = personaDelEstadoCivilPersonapthisPersona;
        this.personaDelEstadoCivilPersonapthisPersona = personaDelEstadoCivilPersonapthisPersona != null ? personaDelEstadoCivilPersonapthisPersona.getOid() : null;
    }

    private void checkPersonaDelEstadoCivilPersonapthisPersona() throws NotNullArgumentException {
        if(this.getPersonaDelEstadoCivilPersonapthisPersonaInstance() == null || this.getPersonaDelEstadoCivilPersonapthisPersonaInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_DELESTADOCIVILPERSONA, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_DELESTADOCIVILPERSONA_PERSONADELESTADOCIVILPERSONAPTHISPERSONA, PersonaConstants.SERV_ALIAS_DELESTADOCIVILPERSONA, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_DELESTADOCIVILPERSONA_PERSONADELESTADOCIVILPERSONAPTHISPERSONA);
        }
    }

    @JsonIgnore
    public EstadoCivilOid getPersonaDelEstadoCivilPersonapevcEstadoCivil() {
        return this.personaDelEstadoCivilPersonapevcEstadoCivil;
    }
    
    public void setPersonaDelEstadoCivilPersonapevcEstadoCivil(EstadoCivilOid personaDelEstadoCivilPersonapevcEstadoCivil) {
        this.personaDelEstadoCivilPersonapevcEstadoCivil = personaDelEstadoCivilPersonapevcEstadoCivil;
    }

    @JsonIgnore
    public EstadoCivil getPersonaDelEstadoCivilPersonapevcEstadoCivilInstance() {
        return this.personaDelEstadoCivilPersonapevcEstadoCivilInstance;
    }
    
    public void setPersonaDelEstadoCivilPersonapevcEstadoCivilInstance(EstadoCivil personaDelEstadoCivilPersonapevcEstadoCivil) {
        this.personaDelEstadoCivilPersonapevcEstadoCivilInstance = personaDelEstadoCivilPersonapevcEstadoCivil;
        this.personaDelEstadoCivilPersonapevcEstadoCivil = personaDelEstadoCivilPersonapevcEstadoCivil != null ? personaDelEstadoCivilPersonapevcEstadoCivil.getOid() : null;
    }

    private void checkPersonaDelEstadoCivilPersonapevcEstadoCivil() throws NotNullArgumentException {
        if(this.getPersonaDelEstadoCivilPersonapevcEstadoCivilInstance() == null || this.getPersonaDelEstadoCivilPersonapevcEstadoCivilInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_DELESTADOCIVILPERSONA, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_DELESTADOCIVILPERSONA_PERSONADELESTADOCIVILPERSONAPEVCESTADOCIVIL, PersonaConstants.SERV_ALIAS_DELESTADOCIVILPERSONA, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_DELESTADOCIVILPERSONA_PERSONADELESTADOCIVILPERSONAPEVCESTADOCIVIL);
        }
    }
}
