package com.keralty.aepersonas.viewmodel.tipodireccion.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.TipoDireccion;
public class AutoDS {

    @JsonProperty("codigo")
    private Long autoDSCodigo;

    @JsonProperty("descripcion")
    private String autoDSDescripcion;

    @JsonProperty("esresidencia")
    private Boolean autoDSEsResidencia;

    @JsonProperty("escorrespondencia")
    private Boolean autoDSEsCorrespondencia;

    public AutoDS() {
    
    }

    public AutoDS(TipoDireccion instance) {
        if (instance != null) {
            this.autoDSCodigo = instance.getTipoDireccionCodigo();
            this.autoDSDescripcion = instance.getTipoDireccionDescripcion();
            this.autoDSEsResidencia = instance.getTipoDireccionEsResidencia();
            this.autoDSEsCorrespondencia = instance.getTipoDireccionEsCorrespondencia();
        }
    }

    @JsonIgnore
    public Long getAutoDSCodigo() {
        return this.autoDSCodigo;
    }
    
    public void setAutoDSCodigo(Long autoDSCodigo) {
        this.autoDSCodigo = autoDSCodigo;
    }

    @JsonIgnore
    public String getAutoDSDescripcion() {
        return this.autoDSDescripcion;
    }
    
    public void setAutoDSDescripcion(String autoDSDescripcion) {
        this.autoDSDescripcion = autoDSDescripcion;
    }

    @JsonIgnore
    public Boolean getAutoDSEsResidencia() {
        return this.autoDSEsResidencia;
    }
    
    public void setAutoDSEsResidencia(Boolean autoDSEsResidencia) {
        this.autoDSEsResidencia = autoDSEsResidencia;
    }

    @JsonIgnore
    public Boolean getAutoDSEsCorrespondencia() {
        return this.autoDSEsCorrespondencia;
    }
    
    public void setAutoDSEsCorrespondencia(Boolean autoDSEsCorrespondencia) {
        this.autoDSEsCorrespondencia = autoDSEsCorrespondencia;
    }
}
