package com.keralty.aepersonas.viewmodel.funcionario.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.FuncionarioConstants;
import com.keralty.aepersonas.persistence.Funcionario;
import com.keralty.aepersonas.persistence.oid.FuncionarioOid;

public class SolicitudAsignadaRequest {

    @JsonProperty("p_thisfuncionario_oid")
    private FuncionarioOid funcionariosolicitudAsignadapthisFuncionario;
    
    @JsonIgnore
    private Funcionario funcionariosolicitudAsignadapthisFuncionarioInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkFuncionariosolicitudAsignadapthisFuncionario();
    }

    @JsonIgnore
    public FuncionarioOid getFuncionariosolicitudAsignadapthisFuncionario() {
        return this.funcionariosolicitudAsignadapthisFuncionario;
    }
    
    public void setFuncionariosolicitudAsignadapthisFuncionario(FuncionarioOid funcionariosolicitudAsignadapthisFuncionario) {
        this.funcionariosolicitudAsignadapthisFuncionario = funcionariosolicitudAsignadapthisFuncionario;
    }

    @JsonIgnore
    public Funcionario getFuncionariosolicitudAsignadapthisFuncionarioInstance() {
        return this.funcionariosolicitudAsignadapthisFuncionarioInstance;
    }
    
    public void setFuncionariosolicitudAsignadapthisFuncionarioInstance(Funcionario funcionariosolicitudAsignadapthisFuncionario) {
        this.funcionariosolicitudAsignadapthisFuncionarioInstance = funcionariosolicitudAsignadapthisFuncionario;
        this.funcionariosolicitudAsignadapthisFuncionario = funcionariosolicitudAsignadapthisFuncionario != null ? funcionariosolicitudAsignadapthisFuncionario.getOid() : null;
    }

    private void checkFuncionariosolicitudAsignadapthisFuncionario() throws NotNullArgumentException {
        if(this.getFuncionariosolicitudAsignadapthisFuncionarioInstance() == null || this.getFuncionariosolicitudAsignadapthisFuncionarioInstance().isNull()) {
            throw new NotNullArgumentException(FuncionarioConstants.SERV_ID_SOLICITUDASIGNADA, FuncionarioConstants.CLASS_ID, FuncionarioConstants.ARG_ID_SOLICITUDASIGNADA_FUNCIONARIOSOLICITUDASIGNADAPTHISFUNCIONARIO, FuncionarioConstants.SERV_ALIAS_SOLICITUDASIGNADA, FuncionarioConstants.CLASS_ALIAS, FuncionarioConstants.ARG_ALIAS_SOLICITUDASIGNADA_FUNCIONARIOSOLICITUDASIGNADAPTHISFUNCIONARIO);
        }
    }
}
