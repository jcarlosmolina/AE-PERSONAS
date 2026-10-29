package com.keralty.aepersonas.viewmodel.companyia.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.CompanyiaConstants;
import com.keralty.aepersonas.persistence.Companyia;
import com.keralty.aepersonas.persistence.oid.CompanyiaOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Usuario;

public class InsCompanyiaUsuarioRequest {

    @JsonProperty("p_thiscompanyia_oid")
    private CompanyiaOid companyiaInsCompanyiaUsuariopthisCompanyia;
    
    @JsonIgnore
    private Companyia companyiaInsCompanyiaUsuariopthisCompanyiaInstance;

    @JsonProperty("p_evcusuario_oid")
    private UsuarioOid companyiaInsCompanyiaUsuariopevcUsuario;
    
    @JsonIgnore
    private Usuario companyiaInsCompanyiaUsuariopevcUsuarioInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkCompanyiaInsCompanyiaUsuariopthisCompanyia();
        checkCompanyiaInsCompanyiaUsuariopevcUsuario();
    }

    @JsonIgnore
    public CompanyiaOid getCompanyiaInsCompanyiaUsuariopthisCompanyia() {
        return this.companyiaInsCompanyiaUsuariopthisCompanyia;
    }
    
    public void setCompanyiaInsCompanyiaUsuariopthisCompanyia(CompanyiaOid companyiaInsCompanyiaUsuariopthisCompanyia) {
        this.companyiaInsCompanyiaUsuariopthisCompanyia = companyiaInsCompanyiaUsuariopthisCompanyia;
    }

    @JsonIgnore
    public Companyia getCompanyiaInsCompanyiaUsuariopthisCompanyiaInstance() {
        return this.companyiaInsCompanyiaUsuariopthisCompanyiaInstance;
    }
    
    public void setCompanyiaInsCompanyiaUsuariopthisCompanyiaInstance(Companyia companyiaInsCompanyiaUsuariopthisCompanyia) {
        this.companyiaInsCompanyiaUsuariopthisCompanyiaInstance = companyiaInsCompanyiaUsuariopthisCompanyia;
        this.companyiaInsCompanyiaUsuariopthisCompanyia = companyiaInsCompanyiaUsuariopthisCompanyia != null ? companyiaInsCompanyiaUsuariopthisCompanyia.getOid() : null;
    }

    private void checkCompanyiaInsCompanyiaUsuariopthisCompanyia() throws NotNullArgumentException {
        if(this.getCompanyiaInsCompanyiaUsuariopthisCompanyiaInstance() == null || this.getCompanyiaInsCompanyiaUsuariopthisCompanyiaInstance().isNull()) {
            throw new NotNullArgumentException(CompanyiaConstants.SERV_ID_INSCOMPANYIAUSUARIO, CompanyiaConstants.CLASS_ID, CompanyiaConstants.ARG_ID_INSCOMPANYIAUSUARIO_COMPANYIAINSCOMPANYIAUSUARIOPTHISCOMPANYIA, CompanyiaConstants.SERV_ALIAS_INSCOMPANYIAUSUARIO, CompanyiaConstants.CLASS_ALIAS, CompanyiaConstants.ARG_ALIAS_INSCOMPANYIAUSUARIO_COMPANYIAINSCOMPANYIAUSUARIOPTHISCOMPANYIA);
        }
    }

    @JsonIgnore
    public UsuarioOid getCompanyiaInsCompanyiaUsuariopevcUsuario() {
        return this.companyiaInsCompanyiaUsuariopevcUsuario;
    }
    
    public void setCompanyiaInsCompanyiaUsuariopevcUsuario(UsuarioOid companyiaInsCompanyiaUsuariopevcUsuario) {
        this.companyiaInsCompanyiaUsuariopevcUsuario = companyiaInsCompanyiaUsuariopevcUsuario;
    }

    @JsonIgnore
    public Usuario getCompanyiaInsCompanyiaUsuariopevcUsuarioInstance() {
        return this.companyiaInsCompanyiaUsuariopevcUsuarioInstance;
    }
    
    public void setCompanyiaInsCompanyiaUsuariopevcUsuarioInstance(Usuario companyiaInsCompanyiaUsuariopevcUsuario) {
        this.companyiaInsCompanyiaUsuariopevcUsuarioInstance = companyiaInsCompanyiaUsuariopevcUsuario;
        this.companyiaInsCompanyiaUsuariopevcUsuario = companyiaInsCompanyiaUsuariopevcUsuario != null ? companyiaInsCompanyiaUsuariopevcUsuario.getOid() : null;
    }

    private void checkCompanyiaInsCompanyiaUsuariopevcUsuario() throws NotNullArgumentException {
        if(this.getCompanyiaInsCompanyiaUsuariopevcUsuarioInstance() == null || this.getCompanyiaInsCompanyiaUsuariopevcUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(CompanyiaConstants.SERV_ID_INSCOMPANYIAUSUARIO, CompanyiaConstants.CLASS_ID, CompanyiaConstants.ARG_ID_INSCOMPANYIAUSUARIO_COMPANYIAINSCOMPANYIAUSUARIOPEVCUSUARIO, CompanyiaConstants.SERV_ALIAS_INSCOMPANYIAUSUARIO, CompanyiaConstants.CLASS_ALIAS, CompanyiaConstants.ARG_ALIAS_INSCOMPANYIAUSUARIO_COMPANYIAINSCOMPANYIAUSUARIOPEVCUSUARIO);
        }
    }
}
