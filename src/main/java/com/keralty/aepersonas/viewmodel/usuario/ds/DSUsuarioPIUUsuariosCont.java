package com.keralty.aepersonas.viewmodel.usuario.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Usuario;
public class DSUsuarioPIUUsuariosCont {

    @JsonProperty("identificador")
    private Long dSUsuarioPIUUsuariosContIdentificador;

    @JsonProperty("drvidentificacion")
    private String dSUsuarioPIUUsuariosContDrvIdentificacion;

    @JsonProperty("primernombre")
    private String dSUsuarioPIUUsuariosContPrimerNombre;

    @JsonProperty("segundonombre")
    private String dSUsuarioPIUUsuariosContSegundoNombre;

    @JsonProperty("primerapellido")
    private String dSUsuarioPIUUsuariosContPrimerApellido;

    @JsonProperty("segundoapellido")
    private String dSUsuarioPIUUsuariosContSegundoApellido;

    @JsonProperty("parentesco_descripcion")
    private String dSUsuarioPIUUsuariosContParentescoDotDescripcion;

    public DSUsuarioPIUUsuariosCont() {
    
    }

    public DSUsuarioPIUUsuariosCont(Usuario instance) {
        if (instance != null) {
            try {
                this.dSUsuarioPIUUsuariosContIdentificador = instance.getUsuarioIdentificador();
                this.dSUsuarioPIUUsuariosContDrvIdentificacion = instance.getUsuariodrvIdentificacion();
                this.dSUsuarioPIUUsuariosContPrimerNombre = instance.getUsuarioPrimerNombre();
                this.dSUsuarioPIUUsuariosContSegundoNombre = instance.getUsuarioSegundoNombre();
                this.dSUsuarioPIUUsuariosContPrimerApellido = instance.getUsuarioPrimerApellido();
                this.dSUsuarioPIUUsuariosContSegundoApellido = instance.getUsuarioSegundoApellido();
                this.dSUsuarioPIUUsuariosContParentescoDotDescripcion = instance.getParentesco().getParentescoDescripcion();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public Long getDSUsuarioPIUUsuariosContIdentificador() {
        return this.dSUsuarioPIUUsuariosContIdentificador;
    }
    
    public void setDSUsuarioPIUUsuariosContIdentificador(Long dSUsuarioPIUUsuariosContIdentificador) {
        this.dSUsuarioPIUUsuariosContIdentificador = dSUsuarioPIUUsuariosContIdentificador;
    }

    @JsonIgnore
    public String getDSUsuarioPIUUsuariosContDrvIdentificacion() {
        return this.dSUsuarioPIUUsuariosContDrvIdentificacion;
    }
    
    public void setDSUsuarioPIUUsuariosContDrvIdentificacion(String dSUsuarioPIUUsuariosContDrvIdentificacion) {
        this.dSUsuarioPIUUsuariosContDrvIdentificacion = dSUsuarioPIUUsuariosContDrvIdentificacion;
    }

    @JsonIgnore
    public String getDSUsuarioPIUUsuariosContPrimerNombre() {
        return this.dSUsuarioPIUUsuariosContPrimerNombre;
    }
    
    public void setDSUsuarioPIUUsuariosContPrimerNombre(String dSUsuarioPIUUsuariosContPrimerNombre) {
        this.dSUsuarioPIUUsuariosContPrimerNombre = dSUsuarioPIUUsuariosContPrimerNombre;
    }

    @JsonIgnore
    public String getDSUsuarioPIUUsuariosContSegundoNombre() {
        return this.dSUsuarioPIUUsuariosContSegundoNombre;
    }
    
    public void setDSUsuarioPIUUsuariosContSegundoNombre(String dSUsuarioPIUUsuariosContSegundoNombre) {
        this.dSUsuarioPIUUsuariosContSegundoNombre = dSUsuarioPIUUsuariosContSegundoNombre;
    }

    @JsonIgnore
    public String getDSUsuarioPIUUsuariosContPrimerApellido() {
        return this.dSUsuarioPIUUsuariosContPrimerApellido;
    }
    
    public void setDSUsuarioPIUUsuariosContPrimerApellido(String dSUsuarioPIUUsuariosContPrimerApellido) {
        this.dSUsuarioPIUUsuariosContPrimerApellido = dSUsuarioPIUUsuariosContPrimerApellido;
    }

    @JsonIgnore
    public String getDSUsuarioPIUUsuariosContSegundoApellido() {
        return this.dSUsuarioPIUUsuariosContSegundoApellido;
    }
    
    public void setDSUsuarioPIUUsuariosContSegundoApellido(String dSUsuarioPIUUsuariosContSegundoApellido) {
        this.dSUsuarioPIUUsuariosContSegundoApellido = dSUsuarioPIUUsuariosContSegundoApellido;
    }

    @JsonIgnore
    public String getDSUsuarioPIUUsuariosContParentescoDotDescripcion() {
        return this.dSUsuarioPIUUsuariosContParentescoDotDescripcion;
    }
    
    public void setDSUsuarioPIUUsuariosContParentescoDotDescripcion(String dSUsuarioPIUUsuariosContParentescoDotDescripcion) {
        this.dSUsuarioPIUUsuariosContParentescoDotDescripcion = dSUsuarioPIUUsuariosContParentescoDotDescripcion;
    }
}
