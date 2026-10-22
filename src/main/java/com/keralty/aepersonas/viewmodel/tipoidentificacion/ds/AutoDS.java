package com.keralty.aepersonas.viewmodel.tipoidentificacion.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
public class AutoDS {

    @JsonProperty("codigo")
    private Long autoDSCodigo;

    @JsonProperty("descripcion")
    private String autoDSDescripcion;

    @JsonProperty("nombrecorto")
    private String autoDSNombreCorto;

    @JsonProperty("validocontratante")
    private Boolean autoDSValidoContratante;

    @JsonProperty("validotitular")
    private Boolean autoDSValidoTitular;

    @JsonProperty("diplomatico")
    private Boolean autoDSDiplomatico;

    @JsonProperty("nit")
    private Boolean autoDSNIT;

    @JsonProperty("hijode")
    private Boolean autoDSHijoDe;

    @JsonProperty("requiereeps")
    private Boolean autoDSRequiereEPS;

    @JsonProperty("menorsinidentificar")
    private Boolean autoDSMenorSinIdentificar;

    @JsonProperty("espasaporte")
    private Boolean autoDSEsPasaporte;

    @JsonProperty("visiblevalidadorusu")
    private Boolean autoDSVisibleValidadorUsu;

    public AutoDS() {
    
    }

    public AutoDS(TipoIdentificacion instance) {
        if (instance != null) {
            this.autoDSCodigo = instance.getTipoIdentificacionCodigo();
            this.autoDSDescripcion = instance.getTipoIdentificacionDescripcion();
            this.autoDSNombreCorto = instance.getTipoIdentificacionNombreCorto();
            this.autoDSValidoContratante = instance.getTipoIdentificacionValidoContratante();
            this.autoDSValidoTitular = instance.getTipoIdentificacionValidoTitular();
            this.autoDSDiplomatico = instance.getTipoIdentificacionDiplomatico();
            this.autoDSNIT = instance.getTipoIdentificacionNIT();
            this.autoDSHijoDe = instance.getTipoIdentificacionHijoDe();
            this.autoDSRequiereEPS = instance.getTipoIdentificacionRequiereEPS();
            this.autoDSMenorSinIdentificar = instance.getTipoIdentificacionMenorSinIdentificar();
            this.autoDSEsPasaporte = instance.getTipoIdentificacionEsPasaporte();
            this.autoDSVisibleValidadorUsu = instance.getTipoIdentificacionVisibleValidadorUsu();
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

    @JsonIgnore
    public Boolean getAutoDSValidoContratante() {
        return this.autoDSValidoContratante;
    }
    
    public void setAutoDSValidoContratante(Boolean autoDSValidoContratante) {
        this.autoDSValidoContratante = autoDSValidoContratante;
    }

    @JsonIgnore
    public Boolean getAutoDSValidoTitular() {
        return this.autoDSValidoTitular;
    }
    
    public void setAutoDSValidoTitular(Boolean autoDSValidoTitular) {
        this.autoDSValidoTitular = autoDSValidoTitular;
    }

    @JsonIgnore
    public Boolean getAutoDSDiplomatico() {
        return this.autoDSDiplomatico;
    }
    
    public void setAutoDSDiplomatico(Boolean autoDSDiplomatico) {
        this.autoDSDiplomatico = autoDSDiplomatico;
    }

    @JsonIgnore
    public Boolean getAutoDSNIT() {
        return this.autoDSNIT;
    }
    
    public void setAutoDSNIT(Boolean autoDSNIT) {
        this.autoDSNIT = autoDSNIT;
    }

    @JsonIgnore
    public Boolean getAutoDSHijoDe() {
        return this.autoDSHijoDe;
    }
    
    public void setAutoDSHijoDe(Boolean autoDSHijoDe) {
        this.autoDSHijoDe = autoDSHijoDe;
    }

    @JsonIgnore
    public Boolean getAutoDSRequiereEPS() {
        return this.autoDSRequiereEPS;
    }
    
    public void setAutoDSRequiereEPS(Boolean autoDSRequiereEPS) {
        this.autoDSRequiereEPS = autoDSRequiereEPS;
    }

    @JsonIgnore
    public Boolean getAutoDSMenorSinIdentificar() {
        return this.autoDSMenorSinIdentificar;
    }
    
    public void setAutoDSMenorSinIdentificar(Boolean autoDSMenorSinIdentificar) {
        this.autoDSMenorSinIdentificar = autoDSMenorSinIdentificar;
    }

    @JsonIgnore
    public Boolean getAutoDSEsPasaporte() {
        return this.autoDSEsPasaporte;
    }
    
    public void setAutoDSEsPasaporte(Boolean autoDSEsPasaporte) {
        this.autoDSEsPasaporte = autoDSEsPasaporte;
    }

    @JsonIgnore
    public Boolean getAutoDSVisibleValidadorUsu() {
        return this.autoDSVisibleValidadorUsu;
    }
    
    public void setAutoDSVisibleValidadorUsu(Boolean autoDSVisibleValidadorUsu) {
        this.autoDSVisibleValidadorUsu = autoDSVisibleValidadorUsu;
    }
}
