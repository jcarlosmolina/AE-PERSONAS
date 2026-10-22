package com.keralty.aepersonas.viewmodel.persona.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.EstadoCivil;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.persistence.oid.EstadoCivilOid;
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

public class TMODUSUARIORequest {

    @JsonProperty("p_thispersona_oid")
    private PersonaOid personaTMODUSUARIOpthisPersona;
    
    @JsonIgnore
    private Persona personaTMODUSUARIOpthisPersonaInstance;

    @JsonProperty("pt_p_primernombre")
    private String personaTMODUSUARIOptpPrimerNombre;

    @JsonProperty("pt_p_segundonombre")
    private String personaTMODUSUARIOptpSegundoNombre;

    @JsonProperty("pt_p_primerapellido")
    private String personaTMODUSUARIOptpPrimerApellido;

    @JsonProperty("pt_p_segundoapellido")
    private String personaTMODUSUARIOptpSegundoApellido;

    @JsonProperty("pt_p_fechanacimiento")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date personaTMODUSUARIOptpFechaNacimiento;

    @JsonProperty("pt_p_genero")
    private String personaTMODUSUARIOptpGenero;

    @JsonProperty("pt_p_indicadorextranjero")
    private Boolean personaTMODUSUARIOptpIndicadorExtranjero;

    @JsonProperty("pt_p_telefonofijo")
    private String personaTMODUSUARIOptpTelefonoFijo;

    @JsonProperty("pt_p_telefonocelular")
    private String personaTMODUSUARIOptpTelefonoCelular;

    @JsonProperty("pt_p_correoelectronico")
    private String personaTMODUSUARIOptpCorreoElectronico;

    @JsonProperty("pt_p_evcdepartamentonac_oid")
    private DepartamentoOid personaTMODUSUARIOptpevcDepartamentoNac;
    
    @JsonIgnore
    private Departamento personaTMODUSUARIOptpevcDepartamentoNacInstance;

    @JsonProperty("pt_p_evcmunicipionac_oid")
    private MunicipioOid personaTMODUSUARIOptpevcMunicipioNac;
    
    @JsonIgnore
    private Municipio personaTMODUSUARIOptpevcMunicipioNacInstance;

    @JsonProperty("pt_p_evcestadocivil_oid")
    private EstadoCivilOid personaTMODUSUARIOptpevcEstadoCivil;
    
    @JsonIgnore
    private EstadoCivil personaTMODUSUARIOptpevcEstadoCivilInstance;

    @JsonProperty("pt_p_direccioncompleta")
    private String personaTMODUSUARIOptpDireccionCompleta;

    @JsonProperty("pt_p_rural")
    private Boolean personaTMODUSUARIOptpRural;

    @JsonProperty("pt_p_evctipodireccion_oid")
    private TipoDireccionOid personaTMODUSUARIOptpevcTipoDireccion;
    
    @JsonIgnore
    private TipoDireccion personaTMODUSUARIOptpevcTipoDireccionInstance;

    @JsonProperty("pt_p_evcdepartamento_oid")
    private DepartamentoOid personaTMODUSUARIOptpevcDepartamento;
    
    @JsonIgnore
    private Departamento personaTMODUSUARIOptpevcDepartamentoInstance;

    @JsonProperty("pt_p_evcmunicipio_oid")
    private MunicipioOid personaTMODUSUARIOptpevcMunicipio;
    
    @JsonIgnore
    private Municipio personaTMODUSUARIOptpevcMunicipioInstance;

    @JsonProperty("pt_p_numidentificacion")
    private String personaTMODUSUARIOptpNumIdentificacion;

    @JsonProperty("pt_p_evctipoidentificacion_oid")
    private TipoIdentificacionOid personaTMODUSUARIOptpevcTipoIdentificacion;
    
    @JsonIgnore
    private TipoIdentificacion personaTMODUSUARIOptpevcTipoIdentificacionInstance;

    @JsonProperty("pt_p_agrpais_oid")
    private PaisOid personaTMODUSUARIOptpagrPais;
    
    @JsonIgnore
    private Pais personaTMODUSUARIOptpagrPaisInstance;

