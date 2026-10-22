package com.keralty.aepersonas.viewmodel.contratante.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.ContratanteConstants;
import com.keralty.aepersonas.persistence.Contratante;
import com.keralty.aepersonas.persistence.oid.ContratanteOid;
import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.persistence.TipoIdentificacion;

public class CambTipoIdContratanteRequest {

    @JsonProperty("p_thiscontratante_oid")
    private ContratanteOid contratanteCambTipoIdContratantepthisContratante;
    
    @JsonIgnore
    private Contratante contratanteCambTipoIdContratantepthisContratanteInstance;

    @JsonProperty("p_evctipoidentificacion_oid")
    private TipoIdentificacionOid contratanteCambTipoIdContratantepevcTipoIdentificacion;
    
    @JsonIgnore
    private TipoIdentificacion contratanteCambTipoIdContratantepevcTipoIdentificacionInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkContratanteCambTipoIdContratantepthisContratante();
        checkContratanteCambTipoIdContratantepevcTipoIdentificacion();
    }

    @JsonIgnore
    public ContratanteOid getContratanteCambTipoIdContratantepthisContratante() {
        return this.contratanteCambTipoIdContratantepthisContratante;
    }
    
    public void setContratanteCambTipoIdContratantepthisContratante(ContratanteOid contratanteCambTipoIdContratantepthisContratante) {
        this.contratanteCambTipoIdContratantepthisContratante = contratanteCambTipoIdContratantepthisContratante;
    }

    @JsonIgnore
    public Contratante getContratanteCambTipoIdContratantepthisContratanteInstance() {
        return this.contratanteCambTipoIdContratantepthisContratanteInstance;
    }
    
    public void setContratanteCambTipoIdContratantepthisContratanteInstance(Contratante contratanteCambTipoIdContratantepthisContratante) {
        this.contratanteCambTipoIdContratantepthisContratanteInstance = contratanteCambTipoIdContratantepthisContratante;
        this.contratanteCambTipoIdContratantepthisContratante = contratanteCambTipoIdContratantepthisContratante != null ? contratanteCambTipoIdContratantepthisContratante.getOid() : null;
    }

    private void checkContratanteCambTipoIdContratantepthisContratante() throws NotNullArgumentException {
        if(this.getContratanteCambTipoIdContratantepthisContratanteInstance() == null || this.getContratanteCambTipoIdContratantepthisContratanteInstance().isNull()) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_CAMBTIPOIDCONTRATANTE, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_CAMBTIPOIDCONTRATANTE_CONTRATANTECAMBTIPOIDCONTRATANTEPTHISCONTRATANTE, ContratanteConstants.SERV_ALIAS_CAMBTIPOIDCONTRATANTE, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_CAMBTIPOIDCONTRATANTE_CONTRATANTECAMBTIPOIDCONTRATANTEPTHISCONTRATANTE);
        }
    }

    @JsonIgnore
    public TipoIdentificacionOid getContratanteCambTipoIdContratantepevcTipoIdentificacion() {
        return this.contratanteCambTipoIdContratantepevcTipoIdentificacion;
    }
    
    public void setContratanteCambTipoIdContratantepevcTipoIdentificacion(TipoIdentificacionOid contratanteCambTipoIdContratantepevcTipoIdentificacion) {
        this.contratanteCambTipoIdContratantepevcTipoIdentificacion = contratanteCambTipoIdContratantepevcTipoIdentificacion;
    }

    @JsonIgnore
    public TipoIdentificacion getContratanteCambTipoIdContratantepevcTipoIdentificacionInstance() {
        return this.contratanteCambTipoIdContratantepevcTipoIdentificacionInstance;
    }
    
    public void setContratanteCambTipoIdContratantepevcTipoIdentificacionInstance(TipoIdentificacion contratanteCambTipoIdContratantepevcTipoIdentificacion) {
        this.contratanteCambTipoIdContratantepevcTipoIdentificacionInstance = contratanteCambTipoIdContratantepevcTipoIdentificacion;
        this.contratanteCambTipoIdContratantepevcTipoIdentificacion = contratanteCambTipoIdContratantepevcTipoIdentificacion != null ? contratanteCambTipoIdContratantepevcTipoIdentificacion.getOid() : null;
    }

    private void checkContratanteCambTipoIdContratantepevcTipoIdentificacion() throws NotNullArgumentException {
        if(this.getContratanteCambTipoIdContratantepevcTipoIdentificacionInstance() == null || this.getContratanteCambTipoIdContratantepevcTipoIdentificacionInstance().isNull()) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_CAMBTIPOIDCONTRATANTE, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_CAMBTIPOIDCONTRATANTE_CONTRATANTECAMBTIPOIDCONTRATANTEPEVCTIPOIDENTIFICACION, ContratanteConstants.SERV_ALIAS_CAMBTIPOIDCONTRATANTE, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_CAMBTIPOIDCONTRATANTE_CONTRATANTECAMBTIPOIDCONTRATANTEPEVCTIPOIDENTIFICACION);
        }
    }
}
