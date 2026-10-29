package com.keralty.aepersonas.viewmodel.documentog.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.DocumentoGConstants;
import com.keralty.aepersonas.persistence.DocumentoG;
import com.keralty.aepersonas.persistence.oid.DocumentoGOid;

public class PonerNombreDocumentoRequest {

    @JsonProperty("p_thisdocumentog_oid")
    private DocumentoGOid documentoGponerNombreDocumentopthisDocumentoG;
    
    @JsonIgnore
    private DocumentoG documentoGponerNombreDocumentopthisDocumentoGInstance;

    @JsonProperty("p_nombre")
    private String documentoGponerNombreDocumentopNombre;

    @JsonProperty("p_extension")
    private String documentoGponerNombreDocumentopExtension;

    public void checkArguments() throws NotNullArgumentException {
        checkDocumentoGponerNombreDocumentopthisDocumentoG();
    }

    @JsonIgnore
    public DocumentoGOid getDocumentoGponerNombreDocumentopthisDocumentoG() {
        return this.documentoGponerNombreDocumentopthisDocumentoG;
    }
    
    public void setDocumentoGponerNombreDocumentopthisDocumentoG(DocumentoGOid documentoGponerNombreDocumentopthisDocumentoG) {
        this.documentoGponerNombreDocumentopthisDocumentoG = documentoGponerNombreDocumentopthisDocumentoG;
    }

    @JsonIgnore
    public DocumentoG getDocumentoGponerNombreDocumentopthisDocumentoGInstance() {
        return this.documentoGponerNombreDocumentopthisDocumentoGInstance;
    }
    
    public void setDocumentoGponerNombreDocumentopthisDocumentoGInstance(DocumentoG documentoGponerNombreDocumentopthisDocumentoG) {
        this.documentoGponerNombreDocumentopthisDocumentoGInstance = documentoGponerNombreDocumentopthisDocumentoG;
        this.documentoGponerNombreDocumentopthisDocumentoG = documentoGponerNombreDocumentopthisDocumentoG != null ? documentoGponerNombreDocumentopthisDocumentoG.getOid() : null;
    }

    private void checkDocumentoGponerNombreDocumentopthisDocumentoG() throws NotNullArgumentException {
        if(this.getDocumentoGponerNombreDocumentopthisDocumentoGInstance() == null || this.getDocumentoGponerNombreDocumentopthisDocumentoGInstance().isNull()) {
            throw new NotNullArgumentException(DocumentoGConstants.SERV_ID_PONERNOMBREDOCUMENTO, DocumentoGConstants.CLASS_ID, DocumentoGConstants.ARG_ID_PONERNOMBREDOCUMENTO_DOCUMENTOGPONERNOMBREDOCUMENTOPTHISDOCUMENTOG, DocumentoGConstants.SERV_ALIAS_PONERNOMBREDOCUMENTO, DocumentoGConstants.CLASS_ALIAS, DocumentoGConstants.ARG_ALIAS_PONERNOMBREDOCUMENTO_DOCUMENTOGPONERNOMBREDOCUMENTOPTHISDOCUMENTOG);
        }
    }

    @JsonIgnore
    public String getDocumentoGponerNombreDocumentopNombre() {
        return this.documentoGponerNombreDocumentopNombre;
    }
    
    public void setDocumentoGponerNombreDocumentopNombre(String documentoGponerNombreDocumentopNombre) {
        this.documentoGponerNombreDocumentopNombre = documentoGponerNombreDocumentopNombre;
    }

    @JsonIgnore
    public String getDocumentoGponerNombreDocumentopExtension() {
        return this.documentoGponerNombreDocumentopExtension;
    }
    
    public void setDocumentoGponerNombreDocumentopExtension(String documentoGponerNombreDocumentopExtension) {
        this.documentoGponerNombreDocumentopExtension = documentoGponerNombreDocumentopExtension;
    }
}
