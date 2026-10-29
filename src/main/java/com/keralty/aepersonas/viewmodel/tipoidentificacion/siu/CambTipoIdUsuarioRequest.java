package com.keralty.aepersonas.viewmodel.tipoidentificacion.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.TipoIdentificacionConstants;
import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
import com.keralty.aepersonas.persistence.Usuario;

public class CambTipoIdUsuarioRequest {

    @JsonProperty("p_thistipoidentificacion_oid")
    private TipoIdentificacionOid tipoIdentificacionCambTipoIdUsuariopthisTipoIdentificacion;
    
    @JsonIgnore
    private TipoIdentificacion tipoIdentificacionCambTipoIdUsuariopthisTipoIdentificacionInstance;

    @JsonProperty("p_evcusuario_oid")
    private UsuarioOid tipoIdentificacionCambTipoIdUsuariopevcUsuario;
    
    @JsonIgnore
    private Usuario tipoIdentificacionCambTipoIdUsuariopevcUsuarioInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkTipoIdentificacionCambTipoIdUsuariopthisTipoIdentificacion();
        checkTipoIdentificacionCambTipoIdUsuariopevcUsuario();
    }

    @JsonIgnore
    public TipoIdentificacionOid getTipoIdentificacionCambTipoIdUsuariopthisTipoIdentificacion() {
        return this.tipoIdentificacionCambTipoIdUsuariopthisTipoIdentificacion;
    }
    
    public void setTipoIdentificacionCambTipoIdUsuariopthisTipoIdentificacion(TipoIdentificacionOid tipoIdentificacionCambTipoIdUsuariopthisTipoIdentificacion) {
        this.tipoIdentificacionCambTipoIdUsuariopthisTipoIdentificacion = tipoIdentificacionCambTipoIdUsuariopthisTipoIdentificacion;
    }

    @JsonIgnore
    public TipoIdentificacion getTipoIdentificacionCambTipoIdUsuariopthisTipoIdentificacionInstance() {
        return this.tipoIdentificacionCambTipoIdUsuariopthisTipoIdentificacionInstance;
    }
    
    public void setTipoIdentificacionCambTipoIdUsuariopthisTipoIdentificacionInstance(TipoIdentificacion tipoIdentificacionCambTipoIdUsuariopthisTipoIdentificacion) {
        this.tipoIdentificacionCambTipoIdUsuariopthisTipoIdentificacionInstance = tipoIdentificacionCambTipoIdUsuariopthisTipoIdentificacion;
        this.tipoIdentificacionCambTipoIdUsuariopthisTipoIdentificacion = tipoIdentificacionCambTipoIdUsuariopthisTipoIdentificacion != null ? tipoIdentificacionCambTipoIdUsuariopthisTipoIdentificacion.getOid() : null;
    }

    private void checkTipoIdentificacionCambTipoIdUsuariopthisTipoIdentificacion() throws NotNullArgumentException {
        if(this.getTipoIdentificacionCambTipoIdUsuariopthisTipoIdentificacionInstance() == null || this.getTipoIdentificacionCambTipoIdUsuariopthisTipoIdentificacionInstance().isNull()) {
            throw new NotNullArgumentException(TipoIdentificacionConstants.SERV_ID_CAMBTIPOIDUSUARIO, TipoIdentificacionConstants.CLASS_ID, TipoIdentificacionConstants.ARG_ID_CAMBTIPOIDUSUARIO_TIPOIDENTIFICACIONCAMBTIPOIDUSUARIOPTHISTIPOIDENTIFICACION, TipoIdentificacionConstants.SERV_ALIAS_CAMBTIPOIDUSUARIO, TipoIdentificacionConstants.CLASS_ALIAS, TipoIdentificacionConstants.ARG_ALIAS_CAMBTIPOIDUSUARIO_TIPOIDENTIFICACIONCAMBTIPOIDUSUARIOPTHISTIPOIDENTIFICACION);
        }
    }

    @JsonIgnore
    public UsuarioOid getTipoIdentificacionCambTipoIdUsuariopevcUsuario() {
        return this.tipoIdentificacionCambTipoIdUsuariopevcUsuario;
    }
    
    public void setTipoIdentificacionCambTipoIdUsuariopevcUsuario(UsuarioOid tipoIdentificacionCambTipoIdUsuariopevcUsuario) {
        this.tipoIdentificacionCambTipoIdUsuariopevcUsuario = tipoIdentificacionCambTipoIdUsuariopevcUsuario;
    }

    @JsonIgnore
    public Usuario getTipoIdentificacionCambTipoIdUsuariopevcUsuarioInstance() {
        return this.tipoIdentificacionCambTipoIdUsuariopevcUsuarioInstance;
    }
    
    public void setTipoIdentificacionCambTipoIdUsuariopevcUsuarioInstance(Usuario tipoIdentificacionCambTipoIdUsuariopevcUsuario) {
        this.tipoIdentificacionCambTipoIdUsuariopevcUsuarioInstance = tipoIdentificacionCambTipoIdUsuariopevcUsuario;
        this.tipoIdentificacionCambTipoIdUsuariopevcUsuario = tipoIdentificacionCambTipoIdUsuariopevcUsuario != null ? tipoIdentificacionCambTipoIdUsuariopevcUsuario.getOid() : null;
    }

    private void checkTipoIdentificacionCambTipoIdUsuariopevcUsuario() throws NotNullArgumentException {
        if(this.getTipoIdentificacionCambTipoIdUsuariopevcUsuarioInstance() == null || this.getTipoIdentificacionCambTipoIdUsuariopevcUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(TipoIdentificacionConstants.SERV_ID_CAMBTIPOIDUSUARIO, TipoIdentificacionConstants.CLASS_ID, TipoIdentificacionConstants.ARG_ID_CAMBTIPOIDUSUARIO_TIPOIDENTIFICACIONCAMBTIPOIDUSUARIOPEVCUSUARIO, TipoIdentificacionConstants.SERV_ALIAS_CAMBTIPOIDUSUARIO, TipoIdentificacionConstants.CLASS_ALIAS, TipoIdentificacionConstants.ARG_ALIAS_CAMBTIPOIDUSUARIO_TIPOIDENTIFICACIONCAMBTIPOIDUSUARIOPEVCUSUARIO);
        }
    }
}
