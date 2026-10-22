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

public class TNEWRequest {

    @JsonProperty("pt_p_agrsolicitud_oid")
    private SolicitudOid contratanteTNEWptpagrSolicitud;
    
    @JsonIgnore
    private Solicitud contratanteTNEWptpagrSolicitudInstance;

    @JsonProperty("pt_p_agrtipoidentificacion_oid")
    private TipoIdentificacionOid contratanteTNEWptpagrTipoIdentificacion;
    
    @JsonIgnore
    private TipoIdentificacion contratanteTNEWptpagrTipoIdentificacionInstance;

    @JsonProperty("pt_p_agrdepartamentonac_oid")
    private DepartamentoOid contratanteTNEWptpagrDepartamentoNac;
    
    @JsonIgnore
    private Departamento contratanteTNEWptpagrDepartamentoNacInstance;

    @JsonProperty("pt_p_agrmunicipionac_oid")
    private MunicipioOid contratanteTNEWptpagrMunicipioNac;
    
    @JsonIgnore
    private Municipio contratanteTNEWptpagrMunicipioNacInstance;

    @JsonProperty("pt_p_atrcodigo")
    private Long contratanteTNEWptpatrCodigo;

    @JsonProperty("pt_p_atrnumidentificacion")
    private String contratanteTNEWptpatrNumIdentificacion;

    @JsonProperty("pt_p_atrtipopersona")
    private String contratanteTNEWptpatrTipoPersona;

    @JsonProperty("pt_p_atrprimernombre")
    private String contratanteTNEWptpatrPrimerNombre;

    @JsonProperty("pt_p_atrsegundonombre")
    private String contratanteTNEWptpatrSegundoNombre;

    @JsonProperty("pt_p_atrprimerapellido")
    private String contratanteTNEWptpatrPrimerApellido;

    @JsonProperty("pt_p_atrsegundoapellido")
    private String contratanteTNEWptpatrSegundoApellido;

    @JsonProperty("pt_p_atrrazonsocial")
    private String contratanteTNEWptpatrRazonSocial;

    @JsonProperty("pt_p_atrfechanacimiento")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date contratanteTNEWptpatrFechaNacimiento;

    @JsonProperty("pt_p_atrgenero")
    private String contratanteTNEWptpatrGenero;

    @JsonProperty("pt_p_atrindicadorextranjero")
    private Boolean contratanteTNEWptpatrIndicadorExtranjero;

    @JsonProperty("pt_p_atrtelefonofijo")
    private String contratanteTNEWptpatrTelefonoFijo;

    @JsonProperty("pt_p_atrtelefonocelular")
    private String contratanteTNEWptpatrTelefonoCelular;

    @JsonProperty("pt_p_atrcorreoelectronico")
    private String contratanteTNEWptpatrCorreoElectronico;

    @JsonProperty("pt_p_atrtitularconbeneficios")
    private Boolean contratanteTNEWptpatrTitularConBeneficios;

    @JsonProperty("pt_p_atrdiplomatico")
    private Boolean contratanteTNEWptpatrDiplomatico;

    @JsonProperty("pt_p_atrtelefonofijores")
    private String contratanteTNEWptpatrTelefonoFijoRes;

    @JsonProperty("pt_p_atrtelefonocelularres")
    private String contratanteTNEWptpatrTelefonoCelularRes;

    @JsonProperty("pttitularconbeneficioscore")
    private Boolean contratanteTNEWptTitularConBeneficiosCORE;

    public void checkArguments() throws NotNullArgumentException {
        checkContratanteTNEWptpagrSolicitud();
        checkContratanteTNEWptpagrTipoIdentificacion();
        checkContratanteTNEWptpatrNumIdentificacion();
        checkContratanteTNEWptpatrTipoPersona();
        checkContratanteTNEWptpatrTitularConBeneficios();
        checkContratanteTNEWptpatrDiplomatico();
        checkContratanteTNEWptTitularConBeneficiosCORE();
    }

