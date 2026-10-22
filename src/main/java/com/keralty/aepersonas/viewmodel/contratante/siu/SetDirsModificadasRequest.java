package com.keralty.aepersonas.viewmodel.contratante.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.ContratanteConstants;
import com.keralty.aepersonas.persistence.Contratante;
import com.keralty.aepersonas.persistence.oid.ContratanteOid;

public class SetDirsModificadasRequest {

    @JsonProperty("p_thiscontratante_oid")
    private ContratanteOid contratantesetDirsModificadaspthisContratante;
    
    @JsonIgnore
    private Contratante contratantesetDirsModificadaspthisContratanteInstance;

    @JsonProperty("ptmod")
    private Boolean contratantesetDirsModificadasptMod;

    public void checkArguments() throws NotNullArgumentException {
        checkContratantesetDirsModificadaspthisContratante();
        checkContratantesetDirsModificadasptMod();
    }

    @JsonIgnore
    public ContratanteOid getContratantesetDirsModificadaspthisContratante() {
        return this.contratantesetDirsModificadaspthisContratante;
    }
    
    public void setContratantesetDirsModificadaspthisContratante(ContratanteOid contratantesetDirsModificadaspthisContratante) {
        this.contratantesetDirsModificadaspthisContratante = contratantesetDirsModificadaspthisContratante;
    }

    @JsonIgnore
    public Contratante getContratantesetDirsModificadaspthisContratanteInstance() {
        return this.contratantesetDirsModificadaspthisContratanteInstance;
    }
    
    public void setContratantesetDirsModificadaspthisContratanteInstance(Contratante contratantesetDirsModificadaspthisContratante) {
        this.contratantesetDirsModificadaspthisContratanteInstance = contratantesetDirsModificadaspthisContratante;
        this.contratantesetDirsModificadaspthisContratante = contratantesetDirsModificadaspthisContratante != null ? contratantesetDirsModificadaspthisContratante.getOid() : null;
    }

    private void checkContratantesetDirsModificadaspthisContratante() throws NotNullArgumentException {
        if(this.getContratantesetDirsModificadaspthisContratanteInstance() == null || this.getContratantesetDirsModificadaspthisContratanteInstance().isNull()) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_SETDIRSMODIFICADAS, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_SETDIRSMODIFICADAS_CONTRATANTESETDIRSMODIFICADASPTHISCONTRATANTE, ContratanteConstants.SERV_ALIAS_SETDIRSMODIFICADAS, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_SETDIRSMODIFICADAS_CONTRATANTESETDIRSMODIFICADASPTHISCONTRATANTE);
        }
    }

    @JsonIgnore
    public Boolean getContratantesetDirsModificadasptMod() {
        return this.contratantesetDirsModificadasptMod;
    }
    
    public void setContratantesetDirsModificadasptMod(Boolean contratantesetDirsModificadasptMod) {
        this.contratantesetDirsModificadasptMod = contratantesetDirsModificadasptMod;
    }

    private void checkContratantesetDirsModificadasptMod() throws NotNullArgumentException {
        if(this.getContratantesetDirsModificadasptMod() == null) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_SETDIRSMODIFICADAS, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_SETDIRSMODIFICADAS_CONTRATANTESETDIRSMODIFICADASPTMOD, ContratanteConstants.SERV_ALIAS_SETDIRSMODIFICADAS, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_SETDIRSMODIFICADAS_CONTRATANTESETDIRSMODIFICADASPTMOD);
        }
    }
}
