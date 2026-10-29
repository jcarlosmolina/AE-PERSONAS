package com.keralty.aepersonas.viewmodel.solicitud.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Persona;
import com.keralty.aepersonas.persistence.Solicitud;

public class InsTitularSolicitudRequest {

    @JsonProperty("p_thissolicitud_oid")
    private SolicitudOid solicitudInsTitularSolicitudpthisSolicitud;
    
    @JsonIgnore
    private Solicitud solicitudInsTitularSolicitudpthisSolicitudInstance;

    @JsonProperty("p_evcpersona_oid")
    private PersonaOid solicitudInsTitularSolicitudpevcPersona;
    
    @JsonIgnore
    private Persona solicitudInsTitularSolicitudpevcPersonaInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkSolicitudInsTitularSolicitudpthisSolicitud();
        checkSolicitudInsTitularSolicitudpevcPersona();
    }

    @JsonIgnore
    public SolicitudOid getSolicitudInsTitularSolicitudpthisSolicitud() {
        return this.solicitudInsTitularSolicitudpthisSolicitud;
    }
    
    public void setSolicitudInsTitularSolicitudpthisSolicitud(SolicitudOid solicitudInsTitularSolicitudpthisSolicitud) {
        this.solicitudInsTitularSolicitudpthisSolicitud = solicitudInsTitularSolicitudpthisSolicitud;
    }

    @JsonIgnore
    public Solicitud getSolicitudInsTitularSolicitudpthisSolicitudInstance() {
        return this.solicitudInsTitularSolicitudpthisSolicitudInstance;
    }
    
    public void setSolicitudInsTitularSolicitudpthisSolicitudInstance(Solicitud solicitudInsTitularSolicitudpthisSolicitud) {
        this.solicitudInsTitularSolicitudpthisSolicitudInstance = solicitudInsTitularSolicitudpthisSolicitud;
        this.solicitudInsTitularSolicitudpthisSolicitud = solicitudInsTitularSolicitudpthisSolicitud != null ? solicitudInsTitularSolicitudpthisSolicitud.getOid() : null;
    }

    private void checkSolicitudInsTitularSolicitudpthisSolicitud() throws NotNullArgumentException {
        if(this.getSolicitudInsTitularSolicitudpthisSolicitudInstance() == null || this.getSolicitudInsTitularSolicitudpthisSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_INSTITULARSOLICITUD, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_INSTITULARSOLICITUD_SOLICITUDINSTITULARSOLICITUDPTHISSOLICITUD, SolicitudConstants.SERV_ALIAS_INSTITULARSOLICITUD, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_INSTITULARSOLICITUD_SOLICITUDINSTITULARSOLICITUDPTHISSOLICITUD);
        }
    }

    @JsonIgnore
    public PersonaOid getSolicitudInsTitularSolicitudpevcPersona() {
        return this.solicitudInsTitularSolicitudpevcPersona;
    }
    
    public void setSolicitudInsTitularSolicitudpevcPersona(PersonaOid solicitudInsTitularSolicitudpevcPersona) {
        this.solicitudInsTitularSolicitudpevcPersona = solicitudInsTitularSolicitudpevcPersona;
    }

    @JsonIgnore
    public Persona getSolicitudInsTitularSolicitudpevcPersonaInstance() {
        return this.solicitudInsTitularSolicitudpevcPersonaInstance;
    }
    
    public void setSolicitudInsTitularSolicitudpevcPersonaInstance(Persona solicitudInsTitularSolicitudpevcPersona) {
        this.solicitudInsTitularSolicitudpevcPersonaInstance = solicitudInsTitularSolicitudpevcPersona;
        this.solicitudInsTitularSolicitudpevcPersona = solicitudInsTitularSolicitudpevcPersona != null ? solicitudInsTitularSolicitudpevcPersona.getOid() : null;
    }

    private void checkSolicitudInsTitularSolicitudpevcPersona() throws NotNullArgumentException {
        if(this.getSolicitudInsTitularSolicitudpevcPersonaInstance() == null || this.getSolicitudInsTitularSolicitudpevcPersonaInstance().isNull()) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_INSTITULARSOLICITUD, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_INSTITULARSOLICITUD_SOLICITUDINSTITULARSOLICITUDPEVCPERSONA, SolicitudConstants.SERV_ALIAS_INSTITULARSOLICITUD, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_INSTITULARSOLICITUD_SOLICITUDINSTITULARSOLICITUDPEVCPERSONA);
        }
    }
}
