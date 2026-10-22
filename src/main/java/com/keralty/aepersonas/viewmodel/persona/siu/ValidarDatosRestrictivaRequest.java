package com.keralty.aepersonas.viewmodel.persona.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.Persona;

public class ValidarDatosRestrictivaRequest {

    @JsonProperty("p_thispersona_oid")
    private PersonaOid personavalidarDatosRestrictivapthisPersona;
    
    @JsonIgnore
    private Persona personavalidarDatosRestrictivapthisPersonaInstance;

    @JsonProperty("preconditionId")
    private String preconditionId;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonavalidarDatosRestrictivapthisPersona();
    }

    @JsonIgnore
    public PersonaOid getPersonavalidarDatosRestrictivapthisPersona() {
        return this.personavalidarDatosRestrictivapthisPersona;
    }
    
    public void setPersonavalidarDatosRestrictivapthisPersona(PersonaOid personavalidarDatosRestrictivapthisPersona) {
        this.personavalidarDatosRestrictivapthisPersona = personavalidarDatosRestrictivapthisPersona;
    }

    @JsonIgnore
    public Persona getPersonavalidarDatosRestrictivapthisPersonaInstance() {
        return this.personavalidarDatosRestrictivapthisPersonaInstance;
    }
    
    public void setPersonavalidarDatosRestrictivapthisPersonaInstance(Persona personavalidarDatosRestrictivapthisPersona) {
        this.personavalidarDatosRestrictivapthisPersonaInstance = personavalidarDatosRestrictivapthisPersona;
        this.personavalidarDatosRestrictivapthisPersona = personavalidarDatosRestrictivapthisPersona != null ? personavalidarDatosRestrictivapthisPersona.getOid() : null;
    }

    private void checkPersonavalidarDatosRestrictivapthisPersona() throws NotNullArgumentException {
        if(this.getPersonavalidarDatosRestrictivapthisPersonaInstance() == null || this.getPersonavalidarDatosRestrictivapthisPersonaInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_VALIDARDATOSRESTRICTIVA, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_VALIDARDATOSRESTRICTIVA_PERSONAVALIDARDATOSRESTRICTIVAPTHISPERSONA, PersonaConstants.SERV_ALIAS_VALIDARDATOSRESTRICTIVA, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_VALIDARDATOSRESTRICTIVA_PERSONAVALIDARDATOSRESTRICTIVAPTHISPERSONA);
        }
    }

    @JsonIgnore
    public String getPreconditionId() {
        return this.preconditionId;
    }
    
    public void setPreconditionId(String preconditionId) {
        this.preconditionId = preconditionId;
    }
}
