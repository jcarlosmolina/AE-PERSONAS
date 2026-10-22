package com.keralty.aepersonas.viewmodel.respregional.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.RespRegional;
public class DSRespRegionalFirma {

    @JsonProperty("drvnombrecompleto")
    private String dSRespRegionalFirmaDrvNombreCompleto;

    @JsonProperty("firma_imagenfirma")
    private byte[] dSRespRegionalFirmaFirmaDotImagenFirma;

    public DSRespRegionalFirma() {
    
    }

    public DSRespRegionalFirma(RespRegional instance) {
        if (instance != null) {
            try {
                this.dSRespRegionalFirmaDrvNombreCompleto = instance.getFuncionariodrvNombreCompleto();
                this.dSRespRegionalFirmaFirmaDotImagenFirma = instance.getFirma().getFirmaImagenFirma();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getDSRespRegionalFirmaDrvNombreCompleto() {
        return this.dSRespRegionalFirmaDrvNombreCompleto;
    }
    
    public void setDSRespRegionalFirmaDrvNombreCompleto(String dSRespRegionalFirmaDrvNombreCompleto) {
        this.dSRespRegionalFirmaDrvNombreCompleto = dSRespRegionalFirmaDrvNombreCompleto;
    }

    @JsonIgnore
    public byte[] getDSRespRegionalFirmaFirmaDotImagenFirma() {
        return this.dSRespRegionalFirmaFirmaDotImagenFirma;
    }
    
    public void setDSRespRegionalFirmaFirmaDotImagenFirma(byte[] dSRespRegionalFirmaFirmaDotImagenFirma) {
        this.dSRespRegionalFirmaFirmaDotImagenFirma = dSRespRegionalFirmaFirmaDotImagenFirma;
    }
}
