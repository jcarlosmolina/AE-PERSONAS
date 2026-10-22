package com.keralty.aepersonas.viewmodel.tipoidentificacion.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
public class ICTipoIdentificacion {

    @JsonProperty("nombrecorto")
    private String iCTipoIdentificacionNombreCorto;

    @JsonProperty("descripcion")
    private String iCTipoIdentificacionDescripcion;

    public ICTipoIdentificacion() {
    
    }

    public ICTipoIdentificacion(TipoIdentificacion instance) {
        if (instance != null) {
            this.iCTipoIdentificacionNombreCorto = instance.getTipoIdentificacionNombreCorto();
            this.iCTipoIdentificacionDescripcion = instance.getTipoIdentificacionDescripcion();
        }
    }

    @JsonIgnore
    public String getICTipoIdentificacionNombreCorto() {
        return this.iCTipoIdentificacionNombreCorto;
    }
    
    public void setICTipoIdentificacionNombreCorto(String iCTipoIdentificacionNombreCorto) {
        this.iCTipoIdentificacionNombreCorto = iCTipoIdentificacionNombreCorto;
    }

    @JsonIgnore
    public String getICTipoIdentificacionDescripcion() {
        return this.iCTipoIdentificacionDescripcion;
    }
    
    public void setICTipoIdentificacionDescripcion(String iCTipoIdentificacionDescripcion) {
        this.iCTipoIdentificacionDescripcion = iCTipoIdentificacionDescripcion;
    }
}
