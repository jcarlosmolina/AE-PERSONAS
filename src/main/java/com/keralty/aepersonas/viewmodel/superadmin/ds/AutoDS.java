package com.keralty.aepersonas.viewmodel.superadmin.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.SuperAdmin;
public class AutoDS {

    @JsonProperty("usuario")
    private String autoDSUsuario;

    @JsonProperty("primernombre")
    private String autoDSPrimerNombre;

    @JsonProperty("segundonombre")
    private String autoDSSegundoNombre;

    @JsonProperty("primerapellido")
    private String autoDSPrimerApellido;

    @JsonProperty("segundoapellido")
    private String autoDSSegundoApellido;

    @JsonProperty("drvnombrecompleto")
    private String autoDSDrvNombreCompleto;

    @JsonProperty("usuarioldap")
    private String autoDSUsuarioLDAP;

    @JsonProperty("email")
    private String autoDSEmail;

    @JsonProperty("codjefe")
    private String autoDSCodJefe;

    @JsonProperty("id")
    private Long autoDSId;

    @JsonProperty("manual")
    private Boolean autoDSManual;

    @JsonProperty("drvnomjefe")
    private String autoDSDrvNomJefe;

    @JsonProperty("drvnomagencia")
    private String autoDSDrvNomAgencia;

    @JsonProperty("disponible")
    private Boolean autoDSDisponible;

    @JsonProperty("numsolnoterminadas")
    private Long autoDSNumSolNoTerminadas;

    @JsonProperty("drvesasesorintegral")
    private Boolean autoDSDrvEsAsesorIntegral;

    @JsonProperty("drvesafiliacion")
    private Boolean autoDSDrvEsAfiliacion;

    @JsonProperty("idsesion")
    private String autoDSIdSesion;

    public AutoDS() {
    
    }

