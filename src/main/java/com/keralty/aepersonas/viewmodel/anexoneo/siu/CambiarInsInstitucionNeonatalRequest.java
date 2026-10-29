package com.keralty.aepersonas.viewmodel.anexoneo.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.AnexoNeoConstants;
import com.keralty.aepersonas.persistence.AnexoNeo;
import com.keralty.aepersonas.persistence.InstitucionMatNeo;
import com.keralty.aepersonas.persistence.oid.AnexoNeoOid;
import com.keralty.aepersonas.persistence.oid.InstitucionMatNeoOid;

public class CambiarInsInstitucionNeonatalRequest {

    @JsonProperty("p_thisanexoneo_oid")
    private AnexoNeoOid anexoNeoCambiarInsInstitucionNeonatalpthisAnexoNeo;
    
    @JsonIgnore
    private AnexoNeo anexoNeoCambiarInsInstitucionNeonatalpthisAnexoNeoInstance;

    @JsonProperty("p_evcinstitucionmatneo_oid")
    private InstitucionMatNeoOid anexoNeoCambiarInsInstitucionNeonatalpevcInstitucionMatNeo;
    
    @JsonIgnore
    private InstitucionMatNeo anexoNeoCambiarInsInstitucionNeonatalpevcInstitucionMatNeoInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkAnexoNeoCambiarInsInstitucionNeonatalpthisAnexoNeo();
        checkAnexoNeoCambiarInsInstitucionNeonatalpevcInstitucionMatNeo();
    }

    @JsonIgnore
    public AnexoNeoOid getAnexoNeoCambiarInsInstitucionNeonatalpthisAnexoNeo() {
        return this.anexoNeoCambiarInsInstitucionNeonatalpthisAnexoNeo;
    }
    
    public void setAnexoNeoCambiarInsInstitucionNeonatalpthisAnexoNeo(AnexoNeoOid anexoNeoCambiarInsInstitucionNeonatalpthisAnexoNeo) {
        this.anexoNeoCambiarInsInstitucionNeonatalpthisAnexoNeo = anexoNeoCambiarInsInstitucionNeonatalpthisAnexoNeo;
    }

    @JsonIgnore
    public AnexoNeo getAnexoNeoCambiarInsInstitucionNeonatalpthisAnexoNeoInstance() {
        return this.anexoNeoCambiarInsInstitucionNeonatalpthisAnexoNeoInstance;
    }
    
    public void setAnexoNeoCambiarInsInstitucionNeonatalpthisAnexoNeoInstance(AnexoNeo anexoNeoCambiarInsInstitucionNeonatalpthisAnexoNeo) {
        this.anexoNeoCambiarInsInstitucionNeonatalpthisAnexoNeoInstance = anexoNeoCambiarInsInstitucionNeonatalpthisAnexoNeo;
        this.anexoNeoCambiarInsInstitucionNeonatalpthisAnexoNeo = anexoNeoCambiarInsInstitucionNeonatalpthisAnexoNeo != null ? anexoNeoCambiarInsInstitucionNeonatalpthisAnexoNeo.getOid() : null;
    }

    private void checkAnexoNeoCambiarInsInstitucionNeonatalpthisAnexoNeo() throws NotNullArgumentException {
        if(this.getAnexoNeoCambiarInsInstitucionNeonatalpthisAnexoNeoInstance() == null || this.getAnexoNeoCambiarInsInstitucionNeonatalpthisAnexoNeoInstance().isNull()) {
            throw new NotNullArgumentException(AnexoNeoConstants.SERV_ID_CAMBIARINSINSTITUCIONNEONATAL, AnexoNeoConstants.CLASS_ID, AnexoNeoConstants.ARG_ID_CAMBIARINSINSTITUCIONNEONATAL_ANEXONEOCAMBIARINSINSTITUCIONNEONATALPTHISANEXONEO, AnexoNeoConstants.SERV_ALIAS_CAMBIARINSINSTITUCIONNEONATAL, AnexoNeoConstants.CLASS_ALIAS, AnexoNeoConstants.ARG_ALIAS_CAMBIARINSINSTITUCIONNEONATAL_ANEXONEOCAMBIARINSINSTITUCIONNEONATALPTHISANEXONEO);
        }
    }

    @JsonIgnore
    public InstitucionMatNeoOid getAnexoNeoCambiarInsInstitucionNeonatalpevcInstitucionMatNeo() {
        return this.anexoNeoCambiarInsInstitucionNeonatalpevcInstitucionMatNeo;
    }
    
    public void setAnexoNeoCambiarInsInstitucionNeonatalpevcInstitucionMatNeo(InstitucionMatNeoOid anexoNeoCambiarInsInstitucionNeonatalpevcInstitucionMatNeo) {
        this.anexoNeoCambiarInsInstitucionNeonatalpevcInstitucionMatNeo = anexoNeoCambiarInsInstitucionNeonatalpevcInstitucionMatNeo;
    }

    @JsonIgnore
    public InstitucionMatNeo getAnexoNeoCambiarInsInstitucionNeonatalpevcInstitucionMatNeoInstance() {
        return this.anexoNeoCambiarInsInstitucionNeonatalpevcInstitucionMatNeoInstance;
    }
    
    public void setAnexoNeoCambiarInsInstitucionNeonatalpevcInstitucionMatNeoInstance(InstitucionMatNeo anexoNeoCambiarInsInstitucionNeonatalpevcInstitucionMatNeo) {
        this.anexoNeoCambiarInsInstitucionNeonatalpevcInstitucionMatNeoInstance = anexoNeoCambiarInsInstitucionNeonatalpevcInstitucionMatNeo;
        this.anexoNeoCambiarInsInstitucionNeonatalpevcInstitucionMatNeo = anexoNeoCambiarInsInstitucionNeonatalpevcInstitucionMatNeo != null ? anexoNeoCambiarInsInstitucionNeonatalpevcInstitucionMatNeo.getOid() : null;
    }

    private void checkAnexoNeoCambiarInsInstitucionNeonatalpevcInstitucionMatNeo() throws NotNullArgumentException {
        if(this.getAnexoNeoCambiarInsInstitucionNeonatalpevcInstitucionMatNeoInstance() == null || this.getAnexoNeoCambiarInsInstitucionNeonatalpevcInstitucionMatNeoInstance().isNull()) {
            throw new NotNullArgumentException(AnexoNeoConstants.SERV_ID_CAMBIARINSINSTITUCIONNEONATAL, AnexoNeoConstants.CLASS_ID, AnexoNeoConstants.ARG_ID_CAMBIARINSINSTITUCIONNEONATAL_ANEXONEOCAMBIARINSINSTITUCIONNEONATALPEVCINSTITUCIONMATNEO, AnexoNeoConstants.SERV_ALIAS_CAMBIARINSINSTITUCIONNEONATAL, AnexoNeoConstants.CLASS_ALIAS, AnexoNeoConstants.ARG_ALIAS_CAMBIARINSINSTITUCIONNEONATAL_ANEXONEOCAMBIARINSINSTITUCIONNEONATALPEVCINSTITUCIONMATNEO);
        }
    }
}
