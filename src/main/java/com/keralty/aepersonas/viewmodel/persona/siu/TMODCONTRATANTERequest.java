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

public class TMODCONTRATANTERequest {

    @JsonProperty("p_thispersona_oid")
    private PersonaOid personaTMODCONTRATANTEpthisPersona;
    
    @JsonIgnore
    private Persona personaTMODCONTRATANTEpthisPersonaInstance;

    @JsonProperty("pt_p_primernombre")
    private String personaTMODCONTRATANTEptpPrimerNombre;

    @JsonProperty("pt_p_segundonombre")
    private String personaTMODCONTRATANTEptpSegundoNombre;

    @JsonProperty("pt_p_primerapellido")
    private String personaTMODCONTRATANTEptpPrimerApellido;

    @JsonProperty("pt_p_segundoapellido")
    private String personaTMODCONTRATANTEptpSegundoApellido;

    @JsonProperty("pt_p_fechanacimiento")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date personaTMODCONTRATANTEptpFechaNacimiento;

    @JsonProperty("pt_p_genero")
    private String personaTMODCONTRATANTEptpGenero;

    @JsonProperty("pt_p_indicadorextranjero")
    private Boolean personaTMODCONTRATANTEptpIndicadorExtranjero;

    @JsonProperty("pt_p_telefonofijo")
    private String personaTMODCONTRATANTEptpTelefonoFijo;

    @JsonProperty("pt_p_telefonocelular")
    private String personaTMODCONTRATANTEptpTelefonoCelular;

    @JsonProperty("pt_p_correoelectronico")
    private String personaTMODCONTRATANTEptpCorreoElectronico;

    @JsonProperty("pt_p_evcdepartamentonac_oid")
    private DepartamentoOid personaTMODCONTRATANTEptpevcDepartamentoNac;
    
    @JsonIgnore
    private Departamento personaTMODCONTRATANTEptpevcDepartamentoNacInstance;

    @JsonProperty("pt_p_evcmunicipionac_oid")
    private MunicipioOid personaTMODCONTRATANTEptpevcMunicipioNac;
    
    @JsonIgnore
    private Municipio personaTMODCONTRATANTEptpevcMunicipioNacInstance;

    @JsonProperty("pt_p_evcestadocivil_oid")
    private EstadoCivilOid personaTMODCONTRATANTEptpevcEstadoCivil;
    
    @JsonIgnore
    private EstadoCivil personaTMODCONTRATANTEptpevcEstadoCivilInstance;

    @JsonProperty("pt_p_direccioncompleta")
    private String personaTMODCONTRATANTEptpDireccionCompleta;

    @JsonProperty("pt_p_rural")
    private Boolean personaTMODCONTRATANTEptpRural;

    @JsonProperty("pt_p_evctipodireccion_oid")
    private TipoDireccionOid personaTMODCONTRATANTEptpevcTipoDireccion;
    
    @JsonIgnore
    private TipoDireccion personaTMODCONTRATANTEptpevcTipoDireccionInstance;

    @JsonProperty("pt_p_evcdepartamento_oid")
    private DepartamentoOid personaTMODCONTRATANTEptpevcDepartamento;
    
    @JsonIgnore
    private Departamento personaTMODCONTRATANTEptpevcDepartamentoInstance;

    @JsonProperty("pt_p_evcmunicipio_oid")
    private MunicipioOid personaTMODCONTRATANTEptpevcMunicipio;
    
    @JsonIgnore
    private Municipio personaTMODCONTRATANTEptpevcMunicipioInstance;

    @JsonProperty("pt_p_numidentificacion")
    private String personaTMODCONTRATANTEptpNumIdentificacion;

    @JsonProperty("pt_p_evctipoidentificacion_oid")
    private TipoIdentificacionOid personaTMODCONTRATANTEptpevcTipoIdentificacion;
    
    @JsonIgnore
    private TipoIdentificacion personaTMODCONTRATANTEptpevcTipoIdentificacionInstance;

    @JsonProperty("p_atrrazonsocial")
    private String personaTMODCONTRATANTEpatrRazonSocial;

    @JsonProperty("pdcdireccioncompleta")
    private String personaTMODCONTRATANTEpDCDireccionCompleta;

    @JsonProperty("pdcdepartamento_oid")
    private DepartamentoOid personaTMODCONTRATANTEpDCDepartamento;
    
