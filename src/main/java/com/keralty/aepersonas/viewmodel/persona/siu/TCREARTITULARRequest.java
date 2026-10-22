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

public class TCREARTITULARRequest {

    @JsonProperty("pt_p_agrtipoidentificacion_oid")
    private TipoIdentificacionOid personaTCREARTITULARptpagrTipoIdentificacion;
    
    @JsonIgnore
    private TipoIdentificacion personaTCREARTITULARptpagrTipoIdentificacionInstance;

    @JsonProperty("pt_p_agrdepartamentonacimiento_oid")
    private DepartamentoOid personaTCREARTITULARptpagrDepartamentoNacimiento;
    
    @JsonIgnore
    private Departamento personaTCREARTITULARptpagrDepartamentoNacimientoInstance;

    @JsonProperty("pt_p_agrmunicipionacimiento_oid")
    private MunicipioOid personaTCREARTITULARptpagrMunicipioNacimiento;
    
    @JsonIgnore
    private Municipio personaTCREARTITULARptpagrMunicipioNacimientoInstance;

    @JsonProperty("pt_p_agrestadocivil_oid")
    private EstadoCivilOid personaTCREARTITULARptpagrEstadoCivil;
    
    @JsonIgnore
    private EstadoCivil personaTCREARTITULARptpagrEstadoCivilInstance;

    @JsonProperty("pt_p_atrnumidentificacion")
    private String personaTCREARTITULARptpatrNumIdentificacion;

    @JsonProperty("pt_p_atrprimernombre")
    private String personaTCREARTITULARptpatrPrimerNombre;

    @JsonProperty("pt_p_atrsegundonombre")
    private String personaTCREARTITULARptpatrSegundoNombre;

    @JsonProperty("pt_p_atrprimerapellido")
    private String personaTCREARTITULARptpatrPrimerApellido;

    @JsonProperty("pt_p_atrsegundoapellido")
    private String personaTCREARTITULARptpatrSegundoApellido;

    @JsonProperty("pt_p_atrfechanacimiento")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date personaTCREARTITULARptpatrFechaNacimiento;

    @JsonProperty("pt_p_atrgenero")
    private String personaTCREARTITULARptpatrGenero;

    @JsonProperty("pt_p_atrindicadorextranjero")
    private Boolean personaTCREARTITULARptpatrIndicadorExtranjero;

    @JsonProperty("pt_p_atrtelefonofijo")
    private String personaTCREARTITULARptpatrTelefonoFijo;

    @JsonProperty("pt_p_atrtelefonocelular")
    private String personaTCREARTITULARptpatrTelefonoCelular;

    @JsonProperty("pt_p_atrcorreoelectronico")
    private String personaTCREARTITULARptpatrCorreoElectronico;

    @JsonProperty("pt_p_agrdepartamento_oid")
    private DepartamentoOid personaTCREARTITULARptpagrDepartamento;
    
    @JsonIgnore
    private Departamento personaTCREARTITULARptpagrDepartamentoInstance;

    @JsonProperty("pt_p_agrmunicipio_oid")
    private MunicipioOid personaTCREARTITULARptpagrMunicipio;
    
    @JsonIgnore
    private Municipio personaTCREARTITULARptpagrMunicipioInstance;

    @JsonProperty("pt_p_atrdireccioncompleta")
    private String personaTCREARTITULARptpatrDireccionCompleta;

    @JsonProperty("pt_p_atrrural")
    private Boolean personaTCREARTITULARptpatrRural;

    @JsonProperty("pt_tipodireccion_oid")
    private TipoDireccionOid personaTCREARTITULARptTipoDireccion;
    
    @JsonIgnore
    private TipoDireccion personaTCREARTITULARptTipoDireccionInstance;

    @JsonProperty("pt_p_agrpais_oid")
    private PaisOid personaTCREARTITULARptpagrPais;
    
    @JsonIgnore
    private Pais personaTCREARTITULARptpagrPaisInstance;

    @JsonProperty("pt_p_codigo")
    private Long personaTCREARTITULARptpCodigo;

    @JsonProperty("pt_p_tieneepssanitas")
    private Boolean personaTCREARTITULARptpTieneEPSSanitas;

    @JsonProperty("pt_p_rechazadoafiliacion")
    private String personaTCREARTITULARptpRechazadoAfiliacion;

    @JsonProperty("ptestadopersona_oid")
    private EstadoPersonaOid personaTCREARTITULARptEstadoPersona;
    
