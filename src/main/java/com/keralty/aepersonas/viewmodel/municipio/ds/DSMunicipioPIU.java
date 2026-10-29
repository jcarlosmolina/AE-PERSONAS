package com.keralty.aepersonas.viewmodel.municipio.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Municipio;
public class DSMunicipioPIU {

    @JsonProperty("departamento_descripcion")
    private String dSMunicipioPIUDepartamentoDotDescripcion;

    @JsonProperty("codigo")
    private Long dSMunicipioPIUCodigo;

    @JsonProperty("codigolegal")
    private String dSMunicipioPIUCodigoLegal;

    @JsonProperty("descripcion")
    private String dSMunicipioPIUDescripcion;

    @JsonProperty("aplicaiva")
    private Boolean dSMunicipioPIUAplicaIVA;

    @JsonProperty("esvalidoeps")
    private Boolean dSMunicipioPIUEsValidoEPS;

    public DSMunicipioPIU() {
    
    }

    public DSMunicipioPIU(Municipio instance) {
        if (instance != null) {
            try {
                this.dSMunicipioPIUDepartamentoDotDescripcion = instance.getDepartamento().getDepartamentoDescripcion();
                this.dSMunicipioPIUCodigo = instance.getMunicipioCodigo();
                this.dSMunicipioPIUCodigoLegal = instance.getMunicipioCodigoLegal();
                this.dSMunicipioPIUDescripcion = instance.getMunicipioDescripcion();
                this.dSMunicipioPIUAplicaIVA = instance.getMunicipioAplicaIVA();
                this.dSMunicipioPIUEsValidoEPS = instance.getMunicipioEsValidoEPS();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getDSMunicipioPIUDepartamentoDotDescripcion() {
        return this.dSMunicipioPIUDepartamentoDotDescripcion;
    }
    
    public void setDSMunicipioPIUDepartamentoDotDescripcion(String dSMunicipioPIUDepartamentoDotDescripcion) {
        this.dSMunicipioPIUDepartamentoDotDescripcion = dSMunicipioPIUDepartamentoDotDescripcion;
    }

    @JsonIgnore
    public Long getDSMunicipioPIUCodigo() {
        return this.dSMunicipioPIUCodigo;
    }
    
    public void setDSMunicipioPIUCodigo(Long dSMunicipioPIUCodigo) {
        this.dSMunicipioPIUCodigo = dSMunicipioPIUCodigo;
    }

    @JsonIgnore
    public String getDSMunicipioPIUCodigoLegal() {
        return this.dSMunicipioPIUCodigoLegal;
    }
    
    public void setDSMunicipioPIUCodigoLegal(String dSMunicipioPIUCodigoLegal) {
        this.dSMunicipioPIUCodigoLegal = dSMunicipioPIUCodigoLegal;
    }

    @JsonIgnore
    public String getDSMunicipioPIUDescripcion() {
        return this.dSMunicipioPIUDescripcion;
    }
    
    public void setDSMunicipioPIUDescripcion(String dSMunicipioPIUDescripcion) {
        this.dSMunicipioPIUDescripcion = dSMunicipioPIUDescripcion;
    }

    @JsonIgnore
    public Boolean getDSMunicipioPIUAplicaIVA() {
        return this.dSMunicipioPIUAplicaIVA;
    }
    
    public void setDSMunicipioPIUAplicaIVA(Boolean dSMunicipioPIUAplicaIVA) {
        this.dSMunicipioPIUAplicaIVA = dSMunicipioPIUAplicaIVA;
    }

    @JsonIgnore
    public Boolean getDSMunicipioPIUEsValidoEPS() {
        return this.dSMunicipioPIUEsValidoEPS;
    }
    
    public void setDSMunicipioPIUEsValidoEPS(Boolean dSMunicipioPIUEsValidoEPS) {
        this.dSMunicipioPIUEsValidoEPS = dSMunicipioPIUEsValidoEPS;
    }
}
