package com.keralty.aepersonas.viewmodel.usuario.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.persistence.oid.ParentescoOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Parentesco;
import com.keralty.aepersonas.persistence.Usuario;

public class InsParentescoUsuarioRequest {

    @JsonProperty("p_thisattrusuario_oid")
    private UsuarioOid usuarioInsParentescoUsuariopthisAttrUsuario;
    
    @JsonIgnore
    private Usuario usuarioInsParentescoUsuariopthisAttrUsuarioInstance;

    @JsonProperty("p_evcparentesco_oid")
    private ParentescoOid usuarioInsParentescoUsuariopevcParentesco;
    
    @JsonIgnore
    private Parentesco usuarioInsParentescoUsuariopevcParentescoInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkUsuarioInsParentescoUsuariopthisAttrUsuario();
        checkUsuarioInsParentescoUsuariopevcParentesco();
    }

    @JsonIgnore
    public UsuarioOid getUsuarioInsParentescoUsuariopthisAttrUsuario() {
        return this.usuarioInsParentescoUsuariopthisAttrUsuario;
    }
    
    public void setUsuarioInsParentescoUsuariopthisAttrUsuario(UsuarioOid usuarioInsParentescoUsuariopthisAttrUsuario) {
        this.usuarioInsParentescoUsuariopthisAttrUsuario = usuarioInsParentescoUsuariopthisAttrUsuario;
    }

    @JsonIgnore
    public Usuario getUsuarioInsParentescoUsuariopthisAttrUsuarioInstance() {
        return this.usuarioInsParentescoUsuariopthisAttrUsuarioInstance;
    }
    
    public void setUsuarioInsParentescoUsuariopthisAttrUsuarioInstance(Usuario usuarioInsParentescoUsuariopthisAttrUsuario) {
        this.usuarioInsParentescoUsuariopthisAttrUsuarioInstance = usuarioInsParentescoUsuariopthisAttrUsuario;
        this.usuarioInsParentescoUsuariopthisAttrUsuario = usuarioInsParentescoUsuariopthisAttrUsuario != null ? usuarioInsParentescoUsuariopthisAttrUsuario.getOid() : null;
    }

    private void checkUsuarioInsParentescoUsuariopthisAttrUsuario() throws NotNullArgumentException {
        if(this.getUsuarioInsParentescoUsuariopthisAttrUsuarioInstance() == null || this.getUsuarioInsParentescoUsuariopthisAttrUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_INSPARENTESCOUSUARIO, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_INSPARENTESCOUSUARIO_USUARIOINSPARENTESCOUSUARIOPTHISATTRUSUARIO, UsuarioConstants.SERV_ALIAS_INSPARENTESCOUSUARIO, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_INSPARENTESCOUSUARIO_USUARIOINSPARENTESCOUSUARIOPTHISATTRUSUARIO);
        }
    }

    @JsonIgnore
    public ParentescoOid getUsuarioInsParentescoUsuariopevcParentesco() {
        return this.usuarioInsParentescoUsuariopevcParentesco;
    }
    
    public void setUsuarioInsParentescoUsuariopevcParentesco(ParentescoOid usuarioInsParentescoUsuariopevcParentesco) {
        this.usuarioInsParentescoUsuariopevcParentesco = usuarioInsParentescoUsuariopevcParentesco;
    }

    @JsonIgnore
    public Parentesco getUsuarioInsParentescoUsuariopevcParentescoInstance() {
        return this.usuarioInsParentescoUsuariopevcParentescoInstance;
    }
    
    public void setUsuarioInsParentescoUsuariopevcParentescoInstance(Parentesco usuarioInsParentescoUsuariopevcParentesco) {
        this.usuarioInsParentescoUsuariopevcParentescoInstance = usuarioInsParentescoUsuariopevcParentesco;
        this.usuarioInsParentescoUsuariopevcParentesco = usuarioInsParentescoUsuariopevcParentesco != null ? usuarioInsParentescoUsuariopevcParentesco.getOid() : null;
    }

    private void checkUsuarioInsParentescoUsuariopevcParentesco() throws NotNullArgumentException {
        if(this.getUsuarioInsParentescoUsuariopevcParentescoInstance() == null || this.getUsuarioInsParentescoUsuariopevcParentescoInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_INSPARENTESCOUSUARIO, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_INSPARENTESCOUSUARIO_USUARIOINSPARENTESCOUSUARIOPEVCPARENTESCO, UsuarioConstants.SERV_ALIAS_INSPARENTESCOUSUARIO, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_INSPARENTESCOUSUARIO_USUARIOINSPARENTESCOUSUARIOPEVCPARENTESCO);
        }
    }
}
