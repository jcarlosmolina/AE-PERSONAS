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
import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneDeserializer;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneSerializer;
import java.sql.Date;

public class CrearRequest {

    @JsonProperty("p_agrdepartamentonacimiento_oid")
    private DepartamentoOid personacrearpagrDepartamentoNacimiento;
    
    @JsonIgnore
    private Departamento personacrearpagrDepartamentoNacimientoInstance;

    @JsonProperty("p_agrmunicipionacimiento_oid")
    private MunicipioOid personacrearpagrMunicipioNacimiento;
    
    @JsonIgnore
    private Municipio personacrearpagrMunicipioNacimientoInstance;

    @JsonProperty("p_agrestadocivil_oid")
    private EstadoCivilOid personacrearpagrEstadoCivil;
    
    @JsonIgnore
    private EstadoCivil personacrearpagrEstadoCivilInstance;

    @JsonProperty("p_agrestadopersona_oid")
    private EstadoPersonaOid personacrearpagrEstadoPersona;
    
    @JsonIgnore
    private EstadoPersona personacrearpagrEstadoPersonaInstance;

    @JsonProperty("p_agrtipoidentificacion_oid")
    private TipoIdentificacionOid personacrearpagrTipoIdentificacion;
    
    @JsonIgnore
    private TipoIdentificacion personacrearpagrTipoIdentificacionInstance;

    @JsonProperty("p_atrnumidentificacion")
    private String personacrearpatrNumIdentificacion;

    @JsonProperty("p_atrtipopersona")
    private String personacrearpatrTipoPersona;

    @JsonProperty("p_atrprimernombre")
    private String personacrearpatrPrimerNombre;

    @JsonProperty("p_atrsegundonombre")
    private String personacrearpatrSegundoNombre;

    @JsonProperty("p_atrprimerapellido")
    private String personacrearpatrPrimerApellido;

    @JsonProperty("p_atrsegundoapellido")
    private String personacrearpatrSegundoApellido;

    @JsonProperty("p_atrrazonsocial")
    private String personacrearpatrRazonSocial;

    @JsonProperty("p_atrfechanacimiento")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date personacrearpatrFechaNacimiento;

    @JsonProperty("p_atrgenero")
    private String personacrearpatrGenero;

    @JsonProperty("p_atrindicadorextranjero")
    private Boolean personacrearpatrIndicadorExtranjero;

    @JsonProperty("p_atrtelefonofijo")
    private String personacrearpatrTelefonoFijo;

    @JsonProperty("p_atrtelefonocelular")
    private String personacrearpatrTelefonoCelular;

