package com.keralty.aepersonas.viewmodel.asesor.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Asesor;
public class ICAsesor {

    @JsonProperty("primernombre")
    private String iCAsesorPrimerNombre;

    @JsonProperty("segundonombre")
    private String iCAsesorSegundoNombre;

    @JsonProperty("primerapellido")
    private String iCAsesorPrimerApellido;

    public ICAsesor() {
    
    }

    public ICAsesor(Asesor instance) {
        if (instance != null) {
            try {
                this.iCAsesorPrimerNombre = instance.getFuncionarioPrimerNombre();
                this.iCAsesorSegundoNombre = instance.getFuncionarioSegundoNombre();
                this.iCAsesorPrimerApellido = instance.getFuncionarioPrimerApellido();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getICAsesorPrimerNombre() {
        return this.iCAsesorPrimerNombre;
    }
    
    public void setICAsesorPrimerNombre(String iCAsesorPrimerNombre) {
        this.iCAsesorPrimerNombre = iCAsesorPrimerNombre;
    }

    @JsonIgnore
    public String getICAsesorSegundoNombre() {
        return this.iCAsesorSegundoNombre;
    }
    
    public void setICAsesorSegundoNombre(String iCAsesorSegundoNombre) {
        this.iCAsesorSegundoNombre = iCAsesorSegundoNombre;
    }

    @JsonIgnore
    public String getICAsesorPrimerApellido() {
        return this.iCAsesorPrimerApellido;
    }
    
    public void setICAsesorPrimerApellido(String iCAsesorPrimerApellido) {
        this.iCAsesorPrimerApellido = iCAsesorPrimerApellido;
    }
}
