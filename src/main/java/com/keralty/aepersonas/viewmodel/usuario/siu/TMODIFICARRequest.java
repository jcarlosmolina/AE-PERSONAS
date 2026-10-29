package com.keralty.aepersonas.viewmodel.usuario.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
import com.keralty.aepersonas.persistence.Usuario;

public class TMODIFICARRequest {

    @JsonProperty("p_thisusuario_oid")
    private UsuarioOid usuarioTMODIFICARpthisUsuario;
    
    @JsonIgnore
    private Usuario usuarioTMODIFICARpthisUsuarioInstance;

    @JsonProperty("pt_p_codigo")
    private Long usuarioTMODIFICARptpCodigo;

    @JsonProperty("pt_p_numidentificacion")
    private String usuarioTMODIFICARptpNumIdentificacion;

    @JsonProperty("pt_p_primernombre")
    private String usuarioTMODIFICARptpPrimerNombre;

    @JsonProperty("pt_p_segundonombre")
    private String usuarioTMODIFICARptpSegundoNombre;

    @JsonProperty("pt_p_primerapellido")
    private String usuarioTMODIFICARptpPrimerApellido;

    @JsonProperty("pt_p_segundoapellido")
    private String usuarioTMODIFICARptpSegundoApellido;

    @JsonProperty("pt_p_evctipoidentificacion_oid")
    private TipoIdentificacionOid usuarioTMODIFICARptpevcTipoIdentificacion;
    
    @JsonIgnore
    private TipoIdentificacion usuarioTMODIFICARptpevcTipoIdentificacionInstance;

    @JsonProperty("p_eseltitular")
    private Boolean usuarioTMODIFICARpEsElTitular;

    public void checkArguments() throws NotNullArgumentException {
        checkUsuarioTMODIFICARpthisUsuario();
        checkUsuarioTMODIFICARptpNumIdentificacion();
        checkUsuarioTMODIFICARptpevcTipoIdentificacion();
        checkUsuarioTMODIFICARpEsElTitular();
    }

    @JsonIgnore
    public UsuarioOid getUsuarioTMODIFICARpthisUsuario() {
        return this.usuarioTMODIFICARpthisUsuario;
    }
    
    public void setUsuarioTMODIFICARpthisUsuario(UsuarioOid usuarioTMODIFICARpthisUsuario) {
        this.usuarioTMODIFICARpthisUsuario = usuarioTMODIFICARpthisUsuario;
    }

    @JsonIgnore
    public Usuario getUsuarioTMODIFICARpthisUsuarioInstance() {
        return this.usuarioTMODIFICARpthisUsuarioInstance;
    }
    
    public void setUsuarioTMODIFICARpthisUsuarioInstance(Usuario usuarioTMODIFICARpthisUsuario) {
        this.usuarioTMODIFICARpthisUsuarioInstance = usuarioTMODIFICARpthisUsuario;
        this.usuarioTMODIFICARpthisUsuario = usuarioTMODIFICARpthisUsuario != null ? usuarioTMODIFICARpthisUsuario.getOid() : null;
    }

