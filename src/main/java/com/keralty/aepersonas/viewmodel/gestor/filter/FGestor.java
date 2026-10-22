package com.keralty.aepersonas.viewmodel.gestor.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.keralty.aepersonas.global.GestorConstants;
import com.keralty.aepersonas.viewmodel.FilterRequest;

public class FGestor {

    @JsonProperty("vfprimernombre")
    private String vfPrimerNombre;

    @JsonProperty("vfsegundonombre")
    private String vfSegundoNombre;

    @JsonProperty("vfprimerape")
    private String vfPrimerApe;

    @JsonProperty("vfsegundoape")
    private String vfSegundoApe;

    public FGestor() {
        // Default constructor
    }

    @JsonIgnore
    public String getVfPrimerNombre() {
        return this.vfPrimerNombre;
    }
    
    public void setVfPrimerNombre(String vfPrimerNombre) {
        this.vfPrimerNombre = vfPrimerNombre;
    }

    @JsonIgnore
    public String getVfSegundoNombre() {
        return this.vfSegundoNombre;
    }
    
    public void setVfSegundoNombre(String vfSegundoNombre) {
        this.vfSegundoNombre = vfSegundoNombre;
    }

    @JsonIgnore
    public String getVfPrimerApe() {
        return this.vfPrimerApe;
    }
    
    public void setVfPrimerApe(String vfPrimerApe) {
        this.vfPrimerApe = vfPrimerApe;
    }

    @JsonIgnore
    public String getVfSegundoApe() {
        return this.vfSegundoApe;
    }
    
    public void setVfSegundoApe(String vfSegundoApe) {
        this.vfSegundoApe = vfSegundoApe;
    }

    public FilterRequest buildFilterRequest() {
        FilterRequest filterRequest = new FilterRequest();
        filterRequest.setName(GestorConstants.FILTER_NAME_FGESTOR);
        filterRequest.addFilterVariable(GestorConstants.VAR_NAME_FGESTOR_VFPRIMERNOMBRE, vfPrimerNombre);
        filterRequest.addFilterVariable(GestorConstants.VAR_NAME_FGESTOR_VFSEGUNDONOMBRE, vfSegundoNombre);
        filterRequest.addFilterVariable(GestorConstants.VAR_NAME_FGESTOR_VFPRIMERAPE, vfPrimerApe);
        filterRequest.addFilterVariable(GestorConstants.VAR_NAME_FGESTOR_VFSEGUNDOAPE, vfSegundoApe);
        return filterRequest;
    }
}
