package com.keralty.aepersonas.viewmodel.persona.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PersonaConstants;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;
import com.keralty.aepersonas.persistence.oid.PaisOid;
import com.keralty.aepersonas.persistence.oid.TipoIdentificacionOid;
import com.keralty.aepersonas.persistence.Pais;
import com.keralty.aepersonas.persistence.TipoIdentificacion;

public class TCREARJURIDICARequest {

    @JsonProperty("pt_p_agrtipoidentificacion_oid")
    private TipoIdentificacionOid personaTCREARJURIDICAptpagrTipoIdentificacion;
    
    @JsonIgnore
    private TipoIdentificacion personaTCREARJURIDICAptpagrTipoIdentificacionInstance;

    @JsonProperty("pt_p_atrnumidentificacion")
    private String personaTCREARJURIDICAptpatrNumIdentificacion;

    @JsonProperty("pt_p_atrrazonsocial")
    private String personaTCREARJURIDICAptpatrRazonSocial;

    @JsonProperty("pt_p_atrindicadorextranjero")
    private Boolean personaTCREARJURIDICAptpatrIndicadorExtranjero;

    @JsonProperty("pt_p_atrtelefonofijo")
    private String personaTCREARJURIDICAptpatrTelefonoFijo;

    @JsonProperty("pt_p_atrtelefonocelular")
    private String personaTCREARJURIDICAptpatrTelefonoCelular;

    @JsonProperty("pt_p_atrcorreoelectronico")
    private String personaTCREARJURIDICAptpatrCorreoElectronico;

    @JsonProperty("pt_p_agrpais_oid")
    private PaisOid personaTCREARJURIDICAptpagrPais;
    
    @JsonIgnore
    private Pais personaTCREARJURIDICAptpagrPaisInstance;

    @JsonProperty("pt_p_agrdepartamento_oid")
    private DepartamentoOid personaTCREARJURIDICAptpagrDepartamento;
    
    @JsonIgnore
    private Departamento personaTCREARJURIDICAptpagrDepartamentoInstance;

    @JsonProperty("pt_p_agrmunicipio_oid")
    private MunicipioOid personaTCREARJURIDICAptpagrMunicipio;
    
    @JsonIgnore
    private Municipio personaTCREARJURIDICAptpagrMunicipioInstance;

    @JsonProperty("pt_p_atrdireccioncompleta")
    private String personaTCREARJURIDICAptpatrDireccionCompleta;

