package com.keralty.aepersonas.viewmodel.solicitud.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.viewmodel.FilterRequest;

public class IFSolicitudNumSolicitud {

    @JsonProperty("v_numsolicitud")
    private String vNumSolicitud;

    public IFSolicitudNumSolicitud() {
        // Default constructor
    }

    @JsonIgnore
    public String getVNumSolicitud() {
        return this.vNumSolicitud;
    }
    
    public void setVNumSolicitud(String vNumSolicitud) {
        this.vNumSolicitud = vNumSolicitud;
    }

    public FilterRequest buildFilterRequest() {
        FilterRequest filterRequest = new FilterRequest();
        filterRequest.setName(SolicitudConstants.FILTER_NAME_IFSOLICITUDNUMSOLICITUD);
        filterRequest.addFilterVariable(SolicitudConstants.VAR_NAME_IFSOLICITUDNUMSOLICITUD_VNUMSOLICITUD, vNumSolicitud);
        return filterRequest;
    }
}
