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

public class RegistrarDatosCORERequest {

    @JsonProperty("p_thisusuario_oid")
    private UsuarioOid usuarioregistrarDatosCOREpthisUsuario;
    
    @JsonIgnore
    private Usuario usuarioregistrarDatosCOREpthisUsuarioInstance;

    @JsonProperty("p_numusuario")
    private Long usuarioregistrarDatosCOREpNumUsuario;

    @JsonProperty("p_requierexamenmedico")
    private Boolean usuarioregistrarDatosCOREpRequierExamenMedico;

    @JsonProperty("p_estadomedico")
    private Long usuarioregistrarDatosCOREpEstadoMedico;

    @JsonProperty("p_valorcuotainscripcion")
    private Double usuarioregistrarDatosCOREpValorCuotaInscripcion;

    @JsonProperty("p_tienepreexistencias")
    private Boolean usuarioregistrarDatosCOREpTienePreexistencias;

    @JsonProperty("p_fechainicionvigencia")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date usuarioregistrarDatosCOREpFechaInicionVigencia;

    @JsonProperty("p_fechafinvigencia")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date usuarioregistrarDatosCOREpFechaFinVigencia;

    public void checkArguments() throws NotNullArgumentException {
        checkUsuarioregistrarDatosCOREpthisUsuario();
    }

    @JsonIgnore
    public UsuarioOid getUsuarioregistrarDatosCOREpthisUsuario() {
        return this.usuarioregistrarDatosCOREpthisUsuario;
    }
    
    public void setUsuarioregistrarDatosCOREpthisUsuario(UsuarioOid usuarioregistrarDatosCOREpthisUsuario) {
        this.usuarioregistrarDatosCOREpthisUsuario = usuarioregistrarDatosCOREpthisUsuario;
    }

    @JsonIgnore
    public Usuario getUsuarioregistrarDatosCOREpthisUsuarioInstance() {
        return this.usuarioregistrarDatosCOREpthisUsuarioInstance;
    }
    
    public void setUsuarioregistrarDatosCOREpthisUsuarioInstance(Usuario usuarioregistrarDatosCOREpthisUsuario) {
        this.usuarioregistrarDatosCOREpthisUsuarioInstance = usuarioregistrarDatosCOREpthisUsuario;
        this.usuarioregistrarDatosCOREpthisUsuario = usuarioregistrarDatosCOREpthisUsuario != null ? usuarioregistrarDatosCOREpthisUsuario.getOid() : null;
    }

    private void checkUsuarioregistrarDatosCOREpthisUsuario() throws NotNullArgumentException {
        if(this.getUsuarioregistrarDatosCOREpthisUsuarioInstance() == null || this.getUsuarioregistrarDatosCOREpthisUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_REGISTRARDATOSCORE, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_REGISTRARDATOSCORE_USUARIOREGISTRARDATOSCOREPTHISUSUARIO, UsuarioConstants.SERV_ALIAS_REGISTRARDATOSCORE, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_REGISTRARDATOSCORE_USUARIOREGISTRARDATOSCOREPTHISUSUARIO);
        }
    }

    @JsonIgnore
    public Long getUsuarioregistrarDatosCOREpNumUsuario() {
        return this.usuarioregistrarDatosCOREpNumUsuario;
    }
    
    public void setUsuarioregistrarDatosCOREpNumUsuario(Long usuarioregistrarDatosCOREpNumUsuario) {
        this.usuarioregistrarDatosCOREpNumUsuario = usuarioregistrarDatosCOREpNumUsuario;
    }

    @JsonIgnore
    public Boolean getUsuarioregistrarDatosCOREpRequierExamenMedico() {
        return this.usuarioregistrarDatosCOREpRequierExamenMedico;
    }
    
    public void setUsuarioregistrarDatosCOREpRequierExamenMedico(Boolean usuarioregistrarDatosCOREpRequierExamenMedico) {
        this.usuarioregistrarDatosCOREpRequierExamenMedico = usuarioregistrarDatosCOREpRequierExamenMedico;
    }

    @JsonIgnore
    public Long getUsuarioregistrarDatosCOREpEstadoMedico() {
        return this.usuarioregistrarDatosCOREpEstadoMedico;
    }
    
    public void setUsuarioregistrarDatosCOREpEstadoMedico(Long usuarioregistrarDatosCOREpEstadoMedico) {
        this.usuarioregistrarDatosCOREpEstadoMedico = usuarioregistrarDatosCOREpEstadoMedico;
    }

    @JsonIgnore
    public Double getUsuarioregistrarDatosCOREpValorCuotaInscripcion() {
        return this.usuarioregistrarDatosCOREpValorCuotaInscripcion;
    }
    
    public void setUsuarioregistrarDatosCOREpValorCuotaInscripcion(Double usuarioregistrarDatosCOREpValorCuotaInscripcion) {
        this.usuarioregistrarDatosCOREpValorCuotaInscripcion = usuarioregistrarDatosCOREpValorCuotaInscripcion;
    }

    @JsonIgnore
    public Boolean getUsuarioregistrarDatosCOREpTienePreexistencias() {
        return this.usuarioregistrarDatosCOREpTienePreexistencias;
    }
    
    public void setUsuarioregistrarDatosCOREpTienePreexistencias(Boolean usuarioregistrarDatosCOREpTienePreexistencias) {
        this.usuarioregistrarDatosCOREpTienePreexistencias = usuarioregistrarDatosCOREpTienePreexistencias;
    }

    @JsonIgnore
    public Date getUsuarioregistrarDatosCOREpFechaInicionVigencia() {
        return this.usuarioregistrarDatosCOREpFechaInicionVigencia;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setUsuarioregistrarDatosCOREpFechaInicionVigencia(Date usuarioregistrarDatosCOREpFechaInicionVigencia) {
        this.usuarioregistrarDatosCOREpFechaInicionVigencia = usuarioregistrarDatosCOREpFechaInicionVigencia;
    }

    @JsonIgnore
    public Date getUsuarioregistrarDatosCOREpFechaFinVigencia() {
        return this.usuarioregistrarDatosCOREpFechaFinVigencia;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setUsuarioregistrarDatosCOREpFechaFinVigencia(Date usuarioregistrarDatosCOREpFechaFinVigencia) {
        this.usuarioregistrarDatosCOREpFechaFinVigencia = usuarioregistrarDatosCOREpFechaFinVigencia;
    }
}
