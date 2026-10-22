package com.keralty.aepersonas.viewmodel.persona.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.EstadoCivil;
import com.keralty.aepersonas.persistence.EstadoPersona;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.EstadoPersonaOid;
import com.keralty.aepersonas.persistence.oid.PaisOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Pais;
import com.keralty.aepersonas.persistence.Solicitud;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneDeserializer;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneSerializer;
import java.sql.Date;

public class TADDUSUARIOASOLRequest {

    @JsonProperty("pt_p_agrtipoidentificacion_json")
    private String personaTADDUSUARIOASOLptpagrTipoIdentificacion;
    
    @JsonIgnore
    private TipoIdentificacion personaTADDUSUARIOASOLptpagrTipoIdentificacionInstance;

    @JsonProperty("pt_p_agrdepartamentonacimiento_json")
    private String personaTADDUSUARIOASOLptpagrDepartamentoNacimiento;
    
    @JsonIgnore
    private Departamento personaTADDUSUARIOASOLptpagrDepartamentoNacimientoInstance;

    @JsonProperty("pt_p_agrmunicipionacimiento_json")
    private String personaTADDUSUARIOASOLptpagrMunicipioNacimiento;
    
    @JsonIgnore
    private Municipio personaTADDUSUARIOASOLptpagrMunicipioNacimientoInstance;

    @JsonProperty("pt_p_agrestadocivil_json")
    private String personaTADDUSUARIOASOLptpagrEstadoCivil;
    
    @JsonIgnore
    private EstadoCivil personaTADDUSUARIOASOLptpagrEstadoCivilInstance;

    @JsonProperty("pt_p_atrnumidentificacion")
    private String personaTADDUSUARIOASOLptpatrNumIdentificacion;

    @JsonProperty("pt_p_atrprimernombre")
    private String personaTADDUSUARIOASOLptpatrPrimerNombre;

    @JsonProperty("pt_p_atrsegundonombre")
    private String personaTADDUSUARIOASOLptpatrSegundoNombre;

    @JsonProperty("pt_p_atrprimerapellido")
    private String personaTADDUSUARIOASOLptpatrPrimerApellido;

    @JsonProperty("pt_p_atrsegundoapellido")
    private String personaTADDUSUARIOASOLptpatrSegundoApellido;

    @JsonProperty("pt_p_atrfechanacimiento")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date personaTADDUSUARIOASOLptpatrFechaNacimiento;

    @JsonProperty("pt_p_atrgenero")
    private String personaTADDUSUARIOASOLptpatrGenero;

    @JsonProperty("pt_p_atrindicadorextranjero")
    private Boolean personaTADDUSUARIOASOLptpatrIndicadorExtranjero;

    @JsonProperty("pt_p_atrtelefonofijo")
    private String personaTADDUSUARIOASOLptpatrTelefonoFijo;

    @JsonProperty("pt_p_atrtelefonocelular")
    private String personaTADDUSUARIOASOLptpatrTelefonoCelular;

    @JsonProperty("pt_p_atrcorreoelectronico")
    private String personaTADDUSUARIOASOLptpatrCorreoElectronico;

    @JsonProperty("pt_p_agrdepartamento_json")
    private String personaTADDUSUARIOASOLptpagrDepartamento;
    
    @JsonIgnore
    private Departamento personaTADDUSUARIOASOLptpagrDepartamentoInstance;

    @JsonProperty("pt_p_agrmunicipio_json")
    private String personaTADDUSUARIOASOLptpagrMunicipio;
    
    @JsonIgnore
    private Municipio personaTADDUSUARIOASOLptpagrMunicipioInstance;

    @JsonProperty("pt_p_atrdireccioncompleta")
    private String personaTADDUSUARIOASOLptpatrDireccionCompleta;

    @JsonProperty("pt_p_atrrural")
    private Boolean personaTADDUSUARIOASOLptpatrRural;

    @JsonProperty("pt_p_codigo")
    private Long personaTADDUSUARIOASOLptpCodigo;

    @JsonProperty("pt_p_tieneepssanitas")
    private Boolean personaTADDUSUARIOASOLptpTieneEPSSanitas;

    @JsonProperty("pt_p_rechazadoafiliacion")
    private String personaTADDUSUARIOASOLptpRechazadoAfiliacion;

    @JsonProperty("pt_p_agrpais_oid")
    private PaisOid personaTADDUSUARIOASOLptpagrPais;
    
