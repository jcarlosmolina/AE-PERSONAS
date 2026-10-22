package com.keralty.aepersonas.viewmodel.usuario.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.persistence.Companyia;
import com.keralty.aepersonas.persistence.oid.CompanyiaOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Usuario;

public class InsCompanyiaUsuarioRequest {

    @JsonProperty("p_thisattrusuario_oid")
    private UsuarioOid usuarioInsCompanyiaUsuariopthisAttrUsuario;
    
    @JsonIgnore
    private Usuario usuarioInsCompanyiaUsuariopthisAttrUsuarioInstance;

    @JsonProperty("p_evccompanyia_oid")
    private CompanyiaOid usuarioInsCompanyiaUsuariopevcCompanyia;
    
    @JsonIgnore
    private Companyia usuarioInsCompanyiaUsuariopevcCompanyiaInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkUsuarioInsCompanyiaUsuariopthisAttrUsuario();
        checkUsuarioInsCompanyiaUsuariopevcCompanyia();
    }

    @JsonIgnore
    public UsuarioOid getUsuarioInsCompanyiaUsuariopthisAttrUsuario() {
        return this.usuarioInsCompanyiaUsuariopthisAttrUsuario;
    }
    
    public void setUsuarioInsCompanyiaUsuariopthisAttrUsuario(UsuarioOid usuarioInsCompanyiaUsuariopthisAttrUsuario) {
        this.usuarioInsCompanyiaUsuariopthisAttrUsuario = usuarioInsCompanyiaUsuariopthisAttrUsuario;
    }

    @JsonIgnore
    public Usuario getUsuarioInsCompanyiaUsuariopthisAttrUsuarioInstance() {
        return this.usuarioInsCompanyiaUsuariopthisAttrUsuarioInstance;
    }
    
    public void setUsuarioInsCompanyiaUsuariopthisAttrUsuarioInstance(Usuario usuarioInsCompanyiaUsuariopthisAttrUsuario) {
        this.usuarioInsCompanyiaUsuariopthisAttrUsuarioInstance = usuarioInsCompanyiaUsuariopthisAttrUsuario;
        this.usuarioInsCompanyiaUsuariopthisAttrUsuario = usuarioInsCompanyiaUsuariopthisAttrUsuario != null ? usuarioInsCompanyiaUsuariopthisAttrUsuario.getOid() : null;
    }

    private void checkUsuarioInsCompanyiaUsuariopthisAttrUsuario() throws NotNullArgumentException {
        if(this.getUsuarioInsCompanyiaUsuariopthisAttrUsuarioInstance() == null || this.getUsuarioInsCompanyiaUsuariopthisAttrUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_INSCOMPANYIAUSUARIO, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_INSCOMPANYIAUSUARIO_USUARIOINSCOMPANYIAUSUARIOPTHISATTRUSUARIO, UsuarioConstants.SERV_ALIAS_INSCOMPANYIAUSUARIO, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_INSCOMPANYIAUSUARIO_USUARIOINSCOMPANYIAUSUARIOPTHISATTRUSUARIO);
        }
    }

    @JsonIgnore
    public CompanyiaOid getUsuarioInsCompanyiaUsuariopevcCompanyia() {
        return this.usuarioInsCompanyiaUsuariopevcCompanyia;
    }
    
    public void setUsuarioInsCompanyiaUsuariopevcCompanyia(CompanyiaOid usuarioInsCompanyiaUsuariopevcCompanyia) {
        this.usuarioInsCompanyiaUsuariopevcCompanyia = usuarioInsCompanyiaUsuariopevcCompanyia;
    }

    @JsonIgnore
    public Companyia getUsuarioInsCompanyiaUsuariopevcCompanyiaInstance() {
        return this.usuarioInsCompanyiaUsuariopevcCompanyiaInstance;
    }
    
    public void setUsuarioInsCompanyiaUsuariopevcCompanyiaInstance(Companyia usuarioInsCompanyiaUsuariopevcCompanyia) {
        this.usuarioInsCompanyiaUsuariopevcCompanyiaInstance = usuarioInsCompanyiaUsuariopevcCompanyia;
        this.usuarioInsCompanyiaUsuariopevcCompanyia = usuarioInsCompanyiaUsuariopevcCompanyia != null ? usuarioInsCompanyiaUsuariopevcCompanyia.getOid() : null;
    }

    private void checkUsuarioInsCompanyiaUsuariopevcCompanyia() throws NotNullArgumentException {
        if(this.getUsuarioInsCompanyiaUsuariopevcCompanyiaInstance() == null || this.getUsuarioInsCompanyiaUsuariopevcCompanyiaInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_INSCOMPANYIAUSUARIO, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_INSCOMPANYIAUSUARIO_USUARIOINSCOMPANYIAUSUARIOPEVCCOMPANYIA, UsuarioConstants.SERV_ALIAS_INSCOMPANYIAUSUARIO, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_INSCOMPANYIAUSUARIO_USUARIOINSCOMPANYIAUSUARIOPEVCCOMPANYIA);
        }
    }
}
