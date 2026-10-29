package com.keralty.aepersonas.viewmodel.anexomat.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.AnexoMatConstants;
import com.keralty.aepersonas.persistence.InstitucionMatNeo;
import com.keralty.aepersonas.persistence.oid.InstitucionMatNeoOid;
import com.keralty.aepersonas.persistence.oid.PeriodicidadOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Periodicidad;
import com.keralty.aepersonas.persistence.Usuario;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneDeserializer;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneSerializer;
import java.sql.Date;

public class CrearRequest {

    @JsonProperty("p_agrusuario_oid")
    private UsuarioOid anexoMatcrearpagrUsuario;
    
    @JsonIgnore
    private Usuario anexoMatcrearpagrUsuarioInstance;

    @JsonProperty("p_agrinstitucionmaternal_oid")
    private InstitucionMatNeoOid anexoMatcrearpagrInstitucionMaternal;
    
    @JsonIgnore
    private InstitucionMatNeo anexoMatcrearpagrInstitucionMaternalInstance;

    @JsonProperty("p_agrperiodicidad_oid")
    private PeriodicidadOid anexoMatcrearpagrPeriodicidad;
    
    @JsonIgnore
    private Periodicidad anexoMatcrearpagrPeriodicidadInstance;

    @JsonProperty("p_atrfechaultregla")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date anexoMatcrearpatrFechaUltRegla;

    @JsonProperty("p_atrnumcuotas")
    private Long anexoMatcrearpatrNumCuotas;

    @JsonProperty("preconditionId")
    private String preconditionId;

    public void checkArguments() throws NotNullArgumentException {
        checkAnexoMatcrearpagrUsuario();
        checkAnexoMatcrearpagrInstitucionMaternal();
        checkAnexoMatcrearpagrPeriodicidad();
        checkAnexoMatcrearpatrFechaUltRegla();
        checkAnexoMatcrearpatrNumCuotas();
    }

    @JsonIgnore
    public UsuarioOid getAnexoMatcrearpagrUsuario() {
        return this.anexoMatcrearpagrUsuario;
    }
    
    public void setAnexoMatcrearpagrUsuario(UsuarioOid anexoMatcrearpagrUsuario) {
        this.anexoMatcrearpagrUsuario = anexoMatcrearpagrUsuario;
    }

    @JsonIgnore
    public Usuario getAnexoMatcrearpagrUsuarioInstance() {
        return this.anexoMatcrearpagrUsuarioInstance;
    }
    
    public void setAnexoMatcrearpagrUsuarioInstance(Usuario anexoMatcrearpagrUsuario) {
        this.anexoMatcrearpagrUsuarioInstance = anexoMatcrearpagrUsuario;
        this.anexoMatcrearpagrUsuario = anexoMatcrearpagrUsuario != null ? anexoMatcrearpagrUsuario.getOid() : null;
    }

    private void checkAnexoMatcrearpagrUsuario() throws NotNullArgumentException {
        if(this.getAnexoMatcrearpagrUsuarioInstance() == null || this.getAnexoMatcrearpagrUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(AnexoMatConstants.SERV_ID_CREAR, AnexoMatConstants.CLASS_ID, AnexoMatConstants.ARG_ID_CREAR_ANEXOMATCREARPAGRUSUARIO, AnexoMatConstants.SERV_ALIAS_CREAR, AnexoMatConstants.CLASS_ALIAS, AnexoMatConstants.ARG_ALIAS_CREAR_ANEXOMATCREARPAGRUSUARIO);
        }
    }

    @JsonIgnore
    public InstitucionMatNeoOid getAnexoMatcrearpagrInstitucionMaternal() {
        return this.anexoMatcrearpagrInstitucionMaternal;
    }
    
    public void setAnexoMatcrearpagrInstitucionMaternal(InstitucionMatNeoOid anexoMatcrearpagrInstitucionMaternal) {
        this.anexoMatcrearpagrInstitucionMaternal = anexoMatcrearpagrInstitucionMaternal;
    }

    @JsonIgnore
    public InstitucionMatNeo getAnexoMatcrearpagrInstitucionMaternalInstance() {
        return this.anexoMatcrearpagrInstitucionMaternalInstance;
    }
    
    public void setAnexoMatcrearpagrInstitucionMaternalInstance(InstitucionMatNeo anexoMatcrearpagrInstitucionMaternal) {
        this.anexoMatcrearpagrInstitucionMaternalInstance = anexoMatcrearpagrInstitucionMaternal;
        this.anexoMatcrearpagrInstitucionMaternal = anexoMatcrearpagrInstitucionMaternal != null ? anexoMatcrearpagrInstitucionMaternal.getOid() : null;
    }

