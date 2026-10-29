package com.keralty.aepersonas.viewmodel.direccion.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;
import com.keralty.aepersonas.persistence.oid.PaisOid;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.oid.SolicitudOid;
import com.keralty.aepersonas.persistence.oid.TipoDireccionOid;
import com.keralty.aepersonas.persistence.oid.TitularOid;
import com.keralty.aepersonas.persistence.Pais;
import com.keralty.aepersonas.persistence.Persona;
import com.keralty.aepersonas.persistence.Solicitud;
import com.keralty.aepersonas.persistence.TipoDireccion;
import com.keralty.aepersonas.persistence.Titular;

public class TCREARRequest {

    @JsonProperty("pt_p_agrpersona_oid")
    private PersonaOid direccionTCREARptpagrPersona;
    
    @JsonIgnore
    private Persona direccionTCREARptpagrPersonaInstance;

    @JsonProperty("pt_p_agrcontrato_oid")
    private SolicitudOid direccionTCREARptpagrContrato;
    
    @JsonIgnore
    private Solicitud direccionTCREARptpagrContratoInstance;

    @JsonProperty("pt_p_agrtitular_oid")
    private TitularOid direccionTCREARptpagrTitular;
    
    @JsonIgnore
    private Titular direccionTCREARptpagrTitularInstance;

    @JsonProperty("pt_p_agrtipodireccion_oid")
    private TipoDireccionOid direccionTCREARptpagrTipoDireccion;
    
    @JsonIgnore
    private TipoDireccion direccionTCREARptpagrTipoDireccionInstance;

    @JsonProperty("pt_p_agrmunicipio_oid")
    private MunicipioOid direccionTCREARptpagrMunicipio;
    
    @JsonIgnore
    private Municipio direccionTCREARptpagrMunicipioInstance;

    @JsonProperty("pt_p_agrdepartamento_oid")
    private DepartamentoOid direccionTCREARptpagrDepartamento;
    
    @JsonIgnore
    private Departamento direccionTCREARptpagrDepartamentoInstance;

    @JsonProperty("pt_p_agrpais_oid")
    private PaisOid direccionTCREARptpagrPais;
    
    @JsonIgnore
    private Pais direccionTCREARptpagrPaisInstance;

    @JsonProperty("pt_p_atrdireccioncompleta")
    private String direccionTCREARptpatrDireccionCompleta;

    @JsonProperty("pt_p_atrrural")
    private Boolean direccionTCREARptpatrRural;

    @JsonIgnore
    public PersonaOid getDireccionTCREARptpagrPersona() {
        return this.direccionTCREARptpagrPersona;
    }
    
    public void setDireccionTCREARptpagrPersona(PersonaOid direccionTCREARptpagrPersona) {
        this.direccionTCREARptpagrPersona = direccionTCREARptpagrPersona;
    }

    @JsonIgnore
    public Persona getDireccionTCREARptpagrPersonaInstance() {
        return this.direccionTCREARptpagrPersonaInstance;
    }
    
    public void setDireccionTCREARptpagrPersonaInstance(Persona direccionTCREARptpagrPersona) {
        this.direccionTCREARptpagrPersonaInstance = direccionTCREARptpagrPersona;
        this.direccionTCREARptpagrPersona = direccionTCREARptpagrPersona != null ? direccionTCREARptpagrPersona.getOid() : null;
    }

    @JsonIgnore
    public SolicitudOid getDireccionTCREARptpagrContrato() {
        return this.direccionTCREARptpagrContrato;
    }
    
    public void setDireccionTCREARptpagrContrato(SolicitudOid direccionTCREARptpagrContrato) {
        this.direccionTCREARptpagrContrato = direccionTCREARptpagrContrato;
    }

    @JsonIgnore
    public Solicitud getDireccionTCREARptpagrContratoInstance() {
        return this.direccionTCREARptpagrContratoInstance;
    }
    
    public void setDireccionTCREARptpagrContratoInstance(Solicitud direccionTCREARptpagrContrato) {
        this.direccionTCREARptpagrContratoInstance = direccionTCREARptpagrContrato;
        this.direccionTCREARptpagrContrato = direccionTCREARptpagrContrato != null ? direccionTCREARptpagrContrato.getOid() : null;
    }

    @JsonIgnore
    public TitularOid getDireccionTCREARptpagrTitular() {
        return this.direccionTCREARptpagrTitular;
    }
    
    public void setDireccionTCREARptpagrTitular(TitularOid direccionTCREARptpagrTitular) {
        this.direccionTCREARptpagrTitular = direccionTCREARptpagrTitular;
    }

    @JsonIgnore
    public Titular getDireccionTCREARptpagrTitularInstance() {
        return this.direccionTCREARptpagrTitularInstance;
    }
    
