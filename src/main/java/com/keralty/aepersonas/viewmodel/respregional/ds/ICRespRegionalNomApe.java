package com.keralty.aepersonas.viewmodel.respregional.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.RespRegional;
public class ICRespRegionalNomApe {

    @JsonProperty("primernombre")
    private String iCRespRegionalNomApePrimerNombre;

    @JsonProperty("segundonombre")
    private String iCRespRegionalNomApeSegundoNombre;

    @JsonProperty("primerapellido")
    private String iCRespRegionalNomApePrimerApellido;

    @JsonProperty("segundoapellido")
    private String iCRespRegionalNomApeSegundoApellido;

    public ICRespRegionalNomApe() {
    
    }

    public ICRespRegionalNomApe(RespRegional instance) {
        if (instance != null) {
            try {
                this.iCRespRegionalNomApePrimerNombre = instance.getFuncionarioPrimerNombre();
                this.iCRespRegionalNomApeSegundoNombre = instance.getFuncionarioSegundoNombre();
                this.iCRespRegionalNomApePrimerApellido = instance.getFuncionarioPrimerApellido();
                this.iCRespRegionalNomApeSegundoApellido = instance.getFuncionarioSegundoApellido();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getICRespRegionalNomApePrimerNombre() {
        return this.iCRespRegionalNomApePrimerNombre;
    }
    
    public void setICRespRegionalNomApePrimerNombre(String iCRespRegionalNomApePrimerNombre) {
        this.iCRespRegionalNomApePrimerNombre = iCRespRegionalNomApePrimerNombre;
    }

    @JsonIgnore
    public String getICRespRegionalNomApeSegundoNombre() {
        return this.iCRespRegionalNomApeSegundoNombre;
    }
    
    public void setICRespRegionalNomApeSegundoNombre(String iCRespRegionalNomApeSegundoNombre) {
        this.iCRespRegionalNomApeSegundoNombre = iCRespRegionalNomApeSegundoNombre;
    }

    @JsonIgnore
    public String getICRespRegionalNomApePrimerApellido() {
        return this.iCRespRegionalNomApePrimerApellido;
    }
    
    public void setICRespRegionalNomApePrimerApellido(String iCRespRegionalNomApePrimerApellido) {
        this.iCRespRegionalNomApePrimerApellido = iCRespRegionalNomApePrimerApellido;
    }

    @JsonIgnore
    public String getICRespRegionalNomApeSegundoApellido() {
        return this.iCRespRegionalNomApeSegundoApellido;
    }
    
    public void setICRespRegionalNomApeSegundoApellido(String iCRespRegionalNomApeSegundoApellido) {
        this.iCRespRegionalNomApeSegundoApellido = iCRespRegionalNomApeSegundoApellido;
    }
}
