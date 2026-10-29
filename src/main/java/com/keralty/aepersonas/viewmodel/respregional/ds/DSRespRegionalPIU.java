package com.keralty.aepersonas.viewmodel.respregional.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.RespRegional;
public class DSRespRegionalPIU {

    @JsonProperty("usuario")
    private String dSRespRegionalPIUUsuario;

    @JsonProperty("primernombre")
    private String dSRespRegionalPIUPrimerNombre;

    @JsonProperty("segundonombre")
    private String dSRespRegionalPIUSegundoNombre;

    @JsonProperty("primerapellido")
    private String dSRespRegionalPIUPrimerApellido;

    @JsonProperty("segundoapellido")
    private String dSRespRegionalPIUSegundoApellido;

    @JsonProperty("email")
    private String dSRespRegionalPIUEmail;

    @JsonProperty("usuarioldap")
    private String dSRespRegionalPIUUsuarioLDAP;

    @JsonProperty("regional_descripcion")
    private String dSRespRegionalPIURegionalDotDescripcion;

    public DSRespRegionalPIU() {
    
    }

    public DSRespRegionalPIU(RespRegional instance) {
        if (instance != null) {
            try {
                this.dSRespRegionalPIUUsuario = instance.getFuncionarioUsuario();
                this.dSRespRegionalPIUPrimerNombre = instance.getFuncionarioPrimerNombre();
                this.dSRespRegionalPIUSegundoNombre = instance.getFuncionarioSegundoNombre();
                this.dSRespRegionalPIUPrimerApellido = instance.getFuncionarioPrimerApellido();
                this.dSRespRegionalPIUSegundoApellido = instance.getFuncionarioSegundoApellido();
                this.dSRespRegionalPIUEmail = instance.getFuncionarioEmail();
                this.dSRespRegionalPIUUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
                this.dSRespRegionalPIURegionalDotDescripcion = instance.getRegional().getRegionalDescripcion();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getDSRespRegionalPIUUsuario() {
        return this.dSRespRegionalPIUUsuario;
    }
    
    public void setDSRespRegionalPIUUsuario(String dSRespRegionalPIUUsuario) {
        this.dSRespRegionalPIUUsuario = dSRespRegionalPIUUsuario;
    }

    @JsonIgnore
    public String getDSRespRegionalPIUPrimerNombre() {
        return this.dSRespRegionalPIUPrimerNombre;
    }
    
    public void setDSRespRegionalPIUPrimerNombre(String dSRespRegionalPIUPrimerNombre) {
        this.dSRespRegionalPIUPrimerNombre = dSRespRegionalPIUPrimerNombre;
    }

    @JsonIgnore
    public String getDSRespRegionalPIUSegundoNombre() {
        return this.dSRespRegionalPIUSegundoNombre;
    }
    
    public void setDSRespRegionalPIUSegundoNombre(String dSRespRegionalPIUSegundoNombre) {
        this.dSRespRegionalPIUSegundoNombre = dSRespRegionalPIUSegundoNombre;
    }

    @JsonIgnore
    public String getDSRespRegionalPIUPrimerApellido() {
        return this.dSRespRegionalPIUPrimerApellido;
    }
    
    public void setDSRespRegionalPIUPrimerApellido(String dSRespRegionalPIUPrimerApellido) {
        this.dSRespRegionalPIUPrimerApellido = dSRespRegionalPIUPrimerApellido;
    }

    @JsonIgnore
    public String getDSRespRegionalPIUSegundoApellido() {
        return this.dSRespRegionalPIUSegundoApellido;
    }
    
    public void setDSRespRegionalPIUSegundoApellido(String dSRespRegionalPIUSegundoApellido) {
        this.dSRespRegionalPIUSegundoApellido = dSRespRegionalPIUSegundoApellido;
    }

    @JsonIgnore
    public String getDSRespRegionalPIUEmail() {
        return this.dSRespRegionalPIUEmail;
    }
    
    public void setDSRespRegionalPIUEmail(String dSRespRegionalPIUEmail) {
        this.dSRespRegionalPIUEmail = dSRespRegionalPIUEmail;
    }

    @JsonIgnore
    public String getDSRespRegionalPIUUsuarioLDAP() {
        return this.dSRespRegionalPIUUsuarioLDAP;
    }
    
    public void setDSRespRegionalPIUUsuarioLDAP(String dSRespRegionalPIUUsuarioLDAP) {
        this.dSRespRegionalPIUUsuarioLDAP = dSRespRegionalPIUUsuarioLDAP;
    }

    @JsonIgnore
    public String getDSRespRegionalPIURegionalDotDescripcion() {
        return this.dSRespRegionalPIURegionalDotDescripcion;
    }
    
    public void setDSRespRegionalPIURegionalDotDescripcion(String dSRespRegionalPIURegionalDotDescripcion) {
        this.dSRespRegionalPIURegionalDotDescripcion = dSRespRegionalPIURegionalDotDescripcion;
    }
}
