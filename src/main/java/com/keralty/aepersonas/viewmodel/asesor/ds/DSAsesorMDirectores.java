package com.keralty.aepersonas.viewmodel.asesor.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Asesor;
public class DSAsesorMDirectores {

    @JsonProperty("usuario")
    private String dSAsesorMDirectoresUsuario;

    @JsonProperty("drvnombrecompleto")
    private String dSAsesorMDirectoresDrvNombreCompleto;

    @JsonProperty("usuarioldap")
    private String dSAsesorMDirectoresUsuarioLDAP;

    @JsonProperty("email")
    private String dSAsesorMDirectoresEmail;

    @JsonProperty("verdbasicospersona")
    private Boolean dSAsesorMDirectoresVerDBasicosPersona;

    @JsonProperty("verdocidentificacionpersona")
    private Boolean dSAsesorMDirectoresVerDocIdentificacionPersona;

    @JsonProperty("vercontratonovedad")
    private Boolean dSAsesorMDirectoresVerContratoNovedad;

    @JsonProperty("moddbasicospersona")
    private Boolean dSAsesorMDirectoresModDBasicosPersona;

    @JsonProperty("modificadirector")
    private Boolean dSAsesorMDirectoresModificaDirector;

    @JsonProperty("codjefe")
    private String dSAsesorMDirectoresCodJefe;

    @JsonProperty("sucursal_descripcion")
    private String dSAsesorMDirectoresSucursalDotDescripcion;

    @JsonProperty("tipoidentificacion_nombrecorto")
    private String dSAsesorMDirectoresTipoIdentificacionDotNombreCorto;

    @JsonProperty("numidentificacion")
    private String dSAsesorMDirectoresNumIdentificacion;

    @JsonProperty("canalcomercial")
    private String dSAsesorMDirectoresCanalComercial;

    @JsonProperty("cargo")
    private String dSAsesorMDirectoresCargo;

    @JsonProperty("estado")
    private String dSAsesorMDirectoresEstado;

    public DSAsesorMDirectores() {
    
    }

