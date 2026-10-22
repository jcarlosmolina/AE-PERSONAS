package com.keralty.aepersonas.viewmodel.usuario.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.persistence.oid.ParentescoOid;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.Parentesco;
import com.keralty.aepersonas.persistence.Persona;
import com.keralty.aepersonas.persistence.Solicitud;

public class TCREARRequest {

    @JsonProperty("pt_p_agrsolicitud_oid")
    private SolicitudOid usuarioTCREARptpagrSolicitud;
    
    @JsonIgnore
    private Solicitud usuarioTCREARptpagrSolicitudInstance;

    @JsonProperty("pt_p_agrusuario_oid")
    private PersonaOid usuarioTCREARptpagrUsuario;
    
    @JsonIgnore
    private Persona usuarioTCREARptpagrUsuarioInstance;

    @JsonProperty("pt_p_agrparentesco_oid")
    private ParentescoOid usuarioTCREARptpagrParentesco;
    
    @JsonIgnore
    private Parentesco usuarioTCREARptpagrParentescoInstance;

    @JsonProperty("pt_p_atrcodigotipousuario")
    private Long usuarioTCREARptpatrCodigoTipoUsuario;

    @JsonProperty("pt_p_atrbebegestante")
    private Boolean usuarioTCREARptpatrBebeGestante;

    @JsonProperty("pt_p_atrcodigobancorep")
    private String usuarioTCREARptpatrcodigoBancoRep;

    @JsonProperty("pt_p_atrusuarioreplicado")
    private Boolean usuarioTCREARptpatrUsuarioReplicado;

    @JsonProperty("preconditionId")
    private String preconditionId;

    public void checkArguments() throws NotNullArgumentException {
        checkUsuarioTCREARptpagrSolicitud();
        checkUsuarioTCREARptpagrUsuario();
        checkUsuarioTCREARptpatrCodigoTipoUsuario();
        checkUsuarioTCREARptpatrBebeGestante();
        checkUsuarioTCREARptpatrUsuarioReplicado();
    }

    @JsonIgnore
    public SolicitudOid getUsuarioTCREARptpagrSolicitud() {
        return this.usuarioTCREARptpagrSolicitud;
    }
    
    public void setUsuarioTCREARptpagrSolicitud(SolicitudOid usuarioTCREARptpagrSolicitud) {
        this.usuarioTCREARptpagrSolicitud = usuarioTCREARptpagrSolicitud;
    }

    @JsonIgnore
    public Solicitud getUsuarioTCREARptpagrSolicitudInstance() {
        return this.usuarioTCREARptpagrSolicitudInstance;
    }
    
    public void setUsuarioTCREARptpagrSolicitudInstance(Solicitud usuarioTCREARptpagrSolicitud) {
        this.usuarioTCREARptpagrSolicitudInstance = usuarioTCREARptpagrSolicitud;
        this.usuarioTCREARptpagrSolicitud = usuarioTCREARptpagrSolicitud != null ? usuarioTCREARptpagrSolicitud.getOid() : null;
    }