    private void checkUsuarioTMODIFICARpthisUsuario() throws NotNullArgumentException {
        if(this.getUsuarioTMODIFICARpthisUsuarioInstance() == null || this.getUsuarioTMODIFICARpthisUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TMODIFICAR, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TMODIFICAR_USUARIOTMODIFICARPTHISUSUARIO, UsuarioConstants.SERV_ALIAS_TMODIFICAR, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TMODIFICAR_USUARIOTMODIFICARPTHISUSUARIO);
        }
    }

    @JsonIgnore
    public Long getUsuarioTMODIFICARptpCodigo() {
        return this.usuarioTMODIFICARptpCodigo;
    }
    
    public void setUsuarioTMODIFICARptpCodigo(Long usuarioTMODIFICARptpCodigo) {
        this.usuarioTMODIFICARptpCodigo = usuarioTMODIFICARptpCodigo;
    }

    @JsonIgnore
    public String getUsuarioTMODIFICARptpNumIdentificacion() {
        return this.usuarioTMODIFICARptpNumIdentificacion;
    }
    
    public void setUsuarioTMODIFICARptpNumIdentificacion(String usuarioTMODIFICARptpNumIdentificacion) {
        this.usuarioTMODIFICARptpNumIdentificacion = usuarioTMODIFICARptpNumIdentificacion;
    }

    private void checkUsuarioTMODIFICARptpNumIdentificacion() throws NotNullArgumentException {
        if(this.getUsuarioTMODIFICARptpNumIdentificacion() == null) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TMODIFICAR, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TMODIFICAR_USUARIOTMODIFICARPTPNUMIDENTIFICACION, UsuarioConstants.SERV_ALIAS_TMODIFICAR, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TMODIFICAR_USUARIOTMODIFICARPTPNUMIDENTIFICACION);
        }
    }

    @JsonIgnore
    public String getUsuarioTMODIFICARptpPrimerNombre() {
        return this.usuarioTMODIFICARptpPrimerNombre;
    }
    
    public void setUsuarioTMODIFICARptpPrimerNombre(String usuarioTMODIFICARptpPrimerNombre) {
        this.usuarioTMODIFICARptpPrimerNombre = usuarioTMODIFICARptpPrimerNombre;
    }

    @JsonIgnore
    public String getUsuarioTMODIFICARptpSegundoNombre() {
        return this.usuarioTMODIFICARptpSegundoNombre;
    }
    
    public void setUsuarioTMODIFICARptpSegundoNombre(String usuarioTMODIFICARptpSegundoNombre) {
        this.usuarioTMODIFICARptpSegundoNombre = usuarioTMODIFICARptpSegundoNombre;
    }

    @JsonIgnore
    public String getUsuarioTMODIFICARptpPrimerApellido() {
        return this.usuarioTMODIFICARptpPrimerApellido;
    }
    
    public void setUsuarioTMODIFICARptpPrimerApellido(String usuarioTMODIFICARptpPrimerApellido) {
        this.usuarioTMODIFICARptpPrimerApellido = usuarioTMODIFICARptpPrimerApellido;
    }

    @JsonIgnore
    public String getUsuarioTMODIFICARptpSegundoApellido() {
        return this.usuarioTMODIFICARptpSegundoApellido;
    }
    
    public void setUsuarioTMODIFICARptpSegundoApellido(String usuarioTMODIFICARptpSegundoApellido) {
        this.usuarioTMODIFICARptpSegundoApellido = usuarioTMODIFICARptpSegundoApellido;
    }

    @JsonIgnore
    public TipoIdentificacionOid getUsuarioTMODIFICARptpevcTipoIdentificacion() {
        return this.usuarioTMODIFICARptpevcTipoIdentificacion;
    }
    
    public void setUsuarioTMODIFICARptpevcTipoIdentificacion(TipoIdentificacionOid usuarioTMODIFICARptpevcTipoIdentificacion) {
        this.usuarioTMODIFICARptpevcTipoIdentificacion = usuarioTMODIFICARptpevcTipoIdentificacion;
    }

    @JsonIgnore
    public TipoIdentificacion getUsuarioTMODIFICARptpevcTipoIdentificacionInstance() {
        return this.usuarioTMODIFICARptpevcTipoIdentificacionInstance;
    }
    
    public void setUsuarioTMODIFICARptpevcTipoIdentificacionInstance(TipoIdentificacion usuarioTMODIFICARptpevcTipoIdentificacion) {
        this.usuarioTMODIFICARptpevcTipoIdentificacionInstance = usuarioTMODIFICARptpevcTipoIdentificacion;
        this.usuarioTMODIFICARptpevcTipoIdentificacion = usuarioTMODIFICARptpevcTipoIdentificacion != null ? usuarioTMODIFICARptpevcTipoIdentificacion.getOid() : null;
    }

    private void checkUsuarioTMODIFICARptpevcTipoIdentificacion() throws NotNullArgumentException {
        if(this.getUsuarioTMODIFICARptpevcTipoIdentificacionInstance() == null || this.getUsuarioTMODIFICARptpevcTipoIdentificacionInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TMODIFICAR, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TMODIFICAR_USUARIOTMODIFICARPTPEVCTIPOIDENTIFICACION, UsuarioConstants.SERV_ALIAS_TMODIFICAR, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TMODIFICAR_USUARIOTMODIFICARPTPEVCTIPOIDENTIFICACION);
        }
    }

    @JsonIgnore
    public Boolean getUsuarioTMODIFICARpEsElTitular() {
        return this.usuarioTMODIFICARpEsElTitular;
    }
    
    public void setUsuarioTMODIFICARpEsElTitular(Boolean usuarioTMODIFICARpEsElTitular) {
        this.usuarioTMODIFICARpEsElTitular = usuarioTMODIFICARpEsElTitular;
    }

    private void checkUsuarioTMODIFICARpEsElTitular() throws NotNullArgumentException {
        if(this.getUsuarioTMODIFICARpEsElTitular() == null) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TMODIFICAR, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TMODIFICAR_USUARIOTMODIFICARPESELTITULAR, UsuarioConstants.SERV_ALIAS_TMODIFICAR, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TMODIFICAR_USUARIOTMODIFICARPESELTITULAR);
        }
    }
}