    @JsonIgnore
    private EstadoPersona personaTCREARTITULARptEstadoPersonaInstance;

    @JsonProperty("ptvalidardatos")
    private Boolean personaTCREARTITULARptValidarDatos;

    @JsonProperty("pt_p_atrrazonsocial")
    private String personaTCREARTITULARptpatrRazonSocial;

    @JsonProperty("ptsolicitud_oid")
    private SolicitudOid personaTCREARTITULARptSolicitud;
    
    @JsonIgnore
    private Solicitud personaTCREARTITULARptSolicitudInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonaTCREARTITULARptpagrTipoIdentificacion();
        checkPersonaTCREARTITULARptpatrNumIdentificacion();
        checkPersonaTCREARTITULARptValidarDatos();
        checkPersonaTCREARTITULARptSolicitud();
    }

    @JsonIgnore
    public TipoIdentificacionOid getPersonaTCREARTITULARptpagrTipoIdentificacion() {
        return this.personaTCREARTITULARptpagrTipoIdentificacion;
    }
    
    public void setPersonaTCREARTITULARptpagrTipoIdentificacion(TipoIdentificacionOid personaTCREARTITULARptpagrTipoIdentificacion) {
        this.personaTCREARTITULARptpagrTipoIdentificacion = personaTCREARTITULARptpagrTipoIdentificacion;
    }

    @JsonIgnore
    public TipoIdentificacion getPersonaTCREARTITULARptpagrTipoIdentificacionInstance() {
        return this.personaTCREARTITULARptpagrTipoIdentificacionInstance;
    }
    
    public void setPersonaTCREARTITULARptpagrTipoIdentificacionInstance(TipoIdentificacion personaTCREARTITULARptpagrTipoIdentificacion) {
        this.personaTCREARTITULARptpagrTipoIdentificacionInstance = personaTCREARTITULARptpagrTipoIdentificacion;
        this.personaTCREARTITULARptpagrTipoIdentificacion = personaTCREARTITULARptpagrTipoIdentificacion != null ? personaTCREARTITULARptpagrTipoIdentificacion.getOid() : null;
    }

    private void checkPersonaTCREARTITULARptpagrTipoIdentificacion() throws NotNullArgumentException {
        if(this.getPersonaTCREARTITULARptpagrTipoIdentificacionInstance() == null || this.getPersonaTCREARTITULARptpagrTipoIdentificacionInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TCREARTITULAR, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TCREARTITULAR_PERSONATCREARTITULARPTPAGRTIPOIDENTIFICACION, PersonaConstants.SERV_ALIAS_TCREARTITULAR, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TCREARTITULAR_PERSONATCREARTITULARPTPAGRTIPOIDENTIFICACION);
        }
    }

    @JsonIgnore
    public DepartamentoOid getPersonaTCREARTITULARptpagrDepartamentoNacimiento() {
        return this.personaTCREARTITULARptpagrDepartamentoNacimiento;
    }
    
    public void setPersonaTCREARTITULARptpagrDepartamentoNacimiento(DepartamentoOid personaTCREARTITULARptpagrDepartamentoNacimiento) {
        this.personaTCREARTITULARptpagrDepartamentoNacimiento = personaTCREARTITULARptpagrDepartamentoNacimiento;
    }

    @JsonIgnore
    public Departamento getPersonaTCREARTITULARptpagrDepartamentoNacimientoInstance() {
        return this.personaTCREARTITULARptpagrDepartamentoNacimientoInstance;
    }
    
    public void setPersonaTCREARTITULARptpagrDepartamentoNacimientoInstance(Departamento personaTCREARTITULARptpagrDepartamentoNacimiento) {
        this.personaTCREARTITULARptpagrDepartamentoNacimientoInstance = personaTCREARTITULARptpagrDepartamentoNacimiento;
        this.personaTCREARTITULARptpagrDepartamentoNacimiento = personaTCREARTITULARptpagrDepartamentoNacimiento != null ? personaTCREARTITULARptpagrDepartamentoNacimiento.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getPersonaTCREARTITULARptpagrMunicipioNacimiento() {
        return this.personaTCREARTITULARptpagrMunicipioNacimiento;
    }
    
    public void setPersonaTCREARTITULARptpagrMunicipioNacimiento(MunicipioOid personaTCREARTITULARptpagrMunicipioNacimiento) {
        this.personaTCREARTITULARptpagrMunicipioNacimiento = personaTCREARTITULARptpagrMunicipioNacimiento;
    }

    @JsonIgnore
    public Municipio getPersonaTCREARTITULARptpagrMunicipioNacimientoInstance() {
        return this.personaTCREARTITULARptpagrMunicipioNacimientoInstance;
    }
    
    public void setPersonaTCREARTITULARptpagrMunicipioNacimientoInstance(Municipio personaTCREARTITULARptpagrMunicipioNacimiento) {
        this.personaTCREARTITULARptpagrMunicipioNacimientoInstance = personaTCREARTITULARptpagrMunicipioNacimiento;
        this.personaTCREARTITULARptpagrMunicipioNacimiento = personaTCREARTITULARptpagrMunicipioNacimiento != null ? personaTCREARTITULARptpagrMunicipioNacimiento.getOid() : null;
    }

    @JsonIgnore
    public EstadoCivilOid getPersonaTCREARTITULARptpagrEstadoCivil() {
        return this.personaTCREARTITULARptpagrEstadoCivil;
    }
    
    public void setPersonaTCREARTITULARptpagrEstadoCivil(EstadoCivilOid personaTCREARTITULARptpagrEstadoCivil) {
        this.personaTCREARTITULARptpagrEstadoCivil = personaTCREARTITULARptpagrEstadoCivil;
    }

    @JsonIgnore
    public EstadoCivil getPersonaTCREARTITULARptpagrEstadoCivilInstance() {
        return this.personaTCREARTITULARptpagrEstadoCivilInstance;
    }
    
    public void setPersonaTCREARTITULARptpagrEstadoCivilInstance(EstadoCivil personaTCREARTITULARptpagrEstadoCivil) {
        this.personaTCREARTITULARptpagrEstadoCivilInstance = personaTCREARTITULARptpagrEstadoCivil;
        this.personaTCREARTITULARptpagrEstadoCivil = personaTCREARTITULARptpagrEstadoCivil != null ? personaTCREARTITULARptpagrEstadoCivil.getOid() : null;
    }

    @JsonIgnore
    public String getPersonaTCREARTITULARptpatrNumIdentificacion() {
        return this.personaTCREARTITULARptpatrNumIdentificacion;
    }
    
    public void setPersonaTCREARTITULARptpatrNumIdentificacion(String personaTCREARTITULARptpatrNumIdentificacion) {
        this.personaTCREARTITULARptpatrNumIdentificacion = personaTCREARTITULARptpatrNumIdentificacion;
    }

    private void checkPersonaTCREARTITULARptpatrNumIdentificacion() throws NotNullArgumentException {
        if(this.getPersonaTCREARTITULARptpatrNumIdentificacion() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TCREARTITULAR, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TCREARTITULAR_PERSONATCREARTITULARPTPATRNUMIDENTIFICACION, PersonaConstants.SERV_ALIAS_TCREARTITULAR, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TCREARTITULAR_PERSONATCREARTITULARPTPATRNUMIDENTIFICACION);
        }
    }

    @JsonIgnore
    public String getPersonaTCREARTITULARptpatrPrimerNombre() {
        return this.personaTCREARTITULARptpatrPrimerNombre;
    }
    
    public void setPersonaTCREARTITULARptpatrPrimerNombre(String personaTCREARTITULARptpatrPrimerNombre) {
        this.personaTCREARTITULARptpatrPrimerNombre = personaTCREARTITULARptpatrPrimerNombre;
    }

    @JsonIgnore
    public String getPersonaTCREARTITULARptpatrSegundoNombre() {
        return this.personaTCREARTITULARptpatrSegundoNombre;
    }
    
    public void setPersonaTCREARTITULARptpatrSegundoNombre(String personaTCREARTITULARptpatrSegundoNombre) {
        this.personaTCREARTITULARptpatrSegundoNombre = personaTCREARTITULARptpatrSegundoNombre;
    }

    @JsonIgnore
    public String getPersonaTCREARTITULARptpatrPrimerApellido() {
        return this.personaTCREARTITULARptpatrPrimerApellido;
    }
    
    public void setPersonaTCREARTITULARptpatrPrimerApellido(String personaTCREARTITULARptpatrPrimerApellido) {
        this.personaTCREARTITULARptpatrPrimerApellido = personaTCREARTITULARptpatrPrimerApellido;
    }

    @JsonIgnore
    public String getPersonaTCREARTITULARptpatrSegundoApellido() {
        return this.personaTCREARTITULARptpatrSegundoApellido;
    }
    
    public void setPersonaTCREARTITULARptpatrSegundoApellido(String personaTCREARTITULARptpatrSegundoApellido) {
        this.personaTCREARTITULARptpatrSegundoApellido = personaTCREARTITULARptpatrSegundoApellido;
    }

    @JsonIgnore
    public Date getPersonaTCREARTITULARptpatrFechaNacimiento() {
        return this.personaTCREARTITULARptpatrFechaNacimiento;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setPersonaTCREARTITULARptpatrFechaNacimiento(Date personaTCREARTITULARptpatrFechaNacimiento) {
        this.personaTCREARTITULARptpatrFechaNacimiento = personaTCREARTITULARptpatrFechaNacimiento;
    }

    @JsonIgnore
    public String getPersonaTCREARTITULARptpatrGenero() {
        return this.personaTCREARTITULARptpatrGenero;
    }
    
    public void setPersonaTCREARTITULARptpatrGenero(String personaTCREARTITULARptpatrGenero) {
        this.personaTCREARTITULARptpatrGenero = personaTCREARTITULARptpatrGenero;
    }

    @JsonIgnore
    public Boolean getPersonaTCREARTITULARptpatrIndicadorExtranjero() {
        return this.personaTCREARTITULARptpatrIndicadorExtranjero;
    }
    
    public void setPersonaTCREARTITULARptpatrIndicadorExtranjero(Boolean personaTCREARTITULARptpatrIndicadorExtranjero) {
        this.personaTCREARTITULARptpatrIndicadorExtranjero = personaTCREARTITULARptpatrIndicadorExtranjero;
    }

    @JsonIgnore
    public String getPersonaTCREARTITULARptpatrTelefonoFijo() {
        return this.personaTCREARTITULARptpatrTelefonoFijo;
    }
    
    public void setPersonaTCREARTITULARptpatrTelefonoFijo(String personaTCREARTITULARptpatrTelefonoFijo) {
        this.personaTCREARTITULARptpatrTelefonoFijo = personaTCREARTITULARptpatrTelefonoFijo;
    }

    @JsonIgnore
    public String getPersonaTCREARTITULARptpatrTelefonoCelular() {
        return this.personaTCREARTITULARptpatrTelefonoCelular;
    }
    
    public void setPersonaTCREARTITULARptpatrTelefonoCelular(String personaTCREARTITULARptpatrTelefonoCelular) {
        this.personaTCREARTITULARptpatrTelefonoCelular = personaTCREARTITULARptpatrTelefonoCelular;
    }

    @JsonIgnore
    public String getPersonaTCREARTITULARptpatrCorreoElectronico() {
        return this.personaTCREARTITULARptpatrCorreoElectronico;
    }
    
    public void setPersonaTCREARTITULARptpatrCorreoElectronico(String personaTCREARTITULARptpatrCorreoElectronico) {
        this.personaTCREARTITULARptpatrCorreoElectronico = personaTCREARTITULARptpatrCorreoElectronico;
    }

    @JsonIgnore
    public DepartamentoOid getPersonaTCREARTITULARptpagrDepartamento() {
        return this.personaTCREARTITULARptpagrDepartamento;
    }
    
    public void setPersonaTCREARTITULARptpagrDepartamento(DepartamentoOid personaTCREARTITULARptpagrDepartamento) {
        this.personaTCREARTITULARptpagrDepartamento = personaTCREARTITULARptpagrDepartamento;
    }

    @JsonIgnore
    public Departamento getPersonaTCREARTITULARptpagrDepartamentoInstance() {
        return this.personaTCREARTITULARptpagrDepartamentoInstance;
    }
    
    public void setPersonaTCREARTITULARptpagrDepartamentoInstance(Departamento personaTCREARTITULARptpagrDepartamento) {
        this.personaTCREARTITULARptpagrDepartamentoInstance = personaTCREARTITULARptpagrDepartamento;
        this.personaTCREARTITULARptpagrDepartamento = personaTCREARTITULARptpagrDepartamento != null ? personaTCREARTITULARptpagrDepartamento.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getPersonaTCREARTITULARptpagrMunicipio() {
        return this.personaTCREARTITULARptpagrMunicipio;
    }
    
    public void setPersonaTCREARTITULARptpagrMunicipio(MunicipioOid personaTCREARTITULARptpagrMunicipio) {
        this.personaTCREARTITULARptpagrMunicipio = personaTCREARTITULARptpagrMunicipio;
    }

    @JsonIgnore
    public Municipio getPersonaTCREARTITULARptpagrMunicipioInstance() {
        return this.personaTCREARTITULARptpagrMunicipioInstance;
    }
    
    public void setPersonaTCREARTITULARptpagrMunicipioInstance(Municipio personaTCREARTITULARptpagrMunicipio) {
        this.personaTCREARTITULARptpagrMunicipioInstance = personaTCREARTITULARptpagrMunicipio;
        this.personaTCREARTITULARptpagrMunicipio = personaTCREARTITULARptpagrMunicipio != null ? personaTCREARTITULARptpagrMunicipio.getOid() : null;
    }

    @JsonIgnore
    public String getPersonaTCREARTITULARptpatrDireccionCompleta() {
        return this.personaTCREARTITULARptpatrDireccionCompleta;
    }
    
    public void setPersonaTCREARTITULARptpatrDireccionCompleta(String personaTCREARTITULARptpatrDireccionCompleta) {
        this.personaTCREARTITULARptpatrDireccionCompleta = personaTCREARTITULARptpatrDireccionCompleta;
    }

    @JsonIgnore
    public Boolean getPersonaTCREARTITULARptpatrRural() {
        return this.personaTCREARTITULARptpatrRural;
    }
    
    public void setPersonaTCREARTITULARptpatrRural(Boolean personaTCREARTITULARptpatrRural) {
        this.personaTCREARTITULARptpatrRural = personaTCREARTITULARptpatrRural;
    }

    @JsonIgnore
    public TipoDireccionOid getPersonaTCREARTITULARptTipoDireccion() {
        return this.personaTCREARTITULARptTipoDireccion;
    }
    
    public void setPersonaTCREARTITULARptTipoDireccion(TipoDireccionOid personaTCREARTITULARptTipoDireccion) {
        this.personaTCREARTITULARptTipoDireccion = personaTCREARTITULARptTipoDireccion;
    }

    @JsonIgnore
    public TipoDireccion getPersonaTCREARTITULARptTipoDireccionInstance() {
        return this.personaTCREARTITULARptTipoDireccionInstance;
    }
    
    public void setPersonaTCREARTITULARptTipoDireccionInstance(TipoDireccion personaTCREARTITULARptTipoDireccion) {
        this.personaTCREARTITULARptTipoDireccionInstance = personaTCREARTITULARptTipoDireccion;
        this.personaTCREARTITULARptTipoDireccion = personaTCREARTITULARptTipoDireccion != null ? personaTCREARTITULARptTipoDireccion.getOid() : null;
    }

    @JsonIgnore
    public PaisOid getPersonaTCREARTITULARptpagrPais() {
        return this.personaTCREARTITULARptpagrPais;
    }
    
    public void setPersonaTCREARTITULARptpagrPais(PaisOid personaTCREARTITULARptpagrPais) {
        this.personaTCREARTITULARptpagrPais = personaTCREARTITULARptpagrPais;
    }

    @JsonIgnore
    public Pais getPersonaTCREARTITULARptpagrPaisInstance() {
        return this.personaTCREARTITULARptpagrPaisInstance;
    }
    
    public void setPersonaTCREARTITULARptpagrPaisInstance(Pais personaTCREARTITULARptpagrPais) {
        this.personaTCREARTITULARptpagrPaisInstance = personaTCREARTITULARptpagrPais;
        this.personaTCREARTITULARptpagrPais = personaTCREARTITULARptpagrPais != null ? personaTCREARTITULARptpagrPais.getOid() : null;
    }

    @JsonIgnore
    public Long getPersonaTCREARTITULARptpCodigo() {
        return this.personaTCREARTITULARptpCodigo;
    }
    
    public void setPersonaTCREARTITULARptpCodigo(Long personaTCREARTITULARptpCodigo) {
        this.personaTCREARTITULARptpCodigo = personaTCREARTITULARptpCodigo;
    }

    @JsonIgnore
    public Boolean getPersonaTCREARTITULARptpTieneEPSSanitas() {
        return this.personaTCREARTITULARptpTieneEPSSanitas;
    }
    
    public void setPersonaTCREARTITULARptpTieneEPSSanitas(Boolean personaTCREARTITULARptpTieneEPSSanitas) {
        this.personaTCREARTITULARptpTieneEPSSanitas = personaTCREARTITULARptpTieneEPSSanitas;
    }

    @JsonIgnore
    public String getPersonaTCREARTITULARptpRechazadoAfiliacion() {
        return this.personaTCREARTITULARptpRechazadoAfiliacion;
    }
    
    public void setPersonaTCREARTITULARptpRechazadoAfiliacion(String personaTCREARTITULARptpRechazadoAfiliacion) {
        this.personaTCREARTITULARptpRechazadoAfiliacion = personaTCREARTITULARptpRechazadoAfiliacion;
    }

    @JsonIgnore
    public EstadoPersonaOid getPersonaTCREARTITULARptEstadoPersona() {
        return this.personaTCREARTITULARptEstadoPersona;
    }
    
    public void setPersonaTCREARTITULARptEstadoPersona(EstadoPersonaOid personaTCREARTITULARptEstadoPersona) {
        this.personaTCREARTITULARptEstadoPersona = personaTCREARTITULARptEstadoPersona;
    }

    @JsonIgnore
    public EstadoPersona getPersonaTCREARTITULARptEstadoPersonaInstance() {
        return this.personaTCREARTITULARptEstadoPersonaInstance;
    }
    
    public void setPersonaTCREARTITULARptEstadoPersonaInstance(EstadoPersona personaTCREARTITULARptEstadoPersona) {
        this.personaTCREARTITULARptEstadoPersonaInstance = personaTCREARTITULARptEstadoPersona;
        this.personaTCREARTITULARptEstadoPersona = personaTCREARTITULARptEstadoPersona != null ? personaTCREARTITULARptEstadoPersona.getOid() : null;
    }

    @JsonIgnore
    public Boolean getPersonaTCREARTITULARptValidarDatos() {
        return this.personaTCREARTITULARptValidarDatos;
    }
    
    public void setPersonaTCREARTITULARptValidarDatos(Boolean personaTCREARTITULARptValidarDatos) {
        this.personaTCREARTITULARptValidarDatos = personaTCREARTITULARptValidarDatos;
    }

    private void checkPersonaTCREARTITULARptValidarDatos() throws NotNullArgumentException {
        if(this.getPersonaTCREARTITULARptValidarDatos() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TCREARTITULAR, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TCREARTITULAR_PERSONATCREARTITULARPTVALIDARDATOS, PersonaConstants.SERV_ALIAS_TCREARTITULAR, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TCREARTITULAR_PERSONATCREARTITULARPTVALIDARDATOS);
        }
    }

    @JsonIgnore
    public String getPersonaTCREARTITULARptpatrRazonSocial() {
        return this.personaTCREARTITULARptpatrRazonSocial;
    }
    
    public void setPersonaTCREARTITULARptpatrRazonSocial(String personaTCREARTITULARptpatrRazonSocial) {
        this.personaTCREARTITULARptpatrRazonSocial = personaTCREARTITULARptpatrRazonSocial;
    }

    @JsonIgnore
    public SolicitudOid getPersonaTCREARTITULARptSolicitud() {
        return this.personaTCREARTITULARptSolicitud;
    }
    
    public void setPersonaTCREARTITULARptSolicitud(SolicitudOid personaTCREARTITULARptSolicitud) {
        this.personaTCREARTITULARptSolicitud = personaTCREARTITULARptSolicitud;
    }

    @JsonIgnore
    public Solicitud getPersonaTCREARTITULARptSolicitudInstance() {
        return this.personaTCREARTITULARptSolicitudInstance;
    }
    
    public void setPersonaTCREARTITULARptSolicitudInstance(Solicitud personaTCREARTITULARptSolicitud) {
        this.personaTCREARTITULARptSolicitudInstance = personaTCREARTITULARptSolicitud;
        this.personaTCREARTITULARptSolicitud = personaTCREARTITULARptSolicitud != null ? personaTCREARTITULARptSolicitud.getOid() : null;
    }

    private void checkPersonaTCREARTITULARptSolicitud() throws NotNullArgumentException {
        if(this.getPersonaTCREARTITULARptSolicitudInstance() == null || this.getPersonaTCREARTITULARptSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TCREARTITULAR, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TCREARTITULAR_PERSONATCREARTITULARPTSOLICITUD, PersonaConstants.SERV_ALIAS_TCREARTITULAR, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TCREARTITULAR_PERSONATCREARTITULARPTSOLICITUD);
        }
    }
}
