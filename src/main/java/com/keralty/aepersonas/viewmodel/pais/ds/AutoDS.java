package com.keralty.aepersonas.viewmodel.pais.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Pais;
public class AutoDS {

    @JsonProperty("codigo")
    private String autoDSCodigo;

    @JsonProperty("descripcion")
    private String autoDSDescripcion;

    public AutoDS() {
    
    }

    public AutoDS(Pais instance) {
        if (instance != null) {
            this.autoDSCodigo = instance.getPaisCodigo();
            this.autoDSDescripcion = instance.getPaisDescripcion();
        }
    }

    @JsonIgnore
    public String getAutoDSCodigo() {
        return this.autoDSCodigo;
    }
    
    public void setAutoDSCodigo(String autoDSCodigo) {
        this.autoDSCodigo = autoDSCodigo;
    }

    @JsonIgnore
    public String getAutoDSDescripcion() {
        return this.autoDSDescripcion;
    }
    
    public void setAutoDSDescripcion(String autoDSDescripcion) {
        this.autoDSDescripcion = autoDSDescripcion;
    }
}
