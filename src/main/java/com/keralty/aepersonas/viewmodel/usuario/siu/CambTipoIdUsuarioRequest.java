package com.keralty.aepersonas.viewmodel.usuario.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
import com.keralty.aepersonas.persistence.Usuario;

public class CambTipoIdUsuarioRequest {

    @JsonProperty("p_thisusuario_oid")
    private UsuarioOid usuarioCambTipoIdUsuariopthisUsuario;
    
    @JsonIgnore
    private Usuario usuarioCambTipoIdUsuariopthisUsuarioInstance;

    @JsonProperty("p_evctipoidentificacion_oid")
    private TipoIdentificacionOid usuarioCambTipoIdUsuariopevcTipoIdentificacion;
    
    @JsonIgnore
    private TipoIdentificacion usuarioCambTipoIdUsuariopevcTipoIdentificacionInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkUsuarioCambTipoIdUsuariopthisUsuario();
        checkUsuarioCambTipoIdUsuariopevcTipoIdentificacion();
    }

    @JsonIgnore
    public UsuarioOid getUsuarioCambTipoIdUsuariopthisUsuario() {
        return this.usuarioCambTipoIdUsuariopthisUsuario;
    }
    
    public void setUsuarioCambTipoIdUsuariopthisUsuario(UsuarioOid usuarioCambTipoIdUsuariopthisUsuario) {
        this.usuarioCambTipoIdUsuariopthisUsuario = usuarioCambTipoIdUsuariopthisUsuario;
    }

    @JsonIgnore
    public Usuario getUsuarioCambTipoIdUsuariopthisUsuarioInstance() {
        return this.usuarioCambTipoIdUsuariopthisUsuarioInstance;
    }
    
    public void setUsuarioCambTipoIdUsuariopthisUsuarioInstance(Usuario usuarioCambTipoIdUsuariopthisUsuario) {
        this.usuarioCambTipoIdUsuariopthisUsuarioInstance = usuarioCambTipoIdUsuariopthisUsuario;
        this.usuarioCambTipoIdUsuariopthisUsuario = usuarioCambTipoIdUsuariopthisUsuario != null ? usuarioCambTipoIdUsuariopthisUsuario.getOid() : null;
    }

    private void checkUsuarioCambTipoIdUsuariopthisUsuario() throws NotNullArgumentException {
        if(this.getUsuarioCambTipoIdUsuariopthisUsuarioInstance() == null || this.getUsuarioCambTipoIdUsuariopthisUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_CAMBTIPOIDUSUARIO, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_CAMBTIPOIDUSUARIO_USUARIOCAMBTIPOIDUSUARIOPTHISUSUARIO, UsuarioConstants.SERV_ALIAS_CAMBTIPOIDUSUARIO, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_CAMBTIPOIDUSUARIO_USUARIOCAMBTIPOIDUSUARIOPTHISUSUARIO);
        }
    }

    @JsonIgnore
    public TipoIdentificacionOid getUsuarioCambTipoIdUsuariopevcTipoIdentificacion() {
        return this.usuarioCambTipoIdUsuariopevcTipoIdentificacion;
    }
    
    public void setUsuarioCambTipoIdUsuariopevcTipoIdentificacion(TipoIdentificacionOid usuarioCambTipoIdUsuariopevcTipoIdentificacion) {
        this.usuarioCambTipoIdUsuariopevcTipoIdentificacion = usuarioCambTipoIdUsuariopevcTipoIdentificacion;
    }

    @JsonIgnore
    public TipoIdentificacion getUsuarioCambTipoIdUsuariopevcTipoIdentificacionInstance() {
        return this.usuarioCambTipoIdUsuariopevcTipoIdentificacionInstance;
    }
    
    public void setUsuarioCambTipoIdUsuariopevcTipoIdentificacionInstance(TipoIdentificacion usuarioCambTipoIdUsuariopevcTipoIdentificacion) {
        this.usuarioCambTipoIdUsuariopevcTipoIdentificacionInstance = usuarioCambTipoIdUsuariopevcTipoIdentificacion;
        this.usuarioCambTipoIdUsuariopevcTipoIdentificacion = usuarioCambTipoIdUsuariopevcTipoIdentificacion != null ? usuarioCambTipoIdUsuariopevcTipoIdentificacion.getOid() : null;
    }

    private void checkUsuarioCambTipoIdUsuariopevcTipoIdentificacion() throws NotNullArgumentException {
        if(this.getUsuarioCambTipoIdUsuariopevcTipoIdentificacionInstance() == null || this.getUsuarioCambTipoIdUsuariopevcTipoIdentificacionInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_CAMBTIPOIDUSUARIO, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_CAMBTIPOIDUSUARIO_USUARIOCAMBTIPOIDUSUARIOPEVCTIPOIDENTIFICACION, UsuarioConstants.SERV_ALIAS_CAMBTIPOIDUSUARIO, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_CAMBTIPOIDUSUARIO_USUARIOCAMBTIPOIDUSUARIOPEVCTIPOIDENTIFICACION);
        }
    }
}
