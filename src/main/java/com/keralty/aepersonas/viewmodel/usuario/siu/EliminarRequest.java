package com.keralty.aepersonas.viewmodel.usuario.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Usuario;

public class EliminarRequest {

    @JsonProperty("p_thisattrusuario_oid")
    private UsuarioOid usuarioeliminarpthisAttrUsuario;
    
    @JsonIgnore
    private Usuario usuarioeliminarpthisAttrUsuarioInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkUsuarioeliminarpthisAttrUsuario();
    }

    @JsonIgnore
    public UsuarioOid getUsuarioeliminarpthisAttrUsuario() {
        return this.usuarioeliminarpthisAttrUsuario;
    }
    
    public void setUsuarioeliminarpthisAttrUsuario(UsuarioOid usuarioeliminarpthisAttrUsuario) {
        this.usuarioeliminarpthisAttrUsuario = usuarioeliminarpthisAttrUsuario;
    }

    @JsonIgnore
    public Usuario getUsuarioeliminarpthisAttrUsuarioInstance() {
        return this.usuarioeliminarpthisAttrUsuarioInstance;
    }
    
    public void setUsuarioeliminarpthisAttrUsuarioInstance(Usuario usuarioeliminarpthisAttrUsuario) {
        this.usuarioeliminarpthisAttrUsuarioInstance = usuarioeliminarpthisAttrUsuario;
        this.usuarioeliminarpthisAttrUsuario = usuarioeliminarpthisAttrUsuario != null ? usuarioeliminarpthisAttrUsuario.getOid() : null;
    }

    private void checkUsuarioeliminarpthisAttrUsuario() throws NotNullArgumentException {
        if(this.getUsuarioeliminarpthisAttrUsuarioInstance() == null || this.getUsuarioeliminarpthisAttrUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_ELIMINAR, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_ELIMINAR_USUARIOELIMINARPTHISATTRUSUARIO, UsuarioConstants.SERV_ALIAS_ELIMINAR, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_ELIMINAR_USUARIOELIMINARPTHISATTRUSUARIO);
        }
    }
}
