package com.keralty.aepersonas.viewmodel.preexistenciac.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PreexistenciaCConstants;
import com.keralty.aepersonas.persistence.oid.PersonaCOid;
import com.keralty.aepersonas.persistence.PersonaC;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneDeserializer;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneSerializer;
import java.sql.Date;

public class CrearRequest {

    @JsonProperty("p_agrpersonac_oid")
    private PersonaCOid preexistenciaCcrearpagrPersonaC;
    
    @JsonIgnore
    private PersonaC preexistenciaCcrearpagrPersonaCInstance;

    @JsonProperty("p_atrdescripcion")
    private String preexistenciaCcrearpatrDescripcion;

    @JsonProperty("p_atrfecinicio")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date preexistenciaCcrearpatrFecInicio;

    @JsonProperty("p_atrfecfin")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date preexistenciaCcrearpatrFecFin;

    @JsonProperty("p_atrobservacion")
    private String preexistenciaCcrearpatrObservacion;

    public void checkArguments() throws NotNullArgumentException {
        checkPreexistenciaCcrearpagrPersonaC();
        checkPreexistenciaCcrearpatrDescripcion();
        checkPreexistenciaCcrearpatrFecInicio();
    }

    @JsonIgnore
    public PersonaCOid getPreexistenciaCcrearpagrPersonaC() {
        return this.preexistenciaCcrearpagrPersonaC;
    }
    
    public void setPreexistenciaCcrearpagrPersonaC(PersonaCOid preexistenciaCcrearpagrPersonaC) {
        this.preexistenciaCcrearpagrPersonaC = preexistenciaCcrearpagrPersonaC;
    }

    @JsonIgnore
    public PersonaC getPreexistenciaCcrearpagrPersonaCInstance() {
        return this.preexistenciaCcrearpagrPersonaCInstance;
    }
    
    public void setPreexistenciaCcrearpagrPersonaCInstance(PersonaC preexistenciaCcrearpagrPersonaC) {
        this.preexistenciaCcrearpagrPersonaCInstance = preexistenciaCcrearpagrPersonaC;
        this.preexistenciaCcrearpagrPersonaC = preexistenciaCcrearpagrPersonaC != null ? preexistenciaCcrearpagrPersonaC.getOid() : null;
    }

    private void checkPreexistenciaCcrearpagrPersonaC() throws NotNullArgumentException {
        if(this.getPreexistenciaCcrearpagrPersonaCInstance() == null || this.getPreexistenciaCcrearpagrPersonaCInstance().isNull()) {
            throw new NotNullArgumentException(PreexistenciaCConstants.SERV_ID_CREAR, PreexistenciaCConstants.CLASS_ID, PreexistenciaCConstants.ARG_ID_CREAR_PREEXISTENCIACCREARPAGRPERSONAC, PreexistenciaCConstants.SERV_ALIAS_CREAR, PreexistenciaCConstants.CLASS_ALIAS, PreexistenciaCConstants.ARG_ALIAS_CREAR_PREEXISTENCIACCREARPAGRPERSONAC);
        }
    }

    @JsonIgnore
    public String getPreexistenciaCcrearpatrDescripcion() {
        return this.preexistenciaCcrearpatrDescripcion;
    }
    
    public void setPreexistenciaCcrearpatrDescripcion(String preexistenciaCcrearpatrDescripcion) {
        this.preexistenciaCcrearpatrDescripcion = preexistenciaCcrearpatrDescripcion;
    }

    private void checkPreexistenciaCcrearpatrDescripcion() throws NotNullArgumentException {
        if(this.getPreexistenciaCcrearpatrDescripcion() == null) {
            throw new NotNullArgumentException(PreexistenciaCConstants.SERV_ID_CREAR, PreexistenciaCConstants.CLASS_ID, PreexistenciaCConstants.ARG_ID_CREAR_PREEXISTENCIACCREARPATRDESCRIPCION, PreexistenciaCConstants.SERV_ALIAS_CREAR, PreexistenciaCConstants.CLASS_ALIAS, PreexistenciaCConstants.ARG_ALIAS_CREAR_PREEXISTENCIACCREARPATRDESCRIPCION);
        }
    }

    @JsonIgnore
    public Date getPreexistenciaCcrearpatrFecInicio() {
        return this.preexistenciaCcrearpatrFecInicio;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setPreexistenciaCcrearpatrFecInicio(Date preexistenciaCcrearpatrFecInicio) {
        this.preexistenciaCcrearpatrFecInicio = preexistenciaCcrearpatrFecInicio;
    }

    private void checkPreexistenciaCcrearpatrFecInicio() throws NotNullArgumentException {
        if(this.getPreexistenciaCcrearpatrFecInicio() == null) {
            throw new NotNullArgumentException(PreexistenciaCConstants.SERV_ID_CREAR, PreexistenciaCConstants.CLASS_ID, PreexistenciaCConstants.ARG_ID_CREAR_PREEXISTENCIACCREARPATRFECINICIO, PreexistenciaCConstants.SERV_ALIAS_CREAR, PreexistenciaCConstants.CLASS_ALIAS, PreexistenciaCConstants.ARG_ALIAS_CREAR_PREEXISTENCIACCREARPATRFECINICIO);
        }
    }

    @JsonIgnore
    public Date getPreexistenciaCcrearpatrFecFin() {
        return this.preexistenciaCcrearpatrFecFin;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setPreexistenciaCcrearpatrFecFin(Date preexistenciaCcrearpatrFecFin) {
        this.preexistenciaCcrearpatrFecFin = preexistenciaCcrearpatrFecFin;
    }

    @JsonIgnore
    public String getPreexistenciaCcrearpatrObservacion() {
        return this.preexistenciaCcrearpatrObservacion;
    }
    
    public void setPreexistenciaCcrearpatrObservacion(String preexistenciaCcrearpatrObservacion) {
        this.preexistenciaCcrearpatrObservacion = preexistenciaCcrearpatrObservacion;
    }
}
