package com.keralty.aepersonas.viewmodel.eps.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Eps;
public class AutoDS {

    @JsonProperty("codigo")
    private Long autoDSCodigo;

    @JsonProperty("descripcion")
    private String autoDSDescripcion;

    @JsonProperty("epssanitas")
    private Boolean autoDSEpsSanitas;

    public AutoDS() {
    
    }

    public AutoDS(Eps instance) {
        if (instance != null) {
            this.autoDSCodigo = instance.getEpsCodigo();
            this.autoDSDescripcion = instance.getEpsDescripcion();
            this.autoDSEpsSanitas = instance.getEpsEpsSanitas();
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
    public Boolean getAutoDSEpsSanitas() {
        return this.autoDSEpsSanitas;
    }
    
    public void setAutoDSEpsSanitas(Boolean autoDSEpsSanitas) {
        this.autoDSEpsSanitas = autoDSEpsSanitas;
    }
}