    @JsonIgnore
    public SolicitudOid getContratanteTNEWptpagrSolicitud() {
        return this.contratanteTNEWptpagrSolicitud;
    }
    
    public void setContratanteTNEWptpagrSolicitud(SolicitudOid contratanteTNEWptpagrSolicitud) {
        this.contratanteTNEWptpagrSolicitud = contratanteTNEWptpagrSolicitud;
    }

    @JsonIgnore
    public Solicitud getContratanteTNEWptpagrSolicitudInstance() {
        return this.contratanteTNEWptpagrSolicitudInstance;
    }
    
    public void setContratanteTNEWptpagrSolicitudInstance(Solicitud contratanteTNEWptpagrSolicitud) {
        this.contratanteTNEWptpagrSolicitudInstance = contratanteTNEWptpagrSolicitud;
        this.contratanteTNEWptpagrSolicitud = contratanteTNEWptpagrSolicitud != null ? contratanteTNEWptpagrSolicitud.getOid() : null;
    }

    private void checkContratanteTNEWptpagrSolicitud() throws NotNullArgumentException {
        if(this.getContratanteTNEWptpagrSolicitudInstance() == null || this.getContratanteTNEWptpagrSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_TNEW, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_TNEW_CONTRATANTETNEWPTPAGRSOLICITUD, ContratanteConstants.SERV_ALIAS_TNEW, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_TNEW_CONTRATANTETNEWPTPAGRSOLICITUD);
        }
    }

    @JsonIgnore
    public TipoIdentificacionOid getContratanteTNEWptpagrTipoIdentificacion() {
        return this.contratanteTNEWptpagrTipoIdentificacion;
    }
    
    public void setContratanteTNEWptpagrTipoIdentificacion(TipoIdentificacionOid contratanteTNEWptpagrTipoIdentificacion) {
        this.contratanteTNEWptpagrTipoIdentificacion = contratanteTNEWptpagrTipoIdentificacion;
    }

    @JsonIgnore
    public TipoIdentificacion getContratanteTNEWptpagrTipoIdentificacionInstance() {
        return this.contratanteTNEWptpagrTipoIdentificacionInstance;
    }
    
    public void setContratanteTNEWptpagrTipoIdentificacionInstance(TipoIdentificacion contratanteTNEWptpagrTipoIdentificacion) {
        this.contratanteTNEWptpagrTipoIdentificacionInstance = contratanteTNEWptpagrTipoIdentificacion;
        this.contratanteTNEWptpagrTipoIdentificacion = contratanteTNEWptpagrTipoIdentificacion != null ? contratanteTNEWptpagrTipoIdentificacion.getOid() : null;
    }

    private void checkContratanteTNEWptpagrTipoIdentificacion() throws NotNullArgumentException {
        if(this.getContratanteTNEWptpagrTipoIdentificacionInstance() == null || this.getContratanteTNEWptpagrTipoIdentificacionInstance().isNull()) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_TNEW, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_TNEW_CONTRATANTETNEWPTPAGRTIPOIDENTIFICACION, ContratanteConstants.SERV_ALIAS_TNEW, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_TNEW_CONTRATANTETNEWPTPAGRTIPOIDENTIFICACION);
        }
    }

    @JsonIgnore
    public DepartamentoOid getContratanteTNEWptpagrDepartamentoNac() {
        return this.contratanteTNEWptpagrDepartamentoNac;
    }
    
    public void setContratanteTNEWptpagrDepartamentoNac(DepartamentoOid contratanteTNEWptpagrDepartamentoNac) {
        this.contratanteTNEWptpagrDepartamentoNac = contratanteTNEWptpagrDepartamentoNac;
    }

    @JsonIgnore
    public Departamento getContratanteTNEWptpagrDepartamentoNacInstance() {
        return this.contratanteTNEWptpagrDepartamentoNacInstance;
    }
    
    public void setContratanteTNEWptpagrDepartamentoNacInstance(Departamento contratanteTNEWptpagrDepartamentoNac) {
        this.contratanteTNEWptpagrDepartamentoNacInstance = contratanteTNEWptpagrDepartamentoNac;
        this.contratanteTNEWptpagrDepartamentoNac = contratanteTNEWptpagrDepartamentoNac != null ? contratanteTNEWptpagrDepartamentoNac.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getContratanteTNEWptpagrMunicipioNac() {
        return this.contratanteTNEWptpagrMunicipioNac;
    }
    
    public void setContratanteTNEWptpagrMunicipioNac(MunicipioOid contratanteTNEWptpagrMunicipioNac) {
        this.contratanteTNEWptpagrMunicipioNac = contratanteTNEWptpagrMunicipioNac;
    }

    @JsonIgnore
    public Municipio getContratanteTNEWptpagrMunicipioNacInstance() {
        return this.contratanteTNEWptpagrMunicipioNacInstance;
    }
    
    public void setContratanteTNEWptpagrMunicipioNacInstance(Municipio contratanteTNEWptpagrMunicipioNac) {
        this.contratanteTNEWptpagrMunicipioNacInstance = contratanteTNEWptpagrMunicipioNac;
        this.contratanteTNEWptpagrMunicipioNac = contratanteTNEWptpagrMunicipioNac != null ? contratanteTNEWptpagrMunicipioNac.getOid() : null;
    }

    @JsonIgnore
    public Long getContratanteTNEWptpatrCodigo() {
        return this.contratanteTNEWptpatrCodigo;
    }
    
    public void setContratanteTNEWptpatrCodigo(Long contratanteTNEWptpatrCodigo) {
        this.contratanteTNEWptpatrCodigo = contratanteTNEWptpatrCodigo;
    }

    @JsonIgnore
    public String getContratanteTNEWptpatrNumIdentificacion() {
        return this.contratanteTNEWptpatrNumIdentificacion;
    }
    
    public void setContratanteTNEWptpatrNumIdentificacion(String contratanteTNEWptpatrNumIdentificacion) {
        this.contratanteTNEWptpatrNumIdentificacion = contratanteTNEWptpatrNumIdentificacion;
    }

    private void checkContratanteTNEWptpatrNumIdentificacion() throws NotNullArgumentException {
        if(this.getContratanteTNEWptpatrNumIdentificacion() == null) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_TNEW, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_TNEW_CONTRATANTETNEWPTPATRNUMIDENTIFICACION, ContratanteConstants.SERV_ALIAS_TNEW, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_TNEW_CONTRATANTETNEWPTPATRNUMIDENTIFICACION);
        }
    }

    @JsonIgnore
    public String getContratanteTNEWptpatrTipoPersona() {
        return this.contratanteTNEWptpatrTipoPersona;
    }
    
    public void setContratanteTNEWptpatrTipoPersona(String contratanteTNEWptpatrTipoPersona) {
        this.contratanteTNEWptpatrTipoPersona = contratanteTNEWptpatrTipoPersona;
    }

    private void checkContratanteTNEWptpatrTipoPersona() throws NotNullArgumentException {
        if(this.getContratanteTNEWptpatrTipoPersona() == null) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_TNEW, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_TNEW_CONTRATANTETNEWPTPATRTIPOPERSONA, ContratanteConstants.SERV_ALIAS_TNEW, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_TNEW_CONTRATANTETNEWPTPATRTIPOPERSONA);
        }
    }

    @JsonIgnore
    public String getContratanteTNEWptpatrPrimerNombre() {
        return this.contratanteTNEWptpatrPrimerNombre;
    }
    
    public void setContratanteTNEWptpatrPrimerNombre(String contratanteTNEWptpatrPrimerNombre) {
        this.contratanteTNEWptpatrPrimerNombre = contratanteTNEWptpatrPrimerNombre;
    }

    @JsonIgnore
    public String getContratanteTNEWptpatrSegundoNombre() {
        return this.contratanteTNEWptpatrSegundoNombre;
    }
    
    public void setContratanteTNEWptpatrSegundoNombre(String contratanteTNEWptpatrSegundoNombre) {
        this.contratanteTNEWptpatrSegundoNombre = contratanteTNEWptpatrSegundoNombre;
    }

    @JsonIgnore
    public String getContratanteTNEWptpatrPrimerApellido() {
        return this.contratanteTNEWptpatrPrimerApellido;
    }
    
    public void setContratanteTNEWptpatrPrimerApellido(String contratanteTNEWptpatrPrimerApellido) {
        this.contratanteTNEWptpatrPrimerApellido = contratanteTNEWptpatrPrimerApellido;
    }

    @JsonIgnore
    public String getContratanteTNEWptpatrSegundoApellido() {
        return this.contratanteTNEWptpatrSegundoApellido;
    }
    
    public void setContratanteTNEWptpatrSegundoApellido(String contratanteTNEWptpatrSegundoApellido) {
        this.contratanteTNEWptpatrSegundoApellido = contratanteTNEWptpatrSegundoApellido;
    }

    @JsonIgnore
    public String getContratanteTNEWptpatrRazonSocial() {
        return this.contratanteTNEWptpatrRazonSocial;
    }
    
    public void setContratanteTNEWptpatrRazonSocial(String contratanteTNEWptpatrRazonSocial) {
        this.contratanteTNEWptpatrRazonSocial = contratanteTNEWptpatrRazonSocial;
    }

    @JsonIgnore
    public Date getContratanteTNEWptpatrFechaNacimiento() {
        return this.contratanteTNEWptpatrFechaNacimiento;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setContratanteTNEWptpatrFechaNacimiento(Date contratanteTNEWptpatrFechaNacimiento) {
        this.contratanteTNEWptpatrFechaNacimiento = contratanteTNEWptpatrFechaNacimiento;
    }

    @JsonIgnore
    public String getContratanteTNEWptpatrGenero() {
        return this.contratanteTNEWptpatrGenero;
    }
    
    public void setContratanteTNEWptpatrGenero(String contratanteTNEWptpatrGenero) {
        this.contratanteTNEWptpatrGenero = contratanteTNEWptpatrGenero;
    }

    @JsonIgnore
    public Boolean getContratanteTNEWptpatrIndicadorExtranjero() {
        return this.contratanteTNEWptpatrIndicadorExtranjero;
    }
    
    public void setContratanteTNEWptpatrIndicadorExtranjero(Boolean contratanteTNEWptpatrIndicadorExtranjero) {
        this.contratanteTNEWptpatrIndicadorExtranjero = contratanteTNEWptpatrIndicadorExtranjero;
    }

    @JsonIgnore
    public String getContratanteTNEWptpatrTelefonoFijo() {
        return this.contratanteTNEWptpatrTelefonoFijo;
    }
    
    public void setContratanteTNEWptpatrTelefonoFijo(String contratanteTNEWptpatrTelefonoFijo) {
        this.contratanteTNEWptpatrTelefonoFijo = contratanteTNEWptpatrTelefonoFijo;
    }

    @JsonIgnore
    public String getContratanteTNEWptpatrTelefonoCelular() {
        return this.contratanteTNEWptpatrTelefonoCelular;
    }
    
    public void setContratanteTNEWptpatrTelefonoCelular(String contratanteTNEWptpatrTelefonoCelular) {
        this.contratanteTNEWptpatrTelefonoCelular = contratanteTNEWptpatrTelefonoCelular;
    }

    @JsonIgnore
    public String getContratanteTNEWptpatrCorreoElectronico() {
        return this.contratanteTNEWptpatrCorreoElectronico;
    }
    
    public void setContratanteTNEWptpatrCorreoElectronico(String contratanteTNEWptpatrCorreoElectronico) {
        this.contratanteTNEWptpatrCorreoElectronico = contratanteTNEWptpatrCorreoElectronico;
    }

    @JsonIgnore
    public Boolean getContratanteTNEWptpatrTitularConBeneficios() {
        return this.contratanteTNEWptpatrTitularConBeneficios;
    }
    
    public void setContratanteTNEWptpatrTitularConBeneficios(Boolean contratanteTNEWptpatrTitularConBeneficios) {
        this.contratanteTNEWptpatrTitularConBeneficios = contratanteTNEWptpatrTitularConBeneficios;
    }

    private void checkContratanteTNEWptpatrTitularConBeneficios() throws NotNullArgumentException {
        if(this.getContratanteTNEWptpatrTitularConBeneficios() == null) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_TNEW, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_TNEW_CONTRATANTETNEWPTPATRTITULARCONBENEFICIOS, ContratanteConstants.SERV_ALIAS_TNEW, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_TNEW_CONTRATANTETNEWPTPATRTITULARCONBENEFICIOS);
        }
    }

    @JsonIgnore
    public Boolean getContratanteTNEWptpatrDiplomatico() {
        return this.contratanteTNEWptpatrDiplomatico;
    }
    
    public void setContratanteTNEWptpatrDiplomatico(Boolean contratanteTNEWptpatrDiplomatico) {
        this.contratanteTNEWptpatrDiplomatico = contratanteTNEWptpatrDiplomatico;
    }

    private void checkContratanteTNEWptpatrDiplomatico() throws NotNullArgumentException {
        if(this.getContratanteTNEWptpatrDiplomatico() == null) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_TNEW, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_TNEW_CONTRATANTETNEWPTPATRDIPLOMATICO, ContratanteConstants.SERV_ALIAS_TNEW, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_TNEW_CONTRATANTETNEWPTPATRDIPLOMATICO);
        }
    }

    @JsonIgnore
    public String getContratanteTNEWptpatrTelefonoFijoRes() {
        return this.contratanteTNEWptpatrTelefonoFijoRes;
    }
    
    public void setContratanteTNEWptpatrTelefonoFijoRes(String contratanteTNEWptpatrTelefonoFijoRes) {
        this.contratanteTNEWptpatrTelefonoFijoRes = contratanteTNEWptpatrTelefonoFijoRes;
    }

    @JsonIgnore
    public String getContratanteTNEWptpatrTelefonoCelularRes() {
        return this.contratanteTNEWptpatrTelefonoCelularRes;
    }
    
    public void setContratanteTNEWptpatrTelefonoCelularRes(String contratanteTNEWptpatrTelefonoCelularRes) {
        this.contratanteTNEWptpatrTelefonoCelularRes = contratanteTNEWptpatrTelefonoCelularRes;
    }

    @JsonIgnore
    public Boolean getContratanteTNEWptTitularConBeneficiosCORE() {
        return this.contratanteTNEWptTitularConBeneficiosCORE;
    }
    
    public void setContratanteTNEWptTitularConBeneficiosCORE(Boolean contratanteTNEWptTitularConBeneficiosCORE) {
        this.contratanteTNEWptTitularConBeneficiosCORE = contratanteTNEWptTitularConBeneficiosCORE;
    }

    private void checkContratanteTNEWptTitularConBeneficiosCORE() throws NotNullArgumentException {
        if(this.getContratanteTNEWptTitularConBeneficiosCORE() == null) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_TNEW, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_TNEW_CONTRATANTETNEWPTTITULARCONBENEFICIOSCORE, ContratanteConstants.SERV_ALIAS_TNEW, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_TNEW_CONTRATANTETNEWPTTITULARCONBENEFICIOSCORE);
        }
    }
}
