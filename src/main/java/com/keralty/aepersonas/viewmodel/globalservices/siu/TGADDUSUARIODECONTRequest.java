package com.keralty.aepersonas.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.GlobalServiceConstants;
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

public class TGADDUSUARIODECONTRequest {

    @JsonProperty("pt_p_agrtipoidentificacion_oid")
    private TipoIdentificacionOid tGADDUSUARIODECONTptpagrTipoIdentificacion;
    
    @JsonIgnore
    private TipoIdentificacion tGADDUSUARIODECONTptpagrTipoIdentificacionInstance;

    @JsonProperty("pt_p_agrdepartamentonacimiento_oid")
    private DepartamentoOid tGADDUSUARIODECONTptpagrDepartamentoNacimiento;
    
    @JsonIgnore
    private Departamento tGADDUSUARIODECONTptpagrDepartamentoNacimientoInstance;

    @JsonProperty("pt_p_agrmunicipionacimiento_oid")
    private MunicipioOid tGADDUSUARIODECONTptpagrMunicipioNacimiento;
    
    @JsonIgnore
    private Municipio tGADDUSUARIODECONTptpagrMunicipioNacimientoInstance;

    @JsonProperty("pt_p_agrestadocivil_oid")
    private EstadoCivilOid tGADDUSUARIODECONTptpagrEstadoCivil;
    
    @JsonIgnore
    private EstadoCivil tGADDUSUARIODECONTptpagrEstadoCivilInstance;

    @JsonProperty("pt_p_atrnumidentificacion")
    private String tGADDUSUARIODECONTptpatrNumIdentificacion;

    @JsonProperty("pt_p_atrprimernombre")
    private String tGADDUSUARIODECONTptpatrPrimerNombre;

    @JsonProperty("pt_p_atrsegundonombre")
    private String tGADDUSUARIODECONTptpatrSegundoNombre;

    @JsonProperty("pt_p_atrprimerapellido")
    private String tGADDUSUARIODECONTptpatrPrimerApellido;

    @JsonProperty("pt_p_atrsegundoapellido")
    private String tGADDUSUARIODECONTptpatrSegundoApellido;

    @JsonProperty("pt_p_atrfechanacimiento")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date tGADDUSUARIODECONTptpatrFechaNacimiento;

    @JsonProperty("pt_p_atrgenero")
    private String tGADDUSUARIODECONTptpatrGenero;

    @JsonProperty("pt_p_atrindicadorextranjero")
    private Boolean tGADDUSUARIODECONTptpatrIndicadorExtranjero;

    @JsonProperty("pt_p_atrtelefonofijo")
    private String tGADDUSUARIODECONTptpatrTelefonoFijo;

    @JsonProperty("pt_p_atrtelefonocelular")
    private String tGADDUSUARIODECONTptpatrTelefonoCelular;

    @JsonProperty("pt_p_atrcorreoelectronico")
    private String tGADDUSUARIODECONTptpatrCorreoElectronico;

    @JsonProperty("pt_p_agrdepartamento_oid")
    private DepartamentoOid tGADDUSUARIODECONTptpagrDepartamento;
    
    @JsonIgnore
    private Departamento tGADDUSUARIODECONTptpagrDepartamentoInstance;

    @JsonProperty("pt_p_agrmunicipio_oid")
    private MunicipioOid tGADDUSUARIODECONTptpagrMunicipio;
    
    @JsonIgnore
    private Municipio tGADDUSUARIODECONTptpagrMunicipioInstance;

    @JsonProperty("pt_p_atrdireccioncompleta")
    private String tGADDUSUARIODECONTptpatrDireccionCompleta;

    @JsonProperty("pt_p_atrrural")
    private Boolean tGADDUSUARIODECONTptpatrRural;

    @JsonProperty("pt_p_codigo")
    private Long tGADDUSUARIODECONTptpCodigo;

