package com.keralty.aepersonas.viewmodel.departamento.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.DepartamentoConstants;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.persistence.oid.TitularOid;
import com.keralty.aepersonas.persistence.Titular;

public class DelDepartamentoNacTitularRequest {

    @JsonProperty("p_thisdepartamento_oid")
    private DepartamentoOid departamentoDelDepartamentoNacTitularpthisDepartamento;
    
    @JsonIgnore
    private Departamento departamentoDelDepartamentoNacTitularpthisDepartamentoInstance;

    @JsonProperty("p_evctitular_oid")
    private TitularOid departamentoDelDepartamentoNacTitularpevcTitular;
    
    @JsonIgnore
    private Titular departamentoDelDepartamentoNacTitularpevcTitularInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkDepartamentoDelDepartamentoNacTitularpthisDepartamento();
        checkDepartamentoDelDepartamentoNacTitularpevcTitular();
    }

    @JsonIgnore
    public DepartamentoOid getDepartamentoDelDepartamentoNacTitularpthisDepartamento() {
        return this.departamentoDelDepartamentoNacTitularpthisDepartamento;
    }
    
    public void setDepartamentoDelDepartamentoNacTitularpthisDepartamento(DepartamentoOid departamentoDelDepartamentoNacTitularpthisDepartamento) {
        this.departamentoDelDepartamentoNacTitularpthisDepartamento = departamentoDelDepartamentoNacTitularpthisDepartamento;
    }

    @JsonIgnore
    public Departamento getDepartamentoDelDepartamentoNacTitularpthisDepartamentoInstance() {
        return this.departamentoDelDepartamentoNacTitularpthisDepartamentoInstance;
    }
    
    public void setDepartamentoDelDepartamentoNacTitularpthisDepartamentoInstance(Departamento departamentoDelDepartamentoNacTitularpthisDepartamento) {
        this.departamentoDelDepartamentoNacTitularpthisDepartamentoInstance = departamentoDelDepartamentoNacTitularpthisDepartamento;
        this.departamentoDelDepartamentoNacTitularpthisDepartamento = departamentoDelDepartamentoNacTitularpthisDepartamento != null ? departamentoDelDepartamentoNacTitularpthisDepartamento.getOid() : null;
    }

    private void checkDepartamentoDelDepartamentoNacTitularpthisDepartamento() throws NotNullArgumentException {
        if(this.getDepartamentoDelDepartamentoNacTitularpthisDepartamentoInstance() == null || this.getDepartamentoDelDepartamentoNacTitularpthisDepartamentoInstance().isNull()) {
            throw new NotNullArgumentException(DepartamentoConstants.SERV_ID_DELDEPARTAMENTONACTITULAR, DepartamentoConstants.CLASS_ID, DepartamentoConstants.ARG_ID_DELDEPARTAMENTONACTITULAR_DEPARTAMENTODELDEPARTAMENTONACTITULARPTHISDEPARTAMENTO, DepartamentoConstants.SERV_ALIAS_DELDEPARTAMENTONACTITULAR, DepartamentoConstants.CLASS_ALIAS, DepartamentoConstants.ARG_ALIAS_DELDEPARTAMENTONACTITULAR_DEPARTAMENTODELDEPARTAMENTONACTITULARPTHISDEPARTAMENTO);
        }
    }

    @JsonIgnore
    public TitularOid getDepartamentoDelDepartamentoNacTitularpevcTitular() {
        return this.departamentoDelDepartamentoNacTitularpevcTitular;
    }
    
    public void setDepartamentoDelDepartamentoNacTitularpevcTitular(TitularOid departamentoDelDepartamentoNacTitularpevcTitular) {
        this.departamentoDelDepartamentoNacTitularpevcTitular = departamentoDelDepartamentoNacTitularpevcTitular;
    }

    @JsonIgnore
    public Titular getDepartamentoDelDepartamentoNacTitularpevcTitularInstance() {
        return this.departamentoDelDepartamentoNacTitularpevcTitularInstance;
    }
    
    public void setDepartamentoDelDepartamentoNacTitularpevcTitularInstance(Titular departamentoDelDepartamentoNacTitularpevcTitular) {
        this.departamentoDelDepartamentoNacTitularpevcTitularInstance = departamentoDelDepartamentoNacTitularpevcTitular;
        this.departamentoDelDepartamentoNacTitularpevcTitular = departamentoDelDepartamentoNacTitularpevcTitular != null ? departamentoDelDepartamentoNacTitularpevcTitular.getOid() : null;
    }

    private void checkDepartamentoDelDepartamentoNacTitularpevcTitular() throws NotNullArgumentException {
        if(this.getDepartamentoDelDepartamentoNacTitularpevcTitularInstance() == null || this.getDepartamentoDelDepartamentoNacTitularpevcTitularInstance().isNull()) {
            throw new NotNullArgumentException(DepartamentoConstants.SERV_ID_DELDEPARTAMENTONACTITULAR, DepartamentoConstants.CLASS_ID, DepartamentoConstants.ARG_ID_DELDEPARTAMENTONACTITULAR_DEPARTAMENTODELDEPARTAMENTONACTITULARPEVCTITULAR, DepartamentoConstants.SERV_ALIAS_DELDEPARTAMENTONACTITULAR, DepartamentoConstants.CLASS_ALIAS, DepartamentoConstants.ARG_ALIAS_DELDEPARTAMENTONACTITULAR_DEPARTAMENTODELDEPARTAMENTONACTITULARPEVCTITULAR);
        }
    }
}
