package com.keralty.aepersonas.viewmodel.periodicidad.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PeriodicidadConstants;
import com.keralty.aepersonas.persistence.AnexoMat;
import com.keralty.aepersonas.persistence.oid.AnexoMatOid;
import com.keralty.aepersonas.persistence.oid.PeriodicidadOid;
import com.keralty.aepersonas.persistence.Periodicidad;

public class CambPeriodicidadAnexoMatRequest {

    @JsonProperty("p_thisperiodicidad_oid")
    private PeriodicidadOid periodicidadCambPeriodicidadAnexoMatpthisPeriodicidad;
    
    @JsonIgnore
    private Periodicidad periodicidadCambPeriodicidadAnexoMatpthisPeriodicidadInstance;

    @JsonProperty("p_evcanexomat_oid")
    private AnexoMatOid periodicidadCambPeriodicidadAnexoMatpevcAnexoMat;
    
    @JsonIgnore
    private AnexoMat periodicidadCambPeriodicidadAnexoMatpevcAnexoMatInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkPeriodicidadCambPeriodicidadAnexoMatpthisPeriodicidad();
        checkPeriodicidadCambPeriodicidadAnexoMatpevcAnexoMat();
    }

    @JsonIgnore
    public PeriodicidadOid getPeriodicidadCambPeriodicidadAnexoMatpthisPeriodicidad() {
        return this.periodicidadCambPeriodicidadAnexoMatpthisPeriodicidad;
    }
    
    public void setPeriodicidadCambPeriodicidadAnexoMatpthisPeriodicidad(PeriodicidadOid periodicidadCambPeriodicidadAnexoMatpthisPeriodicidad) {
        this.periodicidadCambPeriodicidadAnexoMatpthisPeriodicidad = periodicidadCambPeriodicidadAnexoMatpthisPeriodicidad;
    }

    @JsonIgnore
    public Periodicidad getPeriodicidadCambPeriodicidadAnexoMatpthisPeriodicidadInstance() {
        return this.periodicidadCambPeriodicidadAnexoMatpthisPeriodicidadInstance;
    }
    
    public void setPeriodicidadCambPeriodicidadAnexoMatpthisPeriodicidadInstance(Periodicidad periodicidadCambPeriodicidadAnexoMatpthisPeriodicidad) {
        this.periodicidadCambPeriodicidadAnexoMatpthisPeriodicidadInstance = periodicidadCambPeriodicidadAnexoMatpthisPeriodicidad;
        this.periodicidadCambPeriodicidadAnexoMatpthisPeriodicidad = periodicidadCambPeriodicidadAnexoMatpthisPeriodicidad != null ? periodicidadCambPeriodicidadAnexoMatpthisPeriodicidad.getOid() : null;
    }

    private void checkPeriodicidadCambPeriodicidadAnexoMatpthisPeriodicidad() throws NotNullArgumentException {
        if(this.getPeriodicidadCambPeriodicidadAnexoMatpthisPeriodicidadInstance() == null || this.getPeriodicidadCambPeriodicidadAnexoMatpthisPeriodicidadInstance().isNull()) {
            throw new NotNullArgumentException(PeriodicidadConstants.SERV_ID_CAMBPERIODICIDADANEXOMAT, PeriodicidadConstants.CLASS_ID, PeriodicidadConstants.ARG_ID_CAMBPERIODICIDADANEXOMAT_PERIODICIDADCAMBPERIODICIDADANEXOMATPTHISPERIODICIDAD, PeriodicidadConstants.SERV_ALIAS_CAMBPERIODICIDADANEXOMAT, PeriodicidadConstants.CLASS_ALIAS, PeriodicidadConstants.ARG_ALIAS_CAMBPERIODICIDADANEXOMAT_PERIODICIDADCAMBPERIODICIDADANEXOMATPTHISPERIODICIDAD);
        }
    }

    @JsonIgnore
    public AnexoMatOid getPeriodicidadCambPeriodicidadAnexoMatpevcAnexoMat() {
        return this.periodicidadCambPeriodicidadAnexoMatpevcAnexoMat;
    }
    
    public void setPeriodicidadCambPeriodicidadAnexoMatpevcAnexoMat(AnexoMatOid periodicidadCambPeriodicidadAnexoMatpevcAnexoMat) {
        this.periodicidadCambPeriodicidadAnexoMatpevcAnexoMat = periodicidadCambPeriodicidadAnexoMatpevcAnexoMat;
    }

    @JsonIgnore
    public AnexoMat getPeriodicidadCambPeriodicidadAnexoMatpevcAnexoMatInstance() {
        return this.periodicidadCambPeriodicidadAnexoMatpevcAnexoMatInstance;
    }
    
    public void setPeriodicidadCambPeriodicidadAnexoMatpevcAnexoMatInstance(AnexoMat periodicidadCambPeriodicidadAnexoMatpevcAnexoMat) {
        this.periodicidadCambPeriodicidadAnexoMatpevcAnexoMatInstance = periodicidadCambPeriodicidadAnexoMatpevcAnexoMat;
        this.periodicidadCambPeriodicidadAnexoMatpevcAnexoMat = periodicidadCambPeriodicidadAnexoMatpevcAnexoMat != null ? periodicidadCambPeriodicidadAnexoMatpevcAnexoMat.getOid() : null;
    }

    private void checkPeriodicidadCambPeriodicidadAnexoMatpevcAnexoMat() throws NotNullArgumentException {
        if(this.getPeriodicidadCambPeriodicidadAnexoMatpevcAnexoMatInstance() == null || this.getPeriodicidadCambPeriodicidadAnexoMatpevcAnexoMatInstance().isNull()) {
            throw new NotNullArgumentException(PeriodicidadConstants.SERV_ID_CAMBPERIODICIDADANEXOMAT, PeriodicidadConstants.CLASS_ID, PeriodicidadConstants.ARG_ID_CAMBPERIODICIDADANEXOMAT_PERIODICIDADCAMBPERIODICIDADANEXOMATPEVCANEXOMAT, PeriodicidadConstants.SERV_ALIAS_CAMBPERIODICIDADANEXOMAT, PeriodicidadConstants.CLASS_ALIAS, PeriodicidadConstants.ARG_ALIAS_CAMBPERIODICIDADANEXOMAT_PERIODICIDADCAMBPERIODICIDADANEXOMATPEVCANEXOMAT);
        }
    }
}
