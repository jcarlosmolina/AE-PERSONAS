package com.keralty.aepersonas.viewmodel.usuario.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.EstadoCivil;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Pais;
import com.keralty.aepersonas.persistence.TipoIdentificacion;
import com.keralty.aepersonas.persistence.Usuario;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneDeserializer;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneSerializer;
import java.sql.Date;

public class TMODUSUARIORequest {

    @JsonProperty("p_thisusuario_oid")
    private UsuarioOid usuarioTMODUSUARIOpthisUsuario;
    
    @JsonIgnore
    private Usuario usuarioTMODUSUARIOpthisUsuarioInstance;

    @JsonProperty("pt_p_primernombre")
    private String usuarioTMODUSUARIOptpPrimerNombre;

    @JsonProperty("pt_p_segundonombre")
    private String usuarioTMODUSUARIOptpSegundoNombre;

    @JsonProperty("pt_p_primerapellido")
    private String usuarioTMODUSUARIOptpPrimerApellido;

    @JsonProperty("pt_p_segundoapellido")
    private String usuarioTMODUSUARIOptpSegundoApellido;

    @JsonProperty("pt_p_fechanacimiento")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date usuarioTMODUSUARIOptpFechaNacimiento;

    @JsonProperty("pt_p_genero")
    private String usuarioTMODUSUARIOptpGenero;

    @JsonProperty("pt_p_indicadorextranjero")
    private Boolean usuarioTMODUSUARIOptpIndicadorExtranjero;

    @JsonProperty("pt_p_telefonofijo")
    private String usuarioTMODUSUARIOptpTelefonoFijo;

    @JsonProperty("pt_p_telefonocelular")
    private String usuarioTMODUSUARIOptpTelefonoCelular;

    @JsonProperty("pt_p_correoelectronico")
    private String usuarioTMODUSUARIOptpCorreoElectronico;

    @JsonProperty("pt_p_evcdepartamentonac_json")
    private String usuarioTMODUSUARIOptpevcDepartamentoNac;
    
    @JsonIgnore
    private Departamento usuarioTMODUSUARIOptpevcDepartamentoNacInstance;

    @JsonProperty("pt_p_evcmunicipionac_json")
    private String usuarioTMODUSUARIOptpevcMunicipioNac;
    
    @JsonIgnore
    private Municipio usuarioTMODUSUARIOptpevcMunicipioNacInstance;

    @JsonProperty("pt_p_evcestadocivil_json")
    private String usuarioTMODUSUARIOptpevcEstadoCivil;
    
    @JsonIgnore
    private EstadoCivil usuarioTMODUSUARIOptpevcEstadoCivilInstance;

    @JsonProperty("pt_p_direccioncompleta")
    private String usuarioTMODUSUARIOptpDireccionCompleta;

    @JsonProperty("pt_p_rural")
    private Boolean usuarioTMODUSUARIOptpRural;

    @JsonProperty("pt_p_evcdepartamento_json")
    private String usuarioTMODUSUARIOptpevcDepartamento;
    
    @JsonIgnore
    private Departamento usuarioTMODUSUARIOptpevcDepartamentoInstance;

    @JsonProperty("pt_p_evcmunicipio_json")
    private String usuarioTMODUSUARIOptpevcMunicipio;
    
    @JsonIgnore
    private Municipio usuarioTMODUSUARIOptpevcMunicipioInstance;

    @JsonProperty("pt_direccion_json")
    private String usuarioTMODUSUARIOptDireccion;
    
    @JsonIgnore
    private Direccion usuarioTMODUSUARIOptDireccionInstance;

    @JsonProperty("pt_replicardireccion")
    private Boolean usuarioTMODUSUARIOptReplicarDireccion;

    @JsonProperty("pt_p_numidentificacion")
    private String usuarioTMODUSUARIOptpNumIdentificacion;

    @JsonProperty("pt_p_evctipoidentificacion_json")
    private String usuarioTMODUSUARIOptpevcTipoIdentificacion;
    
    @JsonIgnore
    private TipoIdentificacion usuarioTMODUSUARIOptpevcTipoIdentificacionInstance;

    @JsonProperty("pt_p_agrpais_json")
    private String usuarioTMODUSUARIOptpagrPais;
    
    @JsonIgnore
    private Pais usuarioTMODUSUARIOptpagrPaisInstance;

