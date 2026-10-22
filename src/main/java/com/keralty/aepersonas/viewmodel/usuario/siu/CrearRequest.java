package com.keralty.aepersonas.viewmodel.usuario.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.persistence.Companyia;
import com.keralty.aepersonas.persistence.Eps;
import com.keralty.aepersonas.persistence.EstadoBeneficiario;
import com.keralty.aepersonas.persistence.oid.CompanyiaOid;
import com.keralty.aepersonas.persistence.oid.EpsOid;
import com.keralty.aepersonas.persistence.oid.EstadoBeneficiarioOid;
import com.keralty.aepersonas.persistence.oid.ParentescoOid;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.persistence.Parentesco;
import com.keralty.aepersonas.persistence.Persona;
import com.keralty.aepersonas.persistence.Solicitud;
import com.keralty.aepersonas.persistence.TipoIdentificacion;

public class CrearRequest {

    @JsonProperty("p_agrusuariopersona_oid")
    private PersonaOid usuariocrearpagrUsuarioPersona;
    
    @JsonIgnore
    private Persona usuariocrearpagrUsuarioPersonaInstance;

    @JsonProperty("p_agreps_oid")
    private EpsOid usuariocrearpagrEps;
    
    @JsonIgnore
    private Eps usuariocrearpagrEpsInstance;

    @JsonProperty("p_agrcompanyia_oid")
    private CompanyiaOid usuariocrearpagrCompanyia;
    
    @JsonIgnore
    private Companyia usuariocrearpagrCompanyiaInstance;

    @JsonProperty("p_agrparentesco_oid")
    private ParentescoOid usuariocrearpagrParentesco;
    
    @JsonIgnore
    private Parentesco usuariocrearpagrParentescoInstance;

    @JsonProperty("p_agrestadobeneficiario_oid")
    private EstadoBeneficiarioOid usuariocrearpagrEstadoBeneficiario;
    
    @JsonIgnore
    private EstadoBeneficiario usuariocrearpagrEstadoBeneficiarioInstance;

    @JsonProperty("p_agrtipoidentificacion_oid")
    private TipoIdentificacionOid usuariocrearpagrTipoIdentificacion;
    
    @JsonIgnore
    private TipoIdentificacion usuariocrearpagrTipoIdentificacionInstance;

    @JsonProperty("p_agrsolicitud_oid")
    private SolicitudOid usuariocrearpagrSolicitud;
    
    @JsonIgnore
    private Solicitud usuariocrearpagrSolicitudInstance;

    @JsonProperty("p_atrbebegestante")
    private Boolean usuariocrearpatrBebeGestante;

    @JsonProperty("p_atrnumusuario")
    private Long usuariocrearpatrNumUsuario;

    @JsonProperty("p_atrnumidentificacion")
    private String usuariocrearpatrNumIdentificacion;

    @JsonProperty("p_atrcodigotipousuario")
    private Long usuariocrearpatrCodigoTipoUsuario;

    @JsonProperty("p_atrprimernombre")
    private String usuariocrearpatrPrimerNombre;

    @JsonProperty("p_atrsegundonombre")
    private String usuariocrearpatrSegundoNombre;

    @JsonProperty("p_atrprimerapellido")
    private String usuariocrearpatrPrimerApellido;

    @JsonProperty("p_atrsegundoapellido")
    private String usuariocrearpatrSegundoApellido;

    @JsonProperty("p_atrcodigobancorep")
    private String usuariocrearpatrcodigoBancoRep;

    @JsonProperty("p_atrusuarioreplicado")
    private Boolean usuariocrearpatrUsuarioReplicado;

    public void checkArguments() throws NotNullArgumentException {
        checkUsuariocrearpagrUsuarioPersona();
        checkUsuariocrearpagrTipoIdentificacion();
        checkUsuariocrearpagrSolicitud();
        checkUsuariocrearpatrBebeGestante();
        checkUsuariocrearpatrNumIdentificacion();
        checkUsuariocrearpatrCodigoTipoUsuario();
        checkUsuariocrearpatrUsuarioReplicado();
    }

    @JsonIgnore
    public PersonaOid getUsuariocrearpagrUsuarioPersona() {
        return this.usuariocrearpagrUsuarioPersona;
    }
    
    public void setUsuariocrearpagrUsuarioPersona(PersonaOid usuariocrearpagrUsuarioPersona) {
        this.usuariocrearpagrUsuarioPersona = usuariocrearpagrUsuarioPersona;
    }

