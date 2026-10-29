package com.keralty.aepersonas.viewmodel.solicitud.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.SolicitudConstants;
import com.keralty.aepersonas.persistence.Funcionario;
import com.keralty.aepersonas.persistence.oid.FuncionarioOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Solicitud;

public class TASGAUTOUSRAFILIRequest {

    @JsonProperty("p_thissolicitud_oid")
    private SolicitudOid solicitudTASGAUTOUSRAFILIpthisSolicitud;
    
    @JsonIgnore
    private Solicitud solicitudTASGAUTOUSRAFILIpthisSolicitudInstance;

    @JsonProperty("ptfuncionario_oid")
    private FuncionarioOid solicitudTASGAUTOUSRAFILIptFuncionario;
    
    @JsonIgnore
    private Funcionario solicitudTASGAUTOUSRAFILIptFuncionarioInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkSolicitudTASGAUTOUSRAFILIpthisSolicitud();
    }

    @JsonIgnore
    public SolicitudOid getSolicitudTASGAUTOUSRAFILIpthisSolicitud() {
        return this.solicitudTASGAUTOUSRAFILIpthisSolicitud;
    }
    
    public void setSolicitudTASGAUTOUSRAFILIpthisSolicitud(SolicitudOid solicitudTASGAUTOUSRAFILIpthisSolicitud) {
        this.solicitudTASGAUTOUSRAFILIpthisSolicitud = solicitudTASGAUTOUSRAFILIpthisSolicitud;
    }

    @JsonIgnore
    public Solicitud getSolicitudTASGAUTOUSRAFILIpthisSolicitudInstance() {
        return this.solicitudTASGAUTOUSRAFILIpthisSolicitudInstance;
    }
    
    public void setSolicitudTASGAUTOUSRAFILIpthisSolicitudInstance(Solicitud solicitudTASGAUTOUSRAFILIpthisSolicitud) {
        this.solicitudTASGAUTOUSRAFILIpthisSolicitudInstance = solicitudTASGAUTOUSRAFILIpthisSolicitud;
        this.solicitudTASGAUTOUSRAFILIpthisSolicitud = solicitudTASGAUTOUSRAFILIpthisSolicitud != null ? solicitudTASGAUTOUSRAFILIpthisSolicitud.getOid() : null;
    }

    private void checkSolicitudTASGAUTOUSRAFILIpthisSolicitud() throws NotNullArgumentException {
        if(this.getSolicitudTASGAUTOUSRAFILIpthisSolicitudInstance() == null || this.getSolicitudTASGAUTOUSRAFILIpthisSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_TASGAUTOUSRAFILI, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_TASGAUTOUSRAFILI_SOLICITUDTASGAUTOUSRAFILIPTHISSOLICITUD, SolicitudConstants.SERV_ALIAS_TASGAUTOUSRAFILI, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_TASGAUTOUSRAFILI_SOLICITUDTASGAUTOUSRAFILIPTHISSOLICITUD);
        }
    }

    @JsonIgnore
    public FuncionarioOid getSolicitudTASGAUTOUSRAFILIptFuncionario() {
        return this.solicitudTASGAUTOUSRAFILIptFuncionario;
    }
    
    public void setSolicitudTASGAUTOUSRAFILIptFuncionario(FuncionarioOid solicitudTASGAUTOUSRAFILIptFuncionario) {
        this.solicitudTASGAUTOUSRAFILIptFuncionario = solicitudTASGAUTOUSRAFILIptFuncionario;
    }

    @JsonIgnore
    public Funcionario getSolicitudTASGAUTOUSRAFILIptFuncionarioInstance() {
        return this.solicitudTASGAUTOUSRAFILIptFuncionarioInstance;
    }
    
    public void setSolicitudTASGAUTOUSRAFILIptFuncionarioInstance(Funcionario solicitudTASGAUTOUSRAFILIptFuncionario) {
        this.solicitudTASGAUTOUSRAFILIptFuncionarioInstance = solicitudTASGAUTOUSRAFILIptFuncionario;
        this.solicitudTASGAUTOUSRAFILIptFuncionario = solicitudTASGAUTOUSRAFILIptFuncionario != null ? solicitudTASGAUTOUSRAFILIptFuncionario.getOid() : null;
    }
}
