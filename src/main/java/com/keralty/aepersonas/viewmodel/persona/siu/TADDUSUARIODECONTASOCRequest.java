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
import com.keralty.aepersonas.persistence.oid.ParentescoOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.persistence.Pais;
import com.keralty.aepersonas.persistence.Parentesco;
import com.keralty.aepersonas.persistence.Solicitud;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneDeserializer;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneSerializer;
import java.sql.Date;

public class TADDUSUARIODECONTASOCRequest {

    @JsonProperty("pt_p_agrtipoidentificacion_oid")
    private TipoIdentificacionOid personaTADDUSUARIODECONTASOCptpagrTipoIdentificacion;
    
    @JsonIgnore
    private TipoIdentificacion personaTADDUSUARIODECONTASOCptpagrTipoIdentificacionInstance;

    @JsonProperty("pt_p_agrdepartamentonacimiento_oid")
    private DepartamentoOid personaTADDUSUARIODECONTASOCptpagrDepartamentoNacimiento;
    
    @JsonIgnore
    private Departamento personaTADDUSUARIODECONTASOCptpagrDepartamentoNacimientoInstance;

    @JsonProperty("pt_p_agrmunicipionacimiento_oid")
    private MunicipioOid personaTADDUSUARIODECONTASOCptpagrMunicipioNacimiento;
    
    @JsonIgnore
    private Municipio personaTADDUSUARIODECONTASOCptpagrMunicipioNacimientoInstance;

    @JsonProperty("pt_p_agrestadocivil_oid")
    private EstadoCivilOid personaTADDUSUARIODECONTASOCptpagrEstadoCivil;
    
    @JsonIgnore
    private EstadoCivil personaTADDUSUARIODECONTASOCptpagrEstadoCivilInstance;

    @JsonProperty("pt_p_atrnumidentificacion")
    private String personaTADDUSUARIODECONTASOCptpatrNumIdentificacion;

    @JsonProperty("pt_p_atrprimernombre")
    private String personaTADDUSUARIODECONTASOCptpatrPrimerNombre;

    @JsonProperty("pt_p_atrsegundonombre")
    private String personaTADDUSUARIODECONTASOCptpatrSegundoNombre;

    @JsonProperty("pt_p_atrprimerapellido")
    private String personaTADDUSUARIODECONTASOCptpatrPrimerApellido;

    @JsonProperty("pt_p_atrsegundoapellido")
    private String personaTADDUSUARIODECONTASOCptpatrSegundoApellido;

    @JsonProperty("pt_p_atrfechanacimiento")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date personaTADDUSUARIODECONTASOCptpatrFechaNacimiento;

    @JsonProperty("pt_p_atrgenero")
    private String personaTADDUSUARIODECONTASOCptpatrGenero;

    @JsonProperty("pt_p_atrindicadorextranjero")
    private Boolean personaTADDUSUARIODECONTASOCptpatrIndicadorExtranjero;

    @JsonProperty("pt_p_atrtelefonofijo")
    private String personaTADDUSUARIODECONTASOCptpatrTelefonoFijo;

    @JsonProperty("pt_p_atrtelefonocelular")
    private String personaTADDUSUARIODECONTASOCptpatrTelefonoCelular;

    @JsonProperty("pt_p_atrcorreoelectronico")
    private String personaTADDUSUARIODECONTASOCptpatrCorreoElectronico;

    @JsonProperty("pt_p_agrdepartamento_oid")
    private DepartamentoOid personaTADDUSUARIODECONTASOCptpagrDepartamento;
    
    @JsonIgnore
    private Departamento personaTADDUSUARIODECONTASOCptpagrDepartamentoInstance;

    @JsonProperty("pt_p_agrmunicipio_oid")
    private MunicipioOid personaTADDUSUARIODECONTASOCptpagrMunicipio;
    
    @JsonIgnore
    private Municipio personaTADDUSUARIODECONTASOCptpagrMunicipioInstance;

    @JsonProperty("pt_p_atrdireccioncompleta")
    private String personaTADDUSUARIODECONTASOCptpatrDireccionCompleta;

    @JsonProperty("pt_p_atrrural")
    private Boolean personaTADDUSUARIODECONTASOCptpatrRural;

