package com.keralty.aepersonas.viewmodel.persona.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.Persona;

public class CambiarTelefonosRequest {

    @JsonProperty("p_thispersona_oid")
    private PersonaOid personacambiarTelefonospthisPersona;
    
    @JsonIgnore
    private Persona personacambiarTelefonospthisPersonaInstance;

    @JsonProperty("p_telefonofijo")
    private String personacambiarTelefonospTelefonoFijo;

    @JsonProperty("p_telefonocelular")
    private String personacambiarTelefonospTelefonoCelular;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonacambiarTelefonospthisPersona();
    }

    @JsonIgnore
    public PersonaOid getPersonacambiarTelefonospthisPersona() {
        return this.personacambiarTelefonospthisPersona;
    }
    
    public void setPersonacambiarTelefonospthisPersona(PersonaOid personacambiarTelefonospthisPersona) {
        this.personacambiarTelefonospthisPersona = personacambiarTelefonospthisPersona;
    }

    @JsonIgnore
    public Persona getPersonacambiarTelefonospthisPersonaInstance() {
        return this.personacambiarTelefonospthisPersonaInstance;
    }
    
    public void setPersonacambiarTelefonospthisPersonaInstance(Persona personacambiarTelefonospthisPersona) {
        this.personacambiarTelefonospthisPersonaInstance = personacambiarTelefonospthisPersona;
        this.personacambiarTelefonospthisPersona = personacambiarTelefonospthisPersona != null ? personacambiarTelefonospthisPersona.getOid() : null;
    }

    private void checkPersonacambiarTelefonospthisPersona() throws NotNullArgumentException {
        if(this.getPersonacambiarTelefonospthisPersonaInstance() == null || this.getPersonacambiarTelefonospthisPersonaInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_CAMBIARTELEFONOS, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_CAMBIARTELEFONOS_PERSONACAMBIARTELEFONOSPTHISPERSONA, PersonaConstants.SERV_ALIAS_CAMBIARTELEFONOS, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_CAMBIARTELEFONOS_PERSONACAMBIARTELEFONOSPTHISPERSONA);
        }
    }

    @JsonIgnore
    public String getPersonacambiarTelefonospTelefonoFijo() {
        return this.personacambiarTelefonospTelefonoFijo;
    }
    
    public void setPersonacambiarTelefonospTelefonoFijo(String personacambiarTelefonospTelefonoFijo) {
        this.personacambiarTelefonospTelefonoFijo = personacambiarTelefonospTelefonoFijo;
    }

    @JsonIgnore
    public String getPersonacambiarTelefonospTelefonoCelular() {
        return this.personacambiarTelefonospTelefonoCelular;
    }
    
    public void setPersonacambiarTelefonospTelefonoCelular(String personacambiarTelefonospTelefonoCelular) {
        this.personacambiarTelefonospTelefonoCelular = personacambiarTelefonospTelefonoCelular;
    }
}
