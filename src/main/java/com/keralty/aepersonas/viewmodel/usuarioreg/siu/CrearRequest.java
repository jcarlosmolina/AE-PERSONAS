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

public class CrearRequest {

    @JsonProperty("p_agrparentesco_oid")
    private ParentescoOid usuarioRegcrearpagrParentesco;
    
    @JsonIgnore
    private Parentesco usuarioRegcrearpagrParentescoInstance;

    @JsonProperty("p_agrestadobeneficiario_oid")
    private EstadoBeneficiarioOid usuarioRegcrearpagrEstadoBeneficiario;
    
    @JsonIgnore
    private EstadoBeneficiario usuarioRegcrearpagrEstadoBeneficiarioInstance;

    @JsonProperty("p_agrsolicitud_oid")
    private SolicitudOid usuarioRegcrearpagrSolicitud;
    
    @JsonIgnore
    private Solicitud usuarioRegcrearpagrSolicitudInstance;

    @JsonProperty("p_atrtipoidentificacion")
    private String usuarioRegcrearpatrTipoIdentificacion;

    @JsonProperty("p_atrnumidentificacion")
    private String usuarioRegcrearpatrNumIdentificacion;

    @JsonProperty("p_atrprimernombre")
    private String usuarioRegcrearpatrPrimerNombre;

    @JsonProperty("p_atrsegundonombre")
    private String usuarioRegcrearpatrSegundoNombre;

    @JsonProperty("p_atrprimerapellido")
    private String usuarioRegcrearpatrPrimerApellido;

    @JsonProperty("p_atrsegundoapellido")
    private String usuarioRegcrearpatrSegundoApellido;

    @JsonProperty("p_atrnumusuario")
    private Long usuarioRegcrearpatrNumUsuario;

    @JsonProperty("p_atrfechainiciovigencia")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date usuarioRegcrearpatrFechaInicioVigencia;

    @JsonProperty("p_atrfechafinvigencia")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date usuarioRegcrearpatrFechaFinVigencia;

    @JsonProperty("p_atrgenero")
    private String usuarioRegcrearpatrGenero;

    @JsonProperty("p_atrfechanacimiento")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date usuarioRegcrearpatrFechaNacimiento;

    public void checkArguments() throws NotNullArgumentException {
        checkUsuarioRegcrearpagrSolicitud();
        checkUsuarioRegcrearpatrTipoIdentificacion();
        checkUsuarioRegcrearpatrNumIdentificacion();
        checkUsuarioRegcrearpatrPrimerNombre();
        checkUsuarioRegcrearpatrPrimerApellido();
    }

    @JsonIgnore
    public ParentescoOid getUsuarioRegcrearpagrParentesco() {
        return this.usuarioRegcrearpagrParentesco;
    }
    
    public void setUsuarioRegcrearpagrParentesco(ParentescoOid usuarioRegcrearpagrParentesco) {
        this.usuarioRegcrearpagrParentesco = usuarioRegcrearpagrParentesco;
    }

    @JsonIgnore
    public Parentesco getUsuarioRegcrearpagrParentescoInstance() {
        return this.usuarioRegcrearpagrParentescoInstance;
    }
    
    public void setUsuarioRegcrearpagrParentescoInstance(Parentesco usuarioRegcrearpagrParentesco) {
        this.usuarioRegcrearpagrParentescoInstance = usuarioRegcrearpagrParentesco;
        this.usuarioRegcrearpagrParentesco = usuarioRegcrearpagrParentesco != null ? usuarioRegcrearpagrParentesco.getOid() : null;
    }

    @JsonIgnore
    public EstadoBeneficiarioOid getUsuarioRegcrearpagrEstadoBeneficiario() {
        return this.usuarioRegcrearpagrEstadoBeneficiario;
    }
    
    public void setUsuarioRegcrearpagrEstadoBeneficiario(EstadoBeneficiarioOid usuarioRegcrearpagrEstadoBeneficiario) {
        this.usuarioRegcrearpagrEstadoBeneficiario = usuarioRegcrearpagrEstadoBeneficiario;
    }

    @JsonIgnore
    public EstadoBeneficiario getUsuarioRegcrearpagrEstadoBeneficiarioInstance() {
        return this.usuarioRegcrearpagrEstadoBeneficiarioInstance;
    }
    
    public void setUsuarioRegcrearpagrEstadoBeneficiarioInstance(EstadoBeneficiario usuarioRegcrearpagrEstadoBeneficiario) {
        this.usuarioRegcrearpagrEstadoBeneficiarioInstance = usuarioRegcrearpagrEstadoBeneficiario;
        this.usuarioRegcrearpagrEstadoBeneficiario = usuarioRegcrearpagrEstadoBeneficiario != null ? usuarioRegcrearpagrEstadoBeneficiario.getOid() : null;
    }

