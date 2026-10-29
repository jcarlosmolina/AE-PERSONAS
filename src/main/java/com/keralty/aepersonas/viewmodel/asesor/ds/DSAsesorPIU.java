package com.keralty.aepersonas.viewmodel.asesor.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Asesor;
public class DSAsesorPIU {

    @JsonProperty("usuario")
    private String dSAsesorPIUUsuario;

    @JsonProperty("drvnombrecompleto")
    private String dSAsesorPIUDrvNombreCompleto;

    @JsonProperty("usuarioldap")
    private String dSAsesorPIUUsuarioLDAP;

    @JsonProperty("esintegral")
    private Boolean dSAsesorPIUEsIntegral;

    @JsonProperty("email")
    private String dSAsesorPIUEmail;

    @JsonProperty("verdbasicospersona")
    private Boolean dSAsesorPIUVerDBasicosPersona;

    @JsonProperty("verdocidentificacionpersona")
    private Boolean dSAsesorPIUVerDocIdentificacionPersona;

    @JsonProperty("vercontratonovedad")
    private Boolean dSAsesorPIUVerContratoNovedad;

    @JsonProperty("moddbasicospersona")
    private Boolean dSAsesorPIUModDBasicosPersona;

    @JsonProperty("modificadirector")
    private Boolean dSAsesorPIUModificaDirector;

    @JsonProperty("esdirector")
    private Boolean dSAsesorPIUEsDirector;

    @JsonProperty("codjefe")
    private String dSAsesorPIUCodJefe;

    @JsonProperty("drvnomjefe")
    private String dSAsesorPIUDrvNomJefe;

    @JsonProperty("sucursal_descripcion")
    private String dSAsesorPIUSucursalDotDescripcion;

    @JsonProperty("tipoidentificacion_nombrecorto")
    private String dSAsesorPIUTipoIdentificacionDotNombreCorto;

    @JsonProperty("numidentificacion")
    private String dSAsesorPIUNumIdentificacion;

    @JsonProperty("canalcomercial")
    private String dSAsesorPIUCanalComercial;

    @JsonProperty("cargo")
    private String dSAsesorPIUCargo;

    @JsonProperty("estado")
    private String dSAsesorPIUEstado;

    @JsonProperty("disponible")
    private Boolean dSAsesorPIUDisponible;

    public DSAsesorPIU() {
    
    }

