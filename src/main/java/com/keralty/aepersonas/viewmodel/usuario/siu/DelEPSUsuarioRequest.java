package com.keralty.aepersonas.viewmodel.usuario.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.persistence.Eps;
import com.keralty.aepersonas.persistence.oid.EpsOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Usuario;

public class DelEPSUsuarioRequest {

    @JsonProperty("p_thisattrusuario_oid")
    private UsuarioOid usuarioDelEPSUsuariopthisAttrUsuario;
    
    @JsonIgnore
    private Usuario usuarioDelEPSUsuariopthisAttrUsuarioInstance;

    @JsonProperty("p_evceps_oid")
    private EpsOid usuarioDelEPSUsuariopevcEps;
    
    @JsonIgnore
    private Eps usuarioDelEPSUsuariopevcEpsInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkUsuarioDelEPSUsuariopthisAttrUsuario();
        checkUsuarioDelEPSUsuariopevcEps();
    }

    @JsonIgnore
    public UsuarioOid getUsuarioDelEPSUsuariopthisAttrUsuario() {
        return this.usuarioDelEPSUsuariopthisAttrUsuario;
    }
    
    public void setUsuarioDelEPSUsuariopthisAttrUsuario(UsuarioOid usuarioDelEPSUsuariopthisAttrUsuario) {
        this.usuarioDelEPSUsuariopthisAttrUsuario = usuarioDelEPSUsuariopthisAttrUsuario;
    }

    @JsonIgnore
    public Usuario getUsuarioDelEPSUsuariopthisAttrUsuarioInstance() {
        return this.usuarioDelEPSUsuariopthisAttrUsuarioInstance;
    }
    
    public void setUsuarioDelEPSUsuariopthisAttrUsuarioInstance(Usuario usuarioDelEPSUsuariopthisAttrUsuario) {
        this.usuarioDelEPSUsuariopthisAttrUsuarioInstance = usuarioDelEPSUsuariopthisAttrUsuario;
        this.usuarioDelEPSUsuariopthisAttrUsuario = usuarioDelEPSUsuariopthisAttrUsuario != null ? usuarioDelEPSUsuariopthisAttrUsuario.getOid() : null;
    }

    private void checkUsuarioDelEPSUsuariopthisAttrUsuario() throws NotNullArgumentException {
        if(this.getUsuarioDelEPSUsuariopthisAttrUsuarioInstance() == null || this.getUsuarioDelEPSUsuariopthisAttrUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_DELEPSUSUARIO, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_DELEPSUSUARIO_USUARIODELEPSUSUARIOPTHISATTRUSUARIO, UsuarioConstants.SERV_ALIAS_DELEPSUSUARIO, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_DELEPSUSUARIO_USUARIODELEPSUSUARIOPTHISATTRUSUARIO);
        }
    }

    @JsonIgnore
    public EpsOid getUsuarioDelEPSUsuariopevcEps() {
        return this.usuarioDelEPSUsuariopevcEps;
    }
    
    public void setUsuarioDelEPSUsuariopevcEps(EpsOid usuarioDelEPSUsuariopevcEps) {
        this.usuarioDelEPSUsuariopevcEps = usuarioDelEPSUsuariopevcEps;
    }

    @JsonIgnore
    public Eps getUsuarioDelEPSUsuariopevcEpsInstance() {
        return this.usuarioDelEPSUsuariopevcEpsInstance;
    }
    
    public void setUsuarioDelEPSUsuariopevcEpsInstance(Eps usuarioDelEPSUsuariopevcEps) {
        this.usuarioDelEPSUsuariopevcEpsInstance = usuarioDelEPSUsuariopevcEps;
        this.usuarioDelEPSUsuariopevcEps = usuarioDelEPSUsuariopevcEps != null ? usuarioDelEPSUsuariopevcEps.getOid() : null;
    }

    private void checkUsuarioDelEPSUsuariopevcEps() throws NotNullArgumentException {
        if(this.getUsuarioDelEPSUsuariopevcEpsInstance() == null || this.getUsuarioDelEPSUsuariopevcEpsInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_DELEPSUSUARIO, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_DELEPSUSUARIO_USUARIODELEPSUSUARIOPEVCEPS, UsuarioConstants.SERV_ALIAS_DELEPSUSUARIO, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_DELEPSUSUARIO_USUARIODELEPSUSUARIOPEVCEPS);
        }
    }
}