    @JsonProperty("pt_direccionusuario_json")
    private String usuarioTMODUSUARIOptDireccionUsuario;
    
    @JsonIgnore
    private Direccion usuarioTMODUSUARIOptDireccionUsuarioInstance;

    @JsonProperty("preconditionId")
    private String preconditionId;

    public void checkArguments() throws NotNullArgumentException {
        checkUsuarioTMODUSUARIOpthisUsuario();
        checkUsuarioTMODUSUARIOptpFechaNacimiento();
        checkUsuarioTMODUSUARIOptpGenero();
        checkUsuarioTMODUSUARIOptpIndicadorExtranjero();
        checkUsuarioTMODUSUARIOptpevcEstadoCivil();
        checkUsuarioTMODUSUARIOptpDireccionCompleta();
        checkUsuarioTMODUSUARIOptpRural();
        checkUsuarioTMODUSUARIOptpevcDepartamento();
        checkUsuarioTMODUSUARIOptpevcMunicipio();
        checkUsuarioTMODUSUARIOptReplicarDireccion();
        checkUsuarioTMODUSUARIOptpNumIdentificacion();
        checkUsuarioTMODUSUARIOptpevcTipoIdentificacion();
    }

    @JsonIgnore
    public UsuarioOid getUsuarioTMODUSUARIOpthisUsuario() {
        return this.usuarioTMODUSUARIOpthisUsuario;
    }
    
    public void setUsuarioTMODUSUARIOpthisUsuario(UsuarioOid usuarioTMODUSUARIOpthisUsuario) {
        this.usuarioTMODUSUARIOpthisUsuario = usuarioTMODUSUARIOpthisUsuario;
    }

    @JsonIgnore
    public Usuario getUsuarioTMODUSUARIOpthisUsuarioInstance() {
        return this.usuarioTMODUSUARIOpthisUsuarioInstance;
    }
    
    public void setUsuarioTMODUSUARIOpthisUsuarioInstance(Usuario usuarioTMODUSUARIOpthisUsuario) {
        this.usuarioTMODUSUARIOpthisUsuarioInstance = usuarioTMODUSUARIOpthisUsuario;
        this.usuarioTMODUSUARIOpthisUsuario = usuarioTMODUSUARIOpthisUsuario != null ? usuarioTMODUSUARIOpthisUsuario.getOid() : null;
    }

