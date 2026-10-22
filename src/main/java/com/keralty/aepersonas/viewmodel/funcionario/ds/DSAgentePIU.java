package com.keralty.aepersonas.viewmodel.funcionario.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Funcionario;
import com.keralty.aepersonas.persistence.Admin;
import com.keralty.aepersonas.persistence.SuperAdmin;
import com.keralty.aepersonas.persistence.Asesor;
import com.keralty.aepersonas.persistence.AreaMedica;
import com.keralty.aepersonas.persistence.Afiliaciones;
import com.keralty.aepersonas.persistence.RespRegional;
import com.keralty.aepersonas.persistence.Gestor;
import com.keralty.aepersonas.persistence.MesaDeApoyo;
public class DSAgentePIU {

    @JsonProperty("usuario")
    private String dSAgentePIUUsuario;

    @JsonProperty("rol_nombre")
    private String dSAgentePIURolDotNombre;

    @JsonProperty("primernombre")
    private String dSAgentePIUPrimerNombre;

    @JsonProperty("segundonombre")
    private String dSAgentePIUSegundoNombre;

    @JsonProperty("primerapellido")
    private String dSAgentePIUPrimerApellido;

    @JsonProperty("segundoapellido")
    private String dSAgentePIUSegundoApellido;

    @JsonProperty("disponible")
    private Boolean dSAgentePIUDisponible;

    @JsonProperty("usuarioldap")
    private String dSAgentePIUUsuarioLDAP;

    @JsonProperty("email")
    private String dSAgentePIUEmail;

    @JsonProperty("sucursal_descripcion")
    private String dSAgentePIUSucursalDotDescripcion;

    public DSAgentePIU() {
    
    }

