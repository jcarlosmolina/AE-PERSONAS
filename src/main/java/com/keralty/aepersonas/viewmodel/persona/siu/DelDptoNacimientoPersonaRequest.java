package com.keralty.aepersonas.viewmodel.persona.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.Persona;

public class DelDptoNacimientoPersonaRequest {

    @JsonProperty("p_thispersona_oid")
    private PersonaOid personaDelDptoNacimientoPersonapthisPersona;
    
    @JsonIgnore
    private Persona personaDelDptoNacimientoPersonapthisPersonaInstance;

    @JsonProperty("p_evcdepartamento_oid")
    private DepartamentoOid personaDelDptoNacimientoPersonapevcDepartamento;
    
    @JsonIgnore
    private Departamento personaDelDptoNacimientoPersonapevcDepartamentoInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonaDelDptoNacimientoPersonapthisPersona();
        checkPersonaDelDptoNacimientoPersonapevcDepartamento();
    }

    @JsonIgnore
    public PersonaOid getPersonaDelDptoNacimientoPersonapthisPersona() {
        return this.personaDelDptoNacimientoPersonapthisPersona;
    }
    
    public void setPersonaDelDptoNacimientoPersonapthisPersona(PersonaOid personaDelDptoNacimientoPersonapthisPersona) {
        this.personaDelDptoNacimientoPersonapthisPersona = personaDelDptoNacimientoPersonapthisPersona;
    }

    @JsonIgnore
    public Persona getPersonaDelDptoNacimientoPersonapthisPersonaInstance() {
        return this.personaDelDptoNacimientoPersonapthisPersonaInstance;
    }
    
    public void setPersonaDelDptoNacimientoPersonapthisPersonaInstance(Persona personaDelDptoNacimientoPersonapthisPersona) {
        this.personaDelDptoNacimientoPersonapthisPersonaInstance = personaDelDptoNacimientoPersonapthisPersona;
        this.personaDelDptoNacimientoPersonapthisPersona = personaDelDptoNacimientoPersonapthisPersona != null ? personaDelDptoNacimientoPersonapthisPersona.getOid() : null;
    }

    private void checkPersonaDelDptoNacimientoPersonapthisPersona() throws NotNullArgumentException {
        if(this.getPersonaDelDptoNacimientoPersonapthisPersonaInstance() == null || this.getPersonaDelDptoNacimientoPersonapthisPersonaInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_DELDPTONACIMIENTOPERSONA, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_DELDPTONACIMIENTOPERSONA_PERSONADELDPTONACIMIENTOPERSONAPTHISPERSONA, PersonaConstants.SERV_ALIAS_DELDPTONACIMIENTOPERSONA, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_DELDPTONACIMIENTOPERSONA_PERSONADELDPTONACIMIENTOPERSONAPTHISPERSONA);
        }
    }

    @JsonIgnore
    public DepartamentoOid getPersonaDelDptoNacimientoPersonapevcDepartamento() {
        return this.personaDelDptoNacimientoPersonapevcDepartamento;
    }
    
    public void setPersonaDelDptoNacimientoPersonapevcDepartamento(DepartamentoOid personaDelDptoNacimientoPersonapevcDepartamento) {
        this.personaDelDptoNacimientoPersonapevcDepartamento = personaDelDptoNacimientoPersonapevcDepartamento;
    }

    @JsonIgnore
    public Departamento getPersonaDelDptoNacimientoPersonapevcDepartamentoInstance() {
        return this.personaDelDptoNacimientoPersonapevcDepartamentoInstance;
    }
    
    public void setPersonaDelDptoNacimientoPersonapevcDepartamentoInstance(Departamento personaDelDptoNacimientoPersonapevcDepartamento) {
        this.personaDelDptoNacimientoPersonapevcDepartamentoInstance = personaDelDptoNacimientoPersonapevcDepartamento;
        this.personaDelDptoNacimientoPersonapevcDepartamento = personaDelDptoNacimientoPersonapevcDepartamento != null ? personaDelDptoNacimientoPersonapevcDepartamento.getOid() : null;
    }

    private void checkPersonaDelDptoNacimientoPersonapevcDepartamento() throws NotNullArgumentException {
        if(this.getPersonaDelDptoNacimientoPersonapevcDepartamentoInstance() == null || this.getPersonaDelDptoNacimientoPersonapevcDepartamentoInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_DELDPTONACIMIENTOPERSONA, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_DELDPTONACIMIENTOPERSONA_PERSONADELDPTONACIMIENTOPERSONAPEVCDEPARTAMENTO, PersonaConstants.SERV_ALIAS_DELDPTONACIMIENTOPERSONA, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_DELDPTONACIMIENTOPERSONA_PERSONADELDPTONACIMIENTOPERSONAPEVCDEPARTAMENTO);
        }
    }
}
