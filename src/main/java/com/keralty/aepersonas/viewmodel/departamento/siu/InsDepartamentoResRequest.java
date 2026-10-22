package com.keralty.aepersonas.viewmodel.departamento.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.DepartamentoConstants;
import com.keralty.aepersonas.persistence.Contratante;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.oid.ContratanteOid;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;

public class InsDepartamentoResRequest {

    @JsonProperty("p_thisdepartamento_oid")
    private DepartamentoOid departamentoInsDepartamentoRespthisDepartamento;
    
    @JsonIgnore
    private Departamento departamentoInsDepartamentoRespthisDepartamentoInstance;

    @JsonProperty("p_evccontratante_oid")
    private ContratanteOid departamentoInsDepartamentoRespevcContratante;
    
    @JsonIgnore
    private Contratante departamentoInsDepartamentoRespevcContratanteInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkDepartamentoInsDepartamentoRespthisDepartamento();
        checkDepartamentoInsDepartamentoRespevcContratante();
    }

    @JsonIgnore
    public DepartamentoOid getDepartamentoInsDepartamentoRespthisDepartamento() {
        return this.departamentoInsDepartamentoRespthisDepartamento;
    }
    
    public void setDepartamentoInsDepartamentoRespthisDepartamento(DepartamentoOid departamentoInsDepartamentoRespthisDepartamento) {
        this.departamentoInsDepartamentoRespthisDepartamento = departamentoInsDepartamentoRespthisDepartamento;
    }

    @JsonIgnore
    public Departamento getDepartamentoInsDepartamentoRespthisDepartamentoInstance() {
        return this.departamentoInsDepartamentoRespthisDepartamentoInstance;
    }
    
    public void setDepartamentoInsDepartamentoRespthisDepartamentoInstance(Departamento departamentoInsDepartamentoRespthisDepartamento) {
        this.departamentoInsDepartamentoRespthisDepartamentoInstance = departamentoInsDepartamentoRespthisDepartamento;
        this.departamentoInsDepartamentoRespthisDepartamento = departamentoInsDepartamentoRespthisDepartamento != null ? departamentoInsDepartamentoRespthisDepartamento.getOid() : null;
    }

    private void checkDepartamentoInsDepartamentoRespthisDepartamento() throws NotNullArgumentException {
        if(this.getDepartamentoInsDepartamentoRespthisDepartamentoInstance() == null || this.getDepartamentoInsDepartamentoRespthisDepartamentoInstance().isNull()) {
            throw new NotNullArgumentException(DepartamentoConstants.SERV_ID_INSDEPARTAMENTORES, DepartamentoConstants.CLASS_ID, DepartamentoConstants.ARG_ID_INSDEPARTAMENTORES_DEPARTAMENTOINSDEPARTAMENTORESPTHISDEPARTAMENTO, DepartamentoConstants.SERV_ALIAS_INSDEPARTAMENTORES, DepartamentoConstants.CLASS_ALIAS, DepartamentoConstants.ARG_ALIAS_INSDEPARTAMENTORES_DEPARTAMENTOINSDEPARTAMENTORESPTHISDEPARTAMENTO);
        }
    }

    @JsonIgnore
    public ContratanteOid getDepartamentoInsDepartamentoRespevcContratante() {
        return this.departamentoInsDepartamentoRespevcContratante;
    }
    
    public void setDepartamentoInsDepartamentoRespevcContratante(ContratanteOid departamentoInsDepartamentoRespevcContratante) {
        this.departamentoInsDepartamentoRespevcContratante = departamentoInsDepartamentoRespevcContratante;
    }

    @JsonIgnore
    public Contratante getDepartamentoInsDepartamentoRespevcContratanteInstance() {
        return this.departamentoInsDepartamentoRespevcContratanteInstance;
    }
    
    public void setDepartamentoInsDepartamentoRespevcContratanteInstance(Contratante departamentoInsDepartamentoRespevcContratante) {
        this.departamentoInsDepartamentoRespevcContratanteInstance = departamentoInsDepartamentoRespevcContratante;
        this.departamentoInsDepartamentoRespevcContratante = departamentoInsDepartamentoRespevcContratante != null ? departamentoInsDepartamentoRespevcContratante.getOid() : null;
    }

    private void checkDepartamentoInsDepartamentoRespevcContratante() throws NotNullArgumentException {
        if(this.getDepartamentoInsDepartamentoRespevcContratanteInstance() == null || this.getDepartamentoInsDepartamentoRespevcContratanteInstance().isNull()) {
            throw new NotNullArgumentException(DepartamentoConstants.SERV_ID_INSDEPARTAMENTORES, DepartamentoConstants.CLASS_ID, DepartamentoConstants.ARG_ID_INSDEPARTAMENTORES_DEPARTAMENTOINSDEPARTAMENTORESPEVCCONTRATANTE, DepartamentoConstants.SERV_ALIAS_INSDEPARTAMENTORES, DepartamentoConstants.CLASS_ALIAS, DepartamentoConstants.ARG_ALIAS_INSDEPARTAMENTORES_DEPARTAMENTOINSDEPARTAMENTORESPEVCCONTRATANTE);
        }
    }
}
