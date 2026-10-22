package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FuGenerarReporteOracleRequest {

    @JsonProperty("pfnombrereporte")
    private String pfNombreReporte;

    @JsonProperty("pfusuario")
    private String pfUsuario;

    @JsonProperty("pfparametros")
    private String pfParametros;

    public FuGenerarReporteOracleRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public String getPfNombreReporte() {
        return this.pfNombreReporte;
    }
    
    public void setPfNombreReporte(String pfNombreReporte) {
        this.pfNombreReporte = pfNombreReporte;
    }
    @JsonIgnore
    public String getPfUsuario() {
        return this.pfUsuario;
    }
    
    public void setPfUsuario(String pfUsuario) {
        this.pfUsuario = pfUsuario;
    }
    @JsonIgnore
    public String getPfParametros() {
        return this.pfParametros;
    }
    
    public void setPfParametros(String pfParametros) {
        this.pfParametros = pfParametros;
    }
}
