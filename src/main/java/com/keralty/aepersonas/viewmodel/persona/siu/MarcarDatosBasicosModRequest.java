package com.keralty.aepersonas.viewmodel.persona.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.Persona;

public class MarcarDatosBasicosModRequest {

    @JsonProperty("p_thispersona_oid")
    private PersonaOid personamarcarDatosBasicosModpthisPersona;
    
    @JsonIgnore
    private Persona personamarcarDatosBasicosModpthisPersonaInstance;

    @JsonProperty("p_modificados")
    private Boolean personamarcarDatosBasicosModpModificados;

    @JsonProperty("preconditionId")
    private String preconditionId;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonamarcarDatosBasicosModpthisPersona();
        checkPersonamarcarDatosBasicosModpModificados();
    }

    @JsonIgnore
    public PersonaOid getPersonamarcarDatosBasicosModpthisPersona() {
        return this.personamarcarDatosBasicosModpthisPersona;
    }
    
    public void setPersonamarcarDatosBasicosModpthisPersona(PersonaOid personamarcarDatosBasicosModpthisPersona) {
        this.personamarcarDatosBasicosModpthisPersona = personamarcarDatosBasicosModpthisPersona;
    }

    @JsonIgnore
    public Persona getPersonamarcarDatosBasicosModpthisPersonaInstance() {
        return this.personamarcarDatosBasicosModpthisPersonaInstance;
    }
    
    public void setPersonamarcarDatosBasicosModpthisPersonaInstance(Persona personamarcarDatosBasicosModpthisPersona) {
        this.personamarcarDatosBasicosModpthisPersonaInstance = personamarcarDatosBasicosModpthisPersona;
        this.personamarcarDatosBasicosModpthisPersona = personamarcarDatosBasicosModpthisPersona != null ? personamarcarDatosBasicosModpthisPersona.getOid() : null;
    }

    private void checkPersonamarcarDatosBasicosModpthisPersona() throws NotNullArgumentException {
        if(this.getPersonamarcarDatosBasicosModpthisPersonaInstance() == null || this.getPersonamarcarDatosBasicosModpthisPersonaInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_MARCARDATOSBASICOSMOD, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_MARCARDATOSBASICOSMOD_PERSONAMARCARDATOSBASICOSMODPTHISPERSONA, PersonaConstants.SERV_ALIAS_MARCARDATOSBASICOSMOD, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_MARCARDATOSBASICOSMOD_PERSONAMARCARDATOSBASICOSMODPTHISPERSONA);
        }
    }

    @JsonIgnore
    public Boolean getPersonamarcarDatosBasicosModpModificados() {
        return this.personamarcarDatosBasicosModpModificados;
    }
    
    public void setPersonamarcarDatosBasicosModpModificados(Boolean personamarcarDatosBasicosModpModificados) {
        this.personamarcarDatosBasicosModpModificados = personamarcarDatosBasicosModpModificados;
    }

    private void checkPersonamarcarDatosBasicosModpModificados() throws NotNullArgumentException {
        if(this.getPersonamarcarDatosBasicosModpModificados() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_MARCARDATOSBASICOSMOD, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_MARCARDATOSBASICOSMOD_PERSONAMARCARDATOSBASICOSMODPMODIFICADOS, PersonaConstants.SERV_ALIAS_MARCARDATOSBASICOSMOD, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_MARCARDATOSBASICOSMOD_PERSONAMARCARDATOSBASICOSMODPMODIFICADOS);
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
