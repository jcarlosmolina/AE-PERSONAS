package com.keralty.aepersonas.viewmodel.solicitud.filter;

import java.sql.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.viewmodel.FilterRequest;

public class FSolicitudConsultaRadicado {

    @JsonProperty("vfdesde")
    private Date vfDesde;

    @JsonProperty("vfhasta")
    private Date vfHasta;

    @JsonProperty("vo_tipodoc")
    private TipoIdentificacionOid voTipoDoc;

    @JsonProperty("v_numdoc")
    private String vNumDoc;

    @JsonProperty("vopersona")
    private PersonaOid voPersona;

    public FSolicitudConsultaRadicado() {
        // Default constructor
    }

    @JsonIgnore
    public Date getVfDesde() {
        return this.vfDesde;
    }
    
    public void setVfDesde(Date vfDesde) {
        this.vfDesde = vfDesde;
    }

    @JsonIgnore
    public Date getVfHasta() {
        return this.vfHasta;
    }
    
    public void setVfHasta(Date vfHasta) {
        this.vfHasta = vfHasta;
    }

    @JsonIgnore
    public TipoIdentificacionOid getVoTipoDoc() {
        return this.voTipoDoc;
    }
    
    public void setVoTipoDoc(TipoIdentificacionOid voTipoDoc) {
        this.voTipoDoc = voTipoDoc;
    }

    @JsonIgnore
    public String getVNumDoc() {
        return this.vNumDoc;
    }
    
    public void setVNumDoc(String vNumDoc) {
        this.vNumDoc = vNumDoc;
    }

    @JsonIgnore
    public PersonaOid getVoPersona() {
        return this.voPersona;
    }
    
    public void setVoPersona(PersonaOid voPersona) {
        this.voPersona = voPersona;
    }

    public FilterRequest buildFilterRequest() {
        FilterRequest filterRequest = new FilterRequest();
        filterRequest.setName(SolicitudConstants.FILTER_NAME_FSOLICITUDCONSULTARADICADO);
        filterRequest.addFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDCONSULTARADICADO_VFDESDE, vfDesde);
        filterRequest.addFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDCONSULTARADICADO_VFHASTA, vfHasta);
        filterRequest.addFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDCONSULTARADICADO_VOTIPODOC, voTipoDoc);
        filterRequest.addFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDCONSULTARADICADO_VNUMDOC, vNumDoc);
        filterRequest.addFilterVariable(SolicitudConstants.VAR_NAME_FSOLICITUDCONSULTARADICADO_VOPERSONA, voPersona);
        return filterRequest;
    }
}
