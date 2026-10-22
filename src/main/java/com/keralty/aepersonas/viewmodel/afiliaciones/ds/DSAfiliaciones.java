package com.keralty.aepersonas.viewmodel.afiliaciones.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Afiliaciones;
public class DSAfiliaciones {

    @JsonProperty("usuario")
    private String dSAfiliacionesUsuario;

    @JsonProperty("primernombre")
    private String dSAfiliacionesPrimerNombre;

    @JsonProperty("segundonombre")
    private String dSAfiliacionesSegundoNombre;

    @JsonProperty("primerapellido")
    private String dSAfiliacionesPrimerApellido;

    @JsonProperty("segundoapellido")
    private String dSAfiliacionesSegundoApellido;

    public DSAfiliaciones() {
    
    }

    public DSAfiliaciones(Afiliaciones instance) {
        if (instance != null) {
            try {
                this.dSAfiliacionesUsuario = instance.getFuncionarioUsuario();
                this.dSAfiliacionesPrimerNombre = instance.getFuncionarioPrimerNombre();
                this.dSAfiliacionesSegundoNombre = instance.getFuncionarioSegundoNombre();
                this.dSAfiliacionesPrimerApellido = instance.getFuncionarioPrimerApellido();
                this.dSAfiliacionesSegundoApellido = instance.getFuncionarioSegundoApellido();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getDSAfiliacionesUsuario() {
        return this.dSAfiliacionesUsuario;
    }
    
    public void setDSAfiliacionesUsuario(String dSAfiliacionesUsuario) {
        this.dSAfiliacionesUsuario = dSAfiliacionesUsuario;
    }

    @JsonIgnore
    public String getDSAfiliacionesPrimerNombre() {
        return this.dSAfiliacionesPrimerNombre;
    }
    
    public void setDSAfiliacionesPrimerNombre(String dSAfiliacionesPrimerNombre) {
        this.dSAfiliacionesPrimerNombre = dSAfiliacionesPrimerNombre;
    }

    @JsonIgnore
    public String getDSAfiliacionesSegundoNombre() {
        return this.dSAfiliacionesSegundoNombre;
    }
    
    public void setDSAfiliacionesSegundoNombre(String dSAfiliacionesSegundoNombre) {
        this.dSAfiliacionesSegundoNombre = dSAfiliacionesSegundoNombre;
    }

    @JsonIgnore
    public String getDSAfiliacionesPrimerApellido() {
        return this.dSAfiliacionesPrimerApellido;
    }
    
    public void setDSAfiliacionesPrimerApellido(String dSAfiliacionesPrimerApellido) {
        this.dSAfiliacionesPrimerApellido = dSAfiliacionesPrimerApellido;
    }

    @JsonIgnore
    public String getDSAfiliacionesSegundoApellido() {
        return this.dSAfiliacionesSegundoApellido;
    }
    
    public void setDSAfiliacionesSegundoApellido(String dSAfiliacionesSegundoApellido) {
        this.dSAfiliacionesSegundoApellido = dSAfiliacionesSegundoApellido;
    }
}
