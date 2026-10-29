package com.keralty.aepersonas.viewmodel.anexomat.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.AnexoMatConstants;
import com.keralty.aepersonas.persistence.AnexoMat;
import com.keralty.aepersonas.persistence.oid.AnexoMatOid;

public class EliminarRequest {

    @JsonProperty("p_thisanexomat_oid")
    private AnexoMatOid anexoMateliminarpthisAnexoMat;
    
    @JsonIgnore
    private AnexoMat anexoMateliminarpthisAnexoMatInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkAnexoMateliminarpthisAnexoMat();
    }

    @JsonIgnore
    public AnexoMatOid getAnexoMateliminarpthisAnexoMat() {
        return this.anexoMateliminarpthisAnexoMat;
    }
    
    public void setAnexoMateliminarpthisAnexoMat(AnexoMatOid anexoMateliminarpthisAnexoMat) {
        this.anexoMateliminarpthisAnexoMat = anexoMateliminarpthisAnexoMat;
    }

    @JsonIgnore
    public AnexoMat getAnexoMateliminarpthisAnexoMatInstance() {
        return this.anexoMateliminarpthisAnexoMatInstance;
    }
    
    public void setAnexoMateliminarpthisAnexoMatInstance(AnexoMat anexoMateliminarpthisAnexoMat) {
        this.anexoMateliminarpthisAnexoMatInstance = anexoMateliminarpthisAnexoMat;
        this.anexoMateliminarpthisAnexoMat = anexoMateliminarpthisAnexoMat != null ? anexoMateliminarpthisAnexoMat.getOid() : null;
    }

    private void checkAnexoMateliminarpthisAnexoMat() throws NotNullArgumentException {
        if(this.getAnexoMateliminarpthisAnexoMatInstance() == null || this.getAnexoMateliminarpthisAnexoMatInstance().isNull()) {
            throw new NotNullArgumentException(AnexoMatConstants.SERV_ID_ELIMINAR, AnexoMatConstants.CLASS_ID, AnexoMatConstants.ARG_ID_ELIMINAR_ANEXOMATELIMINARPTHISANEXOMAT, AnexoMatConstants.SERV_ALIAS_ELIMINAR, AnexoMatConstants.CLASS_ALIAS, AnexoMatConstants.ARG_ALIAS_ELIMINAR_ANEXOMATELIMINARPTHISANEXOMAT);
        }
    }
}
