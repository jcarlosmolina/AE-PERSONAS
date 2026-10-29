package com.keralty.aepersonas.viewmodel.solicitud.filter;

import java.sql.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.viewmodel.FilterRequest;

public class FSolicitudLegalizaComisiones {

    @JsonProperty("v_finicio")
    private Date vFInicio;

    @JsonProperty("v_ffin")
    private Date vFFin;

    public FSolicitudLegalizaComisiones() {
        // Default constructor
    }

    @JsonIgnore
    public Date getVFInicio() {
        return this.vFInicio;
    }
    
    public void setVFInicio(Date vFInicio) {
        this.vFInicio = vFInicio;
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
        filterRequest.setName(SolicitudConstants.FILTER_NAME_FSOLICITUDLEGALIZACOMISIONES);
        filterRequest.addFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDLEGALIZACOMISIONES_VFINICIO, vFInicio);
        filterRequest.addFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDLEGALIZACOMISIONES_VFFIN, vFFin);
        return filterRequest;
    }
}
