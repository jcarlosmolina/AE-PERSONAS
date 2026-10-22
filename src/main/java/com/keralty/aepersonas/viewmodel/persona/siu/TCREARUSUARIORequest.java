package com.keralty.aepersonas.viewmodel.persona.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.EstadoCivil;
import com.keralty.aepersonas.persistence.EstadoPersona;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.persistence.oid.EstadoCivilOid;
import com.keralty.aepersonas.persistence.oid.EstadoPersonaOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;
import com.keralty.aepersonas.persistence.oid.PaisOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.oid.TipoDireccionOid;
import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.persistence.Pais;
import com.keralty.aepersonas.persistence.Solicitud;
import com.keralty.aepersonas.persistence.TipoDireccion;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneDeserializer;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneSerializer;
import java.sql.Date;

public class TCREARUSUARIORequest {

    @JsonProperty("pt_p_agrtipoidentificacion_oid")
    private TipoIdentificacionOid personaTCREARUSUARIOptpagrTipoIdentificacion;
    
    @JsonIgnore
    private TipoIdentificacion personaTCREARUSUARIOptpagrTipoIdentificacionInstance;

    @JsonProperty("pt_p_agrdepartamentonacimiento_oid")
    private DepartamentoOid personaTCREARUSUARIOptpagrDepartamentoNacimiento;
    
    @JsonIgnore
    private Departamento personaTCREARUSUARIOptpagrDepartamentoNacimientoInstance;

    @JsonProperty("pt_p_agrmunicipionacimiento_oid")
    private MunicipioOid personaTCREARUSUARIOptpagrMunicipioNacimiento;
    
    @JsonIgnore
    private Municipio personaTCREARUSUARIOptpagrMunicipioNacimientoInstance;

    @JsonProperty("pt_p_agrestadocivil_oid")
    private EstadoCivilOid personaTCREARUSUARIOptpagrEstadoCivil;
    
    @JsonIgnore
    private EstadoCivil personaTCREARUSUARIOptpagrEstadoCivilInstance;

    @JsonProperty("pt_p_atrnumidentificacion")
    private String personaTCREARUSUARIOptpatrNumIdentificacion;

    @JsonProperty("pt_p_atrprimernombre")
    private String personaTCREARUSUARIOptpatrPrimerNombre;

    @JsonProperty("pt_p_atrsegundonombre")
    private String personaTCREARUSUARIOptpatrSegundoNombre;

    @JsonProperty("pt_p_atrprimerapellido")
    private String personaTCREARUSUARIOptpatrPrimerApellido;

    @JsonProperty("pt_p_atrsegundoapellido")
    private String personaTCREARUSUARIOptpatrSegundoApellido;

    @JsonProperty("pt_p_atrfechanacimiento")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date personaTCREARUSUARIOptpatrFechaNacimiento;

    @JsonProperty("pt_p_atrgenero")
    private String personaTCREARUSUARIOptpatrGenero;

    @JsonProperty("pt_p_atrindicadorextranjero")
    private Boolean personaTCREARUSUARIOptpatrIndicadorExtranjero;

    @JsonProperty("pt_p_atrtelefonofijo")
    private String personaTCREARUSUARIOptpatrTelefonoFijo;

    @JsonProperty("pt_p_atrtelefonocelular")
    private String personaTCREARUSUARIOptpatrTelefonoCelular;

    @JsonProperty("pt_p_atrcorreoelectronico")
    private String personaTCREARUSUARIOptpatrCorreoElectronico;

    @JsonProperty("pt_p_agrdepartamento_oid")
    private DepartamentoOid personaTCREARUSUARIOptpagrDepartamento;
    
    @JsonIgnore
    private Departamento personaTCREARUSUARIOptpagrDepartamentoInstance;

    @JsonProperty("pt_p_agrmunicipio_oid")
    private MunicipioOid personaTCREARUSUARIOptpagrMunicipio;
    
