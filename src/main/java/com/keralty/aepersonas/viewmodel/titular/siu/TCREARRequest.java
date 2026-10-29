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

public class TCREARRequest {

    @JsonProperty("pt_p_agrsolicitud_oid")
    private SolicitudOid titularTCREARptpagrSolicitud;
    
    @JsonIgnore
    private Solicitud titularTCREARptpagrSolicitudInstance;

    @JsonProperty("pt_p_agrdepartamentonac_oid")
    private DepartamentoOid titularTCREARptpagrDepartamentoNac;
    
    @JsonIgnore
    private Departamento titularTCREARptpagrDepartamentoNacInstance;

    @JsonProperty("pt_p_agrmunicipionac_oid")
    private MunicipioOid titularTCREARptpagrMunicipioNac;
    
    @JsonIgnore
    private Municipio titularTCREARptpagrMunicipioNacInstance;

    @JsonProperty("pt_p_agrdireccion_oid")
    private DireccionOid titularTCREARptpagrDireccion;
    
    @JsonIgnore
    private Direccion titularTCREARptpagrDireccionInstance;

    @JsonProperty("pt_p_agrtipoidentificacion_oid")
    private TipoIdentificacionOid titularTCREARptpagrTipoIdentificacion;
    
    @JsonIgnore
    private TipoIdentificacion titularTCREARptpagrTipoIdentificacionInstance;

    @JsonProperty("pt_p_atrcodigo")
    private Long titularTCREARptpatrCodigo;

    @JsonProperty("pt_p_atrnumidentificacion")
    private String titularTCREARptpatrNumIdentificacion;

    @JsonProperty("pt_p_atrtipopersona")
    private String titularTCREARptpatrTipoPersona;

    @JsonProperty("pt_p_atrprimernombre")
    private String titularTCREARptpatrPrimerNombre;

    @JsonProperty("pt_p_atrsegundonombre")
    private String titularTCREARptpatrSegundoNombre;

    @JsonProperty("pt_p_atrprimerapellido")
    private String titularTCREARptpatrPrimerApellido;

    @JsonProperty("pt_p_atrsegundoapellido")
    private String titularTCREARptpatrSegundoApellido;

    @JsonProperty("pt_p_atrfechanacimiento")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date titularTCREARptpatrFechaNacimiento;

    @JsonProperty("pt_p_atrgenero")
    private String titularTCREARptpatrGenero;

    @JsonProperty("pt_p_atrindicadorextranjero")
    private Boolean titularTCREARptpatrIndicadorExtranjero;

    @JsonProperty("pt_p_atrtelefonofijo")
    private String titularTCREARptpatrTelefonoFijo;

    @JsonProperty("pt_p_atrtelefonocelular")
    private String titularTCREARptpatrTelefonoCelular;

    @JsonProperty("pt_p_atrcorreoelectronico")
    private String titularTCREARptpatrCorreoElectronico;

    @JsonProperty("pt_p_atrtitularconbeneficios")
    private Boolean titularTCREARptpatrTitularConBeneficios;

    @JsonProperty("pt_p_atrtitularrecuperadoinc")
    private Boolean titularTCREARptpatrTitularRecuperadoInc;

    @JsonProperty("pt_p_atrtelefonofijodc")
    private String titularTCREARptpatrTelefonoFijoDC;

    @JsonProperty("pt_p_atrtelefonocelulardc")
    private String titularTCREARptpatrTelefonoCelularDC;

    @JsonProperty("pt_p_atrtitularconbeneficiosco")
    private Boolean titularTCREARptpatrTitularConBeneficiosCO;

    @JsonProperty("pt_p_atrrazonsocial")
    private String titularTCREARptpatrRazonSocial;

    public void checkArguments() throws NotNullArgumentException {
        checkTitularTCREARptpagrSolicitud();
        checkTitularTCREARptpagrTipoIdentificacion();
        checkTitularTCREARptpatrNumIdentificacion();
        checkTitularTCREARptpatrTipoPersona();
        checkTitularTCREARptpatrTitularConBeneficios();
        checkTitularTCREARptpatrTitularRecuperadoInc();
        checkTitularTCREARptpatrTitularConBeneficiosCO();
    }

