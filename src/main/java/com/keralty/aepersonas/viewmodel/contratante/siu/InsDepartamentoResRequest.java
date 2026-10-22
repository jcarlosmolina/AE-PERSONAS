package com.keralty.aepersonas.viewmodel.contratante.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.ContratanteConstants;
import com.keralty.aepersonas.persistence.Contratante;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.oid.ContratanteOid;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;

public class InsDepartamentoResRequest {

    @JsonProperty("p_thiscontratante_oid")
    private ContratanteOid contratanteInsDepartamentoRespthisContratante;
    
    @JsonIgnore
    private Contratante contratanteInsDepartamentoRespthisContratanteInstance;

    @JsonProperty("p_evcdepartamento_oid")
    private DepartamentoOid contratanteInsDepartamentoRespevcDepartamento;
    
    @JsonIgnore
    private Departamento contratanteInsDepartamentoRespevcDepartamentoInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkContratanteInsDepartamentoRespthisContratante();
        checkContratanteInsDepartamentoRespevcDepartamento();
    }

    @JsonIgnore
    public ContratanteOid getContratanteInsDepartamentoRespthisContratante() {
        return this.contratanteInsDepartamentoRespthisContratante;
    }
    
    public void setContratanteInsDepartamentoRespthisContratante(ContratanteOid contratanteInsDepartamentoRespthisContratante) {
        this.contratanteInsDepartamentoRespthisContratante = contratanteInsDepartamentoRespthisContratante;
    }

    @JsonIgnore
    public Contratante getContratanteInsDepartamentoRespthisContratanteInstance() {
        return this.contratanteInsDepartamentoRespthisContratanteInstance;
    }
    
    public void setContratanteInsDepartamentoRespthisContratanteInstance(Contratante contratanteInsDepartamentoRespthisContratante) {
        this.contratanteInsDepartamentoRespthisContratanteInstance = contratanteInsDepartamentoRespthisContratante;
        this.contratanteInsDepartamentoRespthisContratante = contratanteInsDepartamentoRespthisContratante != null ? contratanteInsDepartamentoRespthisContratante.getOid() : null;
    }

    private void checkContratanteInsDepartamentoRespthisContratante() throws NotNullArgumentException {
        if(this.getContratanteInsDepartamentoRespthisContratanteInstance() == null || this.getContratanteInsDepartamentoRespthisContratanteInstance().isNull()) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_INSDEPARTAMENTORES, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_INSDEPARTAMENTORES_CONTRATANTEINSDEPARTAMENTORESPTHISCONTRATANTE, ContratanteConstants.SERV_ALIAS_INSDEPARTAMENTORES, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_INSDEPARTAMENTORES_CONTRATANTEINSDEPARTAMENTORESPTHISCONTRATANTE);
        }
    }

    @JsonIgnore
    public DepartamentoOid getContratanteInsDepartamentoRespevcDepartamento() {
        return this.contratanteInsDepartamentoRespevcDepartamento;
    }
    
    public void setContratanteInsDepartamentoRespevcDepartamento(DepartamentoOid contratanteInsDepartamentoRespevcDepartamento) {
        this.contratanteInsDepartamentoRespevcDepartamento = contratanteInsDepartamentoRespevcDepartamento;
    }

    @JsonIgnore
    public Departamento getContratanteInsDepartamentoRespevcDepartamentoInstance() {
        return this.contratanteInsDepartamentoRespevcDepartamentoInstance;
    }
    
    public void setContratanteInsDepartamentoRespevcDepartamentoInstance(Departamento contratanteInsDepartamentoRespevcDepartamento) {
        this.contratanteInsDepartamentoRespevcDepartamentoInstance = contratanteInsDepartamentoRespevcDepartamento;
        this.contratanteInsDepartamentoRespevcDepartamento = contratanteInsDepartamentoRespevcDepartamento != null ? contratanteInsDepartamentoRespevcDepartamento.getOid() : null;
    }

    private void checkContratanteInsDepartamentoRespevcDepartamento() throws NotNullArgumentException {
        if(this.getContratanteInsDepartamentoRespevcDepartamentoInstance() == null || this.getContratanteInsDepartamentoRespevcDepartamentoInstance().isNull()) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_INSDEPARTAMENTORES, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_INSDEPARTAMENTORES_CONTRATANTEINSDEPARTAMENTORESPEVCDEPARTAMENTO, ContratanteConstants.SERV_ALIAS_INSDEPARTAMENTORES, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_INSDEPARTAMENTORES_CONTRATANTEINSDEPARTAMENTORESPEVCDEPARTAMENTO);
        }
    }
}
