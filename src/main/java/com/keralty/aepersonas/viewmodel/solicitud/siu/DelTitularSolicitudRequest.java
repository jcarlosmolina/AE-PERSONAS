package com.keralty.aepersonas.viewmodel.solicitud.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Persona;
import com.keralty.aepersonas.persistence.Solicitud;

public class DelTitularSolicitudRequest {

    @JsonProperty("p_thissolicitud_oid")
    private SolicitudOid solicitudDelTitularSolicitudpthisSolicitud;
    
    @JsonIgnore
    private Solicitud solicitudDelTitularSolicitudpthisSolicitudInstance;

    @JsonProperty("p_evcpersona_oid")
    private PersonaOid solicitudDelTitularSolicitudpevcPersona;
    
    @JsonIgnore
    private Persona solicitudDelTitularSolicitudpevcPersonaInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkSolicitudDelTitularSolicitudpthisSolicitud();
        checkSolicitudDelTitularSolicitudpevcPersona();
    }

    @JsonIgnore
    public SolicitudOid getSolicitudDelTitularSolicitudpthisSolicitud() {
        return this.solicitudDelTitularSolicitudpthisSolicitud;
    }
    
    public void setSolicitudDelTitularSolicitudpthisSolicitud(SolicitudOid solicitudDelTitularSolicitudpthisSolicitud) {
        this.solicitudDelTitularSolicitudpthisSolicitud = solicitudDelTitularSolicitudpthisSolicitud;
    }

    @JsonIgnore
    public Solicitud getSolicitudDelTitularSolicitudpthisSolicitudInstance() {
        return this.solicitudDelTitularSolicitudpthisSolicitudInstance;
    }
    
    public void setSolicitudDelTitularSolicitudpthisSolicitudInstance(Solicitud solicitudDelTitularSolicitudpthisSolicitud) {
        this.solicitudDelTitularSolicitudpthisSolicitudInstance = solicitudDelTitularSolicitudpthisSolicitud;
        this.solicitudDelTitularSolicitudpthisSolicitud = solicitudDelTitularSolicitudpthisSolicitud != null ? solicitudDelTitularSolicitudpthisSolicitud.getOid() : null;
    }

    private void checkSolicitudDelTitularSolicitudpthisSolicitud() throws NotNullArgumentException {
        if(this.getSolicitudDelTitularSolicitudpthisSolicitudInstance() == null || this.getSolicitudDelTitularSolicitudpthisSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_DELTITULARSOLICITUD, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_DELTITULARSOLICITUD_SOLICITUDDELTITULARSOLICITUDPTHISSOLICITUD, SolicitudConstants.SERV_ALIAS_DELTITULARSOLICITUD, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_DELTITULARSOLICITUD_SOLICITUDDELTITULARSOLICITUDPTHISSOLICITUD);
        }
    }

    @JsonIgnore
    public PersonaOid getSolicitudDelTitularSolicitudpevcPersona() {
        return this.solicitudDelTitularSolicitudpevcPersona;
    }
    
    public void setSolicitudDelTitularSolicitudpevcPersona(PersonaOid solicitudDelTitularSolicitudpevcPersona) {
        this.solicitudDelTitularSolicitudpevcPersona = solicitudDelTitularSolicitudpevcPersona;
    }

    @JsonIgnore
    public Persona getSolicitudDelTitularSolicitudpevcPersonaInstance() {
        return this.solicitudDelTitularSolicitudpevcPersonaInstance;
    }
    
    public void setSolicitudDelTitularSolicitudpevcPersonaInstance(Persona solicitudDelTitularSolicitudpevcPersona) {
        this.solicitudDelTitularSolicitudpevcPersonaInstance = solicitudDelTitularSolicitudpevcPersona;
        this.solicitudDelTitularSolicitudpevcPersona = solicitudDelTitularSolicitudpevcPersona != null ? solicitudDelTitularSolicitudpevcPersona.getOid() : null;
    }

    private void checkSolicitudDelTitularSolicitudpevcPersona() throws NotNullArgumentException {
        if(this.getSolicitudDelTitularSolicitudpevcPersonaInstance() == null || this.getSolicitudDelTitularSolicitudpevcPersonaInstance().isNull()) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_DELTITULARSOLICITUD, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_DELTITULARSOLICITUD_SOLICITUDDELTITULARSOLICITUDPEVCPERSONA, SolicitudConstants.SERV_ALIAS_DELTITULARSOLICITUD, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_DELTITULARSOLICITUD_SOLICITUDDELTITULARSOLICITUDPEVCPERSONA);
        }
    }
}
