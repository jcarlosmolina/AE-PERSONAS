package com.keralty.aepersonas.viewmodel.estadopersona.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.EstadoPersonaConstants;
import com.keralty.aepersonas.persistence.EstadoPersona;
import com.keralty.aepersonas.persistence.oid.EstadoPersonaOid;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.Persona;

public class DelEstadoPersonaRequest {

    @JsonProperty("p_thisestadopersona_oid")
    private EstadoPersonaOid estadoPersonaDelEstadoPersonapthisEstadoPersona;
    
    @JsonIgnore
    private EstadoPersona estadoPersonaDelEstadoPersonapthisEstadoPersonaInstance;

    @JsonProperty("p_evcpersona_oid")
    private PersonaOid estadoPersonaDelEstadoPersonapevcPersona;
    
    @JsonIgnore
    private Persona estadoPersonaDelEstadoPersonapevcPersonaInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkEstadoPersonaDelEstadoPersonapthisEstadoPersona();
        checkEstadoPersonaDelEstadoPersonapevcPersona();
    }

    @JsonIgnore
    public EstadoPersonaOid getEstadoPersonaDelEstadoPersonapthisEstadoPersona() {
        return this.estadoPersonaDelEstadoPersonapthisEstadoPersona;
    }
    
    public void setEstadoPersonaDelEstadoPersonapthisEstadoPersona(EstadoPersonaOid estadoPersonaDelEstadoPersonapthisEstadoPersona) {
        this.estadoPersonaDelEstadoPersonapthisEstadoPersona = estadoPersonaDelEstadoPersonapthisEstadoPersona;
    }

    @JsonIgnore
    public EstadoPersona getEstadoPersonaDelEstadoPersonapthisEstadoPersonaInstance() {
        return this.estadoPersonaDelEstadoPersonapthisEstadoPersonaInstance;
    }
    
    public void setEstadoPersonaDelEstadoPersonapthisEstadoPersonaInstance(EstadoPersona estadoPersonaDelEstadoPersonapthisEstadoPersona) {
        this.estadoPersonaDelEstadoPersonapthisEstadoPersonaInstance = estadoPersonaDelEstadoPersonapthisEstadoPersona;
        this.estadoPersonaDelEstadoPersonapthisEstadoPersona = estadoPersonaDelEstadoPersonapthisEstadoPersona != null ? estadoPersonaDelEstadoPersonapthisEstadoPersona.getOid() : null;
    }

    private void checkEstadoPersonaDelEstadoPersonapthisEstadoPersona() throws NotNullArgumentException {
        if(this.getEstadoPersonaDelEstadoPersonapthisEstadoPersonaInstance() == null || this.getEstadoPersonaDelEstadoPersonapthisEstadoPersonaInstance().isNull()) {
            throw new NotNullArgumentException(EstadoPersonaConstants.SERV_ID_DELESTADOPERSONA, EstadoPersonaConstants.CLASS_ID, EstadoPersonaConstants.ARG_ID_DELESTADOPERSONA_ESTADOPERSONADELESTADOPERSONAPTHISESTADOPERSONA, EstadoPersonaConstants.SERV_ALIAS_DELESTADOPERSONA, EstadoPersonaConstants.CLASS_ALIAS, EstadoPersonaConstants.ARG_ALIAS_DELESTADOPERSONA_ESTADOPERSONADELESTADOPERSONAPTHISESTADOPERSONA);
        }
    }

    @JsonIgnore
    public PersonaOid getEstadoPersonaDelEstadoPersonapevcPersona() {
        return this.estadoPersonaDelEstadoPersonapevcPersona;
    }
    
    public void setEstadoPersonaDelEstadoPersonapevcPersona(PersonaOid estadoPersonaDelEstadoPersonapevcPersona) {
        this.estadoPersonaDelEstadoPersonapevcPersona = estadoPersonaDelEstadoPersonapevcPersona;
    }

    @JsonIgnore
    public Persona getEstadoPersonaDelEstadoPersonapevcPersonaInstance() {
        return this.estadoPersonaDelEstadoPersonapevcPersonaInstance;
    }
    
    public void setEstadoPersonaDelEstadoPersonapevcPersonaInstance(Persona estadoPersonaDelEstadoPersonapevcPersona) {
        this.estadoPersonaDelEstadoPersonapevcPersonaInstance = estadoPersonaDelEstadoPersonapevcPersona;
        this.estadoPersonaDelEstadoPersonapevcPersona = estadoPersonaDelEstadoPersonapevcPersona != null ? estadoPersonaDelEstadoPersonapevcPersona.getOid() : null;
    }

    private void checkEstadoPersonaDelEstadoPersonapevcPersona() throws NotNullArgumentException {
        if(this.getEstadoPersonaDelEstadoPersonapevcPersonaInstance() == null || this.getEstadoPersonaDelEstadoPersonapevcPersonaInstance().isNull()) {
            throw new NotNullArgumentException(EstadoPersonaConstants.SERV_ID_DELESTADOPERSONA, EstadoPersonaConstants.CLASS_ID, EstadoPersonaConstants.ARG_ID_DELESTADOPERSONA_ESTADOPERSONADELESTADOPERSONAPEVCPERSONA, EstadoPersonaConstants.SERV_ALIAS_DELESTADOPERSONA, EstadoPersonaConstants.CLASS_ALIAS, EstadoPersonaConstants.ARG_ALIAS_DELESTADOPERSONA_ESTADOPERSONADELESTADOPERSONAPEVCPERSONA);
        }
    }
}
