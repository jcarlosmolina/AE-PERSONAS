package com.keralty.aepersonas.viewmodel.usuario.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Usuario;

public class ModificarTipoUsuarioRequest {

    @JsonProperty("p_thisusuario_oid")
    private UsuarioOid usuariomodificarTipoUsuariopthisUsuario;
    
    @JsonIgnore
    private Usuario usuariomodificarTipoUsuariopthisUsuarioInstance;

    @JsonProperty("p_tipousuario")
    private Long usuariomodificarTipoUsuariopTipoUsuario;

    public void checkArguments() throws NotNullArgumentException {
        checkUsuariomodificarTipoUsuariopthisUsuario();
        checkUsuariomodificarTipoUsuariopTipoUsuario();
    }

    @JsonIgnore
    public UsuarioOid getUsuariomodificarTipoUsuariopthisUsuario() {
        return this.usuariomodificarTipoUsuariopthisUsuario;
    }
    
    public void setUsuariomodificarTipoUsuariopthisUsuario(UsuarioOid usuariomodificarTipoUsuariopthisUsuario) {
        this.usuariomodificarTipoUsuariopthisUsuario = usuariomodificarTipoUsuariopthisUsuario;
    }

    @JsonIgnore
    public Usuario getUsuariomodificarTipoUsuariopthisUsuarioInstance() {
        return this.usuariomodificarTipoUsuariopthisUsuarioInstance;
    }
    
    public void setUsuariomodificarTipoUsuariopthisUsuarioInstance(Usuario usuariomodificarTipoUsuariopthisUsuario) {
        this.usuariomodificarTipoUsuariopthisUsuarioInstance = usuariomodificarTipoUsuariopthisUsuario;
        this.usuariomodificarTipoUsuariopthisUsuario = usuariomodificarTipoUsuariopthisUsuario != null ? usuariomodificarTipoUsuariopthisUsuario.getOid() : null;
    }

    private void checkUsuariomodificarTipoUsuariopthisUsuario() throws NotNullArgumentException {
        if(this.getUsuariomodificarTipoUsuariopthisUsuarioInstance() == null || this.getUsuariomodificarTipoUsuariopthisUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_MODIFICARTIPOUSUARIO, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_MODIFICARTIPOUSUARIO_USUARIOMODIFICARTIPOUSUARIOPTHISUSUARIO, UsuarioConstants.SERV_ALIAS_MODIFICARTIPOUSUARIO, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_MODIFICARTIPOUSUARIO_USUARIOMODIFICARTIPOUSUARIOPTHISUSUARIO);
        }
    }

    @JsonIgnore
    public Long getUsuariomodificarTipoUsuariopTipoUsuario() {
        return this.usuariomodificarTipoUsuariopTipoUsuario;
    }
    
    public void setUsuariomodificarTipoUsuariopTipoUsuario(Long usuariomodificarTipoUsuariopTipoUsuario) {
        this.usuariomodificarTipoUsuariopTipoUsuario = usuariomodificarTipoUsuariopTipoUsuario;
    }

    private void checkUsuariomodificarTipoUsuariopTipoUsuario() throws NotNullArgumentException {
        if(this.getUsuariomodificarTipoUsuariopTipoUsuario() == null) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_MODIFICARTIPOUSUARIO, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_MODIFICARTIPOUSUARIO_USUARIOMODIFICARTIPOUSUARIOPTIPOUSUARIO, UsuarioConstants.SERV_ALIAS_MODIFICARTIPOUSUARIO, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_MODIFICARTIPOUSUARIO_USUARIOMODIFICARTIPOUSUARIOPTIPOUSUARIO);
        }
    }
}
