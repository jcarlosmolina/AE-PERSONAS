package com.keralty.aepersonas.viewmodel.solicitud.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Solicitud;

public class TCAMBIARESTADODOCRequest {

    @JsonProperty("p_thissolicitud_oid")
    private SolicitudOid solicitudTCAMBIARESTADODOCpthisSolicitud;
    
    @JsonIgnore
    private Solicitud solicitudTCAMBIARESTADODOCpthisSolicitudInstance;

    @JsonProperty("ptestadodoc")
    private Long solicitudTCAMBIARESTADODOCptEstadoDoc;

    @JsonProperty("preconditionId")
    private String preconditionId;

    public void checkArguments() throws NotNullArgumentException {
        checkSolicitudTCAMBIARESTADODOCpthisSolicitud();
        checkSolicitudTCAMBIARESTADODOCptEstadoDoc();
    }

    @JsonIgnore
    public SolicitudOid getSolicitudTCAMBIARESTADODOCpthisSolicitud() {
        return this.solicitudTCAMBIARESTADODOCpthisSolicitud;
    }
    
    public void setSolicitudTCAMBIARESTADODOCpthisSolicitud(SolicitudOid solicitudTCAMBIARESTADODOCpthisSolicitud) {
        this.solicitudTCAMBIARESTADODOCpthisSolicitud = solicitudTCAMBIARESTADODOCpthisSolicitud;
    }

    @JsonIgnore
    public Solicitud getSolicitudTCAMBIARESTADODOCpthisSolicitudInstance() {
        return this.solicitudTCAMBIARESTADODOCpthisSolicitudInstance;
    }
    
    public void setSolicitudTCAMBIARESTADODOCpthisSolicitudInstance(Solicitud solicitudTCAMBIARESTADODOCpthisSolicitud) {
        this.solicitudTCAMBIARESTADODOCpthisSolicitudInstance = solicitudTCAMBIARESTADODOCpthisSolicitud;
        this.solicitudTCAMBIARESTADODOCpthisSolicitud = solicitudTCAMBIARESTADODOCpthisSolicitud != null ? solicitudTCAMBIARESTADODOCpthisSolicitud.getOid() : null;
    }

    private void checkSolicitudTCAMBIARESTADODOCpthisSolicitud() throws NotNullArgumentException {
        if(this.getSolicitudTCAMBIARESTADODOCpthisSolicitudInstance() == null || this.getSolicitudTCAMBIARESTADODOCpthisSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_TCAMBIARESTADODOC, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_TCAMBIARESTADODOC_SOLICITUDTCAMBIARESTADODOCPTHISSOLICITUD, SolicitudConstants.SERV_ALIAS_TCAMBIARESTADODOC, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_TCAMBIARESTADODOC_SOLICITUDTCAMBIARESTADODOCPTHISSOLICITUD);
        }
    }

    @JsonIgnore
    public Long getSolicitudTCAMBIARESTADODOCptEstadoDoc() {
        return this.solicitudTCAMBIARESTADODOCptEstadoDoc;
    }
    
    public void setSolicitudTCAMBIARESTADODOCptEstadoDoc(Long solicitudTCAMBIARESTADODOCptEstadoDoc) {
        this.solicitudTCAMBIARESTADODOCptEstadoDoc = solicitudTCAMBIARESTADODOCptEstadoDoc;
    }

    private void checkSolicitudTCAMBIARESTADODOCptEstadoDoc() throws NotNullArgumentException {
        if(this.getSolicitudTCAMBIARESTADODOCptEstadoDoc() == null) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_TCAMBIARESTADODOC, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_TCAMBIARESTADODOC_SOLICITUDTCAMBIARESTADODOCPTESTADODOC, SolicitudConstants.SERV_ALIAS_TCAMBIARESTADODOC, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_TCAMBIARESTADODOC_SOLICITUDTCAMBIARESTADODOCPTESTADODOC);
        }
    }

    @JsonIgnore
    public String getPreconditionId() {
        return this.preconditionId;
    }
    
    public void setPreconditionId(String preconditionId) {
        this.preconditionId = preconditionId;
    }
}
