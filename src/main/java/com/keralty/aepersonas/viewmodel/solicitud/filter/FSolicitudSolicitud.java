package com.keralty.aepersonas.viewmodel.solicitud.filter;

import java.sql.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.viewmodel.FilterRequest;

public class FSolicitudSolicitud {

    @JsonProperty("v_numsolicitud")
    private String vNumSolicitud;

    @JsonProperty("v_fini")
    private Date vFIni;

    @JsonProperty("v_ffin")
    private Date vFFin;

    public FSolicitudSolicitud() {
        // Default constructor
    }

    @JsonIgnore
    public String getVNumSolicitud() {
        return this.vNumSolicitud;
    }
    
    public void setVNumSolicitud(String vNumSolicitud) {
        this.vNumSolicitud = vNumSolicitud;
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
        filterRequest.setName(SolicitudConstants.FILTER_NAME_FSOLICITUDSOLICITUD);
        filterRequest.addFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSOLICITUD_VNUMSOLICITUD, vNumSolicitud);
        filterRequest.addFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSOLICITUD_VFINI, vFIni);
        filterRequest.addFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDSOLICITUD_VFFIN, vFFin);
        return filterRequest;
    }
}
