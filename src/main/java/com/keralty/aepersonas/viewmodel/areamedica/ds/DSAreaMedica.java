package com.keralty.aepersonas.viewmodel.areamedica.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.AreaMedica;
public class DSAreaMedica {

    @JsonProperty("usuario")
    private String dSAreaMedicaUsuario;

    @JsonProperty("primerapellido")
    private String dSAreaMedicaPrimerApellido;

    @JsonProperty("segundoapellido")
    private String dSAreaMedicaSegundoApellido;

    @JsonProperty("primernombre")
    private String dSAreaMedicaPrimerNombre;

    @JsonProperty("segundonombre")
    private String dSAreaMedicaSegundoNombre;

    public DSAreaMedica() {
    
    }

    public DSAreaMedica(AreaMedica instance) {
        if (instance != null) {
            try {
                this.dSAreaMedicaUsuario = instance.getFuncionarioUsuario();
                this.dSAreaMedicaPrimerApellido = instance.getFuncionarioPrimerApellido();
                this.dSAreaMedicaSegundoApellido = instance.getFuncionarioSegundoApellido();
                this.dSAreaMedicaPrimerNombre = instance.getFuncionarioPrimerNombre();
                this.dSAreaMedicaSegundoNombre = instance.getFuncionarioSegundoNombre();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getDSAreaMedicaUsuario() {
        return this.dSAreaMedicaUsuario;
    }
    
    public void setDSAreaMedicaUsuario(String dSAreaMedicaUsuario) {
        this.dSAreaMedicaUsuario = dSAreaMedicaUsuario;
    }

    @JsonIgnore
    public String getDSAreaMedicaPrimerApellido() {
        return this.dSAreaMedicaPrimerApellido;
    }
    
    public void setDSAreaMedicaPrimerApellido(String dSAreaMedicaPrimerApellido) {
        this.dSAreaMedicaPrimerApellido = dSAreaMedicaPrimerApellido;
    }

    @JsonIgnore
    public String getDSAreaMedicaSegundoApellido() {
        return this.dSAreaMedicaSegundoApellido;
    }
    
    public void setDSAreaMedicaSegundoApellido(String dSAreaMedicaSegundoApellido) {
        this.dSAreaMedicaSegundoApellido = dSAreaMedicaSegundoApellido;
    }

    @JsonIgnore
    public String getDSAreaMedicaPrimerNombre() {
        return this.dSAreaMedicaPrimerNombre;
    }
    
    public void setDSAreaMedicaPrimerNombre(String dSAreaMedicaPrimerNombre) {
        this.dSAreaMedicaPrimerNombre = dSAreaMedicaPrimerNombre;
    }

    @JsonIgnore
    public String getDSAreaMedicaSegundoNombre() {
        return this.dSAreaMedicaSegundoNombre;
    }
    
    public void setDSAreaMedicaSegundoNombre(String dSAreaMedicaSegundoNombre) {
        this.dSAreaMedicaSegundoNombre = dSAreaMedicaSegundoNombre;
    }
}
