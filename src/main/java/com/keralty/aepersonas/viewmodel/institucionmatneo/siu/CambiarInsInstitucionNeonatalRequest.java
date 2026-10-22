package com.keralty.aepersonas.viewmodel.institucionmatneo.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.InstitucionMatNeoConstants;
import com.keralty.aepersonas.persistence.AnexoNeo;
import com.keralty.aepersonas.persistence.InstitucionMatNeo;
import com.keralty.aepersonas.persistence.oid.AnexoNeoOid;
import com.keralty.aepersonas.persistence.oid.InstitucionMatNeoOid;

public class CambiarInsInstitucionNeonatalRequest {

    @JsonProperty("p_thisinstitucionmatneo_oid")
    private InstitucionMatNeoOid institucionMatNeoCambiarInsInstitucionNeonatalpthisInstitucionMatNeo;
    
    @JsonIgnore
    private InstitucionMatNeo institucionMatNeoCambiarInsInstitucionNeonatalpthisInstitucionMatNeoInstance;

    @JsonProperty("p_evcanexoneo_oid")
    private AnexoNeoOid institucionMatNeoCambiarInsInstitucionNeonatalpevcAnexoNeo;
    
    @JsonIgnore
    private AnexoNeo institucionMatNeoCambiarInsInstitucionNeonatalpevcAnexoNeoInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkInstitucionMatNeoCambiarInsInstitucionNeonatalpthisInstitucionMatNeo();
        checkInstitucionMatNeoCambiarInsInstitucionNeonatalpevcAnexoNeo();
    }

    @JsonIgnore
    public InstitucionMatNeoOid getInstitucionMatNeoCambiarInsInstitucionNeonatalpthisInstitucionMatNeo() {
        return this.institucionMatNeoCambiarInsInstitucionNeonatalpthisInstitucionMatNeo;
    }
    
    public void setInstitucionMatNeoCambiarInsInstitucionNeonatalpthisInstitucionMatNeo(InstitucionMatNeoOid institucionMatNeoCambiarInsInstitucionNeonatalpthisInstitucionMatNeo) {
        this.institucionMatNeoCambiarInsInstitucionNeonatalpthisInstitucionMatNeo = institucionMatNeoCambiarInsInstitucionNeonatalpthisInstitucionMatNeo;
    }

    @JsonIgnore
    public InstitucionMatNeo getInstitucionMatNeoCambiarInsInstitucionNeonatalpthisInstitucionMatNeoInstance() {
        return this.institucionMatNeoCambiarInsInstitucionNeonatalpthisInstitucionMatNeoInstance;
    }
    
    public void setInstitucionMatNeoCambiarInsInstitucionNeonatalpthisInstitucionMatNeoInstance(InstitucionMatNeo institucionMatNeoCambiarInsInstitucionNeonatalpthisInstitucionMatNeo) {
        this.institucionMatNeoCambiarInsInstitucionNeonatalpthisInstitucionMatNeoInstance = institucionMatNeoCambiarInsInstitucionNeonatalpthisInstitucionMatNeo;
        this.institucionMatNeoCambiarInsInstitucionNeonatalpthisInstitucionMatNeo = institucionMatNeoCambiarInsInstitucionNeonatalpthisInstitucionMatNeo != null ? institucionMatNeoCambiarInsInstitucionNeonatalpthisInstitucionMatNeo.getOid() : null;
    }

    private void checkInstitucionMatNeoCambiarInsInstitucionNeonatalpthisInstitucionMatNeo() throws NotNullArgumentException {
        if(this.getInstitucionMatNeoCambiarInsInstitucionNeonatalpthisInstitucionMatNeoInstance() == null || this.getInstitucionMatNeoCambiarInsInstitucionNeonatalpthisInstitucionMatNeoInstance().isNull()) {
            throw new NotNullArgumentException(InstitucionMatNeoConstants.SERV_ID_CAMBIARINSINSTITUCIONNEONATAL, InstitucionMatNeoConstants.CLASS_ID, InstitucionMatNeoConstants.ARG_ID_CAMBIARINSINSTITUCIONNEONATAL_INSTITUCIONMATNEOCAMBIARINSINSTITUCIONNEONATALPTHISINSTITUCIONMATNEO, InstitucionMatNeoConstants.SERV_ALIAS_CAMBIARINSINSTITUCIONNEONATAL, InstitucionMatNeoConstants.CLASS_ALIAS, InstitucionMatNeoConstants.ARG_ALIAS_CAMBIARINSINSTITUCIONNEONATAL_INSTITUCIONMATNEOCAMBIARINSINSTITUCIONNEONATALPTHISINSTITUCIONMATNEO);
        }
    }

    @JsonIgnore
    public AnexoNeoOid getInstitucionMatNeoCambiarInsInstitucionNeonatalpevcAnexoNeo() {
        return this.institucionMatNeoCambiarInsInstitucionNeonatalpevcAnexoNeo;
    }
    
    public void setInstitucionMatNeoCambiarInsInstitucionNeonatalpevcAnexoNeo(AnexoNeoOid institucionMatNeoCambiarInsInstitucionNeonatalpevcAnexoNeo) {
        this.institucionMatNeoCambiarInsInstitucionNeonatalpevcAnexoNeo = institucionMatNeoCambiarInsInstitucionNeonatalpevcAnexoNeo;
    }

    @JsonIgnore
    public AnexoNeo getInstitucionMatNeoCambiarInsInstitucionNeonatalpevcAnexoNeoInstance() {
        return this.institucionMatNeoCambiarInsInstitucionNeonatalpevcAnexoNeoInstance;
    }
    
    public void setInstitucionMatNeoCambiarInsInstitucionNeonatalpevcAnexoNeoInstance(AnexoNeo institucionMatNeoCambiarInsInstitucionNeonatalpevcAnexoNeo) {
        this.institucionMatNeoCambiarInsInstitucionNeonatalpevcAnexoNeoInstance = institucionMatNeoCambiarInsInstitucionNeonatalpevcAnexoNeo;
        this.institucionMatNeoCambiarInsInstitucionNeonatalpevcAnexoNeo = institucionMatNeoCambiarInsInstitucionNeonatalpevcAnexoNeo != null ? institucionMatNeoCambiarInsInstitucionNeonatalpevcAnexoNeo.getOid() : null;
    }

    private void checkInstitucionMatNeoCambiarInsInstitucionNeonatalpevcAnexoNeo() throws NotNullArgumentException {
        if(this.getInstitucionMatNeoCambiarInsInstitucionNeonatalpevcAnexoNeoInstance() == null || this.getInstitucionMatNeoCambiarInsInstitucionNeonatalpevcAnexoNeoInstance().isNull()) {
            throw new NotNullArgumentException(InstitucionMatNeoConstants.SERV_ID_CAMBIARINSINSTITUCIONNEONATAL, InstitucionMatNeoConstants.CLASS_ID, InstitucionMatNeoConstants.ARG_ID_CAMBIARINSINSTITUCIONNEONATAL_INSTITUCIONMATNEOCAMBIARINSINSTITUCIONNEONATALPEVCANEXONEO, InstitucionMatNeoConstants.SERV_ALIAS_CAMBIARINSINSTITUCIONNEONATAL, InstitucionMatNeoConstants.CLASS_ALIAS, InstitucionMatNeoConstants.ARG_ALIAS_CAMBIARINSINSTITUCIONNEONATAL_INSTITUCIONMATNEOCAMBIARINSINSTITUCIONNEONATALPEVCANEXONEO);
        }
    }
}
