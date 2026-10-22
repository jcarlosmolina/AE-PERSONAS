package com.keralty.aepersonas.viewmodel.persona.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.viewmodel.FilterRequest;

public class IFPersonaPorTipoYNumDoc {

    @JsonProperty("v_nomcorto")
    private String vNomCorto;

    @JsonProperty("v_numdoc")
    private String vNumDoc;

    public IFPersonaPorTipoYNumDoc() {
        // Default constructor
    }

    @JsonIgnore
    public String getVNomCorto() {
        return this.vNomCorto;
    }
    
    public void setVNomCorto(String vNomCorto) {
        this.vNomCorto = vNomCorto;
    }

    @JsonIgnore
    public String getVNumDoc() {
        return this.vNumDoc;
    }
    
    public void setVNumDoc(String vNumDoc) {
        this.vNumDoc = vNumDoc;
    }

    public FilterRequest buildFilterRequest() {
        FilterRequest filterRequest = new FilterRequest();
        filterRequest.setName(PersonaConstants.FILTER_NAME_IFPERSONAPORTIPOYNUMDOC);
        filterRequest.addFilterVariable(PersonaConstants.VAR_NAME_IFPERSONAPORTIPOYNUMDOC_VNOMCORTO, vNomCorto);
        filterRequest.addFilterVariable(PersonaConstants.VAR_NAME_IFPERSONAPORTIPOYNUMDOC_VNUMDOC, vNumDoc);
        return filterRequest;
    }
}
