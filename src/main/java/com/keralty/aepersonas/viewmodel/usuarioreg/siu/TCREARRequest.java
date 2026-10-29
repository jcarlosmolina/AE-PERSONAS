package com.keralty.aepersonas.viewmodel.usuarioreg.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.UsuarioRegConstants;
import com.keralty.aepersonas.persistence.EstadoBeneficiario;
import com.keralty.aepersonas.persistence.oid.EstadoBeneficiarioOid;
import com.keralty.aepersonas.persistence.oid.ParentescoOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Parentesco;
import com.keralty.aepersonas.persistence.Solicitud;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneDeserializer;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneSerializer;
import java.sql.Date;

public class TCREARRequest {

    @JsonProperty("pt_p_agrsolicitud_oid")
    private SolicitudOid usuarioRegTCREARptpagrSolicitud;
    
    @JsonIgnore
    private Solicitud usuarioRegTCREARptpagrSolicitudInstance;

    @JsonProperty("pt_p_agrestadobeneficiario_oid")
    private EstadoBeneficiarioOid usuarioRegTCREARptpagrEstadoBeneficiario;
    
    @JsonIgnore
    private EstadoBeneficiario usuarioRegTCREARptpagrEstadoBeneficiarioInstance;

    @JsonProperty("pt_p_atrtipoidentificacion")
    private String usuarioRegTCREARptpatrTipoIdentificacion;

    @JsonProperty("pt_p_atrnumidentificacion")
    private String usuarioRegTCREARptpatrNumIdentificacion;

    @JsonProperty("pt_p_atrprimernombre")
    private String usuarioRegTCREARptpatrPrimerNombre;

    @JsonProperty("pt_p_atrsegundonombre")
    private String usuarioRegTCREARptpatrSegundoNombre;

    @JsonProperty("pt_p_atrprimerapellido")
    private String usuarioRegTCREARptpatrPrimerApellido;

    @JsonProperty("pt_p_atrsegundoapellido")
    private String usuarioRegTCREARptpatrSegundoApellido;

    @JsonProperty("pt_p_atrnumusuario")
    private Long usuarioRegTCREARptpatrNumUsuario;

    @JsonProperty("pt_p_agrparentesco_oid")
    private ParentescoOid usuarioRegTCREARptpagrParentesco;
    
    @JsonIgnore
    private Parentesco usuarioRegTCREARptpagrParentescoInstance;

    @JsonProperty("pt_p_atrfechainiciovigencia")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date usuarioRegTCREARptpatrFechaInicioVigencia;

    @JsonProperty("pt_p_atrfechafinvigencia")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date usuarioRegTCREARptpatrFechaFinVigencia;

    @JsonProperty("pt_p_atrgenero")
    private String usuarioRegTCREARptpatrGenero;

    @JsonProperty("pt_p_atrfechanacimiento")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date usuarioRegTCREARptpatrFechaNacimiento;

    public void checkArguments() throws NotNullArgumentException {
        checkUsuarioRegTCREARptpagrSolicitud();
        checkUsuarioRegTCREARptpatrTipoIdentificacion();
        checkUsuarioRegTCREARptpatrNumIdentificacion();
        checkUsuarioRegTCREARptpatrPrimerNombre();
        checkUsuarioRegTCREARptpatrPrimerApellido();
    }

    @JsonIgnore
    public SolicitudOid getUsuarioRegTCREARptpagrSolicitud() {
        return this.usuarioRegTCREARptpagrSolicitud;
    }
    
    public void setUsuarioRegTCREARptpagrSolicitud(SolicitudOid usuarioRegTCREARptpagrSolicitud) {
        this.usuarioRegTCREARptpagrSolicitud = usuarioRegTCREARptpagrSolicitud;
    }

    @JsonIgnore
    public Solicitud getUsuarioRegTCREARptpagrSolicitudInstance() {
        return this.usuarioRegTCREARptpagrSolicitudInstance;
    }
    
    public void setUsuarioRegTCREARptpagrSolicitudInstance(Solicitud usuarioRegTCREARptpagrSolicitud) {
        this.usuarioRegTCREARptpagrSolicitudInstance = usuarioRegTCREARptpagrSolicitud;
        this.usuarioRegTCREARptpagrSolicitud = usuarioRegTCREARptpagrSolicitud != null ? usuarioRegTCREARptpagrSolicitud.getOid() : null;
    }

