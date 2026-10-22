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
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.Pais;
import com.keralty.aepersonas.persistence.Persona;

public class TMODDIRECCIONESRequest {

    @JsonProperty("p_thispersona_oid")
    private PersonaOid personaTMODDIRECCIONESpthisPersona;
    
    @JsonIgnore
    private Persona personaTMODDIRECCIONESpthisPersonaInstance;

    @JsonProperty("pt_p_direccioncompleta")
    private String personaTMODDIRECCIONESptpDireccionCompleta;

    @JsonProperty("pt_p_rural")
    private Boolean personaTMODDIRECCIONESptpRural;

    @JsonProperty("pt_p_evcdepartamento_oid")
    private DepartamentoOid personaTMODDIRECCIONESptpevcDepartamento;
    
    @JsonIgnore
    private Departamento personaTMODDIRECCIONESptpevcDepartamentoInstance;

    @JsonProperty("pt_p_evcmunicipio_oid")
    private MunicipioOid personaTMODDIRECCIONESptpevcMunicipio;
    
    @JsonIgnore
    private Municipio personaTMODDIRECCIONESptpevcMunicipioInstance;

    @JsonProperty("pdcdireccioncompleta")
    private String personaTMODDIRECCIONESpDCDireccionCompleta;

    @JsonProperty("pdcdepartamento_oid")
    private DepartamentoOid personaTMODDIRECCIONESpDCDepartamento;
    
    @JsonIgnore
    private Departamento personaTMODDIRECCIONESpDCDepartamentoInstance;

    @JsonProperty("pdcmunicipio_oid")
    private MunicipioOid personaTMODDIRECCIONESpDCMunicipio;
    
    @JsonIgnore
    private Municipio personaTMODDIRECCIONESpDCMunicipioInstance;

    @JsonProperty("pdcrural")
    private Boolean personaTMODDIRECCIONESpDCRural;

    @JsonProperty("pt_p_agrpais_oid")
    private PaisOid personaTMODDIRECCIONESptpagrPais;
    
    @JsonIgnore
    private Pais personaTMODDIRECCIONESptpagrPaisInstance;

    @JsonProperty("pt_p_telefonofijo")
    private String personaTMODDIRECCIONESptpTelefonoFijo;

