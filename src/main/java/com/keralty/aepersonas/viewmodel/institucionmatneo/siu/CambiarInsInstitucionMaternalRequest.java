package com.keralty.aepersonas.viewmodel.institucionmatneo.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.InstitucionMatNeoConstants;
import com.keralty.aepersonas.persistence.AnexoMat;
import com.keralty.aepersonas.persistence.InstitucionMatNeo;
import com.keralty.aepersonas.persistence.oid.AnexoMatOid;
import com.keralty.aepersonas.persistence.oid.InstitucionMatNeoOid;

public class CambiarInsInstitucionMaternalRequest {

    @JsonProperty("p_thisinstitucionmatneo_oid")
    private InstitucionMatNeoOid institucionMatNeoCambiarInsInstitucionMaternalpthisInstitucionMatNeo;
    
    @JsonIgnore
    private InstitucionMatNeo institucionMatNeoCambiarInsInstitucionMaternalpthisInstitucionMatNeoInstance;

    @JsonProperty("p_evcanexomat_oid")
    private AnexoMatOid institucionMatNeoCambiarInsInstitucionMaternalpevcAnexoMat;
    
    @JsonIgnore
    private AnexoMat institucionMatNeoCambiarInsInstitucionMaternalpevcAnexoMatInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkInstitucionMatNeoCambiarInsInstitucionMaternalpthisInstitucionMatNeo();
        checkInstitucionMatNeoCambiarInsInstitucionMaternalpevcAnexoMat();
    }

    @JsonIgnore
    public InstitucionMatNeoOid getInstitucionMatNeoCambiarInsInstitucionMaternalpthisInstitucionMatNeo() {
        return this.institucionMatNeoCambiarInsInstitucionMaternalpthisInstitucionMatNeo;
    }
    
    public void setInstitucionMatNeoCambiarInsInstitucionMaternalpthisInstitucionMatNeo(InstitucionMatNeoOid institucionMatNeoCambiarInsInstitucionMaternalpthisInstitucionMatNeo) {
        this.institucionMatNeoCambiarInsInstitucionMaternalpthisInstitucionMatNeo = institucionMatNeoCambiarInsInstitucionMaternalpthisInstitucionMatNeo;
    }

    @JsonIgnore
    public InstitucionMatNeo getInstitucionMatNeoCambiarInsInstitucionMaternalpthisInstitucionMatNeoInstance() {
        return this.institucionMatNeoCambiarInsInstitucionMaternalpthisInstitucionMatNeoInstance;
    }
    
    public void setInstitucionMatNeoCambiarInsInstitucionMaternalpthisInstitucionMatNeoInstance(InstitucionMatNeo institucionMatNeoCambiarInsInstitucionMaternalpthisInstitucionMatNeo) {
        this.institucionMatNeoCambiarInsInstitucionMaternalpthisInstitucionMatNeoInstance = institucionMatNeoCambiarInsInstitucionMaternalpthisInstitucionMatNeo;
        this.institucionMatNeoCambiarInsInstitucionMaternalpthisInstitucionMatNeo = institucionMatNeoCambiarInsInstitucionMaternalpthisInstitucionMatNeo != null ? institucionMatNeoCambiarInsInstitucionMaternalpthisInstitucionMatNeo.getOid() : null;
    }

    private void checkInstitucionMatNeoCambiarInsInstitucionMaternalpthisInstitucionMatNeo() throws NotNullArgumentException {
        if(this.getInstitucionMatNeoCambiarInsInstitucionMaternalpthisInstitucionMatNeoInstance() == null || this.getInstitucionMatNeoCambiarInsInstitucionMaternalpthisInstitucionMatNeoInstance().isNull()) {
            throw new NotNullArgumentException(InstitucionMatNeoConstants.SERV_ID_CAMBIARINSINSTITUCIONMATERNAL, InstitucionMatNeoConstants.CLASS_ID, InstitucionMatNeoConstants.ARG_ID_CAMBIARINSINSTITUCIONMATERNAL_INSTITUCIONMATNEOCAMBIARINSINSTITUCIONMATERNALPTHISINSTITUCIONMATNEO, InstitucionMatNeoConstants.SERV_ALIAS_CAMBIARINSINSTITUCIONMATERNAL, InstitucionMatNeoConstants.CLASS_ALIAS, InstitucionMatNeoConstants.ARG_ALIAS_CAMBIARINSINSTITUCIONMATERNAL_INSTITUCIONMATNEOCAMBIARINSINSTITUCIONMATERNALPTHISINSTITUCIONMATNEO);
        }
    }

    @JsonIgnore
    public AnexoMatOid getInstitucionMatNeoCambiarInsInstitucionMaternalpevcAnexoMat() {
        return this.institucionMatNeoCambiarInsInstitucionMaternalpevcAnexoMat;
    }
    
    public void setInstitucionMatNeoCambiarInsInstitucionMaternalpevcAnexoMat(AnexoMatOid institucionMatNeoCambiarInsInstitucionMaternalpevcAnexoMat) {
        this.institucionMatNeoCambiarInsInstitucionMaternalpevcAnexoMat = institucionMatNeoCambiarInsInstitucionMaternalpevcAnexoMat;
    }

    @JsonIgnore
    public AnexoMat getInstitucionMatNeoCambiarInsInstitucionMaternalpevcAnexoMatInstance() {
        return this.institucionMatNeoCambiarInsInstitucionMaternalpevcAnexoMatInstance;
    }
    
    public void setInstitucionMatNeoCambiarInsInstitucionMaternalpevcAnexoMatInstance(AnexoMat institucionMatNeoCambiarInsInstitucionMaternalpevcAnexoMat) {
        this.institucionMatNeoCambiarInsInstitucionMaternalpevcAnexoMatInstance = institucionMatNeoCambiarInsInstitucionMaternalpevcAnexoMat;
        this.institucionMatNeoCambiarInsInstitucionMaternalpevcAnexoMat = institucionMatNeoCambiarInsInstitucionMaternalpevcAnexoMat != null ? institucionMatNeoCambiarInsInstitucionMaternalpevcAnexoMat.getOid() : null;
    }

    private void checkInstitucionMatNeoCambiarInsInstitucionMaternalpevcAnexoMat() throws NotNullArgumentException {
        if(this.getInstitucionMatNeoCambiarInsInstitucionMaternalpevcAnexoMatInstance() == null || this.getInstitucionMatNeoCambiarInsInstitucionMaternalpevcAnexoMatInstance().isNull()) {
            throw new NotNullArgumentException(InstitucionMatNeoConstants.SERV_ID_CAMBIARINSINSTITUCIONMATERNAL, InstitucionMatNeoConstants.CLASS_ID, InstitucionMatNeoConstants.ARG_ID_CAMBIARINSINSTITUCIONMATERNAL_INSTITUCIONMATNEOCAMBIARINSINSTITUCIONMATERNALPEVCANEXOMAT, InstitucionMatNeoConstants.SERV_ALIAS_CAMBIARINSINSTITUCIONMATERNAL, InstitucionMatNeoConstants.CLASS_ALIAS, InstitucionMatNeoConstants.ARG_ALIAS_CAMBIARINSINSTITUCIONMATERNAL_INSTITUCIONMATNEOCAMBIARINSINSTITUCIONMATERNALPEVCANEXOMAT);
        }
    }
}
