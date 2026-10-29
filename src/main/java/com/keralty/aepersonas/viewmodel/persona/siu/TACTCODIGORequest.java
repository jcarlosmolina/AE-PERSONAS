package com.keralty.aepersonas.viewmodel.persona.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.Persona;

public class TACTCODIGORequest {

    @JsonProperty("p_thispersona_oid")
    private PersonaOid personaTACTCODIGOpthisPersona;
    
    @JsonIgnore
    private Persona personaTACTCODIGOpthisPersonaInstance;

    @JsonProperty("pt_p_codigo")
    private Long personaTACTCODIGOptpCodigo;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonaTACTCODIGOpthisPersona();
    }

    @JsonIgnore
    public PersonaOid getPersonaTACTCODIGOpthisPersona() {
        return this.personaTACTCODIGOpthisPersona;
    }
    
    public void setPersonaTACTCODIGOpthisPersona(PersonaOid personaTACTCODIGOpthisPersona) {
        this.personaTACTCODIGOpthisPersona = personaTACTCODIGOpthisPersona;
    }

    @JsonIgnore
    public Persona getPersonaTACTCODIGOpthisPersonaInstance() {
        return this.personaTACTCODIGOpthisPersonaInstance;
    }
    
    public void setPersonaTACTCODIGOpthisPersonaInstance(Persona personaTACTCODIGOpthisPersona) {
        this.personaTACTCODIGOpthisPersonaInstance = personaTACTCODIGOpthisPersona;
        this.personaTACTCODIGOpthisPersona = personaTACTCODIGOpthisPersona != null ? personaTACTCODIGOpthisPersona.getOid() : null;
    }

    private void checkPersonaTACTCODIGOpthisPersona() throws NotNullArgumentException {
        if(this.getPersonaTACTCODIGOpthisPersonaInstance() == null || this.getPersonaTACTCODIGOpthisPersonaInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TACTCODIGO, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TACTCODIGO_PERSONATACTCODIGOPTHISPERSONA, PersonaConstants.SERV_ALIAS_TACTCODIGO, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TACTCODIGO_PERSONATACTCODIGOPTHISPERSONA);
        }
    }

    @JsonIgnore
    public Long getPersonaTACTCODIGOptpCodigo() {
        return this.personaTACTCODIGOptpCodigo;
    }
    
    public void setPersonaTACTCODIGOptpCodigo(Long personaTACTCODIGOptpCodigo) {
        this.personaTACTCODIGOptpCodigo = personaTACTCODIGOptpCodigo;
    }
}
