package com.keralty.aepersonas.viewmodel.asesor.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Asesor;
public class DSAsesorIIU {

    @JsonProperty("drvnombrecompleto")
    private String dSAsesorIIUDrvNombreCompleto;

    public DSAsesorIIU() {
    
    }

    public DSAsesorIIU(Asesor instance) {
        if (instance != null) {
            try {
                this.dSAsesorIIUDrvNombreCompleto = instance.getFuncionariodrvNombreCompleto();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getDSAsesorIIUDrvNombreCompleto() {
        return this.dSAsesorIIUDrvNombreCompleto;
    }
    
    public void setDSAsesorIIUDrvNombreCompleto(String dSAsesorIIUDrvNombreCompleto) {
        this.dSAsesorIIUDrvNombreCompleto = dSAsesorIIUDrvNombreCompleto;
    }
}
