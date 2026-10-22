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

public class TCREARNATURALRequest {

    @JsonProperty("pt_p_agrtipoidentificacion_oid")
    private TipoIdentificacionOid personaTCREARNATURALptpagrTipoIdentificacion;
    
    @JsonIgnore
    private TipoIdentificacion personaTCREARNATURALptpagrTipoIdentificacionInstance;

    @JsonProperty("pt_p_agrdepartamentonacimiento_oid")
    private DepartamentoOid personaTCREARNATURALptpagrDepartamentoNacimiento;
    
    @JsonIgnore
    private Departamento personaTCREARNATURALptpagrDepartamentoNacimientoInstance;

    @JsonProperty("pt_p_agrmunicipionacimiento_oid")
    private MunicipioOid personaTCREARNATURALptpagrMunicipioNacimiento;
    
    @JsonIgnore
    private Municipio personaTCREARNATURALptpagrMunicipioNacimientoInstance;

    @JsonProperty("pt_p_agrestadocivil_oid")
    private EstadoCivilOid personaTCREARNATURALptpagrEstadoCivil;
    
    @JsonIgnore
    private EstadoCivil personaTCREARNATURALptpagrEstadoCivilInstance;

    @JsonProperty("pt_p_atrnumidentificacion")
    private String personaTCREARNATURALptpatrNumIdentificacion;

    @JsonProperty("pt_p_atrprimernombre")
    private String personaTCREARNATURALptpatrPrimerNombre;

    @JsonProperty("pt_p_atrsegundonombre")
    private String personaTCREARNATURALptpatrSegundoNombre;

    @JsonProperty("pt_p_atrprimerapellido")
    private String personaTCREARNATURALptpatrPrimerApellido;

    @JsonProperty("pt_p_atrsegundoapellido")
    private String personaTCREARNATURALptpatrSegundoApellido;

    @JsonProperty("pt_p_atrfechanacimiento")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date personaTCREARNATURALptpatrFechaNacimiento;

    @JsonProperty("pt_p_atrgenero")
    private String personaTCREARNATURALptpatrGenero;

    @JsonProperty("pt_p_atrindicadorextranjero")
    private Boolean personaTCREARNATURALptpatrIndicadorExtranjero;

    @JsonProperty("pt_p_atrtelefonofijo")
    private String personaTCREARNATURALptpatrTelefonoFijo;

    @JsonProperty("pt_p_atrtelefonocelular")
    private String personaTCREARNATURALptpatrTelefonoCelular;

    @JsonProperty("pt_p_atrcorreoelectronico")
    private String personaTCREARNATURALptpatrCorreoElectronico;

    @JsonProperty("pt_p_agrpais_oid")
    private PaisOid personaTCREARNATURALptpagrPais;
    
    @JsonIgnore
    private Pais personaTCREARNATURALptpagrPaisInstance;

    @JsonProperty("pt_p_agrdepartamento_oid")
    private DepartamentoOid personaTCREARNATURALptpagrDepartamento;
    
    @JsonIgnore
    private Departamento personaTCREARNATURALptpagrDepartamentoInstance;

    @JsonProperty("pt_p_agrmunicipio_oid")
    private MunicipioOid personaTCREARNATURALptpagrMunicipio;
    
    @JsonIgnore
    private Municipio personaTCREARNATURALptpagrMunicipioInstance;

    @JsonProperty("pt_p_atrdireccioncompleta")
    private String personaTCREARNATURALptpatrDireccionCompleta;

    @JsonProperty("pt_p_atrrural")
    private Boolean personaTCREARNATURALptpatrRural;

    @JsonProperty("pt_tipodireccion_oid")
    private TipoDireccionOid personaTCREARNATURALptTipoDireccion;
    
    @JsonIgnore
    private TipoDireccion personaTCREARNATURALptTipoDireccionInstance;

    @JsonProperty("p_codigo")
    private Long personaTCREARNATURALpCodigo;