    @JsonIgnore
    private Municipio personaTCREARUSUARIOptpagrMunicipioInstance;

    @JsonProperty("pt_p_atrdireccioncompleta")
    private String personaTCREARUSUARIOptpatrDireccionCompleta;

    @JsonProperty("pt_p_atrrural")
    private Boolean personaTCREARUSUARIOptpatrRural;

    @JsonProperty("pt_tipodireccion_oid")
    private TipoDireccionOid personaTCREARUSUARIOptTipoDireccion;
    
    @JsonIgnore
    private TipoDireccion personaTCREARUSUARIOptTipoDireccionInstance;

    @JsonProperty("pt_p_codigo")
    private Long personaTCREARUSUARIOptpCodigo;

    @JsonProperty("pt_p_tieneepssanitas")
    private Boolean personaTCREARUSUARIOptpTieneEPSSanitas;

    @JsonProperty("pt_p_rechazadoafiliacion")
    private String personaTCREARUSUARIOptpRechazadoAfiliacion;

    @JsonProperty("pt_p_agrpais_oid")
    private PaisOid personaTCREARUSUARIOptpagrPais;
    
    @JsonIgnore
    private Pais personaTCREARUSUARIOptpagrPaisInstance;

    @JsonProperty("ptchecktiporegimen")
    private Long personaTCREARUSUARIOptCheckTipoRegimen;

    @JsonProperty("ptvalidardatos")
    private Boolean personaTCREARUSUARIOptValidarDatos;

    @JsonProperty("ptestadopersona_oid")
    private EstadoPersonaOid personaTCREARUSUARIOptEstadoPersona;
    
    @JsonIgnore
    private EstadoPersona personaTCREARUSUARIOptEstadoPersonaInstance;

    @JsonProperty("ptsolicitud_oid")
    private SolicitudOid personaTCREARUSUARIOptSolicitud;
    
    @JsonIgnore
    private Solicitud personaTCREARUSUARIOptSolicitudInstance;

