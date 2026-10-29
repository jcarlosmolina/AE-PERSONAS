package com.keralty.aepersonas.viewmodel.municipio.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.MunicipioConstants;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;
import com.keralty.aepersonas.persistence.oid.TitularOid;
import com.keralty.aepersonas.persistence.Titular;

public class DelMunicipioNacTitularRequest {

    @JsonProperty("p_thismunicipio_oid")
    private MunicipioOid municipioDelMunicipioNacTitularpthisMunicipio;
    
    @JsonIgnore
    private Municipio municipioDelMunicipioNacTitularpthisMunicipioInstance;

    @JsonProperty("p_evctitular_oid")
    private TitularOid municipioDelMunicipioNacTitularpevcTitular;
    
    @JsonIgnore
    private Titular municipioDelMunicipioNacTitularpevcTitularInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkMunicipioDelMunicipioNacTitularpthisMunicipio();
        checkMunicipioDelMunicipioNacTitularpevcTitular();
    }

    @JsonIgnore
    public MunicipioOid getMunicipioDelMunicipioNacTitularpthisMunicipio() {
        return this.municipioDelMunicipioNacTitularpthisMunicipio;
    }
    
    public void setMunicipioDelMunicipioNacTitularpthisMunicipio(MunicipioOid municipioDelMunicipioNacTitularpthisMunicipio) {
        this.municipioDelMunicipioNacTitularpthisMunicipio = municipioDelMunicipioNacTitularpthisMunicipio;
    }

    @JsonIgnore
    public Municipio getMunicipioDelMunicipioNacTitularpthisMunicipioInstance() {
        return this.municipioDelMunicipioNacTitularpthisMunicipioInstance;
    }
    
    public void setMunicipioDelMunicipioNacTitularpthisMunicipioInstance(Municipio municipioDelMunicipioNacTitularpthisMunicipio) {
        this.municipioDelMunicipioNacTitularpthisMunicipioInstance = municipioDelMunicipioNacTitularpthisMunicipio;
        this.municipioDelMunicipioNacTitularpthisMunicipio = municipioDelMunicipioNacTitularpthisMunicipio != null ? municipioDelMunicipioNacTitularpthisMunicipio.getOid() : null;
    }

    private void checkMunicipioDelMunicipioNacTitularpthisMunicipio() throws NotNullArgumentException {
        if(this.getMunicipioDelMunicipioNacTitularpthisMunicipioInstance() == null || this.getMunicipioDelMunicipioNacTitularpthisMunicipioInstance().isNull()) {
            throw new NotNullArgumentException(MunicipioConstants.SERV_ID_DELMUNICIPIONACTITULAR, MunicipioConstants.CLASS_ID, MunicipioConstants.ARG_ID_DELMUNICIPIONACTITULAR_MUNICIPIODELMUNICIPIONACTITULARPTHISMUNICIPIO, MunicipioConstants.SERV_ALIAS_DELMUNICIPIONACTITULAR, MunicipioConstants.CLASS_ALIAS, MunicipioConstants.ARG_ALIAS_DELMUNICIPIONACTITULAR_MUNICIPIODELMUNICIPIONACTITULARPTHISMUNICIPIO);
        }
    }

    @JsonIgnore
    public TitularOid getMunicipioDelMunicipioNacTitularpevcTitular() {
        return this.municipioDelMunicipioNacTitularpevcTitular;
    }
    
    public void setMunicipioDelMunicipioNacTitularpevcTitular(TitularOid municipioDelMunicipioNacTitularpevcTitular) {
        this.municipioDelMunicipioNacTitularpevcTitular = municipioDelMunicipioNacTitularpevcTitular;
    }

    @JsonIgnore
    public Titular getMunicipioDelMunicipioNacTitularpevcTitularInstance() {
        return this.municipioDelMunicipioNacTitularpevcTitularInstance;
    }
    
    public void setMunicipioDelMunicipioNacTitularpevcTitularInstance(Titular municipioDelMunicipioNacTitularpevcTitular) {
        this.municipioDelMunicipioNacTitularpevcTitularInstance = municipioDelMunicipioNacTitularpevcTitular;
        this.municipioDelMunicipioNacTitularpevcTitular = municipioDelMunicipioNacTitularpevcTitular != null ? municipioDelMunicipioNacTitularpevcTitular.getOid() : null;
    }

    private void checkMunicipioDelMunicipioNacTitularpevcTitular() throws NotNullArgumentException {
        if(this.getMunicipioDelMunicipioNacTitularpevcTitularInstance() == null || this.getMunicipioDelMunicipioNacTitularpevcTitularInstance().isNull()) {
            throw new NotNullArgumentException(MunicipioConstants.SERV_ID_DELMUNICIPIONACTITULAR, MunicipioConstants.CLASS_ID, MunicipioConstants.ARG_ID_DELMUNICIPIONACTITULAR_MUNICIPIODELMUNICIPIONACTITULARPEVCTITULAR, MunicipioConstants.SERV_ALIAS_DELMUNICIPIONACTITULAR, MunicipioConstants.CLASS_ALIAS, MunicipioConstants.ARG_ALIAS_DELMUNICIPIONACTITULAR_MUNICIPIODELMUNICIPIONACTITULARPEVCTITULAR);
        }
    }
}
