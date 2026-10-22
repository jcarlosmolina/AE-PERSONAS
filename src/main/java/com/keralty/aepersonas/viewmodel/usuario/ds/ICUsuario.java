package com.keralty.aepersonas.viewmodel.usuario.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Usuario;
public class ICUsuario {

    @JsonProperty("tipoidentificacion_nombrecorto")
    private String iCUsuarioTipoIdentificacionDotNombreCorto;

    @JsonProperty("numidentificacion")
    private String iCUsuarioNumIdentificacion;

    public ICUsuario() {
    
    }

    public ICUsuario(Usuario instance) {
        if (instance != null) {
            try {
                this.iCUsuarioTipoIdentificacionDotNombreCorto = instance.getTipoIdentificacion().getTipoIdentificacionNombreCorto();
                this.iCUsuarioNumIdentificacion = instance.getUsuarioNumIdentificacion();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getICUsuarioTipoIdentificacionDotNombreCorto() {
        return this.iCUsuarioTipoIdentificacionDotNombreCorto;
    }
    
    public void setICUsuarioTipoIdentificacionDotNombreCorto(String iCUsuarioTipoIdentificacionDotNombreCorto) {
        this.iCUsuarioTipoIdentificacionDotNombreCorto = iCUsuarioTipoIdentificacionDotNombreCorto;
    }

    @JsonIgnore
    public String getICUsuarioNumIdentificacion() {
        return this.iCUsuarioNumIdentificacion;
    }
    
    public void setICUsuarioNumIdentificacion(String iCUsuarioNumIdentificacion) {
        this.iCUsuarioNumIdentificacion = iCUsuarioNumIdentificacion;
    }
}
