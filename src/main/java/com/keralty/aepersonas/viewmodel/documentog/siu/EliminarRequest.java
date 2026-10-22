package com.keralty.aepersonas.viewmodel.documentog.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.DocumentoGConstants;
import com.keralty.aepersonas.persistence.DocumentoG;
import com.keralty.aepersonas.persistence.oid.DocumentoGOid;

public class EliminarRequest {

    @JsonProperty("p_thisdocumentog_oid")
    private DocumentoGOid documentoGeliminarpthisDocumentoG;
    
    @JsonIgnore
    private DocumentoG documentoGeliminarpthisDocumentoGInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkDocumentoGeliminarpthisDocumentoG();
    }

    @JsonIgnore
    public DocumentoGOid getDocumentoGeliminarpthisDocumentoG() {
        return this.documentoGeliminarpthisDocumentoG;
    }
    
    public void setDocumentoGeliminarpthisDocumentoG(DocumentoGOid documentoGeliminarpthisDocumentoG) {
        this.documentoGeliminarpthisDocumentoG = documentoGeliminarpthisDocumentoG;
    }

    @JsonIgnore
    public DocumentoG getDocumentoGeliminarpthisDocumentoGInstance() {
        return this.documentoGeliminarpthisDocumentoGInstance;
    }
    
    public void setDocumentoGeliminarpthisDocumentoGInstance(DocumentoG documentoGeliminarpthisDocumentoG) {
        this.documentoGeliminarpthisDocumentoGInstance = documentoGeliminarpthisDocumentoG;
        this.documentoGeliminarpthisDocumentoG = documentoGeliminarpthisDocumentoG != null ? documentoGeliminarpthisDocumentoG.getOid() : null;
    }

    private void checkDocumentoGeliminarpthisDocumentoG() throws NotNullArgumentException {
        if(this.getDocumentoGeliminarpthisDocumentoGInstance() == null || this.getDocumentoGeliminarpthisDocumentoGInstance().isNull()) {
            throw new NotNullArgumentException(DocumentoGConstants.SERV_ID_ELIMINAR, DocumentoGConstants.CLASS_ID, DocumentoGConstants.ARG_ID_ELIMINAR_DOCUMENTOGELIMINARPTHISDOCUMENTOG, DocumentoGConstants.SERV_ALIAS_ELIMINAR, DocumentoGConstants.CLASS_ALIAS, DocumentoGConstants.ARG_ALIAS_ELIMINAR_DOCUMENTOGELIMINARPTHISDOCUMENTOG);
        }
    }
}
