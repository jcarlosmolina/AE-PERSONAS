package com.keralty.aepersonas.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.GlobalServiceConstants;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Solicitud;

public class TGSELECCONTRATOASOCRequest {

    @JsonProperty("p_solicitud_oid")
    private SolicitudOid tGSELECCONTRATOASOCpSolicitud;
    
    @JsonIgnore
    private Solicitud tGSELECCONTRATOASOCpSolicitudInstance;

    @JsonProperty("ptnumcontrato")
    private String tGSELECCONTRATOASOCptNumContrato;

    @JsonProperty("ptcodlegalproducto")
    private String tGSELECCONTRATOASOCptCodLegalProducto;

    @JsonProperty("ptcodlegalplan")
    private String tGSELECCONTRATOASOCptCodLegalPlan;

    @JsonProperty("ptnumfamilia")
    private String tGSELECCONTRATOASOCptNumFamilia;

    @JsonProperty("preconditionId")
    private String preconditionId;

    public void checkArguments() throws NotNullArgumentException {
        checkTGSELECCONTRATOASOCpSolicitud();
        checkTGSELECCONTRATOASOCptNumContrato();
        checkTGSELECCONTRATOASOCptCodLegalProducto();
        checkTGSELECCONTRATOASOCptCodLegalPlan();
        checkTGSELECCONTRATOASOCptNumFamilia();
    }

    @JsonIgnore
    public SolicitudOid getTGSELECCONTRATOASOCpSolicitud() {
        return this.tGSELECCONTRATOASOCpSolicitud;
    }
    
    public void setTGSELECCONTRATOASOCpSolicitud(SolicitudOid tGSELECCONTRATOASOCpSolicitud) {
        this.tGSELECCONTRATOASOCpSolicitud = tGSELECCONTRATOASOCpSolicitud;
    }

    @JsonIgnore
    public Solicitud getTGSELECCONTRATOASOCpSolicitudInstance() {
        return this.tGSELECCONTRATOASOCpSolicitudInstance;
    }
    
    public void setTGSELECCONTRATOASOCpSolicitudInstance(Solicitud tGSELECCONTRATOASOCpSolicitud) {
        this.tGSELECCONTRATOASOCpSolicitudInstance = tGSELECCONTRATOASOCpSolicitud;
        this.tGSELECCONTRATOASOCpSolicitud = tGSELECCONTRATOASOCpSolicitud != null ? tGSELECCONTRATOASOCpSolicitud.getOid() : null;
    }

