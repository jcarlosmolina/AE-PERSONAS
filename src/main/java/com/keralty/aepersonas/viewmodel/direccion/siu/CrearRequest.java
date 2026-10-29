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

public class CrearRequest {

    @JsonProperty("p_agrpersona_oid")
    private PersonaOid direccioncrearpagrPersona;
    
    @JsonIgnore
    private Persona direccioncrearpagrPersonaInstance;

    @JsonProperty("p_agrcontrato_oid")
    private SolicitudOid direccioncrearpagrContrato;
    
    @JsonIgnore
    private Solicitud direccioncrearpagrContratoInstance;

    @JsonProperty("p_agrtitular_oid")
    private TitularOid direccioncrearpagrTitular;
    
    @JsonIgnore
    private Titular direccioncrearpagrTitularInstance;

    @JsonProperty("p_agrtipodireccion_oid")
    private TipoDireccionOid direccioncrearpagrTipoDireccion;
    
    @JsonIgnore
    private TipoDireccion direccioncrearpagrTipoDireccionInstance;

    @JsonProperty("p_agrpais_oid")
    private PaisOid direccioncrearpagrPais;
    
    @JsonIgnore
    private Pais direccioncrearpagrPaisInstance;

    @JsonProperty("p_agrmunicipio_oid")
    private MunicipioOid direccioncrearpagrMunicipio;
    
    @JsonIgnore
    private Municipio direccioncrearpagrMunicipioInstance;

    @JsonProperty("p_agrdepartamento_oid")
    private DepartamentoOid direccioncrearpagrDepartamento;
    
    @JsonIgnore
    private Departamento direccioncrearpagrDepartamentoInstance;

    @JsonProperty("p_atrdireccioncompleta")
    private String direccioncrearpatrDireccionCompleta;

    @JsonProperty("p_atrrural")
    private Boolean direccioncrearpatrRural;

    @JsonIgnore
    public PersonaOid getDireccioncrearpagrPersona() {
        return this.direccioncrearpagrPersona;
    }
    
    public void setDireccioncrearpagrPersona(PersonaOid direccioncrearpagrPersona) {
        this.direccioncrearpagrPersona = direccioncrearpagrPersona;
    }

    @JsonIgnore
    public Persona getDireccioncrearpagrPersonaInstance() {
        return this.direccioncrearpagrPersonaInstance;
    }
    
    public void setDireccioncrearpagrPersonaInstance(Persona direccioncrearpagrPersona) {
        this.direccioncrearpagrPersonaInstance = direccioncrearpagrPersona;
        this.direccioncrearpagrPersona = direccioncrearpagrPersona != null ? direccioncrearpagrPersona.getOid() : null;
    }

    @JsonIgnore
    public SolicitudOid getDireccioncrearpagrContrato() {
        return this.direccioncrearpagrContrato;
    }
    
    public void setDireccioncrearpagrContrato(SolicitudOid direccioncrearpagrContrato) {
        this.direccioncrearpagrContrato = direccioncrearpagrContrato;
    }

    @JsonIgnore
    public Solicitud getDireccioncrearpagrContratoInstance() {
        return this.direccioncrearpagrContratoInstance;
    }
    
    public void setDireccioncrearpagrContratoInstance(Solicitud direccioncrearpagrContrato) {
        this.direccioncrearpagrContratoInstance = direccioncrearpagrContrato;
        this.direccioncrearpagrContrato = direccioncrearpagrContrato != null ? direccioncrearpagrContrato.getOid() : null;
    }

    @JsonIgnore
    public TitularOid getDireccioncrearpagrTitular() {
        return this.direccioncrearpagrTitular;
    }
    
    public void setDireccioncrearpagrTitular(TitularOid direccioncrearpagrTitular) {
        this.direccioncrearpagrTitular = direccioncrearpagrTitular;
    }

    @JsonIgnore
    public Titular getDireccioncrearpagrTitularInstance() {
        return this.direccioncrearpagrTitularInstance;
    }
    
    public void setDireccioncrearpagrTitularInstance(Titular direccioncrearpagrTitular) {
        this.direccioncrearpagrTitularInstance = direccioncrearpagrTitular;
        this.direccioncrearpagrTitular = direccioncrearpagrTitular != null ? direccioncrearpagrTitular.getOid() : null;
    }

