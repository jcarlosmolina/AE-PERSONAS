package com.keralty.aepersonas.viewmodel.titular.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.TitularConstants;
import com.keralty.aepersonas.persistence.oid.TitularOid;
import com.keralty.aepersonas.persistence.Titular;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneDeserializer;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneSerializer;
import java.sql.Date;

public class ModificarRequest {

    @JsonProperty("p_thistitular_oid")
    private TitularOid titularmodificarpthisTitular;
    
    @JsonIgnore
    private Titular titularmodificarpthisTitularInstance;

    @JsonProperty("p_codigo")
    private Long titularmodificarpCodigo;

    @JsonProperty("p_numidentificacion")
    private String titularmodificarpNumIdentificacion;

    @JsonProperty("p_primernombre")
    private String titularmodificarpPrimerNombre;

    @JsonProperty("p_segundonombre")
    private String titularmodificarpSegundoNombre;

    @JsonProperty("p_primerapellido")
    private String titularmodificarpPrimerApellido;

    @JsonProperty("p_segundoapellido")
    private String titularmodificarpSegundoApellido;

    @JsonProperty("p_fechanacimiento")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date titularmodificarpFechaNacimiento;

    @JsonProperty("p_genero")
    private String titularmodificarpGenero;

    @JsonProperty("p_indicadorextranjero")
    private Boolean titularmodificarpIndicadorExtranjero;

    @JsonProperty("p_telefonofijo")
    private String titularmodificarpTelefonoFijo;

    @JsonProperty("p_telefonocelular")
    private String titularmodificarpTelefonoCelular;

    @JsonProperty("p_correoelectronico")
    private String titularmodificarpCorreoElectronico;

    @JsonProperty("p_telefonofijodc")
    private String titularmodificarpTelefonoFijoDC;

    @JsonProperty("p_telefonocelulardc")
    private String titularmodificarpTelefonoCelularDC;

    @JsonProperty("p_razonsocial")
    private String titularmodificarpRazonSocial;

    public void checkArguments() throws NotNullArgumentException {
        checkTitularmodificarpthisTitular();
        checkTitularmodificarpNumIdentificacion();
    }

    @JsonIgnore
    public TitularOid getTitularmodificarpthisTitular() {
        return this.titularmodificarpthisTitular;
    }
    
    public void setTitularmodificarpthisTitular(TitularOid titularmodificarpthisTitular) {
        this.titularmodificarpthisTitular = titularmodificarpthisTitular;
    }

    @JsonIgnore
    public Titular getTitularmodificarpthisTitularInstance() {
        return this.titularmodificarpthisTitularInstance;
    }
    
    public void setTitularmodificarpthisTitularInstance(Titular titularmodificarpthisTitular) {
        this.titularmodificarpthisTitularInstance = titularmodificarpthisTitular;
        this.titularmodificarpthisTitular = titularmodificarpthisTitular != null ? titularmodificarpthisTitular.getOid() : null;
    }

