package com.keralty.aepersonas.viewmodel.departamento.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.DepartamentoConstants;
import com.keralty.aepersonas.persistence.Contratante;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.oid.ContratanteOid;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;

public class DelDepartamentoResRequest {

    @JsonProperty("p_thisdepartamento_oid")
    private DepartamentoOid departamentoDelDepartamentoRespthisDepartamento;
    
    @JsonIgnore
    private Departamento departamentoDelDepartamentoRespthisDepartamentoInstance;

    @JsonProperty("p_evccontratante_oid")
    private ContratanteOid departamentoDelDepartamentoRespevcContratante;
    
    @JsonIgnore
    private Contratante departamentoDelDepartamentoRespevcContratanteInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkDepartamentoDelDepartamentoRespthisDepartamento();
        checkDepartamentoDelDepartamentoRespevcContratante();
    }

    @JsonIgnore
    public DepartamentoOid getDepartamentoDelDepartamentoRespthisDepartamento() {
        return this.departamentoDelDepartamentoRespthisDepartamento;
    }
    
    public void setDepartamentoDelDepartamentoRespthisDepartamento(DepartamentoOid departamentoDelDepartamentoRespthisDepartamento) {
        this.departamentoDelDepartamentoRespthisDepartamento = departamentoDelDepartamentoRespthisDepartamento;
    }

    @JsonIgnore
    public Departamento getDepartamentoDelDepartamentoRespthisDepartamentoInstance() {
        return this.departamentoDelDepartamentoRespthisDepartamentoInstance;
    }
    
    public void setDepartamentoDelDepartamentoRespthisDepartamentoInstance(Departamento departamentoDelDepartamentoRespthisDepartamento) {
        this.departamentoDelDepartamentoRespthisDepartamentoInstance = departamentoDelDepartamentoRespthisDepartamento;
        this.departamentoDelDepartamentoRespthisDepartamento = departamentoDelDepartamentoRespthisDepartamento != null ? departamentoDelDepartamentoRespthisDepartamento.getOid() : null;
    }

    private void checkDepartamentoDelDepartamentoRespthisDepartamento() throws NotNullArgumentException {
        if(this.getDepartamentoDelDepartamentoRespthisDepartamentoInstance() == null || this.getDepartamentoDelDepartamentoRespthisDepartamentoInstance().isNull()) {
            throw new NotNullArgumentException(DepartamentoConstants.SERV_ID_DELDEPARTAMENTORES, DepartamentoConstants.CLASS_ID, DepartamentoConstants.ARG_ID_DELDEPARTAMENTORES_DEPARTAMENTODELDEPARTAMENTORESPTHISDEPARTAMENTO, DepartamentoConstants.SERV_ALIAS_DELDEPARTAMENTORES, DepartamentoConstants.CLASS_ALIAS, DepartamentoConstants.ARG_ALIAS_DELDEPARTAMENTORES_DEPARTAMENTODELDEPARTAMENTORESPTHISDEPARTAMENTO);
        }
    }

    @JsonIgnore
    public ContratanteOid getDepartamentoDelDepartamentoRespevcContratante() {
        return this.departamentoDelDepartamentoRespevcContratante;
    }
    
    public void setDepartamentoDelDepartamentoRespevcContratante(ContratanteOid departamentoDelDepartamentoRespevcContratante) {
        this.departamentoDelDepartamentoRespevcContratante = departamentoDelDepartamentoRespevcContratante;
    }

    @JsonIgnore
    public Contratante getDepartamentoDelDepartamentoRespevcContratanteInstance() {
        return this.departamentoDelDepartamentoRespevcContratanteInstance;
    }
    
    public void setDepartamentoDelDepartamentoRespevcContratanteInstance(Contratante departamentoDelDepartamentoRespevcContratante) {
        this.departamentoDelDepartamentoRespevcContratanteInstance = departamentoDelDepartamentoRespevcContratante;
        this.departamentoDelDepartamentoRespevcContratante = departamentoDelDepartamentoRespevcContratante != null ? departamentoDelDepartamentoRespevcContratante.getOid() : null;
    }

    private void checkDepartamentoDelDepartamentoRespevcContratante() throws NotNullArgumentException {
        if(this.getDepartamentoDelDepartamentoRespevcContratanteInstance() == null || this.getDepartamentoDelDepartamentoRespevcContratanteInstance().isNull()) {
            throw new NotNullArgumentException(DepartamentoConstants.SERV_ID_DELDEPARTAMENTORES, DepartamentoConstants.CLASS_ID, DepartamentoConstants.ARG_ID_DELDEPARTAMENTORES_DEPARTAMENTODELDEPARTAMENTORESPEVCCONTRATANTE, DepartamentoConstants.SERV_ALIAS_DELDEPARTAMENTORES, DepartamentoConstants.CLASS_ALIAS, DepartamentoConstants.ARG_ALIAS_DELDEPARTAMENTORES_DEPARTAMENTODELDEPARTAMENTORESPEVCCONTRATANTE);
        }
    }
}
