package com.keralty.aepersonas.viewmodel.anexomat.ds;

import java.sql.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.AnexoMat;
public class AutoDS {

    @JsonProperty("identificador")
    private Long autoDSIdentificador;

    @JsonProperty("fechaultregla")
    private Date autoDSFechaUltRegla;

    @JsonProperty("numcuotas")
    private Long autoDSNumCuotas;

    @JsonProperty("drvvalor")
    private Double autoDSDrvValor;

    public AutoDS() {
    
    }

    public AutoDS(AnexoMat instance) {
        if (instance != null) {
            try {
                this.autoDSIdentificador = instance.getAnexoMatIdentificador();
                this.autoDSFechaUltRegla = instance.getAnexoMatFechaUltRegla();
                this.autoDSNumCuotas = instance.getAnexoMatNumCuotas();
                this.autoDSDrvValor = instance.getAnexoMatdrvValor();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public Long getAutoDSIdentificador() {
        return this.autoDSIdentificador;
    }
    
    public void setAutoDSIdentificador(Long autoDSIdentificador) {
        this.autoDSIdentificador = autoDSIdentificador;
    }

    @JsonIgnore
    public Date getAutoDSFechaUltRegla() {
        return this.autoDSFechaUltRegla;
    }
    
    public void setAutoDSFechaUltRegla(Date autoDSFechaUltRegla) {
        this.autoDSFechaUltRegla = autoDSFechaUltRegla;
    }

    @JsonIgnore
    public Long getAutoDSNumCuotas() {
        return this.autoDSNumCuotas;
    }
    
    public void setAutoDSNumCuotas(Long autoDSNumCuotas) {
        this.autoDSNumCuotas = autoDSNumCuotas;
    }

    @JsonIgnore
    public Double getAutoDSDrvValor() {
        return this.autoDSDrvValor;
    }
    
    public void setAutoDSDrvValor(Double autoDSDrvValor) {
        this.autoDSDrvValor = autoDSDrvValor;
    }
}
