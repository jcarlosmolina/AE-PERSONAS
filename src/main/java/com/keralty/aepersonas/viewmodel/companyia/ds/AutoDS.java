package com.keralty.aepersonas.viewmodel.companyia.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Companyia;
public class AutoDS {

    @JsonProperty("codigo")
    private Long autoDSCodigo;

    @JsonProperty("nombre")
    private String autoDSNombre;

    @JsonProperty("esdemp")
    private Boolean autoDSEsDeMP;

    public AutoDS() {
    
    }

    public AutoDS(Companyia instance) {
        if (instance != null) {
            this.autoDSCodigo = instance.getCompanyiaCodigo();
            this.autoDSNombre = instance.getCompanyiaNombre();
            this.autoDSEsDeMP = instance.getCompanyiaEsDeMP();
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
    public String getAutoDSNombre() {
        return this.autoDSNombre;
    }
    
    public void setAutoDSNombre(String autoDSNombre) {
        this.autoDSNombre = autoDSNombre;
    }

    @JsonIgnore
    public Boolean getAutoDSEsDeMP() {
        return this.autoDSEsDeMP;
    }
    
    public void setAutoDSEsDeMP(Boolean autoDSEsDeMP) {
        this.autoDSEsDeMP = autoDSEsDeMP;
    }
}
