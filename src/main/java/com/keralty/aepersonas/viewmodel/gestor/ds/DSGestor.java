package com.keralty.aepersonas.viewmodel.gestor.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Gestor;
public class DSGestor {

    @JsonProperty("usuarioldap")
    private String dSGestorUsuarioLDAP;

    @JsonProperty("drvnombrecompleto")
    private String dSGestorDrvNombreCompleto;

    @JsonProperty("email")
    private String dSGestorEmail;

    public DSGestor() {
    
    }

    public DSGestor(Gestor instance) {
        if (instance != null) {
            try {
                this.dSGestorUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
                this.dSGestorDrvNombreCompleto = instance.getFuncionariodrvNombreCompleto();
                this.dSGestorEmail = instance.getFuncionarioEmail();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getDSGestorUsuarioLDAP() {
        return this.dSGestorUsuarioLDAP;
    }
    
    public void setDSGestorUsuarioLDAP(String dSGestorUsuarioLDAP) {
        this.dSGestorUsuarioLDAP = dSGestorUsuarioLDAP;
    }

    @JsonIgnore
    public String getDSGestorDrvNombreCompleto() {
        return this.dSGestorDrvNombreCompleto;
    }
    
    public void setDSGestorDrvNombreCompleto(String dSGestorDrvNombreCompleto) {
        this.dSGestorDrvNombreCompleto = dSGestorDrvNombreCompleto;
    }

    @JsonIgnore
    public String getDSGestorEmail() {
        return this.dSGestorEmail;
    }
    
    public void setDSGestorEmail(String dSGestorEmail) {
        this.dSGestorEmail = dSGestorEmail;
    }
}
