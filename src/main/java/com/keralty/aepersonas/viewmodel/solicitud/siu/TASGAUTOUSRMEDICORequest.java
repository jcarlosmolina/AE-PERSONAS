package com.keralty.aepersonas.viewmodel.solicitud.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.persistence.AreaMedica;
import com.keralty.aepersonas.persistence.oid.AreaMedicaOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Solicitud;

public class TASGAUTOUSRMEDICORequest {

    @JsonProperty("p_thissolicitud_oid")
    private SolicitudOid solicitudTASGAUTOUSRMEDICOpthisSolicitud;
    
    @JsonIgnore
    private Solicitud solicitudTASGAUTOUSRMEDICOpthisSolicitudInstance;

    @JsonProperty("ptareamedica_oid")
    private AreaMedicaOid solicitudTASGAUTOUSRMEDICOptAreaMedica;
    
    @JsonIgnore
    private AreaMedica solicitudTASGAUTOUSRMEDICOptAreaMedicaInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkSolicitudTASGAUTOUSRMEDICOpthisSolicitud();
    }

    @JsonIgnore
    public SolicitudOid getSolicitudTASGAUTOUSRMEDICOpthisSolicitud() {
        return this.solicitudTASGAUTOUSRMEDICOpthisSolicitud;
    }
    
    public void setSolicitudTASGAUTOUSRMEDICOpthisSolicitud(SolicitudOid solicitudTASGAUTOUSRMEDICOpthisSolicitud) {
        this.solicitudTASGAUTOUSRMEDICOpthisSolicitud = solicitudTASGAUTOUSRMEDICOpthisSolicitud;
    }

    @JsonIgnore
    public Solicitud getSolicitudTASGAUTOUSRMEDICOpthisSolicitudInstance() {
        return this.solicitudTASGAUTOUSRMEDICOpthisSolicitudInstance;
    }
    
    public void setSolicitudTASGAUTOUSRMEDICOpthisSolicitudInstance(Solicitud solicitudTASGAUTOUSRMEDICOpthisSolicitud) {
        this.solicitudTASGAUTOUSRMEDICOpthisSolicitudInstance = solicitudTASGAUTOUSRMEDICOpthisSolicitud;
        this.solicitudTASGAUTOUSRMEDICOpthisSolicitud = solicitudTASGAUTOUSRMEDICOpthisSolicitud != null ? solicitudTASGAUTOUSRMEDICOpthisSolicitud.getOid() : null;
    }

    private void checkSolicitudTASGAUTOUSRMEDICOpthisSolicitud() throws NotNullArgumentException {
        if(this.getSolicitudTASGAUTOUSRMEDICOpthisSolicitudInstance() == null || this.getSolicitudTASGAUTOUSRMEDICOpthisSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_TASGAUTOUSRMEDICO, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_TASGAUTOUSRMEDICO_SOLICITUDTASGAUTOUSRMEDICOPTHISSOLICITUD, SolicitudConstants.SERV_ALIAS_TASGAUTOUSRMEDICO, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_TASGAUTOUSRMEDICO_SOLICITUDTASGAUTOUSRMEDICOPTHISSOLICITUD);
        }
    }

    @JsonIgnore
    public AreaMedicaOid getSolicitudTASGAUTOUSRMEDICOptAreaMedica() {
        return this.solicitudTASGAUTOUSRMEDICOptAreaMedica;
    }
    
    public void setSolicitudTASGAUTOUSRMEDICOptAreaMedica(AreaMedicaOid solicitudTASGAUTOUSRMEDICOptAreaMedica) {
        this.solicitudTASGAUTOUSRMEDICOptAreaMedica = solicitudTASGAUTOUSRMEDICOptAreaMedica;
    }

    @JsonIgnore
    public AreaMedica getSolicitudTASGAUTOUSRMEDICOptAreaMedicaInstance() {
        return this.solicitudTASGAUTOUSRMEDICOptAreaMedicaInstance;
    }
    
    public void setSolicitudTASGAUTOUSRMEDICOptAreaMedicaInstance(AreaMedica solicitudTASGAUTOUSRMEDICOptAreaMedica) {
        this.solicitudTASGAUTOUSRMEDICOptAreaMedicaInstance = solicitudTASGAUTOUSRMEDICOptAreaMedica;
        this.solicitudTASGAUTOUSRMEDICOptAreaMedica = solicitudTASGAUTOUSRMEDICOptAreaMedica != null ? solicitudTASGAUTOUSRMEDICOptAreaMedica.getOid() : null;
    }
}
