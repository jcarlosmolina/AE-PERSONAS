package com.keralty.aepersonas.viewmodel.titular.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.TitularConstants;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;
import com.keralty.aepersonas.persistence.oid.TitularOid;
import com.keralty.aepersonas.persistence.Titular;

public class DelMunicipioNacTitularRequest {

    @JsonProperty("p_thistitular_oid")
    private TitularOid titularDelMunicipioNacTitularpthisTitular;
    
    @JsonIgnore
    private Titular titularDelMunicipioNacTitularpthisTitularInstance;

    @JsonProperty("p_evcmunicipio_oid")
    private MunicipioOid titularDelMunicipioNacTitularpevcMunicipio;
    
    @JsonIgnore
    private Municipio titularDelMunicipioNacTitularpevcMunicipioInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkTitularDelMunicipioNacTitularpthisTitular();
        checkTitularDelMunicipioNacTitularpevcMunicipio();
    }

    @JsonIgnore
    public TitularOid getTitularDelMunicipioNacTitularpthisTitular() {
        return this.titularDelMunicipioNacTitularpthisTitular;
    }
    
    public void setTitularDelMunicipioNacTitularpthisTitular(TitularOid titularDelMunicipioNacTitularpthisTitular) {
        this.titularDelMunicipioNacTitularpthisTitular = titularDelMunicipioNacTitularpthisTitular;
    }

    @JsonIgnore
    public Titular getTitularDelMunicipioNacTitularpthisTitularInstance() {
        return this.titularDelMunicipioNacTitularpthisTitularInstance;
    }
    
    public void setTitularDelMunicipioNacTitularpthisTitularInstance(Titular titularDelMunicipioNacTitularpthisTitular) {
        this.titularDelMunicipioNacTitularpthisTitularInstance = titularDelMunicipioNacTitularpthisTitular;
        this.titularDelMunicipioNacTitularpthisTitular = titularDelMunicipioNacTitularpthisTitular != null ? titularDelMunicipioNacTitularpthisTitular.getOid() : null;
    }

    private void checkTitularDelMunicipioNacTitularpthisTitular() throws NotNullArgumentException {
        if(this.getTitularDelMunicipioNacTitularpthisTitularInstance() == null || this.getTitularDelMunicipioNacTitularpthisTitularInstance().isNull()) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_DELMUNICIPIONACTITULAR, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_DELMUNICIPIONACTITULAR_TITULARDELMUNICIPIONACTITULARPTHISTITULAR, TitularConstants.SERV_ALIAS_DELMUNICIPIONACTITULAR, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_DELMUNICIPIONACTITULAR_TITULARDELMUNICIPIONACTITULARPTHISTITULAR);
        }
    }

    @JsonIgnore
    public MunicipioOid getTitularDelMunicipioNacTitularpevcMunicipio() {
        return this.titularDelMunicipioNacTitularpevcMunicipio;
    }
    
    public void setTitularDelMunicipioNacTitularpevcMunicipio(MunicipioOid titularDelMunicipioNacTitularpevcMunicipio) {
        this.titularDelMunicipioNacTitularpevcMunicipio = titularDelMunicipioNacTitularpevcMunicipio;
    }

    @JsonIgnore
    public Municipio getTitularDelMunicipioNacTitularpevcMunicipioInstance() {
        return this.titularDelMunicipioNacTitularpevcMunicipioInstance;
    }
    
    public void setTitularDelMunicipioNacTitularpevcMunicipioInstance(Municipio titularDelMunicipioNacTitularpevcMunicipio) {
        this.titularDelMunicipioNacTitularpevcMunicipioInstance = titularDelMunicipioNacTitularpevcMunicipio;
        this.titularDelMunicipioNacTitularpevcMunicipio = titularDelMunicipioNacTitularpevcMunicipio != null ? titularDelMunicipioNacTitularpevcMunicipio.getOid() : null;
    }

    private void checkTitularDelMunicipioNacTitularpevcMunicipio() throws NotNullArgumentException {
        if(this.getTitularDelMunicipioNacTitularpevcMunicipioInstance() == null || this.getTitularDelMunicipioNacTitularpevcMunicipioInstance().isNull()) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_DELMUNICIPIONACTITULAR, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_DELMUNICIPIONACTITULAR_TITULARDELMUNICIPIONACTITULARPEVCMUNICIPIO, TitularConstants.SERV_ALIAS_DELMUNICIPIONACTITULAR, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_DELMUNICIPIONACTITULAR_TITULARDELMUNICIPIONACTITULARPEVCMUNICIPIO);
        }
    }
}
