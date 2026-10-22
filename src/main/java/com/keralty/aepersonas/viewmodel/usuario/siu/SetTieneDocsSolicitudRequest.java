package com.keralty.aepersonas.viewmodel.usuario.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Usuario;

public class SetTieneDocsSolicitudRequest {

    @JsonProperty("p_thisusuario_oid")
    private UsuarioOid usuariosetTieneDocsSolicitudpthisUsuario;
    
    @JsonIgnore
    private Usuario usuariosetTieneDocsSolicitudpthisUsuarioInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkUsuariosetTieneDocsSolicitudpthisUsuario();
    }

    @JsonIgnore
    public UsuarioOid getUsuariosetTieneDocsSolicitudpthisUsuario() {
        return this.usuariosetTieneDocsSolicitudpthisUsuario;
    }
    
    public void setUsuariosetTieneDocsSolicitudpthisUsuario(UsuarioOid usuariosetTieneDocsSolicitudpthisUsuario) {
        this.usuariosetTieneDocsSolicitudpthisUsuario = usuariosetTieneDocsSolicitudpthisUsuario;
    }

    @JsonIgnore
    public Usuario getUsuariosetTieneDocsSolicitudpthisUsuarioInstance() {
        return this.usuariosetTieneDocsSolicitudpthisUsuarioInstance;
    }
    
    public void setUsuariosetTieneDocsSolicitudpthisUsuarioInstance(Usuario usuariosetTieneDocsSolicitudpthisUsuario) {
        this.usuariosetTieneDocsSolicitudpthisUsuarioInstance = usuariosetTieneDocsSolicitudpthisUsuario;
        this.usuariosetTieneDocsSolicitudpthisUsuario = usuariosetTieneDocsSolicitudpthisUsuario != null ? usuariosetTieneDocsSolicitudpthisUsuario.getOid() : null;
    }

    private void checkUsuariosetTieneDocsSolicitudpthisUsuario() throws NotNullArgumentException {
        if(this.getUsuariosetTieneDocsSolicitudpthisUsuarioInstance() == null || this.getUsuariosetTieneDocsSolicitudpthisUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_SETTIENEDOCSSOLICITUD, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_SETTIENEDOCSSOLICITUD_USUARIOSETTIENEDOCSSOLICITUDPTHISUSUARIO, UsuarioConstants.SERV_ALIAS_SETTIENEDOCSSOLICITUD, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_SETTIENEDOCSSOLICITUD_USUARIOSETTIENEDOCSSOLICITUDPTHISUSUARIO);
        }
    }
}
