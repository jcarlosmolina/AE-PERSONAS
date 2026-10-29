package com.keralty.aepersonas.viewmodel.persona.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.persistence.EstadoPersona;
import com.keralty.aepersonas.persistence.oid.EstadoPersonaOid;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.Persona;

public class DelEstadoPersonaRequest {

    @JsonProperty("p_thispersona_oid")
    private PersonaOid personaDelEstadoPersonapthisPersona;
    
    @JsonIgnore
    private Persona personaDelEstadoPersonapthisPersonaInstance;

    @JsonProperty("p_evcestadopersona_oid")
    private EstadoPersonaOid personaDelEstadoPersonapevcEstadoPersona;
    
    @JsonIgnore
    private EstadoPersona personaDelEstadoPersonapevcEstadoPersonaInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonaDelEstadoPersonapthisPersona();
        checkPersonaDelEstadoPersonapevcEstadoPersona();
    }

    @JsonIgnore
    public PersonaOid getPersonaDelEstadoPersonapthisPersona() {
        return this.personaDelEstadoPersonapthisPersona;
    }
    
    public void setPersonaDelEstadoPersonapthisPersona(PersonaOid personaDelEstadoPersonapthisPersona) {
        this.personaDelEstadoPersonapthisPersona = personaDelEstadoPersonapthisPersona;
    }

    @JsonIgnore
    public Persona getPersonaDelEstadoPersonapthisPersonaInstance() {
        return this.personaDelEstadoPersonapthisPersonaInstance;
    }
    
    public void setPersonaDelEstadoPersonapthisPersonaInstance(Persona personaDelEstadoPersonapthisPersona) {
        this.personaDelEstadoPersonapthisPersonaInstance = personaDelEstadoPersonapthisPersona;
        this.personaDelEstadoPersonapthisPersona = personaDelEstadoPersonapthisPersona != null ? personaDelEstadoPersonapthisPersona.getOid() : null;
    }

    private void checkPersonaDelEstadoPersonapthisPersona() throws NotNullArgumentException {
        if(this.getPersonaDelEstadoPersonapthisPersonaInstance() == null || this.getPersonaDelEstadoPersonapthisPersonaInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_DELESTADOPERSONA, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_DELESTADOPERSONA_PERSONADELESTADOPERSONAPTHISPERSONA, PersonaConstants.SERV_ALIAS_DELESTADOPERSONA, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_DELESTADOPERSONA_PERSONADELESTADOPERSONAPTHISPERSONA);
        }
    }

    @JsonIgnore
    public EstadoPersonaOid getPersonaDelEstadoPersonapevcEstadoPersona() {
        return this.personaDelEstadoPersonapevcEstadoPersona;
    }
    
    public void setPersonaDelEstadoPersonapevcEstadoPersona(EstadoPersonaOid personaDelEstadoPersonapevcEstadoPersona) {
        this.personaDelEstadoPersonapevcEstadoPersona = personaDelEstadoPersonapevcEstadoPersona;
    }

    @JsonIgnore
    public EstadoPersona getPersonaDelEstadoPersonapevcEstadoPersonaInstance() {
        return this.personaDelEstadoPersonapevcEstadoPersonaInstance;
    }
    
    public void setPersonaDelEstadoPersonapevcEstadoPersonaInstance(EstadoPersona personaDelEstadoPersonapevcEstadoPersona) {
        this.personaDelEstadoPersonapevcEstadoPersonaInstance = personaDelEstadoPersonapevcEstadoPersona;
        this.personaDelEstadoPersonapevcEstadoPersona = personaDelEstadoPersonapevcEstadoPersona != null ? personaDelEstadoPersonapevcEstadoPersona.getOid() : null;
    }

    private void checkPersonaDelEstadoPersonapevcEstadoPersona() throws NotNullArgumentException {
        if(this.getPersonaDelEstadoPersonapevcEstadoPersonaInstance() == null || this.getPersonaDelEstadoPersonapevcEstadoPersonaInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_DELESTADOPERSONA, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_DELESTADOPERSONA_PERSONADELESTADOPERSONAPEVCESTADOPERSONA, PersonaConstants.SERV_ALIAS_DELESTADOPERSONA, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_DELESTADOPERSONA_PERSONADELESTADOPERSONAPEVCESTADOPERSONA);
        }
    }
}
