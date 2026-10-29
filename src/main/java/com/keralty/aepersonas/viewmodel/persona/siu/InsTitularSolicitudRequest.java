package com.keralty.aepersonas.viewmodel.persona.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Persona;
import com.keralty.aepersonas.persistence.Solicitud;

public class InsTitularSolicitudRequest {

    @JsonProperty("p_thispersona_oid")
    private PersonaOid personaInsTitularSolicitudpthisPersona;
    
    @JsonIgnore
    private Persona personaInsTitularSolicitudpthisPersonaInstance;

    @JsonProperty("p_evcsolicitud_oid")
    private SolicitudOid personaInsTitularSolicitudpevcSolicitud;
    
    @JsonIgnore
    private Solicitud personaInsTitularSolicitudpevcSolicitudInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonaInsTitularSolicitudpthisPersona();
        checkPersonaInsTitularSolicitudpevcSolicitud();
    }

    @JsonIgnore
    public PersonaOid getPersonaInsTitularSolicitudpthisPersona() {
        return this.personaInsTitularSolicitudpthisPersona;
    }
    
    public void setPersonaInsTitularSolicitudpthisPersona(PersonaOid personaInsTitularSolicitudpthisPersona) {
        this.personaInsTitularSolicitudpthisPersona = personaInsTitularSolicitudpthisPersona;
    }

    @JsonIgnore
    public Persona getPersonaInsTitularSolicitudpthisPersonaInstance() {
        return this.personaInsTitularSolicitudpthisPersonaInstance;
    }
    
    public void setPersonaInsTitularSolicitudpthisPersonaInstance(Persona personaInsTitularSolicitudpthisPersona) {
        this.personaInsTitularSolicitudpthisPersonaInstance = personaInsTitularSolicitudpthisPersona;
        this.personaInsTitularSolicitudpthisPersona = personaInsTitularSolicitudpthisPersona != null ? personaInsTitularSolicitudpthisPersona.getOid() : null;
    }

    private void checkPersonaInsTitularSolicitudpthisPersona() throws NotNullArgumentException {
        if(this.getPersonaInsTitularSolicitudpthisPersonaInstance() == null || this.getPersonaInsTitularSolicitudpthisPersonaInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_INSTITULARSOLICITUD, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_INSTITULARSOLICITUD_PERSONAINSTITULARSOLICITUDPTHISPERSONA, PersonaConstants.SERV_ALIAS_INSTITULARSOLICITUD, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_INSTITULARSOLICITUD_PERSONAINSTITULARSOLICITUDPTHISPERSONA);
        }
    }

    @JsonIgnore
    public SolicitudOid getPersonaInsTitularSolicitudpevcSolicitud() {
        return this.personaInsTitularSolicitudpevcSolicitud;
    }
    
    public void setPersonaInsTitularSolicitudpevcSolicitud(SolicitudOid personaInsTitularSolicitudpevcSolicitud) {
        this.personaInsTitularSolicitudpevcSolicitud = personaInsTitularSolicitudpevcSolicitud;
    }

    @JsonIgnore
    public Solicitud getPersonaInsTitularSolicitudpevcSolicitudInstance() {
        return this.personaInsTitularSolicitudpevcSolicitudInstance;
    }
    
    public void setPersonaInsTitularSolicitudpevcSolicitudInstance(Solicitud personaInsTitularSolicitudpevcSolicitud) {
        this.personaInsTitularSolicitudpevcSolicitudInstance = personaInsTitularSolicitudpevcSolicitud;
        this.personaInsTitularSolicitudpevcSolicitud = personaInsTitularSolicitudpevcSolicitud != null ? personaInsTitularSolicitudpevcSolicitud.getOid() : null;
    }

    private void checkPersonaInsTitularSolicitudpevcSolicitud() throws NotNullArgumentException {
        if(this.getPersonaInsTitularSolicitudpevcSolicitudInstance() == null || this.getPersonaInsTitularSolicitudpevcSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_INSTITULARSOLICITUD, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_INSTITULARSOLICITUD_PERSONAINSTITULARSOLICITUDPEVCSOLICITUD, PersonaConstants.SERV_ALIAS_INSTITULARSOLICITUD, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_INSTITULARSOLICITUD_PERSONAINSTITULARSOLICITUDPEVCSOLICITUD);
        }
    }
}
