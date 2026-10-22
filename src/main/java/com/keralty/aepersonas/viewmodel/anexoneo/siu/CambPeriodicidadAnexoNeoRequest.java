package com.keralty.aepersonas.viewmodel.anexoneo.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.AnexoNeoConstants;
import com.keralty.aepersonas.persistence.AnexoNeo;
import com.keralty.aepersonas.persistence.oid.AnexoNeoOid;
import com.keralty.aepersonas.persistence.oid.PeriodicidadOid;
import com.keralty.aepersonas.persistence.Periodicidad;

public class CambPeriodicidadAnexoNeoRequest {

    @JsonProperty("p_thisanexoneo_oid")
    private AnexoNeoOid anexoNeoCambPeriodicidadAnexoNeopthisAnexoNeo;
    
    @JsonIgnore
    private AnexoNeo anexoNeoCambPeriodicidadAnexoNeopthisAnexoNeoInstance;

    @JsonProperty("p_evcperiodicidad_oid")
    private PeriodicidadOid anexoNeoCambPeriodicidadAnexoNeopevcPeriodicidad;
    
    @JsonIgnore
    private Periodicidad anexoNeoCambPeriodicidadAnexoNeopevcPeriodicidadInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkAnexoNeoCambPeriodicidadAnexoNeopthisAnexoNeo();
        checkAnexoNeoCambPeriodicidadAnexoNeopevcPeriodicidad();
    }

    @JsonIgnore
    public AnexoNeoOid getAnexoNeoCambPeriodicidadAnexoNeopthisAnexoNeo() {
        return this.anexoNeoCambPeriodicidadAnexoNeopthisAnexoNeo;
    }
    
    public void setAnexoNeoCambPeriodicidadAnexoNeopthisAnexoNeo(AnexoNeoOid anexoNeoCambPeriodicidadAnexoNeopthisAnexoNeo) {
        this.anexoNeoCambPeriodicidadAnexoNeopthisAnexoNeo = anexoNeoCambPeriodicidadAnexoNeopthisAnexoNeo;
    }

    @JsonIgnore
    public AnexoNeo getAnexoNeoCambPeriodicidadAnexoNeopthisAnexoNeoInstance() {
        return this.anexoNeoCambPeriodicidadAnexoNeopthisAnexoNeoInstance;
    }
    
    public void setAnexoNeoCambPeriodicidadAnexoNeopthisAnexoNeoInstance(AnexoNeo anexoNeoCambPeriodicidadAnexoNeopthisAnexoNeo) {
        this.anexoNeoCambPeriodicidadAnexoNeopthisAnexoNeoInstance = anexoNeoCambPeriodicidadAnexoNeopthisAnexoNeo;
        this.anexoNeoCambPeriodicidadAnexoNeopthisAnexoNeo = anexoNeoCambPeriodicidadAnexoNeopthisAnexoNeo != null ? anexoNeoCambPeriodicidadAnexoNeopthisAnexoNeo.getOid() : null;
    }

    private void checkAnexoNeoCambPeriodicidadAnexoNeopthisAnexoNeo() throws NotNullArgumentException {
        if(this.getAnexoNeoCambPeriodicidadAnexoNeopthisAnexoNeoInstance() == null || this.getAnexoNeoCambPeriodicidadAnexoNeopthisAnexoNeoInstance().isNull()) {
            throw new NotNullArgumentException(AnexoNeoConstants.SERV_ID_CAMBPERIODICIDADANEXONEO, AnexoNeoConstants.CLASS_ID, AnexoNeoConstants.ARG_ID_CAMBPERIODICIDADANEXONEO_ANEXONEOCAMBPERIODICIDADANEXONEOPTHISANEXONEO, AnexoNeoConstants.SERV_ALIAS_CAMBPERIODICIDADANEXONEO, AnexoNeoConstants.CLASS_ALIAS, AnexoNeoConstants.ARG_ALIAS_CAMBPERIODICIDADANEXONEO_ANEXONEOCAMBPERIODICIDADANEXONEOPTHISANEXONEO);
        }
    }

    @JsonIgnore
    public PeriodicidadOid getAnexoNeoCambPeriodicidadAnexoNeopevcPeriodicidad() {
        return this.anexoNeoCambPeriodicidadAnexoNeopevcPeriodicidad;
    }
    
    public void setAnexoNeoCambPeriodicidadAnexoNeopevcPeriodicidad(PeriodicidadOid anexoNeoCambPeriodicidadAnexoNeopevcPeriodicidad) {
        this.anexoNeoCambPeriodicidadAnexoNeopevcPeriodicidad = anexoNeoCambPeriodicidadAnexoNeopevcPeriodicidad;
    }

    @JsonIgnore
    public Periodicidad getAnexoNeoCambPeriodicidadAnexoNeopevcPeriodicidadInstance() {
        return this.anexoNeoCambPeriodicidadAnexoNeopevcPeriodicidadInstance;
    }
    
    public void setAnexoNeoCambPeriodicidadAnexoNeopevcPeriodicidadInstance(Periodicidad anexoNeoCambPeriodicidadAnexoNeopevcPeriodicidad) {
        this.anexoNeoCambPeriodicidadAnexoNeopevcPeriodicidadInstance = anexoNeoCambPeriodicidadAnexoNeopevcPeriodicidad;
        this.anexoNeoCambPeriodicidadAnexoNeopevcPeriodicidad = anexoNeoCambPeriodicidadAnexoNeopevcPeriodicidad != null ? anexoNeoCambPeriodicidadAnexoNeopevcPeriodicidad.getOid() : null;
    }

    private void checkAnexoNeoCambPeriodicidadAnexoNeopevcPeriodicidad() throws NotNullArgumentException {
        if(this.getAnexoNeoCambPeriodicidadAnexoNeopevcPeriodicidadInstance() == null || this.getAnexoNeoCambPeriodicidadAnexoNeopevcPeriodicidadInstance().isNull()) {
            throw new NotNullArgumentException(AnexoNeoConstants.SERV_ID_CAMBPERIODICIDADANEXONEO, AnexoNeoConstants.CLASS_ID, AnexoNeoConstants.ARG_ID_CAMBPERIODICIDADANEXONEO_ANEXONEOCAMBPERIODICIDADANEXONEOPEVCPERIODICIDAD, AnexoNeoConstants.SERV_ALIAS_CAMBPERIODICIDADANEXONEO, AnexoNeoConstants.CLASS_ALIAS, AnexoNeoConstants.ARG_ALIAS_CAMBPERIODICIDADANEXONEO_ANEXONEOCAMBPERIODICIDADANEXONEOPEVCPERIODICIDAD);
        }
    }
}
