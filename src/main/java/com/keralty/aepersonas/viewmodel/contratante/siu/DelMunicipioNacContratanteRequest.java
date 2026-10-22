package com.keralty.aepersonas.viewmodel.contratante.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.ContratanteConstants;
import com.keralty.aepersonas.persistence.Contratante;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.ContratanteOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;

public class DelMunicipioNacContratanteRequest {

    @JsonProperty("p_thiscontratante_oid")
    private ContratanteOid contratanteDelMunicipioNacContratantepthisContratante;
    
    @JsonIgnore
    private Contratante contratanteDelMunicipioNacContratantepthisContratanteInstance;

    @JsonProperty("p_evcmunicipio_oid")
    private MunicipioOid contratanteDelMunicipioNacContratantepevcMunicipio;
    
    @JsonIgnore
    private Municipio contratanteDelMunicipioNacContratantepevcMunicipioInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkContratanteDelMunicipioNacContratantepthisContratante();
        checkContratanteDelMunicipioNacContratantepevcMunicipio();
    }

    @JsonIgnore
    public ContratanteOid getContratanteDelMunicipioNacContratantepthisContratante() {
        return this.contratanteDelMunicipioNacContratantepthisContratante;
    }
    
    public void setContratanteDelMunicipioNacContratantepthisContratante(ContratanteOid contratanteDelMunicipioNacContratantepthisContratante) {
        this.contratanteDelMunicipioNacContratantepthisContratante = contratanteDelMunicipioNacContratantepthisContratante;
    }

    @JsonIgnore
    public Contratante getContratanteDelMunicipioNacContratantepthisContratanteInstance() {
        return this.contratanteDelMunicipioNacContratantepthisContratanteInstance;
    }
    
    public void setContratanteDelMunicipioNacContratantepthisContratanteInstance(Contratante contratanteDelMunicipioNacContratantepthisContratante) {
        this.contratanteDelMunicipioNacContratantepthisContratanteInstance = contratanteDelMunicipioNacContratantepthisContratante;
        this.contratanteDelMunicipioNacContratantepthisContratante = contratanteDelMunicipioNacContratantepthisContratante != null ? contratanteDelMunicipioNacContratantepthisContratante.getOid() : null;
    }

    private void checkContratanteDelMunicipioNacContratantepthisContratante() throws NotNullArgumentException {
        if(this.getContratanteDelMunicipioNacContratantepthisContratanteInstance() == null || this.getContratanteDelMunicipioNacContratantepthisContratanteInstance().isNull()) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_DELMUNICIPIONACCONTRATANTE, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_DELMUNICIPIONACCONTRATANTE_CONTRATANTEDELMUNICIPIONACCONTRATANTEPTHISCONTRATANTE, ContratanteConstants.SERV_ALIAS_DELMUNICIPIONACCONTRATANTE, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_DELMUNICIPIONACCONTRATANTE_CONTRATANTEDELMUNICIPIONACCONTRATANTEPTHISCONTRATANTE);
        }
    }

    @JsonIgnore
    public MunicipioOid getContratanteDelMunicipioNacContratantepevcMunicipio() {
        return this.contratanteDelMunicipioNacContratantepevcMunicipio;
    }
    
    public void setContratanteDelMunicipioNacContratantepevcMunicipio(MunicipioOid contratanteDelMunicipioNacContratantepevcMunicipio) {
        this.contratanteDelMunicipioNacContratantepevcMunicipio = contratanteDelMunicipioNacContratantepevcMunicipio;
    }

    @JsonIgnore
    public Municipio getContratanteDelMunicipioNacContratantepevcMunicipioInstance() {
        return this.contratanteDelMunicipioNacContratantepevcMunicipioInstance;
    }
    
    public void setContratanteDelMunicipioNacContratantepevcMunicipioInstance(Municipio contratanteDelMunicipioNacContratantepevcMunicipio) {
        this.contratanteDelMunicipioNacContratantepevcMunicipioInstance = contratanteDelMunicipioNacContratantepevcMunicipio;
        this.contratanteDelMunicipioNacContratantepevcMunicipio = contratanteDelMunicipioNacContratantepevcMunicipio != null ? contratanteDelMunicipioNacContratantepevcMunicipio.getOid() : null;
    }

    private void checkContratanteDelMunicipioNacContratantepevcMunicipio() throws NotNullArgumentException {
        if(this.getContratanteDelMunicipioNacContratantepevcMunicipioInstance() == null || this.getContratanteDelMunicipioNacContratantepevcMunicipioInstance().isNull()) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_DELMUNICIPIONACCONTRATANTE, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_DELMUNICIPIONACCONTRATANTE_CONTRATANTEDELMUNICIPIONACCONTRATANTEPEVCMUNICIPIO, ContratanteConstants.SERV_ALIAS_DELMUNICIPIONACCONTRATANTE, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_DELMUNICIPIONACCONTRATANTE_CONTRATANTEDELMUNICIPIONACCONTRATANTEPEVCMUNICIPIO);
        }
    }
}
