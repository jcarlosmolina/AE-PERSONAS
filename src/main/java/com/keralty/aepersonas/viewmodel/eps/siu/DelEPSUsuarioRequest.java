package com.keralty.aepersonas.viewmodel.eps.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.EpsConstants;
import com.keralty.aepersonas.persistence.Eps;
import com.keralty.aepersonas.persistence.oid.EpsOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Usuario;

public class DelEPSUsuarioRequest {

    @JsonProperty("p_thiseps_oid")
    private EpsOid epsDelEPSUsuariopthisEPS;
    
    @JsonIgnore
    private Eps epsDelEPSUsuariopthisEPSInstance;

    @JsonProperty("p_evcusuario_oid")
    private UsuarioOid epsDelEPSUsuariopevcUsuario;
    
    @JsonIgnore
    private Usuario epsDelEPSUsuariopevcUsuarioInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkEpsDelEPSUsuariopthisEPS();
        checkEpsDelEPSUsuariopevcUsuario();
    }

    @JsonIgnore
    public EpsOid getEpsDelEPSUsuariopthisEPS() {
        return this.epsDelEPSUsuariopthisEPS;
    }
    
    public void setEpsDelEPSUsuariopthisEPS(EpsOid epsDelEPSUsuariopthisEPS) {
        this.epsDelEPSUsuariopthisEPS = epsDelEPSUsuariopthisEPS;
    }

    @JsonIgnore
    public Eps getEpsDelEPSUsuariopthisEPSInstance() {
        return this.epsDelEPSUsuariopthisEPSInstance;
    }
    
    public void setEpsDelEPSUsuariopthisEPSInstance(Eps epsDelEPSUsuariopthisEPS) {
        this.epsDelEPSUsuariopthisEPSInstance = epsDelEPSUsuariopthisEPS;
        this.epsDelEPSUsuariopthisEPS = epsDelEPSUsuariopthisEPS != null ? epsDelEPSUsuariopthisEPS.getOid() : null;
    }

    private void checkEpsDelEPSUsuariopthisEPS() throws NotNullArgumentException {
        if(this.getEpsDelEPSUsuariopthisEPSInstance() == null || this.getEpsDelEPSUsuariopthisEPSInstance().isNull()) {
            throw new NotNullArgumentException(EpsConstants.SERV_ID_DELEPSUSUARIO, EpsConstants.CLASS_ID, EpsConstants.ARG_ID_DELEPSUSUARIO_EPSDELEPSUSUARIOPTHISEPS, EpsConstants.SERV_ALIAS_DELEPSUSUARIO, EpsConstants.CLASS_ALIAS, EpsConstants.ARG_ALIAS_DELEPSUSUARIO_EPSDELEPSUSUARIOPTHISEPS);
        }
    }

    @JsonIgnore
    public UsuarioOid getEpsDelEPSUsuariopevcUsuario() {
        return this.epsDelEPSUsuariopevcUsuario;
    }
    
    public void setEpsDelEPSUsuariopevcUsuario(UsuarioOid epsDelEPSUsuariopevcUsuario) {
        this.epsDelEPSUsuariopevcUsuario = epsDelEPSUsuariopevcUsuario;
    }

    @JsonIgnore
    public Usuario getEpsDelEPSUsuariopevcUsuarioInstance() {
        return this.epsDelEPSUsuariopevcUsuarioInstance;
    }
    
    public void setEpsDelEPSUsuariopevcUsuarioInstance(Usuario epsDelEPSUsuariopevcUsuario) {
        this.epsDelEPSUsuariopevcUsuarioInstance = epsDelEPSUsuariopevcUsuario;
        this.epsDelEPSUsuariopevcUsuario = epsDelEPSUsuariopevcUsuario != null ? epsDelEPSUsuariopevcUsuario.getOid() : null;
    }

    private void checkEpsDelEPSUsuariopevcUsuario() throws NotNullArgumentException {
        if(this.getEpsDelEPSUsuariopevcUsuarioInstance() == null || this.getEpsDelEPSUsuariopevcUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(EpsConstants.SERV_ID_DELEPSUSUARIO, EpsConstants.CLASS_ID, EpsConstants.ARG_ID_DELEPSUSUARIO_EPSDELEPSUSUARIOPEVCUSUARIO, EpsConstants.SERV_ALIAS_DELEPSUSUARIO, EpsConstants.CLASS_ALIAS, EpsConstants.ARG_ALIAS_DELEPSUSUARIO_EPSDELEPSUSUARIOPEVCUSUARIO);
        }
    }
}