    @JsonProperty("pt_p_telefonocelular")
    private String personaTMODDIRECCIONESptpTelefonoCelular;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonaTMODDIRECCIONESpthisPersona();
    }

    @JsonIgnore
    public PersonaOid getPersonaTMODDIRECCIONESpthisPersona() {
        return this.personaTMODDIRECCIONESpthisPersona;
    }
    
    public void setPersonaTMODDIRECCIONESpthisPersona(PersonaOid personaTMODDIRECCIONESpthisPersona) {
        this.personaTMODDIRECCIONESpthisPersona = personaTMODDIRECCIONESpthisPersona;
    }

    @JsonIgnore
    public Persona getPersonaTMODDIRECCIONESpthisPersonaInstance() {
        return this.personaTMODDIRECCIONESpthisPersonaInstance;
    }
    
    public void setPersonaTMODDIRECCIONESpthisPersonaInstance(Persona personaTMODDIRECCIONESpthisPersona) {
        this.personaTMODDIRECCIONESpthisPersonaInstance = personaTMODDIRECCIONESpthisPersona;
        this.personaTMODDIRECCIONESpthisPersona = personaTMODDIRECCIONESpthisPersona != null ? personaTMODDIRECCIONESpthisPersona.getOid() : null;
    }

    private void checkPersonaTMODDIRECCIONESpthisPersona() throws NotNullArgumentException {
        if(this.getPersonaTMODDIRECCIONESpthisPersonaInstance() == null || this.getPersonaTMODDIRECCIONESpthisPersonaInstance().isNull()) {
            throw new NotNullArgumentException(PersonaConstants.SERV_ID_TMODDIRECCIONES, PersonaConstants.CLASS_ID, PersonaConstants.ARG_ID_TMODDIRECCIONES_PERSONATMODDIRECCIONESPTHISPERSONA, PersonaConstants.SERV_ALIAS_TMODDIRECCIONES, PersonaConstants.CLASS_ALIAS, PersonaConstants.ARG_ALIAS_TMODDIRECCIONES_PERSONATMODDIRECCIONESPTHISPERSONA);
        }
    }

    @JsonIgnore
    public String getPersonaTMODDIRECCIONESptpDireccionCompleta() {
        return this.personaTMODDIRECCIONESptpDireccionCompleta;
    }
    
    public void setPersonaTMODDIRECCIONESptpDireccionCompleta(String personaTMODDIRECCIONESptpDireccionCompleta) {
        this.personaTMODDIRECCIONESptpDireccionCompleta = personaTMODDIRECCIONESptpDireccionCompleta;
    }

    @JsonIgnore
    public Boolean getPersonaTMODDIRECCIONESptpRural() {
        return this.personaTMODDIRECCIONESptpRural;
    }
    
    public void setPersonaTMODDIRECCIONESptpRural(Boolean personaTMODDIRECCIONESptpRural) {
        this.personaTMODDIRECCIONESptpRural = personaTMODDIRECCIONESptpRural;
    }

    @JsonIgnore
    public DepartamentoOid getPersonaTMODDIRECCIONESptpevcDepartamento() {
        return this.personaTMODDIRECCIONESptpevcDepartamento;
    }
    
    public void setPersonaTMODDIRECCIONESptpevcDepartamento(DepartamentoOid personaTMODDIRECCIONESptpevcDepartamento) {
        this.personaTMODDIRECCIONESptpevcDepartamento = personaTMODDIRECCIONESptpevcDepartamento;
    }

    @JsonIgnore
    public Departamento getPersonaTMODDIRECCIONESptpevcDepartamentoInstance() {
        return this.personaTMODDIRECCIONESptpevcDepartamentoInstance;
    }
    
    public void setPersonaTMODDIRECCIONESptpevcDepartamentoInstance(Departamento personaTMODDIRECCIONESptpevcDepartamento) {
        this.personaTMODDIRECCIONESptpevcDepartamentoInstance = personaTMODDIRECCIONESptpevcDepartamento;
        this.personaTMODDIRECCIONESptpevcDepartamento = personaTMODDIRECCIONESptpevcDepartamento != null ? personaTMODDIRECCIONESptpevcDepartamento.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getPersonaTMODDIRECCIONESptpevcMunicipio() {
        return this.personaTMODDIRECCIONESptpevcMunicipio;
    }
    
    public void setPersonaTMODDIRECCIONESptpevcMunicipio(MunicipioOid personaTMODDIRECCIONESptpevcMunicipio) {
        this.personaTMODDIRECCIONESptpevcMunicipio = personaTMODDIRECCIONESptpevcMunicipio;
    }

    @JsonIgnore
    public Municipio getPersonaTMODDIRECCIONESptpevcMunicipioInstance() {
        return this.personaTMODDIRECCIONESptpevcMunicipioInstance;
    }
    
    public void setPersonaTMODDIRECCIONESptpevcMunicipioInstance(Municipio personaTMODDIRECCIONESptpevcMunicipio) {
        this.personaTMODDIRECCIONESptpevcMunicipioInstance = personaTMODDIRECCIONESptpevcMunicipio;
        this.personaTMODDIRECCIONESptpevcMunicipio = personaTMODDIRECCIONESptpevcMunicipio != null ? personaTMODDIRECCIONESptpevcMunicipio.getOid() : null;
    }

    @JsonIgnore
    public String getPersonaTMODDIRECCIONESpDCDireccionCompleta() {
        return this.personaTMODDIRECCIONESpDCDireccionCompleta;
    }
    
    public void setPersonaTMODDIRECCIONESpDCDireccionCompleta(String personaTMODDIRECCIONESpDCDireccionCompleta) {
        this.personaTMODDIRECCIONESpDCDireccionCompleta = personaTMODDIRECCIONESpDCDireccionCompleta;
    }

    @JsonIgnore
    public DepartamentoOid getPersonaTMODDIRECCIONESpDCDepartamento() {
        return this.personaTMODDIRECCIONESpDCDepartamento;
    }
    
    public void setPersonaTMODDIRECCIONESpDCDepartamento(DepartamentoOid personaTMODDIRECCIONESpDCDepartamento) {
        this.personaTMODDIRECCIONESpDCDepartamento = personaTMODDIRECCIONESpDCDepartamento;
    }

    @JsonIgnore
    public Departamento getPersonaTMODDIRECCIONESpDCDepartamentoInstance() {
        return this.personaTMODDIRECCIONESpDCDepartamentoInstance;
    }
    
    public void setPersonaTMODDIRECCIONESpDCDepartamentoInstance(Departamento personaTMODDIRECCIONESpDCDepartamento) {
        this.personaTMODDIRECCIONESpDCDepartamentoInstance = personaTMODDIRECCIONESpDCDepartamento;
        this.personaTMODDIRECCIONESpDCDepartamento = personaTMODDIRECCIONESpDCDepartamento != null ? personaTMODDIRECCIONESpDCDepartamento.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getPersonaTMODDIRECCIONESpDCMunicipio() {
        return this.personaTMODDIRECCIONESpDCMunicipio;
    }
    
    public void setPersonaTMODDIRECCIONESpDCMunicipio(MunicipioOid personaTMODDIRECCIONESpDCMunicipio) {
        this.personaTMODDIRECCIONESpDCMunicipio = personaTMODDIRECCIONESpDCMunicipio;
    }

    @JsonIgnore
    public Municipio getPersonaTMODDIRECCIONESpDCMunicipioInstance() {
        return this.personaTMODDIRECCIONESpDCMunicipioInstance;
    }
    
    public void setPersonaTMODDIRECCIONESpDCMunicipioInstance(Municipio personaTMODDIRECCIONESpDCMunicipio) {
        this.personaTMODDIRECCIONESpDCMunicipioInstance = personaTMODDIRECCIONESpDCMunicipio;
        this.personaTMODDIRECCIONESpDCMunicipio = personaTMODDIRECCIONESpDCMunicipio != null ? personaTMODDIRECCIONESpDCMunicipio.getOid() : null;
    }

    @JsonIgnore
    public Boolean getPersonaTMODDIRECCIONESpDCRural() {
        return this.personaTMODDIRECCIONESpDCRural;
    }
    
    public void setPersonaTMODDIRECCIONESpDCRural(Boolean personaTMODDIRECCIONESpDCRural) {
        this.personaTMODDIRECCIONESpDCRural = personaTMODDIRECCIONESpDCRural;
    }

    @JsonIgnore
    public PaisOid getPersonaTMODDIRECCIONESptpagrPais() {
        return this.personaTMODDIRECCIONESptpagrPais;
    }
    
    public void setPersonaTMODDIRECCIONESptpagrPais(PaisOid personaTMODDIRECCIONESptpagrPais) {
        this.personaTMODDIRECCIONESptpagrPais = personaTMODDIRECCIONESptpagrPais;
    }

    @JsonIgnore
    public Pais getPersonaTMODDIRECCIONESptpagrPaisInstance() {
        return this.personaTMODDIRECCIONESptpagrPaisInstance;
    }
    
    public void setPersonaTMODDIRECCIONESptpagrPaisInstance(Pais personaTMODDIRECCIONESptpagrPais) {
        this.personaTMODDIRECCIONESptpagrPaisInstance = personaTMODDIRECCIONESptpagrPais;
        this.personaTMODDIRECCIONESptpagrPais = personaTMODDIRECCIONESptpagrPais != null ? personaTMODDIRECCIONESptpagrPais.getOid() : null;
    }

    @JsonIgnore
    public String getPersonaTMODDIRECCIONESptpTelefonoFijo() {
        return this.personaTMODDIRECCIONESptpTelefonoFijo;
    }
    
    public void setPersonaTMODDIRECCIONESptpTelefonoFijo(String personaTMODDIRECCIONESptpTelefonoFijo) {
        this.personaTMODDIRECCIONESptpTelefonoFijo = personaTMODDIRECCIONESptpTelefonoFijo;
    }

    @JsonIgnore
    public String getPersonaTMODDIRECCIONESptpTelefonoCelular() {
        return this.personaTMODDIRECCIONESptpTelefonoCelular;
    }
    
    public void setPersonaTMODDIRECCIONESptpTelefonoCelular(String personaTMODDIRECCIONESptpTelefonoCelular) {
        this.personaTMODDIRECCIONESptpTelefonoCelular = personaTMODDIRECCIONESptpTelefonoCelular;
    }
}
