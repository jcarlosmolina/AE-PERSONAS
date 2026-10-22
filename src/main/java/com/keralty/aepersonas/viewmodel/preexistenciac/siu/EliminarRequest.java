package com.keralty.aepersonas.viewmodel.preexistenciac.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PreexistenciaCConstants;
import com.keralty.aepersonas.persistence.oid.PreexistenciaCOid;
import com.keralty.aepersonas.persistence.PreexistenciaC;

public class EliminarRequest {

    @JsonProperty("p_thispreexistenciac_oid")
    private PreexistenciaCOid preexistenciaCeliminarpthisPreexistenciaC;
    
    @JsonIgnore
    private PreexistenciaC preexistenciaCeliminarpthisPreexistenciaCInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkPreexistenciaCeliminarpthisPreexistenciaC();
    }

    @JsonIgnore
    public PreexistenciaCOid getPreexistenciaCeliminarpthisPreexistenciaC() {
        return this.preexistenciaCeliminarpthisPreexistenciaC;
    }
    
    public void setPreexistenciaCeliminarpthisPreexistenciaC(PreexistenciaCOid preexistenciaCeliminarpthisPreexistenciaC) {
        this.preexistenciaCeliminarpthisPreexistenciaC = preexistenciaCeliminarpthisPreexistenciaC;
    }

    @JsonIgnore
    public PreexistenciaC getPreexistenciaCeliminarpthisPreexistenciaCInstance() {
        return this.preexistenciaCeliminarpthisPreexistenciaCInstance;
    }
    
    public void setPreexistenciaCeliminarpthisPreexistenciaCInstance(PreexistenciaC preexistenciaCeliminarpthisPreexistenciaC) {
        this.preexistenciaCeliminarpthisPreexistenciaCInstance = preexistenciaCeliminarpthisPreexistenciaC;
        this.preexistenciaCeliminarpthisPreexistenciaC = preexistenciaCeliminarpthisPreexistenciaC != null ? preexistenciaCeliminarpthisPreexistenciaC.getOid() : null;
    }

    private void checkPreexistenciaCeliminarpthisPreexistenciaC() throws NotNullArgumentException {
        if(this.getPreexistenciaCeliminarpthisPreexistenciaCInstance() == null || this.getPreexistenciaCeliminarpthisPreexistenciaCInstance().isNull()) {
            throw new NotNullArgumentException(PreexistenciaCConstants.SERV_ID_ELIMINAR, PreexistenciaCConstants.CLASS_ID, PreexistenciaCConstants.ARG_ID_ELIMINAR_PREEXISTENCIACELIMINARPTHISPREEXISTENCIAC, PreexistenciaCConstants.SERV_ALIAS_ELIMINAR, PreexistenciaCConstants.CLASS_ALIAS, PreexistenciaCConstants.ARG_ALIAS_ELIMINAR_PREEXISTENCIACELIMINARPTHISPREEXISTENCIAC);
        }
    }
}
