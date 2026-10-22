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

public class TADDPREEXISTRequest {

    @JsonProperty("p_thisusuario_oid")
    private UsuarioOid usuarioTADDPREEXISTpthisUsuario;
    
    @JsonIgnore
    private Usuario usuarioTADDPREEXISTpthisUsuarioInstance;

    @JsonProperty("pt_p_atrdescripcion")
    private String usuarioTADDPREEXISTptpatrDescripcion;

    @JsonProperty("pt_p_atrfecinicio")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date usuarioTADDPREEXISTptpatrFecInicio;

    @JsonProperty("pt_p_atrfecfin")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date usuarioTADDPREEXISTptpatrFecFin;

    @JsonProperty("pt_p_atrobservacion")
    private String usuarioTADDPREEXISTptpatrObservacion;

    public void checkArguments() throws NotNullArgumentException {
        checkUsuarioTADDPREEXISTpthisUsuario();
        checkUsuarioTADDPREEXISTptpatrDescripcion();
        checkUsuarioTADDPREEXISTptpatrFecInicio();
    }

    @JsonIgnore
    public UsuarioOid getUsuarioTADDPREEXISTpthisUsuario() {
        return this.usuarioTADDPREEXISTpthisUsuario;
    }
    
    public void setUsuarioTADDPREEXISTpthisUsuario(UsuarioOid usuarioTADDPREEXISTpthisUsuario) {
        this.usuarioTADDPREEXISTpthisUsuario = usuarioTADDPREEXISTpthisUsuario;
    }

    @JsonIgnore
    public Usuario getUsuarioTADDPREEXISTpthisUsuarioInstance() {
        return this.usuarioTADDPREEXISTpthisUsuarioInstance;
    }
    
    public void setUsuarioTADDPREEXISTpthisUsuarioInstance(Usuario usuarioTADDPREEXISTpthisUsuario) {
        this.usuarioTADDPREEXISTpthisUsuarioInstance = usuarioTADDPREEXISTpthisUsuario;
        this.usuarioTADDPREEXISTpthisUsuario = usuarioTADDPREEXISTpthisUsuario != null ? usuarioTADDPREEXISTpthisUsuario.getOid() : null;
    }

    private void checkUsuarioTADDPREEXISTpthisUsuario() throws NotNullArgumentException {
        if(this.getUsuarioTADDPREEXISTpthisUsuarioInstance() == null || this.getUsuarioTADDPREEXISTpthisUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TADDPREEXIST, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TADDPREEXIST_USUARIOTADDPREEXISTPTHISUSUARIO, UsuarioConstants.SERV_ALIAS_TADDPREEXIST, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TADDPREEXIST_USUARIOTADDPREEXISTPTHISUSUARIO);
        }
    }

    @JsonIgnore
    public String getUsuarioTADDPREEXISTptpatrDescripcion() {
        return this.usuarioTADDPREEXISTptpatrDescripcion;
    }
    
    public void setUsuarioTADDPREEXISTptpatrDescripcion(String usuarioTADDPREEXISTptpatrDescripcion) {
        this.usuarioTADDPREEXISTptpatrDescripcion = usuarioTADDPREEXISTptpatrDescripcion;
    }

    private void checkUsuarioTADDPREEXISTptpatrDescripcion() throws NotNullArgumentException {
        if(this.getUsuarioTADDPREEXISTptpatrDescripcion() == null) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TADDPREEXIST, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TADDPREEXIST_USUARIOTADDPREEXISTPTPATRDESCRIPCION, UsuarioConstants.SERV_ALIAS_TADDPREEXIST, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TADDPREEXIST_USUARIOTADDPREEXISTPTPATRDESCRIPCION);
        }
    }

    @JsonIgnore
    public Date getUsuarioTADDPREEXISTptpatrFecInicio() {
        return this.usuarioTADDPREEXISTptpatrFecInicio;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setUsuarioTADDPREEXISTptpatrFecInicio(Date usuarioTADDPREEXISTptpatrFecInicio) {
        this.usuarioTADDPREEXISTptpatrFecInicio = usuarioTADDPREEXISTptpatrFecInicio;
    }

    private void checkUsuarioTADDPREEXISTptpatrFecInicio() throws NotNullArgumentException {
        if(this.getUsuarioTADDPREEXISTptpatrFecInicio() == null) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TADDPREEXIST, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TADDPREEXIST_USUARIOTADDPREEXISTPTPATRFECINICIO, UsuarioConstants.SERV_ALIAS_TADDPREEXIST, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TADDPREEXIST_USUARIOTADDPREEXISTPTPATRFECINICIO);
        }
    }

    @JsonIgnore
    public Date getUsuarioTADDPREEXISTptpatrFecFin() {
        return this.usuarioTADDPREEXISTptpatrFecFin;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setUsuarioTADDPREEXISTptpatrFecFin(Date usuarioTADDPREEXISTptpatrFecFin) {
        this.usuarioTADDPREEXISTptpatrFecFin = usuarioTADDPREEXISTptpatrFecFin;
    }

    @JsonIgnore
    public String getUsuarioTADDPREEXISTptpatrObservacion() {
        return this.usuarioTADDPREEXISTptpatrObservacion;
    }
    
    public void setUsuarioTADDPREEXISTptpatrObservacion(String usuarioTADDPREEXISTptpatrObservacion) {
        this.usuarioTADDPREEXISTptpatrObservacion = usuarioTADDPREEXISTptpatrObservacion;
    }
}
