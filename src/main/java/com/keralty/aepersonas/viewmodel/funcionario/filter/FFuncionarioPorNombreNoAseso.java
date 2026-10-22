package com.keralty.aepersonas.viewmodel.funcionario.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.keralty.aepersonas.global.FuncionarioConstants;
import com.keralty.aepersonas.viewmodel.FilterRequest;

public class FFuncionarioPorNombreNoAseso {

    @JsonProperty("vfprinom")
    private String vfPriNom;

    @JsonProperty("vfsegnom")
    private String vfSegNom;

    @JsonProperty("vfpriape")
    private String vfPriApe;

    @JsonProperty("vfsegape")
    private String vfSegApe;

    public FFuncionarioPorNombreNoAseso() {
        // Default constructor
    }

    @JsonIgnore
    public String getVfPriNom() {
        return this.vfPriNom;
    }
    
    public void setVfPriNom(String vfPriNom) {
        this.vfPriNom = vfPriNom;
    }

    @JsonIgnore
    public String getVfSegNom() {
        return this.vfSegNom;
    }
    
    public void setVfSegNom(String vfSegNom) {
        this.vfSegNom = vfSegNom;
    }

    @JsonIgnore
    public String getVfPriApe() {
        return this.vfPriApe;
    }
    
    public void setVfPriApe(String vfPriApe) {
        this.vfPriApe = vfPriApe;
    }

    @JsonIgnore
    public String getVfSegApe() {
        return this.vfSegApe;
    }
    
    public void setVfSegApe(String vfSegApe) {
        this.vfSegApe = vfSegApe;
    }

    public FilterRequest buildFilterRequest() {
        FilterRequest filterRequest = new FilterRequest();
        filterRequest.setName(FuncionarioConstants.FILTER_NAME_FFUNCIONARIOPORNOMBRENOASESO);
        filterRequest.addFilterVariable(FuncionarioConstants.VAR_NAME_FFUNCIONARIOPORNOMBRENOASESO_VFPRINOM, vfPriNom);
        filterRequest.addFilterVariable(FuncionarioConstants.VAR_NAME_FFUNCIONARIOPORNOMBRENOASESO_VFSEGNOM, vfSegNom);
        filterRequest.addFilterVariable(FuncionarioConstants.VAR_NAME_FFUNCIONARIOPORNOMBRENOASESO_VFPRIAPE, vfPriApe);
        filterRequest.addFilterVariable(FuncionarioConstants.VAR_NAME_FFUNCIONARIOPORNOMBRENOASESO_VFSEGAPE, vfSegApe);
        return filterRequest;
    }
}
