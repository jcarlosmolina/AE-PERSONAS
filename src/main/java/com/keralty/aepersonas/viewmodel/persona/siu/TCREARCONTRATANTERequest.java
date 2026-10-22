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

public class TCREARCONTRATANTERequest {

    @JsonProperty("pt_p_agrtipoidentificacion_oid")
    private TipoIdentificacionOid personaTCREARCONTRATANTEptpagrTipoIdentificacion;
    
    @JsonIgnore
    private TipoIdentificacion personaTCREARCONTRATANTEptpagrTipoIdentificacionInstance;

    @JsonProperty("pt_p_agrdepartamentonacimiento_oid")
    private DepartamentoOid personaTCREARCONTRATANTEptpagrDepartamentoNacimiento;
    
    @JsonIgnore
    private Departamento personaTCREARCONTRATANTEptpagrDepartamentoNacimientoInstance;

    @JsonProperty("pt_p_agrmunicipionacimiento_oid")
    private MunicipioOid personaTCREARCONTRATANTEptpagrMunicipioNacimiento;
    
    @JsonIgnore
    private Municipio personaTCREARCONTRATANTEptpagrMunicipioNacimientoInstance;

    @JsonProperty("pt_p_agrestadocivil_oid")
    private EstadoCivilOid personaTCREARCONTRATANTEptpagrEstadoCivil;
    
    @JsonIgnore
    private EstadoCivil personaTCREARCONTRATANTEptpagrEstadoCivilInstance;

    @JsonProperty("pt_p_atrnumidentificacion")
    private String personaTCREARCONTRATANTEptpatrNumIdentificacion;

    @JsonProperty("pt_p_atrprimernombre")
    private String personaTCREARCONTRATANTEptpatrPrimerNombre;

    @JsonProperty("pt_p_atrsegundonombre")
    private String personaTCREARCONTRATANTEptpatrSegundoNombre;

    @JsonProperty("pt_p_atrprimerapellido")
    private String personaTCREARCONTRATANTEptpatrPrimerApellido;

    @JsonProperty("pt_p_atrsegundoapellido")
    private String personaTCREARCONTRATANTEptpatrSegundoApellido;

    @JsonProperty("pt_p_atrfechanacimiento")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date personaTCREARCONTRATANTEptpatrFechaNacimiento;

    @JsonProperty("pt_p_atrgenero")
    private String personaTCREARCONTRATANTEptpatrGenero;

    @JsonProperty("pt_p_atrindicadorextranjero")
    private Boolean personaTCREARCONTRATANTEptpatrIndicadorExtranjero;

    @JsonProperty("pt_p_atrtelefonofijo")
    private String personaTCREARCONTRATANTEptpatrTelefonoFijo;

    @JsonProperty("pt_p_atrtelefonocelular")
    private String personaTCREARCONTRATANTEptpatrTelefonoCelular;

    @JsonProperty("pt_p_atrcorreoelectronico")
    private String personaTCREARCONTRATANTEptpatrCorreoElectronico;

    @JsonProperty("pt_p_agrdepartamento_oid")
    private DepartamentoOid personaTCREARCONTRATANTEptpagrDepartamento;
    
    @JsonIgnore
    private Departamento personaTCREARCONTRATANTEptpagrDepartamentoInstance;

    @JsonProperty("pt_p_agrmunicipio_oid")
    private MunicipioOid personaTCREARCONTRATANTEptpagrMunicipio;
    
    @JsonIgnore
    private Municipio personaTCREARCONTRATANTEptpagrMunicipioInstance;

    @JsonProperty("pt_p_atrdireccioncompleta")
    private String personaTCREARCONTRATANTEptpatrDireccionCompleta;

    @JsonProperty("pt_p_atrrural")
    private Boolean personaTCREARCONTRATANTEptpatrRural;

    @JsonProperty("pt_tipodireccion_oid")
    private TipoDireccionOid personaTCREARCONTRATANTEptTipoDireccion;
    
    @JsonIgnore
    private TipoDireccion personaTCREARCONTRATANTEptTipoDireccionInstance;

    @JsonProperty("pt_p_atrrazonsocial")
    private String personaTCREARCONTRATANTEptpatrRazonSocial;

    @JsonProperty("pt_p_agrpais_oid")
    private PaisOid personaTCREARCONTRATANTEptpagrPais;
    
    @JsonIgnore
    private Pais personaTCREARCONTRATANTEptpagrPaisInstance;

    @JsonProperty("pt_p_codigo")
    private Long personaTCREARCONTRATANTEptpCodigo;

    @JsonProperty("pt_p_tieneepssanitas")
    private Boolean personaTCREARCONTRATANTEptpTieneEPSSanitas;

