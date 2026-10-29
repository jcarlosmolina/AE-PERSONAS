package com.keralty.aepersonas.viewmodel.solicitud.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Solicitud;
public class DSSolicitudIIUDifLiq {

    @JsonProperty("numradicado")
    private Long dSSolicitudIIUDifLiqNumRadicado;

    @JsonProperty("valorcuota")
    private Double dSSolicitudIIUDifLiqValorCuota;

    @JsonProperty("valorcuotabrutac")
    private Double dSSolicitudIIUDifLiqValorCuotaBrutaC;

    @JsonProperty("drvdifvalorcuotabruta")
    private Double dSSolicitudIIUDifLiqDrvDifValorCuotaBruta;

    public DSSolicitudIIUDifLiq() {
    
    }

    public DSSolicitudIIUDifLiq(Solicitud instance) {
        if (instance != null) {
            try {
                this.dSSolicitudIIUDifLiqNumRadicado = instance.getSolicitudNumRadicado();
                this.dSSolicitudIIUDifLiqValorCuota = instance.getSolicitudvalorCuota();
                this.dSSolicitudIIUDifLiqValorCuotaBrutaC = instance.getSolicitudvalorCuotaBrutaC();
                this.dSSolicitudIIUDifLiqDrvDifValorCuotaBruta = instance.getSolicituddrvDifValorCuotaBruta();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public Long getDSSolicitudIIUDifLiqNumRadicado() {
        return this.dSSolicitudIIUDifLiqNumRadicado;
    }
    
    public void setDSSolicitudIIUDifLiqNumRadicado(Long dSSolicitudIIUDifLiqNumRadicado) {
        this.dSSolicitudIIUDifLiqNumRadicado = dSSolicitudIIUDifLiqNumRadicado;
    }

    @JsonIgnore
    public Double getDSSolicitudIIUDifLiqValorCuota() {
        return this.dSSolicitudIIUDifLiqValorCuota;
    }
    
    public void setDSSolicitudIIUDifLiqValorCuota(Double dSSolicitudIIUDifLiqValorCuota) {
        this.dSSolicitudIIUDifLiqValorCuota = dSSolicitudIIUDifLiqValorCuota;
    }

    @JsonIgnore
    public Double getDSSolicitudIIUDifLiqValorCuotaBrutaC() {
        return this.dSSolicitudIIUDifLiqValorCuotaBrutaC;
    }
    
    public void setDSSolicitudIIUDifLiqValorCuotaBrutaC(Double dSSolicitudIIUDifLiqValorCuotaBrutaC) {
        this.dSSolicitudIIUDifLiqValorCuotaBrutaC = dSSolicitudIIUDifLiqValorCuotaBrutaC;
    }

    @JsonIgnore
    public Double getDSSolicitudIIUDifLiqDrvDifValorCuotaBruta() {
        return this.dSSolicitudIIUDifLiqDrvDifValorCuotaBruta;
    }
    
    public void setDSSolicitudIIUDifLiqDrvDifValorCuotaBruta(Double dSSolicitudIIUDifLiqDrvDifValorCuotaBruta) {
        this.dSSolicitudIIUDifLiqDrvDifValorCuotaBruta = dSSolicitudIIUDifLiqDrvDifValorCuotaBruta;
    }
}
