package com.keralty.aepersonas.viewmodel.persona.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.persistence.EstadoPersona;
import com.keralty.aepersonas.persistence.oid.EstadoPersonaOid;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.Persona;

public class InsEstadoPersonaRequest {

    @JsonProperty("p_thispersona_oid")
    private PersonaOid personaInsEstadoPersonapthisPersona;
    
    @JsonIgnore
    private Persona personaInsEstadoPersonapthisPersonaInstance;

    @JsonProperty("p_evcestadopersona_oid")
    private EstadoPersonaOid personaInsEstadoPersonapevcEstadoPersona;
    
    @JsonIgnore
    private EstadoPersona personaInsEstadoPersonapevcEstadoPersonaInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonaInsEstadoPersonapthisPersona();
        checkPersonaInsEstadoPersonapevcEstadoPersona();
    }

    @JsonIgnore
    public PersonaOid getPersonaInsEstadoPersonapthisPersona() {
        return this.personaInsEstadoPersonapthisPersona;
    }
    
    public void setPersonaInsEstadoPersonapthisPersona(PersonaOid personaInsEstadoPersonapthisPersona) {
        this.personaInsEstadoPersonapthisPersona = personaInsEstadoPersonapthisPersona;
    }

    @JsonIgnore
    public Persona getPersonaInsEstadoPersonapthisPersonaInstance() {
        return this.personaInsEstadoPersonapthisPersonaInstance;
    }
    
    public void setPersonaInsEstadoPersonapthisPersonaInstance(Persona personaInsEstadoPersonapthisPersona) {
        this.personaInsEstadoPersonapthisPersonaInstance = personaInsEstadoPersonapthisPersona;
        this.personaInsEstadoPersonapthisPersona = personaInsEstadoPersonapthisPersona != null ? personaInsEstadoPersonapthisPersona.getOid() : null;
    }

    private void checkPersonaInsEstadoPersonapthisPersona() throws NotNullArgumentException {
        if(this.getPersonaInsEstadoPersonapthisPersonaInstance() == null || this.getPersonaInsEstadoPersonapthisPersonaInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_INSESTADOPERSONA, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_INSESTADOPERSONA_PERSONAINSESTADOPERSONAPTHISPERSONA, PersonaConstants.SERV_ALIAS_INSESTADOPERSONA, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_INSESTADOPERSONA_PERSONAINSESTADOPERSONAPTHISPERSONA);
        }
    }

    @JsonIgnore
    public EstadoPersonaOid getPersonaInsEstadoPersonapevcEstadoPersona() {
        return this.personaInsEstadoPersonapevcEstadoPersona;
    }
    
    public void setPersonaInsEstadoPersonapevcEstadoPersona(EstadoPersonaOid personaInsEstadoPersonapevcEstadoPersona) {
        this.personaInsEstadoPersonapevcEstadoPersona = personaInsEstadoPersonapevcEstadoPersona;
    }

    @JsonIgnore
    public EstadoPersona getPersonaInsEstadoPersonapevcEstadoPersonaInstance() {
        return this.personaInsEstadoPersonapevcEstadoPersonaInstance;
    }
    
    public void setPersonaInsEstadoPersonapevcEstadoPersonaInstance(EstadoPersona personaInsEstadoPersonapevcEstadoPersona) {
        this.personaInsEstadoPersonapevcEstadoPersonaInstance = personaInsEstadoPersonapevcEstadoPersona;
        this.personaInsEstadoPersonapevcEstadoPersona = personaInsEstadoPersonapevcEstadoPersona != null ? personaInsEstadoPersonapevcEstadoPersona.getOid() : null;
    }

    private void checkPersonaInsEstadoPersonapevcEstadoPersona() throws NotNullArgumentException {
        if(this.getPersonaInsEstadoPersonapevcEstadoPersonaInstance() == null || this.getPersonaInsEstadoPersonapevcEstadoPersonaInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_INSESTADOPERSONA, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_INSESTADOPERSONA_PERSONAINSESTADOPERSONAPEVCESTADOPERSONA, PersonaConstants.SERV_ALIAS_INSESTADOPERSONA, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_INSESTADOPERSONA_PERSONAINSESTADOPERSONAPEVCESTADOPERSONA);
        }
    }
}