    @JsonIgnore
    public TipoDireccionOid getDireccioncrearpagrTipoDireccion() {
        return this.direccioncrearpagrTipoDireccion;
    }
    
    public void setDireccioncrearpagrTipoDireccion(TipoDireccionOid direccioncrearpagrTipoDireccion) {
        this.direccioncrearpagrTipoDireccion = direccioncrearpagrTipoDireccion;
    }

    @JsonIgnore
    public TipoDireccion getDireccioncrearpagrTipoDireccionInstance() {
        return this.direccioncrearpagrTipoDireccionInstance;
    }
    
    public void setDireccioncrearpagrTipoDireccionInstance(TipoDireccion direccioncrearpagrTipoDireccion) {
        this.direccioncrearpagrTipoDireccionInstance = direccioncrearpagrTipoDireccion;
        this.direccioncrearpagrTipoDireccion = direccioncrearpagrTipoDireccion != null ? direccioncrearpagrTipoDireccion.getOid() : null;
    }

    @JsonIgnore
    public PaisOid getDireccioncrearpagrPais() {
        return this.direccioncrearpagrPais;
    }
    
    public void setDireccioncrearpagrPais(PaisOid direccioncrearpagrPais) {
        this.direccioncrearpagrPais = direccioncrearpagrPais;
    }

    @JsonIgnore
    public Pais getDireccioncrearpagrPaisInstance() {
        return this.direccioncrearpagrPaisInstance;
    }
    
    public void setDireccioncrearpagrPaisInstance(Pais direccioncrearpagrPais) {
        this.direccioncrearpagrPaisInstance = direccioncrearpagrPais;
        this.direccioncrearpagrPais = direccioncrearpagrPais != null ? direccioncrearpagrPais.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getDireccioncrearpagrMunicipio() {
        return this.direccioncrearpagrMunicipio;
    }
    
    public void setDireccioncrearpagrMunicipio(MunicipioOid direccioncrearpagrMunicipio) {
        this.direccioncrearpagrMunicipio = direccioncrearpagrMunicipio;
    }

    @JsonIgnore
    public Municipio getDireccioncrearpagrMunicipioInstance() {
        return this.direccioncrearpagrMunicipioInstance;
    }
    
    public void setDireccioncrearpagrMunicipioInstance(Municipio direccioncrearpagrMunicipio) {
        this.direccioncrearpagrMunicipioInstance = direccioncrearpagrMunicipio;
        this.direccioncrearpagrMunicipio = direccioncrearpagrMunicipio != null ? direccioncrearpagrMunicipio.getOid() : null;
    }

    @JsonIgnore
    public DepartamentoOid getDireccioncrearpagrDepartamento() {
        return this.direccioncrearpagrDepartamento;
    }
    
    public void setDireccioncrearpagrDepartamento(DepartamentoOid direccioncrearpagrDepartamento) {
        this.direccioncrearpagrDepartamento = direccioncrearpagrDepartamento;
    }

    @JsonIgnore
    public Departamento getDireccioncrearpagrDepartamentoInstance() {
        return this.direccioncrearpagrDepartamentoInstance;
    }
    
    public void setDireccioncrearpagrDepartamentoInstance(Departamento direccioncrearpagrDepartamento) {
        this.direccioncrearpagrDepartamentoInstance = direccioncrearpagrDepartamento;
        this.direccioncrearpagrDepartamento = direccioncrearpagrDepartamento != null ? direccioncrearpagrDepartamento.getOid() : null;
    }

    @JsonIgnore
    public String getDireccioncrearpatrDireccionCompleta() {
        return this.direccioncrearpatrDireccionCompleta;
    }
    
    public void setDireccioncrearpatrDireccionCompleta(String direccioncrearpatrDireccionCompleta) {
        this.direccioncrearpatrDireccionCompleta = direccioncrearpatrDireccionCompleta;
    }

    @JsonIgnore
    public Boolean getDireccioncrearpatrRural() {
        return this.direccioncrearpatrRural;
    }
    
    public void setDireccioncrearpatrRural(Boolean direccioncrearpatrRural) {
        this.direccioncrearpatrRural = direccioncrearpatrRural;
    }
}