    @JsonProperty("pdcdireccioncompleta")
    private String personaTCREARNATURALpDCDireccionCompleta;

    @JsonProperty("pdcdepartamento_oid")
    private DepartamentoOid personaTCREARNATURALpDCDepartamento;
    
    @JsonIgnore
    private Departamento personaTCREARNATURALpDCDepartamentoInstance;

    @JsonProperty("pdcmunicipio_oid")
    private MunicipioOid personaTCREARNATURALpDCMunicipio;
    
    @JsonIgnore
    private Municipio personaTCREARNATURALpDCMunicipioInstance;

    @JsonProperty("pdcrural")
    private Boolean personaTCREARNATURALpDCRural;

    @JsonProperty("pdctelefonofijo")
    private String personaTCREARNATURALpDCTelefonoFijo;

    @JsonProperty("pdctelefonocelular")
    private String personaTCREARNATURALpDCTelefonoCelular;

    @JsonProperty("pdctipodireccion_oid")
    private TipoDireccionOid personaTCREARNATURALpDCTipoDireccion;
    
    @JsonIgnore
    private TipoDireccion personaTCREARNATURALpDCTipoDireccionInstance;

    @JsonProperty("pdcpais_oid")
    private PaisOid personaTCREARNATURALpDCPais;
    
    @JsonIgnore
    private Pais personaTCREARNATURALpDCPaisInstance;

    @JsonProperty("ptvalidardatos")
    private Boolean personaTCREARNATURALptValidarDatos;

    @JsonProperty("ptestadopersona_oid")
    private EstadoPersonaOid personaTCREARNATURALptEstadoPersona;
    
    @JsonIgnore
    private EstadoPersona personaTCREARNATURALptEstadoPersonaInstance;

    @JsonProperty("ptsolicitud_oid")
    private SolicitudOid personaTCREARNATURALptSolicitud;
    
