package com.keralty.aepersonas.viewmodel.pregunta.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Pregunta;
public class DSPreguntaIIU {

    @JsonProperty("seccion_nombre")
    private String dSPreguntaIIUSeccionDotNombre;

    @JsonProperty("numero")
    private Long dSPreguntaIIUNumero;

    @JsonProperty("numorden")
    private Long dSPreguntaIIUNumOrden;

    @JsonProperty("descripcion")
    private String dSPreguntaIIUDescripcion;

    @JsonProperty("valorsnobliga")
    private Boolean dSPreguntaIIUValorSNObliga;

    @JsonProperty("obsoblig")
    private Boolean dSPreguntaIIUObsOblig;

    @JsonProperty("esnumero")
    private Boolean dSPreguntaIIUEsNumero;

    @JsonProperty("valormin")
    private Double dSPreguntaIIUValorMin;

    @JsonProperty("valormax")
    private Double dSPreguntaIIUValorMax;

    @JsonProperty("solohombres")
    private Boolean dSPreguntaIIUSoloHombres;

    @JsonProperty("solomujeres")
    private Boolean dSPreguntaIIUSoloMujeres;

    @JsonProperty("respmultiple")
    private Boolean dSPreguntaIIURespMultiple;

    @JsonProperty("condicionedad")
    private Long dSPreguntaIIUCondicionEdad;

    @JsonProperty("condicionedadanyos")
    private Long dSPreguntaIIUCondicionEdadAnyos;

    @JsonProperty("drvvaloresposibles")
    private String dSPreguntaIIUDrvValoresPosibles;

    public DSPreguntaIIU() {
    
    }

