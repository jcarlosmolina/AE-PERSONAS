package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Solicitud;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneDeserializer;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneSerializer;
import java.sql.Date;
public class FuValidarDominioIncompatiblesRequest {

    @JsonProperty("pftipoid")
    private String pfTipoId;

    @JsonProperty("pfnumid")
    private String pfNumId;

    @JsonProperty("pffechainiciovigencia")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date pfFechaInicioVigencia;

    @JsonProperty("pfsolicitud")
    private SolicitudOid pfSolicitud;

    @JsonIgnore
    private Solicitud pfSolicitudInstance;

    public FuValidarDominioIncompatiblesRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public String getPfTipoId() {
        return this.pfTipoId;
    }
    
    public void setPfTipoId(String pfTipoId) {
        this.pfTipoId = pfTipoId;
    }
    @JsonIgnore
    public String getPfNumId() {
        return this.pfNumId;
    }
    
    public void setPfNumId(String pfNumId) {
        this.pfNumId = pfNumId;
    }
    @JsonIgnore
    public Date getPfFechaInicioVigencia() {
        return this.pfFechaInicioVigencia;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setPfFechaInicioVigencia(Date pfFechaInicioVigencia) {
        this.pfFechaInicioVigencia = pfFechaInicioVigencia;
    }
    @JsonIgnore
    public SolicitudOid getPfSolicitud() {
        return this.pfSolicitud;
    }
    
    public void setPfSolicitud(SolicitudOid pfSolicitud) {
        this.pfSolicitud = pfSolicitud;
    }

    @JsonIgnore
    public Solicitud getPfSolicitudInstance() {
        if (this.pfSolicitudInstance == null)
            this.pfSolicitudInstance = new Solicitud();
        return this.pfSolicitudInstance;
    }
    
    public void setPfSolicitudInstance(Solicitud pfSolicitud) {
        this.pfSolicitudInstance = pfSolicitud;
        this.pfSolicitud = pfSolicitud != null ? pfSolicitud.getOid() : null;
    }
}
