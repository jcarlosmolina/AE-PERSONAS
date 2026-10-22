package com.keralty.aepersonas.viewmodel.direccion.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.oid.TipoDireccionOid;
import com.keralty.aepersonas.global.DireccionConstants;
import com.keralty.aepersonas.viewmodel.FilterRequest;

public class FDireccionPorPErsonaYTipo {

    @JsonProperty("vfper")
    private PersonaOid vfPer;

    @JsonProperty("vftipo")
    private TipoDireccionOid vfTipo;

    public FDireccionPorPErsonaYTipo() {
        // Default constructor
    }

    @JsonIgnore
    public PersonaOid getVfPer() {
        return this.vfPer;
    }
    
    public void setVfPer(PersonaOid vfPer) {
        this.vfPer = vfPer;
    }

    @JsonIgnore
    public TipoDireccionOid getVfTipo() {
        return this.vfTipo;
    }
    
    public void setVfTipo(TipoDireccionOid vfTipo) {
        this.vfTipo = vfTipo;
    }

    public FilterRequest buildFilterRequest() {
        FilterRequest filterRequest = new FilterRequest();
        filterRequest.setName(DireccionConstants.FILTER_NAME_FDIRECCIONPORPERSONAYTIPO);
        filterRequest.addFilterVariable(DireccionConstants.VAR_NAME_FDIRECCIONPORPERSONAYTIPO_VFPER, vfPer);
        filterRequest.addFilterVariable(DireccionConstants.VAR_NAME_FDIRECCIONPORPERSONAYTIPO_VFTIPO, vfTipo);
        return filterRequest;
    }
}