    @JsonProperty("pt_p_codigo")
    private Long personaTADDUSUARIODECONTASOCptpCodigo;

    @JsonProperty("pt_p_tieneepssanitas")
    private Boolean personaTADDUSUARIODECONTASOCptpTieneEPSSanitas;

    @JsonProperty("pt_p_rechazadoafiliacion")
    private String personaTADDUSUARIODECONTASOCptpRechazadoAfiliacion;

    @JsonProperty("pt_p_agrpais_oid")
    private PaisOid personaTADDUSUARIODECONTASOCptpagrPais;
    
    @JsonIgnore
    private Pais personaTADDUSUARIODECONTASOCptpagrPaisInstance;

    @JsonProperty("pt_p_agrsolicitud_oid")
    private SolicitudOid personaTADDUSUARIODECONTASOCptpagrSolicitud;
    
    @JsonIgnore
    private Solicitud personaTADDUSUARIODECONTASOCptpagrSolicitudInstance;

    @JsonProperty("pt_p_agrparentesco_oid")
    private ParentescoOid personaTADDUSUARIODECONTASOCptpagrParentesco;
    
    @JsonIgnore
    private Parentesco personaTADDUSUARIODECONTASOCptpagrParentescoInstance;

    @JsonProperty("pt_p_atrbebegestante")
    private Boolean personaTADDUSUARIODECONTASOCptpatrBebeGestante;

    @JsonProperty("pt_p_atrcodigobancorep")
    private String personaTADDUSUARIODECONTASOCptpatrcodigoBancoRep;

    @JsonProperty("ptparacontratante")
    private Boolean personaTADDUSUARIODECONTASOCptParaContratante;

