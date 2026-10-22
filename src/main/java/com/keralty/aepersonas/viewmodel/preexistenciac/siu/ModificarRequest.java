package com.keralty.aepersonas.viewmodel.preexistenciac.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PreexistenciaCConstants;
import com.keralty.aepersonas.persistence.oid.PreexistenciaCOid;
import com.keralty.aepersonas.persistence.PreexistenciaC;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneDeserializer;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneSerializer;
import java.sql.Date;

public class ModificarRequest {

    @JsonProperty("p_thispreexistenciac_oid")
    private PreexistenciaCOid preexistenciaCmodificarpthisPreexistenciaC;
    
    @JsonIgnore
    private PreexistenciaC preexistenciaCmodificarpthisPreexistenciaCInstance;

    @JsonProperty("p_descripcion")
    private String preexistenciaCmodificarpDescripcion;

    @JsonProperty("p_fecinicio")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date preexistenciaCmodificarpFecInicio;

    @JsonProperty("p_fecfin")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date preexistenciaCmodificarpFecFin;

    @JsonProperty("p_obervacion")
    private String preexistenciaCmodificarpObervacion;

    @JsonProperty("p_observacion")
    private String preexistenciaCmodificarpObservacion;

    public void checkArguments() throws NotNullArgumentException {
        checkPreexistenciaCmodificarpthisPreexistenciaC();
        checkPreexistenciaCmodificarpDescripcion();
        checkPreexistenciaCmodificarpFecInicio();
    }

    @JsonIgnore
    public PreexistenciaCOid getPreexistenciaCmodificarpthisPreexistenciaC() {
        return this.preexistenciaCmodificarpthisPreexistenciaC;
    }
    
    public void setPreexistenciaCmodificarpthisPreexistenciaC(PreexistenciaCOid preexistenciaCmodificarpthisPreexistenciaC) {
        this.preexistenciaCmodificarpthisPreexistenciaC = preexistenciaCmodificarpthisPreexistenciaC;
    }

    @JsonIgnore
    public PreexistenciaC getPreexistenciaCmodificarpthisPreexistenciaCInstance() {
        return this.preexistenciaCmodificarpthisPreexistenciaCInstance;
    }
    
    public void setPreexistenciaCmodificarpthisPreexistenciaCInstance(PreexistenciaC preexistenciaCmodificarpthisPreexistenciaC) {
        this.preexistenciaCmodificarpthisPreexistenciaCInstance = preexistenciaCmodificarpthisPreexistenciaC;
        this.preexistenciaCmodificarpthisPreexistenciaC = preexistenciaCmodificarpthisPreexistenciaC != null ? preexistenciaCmodificarpthisPreexistenciaC.getOid() : null;
    }

    private void checkPreexistenciaCmodificarpthisPreexistenciaC() throws NotNullArgumentException {
        if(this.getPreexistenciaCmodificarpthisPreexistenciaCInstance() == null || this.getPreexistenciaCmodificarpthisPreexistenciaCInstance().isNull()) {
            throw new NotNullArgumentException(PreexistenciaCConstants.SERV_ID_MODIFICAR, PreexistenciaCConstants.CLASS_ID, PreexistenciaCConstants.ARG_ID_MODIFICAR_PREEXISTENCIACMODIFICARPTHISPREEXISTENCIAC, PreexistenciaCConstants.SERV_ALIAS_MODIFICAR, PreexistenciaCConstants.CLASS_ALIAS, PreexistenciaCConstants.ARG_ALIAS_MODIFICAR_PREEXISTENCIACMODIFICARPTHISPREEXISTENCIAC);
        }
    }

    @JsonIgnore
    public String getPreexistenciaCmodificarpDescripcion() {
        return this.preexistenciaCmodificarpDescripcion;
    }
    
    public void setPreexistenciaCmodificarpDescripcion(String preexistenciaCmodificarpDescripcion) {
        this.preexistenciaCmodificarpDescripcion = preexistenciaCmodificarpDescripcion;
    }

    private void checkPreexistenciaCmodificarpDescripcion() throws NotNullArgumentException {
        if(this.getPreexistenciaCmodificarpDescripcion() == null) {
            throw new NotNullArgumentException(PreexistenciaCConstants.SERV_ID_MODIFICAR, PreexistenciaCConstants.CLASS_ID, PreexistenciaCConstants.ARG_ID_MODIFICAR_PREEXISTENCIACMODIFICARPDESCRIPCION, PreexistenciaCConstants.SERV_ALIAS_MODIFICAR, PreexistenciaCConstants.CLASS_ALIAS, PreexistenciaCConstants.ARG_ALIAS_MODIFICAR_PREEXISTENCIACMODIFICARPDESCRIPCION);
        }
    }

    @JsonIgnore
    public Date getPreexistenciaCmodificarpFecInicio() {
        return this.preexistenciaCmodificarpFecInicio;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setPreexistenciaCmodificarpFecInicio(Date preexistenciaCmodificarpFecInicio) {
        this.preexistenciaCmodificarpFecInicio = preexistenciaCmodificarpFecInicio;
    }

    private void checkPreexistenciaCmodificarpFecInicio() throws NotNullArgumentException {
        if(this.getPreexistenciaCmodificarpFecInicio() == null) {
            throw new NotNullArgumentException(PreexistenciaCConstants.SERV_ID_MODIFICAR, PreexistenciaCConstants.CLASS_ID, PreexistenciaCConstants.ARG_ID_MODIFICAR_PREEXISTENCIACMODIFICARPFECINICIO, PreexistenciaCConstants.SERV_ALIAS_MODIFICAR, PreexistenciaCConstants.CLASS_ALIAS, PreexistenciaCConstants.ARG_ALIAS_MODIFICAR_PREEXISTENCIACMODIFICARPFECINICIO);
        }
    }

    @JsonIgnore
    public Date getPreexistenciaCmodificarpFecFin() {
        return this.preexistenciaCmodificarpFecFin;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setPreexistenciaCmodificarpFecFin(Date preexistenciaCmodificarpFecFin) {
        this.preexistenciaCmodificarpFecFin = preexistenciaCmodificarpFecFin;
    }

    @JsonIgnore
    public String getPreexistenciaCmodificarpObervacion() {
        return this.preexistenciaCmodificarpObervacion;
    }
    
    public void setPreexistenciaCmodificarpObervacion(String preexistenciaCmodificarpObervacion) {
        this.preexistenciaCmodificarpObervacion = preexistenciaCmodificarpObervacion;
    }

    @JsonIgnore
    public String getPreexistenciaCmodificarpObservacion() {
        return this.preexistenciaCmodificarpObservacion;
    }
    
    public void setPreexistenciaCmodificarpObservacion(String preexistenciaCmodificarpObservacion) {
        this.preexistenciaCmodificarpObservacion = preexistenciaCmodificarpObservacion;
    }
}
