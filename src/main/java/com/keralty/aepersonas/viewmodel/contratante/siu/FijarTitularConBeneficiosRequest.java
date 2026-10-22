package com.keralty.aepersonas.viewmodel.contratante.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.ContratanteConstants;
import com.keralty.aepersonas.persistence.Contratante;
import com.keralty.aepersonas.persistence.oid.ContratanteOid;

public class FijarTitularConBeneficiosRequest {

    @JsonProperty("p_thiscontratante_oid")
    private ContratanteOid contratantefijarTitularConBeneficiospthisContratante;
    
    @JsonIgnore
    private Contratante contratantefijarTitularConBeneficiospthisContratanteInstance;

    @JsonProperty("p_titularconbeneficios")
    private Boolean contratantefijarTitularConBeneficiospTitularConBeneficios;

    public void checkArguments() throws NotNullArgumentException {
        checkContratantefijarTitularConBeneficiospthisContratante();
        checkContratantefijarTitularConBeneficiospTitularConBeneficios();
    }

    @JsonIgnore
    public ContratanteOid getContratantefijarTitularConBeneficiospthisContratante() {
        return this.contratantefijarTitularConBeneficiospthisContratante;
    }
    
    public void setContratantefijarTitularConBeneficiospthisContratante(ContratanteOid contratantefijarTitularConBeneficiospthisContratante) {
        this.contratantefijarTitularConBeneficiospthisContratante = contratantefijarTitularConBeneficiospthisContratante;
    }

    @JsonIgnore
    public Contratante getContratantefijarTitularConBeneficiospthisContratanteInstance() {
        return this.contratantefijarTitularConBeneficiospthisContratanteInstance;
    }
    
    public void setContratantefijarTitularConBeneficiospthisContratanteInstance(Contratante contratantefijarTitularConBeneficiospthisContratante) {
        this.contratantefijarTitularConBeneficiospthisContratanteInstance = contratantefijarTitularConBeneficiospthisContratante;
        this.contratantefijarTitularConBeneficiospthisContratante = contratantefijarTitularConBeneficiospthisContratante != null ? contratantefijarTitularConBeneficiospthisContratante.getOid() : null;
    }

    private void checkContratantefijarTitularConBeneficiospthisContratante() throws NotNullArgumentException {
        if(this.getContratantefijarTitularConBeneficiospthisContratanteInstance() == null || this.getContratantefijarTitularConBeneficiospthisContratanteInstance().isNull()) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_FIJARTITULARCONBENEFICIOS, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_FIJARTITULARCONBENEFICIOS_CONTRATANTEFIJARTITULARCONBENEFICIOSPTHISCONTRATANTE, ContratanteConstants.SERV_ALIAS_FIJARTITULARCONBENEFICIOS, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_FIJARTITULARCONBENEFICIOS_CONTRATANTEFIJARTITULARCONBENEFICIOSPTHISCONTRATANTE);
        }
    }

    @JsonIgnore
    public Boolean getContratantefijarTitularConBeneficiospTitularConBeneficios() {
        return this.contratantefijarTitularConBeneficiospTitularConBeneficios;
    }
    
    public void setContratantefijarTitularConBeneficiospTitularConBeneficios(Boolean contratantefijarTitularConBeneficiospTitularConBeneficios) {
        this.contratantefijarTitularConBeneficiospTitularConBeneficios = contratantefijarTitularConBeneficiospTitularConBeneficios;
    }

    private void checkContratantefijarTitularConBeneficiospTitularConBeneficios() throws NotNullArgumentException {
        if(this.getContratantefijarTitularConBeneficiospTitularConBeneficios() == null) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_FIJARTITULARCONBENEFICIOS, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_FIJARTITULARCONBENEFICIOS_CONTRATANTEFIJARTITULARCONBENEFICIOSPTITULARCONBENEFICIOS, ContratanteConstants.SERV_ALIAS_FIJARTITULARCONBENEFICIOS, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_FIJARTITULARCONBENEFICIOS_CONTRATANTEFIJARTITULARCONBENEFICIOSPTITULARCONBENEFICIOS);
        }
    }
}
