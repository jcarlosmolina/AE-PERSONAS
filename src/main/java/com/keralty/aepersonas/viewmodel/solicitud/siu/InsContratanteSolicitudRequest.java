package com.keralty.aepersonas.viewmodel.solicitud.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Persona;
import com.keralty.aepersonas.persistence.Solicitud;

public class InsContratanteSolicitudRequest {

    @JsonProperty("p_thissolicitud_oid")
    private SolicitudOid solicitudInsContratanteSolicitudpthisSolicitud;
    
    @JsonIgnore
    private Solicitud solicitudInsContratanteSolicitudpthisSolicitudInstance;

    @JsonProperty("p_evcpersona_oid")
    private PersonaOid solicitudInsContratanteSolicitudpevcPersona;
    
    @JsonIgnore
    private Persona solicitudInsContratanteSolicitudpevcPersonaInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkSolicitudInsContratanteSolicitudpthisSolicitud();
        checkSolicitudInsContratanteSolicitudpevcPersona();
    }

    @JsonIgnore
    public SolicitudOid getSolicitudInsContratanteSolicitudpthisSolicitud() {
        return this.solicitudInsContratanteSolicitudpthisSolicitud;
    }
    
    public void setSolicitudInsContratanteSolicitudpthisSolicitud(SolicitudOid solicitudInsContratanteSolicitudpthisSolicitud) {
        this.solicitudInsContratanteSolicitudpthisSolicitud = solicitudInsContratanteSolicitudpthisSolicitud;
    }

    @JsonIgnore
    public Solicitud getSolicitudInsContratanteSolicitudpthisSolicitudInstance() {
        return this.solicitudInsContratanteSolicitudpthisSolicitudInstance;
    }
    
    public void setSolicitudInsContratanteSolicitudpthisSolicitudInstance(Solicitud solicitudInsContratanteSolicitudpthisSolicitud) {
        this.solicitudInsContratanteSolicitudpthisSolicitudInstance = solicitudInsContratanteSolicitudpthisSolicitud;
        this.solicitudInsContratanteSolicitudpthisSolicitud = solicitudInsContratanteSolicitudpthisSolicitud != null ? solicitudInsContratanteSolicitudpthisSolicitud.getOid() : null;
    }

    private void checkSolicitudInsContratanteSolicitudpthisSolicitud() throws NotNullArgumentException {
        if(this.getSolicitudInsContratanteSolicitudpthisSolicitudInstance() == null || this.getSolicitudInsContratanteSolicitudpthisSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_INSCONTRATANTESOLICITUD, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_INSCONTRATANTESOLICITUD_SOLICITUDINSCONTRATANTESOLICITUDPTHISSOLICITUD, SolicitudConstants.SERV_ALIAS_INSCONTRATANTESOLICITUD, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_INSCONTRATANTESOLICITUD_SOLICITUDINSCONTRATANTESOLICITUDPTHISSOLICITUD);
        }
    }

    @JsonIgnore
    public PersonaOid getSolicitudInsContratanteSolicitudpevcPersona() {
        return this.solicitudInsContratanteSolicitudpevcPersona;
    }
    
    public void setSolicitudInsContratanteSolicitudpevcPersona(PersonaOid solicitudInsContratanteSolicitudpevcPersona) {
        this.solicitudInsContratanteSolicitudpevcPersona = solicitudInsContratanteSolicitudpevcPersona;
    }

    @JsonIgnore
    public Persona getSolicitudInsContratanteSolicitudpevcPersonaInstance() {
        return this.solicitudInsContratanteSolicitudpevcPersonaInstance;
    }
    
    public void setSolicitudInsContratanteSolicitudpevcPersonaInstance(Persona solicitudInsContratanteSolicitudpevcPersona) {
        this.solicitudInsContratanteSolicitudpevcPersonaInstance = solicitudInsContratanteSolicitudpevcPersona;
        this.solicitudInsContratanteSolicitudpevcPersona = solicitudInsContratanteSolicitudpevcPersona != null ? solicitudInsContratanteSolicitudpevcPersona.getOid() : null;
    }

    private void checkSolicitudInsContratanteSolicitudpevcPersona() throws NotNullArgumentException {
        if(this.getSolicitudInsContratanteSolicitudpevcPersonaInstance() == null || this.getSolicitudInsContratanteSolicitudpevcPersonaInstance().isNull()) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_INSCONTRATANTESOLICITUD, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_INSCONTRATANTESOLICITUD_SOLICITUDINSCONTRATANTESOLICITUDPEVCPERSONA, SolicitudConstants.SERV_ALIAS_INSCONTRATANTESOLICITUD, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_INSCONTRATANTESOLICITUD_SOLICITUDINSCONTRATANTESOLICITUDPEVCPERSONA);
        }
    }
}
