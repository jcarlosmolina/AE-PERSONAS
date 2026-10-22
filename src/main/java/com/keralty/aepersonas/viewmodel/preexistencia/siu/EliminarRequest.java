package com.keralty.aepersonas.viewmodel.preexistencia.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PreexistenciaConstants;
import com.keralty.aepersonas.persistence.oid.PreexistenciaOid;
import com.keralty.aepersonas.persistence.Preexistencia;

public class EliminarRequest {

    @JsonProperty("p_thispreexistencia_oid")
    private PreexistenciaOid preexistenciaeliminarpthisPreexistencia;
    
    @JsonIgnore
    private Preexistencia preexistenciaeliminarpthisPreexistenciaInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkPreexistenciaeliminarpthisPreexistencia();
    }

    @JsonIgnore
    public PreexistenciaOid getPreexistenciaeliminarpthisPreexistencia() {
        return this.preexistenciaeliminarpthisPreexistencia;
    }
    
    public void setPreexistenciaeliminarpthisPreexistencia(PreexistenciaOid preexistenciaeliminarpthisPreexistencia) {
        this.preexistenciaeliminarpthisPreexistencia = preexistenciaeliminarpthisPreexistencia;
    }

    @JsonIgnore
    public Preexistencia getPreexistenciaeliminarpthisPreexistenciaInstance() {
        return this.preexistenciaeliminarpthisPreexistenciaInstance;
    }
    
    public void setPreexistenciaeliminarpthisPreexistenciaInstance(Preexistencia preexistenciaeliminarpthisPreexistencia) {
        this.preexistenciaeliminarpthisPreexistenciaInstance = preexistenciaeliminarpthisPreexistencia;
        this.preexistenciaeliminarpthisPreexistencia = preexistenciaeliminarpthisPreexistencia != null ? preexistenciaeliminarpthisPreexistencia.getOid() : null;
    }

    private void checkPreexistenciaeliminarpthisPreexistencia() throws NotNullArgumentException {
        if(this.getPreexistenciaeliminarpthisPreexistenciaInstance() == null || this.getPreexistenciaeliminarpthisPreexistenciaInstance().isNull()) {
            throw new NotNullArgumentException(PreexistenciaConstants.SERV_ID_ELIMINAR, PreexistenciaConstants.CLASS_ID, PreexistenciaConstants.ARG_ID_ELIMINAR_PREEXISTENCIAELIMINARPTHISPREEXISTENCIA, PreexistenciaConstants.SERV_ALIAS_ELIMINAR, PreexistenciaConstants.CLASS_ALIAS, PreexistenciaConstants.ARG_ALIAS_ELIMINAR_PREEXISTENCIAELIMINARPTHISPREEXISTENCIA);
        }
    }
}
