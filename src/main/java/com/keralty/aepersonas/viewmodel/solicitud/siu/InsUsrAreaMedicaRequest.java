package com.keralty.aepersonas.viewmodel.solicitud.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.persistence.AreaMedica;
import com.keralty.aepersonas.persistence.oid.AreaMedicaOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Solicitud;

public class InsUsrAreaMedicaRequest {

    @JsonProperty("p_thissolicitud_oid")
    private SolicitudOid solicitudInsUsrAreaMedicapthisSolicitud;
    
    @JsonIgnore
    private Solicitud solicitudInsUsrAreaMedicapthisSolicitudInstance;

    @JsonProperty("p_evcareamedica_oid")
    private AreaMedicaOid solicitudInsUsrAreaMedicapevcAreaMedica;
    
    @JsonIgnore
    private AreaMedica solicitudInsUsrAreaMedicapevcAreaMedicaInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkSolicitudInsUsrAreaMedicapthisSolicitud();
        checkSolicitudInsUsrAreaMedicapevcAreaMedica();
    }

    @JsonIgnore
    public SolicitudOid getSolicitudInsUsrAreaMedicapthisSolicitud() {
        return this.solicitudInsUsrAreaMedicapthisSolicitud;
    }
    
    public void setSolicitudInsUsrAreaMedicapthisSolicitud(SolicitudOid solicitudInsUsrAreaMedicapthisSolicitud) {
        this.solicitudInsUsrAreaMedicapthisSolicitud = solicitudInsUsrAreaMedicapthisSolicitud;
    }

    @JsonIgnore
    public Solicitud getSolicitudInsUsrAreaMedicapthisSolicitudInstance() {
        return this.solicitudInsUsrAreaMedicapthisSolicitudInstance;
    }
    
    public void setSolicitudInsUsrAreaMedicapthisSolicitudInstance(Solicitud solicitudInsUsrAreaMedicapthisSolicitud) {
        this.solicitudInsUsrAreaMedicapthisSolicitudInstance = solicitudInsUsrAreaMedicapthisSolicitud;
        this.solicitudInsUsrAreaMedicapthisSolicitud = solicitudInsUsrAreaMedicapthisSolicitud != null ? solicitudInsUsrAreaMedicapthisSolicitud.getOid() : null;
    }

    private void checkSolicitudInsUsrAreaMedicapthisSolicitud() throws NotNullArgumentException {
        if(this.getSolicitudInsUsrAreaMedicapthisSolicitudInstance() == null || this.getSolicitudInsUsrAreaMedicapthisSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_INSUSRAREAMEDICA, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_INSUSRAREAMEDICA_SOLICITUDINSUSRAREAMEDICAPTHISSOLICITUD, SolicitudConstants.SERV_ALIAS_INSUSRAREAMEDICA, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_INSUSRAREAMEDICA_SOLICITUDINSUSRAREAMEDICAPTHISSOLICITUD);
        }
    }

    @JsonIgnore
    public AreaMedicaOid getSolicitudInsUsrAreaMedicapevcAreaMedica() {
        return this.solicitudInsUsrAreaMedicapevcAreaMedica;
    }
    
    public void setSolicitudInsUsrAreaMedicapevcAreaMedica(AreaMedicaOid solicitudInsUsrAreaMedicapevcAreaMedica) {
        this.solicitudInsUsrAreaMedicapevcAreaMedica = solicitudInsUsrAreaMedicapevcAreaMedica;
    }

    @JsonIgnore
    public AreaMedica getSolicitudInsUsrAreaMedicapevcAreaMedicaInstance() {
        return this.solicitudInsUsrAreaMedicapevcAreaMedicaInstance;
    }
    
    public void setSolicitudInsUsrAreaMedicapevcAreaMedicaInstance(AreaMedica solicitudInsUsrAreaMedicapevcAreaMedica) {
        this.solicitudInsUsrAreaMedicapevcAreaMedicaInstance = solicitudInsUsrAreaMedicapevcAreaMedica;
        this.solicitudInsUsrAreaMedicapevcAreaMedica = solicitudInsUsrAreaMedicapevcAreaMedica != null ? solicitudInsUsrAreaMedicapevcAreaMedica.getOid() : null;
    }

    private void checkSolicitudInsUsrAreaMedicapevcAreaMedica() throws NotNullArgumentException {
        if(this.getSolicitudInsUsrAreaMedicapevcAreaMedicaInstance() == null || this.getSolicitudInsUsrAreaMedicapevcAreaMedicaInstance().isNull()) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_INSUSRAREAMEDICA, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_INSUSRAREAMEDICA_SOLICITUDINSUSRAREAMEDICAPEVCAREAMEDICA, SolicitudConstants.SERV_ALIAS_INSUSRAREAMEDICA, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_INSUSRAREAMEDICA_SOLICITUDINSUSRAREAMEDICAPEVCAREAMEDICA);
        }
    }
}
