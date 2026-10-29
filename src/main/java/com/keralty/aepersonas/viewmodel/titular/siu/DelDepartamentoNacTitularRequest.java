package com.keralty.aepersonas.viewmodel.titular.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.TitularConstants;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.persistence.oid.TitularOid;
import com.keralty.aepersonas.persistence.Titular;

public class DelDepartamentoNacTitularRequest {

    @JsonProperty("p_thistitular_oid")
    private TitularOid titularDelDepartamentoNacTitularpthisTitular;
    
    @JsonIgnore
    private Titular titularDelDepartamentoNacTitularpthisTitularInstance;

    @JsonProperty("p_evcdepartamento_oid")
    private DepartamentoOid titularDelDepartamentoNacTitularpevcDepartamento;
    
    @JsonIgnore
    private Departamento titularDelDepartamentoNacTitularpevcDepartamentoInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkTitularDelDepartamentoNacTitularpthisTitular();
        checkTitularDelDepartamentoNacTitularpevcDepartamento();
    }

    @JsonIgnore
    public TitularOid getTitularDelDepartamentoNacTitularpthisTitular() {
        return this.titularDelDepartamentoNacTitularpthisTitular;
    }
    
    public void setTitularDelDepartamentoNacTitularpthisTitular(TitularOid titularDelDepartamentoNacTitularpthisTitular) {
        this.titularDelDepartamentoNacTitularpthisTitular = titularDelDepartamentoNacTitularpthisTitular;
    }

    @JsonIgnore
    public Titular getTitularDelDepartamentoNacTitularpthisTitularInstance() {
        return this.titularDelDepartamentoNacTitularpthisTitularInstance;
    }
    
    public void setTitularDelDepartamentoNacTitularpthisTitularInstance(Titular titularDelDepartamentoNacTitularpthisTitular) {
        this.titularDelDepartamentoNacTitularpthisTitularInstance = titularDelDepartamentoNacTitularpthisTitular;
        this.titularDelDepartamentoNacTitularpthisTitular = titularDelDepartamentoNacTitularpthisTitular != null ? titularDelDepartamentoNacTitularpthisTitular.getOid() : null;
    }

    private void checkTitularDelDepartamentoNacTitularpthisTitular() throws NotNullArgumentException {
        if(this.getTitularDelDepartamentoNacTitularpthisTitularInstance() == null || this.getTitularDelDepartamentoNacTitularpthisTitularInstance().isNull()) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_DELDEPARTAMENTONACTITULAR, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_DELDEPARTAMENTONACTITULAR_TITULARDELDEPARTAMENTONACTITULARPTHISTITULAR, TitularConstants.SERV_ALIAS_DELDEPARTAMENTONACTITULAR, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_DELDEPARTAMENTONACTITULAR_TITULARDELDEPARTAMENTONACTITULARPTHISTITULAR);
        }
    }

    @JsonIgnore
    public DepartamentoOid getTitularDelDepartamentoNacTitularpevcDepartamento() {
        return this.titularDelDepartamentoNacTitularpevcDepartamento;
    }
    
    public void setTitularDelDepartamentoNacTitularpevcDepartamento(DepartamentoOid titularDelDepartamentoNacTitularpevcDepartamento) {
        this.titularDelDepartamentoNacTitularpevcDepartamento = titularDelDepartamentoNacTitularpevcDepartamento;
    }

    @JsonIgnore
    public Departamento getTitularDelDepartamentoNacTitularpevcDepartamentoInstance() {
        return this.titularDelDepartamentoNacTitularpevcDepartamentoInstance;
    }
    
    public void setTitularDelDepartamentoNacTitularpevcDepartamentoInstance(Departamento titularDelDepartamentoNacTitularpevcDepartamento) {
        this.titularDelDepartamentoNacTitularpevcDepartamentoInstance = titularDelDepartamentoNacTitularpevcDepartamento;
        this.titularDelDepartamentoNacTitularpevcDepartamento = titularDelDepartamentoNacTitularpevcDepartamento != null ? titularDelDepartamentoNacTitularpevcDepartamento.getOid() : null;
    }

    private void checkTitularDelDepartamentoNacTitularpevcDepartamento() throws NotNullArgumentException {
        if(this.getTitularDelDepartamentoNacTitularpevcDepartamentoInstance() == null || this.getTitularDelDepartamentoNacTitularpevcDepartamentoInstance().isNull()) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_DELDEPARTAMENTONACTITULAR, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_DELDEPARTAMENTONACTITULAR_TITULARDELDEPARTAMENTONACTITULARPEVCDEPARTAMENTO, TitularConstants.SERV_ALIAS_DELDEPARTAMENTONACTITULAR, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_DELDEPARTAMENTONACTITULAR_TITULARDELDEPARTAMENTONACTITULARPEVCDEPARTAMENTO);
        }
    }
}
