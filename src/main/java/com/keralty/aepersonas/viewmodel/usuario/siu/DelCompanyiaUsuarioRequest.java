package com.keralty.aepersonas.viewmodel.usuario.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.persistence.Companyia;
import com.keralty.aepersonas.persistence.oid.CompanyiaOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Usuario;

public class DelCompanyiaUsuarioRequest {

    @JsonProperty("p_thisattrusuario_oid")
    private UsuarioOid usuarioDelCompanyiaUsuariopthisAttrUsuario;
    
    @JsonIgnore
    private Usuario usuarioDelCompanyiaUsuariopthisAttrUsuarioInstance;

    @JsonProperty("p_evccompanyia_oid")
    private CompanyiaOid usuarioDelCompanyiaUsuariopevcCompanyia;
    
    @JsonIgnore
    private Companyia usuarioDelCompanyiaUsuariopevcCompanyiaInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkUsuarioDelCompanyiaUsuariopthisAttrUsuario();
        checkUsuarioDelCompanyiaUsuariopevcCompanyia();
    }

    @JsonIgnore
    public UsuarioOid getUsuarioDelCompanyiaUsuariopthisAttrUsuario() {
        return this.usuarioDelCompanyiaUsuariopthisAttrUsuario;
    }
    
    public void setUsuarioDelCompanyiaUsuariopthisAttrUsuario(UsuarioOid usuarioDelCompanyiaUsuariopthisAttrUsuario) {
        this.usuarioDelCompanyiaUsuariopthisAttrUsuario = usuarioDelCompanyiaUsuariopthisAttrUsuario;
    }

    @JsonIgnore
    public Usuario getUsuarioDelCompanyiaUsuariopthisAttrUsuarioInstance() {
        return this.usuarioDelCompanyiaUsuariopthisAttrUsuarioInstance;
    }
    
    public void setUsuarioDelCompanyiaUsuariopthisAttrUsuarioInstance(Usuario usuarioDelCompanyiaUsuariopthisAttrUsuario) {
        this.usuarioDelCompanyiaUsuariopthisAttrUsuarioInstance = usuarioDelCompanyiaUsuariopthisAttrUsuario;
        this.usuarioDelCompanyiaUsuariopthisAttrUsuario = usuarioDelCompanyiaUsuariopthisAttrUsuario != null ? usuarioDelCompanyiaUsuariopthisAttrUsuario.getOid() : null;
    }

    private void checkUsuarioDelCompanyiaUsuariopthisAttrUsuario() throws NotNullArgumentException {
        if(this.getUsuarioDelCompanyiaUsuariopthisAttrUsuarioInstance() == null || this.getUsuarioDelCompanyiaUsuariopthisAttrUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_DELCOMPANYIAUSUARIO, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_DELCOMPANYIAUSUARIO_USUARIODELCOMPANYIAUSUARIOPTHISATTRUSUARIO, UsuarioConstants.SERV_ALIAS_DELCOMPANYIAUSUARIO, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_DELCOMPANYIAUSUARIO_USUARIODELCOMPANYIAUSUARIOPTHISATTRUSUARIO);
        }
    }

    @JsonIgnore
    public CompanyiaOid getUsuarioDelCompanyiaUsuariopevcCompanyia() {
        return this.usuarioDelCompanyiaUsuariopevcCompanyia;
    }
    
    public void setUsuarioDelCompanyiaUsuariopevcCompanyia(CompanyiaOid usuarioDelCompanyiaUsuariopevcCompanyia) {
        this.usuarioDelCompanyiaUsuariopevcCompanyia = usuarioDelCompanyiaUsuariopevcCompanyia;
    }

    @JsonIgnore
    public Companyia getUsuarioDelCompanyiaUsuariopevcCompanyiaInstance() {
        return this.usuarioDelCompanyiaUsuariopevcCompanyiaInstance;
    }
    
    public void setUsuarioDelCompanyiaUsuariopevcCompanyiaInstance(Companyia usuarioDelCompanyiaUsuariopevcCompanyia) {
        this.usuarioDelCompanyiaUsuariopevcCompanyiaInstance = usuarioDelCompanyiaUsuariopevcCompanyia;
        this.usuarioDelCompanyiaUsuariopevcCompanyia = usuarioDelCompanyiaUsuariopevcCompanyia != null ? usuarioDelCompanyiaUsuariopevcCompanyia.getOid() : null;
    }

    private void checkUsuarioDelCompanyiaUsuariopevcCompanyia() throws NotNullArgumentException {
        if(this.getUsuarioDelCompanyiaUsuariopevcCompanyiaInstance() == null || this.getUsuarioDelCompanyiaUsuariopevcCompanyiaInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_DELCOMPANYIAUSUARIO, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_DELCOMPANYIAUSUARIO_USUARIODELCOMPANYIAUSUARIOPEVCCOMPANYIA, UsuarioConstants.SERV_ALIAS_DELCOMPANYIAUSUARIO, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_DELCOMPANYIAUSUARIO_USUARIODELCOMPANYIAUSUARIOPEVCCOMPANYIA);
        }
    }
}
