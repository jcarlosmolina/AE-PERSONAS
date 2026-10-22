package com.keralty.aepersonas.viewmodel.tipoidentificacion.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.TipoIdentificacionConstants;
import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.persistence.oid.TitularOid;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
import com.keralty.aepersonas.persistence.Titular;

public class CambTipoIdentificacionTitularRequest {

    @JsonProperty("p_thistipoidentificacion_oid")
    private TipoIdentificacionOid tipoIdentificacionCambTipoIdentificacionTitularpthisTipoIdentificacion;
    
    @JsonIgnore
    private TipoIdentificacion tipoIdentificacionCambTipoIdentificacionTitularpthisTipoIdentificacionInstance;

    @JsonProperty("p_evctitular_oid")
    private TitularOid tipoIdentificacionCambTipoIdentificacionTitularpevcTitular;
    
    @JsonIgnore
    private Titular tipoIdentificacionCambTipoIdentificacionTitularpevcTitularInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkTipoIdentificacionCambTipoIdentificacionTitularpthisTipoIdentificacion();
        checkTipoIdentificacionCambTipoIdentificacionTitularpevcTitular();
    }

    @JsonIgnore
    public TipoIdentificacionOid getTipoIdentificacionCambTipoIdentificacionTitularpthisTipoIdentificacion() {
        return this.tipoIdentificacionCambTipoIdentificacionTitularpthisTipoIdentificacion;
    }
    
    public void setTipoIdentificacionCambTipoIdentificacionTitularpthisTipoIdentificacion(TipoIdentificacionOid tipoIdentificacionCambTipoIdentificacionTitularpthisTipoIdentificacion) {
        this.tipoIdentificacionCambTipoIdentificacionTitularpthisTipoIdentificacion = tipoIdentificacionCambTipoIdentificacionTitularpthisTipoIdentificacion;
    }

    @JsonIgnore
    public TipoIdentificacion getTipoIdentificacionCambTipoIdentificacionTitularpthisTipoIdentificacionInstance() {
        return this.tipoIdentificacionCambTipoIdentificacionTitularpthisTipoIdentificacionInstance;
    }
    
    public void setTipoIdentificacionCambTipoIdentificacionTitularpthisTipoIdentificacionInstance(TipoIdentificacion tipoIdentificacionCambTipoIdentificacionTitularpthisTipoIdentificacion) {
        this.tipoIdentificacionCambTipoIdentificacionTitularpthisTipoIdentificacionInstance = tipoIdentificacionCambTipoIdentificacionTitularpthisTipoIdentificacion;
        this.tipoIdentificacionCambTipoIdentificacionTitularpthisTipoIdentificacion = tipoIdentificacionCambTipoIdentificacionTitularpthisTipoIdentificacion != null ? tipoIdentificacionCambTipoIdentificacionTitularpthisTipoIdentificacion.getOid() : null;
    }

    private void checkTipoIdentificacionCambTipoIdentificacionTitularpthisTipoIdentificacion() throws NotNullArgumentException {
        if(this.getTipoIdentificacionCambTipoIdentificacionTitularpthisTipoIdentificacionInstance() == null || this.getTipoIdentificacionCambTipoIdentificacionTitularpthisTipoIdentificacionInstance().isNull()) {
            throw new NotNullArgumentException(TipoIdentificacionConstants.SERV_ID_CAMBTIPOIDENTIFICACIONTITULAR, TipoIdentificacionConstants.CLASS_ID, TipoIdentificacionConstants.ARG_ID_CAMBTIPOIDENTIFICACIONTITULAR_TIPOIDENTIFICACIONCAMBTIPOIDENTIFICACIONTITULARPTHISTIPOIDENTIFICACION, TipoIdentificacionConstants.SERV_ALIAS_CAMBTIPOIDENTIFICACIONTITULAR, TipoIdentificacionConstants.CLASS_ALIAS, TipoIdentificacionConstants.ARG_ALIAS_CAMBTIPOIDENTIFICACIONTITULAR_TIPOIDENTIFICACIONCAMBTIPOIDENTIFICACIONTITULARPTHISTIPOIDENTIFICACION);
        }
    }

    @JsonIgnore
    public TitularOid getTipoIdentificacionCambTipoIdentificacionTitularpevcTitular() {
        return this.tipoIdentificacionCambTipoIdentificacionTitularpevcTitular;
    }
    
    public void setTipoIdentificacionCambTipoIdentificacionTitularpevcTitular(TitularOid tipoIdentificacionCambTipoIdentificacionTitularpevcTitular) {
        this.tipoIdentificacionCambTipoIdentificacionTitularpevcTitular = tipoIdentificacionCambTipoIdentificacionTitularpevcTitular;
    }

    @JsonIgnore
    public Titular getTipoIdentificacionCambTipoIdentificacionTitularpevcTitularInstance() {
        return this.tipoIdentificacionCambTipoIdentificacionTitularpevcTitularInstance;
    }
    
    public void setTipoIdentificacionCambTipoIdentificacionTitularpevcTitularInstance(Titular tipoIdentificacionCambTipoIdentificacionTitularpevcTitular) {
        this.tipoIdentificacionCambTipoIdentificacionTitularpevcTitularInstance = tipoIdentificacionCambTipoIdentificacionTitularpevcTitular;
        this.tipoIdentificacionCambTipoIdentificacionTitularpevcTitular = tipoIdentificacionCambTipoIdentificacionTitularpevcTitular != null ? tipoIdentificacionCambTipoIdentificacionTitularpevcTitular.getOid() : null;
    }

    private void checkTipoIdentificacionCambTipoIdentificacionTitularpevcTitular() throws NotNullArgumentException {
        if(this.getTipoIdentificacionCambTipoIdentificacionTitularpevcTitularInstance() == null || this.getTipoIdentificacionCambTipoIdentificacionTitularpevcTitularInstance().isNull()) {
            throw new NotNullArgumentException(TipoIdentificacionConstants.SERV_ID_CAMBTIPOIDENTIFICACIONTITULAR, TipoIdentificacionConstants.CLASS_ID, TipoIdentificacionConstants.ARG_ID_CAMBTIPOIDENTIFICACIONTITULAR_TIPOIDENTIFICACIONCAMBTIPOIDENTIFICACIONTITULARPEVCTITULAR, TipoIdentificacionConstants.SERV_ALIAS_CAMBTIPOIDENTIFICACIONTITULAR, TipoIdentificacionConstants.CLASS_ALIAS, TipoIdentificacionConstants.ARG_ALIAS_CAMBTIPOIDENTIFICACIONTITULAR_TIPOIDENTIFICACIONCAMBTIPOIDENTIFICACIONTITULARPEVCTITULAR);
        }
    }
}