    @JsonIgnore
    private Departamento personaTMODCONTRATANTEpDCDepartamentoInstance;

    @JsonProperty("pdcmunicipio_oid")
    private MunicipioOid personaTMODCONTRATANTEpDCMunicipio;
    
    @JsonIgnore
    private Municipio personaTMODCONTRATANTEpDCMunicipioInstance;

    @JsonProperty("pdcrural")
    private Boolean personaTMODCONTRATANTEpDCRural;

    @JsonProperty("pdctelefonofijo")
    private String personaTMODCONTRATANTEpDCTelefonoFijo;

    @JsonProperty("pdctelefonocelular")
    private String personaTMODCONTRATANTEpDCTelefonoCelular;

    @JsonProperty("pdctipodireccion_oid")
    private TipoDireccionOid personaTMODCONTRATANTEpDCTipoDireccion;
    
    @JsonIgnore
    private TipoDireccion personaTMODCONTRATANTEpDCTipoDireccionInstance;

    @JsonProperty("pt_p_codigo")
    private Long personaTMODCONTRATANTEptpCodigo;

    @JsonProperty("ptvalidardatos")
    private Boolean personaTMODCONTRATANTEptValidarDatos;

    @JsonProperty("ptestadopersona_oid")
    private EstadoPersonaOid personaTMODCONTRATANTEptEstadoPersona;
    
    @JsonIgnore
    private EstadoPersona personaTMODCONTRATANTEptEstadoPersonaInstance;

    @JsonProperty("pt_p_agrpais_oid")
    private PaisOid personaTMODCONTRATANTEptpagrPais;
    
    @JsonIgnore
    private Pais personaTMODCONTRATANTEptpagrPaisInstance;

    @JsonProperty("pt_p_rechazadoafiliacion")
    private String personaTMODCONTRATANTEptpRechazadoAfiliacion;