    public DSAgentePIU(Funcionario instance) {
        if (instance != null) {
            try {
                this.dSAgentePIUUsuario = instance.getFuncionarioUsuario();
                this.dSAgentePIURolDotNombre = instance.getRol().getRolNombre();
                this.dSAgentePIUPrimerNombre = instance.getFuncionarioPrimerNombre();
                this.dSAgentePIUSegundoNombre = instance.getFuncionarioSegundoNombre();
                this.dSAgentePIUPrimerApellido = instance.getFuncionarioPrimerApellido();
                this.dSAgentePIUSegundoApellido = instance.getFuncionarioSegundoApellido();
                this.dSAgentePIUDisponible = instance.getFuncionarioDisponible();
                this.dSAgentePIUUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
                this.dSAgentePIUEmail = instance.getFuncionarioEmail();
                this.dSAgentePIUSucursalDotDescripcion = instance.getSucursal().getSucursalDescripcion();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    public DSAgentePIU(Admin instance) {
        if (instance != null) {
            try {
                this.dSAgentePIUUsuario = instance.getFuncionarioUsuario();
                this.dSAgentePIURolDotNombre = instance.getRol().getRolNombre();
                this.dSAgentePIUPrimerNombre = instance.getFuncionarioPrimerNombre();
                this.dSAgentePIUSegundoNombre = instance.getFuncionarioSegundoNombre();
                this.dSAgentePIUPrimerApellido = instance.getFuncionarioPrimerApellido();
                this.dSAgentePIUSegundoApellido = instance.getFuncionarioSegundoApellido();
                this.dSAgentePIUDisponible = instance.getFuncionarioDisponible();
                this.dSAgentePIUUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
                this.dSAgentePIUEmail = instance.getFuncionarioEmail();
                this.dSAgentePIUSucursalDotDescripcion = instance.getSucursal().getSucursalDescripcion();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    public DSAgentePIU(SuperAdmin instance) {
        if (instance != null) {
            try {
                this.dSAgentePIUUsuario = instance.getFuncionarioUsuario();
                this.dSAgentePIURolDotNombre = instance.getRol().getRolNombre();
                this.dSAgentePIUPrimerNombre = instance.getFuncionarioPrimerNombre();
                this.dSAgentePIUSegundoNombre = instance.getFuncionarioSegundoNombre();
                this.dSAgentePIUPrimerApellido = instance.getFuncionarioPrimerApellido();
                this.dSAgentePIUSegundoApellido = instance.getFuncionarioSegundoApellido();
                this.dSAgentePIUDisponible = instance.getFuncionarioDisponible();
                this.dSAgentePIUUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
                this.dSAgentePIUEmail = instance.getFuncionarioEmail();
                this.dSAgentePIUSucursalDotDescripcion = instance.getSucursal().getSucursalDescripcion();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    public DSAgentePIU(Asesor instance) {
        if (instance != null) {
            try {
                this.dSAgentePIUUsuario = instance.getFuncionarioUsuario();
                this.dSAgentePIURolDotNombre = instance.getRol().getRolNombre();
                this.dSAgentePIUPrimerNombre = instance.getFuncionarioPrimerNombre();
                this.dSAgentePIUSegundoNombre = instance.getFuncionarioSegundoNombre();
                this.dSAgentePIUPrimerApellido = instance.getFuncionarioPrimerApellido();
                this.dSAgentePIUSegundoApellido = instance.getFuncionarioSegundoApellido();
                this.dSAgentePIUDisponible = instance.getFuncionarioDisponible();
                this.dSAgentePIUUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
                this.dSAgentePIUEmail = instance.getFuncionarioEmail();
                this.dSAgentePIUSucursalDotDescripcion = instance.getSucursal().getSucursalDescripcion();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    public DSAgentePIU(AreaMedica instance) {
        if (instance != null) {
            try {
                this.dSAgentePIUUsuario = instance.getFuncionarioUsuario();
                this.dSAgentePIURolDotNombre = instance.getRol().getRolNombre();
                this.dSAgentePIUPrimerNombre = instance.getFuncionarioPrimerNombre();
                this.dSAgentePIUSegundoNombre = instance.getFuncionarioSegundoNombre();
                this.dSAgentePIUPrimerApellido = instance.getFuncionarioPrimerApellido();
                this.dSAgentePIUSegundoApellido = instance.getFuncionarioSegundoApellido();
                this.dSAgentePIUDisponible = instance.getFuncionarioDisponible();
                this.dSAgentePIUUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
                this.dSAgentePIUEmail = instance.getFuncionarioEmail();
                this.dSAgentePIUSucursalDotDescripcion = instance.getSucursal().getSucursalDescripcion();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    public DSAgentePIU(Afiliaciones instance) {
        if (instance != null) {
            try {
                this.dSAgentePIUUsuario = instance.getFuncionarioUsuario();
                this.dSAgentePIURolDotNombre = instance.getRol().getRolNombre();
                this.dSAgentePIUPrimerNombre = instance.getFuncionarioPrimerNombre();
                this.dSAgentePIUSegundoNombre = instance.getFuncionarioSegundoNombre();
                this.dSAgentePIUPrimerApellido = instance.getFuncionarioPrimerApellido();
                this.dSAgentePIUSegundoApellido = instance.getFuncionarioSegundoApellido();
                this.dSAgentePIUDisponible = instance.getFuncionarioDisponible();
                this.dSAgentePIUUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
                this.dSAgentePIUEmail = instance.getFuncionarioEmail();
                this.dSAgentePIUSucursalDotDescripcion = instance.getSucursal().getSucursalDescripcion();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    public DSAgentePIU(RespRegional instance) {
        if (instance != null) {
            try {
                this.dSAgentePIUUsuario = instance.getFuncionarioUsuario();
                this.dSAgentePIURolDotNombre = instance.getRol().getRolNombre();
                this.dSAgentePIUPrimerNombre = instance.getFuncionarioPrimerNombre();
                this.dSAgentePIUSegundoNombre = instance.getFuncionarioSegundoNombre();
                this.dSAgentePIUPrimerApellido = instance.getFuncionarioPrimerApellido();
                this.dSAgentePIUSegundoApellido = instance.getFuncionarioSegundoApellido();
                this.dSAgentePIUDisponible = instance.getFuncionarioDisponible();
                this.dSAgentePIUUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
                this.dSAgentePIUEmail = instance.getFuncionarioEmail();
                this.dSAgentePIUSucursalDotDescripcion = instance.getSucursal().getSucursalDescripcion();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    public DSAgentePIU(Gestor instance) {
        if (instance != null) {
            try {
                this.dSAgentePIUUsuario = instance.getFuncionarioUsuario();
                this.dSAgentePIURolDotNombre = instance.getRol().getRolNombre();
                this.dSAgentePIUPrimerNombre = instance.getFuncionarioPrimerNombre();
                this.dSAgentePIUSegundoNombre = instance.getFuncionarioSegundoNombre();
                this.dSAgentePIUPrimerApellido = instance.getFuncionarioPrimerApellido();
                this.dSAgentePIUSegundoApellido = instance.getFuncionarioSegundoApellido();
                this.dSAgentePIUDisponible = instance.getFuncionarioDisponible();
                this.dSAgentePIUUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
                this.dSAgentePIUEmail = instance.getFuncionarioEmail();
                this.dSAgentePIUSucursalDotDescripcion = instance.getSucursal().getSucursalDescripcion();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    public DSAgentePIU(MesaDeApoyo instance) {
        if (instance != null) {
            try {
                this.dSAgentePIUUsuario = instance.getFuncionarioUsuario();
                this.dSAgentePIURolDotNombre = instance.getRol().getRolNombre();
                this.dSAgentePIUPrimerNombre = instance.getFuncionarioPrimerNombre();
                this.dSAgentePIUSegundoNombre = instance.getFuncionarioSegundoNombre();
                this.dSAgentePIUPrimerApellido = instance.getFuncionarioPrimerApellido();
                this.dSAgentePIUSegundoApellido = instance.getFuncionarioSegundoApellido();
                this.dSAgentePIUDisponible = instance.getFuncionarioDisponible();
                this.dSAgentePIUUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
                this.dSAgentePIUEmail = instance.getFuncionarioEmail();
                this.dSAgentePIUSucursalDotDescripcion = instance.getSucursal().getSucursalDescripcion();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getDSAgentePIUUsuario() {
        return this.dSAgentePIUUsuario;
    }
    
    public void setDSAgentePIUUsuario(String dSAgentePIUUsuario) {
        this.dSAgentePIUUsuario = dSAgentePIUUsuario;
    }

    @JsonIgnore
    public String getDSAgentePIURolDotNombre() {
        return this.dSAgentePIURolDotNombre;
    }
    
    public void setDSAgentePIURolDotNombre(String dSAgentePIURolDotNombre) {
        this.dSAgentePIURolDotNombre = dSAgentePIURolDotNombre;
    }

    @JsonIgnore
    public String getDSAgentePIUPrimerNombre() {
        return this.dSAgentePIUPrimerNombre;
    }
    
    public void setDSAgentePIUPrimerNombre(String dSAgentePIUPrimerNombre) {
        this.dSAgentePIUPrimerNombre = dSAgentePIUPrimerNombre;
    }

    @JsonIgnore
    public String getDSAgentePIUSegundoNombre() {
        return this.dSAgentePIUSegundoNombre;
    }
    
    public void setDSAgentePIUSegundoNombre(String dSAgentePIUSegundoNombre) {
        this.dSAgentePIUSegundoNombre = dSAgentePIUSegundoNombre;
    }

    @JsonIgnore
    public String getDSAgentePIUPrimerApellido() {
        return this.dSAgentePIUPrimerApellido;
    }
    
    public void setDSAgentePIUPrimerApellido(String dSAgentePIUPrimerApellido) {
        this.dSAgentePIUPrimerApellido = dSAgentePIUPrimerApellido;
    }

    @JsonIgnore
    public String getDSAgentePIUSegundoApellido() {
        return this.dSAgentePIUSegundoApellido;
    }
    
    public void setDSAgentePIUSegundoApellido(String dSAgentePIUSegundoApellido) {
        this.dSAgentePIUSegundoApellido = dSAgentePIUSegundoApellido;
    }

    @JsonIgnore
    public Boolean getDSAgentePIUDisponible() {
        return this.dSAgentePIUDisponible;
    }
    
    public void setDSAgentePIUDisponible(Boolean dSAgentePIUDisponible) {
        this.dSAgentePIUDisponible = dSAgentePIUDisponible;
    }

    @JsonIgnore
    public String getDSAgentePIUUsuarioLDAP() {
        return this.dSAgentePIUUsuarioLDAP;
    }
    
    public void setDSAgentePIUUsuarioLDAP(String dSAgentePIUUsuarioLDAP) {
        this.dSAgentePIUUsuarioLDAP = dSAgentePIUUsuarioLDAP;
    }

    @JsonIgnore
    public String getDSAgentePIUEmail() {
        return this.dSAgentePIUEmail;
    }
    
    public void setDSAgentePIUEmail(String dSAgentePIUEmail) {
        this.dSAgentePIUEmail = dSAgentePIUEmail;
    }

    @JsonIgnore
    public String getDSAgentePIUSucursalDotDescripcion() {
        return this.dSAgentePIUSucursalDotDescripcion;
    }
    
    public void setDSAgentePIUSucursalDotDescripcion(String dSAgentePIUSucursalDotDescripcion) {
        this.dSAgentePIUSucursalDotDescripcion = dSAgentePIUSucursalDotDescripcion;
    }
}
