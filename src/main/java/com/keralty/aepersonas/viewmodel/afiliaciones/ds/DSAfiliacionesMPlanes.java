package com.keralty.aepersonas.viewmodel.afiliaciones.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Afiliaciones;
public class DSAfiliacionesMPlanes {

    @JsonProperty("usuarioldap")
    private String dSAfiliacionesMPlanesUsuarioLDAP;

    @JsonProperty("primernombre")
    private String dSAfiliacionesMPlanesPrimerNombre;

    @JsonProperty("segundonombre")
    private String dSAfiliacionesMPlanesSegundoNombre;

    @JsonProperty("primerapellido")
    private String dSAfiliacionesMPlanesPrimerApellido;

    @JsonProperty("segundoapellido")
    private String dSAfiliacionesMPlanesSegundoApellido;

    public DSAfiliacionesMPlanes() {
    
    }

    public DSAfiliacionesMPlanes(Afiliaciones instance) {
        if (instance != null) {
            try {
                this.dSAfiliacionesMPlanesUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
                this.dSAfiliacionesMPlanesPrimerNombre = instance.getFuncionarioPrimerNombre();
                this.dSAfiliacionesMPlanesSegundoNombre = instance.getFuncionarioSegundoNombre();
                this.dSAfiliacionesMPlanesPrimerApellido = instance.getFuncionarioPrimerApellido();
                this.dSAfiliacionesMPlanesSegundoApellido = instance.getFuncionarioSegundoApellido();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getDSAfiliacionesMPlanesUsuarioLDAP() {
        return this.dSAfiliacionesMPlanesUsuarioLDAP;
    }
    
    public void setDSAfiliacionesMPlanesUsuarioLDAP(String dSAfiliacionesMPlanesUsuarioLDAP) {
        this.dSAfiliacionesMPlanesUsuarioLDAP = dSAfiliacionesMPlanesUsuarioLDAP;
    }

    @JsonIgnore
    public String getDSAfiliacionesMPlanesPrimerNombre() {
        return this.dSAfiliacionesMPlanesPrimerNombre;
    }
    
    public void setDSAfiliacionesMPlanesPrimerNombre(String dSAfiliacionesMPlanesPrimerNombre) {
        this.dSAfiliacionesMPlanesPrimerNombre = dSAfiliacionesMPlanesPrimerNombre;
    }

    @JsonIgnore
    public String getDSAfiliacionesMPlanesSegundoNombre() {
        return this.dSAfiliacionesMPlanesSegundoNombre;
    }
    
    public void setDSAfiliacionesMPlanesSegundoNombre(String dSAfiliacionesMPlanesSegundoNombre) {
        this.dSAfiliacionesMPlanesSegundoNombre = dSAfiliacionesMPlanesSegundoNombre;
    }

    @JsonIgnore
    public String getDSAfiliacionesMPlanesPrimerApellido() {
        return this.dSAfiliacionesMPlanesPrimerApellido;
    }
    
    public void setDSAfiliacionesMPlanesPrimerApellido(String dSAfiliacionesMPlanesPrimerApellido) {
        this.dSAfiliacionesMPlanesPrimerApellido = dSAfiliacionesMPlanesPrimerApellido;
    }

    @JsonIgnore
    public String getDSAfiliacionesMPlanesSegundoApellido() {
        return this.dSAfiliacionesMPlanesSegundoApellido;
    }
    
    public void setDSAfiliacionesMPlanesSegundoApellido(String dSAfiliacionesMPlanesSegundoApellido) {
        this.dSAfiliacionesMPlanesSegundoApellido = dSAfiliacionesMPlanesSegundoApellido;
    }
}
