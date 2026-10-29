package com.keralty.aepersonas.viewmodel.usuario.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.persistence.oid.ParentescoOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Parentesco;
import com.keralty.aepersonas.persistence.Usuario;

public class DelParentescorUsuarioRequest {

    @JsonProperty("p_thisattrusuario_oid")
    private UsuarioOid usuarioDelParentescorUsuariopthisAttrUsuario;
    
    @JsonIgnore
    private Usuario usuarioDelParentescorUsuariopthisAttrUsuarioInstance;

    @JsonProperty("p_evcparentesco_oid")
    private ParentescoOid usuarioDelParentescorUsuariopevcParentesco;
    
    @JsonIgnore
    private Parentesco usuarioDelParentescorUsuariopevcParentescoInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkUsuarioDelParentescorUsuariopthisAttrUsuario();
        checkUsuarioDelParentescorUsuariopevcParentesco();
    }

    @JsonIgnore
    public UsuarioOid getUsuarioDelParentescorUsuariopthisAttrUsuario() {
        return this.usuarioDelParentescorUsuariopthisAttrUsuario;
    }
    
    public void setUsuarioDelParentescorUsuariopthisAttrUsuario(UsuarioOid usuarioDelParentescorUsuariopthisAttrUsuario) {
        this.usuarioDelParentescorUsuariopthisAttrUsuario = usuarioDelParentescorUsuariopthisAttrUsuario;
    }

    @JsonIgnore
    public Usuario getUsuarioDelParentescorUsuariopthisAttrUsuarioInstance() {
        return this.usuarioDelParentescorUsuariopthisAttrUsuarioInstance;
    }
    
    public void setUsuarioDelParentescorUsuariopthisAttrUsuarioInstance(Usuario usuarioDelParentescorUsuariopthisAttrUsuario) {
        this.usuarioDelParentescorUsuariopthisAttrUsuarioInstance = usuarioDelParentescorUsuariopthisAttrUsuario;
        this.usuarioDelParentescorUsuariopthisAttrUsuario = usuarioDelParentescorUsuariopthisAttrUsuario != null ? usuarioDelParentescorUsuariopthisAttrUsuario.getOid() : null;
    }

    private void checkUsuarioDelParentescorUsuariopthisAttrUsuario() throws NotNullArgumentException {
        if(this.getUsuarioDelParentescorUsuariopthisAttrUsuarioInstance() == null || this.getUsuarioDelParentescorUsuariopthisAttrUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_DELPARENTESCORUSUARIO, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_DELPARENTESCORUSUARIO_USUARIODELPARENTESCORUSUARIOPTHISATTRUSUARIO, UsuarioConstants.SERV_ALIAS_DELPARENTESCORUSUARIO, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_DELPARENTESCORUSUARIO_USUARIODELPARENTESCORUSUARIOPTHISATTRUSUARIO);
        }
    }

    @JsonIgnore
    public ParentescoOid getUsuarioDelParentescorUsuariopevcParentesco() {
        return this.usuarioDelParentescorUsuariopevcParentesco;
    }
    
    public void setUsuarioDelParentescorUsuariopevcParentesco(ParentescoOid usuarioDelParentescorUsuariopevcParentesco) {
        this.usuarioDelParentescorUsuariopevcParentesco = usuarioDelParentescorUsuariopevcParentesco;
    }

    @JsonIgnore
    public Parentesco getUsuarioDelParentescorUsuariopevcParentescoInstance() {
        return this.usuarioDelParentescorUsuariopevcParentescoInstance;
    }
    
    public void setUsuarioDelParentescorUsuariopevcParentescoInstance(Parentesco usuarioDelParentescorUsuariopevcParentesco) {
        this.usuarioDelParentescorUsuariopevcParentescoInstance = usuarioDelParentescorUsuariopevcParentesco;
        this.usuarioDelParentescorUsuariopevcParentesco = usuarioDelParentescorUsuariopevcParentesco != null ? usuarioDelParentescorUsuariopevcParentesco.getOid() : null;
    }

    private void checkUsuarioDelParentescorUsuariopevcParentesco() throws NotNullArgumentException {
        if(this.getUsuarioDelParentescorUsuariopevcParentescoInstance() == null || this.getUsuarioDelParentescorUsuariopevcParentescoInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_DELPARENTESCORUSUARIO, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_DELPARENTESCORUSUARIO_USUARIODELPARENTESCORUSUARIOPEVCPARENTESCO, UsuarioConstants.SERV_ALIAS_DELPARENTESCORUSUARIO, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_DELPARENTESCORUSUARIO_USUARIODELPARENTESCORUSUARIOPEVCPARENTESCO);
        }
    }
}