    @JsonIgnore
    private Pais personaTADDUSUARIOASOLptpagrPaisInstance;

    @JsonProperty("ptsolicitud_oid")
    private SolicitudOid personaTADDUSUARIOASOLptSolicitud;
    
    @JsonIgnore
    private Solicitud personaTADDUSUARIOASOLptSolicitudInstance;

    @JsonProperty("ptdireccionestitular_json")
    private String personaTADDUSUARIOASOLptDireccionesTitular;
    
    @JsonIgnore
    private Direccion personaTADDUSUARIOASOLptDireccionesTitularInstance;

    @JsonProperty("ptreplicardireccion")
    private Boolean personaTADDUSUARIOASOLptReplicarDireccion;

    @JsonProperty("ptdireccionesxclass")
    private String personaTADDUSUARIOASOLptDireccionesXClass;

    @JsonProperty("ptestadopersona_oid")
    private EstadoPersonaOid personaTADDUSUARIOASOLptEstadoPersona;
    
    @JsonIgnore
    private EstadoPersona personaTADDUSUARIOASOLptEstadoPersonaInstance;

    @JsonProperty("preconditionId")
    private String preconditionId;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonaTADDUSUARIOASOLptpagrTipoIdentificacion();
        checkPersonaTADDUSUARIOASOLptpagrEstadoCivil();
        checkPersonaTADDUSUARIOASOLptpatrNumIdentificacion();
        checkPersonaTADDUSUARIOASOLptpatrPrimerNombre();
        checkPersonaTADDUSUARIOASOLptpatrPrimerApellido();
        checkPersonaTADDUSUARIOASOLptpatrFechaNacimiento();
        checkPersonaTADDUSUARIOASOLptpatrGenero();
        checkPersonaTADDUSUARIOASOLptpatrIndicadorExtranjero();
        checkPersonaTADDUSUARIOASOLptpagrDepartamento();
        checkPersonaTADDUSUARIOASOLptpagrMunicipio();
        checkPersonaTADDUSUARIOASOLptpatrDireccionCompleta();
        checkPersonaTADDUSUARIOASOLptpatrRural();
        checkPersonaTADDUSUARIOASOLptpTieneEPSSanitas();
        checkPersonaTADDUSUARIOASOLptSolicitud();
        checkPersonaTADDUSUARIOASOLptReplicarDireccion();
    }

    @JsonIgnore
    public String getPersonaTADDUSUARIOASOLptpagrTipoIdentificacion() {
        return this.personaTADDUSUARIOASOLptpagrTipoIdentificacion;
    }
    
    public void setPersonaTADDUSUARIOASOLptpagrTipoIdentificacion(String personaTADDUSUARIOASOLptpagrTipoIdentificacion) {
        this.personaTADDUSUARIOASOLptpagrTipoIdentificacion = personaTADDUSUARIOASOLptpagrTipoIdentificacion;
    }

    @JsonIgnore
    public TipoIdentificacion getPersonaTADDUSUARIOASOLptpagrTipoIdentificacionInstance() {
        return this.personaTADDUSUARIOASOLptpagrTipoIdentificacionInstance;
    }
    
    public void setPersonaTADDUSUARIOASOLptpagrTipoIdentificacionInstance(TipoIdentificacion personaTADDUSUARIOASOLptpagrTipoIdentificacion) {
        this.personaTADDUSUARIOASOLptpagrTipoIdentificacionInstance = personaTADDUSUARIOASOLptpagrTipoIdentificacion;
        this.personaTADDUSUARIOASOLptpagrTipoIdentificacion = personaTADDUSUARIOASOLptpagrTipoIdentificacion != null ? personaTADDUSUARIOASOLptpagrTipoIdentificacion.getOid().toJson() : "";
    }

    private void checkPersonaTADDUSUARIOASOLptpagrTipoIdentificacion() throws NotNullArgumentException {
        if(this.getPersonaTADDUSUARIOASOLptpagrTipoIdentificacionInstance() == null || this.getPersonaTADDUSUARIOASOLptpagrTipoIdentificacionInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TADDUSUARIOASOL, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPAGRTIPOIDENTIFICACION, PersonaConstants.SERV_ALIAS_TADDUSUARIOASOL, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPAGRTIPOIDENTIFICACION);
        }
    }

    @JsonIgnore
    public String getPersonaTADDUSUARIOASOLptpagrDepartamentoNacimiento() {
        return this.personaTADDUSUARIOASOLptpagrDepartamentoNacimiento;
    }
    
    public void setPersonaTADDUSUARIOASOLptpagrDepartamentoNacimiento(String personaTADDUSUARIOASOLptpagrDepartamentoNacimiento) {
        this.personaTADDUSUARIOASOLptpagrDepartamentoNacimiento = personaTADDUSUARIOASOLptpagrDepartamentoNacimiento;
    }

    @JsonIgnore
    public Departamento getPersonaTADDUSUARIOASOLptpagrDepartamentoNacimientoInstance() {
        return this.personaTADDUSUARIOASOLptpagrDepartamentoNacimientoInstance;
    }
    
    public void setPersonaTADDUSUARIOASOLptpagrDepartamentoNacimientoInstance(Departamento personaTADDUSUARIOASOLptpagrDepartamentoNacimiento) {
        this.personaTADDUSUARIOASOLptpagrDepartamentoNacimientoInstance = personaTADDUSUARIOASOLptpagrDepartamentoNacimiento;
        this.personaTADDUSUARIOASOLptpagrDepartamentoNacimiento = personaTADDUSUARIOASOLptpagrDepartamentoNacimiento != null ? personaTADDUSUARIOASOLptpagrDepartamentoNacimiento.getOid().toJson() : "";
    }

    @JsonIgnore
    public String getPersonaTADDUSUARIOASOLptpagrMunicipioNacimiento() {
        return this.personaTADDUSUARIOASOLptpagrMunicipioNacimiento;
    }
    
    public void setPersonaTADDUSUARIOASOLptpagrMunicipioNacimiento(String personaTADDUSUARIOASOLptpagrMunicipioNacimiento) {
        this.personaTADDUSUARIOASOLptpagrMunicipioNacimiento = personaTADDUSUARIOASOLptpagrMunicipioNacimiento;
    }

    @JsonIgnore
    public Municipio getPersonaTADDUSUARIOASOLptpagrMunicipioNacimientoInstance() {
        return this.personaTADDUSUARIOASOLptpagrMunicipioNacimientoInstance;
    }
    
    public void setPersonaTADDUSUARIOASOLptpagrMunicipioNacimientoInstance(Municipio personaTADDUSUARIOASOLptpagrMunicipioNacimiento) {
        this.personaTADDUSUARIOASOLptpagrMunicipioNacimientoInstance = personaTADDUSUARIOASOLptpagrMunicipioNacimiento;
        this.personaTADDUSUARIOASOLptpagrMunicipioNacimiento = personaTADDUSUARIOASOLptpagrMunicipioNacimiento != null ? personaTADDUSUARIOASOLptpagrMunicipioNacimiento.getOid().toJson() : "";
    }

    @JsonIgnore
    public String getPersonaTADDUSUARIOASOLptpagrEstadoCivil() {
        return this.personaTADDUSUARIOASOLptpagrEstadoCivil;
    }
    
    public void setPersonaTADDUSUARIOASOLptpagrEstadoCivil(String personaTADDUSUARIOASOLptpagrEstadoCivil) {
        this.personaTADDUSUARIOASOLptpagrEstadoCivil = personaTADDUSUARIOASOLptpagrEstadoCivil;
    }

    @JsonIgnore
    public EstadoCivil getPersonaTADDUSUARIOASOLptpagrEstadoCivilInstance() {
        return this.personaTADDUSUARIOASOLptpagrEstadoCivilInstance;
    }
    
    public void setPersonaTADDUSUARIOASOLptpagrEstadoCivilInstance(EstadoCivil personaTADDUSUARIOASOLptpagrEstadoCivil) {
        this.personaTADDUSUARIOASOLptpagrEstadoCivilInstance = personaTADDUSUARIOASOLptpagrEstadoCivil;
        this.personaTADDUSUARIOASOLptpagrEstadoCivil = personaTADDUSUARIOASOLptpagrEstadoCivil != null ? personaTADDUSUARIOASOLptpagrEstadoCivil.getOid().toJson() : "";
    }

    private void checkPersonaTADDUSUARIOASOLptpagrEstadoCivil() throws NotNullArgumentException {
        if(this.getPersonaTADDUSUARIOASOLptpagrEstadoCivilInstance() == null || this.getPersonaTADDUSUARIOASOLptpagrEstadoCivilInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TADDUSUARIOASOL, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPAGRESTADOCIVIL, PersonaConstants.SERV_ALIAS_TADDUSUARIOASOL, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPAGRESTADOCIVIL);
        }
    }

    @JsonIgnore
    public String getPersonaTADDUSUARIOASOLptpatrNumIdentificacion() {
        return this.personaTADDUSUARIOASOLptpatrNumIdentificacion;
    }
    
    public void setPersonaTADDUSUARIOASOLptpatrNumIdentificacion(String personaTADDUSUARIOASOLptpatrNumIdentificacion) {
        this.personaTADDUSUARIOASOLptpatrNumIdentificacion = personaTADDUSUARIOASOLptpatrNumIdentificacion;
    }

    private void checkPersonaTADDUSUARIOASOLptpatrNumIdentificacion() throws NotNullArgumentException {
        if(this.getPersonaTADDUSUARIOASOLptpatrNumIdentificacion() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TADDUSUARIOASOL, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRNUMIDENTIFICACION, PersonaConstants.SERV_ALIAS_TADDUSUARIOASOL, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRNUMIDENTIFICACION);
        }
    }

    @JsonIgnore
    public String getPersonaTADDUSUARIOASOLptpatrPrimerNombre() {
        return this.personaTADDUSUARIOASOLptpatrPrimerNombre;
    }
    
    public void setPersonaTADDUSUARIOASOLptpatrPrimerNombre(String personaTADDUSUARIOASOLptpatrPrimerNombre) {
        this.personaTADDUSUARIOASOLptpatrPrimerNombre = personaTADDUSUARIOASOLptpatrPrimerNombre;
    }

    private void checkPersonaTADDUSUARIOASOLptpatrPrimerNombre() throws NotNullArgumentException {
        if(this.getPersonaTADDUSUARIOASOLptpatrPrimerNombre() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TADDUSUARIOASOL, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRPRIMERNOMBRE, PersonaConstants.SERV_ALIAS_TADDUSUARIOASOL, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRPRIMERNOMBRE);
        }
    }

    @JsonIgnore
    public String getPersonaTADDUSUARIOASOLptpatrSegundoNombre() {
        return this.personaTADDUSUARIOASOLptpatrSegundoNombre;
    }
    
    public void setPersonaTADDUSUARIOASOLptpatrSegundoNombre(String personaTADDUSUARIOASOLptpatrSegundoNombre) {
        this.personaTADDUSUARIOASOLptpatrSegundoNombre = personaTADDUSUARIOASOLptpatrSegundoNombre;
    }

    @JsonIgnore
    public String getPersonaTADDUSUARIOASOLptpatrPrimerApellido() {
        return this.personaTADDUSUARIOASOLptpatrPrimerApellido;
    }
    
    public void setPersonaTADDUSUARIOASOLptpatrPrimerApellido(String personaTADDUSUARIOASOLptpatrPrimerApellido) {
        this.personaTADDUSUARIOASOLptpatrPrimerApellido = personaTADDUSUARIOASOLptpatrPrimerApellido;
    }

    private void checkPersonaTADDUSUARIOASOLptpatrPrimerApellido() throws NotNullArgumentException {
        if(this.getPersonaTADDUSUARIOASOLptpatrPrimerApellido() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TADDUSUARIOASOL, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRPRIMERAPELLIDO, PersonaConstants.SERV_ALIAS_TADDUSUARIOASOL, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRPRIMERAPELLIDO);
        }
    }

    @JsonIgnore
    public String getPersonaTADDUSUARIOASOLptpatrSegundoApellido() {
        return this.personaTADDUSUARIOASOLptpatrSegundoApellido;
    }
    
    public void setPersonaTADDUSUARIOASOLptpatrSegundoApellido(String personaTADDUSUARIOASOLptpatrSegundoApellido) {
        this.personaTADDUSUARIOASOLptpatrSegundoApellido = personaTADDUSUARIOASOLptpatrSegundoApellido;
    }

    @JsonIgnore
    public Date getPersonaTADDUSUARIOASOLptpatrFechaNacimiento() {
        return this.personaTADDUSUARIOASOLptpatrFechaNacimiento;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setPersonaTADDUSUARIOASOLptpatrFechaNacimiento(Date personaTADDUSUARIOASOLptpatrFechaNacimiento) {
        this.personaTADDUSUARIOASOLptpatrFechaNacimiento = personaTADDUSUARIOASOLptpatrFechaNacimiento;
    }

    private void checkPersonaTADDUSUARIOASOLptpatrFechaNacimiento() throws NotNullArgumentException {
        if(this.getPersonaTADDUSUARIOASOLptpatrFechaNacimiento() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TADDUSUARIOASOL, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRFECHANACIMIENTO, PersonaConstants.SERV_ALIAS_TADDUSUARIOASOL, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRFECHANACIMIENTO);
        }
    }

    @JsonIgnore
    public String getPersonaTADDUSUARIOASOLptpatrGenero() {
        return this.personaTADDUSUARIOASOLptpatrGenero;
    }
    
    public void setPersonaTADDUSUARIOASOLptpatrGenero(String personaTADDUSUARIOASOLptpatrGenero) {
        this.personaTADDUSUARIOASOLptpatrGenero = personaTADDUSUARIOASOLptpatrGenero;
    }

    private void checkPersonaTADDUSUARIOASOLptpatrGenero() throws NotNullArgumentException {
        if(this.getPersonaTADDUSUARIOASOLptpatrGenero() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TADDUSUARIOASOL, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRGENERO, PersonaConstants.SERV_ALIAS_TADDUSUARIOASOL, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRGENERO);
        }
    }

    @JsonIgnore
    public Boolean getPersonaTADDUSUARIOASOLptpatrIndicadorExtranjero() {
        return this.personaTADDUSUARIOASOLptpatrIndicadorExtranjero;
    }
    
    public void setPersonaTADDUSUARIOASOLptpatrIndicadorExtranjero(Boolean personaTADDUSUARIOASOLptpatrIndicadorExtranjero) {
        this.personaTADDUSUARIOASOLptpatrIndicadorExtranjero = personaTADDUSUARIOASOLptpatrIndicadorExtranjero;
    }

    private void checkPersonaTADDUSUARIOASOLptpatrIndicadorExtranjero() throws NotNullArgumentException {
        if(this.getPersonaTADDUSUARIOASOLptpatrIndicadorExtranjero() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TADDUSUARIOASOL, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRINDICADOREXTRANJERO, PersonaConstants.SERV_ALIAS_TADDUSUARIOASOL, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRINDICADOREXTRANJERO);
        }
    }

    @JsonIgnore
    public String getPersonaTADDUSUARIOASOLptpatrTelefonoFijo() {
        return this.personaTADDUSUARIOASOLptpatrTelefonoFijo;
    }
    
    public void setPersonaTADDUSUARIOASOLptpatrTelefonoFijo(String personaTADDUSUARIOASOLptpatrTelefonoFijo) {
        this.personaTADDUSUARIOASOLptpatrTelefonoFijo = personaTADDUSUARIOASOLptpatrTelefonoFijo;
    }

    @JsonIgnore
    public String getPersonaTADDUSUARIOASOLptpatrTelefonoCelular() {
        return this.personaTADDUSUARIOASOLptpatrTelefonoCelular;
    }
    
    public void setPersonaTADDUSUARIOASOLptpatrTelefonoCelular(String personaTADDUSUARIOASOLptpatrTelefonoCelular) {
        this.personaTADDUSUARIOASOLptpatrTelefonoCelular = personaTADDUSUARIOASOLptpatrTelefonoCelular;
    }

    @JsonIgnore
    public String getPersonaTADDUSUARIOASOLptpatrCorreoElectronico() {
        return this.personaTADDUSUARIOASOLptpatrCorreoElectronico;
    }
    
    public void setPersonaTADDUSUARIOASOLptpatrCorreoElectronico(String personaTADDUSUARIOASOLptpatrCorreoElectronico) {
        this.personaTADDUSUARIOASOLptpatrCorreoElectronico = personaTADDUSUARIOASOLptpatrCorreoElectronico;
    }

    @JsonIgnore
    public String getPersonaTADDUSUARIOASOLptpagrDepartamento() {
        return this.personaTADDUSUARIOASOLptpagrDepartamento;
    }
    
    public void setPersonaTADDUSUARIOASOLptpagrDepartamento(String personaTADDUSUARIOASOLptpagrDepartamento) {
        this.personaTADDUSUARIOASOLptpagrDepartamento = personaTADDUSUARIOASOLptpagrDepartamento;
    }

    @JsonIgnore
    public Departamento getPersonaTADDUSUARIOASOLptpagrDepartamentoInstance() {
        return this.personaTADDUSUARIOASOLptpagrDepartamentoInstance;
    }
    
    public void setPersonaTADDUSUARIOASOLptpagrDepartamentoInstance(Departamento personaTADDUSUARIOASOLptpagrDepartamento) {
        this.personaTADDUSUARIOASOLptpagrDepartamentoInstance = personaTADDUSUARIOASOLptpagrDepartamento;
        this.personaTADDUSUARIOASOLptpagrDepartamento = personaTADDUSUARIOASOLptpagrDepartamento != null ? personaTADDUSUARIOASOLptpagrDepartamento.getOid().toJson() : "";
    }

    private void checkPersonaTADDUSUARIOASOLptpagrDepartamento() throws NotNullArgumentException {
        if(this.getPersonaTADDUSUARIOASOLptpagrDepartamentoInstance() == null || this.getPersonaTADDUSUARIOASOLptpagrDepartamentoInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TADDUSUARIOASOL, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPAGRDEPARTAMENTO, PersonaConstants.SERV_ALIAS_TADDUSUARIOASOL, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPAGRDEPARTAMENTO);
        }
    }

    @JsonIgnore
    public String getPersonaTADDUSUARIOASOLptpagrMunicipio() {
        return this.personaTADDUSUARIOASOLptpagrMunicipio;
    }
    
    public void setPersonaTADDUSUARIOASOLptpagrMunicipio(String personaTADDUSUARIOASOLptpagrMunicipio) {
        this.personaTADDUSUARIOASOLptpagrMunicipio = personaTADDUSUARIOASOLptpagrMunicipio;
    }

    @JsonIgnore
    public Municipio getPersonaTADDUSUARIOASOLptpagrMunicipioInstance() {
        return this.personaTADDUSUARIOASOLptpagrMunicipioInstance;
    }
    
    public void setPersonaTADDUSUARIOASOLptpagrMunicipioInstance(Municipio personaTADDUSUARIOASOLptpagrMunicipio) {
        this.personaTADDUSUARIOASOLptpagrMunicipioInstance = personaTADDUSUARIOASOLptpagrMunicipio;
        this.personaTADDUSUARIOASOLptpagrMunicipio = personaTADDUSUARIOASOLptpagrMunicipio != null ? personaTADDUSUARIOASOLptpagrMunicipio.getOid().toJson() : "";
    }

    private void checkPersonaTADDUSUARIOASOLptpagrMunicipio() throws NotNullArgumentException {
        if(this.getPersonaTADDUSUARIOASOLptpagrMunicipioInstance() == null || this.getPersonaTADDUSUARIOASOLptpagrMunicipioInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TADDUSUARIOASOL, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPAGRMUNICIPIO, PersonaConstants.SERV_ALIAS_TADDUSUARIOASOL, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPAGRMUNICIPIO);
        }
    }

    @JsonIgnore
    public String getPersonaTADDUSUARIOASOLptpatrDireccionCompleta() {
        return this.personaTADDUSUARIOASOLptpatrDireccionCompleta;
    }
    
    public void setPersonaTADDUSUARIOASOLptpatrDireccionCompleta(String personaTADDUSUARIOASOLptpatrDireccionCompleta) {
        this.personaTADDUSUARIOASOLptpatrDireccionCompleta = personaTADDUSUARIOASOLptpatrDireccionCompleta;
    }

    private void checkPersonaTADDUSUARIOASOLptpatrDireccionCompleta() throws NotNullArgumentException {
        if(this.getPersonaTADDUSUARIOASOLptpatrDireccionCompleta() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TADDUSUARIOASOL, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRDIRECCIONCOMPLETA, PersonaConstants.SERV_ALIAS_TADDUSUARIOASOL, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRDIRECCIONCOMPLETA);
        }
    }

    @JsonIgnore
    public Boolean getPersonaTADDUSUARIOASOLptpatrRural() {
        return this.personaTADDUSUARIOASOLptpatrRural;
    }
    
    public void setPersonaTADDUSUARIOASOLptpatrRural(Boolean personaTADDUSUARIOASOLptpatrRural) {
        this.personaTADDUSUARIOASOLptpatrRural = personaTADDUSUARIOASOLptpatrRural;
    }

    private void checkPersonaTADDUSUARIOASOLptpatrRural() throws NotNullArgumentException {
        if(this.getPersonaTADDUSUARIOASOLptpatrRural() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TADDUSUARIOASOL, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRRURAL, PersonaConstants.SERV_ALIAS_TADDUSUARIOASOL, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPATRRURAL);
        }
    }

    @JsonIgnore
    public Long getPersonaTADDUSUARIOASOLptpCodigo() {
        return this.personaTADDUSUARIOASOLptpCodigo;
    }
    
    public void setPersonaTADDUSUARIOASOLptpCodigo(Long personaTADDUSUARIOASOLptpCodigo) {
        this.personaTADDUSUARIOASOLptpCodigo = personaTADDUSUARIOASOLptpCodigo;
    }

    @JsonIgnore
    public Boolean getPersonaTADDUSUARIOASOLptpTieneEPSSanitas() {
        return this.personaTADDUSUARIOASOLptpTieneEPSSanitas;
    }
    
    public void setPersonaTADDUSUARIOASOLptpTieneEPSSanitas(Boolean personaTADDUSUARIOASOLptpTieneEPSSanitas) {
        this.personaTADDUSUARIOASOLptpTieneEPSSanitas = personaTADDUSUARIOASOLptpTieneEPSSanitas;
    }

    private void checkPersonaTADDUSUARIOASOLptpTieneEPSSanitas() throws NotNullArgumentException {
        if(this.getPersonaTADDUSUARIOASOLptpTieneEPSSanitas() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TADDUSUARIOASOL, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPTIENEEPSSANITAS, PersonaConstants.SERV_ALIAS_TADDUSUARIOASOL, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTPTIENEEPSSANITAS);
        }
    }

    @JsonIgnore
    public String getPersonaTADDUSUARIOASOLptpRechazadoAfiliacion() {
        return this.personaTADDUSUARIOASOLptpRechazadoAfiliacion;
    }
    
    public void setPersonaTADDUSUARIOASOLptpRechazadoAfiliacion(String personaTADDUSUARIOASOLptpRechazadoAfiliacion) {
        this.personaTADDUSUARIOASOLptpRechazadoAfiliacion = personaTADDUSUARIOASOLptpRechazadoAfiliacion;
    }

    @JsonIgnore
    public PaisOid getPersonaTADDUSUARIOASOLptpagrPais() {
        return this.personaTADDUSUARIOASOLptpagrPais;
    }
    
    public void setPersonaTADDUSUARIOASOLptpagrPais(PaisOid personaTADDUSUARIOASOLptpagrPais) {
        this.personaTADDUSUARIOASOLptpagrPais = personaTADDUSUARIOASOLptpagrPais;
    }

    @JsonIgnore
    public Pais getPersonaTADDUSUARIOASOLptpagrPaisInstance() {
        return this.personaTADDUSUARIOASOLptpagrPaisInstance;
    }
    
    public void setPersonaTADDUSUARIOASOLptpagrPaisInstance(Pais personaTADDUSUARIOASOLptpagrPais) {
        this.personaTADDUSUARIOASOLptpagrPaisInstance = personaTADDUSUARIOASOLptpagrPais;
        this.personaTADDUSUARIOASOLptpagrPais = personaTADDUSUARIOASOLptpagrPais != null ? personaTADDUSUARIOASOLptpagrPais.getOid() : null;
    }

    @JsonIgnore
    public SolicitudOid getPersonaTADDUSUARIOASOLptSolicitud() {
        return this.personaTADDUSUARIOASOLptSolicitud;
    }
    
    public void setPersonaTADDUSUARIOASOLptSolicitud(SolicitudOid personaTADDUSUARIOASOLptSolicitud) {
        this.personaTADDUSUARIOASOLptSolicitud = personaTADDUSUARIOASOLptSolicitud;
    }

    @JsonIgnore
    public Solicitud getPersonaTADDUSUARIOASOLptSolicitudInstance() {
        return this.personaTADDUSUARIOASOLptSolicitudInstance;
    }
    
    public void setPersonaTADDUSUARIOASOLptSolicitudInstance(Solicitud personaTADDUSUARIOASOLptSolicitud) {
        this.personaTADDUSUARIOASOLptSolicitudInstance = personaTADDUSUARIOASOLptSolicitud;
        this.personaTADDUSUARIOASOLptSolicitud = personaTADDUSUARIOASOLptSolicitud != null ? personaTADDUSUARIOASOLptSolicitud.getOid() : null;
    }

    private void checkPersonaTADDUSUARIOASOLptSolicitud() throws NotNullArgumentException {
        if(this.getPersonaTADDUSUARIOASOLptSolicitudInstance() == null || this.getPersonaTADDUSUARIOASOLptSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TADDUSUARIOASOL, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTSOLICITUD, PersonaConstants.SERV_ALIAS_TADDUSUARIOASOL, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTSOLICITUD);
        }
    }

    @JsonIgnore
    public String getPersonaTADDUSUARIOASOLptDireccionesTitular() {
        return this.personaTADDUSUARIOASOLptDireccionesTitular;
    }
    
    public void setPersonaTADDUSUARIOASOLptDireccionesTitular(String personaTADDUSUARIOASOLptDireccionesTitular) {
        this.personaTADDUSUARIOASOLptDireccionesTitular = personaTADDUSUARIOASOLptDireccionesTitular;
    }

    @JsonIgnore
    public Direccion getPersonaTADDUSUARIOASOLptDireccionesTitularInstance() {
        return this.personaTADDUSUARIOASOLptDireccionesTitularInstance;
    }
    
    public void setPersonaTADDUSUARIOASOLptDireccionesTitularInstance(Direccion personaTADDUSUARIOASOLptDireccionesTitular) {
        this.personaTADDUSUARIOASOLptDireccionesTitularInstance = personaTADDUSUARIOASOLptDireccionesTitular;
        this.personaTADDUSUARIOASOLptDireccionesTitular = personaTADDUSUARIOASOLptDireccionesTitular != null ? personaTADDUSUARIOASOLptDireccionesTitular.getOid().toJson() : "";
    }

    @JsonIgnore
    public Boolean getPersonaTADDUSUARIOASOLptReplicarDireccion() {
        return this.personaTADDUSUARIOASOLptReplicarDireccion;
    }
    
    public void setPersonaTADDUSUARIOASOLptReplicarDireccion(Boolean personaTADDUSUARIOASOLptReplicarDireccion) {
        this.personaTADDUSUARIOASOLptReplicarDireccion = personaTADDUSUARIOASOLptReplicarDireccion;
    }

    private void checkPersonaTADDUSUARIOASOLptReplicarDireccion() throws NotNullArgumentException {
        if(this.getPersonaTADDUSUARIOASOLptReplicarDireccion() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TADDUSUARIOASOL, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTREPLICARDIRECCION, PersonaConstants.SERV_ALIAS_TADDUSUARIOASOL, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TADDUSUARIOASOL_PERSONATADDUSUARIOASOLPTREPLICARDIRECCION);
        }
    }

    @JsonIgnore
    public String getPersonaTADDUSUARIOASOLptDireccionesXClass() {
        return this.personaTADDUSUARIOASOLptDireccionesXClass;
    }
    
    public void setPersonaTADDUSUARIOASOLptDireccionesXClass(String personaTADDUSUARIOASOLptDireccionesXClass) {
        this.personaTADDUSUARIOASOLptDireccionesXClass = personaTADDUSUARIOASOLptDireccionesXClass;
    }

    @JsonIgnore
    public EstadoPersonaOid getPersonaTADDUSUARIOASOLptEstadoPersona() {
        return this.personaTADDUSUARIOASOLptEstadoPersona;
    }
    
    public void setPersonaTADDUSUARIOASOLptEstadoPersona(EstadoPersonaOid personaTADDUSUARIOASOLptEstadoPersona) {
        this.personaTADDUSUARIOASOLptEstadoPersona = personaTADDUSUARIOASOLptEstadoPersona;
    }

    @JsonIgnore
    public EstadoPersona getPersonaTADDUSUARIOASOLptEstadoPersonaInstance() {
        return this.personaTADDUSUARIOASOLptEstadoPersonaInstance;
    }
    
    public void setPersonaTADDUSUARIOASOLptEstadoPersonaInstance(EstadoPersona personaTADDUSUARIOASOLptEstadoPersona) {
        this.personaTADDUSUARIOASOLptEstadoPersonaInstance = personaTADDUSUARIOASOLptEstadoPersona;
        this.personaTADDUSUARIOASOLptEstadoPersona = personaTADDUSUARIOASOLptEstadoPersona != null ? personaTADDUSUARIOASOLptEstadoPersona.getOid() : null;
    }

    @JsonIgnore
    public String getPreconditionId() {
        return this.preconditionId;
    }
    
    public void setPreconditionId(String preconditionId) {
        this.preconditionId = preconditionId;
    }
}
