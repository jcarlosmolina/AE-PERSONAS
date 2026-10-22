package com.keralty.aepersonas.viewmodel.contratante.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.ContratanteConstants;
import com.keralty.aepersonas.persistence.Contratante;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.ContratanteOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;

public class DelMunicipioResRequest {

    @JsonProperty("p_thiscontratante_oid")
    private ContratanteOid contratanteDelMunicipioRespthisContratante;
    
    @JsonIgnore
    private Contratante contratanteDelMunicipioRespthisContratanteInstance;

    @JsonProperty("p_evcmunicipio_oid")
    private MunicipioOid contratanteDelMunicipioRespevcMunicipio;
    
    @JsonIgnore
    private Municipio contratanteDelMunicipioRespevcMunicipioInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkContratanteDelMunicipioRespthisContratante();
        checkContratanteDelMunicipioRespevcMunicipio();
    }

    @JsonIgnore
    public ContratanteOid getContratanteDelMunicipioRespthisContratante() {
        return this.contratanteDelMunicipioRespthisContratante;
    }
    
    public void setContratanteDelMunicipioRespthisContratante(ContratanteOid contratanteDelMunicipioRespthisContratante) {
        this.contratanteDelMunicipioRespthisContratante = contratanteDelMunicipioRespthisContratante;
    }

    @JsonIgnore
    public Contratante getContratanteDelMunicipioRespthisContratanteInstance() {
        return this.contratanteDelMunicipioRespthisContratanteInstance;
    }
    
    public void setContratanteDelMunicipioRespthisContratanteInstance(Contratante contratanteDelMunicipioRespthisContratante) {
        this.contratanteDelMunicipioRespthisContratanteInstance = contratanteDelMunicipioRespthisContratante;
        this.contratanteDelMunicipioRespthisContratante = contratanteDelMunicipioRespthisContratante != null ? contratanteDelMunicipioRespthisContratante.getOid() : null;
    }

    private void checkContratanteDelMunicipioRespthisContratante() throws NotNullArgumentException {
        if(this.getContratanteDelMunicipioRespthisContratanteInstance() == null || this.getContratanteDelMunicipioRespthisContratanteInstance().isNull()) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_DELMUNICIPIORES, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_DELMUNICIPIORES_CONTRATANTEDELMUNICIPIORESPTHISCONTRATANTE, ContratanteConstants.SERV_ALIAS_DELMUNICIPIORES, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_DELMUNICIPIORES_CONTRATANTEDELMUNICIPIORESPTHISCONTRATANTE);
        }
    }

    @JsonIgnore
    public MunicipioOid getContratanteDelMunicipioRespevcMunicipio() {
        return this.contratanteDelMunicipioRespevcMunicipio;
    }
    
    public void setContratanteDelMunicipioRespevcMunicipio(MunicipioOid contratanteDelMunicipioRespevcMunicipio) {
        this.contratanteDelMunicipioRespevcMunicipio = contratanteDelMunicipioRespevcMunicipio;
    }

    @JsonIgnore
    public Municipio getContratanteDelMunicipioRespevcMunicipioInstance() {
        return this.contratanteDelMunicipioRespevcMunicipioInstance;
    }
    
    public void setContratanteDelMunicipioRespevcMunicipioInstance(Municipio contratanteDelMunicipioRespevcMunicipio) {
        this.contratanteDelMunicipioRespevcMunicipioInstance = contratanteDelMunicipioRespevcMunicipio;
        this.contratanteDelMunicipioRespevcMunicipio = contratanteDelMunicipioRespevcMunicipio != null ? contratanteDelMunicipioRespevcMunicipio.getOid() : null;
    }

    private void checkContratanteDelMunicipioRespevcMunicipio() throws NotNullArgumentException {
        if(this.getContratanteDelMunicipioRespevcMunicipioInstance() == null || this.getContratanteDelMunicipioRespevcMunicipioInstance().isNull()) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_DELMUNICIPIORES, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_DELMUNICIPIORES_CONTRATANTEDELMUNICIPIORESPEVCMUNICIPIO, ContratanteConstants.SERV_ALIAS_DELMUNICIPIORES, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_DELMUNICIPIORES_CONTRATANTEDELMUNICIPIORESPEVCMUNICIPIO);
        }
    }
}