    @JsonProperty("preconditionId")
    private String preconditionId;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonaTCREARUSUARIOptpagrTipoIdentificacion();
        checkPersonaTCREARUSUARIOptpatrNumIdentificacion();
        checkPersonaTCREARUSUARIOptpatrPrimerNombre();
        checkPersonaTCREARUSUARIOptpatrPrimerApellido();
        checkPersonaTCREARUSUARIOptpatrFechaNacimiento();
        checkPersonaTCREARUSUARIOptpatrGenero();
        checkPersonaTCREARUSUARIOptCheckTipoRegimen();
        checkPersonaTCREARUSUARIOptValidarDatos();
        checkPersonaTCREARUSUARIOptSolicitud();
    }

    @JsonIgnore
    public TipoIdentificacionOid getPersonaTCREARUSUARIOptpagrTipoIdentificacion() {
        return this.personaTCREARUSUARIOptpagrTipoIdentificacion;
    }
    
    public void setPersonaTCREARUSUARIOptpagrTipoIdentificacion(TipoIdentificacionOid personaTCREARUSUARIOptpagrTipoIdentificacion) {
        this.personaTCREARUSUARIOptpagrTipoIdentificacion = personaTCREARUSUARIOptpagrTipoIdentificacion;
    }

    @JsonIgnore
    public TipoIdentificacion getPersonaTCREARUSUARIOptpagrTipoIdentificacionInstance() {
        return this.personaTCREARUSUARIOptpagrTipoIdentificacionInstance;
    }
    
    public void setPersonaTCREARUSUARIOptpagrTipoIdentificacionInstance(TipoIdentificacion personaTCREARUSUARIOptpagrTipoIdentificacion) {
        this.personaTCREARUSUARIOptpagrTipoIdentificacionInstance = personaTCREARUSUARIOptpagrTipoIdentificacion;
        this.personaTCREARUSUARIOptpagrTipoIdentificacion = personaTCREARUSUARIOptpagrTipoIdentificacion != null ? personaTCREARUSUARIOptpagrTipoIdentificacion.getOid() : null;
    }

    private void checkPersonaTCREARUSUARIOptpagrTipoIdentificacion() throws NotNullArgumentException {
        if(this.getPersonaTCREARUSUARIOptpagrTipoIdentificacionInstance() == null || this.getPersonaTCREARUSUARIOptpagrTipoIdentificacionInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TCREARUSUARIO, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TCREARUSUARIO_PERSONATCREARUSUARIOPTPAGRTIPOIDENTIFICACION, PersonaConstants.SERV_ALIAS_TCREARUSUARIO, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TCREARUSUARIO_PERSONATCREARUSUARIOPTPAGRTIPOIDENTIFICACION);
        }
    }

    @JsonIgnore
    public DepartamentoOid getPersonaTCREARUSUARIOptpagrDepartamentoNacimiento() {
        return this.personaTCREARUSUARIOptpagrDepartamentoNacimiento;
    }
    
    public void setPersonaTCREARUSUARIOptpagrDepartamentoNacimiento(DepartamentoOid personaTCREARUSUARIOptpagrDepartamentoNacimiento) {
        this.personaTCREARUSUARIOptpagrDepartamentoNacimiento = personaTCREARUSUARIOptpagrDepartamentoNacimiento;
    }

    @JsonIgnore
    public Departamento getPersonaTCREARUSUARIOptpagrDepartamentoNacimientoInstance() {
        return this.personaTCREARUSUARIOptpagrDepartamentoNacimientoInstance;
    }
    
    public void setPersonaTCREARUSUARIOptpagrDepartamentoNacimientoInstance(Departamento personaTCREARUSUARIOptpagrDepartamentoNacimiento) {
        this.personaTCREARUSUARIOptpagrDepartamentoNacimientoInstance = personaTCREARUSUARIOptpagrDepartamentoNacimiento;
        this.personaTCREARUSUARIOptpagrDepartamentoNacimiento = personaTCREARUSUARIOptpagrDepartamentoNacimiento != null ? personaTCREARUSUARIOptpagrDepartamentoNacimiento.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getPersonaTCREARUSUARIOptpagrMunicipioNacimiento() {
        return this.personaTCREARUSUARIOptpagrMunicipioNacimiento;
    }
    
    public void setPersonaTCREARUSUARIOptpagrMunicipioNacimiento(MunicipioOid personaTCREARUSUARIOptpagrMunicipioNacimiento) {
        this.personaTCREARUSUARIOptpagrMunicipioNacimiento = personaTCREARUSUARIOptpagrMunicipioNacimiento;
    }

    @JsonIgnore
    public Municipio getPersonaTCREARUSUARIOptpagrMunicipioNacimientoInstance() {
        return this.personaTCREARUSUARIOptpagrMunicipioNacimientoInstance;
    }
    
    public void setPersonaTCREARUSUARIOptpagrMunicipioNacimientoInstance(Municipio personaTCREARUSUARIOptpagrMunicipioNacimiento) {
        this.personaTCREARUSUARIOptpagrMunicipioNacimientoInstance = personaTCREARUSUARIOptpagrMunicipioNacimiento;
        this.personaTCREARUSUARIOptpagrMunicipioNacimiento = personaTCREARUSUARIOptpagrMunicipioNacimiento != null ? personaTCREARUSUARIOptpagrMunicipioNacimiento.getOid() : null;
    }

    @JsonIgnore
    public EstadoCivilOid getPersonaTCREARUSUARIOptpagrEstadoCivil() {
        return this.personaTCREARUSUARIOptpagrEstadoCivil;
    }
    
    public void setPersonaTCREARUSUARIOptpagrEstadoCivil(EstadoCivilOid personaTCREARUSUARIOptpagrEstadoCivil) {
        this.personaTCREARUSUARIOptpagrEstadoCivil = personaTCREARUSUARIOptpagrEstadoCivil;
    }

    @JsonIgnore
    public EstadoCivil getPersonaTCREARUSUARIOptpagrEstadoCivilInstance() {
        return this.personaTCREARUSUARIOptpagrEstadoCivilInstance;
    }
    
    public void setPersonaTCREARUSUARIOptpagrEstadoCivilInstance(EstadoCivil personaTCREARUSUARIOptpagrEstadoCivil) {
        this.personaTCREARUSUARIOptpagrEstadoCivilInstance = personaTCREARUSUARIOptpagrEstadoCivil;
        this.personaTCREARUSUARIOptpagrEstadoCivil = personaTCREARUSUARIOptpagrEstadoCivil != null ? personaTCREARUSUARIOptpagrEstadoCivil.getOid() : null;
    }

    @JsonIgnore
    public String getPersonaTCREARUSUARIOptpatrNumIdentificacion() {
        return this.personaTCREARUSUARIOptpatrNumIdentificacion;
    }
    
    public void setPersonaTCREARUSUARIOptpatrNumIdentificacion(String personaTCREARUSUARIOptpatrNumIdentificacion) {
        this.personaTCREARUSUARIOptpatrNumIdentificacion = personaTCREARUSUARIOptpatrNumIdentificacion;
    }

    private void checkPersonaTCREARUSUARIOptpatrNumIdentificacion() throws NotNullArgumentException {
        if(this.getPersonaTCREARUSUARIOptpatrNumIdentificacion() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TCREARUSUARIO, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRNUMIDENTIFICACION, PersonaConstants.SERV_ALIAS_TCREARUSUARIO, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRNUMIDENTIFICACION);
        }
    }

    @JsonIgnore
    public String getPersonaTCREARUSUARIOptpatrPrimerNombre() {
        return this.personaTCREARUSUARIOptpatrPrimerNombre;
    }
    
    public void setPersonaTCREARUSUARIOptpatrPrimerNombre(String personaTCREARUSUARIOptpatrPrimerNombre) {
        this.personaTCREARUSUARIOptpatrPrimerNombre = personaTCREARUSUARIOptpatrPrimerNombre;
    }

    private void checkPersonaTCREARUSUARIOptpatrPrimerNombre() throws NotNullArgumentException {
        if(this.getPersonaTCREARUSUARIOptpatrPrimerNombre() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TCREARUSUARIO, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRPRIMERNOMBRE, PersonaConstants.SERV_ALIAS_TCREARUSUARIO, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRPRIMERNOMBRE);
        }
    }

    @JsonIgnore
    public String getPersonaTCREARUSUARIOptpatrSegundoNombre() {
        return this.personaTCREARUSUARIOptpatrSegundoNombre;
    }
    
    public void setPersonaTCREARUSUARIOptpatrSegundoNombre(String personaTCREARUSUARIOptpatrSegundoNombre) {
        this.personaTCREARUSUARIOptpatrSegundoNombre = personaTCREARUSUARIOptpatrSegundoNombre;
    }

    @JsonIgnore
    public String getPersonaTCREARUSUARIOptpatrPrimerApellido() {
        return this.personaTCREARUSUARIOptpatrPrimerApellido;
    }
    
    public void setPersonaTCREARUSUARIOptpatrPrimerApellido(String personaTCREARUSUARIOptpatrPrimerApellido) {
        this.personaTCREARUSUARIOptpatrPrimerApellido = personaTCREARUSUARIOptpatrPrimerApellido;
    }

    private void checkPersonaTCREARUSUARIOptpatrPrimerApellido() throws NotNullArgumentException {
        if(this.getPersonaTCREARUSUARIOptpatrPrimerApellido() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TCREARUSUARIO, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRPRIMERAPELLIDO, PersonaConstants.SERV_ALIAS_TCREARUSUARIO, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRPRIMERAPELLIDO);
        }
    }

    @JsonIgnore
    public String getPersonaTCREARUSUARIOptpatrSegundoApellido() {
        return this.personaTCREARUSUARIOptpatrSegundoApellido;
    }
    
    public void setPersonaTCREARUSUARIOptpatrSegundoApellido(String personaTCREARUSUARIOptpatrSegundoApellido) {
        this.personaTCREARUSUARIOptpatrSegundoApellido = personaTCREARUSUARIOptpatrSegundoApellido;
    }

    @JsonIgnore
    public Date getPersonaTCREARUSUARIOptpatrFechaNacimiento() {
        return this.personaTCREARUSUARIOptpatrFechaNacimiento;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setPersonaTCREARUSUARIOptpatrFechaNacimiento(Date personaTCREARUSUARIOptpatrFechaNacimiento) {
        this.personaTCREARUSUARIOptpatrFechaNacimiento = personaTCREARUSUARIOptpatrFechaNacimiento;
    }

    private void checkPersonaTCREARUSUARIOptpatrFechaNacimiento() throws NotNullArgumentException {
        if(this.getPersonaTCREARUSUARIOptpatrFechaNacimiento() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TCREARUSUARIO, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRFECHANACIMIENTO, PersonaConstants.SERV_ALIAS_TCREARUSUARIO, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRFECHANACIMIENTO);
        }
    }

    @JsonIgnore
    public String getPersonaTCREARUSUARIOptpatrGenero() {
        return this.personaTCREARUSUARIOptpatrGenero;
    }
    
    public void setPersonaTCREARUSUARIOptpatrGenero(String personaTCREARUSUARIOptpatrGenero) {
        this.personaTCREARUSUARIOptpatrGenero = personaTCREARUSUARIOptpatrGenero;
    }

    private void checkPersonaTCREARUSUARIOptpatrGenero() throws NotNullArgumentException {
        if(this.getPersonaTCREARUSUARIOptpatrGenero() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TCREARUSUARIO, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRGENERO, PersonaConstants.SERV_ALIAS_TCREARUSUARIO, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TCREARUSUARIO_PERSONATCREARUSUARIOPTPATRGENERO);
        }
    }

    @JsonIgnore
    public Boolean getPersonaTCREARUSUARIOptpatrIndicadorExtranjero() {
        return this.personaTCREARUSUARIOptpatrIndicadorExtranjero;
    }
    
    public void setPersonaTCREARUSUARIOptpatrIndicadorExtranjero(Boolean personaTCREARUSUARIOptpatrIndicadorExtranjero) {
        this.personaTCREARUSUARIOptpatrIndicadorExtranjero = personaTCREARUSUARIOptpatrIndicadorExtranjero;
    }

    @JsonIgnore
    public String getPersonaTCREARUSUARIOptpatrTelefonoFijo() {
        return this.personaTCREARUSUARIOptpatrTelefonoFijo;
    }
    
    public void setPersonaTCREARUSUARIOptpatrTelefonoFijo(String personaTCREARUSUARIOptpatrTelefonoFijo) {
        this.personaTCREARUSUARIOptpatrTelefonoFijo = personaTCREARUSUARIOptpatrTelefonoFijo;
    }

    @JsonIgnore
    public String getPersonaTCREARUSUARIOptpatrTelefonoCelular() {
        return this.personaTCREARUSUARIOptpatrTelefonoCelular;
    }
    
    public void setPersonaTCREARUSUARIOptpatrTelefonoCelular(String personaTCREARUSUARIOptpatrTelefonoCelular) {
        this.personaTCREARUSUARIOptpatrTelefonoCelular = personaTCREARUSUARIOptpatrTelefonoCelular;
    }

    @JsonIgnore
    public String getPersonaTCREARUSUARIOptpatrCorreoElectronico() {
        return this.personaTCREARUSUARIOptpatrCorreoElectronico;
    }
    
    public void setPersonaTCREARUSUARIOptpatrCorreoElectronico(String personaTCREARUSUARIOptpatrCorreoElectronico) {
        this.personaTCREARUSUARIOptpatrCorreoElectronico = personaTCREARUSUARIOptpatrCorreoElectronico;
    }

    @JsonIgnore
    public DepartamentoOid getPersonaTCREARUSUARIOptpagrDepartamento() {
        return this.personaTCREARUSUARIOptpagrDepartamento;
    }
    
    public void setPersonaTCREARUSUARIOptpagrDepartamento(DepartamentoOid personaTCREARUSUARIOptpagrDepartamento) {
        this.personaTCREARUSUARIOptpagrDepartamento = personaTCREARUSUARIOptpagrDepartamento;
    }

    @JsonIgnore
    public Departamento getPersonaTCREARUSUARIOptpagrDepartamentoInstance() {
        return this.personaTCREARUSUARIOptpagrDepartamentoInstance;
    }
    
    public void setPersonaTCREARUSUARIOptpagrDepartamentoInstance(Departamento personaTCREARUSUARIOptpagrDepartamento) {
        this.personaTCREARUSUARIOptpagrDepartamentoInstance = personaTCREARUSUARIOptpagrDepartamento;
        this.personaTCREARUSUARIOptpagrDepartamento = personaTCREARUSUARIOptpagrDepartamento != null ? personaTCREARUSUARIOptpagrDepartamento.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getPersonaTCREARUSUARIOptpagrMunicipio() {
        return this.personaTCREARUSUARIOptpagrMunicipio;
    }
    
    public void setPersonaTCREARUSUARIOptpagrMunicipio(MunicipioOid personaTCREARUSUARIOptpagrMunicipio) {
        this.personaTCREARUSUARIOptpagrMunicipio = personaTCREARUSUARIOptpagrMunicipio;
    }

    @JsonIgnore
    public Municipio getPersonaTCREARUSUARIOptpagrMunicipioInstance() {
        return this.personaTCREARUSUARIOptpagrMunicipioInstance;
    }
    
    public void setPersonaTCREARUSUARIOptpagrMunicipioInstance(Municipio personaTCREARUSUARIOptpagrMunicipio) {
        this.personaTCREARUSUARIOptpagrMunicipioInstance = personaTCREARUSUARIOptpagrMunicipio;
        this.personaTCREARUSUARIOptpagrMunicipio = personaTCREARUSUARIOptpagrMunicipio != null ? personaTCREARUSUARIOptpagrMunicipio.getOid() : null;
    }

    @JsonIgnore
    public String getPersonaTCREARUSUARIOptpatrDireccionCompleta() {
        return this.personaTCREARUSUARIOptpatrDireccionCompleta;
    }
    
    public void setPersonaTCREARUSUARIOptpatrDireccionCompleta(String personaTCREARUSUARIOptpatrDireccionCompleta) {
        this.personaTCREARUSUARIOptpatrDireccionCompleta = personaTCREARUSUARIOptpatrDireccionCompleta;
    }

    @JsonIgnore
    public Boolean getPersonaTCREARUSUARIOptpatrRural() {
        return this.personaTCREARUSUARIOptpatrRural;
    }
    
    public void setPersonaTCREARUSUARIOptpatrRural(Boolean personaTCREARUSUARIOptpatrRural) {
        this.personaTCREARUSUARIOptpatrRural = personaTCREARUSUARIOptpatrRural;
    }

    @JsonIgnore
    public TipoDireccionOid getPersonaTCREARUSUARIOptTipoDireccion() {
        return this.personaTCREARUSUARIOptTipoDireccion;
    }
    
    public void setPersonaTCREARUSUARIOptTipoDireccion(TipoDireccionOid personaTCREARUSUARIOptTipoDireccion) {
        this.personaTCREARUSUARIOptTipoDireccion = personaTCREARUSUARIOptTipoDireccion;
    }

    @JsonIgnore
    public TipoDireccion getPersonaTCREARUSUARIOptTipoDireccionInstance() {
        return this.personaTCREARUSUARIOptTipoDireccionInstance;
    }
    
    public void setPersonaTCREARUSUARIOptTipoDireccionInstance(TipoDireccion personaTCREARUSUARIOptTipoDireccion) {
        this.personaTCREARUSUARIOptTipoDireccionInstance = personaTCREARUSUARIOptTipoDireccion;
        this.personaTCREARUSUARIOptTipoDireccion = personaTCREARUSUARIOptTipoDireccion != null ? personaTCREARUSUARIOptTipoDireccion.getOid() : null;
    }

    @JsonIgnore
    public Long getPersonaTCREARUSUARIOptpCodigo() {
        return this.personaTCREARUSUARIOptpCodigo;
    }
    
    public void setPersonaTCREARUSUARIOptpCodigo(Long personaTCREARUSUARIOptpCodigo) {
        this.personaTCREARUSUARIOptpCodigo = personaTCREARUSUARIOptpCodigo;
    }

    @JsonIgnore
    public Boolean getPersonaTCREARUSUARIOptpTieneEPSSanitas() {
        return this.personaTCREARUSUARIOptpTieneEPSSanitas;
    }
    
    public void setPersonaTCREARUSUARIOptpTieneEPSSanitas(Boolean personaTCREARUSUARIOptpTieneEPSSanitas) {
        this.personaTCREARUSUARIOptpTieneEPSSanitas = personaTCREARUSUARIOptpTieneEPSSanitas;
    }

    @JsonIgnore
    public String getPersonaTCREARUSUARIOptpRechazadoAfiliacion() {
        return this.personaTCREARUSUARIOptpRechazadoAfiliacion;
    }
    
    public void setPersonaTCREARUSUARIOptpRechazadoAfiliacion(String personaTCREARUSUARIOptpRechazadoAfiliacion) {
        this.personaTCREARUSUARIOptpRechazadoAfiliacion = personaTCREARUSUARIOptpRechazadoAfiliacion;
    }

    @JsonIgnore
    public PaisOid getPersonaTCREARUSUARIOptpagrPais() {
        return this.personaTCREARUSUARIOptpagrPais;
    }
    
    public void setPersonaTCREARUSUARIOptpagrPais(PaisOid personaTCREARUSUARIOptpagrPais) {
        this.personaTCREARUSUARIOptpagrPais = personaTCREARUSUARIOptpagrPais;
    }

    @JsonIgnore
    public Pais getPersonaTCREARUSUARIOptpagrPaisInstance() {
        return this.personaTCREARUSUARIOptpagrPaisInstance;
    }
    
    public void setPersonaTCREARUSUARIOptpagrPaisInstance(Pais personaTCREARUSUARIOptpagrPais) {
        this.personaTCREARUSUARIOptpagrPaisInstance = personaTCREARUSUARIOptpagrPais;
        this.personaTCREARUSUARIOptpagrPais = personaTCREARUSUARIOptpagrPais != null ? personaTCREARUSUARIOptpagrPais.getOid() : null;
    }

    @JsonIgnore
    public Long getPersonaTCREARUSUARIOptCheckTipoRegimen() {
        return this.personaTCREARUSUARIOptCheckTipoRegimen;
    }
    
    public void setPersonaTCREARUSUARIOptCheckTipoRegimen(Long personaTCREARUSUARIOptCheckTipoRegimen) {
        this.personaTCREARUSUARIOptCheckTipoRegimen = personaTCREARUSUARIOptCheckTipoRegimen;
    }

    private void checkPersonaTCREARUSUARIOptCheckTipoRegimen() throws NotNullArgumentException {
        if(this.getPersonaTCREARUSUARIOptCheckTipoRegimen() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TCREARUSUARIO, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TCREARUSUARIO_PERSONATCREARUSUARIOPTCHECKTIPOREGIMEN, PersonaConstants.SERV_ALIAS_TCREARUSUARIO, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TCREARUSUARIO_PERSONATCREARUSUARIOPTCHECKTIPOREGIMEN);
        }
    }

    @JsonIgnore
    public Boolean getPersonaTCREARUSUARIOptValidarDatos() {
        return this.personaTCREARUSUARIOptValidarDatos;
    }
    
    public void setPersonaTCREARUSUARIOptValidarDatos(Boolean personaTCREARUSUARIOptValidarDatos) {
        this.personaTCREARUSUARIOptValidarDatos = personaTCREARUSUARIOptValidarDatos;
    }

    private void checkPersonaTCREARUSUARIOptValidarDatos() throws NotNullArgumentException {
        if(this.getPersonaTCREARUSUARIOptValidarDatos() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TCREARUSUARIO, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TCREARUSUARIO_PERSONATCREARUSUARIOPTVALIDARDATOS, PersonaConstants.SERV_ALIAS_TCREARUSUARIO, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TCREARUSUARIO_PERSONATCREARUSUARIOPTVALIDARDATOS);
        }
    }

    @JsonIgnore
    public EstadoPersonaOid getPersonaTCREARUSUARIOptEstadoPersona() {
        return this.personaTCREARUSUARIOptEstadoPersona;
    }
    
    public void setPersonaTCREARUSUARIOptEstadoPersona(EstadoPersonaOid personaTCREARUSUARIOptEstadoPersona) {
        this.personaTCREARUSUARIOptEstadoPersona = personaTCREARUSUARIOptEstadoPersona;
    }

    @JsonIgnore
    public EstadoPersona getPersonaTCREARUSUARIOptEstadoPersonaInstance() {
        return this.personaTCREARUSUARIOptEstadoPersonaInstance;
    }
    
    public void setPersonaTCREARUSUARIOptEstadoPersonaInstance(EstadoPersona personaTCREARUSUARIOptEstadoPersona) {
        this.personaTCREARUSUARIOptEstadoPersonaInstance = personaTCREARUSUARIOptEstadoPersona;
        this.personaTCREARUSUARIOptEstadoPersona = personaTCREARUSUARIOptEstadoPersona != null ? personaTCREARUSUARIOptEstadoPersona.getOid() : null;
    }

    @JsonIgnore
    public SolicitudOid getPersonaTCREARUSUARIOptSolicitud() {
        return this.personaTCREARUSUARIOptSolicitud;
    }
    
    public void setPersonaTCREARUSUARIOptSolicitud(SolicitudOid personaTCREARUSUARIOptSolicitud) {
        this.personaTCREARUSUARIOptSolicitud = personaTCREARUSUARIOptSolicitud;
    }

    @JsonIgnore
    public Solicitud getPersonaTCREARUSUARIOptSolicitudInstance() {
        return this.personaTCREARUSUARIOptSolicitudInstance;
    }
    
    public void setPersonaTCREARUSUARIOptSolicitudInstance(Solicitud personaTCREARUSUARIOptSolicitud) {
        this.personaTCREARUSUARIOptSolicitudInstance = personaTCREARUSUARIOptSolicitud;
        this.personaTCREARUSUARIOptSolicitud = personaTCREARUSUARIOptSolicitud != null ? personaTCREARUSUARIOptSolicitud.getOid() : null;
    }

    private void checkPersonaTCREARUSUARIOptSolicitud() throws NotNullArgumentException {
        if(this.getPersonaTCREARUSUARIOptSolicitudInstance() == null || this.getPersonaTCREARUSUARIOptSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TCREARUSUARIO, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TCREARUSUARIO_PERSONATCREARUSUARIOPTSOLICITUD, PersonaConstants.SERV_ALIAS_TCREARUSUARIO, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TCREARUSUARIO_PERSONATCREARUSUARIOPTSOLICITUD);
        }
    }

    @JsonIgnore
    public String getPreconditionId() {
        return this.preconditionId;
    }
    
    public void setPreconditionId(String preconditionId) {
        this.preconditionId = preconditionId;
    }
}
