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
public class DSFuncionarioDReportes {

    @JsonProperty("usuarioldap")
    private String dSFuncionarioDReportesUsuarioLDAP;

    @JsonProperty("primernombre")
    private String dSFuncionarioDReportesPrimerNombre;

    @JsonProperty("segundonombre")
    private String dSFuncionarioDReportesSegundoNombre;

    @JsonProperty("primerapellido")
    private String dSFuncionarioDReportesPrimerApellido;

    @JsonProperty("segundoapellido")
    private String dSFuncionarioDReportesSegundoApellido;

    public DSFuncionarioDReportes() {
    
    }

    public DSFuncionarioDReportes(Funcionario instance) {
        if (instance != null) {
            this.dSFuncionarioDReportesUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
            this.dSFuncionarioDReportesPrimerNombre = instance.getFuncionarioPrimerNombre();
            this.dSFuncionarioDReportesSegundoNombre = instance.getFuncionarioSegundoNombre();
            this.dSFuncionarioDReportesPrimerApellido = instance.getFuncionarioPrimerApellido();
            this.dSFuncionarioDReportesSegundoApellido = instance.getFuncionarioSegundoApellido();
        }
    }

    public DSFuncionarioDReportes(Admin instance) {
        if (instance != null) {
            this.dSFuncionarioDReportesUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
            this.dSFuncionarioDReportesPrimerNombre = instance.getFuncionarioPrimerNombre();
            this.dSFuncionarioDReportesSegundoNombre = instance.getFuncionarioSegundoNombre();
            this.dSFuncionarioDReportesPrimerApellido = instance.getFuncionarioPrimerApellido();
            this.dSFuncionarioDReportesSegundoApellido = instance.getFuncionarioSegundoApellido();
        }
    }

    public DSFuncionarioDReportes(SuperAdmin instance) {
        if (instance != null) {
            this.dSFuncionarioDReportesUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
            this.dSFuncionarioDReportesPrimerNombre = instance.getFuncionarioPrimerNombre();
            this.dSFuncionarioDReportesSegundoNombre = instance.getFuncionarioSegundoNombre();
            this.dSFuncionarioDReportesPrimerApellido = instance.getFuncionarioPrimerApellido();
            this.dSFuncionarioDReportesSegundoApellido = instance.getFuncionarioSegundoApellido();
        }
    }

    public DSFuncionarioDReportes(Asesor instance) {
        if (instance != null) {
            this.dSFuncionarioDReportesUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
            this.dSFuncionarioDReportesPrimerNombre = instance.getFuncionarioPrimerNombre();
            this.dSFuncionarioDReportesSegundoNombre = instance.getFuncionarioSegundoNombre();
            this.dSFuncionarioDReportesPrimerApellido = instance.getFuncionarioPrimerApellido();
            this.dSFuncionarioDReportesSegundoApellido = instance.getFuncionarioSegundoApellido();
        }
    }

    public DSFuncionarioDReportes(AreaMedica instance) {
        if (instance != null) {
            this.dSFuncionarioDReportesUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
            this.dSFuncionarioDReportesPrimerNombre = instance.getFuncionarioPrimerNombre();
            this.dSFuncionarioDReportesSegundoNombre = instance.getFuncionarioSegundoNombre();
            this.dSFuncionarioDReportesPrimerApellido = instance.getFuncionarioPrimerApellido();
            this.dSFuncionarioDReportesSegundoApellido = instance.getFuncionarioSegundoApellido();
        }
    }

    public DSFuncionarioDReportes(Afiliaciones instance) {
        if (instance != null) {
            this.dSFuncionarioDReportesUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
            this.dSFuncionarioDReportesPrimerNombre = instance.getFuncionarioPrimerNombre();
            this.dSFuncionarioDReportesSegundoNombre = instance.getFuncionarioSegundoNombre();
            this.dSFuncionarioDReportesPrimerApellido = instance.getFuncionarioPrimerApellido();
            this.dSFuncionarioDReportesSegundoApellido = instance.getFuncionarioSegundoApellido();
        }
    }