    private void checkTitularmodificarpthisTitular() throws NotNullArgumentException {
        if(this.getTitularmodificarpthisTitularInstance() == null || this.getTitularmodificarpthisTitularInstance().isNull()) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_MODIFICAR, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_MODIFICAR_TITULARMODIFICARPTHISTITULAR, TitularConstants.SERV_ALIAS_MODIFICAR, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_MODIFICAR_TITULARMODIFICARPTHISTITULAR);
        }
    }

    @JsonIgnore
    public Long getTitularmodificarpCodigo() {
        return this.titularmodificarpCodigo;
    }
    
    public void setTitularmodificarpCodigo(Long titularmodificarpCodigo) {
        this.titularmodificarpCodigo = titularmodificarpCodigo;
    }

    @JsonIgnore
    public String getTitularmodificarpNumIdentificacion() {
        return this.titularmodificarpNumIdentificacion;
    }
    
    public void setTitularmodificarpNumIdentificacion(String titularmodificarpNumIdentificacion) {
        this.titularmodificarpNumIdentificacion = titularmodificarpNumIdentificacion;
    }

    private void checkTitularmodificarpNumIdentificacion() throws NotNullArgumentException {
        if(this.getTitularmodificarpNumIdentificacion() == null) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_MODIFICAR, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_MODIFICAR_TITULARMODIFICARPNUMIDENTIFICACION, TitularConstants.SERV_ALIAS_MODIFICAR, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_MODIFICAR_TITULARMODIFICARPNUMIDENTIFICACION);
        }
    }

    @JsonIgnore
    public String getTitularmodificarpPrimerNombre() {
        return this.titularmodificarpPrimerNombre;
    }
    
    public void setTitularmodificarpPrimerNombre(String titularmodificarpPrimerNombre) {
        this.titularmodificarpPrimerNombre = titularmodificarpPrimerNombre;
    }

    @JsonIgnore
    public String getTitularmodificarpSegundoNombre() {
        return this.titularmodificarpSegundoNombre;
    }
    
    public void setTitularmodificarpSegundoNombre(String titularmodificarpSegundoNombre) {
        this.titularmodificarpSegundoNombre = titularmodificarpSegundoNombre;
    }

    @JsonIgnore
    public String getTitularmodificarpPrimerApellido() {
        return this.titularmodificarpPrimerApellido;
    }
    
    public void setTitularmodificarpPrimerApellido(String titularmodificarpPrimerApellido) {
        this.titularmodificarpPrimerApellido = titularmodificarpPrimerApellido;
    }

    @JsonIgnore
    public String getTitularmodificarpSegundoApellido() {
        return this.titularmodificarpSegundoApellido;
    }
    
    public void setTitularmodificarpSegundoApellido(String titularmodificarpSegundoApellido) {
        this.titularmodificarpSegundoApellido = titularmodificarpSegundoApellido;
    }

    @JsonIgnore
    public Date getTitularmodificarpFechaNacimiento() {
        return this.titularmodificarpFechaNacimiento;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setTitularmodificarpFechaNacimiento(Date titularmodificarpFechaNacimiento) {
        this.titularmodificarpFechaNacimiento = titularmodificarpFechaNacimiento;
    }

    @JsonIgnore
    public String getTitularmodificarpGenero() {
        return this.titularmodificarpGenero;
    }
    
    public void setTitularmodificarpGenero(String titularmodificarpGenero) {
        this.titularmodificarpGenero = titularmodificarpGenero;
    }

    @JsonIgnore
    public Boolean getTitularmodificarpIndicadorExtranjero() {
        return this.titularmodificarpIndicadorExtranjero;
    }
    
    public void setTitularmodificarpIndicadorExtranjero(Boolean titularmodificarpIndicadorExtranjero) {
        this.titularmodificarpIndicadorExtranjero = titularmodificarpIndicadorExtranjero;
    }

    @JsonIgnore
    public String getTitularmodificarpTelefonoFijo() {
        return this.titularmodificarpTelefonoFijo;
    }
    
    public void setTitularmodificarpTelefonoFijo(String titularmodificarpTelefonoFijo) {
        this.titularmodificarpTelefonoFijo = titularmodificarpTelefonoFijo;
    }

    @JsonIgnore
    public String getTitularmodificarpTelefonoCelular() {
        return this.titularmodificarpTelefonoCelular;
    }
    
    public void setTitularmodificarpTelefonoCelular(String titularmodificarpTelefonoCelular) {
        this.titularmodificarpTelefonoCelular = titularmodificarpTelefonoCelular;
    }

    @JsonIgnore
    public String getTitularmodificarpCorreoElectronico() {
        return this.titularmodificarpCorreoElectronico;
    }
    
    public void setTitularmodificarpCorreoElectronico(String titularmodificarpCorreoElectronico) {
        this.titularmodificarpCorreoElectronico = titularmodificarpCorreoElectronico;
    }

    @JsonIgnore
    public String getTitularmodificarpTelefonoFijoDC() {
        return this.titularmodificarpTelefonoFijoDC;
    }
    
    public void setTitularmodificarpTelefonoFijoDC(String titularmodificarpTelefonoFijoDC) {
        this.titularmodificarpTelefonoFijoDC = titularmodificarpTelefonoFijoDC;
    }

    @JsonIgnore
    public String getTitularmodificarpTelefonoCelularDC() {
        return this.titularmodificarpTelefonoCelularDC;
    }
    
    public void setTitularmodificarpTelefonoCelularDC(String titularmodificarpTelefonoCelularDC) {
        this.titularmodificarpTelefonoCelularDC = titularmodificarpTelefonoCelularDC;
    }

    @JsonIgnore
    public String getTitularmodificarpRazonSocial() {
        return this.titularmodificarpRazonSocial;
    }
    
    public void setTitularmodificarpRazonSocial(String titularmodificarpRazonSocial) {
        this.titularmodificarpRazonSocial = titularmodificarpRazonSocial;
    }
}
