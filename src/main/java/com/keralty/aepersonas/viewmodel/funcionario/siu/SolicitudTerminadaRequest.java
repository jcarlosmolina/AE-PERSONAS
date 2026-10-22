package com.keralty.aepersonas.viewmodel.funcionario.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.FuncionarioConstants;
import com.keralty.aepersonas.persistence.Funcionario;
import com.keralty.aepersonas.persistence.oid.FuncionarioOid;

public class SolicitudTerminadaRequest {

    @JsonProperty("p_thisfuncionario_oid")
    private FuncionarioOid funcionariosolicitudTerminadapthisFuncionario;
    
    @JsonIgnore
    private Funcionario funcionariosolicitudTerminadapthisFuncionarioInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkFuncionariosolicitudTerminadapthisFuncionario();
    }

    @JsonIgnore
    public FuncionarioOid getFuncionariosolicitudTerminadapthisFuncionario() {
        return this.funcionariosolicitudTerminadapthisFuncionario;
    }
    
    public void setFuncionariosolicitudTerminadapthisFuncionario(FuncionarioOid funcionariosolicitudTerminadapthisFuncionario) {
        this.funcionariosolicitudTerminadapthisFuncionario = funcionariosolicitudTerminadapthisFuncionario;
    }

    @JsonIgnore
    public Funcionario getFuncionariosolicitudTerminadapthisFuncionarioInstance() {
        return this.funcionariosolicitudTerminadapthisFuncionarioInstance;
    }
    
    public void setFuncionariosolicitudTerminadapthisFuncionarioInstance(Funcionario funcionariosolicitudTerminadapthisFuncionario) {
        this.funcionariosolicitudTerminadapthisFuncionarioInstance = funcionariosolicitudTerminadapthisFuncionario;
        this.funcionariosolicitudTerminadapthisFuncionario = funcionariosolicitudTerminadapthisFuncionario != null ? funcionariosolicitudTerminadapthisFuncionario.getOid() : null;
    }

    private void checkFuncionariosolicitudTerminadapthisFuncionario() throws NotNullArgumentException {
        if(this.getFuncionariosolicitudTerminadapthisFuncionarioInstance() == null || this.getFuncionariosolicitudTerminadapthisFuncionarioInstance().isNull()) {
            throw new NotNullArgumentException(FuncionarioConstants.SERV_ID_SOLICITUDTERMINADA, FuncionarioConstants.CLASS_ID, FuncionarioConstants.ARG_ID_SOLICITUDTERMINADA_FUNCIONARIOSOLICITUDTERMINADAPTHISFUNCIONARIO, FuncionarioConstants.SERV_ALIAS_SOLICITUDTERMINADA, FuncionarioConstants.CLASS_ALIAS, FuncionarioConstants.ARG_ALIAS_SOLICITUDTERMINADA_FUNCIONARIOSOLICITUDTERMINADAPTHISFUNCIONARIO);
        }
    }
}
