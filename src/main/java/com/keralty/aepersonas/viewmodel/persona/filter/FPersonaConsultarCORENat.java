package com.keralty.aepersonas.viewmodel.persona.filter;

import java.sql.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.viewmodel.FilterRequest;

public class FPersonaConsultarCORENat {

    @JsonProperty("vo_tipoidentificacion")
    private TipoIdentificacionOid voTipoIdentificacion;

    @JsonProperty("v_numidentificacion")
    private String vNumIdentificacion;

    @JsonProperty("v_primernombre")
    private String vPrimerNombre;

    @JsonProperty("v_segundonombre")
    private String vSegundoNombre;

    @JsonProperty("v_primerape")
    private String vPrimerApe;

    @JsonProperty("v_segundoape")
    private String vSegundoApe;

    @JsonProperty("v_fechanacimiento")
    private Date vFechaNacimiento;

    public FPersonaConsultarCORENat() {
        // Default constructor
    }

    @JsonIgnore
    public TipoIdentificacionOid getVoTipoIdentificacion() {
        return this.voTipoIdentificacion;
    }
    
    public void setVoTipoIdentificacion(TipoIdentificacionOid voTipoIdentificacion) {
        this.voTipoIdentificacion = voTipoIdentificacion;
    }

    @JsonIgnore
    public String getVNumIdentificacion() {
        return this.vNumIdentificacion;
    }
    
    public void setVNumIdentificacion(String vNumIdentificacion) {
        this.vNumIdentificacion = vNumIdentificacion;
    }

    @JsonIgnore
    public String getVPrimerNombre() {
        return this.vPrimerNombre;
    }
    
    public void setVPrimerNombre(String vPrimerNombre) {
        this.vPrimerNombre = vPrimerNombre;
    }

    @JsonIgnore
    public String getVSegundoNombre() {
        return this.vSegundoNombre;
    }
    
    public void setVSegundoNombre(String vSegundoNombre) {
        this.vSegundoNombre = vSegundoNombre;
    }

    @JsonIgnore
    public String getVPrimerApe() {
        return this.vPrimerApe;
    }
    
    public void setVPrimerApe(String vPrimerApe) {
        this.vPrimerApe = vPrimerApe;
    }

    @JsonIgnore
    public String getVSegundoApe() {
        return this.vSegundoApe;
    }
    
    public void setVSegundoApe(String vSegundoApe) {
        this.vSegundoApe = vSegundoApe;
    }

    @JsonIgnore
    public Date getVFechaNacimiento() {
        return this.vFechaNacimiento;
    }
    
    public void setVFechaNacimiento(Date vFechaNacimiento) {
        this.vFechaNacimiento = vFechaNacimiento;
    }

    public FilterRequest buildFilterRequest() {
        FilterRequest filterRequest = new FilterRequest();
        filterRequest.setName(PersonaConstants.FILTER_NAME_FPERSONACONSULTARCORENAT);
        filterRequest.addFilterVariable(PersonaConstants.VAR_NAME_FPERSONACONSULTARCORENAT_VOTIPOIDENTIFICACION, voTipoIdentificacion);
        filterRequest.addFilterVariable(PersonaConstants.VAR_NAME_FPERSONACONSULTARCORENAT_VNUMIDENTIFICACION, vNumIdentificacion);
        filterRequest.addFilterVariable(PersonaConstants.VAR_NAME_FPERSONACONSULTARCORENAT_VPRIMERNOMBRE, vPrimerNombre);
        filterRequest.addFilterVariable(PersonaConstants.VAR_NAME_FPERSONACONSULTARCORENAT_VSEGUNDONOMBRE, vSegundoNombre);
        filterRequest.addFilterVariable(PersonaConstants.VAR_NAME_FPERSONACONSULTARCORENAT_VPRIMERAPE, vPrimerApe);
        filterRequest.addFilterVariable(PersonaConstants.VAR_NAME_FPERSONACONSULTARCORENAT_VSEGUNDOAPE, vSegundoApe);
        filterRequest.addFilterVariable(PersonaConstants.VAR_NAME_FPERSONACONSULTARCORENAT_VFECHANACIMIENTO, vFechaNacimiento);
        return filterRequest;
    }
}
