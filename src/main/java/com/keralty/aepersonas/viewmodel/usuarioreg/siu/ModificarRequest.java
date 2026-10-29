package com.keralty.aepersonas.viewmodel.usuarioreg.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.UsuarioRegConstants;
import com.keralty.aepersonas.persistence.oid.UsuarioRegOid;
import com.keralty.aepersonas.persistence.UsuarioReg;

public class ModificarRequest {

    @JsonProperty("p_thisusuarioreg_oid")
    private UsuarioRegOid usuarioRegmodificarpthisUsuarioReg;
    
    @JsonIgnore
    private UsuarioReg usuarioRegmodificarpthisUsuarioRegInstance;

    @JsonProperty("p_tipoynumdoc")
    private String usuarioRegmodificarpTipoYNumDoc;

    public void checkArguments() throws NotNullArgumentException {
        checkUsuarioRegmodificarpthisUsuarioReg();
    }

    @JsonIgnore
    public UsuarioRegOid getUsuarioRegmodificarpthisUsuarioReg() {
        return this.usuarioRegmodificarpthisUsuarioReg;
    }
    
    public void setUsuarioRegmodificarpthisUsuarioReg(UsuarioRegOid usuarioRegmodificarpthisUsuarioReg) {
        this.usuarioRegmodificarpthisUsuarioReg = usuarioRegmodificarpthisUsuarioReg;
    }

    @JsonIgnore
    public UsuarioReg getUsuarioRegmodificarpthisUsuarioRegInstance() {
        return this.usuarioRegmodificarpthisUsuarioRegInstance;
    }
    
    public void setUsuarioRegmodificarpthisUsuarioRegInstance(UsuarioReg usuarioRegmodificarpthisUsuarioReg) {
        this.usuarioRegmodificarpthisUsuarioRegInstance = usuarioRegmodificarpthisUsuarioReg;
        this.usuarioRegmodificarpthisUsuarioReg = usuarioRegmodificarpthisUsuarioReg != null ? usuarioRegmodificarpthisUsuarioReg.getOid() : null;
    }

    private void checkUsuarioRegmodificarpthisUsuarioReg() throws NotNullArgumentException {
        if(this.getUsuarioRegmodificarpthisUsuarioRegInstance() == null || this.getUsuarioRegmodificarpthisUsuarioRegInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioRegConstants.SERV_ID_MODIFICAR, UsuarioRegConstants.CLASS_ID, UsuarioRegConstants.ARG_ID_MODIFICAR_USUARIOREGMODIFICARPTHISUSUARIOREG, UsuarioRegConstants.SERV_ALIAS_MODIFICAR, UsuarioRegConstants.CLASS_ALIAS, UsuarioRegConstants.ARG_ALIAS_MODIFICAR_USUARIOREGMODIFICARPTHISUSUARIOREG);
        }
    }

    @JsonIgnore
    public String getUsuarioRegmodificarpTipoYNumDoc() {
        return this.usuarioRegmodificarpTipoYNumDoc;
    }
    
    public void setUsuarioRegmodificarpTipoYNumDoc(String usuarioRegmodificarpTipoYNumDoc) {
        this.usuarioRegmodificarpTipoYNumDoc = usuarioRegmodificarpTipoYNumDoc;
    }
}
