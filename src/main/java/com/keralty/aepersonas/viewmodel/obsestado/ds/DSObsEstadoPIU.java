package com.keralty.aepersonas.viewmodel.obsestado.ds;

import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.ObsEstado;
public class DSObsEstadoPIU {

    @JsonProperty("fecha")
    private Timestamp dSObsEstadoPIUFecha;

    @JsonProperty("estadoanterior")
    private Long dSObsEstadoPIUEstadoAnterior;

    @JsonProperty("estadonuevo")
    private Long dSObsEstadoPIUEstadoNuevo;

    @JsonProperty("agente_drvnombrecompleto")
    private String dSObsEstadoPIUAgenteDotDrvNombreCompleto;

    @JsonProperty("observacions")
    private String dSObsEstadoPIUObservacions;

    public DSObsEstadoPIU() {
    
    }

    public DSObsEstadoPIU(ObsEstado instance) {
        if (instance != null) {
            try {
                this.dSObsEstadoPIUFecha = instance.getObsEstadoFecha();
                this.dSObsEstadoPIUEstadoAnterior = instance.getObsEstadoEstadoAnterior();
                this.dSObsEstadoPIUEstadoNuevo = instance.getObsEstadoEstadoNuevo();
                this.dSObsEstadoPIUAgenteDotDrvNombreCompleto = instance.getAgente().getFuncionariodrvNombreCompleto();
                this.dSObsEstadoPIUObservacions = instance.getObsEstadoObservacions();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public Timestamp getDSObsEstadoPIUFecha() {
        return this.dSObsEstadoPIUFecha;
    }
    
    public void setDSObsEstadoPIUFecha(Timestamp dSObsEstadoPIUFecha) {
        this.dSObsEstadoPIUFecha = dSObsEstadoPIUFecha;
    }

    @JsonIgnore
    public Long getDSObsEstadoPIUEstadoAnterior() {
        return this.dSObsEstadoPIUEstadoAnterior;
    }
    
    public void setDSObsEstadoPIUEstadoAnterior(Long dSObsEstadoPIUEstadoAnterior) {
        this.dSObsEstadoPIUEstadoAnterior = dSObsEstadoPIUEstadoAnterior;
    }

    @JsonIgnore
    public Long getDSObsEstadoPIUEstadoNuevo() {
        return this.dSObsEstadoPIUEstadoNuevo;
    }
    
    public void setDSObsEstadoPIUEstadoNuevo(Long dSObsEstadoPIUEstadoNuevo) {
        this.dSObsEstadoPIUEstadoNuevo = dSObsEstadoPIUEstadoNuevo;
    }

    @JsonIgnore
    public String getDSObsEstadoPIUAgenteDotDrvNombreCompleto() {
        return this.dSObsEstadoPIUAgenteDotDrvNombreCompleto;
    }
    
    public void setDSObsEstadoPIUAgenteDotDrvNombreCompleto(String dSObsEstadoPIUAgenteDotDrvNombreCompleto) {
        this.dSObsEstadoPIUAgenteDotDrvNombreCompleto = dSObsEstadoPIUAgenteDotDrvNombreCompleto;
    }

    @JsonIgnore
    public String getDSObsEstadoPIUObservacions() {
        return this.dSObsEstadoPIUObservacions;
    }
    
    public void setDSObsEstadoPIUObservacions(String dSObsEstadoPIUObservacions) {
        this.dSObsEstadoPIUObservacions = dSObsEstadoPIUObservacions;
    }
}
