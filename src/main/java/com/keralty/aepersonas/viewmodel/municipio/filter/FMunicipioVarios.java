package com.keralty.aepersonas.viewmodel.municipio.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.global.MunicipioConstants;
import com.keralty.aepersonas.viewmodel.FilterRequest;

public class FMunicipioVarios {

    @JsonProperty("vo_departamento")
    private DepartamentoOid voDepartamento;

    @JsonProperty("v_descripcion")
    private String vDescripcion;

    @JsonProperty("v_esvalidoeps")
    private Boolean vEsValidoEPS;

    @JsonProperty("v_aplicaiva")
    private Boolean vAplicaIVA;

    public FMunicipioVarios() {
        // Default constructor
    }

    @JsonIgnore
    public DepartamentoOid getVoDepartamento() {
        return this.voDepartamento;
    }
    
    public void setVoDepartamento(DepartamentoOid voDepartamento) {
        this.voDepartamento = voDepartamento;
    }

    @JsonIgnore
    public String getVDescripcion() {
        return this.vDescripcion;
    }
    
    public void setVDescripcion(String vDescripcion) {
        this.vDescripcion = vDescripcion;
    }

    @JsonIgnore
    public Boolean getVEsValidoEPS() {
        return this.vEsValidoEPS;
    }
    
    public void setVEsValidoEPS(Boolean vEsValidoEPS) {
        this.vEsValidoEPS = vEsValidoEPS;
    }

    @JsonIgnore
    public Boolean getVAplicaIVA() {
        return this.vAplicaIVA;
    }
    
    public void setVAplicaIVA(Boolean vAplicaIVA) {
        this.vAplicaIVA = vAplicaIVA;
    }

    public FilterRequest buildFilterRequest() {
        FilterRequest filterRequest = new FilterRequest();
        filterRequest.setName(MunicipioConstants.FILTER_NAME_FMUNICIPIOVARIOS);
        filterRequest.addFilterVariable(MunicipioConstants.VAR_NAME_FMUNICIPIOVARIOS_VODEPARTAMENTO, voDepartamento);
        filterRequest.addFilterVariable(MunicipioConstants.VAR_NAME_FMUNICIPIOVARIOS_VDESCRIPCION, vDescripcion);
        filterRequest.addFilterVariable(MunicipioConstants.VAR_NAME_FMUNICIPIOVARIOS_VESVALIDOEPS, vEsValidoEPS);
        filterRequest.addFilterVariable(MunicipioConstants.VAR_NAME_FMUNICIPIOVARIOS_VAPLICAIVA, vAplicaIVA);
        return filterRequest;
    }
}
