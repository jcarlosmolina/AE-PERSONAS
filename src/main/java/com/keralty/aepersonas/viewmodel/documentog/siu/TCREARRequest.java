package com.keralty.aepersonas.viewmodel.documentog.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.DocumentoGConstants;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Persona;
import com.keralty.aepersonas.persistence.Solicitud;
import java.sql.Timestamp;

public class TCREARRequest {

    @JsonProperty("pt_p_agrsolicitud_oid")
    private SolicitudOid documentoGTCREARptpagrSolicitud;
    
    @JsonIgnore
    private Solicitud documentoGTCREARptpagrSolicitudInstance;

    @JsonProperty("pt_p_agrpersona_oid")
    private PersonaOid documentoGTCREARptpagrPersona;
    
    @JsonIgnore
    private Persona documentoGTCREARptpagrPersonaInstance;

    @JsonProperty("pt_p_atrdescripcion")
    private String documentoGTCREARptpatrDescripcion;

    @JsonProperty("pt_p_atrtipo")
    private Long documentoGTCREARptpatrTipo;

    @JsonProperty("pt_p_atrestado")
    private Long documentoGTCREARptpatrEstado;

    @JsonProperty("pt_p_atrfechasubida")
    private Timestamp documentoGTCREARptpatrFechaSubida;

    @JsonProperty("pt_p_atriddocengestor")
    private String documentoGTCREARptpatrIdDocEnGestor;

    @JsonProperty("pt_p_nombre")
    private String documentoGTCREARptpNombre;

    @JsonProperty("pt_p_extension")
    private String documentoGTCREARptpExtension;

    public void checkArguments() throws NotNullArgumentException {
        checkDocumentoGTCREARptpagrSolicitud();
        checkDocumentoGTCREARptpatrEstado();
        checkDocumentoGTCREARptpatrFechaSubida();
    }

    @JsonIgnore
    public SolicitudOid getDocumentoGTCREARptpagrSolicitud() {
        return this.documentoGTCREARptpagrSolicitud;
    }
    
    public void setDocumentoGTCREARptpagrSolicitud(SolicitudOid documentoGTCREARptpagrSolicitud) {
        this.documentoGTCREARptpagrSolicitud = documentoGTCREARptpagrSolicitud;
    }

    @JsonIgnore
    public Solicitud getDocumentoGTCREARptpagrSolicitudInstance() {
        return this.documentoGTCREARptpagrSolicitudInstance;
    }
    
    public void setDocumentoGTCREARptpagrSolicitudInstance(Solicitud documentoGTCREARptpagrSolicitud) {
        this.documentoGTCREARptpagrSolicitudInstance = documentoGTCREARptpagrSolicitud;
        this.documentoGTCREARptpagrSolicitud = documentoGTCREARptpagrSolicitud != null ? documentoGTCREARptpagrSolicitud.getOid() : null;
    }

    private void checkDocumentoGTCREARptpagrSolicitud() throws NotNullArgumentException {
        if(this.getDocumentoGTCREARptpagrSolicitudInstance() == null || this.getDocumentoGTCREARptpagrSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(DocumentoGConstants.SERV_ID_TCREAR, DocumentoGConstants.CLASS_ID, DocumentoGConstants.ARG_ID_TCREAR_DOCUMENTOGTCREARPTPAGRSOLICITUD, DocumentoGConstants.SERV_ALIAS_TCREAR, DocumentoGConstants.CLASS_ALIAS, DocumentoGConstants.ARG_ALIAS_TCREAR_DOCUMENTOGTCREARPTPAGRSOLICITUD);
        }
    }

    @JsonIgnore
    public PersonaOid getDocumentoGTCREARptpagrPersona() {
        return this.documentoGTCREARptpagrPersona;
    }
    
    public void setDocumentoGTCREARptpagrPersona(PersonaOid documentoGTCREARptpagrPersona) {
        this.documentoGTCREARptpagrPersona = documentoGTCREARptpagrPersona;
    }

    @JsonIgnore
    public Persona getDocumentoGTCREARptpagrPersonaInstance() {
        return this.documentoGTCREARptpagrPersonaInstance;
    }
    
