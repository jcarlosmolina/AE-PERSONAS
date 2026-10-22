package com.keralty.aepersonas.viewmodel.solicitud.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Persona;
import com.keralty.aepersonas.persistence.Solicitud;

public class DelContratanteSolicitudRequest {

    @JsonProperty("p_thissolicitud_oid")
    private SolicitudOid solicitudDelContratanteSolicitudpthisSolicitud;
    
    @JsonIgnore
    private Solicitud solicitudDelContratanteSolicitudpthisSolicitudInstance;

    @JsonProperty("p_evcpersona_oid")
    private PersonaOid solicitudDelContratanteSolicitudpevcPersona;
    
    @JsonIgnore
    private Persona solicitudDelContratanteSolicitudpevcPersonaInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkSolicitudDelContratanteSolicitudpthisSolicitud();
        checkSolicitudDelContratanteSolicitudpevcPersona();
    }

    @JsonIgnore
    public SolicitudOid getSolicitudDelContratanteSolicitudpthisSolicitud() {
        return this.solicitudDelContratanteSolicitudpthisSolicitud;
    }
    
    public void setSolicitudDelContratanteSolicitudpthisSolicitud(SolicitudOid solicitudDelContratanteSolicitudpthisSolicitud) {
        this.solicitudDelContratanteSolicitudpthisSolicitud = solicitudDelContratanteSolicitudpthisSolicitud;
    }

    @JsonIgnore
    public Solicitud getSolicitudDelContratanteSolicitudpthisSolicitudInstance() {
        return this.solicitudDelContratanteSolicitudpthisSolicitudInstance;
    }
    
    public void setSolicitudDelContratanteSolicitudpthisSolicitudInstance(Solicitud solicitudDelContratanteSolicitudpthisSolicitud) {
        this.solicitudDelContratanteSolicitudpthisSolicitudInstance = solicitudDelContratanteSolicitudpthisSolicitud;
        this.solicitudDelContratanteSolicitudpthisSolicitud = solicitudDelContratanteSolicitudpthisSolicitud != null ? solicitudDelContratanteSolicitudpthisSolicitud.getOid() : null;
    }

    private void checkSolicitudDelContratanteSolicitudpthisSolicitud() throws NotNullArgumentException {
        if(this.getSolicitudDelContratanteSolicitudpthisSolicitudInstance() == null || this.getSolicitudDelContratanteSolicitudpthisSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_DELCONTRATANTESOLICITUD, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_DELCONTRATANTESOLICITUD_SOLICITUDDELCONTRATANTESOLICITUDPTHISSOLICITUD, SolicitudConstants.SERV_ALIAS_DELCONTRATANTESOLICITUD, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_DELCONTRATANTESOLICITUD_SOLICITUDDELCONTRATANTESOLICITUDPTHISSOLICITUD);
        }
    }

    @JsonIgnore
    public PersonaOid getSolicitudDelContratanteSolicitudpevcPersona() {
        return this.solicitudDelContratanteSolicitudpevcPersona;
    }
    
    public void setSolicitudDelContratanteSolicitudpevcPersona(PersonaOid solicitudDelContratanteSolicitudpevcPersona) {
        this.solicitudDelContratanteSolicitudpevcPersona = solicitudDelContratanteSolicitudpevcPersona;
    }

    @JsonIgnore
    public Persona getSolicitudDelContratanteSolicitudpevcPersonaInstance() {
        return this.solicitudDelContratanteSolicitudpevcPersonaInstance;
    }
    
    public void setSolicitudDelContratanteSolicitudpevcPersonaInstance(Persona solicitudDelContratanteSolicitudpevcPersona) {
        this.solicitudDelContratanteSolicitudpevcPersonaInstance = solicitudDelContratanteSolicitudpevcPersona;
        this.solicitudDelContratanteSolicitudpevcPersona = solicitudDelContratanteSolicitudpevcPersona != null ? solicitudDelContratanteSolicitudpevcPersona.getOid() : null;
    }

    private void checkSolicitudDelContratanteSolicitudpevcPersona() throws NotNullArgumentException {
        if(this.getSolicitudDelContratanteSolicitudpevcPersonaInstance() == null || this.getSolicitudDelContratanteSolicitudpevcPersonaInstance().isNull()) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_DELCONTRATANTESOLICITUD, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_DELCONTRATANTESOLICITUD_SOLICITUDDELCONTRATANTESOLICITUDPEVCPERSONA, SolicitudConstants.SERV_ALIAS_DELCONTRATANTESOLICITUD, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_DELCONTRATANTESOLICITUD_SOLICITUDDELCONTRATANTESOLICITUDPEVCPERSONA);
        }
    }
}
