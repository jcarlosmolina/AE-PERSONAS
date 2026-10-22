package com.keralty.aepersonas.viewmodel.titular.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.TitularConstants;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;
import com.keralty.aepersonas.persistence.oid.PaisOid;
import com.keralty.aepersonas.persistence.oid.TipoDireccionOid;
import com.keralty.aepersonas.persistence.oid.TitularOid;
import com.keralty.aepersonas.persistence.Pais;
import com.keralty.aepersonas.persistence.TipoDireccion;
import com.keralty.aepersonas.persistence.Titular;

public class TCREAROMODDIRECCIONRequest {

    @JsonProperty("p_thistitular_oid")
    private TitularOid titularTCREAROMODDIRECCIONpthisTitular;
    
    @JsonIgnore
    private Titular titularTCREAROMODDIRECCIONpthisTitularInstance;

    @JsonProperty("pt_p_agrtipodireccion_oid")
    private TipoDireccionOid titularTCREAROMODDIRECCIONptpagrTipoDireccion;
    
    @JsonIgnore
    private TipoDireccion titularTCREAROMODDIRECCIONptpagrTipoDireccionInstance;

    @JsonProperty("pt_p_agrpais_oid")
    private PaisOid titularTCREAROMODDIRECCIONptpagrPais;
    
    @JsonIgnore
    private Pais titularTCREAROMODDIRECCIONptpagrPaisInstance;

    @JsonProperty("pt_p_agrdepartamento_oid")
    private DepartamentoOid titularTCREAROMODDIRECCIONptpagrDepartamento;
    
    @JsonIgnore
    private Departamento titularTCREAROMODDIRECCIONptpagrDepartamentoInstance;

    @JsonProperty("pt_p_agrmunicipio_oid")
    private MunicipioOid titularTCREAROMODDIRECCIONptpagrMunicipio;
    
    @JsonIgnore
    private Municipio titularTCREAROMODDIRECCIONptpagrMunicipioInstance;

    @JsonProperty("pt_p_atrdireccioncompleta")
    private String titularTCREAROMODDIRECCIONptpatrDireccionCompleta;

    @JsonProperty("pt_p_atrrural")
    private Boolean titularTCREAROMODDIRECCIONptpatrRural;

    public void checkArguments() throws NotNullArgumentException {
        checkTitularTCREAROMODDIRECCIONpthisTitular();
    }

    @JsonIgnore
    public TitularOid getTitularTCREAROMODDIRECCIONpthisTitular() {
        return this.titularTCREAROMODDIRECCIONpthisTitular;
    }
    
    public void setTitularTCREAROMODDIRECCIONpthisTitular(TitularOid titularTCREAROMODDIRECCIONpthisTitular) {
        this.titularTCREAROMODDIRECCIONpthisTitular = titularTCREAROMODDIRECCIONpthisTitular;
    }

    @JsonIgnore
    public Titular getTitularTCREAROMODDIRECCIONpthisTitularInstance() {
        return this.titularTCREAROMODDIRECCIONpthisTitularInstance;
    }
    
    public void setTitularTCREAROMODDIRECCIONpthisTitularInstance(Titular titularTCREAROMODDIRECCIONpthisTitular) {
        this.titularTCREAROMODDIRECCIONpthisTitularInstance = titularTCREAROMODDIRECCIONpthisTitular;
        this.titularTCREAROMODDIRECCIONpthisTitular = titularTCREAROMODDIRECCIONpthisTitular != null ? titularTCREAROMODDIRECCIONpthisTitular.getOid() : null;
    }

