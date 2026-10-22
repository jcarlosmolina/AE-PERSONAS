package com.keralty.aepersonas.viewmodel.mesadeapoyo.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.MesaDeApoyo;
public class DSMesaDeApoyo {

    @JsonProperty("usuarioldap")
    private String dSMesaDeApoyoUsuarioLDAP;

    @JsonProperty("drvnombrecompleto")
    private String dSMesaDeApoyoDrvNombreCompleto;

    @JsonProperty("email")
    private String dSMesaDeApoyoEmail;

    public DSMesaDeApoyo() {
    
    }

    public DSMesaDeApoyo(MesaDeApoyo instance) {
        if (instance != null) {
            try {
                this.dSMesaDeApoyoUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
                this.dSMesaDeApoyoDrvNombreCompleto = instance.getFuncionariodrvNombreCompleto();
                this.dSMesaDeApoyoEmail = instance.getFuncionarioEmail();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getDSMesaDeApoyoUsuarioLDAP() {
        return this.dSMesaDeApoyoUsuarioLDAP;
    }
    
    public void setDSMesaDeApoyoUsuarioLDAP(String dSMesaDeApoyoUsuarioLDAP) {
        this.dSMesaDeApoyoUsuarioLDAP = dSMesaDeApoyoUsuarioLDAP;
    }

    @JsonIgnore
    public String getDSMesaDeApoyoDrvNombreCompleto() {
        return this.dSMesaDeApoyoDrvNombreCompleto;
    }
    
    public void setDSMesaDeApoyoDrvNombreCompleto(String dSMesaDeApoyoDrvNombreCompleto) {
        this.dSMesaDeApoyoDrvNombreCompleto = dSMesaDeApoyoDrvNombreCompleto;
    }

    @JsonIgnore
    public String getDSMesaDeApoyoEmail() {
        return this.dSMesaDeApoyoEmail;
    }
    
    public void setDSMesaDeApoyoEmail(String dSMesaDeApoyoEmail) {
        this.dSMesaDeApoyoEmail = dSMesaDeApoyoEmail;
    }
}
