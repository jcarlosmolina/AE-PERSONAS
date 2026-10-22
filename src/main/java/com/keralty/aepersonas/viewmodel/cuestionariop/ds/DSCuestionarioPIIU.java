package com.keralty.aepersonas.viewmodel.cuestionariop.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.CuestionarioP;
public class DSCuestionarioPIIU {

    @JsonProperty("usuario_drvnombrecompleto")
    private String dSCuestionarioPIIUUsuarioDotDrvNombreCompleto;

    @JsonProperty("yadiligenciado")
    private Boolean dSCuestionarioPIIUYaDiligenciado;

    public DSCuestionarioPIIU() {
    
    }

    public DSCuestionarioPIIU(CuestionarioP instance) {
        if (instance != null) {
            try {
                this.dSCuestionarioPIIUUsuarioDotDrvNombreCompleto = instance.getUsuario().getUsuariodrvNombreCompleto();
                this.dSCuestionarioPIIUYaDiligenciado = instance.getCuestionarioPYaDiligenciado();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getDSCuestionarioPIIUUsuarioDotDrvNombreCompleto() {
        return this.dSCuestionarioPIIUUsuarioDotDrvNombreCompleto;
    }
    
    public void setDSCuestionarioPIIUUsuarioDotDrvNombreCompleto(String dSCuestionarioPIIUUsuarioDotDrvNombreCompleto) {
        this.dSCuestionarioPIIUUsuarioDotDrvNombreCompleto = dSCuestionarioPIIUUsuarioDotDrvNombreCompleto;
    }

    @JsonIgnore
    public Boolean getDSCuestionarioPIIUYaDiligenciado() {
        return this.dSCuestionarioPIIUYaDiligenciado;
    }
    
    public void setDSCuestionarioPIIUYaDiligenciado(Boolean dSCuestionarioPIIUYaDiligenciado) {
        this.dSCuestionarioPIIUYaDiligenciado = dSCuestionarioPIIUYaDiligenciado;
    }
}