    public DSPreguntaIIU(Pregunta instance) {
        if (instance != null) {
            try {
                this.dSPreguntaIIUSeccionDotNombre = instance.getSeccion().getSeccionNombre();
                this.dSPreguntaIIUNumero = instance.getPreguntaNumero();
                this.dSPreguntaIIUNumOrden = instance.getPreguntaNumOrden();
                this.dSPreguntaIIUDescripcion = instance.getPreguntaDescripcion();
                this.dSPreguntaIIUValorSNObliga = instance.getPreguntaValorSNObliga();
                this.dSPreguntaIIUObsOblig = instance.getPreguntaObsOblig();
                this.dSPreguntaIIUEsNumero = instance.getPreguntaEsNumero();
                this.dSPreguntaIIUValorMin = instance.getPreguntaValorMin();
                this.dSPreguntaIIUValorMax = instance.getPreguntaValorMax();
                this.dSPreguntaIIUSoloHombres = instance.getPreguntaSoloHombres();
                this.dSPreguntaIIUSoloMujeres = instance.getPreguntaSoloMujeres();
                this.dSPreguntaIIURespMultiple = instance.getPreguntaRespMultiple();
                this.dSPreguntaIIUCondicionEdad = instance.getPreguntaCondicionEdad();
                this.dSPreguntaIIUCondicionEdadAnyos = instance.getPreguntaCondicionEdadAnyos();
                this.dSPreguntaIIUDrvValoresPosibles = instance.getPreguntadrvValoresPosibles();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getDSPreguntaIIUSeccionDotNombre() {
        return this.dSPreguntaIIUSeccionDotNombre;
    }
    
    public void setDSPreguntaIIUSeccionDotNombre(String dSPreguntaIIUSeccionDotNombre) {
        this.dSPreguntaIIUSeccionDotNombre = dSPreguntaIIUSeccionDotNombre;
    }

    @JsonIgnore
    public Long getDSPreguntaIIUNumero() {
        return this.dSPreguntaIIUNumero;
    }
    
    public void setDSPreguntaIIUNumero(Long dSPreguntaIIUNumero) {
        this.dSPreguntaIIUNumero = dSPreguntaIIUNumero;
    }

    @JsonIgnore
    public Long getDSPreguntaIIUNumOrden() {
        return this.dSPreguntaIIUNumOrden;
    }
    
    public void setDSPreguntaIIUNumOrden(Long dSPreguntaIIUNumOrden) {
        this.dSPreguntaIIUNumOrden = dSPreguntaIIUNumOrden;
    }

    @JsonIgnore
    public String getDSPreguntaIIUDescripcion() {
        return this.dSPreguntaIIUDescripcion;
    }
    
    public void setDSPreguntaIIUDescripcion(String dSPreguntaIIUDescripcion) {
        this.dSPreguntaIIUDescripcion = dSPreguntaIIUDescripcion;
    }

    @JsonIgnore
    public Boolean getDSPreguntaIIUValorSNObliga() {
        return this.dSPreguntaIIUValorSNObliga;
    }
    
    public void setDSPreguntaIIUValorSNObliga(Boolean dSPreguntaIIUValorSNObliga) {
        this.dSPreguntaIIUValorSNObliga = dSPreguntaIIUValorSNObliga;
    }

    @JsonIgnore
    public Boolean getDSPreguntaIIUObsOblig() {
        return this.dSPreguntaIIUObsOblig;
    }
    
    public void setDSPreguntaIIUObsOblig(Boolean dSPreguntaIIUObsOblig) {
        this.dSPreguntaIIUObsOblig = dSPreguntaIIUObsOblig;
    }

    @JsonIgnore
    public Boolean getDSPreguntaIIUEsNumero() {
        return this.dSPreguntaIIUEsNumero;
    }
    
    public void setDSPreguntaIIUEsNumero(Boolean dSPreguntaIIUEsNumero) {
        this.dSPreguntaIIUEsNumero = dSPreguntaIIUEsNumero;
    }

    @JsonIgnore
    public Double getDSPreguntaIIUValorMin() {
        return this.dSPreguntaIIUValorMin;
    }
    
    public void setDSPreguntaIIUValorMin(Double dSPreguntaIIUValorMin) {
        this.dSPreguntaIIUValorMin = dSPreguntaIIUValorMin;
    }

    @JsonIgnore
    public Double getDSPreguntaIIUValorMax() {
        return this.dSPreguntaIIUValorMax;
    }
    
    public void setDSPreguntaIIUValorMax(Double dSPreguntaIIUValorMax) {
        this.dSPreguntaIIUValorMax = dSPreguntaIIUValorMax;
    }

    @JsonIgnore
    public Boolean getDSPreguntaIIUSoloHombres() {
        return this.dSPreguntaIIUSoloHombres;
    }
    
    public void setDSPreguntaIIUSoloHombres(Boolean dSPreguntaIIUSoloHombres) {
        this.dSPreguntaIIUSoloHombres = dSPreguntaIIUSoloHombres;
    }

    @JsonIgnore
    public Boolean getDSPreguntaIIUSoloMujeres() {
        return this.dSPreguntaIIUSoloMujeres;
    }
    
    public void setDSPreguntaIIUSoloMujeres(Boolean dSPreguntaIIUSoloMujeres) {
        this.dSPreguntaIIUSoloMujeres = dSPreguntaIIUSoloMujeres;
    }

    @JsonIgnore
    public Boolean getDSPreguntaIIURespMultiple() {
        return this.dSPreguntaIIURespMultiple;
    }
    
    public void setDSPreguntaIIURespMultiple(Boolean dSPreguntaIIURespMultiple) {
        this.dSPreguntaIIURespMultiple = dSPreguntaIIURespMultiple;
    }

    @JsonIgnore
    public Long getDSPreguntaIIUCondicionEdad() {
        return this.dSPreguntaIIUCondicionEdad;
    }
    
    public void setDSPreguntaIIUCondicionEdad(Long dSPreguntaIIUCondicionEdad) {
        this.dSPreguntaIIUCondicionEdad = dSPreguntaIIUCondicionEdad;
    }

    @JsonIgnore
    public Long getDSPreguntaIIUCondicionEdadAnyos() {
        return this.dSPreguntaIIUCondicionEdadAnyos;
    }
    
    public void setDSPreguntaIIUCondicionEdadAnyos(Long dSPreguntaIIUCondicionEdadAnyos) {
        this.dSPreguntaIIUCondicionEdadAnyos = dSPreguntaIIUCondicionEdadAnyos;
    }

    @JsonIgnore
    public String getDSPreguntaIIUDrvValoresPosibles() {
        return this.dSPreguntaIIUDrvValoresPosibles;
    }
    
    public void setDSPreguntaIIUDrvValoresPosibles(String dSPreguntaIIUDrvValoresPosibles) {
        this.dSPreguntaIIUDrvValoresPosibles = dSPreguntaIIUDrvValoresPosibles;
    }
}
