package com.keralty.aepersonas.viewmodel.usuario.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.persistence.Companyia;
import com.keralty.aepersonas.persistence.Eps;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Parentesco;
import com.keralty.aepersonas.persistence.Usuario;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneDeserializer;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneSerializer;
import java.sql.Date;

public class TMODIFICARATTRRequest {

    @JsonProperty("p_thisattrusuario_oid")
    private UsuarioOid usuarioTMODIFICARATTRpthisAttrUsuario;
    
    @JsonIgnore
    private Usuario usuarioTMODIFICARATTRpthisAttrUsuarioInstance;

    @JsonProperty("pt_p_bebegestante")
    private Boolean usuarioTMODIFICARATTRptpBebeGestante;

    @JsonProperty("pt_p_evccompanyia_json")
    private String usuarioTMODIFICARATTRptpevcCompanyia;
    
    @JsonIgnore
    private Companyia usuarioTMODIFICARATTRptpevcCompanyiaInstance;

    @JsonProperty("pt_p_evceps_json")
    private String usuarioTMODIFICARATTRptpevcEPS;
    
    @JsonIgnore
    private Eps usuarioTMODIFICARATTRptpevcEPSInstance;

    @JsonProperty("pt_p_evcparentesco_json")
    private String usuarioTMODIFICARATTRptpevcParentesco;
    
    @JsonIgnore
    private Parentesco usuarioTMODIFICARATTRptpevcParentescoInstance;

    @JsonProperty("pt_p_codigobancorep")
    private String usuarioTMODIFICARATTRptpcodigoBancoRep;

    @JsonProperty("pt_p_fechaantiguedad")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date usuarioTMODIFICARATTRptpFechaAntiguedad;

    @JsonProperty("pt_pepolizainternacional")
    private Boolean usuarioTMODIFICARATTRptpePolizaInternacional;

    @JsonProperty("preconditionId")
    private String preconditionId;

    public void checkArguments() throws NotNullArgumentException {
        checkUsuarioTMODIFICARATTRpthisAttrUsuario();
        checkUsuarioTMODIFICARATTRptpBebeGestante();
        checkUsuarioTMODIFICARATTRptpevcEPS();
        checkUsuarioTMODIFICARATTRptpevcParentesco();
        checkUsuarioTMODIFICARATTRptpePolizaInternacional();
    }

    @JsonIgnore
    public UsuarioOid getUsuarioTMODIFICARATTRpthisAttrUsuario() {
        return this.usuarioTMODIFICARATTRpthisAttrUsuario;
    }
    
    public void setUsuarioTMODIFICARATTRpthisAttrUsuario(UsuarioOid usuarioTMODIFICARATTRpthisAttrUsuario) {
        this.usuarioTMODIFICARATTRpthisAttrUsuario = usuarioTMODIFICARATTRpthisAttrUsuario;
    }

    @JsonIgnore
    public Usuario getUsuarioTMODIFICARATTRpthisAttrUsuarioInstance() {
        return this.usuarioTMODIFICARATTRpthisAttrUsuarioInstance;
    }
    
    public void setUsuarioTMODIFICARATTRpthisAttrUsuarioInstance(Usuario usuarioTMODIFICARATTRpthisAttrUsuario) {
        this.usuarioTMODIFICARATTRpthisAttrUsuarioInstance = usuarioTMODIFICARATTRpthisAttrUsuario;
        this.usuarioTMODIFICARATTRpthisAttrUsuario = usuarioTMODIFICARATTRpthisAttrUsuario != null ? usuarioTMODIFICARATTRpthisAttrUsuario.getOid() : null;
    }