    public DSAsesorMDirectores(Asesor instance) {
        if (instance != null) {
            try {
                this.dSAsesorMDirectoresUsuario = instance.getFuncionarioUsuario();
                this.dSAsesorMDirectoresDrvNombreCompleto = instance.getFuncionariodrvNombreCompleto();
                this.dSAsesorMDirectoresUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
                this.dSAsesorMDirectoresEmail = instance.getFuncionarioEmail();
                this.dSAsesorMDirectoresVerDBasicosPersona = instance.getAsesorVerDBasicosPersona();
                this.dSAsesorMDirectoresVerDocIdentificacionPersona = instance.getAsesorVerDocIdentificacionPersona();
                this.dSAsesorMDirectoresVerContratoNovedad = instance.getAsesorVerContratoNovedad();
                this.dSAsesorMDirectoresModDBasicosPersona = instance.getAsesorModDBasicosPersona();
                this.dSAsesorMDirectoresModificaDirector = instance.getAsesormodificaDirector();
                this.dSAsesorMDirectoresCodJefe = instance.getFuncionarioCodJefe();
                this.dSAsesorMDirectoresSucursalDotDescripcion = instance.getSucursal().getSucursalDescripcion();
                this.dSAsesorMDirectoresTipoIdentificacionDotNombreCorto = instance.getTipoIdentificacion().getTipoIdentificacionNombreCorto();
                this.dSAsesorMDirectoresNumIdentificacion = instance.getAsesorNumIdentificacion();
                this.dSAsesorMDirectoresCanalComercial = instance.getAsesorCanalComercial();
                this.dSAsesorMDirectoresCargo = instance.getAsesorCargo();
                this.dSAsesorMDirectoresEstado = instance.getAsesorEstado();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getDSAsesorMDirectoresUsuario() {
        return this.dSAsesorMDirectoresUsuario;
    }
    
    public void setDSAsesorMDirectoresUsuario(String dSAsesorMDirectoresUsuario) {
        this.dSAsesorMDirectoresUsuario = dSAsesorMDirectoresUsuario;
    }

    @JsonIgnore
    public String getDSAsesorMDirectoresDrvNombreCompleto() {
        return this.dSAsesorMDirectoresDrvNombreCompleto;
    }
    
    public void setDSAsesorMDirectoresDrvNombreCompleto(String dSAsesorMDirectoresDrvNombreCompleto) {
        this.dSAsesorMDirectoresDrvNombreCompleto = dSAsesorMDirectoresDrvNombreCompleto;
    }

    @JsonIgnore
    public String getDSAsesorMDirectoresUsuarioLDAP() {
        return this.dSAsesorMDirectoresUsuarioLDAP;
    }
    
    public void setDSAsesorMDirectoresUsuarioLDAP(String dSAsesorMDirectoresUsuarioLDAP) {
        this.dSAsesorMDirectoresUsuarioLDAP = dSAsesorMDirectoresUsuarioLDAP;
    }

    @JsonIgnore
    public String getDSAsesorMDirectoresEmail() {
        return this.dSAsesorMDirectoresEmail;
    }
    
    public void setDSAsesorMDirectoresEmail(String dSAsesorMDirectoresEmail) {
        this.dSAsesorMDirectoresEmail = dSAsesorMDirectoresEmail;
    }

    @JsonIgnore
    public Boolean getDSAsesorMDirectoresVerDBasicosPersona() {
        return this.dSAsesorMDirectoresVerDBasicosPersona;
    }
    
    public void setDSAsesorMDirectoresVerDBasicosPersona(Boolean dSAsesorMDirectoresVerDBasicosPersona) {
        this.dSAsesorMDirectoresVerDBasicosPersona = dSAsesorMDirectoresVerDBasicosPersona;
    }

    @JsonIgnore
    public Boolean getDSAsesorMDirectoresVerDocIdentificacionPersona() {
        return this.dSAsesorMDirectoresVerDocIdentificacionPersona;
    }
    
    public void setDSAsesorMDirectoresVerDocIdentificacionPersona(Boolean dSAsesorMDirectoresVerDocIdentificacionPersona) {
        this.dSAsesorMDirectoresVerDocIdentificacionPersona = dSAsesorMDirectoresVerDocIdentificacionPersona;
    }

    @JsonIgnore
    public Boolean getDSAsesorMDirectoresVerContratoNovedad() {
        return this.dSAsesorMDirectoresVerContratoNovedad;
    }
    
    public void setDSAsesorMDirectoresVerContratoNovedad(Boolean dSAsesorMDirectoresVerContratoNovedad) {
        this.dSAsesorMDirectoresVerContratoNovedad = dSAsesorMDirectoresVerContratoNovedad;
    }

    @JsonIgnore
    public Boolean getDSAsesorMDirectoresModDBasicosPersona() {
        return this.dSAsesorMDirectoresModDBasicosPersona;
    }
    
    public void setDSAsesorMDirectoresModDBasicosPersona(Boolean dSAsesorMDirectoresModDBasicosPersona) {
        this.dSAsesorMDirectoresModDBasicosPersona = dSAsesorMDirectoresModDBasicosPersona;
    }

    @JsonIgnore
    public Boolean getDSAsesorMDirectoresModificaDirector() {
        return this.dSAsesorMDirectoresModificaDirector;
    }
    
    public void setDSAsesorMDirectoresModificaDirector(Boolean dSAsesorMDirectoresModificaDirector) {
        this.dSAsesorMDirectoresModificaDirector = dSAsesorMDirectoresModificaDirector;
    }

    @JsonIgnore
    public String getDSAsesorMDirectoresCodJefe() {
        return this.dSAsesorMDirectoresCodJefe;
    }
    
    public void setDSAsesorMDirectoresCodJefe(String dSAsesorMDirectoresCodJefe) {
        this.dSAsesorMDirectoresCodJefe = dSAsesorMDirectoresCodJefe;
    }

    @JsonIgnore
    public String getDSAsesorMDirectoresSucursalDotDescripcion() {
        return this.dSAsesorMDirectoresSucursalDotDescripcion;
    }
    
    public void setDSAsesorMDirectoresSucursalDotDescripcion(String dSAsesorMDirectoresSucursalDotDescripcion) {
        this.dSAsesorMDirectoresSucursalDotDescripcion = dSAsesorMDirectoresSucursalDotDescripcion;
    }

    @JsonIgnore
    public String getDSAsesorMDirectoresTipoIdentificacionDotNombreCorto() {
        return this.dSAsesorMDirectoresTipoIdentificacionDotNombreCorto;
    }
    
    public void setDSAsesorMDirectoresTipoIdentificacionDotNombreCorto(String dSAsesorMDirectoresTipoIdentificacionDotNombreCorto) {
        this.dSAsesorMDirectoresTipoIdentificacionDotNombreCorto = dSAsesorMDirectoresTipoIdentificacionDotNombreCorto;
    }

    @JsonIgnore
    public String getDSAsesorMDirectoresNumIdentificacion() {
        return this.dSAsesorMDirectoresNumIdentificacion;
    }
    
    public void setDSAsesorMDirectoresNumIdentificacion(String dSAsesorMDirectoresNumIdentificacion) {
        this.dSAsesorMDirectoresNumIdentificacion = dSAsesorMDirectoresNumIdentificacion;
    }

    @JsonIgnore
    public String getDSAsesorMDirectoresCanalComercial() {
        return this.dSAsesorMDirectoresCanalComercial;
    }
    
    public void setDSAsesorMDirectoresCanalComercial(String dSAsesorMDirectoresCanalComercial) {
        this.dSAsesorMDirectoresCanalComercial = dSAsesorMDirectoresCanalComercial;
    }

    @JsonIgnore
    public String getDSAsesorMDirectoresCargo() {
        return this.dSAsesorMDirectoresCargo;
    }
    
    public void setDSAsesorMDirectoresCargo(String dSAsesorMDirectoresCargo) {
        this.dSAsesorMDirectoresCargo = dSAsesorMDirectoresCargo;
    }

    @JsonIgnore
    public String getDSAsesorMDirectoresEstado() {
        return this.dSAsesorMDirectoresEstado;
    }
    
    public void setDSAsesorMDirectoresEstado(String dSAsesorMDirectoresEstado) {
        this.dSAsesorMDirectoresEstado = dSAsesorMDirectoresEstado;
    }
}
