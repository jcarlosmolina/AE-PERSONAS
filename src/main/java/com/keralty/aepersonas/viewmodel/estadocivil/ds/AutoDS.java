package com.keralty.aepersonas.viewmodel.estadocivil.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.EstadoCivil;
public class AutoDS {

    @JsonProperty("codigo")
    private Long autoDSCodigo;

    @JsonProperty("descripcion")
    private String autoDSDescripcion;

    @JsonProperty("nombrecorto")
    private String autoDSNombreCorto;

    public AutoDS() {
    
    }

    public AutoDS(EstadoCivil instance) {
        if (instance != null) {
            this.autoDSCodigo = instance.getEstadoCivilCodigo();
            this.autoDSDescripcion = instance.getEstadoCivilDescripcion();
            this.autoDSNombreCorto = instance.getEstadoCivilNombreCorto();
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
    public String getAutoDSNombreCorto() {
        return this.autoDSNombreCorto;
    }
    
    public void setAutoDSNombreCorto(String autoDSNombreCorto) {
        this.autoDSNombreCorto = autoDSNombreCorto;
    }
}