    @JsonProperty("p_atrcorreoelectronico")
    private String personacrearpatrCorreoElectronico;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonacrearpagrTipoIdentificacion();
        checkPersonacrearpatrNumIdentificacion();
        checkPersonacrearpatrTipoPersona();
    }

    @JsonIgnore
    public DepartamentoOid getPersonacrearpagrDepartamentoNacimiento() {
        return this.personacrearpagrDepartamentoNacimiento;
    }
    
    public void setPersonacrearpagrDepartamentoNacimiento(DepartamentoOid personacrearpagrDepartamentoNacimiento) {
        this.personacrearpagrDepartamentoNacimiento = personacrearpagrDepartamentoNacimiento;
    }

    @JsonIgnore
    public Departamento getPersonacrearpagrDepartamentoNacimientoInstance() {
        return this.personacrearpagrDepartamentoNacimientoInstance;
    }
    
    public void setPersonacrearpagrDepartamentoNacimientoInstance(Departamento personacrearpagrDepartamentoNacimiento) {
        this.personacrearpagrDepartamentoNacimientoInstance = personacrearpagrDepartamentoNacimiento;
        this.personacrearpagrDepartamentoNacimiento = personacrearpagrDepartamentoNacimiento != null ? personacrearpagrDepartamentoNacimiento.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getPersonacrearpagrMunicipioNacimiento() {
        return this.personacrearpagrMunicipioNacimiento;
    }
    
    public void setPersonacrearpagrMunicipioNacimiento(MunicipioOid personacrearpagrMunicipioNacimiento) {
        this.personacrearpagrMunicipioNacimiento = personacrearpagrMunicipioNacimiento;
    }

    @JsonIgnore
    public Municipio getPersonacrearpagrMunicipioNacimientoInstance() {
        return this.personacrearpagrMunicipioNacimientoInstance;
    }
    
    public void setPersonacrearpagrMunicipioNacimientoInstance(Municipio personacrearpagrMunicipioNacimiento) {
        this.personacrearpagrMunicipioNacimientoInstance = personacrearpagrMunicipioNacimiento;
        this.personacrearpagrMunicipioNacimiento = personacrearpagrMunicipioNacimiento != null ? personacrearpagrMunicipioNacimiento.getOid() : null;
    }

    @JsonIgnore
    public EstadoCivilOid getPersonacrearpagrEstadoCivil() {
        return this.personacrearpagrEstadoCivil;
    }
    
    public void setPersonacrearpagrEstadoCivil(EstadoCivilOid personacrearpagrEstadoCivil) {
        this.personacrearpagrEstadoCivil = personacrearpagrEstadoCivil;
    }

    @JsonIgnore
    public EstadoCivil getPersonacrearpagrEstadoCivilInstance() {
        return this.personacrearpagrEstadoCivilInstance;
    }
    
    public void setPersonacrearpagrEstadoCivilInstance(EstadoCivil personacrearpagrEstadoCivil) {
        this.personacrearpagrEstadoCivilInstance = personacrearpagrEstadoCivil;
        this.personacrearpagrEstadoCivil = personacrearpagrEstadoCivil != null ? personacrearpagrEstadoCivil.getOid() : null;
    }

    @JsonIgnore
    public EstadoPersonaOid getPersonacrearpagrEstadoPersona() {
        return this.personacrearpagrEstadoPersona;
    }
    
    public void setPersonacrearpagrEstadoPersona(EstadoPersonaOid personacrearpagrEstadoPersona) {
        this.personacrearpagrEstadoPersona = personacrearpagrEstadoPersona;
    }

    @JsonIgnore
    public EstadoPersona getPersonacrearpagrEstadoPersonaInstance() {
        return this.personacrearpagrEstadoPersonaInstance;
    }
    
    public void setPersonacrearpagrEstadoPersonaInstance(EstadoPersona personacrearpagrEstadoPersona) {
        this.personacrearpagrEstadoPersonaInstance = personacrearpagrEstadoPersona;
        this.personacrearpagrEstadoPersona = personacrearpagrEstadoPersona != null ? personacrearpagrEstadoPersona.getOid() : null;
    }

    @JsonIgnore
    public TipoIdentificacionOid getPersonacrearpagrTipoIdentificacion() {
        return this.personacrearpagrTipoIdentificacion;
    }
    
    public void setPersonacrearpagrTipoIdentificacion(TipoIdentificacionOid personacrearpagrTipoIdentificacion) {
        this.personacrearpagrTipoIdentificacion = personacrearpagrTipoIdentificacion;
    }

    @JsonIgnore
    public TipoIdentificacion getPersonacrearpagrTipoIdentificacionInstance() {
        return this.personacrearpagrTipoIdentificacionInstance;
    }
    
    public void setPersonacrearpagrTipoIdentificacionInstance(TipoIdentificacion personacrearpagrTipoIdentificacion) {
        this.personacrearpagrTipoIdentificacionInstance = personacrearpagrTipoIdentificacion;
        this.personacrearpagrTipoIdentificacion = personacrearpagrTipoIdentificacion != null ? personacrearpagrTipoIdentificacion.getOid() : null;
    }

    private void checkPersonacrearpagrTipoIdentificacion() throws NotNullArgumentException {
        if(this.getPersonacrearpagrTipoIdentificacionInstance() == null || this.getPersonacrearpagrTipoIdentificacionInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_CREAR, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_CREAR_PERSONACREARPAGRTIPOIDENTIFICACION, PersonaConstants.SERV_ALIAS_CREAR, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_CREAR_PERSONACREARPAGRTIPOIDENTIFICACION);
        }
    }

    @JsonIgnore
    public String getPersonacrearpatrNumIdentificacion() {
        return this.personacrearpatrNumIdentificacion;
    }
    
    public void setPersonacrearpatrNumIdentificacion(String personacrearpatrNumIdentificacion) {
        this.personacrearpatrNumIdentificacion = personacrearpatrNumIdentificacion;
    }

    private void checkPersonacrearpatrNumIdentificacion() throws NotNullArgumentException {
        if(this.getPersonacrearpatrNumIdentificacion() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_CREAR, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_CREAR_PERSONACREARPATRNUMIDENTIFICACION, PersonaConstants.SERV_ALIAS_CREAR, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_CREAR_PERSONACREARPATRNUMIDENTIFICACION);
        }
    }

    @JsonIgnore
    public String getPersonacrearpatrTipoPersona() {
        return this.personacrearpatrTipoPersona;
    }
    
    public void setPersonacrearpatrTipoPersona(String personacrearpatrTipoPersona) {
        this.personacrearpatrTipoPersona = personacrearpatrTipoPersona;
    }

    private void checkPersonacrearpatrTipoPersona() throws NotNullArgumentException {
        if(this.getPersonacrearpatrTipoPersona() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_CREAR, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_CREAR_PERSONACREARPATRTIPOPERSONA, PersonaConstants.SERV_ALIAS_CREAR, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_CREAR_PERSONACREARPATRTIPOPERSONA);
        }
    }

    @JsonIgnore
    public String getPersonacrearpatrPrimerNombre() {
        return this.personacrearpatrPrimerNombre;
    }
    
    public void setPersonacrearpatrPrimerNombre(String personacrearpatrPrimerNombre) {
        this.personacrearpatrPrimerNombre = personacrearpatrPrimerNombre;
    }

    @JsonIgnore
    public String getPersonacrearpatrSegundoNombre() {
        return this.personacrearpatrSegundoNombre;
    }
    
    public void setPersonacrearpatrSegundoNombre(String personacrearpatrSegundoNombre) {
        this.personacrearpatrSegundoNombre = personacrearpatrSegundoNombre;
    }

    @JsonIgnore
    public String getPersonacrearpatrPrimerApellido() {
        return this.personacrearpatrPrimerApellido;
    }
    
    public void setPersonacrearpatrPrimerApellido(String personacrearpatrPrimerApellido) {
        this.personacrearpatrPrimerApellido = personacrearpatrPrimerApellido;
    }

    @JsonIgnore
    public String getPersonacrearpatrSegundoApellido() {
        return this.personacrearpatrSegundoApellido;
    }
    
    public void setPersonacrearpatrSegundoApellido(String personacrearpatrSegundoApellido) {
        this.personacrearpatrSegundoApellido = personacrearpatrSegundoApellido;
    }

    @JsonIgnore
    public String getPersonacrearpatrRazonSocial() {
        return this.personacrearpatrRazonSocial;
    }
    
    public void setPersonacrearpatrRazonSocial(String personacrearpatrRazonSocial) {
        this.personacrearpatrRazonSocial = personacrearpatrRazonSocial;
    }

    @JsonIgnore
    public Date getPersonacrearpatrFechaNacimiento() {
        return this.personacrearpatrFechaNacimiento;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setPersonacrearpatrFechaNacimiento(Date personacrearpatrFechaNacimiento) {
        this.personacrearpatrFechaNacimiento = personacrearpatrFechaNacimiento;
    }

    @JsonIgnore
    public String getPersonacrearpatrGenero() {
        return this.personacrearpatrGenero;
    }
    
    public void setPersonacrearpatrGenero(String personacrearpatrGenero) {
        this.personacrearpatrGenero = personacrearpatrGenero;
    }

    @JsonIgnore
    public Boolean getPersonacrearpatrIndicadorExtranjero() {
        return this.personacrearpatrIndicadorExtranjero;
    }
    
    public void setPersonacrearpatrIndicadorExtranjero(Boolean personacrearpatrIndicadorExtranjero) {
        this.personacrearpatrIndicadorExtranjero = personacrearpatrIndicadorExtranjero;
    }

    @JsonIgnore
    public String getPersonacrearpatrTelefonoFijo() {
        return this.personacrearpatrTelefonoFijo;
    }
    
    public void setPersonacrearpatrTelefonoFijo(String personacrearpatrTelefonoFijo) {
        this.personacrearpatrTelefonoFijo = personacrearpatrTelefonoFijo;
    }

    @JsonIgnore
    public String getPersonacrearpatrTelefonoCelular() {
        return this.personacrearpatrTelefonoCelular;
    }
    
    public void setPersonacrearpatrTelefonoCelular(String personacrearpatrTelefonoCelular) {
        this.personacrearpatrTelefonoCelular = personacrearpatrTelefonoCelular;
    }

    @JsonIgnore
    public String getPersonacrearpatrCorreoElectronico() {
        return this.personacrearpatrCorreoElectronico;
    }
    
    public void setPersonacrearpatrCorreoElectronico(String personacrearpatrCorreoElectronico) {
        this.personacrearpatrCorreoElectronico = personacrearpatrCorreoElectronico;
    }
}
