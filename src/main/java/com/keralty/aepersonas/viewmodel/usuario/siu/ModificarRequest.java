package com.keralty.aepersonas.viewmodel.usuario.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Usuario;

public class ModificarRequest {

    @JsonProperty("p_thisusuario_oid")
    private UsuarioOid usuariomodificarpthisUsuario;
    
    @JsonIgnore
    private Usuario usuariomodificarpthisUsuarioInstance;

    @JsonProperty("p_codigo")
    private Long usuariomodificarpCodigo;

    @JsonProperty("p_numidentificacion")
    private String usuariomodificarpNumIdentificacion;

    @JsonProperty("p_primernombre")
    private String usuariomodificarpPrimerNombre;

    @JsonProperty("p_segundonombre")
    private String usuariomodificarpSegundoNombre;

    @JsonProperty("p_primerapellido")
    private String usuariomodificarpPrimerApellido;

    @JsonProperty("p_segundoapellido")
    private String usuariomodificarpSegundoApellido;

    public void checkArguments() throws NotNullArgumentException {
        checkUsuariomodificarpthisUsuario();
        checkUsuariomodificarpNumIdentificacion();
    }

    @JsonIgnore
    public UsuarioOid getUsuariomodificarpthisUsuario() {
        return this.usuariomodificarpthisUsuario;
    }
    
    public void setUsuariomodificarpthisUsuario(UsuarioOid usuariomodificarpthisUsuario) {
        this.usuariomodificarpthisUsuario = usuariomodificarpthisUsuario;
    }

    @JsonIgnore
    public Usuario getUsuariomodificarpthisUsuarioInstance() {
        return this.usuariomodificarpthisUsuarioInstance;
    }
    
    public void setUsuariomodificarpthisUsuarioInstance(Usuario usuariomodificarpthisUsuario) {
        this.usuariomodificarpthisUsuarioInstance = usuariomodificarpthisUsuario;
        this.usuariomodificarpthisUsuario = usuariomodificarpthisUsuario != null ? usuariomodificarpthisUsuario.getOid() : null;
    }

    private void checkUsuariomodificarpthisUsuario() throws NotNullArgumentException {
        if(this.getUsuariomodificarpthisUsuarioInstance() == null || this.getUsuariomodificarpthisUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_MODIFICAR, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_MODIFICAR_USUARIOMODIFICARPTHISUSUARIO, UsuarioConstants.SERV_ALIAS_MODIFICAR, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_MODIFICAR_USUARIOMODIFICARPTHISUSUARIO);
        }
    }

    @JsonIgnore
    public Long getUsuariomodificarpCodigo() {
        return this.usuariomodificarpCodigo;
    }
    
    public void setUsuariomodificarpCodigo(Long usuariomodificarpCodigo) {
        this.usuariomodificarpCodigo = usuariomodificarpCodigo;
    }

    @JsonIgnore
    public String getUsuariomodificarpNumIdentificacion() {
        return this.usuariomodificarpNumIdentificacion;
    }
    
    public void setUsuariomodificarpNumIdentificacion(String usuariomodificarpNumIdentificacion) {
        this.usuariomodificarpNumIdentificacion = usuariomodificarpNumIdentificacion;
    }

    private void checkUsuariomodificarpNumIdentificacion() throws NotNullArgumentException {
        if(this.getUsuariomodificarpNumIdentificacion() == null) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_MODIFICAR, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_MODIFICAR_USUARIOMODIFICARPNUMIDENTIFICACION, UsuarioConstants.SERV_ALIAS_MODIFICAR, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_MODIFICAR_USUARIOMODIFICARPNUMIDENTIFICACION);
        }
    }

    @JsonIgnore
    public String getUsuariomodificarpPrimerNombre() {
        return this.usuariomodificarpPrimerNombre;
    }
    
    public void setUsuariomodificarpPrimerNombre(String usuariomodificarpPrimerNombre) {
        this.usuariomodificarpPrimerNombre = usuariomodificarpPrimerNombre;
    }

    @JsonIgnore
    public String getUsuariomodificarpSegundoNombre() {
        return this.usuariomodificarpSegundoNombre;
    }
    
    public void setUsuariomodificarpSegundoNombre(String usuariomodificarpSegundoNombre) {
        this.usuariomodificarpSegundoNombre = usuariomodificarpSegundoNombre;
    }

    @JsonIgnore
    public String getUsuariomodificarpPrimerApellido() {
        return this.usuariomodificarpPrimerApellido;
    }
    
    public void setUsuariomodificarpPrimerApellido(String usuariomodificarpPrimerApellido) {
        this.usuariomodificarpPrimerApellido = usuariomodificarpPrimerApellido;
    }

    @JsonIgnore
    public String getUsuariomodificarpSegundoApellido() {
        return this.usuariomodificarpSegundoApellido;
    }
    
    public void setUsuariomodificarpSegundoApellido(String usuariomodificarpSegundoApellido) {
        this.usuariomodificarpSegundoApellido = usuariomodificarpSegundoApellido;
    }
}