    @JsonProperty("pt_p_rechazadoafiliacion")
    private String personaTCREARCONTRATANTEptpRechazadoAfiliacion;

    @JsonProperty("pdcdireccioncompleta")
    private String personaTCREARCONTRATANTEpDCDireccionCompleta;

    @JsonProperty("pdcdepartamento_oid")
    private DepartamentoOid personaTCREARCONTRATANTEpDCDepartamento;
    
    @JsonIgnore
    private Departamento personaTCREARCONTRATANTEpDCDepartamentoInstance;

    @JsonProperty("pdcmunicipio_oid")
    private MunicipioOid personaTCREARCONTRATANTEpDCMunicipio;
    
    @JsonIgnore
    private Municipio personaTCREARCONTRATANTEpDCMunicipioInstance;

    @JsonProperty("pdcrural")
    private Boolean personaTCREARCONTRATANTEpDCRural;

    @JsonProperty("pdctelefonofijo")
    private String personaTCREARCONTRATANTEpDCTelefonoFijo;

    @JsonProperty("pdctelefonocelular")
    private String personaTCREARCONTRATANTEpDCTelefonoCelular;

    @JsonProperty("pdctipodireccion_oid")
    private TipoDireccionOid personaTCREARCONTRATANTEpDCTipoDireccion;
    
    @JsonIgnore
    private TipoDireccion personaTCREARCONTRATANTEpDCTipoDireccionInstance;

    @JsonProperty("pdcpais_oid")
    private PaisOid personaTCREARCONTRATANTEpDCPais;
    
    @JsonIgnore
    private Pais personaTCREARCONTRATANTEpDCPaisInstance;

    @JsonProperty("ptestadopersona_oid")
    private EstadoPersonaOid personaTCREARCONTRATANTEptEstadoPersona;
    
    @JsonIgnore
    private EstadoPersona personaTCREARCONTRATANTEptEstadoPersonaInstance;

    @JsonProperty("ptvalidardatos")
    private Boolean personaTCREARCONTRATANTEptValidarDatos;

    @JsonProperty("ptsolicitud_oid")
    private SolicitudOid personaTCREARCONTRATANTEptSolicitud;
    