    @JsonProperty("preconditionId")
    private String preconditionId;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonaTMODUSUARIOpthisPersona();
        checkPersonaTMODUSUARIOptpNumIdentificacion();
        checkPersonaTMODUSUARIOptpevcTipoIdentificacion();
    }

    @JsonIgnore
    public PersonaOid getPersonaTMODUSUARIOpthisPersona() {
        return this.personaTMODUSUARIOpthisPersona;
    }
    
    public void setPersonaTMODUSUARIOpthisPersona(PersonaOid personaTMODUSUARIOpthisPersona) {
        this.personaTMODUSUARIOpthisPersona = personaTMODUSUARIOpthisPersona;
    }

    @JsonIgnore
    public Persona getPersonaTMODUSUARIOpthisPersonaInstance() {
        return this.personaTMODUSUARIOpthisPersonaInstance;
    }
    
    public void setPersonaTMODUSUARIOpthisPersonaInstance(Persona personaTMODUSUARIOpthisPersona) {
        this.personaTMODUSUARIOpthisPersonaInstance = personaTMODUSUARIOpthisPersona;
        this.personaTMODUSUARIOpthisPersona = personaTMODUSUARIOpthisPersona != null ? personaTMODUSUARIOpthisPersona.getOid() : null;
    }

    private void checkPersonaTMODUSUARIOpthisPersona() throws NotNullArgumentException {
        if(this.getPersonaTMODUSUARIOpthisPersonaInstance() == null || this.getPersonaTMODUSUARIOpthisPersonaInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TMODUSUARIO, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TMODUSUARIO_PERSONATMODUSUARIOPTHISPERSONA, PersonaConstants.SERV_ALIAS_TMODUSUARIO, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TMODUSUARIO_PERSONATMODUSUARIOPTHISPERSONA);
        }
    }

    @JsonIgnore
    public String getPersonaTMODUSUARIOptpPrimerNombre() {
        return this.personaTMODUSUARIOptpPrimerNombre;
    }
    
    public void setPersonaTMODUSUARIOptpPrimerNombre(String personaTMODUSUARIOptpPrimerNombre) {
        this.personaTMODUSUARIOptpPrimerNombre = personaTMODUSUARIOptpPrimerNombre;
    }

    @JsonIgnore
    public String getPersonaTMODUSUARIOptpSegundoNombre() {
        return this.personaTMODUSUARIOptpSegundoNombre;
    }
    
    public void setPersonaTMODUSUARIOptpSegundoNombre(String personaTMODUSUARIOptpSegundoNombre) {
        this.personaTMODUSUARIOptpSegundoNombre = personaTMODUSUARIOptpSegundoNombre;
    }

    @JsonIgnore
    public String getPersonaTMODUSUARIOptpPrimerApellido() {
        return this.personaTMODUSUARIOptpPrimerApellido;
    }
    
    public void setPersonaTMODUSUARIOptpPrimerApellido(String personaTMODUSUARIOptpPrimerApellido) {
        this.personaTMODUSUARIOptpPrimerApellido = personaTMODUSUARIOptpPrimerApellido;
    }

    @JsonIgnore
    public String getPersonaTMODUSUARIOptpSegundoApellido() {
        return this.personaTMODUSUARIOptpSegundoApellido;
    }
    
    public void setPersonaTMODUSUARIOptpSegundoApellido(String personaTMODUSUARIOptpSegundoApellido) {
        this.personaTMODUSUARIOptpSegundoApellido = personaTMODUSUARIOptpSegundoApellido;
    }

    @JsonIgnore
    public Date getPersonaTMODUSUARIOptpFechaNacimiento() {
        return this.personaTMODUSUARIOptpFechaNacimiento;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setPersonaTMODUSUARIOptpFechaNacimiento(Date personaTMODUSUARIOptpFechaNacimiento) {
        this.personaTMODUSUARIOptpFechaNacimiento = personaTMODUSUARIOptpFechaNacimiento;
    }

    @JsonIgnore
    public String getPersonaTMODUSUARIOptpGenero() {
        return this.personaTMODUSUARIOptpGenero;
    }
    
    public void setPersonaTMODUSUARIOptpGenero(String personaTMODUSUARIOptpGenero) {
        this.personaTMODUSUARIOptpGenero = personaTMODUSUARIOptpGenero;
    }

    @JsonIgnore
    public Boolean getPersonaTMODUSUARIOptpIndicadorExtranjero() {
        return this.personaTMODUSUARIOptpIndicadorExtranjero;
    }
    
    public void setPersonaTMODUSUARIOptpIndicadorExtranjero(Boolean personaTMODUSUARIOptpIndicadorExtranjero) {
        this.personaTMODUSUARIOptpIndicadorExtranjero = personaTMODUSUARIOptpIndicadorExtranjero;
    }

    @JsonIgnore
    public String getPersonaTMODUSUARIOptpTelefonoFijo() {
        return this.personaTMODUSUARIOptpTelefonoFijo;
    }
    
    public void setPersonaTMODUSUARIOptpTelefonoFijo(String personaTMODUSUARIOptpTelefonoFijo) {
        this.personaTMODUSUARIOptpTelefonoFijo = personaTMODUSUARIOptpTelefonoFijo;
    }

    @JsonIgnore
    public String getPersonaTMODUSUARIOptpTelefonoCelular() {
        return this.personaTMODUSUARIOptpTelefonoCelular;
    }
    
    public void setPersonaTMODUSUARIOptpTelefonoCelular(String personaTMODUSUARIOptpTelefonoCelular) {
        this.personaTMODUSUARIOptpTelefonoCelular = personaTMODUSUARIOptpTelefonoCelular;
    }

    @JsonIgnore
    public String getPersonaTMODUSUARIOptpCorreoElectronico() {
        return this.personaTMODUSUARIOptpCorreoElectronico;
    }
    
    public void setPersonaTMODUSUARIOptpCorreoElectronico(String personaTMODUSUARIOptpCorreoElectronico) {
        this.personaTMODUSUARIOptpCorreoElectronico = personaTMODUSUARIOptpCorreoElectronico;
    }

    @JsonIgnore
    public DepartamentoOid getPersonaTMODUSUARIOptpevcDepartamentoNac() {
        return this.personaTMODUSUARIOptpevcDepartamentoNac;
    }
    
    public void setPersonaTMODUSUARIOptpevcDepartamentoNac(DepartamentoOid personaTMODUSUARIOptpevcDepartamentoNac) {
        this.personaTMODUSUARIOptpevcDepartamentoNac = personaTMODUSUARIOptpevcDepartamentoNac;
    }

    @JsonIgnore
    public Departamento getPersonaTMODUSUARIOptpevcDepartamentoNacInstance() {
        return this.personaTMODUSUARIOptpevcDepartamentoNacInstance;
    }
    
    public void setPersonaTMODUSUARIOptpevcDepartamentoNacInstance(Departamento personaTMODUSUARIOptpevcDepartamentoNac) {
        this.personaTMODUSUARIOptpevcDepartamentoNacInstance = personaTMODUSUARIOptpevcDepartamentoNac;
        this.personaTMODUSUARIOptpevcDepartamentoNac = personaTMODUSUARIOptpevcDepartamentoNac != null ? personaTMODUSUARIOptpevcDepartamentoNac.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getPersonaTMODUSUARIOptpevcMunicipioNac() {
        return this.personaTMODUSUARIOptpevcMunicipioNac;
    }
    
    public void setPersonaTMODUSUARIOptpevcMunicipioNac(MunicipioOid personaTMODUSUARIOptpevcMunicipioNac) {
        this.personaTMODUSUARIOptpevcMunicipioNac = personaTMODUSUARIOptpevcMunicipioNac;
    }

    @JsonIgnore
    public Municipio getPersonaTMODUSUARIOptpevcMunicipioNacInstance() {
        return this.personaTMODUSUARIOptpevcMunicipioNacInstance;
    }
    
    public void setPersonaTMODUSUARIOptpevcMunicipioNacInstance(Municipio personaTMODUSUARIOptpevcMunicipioNac) {
        this.personaTMODUSUARIOptpevcMunicipioNacInstance = personaTMODUSUARIOptpevcMunicipioNac;
        this.personaTMODUSUARIOptpevcMunicipioNac = personaTMODUSUARIOptpevcMunicipioNac != null ? personaTMODUSUARIOptpevcMunicipioNac.getOid() : null;
    }

    @JsonIgnore
    public EstadoCivilOid getPersonaTMODUSUARIOptpevcEstadoCivil() {
        return this.personaTMODUSUARIOptpevcEstadoCivil;
    }
    
    public void setPersonaTMODUSUARIOptpevcEstadoCivil(EstadoCivilOid personaTMODUSUARIOptpevcEstadoCivil) {
        this.personaTMODUSUARIOptpevcEstadoCivil = personaTMODUSUARIOptpevcEstadoCivil;
    }

    @JsonIgnore
    public EstadoCivil getPersonaTMODUSUARIOptpevcEstadoCivilInstance() {
        return this.personaTMODUSUARIOptpevcEstadoCivilInstance;
    }
    
    public void setPersonaTMODUSUARIOptpevcEstadoCivilInstance(EstadoCivil personaTMODUSUARIOptpevcEstadoCivil) {
        this.personaTMODUSUARIOptpevcEstadoCivilInstance = personaTMODUSUARIOptpevcEstadoCivil;
        this.personaTMODUSUARIOptpevcEstadoCivil = personaTMODUSUARIOptpevcEstadoCivil != null ? personaTMODUSUARIOptpevcEstadoCivil.getOid() : null;
    }

    @JsonIgnore
    public String getPersonaTMODUSUARIOptpDireccionCompleta() {
        return this.personaTMODUSUARIOptpDireccionCompleta;
    }
    
    public void setPersonaTMODUSUARIOptpDireccionCompleta(String personaTMODUSUARIOptpDireccionCompleta) {
        this.personaTMODUSUARIOptpDireccionCompleta = personaTMODUSUARIOptpDireccionCompleta;
    }

    @JsonIgnore
    public Boolean getPersonaTMODUSUARIOptpRural() {
        return this.personaTMODUSUARIOptpRural;
    }
    
    public void setPersonaTMODUSUARIOptpRural(Boolean personaTMODUSUARIOptpRural) {
        this.personaTMODUSUARIOptpRural = personaTMODUSUARIOptpRural;
    }

    @JsonIgnore
    public TipoDireccionOid getPersonaTMODUSUARIOptpevcTipoDireccion() {
        return this.personaTMODUSUARIOptpevcTipoDireccion;
    }
    
    public void setPersonaTMODUSUARIOptpevcTipoDireccion(TipoDireccionOid personaTMODUSUARIOptpevcTipoDireccion) {
        this.personaTMODUSUARIOptpevcTipoDireccion = personaTMODUSUARIOptpevcTipoDireccion;
    }

    @JsonIgnore
    public TipoDireccion getPersonaTMODUSUARIOptpevcTipoDireccionInstance() {
        return this.personaTMODUSUARIOptpevcTipoDireccionInstance;
    }
    
    public void setPersonaTMODUSUARIOptpevcTipoDireccionInstance(TipoDireccion personaTMODUSUARIOptpevcTipoDireccion) {
        this.personaTMODUSUARIOptpevcTipoDireccionInstance = personaTMODUSUARIOptpevcTipoDireccion;
        this.personaTMODUSUARIOptpevcTipoDireccion = personaTMODUSUARIOptpevcTipoDireccion != null ? personaTMODUSUARIOptpevcTipoDireccion.getOid() : null;
    }

    @JsonIgnore
    public DepartamentoOid getPersonaTMODUSUARIOptpevcDepartamento() {
        return this.personaTMODUSUARIOptpevcDepartamento;
    }
    
    public void setPersonaTMODUSUARIOptpevcDepartamento(DepartamentoOid personaTMODUSUARIOptpevcDepartamento) {
        this.personaTMODUSUARIOptpevcDepartamento = personaTMODUSUARIOptpevcDepartamento;
    }

    @JsonIgnore
    public Departamento getPersonaTMODUSUARIOptpevcDepartamentoInstance() {
        return this.personaTMODUSUARIOptpevcDepartamentoInstance;
    }
    
    public void setPersonaTMODUSUARIOptpevcDepartamentoInstance(Departamento personaTMODUSUARIOptpevcDepartamento) {
        this.personaTMODUSUARIOptpevcDepartamentoInstance = personaTMODUSUARIOptpevcDepartamento;
        this.personaTMODUSUARIOptpevcDepartamento = personaTMODUSUARIOptpevcDepartamento != null ? personaTMODUSUARIOptpevcDepartamento.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getPersonaTMODUSUARIOptpevcMunicipio() {
        return this.personaTMODUSUARIOptpevcMunicipio;
    }
    
    public void setPersonaTMODUSUARIOptpevcMunicipio(MunicipioOid personaTMODUSUARIOptpevcMunicipio) {
        this.personaTMODUSUARIOptpevcMunicipio = personaTMODUSUARIOptpevcMunicipio;
    }

    @JsonIgnore
    public Municipio getPersonaTMODUSUARIOptpevcMunicipioInstance() {
        return this.personaTMODUSUARIOptpevcMunicipioInstance;
    }
    
    public void setPersonaTMODUSUARIOptpevcMunicipioInstance(Municipio personaTMODUSUARIOptpevcMunicipio) {
        this.personaTMODUSUARIOptpevcMunicipioInstance = personaTMODUSUARIOptpevcMunicipio;
        this.personaTMODUSUARIOptpevcMunicipio = personaTMODUSUARIOptpevcMunicipio != null ? personaTMODUSUARIOptpevcMunicipio.getOid() : null;
    }

    @JsonIgnore
    public String getPersonaTMODUSUARIOptpNumIdentificacion() {
        return this.personaTMODUSUARIOptpNumIdentificacion;
    }
    
    public void setPersonaTMODUSUARIOptpNumIdentificacion(String personaTMODUSUARIOptpNumIdentificacion) {
        this.personaTMODUSUARIOptpNumIdentificacion = personaTMODUSUARIOptpNumIdentificacion;
    }

    private void checkPersonaTMODUSUARIOptpNumIdentificacion() throws NotNullArgumentException {
        if(this.getPersonaTMODUSUARIOptpNumIdentificacion() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TMODUSUARIO, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TMODUSUARIO_PERSONATMODUSUARIOPTPNUMIDENTIFICACION, PersonaConstants.SERV_ALIAS_TMODUSUARIO, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TMODUSUARIO_PERSONATMODUSUARIOPTPNUMIDENTIFICACION);
        }
    }

    @JsonIgnore
    public TipoIdentificacionOid getPersonaTMODUSUARIOptpevcTipoIdentificacion() {
        return this.personaTMODUSUARIOptpevcTipoIdentificacion;
    }
    
    public void setPersonaTMODUSUARIOptpevcTipoIdentificacion(TipoIdentificacionOid personaTMODUSUARIOptpevcTipoIdentificacion) {
        this.personaTMODUSUARIOptpevcTipoIdentificacion = personaTMODUSUARIOptpevcTipoIdentificacion;
    }

    @JsonIgnore
    public TipoIdentificacion getPersonaTMODUSUARIOptpevcTipoIdentificacionInstance() {
        return this.personaTMODUSUARIOptpevcTipoIdentificacionInstance;
    }
    
    public void setPersonaTMODUSUARIOptpevcTipoIdentificacionInstance(TipoIdentificacion personaTMODUSUARIOptpevcTipoIdentificacion) {
        this.personaTMODUSUARIOptpevcTipoIdentificacionInstance = personaTMODUSUARIOptpevcTipoIdentificacion;
        this.personaTMODUSUARIOptpevcTipoIdentificacion = personaTMODUSUARIOptpevcTipoIdentificacion != null ? personaTMODUSUARIOptpevcTipoIdentificacion.getOid() : null;
    }

    private void checkPersonaTMODUSUARIOptpevcTipoIdentificacion() throws NotNullArgumentException {
        if(this.getPersonaTMODUSUARIOptpevcTipoIdentificacionInstance() == null || this.getPersonaTMODUSUARIOptpevcTipoIdentificacionInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TMODUSUARIO, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TMODUSUARIO_PERSONATMODUSUARIOPTPEVCTIPOIDENTIFICACION, PersonaConstants.SERV_ALIAS_TMODUSUARIO, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TMODUSUARIO_PERSONATMODUSUARIOPTPEVCTIPOIDENTIFICACION);
        }
    }

    @JsonIgnore
    public PaisOid getPersonaTMODUSUARIOptpagrPais() {
        return this.personaTMODUSUARIOptpagrPais;
    }
    
    public void setPersonaTMODUSUARIOptpagrPais(PaisOid personaTMODUSUARIOptpagrPais) {
        this.personaTMODUSUARIOptpagrPais = personaTMODUSUARIOptpagrPais;
    }

    @JsonIgnore
    public Pais getPersonaTMODUSUARIOptpagrPaisInstance() {
        return this.personaTMODUSUARIOptpagrPaisInstance;
    }
    
    public void setPersonaTMODUSUARIOptpagrPaisInstance(Pais personaTMODUSUARIOptpagrPais) {
        this.personaTMODUSUARIOptpagrPaisInstance = personaTMODUSUARIOptpagrPais;
        this.personaTMODUSUARIOptpagrPais = personaTMODUSUARIOptpagrPais != null ? personaTMODUSUARIOptpagrPais.getOid() : null;
    }

    @JsonIgnore
    public String getPreconditionId() {
        return this.preconditionId;
    }
    
    public void setPreconditionId(String preconditionId) {
        this.preconditionId = preconditionId;
    }
}
