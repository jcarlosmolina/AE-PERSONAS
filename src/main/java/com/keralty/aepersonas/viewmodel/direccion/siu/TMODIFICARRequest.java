package com.keralty.aepersonas.viewmodel.direccion.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.DireccionConstants;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.persistence.oid.DireccionOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;
import com.keralty.aepersonas.persistence.oid.PaisOid;
import com.keralty.aepersonas.persistence.oid.TipoDireccionOid;
import com.keralty.aepersonas.persistence.Pais;
import com.keralty.aepersonas.persistence.TipoDireccion;

public class TMODIFICARRequest {

    @JsonProperty("p_thisdireccion_oid")
    private DireccionOid direccionTMODIFICARpthisDireccion;
    
    @JsonIgnore
    private Direccion direccionTMODIFICARpthisDireccionInstance;

    @JsonProperty("pt_p_direccioncompleta")
    private String direccionTMODIFICARptpDireccionCompleta;

    @JsonProperty("pt_p_rural")
    private Boolean direccionTMODIFICARptpRural;

    @JsonProperty("pt_p_evcdepartamento_oid")
    private DepartamentoOid direccionTMODIFICARptpevcDepartamento;
    
    @JsonIgnore
    private Departamento direccionTMODIFICARptpevcDepartamentoInstance;

    @JsonProperty("pt_p_evcmunicipio_oid")
    private MunicipioOid direccionTMODIFICARptpevcMunicipio;
    
    @JsonIgnore
    private Municipio direccionTMODIFICARptpevcMunicipioInstance;

    @JsonProperty("pt_p_evcpais_oid")
    private PaisOid direccionTMODIFICARptpevcPais;
    
    @JsonIgnore
    private Pais direccionTMODIFICARptpevcPaisInstance;

    @JsonProperty("pt_p_evctipodireccion_oid")
    private TipoDireccionOid direccionTMODIFICARptpevcTipoDireccion;
    