    @JsonProperty("pt_p_tieneepssanitas")
    private Boolean tGADDUSUARIODECONTptpTieneEPSSanitas;

    @JsonProperty("pt_p_rechazadoafiliacion")
    private String tGADDUSUARIODECONTptpRechazadoAfiliacion;

    @JsonProperty("pt_p_agrpais_oid")
    private PaisOid tGADDUSUARIODECONTptpagrPais;
    
    @JsonIgnore
    private Pais tGADDUSUARIODECONTptpagrPaisInstance;

    @JsonProperty("pt_p_agrsolicitud_oid")
    private SolicitudOid tGADDUSUARIODECONTptpagrSolicitud;
    
    @JsonIgnore
    private Solicitud tGADDUSUARIODECONTptpagrSolicitudInstance;

    @JsonProperty("pt_p_agrparentesco_oid")
    private ParentescoOid tGADDUSUARIODECONTptpagrParentesco;
    
    @JsonIgnore
    private Parentesco tGADDUSUARIODECONTptpagrParentescoInstance;

    @JsonProperty("pt_p_atrbebegestante")
    private Boolean tGADDUSUARIODECONTptpatrBebeGestante;

    @JsonProperty("pt_p_atrcodigobancorep")
    private String tGADDUSUARIODECONTptpatrcodigoBancoRep;

    @JsonProperty("pt_ptparacontratante")
    private Boolean tGADDUSUARIODECONTptptParaContratante;

    public void checkArguments() throws NotNullArgumentException {
        checkTGADDUSUARIODECONTptpagrTipoIdentificacion();
        checkTGADDUSUARIODECONTptpatrNumIdentificacion();
        checkTGADDUSUARIODECONTptpatrPrimerNombre();
        checkTGADDUSUARIODECONTptpatrPrimerApellido();
        checkTGADDUSUARIODECONTptpatrFechaNacimiento();
        checkTGADDUSUARIODECONTptpatrGenero();
        checkTGADDUSUARIODECONTptpagrSolicitud();
        checkTGADDUSUARIODECONTptpatrBebeGestante();
        checkTGADDUSUARIODECONTptptParaContratante();
    }

    @JsonIgnore
    public TipoIdentificacionOid getTGADDUSUARIODECONTptpagrTipoIdentificacion() {
        return this.tGADDUSUARIODECONTptpagrTipoIdentificacion;
    }
    
    public void setTGADDUSUARIODECONTptpagrTipoIdentificacion(TipoIdentificacionOid tGADDUSUARIODECONTptpagrTipoIdentificacion) {
        this.tGADDUSUARIODECONTptpagrTipoIdentificacion = tGADDUSUARIODECONTptpagrTipoIdentificacion;
    }

    @JsonIgnore
    public TipoIdentificacion getTGADDUSUARIODECONTptpagrTipoIdentificacionInstance() {
        return this.tGADDUSUARIODECONTptpagrTipoIdentificacionInstance;
    }
    
    public void setTGADDUSUARIODECONTptpagrTipoIdentificacionInstance(TipoIdentificacion tGADDUSUARIODECONTptpagrTipoIdentificacion) {
        this.tGADDUSUARIODECONTptpagrTipoIdentificacionInstance = tGADDUSUARIODECONTptpagrTipoIdentificacion;
        this.tGADDUSUARIODECONTptpagrTipoIdentificacion = tGADDUSUARIODECONTptpagrTipoIdentificacion != null ? tGADDUSUARIODECONTptpagrTipoIdentificacion.getOid() : null;
    }

