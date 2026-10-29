package com.keralty.aepersonas.viewmodel.usuario.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.persistence.EstadoBeneficiario;
import com.keralty.aepersonas.persistence.oid.EstadoBeneficiarioOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Usuario;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneDeserializer;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneSerializer;
import java.sql.Date;

public class TREGISTRARDATOSCORERequest {

    @JsonProperty("p_thisusuario_oid")
    private UsuarioOid usuarioTREGISTRARDATOSCOREpthisUsuario;
    
    @JsonIgnore
    private Usuario usuarioTREGISTRARDATOSCOREpthisUsuarioInstance;

    @JsonProperty("pt_p_fechaantiguedadbeneficiar")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date usuarioTREGISTRARDATOSCOREptpFechaAntiguedadBeneficiar;

    @JsonProperty("pt_p_numusuario")
    private Long usuarioTREGISTRARDATOSCOREptpNumUsuario;

    @JsonProperty("pt_p_requierexamenmedico")
    private Boolean usuarioTREGISTRARDATOSCOREptpRequierExamenMedico;

    @JsonProperty("pt_p_estadomedico")
    private Long usuarioTREGISTRARDATOSCOREptpEstadoMedico;

    @JsonProperty("pt_p_valorcuotainscripcion")
    private Double usuarioTREGISTRARDATOSCOREptpValorCuotaInscripcion;

    @JsonProperty("pt_p_tienepreexistencias")
    private Boolean usuarioTREGISTRARDATOSCOREptpTienePreexistencias;

    @JsonProperty("pt_p_evcestadobeneficiario_oid")
    private EstadoBeneficiarioOid usuarioTREGISTRARDATOSCOREptpevcEstadoBeneficiario;
    
    @JsonIgnore
    private EstadoBeneficiario usuarioTREGISTRARDATOSCOREptpevcEstadoBeneficiarioInstance;

    @JsonProperty("pt_p_fechainicionvigencia")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date usuarioTREGISTRARDATOSCOREptpFechaInicionVigencia;

    @JsonProperty("pt_p_fechafinvigencia")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date usuarioTREGISTRARDATOSCOREptpFechaFinVigencia;

    public void checkArguments() throws NotNullArgumentException {
        checkUsuarioTREGISTRARDATOSCOREpthisUsuario();
    }

    @JsonIgnore
    public UsuarioOid getUsuarioTREGISTRARDATOSCOREpthisUsuario() {
        return this.usuarioTREGISTRARDATOSCOREpthisUsuario;
    }
    
    public void setUsuarioTREGISTRARDATOSCOREpthisUsuario(UsuarioOid usuarioTREGISTRARDATOSCOREpthisUsuario) {
        this.usuarioTREGISTRARDATOSCOREpthisUsuario = usuarioTREGISTRARDATOSCOREpthisUsuario;
    }

    @JsonIgnore
    public Usuario getUsuarioTREGISTRARDATOSCOREpthisUsuarioInstance() {
        return this.usuarioTREGISTRARDATOSCOREpthisUsuarioInstance;
    }
    
    public void setUsuarioTREGISTRARDATOSCOREpthisUsuarioInstance(Usuario usuarioTREGISTRARDATOSCOREpthisUsuario) {
        this.usuarioTREGISTRARDATOSCOREpthisUsuarioInstance = usuarioTREGISTRARDATOSCOREpthisUsuario;
        this.usuarioTREGISTRARDATOSCOREpthisUsuario = usuarioTREGISTRARDATOSCOREpthisUsuario != null ? usuarioTREGISTRARDATOSCOREpthisUsuario.getOid() : null;
    }

