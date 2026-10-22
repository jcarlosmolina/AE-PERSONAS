package com.keralty.aepersonas.viewmodel.companyia.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.CompanyiaConstants;
import com.keralty.aepersonas.persistence.Companyia;
import com.keralty.aepersonas.persistence.oid.CompanyiaOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Usuario;

public class DelCompanyiaUsuarioRequest {

    @JsonProperty("p_thiscompanyia_oid")
    private CompanyiaOid companyiaDelCompanyiaUsuariopthisCompanyia;
    
    @JsonIgnore
    private Companyia companyiaDelCompanyiaUsuariopthisCompanyiaInstance;

    @JsonProperty("p_evcusuario_oid")
    private UsuarioOid companyiaDelCompanyiaUsuariopevcUsuario;
    
    @JsonIgnore
    private Usuario companyiaDelCompanyiaUsuariopevcUsuarioInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkCompanyiaDelCompanyiaUsuariopthisCompanyia();
        checkCompanyiaDelCompanyiaUsuariopevcUsuario();
    }

    @JsonIgnore
    public CompanyiaOid getCompanyiaDelCompanyiaUsuariopthisCompanyia() {
        return this.companyiaDelCompanyiaUsuariopthisCompanyia;
    }
    
    public void setCompanyiaDelCompanyiaUsuariopthisCompanyia(CompanyiaOid companyiaDelCompanyiaUsuariopthisCompanyia) {
        this.companyiaDelCompanyiaUsuariopthisCompanyia = companyiaDelCompanyiaUsuariopthisCompanyia;
    }

    @JsonIgnore
    public Companyia getCompanyiaDelCompanyiaUsuariopthisCompanyiaInstance() {
        return this.companyiaDelCompanyiaUsuariopthisCompanyiaInstance;
    }
    
    public void setCompanyiaDelCompanyiaUsuariopthisCompanyiaInstance(Companyia companyiaDelCompanyiaUsuariopthisCompanyia) {
        this.companyiaDelCompanyiaUsuariopthisCompanyiaInstance = companyiaDelCompanyiaUsuariopthisCompanyia;
        this.companyiaDelCompanyiaUsuariopthisCompanyia = companyiaDelCompanyiaUsuariopthisCompanyia != null ? companyiaDelCompanyiaUsuariopthisCompanyia.getOid() : null;
    }

    private void checkCompanyiaDelCompanyiaUsuariopthisCompanyia() throws NotNullArgumentException {
        if(this.getCompanyiaDelCompanyiaUsuariopthisCompanyiaInstance() == null || this.getCompanyiaDelCompanyiaUsuariopthisCompanyiaInstance().isNull()) {
            throw new NotNullArgumentException(CompanyiaConstants.SERV_ID_DELCOMPANYIAUSUARIO, CompanyiaConstants.CLASS_ID, CompanyiaConstants.ARG_ID_DELCOMPANYIAUSUARIO_COMPANYIADELCOMPANYIAUSUARIOPTHISCOMPANYIA, CompanyiaConstants.SERV_ALIAS_DELCOMPANYIAUSUARIO, CompanyiaConstants.CLASS_ALIAS, CompanyiaConstants.ARG_ALIAS_DELCOMPANYIAUSUARIO_COMPANYIADELCOMPANYIAUSUARIOPTHISCOMPANYIA);
        }
    }

    @JsonIgnore
    public UsuarioOid getCompanyiaDelCompanyiaUsuariopevcUsuario() {
        return this.companyiaDelCompanyiaUsuariopevcUsuario;
    }
    
    public void setCompanyiaDelCompanyiaUsuariopevcUsuario(UsuarioOid companyiaDelCompanyiaUsuariopevcUsuario) {
        this.companyiaDelCompanyiaUsuariopevcUsuario = companyiaDelCompanyiaUsuariopevcUsuario;
    }

    @JsonIgnore
    public Usuario getCompanyiaDelCompanyiaUsuariopevcUsuarioInstance() {
        return this.companyiaDelCompanyiaUsuariopevcUsuarioInstance;
    }
    
    public void setCompanyiaDelCompanyiaUsuariopevcUsuarioInstance(Usuario companyiaDelCompanyiaUsuariopevcUsuario) {
        this.companyiaDelCompanyiaUsuariopevcUsuarioInstance = companyiaDelCompanyiaUsuariopevcUsuario;
        this.companyiaDelCompanyiaUsuariopevcUsuario = companyiaDelCompanyiaUsuariopevcUsuario != null ? companyiaDelCompanyiaUsuariopevcUsuario.getOid() : null;
    }

    private void checkCompanyiaDelCompanyiaUsuariopevcUsuario() throws NotNullArgumentException {
        if(this.getCompanyiaDelCompanyiaUsuariopevcUsuarioInstance() == null || this.getCompanyiaDelCompanyiaUsuariopevcUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(CompanyiaConstants.SERV_ID_DELCOMPANYIAUSUARIO, CompanyiaConstants.CLASS_ID, CompanyiaConstants.ARG_ID_DELCOMPANYIAUSUARIO_COMPANYIADELCOMPANYIAUSUARIOPEVCUSUARIO, CompanyiaConstants.SERV_ALIAS_DELCOMPANYIAUSUARIO, CompanyiaConstants.CLASS_ALIAS, CompanyiaConstants.ARG_ALIAS_DELCOMPANYIAUSUARIO_COMPANYIADELCOMPANYIAUSUARIOPEVCUSUARIO);
        }
    }
}
