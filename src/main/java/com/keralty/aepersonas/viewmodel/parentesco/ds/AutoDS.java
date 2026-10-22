package com.keralty.aepersonas.viewmodel.parentesco.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Parentesco;
public class AutoDS {

    @JsonProperty("codigo")
    private Long autoDSCodigo;

    @JsonProperty("descripcion")
    private String autoDSDescripcion;

    @JsonProperty("estitular")
    private Boolean autoDSEsTitular;

    @JsonProperty("esconyuge")
    private Boolean autoDSEsConyuge;

    @JsonProperty("espadre")
    private Boolean autoDSEsPadre;

    @JsonProperty("eshijo")
    private Boolean autoDSEsHijo;

    @JsonProperty("nombrecorto")
    private String autoDSNombreCorto;

    public AutoDS() {
    
    }

    public AutoDS(Parentesco instance) {
        if (instance != null) {
            this.autoDSCodigo = instance.getParentescoCodigo();
            this.autoDSDescripcion = instance.getParentescoDescripcion();
            this.autoDSEsTitular = instance.getParentescoEsTitular();
            this.autoDSEsConyuge = instance.getParentescoEsConyuge();
            this.autoDSEsPadre = instance.getParentescoEsPadre();
            this.autoDSEsHijo = instance.getParentescoEsHijo();
            this.autoDSNombreCorto = instance.getParentescoNombreCorto();
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
    public Boolean getAutoDSEsTitular() {
        return this.autoDSEsTitular;
    }
    
    public void setAutoDSEsTitular(Boolean autoDSEsTitular) {
        this.autoDSEsTitular = autoDSEsTitular;
    }

    @JsonIgnore
    public Boolean getAutoDSEsConyuge() {
        return this.autoDSEsConyuge;
    }
    
    public void setAutoDSEsConyuge(Boolean autoDSEsConyuge) {
        this.autoDSEsConyuge = autoDSEsConyuge;
    }

    @JsonIgnore
    public Boolean getAutoDSEsPadre() {
        return this.autoDSEsPadre;
    }
    
    public void setAutoDSEsPadre(Boolean autoDSEsPadre) {
        this.autoDSEsPadre = autoDSEsPadre;
    }

    @JsonIgnore
    public Boolean getAutoDSEsHijo() {
        return this.autoDSEsHijo;
    }
    
    public void setAutoDSEsHijo(Boolean autoDSEsHijo) {
        this.autoDSEsHijo = autoDSEsHijo;
    }

    @JsonIgnore
    public String getAutoDSNombreCorto() {
        return this.autoDSNombreCorto;
    }
    
    public void setAutoDSNombreCorto(String autoDSNombreCorto) {
        this.autoDSNombreCorto = autoDSNombreCorto;
    }
}
