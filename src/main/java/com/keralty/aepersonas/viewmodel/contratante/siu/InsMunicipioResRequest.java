package com.keralty.aepersonas.viewmodel.contratante.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.ContratanteConstants;
import com.keralty.aepersonas.persistence.Contratante;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.ContratanteOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;

public class InsMunicipioResRequest {

    @JsonProperty("p_thiscontratante_oid")
    private ContratanteOid contratanteInsMunicipioRespthisContratante;
    
    @JsonIgnore
    private Contratante contratanteInsMunicipioRespthisContratanteInstance;

    @JsonProperty("p_evcmunicipio_oid")
    private MunicipioOid contratanteInsMunicipioRespevcMunicipio;
    
    @JsonIgnore
    private Municipio contratanteInsMunicipioRespevcMunicipioInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkContratanteInsMunicipioRespthisContratante();
        checkContratanteInsMunicipioRespevcMunicipio();
    }

    @JsonIgnore
    public ContratanteOid getContratanteInsMunicipioRespthisContratante() {
        return this.contratanteInsMunicipioRespthisContratante;
    }
    
    public void setContratanteInsMunicipioRespthisContratante(ContratanteOid contratanteInsMunicipioRespthisContratante) {
        this.contratanteInsMunicipioRespthisContratante = contratanteInsMunicipioRespthisContratante;
    }

    @JsonIgnore
    public Contratante getContratanteInsMunicipioRespthisContratanteInstance() {
        return this.contratanteInsMunicipioRespthisContratanteInstance;
    }
    
    public void setContratanteInsMunicipioRespthisContratanteInstance(Contratante contratanteInsMunicipioRespthisContratante) {
        this.contratanteInsMunicipioRespthisContratanteInstance = contratanteInsMunicipioRespthisContratante;
        this.contratanteInsMunicipioRespthisContratante = contratanteInsMunicipioRespthisContratante != null ? contratanteInsMunicipioRespthisContratante.getOid() : null;
    }

    private void checkContratanteInsMunicipioRespthisContratante() throws NotNullArgumentException {
        if(this.getContratanteInsMunicipioRespthisContratanteInstance() == null || this.getContratanteInsMunicipioRespthisContratanteInstance().isNull()) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_INSMUNICIPIORES, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_INSMUNICIPIORES_CONTRATANTEINSMUNICIPIORESPTHISCONTRATANTE, ContratanteConstants.SERV_ALIAS_INSMUNICIPIORES, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_INSMUNICIPIORES_CONTRATANTEINSMUNICIPIORESPTHISCONTRATANTE);
        }
    }

    @JsonIgnore
    public MunicipioOid getContratanteInsMunicipioRespevcMunicipio() {
        return this.contratanteInsMunicipioRespevcMunicipio;
    }
    
    public void setContratanteInsMunicipioRespevcMunicipio(MunicipioOid contratanteInsMunicipioRespevcMunicipio) {
        this.contratanteInsMunicipioRespevcMunicipio = contratanteInsMunicipioRespevcMunicipio;
    }

    @JsonIgnore
    public Municipio getContratanteInsMunicipioRespevcMunicipioInstance() {
        return this.contratanteInsMunicipioRespevcMunicipioInstance;
    }
    
    public void setContratanteInsMunicipioRespevcMunicipioInstance(Municipio contratanteInsMunicipioRespevcMunicipio) {
        this.contratanteInsMunicipioRespevcMunicipioInstance = contratanteInsMunicipioRespevcMunicipio;
        this.contratanteInsMunicipioRespevcMunicipio = contratanteInsMunicipioRespevcMunicipio != null ? contratanteInsMunicipioRespevcMunicipio.getOid() : null;
    }

    private void checkContratanteInsMunicipioRespevcMunicipio() throws NotNullArgumentException {
        if(this.getContratanteInsMunicipioRespevcMunicipioInstance() == null || this.getContratanteInsMunicipioRespevcMunicipioInstance().isNull()) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_INSMUNICIPIORES, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_INSMUNICIPIORES_CONTRATANTEINSMUNICIPIORESPEVCMUNICIPIO, ContratanteConstants.SERV_ALIAS_INSMUNICIPIORES, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_INSMUNICIPIORES_CONTRATANTEINSMUNICIPIORESPEVCMUNICIPIO);
        }
    }
}
