package com.keralty.aepersonas.viewmodel.areamedica.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.AreaMedicaConstants;
import com.keralty.aepersonas.persistence.AreaMedica;
import com.keralty.aepersonas.persistence.oid.AreaMedicaOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Solicitud;

public class InsUsrAreaMedicaRequest {

    @JsonProperty("p_thisareamedica_oid")
    private AreaMedicaOid areaMedicaInsUsrAreaMedicapthisAreaMedica;
    
    @JsonIgnore
    private AreaMedica areaMedicaInsUsrAreaMedicapthisAreaMedicaInstance;

    @JsonProperty("p_evcsolicitud_oid")
    private SolicitudOid areaMedicaInsUsrAreaMedicapevcSolicitud;
    
    @JsonIgnore
    private Solicitud areaMedicaInsUsrAreaMedicapevcSolicitudInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkAreaMedicaInsUsrAreaMedicapthisAreaMedica();
        checkAreaMedicaInsUsrAreaMedicapevcSolicitud();
    }

    @JsonIgnore
    public AreaMedicaOid getAreaMedicaInsUsrAreaMedicapthisAreaMedica() {
        return this.areaMedicaInsUsrAreaMedicapthisAreaMedica;
    }
    
    public void setAreaMedicaInsUsrAreaMedicapthisAreaMedica(AreaMedicaOid areaMedicaInsUsrAreaMedicapthisAreaMedica) {
        this.areaMedicaInsUsrAreaMedicapthisAreaMedica = areaMedicaInsUsrAreaMedicapthisAreaMedica;
    }

    @JsonIgnore
    public AreaMedica getAreaMedicaInsUsrAreaMedicapthisAreaMedicaInstance() {
        return this.areaMedicaInsUsrAreaMedicapthisAreaMedicaInstance;
    }
    
    public void setAreaMedicaInsUsrAreaMedicapthisAreaMedicaInstance(AreaMedica areaMedicaInsUsrAreaMedicapthisAreaMedica) {
        this.areaMedicaInsUsrAreaMedicapthisAreaMedicaInstance = areaMedicaInsUsrAreaMedicapthisAreaMedica;
        this.areaMedicaInsUsrAreaMedicapthisAreaMedica = areaMedicaInsUsrAreaMedicapthisAreaMedica != null ? areaMedicaInsUsrAreaMedicapthisAreaMedica.getOid() : null;
    }

    private void checkAreaMedicaInsUsrAreaMedicapthisAreaMedica() throws NotNullArgumentException {
        if(this.getAreaMedicaInsUsrAreaMedicapthisAreaMedicaInstance() == null || this.getAreaMedicaInsUsrAreaMedicapthisAreaMedicaInstance().isNull()) {
            throw new NotNullArgumentException(AreaMedicaConstants.SERV_ID_INSUSRAREAMEDICA, AreaMedicaConstants.CLASS_ID, AreaMedicaConstants.ARG_ID_INSUSRAREAMEDICA_AREAMEDICAINSUSRAREAMEDICAPTHISAREAMEDICA, AreaMedicaConstants.SERV_ALIAS_INSUSRAREAMEDICA, AreaMedicaConstants.CLASS_ALIAS, AreaMedicaConstants.ARG_ALIAS_INSUSRAREAMEDICA_AREAMEDICAINSUSRAREAMEDICAPTHISAREAMEDICA);
        }
    }

    @JsonIgnore
    public SolicitudOid getAreaMedicaInsUsrAreaMedicapevcSolicitud() {
        return this.areaMedicaInsUsrAreaMedicapevcSolicitud;
    }
    
    public void setAreaMedicaInsUsrAreaMedicapevcSolicitud(SolicitudOid areaMedicaInsUsrAreaMedicapevcSolicitud) {
        this.areaMedicaInsUsrAreaMedicapevcSolicitud = areaMedicaInsUsrAreaMedicapevcSolicitud;
    }

    @JsonIgnore
    public Solicitud getAreaMedicaInsUsrAreaMedicapevcSolicitudInstance() {
        return this.areaMedicaInsUsrAreaMedicapevcSolicitudInstance;
    }
    
    public void setAreaMedicaInsUsrAreaMedicapevcSolicitudInstance(Solicitud areaMedicaInsUsrAreaMedicapevcSolicitud) {
        this.areaMedicaInsUsrAreaMedicapevcSolicitudInstance = areaMedicaInsUsrAreaMedicapevcSolicitud;
        this.areaMedicaInsUsrAreaMedicapevcSolicitud = areaMedicaInsUsrAreaMedicapevcSolicitud != null ? areaMedicaInsUsrAreaMedicapevcSolicitud.getOid() : null;
    }

    private void checkAreaMedicaInsUsrAreaMedicapevcSolicitud() throws NotNullArgumentException {
        if(this.getAreaMedicaInsUsrAreaMedicapevcSolicitudInstance() == null || this.getAreaMedicaInsUsrAreaMedicapevcSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(AreaMedicaConstants.SERV_ID_INSUSRAREAMEDICA, AreaMedicaConstants.CLASS_ID, AreaMedicaConstants.ARG_ID_INSUSRAREAMEDICA_AREAMEDICAINSUSRAREAMEDICAPEVCSOLICITUD, AreaMedicaConstants.SERV_ALIAS_INSUSRAREAMEDICA, AreaMedicaConstants.CLASS_ALIAS, AreaMedicaConstants.ARG_ALIAS_INSUSRAREAMEDICA_AREAMEDICAINSUSRAREAMEDICAPEVCSOLICITUD);
        }
    }
}
