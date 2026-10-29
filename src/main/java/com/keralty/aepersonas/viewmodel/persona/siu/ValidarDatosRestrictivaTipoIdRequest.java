package com.keralty.aepersonas.viewmodel.persona.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.Persona;

public class ValidarDatosRestrictivaTipoIdRequest {

    @JsonProperty("p_thispersona_oid")
    private PersonaOid personavalidarDatosRestrictivaTipoIdpthisPersona;
    
    @JsonIgnore
    private Persona personavalidarDatosRestrictivaTipoIdpthisPersonaInstance;

    @JsonProperty("preconditionId")
    private String preconditionId;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonavalidarDatosRestrictivaTipoIdpthisPersona();
    }

    @JsonIgnore
    public PersonaOid getPersonavalidarDatosRestrictivaTipoIdpthisPersona() {
        return this.personavalidarDatosRestrictivaTipoIdpthisPersona;
    }
    
    public void setPersonavalidarDatosRestrictivaTipoIdpthisPersona(PersonaOid personavalidarDatosRestrictivaTipoIdpthisPersona) {
        this.personavalidarDatosRestrictivaTipoIdpthisPersona = personavalidarDatosRestrictivaTipoIdpthisPersona;
    }

    @JsonIgnore
    public Persona getPersonavalidarDatosRestrictivaTipoIdpthisPersonaInstance() {
        return this.personavalidarDatosRestrictivaTipoIdpthisPersonaInstance;
    }
    
    public void setPersonavalidarDatosRestrictivaTipoIdpthisPersonaInstance(Persona personavalidarDatosRestrictivaTipoIdpthisPersona) {
        this.personavalidarDatosRestrictivaTipoIdpthisPersonaInstance = personavalidarDatosRestrictivaTipoIdpthisPersona;
        this.personavalidarDatosRestrictivaTipoIdpthisPersona = personavalidarDatosRestrictivaTipoIdpthisPersona != null ? personavalidarDatosRestrictivaTipoIdpthisPersona.getOid() : null;
    }

    private void checkPersonavalidarDatosRestrictivaTipoIdpthisPersona() throws NotNullArgumentException {
        if(this.getPersonavalidarDatosRestrictivaTipoIdpthisPersonaInstance() == null || this.getPersonavalidarDatosRestrictivaTipoIdpthisPersonaInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_VALIDARDATOSRESTRICTIVATIPOID, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_VALIDARDATOSRESTRICTIVATIPOID_PERSONAVALIDARDATOSRESTRICTIVATIPOIDPTHISPERSONA, PersonaConstants.SERV_ALIAS_VALIDARDATOSRESTRICTIVATIPOID, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_VALIDARDATOSRESTRICTIVATIPOID_PERSONAVALIDARDATOSRESTRICTIVATIPOIDPTHISPERSONA);
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
