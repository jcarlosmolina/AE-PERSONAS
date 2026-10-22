package com.keralty.aepersonas.viewmodel.titular.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.TitularConstants;
import com.keralty.aepersonas.persistence.oid.TitularOid;
import com.keralty.aepersonas.persistence.Titular;

public class SetDirsModificadasRequest {

    @JsonProperty("p_thistitular_oid")
    private TitularOid titularsetDirsModificadaspthisTitular;
    
    @JsonIgnore
    private Titular titularsetDirsModificadaspthisTitularInstance;

    @JsonProperty("pdmod")
    private Boolean titularsetDirsModificadaspdMod;

    public void checkArguments() throws NotNullArgumentException {
        checkTitularsetDirsModificadaspthisTitular();
        checkTitularsetDirsModificadaspdMod();
    }

    @JsonIgnore
    public TitularOid getTitularsetDirsModificadaspthisTitular() {
        return this.titularsetDirsModificadaspthisTitular;
    }
    
    public void setTitularsetDirsModificadaspthisTitular(TitularOid titularsetDirsModificadaspthisTitular) {
        this.titularsetDirsModificadaspthisTitular = titularsetDirsModificadaspthisTitular;
    }

    @JsonIgnore
    public Titular getTitularsetDirsModificadaspthisTitularInstance() {
        return this.titularsetDirsModificadaspthisTitularInstance;
    }
    
    public void setTitularsetDirsModificadaspthisTitularInstance(Titular titularsetDirsModificadaspthisTitular) {
        this.titularsetDirsModificadaspthisTitularInstance = titularsetDirsModificadaspthisTitular;
        this.titularsetDirsModificadaspthisTitular = titularsetDirsModificadaspthisTitular != null ? titularsetDirsModificadaspthisTitular.getOid() : null;
    }

    private void checkTitularsetDirsModificadaspthisTitular() throws NotNullArgumentException {
        if(this.getTitularsetDirsModificadaspthisTitularInstance() == null || this.getTitularsetDirsModificadaspthisTitularInstance().isNull()) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_SETDIRSMODIFICADAS, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_SETDIRSMODIFICADAS_TITULARSETDIRSMODIFICADASPTHISTITULAR, TitularConstants.SERV_ALIAS_SETDIRSMODIFICADAS, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_SETDIRSMODIFICADAS_TITULARSETDIRSMODIFICADASPTHISTITULAR);
        }
    }

    @JsonIgnore
    public Boolean getTitularsetDirsModificadaspdMod() {
        return this.titularsetDirsModificadaspdMod;
    }
    
    public void setTitularsetDirsModificadaspdMod(Boolean titularsetDirsModificadaspdMod) {
        this.titularsetDirsModificadaspdMod = titularsetDirsModificadaspdMod;
    }

    private void checkTitularsetDirsModificadaspdMod() throws NotNullArgumentException {
        if(this.getTitularsetDirsModificadaspdMod() == null) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_SETDIRSMODIFICADAS, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_SETDIRSMODIFICADAS_TITULARSETDIRSMODIFICADASPDMOD, TitularConstants.SERV_ALIAS_SETDIRSMODIFICADAS, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_SETDIRSMODIFICADAS_TITULARSETDIRSMODIFICADASPDMOD);
        }
    }
}
