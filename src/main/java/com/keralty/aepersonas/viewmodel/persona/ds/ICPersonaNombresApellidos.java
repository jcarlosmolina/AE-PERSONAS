package com.keralty.aepersonas.viewmodel.persona.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Persona;
public class ICPersonaNombresApellidos {

    @JsonProperty("razonsocial")
    private String iCPersonaNombresApellidosRazonSocial;

    @JsonProperty("primernombre")
    private String iCPersonaNombresApellidosPrimerNombre;

    @JsonProperty("segundonombre")
    private String iCPersonaNombresApellidosSegundoNombre;

    @JsonProperty("primerapellido")
    private String iCPersonaNombresApellidosPrimerApellido;

    @JsonProperty("segundoapellido")
    private String iCPersonaNombresApellidosSegundoApellido;

    public ICPersonaNombresApellidos() {
    
    }

    public ICPersonaNombresApellidos(Persona instance) {
        if (instance != null) {
            this.iCPersonaNombresApellidosRazonSocial = instance.getPersonaRazonSocial();
            this.iCPersonaNombresApellidosPrimerNombre = instance.getPersonaPrimerNombre();
            this.iCPersonaNombresApellidosSegundoNombre = instance.getPersonaSegundoNombre();
            this.iCPersonaNombresApellidosPrimerApellido = instance.getPersonaPrimerApellido();
            this.iCPersonaNombresApellidosSegundoApellido = instance.getPersonaSegundoApellido();
        }
    }

    @JsonIgnore
    public String getICPersonaNombresApellidosRazonSocial() {
        return this.iCPersonaNombresApellidosRazonSocial;
    }
    
    public void setICPersonaNombresApellidosRazonSocial(String iCPersonaNombresApellidosRazonSocial) {
        this.iCPersonaNombresApellidosRazonSocial = iCPersonaNombresApellidosRazonSocial;
    }

    @JsonIgnore
    public String getICPersonaNombresApellidosPrimerNombre() {
        return this.iCPersonaNombresApellidosPrimerNombre;
    }
    
    public void setICPersonaNombresApellidosPrimerNombre(String iCPersonaNombresApellidosPrimerNombre) {
        this.iCPersonaNombresApellidosPrimerNombre = iCPersonaNombresApellidosPrimerNombre;
    }

    @JsonIgnore
    public String getICPersonaNombresApellidosSegundoNombre() {
        return this.iCPersonaNombresApellidosSegundoNombre;
    }
    
    public void setICPersonaNombresApellidosSegundoNombre(String iCPersonaNombresApellidosSegundoNombre) {
        this.iCPersonaNombresApellidosSegundoNombre = iCPersonaNombresApellidosSegundoNombre;
    }

    @JsonIgnore
    public String getICPersonaNombresApellidosPrimerApellido() {
        return this.iCPersonaNombresApellidosPrimerApellido;
    }
    
    public void setICPersonaNombresApellidosPrimerApellido(String iCPersonaNombresApellidosPrimerApellido) {
        this.iCPersonaNombresApellidosPrimerApellido = iCPersonaNombresApellidosPrimerApellido;
    }

    @JsonIgnore
    public String getICPersonaNombresApellidosSegundoApellido() {
        return this.iCPersonaNombresApellidosSegundoApellido;
    }
    
    public void setICPersonaNombresApellidosSegundoApellido(String iCPersonaNombresApellidosSegundoApellido) {
        this.iCPersonaNombresApellidosSegundoApellido = iCPersonaNombresApellidosSegundoApellido;
    }
}
