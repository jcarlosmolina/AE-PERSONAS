package com.keralty.aepersonas.viewmodel.persona.ds;

import java.sql.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Persona;
public class DSPersonaPIU {

    @JsonProperty("tipoidentificacion_nombrecorto")
    private String dSPersonaPIUTipoIdentificacionDotNombreCorto;

    @JsonProperty("numidentificacion")
    private String dSPersonaPIUNumIdentificacion;

    @JsonProperty("primernombre")
    private String dSPersonaPIUPrimerNombre;

    @JsonProperty("segundonombre")
    private String dSPersonaPIUSegundoNombre;

    @JsonProperty("primerapellido")
    private String dSPersonaPIUPrimerApellido;

    @JsonProperty("segundoapellido")
    private String dSPersonaPIUSegundoApellido;

    @JsonProperty("fechanacimiento")
    private Date dSPersonaPIUFechaNacimiento;

    @JsonProperty("genero")
    private String dSPersonaPIUGenero;

    @JsonProperty("razonsocial")
    private String dSPersonaPIURazonSocial;

    public DSPersonaPIU() {
    
    }

    public DSPersonaPIU(Persona instance) {
        if (instance != null) {
            try {
                this.dSPersonaPIUTipoIdentificacionDotNombreCorto = instance.getTipoIdentificacion().getTipoIdentificacionNombreCorto();
                this.dSPersonaPIUNumIdentificacion = instance.getPersonaNumIdentificacion();
                this.dSPersonaPIUPrimerNombre = instance.getPersonaPrimerNombre();
                this.dSPersonaPIUSegundoNombre = instance.getPersonaSegundoNombre();
                this.dSPersonaPIUPrimerApellido = instance.getPersonaPrimerApellido();
                this.dSPersonaPIUSegundoApellido = instance.getPersonaSegundoApellido();
                this.dSPersonaPIUFechaNacimiento = instance.getPersonaFechaNacimiento();
                this.dSPersonaPIUGenero = instance.getPersonaGenero();
                this.dSPersonaPIURazonSocial = instance.getPersonaRazonSocial();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getDSPersonaPIUTipoIdentificacionDotNombreCorto() {
        return this.dSPersonaPIUTipoIdentificacionDotNombreCorto;
    }
    
    public void setDSPersonaPIUTipoIdentificacionDotNombreCorto(String dSPersonaPIUTipoIdentificacionDotNombreCorto) {
        this.dSPersonaPIUTipoIdentificacionDotNombreCorto = dSPersonaPIUTipoIdentificacionDotNombreCorto;
    }

    @JsonIgnore
    public String getDSPersonaPIUNumIdentificacion() {
        return this.dSPersonaPIUNumIdentificacion;
    }
    
    public void setDSPersonaPIUNumIdentificacion(String dSPersonaPIUNumIdentificacion) {
        this.dSPersonaPIUNumIdentificacion = dSPersonaPIUNumIdentificacion;
    }

    @JsonIgnore
    public String getDSPersonaPIUPrimerNombre() {
        return this.dSPersonaPIUPrimerNombre;
    }
    
    public void setDSPersonaPIUPrimerNombre(String dSPersonaPIUPrimerNombre) {
        this.dSPersonaPIUPrimerNombre = dSPersonaPIUPrimerNombre;
    }

    @JsonIgnore
    public String getDSPersonaPIUSegundoNombre() {
        return this.dSPersonaPIUSegundoNombre;
    }
    
    public void setDSPersonaPIUSegundoNombre(String dSPersonaPIUSegundoNombre) {
        this.dSPersonaPIUSegundoNombre = dSPersonaPIUSegundoNombre;
    }

    @JsonIgnore
    public String getDSPersonaPIUPrimerApellido() {
        return this.dSPersonaPIUPrimerApellido;
    }
    
    public void setDSPersonaPIUPrimerApellido(String dSPersonaPIUPrimerApellido) {
        this.dSPersonaPIUPrimerApellido = dSPersonaPIUPrimerApellido;
    }

    @JsonIgnore
    public String getDSPersonaPIUSegundoApellido() {
        return this.dSPersonaPIUSegundoApellido;
    }
    
    public void setDSPersonaPIUSegundoApellido(String dSPersonaPIUSegundoApellido) {
        this.dSPersonaPIUSegundoApellido = dSPersonaPIUSegundoApellido;
    }

    @JsonIgnore
    public Date getDSPersonaPIUFechaNacimiento() {
        return this.dSPersonaPIUFechaNacimiento;
    }
    
    public void setDSPersonaPIUFechaNacimiento(Date dSPersonaPIUFechaNacimiento) {
        this.dSPersonaPIUFechaNacimiento = dSPersonaPIUFechaNacimiento;
    }

    @JsonIgnore
    public String getDSPersonaPIUGenero() {
        return this.dSPersonaPIUGenero;
    }
    
    public void setDSPersonaPIUGenero(String dSPersonaPIUGenero) {
        this.dSPersonaPIUGenero = dSPersonaPIUGenero;
    }

    @JsonIgnore
    public String getDSPersonaPIURazonSocial() {
        return this.dSPersonaPIURazonSocial;
    }
    
    public void setDSPersonaPIURazonSocial(String dSPersonaPIURazonSocial) {
        this.dSPersonaPIURazonSocial = dSPersonaPIURazonSocial;
    }
}
