package com.keralty.aepersonas.viewmodel.contratante.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.ContratanteConstants;
import com.keralty.aepersonas.persistence.Contratante;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.oid.ContratanteOid;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;

public class DelDepartamentoNacContratanteRequest {

    @JsonProperty("p_thiscontratante_oid")
    private ContratanteOid contratanteDelDepartamentoNacContratantepthisContratante;
    
    @JsonIgnore
    private Contratante contratanteDelDepartamentoNacContratantepthisContratanteInstance;

    @JsonProperty("p_evcdepartamento_oid")
    private DepartamentoOid contratanteDelDepartamentoNacContratantepevcDepartamento;
    
    @JsonIgnore
    private Departamento contratanteDelDepartamentoNacContratantepevcDepartamentoInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkContratanteDelDepartamentoNacContratantepthisContratante();
        checkContratanteDelDepartamentoNacContratantepevcDepartamento();
    }

    @JsonIgnore
    public ContratanteOid getContratanteDelDepartamentoNacContratantepthisContratante() {
        return this.contratanteDelDepartamentoNacContratantepthisContratante;
    }
    
    public void setContratanteDelDepartamentoNacContratantepthisContratante(ContratanteOid contratanteDelDepartamentoNacContratantepthisContratante) {
        this.contratanteDelDepartamentoNacContratantepthisContratante = contratanteDelDepartamentoNacContratantepthisContratante;
    }

    @JsonIgnore
    public Contratante getContratanteDelDepartamentoNacContratantepthisContratanteInstance() {
        return this.contratanteDelDepartamentoNacContratantepthisContratanteInstance;
    }
    
    public void setContratanteDelDepartamentoNacContratantepthisContratanteInstance(Contratante contratanteDelDepartamentoNacContratantepthisContratante) {
        this.contratanteDelDepartamentoNacContratantepthisContratanteInstance = contratanteDelDepartamentoNacContratantepthisContratante;
        this.contratanteDelDepartamentoNacContratantepthisContratante = contratanteDelDepartamentoNacContratantepthisContratante != null ? contratanteDelDepartamentoNacContratantepthisContratante.getOid() : null;
    }

    private void checkContratanteDelDepartamentoNacContratantepthisContratante() throws NotNullArgumentException {
        if(this.getContratanteDelDepartamentoNacContratantepthisContratanteInstance() == null || this.getContratanteDelDepartamentoNacContratantepthisContratanteInstance().isNull()) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_DELDEPARTAMENTONACCONTRATANTE, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_DELDEPARTAMENTONACCONTRATANTE_CONTRATANTEDELDEPARTAMENTONACCONTRATANTEPTHISCONTRATANTE, ContratanteConstants.SERV_ALIAS_DELDEPARTAMENTONACCONTRATANTE, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_DELDEPARTAMENTONACCONTRATANTE_CONTRATANTEDELDEPARTAMENTONACCONTRATANTEPTHISCONTRATANTE);
        }
    }

    @JsonIgnore
    public DepartamentoOid getContratanteDelDepartamentoNacContratantepevcDepartamento() {
        return this.contratanteDelDepartamentoNacContratantepevcDepartamento;
    }
    
    public void setContratanteDelDepartamentoNacContratantepevcDepartamento(DepartamentoOid contratanteDelDepartamentoNacContratantepevcDepartamento) {
        this.contratanteDelDepartamentoNacContratantepevcDepartamento = contratanteDelDepartamentoNacContratantepevcDepartamento;
    }

    @JsonIgnore
    public Departamento getContratanteDelDepartamentoNacContratantepevcDepartamentoInstance() {
        return this.contratanteDelDepartamentoNacContratantepevcDepartamentoInstance;
    }
    
    public void setContratanteDelDepartamentoNacContratantepevcDepartamentoInstance(Departamento contratanteDelDepartamentoNacContratantepevcDepartamento) {
        this.contratanteDelDepartamentoNacContratantepevcDepartamentoInstance = contratanteDelDepartamentoNacContratantepevcDepartamento;
        this.contratanteDelDepartamentoNacContratantepevcDepartamento = contratanteDelDepartamentoNacContratantepevcDepartamento != null ? contratanteDelDepartamentoNacContratantepevcDepartamento.getOid() : null;
    }

    private void checkContratanteDelDepartamentoNacContratantepevcDepartamento() throws NotNullArgumentException {
        if(this.getContratanteDelDepartamentoNacContratantepevcDepartamentoInstance() == null || this.getContratanteDelDepartamentoNacContratantepevcDepartamentoInstance().isNull()) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_DELDEPARTAMENTONACCONTRATANTE, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_DELDEPARTAMENTONACCONTRATANTE_CONTRATANTEDELDEPARTAMENTONACCONTRATANTEPEVCDEPARTAMENTO, ContratanteConstants.SERV_ALIAS_DELDEPARTAMENTONACCONTRATANTE, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_DELDEPARTAMENTONACCONTRATANTE_CONTRATANTEDELDEPARTAMENTONACCONTRATANTEPEVCDEPARTAMENTO);
        }
    }
}
