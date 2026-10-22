package com.keralty.aepersonas.viewmodel.departamento.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.DepartamentoConstants;
import com.keralty.aepersonas.persistence.Contratante;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.oid.ContratanteOid;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;

public class InsDepartamentoNacContratanteRequest {

    @JsonProperty("p_thisdepartamento_oid")
    private DepartamentoOid departamentoInsDepartamentoNacContratantepthisDepartamento;
    
    @JsonIgnore
    private Departamento departamentoInsDepartamentoNacContratantepthisDepartamentoInstance;

    @JsonProperty("p_evccontratante_oid")
    private ContratanteOid departamentoInsDepartamentoNacContratantepevcContratante;
    
    @JsonIgnore
    private Contratante departamentoInsDepartamentoNacContratantepevcContratanteInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkDepartamentoInsDepartamentoNacContratantepthisDepartamento();
        checkDepartamentoInsDepartamentoNacContratantepevcContratante();
    }

    @JsonIgnore
    public DepartamentoOid getDepartamentoInsDepartamentoNacContratantepthisDepartamento() {
        return this.departamentoInsDepartamentoNacContratantepthisDepartamento;
    }
    
    public void setDepartamentoInsDepartamentoNacContratantepthisDepartamento(DepartamentoOid departamentoInsDepartamentoNacContratantepthisDepartamento) {
        this.departamentoInsDepartamentoNacContratantepthisDepartamento = departamentoInsDepartamentoNacContratantepthisDepartamento;
    }

    @JsonIgnore
    public Departamento getDepartamentoInsDepartamentoNacContratantepthisDepartamentoInstance() {
        return this.departamentoInsDepartamentoNacContratantepthisDepartamentoInstance;
    }
    
    public void setDepartamentoInsDepartamentoNacContratantepthisDepartamentoInstance(Departamento departamentoInsDepartamentoNacContratantepthisDepartamento) {
        this.departamentoInsDepartamentoNacContratantepthisDepartamentoInstance = departamentoInsDepartamentoNacContratantepthisDepartamento;
        this.departamentoInsDepartamentoNacContratantepthisDepartamento = departamentoInsDepartamentoNacContratantepthisDepartamento != null ? departamentoInsDepartamentoNacContratantepthisDepartamento.getOid() : null;
    }

    private void checkDepartamentoInsDepartamentoNacContratantepthisDepartamento() throws NotNullArgumentException {
        if(this.getDepartamentoInsDepartamentoNacContratantepthisDepartamentoInstance() == null || this.getDepartamentoInsDepartamentoNacContratantepthisDepartamentoInstance().isNull()) {
            throw new NotNullArgumentException(DepartamentoConstants.SERV_ID_INSDEPARTAMENTONACCONTRATANTE, DepartamentoConstants.CLASS_ID, DepartamentoConstants.ARG_ID_INSDEPARTAMENTONACCONTRATANTE_DEPARTAMENTOINSDEPARTAMENTONACCONTRATANTEPTHISDEPARTAMENTO, DepartamentoConstants.SERV_ALIAS_INSDEPARTAMENTONACCONTRATANTE, DepartamentoConstants.CLASS_ALIAS, DepartamentoConstants.ARG_ALIAS_INSDEPARTAMENTONACCONTRATANTE_DEPARTAMENTOINSDEPARTAMENTONACCONTRATANTEPTHISDEPARTAMENTO);
        }
    }

    @JsonIgnore
    public ContratanteOid getDepartamentoInsDepartamentoNacContratantepevcContratante() {
        return this.departamentoInsDepartamentoNacContratantepevcContratante;
    }
    
    public void setDepartamentoInsDepartamentoNacContratantepevcContratante(ContratanteOid departamentoInsDepartamentoNacContratantepevcContratante) {
        this.departamentoInsDepartamentoNacContratantepevcContratante = departamentoInsDepartamentoNacContratantepevcContratante;
    }

    @JsonIgnore
    public Contratante getDepartamentoInsDepartamentoNacContratantepevcContratanteInstance() {
        return this.departamentoInsDepartamentoNacContratantepevcContratanteInstance;
    }
    
    public void setDepartamentoInsDepartamentoNacContratantepevcContratanteInstance(Contratante departamentoInsDepartamentoNacContratantepevcContratante) {
        this.departamentoInsDepartamentoNacContratantepevcContratanteInstance = departamentoInsDepartamentoNacContratantepevcContratante;
        this.departamentoInsDepartamentoNacContratantepevcContratante = departamentoInsDepartamentoNacContratantepevcContratante != null ? departamentoInsDepartamentoNacContratantepevcContratante.getOid() : null;
    }

    private void checkDepartamentoInsDepartamentoNacContratantepevcContratante() throws NotNullArgumentException {
        if(this.getDepartamentoInsDepartamentoNacContratantepevcContratanteInstance() == null || this.getDepartamentoInsDepartamentoNacContratantepevcContratanteInstance().isNull()) {
            throw new NotNullArgumentException(DepartamentoConstants.SERV_ID_INSDEPARTAMENTONACCONTRATANTE, DepartamentoConstants.CLASS_ID, DepartamentoConstants.ARG_ID_INSDEPARTAMENTONACCONTRATANTE_DEPARTAMENTOINSDEPARTAMENTONACCONTRATANTEPEVCCONTRATANTE, DepartamentoConstants.SERV_ALIAS_INSDEPARTAMENTONACCONTRATANTE, DepartamentoConstants.CLASS_ALIAS, DepartamentoConstants.ARG_ALIAS_INSDEPARTAMENTONACCONTRATANTE_DEPARTAMENTOINSDEPARTAMENTONACCONTRATANTEPEVCCONTRATANTE);
        }
    }
}
