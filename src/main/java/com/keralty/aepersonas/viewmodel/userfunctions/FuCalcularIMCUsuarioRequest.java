package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Usuario;
public class FuCalcularIMCUsuarioRequest {

    @JsonProperty("pfusuario")
    private UsuarioOid pfUsuario;

    @JsonIgnore
    private Usuario pfUsuarioInstance;

    public FuCalcularIMCUsuarioRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public UsuarioOid getPfUsuario() {
        return this.pfUsuario;
    }
    
    public void setPfUsuario(UsuarioOid pfUsuario) {
        this.pfUsuario = pfUsuario;
    }

    @JsonIgnore
    public Usuario getPfUsuarioInstance() {
        if (this.pfUsuarioInstance == null)
            this.pfUsuarioInstance = new Usuario();
        return this.pfUsuarioInstance;
    }
    
    public void setPfUsuarioInstance(Usuario pfUsuario) {
        this.pfUsuarioInstance = pfUsuario;
        this.pfUsuario = pfUsuario != null ? pfUsuario.getOid() : null;
    }
}
