package com.keralty.aepersonas.viewmodel.persona.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.Persona;

public class EliminarRequest {

    @JsonProperty("p_thispersona_oid")
    private PersonaOid personaeliminarpthisPersona;
    
    @JsonIgnore
    private Persona personaeliminarpthisPersonaInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonaeliminarpthisPersona();
    }

    @JsonIgnore
    public PersonaOid getPersonaeliminarpthisPersona() {
        return this.personaeliminarpthisPersona;
    }
    
    public void setPersonaeliminarpthisPersona(PersonaOid personaeliminarpthisPersona) {
        this.personaeliminarpthisPersona = personaeliminarpthisPersona;
    }

    @JsonIgnore
    public Persona getPersonaeliminarpthisPersonaInstance() {
        return this.personaeliminarpthisPersonaInstance;
    }
    
    public void setPersonaeliminarpthisPersonaInstance(Persona personaeliminarpthisPersona) {
        this.personaeliminarpthisPersonaInstance = personaeliminarpthisPersona;
        this.personaeliminarpthisPersona = personaeliminarpthisPersona != null ? personaeliminarpthisPersona.getOid() : null;
    }

    private void checkPersonaeliminarpthisPersona() throws NotNullArgumentException {
        if(this.getPersonaeliminarpthisPersonaInstance() == null || this.getPersonaeliminarpthisPersonaInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_ELIMINAR, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_ELIMINAR_PERSONAELIMINARPTHISPERSONA, PersonaConstants.SERV_ALIAS_ELIMINAR, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_ELIMINAR_PERSONAELIMINARPTHISPERSONA);
        }
    }
}
