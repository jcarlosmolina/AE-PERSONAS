package com.keralty.aepersonas.viewmodel.persona.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Persona;
import com.keralty.aepersonas.persistence.Usuario;

public class TELIMINARRequest {

    @JsonProperty("p_thispersona_oid")
    private PersonaOid personaTELIMINARpthisPersona;
    
    @JsonIgnore
    private Persona personaTELIMINARpthisPersonaInstance;

    @JsonProperty("ptusuario_oid")
    private UsuarioOid personaTELIMINARptUsuario;
    
    @JsonIgnore
    private Usuario personaTELIMINARptUsuarioInstance;

    @JsonProperty("preconditionId")
    private String preconditionId;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonaTELIMINARpthisPersona();
        checkPersonaTELIMINARptUsuario();
    }

    @JsonIgnore
    public PersonaOid getPersonaTELIMINARpthisPersona() {
        return this.personaTELIMINARpthisPersona;
    }
    
    public void setPersonaTELIMINARpthisPersona(PersonaOid personaTELIMINARpthisPersona) {
        this.personaTELIMINARpthisPersona = personaTELIMINARpthisPersona;
    }

    @JsonIgnore
    public Persona getPersonaTELIMINARpthisPersonaInstance() {
        return this.personaTELIMINARpthisPersonaInstance;
    }
    
    public void setPersonaTELIMINARpthisPersonaInstance(Persona personaTELIMINARpthisPersona) {
        this.personaTELIMINARpthisPersonaInstance = personaTELIMINARpthisPersona;
        this.personaTELIMINARpthisPersona = personaTELIMINARpthisPersona != null ? personaTELIMINARpthisPersona.getOid() : null;
    }

    private void checkPersonaTELIMINARpthisPersona() throws NotNullArgumentException {
        if(this.getPersonaTELIMINARpthisPersonaInstance() == null || this.getPersonaTELIMINARpthisPersonaInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TELIMINAR, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TELIMINAR_PERSONATELIMINARPTHISPERSONA, PersonaConstants.SERV_ALIAS_TELIMINAR, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TELIMINAR_PERSONATELIMINARPTHISPERSONA);
        }
    }

    @JsonIgnore
    public UsuarioOid getPersonaTELIMINARptUsuario() {
        return this.personaTELIMINARptUsuario;
    }
    
    public void setPersonaTELIMINARptUsuario(UsuarioOid personaTELIMINARptUsuario) {
        this.personaTELIMINARptUsuario = personaTELIMINARptUsuario;
    }

    @JsonIgnore
    public Usuario getPersonaTELIMINARptUsuarioInstance() {
        return this.personaTELIMINARptUsuarioInstance;
    }
    
    public void setPersonaTELIMINARptUsuarioInstance(Usuario personaTELIMINARptUsuario) {
        this.personaTELIMINARptUsuarioInstance = personaTELIMINARptUsuario;
        this.personaTELIMINARptUsuario = personaTELIMINARptUsuario != null ? personaTELIMINARptUsuario.getOid() : null;
    }

    private void checkPersonaTELIMINARptUsuario() throws NotNullArgumentException {
        if(this.getPersonaTELIMINARptUsuarioInstance() == null || this.getPersonaTELIMINARptUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TELIMINAR, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TELIMINAR_PERSONATELIMINARPTUSUARIO, PersonaConstants.SERV_ALIAS_TELIMINAR, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TELIMINAR_PERSONATELIMINARPTUSUARIO);
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
