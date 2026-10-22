package com.keralty.aepersonas.viewmodel.persona.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Persona;
import com.keralty.aepersonas.persistence.Solicitud;

public class InsContratanteSolicitudRequest {

    @JsonProperty("p_thispersona_oid")
    private PersonaOid personaInsContratanteSolicitudpthisPersona;
    
    @JsonIgnore
    private Persona personaInsContratanteSolicitudpthisPersonaInstance;

    @JsonProperty("p_evcsolicitud_oid")
    private SolicitudOid personaInsContratanteSolicitudpevcSolicitud;
    
    @JsonIgnore
    private Solicitud personaInsContratanteSolicitudpevcSolicitudInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonaInsContratanteSolicitudpthisPersona();
        checkPersonaInsContratanteSolicitudpevcSolicitud();
    }

    @JsonIgnore
    public PersonaOid getPersonaInsContratanteSolicitudpthisPersona() {
        return this.personaInsContratanteSolicitudpthisPersona;
    }
    
    public void setPersonaInsContratanteSolicitudpthisPersona(PersonaOid personaInsContratanteSolicitudpthisPersona) {
        this.personaInsContratanteSolicitudpthisPersona = personaInsContratanteSolicitudpthisPersona;
    }

    @JsonIgnore
    public Persona getPersonaInsContratanteSolicitudpthisPersonaInstance() {
        return this.personaInsContratanteSolicitudpthisPersonaInstance;
    }
    
    public void setPersonaInsContratanteSolicitudpthisPersonaInstance(Persona personaInsContratanteSolicitudpthisPersona) {
        this.personaInsContratanteSolicitudpthisPersonaInstance = personaInsContratanteSolicitudpthisPersona;
        this.personaInsContratanteSolicitudpthisPersona = personaInsContratanteSolicitudpthisPersona != null ? personaInsContratanteSolicitudpthisPersona.getOid() : null;
    }

    private void checkPersonaInsContratanteSolicitudpthisPersona() throws NotNullArgumentException {
        if(this.getPersonaInsContratanteSolicitudpthisPersonaInstance() == null || this.getPersonaInsContratanteSolicitudpthisPersonaInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_INSCONTRATANTESOLICITUD, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_INSCONTRATANTESOLICITUD_PERSONAINSCONTRATANTESOLICITUDPTHISPERSONA, PersonaConstants.SERV_ALIAS_INSCONTRATANTESOLICITUD, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_INSCONTRATANTESOLICITUD_PERSONAINSCONTRATANTESOLICITUDPTHISPERSONA);
        }
    }

    @JsonIgnore
    public SolicitudOid getPersonaInsContratanteSolicitudpevcSolicitud() {
        return this.personaInsContratanteSolicitudpevcSolicitud;
    }
    
    public void setPersonaInsContratanteSolicitudpevcSolicitud(SolicitudOid personaInsContratanteSolicitudpevcSolicitud) {
        this.personaInsContratanteSolicitudpevcSolicitud = personaInsContratanteSolicitudpevcSolicitud;
    }

    @JsonIgnore
    public Solicitud getPersonaInsContratanteSolicitudpevcSolicitudInstance() {
        return this.personaInsContratanteSolicitudpevcSolicitudInstance;
    }
    
    public void setPersonaInsContratanteSolicitudpevcSolicitudInstance(Solicitud personaInsContratanteSolicitudpevcSolicitud) {
        this.personaInsContratanteSolicitudpevcSolicitudInstance = personaInsContratanteSolicitudpevcSolicitud;
        this.personaInsContratanteSolicitudpevcSolicitud = personaInsContratanteSolicitudpevcSolicitud != null ? personaInsContratanteSolicitudpevcSolicitud.getOid() : null;
    }

    private void checkPersonaInsContratanteSolicitudpevcSolicitud() throws NotNullArgumentException {
        if(this.getPersonaInsContratanteSolicitudpevcSolicitudInstance() == null || this.getPersonaInsContratanteSolicitudpevcSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_INSCONTRATANTESOLICITUD, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_INSCONTRATANTESOLICITUD_PERSONAINSCONTRATANTESOLICITUDPEVCSOLICITUD, PersonaConstants.SERV_ALIAS_INSCONTRATANTESOLICITUD, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_INSCONTRATANTESOLICITUD_PERSONAINSCONTRATANTESOLICITUDPEVCSOLICITUD);
        }
    }
}
