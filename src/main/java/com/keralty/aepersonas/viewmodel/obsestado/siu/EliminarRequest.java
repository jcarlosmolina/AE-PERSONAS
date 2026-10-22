package com.keralty.aepersonas.viewmodel.obsestado.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.ObsEstadoConstants;
import com.keralty.aepersonas.persistence.ObsEstado;
import com.keralty.aepersonas.persistence.oid.ObsEstadoOid;

public class EliminarRequest {

    @JsonProperty("p_thisobsestado_oid")
    private ObsEstadoOid obsEstadoeliminarpthisObsEstado;
    
    @JsonIgnore
    private ObsEstado obsEstadoeliminarpthisObsEstadoInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkObsEstadoeliminarpthisObsEstado();
    }

    @JsonIgnore
    public ObsEstadoOid getObsEstadoeliminarpthisObsEstado() {
        return this.obsEstadoeliminarpthisObsEstado;
    }
    
    public void setObsEstadoeliminarpthisObsEstado(ObsEstadoOid obsEstadoeliminarpthisObsEstado) {
        this.obsEstadoeliminarpthisObsEstado = obsEstadoeliminarpthisObsEstado;
    }

    @JsonIgnore
    public ObsEstado getObsEstadoeliminarpthisObsEstadoInstance() {
        return this.obsEstadoeliminarpthisObsEstadoInstance;
    }
    
    public void setObsEstadoeliminarpthisObsEstadoInstance(ObsEstado obsEstadoeliminarpthisObsEstado) {
        this.obsEstadoeliminarpthisObsEstadoInstance = obsEstadoeliminarpthisObsEstado;
        this.obsEstadoeliminarpthisObsEstado = obsEstadoeliminarpthisObsEstado != null ? obsEstadoeliminarpthisObsEstado.getOid() : null;
    }

    private void checkObsEstadoeliminarpthisObsEstado() throws NotNullArgumentException {
        if(this.getObsEstadoeliminarpthisObsEstadoInstance() == null || this.getObsEstadoeliminarpthisObsEstadoInstance().isNull()) {
            throw new NotNullArgumentException(ObsEstadoConstants.SERV_ID_ELIMINAR, ObsEstadoConstants.CLASS_ID, ObsEstadoConstants.ARG_ID_ELIMINAR_OBSESTADOELIMINARPTHISOBSESTADO, ObsEstadoConstants.SERV_ALIAS_ELIMINAR, ObsEstadoConstants.CLASS_ALIAS, ObsEstadoConstants.ARG_ALIAS_ELIMINAR_OBSESTADOELIMINARPTHISOBSESTADO);
        }
    }
}
