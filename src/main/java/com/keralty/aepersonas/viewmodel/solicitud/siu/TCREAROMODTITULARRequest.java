package com.keralty.aepersonas.viewmodel.solicitud.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.persistence.Solicitud;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneDeserializer;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneSerializer;
import java.sql.Date;

public class TCREAROMODTITULARRequest {

    @JsonProperty("p_thissolicitud_oid")
    private SolicitudOid solicitudTCREAROMODTITULARpthisSolicitud;
    
    @JsonIgnore
    private Solicitud solicitudTCREAROMODTITULARpthisSolicitudInstance;

    @JsonProperty("pt_p_agrtipoidentificacion_oid")
    private TipoIdentificacionOid solicitudTCREAROMODTITULARptpagrTipoIdentificacion;
    
    @JsonIgnore
    private TipoIdentificacion solicitudTCREAROMODTITULARptpagrTipoIdentificacionInstance;

    @JsonProperty("pt_p_agrdepartamentonac_oid")
    private DepartamentoOid solicitudTCREAROMODTITULARptpagrDepartamentoNac;
    
    @JsonIgnore
    private Departamento solicitudTCREAROMODTITULARptpagrDepartamentoNacInstance;

    @JsonProperty("pt_p_agrmunicipionac_oid")
    private MunicipioOid solicitudTCREAROMODTITULARptpagrMunicipioNac;
    
    @JsonIgnore
    private Municipio solicitudTCREAROMODTITULARptpagrMunicipioNacInstance;

    @JsonProperty("pt_p_atrcodigo")
    private Long solicitudTCREAROMODTITULARptpatrCodigo;

    @JsonProperty("pt_p_atrnumidentificacion")
    private String solicitudTCREAROMODTITULARptpatrNumIdentificacion;

    @JsonProperty("pt_p_atrtipopersona")
    private String solicitudTCREAROMODTITULARptpatrTipoPersona;

    @JsonProperty("pt_p_atrprimernombre")
    private String solicitudTCREAROMODTITULARptpatrPrimerNombre;

    @JsonProperty("pt_p_atrsegundonombre")
    private String solicitudTCREAROMODTITULARptpatrSegundoNombre;

    @JsonProperty("pt_p_atrprimerapellido")
    private String solicitudTCREAROMODTITULARptpatrPrimerApellido;

    @JsonProperty("pt_p_atrsegundoapellido")
    private String solicitudTCREAROMODTITULARptpatrSegundoApellido;

    @JsonProperty("pt_p_atrfechanacimiento")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date solicitudTCREAROMODTITULARptpatrFechaNacimiento;

    @JsonProperty("pt_p_atrgenero")
    private String solicitudTCREAROMODTITULARptpatrGenero;

    @JsonProperty("pt_p_atrindicadorextranjero")
    private Boolean solicitudTCREAROMODTITULARptpatrIndicadorExtranjero;

    @JsonProperty("pt_p_atrtelefonofijo")
    private String solicitudTCREAROMODTITULARptpatrTelefonoFijo;

    @JsonProperty("pt_p_atrtelefonocelular")
    private String solicitudTCREAROMODTITULARptpatrTelefonoCelular;

    @JsonProperty("pt_p_atrcorreoelectronico")
    private String solicitudTCREAROMODTITULARptpatrCorreoElectronico;

    @JsonProperty("pt_p_atrtitularconbeneficios")
    private Boolean solicitudTCREAROMODTITULARptpatrTitularConBeneficios;

    @JsonProperty("pt_p_atrtitularrecuperadoinc")
    private Boolean solicitudTCREAROMODTITULARptpatrTitularRecuperadoInc;

    @JsonProperty("ptdctelefonofijo")
    private String solicitudTCREAROMODTITULARptDCTelefonoFijo;

    @JsonProperty("ptdctelefonocelular")
    private String solicitudTCREAROMODTITULARptDCTelefonoCelular;