    @JsonIgnore
    private Solicitud personaTCREARNATURALptSolicitudInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonaTCREARNATURALptpagrTipoIdentificacion();
        checkPersonaTCREARNATURALptpatrNumIdentificacion();
        checkPersonaTCREARNATURALptValidarDatos();
        checkPersonaTCREARNATURALptSolicitud();
    }

    @JsonIgnore
    public TipoIdentificacionOid getPersonaTCREARNATURALptpagrTipoIdentificacion() {
        return this.personaTCREARNATURALptpagrTipoIdentificacion;
    }
    
    public void setPersonaTCREARNATURALptpagrTipoIdentificacion(TipoIdentificacionOid personaTCREARNATURALptpagrTipoIdentificacion) {
        this.personaTCREARNATURALptpagrTipoIdentificacion = personaTCREARNATURALptpagrTipoIdentificacion;
    }

    @JsonIgnore
    public TipoIdentificacion getPersonaTCREARNATURALptpagrTipoIdentificacionInstance() {
        return this.personaTCREARNATURALptpagrTipoIdentificacionInstance;
    }
    
    public void setPersonaTCREARNATURALptpagrTipoIdentificacionInstance(TipoIdentificacion personaTCREARNATURALptpagrTipoIdentificacion) {
        this.personaTCREARNATURALptpagrTipoIdentificacionInstance = personaTCREARNATURALptpagrTipoIdentificacion;
        this.personaTCREARNATURALptpagrTipoIdentificacion = personaTCREARNATURALptpagrTipoIdentificacion != null ? personaTCREARNATURALptpagrTipoIdentificacion.getOid() : null;
    }

    private void checkPersonaTCREARNATURALptpagrTipoIdentificacion() throws NotNullArgumentException {
        if(this.getPersonaTCREARNATURALptpagrTipoIdentificacionInstance() == null || this.getPersonaTCREARNATURALptpagrTipoIdentificacionInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TCREARNATURAL, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TCREARNATURAL_PERSONATCREARNATURALPTPAGRTIPOIDENTIFICACION, PersonaConstants.SERV_ALIAS_TCREARNATURAL, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TCREARNATURAL_PERSONATCREARNATURALPTPAGRTIPOIDENTIFICACION);
        }
    }

    @JsonIgnore
    public DepartamentoOid getPersonaTCREARNATURALptpagrDepartamentoNacimiento() {
        return this.personaTCREARNATURALptpagrDepartamentoNacimiento;
    }
    
    public void setPersonaTCREARNATURALptpagrDepartamentoNacimiento(DepartamentoOid personaTCREARNATURALptpagrDepartamentoNacimiento) {
        this.personaTCREARNATURALptpagrDepartamentoNacimiento = personaTCREARNATURALptpagrDepartamentoNacimiento;
    }

    @JsonIgnore
    public Departamento getPersonaTCREARNATURALptpagrDepartamentoNacimientoInstance() {
        return this.personaTCREARNATURALptpagrDepartamentoNacimientoInstance;
    }
    
    public void setPersonaTCREARNATURALptpagrDepartamentoNacimientoInstance(Departamento personaTCREARNATURALptpagrDepartamentoNacimiento) {
        this.personaTCREARNATURALptpagrDepartamentoNacimientoInstance = personaTCREARNATURALptpagrDepartamentoNacimiento;
        this.personaTCREARNATURALptpagrDepartamentoNacimiento = personaTCREARNATURALptpagrDepartamentoNacimiento != null ? personaTCREARNATURALptpagrDepartamentoNacimiento.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getPersonaTCREARNATURALptpagrMunicipioNacimiento() {
        return this.personaTCREARNATURALptpagrMunicipioNacimiento;
    }
    
    public void setPersonaTCREARNATURALptpagrMunicipioNacimiento(MunicipioOid personaTCREARNATURALptpagrMunicipioNacimiento) {
        this.personaTCREARNATURALptpagrMunicipioNacimiento = personaTCREARNATURALptpagrMunicipioNacimiento;
    }

    @JsonIgnore
    public Municipio getPersonaTCREARNATURALptpagrMunicipioNacimientoInstance() {
        return this.personaTCREARNATURALptpagrMunicipioNacimientoInstance;
    }
    
    public void setPersonaTCREARNATURALptpagrMunicipioNacimientoInstance(Municipio personaTCREARNATURALptpagrMunicipioNacimiento) {
        this.personaTCREARNATURALptpagrMunicipioNacimientoInstance = personaTCREARNATURALptpagrMunicipioNacimiento;
        this.personaTCREARNATURALptpagrMunicipioNacimiento = personaTCREARNATURALptpagrMunicipioNacimiento != null ? personaTCREARNATURALptpagrMunicipioNacimiento.getOid() : null;
    }

    @JsonIgnore
    public EstadoCivilOid getPersonaTCREARNATURALptpagrEstadoCivil() {
        return this.personaTCREARNATURALptpagrEstadoCivil;
    }
    
    public void setPersonaTCREARNATURALptpagrEstadoCivil(EstadoCivilOid personaTCREARNATURALptpagrEstadoCivil) {
        this.personaTCREARNATURALptpagrEstadoCivil = personaTCREARNATURALptpagrEstadoCivil;
    }

    @JsonIgnore
    public EstadoCivil getPersonaTCREARNATURALptpagrEstadoCivilInstance() {
        return this.personaTCREARNATURALptpagrEstadoCivilInstance;
    }
    
    public void setPersonaTCREARNATURALptpagrEstadoCivilInstance(EstadoCivil personaTCREARNATURALptpagrEstadoCivil) {
        this.personaTCREARNATURALptpagrEstadoCivilInstance = personaTCREARNATURALptpagrEstadoCivil;
        this.personaTCREARNATURALptpagrEstadoCivil = personaTCREARNATURALptpagrEstadoCivil != null ? personaTCREARNATURALptpagrEstadoCivil.getOid() : null;
    }

    @JsonIgnore
    public String getPersonaTCREARNATURALptpatrNumIdentificacion() {
        return this.personaTCREARNATURALptpatrNumIdentificacion;
    }
    
    public void setPersonaTCREARNATURALptpatrNumIdentificacion(String personaTCREARNATURALptpatrNumIdentificacion) {
        this.personaTCREARNATURALptpatrNumIdentificacion = personaTCREARNATURALptpatrNumIdentificacion;
    }

    private void checkPersonaTCREARNATURALptpatrNumIdentificacion() throws NotNullArgumentException {
        if(this.getPersonaTCREARNATURALptpatrNumIdentificacion() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TCREARNATURAL, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TCREARNATURAL_PERSONATCREARNATURALPTPATRNUMIDENTIFICACION, PersonaConstants.SERV_ALIAS_TCREARNATURAL, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TCREARNATURAL_PERSONATCREARNATURALPTPATRNUMIDENTIFICACION);
        }
    }

    @JsonIgnore
    public String getPersonaTCREARNATURALptpatrPrimerNombre() {
        return this.personaTCREARNATURALptpatrPrimerNombre;
    }
    
    public void setPersonaTCREARNATURALptpatrPrimerNombre(String personaTCREARNATURALptpatrPrimerNombre) {
        this.personaTCREARNATURALptpatrPrimerNombre = personaTCREARNATURALptpatrPrimerNombre;
    }

    @JsonIgnore
    public String getPersonaTCREARNATURALptpatrSegundoNombre() {
        return this.personaTCREARNATURALptpatrSegundoNombre;
    }
    
    public void setPersonaTCREARNATURALptpatrSegundoNombre(String personaTCREARNATURALptpatrSegundoNombre) {
        this.personaTCREARNATURALptpatrSegundoNombre = personaTCREARNATURALptpatrSegundoNombre;
    }

    @JsonIgnore
    public String getPersonaTCREARNATURALptpatrPrimerApellido() {
        return this.personaTCREARNATURALptpatrPrimerApellido;
    }
    
    public void setPersonaTCREARNATURALptpatrPrimerApellido(String personaTCREARNATURALptpatrPrimerApellido) {
        this.personaTCREARNATURALptpatrPrimerApellido = personaTCREARNATURALptpatrPrimerApellido;
    }

    @JsonIgnore
    public String getPersonaTCREARNATURALptpatrSegundoApellido() {
        return this.personaTCREARNATURALptpatrSegundoApellido;
    }
    
    public void setPersonaTCREARNATURALptpatrSegundoApellido(String personaTCREARNATURALptpatrSegundoApellido) {
        this.personaTCREARNATURALptpatrSegundoApellido = personaTCREARNATURALptpatrSegundoApellido;
    }

    @JsonIgnore
    public Date getPersonaTCREARNATURALptpatrFechaNacimiento() {
        return this.personaTCREARNATURALptpatrFechaNacimiento;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setPersonaTCREARNATURALptpatrFechaNacimiento(Date personaTCREARNATURALptpatrFechaNacimiento) {
        this.personaTCREARNATURALptpatrFechaNacimiento = personaTCREARNATURALptpatrFechaNacimiento;
    }

    @JsonIgnore
    public String getPersonaTCREARNATURALptpatrGenero() {
        return this.personaTCREARNATURALptpatrGenero;
    }
    
    public void setPersonaTCREARNATURALptpatrGenero(String personaTCREARNATURALptpatrGenero) {
        this.personaTCREARNATURALptpatrGenero = personaTCREARNATURALptpatrGenero;
    }

    @JsonIgnore
    public Boolean getPersonaTCREARNATURALptpatrIndicadorExtranjero() {
        return this.personaTCREARNATURALptpatrIndicadorExtranjero;
    }
    
    public void setPersonaTCREARNATURALptpatrIndicadorExtranjero(Boolean personaTCREARNATURALptpatrIndicadorExtranjero) {
        this.personaTCREARNATURALptpatrIndicadorExtranjero = personaTCREARNATURALptpatrIndicadorExtranjero;
    }

    @JsonIgnore
    public String getPersonaTCREARNATURALptpatrTelefonoFijo() {
        return this.personaTCREARNATURALptpatrTelefonoFijo;
    }
    
    public void setPersonaTCREARNATURALptpatrTelefonoFijo(String personaTCREARNATURALptpatrTelefonoFijo) {
        this.personaTCREARNATURALptpatrTelefonoFijo = personaTCREARNATURALptpatrTelefonoFijo;
    }

    @JsonIgnore
    public String getPersonaTCREARNATURALptpatrTelefonoCelular() {
        return this.personaTCREARNATURALptpatrTelefonoCelular;
    }
    
    public void setPersonaTCREARNATURALptpatrTelefonoCelular(String personaTCREARNATURALptpatrTelefonoCelular) {
        this.personaTCREARNATURALptpatrTelefonoCelular = personaTCREARNATURALptpatrTelefonoCelular;
    }

    @JsonIgnore
    public String getPersonaTCREARNATURALptpatrCorreoElectronico() {
        return this.personaTCREARNATURALptpatrCorreoElectronico;
    }
    
    public void setPersonaTCREARNATURALptpatrCorreoElectronico(String personaTCREARNATURALptpatrCorreoElectronico) {
        this.personaTCREARNATURALptpatrCorreoElectronico = personaTCREARNATURALptpatrCorreoElectronico;
    }

    @JsonIgnore
    public PaisOid getPersonaTCREARNATURALptpagrPais() {
        return this.personaTCREARNATURALptpagrPais;
    }
    
    public void setPersonaTCREARNATURALptpagrPais(PaisOid personaTCREARNATURALptpagrPais) {
        this.personaTCREARNATURALptpagrPais = personaTCREARNATURALptpagrPais;
    }

    @JsonIgnore
    public Pais getPersonaTCREARNATURALptpagrPaisInstance() {
        return this.personaTCREARNATURALptpagrPaisInstance;
    }
    
    public void setPersonaTCREARNATURALptpagrPaisInstance(Pais personaTCREARNATURALptpagrPais) {
        this.personaTCREARNATURALptpagrPaisInstance = personaTCREARNATURALptpagrPais;
        this.personaTCREARNATURALptpagrPais = personaTCREARNATURALptpagrPais != null ? personaTCREARNATURALptpagrPais.getOid() : null;
    }

    @JsonIgnore
    public DepartamentoOid getPersonaTCREARNATURALptpagrDepartamento() {
        return this.personaTCREARNATURALptpagrDepartamento;
    }
    
    public void setPersonaTCREARNATURALptpagrDepartamento(DepartamentoOid personaTCREARNATURALptpagrDepartamento) {
        this.personaTCREARNATURALptpagrDepartamento = personaTCREARNATURALptpagrDepartamento;
    }

    @JsonIgnore
    public Departamento getPersonaTCREARNATURALptpagrDepartamentoInstance() {
        return this.personaTCREARNATURALptpagrDepartamentoInstance;
    }
    
    public void setPersonaTCREARNATURALptpagrDepartamentoInstance(Departamento personaTCREARNATURALptpagrDepartamento) {
        this.personaTCREARNATURALptpagrDepartamentoInstance = personaTCREARNATURALptpagrDepartamento;
        this.personaTCREARNATURALptpagrDepartamento = personaTCREARNATURALptpagrDepartamento != null ? personaTCREARNATURALptpagrDepartamento.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getPersonaTCREARNATURALptpagrMunicipio() {
        return this.personaTCREARNATURALptpagrMunicipio;
    }
    
    public void setPersonaTCREARNATURALptpagrMunicipio(MunicipioOid personaTCREARNATURALptpagrMunicipio) {
        this.personaTCREARNATURALptpagrMunicipio = personaTCREARNATURALptpagrMunicipio;
    }

    @JsonIgnore
    public Municipio getPersonaTCREARNATURALptpagrMunicipioInstance() {
        return this.personaTCREARNATURALptpagrMunicipioInstance;
    }
    
    public void setPersonaTCREARNATURALptpagrMunicipioInstance(Municipio personaTCREARNATURALptpagrMunicipio) {
        this.personaTCREARNATURALptpagrMunicipioInstance = personaTCREARNATURALptpagrMunicipio;
        this.personaTCREARNATURALptpagrMunicipio = personaTCREARNATURALptpagrMunicipio != null ? personaTCREARNATURALptpagrMunicipio.getOid() : null;
    }

    @JsonIgnore
    public String getPersonaTCREARNATURALptpatrDireccionCompleta() {
        return this.personaTCREARNATURALptpatrDireccionCompleta;
    }
    
    public void setPersonaTCREARNATURALptpatrDireccionCompleta(String personaTCREARNATURALptpatrDireccionCompleta) {
        this.personaTCREARNATURALptpatrDireccionCompleta = personaTCREARNATURALptpatrDireccionCompleta;
    }

    @JsonIgnore
    public Boolean getPersonaTCREARNATURALptpatrRural() {
        return this.personaTCREARNATURALptpatrRural;
    }
    
    public void setPersonaTCREARNATURALptpatrRural(Boolean personaTCREARNATURALptpatrRural) {
        this.personaTCREARNATURALptpatrRural = personaTCREARNATURALptpatrRural;
    }

    @JsonIgnore
    public TipoDireccionOid getPersonaTCREARNATURALptTipoDireccion() {
        return this.personaTCREARNATURALptTipoDireccion;
    }
    
    public void setPersonaTCREARNATURALptTipoDireccion(TipoDireccionOid personaTCREARNATURALptTipoDireccion) {
        this.personaTCREARNATURALptTipoDireccion = personaTCREARNATURALptTipoDireccion;
    }

    @JsonIgnore
    public TipoDireccion getPersonaTCREARNATURALptTipoDireccionInstance() {
        return this.personaTCREARNATURALptTipoDireccionInstance;
    }
    
    public void setPersonaTCREARNATURALptTipoDireccionInstance(TipoDireccion personaTCREARNATURALptTipoDireccion) {
        this.personaTCREARNATURALptTipoDireccionInstance = personaTCREARNATURALptTipoDireccion;
        this.personaTCREARNATURALptTipoDireccion = personaTCREARNATURALptTipoDireccion != null ? personaTCREARNATURALptTipoDireccion.getOid() : null;
    }

    @JsonIgnore
    public Long getPersonaTCREARNATURALpCodigo() {
        return this.personaTCREARNATURALpCodigo;
    }
    
    public void setPersonaTCREARNATURALpCodigo(Long personaTCREARNATURALpCodigo) {
        this.personaTCREARNATURALpCodigo = personaTCREARNATURALpCodigo;
    }

    @JsonIgnore
    public String getPersonaTCREARNATURALpDCDireccionCompleta() {
        return this.personaTCREARNATURALpDCDireccionCompleta;
    }
    
    public void setPersonaTCREARNATURALpDCDireccionCompleta(String personaTCREARNATURALpDCDireccionCompleta) {
        this.personaTCREARNATURALpDCDireccionCompleta = personaTCREARNATURALpDCDireccionCompleta;
    }

    @JsonIgnore
    public DepartamentoOid getPersonaTCREARNATURALpDCDepartamento() {
        return this.personaTCREARNATURALpDCDepartamento;
    }
    
    public void setPersonaTCREARNATURALpDCDepartamento(DepartamentoOid personaTCREARNATURALpDCDepartamento) {
        this.personaTCREARNATURALpDCDepartamento = personaTCREARNATURALpDCDepartamento;
    }

    @JsonIgnore
    public Departamento getPersonaTCREARNATURALpDCDepartamentoInstance() {
        return this.personaTCREARNATURALpDCDepartamentoInstance;
    }
    
    public void setPersonaTCREARNATURALpDCDepartamentoInstance(Departamento personaTCREARNATURALpDCDepartamento) {
        this.personaTCREARNATURALpDCDepartamentoInstance = personaTCREARNATURALpDCDepartamento;
        this.personaTCREARNATURALpDCDepartamento = personaTCREARNATURALpDCDepartamento != null ? personaTCREARNATURALpDCDepartamento.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getPersonaTCREARNATURALpDCMunicipio() {
        return this.personaTCREARNATURALpDCMunicipio;
    }
    
    public void setPersonaTCREARNATURALpDCMunicipio(MunicipioOid personaTCREARNATURALpDCMunicipio) {
        this.personaTCREARNATURALpDCMunicipio = personaTCREARNATURALpDCMunicipio;
    }

    @JsonIgnore
    public Municipio getPersonaTCREARNATURALpDCMunicipioInstance() {
        return this.personaTCREARNATURALpDCMunicipioInstance;
    }
    
    public void setPersonaTCREARNATURALpDCMunicipioInstance(Municipio personaTCREARNATURALpDCMunicipio) {
        this.personaTCREARNATURALpDCMunicipioInstance = personaTCREARNATURALpDCMunicipio;
        this.personaTCREARNATURALpDCMunicipio = personaTCREARNATURALpDCMunicipio != null ? personaTCREARNATURALpDCMunicipio.getOid() : null;
    }

    @JsonIgnore
    public Boolean getPersonaTCREARNATURALpDCRural() {
        return this.personaTCREARNATURALpDCRural;
    }
    
    public void setPersonaTCREARNATURALpDCRural(Boolean personaTCREARNATURALpDCRural) {
        this.personaTCREARNATURALpDCRural = personaTCREARNATURALpDCRural;
    }

    @JsonIgnore
    public String getPersonaTCREARNATURALpDCTelefonoFijo() {
        return this.personaTCREARNATURALpDCTelefonoFijo;
    }
    
    public void setPersonaTCREARNATURALpDCTelefonoFijo(String personaTCREARNATURALpDCTelefonoFijo) {
        this.personaTCREARNATURALpDCTelefonoFijo = personaTCREARNATURALpDCTelefonoFijo;
    }

    @JsonIgnore
    public String getPersonaTCREARNATURALpDCTelefonoCelular() {
        return this.personaTCREARNATURALpDCTelefonoCelular;
    }
    
    public void setPersonaTCREARNATURALpDCTelefonoCelular(String personaTCREARNATURALpDCTelefonoCelular) {
        this.personaTCREARNATURALpDCTelefonoCelular = personaTCREARNATURALpDCTelefonoCelular;
    }

    @JsonIgnore
    public TipoDireccionOid getPersonaTCREARNATURALpDCTipoDireccion() {
        return this.personaTCREARNATURALpDCTipoDireccion;
    }
    
    public void setPersonaTCREARNATURALpDCTipoDireccion(TipoDireccionOid personaTCREARNATURALpDCTipoDireccion) {
        this.personaTCREARNATURALpDCTipoDireccion = personaTCREARNATURALpDCTipoDireccion;
    }

    @JsonIgnore
    public TipoDireccion getPersonaTCREARNATURALpDCTipoDireccionInstance() {
        return this.personaTCREARNATURALpDCTipoDireccionInstance;
    }
    
    public void setPersonaTCREARNATURALpDCTipoDireccionInstance(TipoDireccion personaTCREARNATURALpDCTipoDireccion) {
        this.personaTCREARNATURALpDCTipoDireccionInstance = personaTCREARNATURALpDCTipoDireccion;
        this.personaTCREARNATURALpDCTipoDireccion = personaTCREARNATURALpDCTipoDireccion != null ? personaTCREARNATURALpDCTipoDireccion.getOid() : null;
    }

    @JsonIgnore
    public PaisOid getPersonaTCREARNATURALpDCPais() {
        return this.personaTCREARNATURALpDCPais;
    }
    
    public void setPersonaTCREARNATURALpDCPais(PaisOid personaTCREARNATURALpDCPais) {
        this.personaTCREARNATURALpDCPais = personaTCREARNATURALpDCPais;
    }

    @JsonIgnore
    public Pais getPersonaTCREARNATURALpDCPaisInstance() {
        return this.personaTCREARNATURALpDCPaisInstance;
    }
    
    public void setPersonaTCREARNATURALpDCPaisInstance(Pais personaTCREARNATURALpDCPais) {
        this.personaTCREARNATURALpDCPaisInstance = personaTCREARNATURALpDCPais;
        this.personaTCREARNATURALpDCPais = personaTCREARNATURALpDCPais != null ? personaTCREARNATURALpDCPais.getOid() : null;
    }

    @JsonIgnore
    public Boolean getPersonaTCREARNATURALptValidarDatos() {
        return this.personaTCREARNATURALptValidarDatos;
    }
    
    public void setPersonaTCREARNATURALptValidarDatos(Boolean personaTCREARNATURALptValidarDatos) {
        this.personaTCREARNATURALptValidarDatos = personaTCREARNATURALptValidarDatos;
    }

    private void checkPersonaTCREARNATURALptValidarDatos() throws NotNullArgumentException {
        if(this.getPersonaTCREARNATURALptValidarDatos() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TCREARNATURAL, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TCREARNATURAL_PERSONATCREARNATURALPTVALIDARDATOS, PersonaConstants.SERV_ALIAS_TCREARNATURAL, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TCREARNATURAL_PERSONATCREARNATURALPTVALIDARDATOS);
        }
    }

    @JsonIgnore
    public EstadoPersonaOid getPersonaTCREARNATURALptEstadoPersona() {
        return this.personaTCREARNATURALptEstadoPersona;
    }
    
    public void setPersonaTCREARNATURALptEstadoPersona(EstadoPersonaOid personaTCREARNATURALptEstadoPersona) {
        this.personaTCREARNATURALptEstadoPersona = personaTCREARNATURALptEstadoPersona;
    }

    @JsonIgnore
    public EstadoPersona getPersonaTCREARNATURALptEstadoPersonaInstance() {
        return this.personaTCREARNATURALptEstadoPersonaInstance;
    }
    
    public void setPersonaTCREARNATURALptEstadoPersonaInstance(EstadoPersona personaTCREARNATURALptEstadoPersona) {
        this.personaTCREARNATURALptEstadoPersonaInstance = personaTCREARNATURALptEstadoPersona;
        this.personaTCREARNATURALptEstadoPersona = personaTCREARNATURALptEstadoPersona != null ? personaTCREARNATURALptEstadoPersona.getOid() : null;
    }

    @JsonIgnore
    public SolicitudOid getPersonaTCREARNATURALptSolicitud() {
        return this.personaTCREARNATURALptSolicitud;
    }
    
    public void setPersonaTCREARNATURALptSolicitud(SolicitudOid personaTCREARNATURALptSolicitud) {
        this.personaTCREARNATURALptSolicitud = personaTCREARNATURALptSolicitud;
    }

    @JsonIgnore
    public Solicitud getPersonaTCREARNATURALptSolicitudInstance() {
        return this.personaTCREARNATURALptSolicitudInstance;
    }
    
    public void setPersonaTCREARNATURALptSolicitudInstance(Solicitud personaTCREARNATURALptSolicitud) {
        this.personaTCREARNATURALptSolicitudInstance = personaTCREARNATURALptSolicitud;
        this.personaTCREARNATURALptSolicitud = personaTCREARNATURALptSolicitud != null ? personaTCREARNATURALptSolicitud.getOid() : null;
    }

    private void checkPersonaTCREARNATURALptSolicitud() throws NotNullArgumentException {
        if(this.getPersonaTCREARNATURALptSolicitudInstance() == null || this.getPersonaTCREARNATURALptSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TCREARNATURAL, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TCREARNATURAL_PERSONATCREARNATURALPTSOLICITUD, PersonaConstants.SERV_ALIAS_TCREARNATURAL, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TCREARNATURAL_PERSONATCREARNATURALPTSOLICITUD);
        }
    }
}
