package com.keralty.aepersonas.viewmodel.titular.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.TitularConstants;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.persistence.oid.DireccionOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.persistence.Solicitud;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneDeserializer;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneSerializer;
import java.sql.Date;

public class CrearRequest {

    @JsonProperty("p_agrdepartamentonac_oid")
    private DepartamentoOid titularcrearpagrDepartamentoNac;
    
    @JsonIgnore
    private Departamento titularcrearpagrDepartamentoNacInstance;

    @JsonProperty("p_agrmunicipionac_oid")
    private MunicipioOid titularcrearpagrMunicipioNac;
    
    @JsonIgnore
    private Municipio titularcrearpagrMunicipioNacInstance;

    @JsonProperty("p_agrdireccion_oid")
    private DireccionOid titularcrearpagrDireccion;
    
    @JsonIgnore
    private Direccion titularcrearpagrDireccionInstance;

    @JsonProperty("p_agrtipoidentificacion_oid")
    private TipoIdentificacionOid titularcrearpagrTipoIdentificacion;
    
    @JsonIgnore
    private TipoIdentificacion titularcrearpagrTipoIdentificacionInstance;

    @JsonProperty("p_agrsolicitud_oid")
    private SolicitudOid titularcrearpagrSolicitud;
    
    @JsonIgnore
    private Solicitud titularcrearpagrSolicitudInstance;

    @JsonProperty("p_atrcodigo")
    private Long titularcrearpatrCodigo;

    @JsonProperty("p_atrnumidentificacion")
    private String titularcrearpatrNumIdentificacion;

    @JsonProperty("p_atrtipopersona")
    private String titularcrearpatrTipoPersona;

    @JsonProperty("p_atrprimernombre")
    private String titularcrearpatrPrimerNombre;

    @JsonProperty("p_atrsegundonombre")
    private String titularcrearpatrSegundoNombre;

    @JsonProperty("p_atrprimerapellido")
    private String titularcrearpatrPrimerApellido;

    @JsonProperty("p_atrsegundoapellido")
    private String titularcrearpatrSegundoApellido;

    @JsonProperty("p_atrfechanacimiento")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date titularcrearpatrFechaNacimiento;

    @JsonProperty("p_atrgenero")
    private String titularcrearpatrGenero;

    @JsonProperty("p_atrindicadorextranjero")
    private Boolean titularcrearpatrIndicadorExtranjero;

    @JsonProperty("p_atrtelefonofijo")
    private String titularcrearpatrTelefonoFijo;

    @JsonProperty("p_atrtelefonocelular")
    private String titularcrearpatrTelefonoCelular;

    @JsonProperty("p_atrcorreoelectronico")
    private String titularcrearpatrCorreoElectronico;

    @JsonProperty("p_atrtitularconbeneficios")
    private Boolean titularcrearpatrTitularConBeneficios;

    @JsonProperty("p_atrtitularrecuperadoinc")
    private Boolean titularcrearpatrTitularRecuperadoInc;

    @JsonProperty("p_atrtelefonofijodc")
    private String titularcrearpatrTelefonoFijoDC;

    @JsonProperty("p_atrtelefonocelulardc")
    private String titularcrearpatrTelefonoCelularDC;

    @JsonProperty("p_atrtitularconbeneficioscore")
    private Boolean titularcrearpatrTitularConBeneficiosCORE;

    @JsonProperty("p_atrrazonsocial")
    private String titularcrearpatrRazonSocial;

    public void checkArguments() throws NotNullArgumentException {
        checkTitularcrearpagrTipoIdentificacion();
        checkTitularcrearpagrSolicitud();
        checkTitularcrearpatrNumIdentificacion();
        checkTitularcrearpatrTipoPersona();
        checkTitularcrearpatrTitularConBeneficios();
        checkTitularcrearpatrTitularRecuperadoInc();
        checkTitularcrearpatrTitularConBeneficiosCORE();
    }

    @JsonIgnore
    public DepartamentoOid getTitularcrearpagrDepartamentoNac() {
        return this.titularcrearpagrDepartamentoNac;
    }
    
    public void setTitularcrearpagrDepartamentoNac(DepartamentoOid titularcrearpagrDepartamentoNac) {
        this.titularcrearpagrDepartamentoNac = titularcrearpagrDepartamentoNac;
    }

    @JsonIgnore
    public Departamento getTitularcrearpagrDepartamentoNacInstance() {
        return this.titularcrearpagrDepartamentoNacInstance;
    }
    
