package com.keralty.aepersonas.viewmodel.pregunta.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Pregunta;
public class AutoDS {

    @JsonProperty("numero")
    private Long autoDSNumero;

    @JsonProperty("numorden")
    private Long autoDSNumOrden;

    @JsonProperty("descripcion")
    private String autoDSDescripcion;

    @JsonProperty("valorsnobliga")
    private Boolean autoDSValorSNObliga;

    @JsonProperty("obsoblig")
    private Boolean autoDSObsOblig;

    @JsonProperty("esnumero")
    private Boolean autoDSEsNumero;

    @JsonProperty("valormax")
    private Double autoDSValorMax;

    @JsonProperty("valormin")
    private Double autoDSValorMin;

    @JsonProperty("solohombres")
    private Boolean autoDSSoloHombres;

    @JsonProperty("solomujeres")
    private Boolean autoDSSoloMujeres;

    @JsonProperty("respmultiple")
    private Boolean autoDSRespMultiple;

    @JsonProperty("drvvaloresposibles")
    private String autoDSDrvValoresPosibles;

    @JsonProperty("seenviaalcore")
    private Boolean autoDSSeEnviaAlCORE;

    @JsonProperty("condicionedad")
    private Long autoDSCondicionEdad;

    @JsonProperty("condicionedadanyos")
    private Long autoDSCondicionEdadAnyos;

    public AutoDS() {
    
    }

    public AutoDS(Pregunta instance) {
        if (instance != null) {
            try {
                this.autoDSNumero = instance.getPreguntaNumero();
                this.autoDSNumOrden = instance.getPreguntaNumOrden();
                this.autoDSDescripcion = instance.getPreguntaDescripcion();
                this.autoDSValorSNObliga = instance.getPreguntaValorSNObliga();
                this.autoDSObsOblig = instance.getPreguntaObsOblig();
                this.autoDSEsNumero = instance.getPreguntaEsNumero();
                this.autoDSValorMax = instance.getPreguntaValorMax();
                this.autoDSValorMin = instance.getPreguntaValorMin();
                this.autoDSSoloHombres = instance.getPreguntaSoloHombres();
                this.autoDSSoloMujeres = instance.getPreguntaSoloMujeres();
                this.autoDSRespMultiple = instance.getPreguntaRespMultiple();
                this.autoDSDrvValoresPosibles = instance.getPreguntadrvValoresPosibles();
                this.autoDSSeEnviaAlCORE = instance.getPreguntaSeEnviaAlCORE();
                this.autoDSCondicionEdad = instance.getPreguntaCondicionEdad();
                this.autoDSCondicionEdadAnyos = instance.getPreguntaCondicionEdadAnyos();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public Long getAutoDSNumero() {
        return this.autoDSNumero;
    }
    
    public void setAutoDSNumero(Long autoDSNumero) {
        this.autoDSNumero = autoDSNumero;
    }

    @JsonIgnore
    public Long getAutoDSNumOrden() {
        return this.autoDSNumOrden;
    }
    
    public void setAutoDSNumOrden(Long autoDSNumOrden) {
        this.autoDSNumOrden = autoDSNumOrden;
    }

    @JsonIgnore
    public String getAutoDSDescripcion() {
        return this.autoDSDescripcion;
    }
    
    public void setAutoDSDescripcion(String autoDSDescripcion) {
        this.autoDSDescripcion = autoDSDescripcion;
    }

    @JsonIgnore
    public Boolean getAutoDSValorSNObliga() {
        return this.autoDSValorSNObliga;
    }
    
    public void setAutoDSValorSNObliga(Boolean autoDSValorSNObliga) {
        this.autoDSValorSNObliga = autoDSValorSNObliga;
    }

    @JsonIgnore
    public Boolean getAutoDSObsOblig() {
        return this.autoDSObsOblig;
    }
    
    public void setAutoDSObsOblig(Boolean autoDSObsOblig) {
        this.autoDSObsOblig = autoDSObsOblig;
    }

    @JsonIgnore
    public Boolean getAutoDSEsNumero() {
        return this.autoDSEsNumero;
    }
    
    public void setAutoDSEsNumero(Boolean autoDSEsNumero) {
        this.autoDSEsNumero = autoDSEsNumero;
    }

    @JsonIgnore
    public Double getAutoDSValorMax() {
        return this.autoDSValorMax;
    }
    
    public void setAutoDSValorMax(Double autoDSValorMax) {
        this.autoDSValorMax = autoDSValorMax;
    }

    @JsonIgnore
    public Double getAutoDSValorMin() {
        return this.autoDSValorMin;
    }
    
    public void setAutoDSValorMin(Double autoDSValorMin) {
        this.autoDSValorMin = autoDSValorMin;
    }

    @JsonIgnore
    public Boolean getAutoDSSoloHombres() {
        return this.autoDSSoloHombres;
    }
    
    public void setAutoDSSoloHombres(Boolean autoDSSoloHombres) {
        this.autoDSSoloHombres = autoDSSoloHombres;
    }

    @JsonIgnore
    public Boolean getAutoDSSoloMujeres() {
        return this.autoDSSoloMujeres;
    }
    
    public void setAutoDSSoloMujeres(Boolean autoDSSoloMujeres) {
        this.autoDSSoloMujeres = autoDSSoloMujeres;
    }

    @JsonIgnore
    public Boolean getAutoDSRespMultiple() {
        return this.autoDSRespMultiple;
    }
    
    public void setAutoDSRespMultiple(Boolean autoDSRespMultiple) {
        this.autoDSRespMultiple = autoDSRespMultiple;
    }

    @JsonIgnore
    public String getAutoDSDrvValoresPosibles() {
        return this.autoDSDrvValoresPosibles;
    }
    
    public void setAutoDSDrvValoresPosibles(String autoDSDrvValoresPosibles) {
        this.autoDSDrvValoresPosibles = autoDSDrvValoresPosibles;
    }

    @JsonIgnore
    public Boolean getAutoDSSeEnviaAlCORE() {
        return this.autoDSSeEnviaAlCORE;
    }
    
    public void setAutoDSSeEnviaAlCORE(Boolean autoDSSeEnviaAlCORE) {
        this.autoDSSeEnviaAlCORE = autoDSSeEnviaAlCORE;
    }

    @JsonIgnore
    public Long getAutoDSCondicionEdad() {
        return this.autoDSCondicionEdad;
    }
    
    public void setAutoDSCondicionEdad(Long autoDSCondicionEdad) {
        this.autoDSCondicionEdad = autoDSCondicionEdad;
    }

    @JsonIgnore
    public Long getAutoDSCondicionEdadAnyos() {
        return this.autoDSCondicionEdadAnyos;
    }
    
    public void setAutoDSCondicionEdadAnyos(Long autoDSCondicionEdadAnyos) {
        this.autoDSCondicionEdadAnyos = autoDSCondicionEdadAnyos;
    }
}
