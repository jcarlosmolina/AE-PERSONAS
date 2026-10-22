package com.keralty.aepersonas.viewmodel.preexistencia.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PreexistenciaConstants;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Usuario;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneDeserializer;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneSerializer;
import java.sql.Date;

public class CrearRequest {

    @JsonProperty("p_agrusuario_oid")
    private UsuarioOid preexistenciacrearpagrUsuario;
    
    @JsonIgnore
    private Usuario preexistenciacrearpagrUsuarioInstance;

    @JsonProperty("p_atrdescripcion")
    private String preexistenciacrearpatrDescripcion;

    @JsonProperty("p_atrfecinicio")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date preexistenciacrearpatrFecInicio;

    @JsonProperty("p_atrfecfin")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date preexistenciacrearpatrFecFin;

    @JsonProperty("p_atrobservacion")
    private String preexistenciacrearpatrObservacion;

    public void checkArguments() throws NotNullArgumentException {
        checkPreexistenciacrearpagrUsuario();
        checkPreexistenciacrearpatrDescripcion();
        checkPreexistenciacrearpatrFecInicio();
    }

    @JsonIgnore
    public UsuarioOid getPreexistenciacrearpagrUsuario() {
        return this.preexistenciacrearpagrUsuario;
    }
    
    public void setPreexistenciacrearpagrUsuario(UsuarioOid preexistenciacrearpagrUsuario) {
        this.preexistenciacrearpagrUsuario = preexistenciacrearpagrUsuario;
    }

    @JsonIgnore
    public Usuario getPreexistenciacrearpagrUsuarioInstance() {
        return this.preexistenciacrearpagrUsuarioInstance;
    }
    
    public void setPreexistenciacrearpagrUsuarioInstance(Usuario preexistenciacrearpagrUsuario) {
        this.preexistenciacrearpagrUsuarioInstance = preexistenciacrearpagrUsuario;
        this.preexistenciacrearpagrUsuario = preexistenciacrearpagrUsuario != null ? preexistenciacrearpagrUsuario.getOid() : null;
    }

    private void checkPreexistenciacrearpagrUsuario() throws NotNullArgumentException {
        if(this.getPreexistenciacrearpagrUsuarioInstance() == null || this.getPreexistenciacrearpagrUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(PreexistenciaConstants.SERV_ID_CREAR, PreexistenciaConstants.CLASS_ID, PreexistenciaConstants.ARG_ID_CREAR_PREEXISTENCIACREARPAGRUSUARIO, PreexistenciaConstants.SERV_ALIAS_CREAR, PreexistenciaConstants.CLASS_ALIAS, PreexistenciaConstants.ARG_ALIAS_CREAR_PREEXISTENCIACREARPAGRUSUARIO);
        }
    }

    @JsonIgnore
    public String getPreexistenciacrearpatrDescripcion() {
        return this.preexistenciacrearpatrDescripcion;
    }
    
    public void setPreexistenciacrearpatrDescripcion(String preexistenciacrearpatrDescripcion) {
        this.preexistenciacrearpatrDescripcion = preexistenciacrearpatrDescripcion;
    }

    private void checkPreexistenciacrearpatrDescripcion() throws NotNullArgumentException {
        if(this.getPreexistenciacrearpatrDescripcion() == null) {
            throw new NotNullArgumentException(PreexistenciaConstants.SERV_ID_CREAR, PreexistenciaConstants.CLASS_ID, PreexistenciaConstants.ARG_ID_CREAR_PREEXISTENCIACREARPATRDESCRIPCION, PreexistenciaConstants.SERV_ALIAS_CREAR, PreexistenciaConstants.CLASS_ALIAS, PreexistenciaConstants.ARG_ALIAS_CREAR_PREEXISTENCIACREARPATRDESCRIPCION);
        }
    }

    @JsonIgnore
    public Date getPreexistenciacrearpatrFecInicio() {
        return this.preexistenciacrearpatrFecInicio;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setPreexistenciacrearpatrFecInicio(Date preexistenciacrearpatrFecInicio) {
        this.preexistenciacrearpatrFecInicio = preexistenciacrearpatrFecInicio;
    }

    private void checkPreexistenciacrearpatrFecInicio() throws NotNullArgumentException {
        if(this.getPreexistenciacrearpatrFecInicio() == null) {
            throw new NotNullArgumentException(PreexistenciaConstants.SERV_ID_CREAR, PreexistenciaConstants.CLASS_ID, PreexistenciaConstants.ARG_ID_CREAR_PREEXISTENCIACREARPATRFECINICIO, PreexistenciaConstants.SERV_ALIAS_CREAR, PreexistenciaConstants.CLASS_ALIAS, PreexistenciaConstants.ARG_ALIAS_CREAR_PREEXISTENCIACREARPATRFECINICIO);
        }
    }

    @JsonIgnore
    public Date getPreexistenciacrearpatrFecFin() {
        return this.preexistenciacrearpatrFecFin;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setPreexistenciacrearpatrFecFin(Date preexistenciacrearpatrFecFin) {
        this.preexistenciacrearpatrFecFin = preexistenciacrearpatrFecFin;
    }

    @JsonIgnore
    public String getPreexistenciacrearpatrObservacion() {
        return this.preexistenciacrearpatrObservacion;
    }
    
    public void setPreexistenciacrearpatrObservacion(String preexistenciacrearpatrObservacion) {
        this.preexistenciacrearpatrObservacion = preexistenciacrearpatrObservacion;
    }
}
