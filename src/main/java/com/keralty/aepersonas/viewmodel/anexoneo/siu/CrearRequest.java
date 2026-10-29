package com.keralty.aepersonas.viewmodel.anexoneo.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.AnexoNeoConstants;
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
    private UsuarioOid anexoNeocrearpagrUsuario;
    
    @JsonIgnore
    private Usuario anexoNeocrearpagrUsuarioInstance;

    @JsonProperty("p_agrinstitucionneonatal_oid")
    private InstitucionMatNeoOid anexoNeocrearpagrInstitucionNeonatal;
    
    @JsonIgnore
    private InstitucionMatNeo anexoNeocrearpagrInstitucionNeonatalInstance;

    @JsonProperty("p_agrperiodicidad_oid")
    private PeriodicidadOid anexoNeocrearpagrPeriodicidad;
    
    @JsonIgnore
    private Periodicidad anexoNeocrearpagrPeriodicidadInstance;

    @JsonProperty("p_atrfechaultregla")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date anexoNeocrearpatrFechaUltRegla;

    @JsonProperty("p_atrnumhijos")
    private Long anexoNeocrearpatrNumHijos;

    @JsonProperty("p_atrnumcuotas")
    private Long anexoNeocrearpatrNumCuotas;

    @JsonProperty("preconditionId")
    private String preconditionId;

    public void checkArguments() throws NotNullArgumentException {
        checkAnexoNeocrearpagrUsuario();
        checkAnexoNeocrearpagrInstitucionNeonatal();
        checkAnexoNeocrearpagrPeriodicidad();
        checkAnexoNeocrearpatrFechaUltRegla();
        checkAnexoNeocrearpatrNumHijos();
        checkAnexoNeocrearpatrNumCuotas();
    }

    @JsonIgnore
    public UsuarioOid getAnexoNeocrearpagrUsuario() {
        return this.anexoNeocrearpagrUsuario;
    }
    
    public void setAnexoNeocrearpagrUsuario(UsuarioOid anexoNeocrearpagrUsuario) {
        this.anexoNeocrearpagrUsuario = anexoNeocrearpagrUsuario;
    }

    @JsonIgnore
    public Usuario getAnexoNeocrearpagrUsuarioInstance() {
        return this.anexoNeocrearpagrUsuarioInstance;
    }
    
    public void setAnexoNeocrearpagrUsuarioInstance(Usuario anexoNeocrearpagrUsuario) {
        this.anexoNeocrearpagrUsuarioInstance = anexoNeocrearpagrUsuario;
        this.anexoNeocrearpagrUsuario = anexoNeocrearpagrUsuario != null ? anexoNeocrearpagrUsuario.getOid() : null;
    }

    private void checkAnexoNeocrearpagrUsuario() throws NotNullArgumentException {
        if(this.getAnexoNeocrearpagrUsuarioInstance() == null || this.getAnexoNeocrearpagrUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(AnexoNeoConstants.SERV_ID_CREAR, AnexoNeoConstants.CLASS_ID, AnexoNeoConstants.ARG_ID_CREAR_ANEXONEOCREARPAGRUSUARIO, AnexoNeoConstants.SERV_ALIAS_CREAR, AnexoNeoConstants.CLASS_ALIAS, AnexoNeoConstants.ARG_ALIAS_CREAR_ANEXONEOCREARPAGRUSUARIO);
        }
    }

    @JsonIgnore
    public InstitucionMatNeoOid getAnexoNeocrearpagrInstitucionNeonatal() {
        return this.anexoNeocrearpagrInstitucionNeonatal;
    }
    
    public void setAnexoNeocrearpagrInstitucionNeonatal(InstitucionMatNeoOid anexoNeocrearpagrInstitucionNeonatal) {
        this.anexoNeocrearpagrInstitucionNeonatal = anexoNeocrearpagrInstitucionNeonatal;
    }

    @JsonIgnore
    public InstitucionMatNeo getAnexoNeocrearpagrInstitucionNeonatalInstance() {
        return this.anexoNeocrearpagrInstitucionNeonatalInstance;
    }
    
    public void setAnexoNeocrearpagrInstitucionNeonatalInstance(InstitucionMatNeo anexoNeocrearpagrInstitucionNeonatal) {
        this.anexoNeocrearpagrInstitucionNeonatalInstance = anexoNeocrearpagrInstitucionNeonatal;
        this.anexoNeocrearpagrInstitucionNeonatal = anexoNeocrearpagrInstitucionNeonatal != null ? anexoNeocrearpagrInstitucionNeonatal.getOid() : null;
    }

    private void checkAnexoNeocrearpagrInstitucionNeonatal() throws NotNullArgumentException {
        if(this.getAnexoNeocrearpagrInstitucionNeonatalInstance() == null || this.getAnexoNeocrearpagrInstitucionNeonatalInstance().isNull()) {
            throw new NotNullArgumentException(AnexoNeoConstants.SERV_ID_CREAR, AnexoNeoConstants.CLASS_ID, AnexoNeoConstants.ARG_ID_CREAR_ANEXONEOCREARPAGRINSTITUCIONNEONATAL, AnexoNeoConstants.SERV_ALIAS_CREAR, AnexoNeoConstants.CLASS_ALIAS, AnexoNeoConstants.ARG_ALIAS_CREAR_ANEXONEOCREARPAGRINSTITUCIONNEONATAL);
        }
    }

    @JsonIgnore
    public PeriodicidadOid getAnexoNeocrearpagrPeriodicidad() {
        return this.anexoNeocrearpagrPeriodicidad;
    }
    
    public void setAnexoNeocrearpagrPeriodicidad(PeriodicidadOid anexoNeocrearpagrPeriodicidad) {
        this.anexoNeocrearpagrPeriodicidad = anexoNeocrearpagrPeriodicidad;
    }

    @JsonIgnore
    public Periodicidad getAnexoNeocrearpagrPeriodicidadInstance() {
        return this.anexoNeocrearpagrPeriodicidadInstance;
    }
    
    public void setAnexoNeocrearpagrPeriodicidadInstance(Periodicidad anexoNeocrearpagrPeriodicidad) {
        this.anexoNeocrearpagrPeriodicidadInstance = anexoNeocrearpagrPeriodicidad;
        this.anexoNeocrearpagrPeriodicidad = anexoNeocrearpagrPeriodicidad != null ? anexoNeocrearpagrPeriodicidad.getOid() : null;
    }

    private void checkAnexoNeocrearpagrPeriodicidad() throws NotNullArgumentException {
        if(this.getAnexoNeocrearpagrPeriodicidadInstance() == null || this.getAnexoNeocrearpagrPeriodicidadInstance().isNull()) {
            throw new NotNullArgumentException(AnexoNeoConstants.SERV_ID_CREAR, AnexoNeoConstants.CLASS_ID, AnexoNeoConstants.ARG_ID_CREAR_ANEXONEOCREARPAGRPERIODICIDAD, AnexoNeoConstants.SERV_ALIAS_CREAR, AnexoNeoConstants.CLASS_ALIAS, AnexoNeoConstants.ARG_ALIAS_CREAR_ANEXONEOCREARPAGRPERIODICIDAD);
        }
    }

    @JsonIgnore
    public Date getAnexoNeocrearpatrFechaUltRegla() {
        return this.anexoNeocrearpatrFechaUltRegla;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setAnexoNeocrearpatrFechaUltRegla(Date anexoNeocrearpatrFechaUltRegla) {
        this.anexoNeocrearpatrFechaUltRegla = anexoNeocrearpatrFechaUltRegla;
    }

    private void checkAnexoNeocrearpatrFechaUltRegla() throws NotNullArgumentException {
        if(this.getAnexoNeocrearpatrFechaUltRegla() == null) {
            throw new NotNullArgumentException(AnexoNeoConstants.SERV_ID_CREAR, AnexoNeoConstants.CLASS_ID, AnexoNeoConstants.ARG_ID_CREAR_ANEXONEOCREARPATRFECHAULTREGLA, AnexoNeoConstants.SERV_ALIAS_CREAR, AnexoNeoConstants.CLASS_ALIAS, AnexoNeoConstants.ARG_ALIAS_CREAR_ANEXONEOCREARPATRFECHAULTREGLA);
        }
    }

    @JsonIgnore
    public Long getAnexoNeocrearpatrNumHijos() {
        return this.anexoNeocrearpatrNumHijos;
    }
    
    public void setAnexoNeocrearpatrNumHijos(Long anexoNeocrearpatrNumHijos) {
        this.anexoNeocrearpatrNumHijos = anexoNeocrearpatrNumHijos;
    }

    private void checkAnexoNeocrearpatrNumHijos() throws NotNullArgumentException {
        if(this.getAnexoNeocrearpatrNumHijos() == null) {
            throw new NotNullArgumentException(AnexoNeoConstants.SERV_ID_CREAR, AnexoNeoConstants.CLASS_ID, AnexoNeoConstants.ARG_ID_CREAR_ANEXONEOCREARPATRNUMHIJOS, AnexoNeoConstants.SERV_ALIAS_CREAR, AnexoNeoConstants.CLASS_ALIAS, AnexoNeoConstants.ARG_ALIAS_CREAR_ANEXONEOCREARPATRNUMHIJOS);
        }
    }

    @JsonIgnore
    public Long getAnexoNeocrearpatrNumCuotas() {
        return this.anexoNeocrearpatrNumCuotas;
    }
    
    public void setAnexoNeocrearpatrNumCuotas(Long anexoNeocrearpatrNumCuotas) {
        this.anexoNeocrearpatrNumCuotas = anexoNeocrearpatrNumCuotas;
    }

    private void checkAnexoNeocrearpatrNumCuotas() throws NotNullArgumentException {
        if(this.getAnexoNeocrearpatrNumCuotas() == null) {
            throw new NotNullArgumentException(AnexoNeoConstants.SERV_ID_CREAR, AnexoNeoConstants.CLASS_ID, AnexoNeoConstants.ARG_ID_CREAR_ANEXONEOCREARPATRNUMCUOTAS, AnexoNeoConstants.SERV_ALIAS_CREAR, AnexoNeoConstants.CLASS_ALIAS, AnexoNeoConstants.ARG_ALIAS_CREAR_ANEXONEOCREARPATRNUMCUOTAS);
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
