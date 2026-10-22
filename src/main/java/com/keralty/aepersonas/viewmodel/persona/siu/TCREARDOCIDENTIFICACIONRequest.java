package com.keralty.aepersonas.viewmodel.persona.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Persona;
import com.keralty.aepersonas.persistence.Solicitud;

public class TCREARDOCIDENTIFICACIONRequest {

    @JsonProperty("p_thispersona_oid")
    private PersonaOid personaTCREARDOCIDENTIFICACIONpthisPersona;
    
    @JsonIgnore
    private Persona personaTCREARDOCIDENTIFICACIONpthisPersonaInstance;

    @JsonProperty("ptdatosdocumento")
    private String personaTCREARDOCIDENTIFICACIONptDatosDocumento;

    @JsonProperty("ptsolicitud_oid")
    private SolicitudOid personaTCREARDOCIDENTIFICACIONptSolicitud;
    
    @JsonIgnore
    private Solicitud personaTCREARDOCIDENTIFICACIONptSolicitudInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonaTCREARDOCIDENTIFICACIONpthisPersona();
        checkPersonaTCREARDOCIDENTIFICACIONptSolicitud();
    }

    @JsonIgnore
    public PersonaOid getPersonaTCREARDOCIDENTIFICACIONpthisPersona() {
        return this.personaTCREARDOCIDENTIFICACIONpthisPersona;
    }
    
    public void setPersonaTCREARDOCIDENTIFICACIONpthisPersona(PersonaOid personaTCREARDOCIDENTIFICACIONpthisPersona) {
        this.personaTCREARDOCIDENTIFICACIONpthisPersona = personaTCREARDOCIDENTIFICACIONpthisPersona;
    }

    @JsonIgnore
    public Persona getPersonaTCREARDOCIDENTIFICACIONpthisPersonaInstance() {
        return this.personaTCREARDOCIDENTIFICACIONpthisPersonaInstance;
    }
    
    public void setPersonaTCREARDOCIDENTIFICACIONpthisPersonaInstance(Persona personaTCREARDOCIDENTIFICACIONpthisPersona) {
        this.personaTCREARDOCIDENTIFICACIONpthisPersonaInstance = personaTCREARDOCIDENTIFICACIONpthisPersona;
        this.personaTCREARDOCIDENTIFICACIONpthisPersona = personaTCREARDOCIDENTIFICACIONpthisPersona != null ? personaTCREARDOCIDENTIFICACIONpthisPersona.getOid() : null;
    }

    private void checkPersonaTCREARDOCIDENTIFICACIONpthisPersona() throws NotNullArgumentException {
        if(this.getPersonaTCREARDOCIDENTIFICACIONpthisPersonaInstance() == null || this.getPersonaTCREARDOCIDENTIFICACIONpthisPersonaInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TCREARDOCIDENTIFICACION, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TCREARDOCIDENTIFICACION_PERSONATCREARDOCIDENTIFICACIONPTHISPERSONA, PersonaConstants.SERV_ALIAS_TCREARDOCIDENTIFICACION, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TCREARDOCIDENTIFICACION_PERSONATCREARDOCIDENTIFICACIONPTHISPERSONA);
        }
    }

    @JsonIgnore
    public String getPersonaTCREARDOCIDENTIFICACIONptDatosDocumento() {
        return this.personaTCREARDOCIDENTIFICACIONptDatosDocumento;
    }
    
    public void setPersonaTCREARDOCIDENTIFICACIONptDatosDocumento(String personaTCREARDOCIDENTIFICACIONptDatosDocumento) {
        this.personaTCREARDOCIDENTIFICACIONptDatosDocumento = personaTCREARDOCIDENTIFICACIONptDatosDocumento;
    }

    @JsonIgnore
    public SolicitudOid getPersonaTCREARDOCIDENTIFICACIONptSolicitud() {
        return this.personaTCREARDOCIDENTIFICACIONptSolicitud;
    }
    
    public void setPersonaTCREARDOCIDENTIFICACIONptSolicitud(SolicitudOid personaTCREARDOCIDENTIFICACIONptSolicitud) {
        this.personaTCREARDOCIDENTIFICACIONptSolicitud = personaTCREARDOCIDENTIFICACIONptSolicitud;
    }

    @JsonIgnore
    public Solicitud getPersonaTCREARDOCIDENTIFICACIONptSolicitudInstance() {
        return this.personaTCREARDOCIDENTIFICACIONptSolicitudInstance;
    }
    
    public void setPersonaTCREARDOCIDENTIFICACIONptSolicitudInstance(Solicitud personaTCREARDOCIDENTIFICACIONptSolicitud) {
        this.personaTCREARDOCIDENTIFICACIONptSolicitudInstance = personaTCREARDOCIDENTIFICACIONptSolicitud;
        this.personaTCREARDOCIDENTIFICACIONptSolicitud = personaTCREARDOCIDENTIFICACIONptSolicitud != null ? personaTCREARDOCIDENTIFICACIONptSolicitud.getOid() : null;
    }

    private void checkPersonaTCREARDOCIDENTIFICACIONptSolicitud() throws NotNullArgumentException {
        if(this.getPersonaTCREARDOCIDENTIFICACIONptSolicitudInstance() == null || this.getPersonaTCREARDOCIDENTIFICACIONptSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TCREARDOCIDENTIFICACION, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TCREARDOCIDENTIFICACION_PERSONATCREARDOCIDENTIFICACIONPTSOLICITUD, PersonaConstants.SERV_ALIAS_TCREARDOCIDENTIFICACION, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TCREARDOCIDENTIFICACION_PERSONATCREARDOCIDENTIFICACIONPTSOLICITUD);
        }
    }
}