    @JsonIgnore
    private Solicitud personaTCREARCONTRATANTEptSolicitudInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonaTCREARCONTRATANTEptpagrTipoIdentificacion();
        checkPersonaTCREARCONTRATANTEptpatrNumIdentificacion();
        checkPersonaTCREARCONTRATANTEptValidarDatos();
        checkPersonaTCREARCONTRATANTEptSolicitud();
    }

    @JsonIgnore
    public TipoIdentificacionOid getPersonaTCREARCONTRATANTEptpagrTipoIdentificacion() {
        return this.personaTCREARCONTRATANTEptpagrTipoIdentificacion;
    }
    
    public void setPersonaTCREARCONTRATANTEptpagrTipoIdentificacion(TipoIdentificacionOid personaTCREARCONTRATANTEptpagrTipoIdentificacion) {
        this.personaTCREARCONTRATANTEptpagrTipoIdentificacion = personaTCREARCONTRATANTEptpagrTipoIdentificacion;
    }

    @JsonIgnore
    public TipoIdentificacion getPersonaTCREARCONTRATANTEptpagrTipoIdentificacionInstance() {
        return this.personaTCREARCONTRATANTEptpagrTipoIdentificacionInstance;
    }
    
    public void setPersonaTCREARCONTRATANTEptpagrTipoIdentificacionInstance(TipoIdentificacion personaTCREARCONTRATANTEptpagrTipoIdentificacion) {
        this.personaTCREARCONTRATANTEptpagrTipoIdentificacionInstance = personaTCREARCONTRATANTEptpagrTipoIdentificacion;
        this.personaTCREARCONTRATANTEptpagrTipoIdentificacion = personaTCREARCONTRATANTEptpagrTipoIdentificacion != null ? personaTCREARCONTRATANTEptpagrTipoIdentificacion.getOid() : null;
    }

    private void checkPersonaTCREARCONTRATANTEptpagrTipoIdentificacion() throws NotNullArgumentException {
        if(this.getPersonaTCREARCONTRATANTEptpagrTipoIdentificacionInstance() == null || this.getPersonaTCREARCONTRATANTEptpagrTipoIdentificacionInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TCREARCONTRATANTE, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPAGRTIPOIDENTIFICACION, PersonaConstants.SERV_ALIAS_TCREARCONTRATANTE, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPAGRTIPOIDENTIFICACION);
        }
    }

    @JsonIgnore
    public DepartamentoOid getPersonaTCREARCONTRATANTEptpagrDepartamentoNacimiento() {
        return this.personaTCREARCONTRATANTEptpagrDepartamentoNacimiento;
    }
    
    public void setPersonaTCREARCONTRATANTEptpagrDepartamentoNacimiento(DepartamentoOid personaTCREARCONTRATANTEptpagrDepartamentoNacimiento) {
        this.personaTCREARCONTRATANTEptpagrDepartamentoNacimiento = personaTCREARCONTRATANTEptpagrDepartamentoNacimiento;
    }

    @JsonIgnore
    public Departamento getPersonaTCREARCONTRATANTEptpagrDepartamentoNacimientoInstance() {
        return this.personaTCREARCONTRATANTEptpagrDepartamentoNacimientoInstance;
    }
    
    public void setPersonaTCREARCONTRATANTEptpagrDepartamentoNacimientoInstance(Departamento personaTCREARCONTRATANTEptpagrDepartamentoNacimiento) {
        this.personaTCREARCONTRATANTEptpagrDepartamentoNacimientoInstance = personaTCREARCONTRATANTEptpagrDepartamentoNacimiento;
        this.personaTCREARCONTRATANTEptpagrDepartamentoNacimiento = personaTCREARCONTRATANTEptpagrDepartamentoNacimiento != null ? personaTCREARCONTRATANTEptpagrDepartamentoNacimiento.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getPersonaTCREARCONTRATANTEptpagrMunicipioNacimiento() {
        return this.personaTCREARCONTRATANTEptpagrMunicipioNacimiento;
    }
    
    public void setPersonaTCREARCONTRATANTEptpagrMunicipioNacimiento(MunicipioOid personaTCREARCONTRATANTEptpagrMunicipioNacimiento) {
        this.personaTCREARCONTRATANTEptpagrMunicipioNacimiento = personaTCREARCONTRATANTEptpagrMunicipioNacimiento;
    }

    @JsonIgnore
    public Municipio getPersonaTCREARCONTRATANTEptpagrMunicipioNacimientoInstance() {
        return this.personaTCREARCONTRATANTEptpagrMunicipioNacimientoInstance;
    }
    
    public void setPersonaTCREARCONTRATANTEptpagrMunicipioNacimientoInstance(Municipio personaTCREARCONTRATANTEptpagrMunicipioNacimiento) {
        this.personaTCREARCONTRATANTEptpagrMunicipioNacimientoInstance = personaTCREARCONTRATANTEptpagrMunicipioNacimiento;
        this.personaTCREARCONTRATANTEptpagrMunicipioNacimiento = personaTCREARCONTRATANTEptpagrMunicipioNacimiento != null ? personaTCREARCONTRATANTEptpagrMunicipioNacimiento.getOid() : null;
    }

    @JsonIgnore
    public EstadoCivilOid getPersonaTCREARCONTRATANTEptpagrEstadoCivil() {
        return this.personaTCREARCONTRATANTEptpagrEstadoCivil;
    }
    
    public void setPersonaTCREARCONTRATANTEptpagrEstadoCivil(EstadoCivilOid personaTCREARCONTRATANTEptpagrEstadoCivil) {
        this.personaTCREARCONTRATANTEptpagrEstadoCivil = personaTCREARCONTRATANTEptpagrEstadoCivil;
    }

    @JsonIgnore
    public EstadoCivil getPersonaTCREARCONTRATANTEptpagrEstadoCivilInstance() {
        return this.personaTCREARCONTRATANTEptpagrEstadoCivilInstance;
    }
    
    public void setPersonaTCREARCONTRATANTEptpagrEstadoCivilInstance(EstadoCivil personaTCREARCONTRATANTEptpagrEstadoCivil) {
        this.personaTCREARCONTRATANTEptpagrEstadoCivilInstance = personaTCREARCONTRATANTEptpagrEstadoCivil;
        this.personaTCREARCONTRATANTEptpagrEstadoCivil = personaTCREARCONTRATANTEptpagrEstadoCivil != null ? personaTCREARCONTRATANTEptpagrEstadoCivil.getOid() : null;
    }

    @JsonIgnore
    public String getPersonaTCREARCONTRATANTEptpatrNumIdentificacion() {
        return this.personaTCREARCONTRATANTEptpatrNumIdentificacion;
    }
    
    public void setPersonaTCREARCONTRATANTEptpatrNumIdentificacion(String personaTCREARCONTRATANTEptpatrNumIdentificacion) {
        this.personaTCREARCONTRATANTEptpatrNumIdentificacion = personaTCREARCONTRATANTEptpatrNumIdentificacion;
    }

    private void checkPersonaTCREARCONTRATANTEptpatrNumIdentificacion() throws NotNullArgumentException {
        if(this.getPersonaTCREARCONTRATANTEptpatrNumIdentificacion() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TCREARCONTRATANTE, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRNUMIDENTIFICACION, PersonaConstants.SERV_ALIAS_TCREARCONTRATANTE, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTPATRNUMIDENTIFICACION);
        }
    }

    @JsonIgnore
    public String getPersonaTCREARCONTRATANTEptpatrPrimerNombre() {
        return this.personaTCREARCONTRATANTEptpatrPrimerNombre;
    }
    
    public void setPersonaTCREARCONTRATANTEptpatrPrimerNombre(String personaTCREARCONTRATANTEptpatrPrimerNombre) {
        this.personaTCREARCONTRATANTEptpatrPrimerNombre = personaTCREARCONTRATANTEptpatrPrimerNombre;
    }

    @JsonIgnore
    public String getPersonaTCREARCONTRATANTEptpatrSegundoNombre() {
        return this.personaTCREARCONTRATANTEptpatrSegundoNombre;
    }
    
    public void setPersonaTCREARCONTRATANTEptpatrSegundoNombre(String personaTCREARCONTRATANTEptpatrSegundoNombre) {
        this.personaTCREARCONTRATANTEptpatrSegundoNombre = personaTCREARCONTRATANTEptpatrSegundoNombre;
    }

    @JsonIgnore
    public String getPersonaTCREARCONTRATANTEptpatrPrimerApellido() {
        return this.personaTCREARCONTRATANTEptpatrPrimerApellido;
    }
    
    public void setPersonaTCREARCONTRATANTEptpatrPrimerApellido(String personaTCREARCONTRATANTEptpatrPrimerApellido) {
        this.personaTCREARCONTRATANTEptpatrPrimerApellido = personaTCREARCONTRATANTEptpatrPrimerApellido;
    }

    @JsonIgnore
    public String getPersonaTCREARCONTRATANTEptpatrSegundoApellido() {
        return this.personaTCREARCONTRATANTEptpatrSegundoApellido;
    }
    
    public void setPersonaTCREARCONTRATANTEptpatrSegundoApellido(String personaTCREARCONTRATANTEptpatrSegundoApellido) {
        this.personaTCREARCONTRATANTEptpatrSegundoApellido = personaTCREARCONTRATANTEptpatrSegundoApellido;
    }

    @JsonIgnore
    public Date getPersonaTCREARCONTRATANTEptpatrFechaNacimiento() {
        return this.personaTCREARCONTRATANTEptpatrFechaNacimiento;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setPersonaTCREARCONTRATANTEptpatrFechaNacimiento(Date personaTCREARCONTRATANTEptpatrFechaNacimiento) {
        this.personaTCREARCONTRATANTEptpatrFechaNacimiento = personaTCREARCONTRATANTEptpatrFechaNacimiento;
    }

    @JsonIgnore
    public String getPersonaTCREARCONTRATANTEptpatrGenero() {
        return this.personaTCREARCONTRATANTEptpatrGenero;
    }
    
    public void setPersonaTCREARCONTRATANTEptpatrGenero(String personaTCREARCONTRATANTEptpatrGenero) {
        this.personaTCREARCONTRATANTEptpatrGenero = personaTCREARCONTRATANTEptpatrGenero;
    }

    @JsonIgnore
    public Boolean getPersonaTCREARCONTRATANTEptpatrIndicadorExtranjero() {
        return this.personaTCREARCONTRATANTEptpatrIndicadorExtranjero;
    }
    
    public void setPersonaTCREARCONTRATANTEptpatrIndicadorExtranjero(Boolean personaTCREARCONTRATANTEptpatrIndicadorExtranjero) {
        this.personaTCREARCONTRATANTEptpatrIndicadorExtranjero = personaTCREARCONTRATANTEptpatrIndicadorExtranjero;
    }

    @JsonIgnore
    public String getPersonaTCREARCONTRATANTEptpatrTelefonoFijo() {
        return this.personaTCREARCONTRATANTEptpatrTelefonoFijo;
    }
    
    public void setPersonaTCREARCONTRATANTEptpatrTelefonoFijo(String personaTCREARCONTRATANTEptpatrTelefonoFijo) {
        this.personaTCREARCONTRATANTEptpatrTelefonoFijo = personaTCREARCONTRATANTEptpatrTelefonoFijo;
    }

    @JsonIgnore
    public String getPersonaTCREARCONTRATANTEptpatrTelefonoCelular() {
        return this.personaTCREARCONTRATANTEptpatrTelefonoCelular;
    }
    
    public void setPersonaTCREARCONTRATANTEptpatrTelefonoCelular(String personaTCREARCONTRATANTEptpatrTelefonoCelular) {
        this.personaTCREARCONTRATANTEptpatrTelefonoCelular = personaTCREARCONTRATANTEptpatrTelefonoCelular;
    }

    @JsonIgnore
    public String getPersonaTCREARCONTRATANTEptpatrCorreoElectronico() {
        return this.personaTCREARCONTRATANTEptpatrCorreoElectronico;
    }
    
    public void setPersonaTCREARCONTRATANTEptpatrCorreoElectronico(String personaTCREARCONTRATANTEptpatrCorreoElectronico) {
        this.personaTCREARCONTRATANTEptpatrCorreoElectronico = personaTCREARCONTRATANTEptpatrCorreoElectronico;
    }

    @JsonIgnore
    public DepartamentoOid getPersonaTCREARCONTRATANTEptpagrDepartamento() {
        return this.personaTCREARCONTRATANTEptpagrDepartamento;
    }
    
    public void setPersonaTCREARCONTRATANTEptpagrDepartamento(DepartamentoOid personaTCREARCONTRATANTEptpagrDepartamento) {
        this.personaTCREARCONTRATANTEptpagrDepartamento = personaTCREARCONTRATANTEptpagrDepartamento;
    }

    @JsonIgnore
    public Departamento getPersonaTCREARCONTRATANTEptpagrDepartamentoInstance() {
        return this.personaTCREARCONTRATANTEptpagrDepartamentoInstance;
    }
    
    public void setPersonaTCREARCONTRATANTEptpagrDepartamentoInstance(Departamento personaTCREARCONTRATANTEptpagrDepartamento) {
        this.personaTCREARCONTRATANTEptpagrDepartamentoInstance = personaTCREARCONTRATANTEptpagrDepartamento;
        this.personaTCREARCONTRATANTEptpagrDepartamento = personaTCREARCONTRATANTEptpagrDepartamento != null ? personaTCREARCONTRATANTEptpagrDepartamento.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getPersonaTCREARCONTRATANTEptpagrMunicipio() {
        return this.personaTCREARCONTRATANTEptpagrMunicipio;
    }
    
    public void setPersonaTCREARCONTRATANTEptpagrMunicipio(MunicipioOid personaTCREARCONTRATANTEptpagrMunicipio) {
        this.personaTCREARCONTRATANTEptpagrMunicipio = personaTCREARCONTRATANTEptpagrMunicipio;
    }

    @JsonIgnore
    public Municipio getPersonaTCREARCONTRATANTEptpagrMunicipioInstance() {
        return this.personaTCREARCONTRATANTEptpagrMunicipioInstance;
    }
    
    public void setPersonaTCREARCONTRATANTEptpagrMunicipioInstance(Municipio personaTCREARCONTRATANTEptpagrMunicipio) {
        this.personaTCREARCONTRATANTEptpagrMunicipioInstance = personaTCREARCONTRATANTEptpagrMunicipio;
        this.personaTCREARCONTRATANTEptpagrMunicipio = personaTCREARCONTRATANTEptpagrMunicipio != null ? personaTCREARCONTRATANTEptpagrMunicipio.getOid() : null;
    }

    @JsonIgnore
    public String getPersonaTCREARCONTRATANTEptpatrDireccionCompleta() {
        return this.personaTCREARCONTRATANTEptpatrDireccionCompleta;
    }
    
    public void setPersonaTCREARCONTRATANTEptpatrDireccionCompleta(String personaTCREARCONTRATANTEptpatrDireccionCompleta) {
        this.personaTCREARCONTRATANTEptpatrDireccionCompleta = personaTCREARCONTRATANTEptpatrDireccionCompleta;
    }

    @JsonIgnore
    public Boolean getPersonaTCREARCONTRATANTEptpatrRural() {
        return this.personaTCREARCONTRATANTEptpatrRural;
    }
    
    public void setPersonaTCREARCONTRATANTEptpatrRural(Boolean personaTCREARCONTRATANTEptpatrRural) {
        this.personaTCREARCONTRATANTEptpatrRural = personaTCREARCONTRATANTEptpatrRural;
    }

    @JsonIgnore
    public TipoDireccionOid getPersonaTCREARCONTRATANTEptTipoDireccion() {
        return this.personaTCREARCONTRATANTEptTipoDireccion;
    }
    
    public void setPersonaTCREARCONTRATANTEptTipoDireccion(TipoDireccionOid personaTCREARCONTRATANTEptTipoDireccion) {
        this.personaTCREARCONTRATANTEptTipoDireccion = personaTCREARCONTRATANTEptTipoDireccion;
    }

    @JsonIgnore
    public TipoDireccion getPersonaTCREARCONTRATANTEptTipoDireccionInstance() {
        return this.personaTCREARCONTRATANTEptTipoDireccionInstance;
    }
    
    public void setPersonaTCREARCONTRATANTEptTipoDireccionInstance(TipoDireccion personaTCREARCONTRATANTEptTipoDireccion) {
        this.personaTCREARCONTRATANTEptTipoDireccionInstance = personaTCREARCONTRATANTEptTipoDireccion;
        this.personaTCREARCONTRATANTEptTipoDireccion = personaTCREARCONTRATANTEptTipoDireccion != null ? personaTCREARCONTRATANTEptTipoDireccion.getOid() : null;
    }

    @JsonIgnore
    public String getPersonaTCREARCONTRATANTEptpatrRazonSocial() {
        return this.personaTCREARCONTRATANTEptpatrRazonSocial;
    }
    
    public void setPersonaTCREARCONTRATANTEptpatrRazonSocial(String personaTCREARCONTRATANTEptpatrRazonSocial) {
        this.personaTCREARCONTRATANTEptpatrRazonSocial = personaTCREARCONTRATANTEptpatrRazonSocial;
    }

    @JsonIgnore
    public PaisOid getPersonaTCREARCONTRATANTEptpagrPais() {
        return this.personaTCREARCONTRATANTEptpagrPais;
    }
    
    public void setPersonaTCREARCONTRATANTEptpagrPais(PaisOid personaTCREARCONTRATANTEptpagrPais) {
        this.personaTCREARCONTRATANTEptpagrPais = personaTCREARCONTRATANTEptpagrPais;
    }

    @JsonIgnore
    public Pais getPersonaTCREARCONTRATANTEptpagrPaisInstance() {
        return this.personaTCREARCONTRATANTEptpagrPaisInstance;
    }
    
    public void setPersonaTCREARCONTRATANTEptpagrPaisInstance(Pais personaTCREARCONTRATANTEptpagrPais) {
        this.personaTCREARCONTRATANTEptpagrPaisInstance = personaTCREARCONTRATANTEptpagrPais;
        this.personaTCREARCONTRATANTEptpagrPais = personaTCREARCONTRATANTEptpagrPais != null ? personaTCREARCONTRATANTEptpagrPais.getOid() : null;
    }

    @JsonIgnore
    public Long getPersonaTCREARCONTRATANTEptpCodigo() {
        return this.personaTCREARCONTRATANTEptpCodigo;
    }
    
    public void setPersonaTCREARCONTRATANTEptpCodigo(Long personaTCREARCONTRATANTEptpCodigo) {
        this.personaTCREARCONTRATANTEptpCodigo = personaTCREARCONTRATANTEptpCodigo;
    }

    @JsonIgnore
    public Boolean getPersonaTCREARCONTRATANTEptpTieneEPSSanitas() {
        return this.personaTCREARCONTRATANTEptpTieneEPSSanitas;
    }
    
    public void setPersonaTCREARCONTRATANTEptpTieneEPSSanitas(Boolean personaTCREARCONTRATANTEptpTieneEPSSanitas) {
        this.personaTCREARCONTRATANTEptpTieneEPSSanitas = personaTCREARCONTRATANTEptpTieneEPSSanitas;
    }

    @JsonIgnore
    public String getPersonaTCREARCONTRATANTEptpRechazadoAfiliacion() {
        return this.personaTCREARCONTRATANTEptpRechazadoAfiliacion;
    }
    
    public void setPersonaTCREARCONTRATANTEptpRechazadoAfiliacion(String personaTCREARCONTRATANTEptpRechazadoAfiliacion) {
        this.personaTCREARCONTRATANTEptpRechazadoAfiliacion = personaTCREARCONTRATANTEptpRechazadoAfiliacion;
    }

    @JsonIgnore
    public String getPersonaTCREARCONTRATANTEpDCDireccionCompleta() {
        return this.personaTCREARCONTRATANTEpDCDireccionCompleta;
    }
    
    public void setPersonaTCREARCONTRATANTEpDCDireccionCompleta(String personaTCREARCONTRATANTEpDCDireccionCompleta) {
        this.personaTCREARCONTRATANTEpDCDireccionCompleta = personaTCREARCONTRATANTEpDCDireccionCompleta;
    }

    @JsonIgnore
    public DepartamentoOid getPersonaTCREARCONTRATANTEpDCDepartamento() {
        return this.personaTCREARCONTRATANTEpDCDepartamento;
    }
    
    public void setPersonaTCREARCONTRATANTEpDCDepartamento(DepartamentoOid personaTCREARCONTRATANTEpDCDepartamento) {
        this.personaTCREARCONTRATANTEpDCDepartamento = personaTCREARCONTRATANTEpDCDepartamento;
    }

    @JsonIgnore
    public Departamento getPersonaTCREARCONTRATANTEpDCDepartamentoInstance() {
        return this.personaTCREARCONTRATANTEpDCDepartamentoInstance;
    }
    
    public void setPersonaTCREARCONTRATANTEpDCDepartamentoInstance(Departamento personaTCREARCONTRATANTEpDCDepartamento) {
        this.personaTCREARCONTRATANTEpDCDepartamentoInstance = personaTCREARCONTRATANTEpDCDepartamento;
        this.personaTCREARCONTRATANTEpDCDepartamento = personaTCREARCONTRATANTEpDCDepartamento != null ? personaTCREARCONTRATANTEpDCDepartamento.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getPersonaTCREARCONTRATANTEpDCMunicipio() {
        return this.personaTCREARCONTRATANTEpDCMunicipio;
    }
    
    public void setPersonaTCREARCONTRATANTEpDCMunicipio(MunicipioOid personaTCREARCONTRATANTEpDCMunicipio) {
        this.personaTCREARCONTRATANTEpDCMunicipio = personaTCREARCONTRATANTEpDCMunicipio;
    }

    @JsonIgnore
    public Municipio getPersonaTCREARCONTRATANTEpDCMunicipioInstance() {
        return this.personaTCREARCONTRATANTEpDCMunicipioInstance;
    }
    
    public void setPersonaTCREARCONTRATANTEpDCMunicipioInstance(Municipio personaTCREARCONTRATANTEpDCMunicipio) {
        this.personaTCREARCONTRATANTEpDCMunicipioInstance = personaTCREARCONTRATANTEpDCMunicipio;
        this.personaTCREARCONTRATANTEpDCMunicipio = personaTCREARCONTRATANTEpDCMunicipio != null ? personaTCREARCONTRATANTEpDCMunicipio.getOid() : null;
    }

    @JsonIgnore
    public Boolean getPersonaTCREARCONTRATANTEpDCRural() {
        return this.personaTCREARCONTRATANTEpDCRural;
    }
    
    public void setPersonaTCREARCONTRATANTEpDCRural(Boolean personaTCREARCONTRATANTEpDCRural) {
        this.personaTCREARCONTRATANTEpDCRural = personaTCREARCONTRATANTEpDCRural;
    }

    @JsonIgnore
    public String getPersonaTCREARCONTRATANTEpDCTelefonoFijo() {
        return this.personaTCREARCONTRATANTEpDCTelefonoFijo;
    }
    
    public void setPersonaTCREARCONTRATANTEpDCTelefonoFijo(String personaTCREARCONTRATANTEpDCTelefonoFijo) {
        this.personaTCREARCONTRATANTEpDCTelefonoFijo = personaTCREARCONTRATANTEpDCTelefonoFijo;
    }

    @JsonIgnore
    public String getPersonaTCREARCONTRATANTEpDCTelefonoCelular() {
        return this.personaTCREARCONTRATANTEpDCTelefonoCelular;
    }
    
    public void setPersonaTCREARCONTRATANTEpDCTelefonoCelular(String personaTCREARCONTRATANTEpDCTelefonoCelular) {
        this.personaTCREARCONTRATANTEpDCTelefonoCelular = personaTCREARCONTRATANTEpDCTelefonoCelular;
    }

    @JsonIgnore
    public TipoDireccionOid getPersonaTCREARCONTRATANTEpDCTipoDireccion() {
        return this.personaTCREARCONTRATANTEpDCTipoDireccion;
    }
    
    public void setPersonaTCREARCONTRATANTEpDCTipoDireccion(TipoDireccionOid personaTCREARCONTRATANTEpDCTipoDireccion) {
        this.personaTCREARCONTRATANTEpDCTipoDireccion = personaTCREARCONTRATANTEpDCTipoDireccion;
    }

    @JsonIgnore
    public TipoDireccion getPersonaTCREARCONTRATANTEpDCTipoDireccionInstance() {
        return this.personaTCREARCONTRATANTEpDCTipoDireccionInstance;
    }
    
    public void setPersonaTCREARCONTRATANTEpDCTipoDireccionInstance(TipoDireccion personaTCREARCONTRATANTEpDCTipoDireccion) {
        this.personaTCREARCONTRATANTEpDCTipoDireccionInstance = personaTCREARCONTRATANTEpDCTipoDireccion;
        this.personaTCREARCONTRATANTEpDCTipoDireccion = personaTCREARCONTRATANTEpDCTipoDireccion != null ? personaTCREARCONTRATANTEpDCTipoDireccion.getOid() : null;
    }

    @JsonIgnore
    public PaisOid getPersonaTCREARCONTRATANTEpDCPais() {
        return this.personaTCREARCONTRATANTEpDCPais;
    }
    
    public void setPersonaTCREARCONTRATANTEpDCPais(PaisOid personaTCREARCONTRATANTEpDCPais) {
        this.personaTCREARCONTRATANTEpDCPais = personaTCREARCONTRATANTEpDCPais;
    }

    @JsonIgnore
    public Pais getPersonaTCREARCONTRATANTEpDCPaisInstance() {
        return this.personaTCREARCONTRATANTEpDCPaisInstance;
    }
    
    public void setPersonaTCREARCONTRATANTEpDCPaisInstance(Pais personaTCREARCONTRATANTEpDCPais) {
        this.personaTCREARCONTRATANTEpDCPaisInstance = personaTCREARCONTRATANTEpDCPais;
        this.personaTCREARCONTRATANTEpDCPais = personaTCREARCONTRATANTEpDCPais != null ? personaTCREARCONTRATANTEpDCPais.getOid() : null;
    }

    @JsonIgnore
    public EstadoPersonaOid getPersonaTCREARCONTRATANTEptEstadoPersona() {
        return this.personaTCREARCONTRATANTEptEstadoPersona;
    }
    
    public void setPersonaTCREARCONTRATANTEptEstadoPersona(EstadoPersonaOid personaTCREARCONTRATANTEptEstadoPersona) {
        this.personaTCREARCONTRATANTEptEstadoPersona = personaTCREARCONTRATANTEptEstadoPersona;
    }

    @JsonIgnore
    public EstadoPersona getPersonaTCREARCONTRATANTEptEstadoPersonaInstance() {
        return this.personaTCREARCONTRATANTEptEstadoPersonaInstance;
    }
    
    public void setPersonaTCREARCONTRATANTEptEstadoPersonaInstance(EstadoPersona personaTCREARCONTRATANTEptEstadoPersona) {
        this.personaTCREARCONTRATANTEptEstadoPersonaInstance = personaTCREARCONTRATANTEptEstadoPersona;
        this.personaTCREARCONTRATANTEptEstadoPersona = personaTCREARCONTRATANTEptEstadoPersona != null ? personaTCREARCONTRATANTEptEstadoPersona.getOid() : null;
    }

    @JsonIgnore
    public Boolean getPersonaTCREARCONTRATANTEptValidarDatos() {
        return this.personaTCREARCONTRATANTEptValidarDatos;
    }
    
    public void setPersonaTCREARCONTRATANTEptValidarDatos(Boolean personaTCREARCONTRATANTEptValidarDatos) {
        this.personaTCREARCONTRATANTEptValidarDatos = personaTCREARCONTRATANTEptValidarDatos;
    }

    private void checkPersonaTCREARCONTRATANTEptValidarDatos() throws NotNullArgumentException {
        if(this.getPersonaTCREARCONTRATANTEptValidarDatos() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TCREARCONTRATANTE, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTVALIDARDATOS, PersonaConstants.SERV_ALIAS_TCREARCONTRATANTE, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTVALIDARDATOS);
        }
    }

    @JsonIgnore
    public SolicitudOid getPersonaTCREARCONTRATANTEptSolicitud() {
        return this.personaTCREARCONTRATANTEptSolicitud;
    }
    
    public void setPersonaTCREARCONTRATANTEptSolicitud(SolicitudOid personaTCREARCONTRATANTEptSolicitud) {
        this.personaTCREARCONTRATANTEptSolicitud = personaTCREARCONTRATANTEptSolicitud;
    }

    @JsonIgnore
    public Solicitud getPersonaTCREARCONTRATANTEptSolicitudInstance() {
        return this.personaTCREARCONTRATANTEptSolicitudInstance;
    }
    
    public void setPersonaTCREARCONTRATANTEptSolicitudInstance(Solicitud personaTCREARCONTRATANTEptSolicitud) {
        this.personaTCREARCONTRATANTEptSolicitudInstance = personaTCREARCONTRATANTEptSolicitud;
        this.personaTCREARCONTRATANTEptSolicitud = personaTCREARCONTRATANTEptSolicitud != null ? personaTCREARCONTRATANTEptSolicitud.getOid() : null;
    }

    private void checkPersonaTCREARCONTRATANTEptSolicitud() throws NotNullArgumentException {
        if(this.getPersonaTCREARCONTRATANTEptSolicitudInstance() == null || this.getPersonaTCREARCONTRATANTEptSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TCREARCONTRATANTE, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTSOLICITUD, PersonaConstants.SERV_ALIAS_TCREARCONTRATANTE, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TCREARCONTRATANTE_PERSONATCREARCONTRATANTEPTSOLICITUD);
        }
    }
}
