package com.keralty.aepersonas.viewmodel.eps.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.EpsConstants;
import com.keralty.aepersonas.persistence.Eps;
import com.keralty.aepersonas.persistence.oid.EpsOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Usuario;

public class InsEPSUsuarioRequest {

    @JsonProperty("p_thiseps_oid")
    private EpsOid epsInsEPSUsuariopthisEPS;
    
    @JsonIgnore
    private Eps epsInsEPSUsuariopthisEPSInstance;

    @JsonProperty("p_evcusuario_oid")
    private UsuarioOid epsInsEPSUsuariopevcUsuario;
    
    @JsonIgnore
    private Usuario epsInsEPSUsuariopevcUsuarioInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkEpsInsEPSUsuariopthisEPS();
        checkEpsInsEPSUsuariopevcUsuario();
    }

    @JsonIgnore
    public EpsOid getEpsInsEPSUsuariopthisEPS() {
        return this.epsInsEPSUsuariopthisEPS;
    }
    
    public void setEpsInsEPSUsuariopthisEPS(EpsOid epsInsEPSUsuariopthisEPS) {
        this.epsInsEPSUsuariopthisEPS = epsInsEPSUsuariopthisEPS;
    }

    @JsonIgnore
    public Eps getEpsInsEPSUsuariopthisEPSInstance() {
        return this.epsInsEPSUsuariopthisEPSInstance;
    }
    
    public void setEpsInsEPSUsuariopthisEPSInstance(Eps epsInsEPSUsuariopthisEPS) {
        this.epsInsEPSUsuariopthisEPSInstance = epsInsEPSUsuariopthisEPS;
        this.epsInsEPSUsuariopthisEPS = epsInsEPSUsuariopthisEPS != null ? epsInsEPSUsuariopthisEPS.getOid() : null;
    }

    private void checkEpsInsEPSUsuariopthisEPS() throws NotNullArgumentException {
        if(this.getEpsInsEPSUsuariopthisEPSInstance() == null || this.getEpsInsEPSUsuariopthisEPSInstance().isNull()) {
            throw new NotNullArgumentException(EpsConstants.SERV_ID_INSEPSUSUARIO, EpsConstants.CLASS_ID, EpsConstants.ARG_ID_INSEPSUSUARIO_EPSINSEPSUSUARIOPTHISEPS, EpsConstants.SERV_ALIAS_INSEPSUSUARIO, EpsConstants.CLASS_ALIAS, EpsConstants.ARG_ALIAS_INSEPSUSUARIO_EPSINSEPSUSUARIOPTHISEPS);
        }
    }

    @JsonIgnore
    public UsuarioOid getEpsInsEPSUsuariopevcUsuario() {
        return this.epsInsEPSUsuariopevcUsuario;
    }
    
    public void setEpsInsEPSUsuariopevcUsuario(UsuarioOid epsInsEPSUsuariopevcUsuario) {
        this.epsInsEPSUsuariopevcUsuario = epsInsEPSUsuariopevcUsuario;
    }

    @JsonIgnore
    public Usuario getEpsInsEPSUsuariopevcUsuarioInstance() {
        return this.epsInsEPSUsuariopevcUsuarioInstance;
    }
    
    public void setEpsInsEPSUsuariopevcUsuarioInstance(Usuario epsInsEPSUsuariopevcUsuario) {
        this.epsInsEPSUsuariopevcUsuarioInstance = epsInsEPSUsuariopevcUsuario;
        this.epsInsEPSUsuariopevcUsuario = epsInsEPSUsuariopevcUsuario != null ? epsInsEPSUsuariopevcUsuario.getOid() : null;
    }

    private void checkEpsInsEPSUsuariopevcUsuario() throws NotNullArgumentException {
        if(this.getEpsInsEPSUsuariopevcUsuarioInstance() == null || this.getEpsInsEPSUsuariopevcUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(EpsConstants.SERV_ID_INSEPSUSUARIO, EpsConstants.CLASS_ID, EpsConstants.ARG_ID_INSEPSUSUARIO_EPSINSEPSUSUARIOPEVCUSUARIO, EpsConstants.SERV_ALIAS_INSEPSUSUARIO, EpsConstants.CLASS_ALIAS, EpsConstants.ARG_ALIAS_INSEPSUSUARIO_EPSINSEPSUSUARIOPEVCUSUARIO);
        }
    }
}
