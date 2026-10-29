package com.keralty.aepersonas.viewmodel.titular.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.TitularConstants;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.persistence.oid.TitularOid;
import com.keralty.aepersonas.persistence.Titular;

public class InsDepartamentoNacTitularRequest {

    @JsonProperty("p_thistitular_oid")
    private TitularOid titularInsDepartamentoNacTitularpthisTitular;
    
    @JsonIgnore
    private Titular titularInsDepartamentoNacTitularpthisTitularInstance;

    @JsonProperty("p_evcdepartamento_oid")
    private DepartamentoOid titularInsDepartamentoNacTitularpevcDepartamento;
    
    @JsonIgnore
    private Departamento titularInsDepartamentoNacTitularpevcDepartamentoInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkTitularInsDepartamentoNacTitularpthisTitular();
        checkTitularInsDepartamentoNacTitularpevcDepartamento();
    }

    @JsonIgnore
    public TitularOid getTitularInsDepartamentoNacTitularpthisTitular() {
        return this.titularInsDepartamentoNacTitularpthisTitular;
    }
    
    public void setTitularInsDepartamentoNacTitularpthisTitular(TitularOid titularInsDepartamentoNacTitularpthisTitular) {
        this.titularInsDepartamentoNacTitularpthisTitular = titularInsDepartamentoNacTitularpthisTitular;
    }

    @JsonIgnore
    public Titular getTitularInsDepartamentoNacTitularpthisTitularInstance() {
        return this.titularInsDepartamentoNacTitularpthisTitularInstance;
    }
    
    public void setTitularInsDepartamentoNacTitularpthisTitularInstance(Titular titularInsDepartamentoNacTitularpthisTitular) {
        this.titularInsDepartamentoNacTitularpthisTitularInstance = titularInsDepartamentoNacTitularpthisTitular;
        this.titularInsDepartamentoNacTitularpthisTitular = titularInsDepartamentoNacTitularpthisTitular != null ? titularInsDepartamentoNacTitularpthisTitular.getOid() : null;
    }

    private void checkTitularInsDepartamentoNacTitularpthisTitular() throws NotNullArgumentException {
        if(this.getTitularInsDepartamentoNacTitularpthisTitularInstance() == null || this.getTitularInsDepartamentoNacTitularpthisTitularInstance().isNull()) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_INSDEPARTAMENTONACTITULAR, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_INSDEPARTAMENTONACTITULAR_TITULARINSDEPARTAMENTONACTITULARPTHISTITULAR, TitularConstants.SERV_ALIAS_INSDEPARTAMENTONACTITULAR, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_INSDEPARTAMENTONACTITULAR_TITULARINSDEPARTAMENTONACTITULARPTHISTITULAR);
        }
    }

    @JsonIgnore
    public DepartamentoOid getTitularInsDepartamentoNacTitularpevcDepartamento() {
        return this.titularInsDepartamentoNacTitularpevcDepartamento;
    }
    
    public void setTitularInsDepartamentoNacTitularpevcDepartamento(DepartamentoOid titularInsDepartamentoNacTitularpevcDepartamento) {
        this.titularInsDepartamentoNacTitularpevcDepartamento = titularInsDepartamentoNacTitularpevcDepartamento;
    }

    @JsonIgnore
    public Departamento getTitularInsDepartamentoNacTitularpevcDepartamentoInstance() {
        return this.titularInsDepartamentoNacTitularpevcDepartamentoInstance;
    }
    
    public void setTitularInsDepartamentoNacTitularpevcDepartamentoInstance(Departamento titularInsDepartamentoNacTitularpevcDepartamento) {
        this.titularInsDepartamentoNacTitularpevcDepartamentoInstance = titularInsDepartamentoNacTitularpevcDepartamento;
        this.titularInsDepartamentoNacTitularpevcDepartamento = titularInsDepartamentoNacTitularpevcDepartamento != null ? titularInsDepartamentoNacTitularpevcDepartamento.getOid() : null;
    }

    private void checkTitularInsDepartamentoNacTitularpevcDepartamento() throws NotNullArgumentException {
        if(this.getTitularInsDepartamentoNacTitularpevcDepartamentoInstance() == null || this.getTitularInsDepartamentoNacTitularpevcDepartamentoInstance().isNull()) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_INSDEPARTAMENTONACTITULAR, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_INSDEPARTAMENTONACTITULAR_TITULARINSDEPARTAMENTONACTITULARPEVCDEPARTAMENTO, TitularConstants.SERV_ALIAS_INSDEPARTAMENTONACTITULAR, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_INSDEPARTAMENTONACTITULAR_TITULARINSDEPARTAMENTONACTITULARPEVCDEPARTAMENTO);
        }
    }
}