    public DSAsesorPIU(Asesor instance) {
        if (instance != null) {
            try {
                this.dSAsesorPIUUsuario = instance.getFuncionarioUsuario();
                this.dSAsesorPIUDrvNombreCompleto = instance.getFuncionariodrvNombreCompleto();
                this.dSAsesorPIUUsuarioLDAP = instance.getFuncionarioUsuarioLDAP();
                this.dSAsesorPIUEsIntegral = instance.getAsesorEsIntegral();
                this.dSAsesorPIUEmail = instance.getFuncionarioEmail();
                this.dSAsesorPIUVerDBasicosPersona = instance.getAsesorVerDBasicosPersona();
                this.dSAsesorPIUVerDocIdentificacionPersona = instance.getAsesorVerDocIdentificacionPersona();
                this.dSAsesorPIUVerContratoNovedad = instance.getAsesorVerContratoNovedad();
                this.dSAsesorPIUModDBasicosPersona = instance.getAsesorModDBasicosPersona();
                this.dSAsesorPIUModificaDirector = instance.getAsesormodificaDirector();
                this.dSAsesorPIUEsDirector = instance.getAsesoresDirector();
                this.dSAsesorPIUCodJefe = instance.getFuncionarioCodJefe();
                this.dSAsesorPIUDrvNomJefe = instance.getFuncionariodrvNomJefe();
                this.dSAsesorPIUSucursalDotDescripcion = instance.getSucursal().getSucursalDescripcion();
                this.dSAsesorPIUTipoIdentificacionDotNombreCorto = instance.getTipoIdentificacion().getTipoIdentificacionNombreCorto();
                this.dSAsesorPIUNumIdentificacion = instance.getAsesorNumIdentificacion();
                this.dSAsesorPIUCanalComercial = instance.getAsesorCanalComercial();
                this.dSAsesorPIUCargo = instance.getAsesorCargo();
                this.dSAsesorPIUEstado = instance.getAsesorEstado();
                this.dSAsesorPIUDisponible = instance.getFuncionarioDisponible();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getDSAsesorPIUUsuario() {
        return this.dSAsesorPIUUsuario;
    }
    
    public void setDSAsesorPIUUsuario(String dSAsesorPIUUsuario) {
        this.dSAsesorPIUUsuario = dSAsesorPIUUsuario;
    }

    @JsonIgnore
    public String getDSAsesorPIUDrvNombreCompleto() {
        return this.dSAsesorPIUDrvNombreCompleto;
    }
    
    public void setDSAsesorPIUDrvNombreCompleto(String dSAsesorPIUDrvNombreCompleto) {
        this.dSAsesorPIUDrvNombreCompleto = dSAsesorPIUDrvNombreCompleto;
    }

    @JsonIgnore
    public String getDSAsesorPIUUsuarioLDAP() {
        return this.dSAsesorPIUUsuarioLDAP;
    }
    
    public void setDSAsesorPIUUsuarioLDAP(String dSAsesorPIUUsuarioLDAP) {
        this.dSAsesorPIUUsuarioLDAP = dSAsesorPIUUsuarioLDAP;
    }

    @JsonIgnore
    public Boolean getDSAsesorPIUEsIntegral() {
        return this.dSAsesorPIUEsIntegral;
    }
    
    public void setDSAsesorPIUEsIntegral(Boolean dSAsesorPIUEsIntegral) {
        this.dSAsesorPIUEsIntegral = dSAsesorPIUEsIntegral;
    }

    @JsonIgnore
    public String getDSAsesorPIUEmail() {
        return this.dSAsesorPIUEmail;
    }
    
    public void setDSAsesorPIUEmail(String dSAsesorPIUEmail) {
        this.dSAsesorPIUEmail = dSAsesorPIUEmail;
    }

    @JsonIgnore
    public Boolean getDSAsesorPIUVerDBasicosPersona() {
        return this.dSAsesorPIUVerDBasicosPersona;
    }
    
    public void setDSAsesorPIUVerDBasicosPersona(Boolean dSAsesorPIUVerDBasicosPersona) {
        this.dSAsesorPIUVerDBasicosPersona = dSAsesorPIUVerDBasicosPersona;
    }

    @JsonIgnore
    public Boolean getDSAsesorPIUVerDocIdentificacionPersona() {
        return this.dSAsesorPIUVerDocIdentificacionPersona;
    }
    
    public void setDSAsesorPIUVerDocIdentificacionPersona(Boolean dSAsesorPIUVerDocIdentificacionPersona) {
        this.dSAsesorPIUVerDocIdentificacionPersona = dSAsesorPIUVerDocIdentificacionPersona;
    }

    @JsonIgnore
    public Boolean getDSAsesorPIUVerContratoNovedad() {
        return this.dSAsesorPIUVerContratoNovedad;
    }
    
    public void setDSAsesorPIUVerContratoNovedad(Boolean dSAsesorPIUVerContratoNovedad) {
        this.dSAsesorPIUVerContratoNovedad = dSAsesorPIUVerContratoNovedad;
    }

    @JsonIgnore
    public Boolean getDSAsesorPIUModDBasicosPersona() {
        return this.dSAsesorPIUModDBasicosPersona;
    }
    
    public void setDSAsesorPIUModDBasicosPersona(Boolean dSAsesorPIUModDBasicosPersona) {
        this.dSAsesorPIUModDBasicosPersona = dSAsesorPIUModDBasicosPersona;
    }

    @JsonIgnore
    public Boolean getDSAsesorPIUModificaDirector() {
        return this.dSAsesorPIUModificaDirector;
    }
    
    public void setDSAsesorPIUModificaDirector(Boolean dSAsesorPIUModificaDirector) {
        this.dSAsesorPIUModificaDirector = dSAsesorPIUModificaDirector;
    }

    @JsonIgnore
    public Boolean getDSAsesorPIUEsDirector() {
        return this.dSAsesorPIUEsDirector;
    }
    
    public void setDSAsesorPIUEsDirector(Boolean dSAsesorPIUEsDirector) {
        this.dSAsesorPIUEsDirector = dSAsesorPIUEsDirector;
    }

    @JsonIgnore
    public String getDSAsesorPIUCodJefe() {
        return this.dSAsesorPIUCodJefe;
    }
    
    public void setDSAsesorPIUCodJefe(String dSAsesorPIUCodJefe) {
        this.dSAsesorPIUCodJefe = dSAsesorPIUCodJefe;
    }

    @JsonIgnore
    public String getDSAsesorPIUDrvNomJefe() {
        return this.dSAsesorPIUDrvNomJefe;
    }
    
    public void setDSAsesorPIUDrvNomJefe(String dSAsesorPIUDrvNomJefe) {
        this.dSAsesorPIUDrvNomJefe = dSAsesorPIUDrvNomJefe;
    }

    @JsonIgnore
    public String getDSAsesorPIUSucursalDotDescripcion() {
        return this.dSAsesorPIUSucursalDotDescripcion;
    }
    
    public void setDSAsesorPIUSucursalDotDescripcion(String dSAsesorPIUSucursalDotDescripcion) {
        this.dSAsesorPIUSucursalDotDescripcion = dSAsesorPIUSucursalDotDescripcion;
    }

    @JsonIgnore
    public String getDSAsesorPIUTipoIdentificacionDotNombreCorto() {
        return this.dSAsesorPIUTipoIdentificacionDotNombreCorto;
    }
    
    public void setDSAsesorPIUTipoIdentificacionDotNombreCorto(String dSAsesorPIUTipoIdentificacionDotNombreCorto) {
        this.dSAsesorPIUTipoIdentificacionDotNombreCorto = dSAsesorPIUTipoIdentificacionDotNombreCorto;
    }

    @JsonIgnore
    public String getDSAsesorPIUNumIdentificacion() {
        return this.dSAsesorPIUNumIdentificacion;
    }
    
    public void setDSAsesorPIUNumIdentificacion(String dSAsesorPIUNumIdentificacion) {
        this.dSAsesorPIUNumIdentificacion = dSAsesorPIUNumIdentificacion;
    }

    @JsonIgnore
    public String getDSAsesorPIUCanalComercial() {
        return this.dSAsesorPIUCanalComercial;
    }
    
    public void setDSAsesorPIUCanalComercial(String dSAsesorPIUCanalComercial) {
        this.dSAsesorPIUCanalComercial = dSAsesorPIUCanalComercial;
    }

    @JsonIgnore
    public String getDSAsesorPIUCargo() {
        return this.dSAsesorPIUCargo;
    }
    
    public void setDSAsesorPIUCargo(String dSAsesorPIUCargo) {
        this.dSAsesorPIUCargo = dSAsesorPIUCargo;
    }

    @JsonIgnore
    public String getDSAsesorPIUEstado() {
        return this.dSAsesorPIUEstado;
    }
    
    public void setDSAsesorPIUEstado(String dSAsesorPIUEstado) {
        this.dSAsesorPIUEstado = dSAsesorPIUEstado;
    }

    @JsonIgnore
    public Boolean getDSAsesorPIUDisponible() {
        return this.dSAsesorPIUDisponible;
    }
    
    public void setDSAsesorPIUDisponible(Boolean dSAsesorPIUDisponible) {
        this.dSAsesorPIUDisponible = dSAsesorPIUDisponible;
    }
}