    @JsonIgnore
    public SolicitudOid getTitularTCREARptpagrSolicitud() {
        return this.titularTCREARptpagrSolicitud;
    }
    
    public void setTitularTCREARptpagrSolicitud(SolicitudOid titularTCREARptpagrSolicitud) {
        this.titularTCREARptpagrSolicitud = titularTCREARptpagrSolicitud;
    }

    @JsonIgnore
    public Solicitud getTitularTCREARptpagrSolicitudInstance() {
        return this.titularTCREARptpagrSolicitudInstance;
    }
    
    public void setTitularTCREARptpagrSolicitudInstance(Solicitud titularTCREARptpagrSolicitud) {
        this.titularTCREARptpagrSolicitudInstance = titularTCREARptpagrSolicitud;
        this.titularTCREARptpagrSolicitud = titularTCREARptpagrSolicitud != null ? titularTCREARptpagrSolicitud.getOid() : null;
    }

    private void checkTitularTCREARptpagrSolicitud() throws NotNullArgumentException {
        if(this.getTitularTCREARptpagrSolicitudInstance() == null || this.getTitularTCREARptpagrSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_TCREAR, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_TCREAR_TITULARTCREARPTPAGRSOLICITUD, TitularConstants.SERV_ALIAS_TCREAR, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_TCREAR_TITULARTCREARPTPAGRSOLICITUD);
        }
    }

    @JsonIgnore
    public DepartamentoOid getTitularTCREARptpagrDepartamentoNac() {
        return this.titularTCREARptpagrDepartamentoNac;
    }
    
    public void setTitularTCREARptpagrDepartamentoNac(DepartamentoOid titularTCREARptpagrDepartamentoNac) {
        this.titularTCREARptpagrDepartamentoNac = titularTCREARptpagrDepartamentoNac;
    }

    @JsonIgnore
    public Departamento getTitularTCREARptpagrDepartamentoNacInstance() {
        return this.titularTCREARptpagrDepartamentoNacInstance;
    }
    
    public void setTitularTCREARptpagrDepartamentoNacInstance(Departamento titularTCREARptpagrDepartamentoNac) {
        this.titularTCREARptpagrDepartamentoNacInstance = titularTCREARptpagrDepartamentoNac;
        this.titularTCREARptpagrDepartamentoNac = titularTCREARptpagrDepartamentoNac != null ? titularTCREARptpagrDepartamentoNac.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getTitularTCREARptpagrMunicipioNac() {
        return this.titularTCREARptpagrMunicipioNac;
    }
    
    public void setTitularTCREARptpagrMunicipioNac(MunicipioOid titularTCREARptpagrMunicipioNac) {
        this.titularTCREARptpagrMunicipioNac = titularTCREARptpagrMunicipioNac;
    }

    @JsonIgnore
    public Municipio getTitularTCREARptpagrMunicipioNacInstance() {
        return this.titularTCREARptpagrMunicipioNacInstance;
    }
    
    public void setTitularTCREARptpagrMunicipioNacInstance(Municipio titularTCREARptpagrMunicipioNac) {
        this.titularTCREARptpagrMunicipioNacInstance = titularTCREARptpagrMunicipioNac;
        this.titularTCREARptpagrMunicipioNac = titularTCREARptpagrMunicipioNac != null ? titularTCREARptpagrMunicipioNac.getOid() : null;
    }

    @JsonIgnore
    public DireccionOid getTitularTCREARptpagrDireccion() {
        return this.titularTCREARptpagrDireccion;
    }
    
    public void setTitularTCREARptpagrDireccion(DireccionOid titularTCREARptpagrDireccion) {
        this.titularTCREARptpagrDireccion = titularTCREARptpagrDireccion;
    }

    @JsonIgnore
    public Direccion getTitularTCREARptpagrDireccionInstance() {
        return this.titularTCREARptpagrDireccionInstance;
    }
    
    public void setTitularTCREARptpagrDireccionInstance(Direccion titularTCREARptpagrDireccion) {
        this.titularTCREARptpagrDireccionInstance = titularTCREARptpagrDireccion;
        this.titularTCREARptpagrDireccion = titularTCREARptpagrDireccion != null ? titularTCREARptpagrDireccion.getOid() : null;
    }

    @JsonIgnore
    public TipoIdentificacionOid getTitularTCREARptpagrTipoIdentificacion() {
        return this.titularTCREARptpagrTipoIdentificacion;
    }
    
    public void setTitularTCREARptpagrTipoIdentificacion(TipoIdentificacionOid titularTCREARptpagrTipoIdentificacion) {
        this.titularTCREARptpagrTipoIdentificacion = titularTCREARptpagrTipoIdentificacion;
    }

    @JsonIgnore
    public TipoIdentificacion getTitularTCREARptpagrTipoIdentificacionInstance() {
        return this.titularTCREARptpagrTipoIdentificacionInstance;
    }
    
    public void setTitularTCREARptpagrTipoIdentificacionInstance(TipoIdentificacion titularTCREARptpagrTipoIdentificacion) {
        this.titularTCREARptpagrTipoIdentificacionInstance = titularTCREARptpagrTipoIdentificacion;
        this.titularTCREARptpagrTipoIdentificacion = titularTCREARptpagrTipoIdentificacion != null ? titularTCREARptpagrTipoIdentificacion.getOid() : null;
    }

    private void checkTitularTCREARptpagrTipoIdentificacion() throws NotNullArgumentException {
        if(this.getTitularTCREARptpagrTipoIdentificacionInstance() == null || this.getTitularTCREARptpagrTipoIdentificacionInstance().isNull()) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_TCREAR, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_TCREAR_TITULARTCREARPTPAGRTIPOIDENTIFICACION, TitularConstants.SERV_ALIAS_TCREAR, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_TCREAR_TITULARTCREARPTPAGRTIPOIDENTIFICACION);
        }
    }

    @JsonIgnore
    public Long getTitularTCREARptpatrCodigo() {
        return this.titularTCREARptpatrCodigo;
    }
    
    public void setTitularTCREARptpatrCodigo(Long titularTCREARptpatrCodigo) {
        this.titularTCREARptpatrCodigo = titularTCREARptpatrCodigo;
    }

    @JsonIgnore
    public String getTitularTCREARptpatrNumIdentificacion() {
        return this.titularTCREARptpatrNumIdentificacion;
    }
    
    public void setTitularTCREARptpatrNumIdentificacion(String titularTCREARptpatrNumIdentificacion) {
        this.titularTCREARptpatrNumIdentificacion = titularTCREARptpatrNumIdentificacion;
    }

    private void checkTitularTCREARptpatrNumIdentificacion() throws NotNullArgumentException {
        if(this.getTitularTCREARptpatrNumIdentificacion() == null) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_TCREAR, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_TCREAR_TITULARTCREARPTPATRNUMIDENTIFICACION, TitularConstants.SERV_ALIAS_TCREAR, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_TCREAR_TITULARTCREARPTPATRNUMIDENTIFICACION);
        }
    }

    @JsonIgnore
    public String getTitularTCREARptpatrTipoPersona() {
        return this.titularTCREARptpatrTipoPersona;
    }
    
    public void setTitularTCREARptpatrTipoPersona(String titularTCREARptpatrTipoPersona) {
        this.titularTCREARptpatrTipoPersona = titularTCREARptpatrTipoPersona;
    }

    private void checkTitularTCREARptpatrTipoPersona() throws NotNullArgumentException {
        if(this.getTitularTCREARptpatrTipoPersona() == null) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_TCREAR, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_TCREAR_TITULARTCREARPTPATRTIPOPERSONA, TitularConstants.SERV_ALIAS_TCREAR, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_TCREAR_TITULARTCREARPTPATRTIPOPERSONA);
        }
    }

    @JsonIgnore
    public String getTitularTCREARptpatrPrimerNombre() {
        return this.titularTCREARptpatrPrimerNombre;
    }
    
    public void setTitularTCREARptpatrPrimerNombre(String titularTCREARptpatrPrimerNombre) {
        this.titularTCREARptpatrPrimerNombre = titularTCREARptpatrPrimerNombre;
    }

    @JsonIgnore
    public String getTitularTCREARptpatrSegundoNombre() {
        return this.titularTCREARptpatrSegundoNombre;
    }
    
    public void setTitularTCREARptpatrSegundoNombre(String titularTCREARptpatrSegundoNombre) {
        this.titularTCREARptpatrSegundoNombre = titularTCREARptpatrSegundoNombre;
    }

    @JsonIgnore
    public String getTitularTCREARptpatrPrimerApellido() {
        return this.titularTCREARptpatrPrimerApellido;
    }
    
    public void setTitularTCREARptpatrPrimerApellido(String titularTCREARptpatrPrimerApellido) {
        this.titularTCREARptpatrPrimerApellido = titularTCREARptpatrPrimerApellido;
    }

    @JsonIgnore
    public String getTitularTCREARptpatrSegundoApellido() {
        return this.titularTCREARptpatrSegundoApellido;
    }
    
    public void setTitularTCREARptpatrSegundoApellido(String titularTCREARptpatrSegundoApellido) {
        this.titularTCREARptpatrSegundoApellido = titularTCREARptpatrSegundoApellido;
    }

    @JsonIgnore
    public Date getTitularTCREARptpatrFechaNacimiento() {
        return this.titularTCREARptpatrFechaNacimiento;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setTitularTCREARptpatrFechaNacimiento(Date titularTCREARptpatrFechaNacimiento) {
        this.titularTCREARptpatrFechaNacimiento = titularTCREARptpatrFechaNacimiento;
    }

    @JsonIgnore
    public String getTitularTCREARptpatrGenero() {
        return this.titularTCREARptpatrGenero;
    }
    
    public void setTitularTCREARptpatrGenero(String titularTCREARptpatrGenero) {
        this.titularTCREARptpatrGenero = titularTCREARptpatrGenero;
    }

    @JsonIgnore
    public Boolean getTitularTCREARptpatrIndicadorExtranjero() {
        return this.titularTCREARptpatrIndicadorExtranjero;
    }
    
    public void setTitularTCREARptpatrIndicadorExtranjero(Boolean titularTCREARptpatrIndicadorExtranjero) {
        this.titularTCREARptpatrIndicadorExtranjero = titularTCREARptpatrIndicadorExtranjero;
    }

    @JsonIgnore
    public String getTitularTCREARptpatrTelefonoFijo() {
        return this.titularTCREARptpatrTelefonoFijo;
    }
    
    public void setTitularTCREARptpatrTelefonoFijo(String titularTCREARptpatrTelefonoFijo) {
        this.titularTCREARptpatrTelefonoFijo = titularTCREARptpatrTelefonoFijo;
    }

    @JsonIgnore
    public String getTitularTCREARptpatrTelefonoCelular() {
        return this.titularTCREARptpatrTelefonoCelular;
    }
    
    public void setTitularTCREARptpatrTelefonoCelular(String titularTCREARptpatrTelefonoCelular) {
        this.titularTCREARptpatrTelefonoCelular = titularTCREARptpatrTelefonoCelular;
    }

    @JsonIgnore
    public String getTitularTCREARptpatrCorreoElectronico() {
        return this.titularTCREARptpatrCorreoElectronico;
    }
    
    public void setTitularTCREARptpatrCorreoElectronico(String titularTCREARptpatrCorreoElectronico) {
        this.titularTCREARptpatrCorreoElectronico = titularTCREARptpatrCorreoElectronico;
    }

    @JsonIgnore
    public Boolean getTitularTCREARptpatrTitularConBeneficios() {
        return this.titularTCREARptpatrTitularConBeneficios;
    }
    
    public void setTitularTCREARptpatrTitularConBeneficios(Boolean titularTCREARptpatrTitularConBeneficios) {
        this.titularTCREARptpatrTitularConBeneficios = titularTCREARptpatrTitularConBeneficios;
    }

    private void checkTitularTCREARptpatrTitularConBeneficios() throws NotNullArgumentException {
        if(this.getTitularTCREARptpatrTitularConBeneficios() == null) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_TCREAR, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_TCREAR_TITULARTCREARPTPATRTITULARCONBENEFICIOS, TitularConstants.SERV_ALIAS_TCREAR, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_TCREAR_TITULARTCREARPTPATRTITULARCONBENEFICIOS);
        }
    }

    @JsonIgnore
    public Boolean getTitularTCREARptpatrTitularRecuperadoInc() {
        return this.titularTCREARptpatrTitularRecuperadoInc;
    }
    
    public void setTitularTCREARptpatrTitularRecuperadoInc(Boolean titularTCREARptpatrTitularRecuperadoInc) {
        this.titularTCREARptpatrTitularRecuperadoInc = titularTCREARptpatrTitularRecuperadoInc;
    }

    private void checkTitularTCREARptpatrTitularRecuperadoInc() throws NotNullArgumentException {
        if(this.getTitularTCREARptpatrTitularRecuperadoInc() == null) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_TCREAR, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_TCREAR_TITULARTCREARPTPATRTITULARRECUPERADOINC, TitularConstants.SERV_ALIAS_TCREAR, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_TCREAR_TITULARTCREARPTPATRTITULARRECUPERADOINC);
        }
    }

    @JsonIgnore
    public String getTitularTCREARptpatrTelefonoFijoDC() {
        return this.titularTCREARptpatrTelefonoFijoDC;
    }
    
    public void setTitularTCREARptpatrTelefonoFijoDC(String titularTCREARptpatrTelefonoFijoDC) {
        this.titularTCREARptpatrTelefonoFijoDC = titularTCREARptpatrTelefonoFijoDC;
    }

    @JsonIgnore
    public String getTitularTCREARptpatrTelefonoCelularDC() {
        return this.titularTCREARptpatrTelefonoCelularDC;
    }
    
    public void setTitularTCREARptpatrTelefonoCelularDC(String titularTCREARptpatrTelefonoCelularDC) {
        this.titularTCREARptpatrTelefonoCelularDC = titularTCREARptpatrTelefonoCelularDC;
    }

    @JsonIgnore
    public Boolean getTitularTCREARptpatrTitularConBeneficiosCO() {
        return this.titularTCREARptpatrTitularConBeneficiosCO;
    }
    
    public void setTitularTCREARptpatrTitularConBeneficiosCO(Boolean titularTCREARptpatrTitularConBeneficiosCO) {
        this.titularTCREARptpatrTitularConBeneficiosCO = titularTCREARptpatrTitularConBeneficiosCO;
    }

    private void checkTitularTCREARptpatrTitularConBeneficiosCO() throws NotNullArgumentException {
        if(this.getTitularTCREARptpatrTitularConBeneficiosCO() == null) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_TCREAR, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_TCREAR_TITULARTCREARPTPATRTITULARCONBENEFICIOSCO, TitularConstants.SERV_ALIAS_TCREAR, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_TCREAR_TITULARTCREARPTPATRTITULARCONBENEFICIOSCO);
        }
    }

    @JsonIgnore
    public String getTitularTCREARptpatrRazonSocial() {
        return this.titularTCREARptpatrRazonSocial;
    }
    
    public void setTitularTCREARptpatrRazonSocial(String titularTCREARptpatrRazonSocial) {
        this.titularTCREARptpatrRazonSocial = titularTCREARptpatrRazonSocial;
    }
}