    @JsonIgnore
    public SolicitudOid getUsuarioRegcrearpagrSolicitud() {
        return this.usuarioRegcrearpagrSolicitud;
    }
    
    public void setUsuarioRegcrearpagrSolicitud(SolicitudOid usuarioRegcrearpagrSolicitud) {
        this.usuarioRegcrearpagrSolicitud = usuarioRegcrearpagrSolicitud;
    }

    @JsonIgnore
    public Solicitud getUsuarioRegcrearpagrSolicitudInstance() {
        return this.usuarioRegcrearpagrSolicitudInstance;
    }
    
    public void setUsuarioRegcrearpagrSolicitudInstance(Solicitud usuarioRegcrearpagrSolicitud) {
        this.usuarioRegcrearpagrSolicitudInstance = usuarioRegcrearpagrSolicitud;
        this.usuarioRegcrearpagrSolicitud = usuarioRegcrearpagrSolicitud != null ? usuarioRegcrearpagrSolicitud.getOid() : null;
    }

    private void checkUsuarioRegcrearpagrSolicitud() throws NotNullArgumentException {
        if(this.getUsuarioRegcrearpagrSolicitudInstance() == null || this.getUsuarioRegcrearpagrSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioRegConstants.SERV_ID_CREAR, UsuarioRegConstants.CLASS_ID, UsuarioRegConstants.ARG_ID_CREAR_USUARIOREGCREARPAGRSOLICITUD, UsuarioRegConstants.SERV_ALIAS_CREAR, UsuarioRegConstants.CLASS_ALIAS, UsuarioRegConstants.ARG_ALIAS_CREAR_USUARIOREGCREARPAGRSOLICITUD);
        }
    }

    @JsonIgnore
    public String getUsuarioRegcrearpatrTipoIdentificacion() {
        return this.usuarioRegcrearpatrTipoIdentificacion;
    }
    
    public void setUsuarioRegcrearpatrTipoIdentificacion(String usuarioRegcrearpatrTipoIdentificacion) {
        this.usuarioRegcrearpatrTipoIdentificacion = usuarioRegcrearpatrTipoIdentificacion;
    }

    private void checkUsuarioRegcrearpatrTipoIdentificacion() throws NotNullArgumentException {
        if(this.getUsuarioRegcrearpatrTipoIdentificacion() == null) {
            throw new NotNullArgumentException(UsuarioRegConstants.SERV_ID_CREAR, UsuarioRegConstants.CLASS_ID, UsuarioRegConstants.ARG_ID_CREAR_USUARIOREGCREARPATRTIPOIDENTIFICACION, UsuarioRegConstants.SERV_ALIAS_CREAR, UsuarioRegConstants.CLASS_ALIAS, UsuarioRegConstants.ARG_ALIAS_CREAR_USUARIOREGCREARPATRTIPOIDENTIFICACION);
        }
    }

    @JsonIgnore
    public String getUsuarioRegcrearpatrNumIdentificacion() {
        return this.usuarioRegcrearpatrNumIdentificacion;
    }
    
    public void setUsuarioRegcrearpatrNumIdentificacion(String usuarioRegcrearpatrNumIdentificacion) {
        this.usuarioRegcrearpatrNumIdentificacion = usuarioRegcrearpatrNumIdentificacion;
    }

    private void checkUsuarioRegcrearpatrNumIdentificacion() throws NotNullArgumentException {
        if(this.getUsuarioRegcrearpatrNumIdentificacion() == null) {
            throw new NotNullArgumentException(UsuarioRegConstants.SERV_ID_CREAR, UsuarioRegConstants.CLASS_ID, UsuarioRegConstants.ARG_ID_CREAR_USUARIOREGCREARPATRNUMIDENTIFICACION, UsuarioRegConstants.SERV_ALIAS_CREAR, UsuarioRegConstants.CLASS_ALIAS, UsuarioRegConstants.ARG_ALIAS_CREAR_USUARIOREGCREARPATRNUMIDENTIFICACION);
        }
    }

    @JsonIgnore
    public String getUsuarioRegcrearpatrPrimerNombre() {
        return this.usuarioRegcrearpatrPrimerNombre;
    }
    
    public void setUsuarioRegcrearpatrPrimerNombre(String usuarioRegcrearpatrPrimerNombre) {
        this.usuarioRegcrearpatrPrimerNombre = usuarioRegcrearpatrPrimerNombre;
    }

    private void checkUsuarioRegcrearpatrPrimerNombre() throws NotNullArgumentException {
        if(this.getUsuarioRegcrearpatrPrimerNombre() == null) {
            throw new NotNullArgumentException(UsuarioRegConstants.SERV_ID_CREAR, UsuarioRegConstants.CLASS_ID, UsuarioRegConstants.ARG_ID_CREAR_USUARIOREGCREARPATRPRIMERNOMBRE, UsuarioRegConstants.SERV_ALIAS_CREAR, UsuarioRegConstants.CLASS_ALIAS, UsuarioRegConstants.ARG_ALIAS_CREAR_USUARIOREGCREARPATRPRIMERNOMBRE);
        }
    }

    @JsonIgnore
    public String getUsuarioRegcrearpatrSegundoNombre() {
        return this.usuarioRegcrearpatrSegundoNombre;
    }
    
    public void setUsuarioRegcrearpatrSegundoNombre(String usuarioRegcrearpatrSegundoNombre) {
        this.usuarioRegcrearpatrSegundoNombre = usuarioRegcrearpatrSegundoNombre;
    }

    @JsonIgnore
    public String getUsuarioRegcrearpatrPrimerApellido() {
        return this.usuarioRegcrearpatrPrimerApellido;
    }
    
    public void setUsuarioRegcrearpatrPrimerApellido(String usuarioRegcrearpatrPrimerApellido) {
        this.usuarioRegcrearpatrPrimerApellido = usuarioRegcrearpatrPrimerApellido;
    }

    private void checkUsuarioRegcrearpatrPrimerApellido() throws NotNullArgumentException {
        if(this.getUsuarioRegcrearpatrPrimerApellido() == null) {
            throw new NotNullArgumentException(UsuarioRegConstants.SERV_ID_CREAR, UsuarioRegConstants.CLASS_ID, UsuarioRegConstants.ARG_ID_CREAR_USUARIOREGCREARPATRPRIMERAPELLIDO, UsuarioRegConstants.SERV_ALIAS_CREAR, UsuarioRegConstants.CLASS_ALIAS, UsuarioRegConstants.ARG_ALIAS_CREAR_USUARIOREGCREARPATRPRIMERAPELLIDO);
        }
    }

    @JsonIgnore
    public String getUsuarioRegcrearpatrSegundoApellido() {
        return this.usuarioRegcrearpatrSegundoApellido;
    }
    
    public void setUsuarioRegcrearpatrSegundoApellido(String usuarioRegcrearpatrSegundoApellido) {
        this.usuarioRegcrearpatrSegundoApellido = usuarioRegcrearpatrSegundoApellido;
    }

    @JsonIgnore
    public Long getUsuarioRegcrearpatrNumUsuario() {
        return this.usuarioRegcrearpatrNumUsuario;
    }
    
    public void setUsuarioRegcrearpatrNumUsuario(Long usuarioRegcrearpatrNumUsuario) {
        this.usuarioRegcrearpatrNumUsuario = usuarioRegcrearpatrNumUsuario;
    }

    @JsonIgnore
    public Date getUsuarioRegcrearpatrFechaInicioVigencia() {
        return this.usuarioRegcrearpatrFechaInicioVigencia;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setUsuarioRegcrearpatrFechaInicioVigencia(Date usuarioRegcrearpatrFechaInicioVigencia) {
        this.usuarioRegcrearpatrFechaInicioVigencia = usuarioRegcrearpatrFechaInicioVigencia;
    }

    @JsonIgnore
    public Date getUsuarioRegcrearpatrFechaFinVigencia() {
        return this.usuarioRegcrearpatrFechaFinVigencia;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setUsuarioRegcrearpatrFechaFinVigencia(Date usuarioRegcrearpatrFechaFinVigencia) {
        this.usuarioRegcrearpatrFechaFinVigencia = usuarioRegcrearpatrFechaFinVigencia;
    }

    @JsonIgnore
    public String getUsuarioRegcrearpatrGenero() {
        return this.usuarioRegcrearpatrGenero;
    }
    
    public void setUsuarioRegcrearpatrGenero(String usuarioRegcrearpatrGenero) {
        this.usuarioRegcrearpatrGenero = usuarioRegcrearpatrGenero;
    }

    @JsonIgnore
    public Date getUsuarioRegcrearpatrFechaNacimiento() {
        return this.usuarioRegcrearpatrFechaNacimiento;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setUsuarioRegcrearpatrFechaNacimiento(Date usuarioRegcrearpatrFechaNacimiento) {
        this.usuarioRegcrearpatrFechaNacimiento = usuarioRegcrearpatrFechaNacimiento;
    }
}
