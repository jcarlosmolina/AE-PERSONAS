package com.keralty.aepersonas.viewmodel.contratante.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.ContratanteConstants;
import com.keralty.aepersonas.persistence.Contratante;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.ContratanteOid;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;
import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneDeserializer;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneSerializer;
import java.sql.Date;

public class TMODIFICARRequest {

    @JsonProperty("p_thiscontratante_oid")
    private ContratanteOid contratanteTMODIFICARpthisContratante;
    
    @JsonIgnore
    private Contratante contratanteTMODIFICARpthisContratanteInstance;

    @JsonProperty("pt_p_numidentificacion")
    private String contratanteTMODIFICARptpNumIdentificacion;

    @JsonProperty("pt_p_codigo")
    private Long contratanteTMODIFICARptpCodigo;

    @JsonProperty("pt_p_primernombre")
    private String contratanteTMODIFICARptpPrimerNombre;

    @JsonProperty("pt_p_primerapellido")
    private String contratanteTMODIFICARptpPrimerApellido;

    @JsonProperty("pt_p_segundoapellido")
    private String contratanteTMODIFICARptpSegundoApellido;

    @JsonProperty("pt_p_razonsocial")
    private String contratanteTMODIFICARptpRazonSocial;

    @JsonProperty("pt_p_fechanacimiento")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date contratanteTMODIFICARptpFechaNacimiento;

    @JsonProperty("pt_p_genero")
    private String contratanteTMODIFICARptpGenero;

    @JsonProperty("pt_p_indicadorextranjero")
    private Boolean contratanteTMODIFICARptpIndicadorExtranjero;

    @JsonProperty("pt_p_telefonocelular")
    private String contratanteTMODIFICARptpTelefonoCelular;

    @JsonProperty("pt_p_correoelectronico")
    private String contratanteTMODIFICARptpCorreoElectronico;

    @JsonProperty("pt_p_evctipoidentificacion_oid")
    private TipoIdentificacionOid contratanteTMODIFICARptpevcTipoIdentificacion;
    
    @JsonIgnore
    private TipoIdentificacion contratanteTMODIFICARptpevcTipoIdentificacionInstance;

    @JsonProperty("pt_p_diplomatico")
    private Boolean contratanteTMODIFICARptpDiplomatico;

    @JsonProperty("pt_p_segundonombre")
    private String contratanteTMODIFICARptpSegundoNombre;

    @JsonProperty("pt_p_telefonofijo")
    private String contratanteTMODIFICARptpTelefonoFijo;

    @JsonProperty("pt_departamentonac_oid")
    private DepartamentoOid contratanteTMODIFICARptDepartamentoNac;
    
    @JsonIgnore
    private Departamento contratanteTMODIFICARptDepartamentoNacInstance;

    @JsonProperty("pt_municipionac_oid")
    private MunicipioOid contratanteTMODIFICARptMunicipioNac;
    
    @JsonIgnore
    private Municipio contratanteTMODIFICARptMunicipioNacInstance;

    @JsonProperty("pt_telefonofijores")
    private String contratanteTMODIFICARptTelefonoFijoRes;

    @JsonProperty("pt_telefonocelularres")
    private String contratanteTMODIFICARptTelefonoCelularRes;

    public void checkArguments() throws NotNullArgumentException {
        checkContratanteTMODIFICARpthisContratante();
        checkContratanteTMODIFICARptpNumIdentificacion();
        checkContratanteTMODIFICARptpevcTipoIdentificacion();
        checkContratanteTMODIFICARptpDiplomatico();
    }

    @JsonIgnore
    public ContratanteOid getContratanteTMODIFICARpthisContratante() {
        return this.contratanteTMODIFICARpthisContratante;
    }
    
    public void setContratanteTMODIFICARpthisContratante(ContratanteOid contratanteTMODIFICARpthisContratante) {
        this.contratanteTMODIFICARpthisContratante = contratanteTMODIFICARpthisContratante;
    }

    @JsonIgnore
    public Contratante getContratanteTMODIFICARpthisContratanteInstance() {
        return this.contratanteTMODIFICARpthisContratanteInstance;
    }
    