    @JsonProperty("pttitconbeneficioscore")
    private Boolean solicitudTCREAROMODTITULARptTitConBeneficiosCORE;

    @JsonProperty("ptrazonsocial")
    private String solicitudTCREAROMODTITULARptRazonSocial;

    public void checkArguments() throws NotNullArgumentException {
        checkSolicitudTCREAROMODTITULARpthisSolicitud();
        checkSolicitudTCREAROMODTITULARptpagrTipoIdentificacion();
        checkSolicitudTCREAROMODTITULARptpatrNumIdentificacion();
        checkSolicitudTCREAROMODTITULARptpatrTipoPersona();
        checkSolicitudTCREAROMODTITULARptpatrTitularConBeneficios();
        checkSolicitudTCREAROMODTITULARptpatrTitularRecuperadoInc();
        checkSolicitudTCREAROMODTITULARptTitConBeneficiosCORE();
    }

    @JsonIgnore
    public SolicitudOid getSolicitudTCREAROMODTITULARpthisSolicitud() {
        return this.solicitudTCREAROMODTITULARpthisSolicitud;
    }
    
    public void setSolicitudTCREAROMODTITULARpthisSolicitud(SolicitudOid solicitudTCREAROMODTITULARpthisSolicitud) {
        this.solicitudTCREAROMODTITULARpthisSolicitud = solicitudTCREAROMODTITULARpthisSolicitud;
    }

    @JsonIgnore
    public Solicitud getSolicitudTCREAROMODTITULARpthisSolicitudInstance() {
        return this.solicitudTCREAROMODTITULARpthisSolicitudInstance;
    }
    
    public void setSolicitudTCREAROMODTITULARpthisSolicitudInstance(Solicitud solicitudTCREAROMODTITULARpthisSolicitud) {
        this.solicitudTCREAROMODTITULARpthisSolicitudInstance = solicitudTCREAROMODTITULARpthisSolicitud;
        this.solicitudTCREAROMODTITULARpthisSolicitud = solicitudTCREAROMODTITULARpthisSolicitud != null ? solicitudTCREAROMODTITULARpthisSolicitud.getOid() : null;
    }

