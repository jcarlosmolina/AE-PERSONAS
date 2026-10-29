package com.keralty.aepersonas.viewmodel.usuario.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Usuario;

public class ShowCuesMedicoRequest {

    @JsonProperty("p_thisusuario_oid")
    private UsuarioOid usuarioshowCuesMedicopthisUsuario;
    
    @JsonIgnore
    private Usuario usuarioshowCuesMedicopthisUsuarioInstance;

    @JsonProperty("preconditionId")
    private String preconditionId;

    public void checkArguments() throws NotNullArgumentException {
        checkUsuarioshowCuesMedicopthisUsuario();
    }

    @JsonIgnore
    public UsuarioOid getUsuarioshowCuesMedicopthisUsuario() {
        return this.usuarioshowCuesMedicopthisUsuario;
    }
    
    public void setUsuarioshowCuesMedicopthisUsuario(UsuarioOid usuarioshowCuesMedicopthisUsuario) {
        this.usuarioshowCuesMedicopthisUsuario = usuarioshowCuesMedicopthisUsuario;
    }

    @JsonIgnore
    public Usuario getUsuarioshowCuesMedicopthisUsuarioInstance() {
        return this.usuarioshowCuesMedicopthisUsuarioInstance;
    }
    
    public void setUsuarioshowCuesMedicopthisUsuarioInstance(Usuario usuarioshowCuesMedicopthisUsuario) {
        this.usuarioshowCuesMedicopthisUsuarioInstance = usuarioshowCuesMedicopthisUsuario;
        this.usuarioshowCuesMedicopthisUsuario = usuarioshowCuesMedicopthisUsuario != null ? usuarioshowCuesMedicopthisUsuario.getOid() : null;
    }

    private void checkUsuarioshowCuesMedicopthisUsuario() throws NotNullArgumentException {
        if(this.getUsuarioshowCuesMedicopthisUsuarioInstance() == null || this.getUsuarioshowCuesMedicopthisUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_SHOWCUESMEDICO, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_SHOWCUESMEDICO_USUARIOSHOWCUESMEDICOPTHISUSUARIO, UsuarioConstants.SERV_ALIAS_SHOWCUESMEDICO, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_SHOWCUESMEDICO_USUARIOSHOWCUESMEDICOPTHISUSUARIO);
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