    public void setTitularcrearpagrDepartamentoNacInstance(Departamento titularcrearpagrDepartamentoNac) {
        this.titularcrearpagrDepartamentoNacInstance = titularcrearpagrDepartamentoNac;
        this.titularcrearpagrDepartamentoNac = titularcrearpagrDepartamentoNac != null ? titularcrearpagrDepartamentoNac.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getTitularcrearpagrMunicipioNac() {
        return this.titularcrearpagrMunicipioNac;
    }
    
    public void setTitularcrearpagrMunicipioNac(MunicipioOid titularcrearpagrMunicipioNac) {
        this.titularcrearpagrMunicipioNac = titularcrearpagrMunicipioNac;
    }

    @JsonIgnore
    public Municipio getTitularcrearpagrMunicipioNacInstance() {
        return this.titularcrearpagrMunicipioNacInstance;
    }
    
    public void setTitularcrearpagrMunicipioNacInstance(Municipio titularcrearpagrMunicipioNac) {
        this.titularcrearpagrMunicipioNacInstance = titularcrearpagrMunicipioNac;
        this.titularcrearpagrMunicipioNac = titularcrearpagrMunicipioNac != null ? titularcrearpagrMunicipioNac.getOid() : null;
    }

    @JsonIgnore
    public DireccionOid getTitularcrearpagrDireccion() {
        return this.titularcrearpagrDireccion;
    }
    
    public void setTitularcrearpagrDireccion(DireccionOid titularcrearpagrDireccion) {
        this.titularcrearpagrDireccion = titularcrearpagrDireccion;
    }

    @JsonIgnore
    public Direccion getTitularcrearpagrDireccionInstance() {
        return this.titularcrearpagrDireccionInstance;
    }
    
    public void setTitularcrearpagrDireccionInstance(Direccion titularcrearpagrDireccion) {
        this.titularcrearpagrDireccionInstance = titularcrearpagrDireccion;
        this.titularcrearpagrDireccion = titularcrearpagrDireccion != null ? titularcrearpagrDireccion.getOid() : null;
    }

    @JsonIgnore
    public TipoIdentificacionOid getTitularcrearpagrTipoIdentificacion() {
        return this.titularcrearpagrTipoIdentificacion;
    }
    
    public void setTitularcrearpagrTipoIdentificacion(TipoIdentificacionOid titularcrearpagrTipoIdentificacion) {
        this.titularcrearpagrTipoIdentificacion = titularcrearpagrTipoIdentificacion;
    }

    @JsonIgnore
    public TipoIdentificacion getTitularcrearpagrTipoIdentificacionInstance() {
        return this.titularcrearpagrTipoIdentificacionInstance;
    }
    
    public void setTitularcrearpagrTipoIdentificacionInstance(TipoIdentificacion titularcrearpagrTipoIdentificacion) {
        this.titularcrearpagrTipoIdentificacionInstance = titularcrearpagrTipoIdentificacion;
        this.titularcrearpagrTipoIdentificacion = titularcrearpagrTipoIdentificacion != null ? titularcrearpagrTipoIdentificacion.getOid() : null;
    }

    private void checkTitularcrearpagrTipoIdentificacion() throws NotNullArgumentException {
        if(this.getTitularcrearpagrTipoIdentificacionInstance() == null || this.getTitularcrearpagrTipoIdentificacionInstance().isNull()) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_CREAR, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_CREAR_TITULARCREARPAGRTIPOIDENTIFICACION, TitularConstants.SERV_ALIAS_CREAR, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_CREAR_TITULARCREARPAGRTIPOIDENTIFICACION);
        }
    }

    @JsonIgnore
    public SolicitudOid getTitularcrearpagrSolicitud() {
        return this.titularcrearpagrSolicitud;
    }
    
    public void setTitularcrearpagrSolicitud(SolicitudOid titularcrearpagrSolicitud) {
        this.titularcrearpagrSolicitud = titularcrearpagrSolicitud;
    }

    @JsonIgnore
    public Solicitud getTitularcrearpagrSolicitudInstance() {
        return this.titularcrearpagrSolicitudInstance;
    }
    
    public void setTitularcrearpagrSolicitudInstance(Solicitud titularcrearpagrSolicitud) {
        this.titularcrearpagrSolicitudInstance = titularcrearpagrSolicitud;
        this.titularcrearpagrSolicitud = titularcrearpagrSolicitud != null ? titularcrearpagrSolicitud.getOid() : null;
    }

    private void checkTitularcrearpagrSolicitud() throws NotNullArgumentException {
        if(this.getTitularcrearpagrSolicitudInstance() == null || this.getTitularcrearpagrSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_CREAR, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_CREAR_TITULARCREARPAGRSOLICITUD, TitularConstants.SERV_ALIAS_CREAR, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_CREAR_TITULARCREARPAGRSOLICITUD);
        }
    }

    @JsonIgnore
    public Long getTitularcrearpatrCodigo() {
        return this.titularcrearpatrCodigo;
    }
    
    public void setTitularcrearpatrCodigo(Long titularcrearpatrCodigo) {
        this.titularcrearpatrCodigo = titularcrearpatrCodigo;
    }

    @JsonIgnore
    public String getTitularcrearpatrNumIdentificacion() {
        return this.titularcrearpatrNumIdentificacion;
    }
    
    public void setTitularcrearpatrNumIdentificacion(String titularcrearpatrNumIdentificacion) {
        this.titularcrearpatrNumIdentificacion = titularcrearpatrNumIdentificacion;
    }

    private void checkTitularcrearpatrNumIdentificacion() throws NotNullArgumentException {
        if(this.getTitularcrearpatrNumIdentificacion() == null) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_CREAR, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_CREAR_TITULARCREARPATRNUMIDENTIFICACION, TitularConstants.SERV_ALIAS_CREAR, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_CREAR_TITULARCREARPATRNUMIDENTIFICACION);
        }
    }

    @JsonIgnore
    public String getTitularcrearpatrTipoPersona() {
        return this.titularcrearpatrTipoPersona;
    }
    
    public void setTitularcrearpatrTipoPersona(String titularcrearpatrTipoPersona) {
        this.titularcrearpatrTipoPersona = titularcrearpatrTipoPersona;
    }

    private void checkTitularcrearpatrTipoPersona() throws NotNullArgumentException {
        if(this.getTitularcrearpatrTipoPersona() == null) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_CREAR, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_CREAR_TITULARCREARPATRTIPOPERSONA, TitularConstants.SERV_ALIAS_CREAR, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_CREAR_TITULARCREARPATRTIPOPERSONA);
        }
    }

    @JsonIgnore
    public String getTitularcrearpatrPrimerNombre() {
        return this.titularcrearpatrPrimerNombre;
    }
    
    public void setTitularcrearpatrPrimerNombre(String titularcrearpatrPrimerNombre) {
        this.titularcrearpatrPrimerNombre = titularcrearpatrPrimerNombre;
    }

    @JsonIgnore
    public String getTitularcrearpatrSegundoNombre() {
        return this.titularcrearpatrSegundoNombre;
    }
    
    public void setTitularcrearpatrSegundoNombre(String titularcrearpatrSegundoNombre) {
        this.titularcrearpatrSegundoNombre = titularcrearpatrSegundoNombre;
    }

    @JsonIgnore
    public String getTitularcrearpatrPrimerApellido() {
        return this.titularcrearpatrPrimerApellido;
    }
    
    public void setTitularcrearpatrPrimerApellido(String titularcrearpatrPrimerApellido) {
        this.titularcrearpatrPrimerApellido = titularcrearpatrPrimerApellido;
    }

    @JsonIgnore
    public String getTitularcrearpatrSegundoApellido() {
        return this.titularcrearpatrSegundoApellido;
    }
    
    public void setTitularcrearpatrSegundoApellido(String titularcrearpatrSegundoApellido) {
        this.titularcrearpatrSegundoApellido = titularcrearpatrSegundoApellido;
    }

    @JsonIgnore
    public Date getTitularcrearpatrFechaNacimiento() {
        return this.titularcrearpatrFechaNacimiento;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setTitularcrearpatrFechaNacimiento(Date titularcrearpatrFechaNacimiento) {
        this.titularcrearpatrFechaNacimiento = titularcrearpatrFechaNacimiento;
    }

    @JsonIgnore
    public String getTitularcrearpatrGenero() {
        return this.titularcrearpatrGenero;
    }
    
    public void setTitularcrearpatrGenero(String titularcrearpatrGenero) {
        this.titularcrearpatrGenero = titularcrearpatrGenero;
    }

    @JsonIgnore
    public Boolean getTitularcrearpatrIndicadorExtranjero() {
        return this.titularcrearpatrIndicadorExtranjero;
    }
    
    public void setTitularcrearpatrIndicadorExtranjero(Boolean titularcrearpatrIndicadorExtranjero) {
        this.titularcrearpatrIndicadorExtranjero = titularcrearpatrIndicadorExtranjero;
    }

    @JsonIgnore
    public String getTitularcrearpatrTelefonoFijo() {
        return this.titularcrearpatrTelefonoFijo;
    }
    
    public void setTitularcrearpatrTelefonoFijo(String titularcrearpatrTelefonoFijo) {
        this.titularcrearpatrTelefonoFijo = titularcrearpatrTelefonoFijo;
    }

    @JsonIgnore
    public String getTitularcrearpatrTelefonoCelular() {
        return this.titularcrearpatrTelefonoCelular;
    }
    
    public void setTitularcrearpatrTelefonoCelular(String titularcrearpatrTelefonoCelular) {
        this.titularcrearpatrTelefonoCelular = titularcrearpatrTelefonoCelular;
    }

    @JsonIgnore
    public String getTitularcrearpatrCorreoElectronico() {
        return this.titularcrearpatrCorreoElectronico;
    }
    
    public void setTitularcrearpatrCorreoElectronico(String titularcrearpatrCorreoElectronico) {
        this.titularcrearpatrCorreoElectronico = titularcrearpatrCorreoElectronico;
    }

    @JsonIgnore
    public Boolean getTitularcrearpatrTitularConBeneficios() {
        return this.titularcrearpatrTitularConBeneficios;
    }
    
    public void setTitularcrearpatrTitularConBeneficios(Boolean titularcrearpatrTitularConBeneficios) {
        this.titularcrearpatrTitularConBeneficios = titularcrearpatrTitularConBeneficios;
    }

    private void checkTitularcrearpatrTitularConBeneficios() throws NotNullArgumentException {
        if(this.getTitularcrearpatrTitularConBeneficios() == null) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_CREAR, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_CREAR_TITULARCREARPATRTITULARCONBENEFICIOS, TitularConstants.SERV_ALIAS_CREAR, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_CREAR_TITULARCREARPATRTITULARCONBENEFICIOS);
        }
    }

    @JsonIgnore
    public Boolean getTitularcrearpatrTitularRecuperadoInc() {
        return this.titularcrearpatrTitularRecuperadoInc;
    }
    
    public void setTitularcrearpatrTitularRecuperadoInc(Boolean titularcrearpatrTitularRecuperadoInc) {
        this.titularcrearpatrTitularRecuperadoInc = titularcrearpatrTitularRecuperadoInc;
    }

    private void checkTitularcrearpatrTitularRecuperadoInc() throws NotNullArgumentException {
        if(this.getTitularcrearpatrTitularRecuperadoInc() == null) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_CREAR, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_CREAR_TITULARCREARPATRTITULARRECUPERADOINC, TitularConstants.SERV_ALIAS_CREAR, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_CREAR_TITULARCREARPATRTITULARRECUPERADOINC);
        }
    }

    @JsonIgnore
    public String getTitularcrearpatrTelefonoFijoDC() {
        return this.titularcrearpatrTelefonoFijoDC;
    }
    
    public void setTitularcrearpatrTelefonoFijoDC(String titularcrearpatrTelefonoFijoDC) {
        this.titularcrearpatrTelefonoFijoDC = titularcrearpatrTelefonoFijoDC;
    }

    @JsonIgnore
    public String getTitularcrearpatrTelefonoCelularDC() {
        return this.titularcrearpatrTelefonoCelularDC;
    }
    
    public void setTitularcrearpatrTelefonoCelularDC(String titularcrearpatrTelefonoCelularDC) {
        this.titularcrearpatrTelefonoCelularDC = titularcrearpatrTelefonoCelularDC;
    }

    @JsonIgnore
    public Boolean getTitularcrearpatrTitularConBeneficiosCORE() {
        return this.titularcrearpatrTitularConBeneficiosCORE;
    }
    
    public void setTitularcrearpatrTitularConBeneficiosCORE(Boolean titularcrearpatrTitularConBeneficiosCORE) {
        this.titularcrearpatrTitularConBeneficiosCORE = titularcrearpatrTitularConBeneficiosCORE;
    }

    private void checkTitularcrearpatrTitularConBeneficiosCORE() throws NotNullArgumentException {
        if(this.getTitularcrearpatrTitularConBeneficiosCORE() == null) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_CREAR, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_CREAR_TITULARCREARPATRTITULARCONBENEFICIOSCORE, TitularConstants.SERV_ALIAS_CREAR, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_CREAR_TITULARCREARPATRTITULARCONBENEFICIOSCORE);
        }
    }

    @JsonIgnore
    public String getTitularcrearpatrRazonSocial() {
        return this.titularcrearpatrRazonSocial;
    }
    
    public void setTitularcrearpatrRazonSocial(String titularcrearpatrRazonSocial) {
        this.titularcrearpatrRazonSocial = titularcrearpatrRazonSocial;
    }
}
