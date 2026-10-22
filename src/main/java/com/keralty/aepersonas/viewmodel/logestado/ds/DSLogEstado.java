package com.keralty.aepersonas.viewmodel.logestado.ds;

import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.LogEstado;
public class DSLogEstado {

    @JsonProperty("loginfuncionario")
    private String dSLogEstadoLoginFuncionario;

    @JsonProperty("fecha")
    private Timestamp dSLogEstadoFecha;

    @JsonProperty("estado")
    private Long dSLogEstadoEstado;

    @JsonProperty("estadodoc")
    private Long dSLogEstadoEstadoDoc;

    @JsonProperty("observacion")
    private String dSLogEstadoObservacion;

    @JsonProperty("motdevolucion")
    private String dSLogEstadoMotDevolucion;

    public DSLogEstado() {
    
    }

    public DSLogEstado(LogEstado instance) {
        if (instance != null) {
            this.dSLogEstadoLoginFuncionario = instance.getLogEstadoLoginFuncionario();
            this.dSLogEstadoFecha = instance.getLogEstadoFecha();
            this.dSLogEstadoEstado = instance.getLogEstadoEstado();
            this.dSLogEstadoEstadoDoc = instance.getLogEstadoEstadoDoc();
            this.dSLogEstadoObservacion = instance.getLogEstadoObservacion();
            this.dSLogEstadoMotDevolucion = instance.getLogEstadoMotDevolucion();
        }
    }

    @JsonIgnore
    public String getDSLogEstadoLoginFuncionario() {
        return this.dSLogEstadoLoginFuncionario;
    }
    
    public void setDSLogEstadoLoginFuncionario(String dSLogEstadoLoginFuncionario) {
        this.dSLogEstadoLoginFuncionario = dSLogEstadoLoginFuncionario;
    }

    @JsonIgnore
    public Timestamp getDSLogEstadoFecha() {
        return this.dSLogEstadoFecha;
    }
    
    public void setDSLogEstadoFecha(Timestamp dSLogEstadoFecha) {
        this.dSLogEstadoFecha = dSLogEstadoFecha;
    }

    @JsonIgnore
    public Long getDSLogEstadoEstado() {
        return this.dSLogEstadoEstado;
    }
    
    public void setDSLogEstadoEstado(Long dSLogEstadoEstado) {
        this.dSLogEstadoEstado = dSLogEstadoEstado;
    }

    @JsonIgnore
    public Long getDSLogEstadoEstadoDoc() {
        return this.dSLogEstadoEstadoDoc;
    }
    
    public void setDSLogEstadoEstadoDoc(Long dSLogEstadoEstadoDoc) {
        this.dSLogEstadoEstadoDoc = dSLogEstadoEstadoDoc;
    }

    @JsonIgnore
    public String getDSLogEstadoObservacion() {
        return this.dSLogEstadoObservacion;
    }
    
    public void setDSLogEstadoObservacion(String dSLogEstadoObservacion) {
        this.dSLogEstadoObservacion = dSLogEstadoObservacion;
    }

    @JsonIgnore
    public String getDSLogEstadoMotDevolucion() {
        return this.dSLogEstadoMotDevolucion;
    }
    
    public void setDSLogEstadoMotDevolucion(String dSLogEstadoMotDevolucion) {
        this.dSLogEstadoMotDevolucion = dSLogEstadoMotDevolucion;
    }
}