    public DSFuncionarioDReportes(RespRegional instance) {
        if (instance != null) {
            this.dSFuncionarioDReportesUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
            this.dSFuncionarioDReportesPrimerNombre = instance.getFuncionarioPrimerNombre();
            this.dSFuncionarioDReportesSegundoNombre = instance.getFuncionarioSegundoNombre();
            this.dSFuncionarioDReportesPrimerApellido = instance.getFuncionarioPrimerApellido();
            this.dSFuncionarioDReportesSegundoApellido = instance.getFuncionarioSegundoApellido();
        }
    }

    public DSFuncionarioDReportes(Gestor instance) {
        if (instance != null) {
            this.dSFuncionarioDReportesUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
            this.dSFuncionarioDReportesPrimerNombre = instance.getFuncionarioPrimerNombre();
            this.dSFuncionarioDReportesSegundoNombre = instance.getFuncionarioSegundoNombre();
            this.dSFuncionarioDReportesPrimerApellido = instance.getFuncionarioPrimerApellido();
            this.dSFuncionarioDReportesSegundoApellido = instance.getFuncionarioSegundoApellido();
        }
    }

    public DSFuncionarioDReportes(MesaDeApoyo instance) {
        if (instance != null) {
            this.dSFuncionarioDReportesUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
            this.dSFuncionarioDReportesPrimerNombre = instance.getFuncionarioPrimerNombre();
            this.dSFuncionarioDReportesSegundoNombre = instance.getFuncionarioSegundoNombre();
            this.dSFuncionarioDReportesPrimerApellido = instance.getFuncionarioPrimerApellido();
            this.dSFuncionarioDReportesSegundoApellido = instance.getFuncionarioSegundoApellido();
        }
    }

    @JsonIgnore
    public String getDSFuncionarioDReportesUsuarioLDAP() {
        return this.dSFuncionarioDReportesUsuarioLDAP;
    }
    
    public void setDSFuncionarioDReportesUsuarioLDAP(String dSFuncionarioDReportesUsuarioLDAP) {
        this.dSFuncionarioDReportesUsuarioLDAP = dSFuncionarioDReportesUsuarioLDAP;
    }

    @JsonIgnore
    public String getDSFuncionarioDReportesPrimerNombre() {
        return this.dSFuncionarioDReportesPrimerNombre;
    }
    
    public void setDSFuncionarioDReportesPrimerNombre(String dSFuncionarioDReportesPrimerNombre) {
        this.dSFuncionarioDReportesPrimerNombre = dSFuncionarioDReportesPrimerNombre;
    }

    @JsonIgnore
    public String getDSFuncionarioDReportesSegundoNombre() {
        return this.dSFuncionarioDReportesSegundoNombre;
    }
    
    public void setDSFuncionarioDReportesSegundoNombre(String dSFuncionarioDReportesSegundoNombre) {
        this.dSFuncionarioDReportesSegundoNombre = dSFuncionarioDReportesSegundoNombre;
    }

    @JsonIgnore
    public String getDSFuncionarioDReportesPrimerApellido() {
        return this.dSFuncionarioDReportesPrimerApellido;
    }
    
    public void setDSFuncionarioDReportesPrimerApellido(String dSFuncionarioDReportesPrimerApellido) {
        this.dSFuncionarioDReportesPrimerApellido = dSFuncionarioDReportesPrimerApellido;
    }

    @JsonIgnore
    public String getDSFuncionarioDReportesSegundoApellido() {
        return this.dSFuncionarioDReportesSegundoApellido;
    }
    
    public void setDSFuncionarioDReportesSegundoApellido(String dSFuncionarioDReportesSegundoApellido) {
        this.dSFuncionarioDReportesSegundoApellido = dSFuncionarioDReportesSegundoApellido;
    }
}
