package com.keralty.aepersonas.viewmodel.persona.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.Persona;

public class RegistrarDatosCORERequest {

    @JsonProperty("p_thispersona_oid")
    private PersonaOid personaregistrarDatosCOREpthisPersona;
    
    @JsonIgnore
    private Persona personaregistrarDatosCOREpthisPersonaInstance;

    @JsonProperty("p_codigo")
    private Long personaregistrarDatosCOREpCodigo;

    @JsonProperty("p_tieneepssanitas")
    private Boolean personaregistrarDatosCOREpTieneEPSSanitas;

    @JsonProperty("p_rechazadoafiliacion")
    private String personaregistrarDatosCOREpRechazadoAfiliacion;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonaregistrarDatosCOREpthisPersona();
    }

    @JsonIgnore
    public PersonaOid getPersonaregistrarDatosCOREpthisPersona() {
        return this.personaregistrarDatosCOREpthisPersona;
    }
    
    public void setPersonaregistrarDatosCOREpthisPersona(PersonaOid personaregistrarDatosCOREpthisPersona) {
        this.personaregistrarDatosCOREpthisPersona = personaregistrarDatosCOREpthisPersona;
    }

    @JsonIgnore
    public Persona getPersonaregistrarDatosCOREpthisPersonaInstance() {
        return this.personaregistrarDatosCOREpthisPersonaInstance;
    }
    
    public void setPersonaregistrarDatosCOREpthisPersonaInstance(Persona personaregistrarDatosCOREpthisPersona) {
        this.personaregistrarDatosCOREpthisPersonaInstance = personaregistrarDatosCOREpthisPersona;
        this.personaregistrarDatosCOREpthisPersona = personaregistrarDatosCOREpthisPersona != null ? personaregistrarDatosCOREpthisPersona.getOid() : null;
    }

    private void checkPersonaregistrarDatosCOREpthisPersona() throws NotNullArgumentException {
        if(this.getPersonaregistrarDatosCOREpthisPersonaInstance() == null || this.getPersonaregistrarDatosCOREpthisPersonaInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_REGISTRARDATOSCORE, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_REGISTRARDATOSCORE_PERSONAREGISTRARDATOSCOREPTHISPERSONA, PersonaConstants.SERV_ALIAS_REGISTRARDATOSCORE, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_REGISTRARDATOSCORE_PERSONAREGISTRARDATOSCOREPTHISPERSONA);
        }
    }

    @JsonIgnore
    public Long getPersonaregistrarDatosCOREpCodigo() {
        return this.personaregistrarDatosCOREpCodigo;
    }
    
    public void setPersonaregistrarDatosCOREpCodigo(Long personaregistrarDatosCOREpCodigo) {
        this.personaregistrarDatosCOREpCodigo = personaregistrarDatosCOREpCodigo;
    }

    @JsonIgnore
    public Boolean getPersonaregistrarDatosCOREpTieneEPSSanitas() {
        return this.personaregistrarDatosCOREpTieneEPSSanitas;
    }
    
    public void setPersonaregistrarDatosCOREpTieneEPSSanitas(Boolean personaregistrarDatosCOREpTieneEPSSanitas) {
        this.personaregistrarDatosCOREpTieneEPSSanitas = personaregistrarDatosCOREpTieneEPSSanitas;
    }

    @JsonIgnore
    public String getPersonaregistrarDatosCOREpRechazadoAfiliacion() {
        return this.personaregistrarDatosCOREpRechazadoAfiliacion;
    }
    
    public void setPersonaregistrarDatosCOREpRechazadoAfiliacion(String personaregistrarDatosCOREpRechazadoAfiliacion) {
        this.personaregistrarDatosCOREpRechazadoAfiliacion = personaregistrarDatosCOREpRechazadoAfiliacion;
    }
}
