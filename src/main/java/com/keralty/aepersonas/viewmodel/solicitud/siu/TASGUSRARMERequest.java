package com.keralty.aepersonas.viewmodel.solicitud.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.persistence.AreaMedica;
import com.keralty.aepersonas.persistence.oid.AreaMedicaOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Solicitud;

public class TASGUSRARMERequest {

    @JsonProperty("p_thissolicitud_oid")
    private SolicitudOid solicitudTASGUSRARMEpthisSolicitud;
    
    @JsonIgnore
    private Solicitud solicitudTASGUSRARMEpthisSolicitudInstance;

    @JsonProperty("ptareamedica_oid")
    private AreaMedicaOid solicitudTASGUSRARMEptAreaMedica;
    
    @JsonIgnore
    private AreaMedica solicitudTASGUSRARMEptAreaMedicaInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkSolicitudTASGUSRARMEpthisSolicitud();
        checkSolicitudTASGUSRARMEptAreaMedica();
    }

    @JsonIgnore
    public SolicitudOid getSolicitudTASGUSRARMEpthisSolicitud() {
        return this.solicitudTASGUSRARMEpthisSolicitud;
    }
    
    public void setSolicitudTASGUSRARMEpthisSolicitud(SolicitudOid solicitudTASGUSRARMEpthisSolicitud) {
        this.solicitudTASGUSRARMEpthisSolicitud = solicitudTASGUSRARMEpthisSolicitud;
    }

    @JsonIgnore
    public Solicitud getSolicitudTASGUSRARMEpthisSolicitudInstance() {
        return this.solicitudTASGUSRARMEpthisSolicitudInstance;
    }
    
    public void setSolicitudTASGUSRARMEpthisSolicitudInstance(Solicitud solicitudTASGUSRARMEpthisSolicitud) {
        this.solicitudTASGUSRARMEpthisSolicitudInstance = solicitudTASGUSRARMEpthisSolicitud;
        this.solicitudTASGUSRARMEpthisSolicitud = solicitudTASGUSRARMEpthisSolicitud != null ? solicitudTASGUSRARMEpthisSolicitud.getOid() : null;
    }

    private void checkSolicitudTASGUSRARMEpthisSolicitud() throws NotNullArgumentException {
        if(this.getSolicitudTASGUSRARMEpthisSolicitudInstance() == null || this.getSolicitudTASGUSRARMEpthisSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_TASGUSRARME, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_TASGUSRARME_SOLICITUDTASGUSRARMEPTHISSOLICITUD, SolicitudConstants.SERV_ALIAS_TASGUSRARME, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_TASGUSRARME_SOLICITUDTASGUSRARMEPTHISSOLICITUD);
        }
    }

    @JsonIgnore
    public AreaMedicaOid getSolicitudTASGUSRARMEptAreaMedica() {
        return this.solicitudTASGUSRARMEptAreaMedica;
    }
    
    public void setSolicitudTASGUSRARMEptAreaMedica(AreaMedicaOid solicitudTASGUSRARMEptAreaMedica) {
        this.solicitudTASGUSRARMEptAreaMedica = solicitudTASGUSRARMEptAreaMedica;
    }

    @JsonIgnore
    public AreaMedica getSolicitudTASGUSRARMEptAreaMedicaInstance() {
        return this.solicitudTASGUSRARMEptAreaMedicaInstance;
    }
    
    public void setSolicitudTASGUSRARMEptAreaMedicaInstance(AreaMedica solicitudTASGUSRARMEptAreaMedica) {
        this.solicitudTASGUSRARMEptAreaMedicaInstance = solicitudTASGUSRARMEptAreaMedica;
        this.solicitudTASGUSRARMEptAreaMedica = solicitudTASGUSRARMEptAreaMedica != null ? solicitudTASGUSRARMEptAreaMedica.getOid() : null;
    }

    private void checkSolicitudTASGUSRARMEptAreaMedica() throws NotNullArgumentException {
        if(this.getSolicitudTASGUSRARMEptAreaMedicaInstance() == null || this.getSolicitudTASGUSRARMEptAreaMedicaInstance().isNull()) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_TASGUSRARME, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_TASGUSRARME_SOLICITUDTASGUSRARMEPTAREAMEDICA, SolicitudConstants.SERV_ALIAS_TASGUSRARME, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_TASGUSRARME_SOLICITUDTASGUSRARMEPTAREAMEDICA);
        }
    }
}
