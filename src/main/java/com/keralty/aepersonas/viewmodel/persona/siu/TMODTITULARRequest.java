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
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.oid.TipoDireccionOid;
import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.persistence.Pais;
import com.keralty.aepersonas.persistence.Persona;
import com.keralty.aepersonas.persistence.TipoDireccion;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneDeserializer;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneSerializer;
import java.sql.Date;

public class TMODTITULARRequest {

    @JsonProperty("p_thispersona_oid")
    private PersonaOid personaTMODTITULARpthisPersona;
    
    @JsonIgnore
    private Persona personaTMODTITULARpthisPersonaInstance;

    @JsonProperty("pt_p_primernombre")
    private String personaTMODTITULARptpPrimerNombre;

    @JsonProperty("pt_p_segundonombre")
    private String personaTMODTITULARptpSegundoNombre;

    @JsonProperty("pt_p_primerapellido")
    private String personaTMODTITULARptpPrimerApellido;

    @JsonProperty("pt_p_segundoapellido")
    private String personaTMODTITULARptpSegundoApellido;

    @JsonProperty("pt_p_fechanacimiento")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date personaTMODTITULARptpFechaNacimiento;

    @JsonProperty("pt_p_genero")
    private String personaTMODTITULARptpGenero;

    @JsonProperty("pt_p_indicadorextranjero")
    private Boolean personaTMODTITULARptpIndicadorExtranjero;

    @JsonProperty("pt_p_telefonofijo")
    private String personaTMODTITULARptpTelefonoFijo;

    @JsonProperty("pt_p_telefonocelular")
    private String personaTMODTITULARptpTelefonoCelular;

    @JsonProperty("pt_p_correoelectronico")
    private String personaTMODTITULARptpCorreoElectronico;

    @JsonProperty("pt_p_evcdepartamentonac_oid")
    private DepartamentoOid personaTMODTITULARptpevcDepartamentoNac;
    
    @JsonIgnore
    private Departamento personaTMODTITULARptpevcDepartamentoNacInstance;

    @JsonProperty("pt_p_evcmunicipionac_oid")
    private MunicipioOid personaTMODTITULARptpevcMunicipioNac;
    
    @JsonIgnore
    private Municipio personaTMODTITULARptpevcMunicipioNacInstance;

    @JsonProperty("pt_p_evcestadocivil_oid")
    private EstadoCivilOid personaTMODTITULARptpevcEstadoCivil;
    
    @JsonIgnore
    private EstadoCivil personaTMODTITULARptpevcEstadoCivilInstance;

    @JsonProperty("pt_p_direccioncompleta")
    private String personaTMODTITULARptpDireccionCompleta;

    @JsonProperty("pt_p_rural")
    private Boolean personaTMODTITULARptpRural;

    @JsonProperty("pt_p_evctipodireccion_oid")
    private TipoDireccionOid personaTMODTITULARptpevcTipoDireccion;
    
    @JsonIgnore
    private TipoDireccion personaTMODTITULARptpevcTipoDireccionInstance;

    @JsonProperty("pt_p_evcdepartamento_oid")
    private DepartamentoOid personaTMODTITULARptpevcDepartamento;
    
    @JsonIgnore
    private Departamento personaTMODTITULARptpevcDepartamentoInstance;

    @JsonProperty("pt_p_evcmunicipio_oid")
    private MunicipioOid personaTMODTITULARptpevcMunicipio;
    
    @JsonIgnore
    private Municipio personaTMODTITULARptpevcMunicipioInstance;

    @JsonProperty("pt_p_numidentificacion")
    private String personaTMODTITULARptpNumIdentificacion;

    @JsonProperty("pt_p_evctipoidentificacion_oid")
    private TipoIdentificacionOid personaTMODTITULARptpevcTipoIdentificacion;
    
    @JsonIgnore
    private TipoIdentificacion personaTMODTITULARptpevcTipoIdentificacionInstance;

    @JsonProperty("pttitularrecuperadoincl")
    private Boolean personaTMODTITULARptTitularRecuperadoIncl;

    @JsonProperty("pt_p_codigo")
    private Long personaTMODTITULARptpCodigo;

    @JsonProperty("ptvalidardatos")
    private Boolean personaTMODTITULARptValidarDatos;

    @JsonProperty("ptrazonsocial")
    private String personaTMODTITULARptRazonSocial;

