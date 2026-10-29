package com.keralty.aepersonas.viewmodel.persona.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.Persona;

public class DelMunicipioNacimientoPersonaRequest {

    @JsonProperty("p_thispersona_oid")
    private PersonaOid personaDelMunicipioNacimientoPersonapthisPersona;
    
    @JsonIgnore
    private Persona personaDelMunicipioNacimientoPersonapthisPersonaInstance;

    @JsonProperty("p_evcmunicipio_oid")
    private MunicipioOid personaDelMunicipioNacimientoPersonapevcMunicipio;
    
    @JsonIgnore
    private Municipio personaDelMunicipioNacimientoPersonapevcMunicipioInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonaDelMunicipioNacimientoPersonapthisPersona();
        checkPersonaDelMunicipioNacimientoPersonapevcMunicipio();
    }

    @JsonIgnore
    public PersonaOid getPersonaDelMunicipioNacimientoPersonapthisPersona() {
        return this.personaDelMunicipioNacimientoPersonapthisPersona;
    }
    
    public void setPersonaDelMunicipioNacimientoPersonapthisPersona(PersonaOid personaDelMunicipioNacimientoPersonapthisPersona) {
        this.personaDelMunicipioNacimientoPersonapthisPersona = personaDelMunicipioNacimientoPersonapthisPersona;
    }

    @JsonIgnore
    public Persona getPersonaDelMunicipioNacimientoPersonapthisPersonaInstance() {
        return this.personaDelMunicipioNacimientoPersonapthisPersonaInstance;
    }
    
    public void setPersonaDelMunicipioNacimientoPersonapthisPersonaInstance(Persona personaDelMunicipioNacimientoPersonapthisPersona) {
        this.personaDelMunicipioNacimientoPersonapthisPersonaInstance = personaDelMunicipioNacimientoPersonapthisPersona;
        this.personaDelMunicipioNacimientoPersonapthisPersona = personaDelMunicipioNacimientoPersonapthisPersona != null ? personaDelMunicipioNacimientoPersonapthisPersona.getOid() : null;
    }

    private void checkPersonaDelMunicipioNacimientoPersonapthisPersona() throws NotNullArgumentException {
        if(this.getPersonaDelMunicipioNacimientoPersonapthisPersonaInstance() == null || this.getPersonaDelMunicipioNacimientoPersonapthisPersonaInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_DELMUNICIPIONACIMIENTOPERSONA, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_DELMUNICIPIONACIMIENTOPERSONA_PERSONADELMUNICIPIONACIMIENTOPERSONAPTHISPERSONA, PersonaConstants.SERV_ALIAS_DELMUNICIPIONACIMIENTOPERSONA, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_DELMUNICIPIONACIMIENTOPERSONA_PERSONADELMUNICIPIONACIMIENTOPERSONAPTHISPERSONA);
        }
    }

    @JsonIgnore
    public MunicipioOid getPersonaDelMunicipioNacimientoPersonapevcMunicipio() {
        return this.personaDelMunicipioNacimientoPersonapevcMunicipio;
    }
    
    public void setPersonaDelMunicipioNacimientoPersonapevcMunicipio(MunicipioOid personaDelMunicipioNacimientoPersonapevcMunicipio) {
        this.personaDelMunicipioNacimientoPersonapevcMunicipio = personaDelMunicipioNacimientoPersonapevcMunicipio;
    }

    @JsonIgnore
    public Municipio getPersonaDelMunicipioNacimientoPersonapevcMunicipioInstance() {
        return this.personaDelMunicipioNacimientoPersonapevcMunicipioInstance;
    }
    
    public void setPersonaDelMunicipioNacimientoPersonapevcMunicipioInstance(Municipio personaDelMunicipioNacimientoPersonapevcMunicipio) {
        this.personaDelMunicipioNacimientoPersonapevcMunicipioInstance = personaDelMunicipioNacimientoPersonapevcMunicipio;
        this.personaDelMunicipioNacimientoPersonapevcMunicipio = personaDelMunicipioNacimientoPersonapevcMunicipio != null ? personaDelMunicipioNacimientoPersonapevcMunicipio.getOid() : null;
    }

    private void checkPersonaDelMunicipioNacimientoPersonapevcMunicipio() throws NotNullArgumentException {
        if(this.getPersonaDelMunicipioNacimientoPersonapevcMunicipioInstance() == null || this.getPersonaDelMunicipioNacimientoPersonapevcMunicipioInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_DELMUNICIPIONACIMIENTOPERSONA, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_DELMUNICIPIONACIMIENTOPERSONA_PERSONADELMUNICIPIONACIMIENTOPERSONAPEVCMUNICIPIO, PersonaConstants.SERV_ALIAS_DELMUNICIPIONACIMIENTOPERSONA, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_DELMUNICIPIONACIMIENTOPERSONA_PERSONADELMUNICIPIONACIMIENTOPERSONAPEVCMUNICIPIO);
        }
    }
}
