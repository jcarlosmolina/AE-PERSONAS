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
public class DSFuncionarioDGrupo {

    @JsonProperty("rol_nombre")
    private String dSFuncionarioDGrupoRolDotNombre;

    @JsonProperty("drvnombrecompleto")
    private String dSFuncionarioDGrupoDrvNombreCompleto;

    @JsonProperty("usuarioldap")
    private String dSFuncionarioDGrupoUsuarioLDAP;

    public DSFuncionarioDGrupo() {
    
    }

    public DSFuncionarioDGrupo(Funcionario instance) {
        if (instance != null) {
            try {
                this.dSFuncionarioDGrupoRolDotNombre = instance.getRol().getRolNombre();
                this.dSFuncionarioDGrupoDrvNombreCompleto = instance.getFuncionariodrvNombreCompleto();
                this.dSFuncionarioDGrupoUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    public DSFuncionarioDGrupo(Admin instance) {
        if (instance != null) {
            try {
                this.dSFuncionarioDGrupoRolDotNombre = instance.getRol().getRolNombre();
                this.dSFuncionarioDGrupoDrvNombreCompleto = instance.getFuncionariodrvNombreCompleto();
                this.dSFuncionarioDGrupoUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    public DSFuncionarioDGrupo(SuperAdmin instance) {
        if (instance != null) {
            try {
                this.dSFuncionarioDGrupoRolDotNombre = instance.getRol().getRolNombre();
                this.dSFuncionarioDGrupoDrvNombreCompleto = instance.getFuncionariodrvNombreCompleto();
                this.dSFuncionarioDGrupoUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    public DSFuncionarioDGrupo(Asesor instance) {
        if (instance != null) {
            try {
                this.dSFuncionarioDGrupoRolDotNombre = instance.getRol().getRolNombre();
                this.dSFuncionarioDGrupoDrvNombreCompleto = instance.getFuncionariodrvNombreCompleto();
                this.dSFuncionarioDGrupoUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    public DSFuncionarioDGrupo(AreaMedica instance) {
        if (instance != null) {
            try {
                this.dSFuncionarioDGrupoRolDotNombre = instance.getRol().getRolNombre();
                this.dSFuncionarioDGrupoDrvNombreCompleto = instance.getFuncionariodrvNombreCompleto();
                this.dSFuncionarioDGrupoUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    public DSFuncionarioDGrupo(Afiliaciones instance) {
        if (instance != null) {
            try {
                this.dSFuncionarioDGrupoRolDotNombre = instance.getRol().getRolNombre();
                this.dSFuncionarioDGrupoDrvNombreCompleto = instance.getFuncionariodrvNombreCompleto();
                this.dSFuncionarioDGrupoUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    public DSFuncionarioDGrupo(RespRegional instance) {
        if (instance != null) {
            try {
                this.dSFuncionarioDGrupoRolDotNombre = instance.getRol().getRolNombre();
                this.dSFuncionarioDGrupoDrvNombreCompleto = instance.getFuncionariodrvNombreCompleto();
                this.dSFuncionarioDGrupoUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    public DSFuncionarioDGrupo(Gestor instance) {
        if (instance != null) {
            try {
                this.dSFuncionarioDGrupoRolDotNombre = instance.getRol().getRolNombre();
                this.dSFuncionarioDGrupoDrvNombreCompleto = instance.getFuncionariodrvNombreCompleto();
                this.dSFuncionarioDGrupoUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    public DSFuncionarioDGrupo(MesaDeApoyo instance) {
        if (instance != null) {
            try {
                this.dSFuncionarioDGrupoRolDotNombre = instance.getRol().getRolNombre();
                this.dSFuncionarioDGrupoDrvNombreCompleto = instance.getFuncionariodrvNombreCompleto();
                this.dSFuncionarioDGrupoUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getDSFuncionarioDGrupoRolDotNombre() {
        return this.dSFuncionarioDGrupoRolDotNombre;
    }
    
    public void setDSFuncionarioDGrupoRolDotNombre(String dSFuncionarioDGrupoRolDotNombre) {
        this.dSFuncionarioDGrupoRolDotNombre = dSFuncionarioDGrupoRolDotNombre;
    }

    @JsonIgnore
    public String getDSFuncionarioDGrupoDrvNombreCompleto() {
        return this.dSFuncionarioDGrupoDrvNombreCompleto;
    }
    
    public void setDSFuncionarioDGrupoDrvNombreCompleto(String dSFuncionarioDGrupoDrvNombreCompleto) {
        this.dSFuncionarioDGrupoDrvNombreCompleto = dSFuncionarioDGrupoDrvNombreCompleto;
    }

    @JsonIgnore
    public String getDSFuncionarioDGrupoUsuarioLDAP() {
        return this.dSFuncionarioDGrupoUsuarioLDAP;
    }
    
    public void setDSFuncionarioDGrupoUsuarioLDAP(String dSFuncionarioDGrupoUsuarioLDAP) {
        this.dSFuncionarioDGrupoUsuarioLDAP = dSFuncionarioDGrupoUsuarioLDAP;
    }
}
