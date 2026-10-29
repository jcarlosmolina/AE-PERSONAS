package com.keralty.aepersonas.viewmodel.usuario.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Usuario;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneDeserializer;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneSerializer;
import java.sql.Date;

public class ModificarAttrRequest {

    @JsonProperty("p_thisattrusuario_oid")
    private UsuarioOid usuariomodificarAttrpthisAttrUsuario;
    
    @JsonIgnore
    private Usuario usuariomodificarAttrpthisAttrUsuarioInstance;

    @JsonProperty("p_bebegestante")
    private Boolean usuariomodificarAttrpBebeGestante;

    @JsonProperty("p_codigobancorep")
    private String usuariomodificarAttrpcodigoBancoRep;

    @JsonProperty("p_fechaantiguedad")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date usuariomodificarAttrpFechaAntiguedad;

    @JsonProperty("pepolizainternacional")
    private Boolean usuariomodificarAttrpePolizaInternacional;

    public void checkArguments() throws NotNullArgumentException {
        checkUsuariomodificarAttrpthisAttrUsuario();
        checkUsuariomodificarAttrpBebeGestante();
        checkUsuariomodificarAttrpePolizaInternacional();
    }

    @JsonIgnore
    public UsuarioOid getUsuariomodificarAttrpthisAttrUsuario() {
        return this.usuariomodificarAttrpthisAttrUsuario;
    }
    
    public void setUsuariomodificarAttrpthisAttrUsuario(UsuarioOid usuariomodificarAttrpthisAttrUsuario) {
        this.usuariomodificarAttrpthisAttrUsuario = usuariomodificarAttrpthisAttrUsuario;
    }

    @JsonIgnore
    public Usuario getUsuariomodificarAttrpthisAttrUsuarioInstance() {
        return this.usuariomodificarAttrpthisAttrUsuarioInstance;
    }
    
    public void setUsuariomodificarAttrpthisAttrUsuarioInstance(Usuario usuariomodificarAttrpthisAttrUsuario) {
        this.usuariomodificarAttrpthisAttrUsuarioInstance = usuariomodificarAttrpthisAttrUsuario;
        this.usuariomodificarAttrpthisAttrUsuario = usuariomodificarAttrpthisAttrUsuario != null ? usuariomodificarAttrpthisAttrUsuario.getOid() : null;
    }

    private void checkUsuariomodificarAttrpthisAttrUsuario() throws NotNullArgumentException {
        if(this.getUsuariomodificarAttrpthisAttrUsuarioInstance() == null || this.getUsuariomodificarAttrpthisAttrUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_MODIFICARATTR, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_MODIFICARATTR_USUARIOMODIFICARATTRPTHISATTRUSUARIO, UsuarioConstants.SERV_ALIAS_MODIFICARATTR, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_MODIFICARATTR_USUARIOMODIFICARATTRPTHISATTRUSUARIO);
        }
    }

    @JsonIgnore
    public Boolean getUsuariomodificarAttrpBebeGestante() {
        return this.usuariomodificarAttrpBebeGestante;
    }
    
    public void setUsuariomodificarAttrpBebeGestante(Boolean usuariomodificarAttrpBebeGestante) {
        this.usuariomodificarAttrpBebeGestante = usuariomodificarAttrpBebeGestante;
    }

    private void checkUsuariomodificarAttrpBebeGestante() throws NotNullArgumentException {
        if(this.getUsuariomodificarAttrpBebeGestante() == null) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_MODIFICARATTR, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_MODIFICARATTR_USUARIOMODIFICARATTRPBEBEGESTANTE, UsuarioConstants.SERV_ALIAS_MODIFICARATTR, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_MODIFICARATTR_USUARIOMODIFICARATTRPBEBEGESTANTE);
        }
    }

    @JsonIgnore
    public String getUsuariomodificarAttrpcodigoBancoRep() {
        return this.usuariomodificarAttrpcodigoBancoRep;
    }
    
    public void setUsuariomodificarAttrpcodigoBancoRep(String usuariomodificarAttrpcodigoBancoRep) {
        this.usuariomodificarAttrpcodigoBancoRep = usuariomodificarAttrpcodigoBancoRep;
    }

    @JsonIgnore
    public Date getUsuariomodificarAttrpFechaAntiguedad() {
        return this.usuariomodificarAttrpFechaAntiguedad;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setUsuariomodificarAttrpFechaAntiguedad(Date usuariomodificarAttrpFechaAntiguedad) {
        this.usuariomodificarAttrpFechaAntiguedad = usuariomodificarAttrpFechaAntiguedad;
    }

    @JsonIgnore
    public Boolean getUsuariomodificarAttrpePolizaInternacional() {
        return this.usuariomodificarAttrpePolizaInternacional;
    }
    
    public void setUsuariomodificarAttrpePolizaInternacional(Boolean usuariomodificarAttrpePolizaInternacional) {
        this.usuariomodificarAttrpePolizaInternacional = usuariomodificarAttrpePolizaInternacional;
    }

    private void checkUsuariomodificarAttrpePolizaInternacional() throws NotNullArgumentException {
        if(this.getUsuariomodificarAttrpePolizaInternacional() == null) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_MODIFICARATTR, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_MODIFICARATTR_USUARIOMODIFICARATTRPEPOLIZAINTERNACIONAL, UsuarioConstants.SERV_ALIAS_MODIFICARATTR, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_MODIFICARATTR_USUARIOMODIFICARATTRPEPOLIZAINTERNACIONAL);
        }
    }
}