    private void checkUsuarioTREGISTRARDATOSCOREpthisUsuario() throws NotNullArgumentException {
        if(this.getUsuarioTREGISTRARDATOSCOREpthisUsuarioInstance() == null || this.getUsuarioTREGISTRARDATOSCOREpthisUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TREGISTRARDATOSCORE, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TREGISTRARDATOSCORE_USUARIOTREGISTRARDATOSCOREPTHISUSUARIO, UsuarioConstants.SERV_ALIAS_TREGISTRARDATOSCORE, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TREGISTRARDATOSCORE_USUARIOTREGISTRARDATOSCOREPTHISUSUARIO);
        }
    }

    @JsonIgnore
    public Date getUsuarioTREGISTRARDATOSCOREptpFechaAntiguedadBeneficiar() {
        return this.usuarioTREGISTRARDATOSCOREptpFechaAntiguedadBeneficiar;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setUsuarioTREGISTRARDATOSCOREptpFechaAntiguedadBeneficiar(Date usuarioTREGISTRARDATOSCOREptpFechaAntiguedadBeneficiar) {
        this.usuarioTREGISTRARDATOSCOREptpFechaAntiguedadBeneficiar = usuarioTREGISTRARDATOSCOREptpFechaAntiguedadBeneficiar;
    }

    @JsonIgnore
    public Long getUsuarioTREGISTRARDATOSCOREptpNumUsuario() {
        return this.usuarioTREGISTRARDATOSCOREptpNumUsuario;
    }
    
    public void setUsuarioTREGISTRARDATOSCOREptpNumUsuario(Long usuarioTREGISTRARDATOSCOREptpNumUsuario) {
        this.usuarioTREGISTRARDATOSCOREptpNumUsuario = usuarioTREGISTRARDATOSCOREptpNumUsuario;
    }

    @JsonIgnore
    public Boolean getUsuarioTREGISTRARDATOSCOREptpRequierExamenMedico() {
        return this.usuarioTREGISTRARDATOSCOREptpRequierExamenMedico;
    }
    
    public void setUsuarioTREGISTRARDATOSCOREptpRequierExamenMedico(Boolean usuarioTREGISTRARDATOSCOREptpRequierExamenMedico) {
        this.usuarioTREGISTRARDATOSCOREptpRequierExamenMedico = usuarioTREGISTRARDATOSCOREptpRequierExamenMedico;
    }

    @JsonIgnore
    public Long getUsuarioTREGISTRARDATOSCOREptpEstadoMedico() {
        return this.usuarioTREGISTRARDATOSCOREptpEstadoMedico;
    }
    
    public void setUsuarioTREGISTRARDATOSCOREptpEstadoMedico(Long usuarioTREGISTRARDATOSCOREptpEstadoMedico) {
        this.usuarioTREGISTRARDATOSCOREptpEstadoMedico = usuarioTREGISTRARDATOSCOREptpEstadoMedico;
    }

    @JsonIgnore
    public Double getUsuarioTREGISTRARDATOSCOREptpValorCuotaInscripcion() {
        return this.usuarioTREGISTRARDATOSCOREptpValorCuotaInscripcion;
    }
    
    public void setUsuarioTREGISTRARDATOSCOREptpValorCuotaInscripcion(Double usuarioTREGISTRARDATOSCOREptpValorCuotaInscripcion) {
        this.usuarioTREGISTRARDATOSCOREptpValorCuotaInscripcion = usuarioTREGISTRARDATOSCOREptpValorCuotaInscripcion;
    }

    @JsonIgnore
    public Boolean getUsuarioTREGISTRARDATOSCOREptpTienePreexistencias() {
        return this.usuarioTREGISTRARDATOSCOREptpTienePreexistencias;
    }
    
    public void setUsuarioTREGISTRARDATOSCOREptpTienePreexistencias(Boolean usuarioTREGISTRARDATOSCOREptpTienePreexistencias) {
        this.usuarioTREGISTRARDATOSCOREptpTienePreexistencias = usuarioTREGISTRARDATOSCOREptpTienePreexistencias;
    }

    @JsonIgnore
    public EstadoBeneficiarioOid getUsuarioTREGISTRARDATOSCOREptpevcEstadoBeneficiario() {
        return this.usuarioTREGISTRARDATOSCOREptpevcEstadoBeneficiario;
    }
    
    public void setUsuarioTREGISTRARDATOSCOREptpevcEstadoBeneficiario(EstadoBeneficiarioOid usuarioTREGISTRARDATOSCOREptpevcEstadoBeneficiario) {
        this.usuarioTREGISTRARDATOSCOREptpevcEstadoBeneficiario = usuarioTREGISTRARDATOSCOREptpevcEstadoBeneficiario;
    }

    @JsonIgnore
    public EstadoBeneficiario getUsuarioTREGISTRARDATOSCOREptpevcEstadoBeneficiarioInstance() {
        return this.usuarioTREGISTRARDATOSCOREptpevcEstadoBeneficiarioInstance;
    }
    
    public void setUsuarioTREGISTRARDATOSCOREptpevcEstadoBeneficiarioInstance(EstadoBeneficiario usuarioTREGISTRARDATOSCOREptpevcEstadoBeneficiario) {
        this.usuarioTREGISTRARDATOSCOREptpevcEstadoBeneficiarioInstance = usuarioTREGISTRARDATOSCOREptpevcEstadoBeneficiario;
        this.usuarioTREGISTRARDATOSCOREptpevcEstadoBeneficiario = usuarioTREGISTRARDATOSCOREptpevcEstadoBeneficiario != null ? usuarioTREGISTRARDATOSCOREptpevcEstadoBeneficiario.getOid() : null;
    }

    @JsonIgnore
    public Date getUsuarioTREGISTRARDATOSCOREptpFechaInicionVigencia() {
        return this.usuarioTREGISTRARDATOSCOREptpFechaInicionVigencia;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setUsuarioTREGISTRARDATOSCOREptpFechaInicionVigencia(Date usuarioTREGISTRARDATOSCOREptpFechaInicionVigencia) {
        this.usuarioTREGISTRARDATOSCOREptpFechaInicionVigencia = usuarioTREGISTRARDATOSCOREptpFechaInicionVigencia;
    }

    @JsonIgnore
    public Date getUsuarioTREGISTRARDATOSCOREptpFechaFinVigencia() {
        return this.usuarioTREGISTRARDATOSCOREptpFechaFinVigencia;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setUsuarioTREGISTRARDATOSCOREptpFechaFinVigencia(Date usuarioTREGISTRARDATOSCOREptpFechaFinVigencia) {
        this.usuarioTREGISTRARDATOSCOREptpFechaFinVigencia = usuarioTREGISTRARDATOSCOREptpFechaFinVigencia;
    }
}
