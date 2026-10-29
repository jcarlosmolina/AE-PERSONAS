package com.keralty.aepersonas.viewmodel.asesor.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Asesor;
public class DSDirectoresObs {

    @JsonProperty("drvnombrecompleto")
    private String dSDirectoresObsDrvNombreCompleto;

    @JsonProperty("email")
    private String dSDirectoresObsEmail;

    @JsonProperty("sucursal_descripcion")
    private String dSDirectoresObsSucursalDotDescripcion;

    @JsonProperty("tipoidentificacion_nombrecorto")
    private String dSDirectoresObsTipoIdentificacionDotNombreCorto;

    @JsonProperty("numidentificacion")
    private String dSDirectoresObsNumIdentificacion;

    public DSDirectoresObs() {
    
    }

    public DSDirectoresObs(Asesor instance) {
        if (instance != null) {
            try {
                this.dSDirectoresObsDrvNombreCompleto = instance.getFuncionariodrvNombreCompleto();
                this.dSDirectoresObsEmail = instance.getFuncionarioEmail();
                this.dSDirectoresObsSucursalDotDescripcion = instance.getSucursal().getSucursalDescripcion();
                this.dSDirectoresObsTipoIdentificacionDotNombreCorto = instance.getTipoIdentificacion().getTipoIdentificacionNombreCorto();
                this.dSDirectoresObsNumIdentificacion = instance.getAsesorNumIdentificacion();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getDSDirectoresObsDrvNombreCompleto() {
        return this.dSDirectoresObsDrvNombreCompleto;
    }
    
    public void setDSDirectoresObsDrvNombreCompleto(String dSDirectoresObsDrvNombreCompleto) {
        this.dSDirectoresObsDrvNombreCompleto = dSDirectoresObsDrvNombreCompleto;
    }

    @JsonIgnore
    public String getDSDirectoresObsEmail() {
        return this.dSDirectoresObsEmail;
    }
    
    public void setDSDirectoresObsEmail(String dSDirectoresObsEmail) {
        this.dSDirectoresObsEmail = dSDirectoresObsEmail;
    }

    @JsonIgnore
    public String getDSDirectoresObsSucursalDotDescripcion() {
        return this.dSDirectoresObsSucursalDotDescripcion;
    }
    
    public void setDSDirectoresObsSucursalDotDescripcion(String dSDirectoresObsSucursalDotDescripcion) {
        this.dSDirectoresObsSucursalDotDescripcion = dSDirectoresObsSucursalDotDescripcion;
    }

    @JsonIgnore
    public String getDSDirectoresObsTipoIdentificacionDotNombreCorto() {
        return this.dSDirectoresObsTipoIdentificacionDotNombreCorto;
    }
    
    public void setDSDirectoresObsTipoIdentificacionDotNombreCorto(String dSDirectoresObsTipoIdentificacionDotNombreCorto) {
        this.dSDirectoresObsTipoIdentificacionDotNombreCorto = dSDirectoresObsTipoIdentificacionDotNombreCorto;
    }

    @JsonIgnore
    public String getDSDirectoresObsNumIdentificacion() {
        return this.dSDirectoresObsNumIdentificacion;
    }
    
    public void setDSDirectoresObsNumIdentificacion(String dSDirectoresObsNumIdentificacion) {
        this.dSDirectoresObsNumIdentificacion = dSDirectoresObsNumIdentificacion;
    }
}
