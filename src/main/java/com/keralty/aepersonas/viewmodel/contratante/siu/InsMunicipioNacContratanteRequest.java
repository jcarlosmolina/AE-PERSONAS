package com.keralty.aepersonas.viewmodel.contratante.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.ContratanteConstants;
import com.keralty.aepersonas.persistence.Contratante;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.ContratanteOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;

public class InsMunicipioNacContratanteRequest {

    @JsonProperty("p_thiscontratante_oid")
    private ContratanteOid contratanteInsMunicipioNacContratantepthisContratante;
    
    @JsonIgnore
    private Contratante contratanteInsMunicipioNacContratantepthisContratanteInstance;

    @JsonProperty("p_evcmunicipio_oid")
    private MunicipioOid contratanteInsMunicipioNacContratantepevcMunicipio;
    
    @JsonIgnore
    private Municipio contratanteInsMunicipioNacContratantepevcMunicipioInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkContratanteInsMunicipioNacContratantepthisContratante();
        checkContratanteInsMunicipioNacContratantepevcMunicipio();
    }

    @JsonIgnore
    public ContratanteOid getContratanteInsMunicipioNacContratantepthisContratante() {
        return this.contratanteInsMunicipioNacContratantepthisContratante;
    }
    
    public void setContratanteInsMunicipioNacContratantepthisContratante(ContratanteOid contratanteInsMunicipioNacContratantepthisContratante) {
        this.contratanteInsMunicipioNacContratantepthisContratante = contratanteInsMunicipioNacContratantepthisContratante;
    }

    @JsonIgnore
    public Contratante getContratanteInsMunicipioNacContratantepthisContratanteInstance() {
        return this.contratanteInsMunicipioNacContratantepthisContratanteInstance;
    }
    
    public void setContratanteInsMunicipioNacContratantepthisContratanteInstance(Contratante contratanteInsMunicipioNacContratantepthisContratante) {
        this.contratanteInsMunicipioNacContratantepthisContratanteInstance = contratanteInsMunicipioNacContratantepthisContratante;
        this.contratanteInsMunicipioNacContratantepthisContratante = contratanteInsMunicipioNacContratantepthisContratante != null ? contratanteInsMunicipioNacContratantepthisContratante.getOid() : null;
    }

    private void checkContratanteInsMunicipioNacContratantepthisContratante() throws NotNullArgumentException {
        if(this.getContratanteInsMunicipioNacContratantepthisContratanteInstance() == null || this.getContratanteInsMunicipioNacContratantepthisContratanteInstance().isNull()) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_INSMUNICIPIONACCONTRATANTE, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_INSMUNICIPIONACCONTRATANTE_CONTRATANTEINSMUNICIPIONACCONTRATANTEPTHISCONTRATANTE, ContratanteConstants.SERV_ALIAS_INSMUNICIPIONACCONTRATANTE, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_INSMUNICIPIONACCONTRATANTE_CONTRATANTEINSMUNICIPIONACCONTRATANTEPTHISCONTRATANTE);
        }
    }

    @JsonIgnore
    public MunicipioOid getContratanteInsMunicipioNacContratantepevcMunicipio() {
        return this.contratanteInsMunicipioNacContratantepevcMunicipio;
    }
    
    public void setContratanteInsMunicipioNacContratantepevcMunicipio(MunicipioOid contratanteInsMunicipioNacContratantepevcMunicipio) {
        this.contratanteInsMunicipioNacContratantepevcMunicipio = contratanteInsMunicipioNacContratantepevcMunicipio;
    }

    @JsonIgnore
    public Municipio getContratanteInsMunicipioNacContratantepevcMunicipioInstance() {
        return this.contratanteInsMunicipioNacContratantepevcMunicipioInstance;
    }
    
    public void setContratanteInsMunicipioNacContratantepevcMunicipioInstance(Municipio contratanteInsMunicipioNacContratantepevcMunicipio) {
        this.contratanteInsMunicipioNacContratantepevcMunicipioInstance = contratanteInsMunicipioNacContratantepevcMunicipio;
        this.contratanteInsMunicipioNacContratantepevcMunicipio = contratanteInsMunicipioNacContratantepevcMunicipio != null ? contratanteInsMunicipioNacContratantepevcMunicipio.getOid() : null;
    }

    private void checkContratanteInsMunicipioNacContratantepevcMunicipio() throws NotNullArgumentException {
        if(this.getContratanteInsMunicipioNacContratantepevcMunicipioInstance() == null || this.getContratanteInsMunicipioNacContratantepevcMunicipioInstance().isNull()) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_INSMUNICIPIONACCONTRATANTE, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_INSMUNICIPIONACCONTRATANTE_CONTRATANTEINSMUNICIPIONACCONTRATANTEPEVCMUNICIPIO, ContratanteConstants.SERV_ALIAS_INSMUNICIPIONACCONTRATANTE, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_INSMUNICIPIONACCONTRATANTE_CONTRATANTEINSMUNICIPIONACCONTRATANTEPEVCMUNICIPIO);
        }
    }
}
