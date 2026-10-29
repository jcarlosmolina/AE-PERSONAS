package com.keralty.aepersonas.viewmodel.afiliaciones.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.keralty.aepersonas.global.AfiliacionesConstants;
import com.keralty.aepersonas.viewmodel.FilterRequest;

public class FAfiliacionesPorNombre {

    @JsonProperty("vusuario")
    private String vUsuario;

    @JsonProperty("vprimernombre")
    private String vPrimerNombre;

    @JsonProperty("vsegundonombre")
    private String vSegundoNombre;

    @JsonProperty("vprimerape")
    private String vPrimerApe;

    @JsonProperty("vsegundoape")
    private String vSegundoApe;

    public FAfiliacionesPorNombre() {
        // Default constructor
    }

    @JsonIgnore
    public String getVUsuario() {
        return this.vUsuario;
    }
    
    public void setVUsuario(String vUsuario) {
        this.vUsuario = vUsuario;
    }

    @JsonIgnore
    public String getVPrimerNombre() {
        return this.vPrimerNombre;
    }
    
    public void setVPrimerNombre(String vPrimerNombre) {
        this.vPrimerNombre = vPrimerNombre;
    }

    @JsonIgnore
    public String getVSegundoNombre() {
        return this.vSegundoNombre;
    }
    
    public void setVSegundoNombre(String vSegundoNombre) {
        this.vSegundoNombre = vSegundoNombre;
    }

    @JsonIgnore
    public String getVPrimerApe() {
        return this.vPrimerApe;
    }
    
    public void setVPrimerApe(String vPrimerApe) {
        this.vPrimerApe = vPrimerApe;
    }

    @JsonIgnore
    public String getVSegundoApe() {
        return this.vSegundoApe;
    }
    
    public void setVSegundoApe(String vSegundoApe) {
        this.vSegundoApe = vSegundoApe;
    }

    public FilterRequest buildFilterRequest() {
        FilterRequest filterRequest = new FilterRequest();
        filterRequest.setName(AfiliacionesConstants.FILTER_NAME_FAFILIACIONESPORNOMBRE);
        filterRequest.addFilterVariable(AfiliacionesConstants.VAR_NAME_FAFILIACIONESPORNOMBRE_VUSUARIO, vUsuario);
        filterRequest.addFilterVariable(AfiliacionesConstants.VAR_NAME_FAFILIACIONESPORNOMBRE_VPRIMERNOMBRE, vPrimerNombre);
        filterRequest.addFilterVariable(AfiliacionesConstants.VAR_NAME_FAFILIACIONESPORNOMBRE_VSEGUNDONOMBRE, vSegundoNombre);
        filterRequest.addFilterVariable(AfiliacionesConstants.VAR_NAME_FAFILIACIONESPORNOMBRE_VPRIMERAPE, vPrimerApe);
        filterRequest.addFilterVariable(AfiliacionesConstants.VAR_NAME_FAFILIACIONESPORNOMBRE_VSEGUNDOAPE, vSegundoApe);
        return filterRequest;
    }
}
