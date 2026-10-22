package com.keralty.aepersonas.viewmodel.usuario.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Usuario;

public class TELIMINARRequest {

    @JsonProperty("p_thisusuario_oid")
    private UsuarioOid usuarioTELIMINARpthisUsuario;
    
    @JsonIgnore
    private Usuario usuarioTELIMINARpthisUsuarioInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkUsuarioTELIMINARpthisUsuario();
    }

    @JsonIgnore
    public UsuarioOid getUsuarioTELIMINARpthisUsuario() {
        return this.usuarioTELIMINARpthisUsuario;
    }
    
    public void setUsuarioTELIMINARpthisUsuario(UsuarioOid usuarioTELIMINARpthisUsuario) {
        this.usuarioTELIMINARpthisUsuario = usuarioTELIMINARpthisUsuario;
    }

    @JsonIgnore
    public Usuario getUsuarioTELIMINARpthisUsuarioInstance() {
        return this.usuarioTELIMINARpthisUsuarioInstance;
    }
    
    public void setUsuarioTELIMINARpthisUsuarioInstance(Usuario usuarioTELIMINARpthisUsuario) {
        this.usuarioTELIMINARpthisUsuarioInstance = usuarioTELIMINARpthisUsuario;
        this.usuarioTELIMINARpthisUsuario = usuarioTELIMINARpthisUsuario != null ? usuarioTELIMINARpthisUsuario.getOid() : null;
    }

    private void checkUsuarioTELIMINARpthisUsuario() throws NotNullArgumentException {
        if(this.getUsuarioTELIMINARpthisUsuarioInstance() == null || this.getUsuarioTELIMINARpthisUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TELIMINAR, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TELIMINAR_USUARIOTELIMINARPTHISUSUARIO, UsuarioConstants.SERV_ALIAS_TELIMINAR, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TELIMINAR_USUARIOTELIMINARPTHISUSUARIO);
        }
    }
}
