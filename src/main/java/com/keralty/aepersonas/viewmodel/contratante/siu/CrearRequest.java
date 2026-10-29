package com.keralty.aepersonas.viewmodel.contratante.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.ContratanteConstants;
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

public class CrearRequest {

    @JsonProperty("p_agrdepartamentonac_oid")
    private DepartamentoOid contratantecrearpagrDepartamentoNac;
    
    @JsonIgnore
    private Departamento contratantecrearpagrDepartamentoNacInstance;

    @JsonProperty("p_agrmunicipionac_oid")
    private MunicipioOid contratantecrearpagrMunicipioNac;
    
    @JsonIgnore
    private Municipio contratantecrearpagrMunicipioNacInstance;

    @JsonProperty("p_agrdepartamentores_oid")
    private DepartamentoOid contratantecrearpagrDepartamentoRes;
    
    @JsonIgnore
    private Departamento contratantecrearpagrDepartamentoResInstance;

    @JsonProperty("p_agrmunicipiores_oid")
    private MunicipioOid contratantecrearpagrMunicipioRes;
    
    @JsonIgnore
    private Municipio contratantecrearpagrMunicipioResInstance;

    @JsonProperty("p_agrtipoidentificacion_oid")
    private TipoIdentificacionOid contratantecrearpagrTipoIdentificacion;
    
    @JsonIgnore
    private TipoIdentificacion contratantecrearpagrTipoIdentificacionInstance;

    @JsonProperty("p_agrsolicitud_oid")
    private SolicitudOid contratantecrearpagrSolicitud;
    
    @JsonIgnore
    private Solicitud contratantecrearpagrSolicitudInstance;

    @JsonProperty("p_atrcodigo")
    private Long contratantecrearpatrCodigo;

    @JsonProperty("p_atrnumidentificacion")
    private String contratantecrearpatrNumIdentificacion;

    @JsonProperty("p_atrtipopersona")
    private String contratantecrearpatrTipoPersona;

    @JsonProperty("p_atrprimernombre")
    private String contratantecrearpatrPrimerNombre;

    @JsonProperty("p_atrsegundonombre")
    private String contratantecrearpatrSegundoNombre;

    @JsonProperty("p_atrprimerapellido")
    private String contratantecrearpatrPrimerApellido;

    @JsonProperty("p_atrsegundoapellido")
    private String contratantecrearpatrSegundoApellido;

    @JsonProperty("p_atrrazonsocial")
    private String contratantecrearpatrRazonSocial;

    @JsonProperty("p_atrfechanacimiento")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date contratantecrearpatrFechaNacimiento;

    @JsonProperty("p_atrgenero")
    private String contratantecrearpatrGenero;

    @JsonProperty("p_atrindicadorextranjero")
    private Boolean contratantecrearpatrIndicadorExtranjero;

    @JsonProperty("p_atrtelefonofijo")
    private String contratantecrearpatrTelefonoFijo;

    @JsonProperty("p_atrtelefonocelular")
    private String contratantecrearpatrTelefonoCelular;

    @JsonProperty("p_atrcorreoelectronico")
    private String contratantecrearpatrCorreoElectronico;

    @JsonProperty("p_atrtitularconbeneficios")
    private Boolean contratantecrearpatrTitularConBeneficios;

    @JsonProperty("p_atrdiplomatico")
    private Boolean contratantecrearpatrDiplomatico;

    @JsonProperty("p_atrdireccionres")
    private String contratantecrearpatrDireccionRes;

    @JsonProperty("p_atrtelefonofijores")
    private String contratantecrearpatrTelefonoFijoRes;

    @JsonProperty("p_atrtelefonocelularres")
    private String contratantecrearpatrTelefonoCelularRes;

    @JsonProperty("p_atrruraldirres")
    private Boolean contratantecrearpatrRuralDirRes;

    @JsonProperty("p_atrtitularconbeneficioscore")
    private Boolean contratantecrearpatrTitularConBeneficiosCORE;

