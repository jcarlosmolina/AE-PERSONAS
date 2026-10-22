package com.keralty.aepersonas.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.GlobalServiceConstants;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Solicitud;

public class TGSELECCONTRATOASOCTITRequest {

    @JsonProperty("pt_p_solicitud_oid")
    private SolicitudOid tGSELECCONTRATOASOCTITptpSolicitud;
    
    @JsonIgnore
    private Solicitud tGSELECCONTRATOASOCTITptpSolicitudInstance;

    @JsonProperty("ptnumcontrato")
    private String tGSELECCONTRATOASOCTITptNumContrato;

    @JsonProperty("ptcodlegalproducto")
    private String tGSELECCONTRATOASOCTITptCodLegalProducto;

    @JsonProperty("ptcodlegalplan")
    private String tGSELECCONTRATOASOCTITptCodLegalPlan;

    @JsonProperty("ptnumfamilia")
    private String tGSELECCONTRATOASOCTITptNumFamilia;

    @JsonProperty("preconditionId")
    private String preconditionId;

    public void checkArguments() throws NotNullArgumentException {
        checkTGSELECCONTRATOASOCTITptpSolicitud();
    }

    @JsonIgnore
    public SolicitudOid getTGSELECCONTRATOASOCTITptpSolicitud() {
        return this.tGSELECCONTRATOASOCTITptpSolicitud;
    }
    
    public void setTGSELECCONTRATOASOCTITptpSolicitud(SolicitudOid tGSELECCONTRATOASOCTITptpSolicitud) {
        this.tGSELECCONTRATOASOCTITptpSolicitud = tGSELECCONTRATOASOCTITptpSolicitud;
    }

    @JsonIgnore
    public Solicitud getTGSELECCONTRATOASOCTITptpSolicitudInstance() {
        return this.tGSELECCONTRATOASOCTITptpSolicitudInstance;
    }
    
    public void setTGSELECCONTRATOASOCTITptpSolicitudInstance(Solicitud tGSELECCONTRATOASOCTITptpSolicitud) {
        this.tGSELECCONTRATOASOCTITptpSolicitudInstance = tGSELECCONTRATOASOCTITptpSolicitud;
        this.tGSELECCONTRATOASOCTITptpSolicitud = tGSELECCONTRATOASOCTITptpSolicitud != null ? tGSELECCONTRATOASOCTITptpSolicitud.getOid() : null;
    }

    private void checkTGSELECCONTRATOASOCTITptpSolicitud() throws NotNullArgumentException {
        if(this.getTGSELECCONTRATOASOCTITptpSolicitudInstance() == null || this.getTGSELECCONTRATOASOCTITptpSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGSELECCONTRATOASOCTIT, GlobalServiceConstants.GS_ARG_ID_TGSELECCONTRATOASOCTIT_TGSELECCONTRATOASOCTITPTPSOLICITUD, GlobalServiceConstants.G_SERV_ALIAS_TGSELECCONTRATOASOCTIT, GlobalServiceConstants.GS_ARG_ALIAS_TGSELECCONTRATOASOCTIT_TGSELECCONTRATOASOCTITPTPSOLICITUD);
        }
    }

    @JsonIgnore
    public String getTGSELECCONTRATOASOCTITptNumContrato() {
        return this.tGSELECCONTRATOASOCTITptNumContrato;
    }
    
    public void setTGSELECCONTRATOASOCTITptNumContrato(String tGSELECCONTRATOASOCTITptNumContrato) {
        this.tGSELECCONTRATOASOCTITptNumContrato = tGSELECCONTRATOASOCTITptNumContrato;
    }

    @JsonIgnore
    public String getTGSELECCONTRATOASOCTITptCodLegalProducto() {
        return this.tGSELECCONTRATOASOCTITptCodLegalProducto;
    }
    
    public void setTGSELECCONTRATOASOCTITptCodLegalProducto(String tGSELECCONTRATOASOCTITptCodLegalProducto) {
        this.tGSELECCONTRATOASOCTITptCodLegalProducto = tGSELECCONTRATOASOCTITptCodLegalProducto;
    }

    @JsonIgnore
    public String getTGSELECCONTRATOASOCTITptCodLegalPlan() {
        return this.tGSELECCONTRATOASOCTITptCodLegalPlan;
    }
    
    public void setTGSELECCONTRATOASOCTITptCodLegalPlan(String tGSELECCONTRATOASOCTITptCodLegalPlan) {
        this.tGSELECCONTRATOASOCTITptCodLegalPlan = tGSELECCONTRATOASOCTITptCodLegalPlan;
    }

    @JsonIgnore
    public String getTGSELECCONTRATOASOCTITptNumFamilia() {
        return this.tGSELECCONTRATOASOCTITptNumFamilia;
    }
    
    public void setTGSELECCONTRATOASOCTITptNumFamilia(String tGSELECCONTRATOASOCTITptNumFamilia) {
        this.tGSELECCONTRATOASOCTITptNumFamilia = tGSELECCONTRATOASOCTITptNumFamilia;
    }

    @JsonIgnore
    public String getPreconditionId() {
        return this.preconditionId;
    }
    
    public void setPreconditionId(String preconditionId) {
        this.preconditionId = preconditionId;
    }
}
