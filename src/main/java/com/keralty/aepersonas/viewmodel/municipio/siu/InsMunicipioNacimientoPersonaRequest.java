package com.keralty.aepersonas.viewmodel.municipio.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.MunicipioConstants;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.Persona;

public class InsMunicipioNacimientoPersonaRequest {

    @JsonProperty("p_thismunicipio_oid")
    private MunicipioOid municipioInsMunicipioNacimientoPersonapthisMunicipio;
    
    @JsonIgnore
    private Municipio municipioInsMunicipioNacimientoPersonapthisMunicipioInstance;

    @JsonProperty("p_evcpersona_oid")
    private PersonaOid municipioInsMunicipioNacimientoPersonapevcPersona;
    
    @JsonIgnore
    private Persona municipioInsMunicipioNacimientoPersonapevcPersonaInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkMunicipioInsMunicipioNacimientoPersonapthisMunicipio();
        checkMunicipioInsMunicipioNacimientoPersonapevcPersona();
    }

    @JsonIgnore
    public MunicipioOid getMunicipioInsMunicipioNacimientoPersonapthisMunicipio() {
        return this.municipioInsMunicipioNacimientoPersonapthisMunicipio;
    }
    
    public void setMunicipioInsMunicipioNacimientoPersonapthisMunicipio(MunicipioOid municipioInsMunicipioNacimientoPersonapthisMunicipio) {
        this.municipioInsMunicipioNacimientoPersonapthisMunicipio = municipioInsMunicipioNacimientoPersonapthisMunicipio;
    }

    @JsonIgnore
    public Municipio getMunicipioInsMunicipioNacimientoPersonapthisMunicipioInstance() {
        return this.municipioInsMunicipioNacimientoPersonapthisMunicipioInstance;
    }
    
    public void setMunicipioInsMunicipioNacimientoPersonapthisMunicipioInstance(Municipio municipioInsMunicipioNacimientoPersonapthisMunicipio) {
        this.municipioInsMunicipioNacimientoPersonapthisMunicipioInstance = municipioInsMunicipioNacimientoPersonapthisMunicipio;
        this.municipioInsMunicipioNacimientoPersonapthisMunicipio = municipioInsMunicipioNacimientoPersonapthisMunicipio != null ? municipioInsMunicipioNacimientoPersonapthisMunicipio.getOid() : null;
    }

    private void checkMunicipioInsMunicipioNacimientoPersonapthisMunicipio() throws NotNullArgumentException {
        if(this.getMunicipioInsMunicipioNacimientoPersonapthisMunicipioInstance() == null || this.getMunicipioInsMunicipioNacimientoPersonapthisMunicipioInstance().isNull()) {
            throw new NotNullArgumentException(MunicipioConstants.SERV_ID_INSMUNICIPIONACIMIENTOPERSONA, MunicipioConstants.CLASS_ID, MunicipioConstants.ARG_ID_INSMUNICIPIONACIMIENTOPERSONA_MUNICIPIOINSMUNICIPIONACIMIENTOPERSONAPTHISMUNICIPIO, MunicipioConstants.SERV_ALIAS_INSMUNICIPIONACIMIENTOPERSONA, MunicipioConstants.CLASS_ALIAS, MunicipioConstants.ARG_ALIAS_INSMUNICIPIONACIMIENTOPERSONA_MUNICIPIOINSMUNICIPIONACIMIENTOPERSONAPTHISMUNICIPIO);
        }
    }

    @JsonIgnore
    public PersonaOid getMunicipioInsMunicipioNacimientoPersonapevcPersona() {
        return this.municipioInsMunicipioNacimientoPersonapevcPersona;
    }
    
    public void setMunicipioInsMunicipioNacimientoPersonapevcPersona(PersonaOid municipioInsMunicipioNacimientoPersonapevcPersona) {
        this.municipioInsMunicipioNacimientoPersonapevcPersona = municipioInsMunicipioNacimientoPersonapevcPersona;
    }

    @JsonIgnore
    public Persona getMunicipioInsMunicipioNacimientoPersonapevcPersonaInstance() {
        return this.municipioInsMunicipioNacimientoPersonapevcPersonaInstance;
    }
    
    public void setMunicipioInsMunicipioNacimientoPersonapevcPersonaInstance(Persona municipioInsMunicipioNacimientoPersonapevcPersona) {
        this.municipioInsMunicipioNacimientoPersonapevcPersonaInstance = municipioInsMunicipioNacimientoPersonapevcPersona;
        this.municipioInsMunicipioNacimientoPersonapevcPersona = municipioInsMunicipioNacimientoPersonapevcPersona != null ? municipioInsMunicipioNacimientoPersonapevcPersona.getOid() : null;
    }

    private void checkMunicipioInsMunicipioNacimientoPersonapevcPersona() throws NotNullArgumentException {
        if(this.getMunicipioInsMunicipioNacimientoPersonapevcPersonaInstance() == null || this.getMunicipioInsMunicipioNacimientoPersonapevcPersonaInstance().isNull()) {
            throw new NotNullArgumentException(MunicipioConstants.SERV_ID_INSMUNICIPIONACIMIENTOPERSONA, MunicipioConstants.CLASS_ID, MunicipioConstants.ARG_ID_INSMUNICIPIONACIMIENTOPERSONA_MUNICIPIOINSMUNICIPIONACIMIENTOPERSONAPEVCPERSONA, MunicipioConstants.SERV_ALIAS_INSMUNICIPIONACIMIENTOPERSONA, MunicipioConstants.CLASS_ALIAS, MunicipioConstants.ARG_ALIAS_INSMUNICIPIONACIMIENTOPERSONA_MUNICIPIOINSMUNICIPIONACIMIENTOPERSONAPEVCPERSONA);
        }
    }
}