    public void setContratanteTMODIFICARpthisContratanteInstance(Contratante contratanteTMODIFICARpthisContratante) {
        this.contratanteTMODIFICARpthisContratanteInstance = contratanteTMODIFICARpthisContratante;
        this.contratanteTMODIFICARpthisContratante = contratanteTMODIFICARpthisContratante != null ? contratanteTMODIFICARpthisContratante.getOid() : null;
    }

    private void checkContratanteTMODIFICARpthisContratante() throws NotNullArgumentException {
        if(this.getContratanteTMODIFICARpthisContratanteInstance() == null || this.getContratanteTMODIFICARpthisContratanteInstance().isNull()) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_TMODIFICAR, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_TMODIFICAR_CONTRATANTETMODIFICARPTHISCONTRATANTE, ContratanteConstants.SERV_ALIAS_TMODIFICAR, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_TMODIFICAR_CONTRATANTETMODIFICARPTHISCONTRATANTE);
        }
    }

    @JsonIgnore
    public String getContratanteTMODIFICARptpNumIdentificacion() {
        return this.contratanteTMODIFICARptpNumIdentificacion;
    }
    
    public void setContratanteTMODIFICARptpNumIdentificacion(String contratanteTMODIFICARptpNumIdentificacion) {
        this.contratanteTMODIFICARptpNumIdentificacion = contratanteTMODIFICARptpNumIdentificacion;
    }

    private void checkContratanteTMODIFICARptpNumIdentificacion() throws NotNullArgumentException {
        if(this.getContratanteTMODIFICARptpNumIdentificacion() == null) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_TMODIFICAR, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_TMODIFICAR_CONTRATANTETMODIFICARPTPNUMIDENTIFICACION, ContratanteConstants.SERV_ALIAS_TMODIFICAR, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_TMODIFICAR_CONTRATANTETMODIFICARPTPNUMIDENTIFICACION);
        }
    }

    @JsonIgnore
    public Long getContratanteTMODIFICARptpCodigo() {
        return this.contratanteTMODIFICARptpCodigo;
    }
    
    public void setContratanteTMODIFICARptpCodigo(Long contratanteTMODIFICARptpCodigo) {
        this.contratanteTMODIFICARptpCodigo = contratanteTMODIFICARptpCodigo;
    }

    @JsonIgnore
    public String getContratanteTMODIFICARptpPrimerNombre() {
        return this.contratanteTMODIFICARptpPrimerNombre;
    }
    
    public void setContratanteTMODIFICARptpPrimerNombre(String contratanteTMODIFICARptpPrimerNombre) {
        this.contratanteTMODIFICARptpPrimerNombre = contratanteTMODIFICARptpPrimerNombre;
    }

    @JsonIgnore
    public String getContratanteTMODIFICARptpPrimerApellido() {
        return this.contratanteTMODIFICARptpPrimerApellido;
    }
    
    public void setContratanteTMODIFICARptpPrimerApellido(String contratanteTMODIFICARptpPrimerApellido) {
        this.contratanteTMODIFICARptpPrimerApellido = contratanteTMODIFICARptpPrimerApellido;
    }

    @JsonIgnore
    public String getContratanteTMODIFICARptpSegundoApellido() {
        return this.contratanteTMODIFICARptpSegundoApellido;
    }
    
    public void setContratanteTMODIFICARptpSegundoApellido(String contratanteTMODIFICARptpSegundoApellido) {
        this.contratanteTMODIFICARptpSegundoApellido = contratanteTMODIFICARptpSegundoApellido;
    }

    @JsonIgnore
    public String getContratanteTMODIFICARptpRazonSocial() {
        return this.contratanteTMODIFICARptpRazonSocial;
    }
    
    public void setContratanteTMODIFICARptpRazonSocial(String contratanteTMODIFICARptpRazonSocial) {
        this.contratanteTMODIFICARptpRazonSocial = contratanteTMODIFICARptpRazonSocial;
    }

    @JsonIgnore
    public Date getContratanteTMODIFICARptpFechaNacimiento() {
        return this.contratanteTMODIFICARptpFechaNacimiento;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setContratanteTMODIFICARptpFechaNacimiento(Date contratanteTMODIFICARptpFechaNacimiento) {
        this.contratanteTMODIFICARptpFechaNacimiento = contratanteTMODIFICARptpFechaNacimiento;
    }

    @JsonIgnore
    public String getContratanteTMODIFICARptpGenero() {
        return this.contratanteTMODIFICARptpGenero;
    }
    
    public void setContratanteTMODIFICARptpGenero(String contratanteTMODIFICARptpGenero) {
        this.contratanteTMODIFICARptpGenero = contratanteTMODIFICARptpGenero;
    }

    @JsonIgnore
    public Boolean getContratanteTMODIFICARptpIndicadorExtranjero() {
        return this.contratanteTMODIFICARptpIndicadorExtranjero;
    }
    
    public void setContratanteTMODIFICARptpIndicadorExtranjero(Boolean contratanteTMODIFICARptpIndicadorExtranjero) {
        this.contratanteTMODIFICARptpIndicadorExtranjero = contratanteTMODIFICARptpIndicadorExtranjero;
    }

    @JsonIgnore
    public String getContratanteTMODIFICARptpTelefonoCelular() {
        return this.contratanteTMODIFICARptpTelefonoCelular;
    }
    
    public void setContratanteTMODIFICARptpTelefonoCelular(String contratanteTMODIFICARptpTelefonoCelular) {
        this.contratanteTMODIFICARptpTelefonoCelular = contratanteTMODIFICARptpTelefonoCelular;
    }

    @JsonIgnore
    public String getContratanteTMODIFICARptpCorreoElectronico() {
        return this.contratanteTMODIFICARptpCorreoElectronico;
    }
    
    public void setContratanteTMODIFICARptpCorreoElectronico(String contratanteTMODIFICARptpCorreoElectronico) {
        this.contratanteTMODIFICARptpCorreoElectronico = contratanteTMODIFICARptpCorreoElectronico;
    }

    @JsonIgnore
    public TipoIdentificacionOid getContratanteTMODIFICARptpevcTipoIdentificacion() {
        return this.contratanteTMODIFICARptpevcTipoIdentificacion;
    }
    
    public void setContratanteTMODIFICARptpevcTipoIdentificacion(TipoIdentificacionOid contratanteTMODIFICARptpevcTipoIdentificacion) {
        this.contratanteTMODIFICARptpevcTipoIdentificacion = contratanteTMODIFICARptpevcTipoIdentificacion;
    }

    @JsonIgnore
    public TipoIdentificacion getContratanteTMODIFICARptpevcTipoIdentificacionInstance() {
        return this.contratanteTMODIFICARptpevcTipoIdentificacionInstance;
    }
    
    public void setContratanteTMODIFICARptpevcTipoIdentificacionInstance(TipoIdentificacion contratanteTMODIFICARptpevcTipoIdentificacion) {
        this.contratanteTMODIFICARptpevcTipoIdentificacionInstance = contratanteTMODIFICARptpevcTipoIdentificacion;
        this.contratanteTMODIFICARptpevcTipoIdentificacion = contratanteTMODIFICARptpevcTipoIdentificacion != null ? contratanteTMODIFICARptpevcTipoIdentificacion.getOid() : null;
    }

    private void checkContratanteTMODIFICARptpevcTipoIdentificacion() throws NotNullArgumentException {
        if(this.getContratanteTMODIFICARptpevcTipoIdentificacionInstance() == null || this.getContratanteTMODIFICARptpevcTipoIdentificacionInstance().isNull()) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_TMODIFICAR, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_TMODIFICAR_CONTRATANTETMODIFICARPTPEVCTIPOIDENTIFICACION, ContratanteConstants.SERV_ALIAS_TMODIFICAR, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_TMODIFICAR_CONTRATANTETMODIFICARPTPEVCTIPOIDENTIFICACION);
        }
    }

    @JsonIgnore
    public Boolean getContratanteTMODIFICARptpDiplomatico() {
        return this.contratanteTMODIFICARptpDiplomatico;
    }
    
    public void setContratanteTMODIFICARptpDiplomatico(Boolean contratanteTMODIFICARptpDiplomatico) {
        this.contratanteTMODIFICARptpDiplomatico = contratanteTMODIFICARptpDiplomatico;
    }

    private void checkContratanteTMODIFICARptpDiplomatico() throws NotNullArgumentException {
        if(this.getContratanteTMODIFICARptpDiplomatico() == null) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_TMODIFICAR, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_TMODIFICAR_CONTRATANTETMODIFICARPTPDIPLOMATICO, ContratanteConstants.SERV_ALIAS_TMODIFICAR, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_TMODIFICAR_CONTRATANTETMODIFICARPTPDIPLOMATICO);
        }
    }

    @JsonIgnore
    public String getContratanteTMODIFICARptpSegundoNombre() {
        return this.contratanteTMODIFICARptpSegundoNombre;
    }
    
    public void setContratanteTMODIFICARptpSegundoNombre(String contratanteTMODIFICARptpSegundoNombre) {
        this.contratanteTMODIFICARptpSegundoNombre = contratanteTMODIFICARptpSegundoNombre;
    }

    @JsonIgnore
    public String getContratanteTMODIFICARptpTelefonoFijo() {
        return this.contratanteTMODIFICARptpTelefonoFijo;
    }
    
    public void setContratanteTMODIFICARptpTelefonoFijo(String contratanteTMODIFICARptpTelefonoFijo) {
        this.contratanteTMODIFICARptpTelefonoFijo = contratanteTMODIFICARptpTelefonoFijo;
    }

    @JsonIgnore
    public DepartamentoOid getContratanteTMODIFICARptDepartamentoNac() {
        return this.contratanteTMODIFICARptDepartamentoNac;
    }
    
    public void setContratanteTMODIFICARptDepartamentoNac(DepartamentoOid contratanteTMODIFICARptDepartamentoNac) {
        this.contratanteTMODIFICARptDepartamentoNac = contratanteTMODIFICARptDepartamentoNac;
    }

    @JsonIgnore
    public Departamento getContratanteTMODIFICARptDepartamentoNacInstance() {
        return this.contratanteTMODIFICARptDepartamentoNacInstance;
    }
    
    public void setContratanteTMODIFICARptDepartamentoNacInstance(Departamento contratanteTMODIFICARptDepartamentoNac) {
        this.contratanteTMODIFICARptDepartamentoNacInstance = contratanteTMODIFICARptDepartamentoNac;
        this.contratanteTMODIFICARptDepartamentoNac = contratanteTMODIFICARptDepartamentoNac != null ? contratanteTMODIFICARptDepartamentoNac.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getContratanteTMODIFICARptMunicipioNac() {
        return this.contratanteTMODIFICARptMunicipioNac;
    }
    
    public void setContratanteTMODIFICARptMunicipioNac(MunicipioOid contratanteTMODIFICARptMunicipioNac) {
        this.contratanteTMODIFICARptMunicipioNac = contratanteTMODIFICARptMunicipioNac;
    }

    @JsonIgnore
    public Municipio getContratanteTMODIFICARptMunicipioNacInstance() {
        return this.contratanteTMODIFICARptMunicipioNacInstance;
    }
    
    public void setContratanteTMODIFICARptMunicipioNacInstance(Municipio contratanteTMODIFICARptMunicipioNac) {
        this.contratanteTMODIFICARptMunicipioNacInstance = contratanteTMODIFICARptMunicipioNac;
        this.contratanteTMODIFICARptMunicipioNac = contratanteTMODIFICARptMunicipioNac != null ? contratanteTMODIFICARptMunicipioNac.getOid() : null;
    }

    @JsonIgnore
    public String getContratanteTMODIFICARptTelefonoFijoRes() {
        return this.contratanteTMODIFICARptTelefonoFijoRes;
    }
    
    public void setContratanteTMODIFICARptTelefonoFijoRes(String contratanteTMODIFICARptTelefonoFijoRes) {
        this.contratanteTMODIFICARptTelefonoFijoRes = contratanteTMODIFICARptTelefonoFijoRes;
    }

    @JsonIgnore
    public String getContratanteTMODIFICARptTelefonoCelularRes() {
        return this.contratanteTMODIFICARptTelefonoCelularRes;
    }
    
    public void setContratanteTMODIFICARptTelefonoCelularRes(String contratanteTMODIFICARptTelefonoCelularRes) {
        this.contratanteTMODIFICARptTelefonoCelularRes = contratanteTMODIFICARptTelefonoCelularRes;
    }
}