    private void checkUsuarioTMODIFICARATTRpthisAttrUsuario() throws NotNullArgumentException {
        if(this.getUsuarioTMODIFICARATTRpthisAttrUsuarioInstance() == null || this.getUsuarioTMODIFICARATTRpthisAttrUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TMODIFICARATTR, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TMODIFICARATTR_USUARIOTMODIFICARATTRPTHISATTRUSUARIO, UsuarioConstants.SERV_ALIAS_TMODIFICARATTR, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TMODIFICARATTR_USUARIOTMODIFICARATTRPTHISATTRUSUARIO);
        }
    }

    @JsonIgnore
    public Boolean getUsuarioTMODIFICARATTRptpBebeGestante() {
        return this.usuarioTMODIFICARATTRptpBebeGestante;
    }
    
    public void setUsuarioTMODIFICARATTRptpBebeGestante(Boolean usuarioTMODIFICARATTRptpBebeGestante) {
        this.usuarioTMODIFICARATTRptpBebeGestante = usuarioTMODIFICARATTRptpBebeGestante;
    }

    private void checkUsuarioTMODIFICARATTRptpBebeGestante() throws NotNullArgumentException {
        if(this.getUsuarioTMODIFICARATTRptpBebeGestante() == null) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TMODIFICARATTR, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TMODIFICARATTR_USUARIOTMODIFICARATTRPTPBEBEGESTANTE, UsuarioConstants.SERV_ALIAS_TMODIFICARATTR, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TMODIFICARATTR_USUARIOTMODIFICARATTRPTPBEBEGESTANTE);
        }
    }

    @JsonIgnore
    public String getUsuarioTMODIFICARATTRptpevcCompanyia() {
        return this.usuarioTMODIFICARATTRptpevcCompanyia;
    }
    
    public void setUsuarioTMODIFICARATTRptpevcCompanyia(String usuarioTMODIFICARATTRptpevcCompanyia) {
        this.usuarioTMODIFICARATTRptpevcCompanyia = usuarioTMODIFICARATTRptpevcCompanyia;
    }

    @JsonIgnore
    public Companyia getUsuarioTMODIFICARATTRptpevcCompanyiaInstance() {
        return this.usuarioTMODIFICARATTRptpevcCompanyiaInstance;
    }
    
    public void setUsuarioTMODIFICARATTRptpevcCompanyiaInstance(Companyia usuarioTMODIFICARATTRptpevcCompanyia) {
        this.usuarioTMODIFICARATTRptpevcCompanyiaInstance = usuarioTMODIFICARATTRptpevcCompanyia;
        this.usuarioTMODIFICARATTRptpevcCompanyia = usuarioTMODIFICARATTRptpevcCompanyia != null ? usuarioTMODIFICARATTRptpevcCompanyia.getOid().toJson() : "";
    }

    @JsonIgnore
    public String getUsuarioTMODIFICARATTRptpevcEPS() {
        return this.usuarioTMODIFICARATTRptpevcEPS;
    }
    
    public void setUsuarioTMODIFICARATTRptpevcEPS(String usuarioTMODIFICARATTRptpevcEPS) {
        this.usuarioTMODIFICARATTRptpevcEPS = usuarioTMODIFICARATTRptpevcEPS;
    }

    @JsonIgnore
    public Eps getUsuarioTMODIFICARATTRptpevcEPSInstance() {
        return this.usuarioTMODIFICARATTRptpevcEPSInstance;
    }
    
    public void setUsuarioTMODIFICARATTRptpevcEPSInstance(Eps usuarioTMODIFICARATTRptpevcEPS) {
        this.usuarioTMODIFICARATTRptpevcEPSInstance = usuarioTMODIFICARATTRptpevcEPS;
        this.usuarioTMODIFICARATTRptpevcEPS = usuarioTMODIFICARATTRptpevcEPS != null ? usuarioTMODIFICARATTRptpevcEPS.getOid().toJson() : "";
    }

    private void checkUsuarioTMODIFICARATTRptpevcEPS() throws NotNullArgumentException {
        if(this.getUsuarioTMODIFICARATTRptpevcEPSInstance() == null || this.getUsuarioTMODIFICARATTRptpevcEPSInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TMODIFICARATTR, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TMODIFICARATTR_USUARIOTMODIFICARATTRPTPEVCEPS, UsuarioConstants.SERV_ALIAS_TMODIFICARATTR, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TMODIFICARATTR_USUARIOTMODIFICARATTRPTPEVCEPS);
        }
    }

    @JsonIgnore
    public String getUsuarioTMODIFICARATTRptpevcParentesco() {
        return this.usuarioTMODIFICARATTRptpevcParentesco;
    }
    
    public void setUsuarioTMODIFICARATTRptpevcParentesco(String usuarioTMODIFICARATTRptpevcParentesco) {
        this.usuarioTMODIFICARATTRptpevcParentesco = usuarioTMODIFICARATTRptpevcParentesco;
    }

    @JsonIgnore
    public Parentesco getUsuarioTMODIFICARATTRptpevcParentescoInstance() {
        return this.usuarioTMODIFICARATTRptpevcParentescoInstance;
    }
    
    public void setUsuarioTMODIFICARATTRptpevcParentescoInstance(Parentesco usuarioTMODIFICARATTRptpevcParentesco) {
        this.usuarioTMODIFICARATTRptpevcParentescoInstance = usuarioTMODIFICARATTRptpevcParentesco;
        this.usuarioTMODIFICARATTRptpevcParentesco = usuarioTMODIFICARATTRptpevcParentesco != null ? usuarioTMODIFICARATTRptpevcParentesco.getOid().toJson() : "";
    }

    private void checkUsuarioTMODIFICARATTRptpevcParentesco() throws NotNullArgumentException {
        if(this.getUsuarioTMODIFICARATTRptpevcParentescoInstance() == null || this.getUsuarioTMODIFICARATTRptpevcParentescoInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TMODIFICARATTR, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TMODIFICARATTR_USUARIOTMODIFICARATTRPTPEVCPARENTESCO, UsuarioConstants.SERV_ALIAS_TMODIFICARATTR, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TMODIFICARATTR_USUARIOTMODIFICARATTRPTPEVCPARENTESCO);
        }
    }

    @JsonIgnore
    public String getUsuarioTMODIFICARATTRptpcodigoBancoRep() {
        return this.usuarioTMODIFICARATTRptpcodigoBancoRep;
    }
    
    public void setUsuarioTMODIFICARATTRptpcodigoBancoRep(String usuarioTMODIFICARATTRptpcodigoBancoRep) {
        this.usuarioTMODIFICARATTRptpcodigoBancoRep = usuarioTMODIFICARATTRptpcodigoBancoRep;
    }

    @JsonIgnore
    public Date getUsuarioTMODIFICARATTRptpFechaAntiguedad() {
        return this.usuarioTMODIFICARATTRptpFechaAntiguedad;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setUsuarioTMODIFICARATTRptpFechaAntiguedad(Date usuarioTMODIFICARATTRptpFechaAntiguedad) {
        this.usuarioTMODIFICARATTRptpFechaAntiguedad = usuarioTMODIFICARATTRptpFechaAntiguedad;
    }

    @JsonIgnore
    public Boolean getUsuarioTMODIFICARATTRptpePolizaInternacional() {
        return this.usuarioTMODIFICARATTRptpePolizaInternacional;
    }
    
    public void setUsuarioTMODIFICARATTRptpePolizaInternacional(Boolean usuarioTMODIFICARATTRptpePolizaInternacional) {
        this.usuarioTMODIFICARATTRptpePolizaInternacional = usuarioTMODIFICARATTRptpePolizaInternacional;
    }

    private void checkUsuarioTMODIFICARATTRptpePolizaInternacional() throws NotNullArgumentException {
        if(this.getUsuarioTMODIFICARATTRptpePolizaInternacional() == null) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TMODIFICARATTR, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TMODIFICARATTR_USUARIOTMODIFICARATTRPTPEPOLIZAINTERNACIONAL, UsuarioConstants.SERV_ALIAS_TMODIFICARATTR, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TMODIFICARATTR_USUARIOTMODIFICARATTRPTPEPOLIZAINTERNACIONAL);
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