    private void checkUsuarioRegTCREARptpagrSolicitud() throws NotNullArgumentException {
        if(this.getUsuarioRegTCREARptpagrSolicitudInstance() == null || this.getUsuarioRegTCREARptpagrSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioRegConstants.SERV_ID_TCREAR, UsuarioRegConstants.CLASS_ID, UsuarioRegConstants.ARG_ID_TCREAR_USUARIOREGTCREARPTPAGRSOLICITUD, UsuarioRegConstants.SERV_ALIAS_TCREAR, UsuarioRegConstants.CLASS_ALIAS, UsuarioRegConstants.ARG_ALIAS_TCREAR_USUARIOREGTCREARPTPAGRSOLICITUD);
        }
    }

    @JsonIgnore
    public EstadoBeneficiarioOid getUsuarioRegTCREARptpagrEstadoBeneficiario() {
        return this.usuarioRegTCREARptpagrEstadoBeneficiario;
    }
    
    public void setUsuarioRegTCREARptpagrEstadoBeneficiario(EstadoBeneficiarioOid usuarioRegTCREARptpagrEstadoBeneficiario) {
        this.usuarioRegTCREARptpagrEstadoBeneficiario = usuarioRegTCREARptpagrEstadoBeneficiario;
    }

    @JsonIgnore
    public EstadoBeneficiario getUsuarioRegTCREARptpagrEstadoBeneficiarioInstance() {
        return this.usuarioRegTCREARptpagrEstadoBeneficiarioInstance;
    }
    
    public void setUsuarioRegTCREARptpagrEstadoBeneficiarioInstance(EstadoBeneficiario usuarioRegTCREARptpagrEstadoBeneficiario) {
        this.usuarioRegTCREARptpagrEstadoBeneficiarioInstance = usuarioRegTCREARptpagrEstadoBeneficiario;
        this.usuarioRegTCREARptpagrEstadoBeneficiario = usuarioRegTCREARptpagrEstadoBeneficiario != null ? usuarioRegTCREARptpagrEstadoBeneficiario.getOid() : null;
    }

    @JsonIgnore
    public String getUsuarioRegTCREARptpatrTipoIdentificacion() {
        return this.usuarioRegTCREARptpatrTipoIdentificacion;
    }
    
    public void setUsuarioRegTCREARptpatrTipoIdentificacion(String usuarioRegTCREARptpatrTipoIdentificacion) {
        this.usuarioRegTCREARptpatrTipoIdentificacion = usuarioRegTCREARptpatrTipoIdentificacion;
    }

    private void checkUsuarioRegTCREARptpatrTipoIdentificacion() throws NotNullArgumentException {
        if(this.getUsuarioRegTCREARptpatrTipoIdentificacion() == null) {
            throw new NotNullArgumentException(UsuarioRegConstants.SERV_ID_TCREAR, UsuarioRegConstants.CLASS_ID, UsuarioRegConstants.ARG_ID_TCREAR_USUARIOREGTCREARPTPATRTIPOIDENTIFICACION, UsuarioRegConstants.SERV_ALIAS_TCREAR, UsuarioRegConstants.CLASS_ALIAS, UsuarioRegConstants.ARG_ALIAS_TCREAR_USUARIOREGTCREARPTPATRTIPOIDENTIFICACION);
        }
    }

    @JsonIgnore
    public String getUsuarioRegTCREARptpatrNumIdentificacion() {
        return this.usuarioRegTCREARptpatrNumIdentificacion;
    }
    
    public void setUsuarioRegTCREARptpatrNumIdentificacion(String usuarioRegTCREARptpatrNumIdentificacion) {
        this.usuarioRegTCREARptpatrNumIdentificacion = usuarioRegTCREARptpatrNumIdentificacion;
    }

    private void checkUsuarioRegTCREARptpatrNumIdentificacion() throws NotNullArgumentException {
        if(this.getUsuarioRegTCREARptpatrNumIdentificacion() == null) {
            throw new NotNullArgumentException(UsuarioRegConstants.SERV_ID_TCREAR, UsuarioRegConstants.CLASS_ID, UsuarioRegConstants.ARG_ID_TCREAR_USUARIOREGTCREARPTPATRNUMIDENTIFICACION, UsuarioRegConstants.SERV_ALIAS_TCREAR, UsuarioRegConstants.CLASS_ALIAS, UsuarioRegConstants.ARG_ALIAS_TCREAR_USUARIOREGTCREARPTPATRNUMIDENTIFICACION);
        }
    }

    @JsonIgnore
    public String getUsuarioRegTCREARptpatrPrimerNombre() {
        return this.usuarioRegTCREARptpatrPrimerNombre;
    }
    
    public void setUsuarioRegTCREARptpatrPrimerNombre(String usuarioRegTCREARptpatrPrimerNombre) {
        this.usuarioRegTCREARptpatrPrimerNombre = usuarioRegTCREARptpatrPrimerNombre;
    }

    private void checkUsuarioRegTCREARptpatrPrimerNombre() throws NotNullArgumentException {
        if(this.getUsuarioRegTCREARptpatrPrimerNombre() == null) {
            throw new NotNullArgumentException(UsuarioRegConstants.SERV_ID_TCREAR, UsuarioRegConstants.CLASS_ID, UsuarioRegConstants.ARG_ID_TCREAR_USUARIOREGTCREARPTPATRPRIMERNOMBRE, UsuarioRegConstants.SERV_ALIAS_TCREAR, UsuarioRegConstants.CLASS_ALIAS, UsuarioRegConstants.ARG_ALIAS_TCREAR_USUARIOREGTCREARPTPATRPRIMERNOMBRE);
        }
    }

    @JsonIgnore
    public String getUsuarioRegTCREARptpatrSegundoNombre() {
        return this.usuarioRegTCREARptpatrSegundoNombre;
    }
    
    public void setUsuarioRegTCREARptpatrSegundoNombre(String usuarioRegTCREARptpatrSegundoNombre) {
        this.usuarioRegTCREARptpatrSegundoNombre = usuarioRegTCREARptpatrSegundoNombre;
    }

    @JsonIgnore
    public String getUsuarioRegTCREARptpatrPrimerApellido() {
        return this.usuarioRegTCREARptpatrPrimerApellido;
    }
    
    public void setUsuarioRegTCREARptpatrPrimerApellido(String usuarioRegTCREARptpatrPrimerApellido) {
        this.usuarioRegTCREARptpatrPrimerApellido = usuarioRegTCREARptpatrPrimerApellido;
    }

    private void checkUsuarioRegTCREARptpatrPrimerApellido() throws NotNullArgumentException {
        if(this.getUsuarioRegTCREARptpatrPrimerApellido() == null) {
            throw new NotNullArgumentException(UsuarioRegConstants.SERV_ID_TCREAR, UsuarioRegConstants.CLASS_ID, UsuarioRegConstants.ARG_ID_TCREAR_USUARIOREGTCREARPTPATRPRIMERAPELLIDO, UsuarioRegConstants.SERV_ALIAS_TCREAR, UsuarioRegConstants.CLASS_ALIAS, UsuarioRegConstants.ARG_ALIAS_TCREAR_USUARIOREGTCREARPTPATRPRIMERAPELLIDO);
        }
    }

    @JsonIgnore
    public String getUsuarioRegTCREARptpatrSegundoApellido() {
        return this.usuarioRegTCREARptpatrSegundoApellido;
    }
    
    public void setUsuarioRegTCREARptpatrSegundoApellido(String usuarioRegTCREARptpatrSegundoApellido) {
        this.usuarioRegTCREARptpatrSegundoApellido = usuarioRegTCREARptpatrSegundoApellido;
    }

    @JsonIgnore
    public Long getUsuarioRegTCREARptpatrNumUsuario() {
        return this.usuarioRegTCREARptpatrNumUsuario;
    }
    
    public void setUsuarioRegTCREARptpatrNumUsuario(Long usuarioRegTCREARptpatrNumUsuario) {
        this.usuarioRegTCREARptpatrNumUsuario = usuarioRegTCREARptpatrNumUsuario;
    }

    @JsonIgnore
    public ParentescoOid getUsuarioRegTCREARptpagrParentesco() {
        return this.usuarioRegTCREARptpagrParentesco;
    }
    
    public void setUsuarioRegTCREARptpagrParentesco(ParentescoOid usuarioRegTCREARptpagrParentesco) {
        this.usuarioRegTCREARptpagrParentesco = usuarioRegTCREARptpagrParentesco;
    }

    @JsonIgnore
    public Parentesco getUsuarioRegTCREARptpagrParentescoInstance() {
        return this.usuarioRegTCREARptpagrParentescoInstance;
    }
    
    public void setUsuarioRegTCREARptpagrParentescoInstance(Parentesco usuarioRegTCREARptpagrParentesco) {
        this.usuarioRegTCREARptpagrParentescoInstance = usuarioRegTCREARptpagrParentesco;
        this.usuarioRegTCREARptpagrParentesco = usuarioRegTCREARptpagrParentesco != null ? usuarioRegTCREARptpagrParentesco.getOid() : null;
    }

    @JsonIgnore
    public Date getUsuarioRegTCREARptpatrFechaInicioVigencia() {
        return this.usuarioRegTCREARptpatrFechaInicioVigencia;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setUsuarioRegTCREARptpatrFechaInicioVigencia(Date usuarioRegTCREARptpatrFechaInicioVigencia) {
        this.usuarioRegTCREARptpatrFechaInicioVigencia = usuarioRegTCREARptpatrFechaInicioVigencia;
    }

    @JsonIgnore
    public Date getUsuarioRegTCREARptpatrFechaFinVigencia() {
        return this.usuarioRegTCREARptpatrFechaFinVigencia;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setUsuarioRegTCREARptpatrFechaFinVigencia(Date usuarioRegTCREARptpatrFechaFinVigencia) {
        this.usuarioRegTCREARptpatrFechaFinVigencia = usuarioRegTCREARptpatrFechaFinVigencia;
    }

    @JsonIgnore
    public String getUsuarioRegTCREARptpatrGenero() {
        return this.usuarioRegTCREARptpatrGenero;
    }
    
    public void setUsuarioRegTCREARptpatrGenero(String usuarioRegTCREARptpatrGenero) {
        this.usuarioRegTCREARptpatrGenero = usuarioRegTCREARptpatrGenero;
    }

    @JsonIgnore
    public Date getUsuarioRegTCREARptpatrFechaNacimiento() {
        return this.usuarioRegTCREARptpatrFechaNacimiento;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setUsuarioRegTCREARptpatrFechaNacimiento(Date usuarioRegTCREARptpatrFechaNacimiento) {
        this.usuarioRegTCREARptpatrFechaNacimiento = usuarioRegTCREARptpatrFechaNacimiento;
    }
}
