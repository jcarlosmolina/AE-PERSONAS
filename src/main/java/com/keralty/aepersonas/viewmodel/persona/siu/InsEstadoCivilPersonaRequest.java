package com.keralty.aepersonas.viewmodel.persona.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.persistence.EstadoCivil;
import com.keralty.aepersonas.persistence.oid.EstadoCivilOid;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.Persona;

public class InsEstadoCivilPersonaRequest {

    @JsonProperty("p_thispersona_oid")
    private PersonaOid personaInsEstadoCivilPersonapthisPersona;
    
    @JsonIgnore
    private Persona personaInsEstadoCivilPersonapthisPersonaInstance;

    @JsonProperty("p_evcestadocivil_oid")
    private EstadoCivilOid personaInsEstadoCivilPersonapevcEstadoCivil;
    
    @JsonIgnore
    private EstadoCivil personaInsEstadoCivilPersonapevcEstadoCivilInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonaInsEstadoCivilPersonapthisPersona();
        checkPersonaInsEstadoCivilPersonapevcEstadoCivil();
    }

    @JsonIgnore
    public PersonaOid getPersonaInsEstadoCivilPersonapthisPersona() {
        return this.personaInsEstadoCivilPersonapthisPersona;
    }
    
    public void setPersonaInsEstadoCivilPersonapthisPersona(PersonaOid personaInsEstadoCivilPersonapthisPersona) {
        this.personaInsEstadoCivilPersonapthisPersona = personaInsEstadoCivilPersonapthisPersona;
    }

    @JsonIgnore
    public Persona getPersonaInsEstadoCivilPersonapthisPersonaInstance() {
        return this.personaInsEstadoCivilPersonapthisPersonaInstance;
    }
    
    public void setPersonaInsEstadoCivilPersonapthisPersonaInstance(Persona personaInsEstadoCivilPersonapthisPersona) {
        this.personaInsEstadoCivilPersonapthisPersonaInstance = personaInsEstadoCivilPersonapthisPersona;
        this.personaInsEstadoCivilPersonapthisPersona = personaInsEstadoCivilPersonapthisPersona != null ? personaInsEstadoCivilPersonapthisPersona.getOid() : null;
    }

    private void checkPersonaInsEstadoCivilPersonapthisPersona() throws NotNullArgumentException {
        if(this.getPersonaInsEstadoCivilPersonapthisPersonaInstance() == null || this.getPersonaInsEstadoCivilPersonapthisPersonaInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_INSESTADOCIVILPERSONA, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_INSESTADOCIVILPERSONA_PERSONAINSESTADOCIVILPERSONAPTHISPERSONA, PersonaConstants.SERV_ALIAS_INSESTADOCIVILPERSONA, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_INSESTADOCIVILPERSONA_PERSONAINSESTADOCIVILPERSONAPTHISPERSONA);
        }
    }

    @JsonIgnore
    public EstadoCivilOid getPersonaInsEstadoCivilPersonapevcEstadoCivil() {
        return this.personaInsEstadoCivilPersonapevcEstadoCivil;
    }
    
    public void setPersonaInsEstadoCivilPersonapevcEstadoCivil(EstadoCivilOid personaInsEstadoCivilPersonapevcEstadoCivil) {
        this.personaInsEstadoCivilPersonapevcEstadoCivil = personaInsEstadoCivilPersonapevcEstadoCivil;
    }

    @JsonIgnore
    public EstadoCivil getPersonaInsEstadoCivilPersonapevcEstadoCivilInstance() {
        return this.personaInsEstadoCivilPersonapevcEstadoCivilInstance;
    }
    
    public void setPersonaInsEstadoCivilPersonapevcEstadoCivilInstance(EstadoCivil personaInsEstadoCivilPersonapevcEstadoCivil) {
        this.personaInsEstadoCivilPersonapevcEstadoCivilInstance = personaInsEstadoCivilPersonapevcEstadoCivil;
        this.personaInsEstadoCivilPersonapevcEstadoCivil = personaInsEstadoCivilPersonapevcEstadoCivil != null ? personaInsEstadoCivilPersonapevcEstadoCivil.getOid() : null;
    }

    private void checkPersonaInsEstadoCivilPersonapevcEstadoCivil() throws NotNullArgumentException {
        if(this.getPersonaInsEstadoCivilPersonapevcEstadoCivilInstance() == null || this.getPersonaInsEstadoCivilPersonapevcEstadoCivilInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_INSESTADOCIVILPERSONA, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_INSESTADOCIVILPERSONA_PERSONAINSESTADOCIVILPERSONAPEVCESTADOCIVIL, PersonaConstants.SERV_ALIAS_INSESTADOCIVILPERSONA, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_INSESTADOCIVILPERSONA_PERSONAINSESTADOCIVILPERSONAPEVCESTADOCIVIL);
        }
    }
}
