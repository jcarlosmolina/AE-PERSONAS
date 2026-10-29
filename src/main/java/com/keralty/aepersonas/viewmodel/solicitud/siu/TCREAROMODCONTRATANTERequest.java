package com.keralty.aepersonas.viewmodel.solicitud.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Persona;
import com.keralty.aepersonas.persistence.Solicitud;

public class TCREAROMODCONTRATANTERequest {

    @JsonProperty("p_thissolicitud_oid")
    private SolicitudOid solicitudTCREAROMODCONTRATANTEpthisSolicitud;
    
    @JsonIgnore
    private Solicitud solicitudTCREAROMODCONTRATANTEpthisSolicitudInstance;

    @JsonProperty("ptpersonacontratante_oid")
    private PersonaOid solicitudTCREAROMODCONTRATANTEptPersonaContratante;
    
    @JsonIgnore
    private Persona solicitudTCREAROMODCONTRATANTEptPersonaContratanteInstance;

    @JsonProperty("pt_dctelefonofijo")
    private String solicitudTCREAROMODCONTRATANTEptDCTelefonoFijo;

    @JsonProperty("pt_dctelefonocelular")
    private String solicitudTCREAROMODCONTRATANTEptDCTelefonoCelular;

    @JsonProperty("pttitularconbeneficioscore")
    private Boolean solicitudTCREAROMODCONTRATANTEptTitularConBeneficiosCORE;

    public void checkArguments() throws NotNullArgumentException {
        checkSolicitudTCREAROMODCONTRATANTEpthisSolicitud();
        checkSolicitudTCREAROMODCONTRATANTEptPersonaContratante();
        checkSolicitudTCREAROMODCONTRATANTEptTitularConBeneficiosCORE();
    }

    @JsonIgnore
    public SolicitudOid getSolicitudTCREAROMODCONTRATANTEpthisSolicitud() {
        return this.solicitudTCREAROMODCONTRATANTEpthisSolicitud;
    }
    
    public void setSolicitudTCREAROMODCONTRATANTEpthisSolicitud(SolicitudOid solicitudTCREAROMODCONTRATANTEpthisSolicitud) {
        this.solicitudTCREAROMODCONTRATANTEpthisSolicitud = solicitudTCREAROMODCONTRATANTEpthisSolicitud;
    }

    @JsonIgnore
    public Solicitud getSolicitudTCREAROMODCONTRATANTEpthisSolicitudInstance() {
        return this.solicitudTCREAROMODCONTRATANTEpthisSolicitudInstance;
    }
    
    public void setSolicitudTCREAROMODCONTRATANTEpthisSolicitudInstance(Solicitud solicitudTCREAROMODCONTRATANTEpthisSolicitud) {
        this.solicitudTCREAROMODCONTRATANTEpthisSolicitudInstance = solicitudTCREAROMODCONTRATANTEpthisSolicitud;
        this.solicitudTCREAROMODCONTRATANTEpthisSolicitud = solicitudTCREAROMODCONTRATANTEpthisSolicitud != null ? solicitudTCREAROMODCONTRATANTEpthisSolicitud.getOid() : null;
    }

