package com.keralty.aepersonas.viewmodel.titular.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.TitularConstants;
import com.keralty.aepersonas.persistence.oid.TitularOid;
import com.keralty.aepersonas.persistence.Titular;

public class FijarTitularConBeneficiosRequest {

    @JsonProperty("p_thistitular_oid")
    private TitularOid titularfijarTitularConBeneficiospthisTitular;
    
    @JsonIgnore
    private Titular titularfijarTitularConBeneficiospthisTitularInstance;

    @JsonProperty("p_titularconbeneficios")
    private Boolean titularfijarTitularConBeneficiospTitularConBeneficios;

    public void checkArguments() throws NotNullArgumentException {
        checkTitularfijarTitularConBeneficiospthisTitular();
        checkTitularfijarTitularConBeneficiospTitularConBeneficios();
    }

    @JsonIgnore
    public TitularOid getTitularfijarTitularConBeneficiospthisTitular() {
        return this.titularfijarTitularConBeneficiospthisTitular;
    }
    
    public void setTitularfijarTitularConBeneficiospthisTitular(TitularOid titularfijarTitularConBeneficiospthisTitular) {
        this.titularfijarTitularConBeneficiospthisTitular = titularfijarTitularConBeneficiospthisTitular;
    }

    @JsonIgnore
    public Titular getTitularfijarTitularConBeneficiospthisTitularInstance() {
        return this.titularfijarTitularConBeneficiospthisTitularInstance;
    }
    
    public void setTitularfijarTitularConBeneficiospthisTitularInstance(Titular titularfijarTitularConBeneficiospthisTitular) {
        this.titularfijarTitularConBeneficiospthisTitularInstance = titularfijarTitularConBeneficiospthisTitular;
        this.titularfijarTitularConBeneficiospthisTitular = titularfijarTitularConBeneficiospthisTitular != null ? titularfijarTitularConBeneficiospthisTitular.getOid() : null;
    }

    private void checkTitularfijarTitularConBeneficiospthisTitular() throws NotNullArgumentException {
        if(this.getTitularfijarTitularConBeneficiospthisTitularInstance() == null || this.getTitularfijarTitularConBeneficiospthisTitularInstance().isNull()) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_FIJARTITULARCONBENEFICIOS, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_FIJARTITULARCONBENEFICIOS_TITULARFIJARTITULARCONBENEFICIOSPTHISTITULAR, TitularConstants.SERV_ALIAS_FIJARTITULARCONBENEFICIOS, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_FIJARTITULARCONBENEFICIOS_TITULARFIJARTITULARCONBENEFICIOSPTHISTITULAR);
        }
    }

    @JsonIgnore
    public Boolean getTitularfijarTitularConBeneficiospTitularConBeneficios() {
        return this.titularfijarTitularConBeneficiospTitularConBeneficios;
    }
    
    public void setTitularfijarTitularConBeneficiospTitularConBeneficios(Boolean titularfijarTitularConBeneficiospTitularConBeneficios) {
        this.titularfijarTitularConBeneficiospTitularConBeneficios = titularfijarTitularConBeneficiospTitularConBeneficios;
    }

    private void checkTitularfijarTitularConBeneficiospTitularConBeneficios() throws NotNullArgumentException {
        if(this.getTitularfijarTitularConBeneficiospTitularConBeneficios() == null) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_FIJARTITULARCONBENEFICIOS, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_FIJARTITULARCONBENEFICIOS_TITULARFIJARTITULARCONBENEFICIOSPTITULARCONBENEFICIOS, TitularConstants.SERV_ALIAS_FIJARTITULARCONBENEFICIOS, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_FIJARTITULARCONBENEFICIOS_TITULARFIJARTITULARCONBENEFICIOSPTITULARCONBENEFICIOS);
        }
    }
}