    @JsonProperty("preconditionId")
    private String preconditionId;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonaTADDUSUARIODECONTASOCptpagrTipoIdentificacion();
        checkPersonaTADDUSUARIODECONTASOCptpatrNumIdentificacion();
        checkPersonaTADDUSUARIODECONTASOCptpatrPrimerNombre();
        checkPersonaTADDUSUARIODECONTASOCptpatrPrimerApellido();
        checkPersonaTADDUSUARIODECONTASOCptpatrFechaNacimiento();
        checkPersonaTADDUSUARIODECONTASOCptpatrGenero();
        checkPersonaTADDUSUARIODECONTASOCptpagrSolicitud();
        checkPersonaTADDUSUARIODECONTASOCptpatrBebeGestante();
        checkPersonaTADDUSUARIODECONTASOCptParaContratante();
    }

    @JsonIgnore
    public TipoIdentificacionOid getPersonaTADDUSUARIODECONTASOCptpagrTipoIdentificacion() {
        return this.personaTADDUSUARIODECONTASOCptpagrTipoIdentificacion;
    }
    
    public void setPersonaTADDUSUARIODECONTASOCptpagrTipoIdentificacion(TipoIdentificacionOid personaTADDUSUARIODECONTASOCptpagrTipoIdentificacion) {
        this.personaTADDUSUARIODECONTASOCptpagrTipoIdentificacion = personaTADDUSUARIODECONTASOCptpagrTipoIdentificacion;
    }

    @JsonIgnore
    public TipoIdentificacion getPersonaTADDUSUARIODECONTASOCptpagrTipoIdentificacionInstance() {
        return this.personaTADDUSUARIODECONTASOCptpagrTipoIdentificacionInstance;
    }
    
    public void setPersonaTADDUSUARIODECONTASOCptpagrTipoIdentificacionInstance(TipoIdentificacion personaTADDUSUARIODECONTASOCptpagrTipoIdentificacion) {
        this.personaTADDUSUARIODECONTASOCptpagrTipoIdentificacionInstance = personaTADDUSUARIODECONTASOCptpagrTipoIdentificacion;
        this.personaTADDUSUARIODECONTASOCptpagrTipoIdentificacion = personaTADDUSUARIODECONTASOCptpagrTipoIdentificacion != null ? personaTADDUSUARIODECONTASOCptpagrTipoIdentificacion.getOid() : null;
    }

    private void checkPersonaTADDUSUARIODECONTASOCptpagrTipoIdentificacion() throws NotNullArgumentException {
        if(this.getPersonaTADDUSUARIODECONTASOCptpagrTipoIdentificacionInstance() == null || this.getPersonaTADDUSUARIODECONTASOCptpagrTipoIdentificacionInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TADDUSUARIODECONTASOC, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPAGRTIPOIDENTIFICACION, PersonaConstants.SERV_ALIAS_TADDUSUARIODECONTASOC, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPAGRTIPOIDENTIFICACION);
        }
    }

    @JsonIgnore
    public DepartamentoOid getPersonaTADDUSUARIODECONTASOCptpagrDepartamentoNacimiento() {
        return this.personaTADDUSUARIODECONTASOCptpagrDepartamentoNacimiento;
    }
    
    public void setPersonaTADDUSUARIODECONTASOCptpagrDepartamentoNacimiento(DepartamentoOid personaTADDUSUARIODECONTASOCptpagrDepartamentoNacimiento) {
        this.personaTADDUSUARIODECONTASOCptpagrDepartamentoNacimiento = personaTADDUSUARIODECONTASOCptpagrDepartamentoNacimiento;
    }

    @JsonIgnore
    public Departamento getPersonaTADDUSUARIODECONTASOCptpagrDepartamentoNacimientoInstance() {
        return this.personaTADDUSUARIODECONTASOCptpagrDepartamentoNacimientoInstance;
    }
    
    public void setPersonaTADDUSUARIODECONTASOCptpagrDepartamentoNacimientoInstance(Departamento personaTADDUSUARIODECONTASOCptpagrDepartamentoNacimiento) {
        this.personaTADDUSUARIODECONTASOCptpagrDepartamentoNacimientoInstance = personaTADDUSUARIODECONTASOCptpagrDepartamentoNacimiento;
        this.personaTADDUSUARIODECONTASOCptpagrDepartamentoNacimiento = personaTADDUSUARIODECONTASOCptpagrDepartamentoNacimiento != null ? personaTADDUSUARIODECONTASOCptpagrDepartamentoNacimiento.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getPersonaTADDUSUARIODECONTASOCptpagrMunicipioNacimiento() {
        return this.personaTADDUSUARIODECONTASOCptpagrMunicipioNacimiento;
    }
    
    public void setPersonaTADDUSUARIODECONTASOCptpagrMunicipioNacimiento(MunicipioOid personaTADDUSUARIODECONTASOCptpagrMunicipioNacimiento) {
        this.personaTADDUSUARIODECONTASOCptpagrMunicipioNacimiento = personaTADDUSUARIODECONTASOCptpagrMunicipioNacimiento;
    }

    @JsonIgnore
    public Municipio getPersonaTADDUSUARIODECONTASOCptpagrMunicipioNacimientoInstance() {
        return this.personaTADDUSUARIODECONTASOCptpagrMunicipioNacimientoInstance;
    }
    
    public void setPersonaTADDUSUARIODECONTASOCptpagrMunicipioNacimientoInstance(Municipio personaTADDUSUARIODECONTASOCptpagrMunicipioNacimiento) {
        this.personaTADDUSUARIODECONTASOCptpagrMunicipioNacimientoInstance = personaTADDUSUARIODECONTASOCptpagrMunicipioNacimiento;
        this.personaTADDUSUARIODECONTASOCptpagrMunicipioNacimiento = personaTADDUSUARIODECONTASOCptpagrMunicipioNacimiento != null ? personaTADDUSUARIODECONTASOCptpagrMunicipioNacimiento.getOid() : null;
    }

    @JsonIgnore
    public EstadoCivilOid getPersonaTADDUSUARIODECONTASOCptpagrEstadoCivil() {
        return this.personaTADDUSUARIODECONTASOCptpagrEstadoCivil;
    }
    
    public void setPersonaTADDUSUARIODECONTASOCptpagrEstadoCivil(EstadoCivilOid personaTADDUSUARIODECONTASOCptpagrEstadoCivil) {
        this.personaTADDUSUARIODECONTASOCptpagrEstadoCivil = personaTADDUSUARIODECONTASOCptpagrEstadoCivil;
    }

    @JsonIgnore
    public EstadoCivil getPersonaTADDUSUARIODECONTASOCptpagrEstadoCivilInstance() {
        return this.personaTADDUSUARIODECONTASOCptpagrEstadoCivilInstance;
    }
    
    public void setPersonaTADDUSUARIODECONTASOCptpagrEstadoCivilInstance(EstadoCivil personaTADDUSUARIODECONTASOCptpagrEstadoCivil) {
        this.personaTADDUSUARIODECONTASOCptpagrEstadoCivilInstance = personaTADDUSUARIODECONTASOCptpagrEstadoCivil;
        this.personaTADDUSUARIODECONTASOCptpagrEstadoCivil = personaTADDUSUARIODECONTASOCptpagrEstadoCivil != null ? personaTADDUSUARIODECONTASOCptpagrEstadoCivil.getOid() : null;
    }

    @JsonIgnore
    public String getPersonaTADDUSUARIODECONTASOCptpatrNumIdentificacion() {
        return this.personaTADDUSUARIODECONTASOCptpatrNumIdentificacion;
    }
    
    public void setPersonaTADDUSUARIODECONTASOCptpatrNumIdentificacion(String personaTADDUSUARIODECONTASOCptpatrNumIdentificacion) {
        this.personaTADDUSUARIODECONTASOCptpatrNumIdentificacion = personaTADDUSUARIODECONTASOCptpatrNumIdentificacion;
    }

    private void checkPersonaTADDUSUARIODECONTASOCptpatrNumIdentificacion() throws NotNullArgumentException {
        if(this.getPersonaTADDUSUARIODECONTASOCptpatrNumIdentificacion() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TADDUSUARIODECONTASOC, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRNUMIDENTIFICACION, PersonaConstants.SERV_ALIAS_TADDUSUARIODECONTASOC, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRNUMIDENTIFICACION);
        }
    }

    @JsonIgnore
    public String getPersonaTADDUSUARIODECONTASOCptpatrPrimerNombre() {
        return this.personaTADDUSUARIODECONTASOCptpatrPrimerNombre;
    }
    
    public void setPersonaTADDUSUARIODECONTASOCptpatrPrimerNombre(String personaTADDUSUARIODECONTASOCptpatrPrimerNombre) {
        this.personaTADDUSUARIODECONTASOCptpatrPrimerNombre = personaTADDUSUARIODECONTASOCptpatrPrimerNombre;
    }

    private void checkPersonaTADDUSUARIODECONTASOCptpatrPrimerNombre() throws NotNullArgumentException {
        if(this.getPersonaTADDUSUARIODECONTASOCptpatrPrimerNombre() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TADDUSUARIODECONTASOC, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRPRIMERNOMBRE, PersonaConstants.SERV_ALIAS_TADDUSUARIODECONTASOC, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRPRIMERNOMBRE);
        }
    }

    @JsonIgnore
    public String getPersonaTADDUSUARIODECONTASOCptpatrSegundoNombre() {
        return this.personaTADDUSUARIODECONTASOCptpatrSegundoNombre;
    }
    
    public void setPersonaTADDUSUARIODECONTASOCptpatrSegundoNombre(String personaTADDUSUARIODECONTASOCptpatrSegundoNombre) {
        this.personaTADDUSUARIODECONTASOCptpatrSegundoNombre = personaTADDUSUARIODECONTASOCptpatrSegundoNombre;
    }

    @JsonIgnore
    public String getPersonaTADDUSUARIODECONTASOCptpatrPrimerApellido() {
        return this.personaTADDUSUARIODECONTASOCptpatrPrimerApellido;
    }
    
    public void setPersonaTADDUSUARIODECONTASOCptpatrPrimerApellido(String personaTADDUSUARIODECONTASOCptpatrPrimerApellido) {
        this.personaTADDUSUARIODECONTASOCptpatrPrimerApellido = personaTADDUSUARIODECONTASOCptpatrPrimerApellido;
    }

    private void checkPersonaTADDUSUARIODECONTASOCptpatrPrimerApellido() throws NotNullArgumentException {
        if(this.getPersonaTADDUSUARIODECONTASOCptpatrPrimerApellido() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TADDUSUARIODECONTASOC, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRPRIMERAPELLIDO, PersonaConstants.SERV_ALIAS_TADDUSUARIODECONTASOC, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRPRIMERAPELLIDO);
        }
    }

    @JsonIgnore
    public String getPersonaTADDUSUARIODECONTASOCptpatrSegundoApellido() {
        return this.personaTADDUSUARIODECONTASOCptpatrSegundoApellido;
    }
    
    public void setPersonaTADDUSUARIODECONTASOCptpatrSegundoApellido(String personaTADDUSUARIODECONTASOCptpatrSegundoApellido) {
        this.personaTADDUSUARIODECONTASOCptpatrSegundoApellido = personaTADDUSUARIODECONTASOCptpatrSegundoApellido;
    }

    @JsonIgnore
    public Date getPersonaTADDUSUARIODECONTASOCptpatrFechaNacimiento() {
        return this.personaTADDUSUARIODECONTASOCptpatrFechaNacimiento;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setPersonaTADDUSUARIODECONTASOCptpatrFechaNacimiento(Date personaTADDUSUARIODECONTASOCptpatrFechaNacimiento) {
        this.personaTADDUSUARIODECONTASOCptpatrFechaNacimiento = personaTADDUSUARIODECONTASOCptpatrFechaNacimiento;
    }

    private void checkPersonaTADDUSUARIODECONTASOCptpatrFechaNacimiento() throws NotNullArgumentException {
        if(this.getPersonaTADDUSUARIODECONTASOCptpatrFechaNacimiento() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TADDUSUARIODECONTASOC, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRFECHANACIMIENTO, PersonaConstants.SERV_ALIAS_TADDUSUARIODECONTASOC, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRFECHANACIMIENTO);
        }
    }

    @JsonIgnore
    public String getPersonaTADDUSUARIODECONTASOCptpatrGenero() {
        return this.personaTADDUSUARIODECONTASOCptpatrGenero;
    }
    
    public void setPersonaTADDUSUARIODECONTASOCptpatrGenero(String personaTADDUSUARIODECONTASOCptpatrGenero) {
        this.personaTADDUSUARIODECONTASOCptpatrGenero = personaTADDUSUARIODECONTASOCptpatrGenero;
    }

    private void checkPersonaTADDUSUARIODECONTASOCptpatrGenero() throws NotNullArgumentException {
        if(this.getPersonaTADDUSUARIODECONTASOCptpatrGenero() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TADDUSUARIODECONTASOC, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRGENERO, PersonaConstants.SERV_ALIAS_TADDUSUARIODECONTASOC, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRGENERO);
        }
    }

    @JsonIgnore
    public Boolean getPersonaTADDUSUARIODECONTASOCptpatrIndicadorExtranjero() {
        return this.personaTADDUSUARIODECONTASOCptpatrIndicadorExtranjero;
    }
    
    public void setPersonaTADDUSUARIODECONTASOCptpatrIndicadorExtranjero(Boolean personaTADDUSUARIODECONTASOCptpatrIndicadorExtranjero) {
        this.personaTADDUSUARIODECONTASOCptpatrIndicadorExtranjero = personaTADDUSUARIODECONTASOCptpatrIndicadorExtranjero;
    }

    @JsonIgnore
    public String getPersonaTADDUSUARIODECONTASOCptpatrTelefonoFijo() {
        return this.personaTADDUSUARIODECONTASOCptpatrTelefonoFijo;
    }
    
    public void setPersonaTADDUSUARIODECONTASOCptpatrTelefonoFijo(String personaTADDUSUARIODECONTASOCptpatrTelefonoFijo) {
        this.personaTADDUSUARIODECONTASOCptpatrTelefonoFijo = personaTADDUSUARIODECONTASOCptpatrTelefonoFijo;
    }

    @JsonIgnore
    public String getPersonaTADDUSUARIODECONTASOCptpatrTelefonoCelular() {
        return this.personaTADDUSUARIODECONTASOCptpatrTelefonoCelular;
    }
    
    public void setPersonaTADDUSUARIODECONTASOCptpatrTelefonoCelular(String personaTADDUSUARIODECONTASOCptpatrTelefonoCelular) {
        this.personaTADDUSUARIODECONTASOCptpatrTelefonoCelular = personaTADDUSUARIODECONTASOCptpatrTelefonoCelular;
    }

    @JsonIgnore
    public String getPersonaTADDUSUARIODECONTASOCptpatrCorreoElectronico() {
        return this.personaTADDUSUARIODECONTASOCptpatrCorreoElectronico;
    }
    
    public void setPersonaTADDUSUARIODECONTASOCptpatrCorreoElectronico(String personaTADDUSUARIODECONTASOCptpatrCorreoElectronico) {
        this.personaTADDUSUARIODECONTASOCptpatrCorreoElectronico = personaTADDUSUARIODECONTASOCptpatrCorreoElectronico;
    }

    @JsonIgnore
    public DepartamentoOid getPersonaTADDUSUARIODECONTASOCptpagrDepartamento() {
        return this.personaTADDUSUARIODECONTASOCptpagrDepartamento;
    }
    
    public void setPersonaTADDUSUARIODECONTASOCptpagrDepartamento(DepartamentoOid personaTADDUSUARIODECONTASOCptpagrDepartamento) {
        this.personaTADDUSUARIODECONTASOCptpagrDepartamento = personaTADDUSUARIODECONTASOCptpagrDepartamento;
    }

    @JsonIgnore
    public Departamento getPersonaTADDUSUARIODECONTASOCptpagrDepartamentoInstance() {
        return this.personaTADDUSUARIODECONTASOCptpagrDepartamentoInstance;
    }
    
    public void setPersonaTADDUSUARIODECONTASOCptpagrDepartamentoInstance(Departamento personaTADDUSUARIODECONTASOCptpagrDepartamento) {
        this.personaTADDUSUARIODECONTASOCptpagrDepartamentoInstance = personaTADDUSUARIODECONTASOCptpagrDepartamento;
        this.personaTADDUSUARIODECONTASOCptpagrDepartamento = personaTADDUSUARIODECONTASOCptpagrDepartamento != null ? personaTADDUSUARIODECONTASOCptpagrDepartamento.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getPersonaTADDUSUARIODECONTASOCptpagrMunicipio() {
        return this.personaTADDUSUARIODECONTASOCptpagrMunicipio;
    }
    
    public void setPersonaTADDUSUARIODECONTASOCptpagrMunicipio(MunicipioOid personaTADDUSUARIODECONTASOCptpagrMunicipio) {
        this.personaTADDUSUARIODECONTASOCptpagrMunicipio = personaTADDUSUARIODECONTASOCptpagrMunicipio;
    }

    @JsonIgnore
    public Municipio getPersonaTADDUSUARIODECONTASOCptpagrMunicipioInstance() {
        return this.personaTADDUSUARIODECONTASOCptpagrMunicipioInstance;
    }
    
    public void setPersonaTADDUSUARIODECONTASOCptpagrMunicipioInstance(Municipio personaTADDUSUARIODECONTASOCptpagrMunicipio) {
        this.personaTADDUSUARIODECONTASOCptpagrMunicipioInstance = personaTADDUSUARIODECONTASOCptpagrMunicipio;
        this.personaTADDUSUARIODECONTASOCptpagrMunicipio = personaTADDUSUARIODECONTASOCptpagrMunicipio != null ? personaTADDUSUARIODECONTASOCptpagrMunicipio.getOid() : null;
    }

    @JsonIgnore
    public String getPersonaTADDUSUARIODECONTASOCptpatrDireccionCompleta() {
        return this.personaTADDUSUARIODECONTASOCptpatrDireccionCompleta;
    }
    
    public void setPersonaTADDUSUARIODECONTASOCptpatrDireccionCompleta(String personaTADDUSUARIODECONTASOCptpatrDireccionCompleta) {
        this.personaTADDUSUARIODECONTASOCptpatrDireccionCompleta = personaTADDUSUARIODECONTASOCptpatrDireccionCompleta;
    }

    @JsonIgnore
    public Boolean getPersonaTADDUSUARIODECONTASOCptpatrRural() {
        return this.personaTADDUSUARIODECONTASOCptpatrRural;
    }
    
    public void setPersonaTADDUSUARIODECONTASOCptpatrRural(Boolean personaTADDUSUARIODECONTASOCptpatrRural) {
        this.personaTADDUSUARIODECONTASOCptpatrRural = personaTADDUSUARIODECONTASOCptpatrRural;
    }

    @JsonIgnore
    public Long getPersonaTADDUSUARIODECONTASOCptpCodigo() {
        return this.personaTADDUSUARIODECONTASOCptpCodigo;
    }
    
    public void setPersonaTADDUSUARIODECONTASOCptpCodigo(Long personaTADDUSUARIODECONTASOCptpCodigo) {
        this.personaTADDUSUARIODECONTASOCptpCodigo = personaTADDUSUARIODECONTASOCptpCodigo;
    }

    @JsonIgnore
    public Boolean getPersonaTADDUSUARIODECONTASOCptpTieneEPSSanitas() {
        return this.personaTADDUSUARIODECONTASOCptpTieneEPSSanitas;
    }
    
    public void setPersonaTADDUSUARIODECONTASOCptpTieneEPSSanitas(Boolean personaTADDUSUARIODECONTASOCptpTieneEPSSanitas) {
        this.personaTADDUSUARIODECONTASOCptpTieneEPSSanitas = personaTADDUSUARIODECONTASOCptpTieneEPSSanitas;
    }

    @JsonIgnore
    public String getPersonaTADDUSUARIODECONTASOCptpRechazadoAfiliacion() {
        return this.personaTADDUSUARIODECONTASOCptpRechazadoAfiliacion;
    }
    
    public void setPersonaTADDUSUARIODECONTASOCptpRechazadoAfiliacion(String personaTADDUSUARIODECONTASOCptpRechazadoAfiliacion) {
        this.personaTADDUSUARIODECONTASOCptpRechazadoAfiliacion = personaTADDUSUARIODECONTASOCptpRechazadoAfiliacion;
    }

    @JsonIgnore
    public PaisOid getPersonaTADDUSUARIODECONTASOCptpagrPais() {
        return this.personaTADDUSUARIODECONTASOCptpagrPais;
    }
    
    public void setPersonaTADDUSUARIODECONTASOCptpagrPais(PaisOid personaTADDUSUARIODECONTASOCptpagrPais) {
        this.personaTADDUSUARIODECONTASOCptpagrPais = personaTADDUSUARIODECONTASOCptpagrPais;
    }

    @JsonIgnore
    public Pais getPersonaTADDUSUARIODECONTASOCptpagrPaisInstance() {
        return this.personaTADDUSUARIODECONTASOCptpagrPaisInstance;
    }
    
    public void setPersonaTADDUSUARIODECONTASOCptpagrPaisInstance(Pais personaTADDUSUARIODECONTASOCptpagrPais) {
        this.personaTADDUSUARIODECONTASOCptpagrPaisInstance = personaTADDUSUARIODECONTASOCptpagrPais;
        this.personaTADDUSUARIODECONTASOCptpagrPais = personaTADDUSUARIODECONTASOCptpagrPais != null ? personaTADDUSUARIODECONTASOCptpagrPais.getOid() : null;
    }

    @JsonIgnore
    public SolicitudOid getPersonaTADDUSUARIODECONTASOCptpagrSolicitud() {
        return this.personaTADDUSUARIODECONTASOCptpagrSolicitud;
    }
    
    public void setPersonaTADDUSUARIODECONTASOCptpagrSolicitud(SolicitudOid personaTADDUSUARIODECONTASOCptpagrSolicitud) {
        this.personaTADDUSUARIODECONTASOCptpagrSolicitud = personaTADDUSUARIODECONTASOCptpagrSolicitud;
    }

    @JsonIgnore
    public Solicitud getPersonaTADDUSUARIODECONTASOCptpagrSolicitudInstance() {
        return this.personaTADDUSUARIODECONTASOCptpagrSolicitudInstance;
    }
    
    public void setPersonaTADDUSUARIODECONTASOCptpagrSolicitudInstance(Solicitud personaTADDUSUARIODECONTASOCptpagrSolicitud) {
        this.personaTADDUSUARIODECONTASOCptpagrSolicitudInstance = personaTADDUSUARIODECONTASOCptpagrSolicitud;
        this.personaTADDUSUARIODECONTASOCptpagrSolicitud = personaTADDUSUARIODECONTASOCptpagrSolicitud != null ? personaTADDUSUARIODECONTASOCptpagrSolicitud.getOid() : null;
    }

    private void checkPersonaTADDUSUARIODECONTASOCptpagrSolicitud() throws NotNullArgumentException {
        if(this.getPersonaTADDUSUARIODECONTASOCptpagrSolicitudInstance() == null || this.getPersonaTADDUSUARIODECONTASOCptpagrSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TADDUSUARIODECONTASOC, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPAGRSOLICITUD, PersonaConstants.SERV_ALIAS_TADDUSUARIODECONTASOC, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPAGRSOLICITUD);
        }
    }

    @JsonIgnore
    public ParentescoOid getPersonaTADDUSUARIODECONTASOCptpagrParentesco() {
        return this.personaTADDUSUARIODECONTASOCptpagrParentesco;
    }
    
    public void setPersonaTADDUSUARIODECONTASOCptpagrParentesco(ParentescoOid personaTADDUSUARIODECONTASOCptpagrParentesco) {
        this.personaTADDUSUARIODECONTASOCptpagrParentesco = personaTADDUSUARIODECONTASOCptpagrParentesco;
    }

    @JsonIgnore
    public Parentesco getPersonaTADDUSUARIODECONTASOCptpagrParentescoInstance() {
        return this.personaTADDUSUARIODECONTASOCptpagrParentescoInstance;
    }
    
    public void setPersonaTADDUSUARIODECONTASOCptpagrParentescoInstance(Parentesco personaTADDUSUARIODECONTASOCptpagrParentesco) {
        this.personaTADDUSUARIODECONTASOCptpagrParentescoInstance = personaTADDUSUARIODECONTASOCptpagrParentesco;
        this.personaTADDUSUARIODECONTASOCptpagrParentesco = personaTADDUSUARIODECONTASOCptpagrParentesco != null ? personaTADDUSUARIODECONTASOCptpagrParentesco.getOid() : null;
    }

    @JsonIgnore
    public Boolean getPersonaTADDUSUARIODECONTASOCptpatrBebeGestante() {
        return this.personaTADDUSUARIODECONTASOCptpatrBebeGestante;
    }
    
    public void setPersonaTADDUSUARIODECONTASOCptpatrBebeGestante(Boolean personaTADDUSUARIODECONTASOCptpatrBebeGestante) {
        this.personaTADDUSUARIODECONTASOCptpatrBebeGestante = personaTADDUSUARIODECONTASOCptpatrBebeGestante;
    }

    private void checkPersonaTADDUSUARIODECONTASOCptpatrBebeGestante() throws NotNullArgumentException {
        if(this.getPersonaTADDUSUARIODECONTASOCptpatrBebeGestante() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TADDUSUARIODECONTASOC, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRBEBEGESTANTE, PersonaConstants.SERV_ALIAS_TADDUSUARIODECONTASOC, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPATRBEBEGESTANTE);
        }
    }

    @JsonIgnore
    public String getPersonaTADDUSUARIODECONTASOCptpatrcodigoBancoRep() {
        return this.personaTADDUSUARIODECONTASOCptpatrcodigoBancoRep;
    }
    
    public void setPersonaTADDUSUARIODECONTASOCptpatrcodigoBancoRep(String personaTADDUSUARIODECONTASOCptpatrcodigoBancoRep) {
        this.personaTADDUSUARIODECONTASOCptpatrcodigoBancoRep = personaTADDUSUARIODECONTASOCptpatrcodigoBancoRep;
    }

    @JsonIgnore
    public Boolean getPersonaTADDUSUARIODECONTASOCptParaContratante() {
        return this.personaTADDUSUARIODECONTASOCptParaContratante;
    }
    
    public void setPersonaTADDUSUARIODECONTASOCptParaContratante(Boolean personaTADDUSUARIODECONTASOCptParaContratante) {
        this.personaTADDUSUARIODECONTASOCptParaContratante = personaTADDUSUARIODECONTASOCptParaContratante;
    }

    private void checkPersonaTADDUSUARIODECONTASOCptParaContratante() throws NotNullArgumentException {
        if(this.getPersonaTADDUSUARIODECONTASOCptParaContratante() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TADDUSUARIODECONTASOC, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPARACONTRATANTE, PersonaConstants.SERV_ALIAS_TADDUSUARIODECONTASOC, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TADDUSUARIODECONTASOC_PERSONATADDUSUARIODECONTASOCPTPARACONTRATANTE);
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
