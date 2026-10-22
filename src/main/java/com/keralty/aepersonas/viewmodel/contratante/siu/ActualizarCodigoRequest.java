package com.keralty.aepersonas.viewmodel.contratante.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.ContratanteConstants;
import com.keralty.aepersonas.persistence.Contratante;
import com.keralty.aepersonas.persistence.oid.ContratanteOid;

public class ActualizarCodigoRequest {

    @JsonProperty("p_thiscontratante_oid")
    private ContratanteOid contratanteactualizarCodigopthisContratante;
    
    @JsonIgnore
    private Contratante contratanteactualizarCodigopthisContratanteInstance;

    @JsonProperty("p_codigo")
    private Long contratanteactualizarCodigopCodigo;

    public void checkArguments() throws NotNullArgumentException {
        checkContratanteactualizarCodigopthisContratante();
        checkContratanteactualizarCodigopCodigo();
    }

    @JsonIgnore
    public ContratanteOid getContratanteactualizarCodigopthisContratante() {
        return this.contratanteactualizarCodigopthisContratante;
    }
    
    public void setContratanteactualizarCodigopthisContratante(ContratanteOid contratanteactualizarCodigopthisContratante) {
        this.contratanteactualizarCodigopthisContratante = contratanteactualizarCodigopthisContratante;
    }

    @JsonIgnore
    public Contratante getContratanteactualizarCodigopthisContratanteInstance() {
        return this.contratanteactualizarCodigopthisContratanteInstance;
    }
    
    public void setContratanteactualizarCodigopthisContratanteInstance(Contratante contratanteactualizarCodigopthisContratante) {
        this.contratanteactualizarCodigopthisContratanteInstance = contratanteactualizarCodigopthisContratante;
        this.contratanteactualizarCodigopthisContratante = contratanteactualizarCodigopthisContratante != null ? contratanteactualizarCodigopthisContratante.getOid() : null;
    }

    private void checkContratanteactualizarCodigopthisContratante() throws NotNullArgumentException {
        if(this.getContratanteactualizarCodigopthisContratanteInstance() == null || this.getContratanteactualizarCodigopthisContratanteInstance().isNull()) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_ACTUALIZARCODIGO, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_ACTUALIZARCODIGO_CONTRATANTEACTUALIZARCODIGOPTHISCONTRATANTE, ContratanteConstants.SERV_ALIAS_ACTUALIZARCODIGO, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_ACTUALIZARCODIGO_CONTRATANTEACTUALIZARCODIGOPTHISCONTRATANTE);
        }
    }

    @JsonIgnore
    public Long getContratanteactualizarCodigopCodigo() {
        return this.contratanteactualizarCodigopCodigo;
    }
    
    public void setContratanteactualizarCodigopCodigo(Long contratanteactualizarCodigopCodigo) {
        this.contratanteactualizarCodigopCodigo = contratanteactualizarCodigopCodigo;
    }

    private void checkContratanteactualizarCodigopCodigo() throws NotNullArgumentException {
        if(this.getContratanteactualizarCodigopCodigo() == null) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_ACTUALIZARCODIGO, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_ACTUALIZARCODIGO_CONTRATANTEACTUALIZARCODIGOPCODIGO, ContratanteConstants.SERV_ALIAS_ACTUALIZARCODIGO, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_ACTUALIZARCODIGO_CONTRATANTEACTUALIZARCODIGOPCODIGO);
        }
    }
}
