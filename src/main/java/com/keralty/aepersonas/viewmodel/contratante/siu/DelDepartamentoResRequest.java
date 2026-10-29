package com.keralty.aepersonas.viewmodel.contratante.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.ContratanteConstants;
import com.keralty.aepersonas.persistence.Contratante;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.oid.ContratanteOid;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;

public class DelDepartamentoResRequest {

    @JsonProperty("p_thiscontratante_oid")
    private ContratanteOid contratanteDelDepartamentoRespthisContratante;
    
    @JsonIgnore
    private Contratante contratanteDelDepartamentoRespthisContratanteInstance;

    @JsonProperty("p_evcdepartamento_oid")
    private DepartamentoOid contratanteDelDepartamentoRespevcDepartamento;
    
    @JsonIgnore
    private Departamento contratanteDelDepartamentoRespevcDepartamentoInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkContratanteDelDepartamentoRespthisContratante();
        checkContratanteDelDepartamentoRespevcDepartamento();
    }

    @JsonIgnore
    public ContratanteOid getContratanteDelDepartamentoRespthisContratante() {
        return this.contratanteDelDepartamentoRespthisContratante;
    }
    
    public void setContratanteDelDepartamentoRespthisContratante(ContratanteOid contratanteDelDepartamentoRespthisContratante) {
        this.contratanteDelDepartamentoRespthisContratante = contratanteDelDepartamentoRespthisContratante;
    }

    @JsonIgnore
    public Contratante getContratanteDelDepartamentoRespthisContratanteInstance() {
        return this.contratanteDelDepartamentoRespthisContratanteInstance;
    }
    
    public void setContratanteDelDepartamentoRespthisContratanteInstance(Contratante contratanteDelDepartamentoRespthisContratante) {
        this.contratanteDelDepartamentoRespthisContratanteInstance = contratanteDelDepartamentoRespthisContratante;
        this.contratanteDelDepartamentoRespthisContratante = contratanteDelDepartamentoRespthisContratante != null ? contratanteDelDepartamentoRespthisContratante.getOid() : null;
    }

    private void checkContratanteDelDepartamentoRespthisContratante() throws NotNullArgumentException {
        if(this.getContratanteDelDepartamentoRespthisContratanteInstance() == null || this.getContratanteDelDepartamentoRespthisContratanteInstance().isNull()) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_DELDEPARTAMENTORES, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_DELDEPARTAMENTORES_CONTRATANTEDELDEPARTAMENTORESPTHISCONTRATANTE, ContratanteConstants.SERV_ALIAS_DELDEPARTAMENTORES, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_DELDEPARTAMENTORES_CONTRATANTEDELDEPARTAMENTORESPTHISCONTRATANTE);
        }
    }

    @JsonIgnore
    public DepartamentoOid getContratanteDelDepartamentoRespevcDepartamento() {
        return this.contratanteDelDepartamentoRespevcDepartamento;
    }
    
    public void setContratanteDelDepartamentoRespevcDepartamento(DepartamentoOid contratanteDelDepartamentoRespevcDepartamento) {
        this.contratanteDelDepartamentoRespevcDepartamento = contratanteDelDepartamentoRespevcDepartamento;
    }

    @JsonIgnore
    public Departamento getContratanteDelDepartamentoRespevcDepartamentoInstance() {
        return this.contratanteDelDepartamentoRespevcDepartamentoInstance;
    }
    
    public void setContratanteDelDepartamentoRespevcDepartamentoInstance(Departamento contratanteDelDepartamentoRespevcDepartamento) {
        this.contratanteDelDepartamentoRespevcDepartamentoInstance = contratanteDelDepartamentoRespevcDepartamento;
        this.contratanteDelDepartamentoRespevcDepartamento = contratanteDelDepartamentoRespevcDepartamento != null ? contratanteDelDepartamentoRespevcDepartamento.getOid() : null;
    }

    private void checkContratanteDelDepartamentoRespevcDepartamento() throws NotNullArgumentException {
        if(this.getContratanteDelDepartamentoRespevcDepartamentoInstance() == null || this.getContratanteDelDepartamentoRespevcDepartamentoInstance().isNull()) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_DELDEPARTAMENTORES, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_DELDEPARTAMENTORES_CONTRATANTEDELDEPARTAMENTORESPEVCDEPARTAMENTO, ContratanteConstants.SERV_ALIAS_DELDEPARTAMENTORES, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_DELDEPARTAMENTORES_CONTRATANTEDELDEPARTAMENTORESPEVCDEPARTAMENTO);
        }
    }
}
