package com.keralty.aepersonas.viewmodel.estadocivil.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.EstadoCivilConstants;
import com.keralty.aepersonas.persistence.EstadoCivil;
import com.keralty.aepersonas.persistence.oid.EstadoCivilOid;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.Persona;

public class InsEstadoCivilPersonaRequest {

    @JsonProperty("p_thisestadocivil_oid")
    private EstadoCivilOid estadoCivilInsEstadoCivilPersonapthisEstadoCivil;
    
    @JsonIgnore
    private EstadoCivil estadoCivilInsEstadoCivilPersonapthisEstadoCivilInstance;

    @JsonProperty("p_evcpersona_oid")
    private PersonaOid estadoCivilInsEstadoCivilPersonapevcPersona;
    
    @JsonIgnore
    private Persona estadoCivilInsEstadoCivilPersonapevcPersonaInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkEstadoCivilInsEstadoCivilPersonapthisEstadoCivil();
        checkEstadoCivilInsEstadoCivilPersonapevcPersona();
    }

    @JsonIgnore
    public EstadoCivilOid getEstadoCivilInsEstadoCivilPersonapthisEstadoCivil() {
        return this.estadoCivilInsEstadoCivilPersonapthisEstadoCivil;
    }
    
    public void setEstadoCivilInsEstadoCivilPersonapthisEstadoCivil(EstadoCivilOid estadoCivilInsEstadoCivilPersonapthisEstadoCivil) {
        this.estadoCivilInsEstadoCivilPersonapthisEstadoCivil = estadoCivilInsEstadoCivilPersonapthisEstadoCivil;
    }

    @JsonIgnore
    public EstadoCivil getEstadoCivilInsEstadoCivilPersonapthisEstadoCivilInstance() {
        return this.estadoCivilInsEstadoCivilPersonapthisEstadoCivilInstance;
    }
    
    public void setEstadoCivilInsEstadoCivilPersonapthisEstadoCivilInstance(EstadoCivil estadoCivilInsEstadoCivilPersonapthisEstadoCivil) {
        this.estadoCivilInsEstadoCivilPersonapthisEstadoCivilInstance = estadoCivilInsEstadoCivilPersonapthisEstadoCivil;
        this.estadoCivilInsEstadoCivilPersonapthisEstadoCivil = estadoCivilInsEstadoCivilPersonapthisEstadoCivil != null ? estadoCivilInsEstadoCivilPersonapthisEstadoCivil.getOid() : null;
    }

    private void checkEstadoCivilInsEstadoCivilPersonapthisEstadoCivil() throws NotNullArgumentException {
        if(this.getEstadoCivilInsEstadoCivilPersonapthisEstadoCivilInstance() == null || this.getEstadoCivilInsEstadoCivilPersonapthisEstadoCivilInstance().isNull()) {
            throw new NotNullArgumentException(EstadoCivilConstants.SERV_ID_INSESTADOCIVILPERSONA, EstadoCivilConstants.CLASS_ID, EstadoCivilConstants.ARG_ID_INSESTADOCIVILPERSONA_ESTADOCIVILINSESTADOCIVILPERSONAPTHISESTADOCIVIL, EstadoCivilConstants.SERV_ALIAS_INSESTADOCIVILPERSONA, EstadoCivilConstants.CLASS_ALIAS, EstadoCivilConstants.ARG_ALIAS_INSESTADOCIVILPERSONA_ESTADOCIVILINSESTADOCIVILPERSONAPTHISESTADOCIVIL);
        }
    }

    @JsonIgnore
    public PersonaOid getEstadoCivilInsEstadoCivilPersonapevcPersona() {
        return this.estadoCivilInsEstadoCivilPersonapevcPersona;
    }
    
    public void setEstadoCivilInsEstadoCivilPersonapevcPersona(PersonaOid estadoCivilInsEstadoCivilPersonapevcPersona) {
        this.estadoCivilInsEstadoCivilPersonapevcPersona = estadoCivilInsEstadoCivilPersonapevcPersona;
    }

    @JsonIgnore
    public Persona getEstadoCivilInsEstadoCivilPersonapevcPersonaInstance() {
        return this.estadoCivilInsEstadoCivilPersonapevcPersonaInstance;
    }
    
    public void setEstadoCivilInsEstadoCivilPersonapevcPersonaInstance(Persona estadoCivilInsEstadoCivilPersonapevcPersona) {
        this.estadoCivilInsEstadoCivilPersonapevcPersonaInstance = estadoCivilInsEstadoCivilPersonapevcPersona;
        this.estadoCivilInsEstadoCivilPersonapevcPersona = estadoCivilInsEstadoCivilPersonapevcPersona != null ? estadoCivilInsEstadoCivilPersonapevcPersona.getOid() : null;
    }

    private void checkEstadoCivilInsEstadoCivilPersonapevcPersona() throws NotNullArgumentException {
        if(this.getEstadoCivilInsEstadoCivilPersonapevcPersonaInstance() == null || this.getEstadoCivilInsEstadoCivilPersonapevcPersonaInstance().isNull()) {
            throw new NotNullArgumentException(EstadoCivilConstants.SERV_ID_INSESTADOCIVILPERSONA, EstadoCivilConstants.CLASS_ID, EstadoCivilConstants.ARG_ID_INSESTADOCIVILPERSONA_ESTADOCIVILINSESTADOCIVILPERSONAPEVCPERSONA, EstadoCivilConstants.SERV_ALIAS_INSESTADOCIVILPERSONA, EstadoCivilConstants.CLASS_ALIAS, EstadoCivilConstants.ARG_ALIAS_INSESTADOCIVILPERSONA_ESTADOCIVILINSESTADOCIVILPERSONAPEVCPERSONA);
        }
    }
}
