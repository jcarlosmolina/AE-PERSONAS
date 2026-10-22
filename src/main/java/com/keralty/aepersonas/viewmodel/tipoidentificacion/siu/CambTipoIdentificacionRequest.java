package com.keralty.aepersonas.viewmodel.tipoidentificacion.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.TipoIdentificacionConstants;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.persistence.Persona;
import com.keralty.aepersonas.persistence.TipoIdentificacion;

public class CambTipoIdentificacionRequest {

    @JsonProperty("p_thistipoidentificacion_oid")
    private TipoIdentificacionOid tipoIdentificacionCambTipoIdentificacionpthisTipoIdentificacion;
    
    @JsonIgnore
    private TipoIdentificacion tipoIdentificacionCambTipoIdentificacionpthisTipoIdentificacionInstance;

    @JsonProperty("p_evcpersona_oid")
    private PersonaOid tipoIdentificacionCambTipoIdentificacionpevcPersona;
    
    @JsonIgnore
    private Persona tipoIdentificacionCambTipoIdentificacionpevcPersonaInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkTipoIdentificacionCambTipoIdentificacionpthisTipoIdentificacion();
        checkTipoIdentificacionCambTipoIdentificacionpevcPersona();
    }

    @JsonIgnore
    public TipoIdentificacionOid getTipoIdentificacionCambTipoIdentificacionpthisTipoIdentificacion() {
        return this.tipoIdentificacionCambTipoIdentificacionpthisTipoIdentificacion;
    }
    
    public void setTipoIdentificacionCambTipoIdentificacionpthisTipoIdentificacion(TipoIdentificacionOid tipoIdentificacionCambTipoIdentificacionpthisTipoIdentificacion) {
        this.tipoIdentificacionCambTipoIdentificacionpthisTipoIdentificacion = tipoIdentificacionCambTipoIdentificacionpthisTipoIdentificacion;
    }

    @JsonIgnore
    public TipoIdentificacion getTipoIdentificacionCambTipoIdentificacionpthisTipoIdentificacionInstance() {
        return this.tipoIdentificacionCambTipoIdentificacionpthisTipoIdentificacionInstance;
    }
    
    public void setTipoIdentificacionCambTipoIdentificacionpthisTipoIdentificacionInstance(TipoIdentificacion tipoIdentificacionCambTipoIdentificacionpthisTipoIdentificacion) {
        this.tipoIdentificacionCambTipoIdentificacionpthisTipoIdentificacionInstance = tipoIdentificacionCambTipoIdentificacionpthisTipoIdentificacion;
        this.tipoIdentificacionCambTipoIdentificacionpthisTipoIdentificacion = tipoIdentificacionCambTipoIdentificacionpthisTipoIdentificacion != null ? tipoIdentificacionCambTipoIdentificacionpthisTipoIdentificacion.getOid() : null;
    }

    private void checkTipoIdentificacionCambTipoIdentificacionpthisTipoIdentificacion() throws NotNullArgumentException {
        if(this.getTipoIdentificacionCambTipoIdentificacionpthisTipoIdentificacionInstance() == null || this.getTipoIdentificacionCambTipoIdentificacionpthisTipoIdentificacionInstance().isNull()) {
            throw new NotNullArgumentException(TipoIdentificacionConstants.SERV_ID_CAMBTIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_ID, TipoIdentificacionConstants.ARG_ID_CAMBTIPOIDENTIFICACION_TIPOIDENTIFICACIONCAMBTIPOIDENTIFICACIONPTHISTIPOIDENTIFICACION, TipoIdentificacionConstants.SERV_ALIAS_CAMBTIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_ALIAS, TipoIdentificacionConstants.ARG_ALIAS_CAMBTIPOIDENTIFICACION_TIPOIDENTIFICACIONCAMBTIPOIDENTIFICACIONPTHISTIPOIDENTIFICACION);
        }
    }

    @JsonIgnore
    public PersonaOid getTipoIdentificacionCambTipoIdentificacionpevcPersona() {
        return this.tipoIdentificacionCambTipoIdentificacionpevcPersona;
    }
    
    public void setTipoIdentificacionCambTipoIdentificacionpevcPersona(PersonaOid tipoIdentificacionCambTipoIdentificacionpevcPersona) {
        this.tipoIdentificacionCambTipoIdentificacionpevcPersona = tipoIdentificacionCambTipoIdentificacionpevcPersona;
    }

    @JsonIgnore
    public Persona getTipoIdentificacionCambTipoIdentificacionpevcPersonaInstance() {
        return this.tipoIdentificacionCambTipoIdentificacionpevcPersonaInstance;
    }
    
    public void setTipoIdentificacionCambTipoIdentificacionpevcPersonaInstance(Persona tipoIdentificacionCambTipoIdentificacionpevcPersona) {
        this.tipoIdentificacionCambTipoIdentificacionpevcPersonaInstance = tipoIdentificacionCambTipoIdentificacionpevcPersona;
        this.tipoIdentificacionCambTipoIdentificacionpevcPersona = tipoIdentificacionCambTipoIdentificacionpevcPersona != null ? tipoIdentificacionCambTipoIdentificacionpevcPersona.getOid() : null;
    }

    private void checkTipoIdentificacionCambTipoIdentificacionpevcPersona() throws NotNullArgumentException {
        if(this.getTipoIdentificacionCambTipoIdentificacionpevcPersonaInstance() == null || this.getTipoIdentificacionCambTipoIdentificacionpevcPersonaInstance().isNull()) {
            throw new NotNullArgumentException(TipoIdentificacionConstants.SERV_ID_CAMBTIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_ID, TipoIdentificacionConstants.ARG_ID_CAMBTIPOIDENTIFICACION_TIPOIDENTIFICACIONCAMBTIPOIDENTIFICACIONPEVCPERSONA, TipoIdentificacionConstants.SERV_ALIAS_CAMBTIPOIDENTIFICACION, TipoIdentificacionConstants.CLASS_ALIAS, TipoIdentificacionConstants.ARG_ALIAS_CAMBTIPOIDENTIFICACION_TIPOIDENTIFICACIONCAMBTIPOIDENTIFICACIONPEVCPERSONA);
        }
    }
}
