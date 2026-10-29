package com.keralty.aepersonas.viewmodel.persona.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.Persona;

public class IndicarCodigoCORERequest {

    @JsonProperty("p_thispersona_oid")
    private PersonaOid personaindicarCodigoCOREpthisPersona;
    
    @JsonIgnore
    private Persona personaindicarCodigoCOREpthisPersonaInstance;

    @JsonProperty("p_codigo")
    private Long personaindicarCodigoCOREpCodigo;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonaindicarCodigoCOREpthisPersona();
    }

    @JsonIgnore
    public PersonaOid getPersonaindicarCodigoCOREpthisPersona() {
        return this.personaindicarCodigoCOREpthisPersona;
    }
    
    public void setPersonaindicarCodigoCOREpthisPersona(PersonaOid personaindicarCodigoCOREpthisPersona) {
        this.personaindicarCodigoCOREpthisPersona = personaindicarCodigoCOREpthisPersona;
    }

    @JsonIgnore
    public Persona getPersonaindicarCodigoCOREpthisPersonaInstance() {
        return this.personaindicarCodigoCOREpthisPersonaInstance;
    }
    
    public void setPersonaindicarCodigoCOREpthisPersonaInstance(Persona personaindicarCodigoCOREpthisPersona) {
        this.personaindicarCodigoCOREpthisPersonaInstance = personaindicarCodigoCOREpthisPersona;
        this.personaindicarCodigoCOREpthisPersona = personaindicarCodigoCOREpthisPersona != null ? personaindicarCodigoCOREpthisPersona.getOid() : null;
    }

    private void checkPersonaindicarCodigoCOREpthisPersona() throws NotNullArgumentException {
        if(this.getPersonaindicarCodigoCOREpthisPersonaInstance() == null || this.getPersonaindicarCodigoCOREpthisPersonaInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_INDICARCODIGOCORE, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_INDICARCODIGOCORE_PERSONAINDICARCODIGOCOREPTHISPERSONA, PersonaConstants.SERV_ALIAS_INDICARCODIGOCORE, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_INDICARCODIGOCORE_PERSONAINDICARCODIGOCOREPTHISPERSONA);
        }
    }

    @JsonIgnore
    public Long getPersonaindicarCodigoCOREpCodigo() {
        return this.personaindicarCodigoCOREpCodigo;
    }
    
    public void setPersonaindicarCodigoCOREpCodigo(Long personaindicarCodigoCOREpCodigo) {
        this.personaindicarCodigoCOREpCodigo = personaindicarCodigoCOREpCodigo;
    }
}
