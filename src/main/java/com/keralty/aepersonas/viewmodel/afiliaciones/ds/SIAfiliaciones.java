package com.keralty.aepersonas.viewmodel.afiliaciones.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Afiliaciones;
public class SIAfiliaciones {

    @JsonProperty("usuarioldap")
    private String sIAfiliacionesUsuarioLDAP;

    public SIAfiliaciones() {
    
    }

    public SIAfiliaciones(Afiliaciones instance) {
        if (instance != null) {
            try {
                this.sIAfiliacionesUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getSIAfiliacionesUsuarioLDAP() {
        return this.sIAfiliacionesUsuarioLDAP;
    }
    
    public void setSIAfiliacionesUsuarioLDAP(String sIAfiliacionesUsuarioLDAP) {
        this.sIAfiliacionesUsuarioLDAP = sIAfiliacionesUsuarioLDAP;
    }
}
