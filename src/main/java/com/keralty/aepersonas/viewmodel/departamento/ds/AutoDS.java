package com.keralty.aepersonas.viewmodel.departamento.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Departamento;
public class AutoDS {

    @JsonProperty("codigo")
    private Long autoDSCodigo;

    @JsonProperty("descripcion")
    private String autoDSDescripcion;

    @JsonProperty("codigolegal")
    private String autoDSCodigoLegal;

    public AutoDS() {
    
    }

    public AutoDS(Departamento instance) {
        if (instance != null) {
            this.autoDSCodigo = instance.getDepartamentoCodigo();
            this.autoDSDescripcion = instance.getDepartamentoDescripcion();
            this.autoDSCodigoLegal = instance.getDepartamentoCodigoLegal();
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
    public String getAutoDSCodigoLegal() {
        return this.autoDSCodigoLegal;
    }
    
    public void setAutoDSCodigoLegal(String autoDSCodigoLegal) {
        this.autoDSCodigoLegal = autoDSCodigoLegal;
    }
}