    public AutoDS(SuperAdmin instance) {
        if (instance != null) {
            try {
                this.autoDSUsuario = instance.getFuncionarioUsuario();
                this.autoDSPrimerNombre = instance.getFuncionarioPrimerNombre();
                this.autoDSSegundoNombre = instance.getFuncionarioSegundoNombre();
                this.autoDSPrimerApellido = instance.getFuncionarioPrimerApellido();
                this.autoDSSegundoApellido = instance.getFuncionarioSegundoApellido();
                this.autoDSDrvNombreCompleto = instance.getFuncionariodrvNombreCompleto();
                this.autoDSUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
                this.autoDSEmail = instance.getFuncionarioEmail();
                this.autoDSCodJefe = instance.getFuncionarioCodJefe();
                this.autoDSId = instance.getFuncionarioId();
                this.autoDSManual = instance.getFuncionarioManual();
                this.autoDSDrvNomJefe = instance.getFuncionariodrvNomJefe();
                this.autoDSDrvNomAgencia = instance.getFuncionariodrvNomAgencia();
                this.autoDSDisponible = instance.getFuncionarioDisponible();
                this.autoDSNumSolNoTerminadas = instance.getFuncionarioNumSolNoTerminadas();
                this.autoDSDrvEsAsesorIntegral = instance.getFuncionariodrvEsAsesorIntegral();
                this.autoDSDrvEsAfiliacion = instance.getFuncionariodrvEsAfiliacion();
                this.autoDSIdSesion = instance.getFuncionarioIdSesion();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getAutoDSUsuario() {
        return this.autoDSUsuario;
    }
    
    public void setAutoDSUsuario(String autoDSUsuario) {
        this.autoDSUsuario = autoDSUsuario;
    }

    @JsonIgnore
    public String getAutoDSPrimerNombre() {
        return this.autoDSPrimerNombre;
    }
    
    public void setAutoDSPrimerNombre(String autoDSPrimerNombre) {
        this.autoDSPrimerNombre = autoDSPrimerNombre;
    }

    @JsonIgnore
    public String getAutoDSSegundoNombre() {
        return this.autoDSSegundoNombre;
    }
    
    public void setAutoDSSegundoNombre(String autoDSSegundoNombre) {
        this.autoDSSegundoNombre = autoDSSegundoNombre;
    }

    @JsonIgnore
    public String getAutoDSPrimerApellido() {
        return this.autoDSPrimerApellido;
    }
    
    public void setAutoDSPrimerApellido(String autoDSPrimerApellido) {
        this.autoDSPrimerApellido = autoDSPrimerApellido;
    }

    @JsonIgnore
    public String getAutoDSSegundoApellido() {
        return this.autoDSSegundoApellido;
    }
    
    public void setAutoDSSegundoApellido(String autoDSSegundoApellido) {
        this.autoDSSegundoApellido = autoDSSegundoApellido;
    }

    @JsonIgnore
    public String getAutoDSDrvNombreCompleto() {
        return this.autoDSDrvNombreCompleto;
    }
    
    public void setAutoDSDrvNombreCompleto(String autoDSDrvNombreCompleto) {
        this.autoDSDrvNombreCompleto = autoDSDrvNombreCompleto;
    }

    @JsonIgnore
    public String getAutoDSUsuarioLDAP() {
        return this.autoDSUsuarioLDAP;
    }
    
    public void setAutoDSUsuarioLDAP(String autoDSUsuarioLDAP) {
        this.autoDSUsuarioLDAP = autoDSUsuarioLDAP;
    }

    @JsonIgnore
    public String getAutoDSEmail() {
        return this.autoDSEmail;
    }
    
    public void setAutoDSEmail(String autoDSEmail) {
        this.autoDSEmail = autoDSEmail;
    }

    @JsonIgnore
    public String getAutoDSCodJefe() {
        return this.autoDSCodJefe;
    }
    
    public void setAutoDSCodJefe(String autoDSCodJefe) {
        this.autoDSCodJefe = autoDSCodJefe;
    }

    @JsonIgnore
    public Long getAutoDSId() {
        return this.autoDSId;
    }
    
    public void setAutoDSId(Long autoDSId) {
        this.autoDSId = autoDSId;
    }

    @JsonIgnore
    public Boolean getAutoDSManual() {
        return this.autoDSManual;
    }
    
    public void setAutoDSManual(Boolean autoDSManual) {
        this.autoDSManual = autoDSManual;
    }

    @JsonIgnore
    public String getAutoDSDrvNomJefe() {
        return this.autoDSDrvNomJefe;
    }
    
    public void setAutoDSDrvNomJefe(String autoDSDrvNomJefe) {
        this.autoDSDrvNomJefe = autoDSDrvNomJefe;
    }

    @JsonIgnore
    public String getAutoDSDrvNomAgencia() {
        return this.autoDSDrvNomAgencia;
    }
    
    public void setAutoDSDrvNomAgencia(String autoDSDrvNomAgencia) {
        this.autoDSDrvNomAgencia = autoDSDrvNomAgencia;
    }

    @JsonIgnore
    public Boolean getAutoDSDisponible() {
        return this.autoDSDisponible;
    }
    
    public void setAutoDSDisponible(Boolean autoDSDisponible) {
        this.autoDSDisponible = autoDSDisponible;
    }

    @JsonIgnore
    public Long getAutoDSNumSolNoTerminadas() {
        return this.autoDSNumSolNoTerminadas;
    }
    
    public void setAutoDSNumSolNoTerminadas(Long autoDSNumSolNoTerminadas) {
        this.autoDSNumSolNoTerminadas = autoDSNumSolNoTerminadas;
    }

    @JsonIgnore
    public Boolean getAutoDSDrvEsAsesorIntegral() {
        return this.autoDSDrvEsAsesorIntegral;
    }
    
    public void setAutoDSDrvEsAsesorIntegral(Boolean autoDSDrvEsAsesorIntegral) {
        this.autoDSDrvEsAsesorIntegral = autoDSDrvEsAsesorIntegral;
    }

    @JsonIgnore
    public Boolean getAutoDSDrvEsAfiliacion() {
        return this.autoDSDrvEsAfiliacion;
    }
    
    public void setAutoDSDrvEsAfiliacion(Boolean autoDSDrvEsAfiliacion) {
        this.autoDSDrvEsAfiliacion = autoDSDrvEsAfiliacion;
    }

    @JsonIgnore
    public String getAutoDSIdSesion() {
        return this.autoDSIdSesion;
    }
    
    public void setAutoDSIdSesion(String autoDSIdSesion) {
        this.autoDSIdSesion = autoDSIdSesion;
    }
}
