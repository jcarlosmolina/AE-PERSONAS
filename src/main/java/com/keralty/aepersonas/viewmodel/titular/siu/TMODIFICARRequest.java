package com.keralty.aepersonas.viewmodel.titular.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.TitularConstants;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;
import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.persistence.oid.TitularOid;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
import com.keralty.aepersonas.persistence.Titular;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneDeserializer;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneSerializer;
import java.sql.Date;

public class TMODIFICARRequest {

    @JsonProperty("p_thistitular_oid")
    private TitularOid titularTMODIFICARpthisTitular;
    
    @JsonIgnore
    private Titular titularTMODIFICARpthisTitularInstance;

    @JsonProperty("pt_p_codigo")
    private Long titularTMODIFICARptpCodigo;

    @JsonProperty("pt_p_numidentificacion")
    private String titularTMODIFICARptpNumIdentificacion;

    @JsonProperty("pt_p_primernombre")
    private String titularTMODIFICARptpPrimerNombre;

    @JsonProperty("pt_p_segundonombre")
    private String titularTMODIFICARptpSegundoNombre;

    @JsonProperty("pt_p_primerapellido")
    private String titularTMODIFICARptpPrimerApellido;

    @JsonProperty("pt_p_segundoapellido")
    private String titularTMODIFICARptpSegundoApellido;

    @JsonProperty("pt_p_fechanacimiento")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date titularTMODIFICARptpFechaNacimiento;

    @JsonProperty("pt_p_genero")
    private String titularTMODIFICARptpGenero;

    @JsonProperty("pt_p_indicadorextranjero")
    private Boolean titularTMODIFICARptpIndicadorExtranjero;

    @JsonProperty("pt_p_telefonofijo")
    private String titularTMODIFICARptpTelefonoFijo;

    @JsonProperty("pt_p_telefonocelular")
    private String titularTMODIFICARptpTelefonoCelular;

    @JsonProperty("pt_p_correoelectronico")
    private String titularTMODIFICARptpCorreoElectronico;

    @JsonProperty("pt_p_evctipoidentificacion_oid")
    private TipoIdentificacionOid titularTMODIFICARptpevcTipoIdentificacion;
    
    @JsonIgnore
    private TipoIdentificacion titularTMODIFICARptpevcTipoIdentificacionInstance;

    @JsonProperty("pt_p_evcdepartamento_oid")
    private DepartamentoOid titularTMODIFICARptpevcDepartamento;
    
    @JsonIgnore
    private Departamento titularTMODIFICARptpevcDepartamentoInstance;

    @JsonProperty("pt_p_evcmunicipio_oid")
    private MunicipioOid titularTMODIFICARptpevcMunicipio;
    
    @JsonIgnore
    private Municipio titularTMODIFICARptpevcMunicipioInstance;

    @JsonProperty("pt_p_titularconbeneficios")
    private Boolean titularTMODIFICARptpTitularConBeneficios;

    @JsonProperty("pt_p_telefonofijodc")
    private String titularTMODIFICARptpTelefonoFijoDC;

    @JsonProperty("pt_p_telefonocelulardc")
    private String titularTMODIFICARptpTelefonoCelularDC;

    @JsonProperty("pt_p_razonsocial")
    private String titularTMODIFICARptpRazonSocial;

    public void checkArguments() throws NotNullArgumentException {
        checkTitularTMODIFICARpthisTitular();
        checkTitularTMODIFICARptpNumIdentificacion();
        checkTitularTMODIFICARptpevcTipoIdentificacion();
        checkTitularTMODIFICARptpTitularConBeneficios();
    }

    @JsonIgnore
    public TitularOid getTitularTMODIFICARpthisTitular() {
        return this.titularTMODIFICARpthisTitular;
    }
    
    public void setTitularTMODIFICARpthisTitular(TitularOid titularTMODIFICARpthisTitular) {
        this.titularTMODIFICARpthisTitular = titularTMODIFICARpthisTitular;
    }

    @JsonIgnore
    public Titular getTitularTMODIFICARpthisTitularInstance() {
        return this.titularTMODIFICARpthisTitularInstance;
    }
    