    public void setDocumentoGTCREARptpagrPersonaInstance(Persona documentoGTCREARptpagrPersona) {
        this.documentoGTCREARptpagrPersonaInstance = documentoGTCREARptpagrPersona;
        this.documentoGTCREARptpagrPersona = documentoGTCREARptpagrPersona != null ? documentoGTCREARptpagrPersona.getOid() : null;
    }

    @JsonIgnore
    public String getDocumentoGTCREARptpatrDescripcion() {
        return this.documentoGTCREARptpatrDescripcion;
    }
    
    public void setDocumentoGTCREARptpatrDescripcion(String documentoGTCREARptpatrDescripcion) {
        this.documentoGTCREARptpatrDescripcion = documentoGTCREARptpatrDescripcion;
    }

    @JsonIgnore
    public Long getDocumentoGTCREARptpatrTipo() {
        return this.documentoGTCREARptpatrTipo;
    }
    
    public void setDocumentoGTCREARptpatrTipo(Long documentoGTCREARptpatrTipo) {
        this.documentoGTCREARptpatrTipo = documentoGTCREARptpatrTipo;
    }

    @JsonIgnore
    public Long getDocumentoGTCREARptpatrEstado() {
        return this.documentoGTCREARptpatrEstado;
    }
    
    public void setDocumentoGTCREARptpatrEstado(Long documentoGTCREARptpatrEstado) {
        this.documentoGTCREARptpatrEstado = documentoGTCREARptpatrEstado;
    }

    private void checkDocumentoGTCREARptpatrEstado() throws NotNullArgumentException {
        if(this.getDocumentoGTCREARptpatrEstado() == null) {
            throw new NotNullArgumentException(DocumentoGConstants.SERV_ID_TCREAR, DocumentoGConstants.CLASS_ID, DocumentoGConstants.ARG_ID_TCREAR_DOCUMENTOGTCREARPTPATRESTADO, DocumentoGConstants.SERV_ALIAS_TCREAR, DocumentoGConstants.CLASS_ALIAS, DocumentoGConstants.ARG_ALIAS_TCREAR_DOCUMENTOGTCREARPTPATRESTADO);
        }
    }

    @JsonIgnore
    public Timestamp getDocumentoGTCREARptpatrFechaSubida() {
        return this.documentoGTCREARptpatrFechaSubida;
    }
    
    public void setDocumentoGTCREARptpatrFechaSubida(Timestamp documentoGTCREARptpatrFechaSubida) {
        this.documentoGTCREARptpatrFechaSubida = documentoGTCREARptpatrFechaSubida;
    }

    private void checkDocumentoGTCREARptpatrFechaSubida() throws NotNullArgumentException {
        if(this.getDocumentoGTCREARptpatrFechaSubida() == null) {
            throw new NotNullArgumentException(DocumentoGConstants.SERV_ID_TCREAR, DocumentoGConstants.CLASS_ID, DocumentoGConstants.ARG_ID_TCREAR_DOCUMENTOGTCREARPTPATRFECHASUBIDA, DocumentoGConstants.SERV_ALIAS_TCREAR, DocumentoGConstants.CLASS_ALIAS, DocumentoGConstants.ARG_ALIAS_TCREAR_DOCUMENTOGTCREARPTPATRFECHASUBIDA);
        }
    }

    @JsonIgnore
    public String getDocumentoGTCREARptpatrIdDocEnGestor() {
        return this.documentoGTCREARptpatrIdDocEnGestor;
    }
    
    public void setDocumentoGTCREARptpatrIdDocEnGestor(String documentoGTCREARptpatrIdDocEnGestor) {
        this.documentoGTCREARptpatrIdDocEnGestor = documentoGTCREARptpatrIdDocEnGestor;
    }

    @JsonIgnore
    public String getDocumentoGTCREARptpNombre() {
        return this.documentoGTCREARptpNombre;
    }
    
    public void setDocumentoGTCREARptpNombre(String documentoGTCREARptpNombre) {
        this.documentoGTCREARptpNombre = documentoGTCREARptpNombre;
    }

    @JsonIgnore
    public String getDocumentoGTCREARptpExtension() {
        return this.documentoGTCREARptpExtension;
    }
    
    public void setDocumentoGTCREARptpExtension(String documentoGTCREARptpExtension) {
        this.documentoGTCREARptpExtension = documentoGTCREARptpExtension;
    }
}
