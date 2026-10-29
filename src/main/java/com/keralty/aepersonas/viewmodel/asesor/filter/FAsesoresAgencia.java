package com.keralty.aepersonas.viewmodel.asesor.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.keralty.aepersonas.global.AsesorConstants;
import com.keralty.aepersonas.viewmodel.FilterRequest;

public class FAsesoresAgencia {

    @JsonProperty("vusuario")
    private String vUsuario;

    @JsonProperty("vprimernombre")
    private String vPrimerNombre;

    @JsonProperty("vsegundonombre")
    private String vSegundoNombre;

    @JsonProperty("vprimerapellido")
    private String vPrimerApellido;

    @JsonProperty("vsegundoapellido")
    private String vSegundoApellido;

    public FAsesoresAgencia() {
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
    public String getVPrimerApellido() {
        return this.vPrimerApellido;
    }
    
    public void setVPrimerApellido(String vPrimerApellido) {
        this.vPrimerApellido = vPrimerApellido;
    }

    @JsonIgnore
    public String getVSegundoApellido() {
        return this.vSegundoApellido;
    }
    
    public void setVSegundoApellido(String vSegundoApellido) {
        this.vSegundoApellido = vSegundoApellido;
    }

    public FilterRequest buildFilterRequest() {
        FilterRequest filterRequest = new FilterRequest();
        filterRequest.setName(AsesorConstants.FILTER_NAME_FASESORESAGENCIA);
        filterRequest.addFilterVariable(AsesorConstants.VAR_NAME_FASESORESAGENCIA_VUSUARIO, vUsuario);
        filterRequest.addFilterVariable(AsesorConstants.VAR_NAME_FASESORESAGENCIA_VPRIMERNOMBRE, vPrimerNombre);
        filterRequest.addFilterVariable(AsesorConstants.VAR_NAME_FASESORESAGENCIA_VSEGUNDONOMBRE, vSegundoNombre);
        filterRequest.addFilterVariable(AsesorConstants.VAR_NAME_FASESORESAGENCIA_VPRIMERAPELLIDO, vPrimerApellido);
        filterRequest.addFilterVariable(AsesorConstants.VAR_NAME_FASESORESAGENCIA_VSEGUNDOAPELLIDO, vSegundoApellido);
        return filterRequest;
    }
}