    private void checkSolicitudTCREAROMODCONTRATANTEpthisSolicitud() throws NotNullArgumentException {
        if(this.getSolicitudTCREAROMODCONTRATANTEpthisSolicitudInstance() == null || this.getSolicitudTCREAROMODCONTRATANTEpthisSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_TCREAROMODCONTRATANTE, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_TCREAROMODCONTRATANTE_SOLICITUDTCREAROMODCONTRATANTEPTHISSOLICITUD, SolicitudConstants.SERV_ALIAS_TCREAROMODCONTRATANTE, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_TCREAROMODCONTRATANTE_SOLICITUDTCREAROMODCONTRATANTEPTHISSOLICITUD);
        }
    }

    @JsonIgnore
    public PersonaOid getSolicitudTCREAROMODCONTRATANTEptPersonaContratante() {
        return this.solicitudTCREAROMODCONTRATANTEptPersonaContratante;
    }
    
    public void setSolicitudTCREAROMODCONTRATANTEptPersonaContratante(PersonaOid solicitudTCREAROMODCONTRATANTEptPersonaContratante) {
        this.solicitudTCREAROMODCONTRATANTEptPersonaContratante = solicitudTCREAROMODCONTRATANTEptPersonaContratante;
    }

    @JsonIgnore
    public Persona getSolicitudTCREAROMODCONTRATANTEptPersonaContratanteInstance() {
        return this.solicitudTCREAROMODCONTRATANTEptPersonaContratanteInstance;
    }
    
    public void setSolicitudTCREAROMODCONTRATANTEptPersonaContratanteInstance(Persona solicitudTCREAROMODCONTRATANTEptPersonaContratante) {
        this.solicitudTCREAROMODCONTRATANTEptPersonaContratanteInstance = solicitudTCREAROMODCONTRATANTEptPersonaContratante;
        this.solicitudTCREAROMODCONTRATANTEptPersonaContratante = solicitudTCREAROMODCONTRATANTEptPersonaContratante != null ? solicitudTCREAROMODCONTRATANTEptPersonaContratante.getOid() : null;
    }

    private void checkSolicitudTCREAROMODCONTRATANTEptPersonaContratante() throws NotNullArgumentException {
        if(this.getSolicitudTCREAROMODCONTRATANTEptPersonaContratanteInstance() == null || this.getSolicitudTCREAROMODCONTRATANTEptPersonaContratanteInstance().isNull()) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_TCREAROMODCONTRATANTE, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_TCREAROMODCONTRATANTE_SOLICITUDTCREAROMODCONTRATANTEPTPERSONACONTRATANTE, SolicitudConstants.SERV_ALIAS_TCREAROMODCONTRATANTE, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_TCREAROMODCONTRATANTE_SOLICITUDTCREAROMODCONTRATANTEPTPERSONACONTRATANTE);
        }
    }

    @JsonIgnore
    public String getSolicitudTCREAROMODCONTRATANTEptDCTelefonoFijo() {
        return this.solicitudTCREAROMODCONTRATANTEptDCTelefonoFijo;
    }
    
    public void setSolicitudTCREAROMODCONTRATANTEptDCTelefonoFijo(String solicitudTCREAROMODCONTRATANTEptDCTelefonoFijo) {
        this.solicitudTCREAROMODCONTRATANTEptDCTelefonoFijo = solicitudTCREAROMODCONTRATANTEptDCTelefonoFijo;
    }

    @JsonIgnore
    public String getSolicitudTCREAROMODCONTRATANTEptDCTelefonoCelular() {
        return this.solicitudTCREAROMODCONTRATANTEptDCTelefonoCelular;
    }
    
    public void setSolicitudTCREAROMODCONTRATANTEptDCTelefonoCelular(String solicitudTCREAROMODCONTRATANTEptDCTelefonoCelular) {
        this.solicitudTCREAROMODCONTRATANTEptDCTelefonoCelular = solicitudTCREAROMODCONTRATANTEptDCTelefonoCelular;
    }

    @JsonIgnore
    public Boolean getSolicitudTCREAROMODCONTRATANTEptTitularConBeneficiosCORE() {
        return this.solicitudTCREAROMODCONTRATANTEptTitularConBeneficiosCORE;
    }
    
    public void setSolicitudTCREAROMODCONTRATANTEptTitularConBeneficiosCORE(Boolean solicitudTCREAROMODCONTRATANTEptTitularConBeneficiosCORE) {
        this.solicitudTCREAROMODCONTRATANTEptTitularConBeneficiosCORE = solicitudTCREAROMODCONTRATANTEptTitularConBeneficiosCORE;
    }

    private void checkSolicitudTCREAROMODCONTRATANTEptTitularConBeneficiosCORE() throws NotNullArgumentException {
        if(this.getSolicitudTCREAROMODCONTRATANTEptTitularConBeneficiosCORE() == null) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_TCREAROMODCONTRATANTE, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_TCREAROMODCONTRATANTE_SOLICITUDTCREAROMODCONTRATANTEPTTITULARCONBENEFICIOSCORE, SolicitudConstants.SERV_ALIAS_TCREAROMODCONTRATANTE, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_TCREAROMODCONTRATANTE_SOLICITUDTCREAROMODCONTRATANTEPTTITULARCONBENEFICIOSCORE);
        }
    }
}
