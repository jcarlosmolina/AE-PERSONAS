package com.keralty.aepersonas.viewmodel.titular.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.TitularConstants;
import com.keralty.aepersonas.persistence.oid.TitularOid;
import com.keralty.aepersonas.persistence.Titular;

public class ActualizarCodigoRequest {

    @JsonProperty("p_thistitular_oid")
    private TitularOid titularactualizarCodigopthisTitular;
    
    @JsonIgnore
    private Titular titularactualizarCodigopthisTitularInstance;

    @JsonProperty("p_codigo")
    private Long titularactualizarCodigopCodigo;

    public void checkArguments() throws NotNullArgumentException {
        checkTitularactualizarCodigopthisTitular();
        checkTitularactualizarCodigopCodigo();
    }

    @JsonIgnore
    public TitularOid getTitularactualizarCodigopthisTitular() {
        return this.titularactualizarCodigopthisTitular;
    }
    
    public void setTitularactualizarCodigopthisTitular(TitularOid titularactualizarCodigopthisTitular) {
        this.titularactualizarCodigopthisTitular = titularactualizarCodigopthisTitular;
    }

    @JsonIgnore
    public Titular getTitularactualizarCodigopthisTitularInstance() {
        return this.titularactualizarCodigopthisTitularInstance;
    }
    
    public void setTitularactualizarCodigopthisTitularInstance(Titular titularactualizarCodigopthisTitular) {
        this.titularactualizarCodigopthisTitularInstance = titularactualizarCodigopthisTitular;
        this.titularactualizarCodigopthisTitular = titularactualizarCodigopthisTitular != null ? titularactualizarCodigopthisTitular.getOid() : null;
    }

    private void checkTitularactualizarCodigopthisTitular() throws NotNullArgumentException {
        if(this.getTitularactualizarCodigopthisTitularInstance() == null || this.getTitularactualizarCodigopthisTitularInstance().isNull()) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_ACTUALIZARCODIGO, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_ACTUALIZARCODIGO_TITULARACTUALIZARCODIGOPTHISTITULAR, TitularConstants.SERV_ALIAS_ACTUALIZARCODIGO, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_ACTUALIZARCODIGO_TITULARACTUALIZARCODIGOPTHISTITULAR);
        }
    }

    @JsonIgnore
    public Long getTitularactualizarCodigopCodigo() {
        return this.titularactualizarCodigopCodigo;
    }
    
    public void setTitularactualizarCodigopCodigo(Long titularactualizarCodigopCodigo) {
        this.titularactualizarCodigopCodigo = titularactualizarCodigopCodigo;
    }

    private void checkTitularactualizarCodigopCodigo() throws NotNullArgumentException {
        if(this.getTitularactualizarCodigopCodigo() == null) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_ACTUALIZARCODIGO, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_ACTUALIZARCODIGO_TITULARACTUALIZARCODIGOPCODIGO, TitularConstants.SERV_ALIAS_ACTUALIZARCODIGO, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_ACTUALIZARCODIGO_TITULARACTUALIZARCODIGOPCODIGO);
        }
    }
}
