package com.keralty.aepersonas.viewmodel.departamento.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.DepartamentoConstants;
import com.keralty.aepersonas.persistence.Contratante;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.oid.ContratanteOid;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;

public class DelDepartamentoNacContratanteRequest {

    @JsonProperty("p_thisdepartamento_oid")
    private DepartamentoOid departamentoDelDepartamentoNacContratantepthisDepartamento;
    
    @JsonIgnore
    private Departamento departamentoDelDepartamentoNacContratantepthisDepartamentoInstance;

    @JsonProperty("p_evccontratante_oid")
    private ContratanteOid departamentoDelDepartamentoNacContratantepevcContratante;
    
    @JsonIgnore
    private Contratante departamentoDelDepartamentoNacContratantepevcContratanteInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkDepartamentoDelDepartamentoNacContratantepthisDepartamento();
        checkDepartamentoDelDepartamentoNacContratantepevcContratante();
    }

    @JsonIgnore
    public DepartamentoOid getDepartamentoDelDepartamentoNacContratantepthisDepartamento() {
        return this.departamentoDelDepartamentoNacContratantepthisDepartamento;
    }
    
    public void setDepartamentoDelDepartamentoNacContratantepthisDepartamento(DepartamentoOid departamentoDelDepartamentoNacContratantepthisDepartamento) {
        this.departamentoDelDepartamentoNacContratantepthisDepartamento = departamentoDelDepartamentoNacContratantepthisDepartamento;
    }

    @JsonIgnore
    public Departamento getDepartamentoDelDepartamentoNacContratantepthisDepartamentoInstance() {
        return this.departamentoDelDepartamentoNacContratantepthisDepartamentoInstance;
    }
    
    public void setDepartamentoDelDepartamentoNacContratantepthisDepartamentoInstance(Departamento departamentoDelDepartamentoNacContratantepthisDepartamento) {
        this.departamentoDelDepartamentoNacContratantepthisDepartamentoInstance = departamentoDelDepartamentoNacContratantepthisDepartamento;
        this.departamentoDelDepartamentoNacContratantepthisDepartamento = departamentoDelDepartamentoNacContratantepthisDepartamento != null ? departamentoDelDepartamentoNacContratantepthisDepartamento.getOid() : null;
    }

    private void checkDepartamentoDelDepartamentoNacContratantepthisDepartamento() throws NotNullArgumentException {
        if(this.getDepartamentoDelDepartamentoNacContratantepthisDepartamentoInstance() == null || this.getDepartamentoDelDepartamentoNacContratantepthisDepartamentoInstance().isNull()) {
            throw new NotNullArgumentException(DepartamentoConstants.SERV_ID_DELDEPARTAMENTONACCONTRATANTE, DepartamentoConstants.CLASS_ID, DepartamentoConstants.ARG_ID_DELDEPARTAMENTONACCONTRATANTE_DEPARTAMENTODELDEPARTAMENTONACCONTRATANTEPTHISDEPARTAMENTO, DepartamentoConstants.SERV_ALIAS_DELDEPARTAMENTONACCONTRATANTE, DepartamentoConstants.CLASS_ALIAS, DepartamentoConstants.ARG_ALIAS_DELDEPARTAMENTONACCONTRATANTE_DEPARTAMENTODELDEPARTAMENTONACCONTRATANTEPTHISDEPARTAMENTO);
        }
    }

    @JsonIgnore
    public ContratanteOid getDepartamentoDelDepartamentoNacContratantepevcContratante() {
        return this.departamentoDelDepartamentoNacContratantepevcContratante;
    }
    
    public void setDepartamentoDelDepartamentoNacContratantepevcContratante(ContratanteOid departamentoDelDepartamentoNacContratantepevcContratante) {
        this.departamentoDelDepartamentoNacContratantepevcContratante = departamentoDelDepartamentoNacContratantepevcContratante;
    }

    @JsonIgnore
    public Contratante getDepartamentoDelDepartamentoNacContratantepevcContratanteInstance() {
        return this.departamentoDelDepartamentoNacContratantepevcContratanteInstance;
    }
    
    public void setDepartamentoDelDepartamentoNacContratantepevcContratanteInstance(Contratante departamentoDelDepartamentoNacContratantepevcContratante) {
        this.departamentoDelDepartamentoNacContratantepevcContratanteInstance = departamentoDelDepartamentoNacContratantepevcContratante;
        this.departamentoDelDepartamentoNacContratantepevcContratante = departamentoDelDepartamentoNacContratantepevcContratante != null ? departamentoDelDepartamentoNacContratantepevcContratante.getOid() : null;
    }

    private void checkDepartamentoDelDepartamentoNacContratantepevcContratante() throws NotNullArgumentException {
        if(this.getDepartamentoDelDepartamentoNacContratantepevcContratanteInstance() == null || this.getDepartamentoDelDepartamentoNacContratantepevcContratanteInstance().isNull()) {
            throw new NotNullArgumentException(DepartamentoConstants.SERV_ID_DELDEPARTAMENTONACCONTRATANTE, DepartamentoConstants.CLASS_ID, DepartamentoConstants.ARG_ID_DELDEPARTAMENTONACCONTRATANTE_DEPARTAMENTODELDEPARTAMENTONACCONTRATANTEPEVCCONTRATANTE, DepartamentoConstants.SERV_ALIAS_DELDEPARTAMENTONACCONTRATANTE, DepartamentoConstants.CLASS_ALIAS, DepartamentoConstants.ARG_ALIAS_DELDEPARTAMENTONACCONTRATANTE_DEPARTAMENTODELDEPARTAMENTONACCONTRATANTEPEVCCONTRATANTE);
        }
    }
}