    public void checkArguments() throws NotNullArgumentException {
        checkContratantecrearpagrTipoIdentificacion();
        checkContratantecrearpagrSolicitud();
        checkContratantecrearpatrNumIdentificacion();
        checkContratantecrearpatrTipoPersona();
        checkContratantecrearpatrTitularConBeneficios();
        checkContratantecrearpatrDiplomatico();
        checkContratantecrearpatrTitularConBeneficiosCORE();
    }

    @JsonIgnore
    public DepartamentoOid getContratantecrearpagrDepartamentoNac() {
        return this.contratantecrearpagrDepartamentoNac;
    }
    
    public void setContratantecrearpagrDepartamentoNac(DepartamentoOid contratantecrearpagrDepartamentoNac) {
        this.contratantecrearpagrDepartamentoNac = contratantecrearpagrDepartamentoNac;
    }

    @JsonIgnore
    public Departamento getContratantecrearpagrDepartamentoNacInstance() {
        return this.contratantecrearpagrDepartamentoNacInstance;
    }
    
    public void setContratantecrearpagrDepartamentoNacInstance(Departamento contratantecrearpagrDepartamentoNac) {
        this.contratantecrearpagrDepartamentoNacInstance = contratantecrearpagrDepartamentoNac;
        this.contratantecrearpagrDepartamentoNac = contratantecrearpagrDepartamentoNac != null ? contratantecrearpagrDepartamentoNac.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getContratantecrearpagrMunicipioNac() {
        return this.contratantecrearpagrMunicipioNac;
    }
    
    public void setContratantecrearpagrMunicipioNac(MunicipioOid contratantecrearpagrMunicipioNac) {
        this.contratantecrearpagrMunicipioNac = contratantecrearpagrMunicipioNac;
    }

    @JsonIgnore
    public Municipio getContratantecrearpagrMunicipioNacInstance() {
        return this.contratantecrearpagrMunicipioNacInstance;
    }
    
    public void setContratantecrearpagrMunicipioNacInstance(Municipio contratantecrearpagrMunicipioNac) {
        this.contratantecrearpagrMunicipioNacInstance = contratantecrearpagrMunicipioNac;
        this.contratantecrearpagrMunicipioNac = contratantecrearpagrMunicipioNac != null ? contratantecrearpagrMunicipioNac.getOid() : null;
    }

    @JsonIgnore
    public DepartamentoOid getContratantecrearpagrDepartamentoRes() {
        return this.contratantecrearpagrDepartamentoRes;
    }
    
    public void setContratantecrearpagrDepartamentoRes(DepartamentoOid contratantecrearpagrDepartamentoRes) {
        this.contratantecrearpagrDepartamentoRes = contratantecrearpagrDepartamentoRes;
    }

    @JsonIgnore
    public Departamento getContratantecrearpagrDepartamentoResInstance() {
        return this.contratantecrearpagrDepartamentoResInstance;
    }
    
    public void setContratantecrearpagrDepartamentoResInstance(Departamento contratantecrearpagrDepartamentoRes) {
        this.contratantecrearpagrDepartamentoResInstance = contratantecrearpagrDepartamentoRes;
        this.contratantecrearpagrDepartamentoRes = contratantecrearpagrDepartamentoRes != null ? contratantecrearpagrDepartamentoRes.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getContratantecrearpagrMunicipioRes() {
        return this.contratantecrearpagrMunicipioRes;
    }
    
    public void setContratantecrearpagrMunicipioRes(MunicipioOid contratantecrearpagrMunicipioRes) {
        this.contratantecrearpagrMunicipioRes = contratantecrearpagrMunicipioRes;
    }

    @JsonIgnore
    public Municipio getContratantecrearpagrMunicipioResInstance() {
        return this.contratantecrearpagrMunicipioResInstance;
    }
    
    public void setContratantecrearpagrMunicipioResInstance(Municipio contratantecrearpagrMunicipioRes) {
        this.contratantecrearpagrMunicipioResInstance = contratantecrearpagrMunicipioRes;
        this.contratantecrearpagrMunicipioRes = contratantecrearpagrMunicipioRes != null ? contratantecrearpagrMunicipioRes.getOid() : null;
    }

    @JsonIgnore
    public TipoIdentificacionOid getContratantecrearpagrTipoIdentificacion() {
        return this.contratantecrearpagrTipoIdentificacion;
    }
    
    public void setContratantecrearpagrTipoIdentificacion(TipoIdentificacionOid contratantecrearpagrTipoIdentificacion) {
        this.contratantecrearpagrTipoIdentificacion = contratantecrearpagrTipoIdentificacion;
    }

    @JsonIgnore
    public TipoIdentificacion getContratantecrearpagrTipoIdentificacionInstance() {
        return this.contratantecrearpagrTipoIdentificacionInstance;
    }
    
    public void setContratantecrearpagrTipoIdentificacionInstance(TipoIdentificacion contratantecrearpagrTipoIdentificacion) {
        this.contratantecrearpagrTipoIdentificacionInstance = contratantecrearpagrTipoIdentificacion;
        this.contratantecrearpagrTipoIdentificacion = contratantecrearpagrTipoIdentificacion != null ? contratantecrearpagrTipoIdentificacion.getOid() : null;
    }

    private void checkContratantecrearpagrTipoIdentificacion() throws NotNullArgumentException {
        if(this.getContratantecrearpagrTipoIdentificacionInstance() == null || this.getContratantecrearpagrTipoIdentificacionInstance().isNull()) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_CREAR, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_CREAR_CONTRATANTECREARPAGRTIPOIDENTIFICACION, ContratanteConstants.SERV_ALIAS_CREAR, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_CREAR_CONTRATANTECREARPAGRTIPOIDENTIFICACION);
        }
    }

