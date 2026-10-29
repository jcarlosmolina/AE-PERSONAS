package com.keralty.aepersonas.viewmodel.municipio.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.MunicipioConstants;
import com.keralty.aepersonas.persistence.Contratante;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.ContratanteOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;

public class InsMunicipioNacContratanteRequest {

    @JsonProperty("p_thismunicipio_oid")
    private MunicipioOid municipioInsMunicipioNacContratantepthisMunicipio;
    
    @JsonIgnore
    private Municipio municipioInsMunicipioNacContratantepthisMunicipioInstance;

    @JsonProperty("p_evccontratante_oid")
    private ContratanteOid municipioInsMunicipioNacContratantepevcContratante;
    
    @JsonIgnore
    private Contratante municipioInsMunicipioNacContratantepevcContratanteInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkMunicipioInsMunicipioNacContratantepthisMunicipio();
        checkMunicipioInsMunicipioNacContratantepevcContratante();
    }

    @JsonIgnore
    public MunicipioOid getMunicipioInsMunicipioNacContratantepthisMunicipio() {
        return this.municipioInsMunicipioNacContratantepthisMunicipio;
    }
    
    public void setMunicipioInsMunicipioNacContratantepthisMunicipio(MunicipioOid municipioInsMunicipioNacContratantepthisMunicipio) {
        this.municipioInsMunicipioNacContratantepthisMunicipio = municipioInsMunicipioNacContratantepthisMunicipio;
    }

    @JsonIgnore
    public Municipio getMunicipioInsMunicipioNacContratantepthisMunicipioInstance() {
        return this.municipioInsMunicipioNacContratantepthisMunicipioInstance;
    }
    
    public void setMunicipioInsMunicipioNacContratantepthisMunicipioInstance(Municipio municipioInsMunicipioNacContratantepthisMunicipio) {
        this.municipioInsMunicipioNacContratantepthisMunicipioInstance = municipioInsMunicipioNacContratantepthisMunicipio;
        this.municipioInsMunicipioNacContratantepthisMunicipio = municipioInsMunicipioNacContratantepthisMunicipio != null ? municipioInsMunicipioNacContratantepthisMunicipio.getOid() : null;
    }

    private void checkMunicipioInsMunicipioNacContratantepthisMunicipio() throws NotNullArgumentException {
        if(this.getMunicipioInsMunicipioNacContratantepthisMunicipioInstance() == null || this.getMunicipioInsMunicipioNacContratantepthisMunicipioInstance().isNull()) {
            throw new NotNullArgumentException(MunicipioConstants.SERV_ID_INSMUNICIPIONACCONTRATANTE, MunicipioConstants.CLASS_ID, MunicipioConstants.ARG_ID_INSMUNICIPIONACCONTRATANTE_MUNICIPIOINSMUNICIPIONACCONTRATANTEPTHISMUNICIPIO, MunicipioConstants.SERV_ALIAS_INSMUNICIPIONACCONTRATANTE, MunicipioConstants.CLASS_ALIAS, MunicipioConstants.ARG_ALIAS_INSMUNICIPIONACCONTRATANTE_MUNICIPIOINSMUNICIPIONACCONTRATANTEPTHISMUNICIPIO);
        }
    }

    @JsonIgnore
    public ContratanteOid getMunicipioInsMunicipioNacContratantepevcContratante() {
        return this.municipioInsMunicipioNacContratantepevcContratante;
    }
    
    public void setMunicipioInsMunicipioNacContratantepevcContratante(ContratanteOid municipioInsMunicipioNacContratantepevcContratante) {
        this.municipioInsMunicipioNacContratantepevcContratante = municipioInsMunicipioNacContratantepevcContratante;
    }

    @JsonIgnore
    public Contratante getMunicipioInsMunicipioNacContratantepevcContratanteInstance() {
        return this.municipioInsMunicipioNacContratantepevcContratanteInstance;
    }
    
    public void setMunicipioInsMunicipioNacContratantepevcContratanteInstance(Contratante municipioInsMunicipioNacContratantepevcContratante) {
        this.municipioInsMunicipioNacContratantepevcContratanteInstance = municipioInsMunicipioNacContratantepevcContratante;
        this.municipioInsMunicipioNacContratantepevcContratante = municipioInsMunicipioNacContratantepevcContratante != null ? municipioInsMunicipioNacContratantepevcContratante.getOid() : null;
    }

    private void checkMunicipioInsMunicipioNacContratantepevcContratante() throws NotNullArgumentException {
        if(this.getMunicipioInsMunicipioNacContratantepevcContratanteInstance() == null || this.getMunicipioInsMunicipioNacContratantepevcContratanteInstance().isNull()) {
            throw new NotNullArgumentException(MunicipioConstants.SERV_ID_INSMUNICIPIONACCONTRATANTE, MunicipioConstants.CLASS_ID, MunicipioConstants.ARG_ID_INSMUNICIPIONACCONTRATANTE_MUNICIPIOINSMUNICIPIONACCONTRATANTEPEVCCONTRATANTE, MunicipioConstants.SERV_ALIAS_INSMUNICIPIONACCONTRATANTE, MunicipioConstants.CLASS_ALIAS, MunicipioConstants.ARG_ALIAS_INSMUNICIPIONACCONTRATANTE_MUNICIPIOINSMUNICIPIONACCONTRATANTEPEVCCONTRATANTE);
        }
    }
}
