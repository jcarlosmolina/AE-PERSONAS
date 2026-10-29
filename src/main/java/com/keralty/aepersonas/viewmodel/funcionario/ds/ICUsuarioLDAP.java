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
public class ICUsuarioLDAP {

    @JsonProperty("usuarioldap")
    private String iCUsuarioLDAPUsuarioLDAP;

    public ICUsuarioLDAP() {
    
    }

    public ICUsuarioLDAP(Funcionario instance) {
        if (instance != null) {
            this.iCUsuarioLDAPUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
        }
    }

    public ICUsuarioLDAP(Admin instance) {
        if (instance != null) {
            this.iCUsuarioLDAPUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
        }
    }

    public ICUsuarioLDAP(SuperAdmin instance) {
        if (instance != null) {
            this.iCUsuarioLDAPUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
        }
    }

    public ICUsuarioLDAP(Asesor instance) {
        if (instance != null) {
            this.iCUsuarioLDAPUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
        }
    }

    public ICUsuarioLDAP(AreaMedica instance) {
        if (instance != null) {
            this.iCUsuarioLDAPUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
        }
    }

    public ICUsuarioLDAP(Afiliaciones instance) {
        if (instance != null) {
            this.iCUsuarioLDAPUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
        }
    }

    public ICUsuarioLDAP(RespRegional instance) {
        if (instance != null) {
            this.iCUsuarioLDAPUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
        }
    }

    public ICUsuarioLDAP(Gestor instance) {
        if (instance != null) {
            this.iCUsuarioLDAPUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
        }
    }

    public ICUsuarioLDAP(MesaDeApoyo instance) {
        if (instance != null) {
            this.iCUsuarioLDAPUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
        }
    }

    @JsonIgnore
    public String getICUsuarioLDAPUsuarioLDAP() {
        return this.iCUsuarioLDAPUsuarioLDAP;
    }
    
    public void setICUsuarioLDAPUsuarioLDAP(String iCUsuarioLDAPUsuarioLDAP) {
        this.iCUsuarioLDAPUsuarioLDAP = iCUsuarioLDAPUsuarioLDAP;
    }
}