    @JsonIgnore
    public SolicitudOid getContratantecrearpagrSolicitud() {
        return this.contratantecrearpagrSolicitud;
    }
    
    public void setContratantecrearpagrSolicitud(SolicitudOid contratantecrearpagrSolicitud) {
        this.contratantecrearpagrSolicitud = contratantecrearpagrSolicitud;
    }

    @JsonIgnore
    public Solicitud getContratantecrearpagrSolicitudInstance() {
        return this.contratantecrearpagrSolicitudInstance;
    }
    
    public void setContratantecrearpagrSolicitudInstance(Solicitud contratantecrearpagrSolicitud) {
        this.contratantecrearpagrSolicitudInstance = contratantecrearpagrSolicitud;
        this.contratantecrearpagrSolicitud = contratantecrearpagrSolicitud != null ? contratantecrearpagrSolicitud.getOid() : null;
    }

    private void checkContratantecrearpagrSolicitud() throws NotNullArgumentException {
        if(this.getContratantecrearpagrSolicitudInstance() == null || this.getContratantecrearpagrSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_CREAR, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_CREAR_CONTRATANTECREARPAGRSOLICITUD, ContratanteConstants.SERV_ALIAS_CREAR, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_CREAR_CONTRATANTECREARPAGRSOLICITUD);
        }
    }

    @JsonIgnore
    public Long getContratantecrearpatrCodigo() {
        return this.contratantecrearpatrCodigo;
    }
    
    public void setContratantecrearpatrCodigo(Long contratantecrearpatrCodigo) {
        this.contratantecrearpatrCodigo = contratantecrearpatrCodigo;
    }

    @JsonIgnore
    public String getContratantecrearpatrNumIdentificacion() {
        return this.contratantecrearpatrNumIdentificacion;
    }
    
    public void setContratantecrearpatrNumIdentificacion(String contratantecrearpatrNumIdentificacion) {
        this.contratantecrearpatrNumIdentificacion = contratantecrearpatrNumIdentificacion;
    }

    private void checkContratantecrearpatrNumIdentificacion() throws NotNullArgumentException {
        if(this.getContratantecrearpatrNumIdentificacion() == null) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_CREAR, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_CREAR_CONTRATANTECREARPATRNUMIDENTIFICACION, ContratanteConstants.SERV_ALIAS_CREAR, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_CREAR_CONTRATANTECREARPATRNUMIDENTIFICACION);
        }
    }

    @JsonIgnore
    public String getContratantecrearpatrTipoPersona() {
        return this.contratantecrearpatrTipoPersona;
    }
    
    public void setContratantecrearpatrTipoPersona(String contratantecrearpatrTipoPersona) {
        this.contratantecrearpatrTipoPersona = contratantecrearpatrTipoPersona;
    }

    private void checkContratantecrearpatrTipoPersona() throws NotNullArgumentException {
        if(this.getContratantecrearpatrTipoPersona() == null) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_CREAR, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_CREAR_CONTRATANTECREARPATRTIPOPERSONA, ContratanteConstants.SERV_ALIAS_CREAR, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_CREAR_CONTRATANTECREARPATRTIPOPERSONA);
        }
    }

    @JsonIgnore
    public String getContratantecrearpatrPrimerNombre() {
        return this.contratantecrearpatrPrimerNombre;
    }
    
    public void setContratantecrearpatrPrimerNombre(String contratantecrearpatrPrimerNombre) {
        this.contratantecrearpatrPrimerNombre = contratantecrearpatrPrimerNombre;
    }

    @JsonIgnore
    public String getContratantecrearpatrSegundoNombre() {
        return this.contratantecrearpatrSegundoNombre;
    }
    
    public void setContratantecrearpatrSegundoNombre(String contratantecrearpatrSegundoNombre) {
        this.contratantecrearpatrSegundoNombre = contratantecrearpatrSegundoNombre;
    }

    @JsonIgnore
    public String getContratantecrearpatrPrimerApellido() {
        return this.contratantecrearpatrPrimerApellido;
    }
    
    public void setContratantecrearpatrPrimerApellido(String contratantecrearpatrPrimerApellido) {
        this.contratantecrearpatrPrimerApellido = contratantecrearpatrPrimerApellido;
    }

    @JsonIgnore
    public String getContratantecrearpatrSegundoApellido() {
        return this.contratantecrearpatrSegundoApellido;
    }
    
    public void setContratantecrearpatrSegundoApellido(String contratantecrearpatrSegundoApellido) {
        this.contratantecrearpatrSegundoApellido = contratantecrearpatrSegundoApellido;
    }

    @JsonIgnore
    public String getContratantecrearpatrRazonSocial() {
        return this.contratantecrearpatrRazonSocial;
    }
    
    public void setContratantecrearpatrRazonSocial(String contratantecrearpatrRazonSocial) {
        this.contratantecrearpatrRazonSocial = contratantecrearpatrRazonSocial;
    }

    @JsonIgnore
    public Date getContratantecrearpatrFechaNacimiento() {
        return this.contratantecrearpatrFechaNacimiento;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setContratantecrearpatrFechaNacimiento(Date contratantecrearpatrFechaNacimiento) {
        this.contratantecrearpatrFechaNacimiento = contratantecrearpatrFechaNacimiento;
    }

    @JsonIgnore
    public String getContratantecrearpatrGenero() {
        return this.contratantecrearpatrGenero;
    }
    
    public void setContratantecrearpatrGenero(String contratantecrearpatrGenero) {
        this.contratantecrearpatrGenero = contratantecrearpatrGenero;
    }

    @JsonIgnore
    public Boolean getContratantecrearpatrIndicadorExtranjero() {
        return this.contratantecrearpatrIndicadorExtranjero;
    }
    
    public void setContratantecrearpatrIndicadorExtranjero(Boolean contratantecrearpatrIndicadorExtranjero) {
        this.contratantecrearpatrIndicadorExtranjero = contratantecrearpatrIndicadorExtranjero;
    }

    @JsonIgnore
    public String getContratantecrearpatrTelefonoFijo() {
        return this.contratantecrearpatrTelefonoFijo;
    }
    
    public void setContratantecrearpatrTelefonoFijo(String contratantecrearpatrTelefonoFijo) {
        this.contratantecrearpatrTelefonoFijo = contratantecrearpatrTelefonoFijo;
    }

    @JsonIgnore
    public String getContratantecrearpatrTelefonoCelular() {
        return this.contratantecrearpatrTelefonoCelular;
    }
    
    public void setContratantecrearpatrTelefonoCelular(String contratantecrearpatrTelefonoCelular) {
        this.contratantecrearpatrTelefonoCelular = contratantecrearpatrTelefonoCelular;
    }

    @JsonIgnore
    public String getContratantecrearpatrCorreoElectronico() {
        return this.contratantecrearpatrCorreoElectronico;
    }
    
    public void setContratantecrearpatrCorreoElectronico(String contratantecrearpatrCorreoElectronico) {
        this.contratantecrearpatrCorreoElectronico = contratantecrearpatrCorreoElectronico;
    }

    @JsonIgnore
    public Boolean getContratantecrearpatrTitularConBeneficios() {
        return this.contratantecrearpatrTitularConBeneficios;
    }
    
    public void setContratantecrearpatrTitularConBeneficios(Boolean contratantecrearpatrTitularConBeneficios) {
        this.contratantecrearpatrTitularConBeneficios = contratantecrearpatrTitularConBeneficios;
    }

    private void checkContratantecrearpatrTitularConBeneficios() throws NotNullArgumentException {
        if(this.getContratantecrearpatrTitularConBeneficios() == null) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_CREAR, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_CREAR_CONTRATANTECREARPATRTITULARCONBENEFICIOS, ContratanteConstants.SERV_ALIAS_CREAR, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_CREAR_CONTRATANTECREARPATRTITULARCONBENEFICIOS);
        }
    }

    @JsonIgnore
    public Boolean getContratantecrearpatrDiplomatico() {
        return this.contratantecrearpatrDiplomatico;
    }
    
    public void setContratantecrearpatrDiplomatico(Boolean contratantecrearpatrDiplomatico) {
        this.contratantecrearpatrDiplomatico = contratantecrearpatrDiplomatico;
    }

    private void checkContratantecrearpatrDiplomatico() throws NotNullArgumentException {
        if(this.getContratantecrearpatrDiplomatico() == null) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_CREAR, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_CREAR_CONTRATANTECREARPATRDIPLOMATICO, ContratanteConstants.SERV_ALIAS_CREAR, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_CREAR_CONTRATANTECREARPATRDIPLOMATICO);
        }
    }

    @JsonIgnore
    public String getContratantecrearpatrDireccionRes() {
        return this.contratantecrearpatrDireccionRes;
    }
    
    public void setContratantecrearpatrDireccionRes(String contratantecrearpatrDireccionRes) {
        this.contratantecrearpatrDireccionRes = contratantecrearpatrDireccionRes;
    }

    @JsonIgnore
    public String getContratantecrearpatrTelefonoFijoRes() {
        return this.contratantecrearpatrTelefonoFijoRes;
    }
    
    public void setContratantecrearpatrTelefonoFijoRes(String contratantecrearpatrTelefonoFijoRes) {
        this.contratantecrearpatrTelefonoFijoRes = contratantecrearpatrTelefonoFijoRes;
    }

    @JsonIgnore
    public String getContratantecrearpatrTelefonoCelularRes() {
        return this.contratantecrearpatrTelefonoCelularRes;
    }
    
    public void setContratantecrearpatrTelefonoCelularRes(String contratantecrearpatrTelefonoCelularRes) {
        this.contratantecrearpatrTelefonoCelularRes = contratantecrearpatrTelefonoCelularRes;
    }

    @JsonIgnore
    public Boolean getContratantecrearpatrRuralDirRes() {
        return this.contratantecrearpatrRuralDirRes;
    }
    
    public void setContratantecrearpatrRuralDirRes(Boolean contratantecrearpatrRuralDirRes) {
        this.contratantecrearpatrRuralDirRes = contratantecrearpatrRuralDirRes;
    }

    @JsonIgnore
    public Boolean getContratantecrearpatrTitularConBeneficiosCORE() {
        return this.contratantecrearpatrTitularConBeneficiosCORE;
    }
    
    public void setContratantecrearpatrTitularConBeneficiosCORE(Boolean contratantecrearpatrTitularConBeneficiosCORE) {
        this.contratantecrearpatrTitularConBeneficiosCORE = contratantecrearpatrTitularConBeneficiosCORE;
    }

    private void checkContratantecrearpatrTitularConBeneficiosCORE() throws NotNullArgumentException {
        if(this.getContratantecrearpatrTitularConBeneficiosCORE() == null) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_CREAR, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_CREAR_CONTRATANTECREARPATRTITULARCONBENEFICIOSCORE, ContratanteConstants.SERV_ALIAS_CREAR, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_CREAR_CONTRATANTECREARPATRTITULARCONBENEFICIOSCORE);
        }
    }
}
