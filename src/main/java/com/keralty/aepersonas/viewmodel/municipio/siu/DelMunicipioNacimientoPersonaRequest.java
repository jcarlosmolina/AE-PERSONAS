package com.keralty.aepersonas.viewmodel.municipio.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.MunicipioConstants;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.Persona;

public class DelMunicipioNacimientoPersonaRequest {

    @JsonProperty("p_thismunicipio_oid")
    private MunicipioOid municipioDelMunicipioNacimientoPersonapthisMunicipio;
    
    @JsonIgnore
    private Municipio municipioDelMunicipioNacimientoPersonapthisMunicipioInstance;

    @JsonProperty("p_evcpersona_oid")
    private PersonaOid municipioDelMunicipioNacimientoPersonapevcPersona;
    
    @JsonIgnore
    private Persona municipioDelMunicipioNacimientoPersonapevcPersonaInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkMunicipioDelMunicipioNacimientoPersonapthisMunicipio();
        checkMunicipioDelMunicipioNacimientoPersonapevcPersona();
    }

    @JsonIgnore
    public MunicipioOid getMunicipioDelMunicipioNacimientoPersonapthisMunicipio() {
        return this.municipioDelMunicipioNacimientoPersonapthisMunicipio;
    }
    
    public void setMunicipioDelMunicipioNacimientoPersonapthisMunicipio(MunicipioOid municipioDelMunicipioNacimientoPersonapthisMunicipio) {
        this.municipioDelMunicipioNacimientoPersonapthisMunicipio = municipioDelMunicipioNacimientoPersonapthisMunicipio;
    }

    @JsonIgnore
    public Municipio getMunicipioDelMunicipioNacimientoPersonapthisMunicipioInstance() {
        return this.municipioDelMunicipioNacimientoPersonapthisMunicipioInstance;
    }
    
    public void setMunicipioDelMunicipioNacimientoPersonapthisMunicipioInstance(Municipio municipioDelMunicipioNacimientoPersonapthisMunicipio) {
        this.municipioDelMunicipioNacimientoPersonapthisMunicipioInstance = municipioDelMunicipioNacimientoPersonapthisMunicipio;
        this.municipioDelMunicipioNacimientoPersonapthisMunicipio = municipioDelMunicipioNacimientoPersonapthisMunicipio != null ? municipioDelMunicipioNacimientoPersonapthisMunicipio.getOid() : null;
    }

    private void checkMunicipioDelMunicipioNacimientoPersonapthisMunicipio() throws NotNullArgumentException {
        if(this.getMunicipioDelMunicipioNacimientoPersonapthisMunicipioInstance() == null || this.getMunicipioDelMunicipioNacimientoPersonapthisMunicipioInstance().isNull()) {
            throw new NotNullArgumentException(MunicipioConstants.SERV_ID_DELMUNICIPIONACIMIENTOPERSONA, MunicipioConstants.CLASS_ID, MunicipioConstants.ARG_ID_DELMUNICIPIONACIMIENTOPERSONA_MUNICIPIODELMUNICIPIONACIMIENTOPERSONAPTHISMUNICIPIO, MunicipioConstants.SERV_ALIAS_DELMUNICIPIONACIMIENTOPERSONA, MunicipioConstants.CLASS_ALIAS, MunicipioConstants.ARG_ALIAS_DELMUNICIPIONACIMIENTOPERSONA_MUNICIPIODELMUNICIPIONACIMIENTOPERSONAPTHISMUNICIPIO);
        }
    }

    @JsonIgnore
    public PersonaOid getMunicipioDelMunicipioNacimientoPersonapevcPersona() {
        return this.municipioDelMunicipioNacimientoPersonapevcPersona;
    }
    
    public void setMunicipioDelMunicipioNacimientoPersonapevcPersona(PersonaOid municipioDelMunicipioNacimientoPersonapevcPersona) {
        this.municipioDelMunicipioNacimientoPersonapevcPersona = municipioDelMunicipioNacimientoPersonapevcPersona;
    }

    @JsonIgnore
    public Persona getMunicipioDelMunicipioNacimientoPersonapevcPersonaInstance() {
        return this.municipioDelMunicipioNacimientoPersonapevcPersonaInstance;
    }
    
    public void setMunicipioDelMunicipioNacimientoPersonapevcPersonaInstance(Persona municipioDelMunicipioNacimientoPersonapevcPersona) {
        this.municipioDelMunicipioNacimientoPersonapevcPersonaInstance = municipioDelMunicipioNacimientoPersonapevcPersona;
        this.municipioDelMunicipioNacimientoPersonapevcPersona = municipioDelMunicipioNacimientoPersonapevcPersona != null ? municipioDelMunicipioNacimientoPersonapevcPersona.getOid() : null;
    }

    private void checkMunicipioDelMunicipioNacimientoPersonapevcPersona() throws NotNullArgumentException {
        if(this.getMunicipioDelMunicipioNacimientoPersonapevcPersonaInstance() == null || this.getMunicipioDelMunicipioNacimientoPersonapevcPersonaInstance().isNull()) {
            throw new NotNullArgumentException(MunicipioConstants.SERV_ID_DELMUNICIPIONACIMIENTOPERSONA, MunicipioConstants.CLASS_ID, MunicipioConstants.ARG_ID_DELMUNICIPIONACIMIENTOPERSONA_MUNICIPIODELMUNICIPIONACIMIENTOPERSONAPEVCPERSONA, MunicipioConstants.SERV_ALIAS_DELMUNICIPIONACIMIENTOPERSONA, MunicipioConstants.CLASS_ALIAS, MunicipioConstants.ARG_ALIAS_DELMUNICIPIONACIMIENTOPERSONA_MUNICIPIODELMUNICIPIONACIMIENTOPERSONAPEVCPERSONA);
        }
    }
}
