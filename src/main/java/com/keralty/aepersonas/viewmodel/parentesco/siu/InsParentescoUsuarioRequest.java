package com.keralty.aepersonas.viewmodel.parentesco.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.ParentescoConstants;
import com.keralty.aepersonas.persistence.oid.ParentescoOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Parentesco;
import com.keralty.aepersonas.persistence.Usuario;

public class InsParentescoUsuarioRequest {

    @JsonProperty("p_thisparentesco_oid")
    private ParentescoOid parentescoInsParentescoUsuariopthisParentesco;
    
    @JsonIgnore
    private Parentesco parentescoInsParentescoUsuariopthisParentescoInstance;

    @JsonProperty("p_evcusuario_oid")
    private UsuarioOid parentescoInsParentescoUsuariopevcUsuario;
    
    @JsonIgnore
    private Usuario parentescoInsParentescoUsuariopevcUsuarioInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkParentescoInsParentescoUsuariopthisParentesco();
        checkParentescoInsParentescoUsuariopevcUsuario();
    }

    @JsonIgnore
    public ParentescoOid getParentescoInsParentescoUsuariopthisParentesco() {
        return this.parentescoInsParentescoUsuariopthisParentesco;
    }
    
    public void setParentescoInsParentescoUsuariopthisParentesco(ParentescoOid parentescoInsParentescoUsuariopthisParentesco) {
        this.parentescoInsParentescoUsuariopthisParentesco = parentescoInsParentescoUsuariopthisParentesco;
    }

    @JsonIgnore
    public Parentesco getParentescoInsParentescoUsuariopthisParentescoInstance() {
        return this.parentescoInsParentescoUsuariopthisParentescoInstance;
    }
    
    public void setParentescoInsParentescoUsuariopthisParentescoInstance(Parentesco parentescoInsParentescoUsuariopthisParentesco) {
        this.parentescoInsParentescoUsuariopthisParentescoInstance = parentescoInsParentescoUsuariopthisParentesco;
        this.parentescoInsParentescoUsuariopthisParentesco = parentescoInsParentescoUsuariopthisParentesco != null ? parentescoInsParentescoUsuariopthisParentesco.getOid() : null;
    }

    private void checkParentescoInsParentescoUsuariopthisParentesco() throws NotNullArgumentException {
        if(this.getParentescoInsParentescoUsuariopthisParentescoInstance() == null || this.getParentescoInsParentescoUsuariopthisParentescoInstance().isNull()) {
            throw new NotNullArgumentException(ParentescoConstants.SERV_ID_INSPARENTESCOUSUARIO, ParentescoConstants.CLASS_ID, ParentescoConstants.ARG_ID_INSPARENTESCOUSUARIO_PARENTESCOINSPARENTESCOUSUARIOPTHISPARENTESCO, ParentescoConstants.SERV_ALIAS_INSPARENTESCOUSUARIO, ParentescoConstants.CLASS_ALIAS, ParentescoConstants.ARG_ALIAS_INSPARENTESCOUSUARIO_PARENTESCOINSPARENTESCOUSUARIOPTHISPARENTESCO);
        }
    }

    @JsonIgnore
    public UsuarioOid getParentescoInsParentescoUsuariopevcUsuario() {
        return this.parentescoInsParentescoUsuariopevcUsuario;
    }
    
    public void setParentescoInsParentescoUsuariopevcUsuario(UsuarioOid parentescoInsParentescoUsuariopevcUsuario) {
        this.parentescoInsParentescoUsuariopevcUsuario = parentescoInsParentescoUsuariopevcUsuario;
    }

    @JsonIgnore
    public Usuario getParentescoInsParentescoUsuariopevcUsuarioInstance() {
        return this.parentescoInsParentescoUsuariopevcUsuarioInstance;
    }
    
    public void setParentescoInsParentescoUsuariopevcUsuarioInstance(Usuario parentescoInsParentescoUsuariopevcUsuario) {
        this.parentescoInsParentescoUsuariopevcUsuarioInstance = parentescoInsParentescoUsuariopevcUsuario;
        this.parentescoInsParentescoUsuariopevcUsuario = parentescoInsParentescoUsuariopevcUsuario != null ? parentescoInsParentescoUsuariopevcUsuario.getOid() : null;
    }

    private void checkParentescoInsParentescoUsuariopevcUsuario() throws NotNullArgumentException {
        if(this.getParentescoInsParentescoUsuariopevcUsuarioInstance() == null || this.getParentescoInsParentescoUsuariopevcUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(ParentescoConstants.SERV_ID_INSPARENTESCOUSUARIO, ParentescoConstants.CLASS_ID, ParentescoConstants.ARG_ID_INSPARENTESCOUSUARIO_PARENTESCOINSPARENTESCOUSUARIOPEVCUSUARIO, ParentescoConstants.SERV_ALIAS_INSPARENTESCOUSUARIO, ParentescoConstants.CLASS_ALIAS, ParentescoConstants.ARG_ALIAS_INSPARENTESCOUSUARIO_PARENTESCOINSPARENTESCOUSUARIOPEVCUSUARIO);
        }
    }
}