    private void checkTitularTCREAROMODDIRECCIONpthisTitular() throws NotNullArgumentException {
        if(this.getTitularTCREAROMODDIRECCIONpthisTitularInstance() == null || this.getTitularTCREAROMODDIRECCIONpthisTitularInstance().isNull()) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_TCREAROMODDIRECCION, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_TCREAROMODDIRECCION_TITULARTCREAROMODDIRECCIONPTHISTITULAR, TitularConstants.SERV_ALIAS_TCREAROMODDIRECCION, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_TCREAROMODDIRECCION_TITULARTCREAROMODDIRECCIONPTHISTITULAR);
        }
    }

    @JsonIgnore
    public TipoDireccionOid getTitularTCREAROMODDIRECCIONptpagrTipoDireccion() {
        return this.titularTCREAROMODDIRECCIONptpagrTipoDireccion;
    }
    
    public void setTitularTCREAROMODDIRECCIONptpagrTipoDireccion(TipoDireccionOid titularTCREAROMODDIRECCIONptpagrTipoDireccion) {
        this.titularTCREAROMODDIRECCIONptpagrTipoDireccion = titularTCREAROMODDIRECCIONptpagrTipoDireccion;
    }

    @JsonIgnore
    public TipoDireccion getTitularTCREAROMODDIRECCIONptpagrTipoDireccionInstance() {
        return this.titularTCREAROMODDIRECCIONptpagrTipoDireccionInstance;
    }
    
    public void setTitularTCREAROMODDIRECCIONptpagrTipoDireccionInstance(TipoDireccion titularTCREAROMODDIRECCIONptpagrTipoDireccion) {
        this.titularTCREAROMODDIRECCIONptpagrTipoDireccionInstance = titularTCREAROMODDIRECCIONptpagrTipoDireccion;
        this.titularTCREAROMODDIRECCIONptpagrTipoDireccion = titularTCREAROMODDIRECCIONptpagrTipoDireccion != null ? titularTCREAROMODDIRECCIONptpagrTipoDireccion.getOid() : null;
    }

    @JsonIgnore
    public PaisOid getTitularTCREAROMODDIRECCIONptpagrPais() {
        return this.titularTCREAROMODDIRECCIONptpagrPais;
    }
    
    public void setTitularTCREAROMODDIRECCIONptpagrPais(PaisOid titularTCREAROMODDIRECCIONptpagrPais) {
        this.titularTCREAROMODDIRECCIONptpagrPais = titularTCREAROMODDIRECCIONptpagrPais;
    }

    @JsonIgnore
    public Pais getTitularTCREAROMODDIRECCIONptpagrPaisInstance() {
        return this.titularTCREAROMODDIRECCIONptpagrPaisInstance;
    }
    
    public void setTitularTCREAROMODDIRECCIONptpagrPaisInstance(Pais titularTCREAROMODDIRECCIONptpagrPais) {
        this.titularTCREAROMODDIRECCIONptpagrPaisInstance = titularTCREAROMODDIRECCIONptpagrPais;
        this.titularTCREAROMODDIRECCIONptpagrPais = titularTCREAROMODDIRECCIONptpagrPais != null ? titularTCREAROMODDIRECCIONptpagrPais.getOid() : null;
    }

    @JsonIgnore
    public DepartamentoOid getTitularTCREAROMODDIRECCIONptpagrDepartamento() {
        return this.titularTCREAROMODDIRECCIONptpagrDepartamento;
    }
    
    public void setTitularTCREAROMODDIRECCIONptpagrDepartamento(DepartamentoOid titularTCREAROMODDIRECCIONptpagrDepartamento) {
        this.titularTCREAROMODDIRECCIONptpagrDepartamento = titularTCREAROMODDIRECCIONptpagrDepartamento;
    }

    @JsonIgnore
    public Departamento getTitularTCREAROMODDIRECCIONptpagrDepartamentoInstance() {
        return this.titularTCREAROMODDIRECCIONptpagrDepartamentoInstance;
    }
    
    public void setTitularTCREAROMODDIRECCIONptpagrDepartamentoInstance(Departamento titularTCREAROMODDIRECCIONptpagrDepartamento) {
        this.titularTCREAROMODDIRECCIONptpagrDepartamentoInstance = titularTCREAROMODDIRECCIONptpagrDepartamento;
        this.titularTCREAROMODDIRECCIONptpagrDepartamento = titularTCREAROMODDIRECCIONptpagrDepartamento != null ? titularTCREAROMODDIRECCIONptpagrDepartamento.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getTitularTCREAROMODDIRECCIONptpagrMunicipio() {
        return this.titularTCREAROMODDIRECCIONptpagrMunicipio;
    }
    
    public void setTitularTCREAROMODDIRECCIONptpagrMunicipio(MunicipioOid titularTCREAROMODDIRECCIONptpagrMunicipio) {
        this.titularTCREAROMODDIRECCIONptpagrMunicipio = titularTCREAROMODDIRECCIONptpagrMunicipio;
    }

    @JsonIgnore
    public Municipio getTitularTCREAROMODDIRECCIONptpagrMunicipioInstance() {
        return this.titularTCREAROMODDIRECCIONptpagrMunicipioInstance;
    }
    
    public void setTitularTCREAROMODDIRECCIONptpagrMunicipioInstance(Municipio titularTCREAROMODDIRECCIONptpagrMunicipio) {
        this.titularTCREAROMODDIRECCIONptpagrMunicipioInstance = titularTCREAROMODDIRECCIONptpagrMunicipio;
        this.titularTCREAROMODDIRECCIONptpagrMunicipio = titularTCREAROMODDIRECCIONptpagrMunicipio != null ? titularTCREAROMODDIRECCIONptpagrMunicipio.getOid() : null;
    }

    @JsonIgnore
    public String getTitularTCREAROMODDIRECCIONptpatrDireccionCompleta() {
        return this.titularTCREAROMODDIRECCIONptpatrDireccionCompleta;
    }
    
    public void setTitularTCREAROMODDIRECCIONptpatrDireccionCompleta(String titularTCREAROMODDIRECCIONptpatrDireccionCompleta) {
        this.titularTCREAROMODDIRECCIONptpatrDireccionCompleta = titularTCREAROMODDIRECCIONptpatrDireccionCompleta;
    }

    @JsonIgnore
    public Boolean getTitularTCREAROMODDIRECCIONptpatrRural() {
        return this.titularTCREAROMODDIRECCIONptpatrRural;
    }
    
    public void setTitularTCREAROMODDIRECCIONptpatrRural(Boolean titularTCREAROMODDIRECCIONptpatrRural) {
        this.titularTCREAROMODDIRECCIONptpatrRural = titularTCREAROMODDIRECCIONptpatrRural;
    }
}