    private void checkTGADDUSUARIODECONTptpagrTipoIdentificacion() throws NotNullArgumentException {
        if(this.getTGADDUSUARIODECONTptpagrTipoIdentificacionInstance() == null || this.getTGADDUSUARIODECONTptpagrTipoIdentificacionInstance().isNull()) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGADDUSUARIODECONT, GlobalServiceConstants.GS_ARG_ID_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPAGRTIPOIDENTIFICACION, GlobalServiceConstants.G_SERV_ALIAS_TGADDUSUARIODECONT, GlobalServiceConstants.GS_ARG_ALIAS_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPAGRTIPOIDENTIFICACION);
        }
    }

    @JsonIgnore
    public DepartamentoOid getTGADDUSUARIODECONTptpagrDepartamentoNacimiento() {
        return this.tGADDUSUARIODECONTptpagrDepartamentoNacimiento;
    }
    
    public void setTGADDUSUARIODECONTptpagrDepartamentoNacimiento(DepartamentoOid tGADDUSUARIODECONTptpagrDepartamentoNacimiento) {
        this.tGADDUSUARIODECONTptpagrDepartamentoNacimiento = tGADDUSUARIODECONTptpagrDepartamentoNacimiento;
    }

    @JsonIgnore
    public Departamento getTGADDUSUARIODECONTptpagrDepartamentoNacimientoInstance() {
        return this.tGADDUSUARIODECONTptpagrDepartamentoNacimientoInstance;
    }
    
    public void setTGADDUSUARIODECONTptpagrDepartamentoNacimientoInstance(Departamento tGADDUSUARIODECONTptpagrDepartamentoNacimiento) {
        this.tGADDUSUARIODECONTptpagrDepartamentoNacimientoInstance = tGADDUSUARIODECONTptpagrDepartamentoNacimiento;
        this.tGADDUSUARIODECONTptpagrDepartamentoNacimiento = tGADDUSUARIODECONTptpagrDepartamentoNacimiento != null ? tGADDUSUARIODECONTptpagrDepartamentoNacimiento.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getTGADDUSUARIODECONTptpagrMunicipioNacimiento() {
        return this.tGADDUSUARIODECONTptpagrMunicipioNacimiento;
    }
    
    public void setTGADDUSUARIODECONTptpagrMunicipioNacimiento(MunicipioOid tGADDUSUARIODECONTptpagrMunicipioNacimiento) {
        this.tGADDUSUARIODECONTptpagrMunicipioNacimiento = tGADDUSUARIODECONTptpagrMunicipioNacimiento;
    }

    @JsonIgnore
    public Municipio getTGADDUSUARIODECONTptpagrMunicipioNacimientoInstance() {
        return this.tGADDUSUARIODECONTptpagrMunicipioNacimientoInstance;
    }
    
    public void setTGADDUSUARIODECONTptpagrMunicipioNacimientoInstance(Municipio tGADDUSUARIODECONTptpagrMunicipioNacimiento) {
        this.tGADDUSUARIODECONTptpagrMunicipioNacimientoInstance = tGADDUSUARIODECONTptpagrMunicipioNacimiento;
        this.tGADDUSUARIODECONTptpagrMunicipioNacimiento = tGADDUSUARIODECONTptpagrMunicipioNacimiento != null ? tGADDUSUARIODECONTptpagrMunicipioNacimiento.getOid() : null;
    }

    @JsonIgnore
    public EstadoCivilOid getTGADDUSUARIODECONTptpagrEstadoCivil() {
        return this.tGADDUSUARIODECONTptpagrEstadoCivil;
    }
    
    public void setTGADDUSUARIODECONTptpagrEstadoCivil(EstadoCivilOid tGADDUSUARIODECONTptpagrEstadoCivil) {
        this.tGADDUSUARIODECONTptpagrEstadoCivil = tGADDUSUARIODECONTptpagrEstadoCivil;
    }

    @JsonIgnore
    public EstadoCivil getTGADDUSUARIODECONTptpagrEstadoCivilInstance() {
        return this.tGADDUSUARIODECONTptpagrEstadoCivilInstance;
    }
    
    public void setTGADDUSUARIODECONTptpagrEstadoCivilInstance(EstadoCivil tGADDUSUARIODECONTptpagrEstadoCivil) {
        this.tGADDUSUARIODECONTptpagrEstadoCivilInstance = tGADDUSUARIODECONTptpagrEstadoCivil;
        this.tGADDUSUARIODECONTptpagrEstadoCivil = tGADDUSUARIODECONTptpagrEstadoCivil != null ? tGADDUSUARIODECONTptpagrEstadoCivil.getOid() : null;
    }

    @JsonIgnore
    public String getTGADDUSUARIODECONTptpatrNumIdentificacion() {
        return this.tGADDUSUARIODECONTptpatrNumIdentificacion;
    }
    
    public void setTGADDUSUARIODECONTptpatrNumIdentificacion(String tGADDUSUARIODECONTptpatrNumIdentificacion) {
        this.tGADDUSUARIODECONTptpatrNumIdentificacion = tGADDUSUARIODECONTptpatrNumIdentificacion;
    }

    private void checkTGADDUSUARIODECONTptpatrNumIdentificacion() throws NotNullArgumentException {
        if(this.getTGADDUSUARIODECONTptpatrNumIdentificacion() == null) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGADDUSUARIODECONT, GlobalServiceConstants.GS_ARG_ID_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRNUMIDENTIFICACION, GlobalServiceConstants.G_SERV_ALIAS_TGADDUSUARIODECONT, GlobalServiceConstants.GS_ARG_ALIAS_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRNUMIDENTIFICACION);
        }
    }

    @JsonIgnore
    public String getTGADDUSUARIODECONTptpatrPrimerNombre() {
        return this.tGADDUSUARIODECONTptpatrPrimerNombre;
    }
    
    public void setTGADDUSUARIODECONTptpatrPrimerNombre(String tGADDUSUARIODECONTptpatrPrimerNombre) {
        this.tGADDUSUARIODECONTptpatrPrimerNombre = tGADDUSUARIODECONTptpatrPrimerNombre;
    }

    private void checkTGADDUSUARIODECONTptpatrPrimerNombre() throws NotNullArgumentException {
        if(this.getTGADDUSUARIODECONTptpatrPrimerNombre() == null) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGADDUSUARIODECONT, GlobalServiceConstants.GS_ARG_ID_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRPRIMERNOMBRE, GlobalServiceConstants.G_SERV_ALIAS_TGADDUSUARIODECONT, GlobalServiceConstants.GS_ARG_ALIAS_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRPRIMERNOMBRE);
        }
    }

    @JsonIgnore
    public String getTGADDUSUARIODECONTptpatrSegundoNombre() {
        return this.tGADDUSUARIODECONTptpatrSegundoNombre;
    }
    
    public void setTGADDUSUARIODECONTptpatrSegundoNombre(String tGADDUSUARIODECONTptpatrSegundoNombre) {
        this.tGADDUSUARIODECONTptpatrSegundoNombre = tGADDUSUARIODECONTptpatrSegundoNombre;
    }

    @JsonIgnore
    public String getTGADDUSUARIODECONTptpatrPrimerApellido() {
        return this.tGADDUSUARIODECONTptpatrPrimerApellido;
    }
    
    public void setTGADDUSUARIODECONTptpatrPrimerApellido(String tGADDUSUARIODECONTptpatrPrimerApellido) {
        this.tGADDUSUARIODECONTptpatrPrimerApellido = tGADDUSUARIODECONTptpatrPrimerApellido;
    }

    private void checkTGADDUSUARIODECONTptpatrPrimerApellido() throws NotNullArgumentException {
        if(this.getTGADDUSUARIODECONTptpatrPrimerApellido() == null) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGADDUSUARIODECONT, GlobalServiceConstants.GS_ARG_ID_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRPRIMERAPELLIDO, GlobalServiceConstants.G_SERV_ALIAS_TGADDUSUARIODECONT, GlobalServiceConstants.GS_ARG_ALIAS_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRPRIMERAPELLIDO);
        }
    }

    @JsonIgnore
    public String getTGADDUSUARIODECONTptpatrSegundoApellido() {
        return this.tGADDUSUARIODECONTptpatrSegundoApellido;
    }
    
    public void setTGADDUSUARIODECONTptpatrSegundoApellido(String tGADDUSUARIODECONTptpatrSegundoApellido) {
        this.tGADDUSUARIODECONTptpatrSegundoApellido = tGADDUSUARIODECONTptpatrSegundoApellido;
    }

    @JsonIgnore
    public Date getTGADDUSUARIODECONTptpatrFechaNacimiento() {
        return this.tGADDUSUARIODECONTptpatrFechaNacimiento;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setTGADDUSUARIODECONTptpatrFechaNacimiento(Date tGADDUSUARIODECONTptpatrFechaNacimiento) {
        this.tGADDUSUARIODECONTptpatrFechaNacimiento = tGADDUSUARIODECONTptpatrFechaNacimiento;
    }

    private void checkTGADDUSUARIODECONTptpatrFechaNacimiento() throws NotNullArgumentException {
        if(this.getTGADDUSUARIODECONTptpatrFechaNacimiento() == null) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGADDUSUARIODECONT, GlobalServiceConstants.GS_ARG_ID_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRFECHANACIMIENTO, GlobalServiceConstants.G_SERV_ALIAS_TGADDUSUARIODECONT, GlobalServiceConstants.GS_ARG_ALIAS_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRFECHANACIMIENTO);
        }
    }

    @JsonIgnore
    public String getTGADDUSUARIODECONTptpatrGenero() {
        return this.tGADDUSUARIODECONTptpatrGenero;
    }
    
    public void setTGADDUSUARIODECONTptpatrGenero(String tGADDUSUARIODECONTptpatrGenero) {
        this.tGADDUSUARIODECONTptpatrGenero = tGADDUSUARIODECONTptpatrGenero;
    }

    private void checkTGADDUSUARIODECONTptpatrGenero() throws NotNullArgumentException {
        if(this.getTGADDUSUARIODECONTptpatrGenero() == null) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGADDUSUARIODECONT, GlobalServiceConstants.GS_ARG_ID_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRGENERO, GlobalServiceConstants.G_SERV_ALIAS_TGADDUSUARIODECONT, GlobalServiceConstants.GS_ARG_ALIAS_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRGENERO);
        }
    }

    @JsonIgnore
    public Boolean getTGADDUSUARIODECONTptpatrIndicadorExtranjero() {
        return this.tGADDUSUARIODECONTptpatrIndicadorExtranjero;
    }
    
    public void setTGADDUSUARIODECONTptpatrIndicadorExtranjero(Boolean tGADDUSUARIODECONTptpatrIndicadorExtranjero) {
        this.tGADDUSUARIODECONTptpatrIndicadorExtranjero = tGADDUSUARIODECONTptpatrIndicadorExtranjero;
    }

    @JsonIgnore
    public String getTGADDUSUARIODECONTptpatrTelefonoFijo() {
        return this.tGADDUSUARIODECONTptpatrTelefonoFijo;
    }
    
    public void setTGADDUSUARIODECONTptpatrTelefonoFijo(String tGADDUSUARIODECONTptpatrTelefonoFijo) {
        this.tGADDUSUARIODECONTptpatrTelefonoFijo = tGADDUSUARIODECONTptpatrTelefonoFijo;
    }

    @JsonIgnore
    public String getTGADDUSUARIODECONTptpatrTelefonoCelular() {
        return this.tGADDUSUARIODECONTptpatrTelefonoCelular;
    }
    
    public void setTGADDUSUARIODECONTptpatrTelefonoCelular(String tGADDUSUARIODECONTptpatrTelefonoCelular) {
        this.tGADDUSUARIODECONTptpatrTelefonoCelular = tGADDUSUARIODECONTptpatrTelefonoCelular;
    }

    @JsonIgnore
    public String getTGADDUSUARIODECONTptpatrCorreoElectronico() {
        return this.tGADDUSUARIODECONTptpatrCorreoElectronico;
    }
    
    public void setTGADDUSUARIODECONTptpatrCorreoElectronico(String tGADDUSUARIODECONTptpatrCorreoElectronico) {
        this.tGADDUSUARIODECONTptpatrCorreoElectronico = tGADDUSUARIODECONTptpatrCorreoElectronico;
    }

    @JsonIgnore
    public DepartamentoOid getTGADDUSUARIODECONTptpagrDepartamento() {
        return this.tGADDUSUARIODECONTptpagrDepartamento;
    }
    
    public void setTGADDUSUARIODECONTptpagrDepartamento(DepartamentoOid tGADDUSUARIODECONTptpagrDepartamento) {
        this.tGADDUSUARIODECONTptpagrDepartamento = tGADDUSUARIODECONTptpagrDepartamento;
    }

    @JsonIgnore
    public Departamento getTGADDUSUARIODECONTptpagrDepartamentoInstance() {
        return this.tGADDUSUARIODECONTptpagrDepartamentoInstance;
    }
    
    public void setTGADDUSUARIODECONTptpagrDepartamentoInstance(Departamento tGADDUSUARIODECONTptpagrDepartamento) {
        this.tGADDUSUARIODECONTptpagrDepartamentoInstance = tGADDUSUARIODECONTptpagrDepartamento;
        this.tGADDUSUARIODECONTptpagrDepartamento = tGADDUSUARIODECONTptpagrDepartamento != null ? tGADDUSUARIODECONTptpagrDepartamento.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getTGADDUSUARIODECONTptpagrMunicipio() {
        return this.tGADDUSUARIODECONTptpagrMunicipio;
    }
    
    public void setTGADDUSUARIODECONTptpagrMunicipio(MunicipioOid tGADDUSUARIODECONTptpagrMunicipio) {
        this.tGADDUSUARIODECONTptpagrMunicipio = tGADDUSUARIODECONTptpagrMunicipio;
    }

    @JsonIgnore
    public Municipio getTGADDUSUARIODECONTptpagrMunicipioInstance() {
        return this.tGADDUSUARIODECONTptpagrMunicipioInstance;
    }
    
    public void setTGADDUSUARIODECONTptpagrMunicipioInstance(Municipio tGADDUSUARIODECONTptpagrMunicipio) {
        this.tGADDUSUARIODECONTptpagrMunicipioInstance = tGADDUSUARIODECONTptpagrMunicipio;
        this.tGADDUSUARIODECONTptpagrMunicipio = tGADDUSUARIODECONTptpagrMunicipio != null ? tGADDUSUARIODECONTptpagrMunicipio.getOid() : null;
    }

    @JsonIgnore
    public String getTGADDUSUARIODECONTptpatrDireccionCompleta() {
        return this.tGADDUSUARIODECONTptpatrDireccionCompleta;
    }
    
    public void setTGADDUSUARIODECONTptpatrDireccionCompleta(String tGADDUSUARIODECONTptpatrDireccionCompleta) {
        this.tGADDUSUARIODECONTptpatrDireccionCompleta = tGADDUSUARIODECONTptpatrDireccionCompleta;
    }

    @JsonIgnore
    public Boolean getTGADDUSUARIODECONTptpatrRural() {
        return this.tGADDUSUARIODECONTptpatrRural;
    }
    
    public void setTGADDUSUARIODECONTptpatrRural(Boolean tGADDUSUARIODECONTptpatrRural) {
        this.tGADDUSUARIODECONTptpatrRural = tGADDUSUARIODECONTptpatrRural;
    }

    @JsonIgnore
    public Long getTGADDUSUARIODECONTptpCodigo() {
        return this.tGADDUSUARIODECONTptpCodigo;
    }
    
    public void setTGADDUSUARIODECONTptpCodigo(Long tGADDUSUARIODECONTptpCodigo) {
        this.tGADDUSUARIODECONTptpCodigo = tGADDUSUARIODECONTptpCodigo;
    }

    @JsonIgnore
    public Boolean getTGADDUSUARIODECONTptpTieneEPSSanitas() {
        return this.tGADDUSUARIODECONTptpTieneEPSSanitas;
    }
    
    public void setTGADDUSUARIODECONTptpTieneEPSSanitas(Boolean tGADDUSUARIODECONTptpTieneEPSSanitas) {
        this.tGADDUSUARIODECONTptpTieneEPSSanitas = tGADDUSUARIODECONTptpTieneEPSSanitas;
    }

    @JsonIgnore
    public String getTGADDUSUARIODECONTptpRechazadoAfiliacion() {
        return this.tGADDUSUARIODECONTptpRechazadoAfiliacion;
    }
    
    public void setTGADDUSUARIODECONTptpRechazadoAfiliacion(String tGADDUSUARIODECONTptpRechazadoAfiliacion) {
        this.tGADDUSUARIODECONTptpRechazadoAfiliacion = tGADDUSUARIODECONTptpRechazadoAfiliacion;
    }

    @JsonIgnore
    public PaisOid getTGADDUSUARIODECONTptpagrPais() {
        return this.tGADDUSUARIODECONTptpagrPais;
    }
    
    public void setTGADDUSUARIODECONTptpagrPais(PaisOid tGADDUSUARIODECONTptpagrPais) {
        this.tGADDUSUARIODECONTptpagrPais = tGADDUSUARIODECONTptpagrPais;
    }

    @JsonIgnore
    public Pais getTGADDUSUARIODECONTptpagrPaisInstance() {
        return this.tGADDUSUARIODECONTptpagrPaisInstance;
    }
    
    public void setTGADDUSUARIODECONTptpagrPaisInstance(Pais tGADDUSUARIODECONTptpagrPais) {
        this.tGADDUSUARIODECONTptpagrPaisInstance = tGADDUSUARIODECONTptpagrPais;
        this.tGADDUSUARIODECONTptpagrPais = tGADDUSUARIODECONTptpagrPais != null ? tGADDUSUARIODECONTptpagrPais.getOid() : null;
    }

    @JsonIgnore
    public SolicitudOid getTGADDUSUARIODECONTptpagrSolicitud() {
        return this.tGADDUSUARIODECONTptpagrSolicitud;
    }
    
    public void setTGADDUSUARIODECONTptpagrSolicitud(SolicitudOid tGADDUSUARIODECONTptpagrSolicitud) {
        this.tGADDUSUARIODECONTptpagrSolicitud = tGADDUSUARIODECONTptpagrSolicitud;
    }

    @JsonIgnore
    public Solicitud getTGADDUSUARIODECONTptpagrSolicitudInstance() {
        return this.tGADDUSUARIODECONTptpagrSolicitudInstance;
    }
    
    public void setTGADDUSUARIODECONTptpagrSolicitudInstance(Solicitud tGADDUSUARIODECONTptpagrSolicitud) {
        this.tGADDUSUARIODECONTptpagrSolicitudInstance = tGADDUSUARIODECONTptpagrSolicitud;
        this.tGADDUSUARIODECONTptpagrSolicitud = tGADDUSUARIODECONTptpagrSolicitud != null ? tGADDUSUARIODECONTptpagrSolicitud.getOid() : null;
    }

    private void checkTGADDUSUARIODECONTptpagrSolicitud() throws NotNullArgumentException {
        if(this.getTGADDUSUARIODECONTptpagrSolicitudInstance() == null || this.getTGADDUSUARIODECONTptpagrSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGADDUSUARIODECONT, GlobalServiceConstants.GS_ARG_ID_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPAGRSOLICITUD, GlobalServiceConstants.G_SERV_ALIAS_TGADDUSUARIODECONT, GlobalServiceConstants.GS_ARG_ALIAS_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPAGRSOLICITUD);
        }
    }

    @JsonIgnore
    public ParentescoOid getTGADDUSUARIODECONTptpagrParentesco() {
        return this.tGADDUSUARIODECONTptpagrParentesco;
    }
    
    public void setTGADDUSUARIODECONTptpagrParentesco(ParentescoOid tGADDUSUARIODECONTptpagrParentesco) {
        this.tGADDUSUARIODECONTptpagrParentesco = tGADDUSUARIODECONTptpagrParentesco;
    }

    @JsonIgnore
    public Parentesco getTGADDUSUARIODECONTptpagrParentescoInstance() {
        return this.tGADDUSUARIODECONTptpagrParentescoInstance;
    }
    
    public void setTGADDUSUARIODECONTptpagrParentescoInstance(Parentesco tGADDUSUARIODECONTptpagrParentesco) {
        this.tGADDUSUARIODECONTptpagrParentescoInstance = tGADDUSUARIODECONTptpagrParentesco;
        this.tGADDUSUARIODECONTptpagrParentesco = tGADDUSUARIODECONTptpagrParentesco != null ? tGADDUSUARIODECONTptpagrParentesco.getOid() : null;
    }

    @JsonIgnore
    public Boolean getTGADDUSUARIODECONTptpatrBebeGestante() {
        return this.tGADDUSUARIODECONTptpatrBebeGestante;
    }
    
    public void setTGADDUSUARIODECONTptpatrBebeGestante(Boolean tGADDUSUARIODECONTptpatrBebeGestante) {
        this.tGADDUSUARIODECONTptpatrBebeGestante = tGADDUSUARIODECONTptpatrBebeGestante;
    }

    private void checkTGADDUSUARIODECONTptpatrBebeGestante() throws NotNullArgumentException {
        if(this.getTGADDUSUARIODECONTptpatrBebeGestante() == null) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGADDUSUARIODECONT, GlobalServiceConstants.GS_ARG_ID_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRBEBEGESTANTE, GlobalServiceConstants.G_SERV_ALIAS_TGADDUSUARIODECONT, GlobalServiceConstants.GS_ARG_ALIAS_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPATRBEBEGESTANTE);
        }
    }

    @JsonIgnore
    public String getTGADDUSUARIODECONTptpatrcodigoBancoRep() {
        return this.tGADDUSUARIODECONTptpatrcodigoBancoRep;
    }
    
    public void setTGADDUSUARIODECONTptpatrcodigoBancoRep(String tGADDUSUARIODECONTptpatrcodigoBancoRep) {
        this.tGADDUSUARIODECONTptpatrcodigoBancoRep = tGADDUSUARIODECONTptpatrcodigoBancoRep;
    }

    @JsonIgnore
    public Boolean getTGADDUSUARIODECONTptptParaContratante() {
        return this.tGADDUSUARIODECONTptptParaContratante;
    }
    
    public void setTGADDUSUARIODECONTptptParaContratante(Boolean tGADDUSUARIODECONTptptParaContratante) {
        this.tGADDUSUARIODECONTptptParaContratante = tGADDUSUARIODECONTptptParaContratante;
    }

    private void checkTGADDUSUARIODECONTptptParaContratante() throws NotNullArgumentException {
        if(this.getTGADDUSUARIODECONTptptParaContratante() == null) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGADDUSUARIODECONT, GlobalServiceConstants.GS_ARG_ID_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPTPARACONTRATANTE, GlobalServiceConstants.G_SERV_ALIAS_TGADDUSUARIODECONT, GlobalServiceConstants.GS_ARG_ALIAS_TGADDUSUARIODECONT_TGADDUSUARIODECONTPTPTPARACONTRATANTE);
        }
    }
}
