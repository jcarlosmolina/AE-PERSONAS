package com.keralty.aepersonas.viewmodel.usuario.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Usuario;

public class MarcarAttrDiligenciadosRequest {

    @JsonProperty("p_thisusuario_oid")
    private UsuarioOid usuariomarcarAttrDiligenciadospthisUsuario;
    
    @JsonIgnore
    private Usuario usuariomarcarAttrDiligenciadospthisUsuarioInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkUsuariomarcarAttrDiligenciadospthisUsuario();
    }

    @JsonIgnore
    public UsuarioOid getUsuariomarcarAttrDiligenciadospthisUsuario() {
        return this.usuariomarcarAttrDiligenciadospthisUsuario;
    }
    
    public void setUsuariomarcarAttrDiligenciadospthisUsuario(UsuarioOid usuariomarcarAttrDiligenciadospthisUsuario) {
        this.usuariomarcarAttrDiligenciadospthisUsuario = usuariomarcarAttrDiligenciadospthisUsuario;
    }

    @JsonIgnore
    public Usuario getUsuariomarcarAttrDiligenciadospthisUsuarioInstance() {
        return this.usuariomarcarAttrDiligenciadospthisUsuarioInstance;
    }
    
    public void setUsuariomarcarAttrDiligenciadospthisUsuarioInstance(Usuario usuariomarcarAttrDiligenciadospthisUsuario) {
        this.usuariomarcarAttrDiligenciadospthisUsuarioInstance = usuariomarcarAttrDiligenciadospthisUsuario;
        this.usuariomarcarAttrDiligenciadospthisUsuario = usuariomarcarAttrDiligenciadospthisUsuario != null ? usuariomarcarAttrDiligenciadospthisUsuario.getOid() : null;
    }

    private void checkUsuariomarcarAttrDiligenciadospthisUsuario() throws NotNullArgumentException {
        if(this.getUsuariomarcarAttrDiligenciadospthisUsuarioInstance() == null || this.getUsuariomarcarAttrDiligenciadospthisUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_MARCARATTRDILIGENCIADOS, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_MARCARATTRDILIGENCIADOS_USUARIOMARCARATTRDILIGENCIADOSPTHISUSUARIO, UsuarioConstants.SERV_ALIAS_MARCARATTRDILIGENCIADOS, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_MARCARATTRDILIGENCIADOS_USUARIOMARCARATTRDILIGENCIADOSPTHISUSUARIO);
        }
    }
}