    public void setTitularTMODIFICARpthisTitularInstance(Titular titularTMODIFICARpthisTitular) {
        this.titularTMODIFICARpthisTitularInstance = titularTMODIFICARpthisTitular;
        this.titularTMODIFICARpthisTitular = titularTMODIFICARpthisTitular != null ? titularTMODIFICARpthisTitular.getOid() : null;
    }

    private void checkTitularTMODIFICARpthisTitular() throws NotNullArgumentException {
        if(this.getTitularTMODIFICARpthisTitularInstance() == null || this.getTitularTMODIFICARpthisTitularInstance().isNull()) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_TMODIFICAR, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_TMODIFICAR_TITULARTMODIFICARPTHISTITULAR, TitularConstants.SERV_ALIAS_TMODIFICAR, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_TMODIFICAR_TITULARTMODIFICARPTHISTITULAR);
        }
    }

    @JsonIgnore
    public Long getTitularTMODIFICARptpCodigo() {
        return this.titularTMODIFICARptpCodigo;
    }
    
    public void setTitularTMODIFICARptpCodigo(Long titularTMODIFICARptpCodigo) {
        this.titularTMODIFICARptpCodigo = titularTMODIFICARptpCodigo;
    }

    @JsonIgnore
    public String getTitularTMODIFICARptpNumIdentificacion() {
        return this.titularTMODIFICARptpNumIdentificacion;
    }
    
    public void setTitularTMODIFICARptpNumIdentificacion(String titularTMODIFICARptpNumIdentificacion) {
        this.titularTMODIFICARptpNumIdentificacion = titularTMODIFICARptpNumIdentificacion;
    }

    private void checkTitularTMODIFICARptpNumIdentificacion() throws NotNullArgumentException {
        if(this.getTitularTMODIFICARptpNumIdentificacion() == null) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_TMODIFICAR, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_TMODIFICAR_TITULARTMODIFICARPTPNUMIDENTIFICACION, TitularConstants.SERV_ALIAS_TMODIFICAR, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_TMODIFICAR_TITULARTMODIFICARPTPNUMIDENTIFICACION);
        }
    }

    @JsonIgnore
    public String getTitularTMODIFICARptpPrimerNombre() {
        return this.titularTMODIFICARptpPrimerNombre;
    }
    
    public void setTitularTMODIFICARptpPrimerNombre(String titularTMODIFICARptpPrimerNombre) {
        this.titularTMODIFICARptpPrimerNombre = titularTMODIFICARptpPrimerNombre;
    }

    @JsonIgnore
    public String getTitularTMODIFICARptpSegundoNombre() {
        return this.titularTMODIFICARptpSegundoNombre;
    }
    
    public void setTitularTMODIFICARptpSegundoNombre(String titularTMODIFICARptpSegundoNombre) {
        this.titularTMODIFICARptpSegundoNombre = titularTMODIFICARptpSegundoNombre;
    }

    @JsonIgnore
    public String getTitularTMODIFICARptpPrimerApellido() {
        return this.titularTMODIFICARptpPrimerApellido;
    }
    
    public void setTitularTMODIFICARptpPrimerApellido(String titularTMODIFICARptpPrimerApellido) {
        this.titularTMODIFICARptpPrimerApellido = titularTMODIFICARptpPrimerApellido;
    }

    @JsonIgnore
    public String getTitularTMODIFICARptpSegundoApellido() {
        return this.titularTMODIFICARptpSegundoApellido;
    }
    
    public void setTitularTMODIFICARptpSegundoApellido(String titularTMODIFICARptpSegundoApellido) {
        this.titularTMODIFICARptpSegundoApellido = titularTMODIFICARptpSegundoApellido;
    }

    @JsonIgnore
    public Date getTitularTMODIFICARptpFechaNacimiento() {
        return this.titularTMODIFICARptpFechaNacimiento;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setTitularTMODIFICARptpFechaNacimiento(Date titularTMODIFICARptpFechaNacimiento) {
        this.titularTMODIFICARptpFechaNacimiento = titularTMODIFICARptpFechaNacimiento;
    }

    @JsonIgnore
    public String getTitularTMODIFICARptpGenero() {
        return this.titularTMODIFICARptpGenero;
    }
    
    public void setTitularTMODIFICARptpGenero(String titularTMODIFICARptpGenero) {
        this.titularTMODIFICARptpGenero = titularTMODIFICARptpGenero;
    }

    @JsonIgnore
    public Boolean getTitularTMODIFICARptpIndicadorExtranjero() {
        return this.titularTMODIFICARptpIndicadorExtranjero;
    }
    
    public void setTitularTMODIFICARptpIndicadorExtranjero(Boolean titularTMODIFICARptpIndicadorExtranjero) {
        this.titularTMODIFICARptpIndicadorExtranjero = titularTMODIFICARptpIndicadorExtranjero;
    }

    @JsonIgnore
    public String getTitularTMODIFICARptpTelefonoFijo() {
        return this.titularTMODIFICARptpTelefonoFijo;
    }
    
    public void setTitularTMODIFICARptpTelefonoFijo(String titularTMODIFICARptpTelefonoFijo) {
        this.titularTMODIFICARptpTelefonoFijo = titularTMODIFICARptpTelefonoFijo;
    }

    @JsonIgnore
    public String getTitularTMODIFICARptpTelefonoCelular() {
        return this.titularTMODIFICARptpTelefonoCelular;
    }
    
    public void setTitularTMODIFICARptpTelefonoCelular(String titularTMODIFICARptpTelefonoCelular) {
        this.titularTMODIFICARptpTelefonoCelular = titularTMODIFICARptpTelefonoCelular;
    }

    @JsonIgnore
    public String getTitularTMODIFICARptpCorreoElectronico() {
        return this.titularTMODIFICARptpCorreoElectronico;
    }
    
    public void setTitularTMODIFICARptpCorreoElectronico(String titularTMODIFICARptpCorreoElectronico) {
        this.titularTMODIFICARptpCorreoElectronico = titularTMODIFICARptpCorreoElectronico;
    }

    @JsonIgnore
    public TipoIdentificacionOid getTitularTMODIFICARptpevcTipoIdentificacion() {
        return this.titularTMODIFICARptpevcTipoIdentificacion;
    }
    
    public void setTitularTMODIFICARptpevcTipoIdentificacion(TipoIdentificacionOid titularTMODIFICARptpevcTipoIdentificacion) {
        this.titularTMODIFICARptpevcTipoIdentificacion = titularTMODIFICARptpevcTipoIdentificacion;
    }

    @JsonIgnore
    public TipoIdentificacion getTitularTMODIFICARptpevcTipoIdentificacionInstance() {
        return this.titularTMODIFICARptpevcTipoIdentificacionInstance;
    }
    
    public void setTitularTMODIFICARptpevcTipoIdentificacionInstance(TipoIdentificacion titularTMODIFICARptpevcTipoIdentificacion) {
        this.titularTMODIFICARptpevcTipoIdentificacionInstance = titularTMODIFICARptpevcTipoIdentificacion;
        this.titularTMODIFICARptpevcTipoIdentificacion = titularTMODIFICARptpevcTipoIdentificacion != null ? titularTMODIFICARptpevcTipoIdentificacion.getOid() : null;
    }

    private void checkTitularTMODIFICARptpevcTipoIdentificacion() throws NotNullArgumentException {
        if(this.getTitularTMODIFICARptpevcTipoIdentificacionInstance() == null || this.getTitularTMODIFICARptpevcTipoIdentificacionInstance().isNull()) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_TMODIFICAR, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_TMODIFICAR_TITULARTMODIFICARPTPEVCTIPOIDENTIFICACION, TitularConstants.SERV_ALIAS_TMODIFICAR, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_TMODIFICAR_TITULARTMODIFICARPTPEVCTIPOIDENTIFICACION);
        }
    }

    @JsonIgnore
    public DepartamentoOid getTitularTMODIFICARptpevcDepartamento() {
        return this.titularTMODIFICARptpevcDepartamento;
    }
    
    public void setTitularTMODIFICARptpevcDepartamento(DepartamentoOid titularTMODIFICARptpevcDepartamento) {
        this.titularTMODIFICARptpevcDepartamento = titularTMODIFICARptpevcDepartamento;
    }

    @JsonIgnore
    public Departamento getTitularTMODIFICARptpevcDepartamentoInstance() {
        return this.titularTMODIFICARptpevcDepartamentoInstance;
    }
    
    public void setTitularTMODIFICARptpevcDepartamentoInstance(Departamento titularTMODIFICARptpevcDepartamento) {
        this.titularTMODIFICARptpevcDepartamentoInstance = titularTMODIFICARptpevcDepartamento;
        this.titularTMODIFICARptpevcDepartamento = titularTMODIFICARptpevcDepartamento != null ? titularTMODIFICARptpevcDepartamento.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getTitularTMODIFICARptpevcMunicipio() {
        return this.titularTMODIFICARptpevcMunicipio;
    }
    
    public void setTitularTMODIFICARptpevcMunicipio(MunicipioOid titularTMODIFICARptpevcMunicipio) {
        this.titularTMODIFICARptpevcMunicipio = titularTMODIFICARptpevcMunicipio;
    }

    @JsonIgnore
    public Municipio getTitularTMODIFICARptpevcMunicipioInstance() {
        return this.titularTMODIFICARptpevcMunicipioInstance;
    }
    
    public void setTitularTMODIFICARptpevcMunicipioInstance(Municipio titularTMODIFICARptpevcMunicipio) {
        this.titularTMODIFICARptpevcMunicipioInstance = titularTMODIFICARptpevcMunicipio;
        this.titularTMODIFICARptpevcMunicipio = titularTMODIFICARptpevcMunicipio != null ? titularTMODIFICARptpevcMunicipio.getOid() : null;
    }

    @JsonIgnore
    public Boolean getTitularTMODIFICARptpTitularConBeneficios() {
        return this.titularTMODIFICARptpTitularConBeneficios;
    }
    
    public void setTitularTMODIFICARptpTitularConBeneficios(Boolean titularTMODIFICARptpTitularConBeneficios) {
        this.titularTMODIFICARptpTitularConBeneficios = titularTMODIFICARptpTitularConBeneficios;
    }

    private void checkTitularTMODIFICARptpTitularConBeneficios() throws NotNullArgumentException {
        if(this.getTitularTMODIFICARptpTitularConBeneficios() == null) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_TMODIFICAR, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_TMODIFICAR_TITULARTMODIFICARPTPTITULARCONBENEFICIOS, TitularConstants.SERV_ALIAS_TMODIFICAR, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_TMODIFICAR_TITULARTMODIFICARPTPTITULARCONBENEFICIOS);
        }
    }

    @JsonIgnore
    public String getTitularTMODIFICARptpTelefonoFijoDC() {
        return this.titularTMODIFICARptpTelefonoFijoDC;
    }
    
    public void setTitularTMODIFICARptpTelefonoFijoDC(String titularTMODIFICARptpTelefonoFijoDC) {
        this.titularTMODIFICARptpTelefonoFijoDC = titularTMODIFICARptpTelefonoFijoDC;
    }

    @JsonIgnore
    public String getTitularTMODIFICARptpTelefonoCelularDC() {
        return this.titularTMODIFICARptpTelefonoCelularDC;
    }
    
    public void setTitularTMODIFICARptpTelefonoCelularDC(String titularTMODIFICARptpTelefonoCelularDC) {
        this.titularTMODIFICARptpTelefonoCelularDC = titularTMODIFICARptpTelefonoCelularDC;
    }

    @JsonIgnore
    public String getTitularTMODIFICARptpRazonSocial() {
        return this.titularTMODIFICARptpRazonSocial;
    }
    
    public void setTitularTMODIFICARptpRazonSocial(String titularTMODIFICARptpRazonSocial) {
        this.titularTMODIFICARptpRazonSocial = titularTMODIFICARptpRazonSocial;
    }
}
