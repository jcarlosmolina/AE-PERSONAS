package com.keralty.aepersonas.viewmodel.mesadeapoyo.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.keralty.aepersonas.global.MesaDeApoyoConstants;
import com.keralty.aepersonas.viewmodel.FilterRequest;

public class FMesaDeApoyo {

    @JsonProperty("vfprimernombre")
    private String vfPrimerNombre;

    @JsonProperty("vfsegundonombre")
    private String vfSegundoNombre;

    @JsonProperty("vfprimerape")
    private String vfPrimerApe;

    @JsonProperty("vfsegundoape")
    private String vfSegundoApe;

    public FMesaDeApoyo() {
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
        filterRequest.setName(MesaDeApoyoConstants.FILTER_NAME_FMESADEAPOYO);
        filterRequest.addFilterVariable(MesaDeApoyoConstants.VAR_NAME_FMESADEAPOYO_VFPRIMERNOMBRE, vfPrimerNombre);
        filterRequest.addFilterVariable(MesaDeApoyoConstants.VAR_NAME_FMESADEAPOYO_VFSEGUNDONOMBRE, vfSegundoNombre);
        filterRequest.addFilterVariable(MesaDeApoyoConstants.VAR_NAME_FMESADEAPOYO_VFPRIMERAPE, vfPrimerApe);
        filterRequest.addFilterVariable(MesaDeApoyoConstants.VAR_NAME_FMESADEAPOYO_VFSEGUNDOAPE, vfSegundoApe);
        return filterRequest;
    }
}