    @JsonProperty("pt_p_atrrural")
    private Boolean personaTCREARJURIDICAptpatrRural;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonaTCREARJURIDICAptpagrTipoIdentificacion();
        checkPersonaTCREARJURIDICAptpatrNumIdentificacion();
    }

    @JsonIgnore
    public TipoIdentificacionOid getPersonaTCREARJURIDICAptpagrTipoIdentificacion() {
        return this.personaTCREARJURIDICAptpagrTipoIdentificacion;
    }
    
    public void setPersonaTCREARJURIDICAptpagrTipoIdentificacion(TipoIdentificacionOid personaTCREARJURIDICAptpagrTipoIdentificacion) {
        this.personaTCREARJURIDICAptpagrTipoIdentificacion = personaTCREARJURIDICAptpagrTipoIdentificacion;
    }

    @JsonIgnore
    public TipoIdentificacion getPersonaTCREARJURIDICAptpagrTipoIdentificacionInstance() {
        return this.personaTCREARJURIDICAptpagrTipoIdentificacionInstance;
    }
    
    public void setPersonaTCREARJURIDICAptpagrTipoIdentificacionInstance(TipoIdentificacion personaTCREARJURIDICAptpagrTipoIdentificacion) {
        this.personaTCREARJURIDICAptpagrTipoIdentificacionInstance = personaTCREARJURIDICAptpagrTipoIdentificacion;
        this.personaTCREARJURIDICAptpagrTipoIdentificacion = personaTCREARJURIDICAptpagrTipoIdentificacion != null ? personaTCREARJURIDICAptpagrTipoIdentificacion.getOid() : null;
    }

    private void checkPersonaTCREARJURIDICAptpagrTipoIdentificacion() throws NotNullArgumentException {
        if(this.getPersonaTCREARJURIDICAptpagrTipoIdentificacionInstance() == null || this.getPersonaTCREARJURIDICAptpagrTipoIdentificacionInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TCREARJURIDICA, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TCREARJURIDICA_PERSONATCREARJURIDICAPTPAGRTIPOIDENTIFICACION, PersonaConstants.SERV_ALIAS_TCREARJURIDICA, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TCREARJURIDICA_PERSONATCREARJURIDICAPTPAGRTIPOIDENTIFICACION);
        }
    }

    @JsonIgnore
    public String getPersonaTCREARJURIDICAptpatrNumIdentificacion() {
        return this.personaTCREARJURIDICAptpatrNumIdentificacion;
    }
    
    public void setPersonaTCREARJURIDICAptpatrNumIdentificacion(String personaTCREARJURIDICAptpatrNumIdentificacion) {
        this.personaTCREARJURIDICAptpatrNumIdentificacion = personaTCREARJURIDICAptpatrNumIdentificacion;
    }

    private void checkPersonaTCREARJURIDICAptpatrNumIdentificacion() throws NotNullArgumentException {
        if(this.getPersonaTCREARJURIDICAptpatrNumIdentificacion() == null) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TCREARJURIDICA, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TCREARJURIDICA_PERSONATCREARJURIDICAPTPATRNUMIDENTIFICACION, PersonaConstants.SERV_ALIAS_TCREARJURIDICA, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TCREARJURIDICA_PERSONATCREARJURIDICAPTPATRNUMIDENTIFICACION);
        }
    }

    @JsonIgnore
    public String getPersonaTCREARJURIDICAptpatrRazonSocial() {
        return this.personaTCREARJURIDICAptpatrRazonSocial;
    }
    
    public void setPersonaTCREARJURIDICAptpatrRazonSocial(String personaTCREARJURIDICAptpatrRazonSocial) {
        this.personaTCREARJURIDICAptpatrRazonSocial = personaTCREARJURIDICAptpatrRazonSocial;
    }

    @JsonIgnore
    public Boolean getPersonaTCREARJURIDICAptpatrIndicadorExtranjero() {
        return this.personaTCREARJURIDICAptpatrIndicadorExtranjero;
    }
    
    public void setPersonaTCREARJURIDICAptpatrIndicadorExtranjero(Boolean personaTCREARJURIDICAptpatrIndicadorExtranjero) {
        this.personaTCREARJURIDICAptpatrIndicadorExtranjero = personaTCREARJURIDICAptpatrIndicadorExtranjero;
    }

    @JsonIgnore
    public String getPersonaTCREARJURIDICAptpatrTelefonoFijo() {
        return this.personaTCREARJURIDICAptpatrTelefonoFijo;
    }
    
    public void setPersonaTCREARJURIDICAptpatrTelefonoFijo(String personaTCREARJURIDICAptpatrTelefonoFijo) {
        this.personaTCREARJURIDICAptpatrTelefonoFijo = personaTCREARJURIDICAptpatrTelefonoFijo;
    }

    @JsonIgnore
    public String getPersonaTCREARJURIDICAptpatrTelefonoCelular() {
        return this.personaTCREARJURIDICAptpatrTelefonoCelular;
    }
    
    public void setPersonaTCREARJURIDICAptpatrTelefonoCelular(String personaTCREARJURIDICAptpatrTelefonoCelular) {
        this.personaTCREARJURIDICAptpatrTelefonoCelular = personaTCREARJURIDICAptpatrTelefonoCelular;
    }

    @JsonIgnore
    public String getPersonaTCREARJURIDICAptpatrCorreoElectronico() {
        return this.personaTCREARJURIDICAptpatrCorreoElectronico;
    }
    
    public void setPersonaTCREARJURIDICAptpatrCorreoElectronico(String personaTCREARJURIDICAptpatrCorreoElectronico) {
        this.personaTCREARJURIDICAptpatrCorreoElectronico = personaTCREARJURIDICAptpatrCorreoElectronico;
    }

    @JsonIgnore
    public PaisOid getPersonaTCREARJURIDICAptpagrPais() {
        return this.personaTCREARJURIDICAptpagrPais;
    }
    
    public void setPersonaTCREARJURIDICAptpagrPais(PaisOid personaTCREARJURIDICAptpagrPais) {
        this.personaTCREARJURIDICAptpagrPais = personaTCREARJURIDICAptpagrPais;
    }

    @JsonIgnore
    public Pais getPersonaTCREARJURIDICAptpagrPaisInstance() {
        return this.personaTCREARJURIDICAptpagrPaisInstance;
    }
    
    public void setPersonaTCREARJURIDICAptpagrPaisInstance(Pais personaTCREARJURIDICAptpagrPais) {
        this.personaTCREARJURIDICAptpagrPaisInstance = personaTCREARJURIDICAptpagrPais;
        this.personaTCREARJURIDICAptpagrPais = personaTCREARJURIDICAptpagrPais != null ? personaTCREARJURIDICAptpagrPais.getOid() : null;
    }

    @JsonIgnore
    public DepartamentoOid getPersonaTCREARJURIDICAptpagrDepartamento() {
        return this.personaTCREARJURIDICAptpagrDepartamento;
    }
    
    public void setPersonaTCREARJURIDICAptpagrDepartamento(DepartamentoOid personaTCREARJURIDICAptpagrDepartamento) {
        this.personaTCREARJURIDICAptpagrDepartamento = personaTCREARJURIDICAptpagrDepartamento;
    }

    @JsonIgnore
    public Departamento getPersonaTCREARJURIDICAptpagrDepartamentoInstance() {
        return this.personaTCREARJURIDICAptpagrDepartamentoInstance;
    }
    
    public void setPersonaTCREARJURIDICAptpagrDepartamentoInstance(Departamento personaTCREARJURIDICAptpagrDepartamento) {
        this.personaTCREARJURIDICAptpagrDepartamentoInstance = personaTCREARJURIDICAptpagrDepartamento;
        this.personaTCREARJURIDICAptpagrDepartamento = personaTCREARJURIDICAptpagrDepartamento != null ? personaTCREARJURIDICAptpagrDepartamento.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getPersonaTCREARJURIDICAptpagrMunicipio() {
        return this.personaTCREARJURIDICAptpagrMunicipio;
    }
    
    public void setPersonaTCREARJURIDICAptpagrMunicipio(MunicipioOid personaTCREARJURIDICAptpagrMunicipio) {
        this.personaTCREARJURIDICAptpagrMunicipio = personaTCREARJURIDICAptpagrMunicipio;
    }

    @JsonIgnore
    public Municipio getPersonaTCREARJURIDICAptpagrMunicipioInstance() {
        return this.personaTCREARJURIDICAptpagrMunicipioInstance;
    }
    
    public void setPersonaTCREARJURIDICAptpagrMunicipioInstance(Municipio personaTCREARJURIDICAptpagrMunicipio) {
        this.personaTCREARJURIDICAptpagrMunicipioInstance = personaTCREARJURIDICAptpagrMunicipio;
        this.personaTCREARJURIDICAptpagrMunicipio = personaTCREARJURIDICAptpagrMunicipio != null ? personaTCREARJURIDICAptpagrMunicipio.getOid() : null;
    }

    @JsonIgnore
    public String getPersonaTCREARJURIDICAptpatrDireccionCompleta() {
        return this.personaTCREARJURIDICAptpatrDireccionCompleta;
    }
    
    public void setPersonaTCREARJURIDICAptpatrDireccionCompleta(String personaTCREARJURIDICAptpatrDireccionCompleta) {
        this.personaTCREARJURIDICAptpatrDireccionCompleta = personaTCREARJURIDICAptpatrDireccionCompleta;
    }

    @JsonIgnore
    public Boolean getPersonaTCREARJURIDICAptpatrRural() {
        return this.personaTCREARJURIDICAptpatrRural;
    }
    
    public void setPersonaTCREARJURIDICAptpatrRural(Boolean personaTCREARJURIDICAptpatrRural) {
        this.personaTCREARJURIDICAptpatrRural = personaTCREARJURIDICAptpatrRural;
    }
}
