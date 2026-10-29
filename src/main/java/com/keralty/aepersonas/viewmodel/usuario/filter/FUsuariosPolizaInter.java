package com.keralty.aepersonas.viewmodel.usuario.filter;

import java.sql.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.viewmodel.FilterRequest;

public class FUsuariosPolizaInter {

    @JsonProperty("vfdesde")
    private Date vfDesde;

    @JsonProperty("vfhasta")
    private Date vfHasta;

    @JsonProperty("vftipodoc")
    private TipoIdentificacionOid vfTipoDoc;

    @JsonProperty("vfnumident")
    private String vfNumIdent;

    public FUsuariosPolizaInter() {
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
    public TipoIdentificacionOid getVfTipoDoc() {
        return this.vfTipoDoc;
    }
    
    public void setVfTipoDoc(TipoIdentificacionOid vfTipoDoc) {
        this.vfTipoDoc = vfTipoDoc;
    }

    @JsonIgnore
    public String getVfNumIdent() {
        return this.vfNumIdent;
    }
    
    public void setVfNumIdent(String vfNumIdent) {
        this.vfNumIdent = vfNumIdent;
    }

    public FilterRequest buildFilterRequest() {
        FilterRequest filterRequest = new FilterRequest();
        filterRequest.setName(UsuarioConstants.FILTER_NAME_FUSUARIOSPOLIZAINTER);
        filterRequest.addFilterVariable(UsuarioConstants.VAR_NAME_FUSUARIOSPOLIZAINTER_VFDESDE, vfDesde);
        filterRequest.addFilterVariable(UsuarioConstants.VAR_NAME_FUSUARIOSPOLIZAINTER_VFHASTA, vfHasta);
        filterRequest.addFilterVariable(UsuarioConstants.VAR_NAME_FUSUARIOSPOLIZAINTER_VFTIPODOC, vfTipoDoc);
        filterRequest.addFilterVariable(UsuarioConstants.VAR_NAME_FUSUARIOSPOLIZAINTER_VFNUMIDENT, vfNumIdent);
        return filterRequest;
    }
}
