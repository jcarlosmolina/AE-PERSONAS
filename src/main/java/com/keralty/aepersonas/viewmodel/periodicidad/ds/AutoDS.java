package com.keralty.aepersonas.viewmodel.periodicidad.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Periodicidad;
public class AutoDS {

    @JsonProperty("codigo")
    private Long autoDSCodigo;

    @JsonProperty("descripcion")
    private String autoDSDescripcion;

    @JsonProperty("esmensual")
    private Boolean autoDSEsMensual;

    @JsonProperty("drvnumpagos")
    private Long autoDSDrvNumPagos;

    public AutoDS() {
    
    }

    public AutoDS(Periodicidad instance) {
        if (instance != null) {
            try {
                this.autoDSCodigo = instance.getPeriodicidadCodigo();
                this.autoDSDescripcion = instance.getPeriodicidadDescripcion();
                this.autoDSEsMensual = instance.getPeriodicidadEsMensual();
                this.autoDSDrvNumPagos = instance.getPeriodicidaddrvNumPagos();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
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
    public Boolean getAutoDSEsMensual() {
        return this.autoDSEsMensual;
    }
    
    public void setAutoDSEsMensual(Boolean autoDSEsMensual) {
        this.autoDSEsMensual = autoDSEsMensual;
    }

    @JsonIgnore
    public Long getAutoDSDrvNumPagos() {
        return this.autoDSDrvNumPagos;
    }
    
    public void setAutoDSDrvNumPagos(Long autoDSDrvNumPagos) {
        this.autoDSDrvNumPagos = autoDSDrvNumPagos;
    }
}
