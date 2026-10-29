package com.keralty.aepersonas.viewmodel.municipio.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.MunicipioConstants;
import com.keralty.aepersonas.persistence.Contratante;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.ContratanteOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;

public class DelMunicipioResRequest {

    @JsonProperty("p_thismunicipio_oid")
    private MunicipioOid municipioDelMunicipioRespthisMunicipio;
    
    @JsonIgnore
    private Municipio municipioDelMunicipioRespthisMunicipioInstance;

    @JsonProperty("p_evccontratante_oid")
    private ContratanteOid municipioDelMunicipioRespevcContratante;
    
    @JsonIgnore
    private Contratante municipioDelMunicipioRespevcContratanteInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkMunicipioDelMunicipioRespthisMunicipio();
        checkMunicipioDelMunicipioRespevcContratante();
    }

    @JsonIgnore
    public MunicipioOid getMunicipioDelMunicipioRespthisMunicipio() {
        return this.municipioDelMunicipioRespthisMunicipio;
    }
    
    public void setMunicipioDelMunicipioRespthisMunicipio(MunicipioOid municipioDelMunicipioRespthisMunicipio) {
        this.municipioDelMunicipioRespthisMunicipio = municipioDelMunicipioRespthisMunicipio;
    }

    @JsonIgnore
    public Municipio getMunicipioDelMunicipioRespthisMunicipioInstance() {
        return this.municipioDelMunicipioRespthisMunicipioInstance;
    }
    
    public void setMunicipioDelMunicipioRespthisMunicipioInstance(Municipio municipioDelMunicipioRespthisMunicipio) {
        this.municipioDelMunicipioRespthisMunicipioInstance = municipioDelMunicipioRespthisMunicipio;
        this.municipioDelMunicipioRespthisMunicipio = municipioDelMunicipioRespthisMunicipio != null ? municipioDelMunicipioRespthisMunicipio.getOid() : null;
    }

    private void checkMunicipioDelMunicipioRespthisMunicipio() throws NotNullArgumentException {
        if(this.getMunicipioDelMunicipioRespthisMunicipioInstance() == null || this.getMunicipioDelMunicipioRespthisMunicipioInstance().isNull()) {
            throw new NotNullArgumentException(MunicipioConstants.SERV_ID_DELMUNICIPIORES, MunicipioConstants.CLASS_ID, MunicipioConstants.ARG_ID_DELMUNICIPIORES_MUNICIPIODELMUNICIPIORESPTHISMUNICIPIO, MunicipioConstants.SERV_ALIAS_DELMUNICIPIORES, MunicipioConstants.CLASS_ALIAS, MunicipioConstants.ARG_ALIAS_DELMUNICIPIORES_MUNICIPIODELMUNICIPIORESPTHISMUNICIPIO);
        }
    }

    @JsonIgnore
    public ContratanteOid getMunicipioDelMunicipioRespevcContratante() {
        return this.municipioDelMunicipioRespevcContratante;
    }
    
    public void setMunicipioDelMunicipioRespevcContratante(ContratanteOid municipioDelMunicipioRespevcContratante) {
        this.municipioDelMunicipioRespevcContratante = municipioDelMunicipioRespevcContratante;
    }

    @JsonIgnore
    public Contratante getMunicipioDelMunicipioRespevcContratanteInstance() {
        return this.municipioDelMunicipioRespevcContratanteInstance;
    }
    
    public void setMunicipioDelMunicipioRespevcContratanteInstance(Contratante municipioDelMunicipioRespevcContratante) {
        this.municipioDelMunicipioRespevcContratanteInstance = municipioDelMunicipioRespevcContratante;
        this.municipioDelMunicipioRespevcContratante = municipioDelMunicipioRespevcContratante != null ? municipioDelMunicipioRespevcContratante.getOid() : null;
    }

    private void checkMunicipioDelMunicipioRespevcContratante() throws NotNullArgumentException {
        if(this.getMunicipioDelMunicipioRespevcContratanteInstance() == null || this.getMunicipioDelMunicipioRespevcContratanteInstance().isNull()) {
            throw new NotNullArgumentException(MunicipioConstants.SERV_ID_DELMUNICIPIORES, MunicipioConstants.CLASS_ID, MunicipioConstants.ARG_ID_DELMUNICIPIORES_MUNICIPIODELMUNICIPIORESPEVCCONTRATANTE, MunicipioConstants.SERV_ALIAS_DELMUNICIPIORES, MunicipioConstants.CLASS_ALIAS, MunicipioConstants.ARG_ALIAS_DELMUNICIPIORES_MUNICIPIODELMUNICIPIORESPEVCCONTRATANTE);
        }
    }
}
