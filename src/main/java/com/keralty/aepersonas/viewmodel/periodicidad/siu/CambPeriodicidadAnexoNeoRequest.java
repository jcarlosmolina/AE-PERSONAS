package com.keralty.aepersonas.viewmodel.periodicidad.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PeriodicidadConstants;
import com.keralty.aepersonas.persistence.AnexoNeo;
import com.keralty.aepersonas.persistence.oid.AnexoNeoOid;
import com.keralty.aepersonas.persistence.oid.PeriodicidadOid;
import com.keralty.aepersonas.persistence.Periodicidad;

public class CambPeriodicidadAnexoNeoRequest {

    @JsonProperty("p_thisperiodicidad_oid")
    private PeriodicidadOid periodicidadCambPeriodicidadAnexoNeopthisPeriodicidad;
    
    @JsonIgnore
    private Periodicidad periodicidadCambPeriodicidadAnexoNeopthisPeriodicidadInstance;

    @JsonProperty("p_evcanexoneo_oid")
    private AnexoNeoOid periodicidadCambPeriodicidadAnexoNeopevcAnexoNeo;
    
    @JsonIgnore
    private AnexoNeo periodicidadCambPeriodicidadAnexoNeopevcAnexoNeoInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkPeriodicidadCambPeriodicidadAnexoNeopthisPeriodicidad();
        checkPeriodicidadCambPeriodicidadAnexoNeopevcAnexoNeo();
    }

    @JsonIgnore
    public PeriodicidadOid getPeriodicidadCambPeriodicidadAnexoNeopthisPeriodicidad() {
        return this.periodicidadCambPeriodicidadAnexoNeopthisPeriodicidad;
    }
    
    public void setPeriodicidadCambPeriodicidadAnexoNeopthisPeriodicidad(PeriodicidadOid periodicidadCambPeriodicidadAnexoNeopthisPeriodicidad) {
        this.periodicidadCambPeriodicidadAnexoNeopthisPeriodicidad = periodicidadCambPeriodicidadAnexoNeopthisPeriodicidad;
    }

    @JsonIgnore
    public Periodicidad getPeriodicidadCambPeriodicidadAnexoNeopthisPeriodicidadInstance() {
        return this.periodicidadCambPeriodicidadAnexoNeopthisPeriodicidadInstance;
    }
    
    public void setPeriodicidadCambPeriodicidadAnexoNeopthisPeriodicidadInstance(Periodicidad periodicidadCambPeriodicidadAnexoNeopthisPeriodicidad) {
        this.periodicidadCambPeriodicidadAnexoNeopthisPeriodicidadInstance = periodicidadCambPeriodicidadAnexoNeopthisPeriodicidad;
        this.periodicidadCambPeriodicidadAnexoNeopthisPeriodicidad = periodicidadCambPeriodicidadAnexoNeopthisPeriodicidad != null ? periodicidadCambPeriodicidadAnexoNeopthisPeriodicidad.getOid() : null;
    }

    private void checkPeriodicidadCambPeriodicidadAnexoNeopthisPeriodicidad() throws NotNullArgumentException {
        if(this.getPeriodicidadCambPeriodicidadAnexoNeopthisPeriodicidadInstance() == null || this.getPeriodicidadCambPeriodicidadAnexoNeopthisPeriodicidadInstance().isNull()) {
            throw new NotNullArgumentException(PeriodicidadConstants.SERV_ID_CAMBPERIODICIDADANEXONEO, PeriodicidadConstants.CLASS_ID, PeriodicidadConstants.ARG_ID_CAMBPERIODICIDADANEXONEO_PERIODICIDADCAMBPERIODICIDADANEXONEOPTHISPERIODICIDAD, PeriodicidadConstants.SERV_ALIAS_CAMBPERIODICIDADANEXONEO, PeriodicidadConstants.CLASS_ALIAS, PeriodicidadConstants.ARG_ALIAS_CAMBPERIODICIDADANEXONEO_PERIODICIDADCAMBPERIODICIDADANEXONEOPTHISPERIODICIDAD);
        }
    }

    @JsonIgnore
    public AnexoNeoOid getPeriodicidadCambPeriodicidadAnexoNeopevcAnexoNeo() {
        return this.periodicidadCambPeriodicidadAnexoNeopevcAnexoNeo;
    }
    
    public void setPeriodicidadCambPeriodicidadAnexoNeopevcAnexoNeo(AnexoNeoOid periodicidadCambPeriodicidadAnexoNeopevcAnexoNeo) {
        this.periodicidadCambPeriodicidadAnexoNeopevcAnexoNeo = periodicidadCambPeriodicidadAnexoNeopevcAnexoNeo;
    }

    @JsonIgnore
    public AnexoNeo getPeriodicidadCambPeriodicidadAnexoNeopevcAnexoNeoInstance() {
        return this.periodicidadCambPeriodicidadAnexoNeopevcAnexoNeoInstance;
    }
    
    public void setPeriodicidadCambPeriodicidadAnexoNeopevcAnexoNeoInstance(AnexoNeo periodicidadCambPeriodicidadAnexoNeopevcAnexoNeo) {
        this.periodicidadCambPeriodicidadAnexoNeopevcAnexoNeoInstance = periodicidadCambPeriodicidadAnexoNeopevcAnexoNeo;
        this.periodicidadCambPeriodicidadAnexoNeopevcAnexoNeo = periodicidadCambPeriodicidadAnexoNeopevcAnexoNeo != null ? periodicidadCambPeriodicidadAnexoNeopevcAnexoNeo.getOid() : null;
    }

    private void checkPeriodicidadCambPeriodicidadAnexoNeopevcAnexoNeo() throws NotNullArgumentException {
        if(this.getPeriodicidadCambPeriodicidadAnexoNeopevcAnexoNeoInstance() == null || this.getPeriodicidadCambPeriodicidadAnexoNeopevcAnexoNeoInstance().isNull()) {
            throw new NotNullArgumentException(PeriodicidadConstants.SERV_ID_CAMBPERIODICIDADANEXONEO, PeriodicidadConstants.CLASS_ID, PeriodicidadConstants.ARG_ID_CAMBPERIODICIDADANEXONEO_PERIODICIDADCAMBPERIODICIDADANEXONEOPEVCANEXONEO, PeriodicidadConstants.SERV_ALIAS_CAMBPERIODICIDADANEXONEO, PeriodicidadConstants.CLASS_ALIAS, PeriodicidadConstants.ARG_ALIAS_CAMBPERIODICIDADANEXONEO_PERIODICIDADCAMBPERIODICIDADANEXONEOPEVCANEXONEO);
        }
    }
}
