package com.keralty.aepersonas.viewmodel.persona.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.Persona;
import com.keralty.aepersonas.persistence.TipoIdentificacion;

public class CambTipoIdentificacionRequest {

    @JsonProperty("p_thispersona_oid")
    private PersonaOid personaCambTipoIdentificacionpthisPersona;
    
    @JsonIgnore
    private Persona personaCambTipoIdentificacionpthisPersonaInstance;

    @JsonProperty("p_evctipoidentificacion_json")
    private String personaCambTipoIdentificacionpevcTipoIdentificacion;
    
    @JsonIgnore
    private TipoIdentificacion personaCambTipoIdentificacionpevcTipoIdentificacionInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonaCambTipoIdentificacionpthisPersona();
        checkPersonaCambTipoIdentificacionpevcTipoIdentificacion();
    }

    @JsonIgnore
    public PersonaOid getPersonaCambTipoIdentificacionpthisPersona() {
        return this.personaCambTipoIdentificacionpthisPersona;
    }
    
    public void setPersonaCambTipoIdentificacionpthisPersona(PersonaOid personaCambTipoIdentificacionpthisPersona) {
        this.personaCambTipoIdentificacionpthisPersona = personaCambTipoIdentificacionpthisPersona;
    }

    @JsonIgnore
    public Persona getPersonaCambTipoIdentificacionpthisPersonaInstance() {
        return this.personaCambTipoIdentificacionpthisPersonaInstance;
    }
    
    public void setPersonaCambTipoIdentificacionpthisPersonaInstance(Persona personaCambTipoIdentificacionpthisPersona) {
        this.personaCambTipoIdentificacionpthisPersonaInstance = personaCambTipoIdentificacionpthisPersona;
        this.personaCambTipoIdentificacionpthisPersona = personaCambTipoIdentificacionpthisPersona != null ? personaCambTipoIdentificacionpthisPersona.getOid() : null;
    }

    private void checkPersonaCambTipoIdentificacionpthisPersona() throws NotNullArgumentException {
        if(this.getPersonaCambTipoIdentificacionpthisPersonaInstance() == null || this.getPersonaCambTipoIdentificacionpthisPersonaInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_CAMBTIPOIDENTIFICACION, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_CAMBTIPOIDENTIFICACION_PERSONACAMBTIPOIDENTIFICACIONPTHISPERSONA, PersonaConstants.SERV_ALIAS_CAMBTIPOIDENTIFICACION, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_CAMBTIPOIDENTIFICACION_PERSONACAMBTIPOIDENTIFICACIONPTHISPERSONA);
        }
    }

    @JsonIgnore
    public String getPersonaCambTipoIdentificacionpevcTipoIdentificacion() {
        return this.personaCambTipoIdentificacionpevcTipoIdentificacion;
    }
    
    public void setPersonaCambTipoIdentificacionpevcTipoIdentificacion(String personaCambTipoIdentificacionpevcTipoIdentificacion) {
        this.personaCambTipoIdentificacionpevcTipoIdentificacion = personaCambTipoIdentificacionpevcTipoIdentificacion;
    }

    @JsonIgnore
    public TipoIdentificacion getPersonaCambTipoIdentificacionpevcTipoIdentificacionInstance() {
        return this.personaCambTipoIdentificacionpevcTipoIdentificacionInstance;
    }
    
    public void setPersonaCambTipoIdentificacionpevcTipoIdentificacionInstance(TipoIdentificacion personaCambTipoIdentificacionpevcTipoIdentificacion) {
        this.personaCambTipoIdentificacionpevcTipoIdentificacionInstance = personaCambTipoIdentificacionpevcTipoIdentificacion;
        this.personaCambTipoIdentificacionpevcTipoIdentificacion = personaCambTipoIdentificacionpevcTipoIdentificacion != null ? personaCambTipoIdentificacionpevcTipoIdentificacion.getOid().toJson() : "";
    }

    private void checkPersonaCambTipoIdentificacionpevcTipoIdentificacion() throws NotNullArgumentException {
        if(this.getPersonaCambTipoIdentificacionpevcTipoIdentificacionInstance() == null || this.getPersonaCambTipoIdentificacionpevcTipoIdentificacionInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_CAMBTIPOIDENTIFICACION, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_CAMBTIPOIDENTIFICACION_PERSONACAMBTIPOIDENTIFICACIONPEVCTIPOIDENTIFICACION, PersonaConstants.SERV_ALIAS_CAMBTIPOIDENTIFICACION, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_CAMBTIPOIDENTIFICACION_PERSONACAMBTIPOIDENTIFICACIONPEVCTIPOIDENTIFICACION);
        }
    }
}
