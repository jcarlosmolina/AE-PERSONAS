package com.keralty.aepersonas.viewmodel.titular.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.TitularConstants;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;
import com.keralty.aepersonas.persistence.oid.TitularOid;
import com.keralty.aepersonas.persistence.Titular;

public class InsMunicipioNacTitularRequest {

    @JsonProperty("p_thistitular_oid")
    private TitularOid titularInsMunicipioNacTitularpthisTitular;
    
    @JsonIgnore
    private Titular titularInsMunicipioNacTitularpthisTitularInstance;

    @JsonProperty("p_evcmunicipio_oid")
    private MunicipioOid titularInsMunicipioNacTitularpevcMunicipio;
    
    @JsonIgnore
    private Municipio titularInsMunicipioNacTitularpevcMunicipioInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkTitularInsMunicipioNacTitularpthisTitular();
        checkTitularInsMunicipioNacTitularpevcMunicipio();
    }

    @JsonIgnore
    public TitularOid getTitularInsMunicipioNacTitularpthisTitular() {
        return this.titularInsMunicipioNacTitularpthisTitular;
    }
    
    public void setTitularInsMunicipioNacTitularpthisTitular(TitularOid titularInsMunicipioNacTitularpthisTitular) {
        this.titularInsMunicipioNacTitularpthisTitular = titularInsMunicipioNacTitularpthisTitular;
    }

    @JsonIgnore
    public Titular getTitularInsMunicipioNacTitularpthisTitularInstance() {
        return this.titularInsMunicipioNacTitularpthisTitularInstance;
    }
    
    public void setTitularInsMunicipioNacTitularpthisTitularInstance(Titular titularInsMunicipioNacTitularpthisTitular) {
        this.titularInsMunicipioNacTitularpthisTitularInstance = titularInsMunicipioNacTitularpthisTitular;
        this.titularInsMunicipioNacTitularpthisTitular = titularInsMunicipioNacTitularpthisTitular != null ? titularInsMunicipioNacTitularpthisTitular.getOid() : null;
    }

    private void checkTitularInsMunicipioNacTitularpthisTitular() throws NotNullArgumentException {
        if(this.getTitularInsMunicipioNacTitularpthisTitularInstance() == null || this.getTitularInsMunicipioNacTitularpthisTitularInstance().isNull()) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_INSMUNICIPIONACTITULAR, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_INSMUNICIPIONACTITULAR_TITULARINSMUNICIPIONACTITULARPTHISTITULAR, TitularConstants.SERV_ALIAS_INSMUNICIPIONACTITULAR, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_INSMUNICIPIONACTITULAR_TITULARINSMUNICIPIONACTITULARPTHISTITULAR);
        }
    }

    @JsonIgnore
    public MunicipioOid getTitularInsMunicipioNacTitularpevcMunicipio() {
        return this.titularInsMunicipioNacTitularpevcMunicipio;
    }
    
    public void setTitularInsMunicipioNacTitularpevcMunicipio(MunicipioOid titularInsMunicipioNacTitularpevcMunicipio) {
        this.titularInsMunicipioNacTitularpevcMunicipio = titularInsMunicipioNacTitularpevcMunicipio;
    }

    @JsonIgnore
    public Municipio getTitularInsMunicipioNacTitularpevcMunicipioInstance() {
        return this.titularInsMunicipioNacTitularpevcMunicipioInstance;
    }
    
    public void setTitularInsMunicipioNacTitularpevcMunicipioInstance(Municipio titularInsMunicipioNacTitularpevcMunicipio) {
        this.titularInsMunicipioNacTitularpevcMunicipioInstance = titularInsMunicipioNacTitularpevcMunicipio;
        this.titularInsMunicipioNacTitularpevcMunicipio = titularInsMunicipioNacTitularpevcMunicipio != null ? titularInsMunicipioNacTitularpevcMunicipio.getOid() : null;
    }

    private void checkTitularInsMunicipioNacTitularpevcMunicipio() throws NotNullArgumentException {
        if(this.getTitularInsMunicipioNacTitularpevcMunicipioInstance() == null || this.getTitularInsMunicipioNacTitularpevcMunicipioInstance().isNull()) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_INSMUNICIPIONACTITULAR, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_INSMUNICIPIONACTITULAR_TITULARINSMUNICIPIONACTITULARPEVCMUNICIPIO, TitularConstants.SERV_ALIAS_INSMUNICIPIONACTITULAR, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_INSMUNICIPIONACTITULAR_TITULARINSMUNICIPIONACTITULARPEVCMUNICIPIO);
        }
    }
}
