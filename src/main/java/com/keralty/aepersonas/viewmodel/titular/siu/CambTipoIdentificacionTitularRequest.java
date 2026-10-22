package com.keralty.aepersonas.viewmodel.titular.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.TitularConstants;
import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.persistence.oid.TitularOid;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
import com.keralty.aepersonas.persistence.Titular;

public class CambTipoIdentificacionTitularRequest {

    @JsonProperty("p_thistitular_oid")
    private TitularOid titularCambTipoIdentificacionTitularpthisTitular;
    
    @JsonIgnore
    private Titular titularCambTipoIdentificacionTitularpthisTitularInstance;

    @JsonProperty("p_evctipoidentificacion_oid")
    private TipoIdentificacionOid titularCambTipoIdentificacionTitularpevcTipoIdentificacion;
    
    @JsonIgnore
    private TipoIdentificacion titularCambTipoIdentificacionTitularpevcTipoIdentificacionInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkTitularCambTipoIdentificacionTitularpthisTitular();
        checkTitularCambTipoIdentificacionTitularpevcTipoIdentificacion();
    }

    @JsonIgnore
    public TitularOid getTitularCambTipoIdentificacionTitularpthisTitular() {
        return this.titularCambTipoIdentificacionTitularpthisTitular;
    }
    
    public void setTitularCambTipoIdentificacionTitularpthisTitular(TitularOid titularCambTipoIdentificacionTitularpthisTitular) {
        this.titularCambTipoIdentificacionTitularpthisTitular = titularCambTipoIdentificacionTitularpthisTitular;
    }

    @JsonIgnore
    public Titular getTitularCambTipoIdentificacionTitularpthisTitularInstance() {
        return this.titularCambTipoIdentificacionTitularpthisTitularInstance;
    }
    
    public void setTitularCambTipoIdentificacionTitularpthisTitularInstance(Titular titularCambTipoIdentificacionTitularpthisTitular) {
        this.titularCambTipoIdentificacionTitularpthisTitularInstance = titularCambTipoIdentificacionTitularpthisTitular;
        this.titularCambTipoIdentificacionTitularpthisTitular = titularCambTipoIdentificacionTitularpthisTitular != null ? titularCambTipoIdentificacionTitularpthisTitular.getOid() : null;
    }

    private void checkTitularCambTipoIdentificacionTitularpthisTitular() throws NotNullArgumentException {
        if(this.getTitularCambTipoIdentificacionTitularpthisTitularInstance() == null || this.getTitularCambTipoIdentificacionTitularpthisTitularInstance().isNull()) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_CAMBTIPOIDENTIFICACIONTITULAR, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_CAMBTIPOIDENTIFICACIONTITULAR_TITULARCAMBTIPOIDENTIFICACIONTITULARPTHISTITULAR, TitularConstants.SERV_ALIAS_CAMBTIPOIDENTIFICACIONTITULAR, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_CAMBTIPOIDENTIFICACIONTITULAR_TITULARCAMBTIPOIDENTIFICACIONTITULARPTHISTITULAR);
        }
    }

    @JsonIgnore
    public TipoIdentificacionOid getTitularCambTipoIdentificacionTitularpevcTipoIdentificacion() {
        return this.titularCambTipoIdentificacionTitularpevcTipoIdentificacion;
    }
    
    public void setTitularCambTipoIdentificacionTitularpevcTipoIdentificacion(TipoIdentificacionOid titularCambTipoIdentificacionTitularpevcTipoIdentificacion) {
        this.titularCambTipoIdentificacionTitularpevcTipoIdentificacion = titularCambTipoIdentificacionTitularpevcTipoIdentificacion;
    }

    @JsonIgnore
    public TipoIdentificacion getTitularCambTipoIdentificacionTitularpevcTipoIdentificacionInstance() {
        return this.titularCambTipoIdentificacionTitularpevcTipoIdentificacionInstance;
    }
    
    public void setTitularCambTipoIdentificacionTitularpevcTipoIdentificacionInstance(TipoIdentificacion titularCambTipoIdentificacionTitularpevcTipoIdentificacion) {
        this.titularCambTipoIdentificacionTitularpevcTipoIdentificacionInstance = titularCambTipoIdentificacionTitularpevcTipoIdentificacion;
        this.titularCambTipoIdentificacionTitularpevcTipoIdentificacion = titularCambTipoIdentificacionTitularpevcTipoIdentificacion != null ? titularCambTipoIdentificacionTitularpevcTipoIdentificacion.getOid() : null;
    }

    private void checkTitularCambTipoIdentificacionTitularpevcTipoIdentificacion() throws NotNullArgumentException {
        if(this.getTitularCambTipoIdentificacionTitularpevcTipoIdentificacionInstance() == null || this.getTitularCambTipoIdentificacionTitularpevcTipoIdentificacionInstance().isNull()) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_CAMBTIPOIDENTIFICACIONTITULAR, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_CAMBTIPOIDENTIFICACIONTITULAR_TITULARCAMBTIPOIDENTIFICACIONTITULARPEVCTIPOIDENTIFICACION, TitularConstants.SERV_ALIAS_CAMBTIPOIDENTIFICACIONTITULAR, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_CAMBTIPOIDENTIFICACIONTITULAR_TITULARCAMBTIPOIDENTIFICACIONTITULARPEVCTIPOIDENTIFICACION);
        }
    }
}
