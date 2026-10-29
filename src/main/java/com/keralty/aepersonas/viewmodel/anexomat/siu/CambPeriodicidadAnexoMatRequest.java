package com.keralty.aepersonas.viewmodel.anexomat.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.AnexoMatConstants;
import com.keralty.aepersonas.persistence.AnexoMat;
import com.keralty.aepersonas.persistence.oid.AnexoMatOid;
import com.keralty.aepersonas.persistence.oid.PeriodicidadOid;
import com.keralty.aepersonas.persistence.Periodicidad;

public class CambPeriodicidadAnexoMatRequest {

    @JsonProperty("p_thisanexomat_oid")
    private AnexoMatOid anexoMatCambPeriodicidadAnexoMatpthisAnexoMat;
    
    @JsonIgnore
    private AnexoMat anexoMatCambPeriodicidadAnexoMatpthisAnexoMatInstance;

    @JsonProperty("p_evcperiodicidad_oid")
    private PeriodicidadOid anexoMatCambPeriodicidadAnexoMatpevcPeriodicidad;
    
    @JsonIgnore
    private Periodicidad anexoMatCambPeriodicidadAnexoMatpevcPeriodicidadInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkAnexoMatCambPeriodicidadAnexoMatpthisAnexoMat();
        checkAnexoMatCambPeriodicidadAnexoMatpevcPeriodicidad();
    }

    @JsonIgnore
    public AnexoMatOid getAnexoMatCambPeriodicidadAnexoMatpthisAnexoMat() {
        return this.anexoMatCambPeriodicidadAnexoMatpthisAnexoMat;
    }
    
    public void setAnexoMatCambPeriodicidadAnexoMatpthisAnexoMat(AnexoMatOid anexoMatCambPeriodicidadAnexoMatpthisAnexoMat) {
        this.anexoMatCambPeriodicidadAnexoMatpthisAnexoMat = anexoMatCambPeriodicidadAnexoMatpthisAnexoMat;
    }

    @JsonIgnore
    public AnexoMat getAnexoMatCambPeriodicidadAnexoMatpthisAnexoMatInstance() {
        return this.anexoMatCambPeriodicidadAnexoMatpthisAnexoMatInstance;
    }
    
    public void setAnexoMatCambPeriodicidadAnexoMatpthisAnexoMatInstance(AnexoMat anexoMatCambPeriodicidadAnexoMatpthisAnexoMat) {
        this.anexoMatCambPeriodicidadAnexoMatpthisAnexoMatInstance = anexoMatCambPeriodicidadAnexoMatpthisAnexoMat;
        this.anexoMatCambPeriodicidadAnexoMatpthisAnexoMat = anexoMatCambPeriodicidadAnexoMatpthisAnexoMat != null ? anexoMatCambPeriodicidadAnexoMatpthisAnexoMat.getOid() : null;
    }

    private void checkAnexoMatCambPeriodicidadAnexoMatpthisAnexoMat() throws NotNullArgumentException {
        if(this.getAnexoMatCambPeriodicidadAnexoMatpthisAnexoMatInstance() == null || this.getAnexoMatCambPeriodicidadAnexoMatpthisAnexoMatInstance().isNull()) {
            throw new NotNullArgumentException(AnexoMatConstants.SERV_ID_CAMBPERIODICIDADANEXOMAT, AnexoMatConstants.CLASS_ID, AnexoMatConstants.ARG_ID_CAMBPERIODICIDADANEXOMAT_ANEXOMATCAMBPERIODICIDADANEXOMATPTHISANEXOMAT, AnexoMatConstants.SERV_ALIAS_CAMBPERIODICIDADANEXOMAT, AnexoMatConstants.CLASS_ALIAS, AnexoMatConstants.ARG_ALIAS_CAMBPERIODICIDADANEXOMAT_ANEXOMATCAMBPERIODICIDADANEXOMATPTHISANEXOMAT);
        }
    }

    @JsonIgnore
    public PeriodicidadOid getAnexoMatCambPeriodicidadAnexoMatpevcPeriodicidad() {
        return this.anexoMatCambPeriodicidadAnexoMatpevcPeriodicidad;
    }
    
    public void setAnexoMatCambPeriodicidadAnexoMatpevcPeriodicidad(PeriodicidadOid anexoMatCambPeriodicidadAnexoMatpevcPeriodicidad) {
        this.anexoMatCambPeriodicidadAnexoMatpevcPeriodicidad = anexoMatCambPeriodicidadAnexoMatpevcPeriodicidad;
    }

    @JsonIgnore
    public Periodicidad getAnexoMatCambPeriodicidadAnexoMatpevcPeriodicidadInstance() {
        return this.anexoMatCambPeriodicidadAnexoMatpevcPeriodicidadInstance;
    }
    
    public void setAnexoMatCambPeriodicidadAnexoMatpevcPeriodicidadInstance(Periodicidad anexoMatCambPeriodicidadAnexoMatpevcPeriodicidad) {
        this.anexoMatCambPeriodicidadAnexoMatpevcPeriodicidadInstance = anexoMatCambPeriodicidadAnexoMatpevcPeriodicidad;
        this.anexoMatCambPeriodicidadAnexoMatpevcPeriodicidad = anexoMatCambPeriodicidadAnexoMatpevcPeriodicidad != null ? anexoMatCambPeriodicidadAnexoMatpevcPeriodicidad.getOid() : null;
    }

    private void checkAnexoMatCambPeriodicidadAnexoMatpevcPeriodicidad() throws NotNullArgumentException {
        if(this.getAnexoMatCambPeriodicidadAnexoMatpevcPeriodicidadInstance() == null || this.getAnexoMatCambPeriodicidadAnexoMatpevcPeriodicidadInstance().isNull()) {
            throw new NotNullArgumentException(AnexoMatConstants.SERV_ID_CAMBPERIODICIDADANEXOMAT, AnexoMatConstants.CLASS_ID, AnexoMatConstants.ARG_ID_CAMBPERIODICIDADANEXOMAT_ANEXOMATCAMBPERIODICIDADANEXOMATPEVCPERIODICIDAD, AnexoMatConstants.SERV_ALIAS_CAMBPERIODICIDADANEXOMAT, AnexoMatConstants.CLASS_ALIAS, AnexoMatConstants.ARG_ALIAS_CAMBPERIODICIDADANEXOMAT_ANEXOMATCAMBPERIODICIDADANEXOMATPEVCPERIODICIDAD);
        }
    }
}
