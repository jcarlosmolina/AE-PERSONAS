package com.keralty.aepersonas.viewmodel.contratante.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.ContratanteConstants;
import com.keralty.aepersonas.persistence.Contratante;
import com.keralty.aepersonas.persistence.oid.ContratanteOid;

public class SetDireccionResRequest {

    @JsonProperty("p_thiscontratante_oid")
    private ContratanteOid contratantesetDireccionRespthisContratante;
    
    @JsonIgnore
    private Contratante contratantesetDireccionRespthisContratanteInstance;

    @JsonProperty("ptdireccionres")
    private String contratantesetDireccionResptDireccionRes;

    @JsonProperty("pt_rural")
    private Boolean contratantesetDireccionResptRural;

    public void checkArguments() throws NotNullArgumentException {
        checkContratantesetDireccionRespthisContratante();
        checkContratantesetDireccionResptRural();
    }

    @JsonIgnore
    public ContratanteOid getContratantesetDireccionRespthisContratante() {
        return this.contratantesetDireccionRespthisContratante;
    }
    
    public void setContratantesetDireccionRespthisContratante(ContratanteOid contratantesetDireccionRespthisContratante) {
        this.contratantesetDireccionRespthisContratante = contratantesetDireccionRespthisContratante;
    }

    @JsonIgnore
    public Contratante getContratantesetDireccionRespthisContratanteInstance() {
        return this.contratantesetDireccionRespthisContratanteInstance;
    }
    
    public void setContratantesetDireccionRespthisContratanteInstance(Contratante contratantesetDireccionRespthisContratante) {
        this.contratantesetDireccionRespthisContratanteInstance = contratantesetDireccionRespthisContratante;
        this.contratantesetDireccionRespthisContratante = contratantesetDireccionRespthisContratante != null ? contratantesetDireccionRespthisContratante.getOid() : null;
    }

    private void checkContratantesetDireccionRespthisContratante() throws NotNullArgumentException {
        if(this.getContratantesetDireccionRespthisContratanteInstance() == null || this.getContratantesetDireccionRespthisContratanteInstance().isNull()) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_SETDIRECCIONRES, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_SETDIRECCIONRES_CONTRATANTESETDIRECCIONRESPTHISCONTRATANTE, ContratanteConstants.SERV_ALIAS_SETDIRECCIONRES, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_SETDIRECCIONRES_CONTRATANTESETDIRECCIONRESPTHISCONTRATANTE);
        }
    }

    @JsonIgnore
    public String getContratantesetDireccionResptDireccionRes() {
        return this.contratantesetDireccionResptDireccionRes;
    }
    
    public void setContratantesetDireccionResptDireccionRes(String contratantesetDireccionResptDireccionRes) {
        this.contratantesetDireccionResptDireccionRes = contratantesetDireccionResptDireccionRes;
    }

    @JsonIgnore
    public Boolean getContratantesetDireccionResptRural() {
        return this.contratantesetDireccionResptRural;
    }
    
    public void setContratantesetDireccionResptRural(Boolean contratantesetDireccionResptRural) {
        this.contratantesetDireccionResptRural = contratantesetDireccionResptRural;
    }

    private void checkContratantesetDireccionResptRural() throws NotNullArgumentException {
        if(this.getContratantesetDireccionResptRural() == null) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_SETDIRECCIONRES, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_SETDIRECCIONRES_CONTRATANTESETDIRECCIONRESPTRURAL, ContratanteConstants.SERV_ALIAS_SETDIRECCIONRES, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_SETDIRECCIONRES_CONTRATANTESETDIRECCIONRESPTRURAL);
        }
    }
}