    private void checkUsuarioTCREARptpagrSolicitud() throws NotNullArgumentException {
        if(this.getUsuarioTCREARptpagrSolicitudInstance() == null || this.getUsuarioTCREARptpagrSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TCREAR, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TCREAR_USUARIOTCREARPTPAGRSOLICITUD, UsuarioConstants.SERV_ALIAS_TCREAR, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TCREAR_USUARIOTCREARPTPAGRSOLICITUD);
        }
    }

    @JsonIgnore
    public PersonaOid getUsuarioTCREARptpagrUsuario() {
        return this.usuarioTCREARptpagrUsuario;
    }
    
    public void setUsuarioTCREARptpagrUsuario(PersonaOid usuarioTCREARptpagrUsuario) {
        this.usuarioTCREARptpagrUsuario = usuarioTCREARptpagrUsuario;
    }

    @JsonIgnore
    public Persona getUsuarioTCREARptpagrUsuarioInstance() {
        return this.usuarioTCREARptpagrUsuarioInstance;
    }
    
    public void setUsuarioTCREARptpagrUsuarioInstance(Persona usuarioTCREARptpagrUsuario) {
        this.usuarioTCREARptpagrUsuarioInstance = usuarioTCREARptpagrUsuario;
        this.usuarioTCREARptpagrUsuario = usuarioTCREARptpagrUsuario != null ? usuarioTCREARptpagrUsuario.getOid() : null;
    }

    private void checkUsuarioTCREARptpagrUsuario() throws NotNullArgumentException {
        if(this.getUsuarioTCREARptpagrUsuarioInstance() == null || this.getUsuarioTCREARptpagrUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TCREAR, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TCREAR_USUARIOTCREARPTPAGRUSUARIO, UsuarioConstants.SERV_ALIAS_TCREAR, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TCREAR_USUARIOTCREARPTPAGRUSUARIO);
        }
    }

    @JsonIgnore
    public ParentescoOid getUsuarioTCREARptpagrParentesco() {
        return this.usuarioTCREARptpagrParentesco;
    }
    
    public void setUsuarioTCREARptpagrParentesco(ParentescoOid usuarioTCREARptpagrParentesco) {
        this.usuarioTCREARptpagrParentesco = usuarioTCREARptpagrParentesco;
    }

    @JsonIgnore
    public Parentesco getUsuarioTCREARptpagrParentescoInstance() {
        return this.usuarioTCREARptpagrParentescoInstance;
    }
    
    public void setUsuarioTCREARptpagrParentescoInstance(Parentesco usuarioTCREARptpagrParentesco) {
        this.usuarioTCREARptpagrParentescoInstance = usuarioTCREARptpagrParentesco;
        this.usuarioTCREARptpagrParentesco = usuarioTCREARptpagrParentesco != null ? usuarioTCREARptpagrParentesco.getOid() : null;
    }

    @JsonIgnore
    public Long getUsuarioTCREARptpatrCodigoTipoUsuario() {
        return this.usuarioTCREARptpatrCodigoTipoUsuario;
    }
    
    public void setUsuarioTCREARptpatrCodigoTipoUsuario(Long usuarioTCREARptpatrCodigoTipoUsuario) {
        this.usuarioTCREARptpatrCodigoTipoUsuario = usuarioTCREARptpatrCodigoTipoUsuario;
    }

    private void checkUsuarioTCREARptpatrCodigoTipoUsuario() throws NotNullArgumentException {
        if(this.getUsuarioTCREARptpatrCodigoTipoUsuario() == null) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TCREAR, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TCREAR_USUARIOTCREARPTPATRCODIGOTIPOUSUARIO, UsuarioConstants.SERV_ALIAS_TCREAR, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TCREAR_USUARIOTCREARPTPATRCODIGOTIPOUSUARIO);
        }
    }

    @JsonIgnore
    public Boolean getUsuarioTCREARptpatrBebeGestante() {
        return this.usuarioTCREARptpatrBebeGestante;
    }
    
    public void setUsuarioTCREARptpatrBebeGestante(Boolean usuarioTCREARptpatrBebeGestante) {
        this.usuarioTCREARptpatrBebeGestante = usuarioTCREARptpatrBebeGestante;
    }

    private void checkUsuarioTCREARptpatrBebeGestante() throws NotNullArgumentException {
        if(this.getUsuarioTCREARptpatrBebeGestante() == null) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TCREAR, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TCREAR_USUARIOTCREARPTPATRBEBEGESTANTE, UsuarioConstants.SERV_ALIAS_TCREAR, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TCREAR_USUARIOTCREARPTPATRBEBEGESTANTE);
        }
    }

    @JsonIgnore
    public String getUsuarioTCREARptpatrcodigoBancoRep() {
        return this.usuarioTCREARptpatrcodigoBancoRep;
    }
    
    public void setUsuarioTCREARptpatrcodigoBancoRep(String usuarioTCREARptpatrcodigoBancoRep) {
        this.usuarioTCREARptpatrcodigoBancoRep = usuarioTCREARptpatrcodigoBancoRep;
    }

    @JsonIgnore
    public Boolean getUsuarioTCREARptpatrUsuarioReplicado() {
        return this.usuarioTCREARptpatrUsuarioReplicado;
    }
    
    public void setUsuarioTCREARptpatrUsuarioReplicado(Boolean usuarioTCREARptpatrUsuarioReplicado) {
        this.usuarioTCREARptpatrUsuarioReplicado = usuarioTCREARptpatrUsuarioReplicado;
    }

    private void checkUsuarioTCREARptpatrUsuarioReplicado() throws NotNullArgumentException {
        if(this.getUsuarioTCREARptpatrUsuarioReplicado() == null) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TCREAR, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TCREAR_USUARIOTCREARPTPATRUSUARIOREPLICADO, UsuarioConstants.SERV_ALIAS_TCREAR, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TCREAR_USUARIOTCREARPTPATRUSUARIOREPLICADO);
        }
    }

    @JsonIgnore
    public String getPreconditionId() {
        return this.preconditionId;
    }
    
    public void setPreconditionId(String preconditionId) {
        this.preconditionId = preconditionId;
    }
}