    private void checkAnexoMatcrearpagrInstitucionMaternal() throws NotNullArgumentException {
        if(this.getAnexoMatcrearpagrInstitucionMaternalInstance() == null || this.getAnexoMatcrearpagrInstitucionMaternalInstance().isNull()) {
            throw new NotNullArgumentException(AnexoMatConstants.SERV_ID_CREAR, AnexoMatConstants.CLASS_ID, AnexoMatConstants.ARG_ID_CREAR_ANEXOMATCREARPAGRINSTITUCIONMATERNAL, AnexoMatConstants.SERV_ALIAS_CREAR, AnexoMatConstants.CLASS_ALIAS, AnexoMatConstants.ARG_ALIAS_CREAR_ANEXOMATCREARPAGRINSTITUCIONMATERNAL);
        }
    }

    @JsonIgnore
    public PeriodicidadOid getAnexoMatcrearpagrPeriodicidad() {
        return this.anexoMatcrearpagrPeriodicidad;
    }
    
    public void setAnexoMatcrearpagrPeriodicidad(PeriodicidadOid anexoMatcrearpagrPeriodicidad) {
        this.anexoMatcrearpagrPeriodicidad = anexoMatcrearpagrPeriodicidad;
    }

    @JsonIgnore
    public Periodicidad getAnexoMatcrearpagrPeriodicidadInstance() {
        return this.anexoMatcrearpagrPeriodicidadInstance;
    }
    
    public void setAnexoMatcrearpagrPeriodicidadInstance(Periodicidad anexoMatcrearpagrPeriodicidad) {
        this.anexoMatcrearpagrPeriodicidadInstance = anexoMatcrearpagrPeriodicidad;
        this.anexoMatcrearpagrPeriodicidad = anexoMatcrearpagrPeriodicidad != null ? anexoMatcrearpagrPeriodicidad.getOid() : null;
    }

    private void checkAnexoMatcrearpagrPeriodicidad() throws NotNullArgumentException {
        if(this.getAnexoMatcrearpagrPeriodicidadInstance() == null || this.getAnexoMatcrearpagrPeriodicidadInstance().isNull()) {
            throw new NotNullArgumentException(AnexoMatConstants.SERV_ID_CREAR, AnexoMatConstants.CLASS_ID, AnexoMatConstants.ARG_ID_CREAR_ANEXOMATCREARPAGRPERIODICIDAD, AnexoMatConstants.SERV_ALIAS_CREAR, AnexoMatConstants.CLASS_ALIAS, AnexoMatConstants.ARG_ALIAS_CREAR_ANEXOMATCREARPAGRPERIODICIDAD);
        }
    }

    @JsonIgnore
    public Date getAnexoMatcrearpatrFechaUltRegla() {
        return this.anexoMatcrearpatrFechaUltRegla;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setAnexoMatcrearpatrFechaUltRegla(Date anexoMatcrearpatrFechaUltRegla) {
        this.anexoMatcrearpatrFechaUltRegla = anexoMatcrearpatrFechaUltRegla;
    }

    private void checkAnexoMatcrearpatrFechaUltRegla() throws NotNullArgumentException {
        if(this.getAnexoMatcrearpatrFechaUltRegla() == null) {
            throw new NotNullArgumentException(AnexoMatConstants.SERV_ID_CREAR, AnexoMatConstants.CLASS_ID, AnexoMatConstants.ARG_ID_CREAR_ANEXOMATCREARPATRFECHAULTREGLA, AnexoMatConstants.SERV_ALIAS_CREAR, AnexoMatConstants.CLASS_ALIAS, AnexoMatConstants.ARG_ALIAS_CREAR_ANEXOMATCREARPATRFECHAULTREGLA);
        }
    }

    @JsonIgnore
    public Long getAnexoMatcrearpatrNumCuotas() {
        return this.anexoMatcrearpatrNumCuotas;
    }
    
    public void setAnexoMatcrearpatrNumCuotas(Long anexoMatcrearpatrNumCuotas) {
        this.anexoMatcrearpatrNumCuotas = anexoMatcrearpatrNumCuotas;
    }

    private void checkAnexoMatcrearpatrNumCuotas() throws NotNullArgumentException {
        if(this.getAnexoMatcrearpatrNumCuotas() == null) {
            throw new NotNullArgumentException(AnexoMatConstants.SERV_ID_CREAR, AnexoMatConstants.CLASS_ID, AnexoMatConstants.ARG_ID_CREAR_ANEXOMATCREARPATRNUMCUOTAS, AnexoMatConstants.SERV_ALIAS_CREAR, AnexoMatConstants.CLASS_ALIAS, AnexoMatConstants.ARG_ALIAS_CREAR_ANEXOMATCREARPATRNUMCUOTAS);
        }
    }

    @JsonIgnore
    public String getPreconditionId() {
        return this.preconditionId;
    }
    
    public void setPreconditionId(String preconditionId) {
        this.preconditionId = preconditionId;
    }
}
