package com.keralty.aepersonas.viewmodel.contratante.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.ContratanteConstants;
import com.keralty.aepersonas.persistence.Contratante;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.oid.ContratanteOid;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;

public class InsDepartamentoNacContratanteRequest {

    @JsonProperty("p_thiscontratante_oid")
    private ContratanteOid contratanteInsDepartamentoNacContratantepthisContratante;
    
    @JsonIgnore
    private Contratante contratanteInsDepartamentoNacContratantepthisContratanteInstance;

    @JsonProperty("p_evcdepartamento_oid")
    private DepartamentoOid contratanteInsDepartamentoNacContratantepevcDepartamento;
    
    @JsonIgnore
    private Departamento contratanteInsDepartamentoNacContratantepevcDepartamentoInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkContratanteInsDepartamentoNacContratantepthisContratante();
        checkContratanteInsDepartamentoNacContratantepevcDepartamento();
    }

    @JsonIgnore
    public ContratanteOid getContratanteInsDepartamentoNacContratantepthisContratante() {
        return this.contratanteInsDepartamentoNacContratantepthisContratante;
    }
    
    public void setContratanteInsDepartamentoNacContratantepthisContratante(ContratanteOid contratanteInsDepartamentoNacContratantepthisContratante) {
        this.contratanteInsDepartamentoNacContratantepthisContratante = contratanteInsDepartamentoNacContratantepthisContratante;
    }

    @JsonIgnore
    public Contratante getContratanteInsDepartamentoNacContratantepthisContratanteInstance() {
        return this.contratanteInsDepartamentoNacContratantepthisContratanteInstance;
    }
    
    public void setContratanteInsDepartamentoNacContratantepthisContratanteInstance(Contratante contratanteInsDepartamentoNacContratantepthisContratante) {
        this.contratanteInsDepartamentoNacContratantepthisContratanteInstance = contratanteInsDepartamentoNacContratantepthisContratante;
        this.contratanteInsDepartamentoNacContratantepthisContratante = contratanteInsDepartamentoNacContratantepthisContratante != null ? contratanteInsDepartamentoNacContratantepthisContratante.getOid() : null;
    }

    private void checkContratanteInsDepartamentoNacContratantepthisContratante() throws NotNullArgumentException {
        if(this.getContratanteInsDepartamentoNacContratantepthisContratanteInstance() == null || this.getContratanteInsDepartamentoNacContratantepthisContratanteInstance().isNull()) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_INSDEPARTAMENTONACCONTRATANTE, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_INSDEPARTAMENTONACCONTRATANTE_CONTRATANTEINSDEPARTAMENTONACCONTRATANTEPTHISCONTRATANTE, ContratanteConstants.SERV_ALIAS_INSDEPARTAMENTONACCONTRATANTE, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_INSDEPARTAMENTONACCONTRATANTE_CONTRATANTEINSDEPARTAMENTONACCONTRATANTEPTHISCONTRATANTE);
        }
    }

    @JsonIgnore
    public DepartamentoOid getContratanteInsDepartamentoNacContratantepevcDepartamento() {
        return this.contratanteInsDepartamentoNacContratantepevcDepartamento;
    }
    
    public void setContratanteInsDepartamentoNacContratantepevcDepartamento(DepartamentoOid contratanteInsDepartamentoNacContratantepevcDepartamento) {
        this.contratanteInsDepartamentoNacContratantepevcDepartamento = contratanteInsDepartamentoNacContratantepevcDepartamento;
    }

    @JsonIgnore
    public Departamento getContratanteInsDepartamentoNacContratantepevcDepartamentoInstance() {
        return this.contratanteInsDepartamentoNacContratantepevcDepartamentoInstance;
    }
    
    public void setContratanteInsDepartamentoNacContratantepevcDepartamentoInstance(Departamento contratanteInsDepartamentoNacContratantepevcDepartamento) {
        this.contratanteInsDepartamentoNacContratantepevcDepartamentoInstance = contratanteInsDepartamentoNacContratantepevcDepartamento;
        this.contratanteInsDepartamentoNacContratantepevcDepartamento = contratanteInsDepartamentoNacContratantepevcDepartamento != null ? contratanteInsDepartamentoNacContratantepevcDepartamento.getOid() : null;
    }

    private void checkContratanteInsDepartamentoNacContratantepevcDepartamento() throws NotNullArgumentException {
        if(this.getContratanteInsDepartamentoNacContratantepevcDepartamentoInstance() == null || this.getContratanteInsDepartamentoNacContratantepevcDepartamentoInstance().isNull()) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_INSDEPARTAMENTONACCONTRATANTE, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_INSDEPARTAMENTONACCONTRATANTE_CONTRATANTEINSDEPARTAMENTONACCONTRATANTEPEVCDEPARTAMENTO, ContratanteConstants.SERV_ALIAS_INSDEPARTAMENTONACCONTRATANTE, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_INSDEPARTAMENTONACCONTRATANTE_CONTRATANTEINSDEPARTAMENTONACCONTRATANTEPEVCDEPARTAMENTO);
        }
    }
}
