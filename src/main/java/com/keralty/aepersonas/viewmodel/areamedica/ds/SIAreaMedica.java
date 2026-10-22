package com.keralty.aepersonas.viewmodel.areamedica.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.AreaMedica;
public class SIAreaMedica {

    @JsonProperty("primernombre")
    private String sIAreaMedicaPrimerNombre;

    @JsonProperty("segundonombre")
    private String sIAreaMedicaSegundoNombre;

    @JsonProperty("primerapellido")
    private String sIAreaMedicaPrimerApellido;

    @JsonProperty("segundoapellido")
    private String sIAreaMedicaSegundoApellido;

    public SIAreaMedica() {
    
    }

    public SIAreaMedica(AreaMedica instance) {
        if (instance != null) {
            try {
                this.sIAreaMedicaPrimerNombre = instance.getFuncionarioPrimerNombre();
                this.sIAreaMedicaSegundoNombre = instance.getFuncionarioSegundoNombre();
                this.sIAreaMedicaPrimerApellido = instance.getFuncionarioPrimerApellido();
                this.sIAreaMedicaSegundoApellido = instance.getFuncionarioSegundoApellido();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getSIAreaMedicaPrimerNombre() {
        return this.sIAreaMedicaPrimerNombre;
    }
    
    public void setSIAreaMedicaPrimerNombre(String sIAreaMedicaPrimerNombre) {
        this.sIAreaMedicaPrimerNombre = sIAreaMedicaPrimerNombre;
    }

    @JsonIgnore
    public String getSIAreaMedicaSegundoNombre() {
        return this.sIAreaMedicaSegundoNombre;
    }
    
    public void setSIAreaMedicaSegundoNombre(String sIAreaMedicaSegundoNombre) {
        this.sIAreaMedicaSegundoNombre = sIAreaMedicaSegundoNombre;
    }

    @JsonIgnore
    public String getSIAreaMedicaPrimerApellido() {
        return this.sIAreaMedicaPrimerApellido;
    }
    
    public void setSIAreaMedicaPrimerApellido(String sIAreaMedicaPrimerApellido) {
        this.sIAreaMedicaPrimerApellido = sIAreaMedicaPrimerApellido;
    }

    @JsonIgnore
    public String getSIAreaMedicaSegundoApellido() {
        return this.sIAreaMedicaSegundoApellido;
    }
    
    public void setSIAreaMedicaSegundoApellido(String sIAreaMedicaSegundoApellido) {
        this.sIAreaMedicaSegundoApellido = sIAreaMedicaSegundoApellido;
    }
}