    public void setDireccionTCREARptpagrTitularInstance(Titular direccionTCREARptpagrTitular) {
        this.direccionTCREARptpagrTitularInstance = direccionTCREARptpagrTitular;
        this.direccionTCREARptpagrTitular = direccionTCREARptpagrTitular != null ? direccionTCREARptpagrTitular.getOid() : null;
    }

    @JsonIgnore
    public TipoDireccionOid getDireccionTCREARptpagrTipoDireccion() {
        return this.direccionTCREARptpagrTipoDireccion;
    }
    
    public void setDireccionTCREARptpagrTipoDireccion(TipoDireccionOid direccionTCREARptpagrTipoDireccion) {
        this.direccionTCREARptpagrTipoDireccion = direccionTCREARptpagrTipoDireccion;
    }

    @JsonIgnore
    public TipoDireccion getDireccionTCREARptpagrTipoDireccionInstance() {
        return this.direccionTCREARptpagrTipoDireccionInstance;
    }
    
    public void setDireccionTCREARptpagrTipoDireccionInstance(TipoDireccion direccionTCREARptpagrTipoDireccion) {
        this.direccionTCREARptpagrTipoDireccionInstance = direccionTCREARptpagrTipoDireccion;
        this.direccionTCREARptpagrTipoDireccion = direccionTCREARptpagrTipoDireccion != null ? direccionTCREARptpagrTipoDireccion.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getDireccionTCREARptpagrMunicipio() {
        return this.direccionTCREARptpagrMunicipio;
    }
    
    public void setDireccionTCREARptpagrMunicipio(MunicipioOid direccionTCREARptpagrMunicipio) {
        this.direccionTCREARptpagrMunicipio = direccionTCREARptpagrMunicipio;
    }

    @JsonIgnore
    public Municipio getDireccionTCREARptpagrMunicipioInstance() {
        return this.direccionTCREARptpagrMunicipioInstance;
    }
    
    public void setDireccionTCREARptpagrMunicipioInstance(Municipio direccionTCREARptpagrMunicipio) {
        this.direccionTCREARptpagrMunicipioInstance = direccionTCREARptpagrMunicipio;
        this.direccionTCREARptpagrMunicipio = direccionTCREARptpagrMunicipio != null ? direccionTCREARptpagrMunicipio.getOid() : null;
    }

    @JsonIgnore
    public DepartamentoOid getDireccionTCREARptpagrDepartamento() {
        return this.direccionTCREARptpagrDepartamento;
    }
    
    public void setDireccionTCREARptpagrDepartamento(DepartamentoOid direccionTCREARptpagrDepartamento) {
        this.direccionTCREARptpagrDepartamento = direccionTCREARptpagrDepartamento;
    }

    @JsonIgnore
    public Departamento getDireccionTCREARptpagrDepartamentoInstance() {
        return this.direccionTCREARptpagrDepartamentoInstance;
    }
    
    public void setDireccionTCREARptpagrDepartamentoInstance(Departamento direccionTCREARptpagrDepartamento) {
        this.direccionTCREARptpagrDepartamentoInstance = direccionTCREARptpagrDepartamento;
        this.direccionTCREARptpagrDepartamento = direccionTCREARptpagrDepartamento != null ? direccionTCREARptpagrDepartamento.getOid() : null;
    }

    @JsonIgnore
    public PaisOid getDireccionTCREARptpagrPais() {
        return this.direccionTCREARptpagrPais;
    }
    
    public void setDireccionTCREARptpagrPais(PaisOid direccionTCREARptpagrPais) {
        this.direccionTCREARptpagrPais = direccionTCREARptpagrPais;
    }

    @JsonIgnore
    public Pais getDireccionTCREARptpagrPaisInstance() {
        return this.direccionTCREARptpagrPaisInstance;
    }
    
    public void setDireccionTCREARptpagrPaisInstance(Pais direccionTCREARptpagrPais) {
        this.direccionTCREARptpagrPaisInstance = direccionTCREARptpagrPais;
        this.direccionTCREARptpagrPais = direccionTCREARptpagrPais != null ? direccionTCREARptpagrPais.getOid() : null;
    }

    @JsonIgnore
    public String getDireccionTCREARptpatrDireccionCompleta() {
        return this.direccionTCREARptpatrDireccionCompleta;
    }
    
    public void setDireccionTCREARptpatrDireccionCompleta(String direccionTCREARptpatrDireccionCompleta) {
        this.direccionTCREARptpatrDireccionCompleta = direccionTCREARptpatrDireccionCompleta;
    }

    @JsonIgnore
    public Boolean getDireccionTCREARptpatrRural() {
        return this.direccionTCREARptpatrRural;
    }
    
    public void setDireccionTCREARptpatrRural(Boolean direccionTCREARptpatrRural) {
        this.direccionTCREARptpatrRural = direccionTCREARptpatrRural;
    }
}
