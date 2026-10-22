package com.keralty.aepersonas.viewmodel.persona.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Persona;
import com.keralty.aepersonas.persistence.Solicitud;

public class DelTitularSolicitudRequest {

    @JsonProperty("p_thispersona_oid")
    private PersonaOid personaDelTitularSolicitudpthisPersona;
    
    @JsonIgnore
    private Persona personaDelTitularSolicitudpthisPersonaInstance;

    @JsonProperty("p_evcsolicitud_oid")
    private SolicitudOid personaDelTitularSolicitudpevcSolicitud;
    
    @JsonIgnore
    private Solicitud personaDelTitularSolicitudpevcSolicitudInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonaDelTitularSolicitudpthisPersona();
        checkPersonaDelTitularSolicitudpevcSolicitud();
    }

    @JsonIgnore
    public PersonaOid getPersonaDelTitularSolicitudpthisPersona() {
        return this.personaDelTitularSolicitudpthisPersona;
    }
    
    public void setPersonaDelTitularSolicitudpthisPersona(PersonaOid personaDelTitularSolicitudpthisPersona) {
        this.personaDelTitularSolicitudpthisPersona = personaDelTitularSolicitudpthisPersona;
    }

    @JsonIgnore
    public Persona getPersonaDelTitularSolicitudpthisPersonaInstance() {
        return this.personaDelTitularSolicitudpthisPersonaInstance;
    }
    
    public void setPersonaDelTitularSolicitudpthisPersonaInstance(Persona personaDelTitularSolicitudpthisPersona) {
        this.personaDelTitularSolicitudpthisPersonaInstance = personaDelTitularSolicitudpthisPersona;
        this.personaDelTitularSolicitudpthisPersona = personaDelTitularSolicitudpthisPersona != null ? personaDelTitularSolicitudpthisPersona.getOid() : null;
    }

    private void checkPersonaDelTitularSolicitudpthisPersona() throws NotNullArgumentException {
        if(this.getPersonaDelTitularSolicitudpthisPersonaInstance() == null || this.getPersonaDelTitularSolicitudpthisPersonaInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_DELTITULARSOLICITUD, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_DELTITULARSOLICITUD_PERSONADELTITULARSOLICITUDPTHISPERSONA, PersonaConstants.SERV_ALIAS_DELTITULARSOLICITUD, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_DELTITULARSOLICITUD_PERSONADELTITULARSOLICITUDPTHISPERSONA);
        }
    }

    @JsonIgnore
    public SolicitudOid getPersonaDelTitularSolicitudpevcSolicitud() {
        return this.personaDelTitularSolicitudpevcSolicitud;
    }
    
    public void setPersonaDelTitularSolicitudpevcSolicitud(SolicitudOid personaDelTitularSolicitudpevcSolicitud) {
        this.personaDelTitularSolicitudpevcSolicitud = personaDelTitularSolicitudpevcSolicitud;
    }

    @JsonIgnore
    public Solicitud getPersonaDelTitularSolicitudpevcSolicitudInstance() {
        return this.personaDelTitularSolicitudpevcSolicitudInstance;
    }
    
    public void setPersonaDelTitularSolicitudpevcSolicitudInstance(Solicitud personaDelTitularSolicitudpevcSolicitud) {
        this.personaDelTitularSolicitudpevcSolicitudInstance = personaDelTitularSolicitudpevcSolicitud;
        this.personaDelTitularSolicitudpevcSolicitud = personaDelTitularSolicitudpevcSolicitud != null ? personaDelTitularSolicitudpevcSolicitud.getOid() : null;
    }

    private void checkPersonaDelTitularSolicitudpevcSolicitud() throws NotNullArgumentException {
        if(this.getPersonaDelTitularSolicitudpevcSolicitudInstance() == null || this.getPersonaDelTitularSolicitudpevcSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_DELTITULARSOLICITUD, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_DELTITULARSOLICITUD_PERSONADELTITULARSOLICITUDPEVCSOLICITUD, PersonaConstants.SERV_ALIAS_DELTITULARSOLICITUD, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_DELTITULARSOLICITUD_PERSONADELTITULARSOLICITUDPEVCSOLICITUD);
        }
    }
}