    private void checkSolicitudTCREAROMODTITULARpthisSolicitud() throws NotNullArgumentException {
        if(this.getSolicitudTCREAROMODTITULARpthisSolicitudInstance() == null || this.getSolicitudTCREAROMODTITULARpthisSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_TCREAROMODTITULAR, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTHISSOLICITUD, SolicitudConstants.SERV_ALIAS_TCREAROMODTITULAR, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTHISSOLICITUD);
        }
    }

    @JsonIgnore
    public TipoIdentificacionOid getSolicitudTCREAROMODTITULARptpagrTipoIdentificacion() {
        return this.solicitudTCREAROMODTITULARptpagrTipoIdentificacion;
    }
    
    public void setSolicitudTCREAROMODTITULARptpagrTipoIdentificacion(TipoIdentificacionOid solicitudTCREAROMODTITULARptpagrTipoIdentificacion) {
        this.solicitudTCREAROMODTITULARptpagrTipoIdentificacion = solicitudTCREAROMODTITULARptpagrTipoIdentificacion;
    }

    @JsonIgnore
    public TipoIdentificacion getSolicitudTCREAROMODTITULARptpagrTipoIdentificacionInstance() {
        return this.solicitudTCREAROMODTITULARptpagrTipoIdentificacionInstance;
    }
    
    public void setSolicitudTCREAROMODTITULARptpagrTipoIdentificacionInstance(TipoIdentificacion solicitudTCREAROMODTITULARptpagrTipoIdentificacion) {
        this.solicitudTCREAROMODTITULARptpagrTipoIdentificacionInstance = solicitudTCREAROMODTITULARptpagrTipoIdentificacion;
        this.solicitudTCREAROMODTITULARptpagrTipoIdentificacion = solicitudTCREAROMODTITULARptpagrTipoIdentificacion != null ? solicitudTCREAROMODTITULARptpagrTipoIdentificacion.getOid() : null;
    }

    private void checkSolicitudTCREAROMODTITULARptpagrTipoIdentificacion() throws NotNullArgumentException {
        if(this.getSolicitudTCREAROMODTITULARptpagrTipoIdentificacionInstance() == null || this.getSolicitudTCREAROMODTITULARptpagrTipoIdentificacionInstance().isNull()) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_TCREAROMODTITULAR, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPAGRTIPOIDENTIFICACION, SolicitudConstants.SERV_ALIAS_TCREAROMODTITULAR, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPAGRTIPOIDENTIFICACION);
        }
    }

    @JsonIgnore
    public DepartamentoOid getSolicitudTCREAROMODTITULARptpagrDepartamentoNac() {
        return this.solicitudTCREAROMODTITULARptpagrDepartamentoNac;
    }
    
    public void setSolicitudTCREAROMODTITULARptpagrDepartamentoNac(DepartamentoOid solicitudTCREAROMODTITULARptpagrDepartamentoNac) {
        this.solicitudTCREAROMODTITULARptpagrDepartamentoNac = solicitudTCREAROMODTITULARptpagrDepartamentoNac;
    }

    @JsonIgnore
    public Departamento getSolicitudTCREAROMODTITULARptpagrDepartamentoNacInstance() {
        return this.solicitudTCREAROMODTITULARptpagrDepartamentoNacInstance;
    }
    
    public void setSolicitudTCREAROMODTITULARptpagrDepartamentoNacInstance(Departamento solicitudTCREAROMODTITULARptpagrDepartamentoNac) {
        this.solicitudTCREAROMODTITULARptpagrDepartamentoNacInstance = solicitudTCREAROMODTITULARptpagrDepartamentoNac;
        this.solicitudTCREAROMODTITULARptpagrDepartamentoNac = solicitudTCREAROMODTITULARptpagrDepartamentoNac != null ? solicitudTCREAROMODTITULARptpagrDepartamentoNac.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getSolicitudTCREAROMODTITULARptpagrMunicipioNac() {
        return this.solicitudTCREAROMODTITULARptpagrMunicipioNac;
    }
    
    public void setSolicitudTCREAROMODTITULARptpagrMunicipioNac(MunicipioOid solicitudTCREAROMODTITULARptpagrMunicipioNac) {
        this.solicitudTCREAROMODTITULARptpagrMunicipioNac = solicitudTCREAROMODTITULARptpagrMunicipioNac;
    }

    @JsonIgnore
    public Municipio getSolicitudTCREAROMODTITULARptpagrMunicipioNacInstance() {
        return this.solicitudTCREAROMODTITULARptpagrMunicipioNacInstance;
    }
    
    public void setSolicitudTCREAROMODTITULARptpagrMunicipioNacInstance(Municipio solicitudTCREAROMODTITULARptpagrMunicipioNac) {
        this.solicitudTCREAROMODTITULARptpagrMunicipioNacInstance = solicitudTCREAROMODTITULARptpagrMunicipioNac;
        this.solicitudTCREAROMODTITULARptpagrMunicipioNac = solicitudTCREAROMODTITULARptpagrMunicipioNac != null ? solicitudTCREAROMODTITULARptpagrMunicipioNac.getOid() : null;
    }

    @JsonIgnore
    public Long getSolicitudTCREAROMODTITULARptpatrCodigo() {
        return this.solicitudTCREAROMODTITULARptpatrCodigo;
    }
    
    public void setSolicitudTCREAROMODTITULARptpatrCodigo(Long solicitudTCREAROMODTITULARptpatrCodigo) {
        this.solicitudTCREAROMODTITULARptpatrCodigo = solicitudTCREAROMODTITULARptpatrCodigo;
    }

    @JsonIgnore
    public String getSolicitudTCREAROMODTITULARptpatrNumIdentificacion() {
        return this.solicitudTCREAROMODTITULARptpatrNumIdentificacion;
    }
    
    public void setSolicitudTCREAROMODTITULARptpatrNumIdentificacion(String solicitudTCREAROMODTITULARptpatrNumIdentificacion) {
        this.solicitudTCREAROMODTITULARptpatrNumIdentificacion = solicitudTCREAROMODTITULARptpatrNumIdentificacion;
    }

    private void checkSolicitudTCREAROMODTITULARptpatrNumIdentificacion() throws NotNullArgumentException {
        if(this.getSolicitudTCREAROMODTITULARptpatrNumIdentificacion() == null) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_TCREAROMODTITULAR, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRNUMIDENTIFICACION, SolicitudConstants.SERV_ALIAS_TCREAROMODTITULAR, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRNUMIDENTIFICACION);
        }
    }

    @JsonIgnore
    public String getSolicitudTCREAROMODTITULARptpatrTipoPersona() {
        return this.solicitudTCREAROMODTITULARptpatrTipoPersona;
    }
    
    public void setSolicitudTCREAROMODTITULARptpatrTipoPersona(String solicitudTCREAROMODTITULARptpatrTipoPersona) {
        this.solicitudTCREAROMODTITULARptpatrTipoPersona = solicitudTCREAROMODTITULARptpatrTipoPersona;
    }

    private void checkSolicitudTCREAROMODTITULARptpatrTipoPersona() throws NotNullArgumentException {
        if(this.getSolicitudTCREAROMODTITULARptpatrTipoPersona() == null) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_TCREAROMODTITULAR, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRTIPOPERSONA, SolicitudConstants.SERV_ALIAS_TCREAROMODTITULAR, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRTIPOPERSONA);
        }
    }

    @JsonIgnore
    public String getSolicitudTCREAROMODTITULARptpatrPrimerNombre() {
        return this.solicitudTCREAROMODTITULARptpatrPrimerNombre;
    }
    
    public void setSolicitudTCREAROMODTITULARptpatrPrimerNombre(String solicitudTCREAROMODTITULARptpatrPrimerNombre) {
        this.solicitudTCREAROMODTITULARptpatrPrimerNombre = solicitudTCREAROMODTITULARptpatrPrimerNombre;
    }

    @JsonIgnore
    public String getSolicitudTCREAROMODTITULARptpatrSegundoNombre() {
        return this.solicitudTCREAROMODTITULARptpatrSegundoNombre;
    }
    
    public void setSolicitudTCREAROMODTITULARptpatrSegundoNombre(String solicitudTCREAROMODTITULARptpatrSegundoNombre) {
        this.solicitudTCREAROMODTITULARptpatrSegundoNombre = solicitudTCREAROMODTITULARptpatrSegundoNombre;
    }

    @JsonIgnore
    public String getSolicitudTCREAROMODTITULARptpatrPrimerApellido() {
        return this.solicitudTCREAROMODTITULARptpatrPrimerApellido;
    }
    
    public void setSolicitudTCREAROMODTITULARptpatrPrimerApellido(String solicitudTCREAROMODTITULARptpatrPrimerApellido) {
        this.solicitudTCREAROMODTITULARptpatrPrimerApellido = solicitudTCREAROMODTITULARptpatrPrimerApellido;
    }

    @JsonIgnore
    public String getSolicitudTCREAROMODTITULARptpatrSegundoApellido() {
        return this.solicitudTCREAROMODTITULARptpatrSegundoApellido;
    }
    
    public void setSolicitudTCREAROMODTITULARptpatrSegundoApellido(String solicitudTCREAROMODTITULARptpatrSegundoApellido) {
        this.solicitudTCREAROMODTITULARptpatrSegundoApellido = solicitudTCREAROMODTITULARptpatrSegundoApellido;
    }

    @JsonIgnore
    public Date getSolicitudTCREAROMODTITULARptpatrFechaNacimiento() {
        return this.solicitudTCREAROMODTITULARptpatrFechaNacimiento;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setSolicitudTCREAROMODTITULARptpatrFechaNacimiento(Date solicitudTCREAROMODTITULARptpatrFechaNacimiento) {
        this.solicitudTCREAROMODTITULARptpatrFechaNacimiento = solicitudTCREAROMODTITULARptpatrFechaNacimiento;
    }

    @JsonIgnore
    public String getSolicitudTCREAROMODTITULARptpatrGenero() {
        return this.solicitudTCREAROMODTITULARptpatrGenero;
    }
    
    public void setSolicitudTCREAROMODTITULARptpatrGenero(String solicitudTCREAROMODTITULARptpatrGenero) {
        this.solicitudTCREAROMODTITULARptpatrGenero = solicitudTCREAROMODTITULARptpatrGenero;
    }

    @JsonIgnore
    public Boolean getSolicitudTCREAROMODTITULARptpatrIndicadorExtranjero() {
        return this.solicitudTCREAROMODTITULARptpatrIndicadorExtranjero;
    }
    
    public void setSolicitudTCREAROMODTITULARptpatrIndicadorExtranjero(Boolean solicitudTCREAROMODTITULARptpatrIndicadorExtranjero) {
        this.solicitudTCREAROMODTITULARptpatrIndicadorExtranjero = solicitudTCREAROMODTITULARptpatrIndicadorExtranjero;
    }

    @JsonIgnore
    public String getSolicitudTCREAROMODTITULARptpatrTelefonoFijo() {
        return this.solicitudTCREAROMODTITULARptpatrTelefonoFijo;
    }
    
    public void setSolicitudTCREAROMODTITULARptpatrTelefonoFijo(String solicitudTCREAROMODTITULARptpatrTelefonoFijo) {
        this.solicitudTCREAROMODTITULARptpatrTelefonoFijo = solicitudTCREAROMODTITULARptpatrTelefonoFijo;
    }

    @JsonIgnore
    public String getSolicitudTCREAROMODTITULARptpatrTelefonoCelular() {
        return this.solicitudTCREAROMODTITULARptpatrTelefonoCelular;
    }
    
    public void setSolicitudTCREAROMODTITULARptpatrTelefonoCelular(String solicitudTCREAROMODTITULARptpatrTelefonoCelular) {
        this.solicitudTCREAROMODTITULARptpatrTelefonoCelular = solicitudTCREAROMODTITULARptpatrTelefonoCelular;
    }

    @JsonIgnore
    public String getSolicitudTCREAROMODTITULARptpatrCorreoElectronico() {
        return this.solicitudTCREAROMODTITULARptpatrCorreoElectronico;
    }
    
    public void setSolicitudTCREAROMODTITULARptpatrCorreoElectronico(String solicitudTCREAROMODTITULARptpatrCorreoElectronico) {
        this.solicitudTCREAROMODTITULARptpatrCorreoElectronico = solicitudTCREAROMODTITULARptpatrCorreoElectronico;
    }

    @JsonIgnore
    public Boolean getSolicitudTCREAROMODTITULARptpatrTitularConBeneficios() {
        return this.solicitudTCREAROMODTITULARptpatrTitularConBeneficios;
    }
    
    public void setSolicitudTCREAROMODTITULARptpatrTitularConBeneficios(Boolean solicitudTCREAROMODTITULARptpatrTitularConBeneficios) {
        this.solicitudTCREAROMODTITULARptpatrTitularConBeneficios = solicitudTCREAROMODTITULARptpatrTitularConBeneficios;
    }

    private void checkSolicitudTCREAROMODTITULARptpatrTitularConBeneficios() throws NotNullArgumentException {
        if(this.getSolicitudTCREAROMODTITULARptpatrTitularConBeneficios() == null) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_TCREAROMODTITULAR, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRTITULARCONBENEFICIOS, SolicitudConstants.SERV_ALIAS_TCREAROMODTITULAR, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRTITULARCONBENEFICIOS);
        }
    }

    @JsonIgnore
    public Boolean getSolicitudTCREAROMODTITULARptpatrTitularRecuperadoInc() {
        return this.solicitudTCREAROMODTITULARptpatrTitularRecuperadoInc;
    }
    
    public void setSolicitudTCREAROMODTITULARptpatrTitularRecuperadoInc(Boolean solicitudTCREAROMODTITULARptpatrTitularRecuperadoInc) {
        this.solicitudTCREAROMODTITULARptpatrTitularRecuperadoInc = solicitudTCREAROMODTITULARptpatrTitularRecuperadoInc;
    }

    private void checkSolicitudTCREAROMODTITULARptpatrTitularRecuperadoInc() throws NotNullArgumentException {
        if(this.getSolicitudTCREAROMODTITULARptpatrTitularRecuperadoInc() == null) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_TCREAROMODTITULAR, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRTITULARRECUPERADOINC, SolicitudConstants.SERV_ALIAS_TCREAROMODTITULAR, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTPATRTITULARRECUPERADOINC);
        }
    }

    @JsonIgnore
    public String getSolicitudTCREAROMODTITULARptDCTelefonoFijo() {
        return this.solicitudTCREAROMODTITULARptDCTelefonoFijo;
    }
    
    public void setSolicitudTCREAROMODTITULARptDCTelefonoFijo(String solicitudTCREAROMODTITULARptDCTelefonoFijo) {
        this.solicitudTCREAROMODTITULARptDCTelefonoFijo = solicitudTCREAROMODTITULARptDCTelefonoFijo;
    }

    @JsonIgnore
    public String getSolicitudTCREAROMODTITULARptDCTelefonoCelular() {
        return this.solicitudTCREAROMODTITULARptDCTelefonoCelular;
    }
    
    public void setSolicitudTCREAROMODTITULARptDCTelefonoCelular(String solicitudTCREAROMODTITULARptDCTelefonoCelular) {
        this.solicitudTCREAROMODTITULARptDCTelefonoCelular = solicitudTCREAROMODTITULARptDCTelefonoCelular;
    }

    @JsonIgnore
    public Boolean getSolicitudTCREAROMODTITULARptTitConBeneficiosCORE() {
        return this.solicitudTCREAROMODTITULARptTitConBeneficiosCORE;
    }
    
    public void setSolicitudTCREAROMODTITULARptTitConBeneficiosCORE(Boolean solicitudTCREAROMODTITULARptTitConBeneficiosCORE) {
        this.solicitudTCREAROMODTITULARptTitConBeneficiosCORE = solicitudTCREAROMODTITULARptTitConBeneficiosCORE;
    }

    private void checkSolicitudTCREAROMODTITULARptTitConBeneficiosCORE() throws NotNullArgumentException {
        if(this.getSolicitudTCREAROMODTITULARptTitConBeneficiosCORE() == null) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_TCREAROMODTITULAR, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTTITCONBENEFICIOSCORE, SolicitudConstants.SERV_ALIAS_TCREAROMODTITULAR, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_TCREAROMODTITULAR_SOLICITUDTCREAROMODTITULARPTTITCONBENEFICIOSCORE);
        }
    }

    @JsonIgnore
    public String getSolicitudTCREAROMODTITULARptRazonSocial() {
        return this.solicitudTCREAROMODTITULARptRazonSocial;
    }
    
    public void setSolicitudTCREAROMODTITULARptRazonSocial(String solicitudTCREAROMODTITULARptRazonSocial) {
        this.solicitudTCREAROMODTITULARptRazonSocial = solicitudTCREAROMODTITULARptRazonSocial;
    }
}
