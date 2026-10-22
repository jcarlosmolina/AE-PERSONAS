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

public class CrearRequest {

    @JsonProperty("p_agrpersona_oid")
    private PersonaOid documentoGcrearpagrPersona;
    
    @JsonIgnore
    private Persona documentoGcrearpagrPersonaInstance;

    @JsonProperty("p_agrsolicitud_oid")
    private SolicitudOid documentoGcrearpagrSolicitud;
    
    @JsonIgnore
    private Solicitud documentoGcrearpagrSolicitudInstance;

    @JsonProperty("p_atrdescripcion")
    private String documentoGcrearpatrDescripcion;

    @JsonProperty("p_atrtipo")
    private Long documentoGcrearpatrTipo;

    @JsonProperty("p_atrestado")
    private Long documentoGcrearpatrEstado;

    @JsonProperty("p_atrfechasubida")
    private Timestamp documentoGcrearpatrFechaSubida;

    @JsonProperty("p_atriddocengestor")
    private String documentoGcrearpatrIdDocEnGestor;

    @JsonProperty("p_atrusuariocreador")
    private String documentoGcrearpatrUsuarioCreador;

    public void checkArguments() throws NotNullArgumentException {
        checkDocumentoGcrearpagrPersona();
        checkDocumentoGcrearpagrSolicitud();
        checkDocumentoGcrearpatrEstado();
        checkDocumentoGcrearpatrFechaSubida();
        checkDocumentoGcrearpatrUsuarioCreador();
    }

    @JsonIgnore
    public PersonaOid getDocumentoGcrearpagrPersona() {
        return this.documentoGcrearpagrPersona;
    }
    
    public void setDocumentoGcrearpagrPersona(PersonaOid documentoGcrearpagrPersona) {
        this.documentoGcrearpagrPersona = documentoGcrearpagrPersona;
    }

    @JsonIgnore
    public Persona getDocumentoGcrearpagrPersonaInstance() {
        return this.documentoGcrearpagrPersonaInstance;
    }
    
    public void setDocumentoGcrearpagrPersonaInstance(Persona documentoGcrearpagrPersona) {
        this.documentoGcrearpagrPersonaInstance = documentoGcrearpagrPersona;
        this.documentoGcrearpagrPersona = documentoGcrearpagrPersona != null ? documentoGcrearpagrPersona.getOid() : null;
    }

    private void checkDocumentoGcrearpagrPersona() throws NotNullArgumentException {
        if(this.getDocumentoGcrearpagrPersonaInstance() == null || this.getDocumentoGcrearpagrPersonaInstance().isNull()) {
            throw new NotNullArgumentException(DocumentoGConstants.SERV_ID_CREAR, DocumentoGConstants.CLASS_ID, DocumentoGConstants.ARG_ID_CREAR_DOCUMENTOGCREARPAGRPERSONA, DocumentoGConstants.SERV_ALIAS_CREAR, DocumentoGConstants.CLASS_ALIAS, DocumentoGConstants.ARG_ALIAS_CREAR_DOCUMENTOGCREARPAGRPERSONA);
        }
    }

    @JsonIgnore
    public SolicitudOid getDocumentoGcrearpagrSolicitud() {
        return this.documentoGcrearpagrSolicitud;
    }
    
    public void setDocumentoGcrearpagrSolicitud(SolicitudOid documentoGcrearpagrSolicitud) {
        this.documentoGcrearpagrSolicitud = documentoGcrearpagrSolicitud;
    }

    @JsonIgnore
    public Solicitud getDocumentoGcrearpagrSolicitudInstance() {
        return this.documentoGcrearpagrSolicitudInstance;
    }
    
    public void setDocumentoGcrearpagrSolicitudInstance(Solicitud documentoGcrearpagrSolicitud) {
        this.documentoGcrearpagrSolicitudInstance = documentoGcrearpagrSolicitud;
        this.documentoGcrearpagrSolicitud = documentoGcrearpagrSolicitud != null ? documentoGcrearpagrSolicitud.getOid() : null;
    }

    private void checkDocumentoGcrearpagrSolicitud() throws NotNullArgumentException {
        if(this.getDocumentoGcrearpagrSolicitudInstance() == null || this.getDocumentoGcrearpagrSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(DocumentoGConstants.SERV_ID_CREAR, DocumentoGConstants.CLASS_ID, DocumentoGConstants.ARG_ID_CREAR_DOCUMENTOGCREARPAGRSOLICITUD, DocumentoGConstants.SERV_ALIAS_CREAR, DocumentoGConstants.CLASS_ALIAS, DocumentoGConstants.ARG_ALIAS_CREAR_DOCUMENTOGCREARPAGRSOLICITUD);
        }
    }

