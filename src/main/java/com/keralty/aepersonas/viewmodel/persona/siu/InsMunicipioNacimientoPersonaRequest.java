package com.keralty.aepersonas.viewmodel.persona.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.Persona;

public class InsMunicipioNacimientoPersonaRequest {

    @JsonProperty("p_thispersona_oid")
    private PersonaOid personaInsMunicipioNacimientoPersonapthisPersona;
    
    @JsonIgnore
    private Persona personaInsMunicipioNacimientoPersonapthisPersonaInstance;

    @JsonProperty("p_evcmunicipio_oid")
    private MunicipioOid personaInsMunicipioNacimientoPersonapevcMunicipio;
    
    @JsonIgnore
    private Municipio personaInsMunicipioNacimientoPersonapevcMunicipioInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonaInsMunicipioNacimientoPersonapthisPersona();
        checkPersonaInsMunicipioNacimientoPersonapevcMunicipio();
    }

    @JsonIgnore
    public PersonaOid getPersonaInsMunicipioNacimientoPersonapthisPersona() {
        return this.personaInsMunicipioNacimientoPersonapthisPersona;
    }
    
    public void setPersonaInsMunicipioNacimientoPersonapthisPersona(PersonaOid personaInsMunicipioNacimientoPersonapthisPersona) {
        this.personaInsMunicipioNacimientoPersonapthisPersona = personaInsMunicipioNacimientoPersonapthisPersona;
    }

    @JsonIgnore
    public Persona getPersonaInsMunicipioNacimientoPersonapthisPersonaInstance() {
        return this.personaInsMunicipioNacimientoPersonapthisPersonaInstance;
    }
    
    public void setPersonaInsMunicipioNacimientoPersonapthisPersonaInstance(Persona personaInsMunicipioNacimientoPersonapthisPersona) {
        this.personaInsMunicipioNacimientoPersonapthisPersonaInstance = personaInsMunicipioNacimientoPersonapthisPersona;
        this.personaInsMunicipioNacimientoPersonapthisPersona = personaInsMunicipioNacimientoPersonapthisPersona != null ? personaInsMunicipioNacimientoPersonapthisPersona.getOid() : null;
    }

    private void checkPersonaInsMunicipioNacimientoPersonapthisPersona() throws NotNullArgumentException {
        if(this.getPersonaInsMunicipioNacimientoPersonapthisPersonaInstance() == null || this.getPersonaInsMunicipioNacimientoPersonapthisPersonaInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_INSMUNICIPIONACIMIENTOPERSONA, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_INSMUNICIPIONACIMIENTOPERSONA_PERSONAINSMUNICIPIONACIMIENTOPERSONAPTHISPERSONA, PersonaConstants.SERV_ALIAS_INSMUNICIPIONACIMIENTOPERSONA, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_INSMUNICIPIONACIMIENTOPERSONA_PERSONAINSMUNICIPIONACIMIENTOPERSONAPTHISPERSONA);
        }
    }

    @JsonIgnore
    public MunicipioOid getPersonaInsMunicipioNacimientoPersonapevcMunicipio() {
        return this.personaInsMunicipioNacimientoPersonapevcMunicipio;
    }
    
    public void setPersonaInsMunicipioNacimientoPersonapevcMunicipio(MunicipioOid personaInsMunicipioNacimientoPersonapevcMunicipio) {
        this.personaInsMunicipioNacimientoPersonapevcMunicipio = personaInsMunicipioNacimientoPersonapevcMunicipio;
    }

    @JsonIgnore
    public Municipio getPersonaInsMunicipioNacimientoPersonapevcMunicipioInstance() {
        return this.personaInsMunicipioNacimientoPersonapevcMunicipioInstance;
    }
    
    public void setPersonaInsMunicipioNacimientoPersonapevcMunicipioInstance(Municipio personaInsMunicipioNacimientoPersonapevcMunicipio) {
        this.personaInsMunicipioNacimientoPersonapevcMunicipioInstance = personaInsMunicipioNacimientoPersonapevcMunicipio;
        this.personaInsMunicipioNacimientoPersonapevcMunicipio = personaInsMunicipioNacimientoPersonapevcMunicipio != null ? personaInsMunicipioNacimientoPersonapevcMunicipio.getOid() : null;
    }

    private void checkPersonaInsMunicipioNacimientoPersonapevcMunicipio() throws NotNullArgumentException {
        if(this.getPersonaInsMunicipioNacimientoPersonapevcMunicipioInstance() == null || this.getPersonaInsMunicipioNacimientoPersonapevcMunicipioInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_INSMUNICIPIONACIMIENTOPERSONA, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_INSMUNICIPIONACIMIENTOPERSONA_PERSONAINSMUNICIPIONACIMIENTOPERSONAPEVCMUNICIPIO, PersonaConstants.SERV_ALIAS_INSMUNICIPIONACIMIENTOPERSONA, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_INSMUNICIPIONACIMIENTOPERSONA_PERSONAINSMUNICIPIONACIMIENTOPERSONAPEVCMUNICIPIO);
        }
    }
}