    @JsonIgnore
    public Persona getUsuariocrearpagrUsuarioPersonaInstance() {
        return this.usuariocrearpagrUsuarioPersonaInstance;
    }
    
    public void setUsuariocrearpagrUsuarioPersonaInstance(Persona usuariocrearpagrUsuarioPersona) {
        this.usuariocrearpagrUsuarioPersonaInstance = usuariocrearpagrUsuarioPersona;
        this.usuariocrearpagrUsuarioPersona = usuariocrearpagrUsuarioPersona != null ? usuariocrearpagrUsuarioPersona.getOid() : null;
    }

    private void checkUsuariocrearpagrUsuarioPersona() throws NotNullArgumentException {
        if(this.getUsuariocrearpagrUsuarioPersonaInstance() == null || this.getUsuariocrearpagrUsuarioPersonaInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_CREAR, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_CREAR_USUARIOCREARPAGRUSUARIOPERSONA, UsuarioConstants.SERV_ALIAS_CREAR, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_CREAR_USUARIOCREARPAGRUSUARIOPERSONA);
        }
    }

    @JsonIgnore
    public EpsOid getUsuariocrearpagrEps() {
        return this.usuariocrearpagrEps;
    }
    
    public void setUsuariocrearpagrEps(EpsOid usuariocrearpagrEps) {
        this.usuariocrearpagrEps = usuariocrearpagrEps;
    }

    @JsonIgnore
    public Eps getUsuariocrearpagrEpsInstance() {
        return this.usuariocrearpagrEpsInstance;
    }
    
    public void setUsuariocrearpagrEpsInstance(Eps usuariocrearpagrEps) {
        this.usuariocrearpagrEpsInstance = usuariocrearpagrEps;
        this.usuariocrearpagrEps = usuariocrearpagrEps != null ? usuariocrearpagrEps.getOid() : null;
    }

    @JsonIgnore
    public CompanyiaOid getUsuariocrearpagrCompanyia() {
        return this.usuariocrearpagrCompanyia;
    }
    
    public void setUsuariocrearpagrCompanyia(CompanyiaOid usuariocrearpagrCompanyia) {
        this.usuariocrearpagrCompanyia = usuariocrearpagrCompanyia;
    }

    @JsonIgnore
    public Companyia getUsuariocrearpagrCompanyiaInstance() {
        return this.usuariocrearpagrCompanyiaInstance;
    }
    
    public void setUsuariocrearpagrCompanyiaInstance(Companyia usuariocrearpagrCompanyia) {
        this.usuariocrearpagrCompanyiaInstance = usuariocrearpagrCompanyia;
        this.usuariocrearpagrCompanyia = usuariocrearpagrCompanyia != null ? usuariocrearpagrCompanyia.getOid() : null;
    }

    @JsonIgnore
    public ParentescoOid getUsuariocrearpagrParentesco() {
        return this.usuariocrearpagrParentesco;
    }
    
    public void setUsuariocrearpagrParentesco(ParentescoOid usuariocrearpagrParentesco) {
        this.usuariocrearpagrParentesco = usuariocrearpagrParentesco;
    }

    @JsonIgnore
    public Parentesco getUsuariocrearpagrParentescoInstance() {
        return this.usuariocrearpagrParentescoInstance;
    }
    
    public void setUsuariocrearpagrParentescoInstance(Parentesco usuariocrearpagrParentesco) {
        this.usuariocrearpagrParentescoInstance = usuariocrearpagrParentesco;
        this.usuariocrearpagrParentesco = usuariocrearpagrParentesco != null ? usuariocrearpagrParentesco.getOid() : null;
    }

    @JsonIgnore
    public EstadoBeneficiarioOid getUsuariocrearpagrEstadoBeneficiario() {
        return this.usuariocrearpagrEstadoBeneficiario;
    }
    
    public void setUsuariocrearpagrEstadoBeneficiario(EstadoBeneficiarioOid usuariocrearpagrEstadoBeneficiario) {
        this.usuariocrearpagrEstadoBeneficiario = usuariocrearpagrEstadoBeneficiario;
    }

    @JsonIgnore
    public EstadoBeneficiario getUsuariocrearpagrEstadoBeneficiarioInstance() {
        return this.usuariocrearpagrEstadoBeneficiarioInstance;
    }
    
    public void setUsuariocrearpagrEstadoBeneficiarioInstance(EstadoBeneficiario usuariocrearpagrEstadoBeneficiario) {
        this.usuariocrearpagrEstadoBeneficiarioInstance = usuariocrearpagrEstadoBeneficiario;
        this.usuariocrearpagrEstadoBeneficiario = usuariocrearpagrEstadoBeneficiario != null ? usuariocrearpagrEstadoBeneficiario.getOid() : null;
    }

    @JsonIgnore
    public TipoIdentificacionOid getUsuariocrearpagrTipoIdentificacion() {
        return this.usuariocrearpagrTipoIdentificacion;
    }
    
    public void setUsuariocrearpagrTipoIdentificacion(TipoIdentificacionOid usuariocrearpagrTipoIdentificacion) {
        this.usuariocrearpagrTipoIdentificacion = usuariocrearpagrTipoIdentificacion;
    }

    @JsonIgnore
    public TipoIdentificacion getUsuariocrearpagrTipoIdentificacionInstance() {
        return this.usuariocrearpagrTipoIdentificacionInstance;
    }
    
    public void setUsuariocrearpagrTipoIdentificacionInstance(TipoIdentificacion usuariocrearpagrTipoIdentificacion) {
        this.usuariocrearpagrTipoIdentificacionInstance = usuariocrearpagrTipoIdentificacion;
        this.usuariocrearpagrTipoIdentificacion = usuariocrearpagrTipoIdentificacion != null ? usuariocrearpagrTipoIdentificacion.getOid() : null;
    }

    private void checkUsuariocrearpagrTipoIdentificacion() throws NotNullArgumentException {
        if(this.getUsuariocrearpagrTipoIdentificacionInstance() == null || this.getUsuariocrearpagrTipoIdentificacionInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_CREAR, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_CREAR_USUARIOCREARPAGRTIPOIDENTIFICACION, UsuarioConstants.SERV_ALIAS_CREAR, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_CREAR_USUARIOCREARPAGRTIPOIDENTIFICACION);
        }
    }

    @JsonIgnore
    public SolicitudOid getUsuariocrearpagrSolicitud() {
        return this.usuariocrearpagrSolicitud;
    }
    
    public void setUsuariocrearpagrSolicitud(SolicitudOid usuariocrearpagrSolicitud) {
        this.usuariocrearpagrSolicitud = usuariocrearpagrSolicitud;
    }

    @JsonIgnore
    public Solicitud getUsuariocrearpagrSolicitudInstance() {
        return this.usuariocrearpagrSolicitudInstance;
    }
    
    public void setUsuariocrearpagrSolicitudInstance(Solicitud usuariocrearpagrSolicitud) {
        this.usuariocrearpagrSolicitudInstance = usuariocrearpagrSolicitud;
        this.usuariocrearpagrSolicitud = usuariocrearpagrSolicitud != null ? usuariocrearpagrSolicitud.getOid() : null;
    }

    private void checkUsuariocrearpagrSolicitud() throws NotNullArgumentException {
        if(this.getUsuariocrearpagrSolicitudInstance() == null || this.getUsuariocrearpagrSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_CREAR, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_CREAR_USUARIOCREARPAGRSOLICITUD, UsuarioConstants.SERV_ALIAS_CREAR, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_CREAR_USUARIOCREARPAGRSOLICITUD);
        }
    }

    @JsonIgnore
    public Boolean getUsuariocrearpatrBebeGestante() {
        return this.usuariocrearpatrBebeGestante;
    }
    
    public void setUsuariocrearpatrBebeGestante(Boolean usuariocrearpatrBebeGestante) {
        this.usuariocrearpatrBebeGestante = usuariocrearpatrBebeGestante;
    }

    private void checkUsuariocrearpatrBebeGestante() throws NotNullArgumentException {
        if(this.getUsuariocrearpatrBebeGestante() == null) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_CREAR, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_CREAR_USUARIOCREARPATRBEBEGESTANTE, UsuarioConstants.SERV_ALIAS_CREAR, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_CREAR_USUARIOCREARPATRBEBEGESTANTE);
        }
    }

    @JsonIgnore
    public Long getUsuariocrearpatrNumUsuario() {
        return this.usuariocrearpatrNumUsuario;
    }
    
    public void setUsuariocrearpatrNumUsuario(Long usuariocrearpatrNumUsuario) {
        this.usuariocrearpatrNumUsuario = usuariocrearpatrNumUsuario;
    }

    @JsonIgnore
    public String getUsuariocrearpatrNumIdentificacion() {
        return this.usuariocrearpatrNumIdentificacion;
    }
    
    public void setUsuariocrearpatrNumIdentificacion(String usuariocrearpatrNumIdentificacion) {
        this.usuariocrearpatrNumIdentificacion = usuariocrearpatrNumIdentificacion;
    }

    private void checkUsuariocrearpatrNumIdentificacion() throws NotNullArgumentException {
        if(this.getUsuariocrearpatrNumIdentificacion() == null) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_CREAR, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_CREAR_USUARIOCREARPATRNUMIDENTIFICACION, UsuarioConstants.SERV_ALIAS_CREAR, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_CREAR_USUARIOCREARPATRNUMIDENTIFICACION);
        }
    }

    @JsonIgnore
    public Long getUsuariocrearpatrCodigoTipoUsuario() {
        return this.usuariocrearpatrCodigoTipoUsuario;
    }
    
    public void setUsuariocrearpatrCodigoTipoUsuario(Long usuariocrearpatrCodigoTipoUsuario) {
        this.usuariocrearpatrCodigoTipoUsuario = usuariocrearpatrCodigoTipoUsuario;
    }

    private void checkUsuariocrearpatrCodigoTipoUsuario() throws NotNullArgumentException {
        if(this.getUsuariocrearpatrCodigoTipoUsuario() == null) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_CREAR, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_CREAR_USUARIOCREARPATRCODIGOTIPOUSUARIO, UsuarioConstants.SERV_ALIAS_CREAR, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_CREAR_USUARIOCREARPATRCODIGOTIPOUSUARIO);
        }
    }

    @JsonIgnore
    public String getUsuariocrearpatrPrimerNombre() {
        return this.usuariocrearpatrPrimerNombre;
    }
    
    public void setUsuariocrearpatrPrimerNombre(String usuariocrearpatrPrimerNombre) {
        this.usuariocrearpatrPrimerNombre = usuariocrearpatrPrimerNombre;
    }

    @JsonIgnore
    public String getUsuariocrearpatrSegundoNombre() {
        return this.usuariocrearpatrSegundoNombre;
    }
    
    public void setUsuariocrearpatrSegundoNombre(String usuariocrearpatrSegundoNombre) {
        this.usuariocrearpatrSegundoNombre = usuariocrearpatrSegundoNombre;
    }

    @JsonIgnore
    public String getUsuariocrearpatrPrimerApellido() {
        return this.usuariocrearpatrPrimerApellido;
    }
    
    public void setUsuariocrearpatrPrimerApellido(String usuariocrearpatrPrimerApellido) {
        this.usuariocrearpatrPrimerApellido = usuariocrearpatrPrimerApellido;
    }

    @JsonIgnore
    public String getUsuariocrearpatrSegundoApellido() {
        return this.usuariocrearpatrSegundoApellido;
    }
    
    public void setUsuariocrearpatrSegundoApellido(String usuariocrearpatrSegundoApellido) {
        this.usuariocrearpatrSegundoApellido = usuariocrearpatrSegundoApellido;
    }

    @JsonIgnore
    public String getUsuariocrearpatrcodigoBancoRep() {
        return this.usuariocrearpatrcodigoBancoRep;
    }
    
    public void setUsuariocrearpatrcodigoBancoRep(String usuariocrearpatrcodigoBancoRep) {
        this.usuariocrearpatrcodigoBancoRep = usuariocrearpatrcodigoBancoRep;
    }

    @JsonIgnore
    public Boolean getUsuariocrearpatrUsuarioReplicado() {
        return this.usuariocrearpatrUsuarioReplicado;
    }
    
    public void setUsuariocrearpatrUsuarioReplicado(Boolean usuariocrearpatrUsuarioReplicado) {
        this.usuariocrearpatrUsuarioReplicado = usuariocrearpatrUsuarioReplicado;
    }

    private void checkUsuariocrearpatrUsuarioReplicado() throws NotNullArgumentException {
        if(this.getUsuariocrearpatrUsuarioReplicado() == null) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_CREAR, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_CREAR_USUARIOCREARPATRUSUARIOREPLICADO, UsuarioConstants.SERV_ALIAS_CREAR, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_CREAR_USUARIOCREARPATRUSUARIOREPLICADO);
        }
    }
}