    @JsonProperty("ptestadopersona_oid")
    private EstadoPersonaOid personaTMODTITULARptEstadoPersona;
    
    @JsonIgnore
    private EstadoPersona personaTMODTITULARptEstadoPersonaInstance;

    @JsonProperty("pt_p_agrpais_oid")
    private PaisOid personaTMODTITULARptpagrPais;
    
    @JsonIgnore
    private Pais personaTMODTITULARptpagrPaisInstance;

    @JsonProperty("pt_p_tieneepssanitas")
    private Boolean personaTMODTITULARptpTieneEPSSanitas;

    @JsonProperty("pt_p_rechazadoafiliacion")
    private String personaTMODTITULARptpRechazadoAfiliacion;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonaTMODTITULARpthisPersona();
        checkPersonaTMODTITULARptpNumIdentificacion();
        checkPersonaTMODTITULARptpevcTipoIdentificacion();
        checkPersonaTMODTITULARptTitularRecuperadoIncl();
        checkPersonaTMODTITULARptValidarDatos();
    }

    @JsonIgnore
    public PersonaOid getPersonaTMODTITULARpthisPersona() {
        return this.personaTMODTITULARpthisPersona;
    }
    
    public void setPersonaTMODTITULARpthisPersona(PersonaOid personaTMODTITULARpthisPersona) {
        this.personaTMODTITULARpthisPersona = personaTMODTITULARpthisPersona;
    }

    @JsonIgnore
    public Persona getPersonaTMODTITULARpthisPersonaInstance() {
        return this.personaTMODTITULARpthisPersonaInstance;
    }
    
    public void setPersonaTMODTITULARpthisPersonaInstance(Persona personaTMODTITULARpthisPersona) {
        this.personaTMODTITULARpthisPersonaInstance = personaTMODTITULARpthisPersona;
        this.personaTMODTITULARpthisPersona = personaTMODTITULARpthisPersona != null ? personaTMODTITULARpthisPersona.getOid() : null;
    }

    private void checkPersonaTMODTITULARpthisPersona() throws NotNullArgumentException {
        if(this.getPersonaTMODTITULARpthisPersonaInstance() == null || this.getPersonaTMODTITULARpthisPersonaInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TMODTITULAR, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TMODTITULAR_PERSONATMODTITULARPTHISPERSONA, PersonaConstants.SERV_ALIAS_TMODTITULAR, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TMODTITULAR_PERSONATMODTITULARPTHISPERSONA);
        }
    }

    @JsonIgnore
    public String getPersonaTMODTITULARptpPrimerNombre() {
        return this.personaTMODTITULARptpPrimerNombre;
    }
    
    public void setPersonaTMODTITULARptpPrimerNombre(String personaTMODTITULARptpPrimerNombre) {
        this.personaTMODTITULARptpPrimerNombre = personaTMODTITULARptpPrimerNombre;
    }

    @JsonIgnore
    public String getPersonaTMODTITULARptpSegundoNombre() {
        return this.personaTMODTITULARptpSegundoNombre;
    }
    
    public void setPersonaTMODTITULARptpSegundoNombre(String personaTMODTITULARptpSegundoNombre) {
        this.personaTMODTITULARptpSegundoNombre = personaTMODTITULARptpSegundoNombre;
    }

    @JsonIgnore
    public String getPersonaTMODTITULARptpPrimerApellido() {
        return this.personaTMODTITULARptpPrimerApellido;
    }
    
    public void setPersonaTMODTITULARptpPrimerApellido(String personaTMODTITULARptpPrimerApellido) {
        this.personaTMODTITULARptpPrimerApellido = personaTMODTITULARptpPrimerApellido;
    }

    @JsonIgnore
    public String getPersonaTMODTITULARptpSegundoApellido() {
        return this.personaTMODTITULARptpSegundoApellido;
    }
    
    public void setPersonaTMODTITULARptpSegundoApellido(String personaTMODTITULARptpSegundoApellido) {
        this.personaTMODTITULARptpSegundoApellido = personaTMODTITULARptpSegundoApellido;
    }

    @JsonIgnore
    public Date getPersonaTMODTITULARptpFechaNacimiento() {
        return this.personaTMODTITULARptpFechaNacimiento;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setPersonaTMODTITULARptpFechaNacimiento(Date personaTMODTITULARptpFechaNacimiento) {
        this.personaTMODTITULARptpFechaNacimiento = personaTMODTITULARptpFechaNacimiento;
    }

    @JsonIgnore
    public String getPersonaTMODTITULARptpGenero() {
        return this.personaTMODTITULARptpGenero;
    }
    
    public void setPersonaTMODTITULARptpGenero(String personaTMODTITULARptpGenero) {
        this.personaTMODTITULARptpGenero = personaTMODTITULARptpGenero;
    }

    @JsonIgnore
    public Boolean getPersonaTMODTITULARptpIndicadorExtranjero() {
        return this.personaTMODTITULARptpIndicadorExtranjero;
    }
    
    public void setPersonaTMODTITULARptpIndicadorExtranjero(Boolean personaTMODTITULARptpIndicadorExtranjero) {
        this.personaTMODTITULARptpIndicadorExtranjero = personaTMODTITULARptpIndicadorExtranjero;
    }

    @JsonIgnore
    public String getPersonaTMODTITULARptpTelefonoFijo() {
        return this.personaTMODTITULARptpTelefonoFijo;
    }
    
    public void setPersonaTMODTITULARptpTelefonoFijo(String personaTMODTITULARptpTelefonoFijo) {
        this.personaTMODTITULARptpTelefonoFijo = personaTMODTITULARptpTelefonoFijo;
    }

    @JsonIgnore
    public String getPersonaTMODTITULARptpTelefonoCelular() {
        return this.personaTMODTITULARptpTelefonoCelular;
    }
    
    public void setPersonaTMODTITULARptpTelefonoCelular(String personaTMODTITULARptpTelefonoCelular) {
        this.personaTMODTITULARptpTelefonoCelular = personaTMODTITULARptpTelefonoCelular;
    }

    @JsonIgnore
    public String getPersonaTMODTITULARptpCorreoElectronico() {
        return this.personaTMODTITULARptpCorreoElectronico;
    }
    
    public void setPersonaTMODTITULARptpCorreoElectronico(String personaTMODTITULARptpCorreoElectronico) {
        this.personaTMODTITULARptpCorreoElectronico = personaTMODTITULARptpCorreoElectronico;
    }

    @JsonIgnore
    public DepartamentoOid getPersonaTMODTITULARptpevcDepartamentoNac() {
        return this.personaTMODTITULARptpevcDepartamentoNac;
    }
    
    public void setPersonaTMODTITULARptpevcDepartamentoNac(DepartamentoOid personaTMODTITULARptpevcDepartamentoNac) {
        this.personaTMODTITULARptpevcDepartamentoNac = personaTMODTITULARptpevcDepartamentoNac;
    }

    @JsonIgnore
    public Departamento getPersonaTMODTITULARptpevcDepartamentoNacInstance() {
        return this.personaTMODTITULARptpevcDepartamentoNacInstance;
    }
    
    public void setPersonaTMODTITULARptpevcDepartamentoNacInstance(Departamento personaTMODTITULARptpevcDepartamentoNac) {
        this.personaTMODTITULARptpevcDepartamentoNacInstance = personaTMODTITULARptpevcDepartamentoNac;
        this.personaTMODTITULARptpevcDepartamentoNac = personaTMODTITULARptpevcDepartamentoNac != null ? personaTMODTITULARptpevcDepartamentoNac.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getPersonaTMODTITULARptpevcMunicipioNac() {
        return this.personaTMODTITULARptpevcMunicipioNac;
    }
    
    public void setPersonaTMODTITULARptpevcMunicipioNac(MunicipioOid personaTMODTITULARptpevcMunicipioNac) {
        this.personaTMODTITULARptpevcMunicipioNac = personaTMODTITULARptpevcMunicipioNac;
    }

    @JsonIgnore
    public Municipio getPersonaTMODTITULARptpevcMunicipioNacInstance() {
        return this.personaTMODTITULARptpevcMunicipioNacInstance;
    }
    
    public void setPersonaTMODTITULARptpevcMunicipioNacInstance(Municipio personaTMODTITULARptpevcMunicipioNac) {
        this.personaTMODTITULARptpevcMunicipioNacInstance = personaTMODTITULARptpevcMunicipioNac;
        this.personaTMODTITULARptpevcMunicipioNac = personaTMODTITULARptpevcMunicipioNac != null ? personaTMODTITULARptpevcMunicipioNac.getOid() : null;
    }

    @JsonIgnore
    public EstadoCivilOid getPersonaTMODTITULARptpevcEstadoCivil() {
        return this.personaTMODTITULARptpevcEstadoCivil;
    }
    
    public void setPersonaTMODTITULARptpevcEstadoCivil(EstadoCivilOid personaTMODTITULARptpevcEstadoCivil) {
        this.personaTMODTITULARptpevcEstadoCivil = personaTMODTITULARptpevcEstadoCivil;
    }

    @JsonIgnore
    public EstadoCivil getPersonaTMODTITULARptpevcEstadoCivilInstance() {
        return this.personaTMODTITULARptpevcEstadoCivilInstance;
    }
    
    public void setPersonaTMODTITULARptpevcEstadoCivilInstance(EstadoCivil personaTMODTITULARptpevcEstadoCivil) {
        this.personaTMODTITULARptpevcEstadoCivilInstance = personaTMODTITULARptpevcEstadoCivil;
        this.personaTMODTITULARptpevcEstadoCivil = personaTMODTITULARptpevcEstadoCivil != null ? personaTMODTITULARptpevcEstadoCivil.getOid() : null;
    }

    @JsonIgnore
    public String getPersonaTMODTITULARptpDireccionCompleta() {
        return this.personaTMODTITULARptpDireccionCompleta;
    }
    
    public void setPersonaTMODTITULARptpDireccionCompleta(String personaTMODTITULARptpDireccionCompleta) {
        this.personaTMODTITULARptpDireccionCompleta = personaTMODTITULARptpDireccionCompleta;
    }

    @JsonIgnore
    public Boolean getPersonaTMODTITULARptpRural() {
        return this.personaTMODTITULARptpRural;
    }
    
    public void setPersonaTMODTITULARptpRural(Boolean personaTMODTITULARptpRural) {
        this.personaTMODTITULARptpRural = personaTMODTITULARptpRural;
    }

    @JsonIgnore
    public TipoDireccionOid getPersonaTMODTITULARptpevcTipoDireccion() {
        return this.personaTMODTITULARptpevcTipoDireccion;
    }
    
    public void setPersonaTMODTITULARptpevcTipoDireccion(TipoDireccionOid personaTMODTITULARptpevcTipoDireccion) {
        this.personaTMODTITULARptpevcTipoDireccion = personaTMODTITULARptpevcTipoDireccion;
    }

    @JsonIgnore
    public TipoDireccion getPersonaTMODTITULARptpevcTipoDireccionInstance() {
        return this.personaTMODTITULARptpevcTipoDireccionInstance;
    }
    
    public void setPersonaTMODTITULARptpevcTipoDireccionInstance(TipoDireccion personaTMODTITULARptpevcTipoDireccion) {
        this.personaTMODTITULARptpevcTipoDireccionInstance = personaTMODTITULARptpevcTipoDireccion;
        this.personaTMODTITULARptpevcTipoDireccion = personaTMODTITULARptpevcTipoDireccion != null ? personaTMODTITULARptpevcTipoDireccion.getOid() : null;
    }

    @JsonIgnore
    public DepartamentoOid getPersonaTMODTITULARptpevcDepartamento() {
        return this.personaTMODTITULARptpevcDepartamento;
    }
    
    public void setPersonaTMODTITULARptpevcDepartamento(DepartamentoOid personaTMODTITULARptpevcDepartamento) {
        this.personaTMODTITULARptpevcDepartamento = personaTMODTITULARptpevcDepartamento;
    }

    @JsonIgnore
    public Departamento getPersonaTMODTITULARptpevcDepartamentoInstance() {
        return this.personaTMODTITULARptpevcDepartamentoInstance;
    }
    
    public void setPersonaTMODTITULARptpevcDepartamentoInstance(Departamento personaTMODTITULARptpevcDepartamento) {
        this.personaTMODTITULARptpevcDepartamentoInstance = personaTMODTITULARptpevcDepartamento;
        this.personaTMODTITULARptpevcDepartamento = personaTMODTITULARptpevcDepartamento != null ? personaTMODTITULARptpevcDepartamento.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getPersonaTMODTITULARptpevcMunicipio() {
        return this.personaTMODTITULARptpevcMunicipio;
    }
    
    public void setPersonaTMODTITULARptpevcMunicipio(MunicipioOid personaTMODTITULARptpevcMunicipio) {
        this.personaTMODTITULARptpevcMunicipio = personaTMODTITULARptpevcMunicipio;
    }

    @JsonIgnore
    public Municipio getPersonaTMODTITULARptpevcMunicipioInstance() {
        return this.personaTMODTITULARptpevcMunicipioInstance;
    }
    
    public void setPersonaTMODTITULARptpevcMunicipioInstance(Municipio personaTMODTITULARptpevcMunicipio) {
        this.personaTMODTITULARptpevcMunicipioInstance = personaTMODTITULARptpevcMunicipio;
        this.personaTMODTITULARptpevcMunicipio = personaTMODTITULARptpevcMunicipio != null ? personaTMODTITULARptpevcMunicipio.getOid() : null;
    }

    @JsonIgnore
    public String getPersonaTMODTITULARptpNumIdentificacion() {
        return this.personaTMODTITULARptpNumIdentificacion;
    }
    
    public void setPersonaTMODTITULARptpNumIdentificacion(String personaTMODTITULARptpNumIdentificacion) {
        this.personaTMODTITULARptpNumIdentificacion = personaTMODTITULARptpNumIdentificacion;
    }

    private void checkPersonaTMODTITULARptpNumIdentificacion() throws NotNullArgumentException {
        if(this.getPersonaTMODTITULARptpNumIdentificacion() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TMODTITULAR, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TMODTITULAR_PERSONATMODTITULARPTPNUMIDENTIFICACION, PersonaConstants.SERV_ALIAS_TMODTITULAR, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TMODTITULAR_PERSONATMODTITULARPTPNUMIDENTIFICACION);
        }
    }

    @JsonIgnore
    public TipoIdentificacionOid getPersonaTMODTITULARptpevcTipoIdentificacion() {
        return this.personaTMODTITULARptpevcTipoIdentificacion;
    }
    
    public void setPersonaTMODTITULARptpevcTipoIdentificacion(TipoIdentificacionOid personaTMODTITULARptpevcTipoIdentificacion) {
        this.personaTMODTITULARptpevcTipoIdentificacion = personaTMODTITULARptpevcTipoIdentificacion;
    }

    @JsonIgnore
    public TipoIdentificacion getPersonaTMODTITULARptpevcTipoIdentificacionInstance() {
        return this.personaTMODTITULARptpevcTipoIdentificacionInstance;
    }
    
    public void setPersonaTMODTITULARptpevcTipoIdentificacionInstance(TipoIdentificacion personaTMODTITULARptpevcTipoIdentificacion) {
        this.personaTMODTITULARptpevcTipoIdentificacionInstance = personaTMODTITULARptpevcTipoIdentificacion;
        this.personaTMODTITULARptpevcTipoIdentificacion = personaTMODTITULARptpevcTipoIdentificacion != null ? personaTMODTITULARptpevcTipoIdentificacion.getOid() : null;
    }

    private void checkPersonaTMODTITULARptpevcTipoIdentificacion() throws NotNullArgumentException {
        if(this.getPersonaTMODTITULARptpevcTipoIdentificacionInstance() == null || this.getPersonaTMODTITULARptpevcTipoIdentificacionInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TMODTITULAR, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TMODTITULAR_PERSONATMODTITULARPTPEVCTIPOIDENTIFICACION, PersonaConstants.SERV_ALIAS_TMODTITULAR, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TMODTITULAR_PERSONATMODTITULARPTPEVCTIPOIDENTIFICACION);
        }
    }

    @JsonIgnore
    public Boolean getPersonaTMODTITULARptTitularRecuperadoIncl() {
        return this.personaTMODTITULARptTitularRecuperadoIncl;
    }
    
    public void setPersonaTMODTITULARptTitularRecuperadoIncl(Boolean personaTMODTITULARptTitularRecuperadoIncl) {
        this.personaTMODTITULARptTitularRecuperadoIncl = personaTMODTITULARptTitularRecuperadoIncl;
    }

    private void checkPersonaTMODTITULARptTitularRecuperadoIncl() throws NotNullArgumentException {
        if(this.getPersonaTMODTITULARptTitularRecuperadoIncl() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TMODTITULAR, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TMODTITULAR_PERSONATMODTITULARPTTITULARRECUPERADOINCL, PersonaConstants.SERV_ALIAS_TMODTITULAR, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TMODTITULAR_PERSONATMODTITULARPTTITULARRECUPERADOINCL);
        }
    }

    @JsonIgnore
    public Long getPersonaTMODTITULARptpCodigo() {
        return this.personaTMODTITULARptpCodigo;
    }
    
    public void setPersonaTMODTITULARptpCodigo(Long personaTMODTITULARptpCodigo) {
        this.personaTMODTITULARptpCodigo = personaTMODTITULARptpCodigo;
    }

    @JsonIgnore
    public Boolean getPersonaTMODTITULARptValidarDatos() {
        return this.personaTMODTITULARptValidarDatos;
    }
    
    public void setPersonaTMODTITULARptValidarDatos(Boolean personaTMODTITULARptValidarDatos) {
        this.personaTMODTITULARptValidarDatos = personaTMODTITULARptValidarDatos;
    }

    private void checkPersonaTMODTITULARptValidarDatos() throws NotNullArgumentException {
        if(this.getPersonaTMODTITULARptValidarDatos() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TMODTITULAR, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TMODTITULAR_PERSONATMODTITULARPTVALIDARDATOS, PersonaConstants.SERV_ALIAS_TMODTITULAR, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TMODTITULAR_PERSONATMODTITULARPTVALIDARDATOS);
        }
    }

    @JsonIgnore
    public String getPersonaTMODTITULARptRazonSocial() {
        return this.personaTMODTITULARptRazonSocial;
    }
    
    public void setPersonaTMODTITULARptRazonSocial(String personaTMODTITULARptRazonSocial) {
        this.personaTMODTITULARptRazonSocial = personaTMODTITULARptRazonSocial;
    }

    @JsonIgnore
    public EstadoPersonaOid getPersonaTMODTITULARptEstadoPersona() {
        return this.personaTMODTITULARptEstadoPersona;
    }
    
    public void setPersonaTMODTITULARptEstadoPersona(EstadoPersonaOid personaTMODTITULARptEstadoPersona) {
        this.personaTMODTITULARptEstadoPersona = personaTMODTITULARptEstadoPersona;
    }

    @JsonIgnore
    public EstadoPersona getPersonaTMODTITULARptEstadoPersonaInstance() {
        return this.personaTMODTITULARptEstadoPersonaInstance;
    }
    
    public void setPersonaTMODTITULARptEstadoPersonaInstance(EstadoPersona personaTMODTITULARptEstadoPersona) {
        this.personaTMODTITULARptEstadoPersonaInstance = personaTMODTITULARptEstadoPersona;
        this.personaTMODTITULARptEstadoPersona = personaTMODTITULARptEstadoPersona != null ? personaTMODTITULARptEstadoPersona.getOid() : null;
    }

    @JsonIgnore
    public PaisOid getPersonaTMODTITULARptpagrPais() {
        return this.personaTMODTITULARptpagrPais;
    }
    
    public void setPersonaTMODTITULARptpagrPais(PaisOid personaTMODTITULARptpagrPais) {
        this.personaTMODTITULARptpagrPais = personaTMODTITULARptpagrPais;
    }

    @JsonIgnore
    public Pais getPersonaTMODTITULARptpagrPaisInstance() {
        return this.personaTMODTITULARptpagrPaisInstance;
    }
    
    public void setPersonaTMODTITULARptpagrPaisInstance(Pais personaTMODTITULARptpagrPais) {
        this.personaTMODTITULARptpagrPaisInstance = personaTMODTITULARptpagrPais;
        this.personaTMODTITULARptpagrPais = personaTMODTITULARptpagrPais != null ? personaTMODTITULARptpagrPais.getOid() : null;
    }

    @JsonIgnore
    public Boolean getPersonaTMODTITULARptpTieneEPSSanitas() {
        return this.personaTMODTITULARptpTieneEPSSanitas;
    }
    
    public void setPersonaTMODTITULARptpTieneEPSSanitas(Boolean personaTMODTITULARptpTieneEPSSanitas) {
        this.personaTMODTITULARptpTieneEPSSanitas = personaTMODTITULARptpTieneEPSSanitas;
    }

    @JsonIgnore
    public String getPersonaTMODTITULARptpRechazadoAfiliacion() {
        return this.personaTMODTITULARptpRechazadoAfiliacion;
    }
    
    public void setPersonaTMODTITULARptpRechazadoAfiliacion(String personaTMODTITULARptpRechazadoAfiliacion) {
        this.personaTMODTITULARptpRechazadoAfiliacion = personaTMODTITULARptpRechazadoAfiliacion;
    }
}
