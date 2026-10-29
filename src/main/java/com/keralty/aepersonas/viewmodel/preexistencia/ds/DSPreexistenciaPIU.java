package com.keralty.aepersonas.viewmodel.preexistencia.ds;

import java.sql.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Preexistencia;
public class DSPreexistenciaPIU {

    @JsonProperty("usuario_drvnombrecompleto")
    private String dSPreexistenciaPIUUsuarioDotDrvNombreCompleto;

    @JsonProperty("usuario_drvidentificacion")
    private String dSPreexistenciaPIUUsuarioDotDrvIdentificacion;

    @JsonProperty("descripcion")
    private String dSPreexistenciaPIUDescripcion;

    @JsonProperty("fecinicio")
    private Date dSPreexistenciaPIUFecInicio;

    @JsonProperty("fecfin")
    private Date dSPreexistenciaPIUFecFin;

    public DSPreexistenciaPIU() {
    
    }

    public DSPreexistenciaPIU(Preexistencia instance) {
        if (instance != null) {
            try {
                this.dSPreexistenciaPIUUsuarioDotDrvNombreCompleto = instance.getUsuario().getUsuariodrvNombreCompleto();
                this.dSPreexistenciaPIUUsuarioDotDrvIdentificacion = instance.getUsuario().getUsuariodrvIdentificacion();
                this.dSPreexistenciaPIUDescripcion = instance.getPreexistenciaDescripcion();
                this.dSPreexistenciaPIUFecInicio = instance.getPreexistenciaFecInicio();
                this.dSPreexistenciaPIUFecFin = instance.getPreexistenciaFecFin();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getDSPreexistenciaPIUUsuarioDotDrvNombreCompleto() {
        return this.dSPreexistenciaPIUUsuarioDotDrvNombreCompleto;
    }
    
    public void setDSPreexistenciaPIUUsuarioDotDrvNombreCompleto(String dSPreexistenciaPIUUsuarioDotDrvNombreCompleto) {
        this.dSPreexistenciaPIUUsuarioDotDrvNombreCompleto = dSPreexistenciaPIUUsuarioDotDrvNombreCompleto;
    }

    @JsonIgnore
    public String getDSPreexistenciaPIUUsuarioDotDrvIdentificacion() {
        return this.dSPreexistenciaPIUUsuarioDotDrvIdentificacion;
    }
    
    public void setDSPreexistenciaPIUUsuarioDotDrvIdentificacion(String dSPreexistenciaPIUUsuarioDotDrvIdentificacion) {
        this.dSPreexistenciaPIUUsuarioDotDrvIdentificacion = dSPreexistenciaPIUUsuarioDotDrvIdentificacion;
    }

    @JsonIgnore
    public String getDSPreexistenciaPIUDescripcion() {
        return this.dSPreexistenciaPIUDescripcion;
    }
    
    public void setDSPreexistenciaPIUDescripcion(String dSPreexistenciaPIUDescripcion) {
        this.dSPreexistenciaPIUDescripcion = dSPreexistenciaPIUDescripcion;
    }

    @JsonIgnore
    public Date getDSPreexistenciaPIUFecInicio() {
        return this.dSPreexistenciaPIUFecInicio;
    }
    
    public void setDSPreexistenciaPIUFecInicio(Date dSPreexistenciaPIUFecInicio) {
        this.dSPreexistenciaPIUFecInicio = dSPreexistenciaPIUFecInicio;
    }

    @JsonIgnore
    public Date getDSPreexistenciaPIUFecFin() {
        return this.dSPreexistenciaPIUFecFin;
    }
    
    public void setDSPreexistenciaPIUFecFin(Date dSPreexistenciaPIUFecFin) {
        this.dSPreexistenciaPIUFecFin = dSPreexistenciaPIUFecFin;
    }
}
