package com.keralty.aepersonas.viewmodel.usuarioreg.ds;

import java.sql.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.UsuarioReg;
public class DSUsuarioRegPIU {

    @JsonProperty("numusuario")
    private Long dSUsuarioRegPIUNumUsuario;

    @JsonProperty("tipoynumdoc")
    private String dSUsuarioRegPIUTipoYNumDoc;

    @JsonProperty("primernombre")
    private String dSUsuarioRegPIUPrimerNombre;

    @JsonProperty("segundonombre")
    private String dSUsuarioRegPIUSegundoNombre;

    @JsonProperty("primerapellido")
    private String dSUsuarioRegPIUPrimerApellido;

    @JsonProperty("segundoapellido")
    private String dSUsuarioRegPIUSegundoApellido;

    @JsonProperty("parentesco_descripcion")
    private String dSUsuarioRegPIUParentescoDotDescripcion;

    @JsonProperty("estadobeneficiario_descripcion")
    private String dSUsuarioRegPIUEstadoBeneficiarioDotDescripcion;

    @JsonProperty("fechanacimiento")
    private Date dSUsuarioRegPIUFechaNacimiento;

    public DSUsuarioRegPIU() {
    
    }

    public DSUsuarioRegPIU(UsuarioReg instance) {
        if (instance != null) {
            try {
                this.dSUsuarioRegPIUNumUsuario = instance.getUsuarioRegNumUsuario();
                this.dSUsuarioRegPIUTipoYNumDoc = instance.getUsuarioRegTipoYNumDoc();
                this.dSUsuarioRegPIUPrimerNombre = instance.getUsuarioRegPrimerNombre();
                this.dSUsuarioRegPIUSegundoNombre = instance.getUsuarioRegSegundoNombre();
                this.dSUsuarioRegPIUPrimerApellido = instance.getUsuarioRegPrimerApellido();
                this.dSUsuarioRegPIUSegundoApellido = instance.getUsuarioRegSegundoApellido();
                this.dSUsuarioRegPIUParentescoDotDescripcion = instance.getParentesco().getParentescoDescripcion();
                this.dSUsuarioRegPIUEstadoBeneficiarioDotDescripcion = instance.getEstadoBeneficiario().getEstadoBeneficiarioDescripcion();
                this.dSUsuarioRegPIUFechaNacimiento = instance.getUsuarioRegFechaNacimiento();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public Long getDSUsuarioRegPIUNumUsuario() {
        return this.dSUsuarioRegPIUNumUsuario;
    }
    
    public void setDSUsuarioRegPIUNumUsuario(Long dSUsuarioRegPIUNumUsuario) {
        this.dSUsuarioRegPIUNumUsuario = dSUsuarioRegPIUNumUsuario;
    }

    @JsonIgnore
    public String getDSUsuarioRegPIUTipoYNumDoc() {
        return this.dSUsuarioRegPIUTipoYNumDoc;
    }
    
    public void setDSUsuarioRegPIUTipoYNumDoc(String dSUsuarioRegPIUTipoYNumDoc) {
        this.dSUsuarioRegPIUTipoYNumDoc = dSUsuarioRegPIUTipoYNumDoc;
    }

    @JsonIgnore
    public String getDSUsuarioRegPIUPrimerNombre() {
        return this.dSUsuarioRegPIUPrimerNombre;
    }
    
    public void setDSUsuarioRegPIUPrimerNombre(String dSUsuarioRegPIUPrimerNombre) {
        this.dSUsuarioRegPIUPrimerNombre = dSUsuarioRegPIUPrimerNombre;
    }

    @JsonIgnore
    public String getDSUsuarioRegPIUSegundoNombre() {
        return this.dSUsuarioRegPIUSegundoNombre;
    }
    
    public void setDSUsuarioRegPIUSegundoNombre(String dSUsuarioRegPIUSegundoNombre) {
        this.dSUsuarioRegPIUSegundoNombre = dSUsuarioRegPIUSegundoNombre;
    }

    @JsonIgnore
    public String getDSUsuarioRegPIUPrimerApellido() {
        return this.dSUsuarioRegPIUPrimerApellido;
    }
    
    public void setDSUsuarioRegPIUPrimerApellido(String dSUsuarioRegPIUPrimerApellido) {
        this.dSUsuarioRegPIUPrimerApellido = dSUsuarioRegPIUPrimerApellido;
    }

    @JsonIgnore
    public String getDSUsuarioRegPIUSegundoApellido() {
        return this.dSUsuarioRegPIUSegundoApellido;
    }
    
    public void setDSUsuarioRegPIUSegundoApellido(String dSUsuarioRegPIUSegundoApellido) {
        this.dSUsuarioRegPIUSegundoApellido = dSUsuarioRegPIUSegundoApellido;
    }

    @JsonIgnore
    public String getDSUsuarioRegPIUParentescoDotDescripcion() {
        return this.dSUsuarioRegPIUParentescoDotDescripcion;
    }
    
    public void setDSUsuarioRegPIUParentescoDotDescripcion(String dSUsuarioRegPIUParentescoDotDescripcion) {
        this.dSUsuarioRegPIUParentescoDotDescripcion = dSUsuarioRegPIUParentescoDotDescripcion;
    }

    @JsonIgnore
    public String getDSUsuarioRegPIUEstadoBeneficiarioDotDescripcion() {
        return this.dSUsuarioRegPIUEstadoBeneficiarioDotDescripcion;
    }
    
    public void setDSUsuarioRegPIUEstadoBeneficiarioDotDescripcion(String dSUsuarioRegPIUEstadoBeneficiarioDotDescripcion) {
        this.dSUsuarioRegPIUEstadoBeneficiarioDotDescripcion = dSUsuarioRegPIUEstadoBeneficiarioDotDescripcion;
    }

    @JsonIgnore
    public Date getDSUsuarioRegPIUFechaNacimiento() {
        return this.dSUsuarioRegPIUFechaNacimiento;
    }
    
    public void setDSUsuarioRegPIUFechaNacimiento(Date dSUsuarioRegPIUFechaNacimiento) {
        this.dSUsuarioRegPIUFechaNacimiento = dSUsuarioRegPIUFechaNacimiento;
    }
}
