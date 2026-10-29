package com.keralty.aepersonas.viewmodel.usuario.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.persistence.EstadoBeneficiario;
import com.keralty.aepersonas.persistence.oid.EstadoBeneficiarioOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Usuario;

public class DelEstadoBeneficiarioCORERequest {

    @JsonProperty("p_thisusuario_oid")
    private UsuarioOid usuarioDelEstadoBeneficiarioCOREpthisUsuario;
    
    @JsonIgnore
    private Usuario usuarioDelEstadoBeneficiarioCOREpthisUsuarioInstance;

    @JsonProperty("p_evcestadobeneficiario_oid")
    private EstadoBeneficiarioOid usuarioDelEstadoBeneficiarioCOREpevcEstadoBeneficiario;
    
    @JsonIgnore
    private EstadoBeneficiario usuarioDelEstadoBeneficiarioCOREpevcEstadoBeneficiarioInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkUsuarioDelEstadoBeneficiarioCOREpthisUsuario();
        checkUsuarioDelEstadoBeneficiarioCOREpevcEstadoBeneficiario();
    }

    @JsonIgnore
    public UsuarioOid getUsuarioDelEstadoBeneficiarioCOREpthisUsuario() {
        return this.usuarioDelEstadoBeneficiarioCOREpthisUsuario;
    }
    
    public void setUsuarioDelEstadoBeneficiarioCOREpthisUsuario(UsuarioOid usuarioDelEstadoBeneficiarioCOREpthisUsuario) {
        this.usuarioDelEstadoBeneficiarioCOREpthisUsuario = usuarioDelEstadoBeneficiarioCOREpthisUsuario;
    }

    @JsonIgnore
    public Usuario getUsuarioDelEstadoBeneficiarioCOREpthisUsuarioInstance() {
        return this.usuarioDelEstadoBeneficiarioCOREpthisUsuarioInstance;
    }
    
    public void setUsuarioDelEstadoBeneficiarioCOREpthisUsuarioInstance(Usuario usuarioDelEstadoBeneficiarioCOREpthisUsuario) {
        this.usuarioDelEstadoBeneficiarioCOREpthisUsuarioInstance = usuarioDelEstadoBeneficiarioCOREpthisUsuario;
        this.usuarioDelEstadoBeneficiarioCOREpthisUsuario = usuarioDelEstadoBeneficiarioCOREpthisUsuario != null ? usuarioDelEstadoBeneficiarioCOREpthisUsuario.getOid() : null;
    }

    private void checkUsuarioDelEstadoBeneficiarioCOREpthisUsuario() throws NotNullArgumentException {
        if(this.getUsuarioDelEstadoBeneficiarioCOREpthisUsuarioInstance() == null || this.getUsuarioDelEstadoBeneficiarioCOREpthisUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_DELESTADOBENEFICIARIOCORE, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_DELESTADOBENEFICIARIOCORE_USUARIODELESTADOBENEFICIARIOCOREPTHISUSUARIO, UsuarioConstants.SERV_ALIAS_DELESTADOBENEFICIARIOCORE, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_DELESTADOBENEFICIARIOCORE_USUARIODELESTADOBENEFICIARIOCOREPTHISUSUARIO);
        }
    }

    @JsonIgnore
    public EstadoBeneficiarioOid getUsuarioDelEstadoBeneficiarioCOREpevcEstadoBeneficiario() {
        return this.usuarioDelEstadoBeneficiarioCOREpevcEstadoBeneficiario;
    }
    
    public void setUsuarioDelEstadoBeneficiarioCOREpevcEstadoBeneficiario(EstadoBeneficiarioOid usuarioDelEstadoBeneficiarioCOREpevcEstadoBeneficiario) {
        this.usuarioDelEstadoBeneficiarioCOREpevcEstadoBeneficiario = usuarioDelEstadoBeneficiarioCOREpevcEstadoBeneficiario;
    }

    @JsonIgnore
    public EstadoBeneficiario getUsuarioDelEstadoBeneficiarioCOREpevcEstadoBeneficiarioInstance() {
        return this.usuarioDelEstadoBeneficiarioCOREpevcEstadoBeneficiarioInstance;
    }
    
    public void setUsuarioDelEstadoBeneficiarioCOREpevcEstadoBeneficiarioInstance(EstadoBeneficiario usuarioDelEstadoBeneficiarioCOREpevcEstadoBeneficiario) {
        this.usuarioDelEstadoBeneficiarioCOREpevcEstadoBeneficiarioInstance = usuarioDelEstadoBeneficiarioCOREpevcEstadoBeneficiario;
        this.usuarioDelEstadoBeneficiarioCOREpevcEstadoBeneficiario = usuarioDelEstadoBeneficiarioCOREpevcEstadoBeneficiario != null ? usuarioDelEstadoBeneficiarioCOREpevcEstadoBeneficiario.getOid() : null;
    }

    private void checkUsuarioDelEstadoBeneficiarioCOREpevcEstadoBeneficiario() throws NotNullArgumentException {
        if(this.getUsuarioDelEstadoBeneficiarioCOREpevcEstadoBeneficiarioInstance() == null || this.getUsuarioDelEstadoBeneficiarioCOREpevcEstadoBeneficiarioInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_DELESTADOBENEFICIARIOCORE, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_DELESTADOBENEFICIARIOCORE_USUARIODELESTADOBENEFICIARIOCOREPEVCESTADOBENEFICIARIO, UsuarioConstants.SERV_ALIAS_DELESTADOBENEFICIARIOCORE, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_DELESTADOBENEFICIARIOCORE_USUARIODELESTADOBENEFICIARIOCOREPEVCESTADOBENEFICIARIO);
        }
    }
}
