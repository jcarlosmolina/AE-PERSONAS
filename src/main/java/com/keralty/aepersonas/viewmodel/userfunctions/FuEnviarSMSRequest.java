package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.oid.PlantillaEmailOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.PlantillaEmail;
import com.keralty.aepersonas.persistence.Solicitud;
public class FuEnviarSMSRequest {

    @JsonProperty("pfsolicitud")
    private SolicitudOid pfSolicitud;

    @JsonIgnore
    private Solicitud pfSolicitudInstance;

    @JsonProperty("pfnumcelulcar")
    private String pfNumCelulcar;

    @JsonProperty("pfplantilla")
    private PlantillaEmailOid pfPlantilla;

    @JsonIgnore
    private PlantillaEmail pfPlantillaInstance;

    public FuEnviarSMSRequest() {
        // Default constructor
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
    @JsonIgnore
    public String getPfNumCelulcar() {
        return this.pfNumCelulcar;
    }
    
    public void setPfNumCelulcar(String pfNumCelulcar) {
        this.pfNumCelulcar = pfNumCelulcar;
    }
    @JsonIgnore
    public PlantillaEmailOid getPfPlantilla() {
        return this.pfPlantilla;
    }
    
    public void setPfPlantilla(PlantillaEmailOid pfPlantilla) {
        this.pfPlantilla = pfPlantilla;
    }

    @JsonIgnore
    public PlantillaEmail getPfPlantillaInstance() {
        if (this.pfPlantillaInstance == null)
            this.pfPlantillaInstance = new PlantillaEmail();
        return this.pfPlantillaInstance;
    }
    
    public void setPfPlantillaInstance(PlantillaEmail pfPlantilla) {
        this.pfPlantillaInstance = pfPlantilla;
        this.pfPlantilla = pfPlantilla != null ? pfPlantilla.getOid() : null;
    }
}