    @JsonIgnore
    private TipoDireccion direccionTMODIFICARptpevcTipoDireccionInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkDireccionTMODIFICARpthisDireccion();
    }

    @JsonIgnore
    public DireccionOid getDireccionTMODIFICARpthisDireccion() {
        return this.direccionTMODIFICARpthisDireccion;
    }
    
    public void setDireccionTMODIFICARpthisDireccion(DireccionOid direccionTMODIFICARpthisDireccion) {
        this.direccionTMODIFICARpthisDireccion = direccionTMODIFICARpthisDireccion;
    }

    @JsonIgnore
    public Direccion getDireccionTMODIFICARpthisDireccionInstance() {
        return this.direccionTMODIFICARpthisDireccionInstance;
    }
    
    public void setDireccionTMODIFICARpthisDireccionInstance(Direccion direccionTMODIFICARpthisDireccion) {
        this.direccionTMODIFICARpthisDireccionInstance = direccionTMODIFICARpthisDireccion;
        this.direccionTMODIFICARpthisDireccion = direccionTMODIFICARpthisDireccion != null ? direccionTMODIFICARpthisDireccion.getOid() : null;
    }

    private void checkDireccionTMODIFICARpthisDireccion() throws NotNullArgumentException {
        if(this.getDireccionTMODIFICARpthisDireccionInstance() == null || this.getDireccionTMODIFICARpthisDireccionInstance().isNull()) {
            throw new NotNullArgumentException(DireccionConstants.SERV_ID_TMODIFICAR, DireccionConstants.CLASS_ID, DireccionConstants.ARG_ID_TMODIFICAR_DIRECCIONTMODIFICARPTHISDIRECCION, DireccionConstants.SERV_ALIAS_TMODIFICAR, DireccionConstants.CLASS_ALIAS, DireccionConstants.ARG_ALIAS_TMODIFICAR_DIRECCIONTMODIFICARPTHISDIRECCION);
        }
    }

    @JsonIgnore
    public String getDireccionTMODIFICARptpDireccionCompleta() {
        return this.direccionTMODIFICARptpDireccionCompleta;
    }
    
    public void setDireccionTMODIFICARptpDireccionCompleta(String direccionTMODIFICARptpDireccionCompleta) {
        this.direccionTMODIFICARptpDireccionCompleta = direccionTMODIFICARptpDireccionCompleta;
    }

    @JsonIgnore
    public Boolean getDireccionTMODIFICARptpRural() {
        return this.direccionTMODIFICARptpRural;
    }
    
    public void setDireccionTMODIFICARptpRural(Boolean direccionTMODIFICARptpRural) {
        this.direccionTMODIFICARptpRural = direccionTMODIFICARptpRural;
    }

    @JsonIgnore
    public DepartamentoOid getDireccionTMODIFICARptpevcDepartamento() {
        return this.direccionTMODIFICARptpevcDepartamento;
    }
    
    public void setDireccionTMODIFICARptpevcDepartamento(DepartamentoOid direccionTMODIFICARptpevcDepartamento) {
        this.direccionTMODIFICARptpevcDepartamento = direccionTMODIFICARptpevcDepartamento;
    }

    @JsonIgnore
    public Departamento getDireccionTMODIFICARptpevcDepartamentoInstance() {
        return this.direccionTMODIFICARptpevcDepartamentoInstance;
    }
    
    public void setDireccionTMODIFICARptpevcDepartamentoInstance(Departamento direccionTMODIFICARptpevcDepartamento) {
        this.direccionTMODIFICARptpevcDepartamentoInstance = direccionTMODIFICARptpevcDepartamento;
        this.direccionTMODIFICARptpevcDepartamento = direccionTMODIFICARptpevcDepartamento != null ? direccionTMODIFICARptpevcDepartamento.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getDireccionTMODIFICARptpevcMunicipio() {
        return this.direccionTMODIFICARptpevcMunicipio;
    }
    
    public void setDireccionTMODIFICARptpevcMunicipio(MunicipioOid direccionTMODIFICARptpevcMunicipio) {
        this.direccionTMODIFICARptpevcMunicipio = direccionTMODIFICARptpevcMunicipio;
    }

    @JsonIgnore
    public Municipio getDireccionTMODIFICARptpevcMunicipioInstance() {
        return this.direccionTMODIFICARptpevcMunicipioInstance;
    }
    
    public void setDireccionTMODIFICARptpevcMunicipioInstance(Municipio direccionTMODIFICARptpevcMunicipio) {
        this.direccionTMODIFICARptpevcMunicipioInstance = direccionTMODIFICARptpevcMunicipio;
        this.direccionTMODIFICARptpevcMunicipio = direccionTMODIFICARptpevcMunicipio != null ? direccionTMODIFICARptpevcMunicipio.getOid() : null;
    }

    @JsonIgnore
    public PaisOid getDireccionTMODIFICARptpevcPais() {
        return this.direccionTMODIFICARptpevcPais;
    }
    
    public void setDireccionTMODIFICARptpevcPais(PaisOid direccionTMODIFICARptpevcPais) {
        this.direccionTMODIFICARptpevcPais = direccionTMODIFICARptpevcPais;
    }

    @JsonIgnore
    public Pais getDireccionTMODIFICARptpevcPaisInstance() {
        return this.direccionTMODIFICARptpevcPaisInstance;
    }
    
    public void setDireccionTMODIFICARptpevcPaisInstance(Pais direccionTMODIFICARptpevcPais) {
        this.direccionTMODIFICARptpevcPaisInstance = direccionTMODIFICARptpevcPais;
        this.direccionTMODIFICARptpevcPais = direccionTMODIFICARptpevcPais != null ? direccionTMODIFICARptpevcPais.getOid() : null;
    }

    @JsonIgnore
    public TipoDireccionOid getDireccionTMODIFICARptpevcTipoDireccion() {
        return this.direccionTMODIFICARptpevcTipoDireccion;
    }
    
    public void setDireccionTMODIFICARptpevcTipoDireccion(TipoDireccionOid direccionTMODIFICARptpevcTipoDireccion) {
        this.direccionTMODIFICARptpevcTipoDireccion = direccionTMODIFICARptpevcTipoDireccion;
    }

    @JsonIgnore
    public TipoDireccion getDireccionTMODIFICARptpevcTipoDireccionInstance() {
        return this.direccionTMODIFICARptpevcTipoDireccionInstance;
    }
    
    public void setDireccionTMODIFICARptpevcTipoDireccionInstance(TipoDireccion direccionTMODIFICARptpevcTipoDireccion) {
        this.direccionTMODIFICARptpevcTipoDireccionInstance = direccionTMODIFICARptpevcTipoDireccion;
        this.direccionTMODIFICARptpevcTipoDireccion = direccionTMODIFICARptpevcTipoDireccion != null ? direccionTMODIFICARptpevcTipoDireccion.getOid() : null;
    }
}
