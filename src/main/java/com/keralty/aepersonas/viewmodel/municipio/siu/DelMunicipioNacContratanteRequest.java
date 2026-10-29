package com.keralty.aepersonas.viewmodel.municipio.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.MunicipioConstants;
import com.keralty.aepersonas.persistence.Contratante;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.ContratanteOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;

public class DelMunicipioNacContratanteRequest {

    @JsonProperty("p_thismunicipio_oid")
    private MunicipioOid municipioDelMunicipioNacContratantepthisMunicipio;
    
    @JsonIgnore
    private Municipio municipioDelMunicipioNacContratantepthisMunicipioInstance;

    @JsonProperty("p_evccontratante_oid")
    private ContratanteOid municipioDelMunicipioNacContratantepevcContratante;
    
    @JsonIgnore
    private Contratante municipioDelMunicipioNacContratantepevcContratanteInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkMunicipioDelMunicipioNacContratantepthisMunicipio();
        checkMunicipioDelMunicipioNacContratantepevcContratante();
    }

    @JsonIgnore
    public MunicipioOid getMunicipioDelMunicipioNacContratantepthisMunicipio() {
        return this.municipioDelMunicipioNacContratantepthisMunicipio;
    }
    
    public void setMunicipioDelMunicipioNacContratantepthisMunicipio(MunicipioOid municipioDelMunicipioNacContratantepthisMunicipio) {
        this.municipioDelMunicipioNacContratantepthisMunicipio = municipioDelMunicipioNacContratantepthisMunicipio;
    }

    @JsonIgnore
    public Municipio getMunicipioDelMunicipioNacContratantepthisMunicipioInstance() {
        return this.municipioDelMunicipioNacContratantepthisMunicipioInstance;
    }
    
    public void setMunicipioDelMunicipioNacContratantepthisMunicipioInstance(Municipio municipioDelMunicipioNacContratantepthisMunicipio) {
        this.municipioDelMunicipioNacContratantepthisMunicipioInstance = municipioDelMunicipioNacContratantepthisMunicipio;
        this.municipioDelMunicipioNacContratantepthisMunicipio = municipioDelMunicipioNacContratantepthisMunicipio != null ? municipioDelMunicipioNacContratantepthisMunicipio.getOid() : null;
    }

    private void checkMunicipioDelMunicipioNacContratantepthisMunicipio() throws NotNullArgumentException {
        if(this.getMunicipioDelMunicipioNacContratantepthisMunicipioInstance() == null || this.getMunicipioDelMunicipioNacContratantepthisMunicipioInstance().isNull()) {
            throw new NotNullArgumentException(MunicipioConstants.SERV_ID_DELMUNICIPIONACCONTRATANTE, MunicipioConstants.CLASS_ID, MunicipioConstants.ARG_ID_DELMUNICIPIONACCONTRATANTE_MUNICIPIODELMUNICIPIONACCONTRATANTEPTHISMUNICIPIO, MunicipioConstants.SERV_ALIAS_DELMUNICIPIONACCONTRATANTE, MunicipioConstants.CLASS_ALIAS, MunicipioConstants.ARG_ALIAS_DELMUNICIPIONACCONTRATANTE_MUNICIPIODELMUNICIPIONACCONTRATANTEPTHISMUNICIPIO);
        }
    }

    @JsonIgnore
    public ContratanteOid getMunicipioDelMunicipioNacContratantepevcContratante() {
        return this.municipioDelMunicipioNacContratantepevcContratante;
    }
    
    public void setMunicipioDelMunicipioNacContratantepevcContratante(ContratanteOid municipioDelMunicipioNacContratantepevcContratante) {
        this.municipioDelMunicipioNacContratantepevcContratante = municipioDelMunicipioNacContratantepevcContratante;
    }

    @JsonIgnore
    public Contratante getMunicipioDelMunicipioNacContratantepevcContratanteInstance() {
        return this.municipioDelMunicipioNacContratantepevcContratanteInstance;
    }
    
    public void setMunicipioDelMunicipioNacContratantepevcContratanteInstance(Contratante municipioDelMunicipioNacContratantepevcContratante) {
        this.municipioDelMunicipioNacContratantepevcContratanteInstance = municipioDelMunicipioNacContratantepevcContratante;
        this.municipioDelMunicipioNacContratantepevcContratante = municipioDelMunicipioNacContratantepevcContratante != null ? municipioDelMunicipioNacContratantepevcContratante.getOid() : null;
    }

    private void checkMunicipioDelMunicipioNacContratantepevcContratante() throws NotNullArgumentException {
        if(this.getMunicipioDelMunicipioNacContratantepevcContratanteInstance() == null || this.getMunicipioDelMunicipioNacContratantepevcContratanteInstance().isNull()) {
            throw new NotNullArgumentException(MunicipioConstants.SERV_ID_DELMUNICIPIONACCONTRATANTE, MunicipioConstants.CLASS_ID, MunicipioConstants.ARG_ID_DELMUNICIPIONACCONTRATANTE_MUNICIPIODELMUNICIPIONACCONTRATANTEPEVCCONTRATANTE, MunicipioConstants.SERV_ALIAS_DELMUNICIPIONACCONTRATANTE, MunicipioConstants.CLASS_ALIAS, MunicipioConstants.ARG_ALIAS_DELMUNICIPIONACCONTRATANTE_MUNICIPIODELMUNICIPIONACCONTRATANTEPEVCCONTRATANTE);
        }
    }
}
