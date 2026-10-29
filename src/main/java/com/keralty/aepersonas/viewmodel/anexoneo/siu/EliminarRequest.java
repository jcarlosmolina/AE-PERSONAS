package com.keralty.aepersonas.viewmodel.anexoneo.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.AnexoNeoConstants;
import com.keralty.aepersonas.persistence.AnexoNeo;
import com.keralty.aepersonas.persistence.oid.AnexoNeoOid;

public class EliminarRequest {

    @JsonProperty("p_thisanexoneo_oid")
    private AnexoNeoOid anexoNeoeliminarpthisAnexoNeo;
    
    @JsonIgnore
    private AnexoNeo anexoNeoeliminarpthisAnexoNeoInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkAnexoNeoeliminarpthisAnexoNeo();
    }

    @JsonIgnore
    public AnexoNeoOid getAnexoNeoeliminarpthisAnexoNeo() {
        return this.anexoNeoeliminarpthisAnexoNeo;
    }
    
    public void setAnexoNeoeliminarpthisAnexoNeo(AnexoNeoOid anexoNeoeliminarpthisAnexoNeo) {
        this.anexoNeoeliminarpthisAnexoNeo = anexoNeoeliminarpthisAnexoNeo;
    }

    @JsonIgnore
    public AnexoNeo getAnexoNeoeliminarpthisAnexoNeoInstance() {
        return this.anexoNeoeliminarpthisAnexoNeoInstance;
    }
    
    public void setAnexoNeoeliminarpthisAnexoNeoInstance(AnexoNeo anexoNeoeliminarpthisAnexoNeo) {
        this.anexoNeoeliminarpthisAnexoNeoInstance = anexoNeoeliminarpthisAnexoNeo;
        this.anexoNeoeliminarpthisAnexoNeo = anexoNeoeliminarpthisAnexoNeo != null ? anexoNeoeliminarpthisAnexoNeo.getOid() : null;
    }

    private void checkAnexoNeoeliminarpthisAnexoNeo() throws NotNullArgumentException {
        if(this.getAnexoNeoeliminarpthisAnexoNeoInstance() == null || this.getAnexoNeoeliminarpthisAnexoNeoInstance().isNull()) {
            throw new NotNullArgumentException(AnexoNeoConstants.SERV_ID_ELIMINAR, AnexoNeoConstants.CLASS_ID, AnexoNeoConstants.ARG_ID_ELIMINAR_ANEXONEOELIMINARPTHISANEXONEO, AnexoNeoConstants.SERV_ALIAS_ELIMINAR, AnexoNeoConstants.CLASS_ALIAS, AnexoNeoConstants.ARG_ALIAS_ELIMINAR_ANEXONEOELIMINARPTHISANEXONEO);
        }
    }
}
