package com.keralty.aepersonas.viewmodel.persona.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Persona;
import com.keralty.aepersonas.persistence.Solicitud;

public class DummyGetNumCodCORERequest {

    @JsonProperty("p_thispersona_oid")
    private PersonaOid personadummyGetNumCodCOREpthisPersona;
    
    @JsonIgnore
    private Persona personadummyGetNumCodCOREpthisPersonaInstance;

    @JsonProperty("p_solicitud_oid")
    private SolicitudOid personadummyGetNumCodCOREpSolicitud;
    
    @JsonIgnore
    private Solicitud personadummyGetNumCodCOREpSolicitudInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonadummyGetNumCodCOREpthisPersona();
        checkPersonadummyGetNumCodCOREpSolicitud();
    }

    @JsonIgnore
    public PersonaOid getPersonadummyGetNumCodCOREpthisPersona() {
        return this.personadummyGetNumCodCOREpthisPersona;
    }
    
    public void setPersonadummyGetNumCodCOREpthisPersona(PersonaOid personadummyGetNumCodCOREpthisPersona) {
        this.personadummyGetNumCodCOREpthisPersona = personadummyGetNumCodCOREpthisPersona;
    }

    @JsonIgnore
    public Persona getPersonadummyGetNumCodCOREpthisPersonaInstance() {
        return this.personadummyGetNumCodCOREpthisPersonaInstance;
    }
    
    public void setPersonadummyGetNumCodCOREpthisPersonaInstance(Persona personadummyGetNumCodCOREpthisPersona) {
        this.personadummyGetNumCodCOREpthisPersonaInstance = personadummyGetNumCodCOREpthisPersona;
        this.personadummyGetNumCodCOREpthisPersona = personadummyGetNumCodCOREpthisPersona != null ? personadummyGetNumCodCOREpthisPersona.getOid() : null;
    }

    private void checkPersonadummyGetNumCodCOREpthisPersona() throws NotNullArgumentException {
        if(this.getPersonadummyGetNumCodCOREpthisPersonaInstance() == null || this.getPersonadummyGetNumCodCOREpthisPersonaInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_DUMMYGETNUMCODCORE, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_DUMMYGETNUMCODCORE_PERSONADUMMYGETNUMCODCOREPTHISPERSONA, PersonaConstants.SERV_ALIAS_DUMMYGETNUMCODCORE, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_DUMMYGETNUMCODCORE_PERSONADUMMYGETNUMCODCOREPTHISPERSONA);
        }
    }

    @JsonIgnore
    public SolicitudOid getPersonadummyGetNumCodCOREpSolicitud() {
        return this.personadummyGetNumCodCOREpSolicitud;
    }
    
    public void setPersonadummyGetNumCodCOREpSolicitud(SolicitudOid personadummyGetNumCodCOREpSolicitud) {
        this.personadummyGetNumCodCOREpSolicitud = personadummyGetNumCodCOREpSolicitud;
    }

    @JsonIgnore
    public Solicitud getPersonadummyGetNumCodCOREpSolicitudInstance() {
        return this.personadummyGetNumCodCOREpSolicitudInstance;
    }
    
    public void setPersonadummyGetNumCodCOREpSolicitudInstance(Solicitud personadummyGetNumCodCOREpSolicitud) {
        this.personadummyGetNumCodCOREpSolicitudInstance = personadummyGetNumCodCOREpSolicitud;
        this.personadummyGetNumCodCOREpSolicitud = personadummyGetNumCodCOREpSolicitud != null ? personadummyGetNumCodCOREpSolicitud.getOid() : null;
    }

    private void checkPersonadummyGetNumCodCOREpSolicitud() throws NotNullArgumentException {
        if(this.getPersonadummyGetNumCodCOREpSolicitudInstance() == null || this.getPersonadummyGetNumCodCOREpSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_DUMMYGETNUMCODCORE, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_DUMMYGETNUMCODCORE_PERSONADUMMYGETNUMCODCOREPSOLICITUD, PersonaConstants.SERV_ALIAS_DUMMYGETNUMCODCORE, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_DUMMYGETNUMCODCORE_PERSONADUMMYGETNUMCODCOREPSOLICITUD);
        }
    }
}
