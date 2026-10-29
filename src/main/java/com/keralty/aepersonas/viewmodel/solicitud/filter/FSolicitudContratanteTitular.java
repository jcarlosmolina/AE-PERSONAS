package com.keralty.aepersonas.viewmodel.solicitud.filter;

import java.sql.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.viewmodel.FilterRequest;

public class FSolicitudContratanteTitular {

    @JsonProperty("vo_persona")
    private PersonaOid voPersona;

    @JsonProperty("v_fini")
    private Date vFIni;

    @JsonProperty("v_ffin")
    private Date vFFin;

    public FSolicitudContratanteTitular() {
        // Default constructor
    }

    @JsonIgnore
    public PersonaOid getVoPersona() {
        return this.voPersona;
    }
    
    public void setVoPersona(PersonaOid voPersona) {
        this.voPersona = voPersona;
    }

    @JsonIgnore
    public Date getVFIni() {
        return this.vFIni;
    }
    
    public void setVFIni(Date vFIni) {
        this.vFIni = vFIni;
    }

    @JsonIgnore
    public Date getVFFin() {
        return this.vFFin;
    }
    
    public void setVFFin(Date vFFin) {
        this.vFFin = vFFin;
    }

    public FilterRequest buildFilterRequest() {
        FilterRequest filterRequest = new FilterRequest();
        filterRequest.setName(SolicitudConstants.FILTER_NAME_FSOLICITUDCONTRATANTETITULAR);
        filterRequest.addFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDCONTRATANTETITULAR_VOPERSONA, voPersona);
        filterRequest.addFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDCONTRATANTETITULAR_VFINI, vFIni);
        filterRequest.addFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDCONTRATANTETITULAR_VFFIN, vFFin);
        return filterRequest;
    }
}
