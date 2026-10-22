package com.keralty.aepersonas.viewmodel.usuario.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.persistence.BeneficiarioC;
import com.keralty.aepersonas.persistence.oid.BeneficiarioCOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Usuario;

public class TACTDESDECORERequest {

    @JsonProperty("p_thisusuario_oid")
    private UsuarioOid usuarioTACTDESDECOREpthisUsuario;
    
    @JsonIgnore
    private Usuario usuarioTACTDESDECOREpthisUsuarioInstance;

    @JsonProperty("p_beneficiarioc_oid")
    private BeneficiarioCOid usuarioTACTDESDECOREpBeneficiarioC;
    
    @JsonIgnore
    private BeneficiarioC usuarioTACTDESDECOREpBeneficiarioCInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkUsuarioTACTDESDECOREpthisUsuario();
        checkUsuarioTACTDESDECOREpBeneficiarioC();
    }

    @JsonIgnore
    public UsuarioOid getUsuarioTACTDESDECOREpthisUsuario() {
        return this.usuarioTACTDESDECOREpthisUsuario;
    }
    
    public void setUsuarioTACTDESDECOREpthisUsuario(UsuarioOid usuarioTACTDESDECOREpthisUsuario) {
        this.usuarioTACTDESDECOREpthisUsuario = usuarioTACTDESDECOREpthisUsuario;
    }

    @JsonIgnore
    public Usuario getUsuarioTACTDESDECOREpthisUsuarioInstance() {
        return this.usuarioTACTDESDECOREpthisUsuarioInstance;
    }
    
    public void setUsuarioTACTDESDECOREpthisUsuarioInstance(Usuario usuarioTACTDESDECOREpthisUsuario) {
        this.usuarioTACTDESDECOREpthisUsuarioInstance = usuarioTACTDESDECOREpthisUsuario;
        this.usuarioTACTDESDECOREpthisUsuario = usuarioTACTDESDECOREpthisUsuario != null ? usuarioTACTDESDECOREpthisUsuario.getOid() : null;
    }

    private void checkUsuarioTACTDESDECOREpthisUsuario() throws NotNullArgumentException {
        if(this.getUsuarioTACTDESDECOREpthisUsuarioInstance() == null || this.getUsuarioTACTDESDECOREpthisUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TACTDESDECORE, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TACTDESDECORE_USUARIOTACTDESDECOREPTHISUSUARIO, UsuarioConstants.SERV_ALIAS_TACTDESDECORE, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TACTDESDECORE_USUARIOTACTDESDECOREPTHISUSUARIO);
        }
    }

    @JsonIgnore
    public BeneficiarioCOid getUsuarioTACTDESDECOREpBeneficiarioC() {
        return this.usuarioTACTDESDECOREpBeneficiarioC;
    }
    
    public void setUsuarioTACTDESDECOREpBeneficiarioC(BeneficiarioCOid usuarioTACTDESDECOREpBeneficiarioC) {
        this.usuarioTACTDESDECOREpBeneficiarioC = usuarioTACTDESDECOREpBeneficiarioC;
    }

    @JsonIgnore
    public BeneficiarioC getUsuarioTACTDESDECOREpBeneficiarioCInstance() {
        return this.usuarioTACTDESDECOREpBeneficiarioCInstance;
    }
    
    public void setUsuarioTACTDESDECOREpBeneficiarioCInstance(BeneficiarioC usuarioTACTDESDECOREpBeneficiarioC) {
        this.usuarioTACTDESDECOREpBeneficiarioCInstance = usuarioTACTDESDECOREpBeneficiarioC;
        this.usuarioTACTDESDECOREpBeneficiarioC = usuarioTACTDESDECOREpBeneficiarioC != null ? usuarioTACTDESDECOREpBeneficiarioC.getOid() : null;
    }

    private void checkUsuarioTACTDESDECOREpBeneficiarioC() throws NotNullArgumentException {
        if(this.getUsuarioTACTDESDECOREpBeneficiarioCInstance() == null || this.getUsuarioTACTDESDECOREpBeneficiarioCInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TACTDESDECORE, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TACTDESDECORE_USUARIOTACTDESDECOREPBENEFICIARIOC, UsuarioConstants.SERV_ALIAS_TACTDESDECORE, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TACTDESDECORE_USUARIOTACTDESDECOREPBENEFICIARIOC);
        }
    }
}