    private void checkTGSELECCONTRATOASOCpSolicitud() throws NotNullArgumentException {
        if(this.getTGSELECCONTRATOASOCpSolicitudInstance() == null || this.getTGSELECCONTRATOASOCpSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGSELECCONTRATOASOC, GlobalServiceConstants.GS_ARG_ID_TGSELECCONTRATOASOC_TGSELECCONTRATOASOCPSOLICITUD, GlobalServiceConstants.G_SERV_ALIAS_TGSELECCONTRATOASOC, GlobalServiceConstants.GS_ARG_ALIAS_TGSELECCONTRATOASOC_TGSELECCONTRATOASOCPSOLICITUD);
        }
    }

    @JsonIgnore
    public String getTGSELECCONTRATOASOCptNumContrato() {
        return this.tGSELECCONTRATOASOCptNumContrato;
    }
    
    public void setTGSELECCONTRATOASOCptNumContrato(String tGSELECCONTRATOASOCptNumContrato) {
        this.tGSELECCONTRATOASOCptNumContrato = tGSELECCONTRATOASOCptNumContrato;
    }

    private void checkTGSELECCONTRATOASOCptNumContrato() throws NotNullArgumentException {
        if(this.getTGSELECCONTRATOASOCptNumContrato() == null) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGSELECCONTRATOASOC, GlobalServiceConstants.GS_ARG_ID_TGSELECCONTRATOASOC_TGSELECCONTRATOASOCPTNUMCONTRATO, GlobalServiceConstants.G_SERV_ALIAS_TGSELECCONTRATOASOC, GlobalServiceConstants.GS_ARG_ALIAS_TGSELECCONTRATOASOC_TGSELECCONTRATOASOCPTNUMCONTRATO);
        }
    }

    @JsonIgnore
    public String getTGSELECCONTRATOASOCptCodLegalProducto() {
        return this.tGSELECCONTRATOASOCptCodLegalProducto;
    }
    
    public void setTGSELECCONTRATOASOCptCodLegalProducto(String tGSELECCONTRATOASOCptCodLegalProducto) {
        this.tGSELECCONTRATOASOCptCodLegalProducto = tGSELECCONTRATOASOCptCodLegalProducto;
    }

    private void checkTGSELECCONTRATOASOCptCodLegalProducto() throws NotNullArgumentException {
        if(this.getTGSELECCONTRATOASOCptCodLegalProducto() == null) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGSELECCONTRATOASOC, GlobalServiceConstants.GS_ARG_ID_TGSELECCONTRATOASOC_TGSELECCONTRATOASOCPTCODLEGALPRODUCTO, GlobalServiceConstants.G_SERV_ALIAS_TGSELECCONTRATOASOC, GlobalServiceConstants.GS_ARG_ALIAS_TGSELECCONTRATOASOC_TGSELECCONTRATOASOCPTCODLEGALPRODUCTO);
        }
    }

    @JsonIgnore
    public String getTGSELECCONTRATOASOCptCodLegalPlan() {
        return this.tGSELECCONTRATOASOCptCodLegalPlan;
    }
    
    public void setTGSELECCONTRATOASOCptCodLegalPlan(String tGSELECCONTRATOASOCptCodLegalPlan) {
        this.tGSELECCONTRATOASOCptCodLegalPlan = tGSELECCONTRATOASOCptCodLegalPlan;
    }

    private void checkTGSELECCONTRATOASOCptCodLegalPlan() throws NotNullArgumentException {
        if(this.getTGSELECCONTRATOASOCptCodLegalPlan() == null) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGSELECCONTRATOASOC, GlobalServiceConstants.GS_ARG_ID_TGSELECCONTRATOASOC_TGSELECCONTRATOASOCPTCODLEGALPLAN, GlobalServiceConstants.G_SERV_ALIAS_TGSELECCONTRATOASOC, GlobalServiceConstants.GS_ARG_ALIAS_TGSELECCONTRATOASOC_TGSELECCONTRATOASOCPTCODLEGALPLAN);
        }
    }

    @JsonIgnore
    public String getTGSELECCONTRATOASOCptNumFamilia() {
        return this.tGSELECCONTRATOASOCptNumFamilia;
    }
    
    public void setTGSELECCONTRATOASOCptNumFamilia(String tGSELECCONTRATOASOCptNumFamilia) {
        this.tGSELECCONTRATOASOCptNumFamilia = tGSELECCONTRATOASOCptNumFamilia;
    }

    private void checkTGSELECCONTRATOASOCptNumFamilia() throws NotNullArgumentException {
        if(this.getTGSELECCONTRATOASOCptNumFamilia() == null) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGSELECCONTRATOASOC, GlobalServiceConstants.GS_ARG_ID_TGSELECCONTRATOASOC_TGSELECCONTRATOASOCPTNUMFAMILIA, GlobalServiceConstants.G_SERV_ALIAS_TGSELECCONTRATOASOC, GlobalServiceConstants.GS_ARG_ALIAS_TGSELECCONTRATOASOC_TGSELECCONTRATOASOCPTNUMFAMILIA);
        }
    }

    @JsonIgnore
    public String getPreconditionId() {
        return this.preconditionId;
    }
    
    public void setPreconditionId(String preconditionId) {
        this.preconditionId = preconditionId;
    }
}