    private void checkUsuarioTMODUSUARIOpthisUsuario() throws NotNullArgumentException {
        if(this.getUsuarioTMODUSUARIOpthisUsuarioInstance() == null || this.getUsuarioTMODUSUARIOpthisUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TMODUSUARIO, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TMODUSUARIO_USUARIOTMODUSUARIOPTHISUSUARIO, UsuarioConstants.SERV_ALIAS_TMODUSUARIO, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TMODUSUARIO_USUARIOTMODUSUARIOPTHISUSUARIO);
        }
    }

    @JsonIgnore
    public String getUsuarioTMODUSUARIOptpPrimerNombre() {
        return this.usuarioTMODUSUARIOptpPrimerNombre;
    }
    
    public void setUsuarioTMODUSUARIOptpPrimerNombre(String usuarioTMODUSUARIOptpPrimerNombre) {
        this.usuarioTMODUSUARIOptpPrimerNombre = usuarioTMODUSUARIOptpPrimerNombre;
    }

    @JsonIgnore
    public String getUsuarioTMODUSUARIOptpSegundoNombre() {
        return this.usuarioTMODUSUARIOptpSegundoNombre;
    }
    
    public void setUsuarioTMODUSUARIOptpSegundoNombre(String usuarioTMODUSUARIOptpSegundoNombre) {
        this.usuarioTMODUSUARIOptpSegundoNombre = usuarioTMODUSUARIOptpSegundoNombre;
    }

    @JsonIgnore
    public String getUsuarioTMODUSUARIOptpPrimerApellido() {
        return this.usuarioTMODUSUARIOptpPrimerApellido;
    }
    
    public void setUsuarioTMODUSUARIOptpPrimerApellido(String usuarioTMODUSUARIOptpPrimerApellido) {
        this.usuarioTMODUSUARIOptpPrimerApellido = usuarioTMODUSUARIOptpPrimerApellido;
    }

    @JsonIgnore
    public String getUsuarioTMODUSUARIOptpSegundoApellido() {
        return this.usuarioTMODUSUARIOptpSegundoApellido;
    }
    
    public void setUsuarioTMODUSUARIOptpSegundoApellido(String usuarioTMODUSUARIOptpSegundoApellido) {
        this.usuarioTMODUSUARIOptpSegundoApellido = usuarioTMODUSUARIOptpSegundoApellido;
    }

    @JsonIgnore
    public Date getUsuarioTMODUSUARIOptpFechaNacimiento() {
        return this.usuarioTMODUSUARIOptpFechaNacimiento;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setUsuarioTMODUSUARIOptpFechaNacimiento(Date usuarioTMODUSUARIOptpFechaNacimiento) {
        this.usuarioTMODUSUARIOptpFechaNacimiento = usuarioTMODUSUARIOptpFechaNacimiento;
    }

    private void checkUsuarioTMODUSUARIOptpFechaNacimiento() throws NotNullArgumentException {
        if(this.getUsuarioTMODUSUARIOptpFechaNacimiento() == null) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TMODUSUARIO, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TMODUSUARIO_USUARIOTMODUSUARIOPTPFECHANACIMIENTO, UsuarioConstants.SERV_ALIAS_TMODUSUARIO, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TMODUSUARIO_USUARIOTMODUSUARIOPTPFECHANACIMIENTO);
        }
    }

    @JsonIgnore
    public String getUsuarioTMODUSUARIOptpGenero() {
        return this.usuarioTMODUSUARIOptpGenero;
    }
    
    public void setUsuarioTMODUSUARIOptpGenero(String usuarioTMODUSUARIOptpGenero) {
        this.usuarioTMODUSUARIOptpGenero = usuarioTMODUSUARIOptpGenero;
    }

    private void checkUsuarioTMODUSUARIOptpGenero() throws NotNullArgumentException {
        if(this.getUsuarioTMODUSUARIOptpGenero() == null) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TMODUSUARIO, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TMODUSUARIO_USUARIOTMODUSUARIOPTPGENERO, UsuarioConstants.SERV_ALIAS_TMODUSUARIO, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TMODUSUARIO_USUARIOTMODUSUARIOPTPGENERO);
        }
    }

    @JsonIgnore
    public Boolean getUsuarioTMODUSUARIOptpIndicadorExtranjero() {
        return this.usuarioTMODUSUARIOptpIndicadorExtranjero;
    }
    
    public void setUsuarioTMODUSUARIOptpIndicadorExtranjero(Boolean usuarioTMODUSUARIOptpIndicadorExtranjero) {
        this.usuarioTMODUSUARIOptpIndicadorExtranjero = usuarioTMODUSUARIOptpIndicadorExtranjero;
    }

    private void checkUsuarioTMODUSUARIOptpIndicadorExtranjero() throws NotNullArgumentException {
        if(this.getUsuarioTMODUSUARIOptpIndicadorExtranjero() == null) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TMODUSUARIO, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TMODUSUARIO_USUARIOTMODUSUARIOPTPINDICADOREXTRANJERO, UsuarioConstants.SERV_ALIAS_TMODUSUARIO, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TMODUSUARIO_USUARIOTMODUSUARIOPTPINDICADOREXTRANJERO);
        }
    }

    @JsonIgnore
    public String getUsuarioTMODUSUARIOptpTelefonoFijo() {
        return this.usuarioTMODUSUARIOptpTelefonoFijo;
    }
    
    public void setUsuarioTMODUSUARIOptpTelefonoFijo(String usuarioTMODUSUARIOptpTelefonoFijo) {
        this.usuarioTMODUSUARIOptpTelefonoFijo = usuarioTMODUSUARIOptpTelefonoFijo;
    }

    @JsonIgnore
    public String getUsuarioTMODUSUARIOptpTelefonoCelular() {
        return this.usuarioTMODUSUARIOptpTelefonoCelular;
    }
    
    public void setUsuarioTMODUSUARIOptpTelefonoCelular(String usuarioTMODUSUARIOptpTelefonoCelular) {
        this.usuarioTMODUSUARIOptpTelefonoCelular = usuarioTMODUSUARIOptpTelefonoCelular;
    }

    @JsonIgnore
    public String getUsuarioTMODUSUARIOptpCorreoElectronico() {
        return this.usuarioTMODUSUARIOptpCorreoElectronico;
    }
    
    public void setUsuarioTMODUSUARIOptpCorreoElectronico(String usuarioTMODUSUARIOptpCorreoElectronico) {
        this.usuarioTMODUSUARIOptpCorreoElectronico = usuarioTMODUSUARIOptpCorreoElectronico;
    }

    @JsonIgnore
    public String getUsuarioTMODUSUARIOptpevcDepartamentoNac() {
        return this.usuarioTMODUSUARIOptpevcDepartamentoNac;
    }
    
    public void setUsuarioTMODUSUARIOptpevcDepartamentoNac(String usuarioTMODUSUARIOptpevcDepartamentoNac) {
        this.usuarioTMODUSUARIOptpevcDepartamentoNac = usuarioTMODUSUARIOptpevcDepartamentoNac;
    }

    @JsonIgnore
    public Departamento getUsuarioTMODUSUARIOptpevcDepartamentoNacInstance() {
        return this.usuarioTMODUSUARIOptpevcDepartamentoNacInstance;
    }
    
    public void setUsuarioTMODUSUARIOptpevcDepartamentoNacInstance(Departamento usuarioTMODUSUARIOptpevcDepartamentoNac) {
        this.usuarioTMODUSUARIOptpevcDepartamentoNacInstance = usuarioTMODUSUARIOptpevcDepartamentoNac;
        this.usuarioTMODUSUARIOptpevcDepartamentoNac = usuarioTMODUSUARIOptpevcDepartamentoNac != null ? usuarioTMODUSUARIOptpevcDepartamentoNac.getOid().toJson() : "";
    }

    @JsonIgnore
    public String getUsuarioTMODUSUARIOptpevcMunicipioNac() {
        return this.usuarioTMODUSUARIOptpevcMunicipioNac;
    }
    
    public void setUsuarioTMODUSUARIOptpevcMunicipioNac(String usuarioTMODUSUARIOptpevcMunicipioNac) {
        this.usuarioTMODUSUARIOptpevcMunicipioNac = usuarioTMODUSUARIOptpevcMunicipioNac;
    }

    @JsonIgnore
    public Municipio getUsuarioTMODUSUARIOptpevcMunicipioNacInstance() {
        return this.usuarioTMODUSUARIOptpevcMunicipioNacInstance;
    }
    
    public void setUsuarioTMODUSUARIOptpevcMunicipioNacInstance(Municipio usuarioTMODUSUARIOptpevcMunicipioNac) {
        this.usuarioTMODUSUARIOptpevcMunicipioNacInstance = usuarioTMODUSUARIOptpevcMunicipioNac;
        this.usuarioTMODUSUARIOptpevcMunicipioNac = usuarioTMODUSUARIOptpevcMunicipioNac != null ? usuarioTMODUSUARIOptpevcMunicipioNac.getOid().toJson() : "";
    }

    @JsonIgnore
    public String getUsuarioTMODUSUARIOptpevcEstadoCivil() {
        return this.usuarioTMODUSUARIOptpevcEstadoCivil;
    }
    
    public void setUsuarioTMODUSUARIOptpevcEstadoCivil(String usuarioTMODUSUARIOptpevcEstadoCivil) {
        this.usuarioTMODUSUARIOptpevcEstadoCivil = usuarioTMODUSUARIOptpevcEstadoCivil;
    }

    @JsonIgnore
    public EstadoCivil getUsuarioTMODUSUARIOptpevcEstadoCivilInstance() {
        return this.usuarioTMODUSUARIOptpevcEstadoCivilInstance;
    }
    
    public void setUsuarioTMODUSUARIOptpevcEstadoCivilInstance(EstadoCivil usuarioTMODUSUARIOptpevcEstadoCivil) {
        this.usuarioTMODUSUARIOptpevcEstadoCivilInstance = usuarioTMODUSUARIOptpevcEstadoCivil;
        this.usuarioTMODUSUARIOptpevcEstadoCivil = usuarioTMODUSUARIOptpevcEstadoCivil != null ? usuarioTMODUSUARIOptpevcEstadoCivil.getOid().toJson() : "";
    }

    private void checkUsuarioTMODUSUARIOptpevcEstadoCivil() throws NotNullArgumentException {
        if(this.getUsuarioTMODUSUARIOptpevcEstadoCivilInstance() == null || this.getUsuarioTMODUSUARIOptpevcEstadoCivilInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TMODUSUARIO, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TMODUSUARIO_USUARIOTMODUSUARIOPTPEVCESTADOCIVIL, UsuarioConstants.SERV_ALIAS_TMODUSUARIO, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TMODUSUARIO_USUARIOTMODUSUARIOPTPEVCESTADOCIVIL);
        }
    }

    @JsonIgnore
    public String getUsuarioTMODUSUARIOptpDireccionCompleta() {
        return this.usuarioTMODUSUARIOptpDireccionCompleta;
    }
    
    public void setUsuarioTMODUSUARIOptpDireccionCompleta(String usuarioTMODUSUARIOptpDireccionCompleta) {
        this.usuarioTMODUSUARIOptpDireccionCompleta = usuarioTMODUSUARIOptpDireccionCompleta;
    }

    private void checkUsuarioTMODUSUARIOptpDireccionCompleta() throws NotNullArgumentException {
        if(this.getUsuarioTMODUSUARIOptpDireccionCompleta() == null) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TMODUSUARIO, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TMODUSUARIO_USUARIOTMODUSUARIOPTPDIRECCIONCOMPLETA, UsuarioConstants.SERV_ALIAS_TMODUSUARIO, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TMODUSUARIO_USUARIOTMODUSUARIOPTPDIRECCIONCOMPLETA);
        }
    }

    @JsonIgnore
    public Boolean getUsuarioTMODUSUARIOptpRural() {
        return this.usuarioTMODUSUARIOptpRural;
    }
    
    public void setUsuarioTMODUSUARIOptpRural(Boolean usuarioTMODUSUARIOptpRural) {
        this.usuarioTMODUSUARIOptpRural = usuarioTMODUSUARIOptpRural;
    }

    private void checkUsuarioTMODUSUARIOptpRural() throws NotNullArgumentException {
        if(this.getUsuarioTMODUSUARIOptpRural() == null) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TMODUSUARIO, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TMODUSUARIO_USUARIOTMODUSUARIOPTPRURAL, UsuarioConstants.SERV_ALIAS_TMODUSUARIO, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TMODUSUARIO_USUARIOTMODUSUARIOPTPRURAL);
        }
    }

    @JsonIgnore
    public String getUsuarioTMODUSUARIOptpevcDepartamento() {
        return this.usuarioTMODUSUARIOptpevcDepartamento;
    }
    
    public void setUsuarioTMODUSUARIOptpevcDepartamento(String usuarioTMODUSUARIOptpevcDepartamento) {
        this.usuarioTMODUSUARIOptpevcDepartamento = usuarioTMODUSUARIOptpevcDepartamento;
    }

    @JsonIgnore
    public Departamento getUsuarioTMODUSUARIOptpevcDepartamentoInstance() {
        return this.usuarioTMODUSUARIOptpevcDepartamentoInstance;
    }
    
    public void setUsuarioTMODUSUARIOptpevcDepartamentoInstance(Departamento usuarioTMODUSUARIOptpevcDepartamento) {
        this.usuarioTMODUSUARIOptpevcDepartamentoInstance = usuarioTMODUSUARIOptpevcDepartamento;
        this.usuarioTMODUSUARIOptpevcDepartamento = usuarioTMODUSUARIOptpevcDepartamento != null ? usuarioTMODUSUARIOptpevcDepartamento.getOid().toJson() : "";
    }

    private void checkUsuarioTMODUSUARIOptpevcDepartamento() throws NotNullArgumentException {
        if(this.getUsuarioTMODUSUARIOptpevcDepartamentoInstance() == null || this.getUsuarioTMODUSUARIOptpevcDepartamentoInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TMODUSUARIO, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TMODUSUARIO_USUARIOTMODUSUARIOPTPEVCDEPARTAMENTO, UsuarioConstants.SERV_ALIAS_TMODUSUARIO, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TMODUSUARIO_USUARIOTMODUSUARIOPTPEVCDEPARTAMENTO);
        }
    }

    @JsonIgnore
    public String getUsuarioTMODUSUARIOptpevcMunicipio() {
        return this.usuarioTMODUSUARIOptpevcMunicipio;
    }
    
    public void setUsuarioTMODUSUARIOptpevcMunicipio(String usuarioTMODUSUARIOptpevcMunicipio) {
        this.usuarioTMODUSUARIOptpevcMunicipio = usuarioTMODUSUARIOptpevcMunicipio;
    }

    @JsonIgnore
    public Municipio getUsuarioTMODUSUARIOptpevcMunicipioInstance() {
        return this.usuarioTMODUSUARIOptpevcMunicipioInstance;
    }
    
    public void setUsuarioTMODUSUARIOptpevcMunicipioInstance(Municipio usuarioTMODUSUARIOptpevcMunicipio) {
        this.usuarioTMODUSUARIOptpevcMunicipioInstance = usuarioTMODUSUARIOptpevcMunicipio;
        this.usuarioTMODUSUARIOptpevcMunicipio = usuarioTMODUSUARIOptpevcMunicipio != null ? usuarioTMODUSUARIOptpevcMunicipio.getOid().toJson() : "";
    }

    private void checkUsuarioTMODUSUARIOptpevcMunicipio() throws NotNullArgumentException {
        if(this.getUsuarioTMODUSUARIOptpevcMunicipioInstance() == null || this.getUsuarioTMODUSUARIOptpevcMunicipioInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TMODUSUARIO, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TMODUSUARIO_USUARIOTMODUSUARIOPTPEVCMUNICIPIO, UsuarioConstants.SERV_ALIAS_TMODUSUARIO, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TMODUSUARIO_USUARIOTMODUSUARIOPTPEVCMUNICIPIO);
        }
    }

    @JsonIgnore
    public String getUsuarioTMODUSUARIOptDireccion() {
        return this.usuarioTMODUSUARIOptDireccion;
    }
    
    public void setUsuarioTMODUSUARIOptDireccion(String usuarioTMODUSUARIOptDireccion) {
        this.usuarioTMODUSUARIOptDireccion = usuarioTMODUSUARIOptDireccion;
    }

    @JsonIgnore
    public Direccion getUsuarioTMODUSUARIOptDireccionInstance() {
        return this.usuarioTMODUSUARIOptDireccionInstance;
    }
    
    public void setUsuarioTMODUSUARIOptDireccionInstance(Direccion usuarioTMODUSUARIOptDireccion) {
        this.usuarioTMODUSUARIOptDireccionInstance = usuarioTMODUSUARIOptDireccion;
        this.usuarioTMODUSUARIOptDireccion = usuarioTMODUSUARIOptDireccion != null ? usuarioTMODUSUARIOptDireccion.getOid().toJson() : "";
    }

    @JsonIgnore
    public Boolean getUsuarioTMODUSUARIOptReplicarDireccion() {
        return this.usuarioTMODUSUARIOptReplicarDireccion;
    }
    
    public void setUsuarioTMODUSUARIOptReplicarDireccion(Boolean usuarioTMODUSUARIOptReplicarDireccion) {
        this.usuarioTMODUSUARIOptReplicarDireccion = usuarioTMODUSUARIOptReplicarDireccion;
    }

    private void checkUsuarioTMODUSUARIOptReplicarDireccion() throws NotNullArgumentException {
        if(this.getUsuarioTMODUSUARIOptReplicarDireccion() == null) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TMODUSUARIO, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TMODUSUARIO_USUARIOTMODUSUARIOPTREPLICARDIRECCION, UsuarioConstants.SERV_ALIAS_TMODUSUARIO, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TMODUSUARIO_USUARIOTMODUSUARIOPTREPLICARDIRECCION);
        }
    }

    @JsonIgnore
    public String getUsuarioTMODUSUARIOptpNumIdentificacion() {
        return this.usuarioTMODUSUARIOptpNumIdentificacion;
    }
    
    public void setUsuarioTMODUSUARIOptpNumIdentificacion(String usuarioTMODUSUARIOptpNumIdentificacion) {
        this.usuarioTMODUSUARIOptpNumIdentificacion = usuarioTMODUSUARIOptpNumIdentificacion;
    }

    private void checkUsuarioTMODUSUARIOptpNumIdentificacion() throws NotNullArgumentException {
        if(this.getUsuarioTMODUSUARIOptpNumIdentificacion() == null) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TMODUSUARIO, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TMODUSUARIO_USUARIOTMODUSUARIOPTPNUMIDENTIFICACION, UsuarioConstants.SERV_ALIAS_TMODUSUARIO, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TMODUSUARIO_USUARIOTMODUSUARIOPTPNUMIDENTIFICACION);
        }
    }

    @JsonIgnore
    public String getUsuarioTMODUSUARIOptpevcTipoIdentificacion() {
        return this.usuarioTMODUSUARIOptpevcTipoIdentificacion;
    }
    
    public void setUsuarioTMODUSUARIOptpevcTipoIdentificacion(String usuarioTMODUSUARIOptpevcTipoIdentificacion) {
        this.usuarioTMODUSUARIOptpevcTipoIdentificacion = usuarioTMODUSUARIOptpevcTipoIdentificacion;
    }

    @JsonIgnore
    public TipoIdentificacion getUsuarioTMODUSUARIOptpevcTipoIdentificacionInstance() {
        return this.usuarioTMODUSUARIOptpevcTipoIdentificacionInstance;
    }
    
    public void setUsuarioTMODUSUARIOptpevcTipoIdentificacionInstance(TipoIdentificacion usuarioTMODUSUARIOptpevcTipoIdentificacion) {
        this.usuarioTMODUSUARIOptpevcTipoIdentificacionInstance = usuarioTMODUSUARIOptpevcTipoIdentificacion;
        this.usuarioTMODUSUARIOptpevcTipoIdentificacion = usuarioTMODUSUARIOptpevcTipoIdentificacion != null ? usuarioTMODUSUARIOptpevcTipoIdentificacion.getOid().toJson() : "";
    }

    private void checkUsuarioTMODUSUARIOptpevcTipoIdentificacion() throws NotNullArgumentException {
        if(this.getUsuarioTMODUSUARIOptpevcTipoIdentificacionInstance() == null || this.getUsuarioTMODUSUARIOptpevcTipoIdentificacionInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TMODUSUARIO, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TMODUSUARIO_USUARIOTMODUSUARIOPTPEVCTIPOIDENTIFICACION, UsuarioConstants.SERV_ALIAS_TMODUSUARIO, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TMODUSUARIO_USUARIOTMODUSUARIOPTPEVCTIPOIDENTIFICACION);
        }
    }

    @JsonIgnore
    public String getUsuarioTMODUSUARIOptpagrPais() {
        return this.usuarioTMODUSUARIOptpagrPais;
    }
    
    public void setUsuarioTMODUSUARIOptpagrPais(String usuarioTMODUSUARIOptpagrPais) {
        this.usuarioTMODUSUARIOptpagrPais = usuarioTMODUSUARIOptpagrPais;
    }

    @JsonIgnore
    public Pais getUsuarioTMODUSUARIOptpagrPaisInstance() {
        return this.usuarioTMODUSUARIOptpagrPaisInstance;
    }
    
    public void setUsuarioTMODUSUARIOptpagrPaisInstance(Pais usuarioTMODUSUARIOptpagrPais) {
        this.usuarioTMODUSUARIOptpagrPaisInstance = usuarioTMODUSUARIOptpagrPais;
        this.usuarioTMODUSUARIOptpagrPais = usuarioTMODUSUARIOptpagrPais != null ? usuarioTMODUSUARIOptpagrPais.getOid().toJson() : "";
    }

    @JsonIgnore
    public String getUsuarioTMODUSUARIOptDireccionUsuario() {
        return this.usuarioTMODUSUARIOptDireccionUsuario;
    }
    
    public void setUsuarioTMODUSUARIOptDireccionUsuario(String usuarioTMODUSUARIOptDireccionUsuario) {
        this.usuarioTMODUSUARIOptDireccionUsuario = usuarioTMODUSUARIOptDireccionUsuario;
    }

    @JsonIgnore
    public Direccion getUsuarioTMODUSUARIOptDireccionUsuarioInstance() {
        return this.usuarioTMODUSUARIOptDireccionUsuarioInstance;
    }
    
    public void setUsuarioTMODUSUARIOptDireccionUsuarioInstance(Direccion usuarioTMODUSUARIOptDireccionUsuario) {
        this.usuarioTMODUSUARIOptDireccionUsuarioInstance = usuarioTMODUSUARIOptDireccionUsuario;
        this.usuarioTMODUSUARIOptDireccionUsuario = usuarioTMODUSUARIOptDireccionUsuario != null ? usuarioTMODUSUARIOptDireccionUsuario.getOid().toJson() : "";
    }

    @JsonIgnore
    public String getPreconditionId() {
        return this.preconditionId;
    }
    
    public void setPreconditionId(String preconditionId) {
        this.preconditionId = preconditionId;
    }
}
