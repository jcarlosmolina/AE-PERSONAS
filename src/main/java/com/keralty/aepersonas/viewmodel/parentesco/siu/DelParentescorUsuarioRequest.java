package com.keralty.aepersonas.viewmodel.parentesco.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.ParentescoConstants;
import com.keralty.aepersonas.persistence.oid.ParentescoOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Parentesco;
import com.keralty.aepersonas.persistence.Usuario;

public class DelParentescorUsuarioRequest {

    @JsonProperty("p_thisparentesco_oid")
    private ParentescoOid parentescoDelParentescorUsuariopthisParentesco;
    
    @JsonIgnore
    private Parentesco parentescoDelParentescorUsuariopthisParentescoInstance;

    @JsonProperty("p_evcusuario_oid")
    private UsuarioOid parentescoDelParentescorUsuariopevcUsuario;
    
    @JsonIgnore
    private Usuario parentescoDelParentescorUsuariopevcUsuarioInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkParentescoDelParentescorUsuariopthisParentesco();
        checkParentescoDelParentescorUsuariopevcUsuario();
    }

    @JsonIgnore
    public ParentescoOid getParentescoDelParentescorUsuariopthisParentesco() {
        return this.parentescoDelParentescorUsuariopthisParentesco;
    }
    
    public void setParentescoDelParentescorUsuariopthisParentesco(ParentescoOid parentescoDelParentescorUsuariopthisParentesco) {
        this.parentescoDelParentescorUsuariopthisParentesco = parentescoDelParentescorUsuariopthisParentesco;
    }

    @JsonIgnore
    public Parentesco getParentescoDelParentescorUsuariopthisParentescoInstance() {
        return this.parentescoDelParentescorUsuariopthisParentescoInstance;
    }
    
    public void setParentescoDelParentescorUsuariopthisParentescoInstance(Parentesco parentescoDelParentescorUsuariopthisParentesco) {
        this.parentescoDelParentescorUsuariopthisParentescoInstance = parentescoDelParentescorUsuariopthisParentesco;
        this.parentescoDelParentescorUsuariopthisParentesco = parentescoDelParentescorUsuariopthisParentesco != null ? parentescoDelParentescorUsuariopthisParentesco.getOid() : null;
    }

    private void checkParentescoDelParentescorUsuariopthisParentesco() throws NotNullArgumentException {
        if(this.getParentescoDelParentescorUsuariopthisParentescoInstance() == null || this.getParentescoDelParentescorUsuariopthisParentescoInstance().isNull()) {
            throw new NotNullArgumentException(ParentescoConstants.SERV_ID_DELPARENTESCORUSUARIO, ParentescoConstants.CLASS_ID, ParentescoConstants.ARG_ID_DELPARENTESCORUSUARIO_PARENTESCODELPARENTESCORUSUARIOPTHISPARENTESCO, ParentescoConstants.SERV_ALIAS_DELPARENTESCORUSUARIO, ParentescoConstants.CLASS_ALIAS, ParentescoConstants.ARG_ALIAS_DELPARENTESCORUSUARIO_PARENTESCODELPARENTESCORUSUARIOPTHISPARENTESCO);
        }
    }

    @JsonIgnore
    public UsuarioOid getParentescoDelParentescorUsuariopevcUsuario() {
        return this.parentescoDelParentescorUsuariopevcUsuario;
    }
    
    public void setParentescoDelParentescorUsuariopevcUsuario(UsuarioOid parentescoDelParentescorUsuariopevcUsuario) {
        this.parentescoDelParentescorUsuariopevcUsuario = parentescoDelParentescorUsuariopevcUsuario;
    }

    @JsonIgnore
    public Usuario getParentescoDelParentescorUsuariopevcUsuarioInstance() {
        return this.parentescoDelParentescorUsuariopevcUsuarioInstance;
    }
    
    public void setParentescoDelParentescorUsuariopevcUsuarioInstance(Usuario parentescoDelParentescorUsuariopevcUsuario) {
        this.parentescoDelParentescorUsuariopevcUsuarioInstance = parentescoDelParentescorUsuariopevcUsuario;
        this.parentescoDelParentescorUsuariopevcUsuario = parentescoDelParentescorUsuariopevcUsuario != null ? parentescoDelParentescorUsuariopevcUsuario.getOid() : null;
    }

    private void checkParentescoDelParentescorUsuariopevcUsuario() throws NotNullArgumentException {
        if(this.getParentescoDelParentescorUsuariopevcUsuarioInstance() == null || this.getParentescoDelParentescorUsuariopevcUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(ParentescoConstants.SERV_ID_DELPARENTESCORUSUARIO, ParentescoConstants.CLASS_ID, ParentescoConstants.ARG_ID_DELPARENTESCORUSUARIO_PARENTESCODELPARENTESCORUSUARIOPEVCUSUARIO, ParentescoConstants.SERV_ALIAS_DELPARENTESCORUSUARIO, ParentescoConstants.CLASS_ALIAS, ParentescoConstants.ARG_ALIAS_DELPARENTESCORUSUARIO_PARENTESCODELPARENTESCORUSUARIOPEVCUSUARIO);
        }
    }
}
