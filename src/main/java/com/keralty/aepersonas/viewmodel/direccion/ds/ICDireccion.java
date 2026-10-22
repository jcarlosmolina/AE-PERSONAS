package com.keralty.aepersonas.viewmodel.direccion.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Direccion;
public class ICDireccion {

    @JsonProperty("direccioncompleta")
    private String iCDireccionDireccionCompleta;

    @JsonProperty("tipodireccion_descripcion")
    private String iCDireccionTipoDireccionDotDescripcion;

    public ICDireccion() {
    
    }

    public ICDireccion(Direccion instance) {
        if (instance != null) {
            try {
                this.iCDireccionDireccionCompleta = instance.getDireccionDireccionCompleta();
                this.iCDireccionTipoDireccionDotDescripcion = instance.getTipoDireccion().getTipoDireccionDescripcion();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getICDireccionDireccionCompleta() {
        return this.iCDireccionDireccionCompleta;
    }
    
    public void setICDireccionDireccionCompleta(String iCDireccionDireccionCompleta) {
        this.iCDireccionDireccionCompleta = iCDireccionDireccionCompleta;
    }

    @JsonIgnore
    public String getICDireccionTipoDireccionDotDescripcion() {
        return this.iCDireccionTipoDireccionDotDescripcion;
    }
    
    public void setICDireccionTipoDireccionDotDescripcion(String iCDireccionTipoDireccionDotDescripcion) {
        this.iCDireccionTipoDireccionDotDescripcion = iCDireccionTipoDireccionDotDescripcion;
    }
}
