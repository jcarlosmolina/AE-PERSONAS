package com.keralty.aepersonas.viewmodel.tipoidentificacion.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.TipoIdentificacionConstants;
import com.keralty.aepersonas.persistence.Contratante;
import com.keralty.aepersonas.persistence.oid.ContratanteOid;
import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.persistence.TipoIdentificacion;

public class CambTipoIdContratanteRequest {

    @JsonProperty("p_thistipoidentificacion_oid")
    private TipoIdentificacionOid tipoIdentificacionCambTipoIdContratantepthisTipoIdentificacion;
    
    @JsonIgnore
    private TipoIdentificacion tipoIdentificacionCambTipoIdContratantepthisTipoIdentificacionInstance;

    @JsonProperty("p_evccontratante_oid")
    private ContratanteOid tipoIdentificacionCambTipoIdContratantepevcContratante;
    
    @JsonIgnore
    private Contratante tipoIdentificacionCambTipoIdContratantepevcContratanteInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkTipoIdentificacionCambTipoIdContratantepthisTipoIdentificacion();
        checkTipoIdentificacionCambTipoIdContratantepevcContratante();
    }

    @JsonIgnore
    public TipoIdentificacionOid getTipoIdentificacionCambTipoIdContratantepthisTipoIdentificacion() {
        return this.tipoIdentificacionCambTipoIdContratantepthisTipoIdentificacion;
    }
    
    public void setTipoIdentificacionCambTipoIdContratantepthisTipoIdentificacion(TipoIdentificacionOid tipoIdentificacionCambTipoIdContratantepthisTipoIdentificacion) {
        this.tipoIdentificacionCambTipoIdContratantepthisTipoIdentificacion = tipoIdentificacionCambTipoIdContratantepthisTipoIdentificacion;
    }

    @JsonIgnore
    public TipoIdentificacion getTipoIdentificacionCambTipoIdContratantepthisTipoIdentificacionInstance() {
        return this.tipoIdentificacionCambTipoIdContratantepthisTipoIdentificacionInstance;
    }
    
    public void setTipoIdentificacionCambTipoIdContratantepthisTipoIdentificacionInstance(TipoIdentificacion tipoIdentificacionCambTipoIdContratantepthisTipoIdentificacion) {
        this.tipoIdentificacionCambTipoIdContratantepthisTipoIdentificacionInstance = tipoIdentificacionCambTipoIdContratantepthisTipoIdentificacion;
        this.tipoIdentificacionCambTipoIdContratantepthisTipoIdentificacion = tipoIdentificacionCambTipoIdContratantepthisTipoIdentificacion != null ? tipoIdentificacionCambTipoIdContratantepthisTipoIdentificacion.getOid() : null;
    }

    private void checkTipoIdentificacionCambTipoIdContratantepthisTipoIdentificacion() throws NotNullArgumentException {
        if(this.getTipoIdentificacionCambTipoIdContratantepthisTipoIdentificacionInstance() == null || this.getTipoIdentificacionCambTipoIdContratantepthisTipoIdentificacionInstance().isNull()) {
            throw new NotNullArgumentException(TipoIdentificacionConstants.SERV_ID_CAMBTIPOIDCONTRATANTE, TipoIdentificacionConstants.CLASS_ID, TipoIdentificacionConstants.ARG_ID_CAMBTIPOIDCONTRATANTE_TIPOIDENTIFICACIONCAMBTIPOIDCONTRATANTEPTHISTIPOIDENTIFICACION, TipoIdentificacionConstants.SERV_ALIAS_CAMBTIPOIDCONTRATANTE, TipoIdentificacionConstants.CLASS_ALIAS, TipoIdentificacionConstants.ARG_ALIAS_CAMBTIPOIDCONTRATANTE_TIPOIDENTIFICACIONCAMBTIPOIDCONTRATANTEPTHISTIPOIDENTIFICACION);
        }
    }

    @JsonIgnore
    public ContratanteOid getTipoIdentificacionCambTipoIdContratantepevcContratante() {
        return this.tipoIdentificacionCambTipoIdContratantepevcContratante;
    }
    
    public void setTipoIdentificacionCambTipoIdContratantepevcContratante(ContratanteOid tipoIdentificacionCambTipoIdContratantepevcContratante) {
        this.tipoIdentificacionCambTipoIdContratantepevcContratante = tipoIdentificacionCambTipoIdContratantepevcContratante;
    }

    @JsonIgnore
    public Contratante getTipoIdentificacionCambTipoIdContratantepevcContratanteInstance() {
        return this.tipoIdentificacionCambTipoIdContratantepevcContratanteInstance;
    }
    
    public void setTipoIdentificacionCambTipoIdContratantepevcContratanteInstance(Contratante tipoIdentificacionCambTipoIdContratantepevcContratante) {
        this.tipoIdentificacionCambTipoIdContratantepevcContratanteInstance = tipoIdentificacionCambTipoIdContratantepevcContratante;
        this.tipoIdentificacionCambTipoIdContratantepevcContratante = tipoIdentificacionCambTipoIdContratantepevcContratante != null ? tipoIdentificacionCambTipoIdContratantepevcContratante.getOid() : null;
    }

    private void checkTipoIdentificacionCambTipoIdContratantepevcContratante() throws NotNullArgumentException {
        if(this.getTipoIdentificacionCambTipoIdContratantepevcContratanteInstance() == null || this.getTipoIdentificacionCambTipoIdContratantepevcContratanteInstance().isNull()) {
            throw new NotNullArgumentException(TipoIdentificacionConstants.SERV_ID_CAMBTIPOIDCONTRATANTE, TipoIdentificacionConstants.CLASS_ID, TipoIdentificacionConstants.ARG_ID_CAMBTIPOIDCONTRATANTE_TIPOIDENTIFICACIONCAMBTIPOIDCONTRATANTEPEVCCONTRATANTE, TipoIdentificacionConstants.SERV_ALIAS_CAMBTIPOIDCONTRATANTE, TipoIdentificacionConstants.CLASS_ALIAS, TipoIdentificacionConstants.ARG_ALIAS_CAMBTIPOIDCONTRATANTE_TIPOIDENTIFICACIONCAMBTIPOIDCONTRATANTEPEVCCONTRATANTE);
        }
    }
}
