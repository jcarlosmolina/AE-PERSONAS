package com.keralty.aepersonas.viewmodel.usuario.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Usuario;

public class TNOTIFICARDOCUMENTORequest {

    @JsonProperty("p_thisusuario_oid")
    private UsuarioOid usuarioTNOTIFICARDOCUMENTOpthisUsuario;
    
    @JsonIgnore
    private Usuario usuarioTNOTIFICARDOCUMENTOpthisUsuarioInstance;

    @JsonProperty("ptipodocumento")
    private Long usuarioTNOTIFICARDOCUMENTOpTipoDocumento;

    public void checkArguments() throws NotNullArgumentException {
        checkUsuarioTNOTIFICARDOCUMENTOpthisUsuario();
        checkUsuarioTNOTIFICARDOCUMENTOpTipoDocumento();
    }

    @JsonIgnore
    public UsuarioOid getUsuarioTNOTIFICARDOCUMENTOpthisUsuario() {
        return this.usuarioTNOTIFICARDOCUMENTOpthisUsuario;
    }
    
    public void setUsuarioTNOTIFICARDOCUMENTOpthisUsuario(UsuarioOid usuarioTNOTIFICARDOCUMENTOpthisUsuario) {
        this.usuarioTNOTIFICARDOCUMENTOpthisUsuario = usuarioTNOTIFICARDOCUMENTOpthisUsuario;
    }

    @JsonIgnore
    public Usuario getUsuarioTNOTIFICARDOCUMENTOpthisUsuarioInstance() {
        return this.usuarioTNOTIFICARDOCUMENTOpthisUsuarioInstance;
    }
    
    public void setUsuarioTNOTIFICARDOCUMENTOpthisUsuarioInstance(Usuario usuarioTNOTIFICARDOCUMENTOpthisUsuario) {
        this.usuarioTNOTIFICARDOCUMENTOpthisUsuarioInstance = usuarioTNOTIFICARDOCUMENTOpthisUsuario;
        this.usuarioTNOTIFICARDOCUMENTOpthisUsuario = usuarioTNOTIFICARDOCUMENTOpthisUsuario != null ? usuarioTNOTIFICARDOCUMENTOpthisUsuario.getOid() : null;
    }

    private void checkUsuarioTNOTIFICARDOCUMENTOpthisUsuario() throws NotNullArgumentException {
        if(this.getUsuarioTNOTIFICARDOCUMENTOpthisUsuarioInstance() == null || this.getUsuarioTNOTIFICARDOCUMENTOpthisUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TNOTIFICARDOCUMENTO, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TNOTIFICARDOCUMENTO_USUARIOTNOTIFICARDOCUMENTOPTHISUSUARIO, UsuarioConstants.SERV_ALIAS_TNOTIFICARDOCUMENTO, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TNOTIFICARDOCUMENTO_USUARIOTNOTIFICARDOCUMENTOPTHISUSUARIO);
        }
    }

    @JsonIgnore
    public Long getUsuarioTNOTIFICARDOCUMENTOpTipoDocumento() {
        return this.usuarioTNOTIFICARDOCUMENTOpTipoDocumento;
    }
    
    public void setUsuarioTNOTIFICARDOCUMENTOpTipoDocumento(Long usuarioTNOTIFICARDOCUMENTOpTipoDocumento) {
        this.usuarioTNOTIFICARDOCUMENTOpTipoDocumento = usuarioTNOTIFICARDOCUMENTOpTipoDocumento;
    }

    private void checkUsuarioTNOTIFICARDOCUMENTOpTipoDocumento() throws NotNullArgumentException {
        if(this.getUsuarioTNOTIFICARDOCUMENTOpTipoDocumento() == null) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TNOTIFICARDOCUMENTO, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TNOTIFICARDOCUMENTO_USUARIOTNOTIFICARDOCUMENTOPTIPODOCUMENTO, UsuarioConstants.SERV_ALIAS_TNOTIFICARDOCUMENTO, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TNOTIFICARDOCUMENTO_USUARIOTNOTIFICARDOCUMENTOPTIPODOCUMENTO);
        }
    }
}
