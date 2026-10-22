package com.keralty.aepersonas.viewmodel.persona.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Persona;
import com.keralty.aepersonas.persistence.Solicitud;

public class DelContratanteSolicitudRequest {

    @JsonProperty("p_thispersona_oid")
    private PersonaOid personaDelContratanteSolicitudpthisPersona;
    
    @JsonIgnore
    private Persona personaDelContratanteSolicitudpthisPersonaInstance;

    @JsonProperty("p_evcsolicitud_oid")
    private SolicitudOid personaDelContratanteSolicitudpevcSolicitud;
    
    @JsonIgnore
    private Solicitud personaDelContratanteSolicitudpevcSolicitudInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonaDelContratanteSolicitudpthisPersona();
        checkPersonaDelContratanteSolicitudpevcSolicitud();
    }

    @JsonIgnore
    public PersonaOid getPersonaDelContratanteSolicitudpthisPersona() {
        return this.personaDelContratanteSolicitudpthisPersona;
    }
    
    public void setPersonaDelContratanteSolicitudpthisPersona(PersonaOid personaDelContratanteSolicitudpthisPersona) {
        this.personaDelContratanteSolicitudpthisPersona = personaDelContratanteSolicitudpthisPersona;
    }

    @JsonIgnore
    public Persona getPersonaDelContratanteSolicitudpthisPersonaInstance() {
        return this.personaDelContratanteSolicitudpthisPersonaInstance;
    }
    
    public void setPersonaDelContratanteSolicitudpthisPersonaInstance(Persona personaDelContratanteSolicitudpthisPersona) {
        this.personaDelContratanteSolicitudpthisPersonaInstance = personaDelContratanteSolicitudpthisPersona;
        this.personaDelContratanteSolicitudpthisPersona = personaDelContratanteSolicitudpthisPersona != null ? personaDelContratanteSolicitudpthisPersona.getOid() : null;
    }

    private void checkPersonaDelContratanteSolicitudpthisPersona() throws NotNullArgumentException {
        if(this.getPersonaDelContratanteSolicitudpthisPersonaInstance() == null || this.getPersonaDelContratanteSolicitudpthisPersonaInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_DELCONTRATANTESOLICITUD, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_DELCONTRATANTESOLICITUD_PERSONADELCONTRATANTESOLICITUDPTHISPERSONA, PersonaConstants.SERV_ALIAS_DELCONTRATANTESOLICITUD, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_DELCONTRATANTESOLICITUD_PERSONADELCONTRATANTESOLICITUDPTHISPERSONA);
        }
    }

    @JsonIgnore
    public SolicitudOid getPersonaDelContratanteSolicitudpevcSolicitud() {
        return this.personaDelContratanteSolicitudpevcSolicitud;
    }
    
    public void setPersonaDelContratanteSolicitudpevcSolicitud(SolicitudOid personaDelContratanteSolicitudpevcSolicitud) {
        this.personaDelContratanteSolicitudpevcSolicitud = personaDelContratanteSolicitudpevcSolicitud;
    }

    @JsonIgnore
    public Solicitud getPersonaDelContratanteSolicitudpevcSolicitudInstance() {
        return this.personaDelContratanteSolicitudpevcSolicitudInstance;
    }
    
    public void setPersonaDelContratanteSolicitudpevcSolicitudInstance(Solicitud personaDelContratanteSolicitudpevcSolicitud) {
        this.personaDelContratanteSolicitudpevcSolicitudInstance = personaDelContratanteSolicitudpevcSolicitud;
        this.personaDelContratanteSolicitudpevcSolicitud = personaDelContratanteSolicitudpevcSolicitud != null ? personaDelContratanteSolicitudpevcSolicitud.getOid() : null;
    }

    private void checkPersonaDelContratanteSolicitudpevcSolicitud() throws NotNullArgumentException {
        if(this.getPersonaDelContratanteSolicitudpevcSolicitudInstance() == null || this.getPersonaDelContratanteSolicitudpevcSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_DELCONTRATANTESOLICITUD, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_DELCONTRATANTESOLICITUD_PERSONADELCONTRATANTESOLICITUDPEVCSOLICITUD, PersonaConstants.SERV_ALIAS_DELCONTRATANTESOLICITUD, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_DELCONTRATANTESOLICITUD_PERSONADELCONTRATANTESOLICITUDPEVCSOLICITUD);
        }
    }
}
