package com.keralty.aepersonas.viewmodel.persona.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.viewmodel.FilterRequest;

public class FPersonaVarios {

    @JsonProperty("v_tipopersona")
    private String vTipoPersona;

    @JsonProperty("vo_tipoidentificacion")
    private TipoIdentificacionOid voTipoIdentificacion;

    @JsonProperty("v_razonsocial")
    private String vRazonSocial;

    @JsonProperty("v_primernombre")
    private String vPrimerNombre;

    @JsonProperty("v_primerapellido")
    private String vPrimerApellido;

    @JsonProperty("v_segundoapellido")
    private String vSegundoApellido;

    public FPersonaVarios() {
        // Default constructor
    }

    @JsonIgnore
    public String getVTipoPersona() {
        return this.vTipoPersona;
    }
    
    public void setVTipoPersona(String vTipoPersona) {
        this.vTipoPersona = vTipoPersona;
    }

    @JsonIgnore
    public TipoIdentificacionOid getVoTipoIdentificacion() {
        return this.voTipoIdentificacion;
    }
    
    public void setVoTipoIdentificacion(TipoIdentificacionOid voTipoIdentificacion) {
        this.voTipoIdentificacion = voTipoIdentificacion;
    }

    @JsonIgnore
    public String getVRazonSocial() {
        return this.vRazonSocial;
    }
    
    public void setVRazonSocial(String vRazonSocial) {
        this.vRazonSocial = vRazonSocial;
    }

    @JsonIgnore
    public String getVPrimerNombre() {
        return this.vPrimerNombre;
    }
    
    public void setVPrimerNombre(String vPrimerNombre) {
        this.vPrimerNombre = vPrimerNombre;
    }

    @JsonIgnore
    public String getVPrimerApellido() {
        return this.vPrimerApellido;
    }
    
    public void setVPrimerApellido(String vPrimerApellido) {
        this.vPrimerApellido = vPrimerApellido;
    }

    @JsonIgnore
    public String getVSegundoApellido() {
        return this.vSegundoApellido;
    }
    
    public void setVSegundoApellido(String vSegundoApellido) {
        this.vSegundoApellido = vSegundoApellido;
    }

    public FilterRequest buildFilterRequest() {
        FilterRequest filterRequest = new FilterRequest();
        filterRequest.setName(PersonaConstants.FILTER_NAME_FPERSONAVARIOS);
        filterRequest.addFilterVariable(PersonaConstants.VAR_NAME_FPERSONAVARIOS_VTIPOPERSONA, vTipoPersona);
        filterRequest.addFilterVariable(PersonaConstants.VAR_NAME_FPERSONAVARIOS_VOTIPOIDENTIFICACION, voTipoIdentificacion);
        filterRequest.addFilterVariable(PersonaConstants.VAR_NAME_FPERSONAVARIOS_VRAZONSOCIAL, vRazonSocial);
        filterRequest.addFilterVariable(PersonaConstants.VAR_NAME_FPERSONAVARIOS_VPRIMERNOMBRE, vPrimerNombre);
        filterRequest.addFilterVariable(PersonaConstants.VAR_NAME_FPERSONAVARIOS_VPRIMERAPELLIDO, vPrimerApellido);
        filterRequest.addFilterVariable(PersonaConstants.VAR_NAME_FPERSONAVARIOS_VSEGUNDOAPELLIDO, vSegundoApellido);
        return filterRequest;
    }
}
