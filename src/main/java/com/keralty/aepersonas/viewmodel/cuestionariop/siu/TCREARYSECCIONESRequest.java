package com.keralty.aepersonas.viewmodel.cuestionariop.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.CuestionarioPConstants;
import com.keralty.aepersonas.persistence.CuestionarioMed;
import com.keralty.aepersonas.persistence.oid.CuestionarioMedOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Usuario;

public class TCREARYSECCIONESRequest {

    @JsonProperty("pt_usuario_oid")
    private UsuarioOid cuestionarioPTCREARYSECCIONESptUsuario;
    
    @JsonIgnore
    private Usuario cuestionarioPTCREARYSECCIONESptUsuarioInstance;

    @JsonProperty("pt_cuestionario_oid")
    private CuestionarioMedOid cuestionarioPTCREARYSECCIONESptCuestionario;
    
    @JsonIgnore
    private CuestionarioMed cuestionarioPTCREARYSECCIONESptCuestionarioInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkCuestionarioPTCREARYSECCIONESptUsuario();
        checkCuestionarioPTCREARYSECCIONESptCuestionario();
    }

    @JsonIgnore
    public UsuarioOid getCuestionarioPTCREARYSECCIONESptUsuario() {
        return this.cuestionarioPTCREARYSECCIONESptUsuario;
    }
    
    public void setCuestionarioPTCREARYSECCIONESptUsuario(UsuarioOid cuestionarioPTCREARYSECCIONESptUsuario) {
        this.cuestionarioPTCREARYSECCIONESptUsuario = cuestionarioPTCREARYSECCIONESptUsuario;
    }

    @JsonIgnore
    public Usuario getCuestionarioPTCREARYSECCIONESptUsuarioInstance() {
        return this.cuestionarioPTCREARYSECCIONESptUsuarioInstance;
    }
    
    public void setCuestionarioPTCREARYSECCIONESptUsuarioInstance(Usuario cuestionarioPTCREARYSECCIONESptUsuario) {
        this.cuestionarioPTCREARYSECCIONESptUsuarioInstance = cuestionarioPTCREARYSECCIONESptUsuario;
        this.cuestionarioPTCREARYSECCIONESptUsuario = cuestionarioPTCREARYSECCIONESptUsuario != null ? cuestionarioPTCREARYSECCIONESptUsuario.getOid() : null;
    }

    private void checkCuestionarioPTCREARYSECCIONESptUsuario() throws NotNullArgumentException {
        if(this.getCuestionarioPTCREARYSECCIONESptUsuarioInstance() == null || this.getCuestionarioPTCREARYSECCIONESptUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(CuestionarioPConstants.SERV_ID_TCREARYSECCIONES, CuestionarioPConstants.CLASS_ID, CuestionarioPConstants.ARG_ID_TCREARYSECCIONES_CUESTIONARIOPTCREARYSECCIONESPTUSUARIO, CuestionarioPConstants.SERV_ALIAS_TCREARYSECCIONES, CuestionarioPConstants.CLASS_ALIAS, CuestionarioPConstants.ARG_ALIAS_TCREARYSECCIONES_CUESTIONARIOPTCREARYSECCIONESPTUSUARIO);
        }
    }

    @JsonIgnore
    public CuestionarioMedOid getCuestionarioPTCREARYSECCIONESptCuestionario() {
        return this.cuestionarioPTCREARYSECCIONESptCuestionario;
    }
    
    public void setCuestionarioPTCREARYSECCIONESptCuestionario(CuestionarioMedOid cuestionarioPTCREARYSECCIONESptCuestionario) {
        this.cuestionarioPTCREARYSECCIONESptCuestionario = cuestionarioPTCREARYSECCIONESptCuestionario;
    }

    @JsonIgnore
    public CuestionarioMed getCuestionarioPTCREARYSECCIONESptCuestionarioInstance() {
        return this.cuestionarioPTCREARYSECCIONESptCuestionarioInstance;
    }
    
    public void setCuestionarioPTCREARYSECCIONESptCuestionarioInstance(CuestionarioMed cuestionarioPTCREARYSECCIONESptCuestionario) {
        this.cuestionarioPTCREARYSECCIONESptCuestionarioInstance = cuestionarioPTCREARYSECCIONESptCuestionario;
        this.cuestionarioPTCREARYSECCIONESptCuestionario = cuestionarioPTCREARYSECCIONESptCuestionario != null ? cuestionarioPTCREARYSECCIONESptCuestionario.getOid() : null;
    }

    private void checkCuestionarioPTCREARYSECCIONESptCuestionario() throws NotNullArgumentException {
        if(this.getCuestionarioPTCREARYSECCIONESptCuestionarioInstance() == null || this.getCuestionarioPTCREARYSECCIONESptCuestionarioInstance().isNull()) {
            throw new NotNullArgumentException(CuestionarioPConstants.SERV_ID_TCREARYSECCIONES, CuestionarioPConstants.CLASS_ID, CuestionarioPConstants.ARG_ID_TCREARYSECCIONES_CUESTIONARIOPTCREARYSECCIONESPTCUESTIONARIO, CuestionarioPConstants.SERV_ALIAS_TCREARYSECCIONES, CuestionarioPConstants.CLASS_ALIAS, CuestionarioPConstants.ARG_ALIAS_TCREARYSECCIONES_CUESTIONARIOPTCREARYSECCIONESPTCUESTIONARIO);
        }
    }
}
