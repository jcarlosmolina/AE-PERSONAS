package com.keralty.aepersonas.viewmodel.titular.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.TitularConstants;
import com.keralty.aepersonas.persistence.oid.TitularOid;
import com.keralty.aepersonas.persistence.Titular;

public class TBORRARRequest {

    @JsonProperty("p_thistitular_oid")
    private TitularOid titularTBORRARpthisTitular;
    
    @JsonIgnore
    private Titular titularTBORRARpthisTitularInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkTitularTBORRARpthisTitular();
    }

    @JsonIgnore
    public TitularOid getTitularTBORRARpthisTitular() {
        return this.titularTBORRARpthisTitular;
    }
    
    public void setTitularTBORRARpthisTitular(TitularOid titularTBORRARpthisTitular) {
        this.titularTBORRARpthisTitular = titularTBORRARpthisTitular;
    }

    @JsonIgnore
    public Titular getTitularTBORRARpthisTitularInstance() {
        return this.titularTBORRARpthisTitularInstance;
    }
    
    public void setTitularTBORRARpthisTitularInstance(Titular titularTBORRARpthisTitular) {
        this.titularTBORRARpthisTitularInstance = titularTBORRARpthisTitular;
        this.titularTBORRARpthisTitular = titularTBORRARpthisTitular != null ? titularTBORRARpthisTitular.getOid() : null;
    }

    private void checkTitularTBORRARpthisTitular() throws NotNullArgumentException {
        if(this.getTitularTBORRARpthisTitularInstance() == null || this.getTitularTBORRARpthisTitularInstance().isNull()) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_TBORRAR, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_TBORRAR_TITULARTBORRARPTHISTITULAR, TitularConstants.SERV_ALIAS_TBORRAR, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_TBORRAR_TITULARTBORRARPTHISTITULAR);
        }
    }
}
