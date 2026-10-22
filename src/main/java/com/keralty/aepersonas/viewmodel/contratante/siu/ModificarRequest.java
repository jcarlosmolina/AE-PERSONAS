package com.keralty.aepersonas.viewmodel.contratante.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.ContratanteConstants;
import com.keralty.aepersonas.persistence.Contratante;
import com.keralty.aepersonas.persistence.oid.ContratanteOid;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneDeserializer;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneSerializer;
import java.sql.Date;

public class ModificarRequest {

    @JsonProperty("p_thiscontratante_oid")
    private ContratanteOid contratantemodificarpthisContratante;
    
    @JsonIgnore
    private Contratante contratantemodificarpthisContratanteInstance;

    @JsonProperty("p_numidentificacion")
    private String contratantemodificarpNumIdentificacion;

    @JsonProperty("p_codigo")
    private Long contratantemodificarpCodigo;

    @JsonProperty("p_primernombre")
    private String contratantemodificarpPrimerNombre;

    @JsonProperty("p_primerapellido")
    private String contratantemodificarpPrimerApellido;

    @JsonProperty("p_segundoapellido")
    private String contratantemodificarpSegundoApellido;

    @JsonProperty("p_razonsocial")
    private String contratantemodificarpRazonSocial;

    @JsonProperty("p_fechanacimiento")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date contratantemodificarpFechaNacimiento;

    @JsonProperty("p_genero")
    private String contratantemodificarpGenero;

    @JsonProperty("p_indicadorextranjero")
    private Boolean contratantemodificarpIndicadorExtranjero;

    @JsonProperty("p_telefonocelular")
    private String contratantemodificarpTelefonoCelular;

    @JsonProperty("p_correoelectronico")
    private String contratantemodificarpCorreoElectronico;

    @JsonProperty("p_diplomatico")
    private Boolean contratantemodificarpDiplomatico;

    @JsonProperty("p_segundonombre")
    private String contratantemodificarpSegundoNombre;

    @JsonProperty("p_telefonofijo")
    private String contratantemodificarpTelefonoFijo;

    @JsonProperty("p_telefonofijores")
    private String contratantemodificarpTelefonoFijoRes;

    @JsonProperty("p_telefonocelularres")
    private String contratantemodificarpTelefonoCelularRes;

    public void checkArguments() throws NotNullArgumentException {
        checkContratantemodificarpthisContratante();
        checkContratantemodificarpNumIdentificacion();
        checkContratantemodificarpDiplomatico();
    }

    @JsonIgnore
    public ContratanteOid getContratantemodificarpthisContratante() {
        return this.contratantemodificarpthisContratante;
    }
    
    public void setContratantemodificarpthisContratante(ContratanteOid contratantemodificarpthisContratante) {
        this.contratantemodificarpthisContratante = contratantemodificarpthisContratante;
    }

    @JsonIgnore
    public Contratante getContratantemodificarpthisContratanteInstance() {
        return this.contratantemodificarpthisContratanteInstance;
    }
    
    public void setContratantemodificarpthisContratanteInstance(Contratante contratantemodificarpthisContratante) {
        this.contratantemodificarpthisContratanteInstance = contratantemodificarpthisContratante;
        this.contratantemodificarpthisContratante = contratantemodificarpthisContratante != null ? contratantemodificarpthisContratante.getOid() : null;
    }

