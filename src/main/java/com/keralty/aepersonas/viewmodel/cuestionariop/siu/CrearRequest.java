package com.keralty.aepersonas.viewmodel.cuestionariop.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.CuestionarioPConstants;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Usuario;

public class CrearRequest {

    @JsonProperty("p_agrusuario_oid")
    private UsuarioOid cuestionarioPcrearpagrUsuario;
    
    @JsonIgnore
    private Usuario cuestionarioPcrearpagrUsuarioInstance;

    @JsonProperty("p_atrnombre")
    private String cuestionarioPcrearpatrNombre;

    public void checkArguments() throws NotNullArgumentException {
        checkCuestionarioPcrearpagrUsuario();
        checkCuestionarioPcrearpatrNombre();
    }

    @JsonIgnore
    public UsuarioOid getCuestionarioPcrearpagrUsuario() {
        return this.cuestionarioPcrearpagrUsuario;
    }
    
    public void setCuestionarioPcrearpagrUsuario(UsuarioOid cuestionarioPcrearpagrUsuario) {
        this.cuestionarioPcrearpagrUsuario = cuestionarioPcrearpagrUsuario;
    }

    @JsonIgnore
    public Usuario getCuestionarioPcrearpagrUsuarioInstance() {
        return this.cuestionarioPcrearpagrUsuarioInstance;
    }
    
    public void setCuestionarioPcrearpagrUsuarioInstance(Usuario cuestionarioPcrearpagrUsuario) {
        this.cuestionarioPcrearpagrUsuarioInstance = cuestionarioPcrearpagrUsuario;
        this.cuestionarioPcrearpagrUsuario = cuestionarioPcrearpagrUsuario != null ? cuestionarioPcrearpagrUsuario.getOid() : null;
    }

    private void checkCuestionarioPcrearpagrUsuario() throws NotNullArgumentException {
        if(this.getCuestionarioPcrearpagrUsuarioInstance() == null || this.getCuestionarioPcrearpagrUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(CuestionarioPConstants.SERV_ID_CREAR, CuestionarioPConstants.CLASS_ID, CuestionarioPConstants.ARG_ID_CREAR_CUESTIONARIOPCREARPAGRUSUARIO, CuestionarioPConstants.SERV_ALIAS_CREAR, CuestionarioPConstants.CLASS_ALIAS, CuestionarioPConstants.ARG_ALIAS_CREAR_CUESTIONARIOPCREARPAGRUSUARIO);
        }
    }

    @JsonIgnore
    public String getCuestionarioPcrearpatrNombre() {
        return this.cuestionarioPcrearpatrNombre;
    }
    
    public void setCuestionarioPcrearpatrNombre(String cuestionarioPcrearpatrNombre) {
        this.cuestionarioPcrearpatrNombre = cuestionarioPcrearpatrNombre;
    }

    private void checkCuestionarioPcrearpatrNombre() throws NotNullArgumentException {
        if(this.getCuestionarioPcrearpatrNombre() == null) {
            throw new NotNullArgumentException(CuestionarioPConstants.SERV_ID_CREAR, CuestionarioPConstants.CLASS_ID, CuestionarioPConstants.ARG_ID_CREAR_CUESTIONARIOPCREARPATRNOMBRE, CuestionarioPConstants.SERV_ALIAS_CREAR, CuestionarioPConstants.CLASS_ALIAS, CuestionarioPConstants.ARG_ALIAS_CREAR_CUESTIONARIOPCREARPATRNOMBRE);
        }
    }
}
