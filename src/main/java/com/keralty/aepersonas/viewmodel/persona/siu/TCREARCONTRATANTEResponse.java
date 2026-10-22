package com.keralty.aepersonas.viewmodel.persona.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.Persona;
import com.keralty.aepersonas.viewmodel.ServiceResponse;
import java.util.HashMap;
import java.util.Map;

public class TCREARCONTRATANTEResponse extends ServiceResponse {


    @JsonProperty("pspersona")
    private PersonaOid personaTCREARCONTRATANTEpsPersona;
    
    @JsonIgnore
    private Persona personaTCREARCONTRATANTEpsPersonaInstance;

    public TCREARCONTRATANTEResponse() {
        super();
    }

    @JsonIgnore
    public PersonaOid getPersonaTCREARCONTRATANTEpsPersona() {
        return this.personaTCREARCONTRATANTEpsPersona;
    }
    
    public void setPersonaTCREARCONTRATANTEpsPersona(PersonaOid personaTCREARCONTRATANTEpsPersona) {
        this.personaTCREARCONTRATANTEpsPersona = personaTCREARCONTRATANTEpsPersona;
    }
    @JsonIgnore
    public Persona getPersonaTCREARCONTRATANTEpsPersonaInstance() {
        return this.personaTCREARCONTRATANTEpsPersonaInstance;
    }
    
    public void setPersonaTCREARCONTRATANTEpsPersonaInstance(Persona personaTCREARCONTRATANTEpsPersona) {
        if (personaTCREARCONTRATANTEpsPersona != null && !personaTCREARCONTRATANTEpsPersona.isNull()) {
            this.personaTCREARCONTRATANTEpsPersona = personaTCREARCONTRATANTEpsPersona.getOid();
            this.personaTCREARCONTRATANTEpsPersonaInstance = personaTCREARCONTRATANTEpsPersona;
        } else {
            this.personaTCREARCONTRATANTEpsPersona = null;
            this.personaTCREARCONTRATANTEpsPersonaInstance = null;
        }
    }

    @Override
    public Map<String, Object> buildOutArgs() {
        Map<String, Object> outArgs = new HashMap<>();
        outArgs.put("personaTCREARCONTRATANTEpsPersona", personaTCREARCONTRATANTEpsPersona);
        return outArgs;
    }
}