    private void checkContratantemodificarpthisContratante() throws NotNullArgumentException {
        if(this.getContratantemodificarpthisContratanteInstance() == null || this.getContratantemodificarpthisContratanteInstance().isNull()) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_MODIFICAR, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_MODIFICAR_CONTRATANTEMODIFICARPTHISCONTRATANTE, ContratanteConstants.SERV_ALIAS_MODIFICAR, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_MODIFICAR_CONTRATANTEMODIFICARPTHISCONTRATANTE);
        }
    }

    @JsonIgnore
    public String getContratantemodificarpNumIdentificacion() {
        return this.contratantemodificarpNumIdentificacion;
    }
    
    public void setContratantemodificarpNumIdentificacion(String contratantemodificarpNumIdentificacion) {
        this.contratantemodificarpNumIdentificacion = contratantemodificarpNumIdentificacion;
    }

    private void checkContratantemodificarpNumIdentificacion() throws NotNullArgumentException {
        if(this.getContratantemodificarpNumIdentificacion() == null) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_MODIFICAR, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_MODIFICAR_CONTRATANTEMODIFICARPNUMIDENTIFICACION, ContratanteConstants.SERV_ALIAS_MODIFICAR, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_MODIFICAR_CONTRATANTEMODIFICARPNUMIDENTIFICACION);
        }
    }

    @JsonIgnore
    public Long getContratantemodificarpCodigo() {
        return this.contratantemodificarpCodigo;
    }
    
    public void setContratantemodificarpCodigo(Long contratantemodificarpCodigo) {
        this.contratantemodificarpCodigo = contratantemodificarpCodigo;
    }

    @JsonIgnore
    public String getContratantemodificarpPrimerNombre() {
        return this.contratantemodificarpPrimerNombre;
    }
    
    public void setContratantemodificarpPrimerNombre(String contratantemodificarpPrimerNombre) {
        this.contratantemodificarpPrimerNombre = contratantemodificarpPrimerNombre;
    }

    @JsonIgnore
    public String getContratantemodificarpPrimerApellido() {
        return this.contratantemodificarpPrimerApellido;
    }
    
    public void setContratantemodificarpPrimerApellido(String contratantemodificarpPrimerApellido) {
        this.contratantemodificarpPrimerApellido = contratantemodificarpPrimerApellido;
    }

    @JsonIgnore
    public String getContratantemodificarpSegundoApellido() {
        return this.contratantemodificarpSegundoApellido;
    }
    
    public void setContratantemodificarpSegundoApellido(String contratantemodificarpSegundoApellido) {
        this.contratantemodificarpSegundoApellido = contratantemodificarpSegundoApellido;
    }

    @JsonIgnore
    public String getContratantemodificarpRazonSocial() {
        return this.contratantemodificarpRazonSocial;
    }
    
    public void setContratantemodificarpRazonSocial(String contratantemodificarpRazonSocial) {
        this.contratantemodificarpRazonSocial = contratantemodificarpRazonSocial;
    }

    @JsonIgnore
    public Date getContratantemodificarpFechaNacimiento() {
        return this.contratantemodificarpFechaNacimiento;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setContratantemodificarpFechaNacimiento(Date contratantemodificarpFechaNacimiento) {
        this.contratantemodificarpFechaNacimiento = contratantemodificarpFechaNacimiento;
    }

    @JsonIgnore
    public String getContratantemodificarpGenero() {
        return this.contratantemodificarpGenero;
    }
    
    public void setContratantemodificarpGenero(String contratantemodificarpGenero) {
        this.contratantemodificarpGenero = contratantemodificarpGenero;
    }

    @JsonIgnore
    public Boolean getContratantemodificarpIndicadorExtranjero() {
        return this.contratantemodificarpIndicadorExtranjero;
    }
    
    public void setContratantemodificarpIndicadorExtranjero(Boolean contratantemodificarpIndicadorExtranjero) {
        this.contratantemodificarpIndicadorExtranjero = contratantemodificarpIndicadorExtranjero;
    }

    @JsonIgnore
    public String getContratantemodificarpTelefonoCelular() {
        return this.contratantemodificarpTelefonoCelular;
    }
    
    public void setContratantemodificarpTelefonoCelular(String contratantemodificarpTelefonoCelular) {
        this.contratantemodificarpTelefonoCelular = contratantemodificarpTelefonoCelular;
    }

    @JsonIgnore
    public String getContratantemodificarpCorreoElectronico() {
        return this.contratantemodificarpCorreoElectronico;
    }
    
    public void setContratantemodificarpCorreoElectronico(String contratantemodificarpCorreoElectronico) {
        this.contratantemodificarpCorreoElectronico = contratantemodificarpCorreoElectronico;
    }

    @JsonIgnore
    public Boolean getContratantemodificarpDiplomatico() {
        return this.contratantemodificarpDiplomatico;
    }
    
    public void setContratantemodificarpDiplomatico(Boolean contratantemodificarpDiplomatico) {
        this.contratantemodificarpDiplomatico = contratantemodificarpDiplomatico;
    }

    private void checkContratantemodificarpDiplomatico() throws NotNullArgumentException {
        if(this.getContratantemodificarpDiplomatico() == null) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_MODIFICAR, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_MODIFICAR_CONTRATANTEMODIFICARPDIPLOMATICO, ContratanteConstants.SERV_ALIAS_MODIFICAR, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_MODIFICAR_CONTRATANTEMODIFICARPDIPLOMATICO);
        }
    }

    @JsonIgnore
    public String getContratantemodificarpSegundoNombre() {
        return this.contratantemodificarpSegundoNombre;
    }
    
    public void setContratantemodificarpSegundoNombre(String contratantemodificarpSegundoNombre) {
        this.contratantemodificarpSegundoNombre = contratantemodificarpSegundoNombre;
    }

    @JsonIgnore
    public String getContratantemodificarpTelefonoFijo() {
        return this.contratantemodificarpTelefonoFijo;
    }
    
    public void setContratantemodificarpTelefonoFijo(String contratantemodificarpTelefonoFijo) {
        this.contratantemodificarpTelefonoFijo = contratantemodificarpTelefonoFijo;
    }

    @JsonIgnore
    public String getContratantemodificarpTelefonoFijoRes() {
        return this.contratantemodificarpTelefonoFijoRes;
    }
    
    public void setContratantemodificarpTelefonoFijoRes(String contratantemodificarpTelefonoFijoRes) {
        this.contratantemodificarpTelefonoFijoRes = contratantemodificarpTelefonoFijoRes;
    }

    @JsonIgnore
    public String getContratantemodificarpTelefonoCelularRes() {
        return this.contratantemodificarpTelefonoCelularRes;
    }
    
    public void setContratantemodificarpTelefonoCelularRes(String contratantemodificarpTelefonoCelularRes) {
        this.contratantemodificarpTelefonoCelularRes = contratantemodificarpTelefonoCelularRes;
    }
}
