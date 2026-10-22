package com.keralty.aepersonas.viewmodel.usuario.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Usuario;

public class TCREARCUESMEDICORequest {

    @JsonProperty("p_thisusuario_oid")
    private UsuarioOid usuarioTCREARCUESMEDICOpthisUsuario;
    
    @JsonIgnore
    private Usuario usuarioTCREARCUESMEDICOpthisUsuarioInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkUsuarioTCREARCUESMEDICOpthisUsuario();
    }

    @JsonIgnore
    public UsuarioOid getUsuarioTCREARCUESMEDICOpthisUsuario() {
        return this.usuarioTCREARCUESMEDICOpthisUsuario;
    }
    
    public void setUsuarioTCREARCUESMEDICOpthisUsuario(UsuarioOid usuarioTCREARCUESMEDICOpthisUsuario) {
        this.usuarioTCREARCUESMEDICOpthisUsuario = usuarioTCREARCUESMEDICOpthisUsuario;
    }

    @JsonIgnore
    public Usuario getUsuarioTCREARCUESMEDICOpthisUsuarioInstance() {
        return this.usuarioTCREARCUESMEDICOpthisUsuarioInstance;
    }
    
    public void setUsuarioTCREARCUESMEDICOpthisUsuarioInstance(Usuario usuarioTCREARCUESMEDICOpthisUsuario) {
        this.usuarioTCREARCUESMEDICOpthisUsuarioInstance = usuarioTCREARCUESMEDICOpthisUsuario;
        this.usuarioTCREARCUESMEDICOpthisUsuario = usuarioTCREARCUESMEDICOpthisUsuario != null ? usuarioTCREARCUESMEDICOpthisUsuario.getOid() : null;
    }

    private void checkUsuarioTCREARCUESMEDICOpthisUsuario() throws NotNullArgumentException {
        if(this.getUsuarioTCREARCUESMEDICOpthisUsuarioInstance() == null || this.getUsuarioTCREARCUESMEDICOpthisUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TCREARCUESMEDICO, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TCREARCUESMEDICO_USUARIOTCREARCUESMEDICOPTHISUSUARIO, UsuarioConstants.SERV_ALIAS_TCREARCUESMEDICO, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TCREARCUESMEDICO_USUARIOTCREARCUESMEDICOPTHISUSUARIO);
        }
    }
}