    @JsonProperty("pt_p_tieneepssanitas")
    private Boolean personaTMODCONTRATANTEptpTieneEPSSanitas;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonaTMODCONTRATANTEpthisPersona();
        checkPersonaTMODCONTRATANTEptpNumIdentificacion();
        checkPersonaTMODCONTRATANTEptpevcTipoIdentificacion();
        checkPersonaTMODCONTRATANTEptValidarDatos();
    }

    @JsonIgnore
    public PersonaOid getPersonaTMODCONTRATANTEpthisPersona() {
        return this.personaTMODCONTRATANTEpthisPersona;
    }
    
    public void setPersonaTMODCONTRATANTEpthisPersona(PersonaOid personaTMODCONTRATANTEpthisPersona) {
        this.personaTMODCONTRATANTEpthisPersona = personaTMODCONTRATANTEpthisPersona;
    }

    @JsonIgnore
    public Persona getPersonaTMODCONTRATANTEpthisPersonaInstance() {
        return this.personaTMODCONTRATANTEpthisPersonaInstance;
    }
    
    public void setPersonaTMODCONTRATANTEpthisPersonaInstance(Persona personaTMODCONTRATANTEpthisPersona) {
        this.personaTMODCONTRATANTEpthisPersonaInstance = personaTMODCONTRATANTEpthisPersona;
        this.personaTMODCONTRATANTEpthisPersona = personaTMODCONTRATANTEpthisPersona != null ? personaTMODCONTRATANTEpthisPersona.getOid() : null;
    }

    private void checkPersonaTMODCONTRATANTEpthisPersona() throws NotNullArgumentException {
        if(this.getPersonaTMODCONTRATANTEpthisPersonaInstance() == null || this.getPersonaTMODCONTRATANTEpthisPersonaInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TMODCONTRATANTE, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTHISPERSONA, PersonaConstants.SERV_ALIAS_TMODCONTRATANTE, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTHISPERSONA);
        }
    }

    @JsonIgnore
    public String getPersonaTMODCONTRATANTEptpPrimerNombre() {
        return this.personaTMODCONTRATANTEptpPrimerNombre;
    }
    
    public void setPersonaTMODCONTRATANTEptpPrimerNombre(String personaTMODCONTRATANTEptpPrimerNombre) {
        this.personaTMODCONTRATANTEptpPrimerNombre = personaTMODCONTRATANTEptpPrimerNombre;
    }

    @JsonIgnore
    public String getPersonaTMODCONTRATANTEptpSegundoNombre() {
        return this.personaTMODCONTRATANTEptpSegundoNombre;
    }
    
    public void setPersonaTMODCONTRATANTEptpSegundoNombre(String personaTMODCONTRATANTEptpSegundoNombre) {
        this.personaTMODCONTRATANTEptpSegundoNombre = personaTMODCONTRATANTEptpSegundoNombre;
    }

    @JsonIgnore
    public String getPersonaTMODCONTRATANTEptpPrimerApellido() {
        return this.personaTMODCONTRATANTEptpPrimerApellido;
    }
    
    public void setPersonaTMODCONTRATANTEptpPrimerApellido(String personaTMODCONTRATANTEptpPrimerApellido) {
        this.personaTMODCONTRATANTEptpPrimerApellido = personaTMODCONTRATANTEptpPrimerApellido;
    }

    @JsonIgnore
    public String getPersonaTMODCONTRATANTEptpSegundoApellido() {
        return this.personaTMODCONTRATANTEptpSegundoApellido;
    }
    
    public void setPersonaTMODCONTRATANTEptpSegundoApellido(String personaTMODCONTRATANTEptpSegundoApellido) {
        this.personaTMODCONTRATANTEptpSegundoApellido = personaTMODCONTRATANTEptpSegundoApellido;
    }

    @JsonIgnore
    public Date getPersonaTMODCONTRATANTEptpFechaNacimiento() {
        return this.personaTMODCONTRATANTEptpFechaNacimiento;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setPersonaTMODCONTRATANTEptpFechaNacimiento(Date personaTMODCONTRATANTEptpFechaNacimiento) {
        this.personaTMODCONTRATANTEptpFechaNacimiento = personaTMODCONTRATANTEptpFechaNacimiento;
    }

    @JsonIgnore
    public String getPersonaTMODCONTRATANTEptpGenero() {
        return this.personaTMODCONTRATANTEptpGenero;
    }
    
    public void setPersonaTMODCONTRATANTEptpGenero(String personaTMODCONTRATANTEptpGenero) {
        this.personaTMODCONTRATANTEptpGenero = personaTMODCONTRATANTEptpGenero;
    }

    @JsonIgnore
    public Boolean getPersonaTMODCONTRATANTEptpIndicadorExtranjero() {
        return this.personaTMODCONTRATANTEptpIndicadorExtranjero;
    }
    
    public void setPersonaTMODCONTRATANTEptpIndicadorExtranjero(Boolean personaTMODCONTRATANTEptpIndicadorExtranjero) {
        this.personaTMODCONTRATANTEptpIndicadorExtranjero = personaTMODCONTRATANTEptpIndicadorExtranjero;
    }

    @JsonIgnore
    public String getPersonaTMODCONTRATANTEptpTelefonoFijo() {
        return this.personaTMODCONTRATANTEptpTelefonoFijo;
    }
    
    public void setPersonaTMODCONTRATANTEptpTelefonoFijo(String personaTMODCONTRATANTEptpTelefonoFijo) {
        this.personaTMODCONTRATANTEptpTelefonoFijo = personaTMODCONTRATANTEptpTelefonoFijo;
    }

    @JsonIgnore
    public String getPersonaTMODCONTRATANTEptpTelefonoCelular() {
        return this.personaTMODCONTRATANTEptpTelefonoCelular;
    }
    
    public void setPersonaTMODCONTRATANTEptpTelefonoCelular(String personaTMODCONTRATANTEptpTelefonoCelular) {
        this.personaTMODCONTRATANTEptpTelefonoCelular = personaTMODCONTRATANTEptpTelefonoCelular;
    }

    @JsonIgnore
    public String getPersonaTMODCONTRATANTEptpCorreoElectronico() {
        return this.personaTMODCONTRATANTEptpCorreoElectronico;
    }
    
    public void setPersonaTMODCONTRATANTEptpCorreoElectronico(String personaTMODCONTRATANTEptpCorreoElectronico) {
        this.personaTMODCONTRATANTEptpCorreoElectronico = personaTMODCONTRATANTEptpCorreoElectronico;
    }

    @JsonIgnore
    public DepartamentoOid getPersonaTMODCONTRATANTEptpevcDepartamentoNac() {
        return this.personaTMODCONTRATANTEptpevcDepartamentoNac;
    }
    
    public void setPersonaTMODCONTRATANTEptpevcDepartamentoNac(DepartamentoOid personaTMODCONTRATANTEptpevcDepartamentoNac) {
        this.personaTMODCONTRATANTEptpevcDepartamentoNac = personaTMODCONTRATANTEptpevcDepartamentoNac;
    }

    @JsonIgnore
    public Departamento getPersonaTMODCONTRATANTEptpevcDepartamentoNacInstance() {
        return this.personaTMODCONTRATANTEptpevcDepartamentoNacInstance;
    }
    
    public void setPersonaTMODCONTRATANTEptpevcDepartamentoNacInstance(Departamento personaTMODCONTRATANTEptpevcDepartamentoNac) {
        this.personaTMODCONTRATANTEptpevcDepartamentoNacInstance = personaTMODCONTRATANTEptpevcDepartamentoNac;
        this.personaTMODCONTRATANTEptpevcDepartamentoNac = personaTMODCONTRATANTEptpevcDepartamentoNac != null ? personaTMODCONTRATANTEptpevcDepartamentoNac.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getPersonaTMODCONTRATANTEptpevcMunicipioNac() {
        return this.personaTMODCONTRATANTEptpevcMunicipioNac;
    }
    
    public void setPersonaTMODCONTRATANTEptpevcMunicipioNac(MunicipioOid personaTMODCONTRATANTEptpevcMunicipioNac) {
        this.personaTMODCONTRATANTEptpevcMunicipioNac = personaTMODCONTRATANTEptpevcMunicipioNac;
    }

    @JsonIgnore
    public Municipio getPersonaTMODCONTRATANTEptpevcMunicipioNacInstance() {
        return this.personaTMODCONTRATANTEptpevcMunicipioNacInstance;
    }
    
    public void setPersonaTMODCONTRATANTEptpevcMunicipioNacInstance(Municipio personaTMODCONTRATANTEptpevcMunicipioNac) {
        this.personaTMODCONTRATANTEptpevcMunicipioNacInstance = personaTMODCONTRATANTEptpevcMunicipioNac;
        this.personaTMODCONTRATANTEptpevcMunicipioNac = personaTMODCONTRATANTEptpevcMunicipioNac != null ? personaTMODCONTRATANTEptpevcMunicipioNac.getOid() : null;
    }

    @JsonIgnore
    public EstadoCivilOid getPersonaTMODCONTRATANTEptpevcEstadoCivil() {
        return this.personaTMODCONTRATANTEptpevcEstadoCivil;
    }
    
    public void setPersonaTMODCONTRATANTEptpevcEstadoCivil(EstadoCivilOid personaTMODCONTRATANTEptpevcEstadoCivil) {
        this.personaTMODCONTRATANTEptpevcEstadoCivil = personaTMODCONTRATANTEptpevcEstadoCivil;
    }

    @JsonIgnore
    public EstadoCivil getPersonaTMODCONTRATANTEptpevcEstadoCivilInstance() {
        return this.personaTMODCONTRATANTEptpevcEstadoCivilInstance;
    }
    
    public void setPersonaTMODCONTRATANTEptpevcEstadoCivilInstance(EstadoCivil personaTMODCONTRATANTEptpevcEstadoCivil) {
        this.personaTMODCONTRATANTEptpevcEstadoCivilInstance = personaTMODCONTRATANTEptpevcEstadoCivil;
        this.personaTMODCONTRATANTEptpevcEstadoCivil = personaTMODCONTRATANTEptpevcEstadoCivil != null ? personaTMODCONTRATANTEptpevcEstadoCivil.getOid() : null;
    }

    @JsonIgnore
    public String getPersonaTMODCONTRATANTEptpDireccionCompleta() {
        return this.personaTMODCONTRATANTEptpDireccionCompleta;
    }
    
    public void setPersonaTMODCONTRATANTEptpDireccionCompleta(String personaTMODCONTRATANTEptpDireccionCompleta) {
        this.personaTMODCONTRATANTEptpDireccionCompleta = personaTMODCONTRATANTEptpDireccionCompleta;
    }

    @JsonIgnore
    public Boolean getPersonaTMODCONTRATANTEptpRural() {
        return this.personaTMODCONTRATANTEptpRural;
    }
    
    public void setPersonaTMODCONTRATANTEptpRural(Boolean personaTMODCONTRATANTEptpRural) {
        this.personaTMODCONTRATANTEptpRural = personaTMODCONTRATANTEptpRural;
    }

    @JsonIgnore
    public TipoDireccionOid getPersonaTMODCONTRATANTEptpevcTipoDireccion() {
        return this.personaTMODCONTRATANTEptpevcTipoDireccion;
    }
    
    public void setPersonaTMODCONTRATANTEptpevcTipoDireccion(TipoDireccionOid personaTMODCONTRATANTEptpevcTipoDireccion) {
        this.personaTMODCONTRATANTEptpevcTipoDireccion = personaTMODCONTRATANTEptpevcTipoDireccion;
    }

    @JsonIgnore
    public TipoDireccion getPersonaTMODCONTRATANTEptpevcTipoDireccionInstance() {
        return this.personaTMODCONTRATANTEptpevcTipoDireccionInstance;
    }
    
    public void setPersonaTMODCONTRATANTEptpevcTipoDireccionInstance(TipoDireccion personaTMODCONTRATANTEptpevcTipoDireccion) {
        this.personaTMODCONTRATANTEptpevcTipoDireccionInstance = personaTMODCONTRATANTEptpevcTipoDireccion;
        this.personaTMODCONTRATANTEptpevcTipoDireccion = personaTMODCONTRATANTEptpevcTipoDireccion != null ? personaTMODCONTRATANTEptpevcTipoDireccion.getOid() : null;
    }

    @JsonIgnore
    public DepartamentoOid getPersonaTMODCONTRATANTEptpevcDepartamento() {
        return this.personaTMODCONTRATANTEptpevcDepartamento;
    }
    
    public void setPersonaTMODCONTRATANTEptpevcDepartamento(DepartamentoOid personaTMODCONTRATANTEptpevcDepartamento) {
        this.personaTMODCONTRATANTEptpevcDepartamento = personaTMODCONTRATANTEptpevcDepartamento;
    }

    @JsonIgnore
    public Departamento getPersonaTMODCONTRATANTEptpevcDepartamentoInstance() {
        return this.personaTMODCONTRATANTEptpevcDepartamentoInstance;
    }
    
    public void setPersonaTMODCONTRATANTEptpevcDepartamentoInstance(Departamento personaTMODCONTRATANTEptpevcDepartamento) {
        this.personaTMODCONTRATANTEptpevcDepartamentoInstance = personaTMODCONTRATANTEptpevcDepartamento;
        this.personaTMODCONTRATANTEptpevcDepartamento = personaTMODCONTRATANTEptpevcDepartamento != null ? personaTMODCONTRATANTEptpevcDepartamento.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getPersonaTMODCONTRATANTEptpevcMunicipio() {
        return this.personaTMODCONTRATANTEptpevcMunicipio;
    }
    
    public void setPersonaTMODCONTRATANTEptpevcMunicipio(MunicipioOid personaTMODCONTRATANTEptpevcMunicipio) {
        this.personaTMODCONTRATANTEptpevcMunicipio = personaTMODCONTRATANTEptpevcMunicipio;
    }

    @JsonIgnore
    public Municipio getPersonaTMODCONTRATANTEptpevcMunicipioInstance() {
        return this.personaTMODCONTRATANTEptpevcMunicipioInstance;
    }
    
    public void setPersonaTMODCONTRATANTEptpevcMunicipioInstance(Municipio personaTMODCONTRATANTEptpevcMunicipio) {
        this.personaTMODCONTRATANTEptpevcMunicipioInstance = personaTMODCONTRATANTEptpevcMunicipio;
        this.personaTMODCONTRATANTEptpevcMunicipio = personaTMODCONTRATANTEptpevcMunicipio != null ? personaTMODCONTRATANTEptpevcMunicipio.getOid() : null;
    }

    @JsonIgnore
    public String getPersonaTMODCONTRATANTEptpNumIdentificacion() {
        return this.personaTMODCONTRATANTEptpNumIdentificacion;
    }
    
    public void setPersonaTMODCONTRATANTEptpNumIdentificacion(String personaTMODCONTRATANTEptpNumIdentificacion) {
        this.personaTMODCONTRATANTEptpNumIdentificacion = personaTMODCONTRATANTEptpNumIdentificacion;
    }

    private void checkPersonaTMODCONTRATANTEptpNumIdentificacion() throws NotNullArgumentException {
        if(this.getPersonaTMODCONTRATANTEptpNumIdentificacion() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TMODCONTRATANTE, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPNUMIDENTIFICACION, PersonaConstants.SERV_ALIAS_TMODCONTRATANTE, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPNUMIDENTIFICACION);
        }
    }

    @JsonIgnore
    public TipoIdentificacionOid getPersonaTMODCONTRATANTEptpevcTipoIdentificacion() {
        return this.personaTMODCONTRATANTEptpevcTipoIdentificacion;
    }
    
    public void setPersonaTMODCONTRATANTEptpevcTipoIdentificacion(TipoIdentificacionOid personaTMODCONTRATANTEptpevcTipoIdentificacion) {
        this.personaTMODCONTRATANTEptpevcTipoIdentificacion = personaTMODCONTRATANTEptpevcTipoIdentificacion;
    }

    @JsonIgnore
    public TipoIdentificacion getPersonaTMODCONTRATANTEptpevcTipoIdentificacionInstance() {
        return this.personaTMODCONTRATANTEptpevcTipoIdentificacionInstance;
    }
    
    public void setPersonaTMODCONTRATANTEptpevcTipoIdentificacionInstance(TipoIdentificacion personaTMODCONTRATANTEptpevcTipoIdentificacion) {
        this.personaTMODCONTRATANTEptpevcTipoIdentificacionInstance = personaTMODCONTRATANTEptpevcTipoIdentificacion;
        this.personaTMODCONTRATANTEptpevcTipoIdentificacion = personaTMODCONTRATANTEptpevcTipoIdentificacion != null ? personaTMODCONTRATANTEptpevcTipoIdentificacion.getOid() : null;
    }

    private void checkPersonaTMODCONTRATANTEptpevcTipoIdentificacion() throws NotNullArgumentException {
        if(this.getPersonaTMODCONTRATANTEptpevcTipoIdentificacionInstance() == null || this.getPersonaTMODCONTRATANTEptpevcTipoIdentificacionInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TMODCONTRATANTE, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPEVCTIPOIDENTIFICACION, PersonaConstants.SERV_ALIAS_TMODCONTRATANTE, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTPEVCTIPOIDENTIFICACION);
        }
    }

    @JsonIgnore
    public String getPersonaTMODCONTRATANTEpatrRazonSocial() {
        return this.personaTMODCONTRATANTEpatrRazonSocial;
    }
    
    public void setPersonaTMODCONTRATANTEpatrRazonSocial(String personaTMODCONTRATANTEpatrRazonSocial) {
        this.personaTMODCONTRATANTEpatrRazonSocial = personaTMODCONTRATANTEpatrRazonSocial;
    }

    @JsonIgnore
    public String getPersonaTMODCONTRATANTEpDCDireccionCompleta() {
        return this.personaTMODCONTRATANTEpDCDireccionCompleta;
    }
    
    public void setPersonaTMODCONTRATANTEpDCDireccionCompleta(String personaTMODCONTRATANTEpDCDireccionCompleta) {
        this.personaTMODCONTRATANTEpDCDireccionCompleta = personaTMODCONTRATANTEpDCDireccionCompleta;
    }

    @JsonIgnore
    public DepartamentoOid getPersonaTMODCONTRATANTEpDCDepartamento() {
        return this.personaTMODCONTRATANTEpDCDepartamento;
    }
    
    public void setPersonaTMODCONTRATANTEpDCDepartamento(DepartamentoOid personaTMODCONTRATANTEpDCDepartamento) {
        this.personaTMODCONTRATANTEpDCDepartamento = personaTMODCONTRATANTEpDCDepartamento;
    }

    @JsonIgnore
    public Departamento getPersonaTMODCONTRATANTEpDCDepartamentoInstance() {
        return this.personaTMODCONTRATANTEpDCDepartamentoInstance;
    }
    
    public void setPersonaTMODCONTRATANTEpDCDepartamentoInstance(Departamento personaTMODCONTRATANTEpDCDepartamento) {
        this.personaTMODCONTRATANTEpDCDepartamentoInstance = personaTMODCONTRATANTEpDCDepartamento;
        this.personaTMODCONTRATANTEpDCDepartamento = personaTMODCONTRATANTEpDCDepartamento != null ? personaTMODCONTRATANTEpDCDepartamento.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getPersonaTMODCONTRATANTEpDCMunicipio() {
        return this.personaTMODCONTRATANTEpDCMunicipio;
    }
    
    public void setPersonaTMODCONTRATANTEpDCMunicipio(MunicipioOid personaTMODCONTRATANTEpDCMunicipio) {
        this.personaTMODCONTRATANTEpDCMunicipio = personaTMODCONTRATANTEpDCMunicipio;
    }

    @JsonIgnore
    public Municipio getPersonaTMODCONTRATANTEpDCMunicipioInstance() {
        return this.personaTMODCONTRATANTEpDCMunicipioInstance;
    }
    
    public void setPersonaTMODCONTRATANTEpDCMunicipioInstance(Municipio personaTMODCONTRATANTEpDCMunicipio) {
        this.personaTMODCONTRATANTEpDCMunicipioInstance = personaTMODCONTRATANTEpDCMunicipio;
        this.personaTMODCONTRATANTEpDCMunicipio = personaTMODCONTRATANTEpDCMunicipio != null ? personaTMODCONTRATANTEpDCMunicipio.getOid() : null;
    }

    @JsonIgnore
    public Boolean getPersonaTMODCONTRATANTEpDCRural() {
        return this.personaTMODCONTRATANTEpDCRural;
    }
    
    public void setPersonaTMODCONTRATANTEpDCRural(Boolean personaTMODCONTRATANTEpDCRural) {
        this.personaTMODCONTRATANTEpDCRural = personaTMODCONTRATANTEpDCRural;
    }

    @JsonIgnore
    public String getPersonaTMODCONTRATANTEpDCTelefonoFijo() {
        return this.personaTMODCONTRATANTEpDCTelefonoFijo;
    }
    
    public void setPersonaTMODCONTRATANTEpDCTelefonoFijo(String personaTMODCONTRATANTEpDCTelefonoFijo) {
        this.personaTMODCONTRATANTEpDCTelefonoFijo = personaTMODCONTRATANTEpDCTelefonoFijo;
    }

    @JsonIgnore
    public String getPersonaTMODCONTRATANTEpDCTelefonoCelular() {
        return this.personaTMODCONTRATANTEpDCTelefonoCelular;
    }
    
    public void setPersonaTMODCONTRATANTEpDCTelefonoCelular(String personaTMODCONTRATANTEpDCTelefonoCelular) {
        this.personaTMODCONTRATANTEpDCTelefonoCelular = personaTMODCONTRATANTEpDCTelefonoCelular;
    }

    @JsonIgnore
    public TipoDireccionOid getPersonaTMODCONTRATANTEpDCTipoDireccion() {
        return this.personaTMODCONTRATANTEpDCTipoDireccion;
    }
    
    public void setPersonaTMODCONTRATANTEpDCTipoDireccion(TipoDireccionOid personaTMODCONTRATANTEpDCTipoDireccion) {
        this.personaTMODCONTRATANTEpDCTipoDireccion = personaTMODCONTRATANTEpDCTipoDireccion;
    }

    @JsonIgnore
    public TipoDireccion getPersonaTMODCONTRATANTEpDCTipoDireccionInstance() {
        return this.personaTMODCONTRATANTEpDCTipoDireccionInstance;
    }
    
    public void setPersonaTMODCONTRATANTEpDCTipoDireccionInstance(TipoDireccion personaTMODCONTRATANTEpDCTipoDireccion) {
        this.personaTMODCONTRATANTEpDCTipoDireccionInstance = personaTMODCONTRATANTEpDCTipoDireccion;
        this.personaTMODCONTRATANTEpDCTipoDireccion = personaTMODCONTRATANTEpDCTipoDireccion != null ? personaTMODCONTRATANTEpDCTipoDireccion.getOid() : null;
    }

    @JsonIgnore
    public Long getPersonaTMODCONTRATANTEptpCodigo() {
        return this.personaTMODCONTRATANTEptpCodigo;
    }
    
    public void setPersonaTMODCONTRATANTEptpCodigo(Long personaTMODCONTRATANTEptpCodigo) {
        this.personaTMODCONTRATANTEptpCodigo = personaTMODCONTRATANTEptpCodigo;
    }

    @JsonIgnore
    public Boolean getPersonaTMODCONTRATANTEptValidarDatos() {
        return this.personaTMODCONTRATANTEptValidarDatos;
    }
    
    public void setPersonaTMODCONTRATANTEptValidarDatos(Boolean personaTMODCONTRATANTEptValidarDatos) {
        this.personaTMODCONTRATANTEptValidarDatos = personaTMODCONTRATANTEptValidarDatos;
    }

    private void checkPersonaTMODCONTRATANTEptValidarDatos() throws NotNullArgumentException {
        if(this.getPersonaTMODCONTRATANTEptValidarDatos() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TMODCONTRATANTE, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTVALIDARDATOS, PersonaConstants.SERV_ALIAS_TMODCONTRATANTE, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TMODCONTRATANTE_PERSONATMODCONTRATANTEPTVALIDARDATOS);
        }
    }

    @JsonIgnore
    public EstadoPersonaOid getPersonaTMODCONTRATANTEptEstadoPersona() {
        return this.personaTMODCONTRATANTEptEstadoPersona;
    }
    
    public void setPersonaTMODCONTRATANTEptEstadoPersona(EstadoPersonaOid personaTMODCONTRATANTEptEstadoPersona) {
        this.personaTMODCONTRATANTEptEstadoPersona = personaTMODCONTRATANTEptEstadoPersona;
    }

    @JsonIgnore
    public EstadoPersona getPersonaTMODCONTRATANTEptEstadoPersonaInstance() {
        return this.personaTMODCONTRATANTEptEstadoPersonaInstance;
    }
    
    public void setPersonaTMODCONTRATANTEptEstadoPersonaInstance(EstadoPersona personaTMODCONTRATANTEptEstadoPersona) {
        this.personaTMODCONTRATANTEptEstadoPersonaInstance = personaTMODCONTRATANTEptEstadoPersona;
        this.personaTMODCONTRATANTEptEstadoPersona = personaTMODCONTRATANTEptEstadoPersona != null ? personaTMODCONTRATANTEptEstadoPersona.getOid() : null;
    }

    @JsonIgnore
    public PaisOid getPersonaTMODCONTRATANTEptpagrPais() {
        return this.personaTMODCONTRATANTEptpagrPais;
    }
    
    public void setPersonaTMODCONTRATANTEptpagrPais(PaisOid personaTMODCONTRATANTEptpagrPais) {
        this.personaTMODCONTRATANTEptpagrPais = personaTMODCONTRATANTEptpagrPais;
    }

    @JsonIgnore
    public Pais getPersonaTMODCONTRATANTEptpagrPaisInstance() {
        return this.personaTMODCONTRATANTEptpagrPaisInstance;
    }
    
    public void setPersonaTMODCONTRATANTEptpagrPaisInstance(Pais personaTMODCONTRATANTEptpagrPais) {
        this.personaTMODCONTRATANTEptpagrPaisInstance = personaTMODCONTRATANTEptpagrPais;
        this.personaTMODCONTRATANTEptpagrPais = personaTMODCONTRATANTEptpagrPais != null ? personaTMODCONTRATANTEptpagrPais.getOid() : null;
    }

    @JsonIgnore
    public String getPersonaTMODCONTRATANTEptpRechazadoAfiliacion() {
        return this.personaTMODCONTRATANTEptpRechazadoAfiliacion;
    }
    
    public void setPersonaTMODCONTRATANTEptpRechazadoAfiliacion(String personaTMODCONTRATANTEptpRechazadoAfiliacion) {
        this.personaTMODCONTRATANTEptpRechazadoAfiliacion = personaTMODCONTRATANTEptpRechazadoAfiliacion;
    }

    @JsonIgnore
    public Boolean getPersonaTMODCONTRATANTEptpTieneEPSSanitas() {
        return this.personaTMODCONTRATANTEptpTieneEPSSanitas;
    }
    
    public void setPersonaTMODCONTRATANTEptpTieneEPSSanitas(Boolean personaTMODCONTRATANTEptpTieneEPSSanitas) {
        this.personaTMODCONTRATANTEptpTieneEPSSanitas = personaTMODCONTRATANTEptpTieneEPSSanitas;
    }
}
