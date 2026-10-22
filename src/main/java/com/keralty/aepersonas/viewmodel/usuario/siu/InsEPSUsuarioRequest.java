package com.keralty.aepersonas.viewmodel.usuario.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.persistence.Eps;
import com.keralty.aepersonas.persistence.oid.EpsOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Usuario;

public class InsEPSUsuarioRequest {

    @JsonProperty("p_thisattrusuario_oid")
    private UsuarioOid usuarioInsEPSUsuariopthisAttrUsuario;
    
    @JsonIgnore
    private Usuario usuarioInsEPSUsuariopthisAttrUsuarioInstance;

    @JsonProperty("p_evceps_oid")
    private EpsOid usuarioInsEPSUsuariopevcEps;
    
    @JsonIgnore
    private Eps usuarioInsEPSUsuariopevcEpsInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkUsuarioInsEPSUsuariopthisAttrUsuario();
        checkUsuarioInsEPSUsuariopevcEps();
    }

    @JsonIgnore
    public UsuarioOid getUsuarioInsEPSUsuariopthisAttrUsuario() {
        return this.usuarioInsEPSUsuariopthisAttrUsuario;
    }
    
    public void setUsuarioInsEPSUsuariopthisAttrUsuario(UsuarioOid usuarioInsEPSUsuariopthisAttrUsuario) {
        this.usuarioInsEPSUsuariopthisAttrUsuario = usuarioInsEPSUsuariopthisAttrUsuario;
    }

    @JsonIgnore
    public Usuario getUsuarioInsEPSUsuariopthisAttrUsuarioInstance() {
        return this.usuarioInsEPSUsuariopthisAttrUsuarioInstance;
    }
    
    public void setUsuarioInsEPSUsuariopthisAttrUsuarioInstance(Usuario usuarioInsEPSUsuariopthisAttrUsuario) {
        this.usuarioInsEPSUsuariopthisAttrUsuarioInstance = usuarioInsEPSUsuariopthisAttrUsuario;
        this.usuarioInsEPSUsuariopthisAttrUsuario = usuarioInsEPSUsuariopthisAttrUsuario != null ? usuarioInsEPSUsuariopthisAttrUsuario.getOid() : null;
    }

    private void checkUsuarioInsEPSUsuariopthisAttrUsuario() throws NotNullArgumentException {
        if(this.getUsuarioInsEPSUsuariopthisAttrUsuarioInstance() == null || this.getUsuarioInsEPSUsuariopthisAttrUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_INSEPSUSUARIO, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_INSEPSUSUARIO_USUARIOINSEPSUSUARIOPTHISATTRUSUARIO, UsuarioConstants.SERV_ALIAS_INSEPSUSUARIO, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_INSEPSUSUARIO_USUARIOINSEPSUSUARIOPTHISATTRUSUARIO);
        }
    }

    @JsonIgnore
    public EpsOid getUsuarioInsEPSUsuariopevcEps() {
        return this.usuarioInsEPSUsuariopevcEps;
    }
    
    public void setUsuarioInsEPSUsuariopevcEps(EpsOid usuarioInsEPSUsuariopevcEps) {
        this.usuarioInsEPSUsuariopevcEps = usuarioInsEPSUsuariopevcEps;
    }

    @JsonIgnore
    public Eps getUsuarioInsEPSUsuariopevcEpsInstance() {
        return this.usuarioInsEPSUsuariopevcEpsInstance;
    }
    
    public void setUsuarioInsEPSUsuariopevcEpsInstance(Eps usuarioInsEPSUsuariopevcEps) {
        this.usuarioInsEPSUsuariopevcEpsInstance = usuarioInsEPSUsuariopevcEps;
        this.usuarioInsEPSUsuariopevcEps = usuarioInsEPSUsuariopevcEps != null ? usuarioInsEPSUsuariopevcEps.getOid() : null;
    }

    private void checkUsuarioInsEPSUsuariopevcEps() throws NotNullArgumentException {
        if(this.getUsuarioInsEPSUsuariopevcEpsInstance() == null || this.getUsuarioInsEPSUsuariopevcEpsInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_INSEPSUSUARIO, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_INSEPSUSUARIO_USUARIOINSEPSUSUARIOPEVCEPS, UsuarioConstants.SERV_ALIAS_INSEPSUSUARIO, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_INSEPSUSUARIO_USUARIOINSEPSUSUARIOPEVCEPS);
        }
    }
}
