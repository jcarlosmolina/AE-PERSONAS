package com.keralty.aepersonas.viewmodel.estadobeneficiario.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.EstadoBeneficiario;
public class AutoDS {

    @JsonProperty("codigo")
    private Long autoDSCodigo;

    @JsonProperty("descripcion")
    private String autoDSDescripcion;

    @JsonProperty("esactivo")
    private Boolean autoDSEsActivo;

    @JsonProperty("confirmado")
    private Boolean autoDSConfirmado;

    @JsonProperty("eserror")
    private Boolean autoDSEsError;

    public AutoDS() {
    
    }

    public AutoDS(EstadoBeneficiario instance) {
        if (instance != null) {
            this.autoDSCodigo = instance.getEstadoBeneficiarioCodigo();
            this.autoDSDescripcion = instance.getEstadoBeneficiarioDescripcion();
            this.autoDSEsActivo = instance.getEstadoBeneficiarioEsActivo();
            this.autoDSConfirmado = instance.getEstadoBeneficiarioConfirmado();
            this.autoDSEsError = instance.getEstadoBeneficiarioEsError();
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
    public Boolean getAutoDSEsActivo() {
        return this.autoDSEsActivo;
    }
    
    public void setAutoDSEsActivo(Boolean autoDSEsActivo) {
        this.autoDSEsActivo = autoDSEsActivo;
    }

    @JsonIgnore
    public Boolean getAutoDSConfirmado() {
        return this.autoDSConfirmado;
    }
    
    public void setAutoDSConfirmado(Boolean autoDSConfirmado) {
        this.autoDSConfirmado = autoDSConfirmado;
    }

    @JsonIgnore
    public Boolean getAutoDSEsError() {
        return this.autoDSEsError;
    }
    
    public void setAutoDSEsError(Boolean autoDSEsError) {
        this.autoDSEsError = autoDSEsError;
    }
}