    @JsonIgnore
    public String getDocumentoGcrearpatrDescripcion() {
        return this.documentoGcrearpatrDescripcion;
    }
    
    public void setDocumentoGcrearpatrDescripcion(String documentoGcrearpatrDescripcion) {
        this.documentoGcrearpatrDescripcion = documentoGcrearpatrDescripcion;
    }

    @JsonIgnore
    public Long getDocumentoGcrearpatrTipo() {
        return this.documentoGcrearpatrTipo;
    }
    
    public void setDocumentoGcrearpatrTipo(Long documentoGcrearpatrTipo) {
        this.documentoGcrearpatrTipo = documentoGcrearpatrTipo;
    }

    @JsonIgnore
    public Long getDocumentoGcrearpatrEstado() {
        return this.documentoGcrearpatrEstado;
    }
    
    public void setDocumentoGcrearpatrEstado(Long documentoGcrearpatrEstado) {
        this.documentoGcrearpatrEstado = documentoGcrearpatrEstado;
    }

    private void checkDocumentoGcrearpatrEstado() throws NotNullArgumentException {
        if(this.getDocumentoGcrearpatrEstado() == null) {
            throw new NotNullArgumentException(DocumentoGConstants.SERV_ID_CREAR, DocumentoGConstants.CLASS_ID, DocumentoGConstants.ARG_ID_CREAR_DOCUMENTOGCREARPATRESTADO, DocumentoGConstants.SERV_ALIAS_CREAR, DocumentoGConstants.CLASS_ALIAS, DocumentoGConstants.ARG_ALIAS_CREAR_DOCUMENTOGCREARPATRESTADO);
        }
    }

    @JsonIgnore
    public Timestamp getDocumentoGcrearpatrFechaSubida() {
        return this.documentoGcrearpatrFechaSubida;
    }
    
    public void setDocumentoGcrearpatrFechaSubida(Timestamp documentoGcrearpatrFechaSubida) {
        this.documentoGcrearpatrFechaSubida = documentoGcrearpatrFechaSubida;
    }

    private void checkDocumentoGcrearpatrFechaSubida() throws NotNullArgumentException {
        if(this.getDocumentoGcrearpatrFechaSubida() == null) {
            throw new NotNullArgumentException(DocumentoGConstants.SERV_ID_CREAR, DocumentoGConstants.CLASS_ID, DocumentoGConstants.ARG_ID_CREAR_DOCUMENTOGCREARPATRFECHASUBIDA, DocumentoGConstants.SERV_ALIAS_CREAR, DocumentoGConstants.CLASS_ALIAS, DocumentoGConstants.ARG_ALIAS_CREAR_DOCUMENTOGCREARPATRFECHASUBIDA);
        }
    }

    @JsonIgnore
    public String getDocumentoGcrearpatrIdDocEnGestor() {
        return this.documentoGcrearpatrIdDocEnGestor;
    }
    
    public void setDocumentoGcrearpatrIdDocEnGestor(String documentoGcrearpatrIdDocEnGestor) {
        this.documentoGcrearpatrIdDocEnGestor = documentoGcrearpatrIdDocEnGestor;
    }

    @JsonIgnore
    public String getDocumentoGcrearpatrUsuarioCreador() {
        return this.documentoGcrearpatrUsuarioCreador;
    }
    
    public void setDocumentoGcrearpatrUsuarioCreador(String documentoGcrearpatrUsuarioCreador) {
        this.documentoGcrearpatrUsuarioCreador = documentoGcrearpatrUsuarioCreador;
    }

    private void checkDocumentoGcrearpatrUsuarioCreador() throws NotNullArgumentException {
        if(this.getDocumentoGcrearpatrUsuarioCreador() == null) {
            throw new NotNullArgumentException(DocumentoGConstants.SERV_ID_CREAR, DocumentoGConstants.CLASS_ID, DocumentoGConstants.ARG_ID_CREAR_DOCUMENTOGCREARPATRUSUARIOCREADOR, DocumentoGConstants.SERV_ALIAS_CREAR, DocumentoGConstants.CLASS_ALIAS, DocumentoGConstants.ARG_ALIAS_CREAR_DOCUMENTOGCREARPATRUSUARIOCREADOR);
        }
    }
}
