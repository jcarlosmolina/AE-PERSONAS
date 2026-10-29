package com.keralty.aepersonas.viewmodel.estadocivil.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.EstadoCivilConstants;
import com.keralty.aepersonas.persistence.EstadoCivil;
import com.keralty.aepersonas.persistence.oid.EstadoCivilOid;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.Persona;

public class DelEstadoCivilPersonaRequest {

    @JsonProperty("p_thisestadocivil_oid")
    private EstadoCivilOid estadoCivilDelEstadoCivilPersonapthisEstadoCivil;
    
    @JsonIgnore
    private EstadoCivil estadoCivilDelEstadoCivilPersonapthisEstadoCivilInstance;

    @JsonProperty("p_evcpersona_oid")
    private PersonaOid estadoCivilDelEstadoCivilPersonapevcPersona;
    
    @JsonIgnore
    private Persona estadoCivilDelEstadoCivilPersonapevcPersonaInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkEstadoCivilDelEstadoCivilPersonapthisEstadoCivil();
        checkEstadoCivilDelEstadoCivilPersonapevcPersona();
    }

    @JsonIgnore
    public EstadoCivilOid getEstadoCivilDelEstadoCivilPersonapthisEstadoCivil() {
        return this.estadoCivilDelEstadoCivilPersonapthisEstadoCivil;
    }
    
    public void setEstadoCivilDelEstadoCivilPersonapthisEstadoCivil(EstadoCivilOid estadoCivilDelEstadoCivilPersonapthisEstadoCivil) {
        this.estadoCivilDelEstadoCivilPersonapthisEstadoCivil = estadoCivilDelEstadoCivilPersonapthisEstadoCivil;
    }

    @JsonIgnore
    public EstadoCivil getEstadoCivilDelEstadoCivilPersonapthisEstadoCivilInstance() {
        return this.estadoCivilDelEstadoCivilPersonapthisEstadoCivilInstance;
    }
    
    public void setEstadoCivilDelEstadoCivilPersonapthisEstadoCivilInstance(EstadoCivil estadoCivilDelEstadoCivilPersonapthisEstadoCivil) {
        this.estadoCivilDelEstadoCivilPersonapthisEstadoCivilInstance = estadoCivilDelEstadoCivilPersonapthisEstadoCivil;
        this.estadoCivilDelEstadoCivilPersonapthisEstadoCivil = estadoCivilDelEstadoCivilPersonapthisEstadoCivil != null ? estadoCivilDelEstadoCivilPersonapthisEstadoCivil.getOid() : null;
    }

    private void checkEstadoCivilDelEstadoCivilPersonapthisEstadoCivil() throws NotNullArgumentException {
        if(this.getEstadoCivilDelEstadoCivilPersonapthisEstadoCivilInstance() == null || this.getEstadoCivilDelEstadoCivilPersonapthisEstadoCivilInstance().isNull()) {
            throw new NotNullArgumentException(EstadoCivilConstants.SERV_ID_DELESTADOCIVILPERSONA, EstadoCivilConstants.CLASS_ID, EstadoCivilConstants.ARG_ID_DELESTADOCIVILPERSONA_ESTADOCIVILDELESTADOCIVILPERSONAPTHISESTADOCIVIL, EstadoCivilConstants.SERV_ALIAS_DELESTADOCIVILPERSONA, EstadoCivilConstants.CLASS_ALIAS, EstadoCivilConstants.ARG_ALIAS_DELESTADOCIVILPERSONA_ESTADOCIVILDELESTADOCIVILPERSONAPTHISESTADOCIVIL);
        }
    }

    @JsonIgnore
    public PersonaOid getEstadoCivilDelEstadoCivilPersonapevcPersona() {
        return this.estadoCivilDelEstadoCivilPersonapevcPersona;
    }
    
    public void setEstadoCivilDelEstadoCivilPersonapevcPersona(PersonaOid estadoCivilDelEstadoCivilPersonapevcPersona) {
        this.estadoCivilDelEstadoCivilPersonapevcPersona = estadoCivilDelEstadoCivilPersonapevcPersona;
    }

    @JsonIgnore
    public Persona getEstadoCivilDelEstadoCivilPersonapevcPersonaInstance() {
        return this.estadoCivilDelEstadoCivilPersonapevcPersonaInstance;
    }
    
    public void setEstadoCivilDelEstadoCivilPersonapevcPersonaInstance(Persona estadoCivilDelEstadoCivilPersonapevcPersona) {
        this.estadoCivilDelEstadoCivilPersonapevcPersonaInstance = estadoCivilDelEstadoCivilPersonapevcPersona;
        this.estadoCivilDelEstadoCivilPersonapevcPersona = estadoCivilDelEstadoCivilPersonapevcPersona != null ? estadoCivilDelEstadoCivilPersonapevcPersona.getOid() : null;
    }

    private void checkEstadoCivilDelEstadoCivilPersonapevcPersona() throws NotNullArgumentException {
        if(this.getEstadoCivilDelEstadoCivilPersonapevcPersonaInstance() == null || this.getEstadoCivilDelEstadoCivilPersonapevcPersonaInstance().isNull()) {
            throw new NotNullArgumentException(EstadoCivilConstants.SERV_ID_DELESTADOCIVILPERSONA, EstadoCivilConstants.CLASS_ID, EstadoCivilConstants.ARG_ID_DELESTADOCIVILPERSONA_ESTADOCIVILDELESTADOCIVILPERSONAPEVCPERSONA, EstadoCivilConstants.SERV_ALIAS_DELESTADOCIVILPERSONA, EstadoCivilConstants.CLASS_ALIAS, EstadoCivilConstants.ARG_ALIAS_DELESTADOCIVILPERSONA_ESTADOCIVILDELESTADOCIVILPERSONAPEVCPERSONA);
        }
    }
}
