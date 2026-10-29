package com.keralty.aepersonas.viewmodel.usuario.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.UsuarioConstants;
import com.keralty.aepersonas.persistence.InstitucionMatNeo;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Usuario;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneDeserializer;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneSerializer;
import java.sql.Date;

public class TCREAROMODANEXOMATRequest {

    @JsonProperty("p_thisusuario_oid")
    private UsuarioOid usuarioTCREAROMODANEXOMATpthisUsuario;
    
    @JsonIgnore
    private Usuario usuarioTCREAROMODANEXOMATpthisUsuarioInstance;

    @JsonProperty("pt_p_atrfechaultregla")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date usuarioTCREAROMODANEXOMATptpatrFechaUltRegla;

    @JsonProperty("pt_p_atrnumcuotas")
    private Long usuarioTCREAROMODANEXOMATptpatrNumCuotas;

    @JsonProperty("pt_institucionmat_json")
    private String usuarioTCREAROMODANEXOMATptInstitucionMat;
    
    @JsonIgnore
    private InstitucionMatNeo usuarioTCREAROMODANEXOMATptInstitucionMatInstance;

    @JsonProperty("preconditionId")
    private String preconditionId;

    public void checkArguments() throws NotNullArgumentException {
        checkUsuarioTCREAROMODANEXOMATpthisUsuario();
        checkUsuarioTCREAROMODANEXOMATptpatrFechaUltRegla();
        checkUsuarioTCREAROMODANEXOMATptpatrNumCuotas();
        checkUsuarioTCREAROMODANEXOMATptInstitucionMat();
    }

    @JsonIgnore
    public UsuarioOid getUsuarioTCREAROMODANEXOMATpthisUsuario() {
        return this.usuarioTCREAROMODANEXOMATpthisUsuario;
    }
    
    public void setUsuarioTCREAROMODANEXOMATpthisUsuario(UsuarioOid usuarioTCREAROMODANEXOMATpthisUsuario) {
        this.usuarioTCREAROMODANEXOMATpthisUsuario = usuarioTCREAROMODANEXOMATpthisUsuario;
    }

    @JsonIgnore
    public Usuario getUsuarioTCREAROMODANEXOMATpthisUsuarioInstance() {
        return this.usuarioTCREAROMODANEXOMATpthisUsuarioInstance;
    }
    
    public void setUsuarioTCREAROMODANEXOMATpthisUsuarioInstance(Usuario usuarioTCREAROMODANEXOMATpthisUsuario) {
        this.usuarioTCREAROMODANEXOMATpthisUsuarioInstance = usuarioTCREAROMODANEXOMATpthisUsuario;
        this.usuarioTCREAROMODANEXOMATpthisUsuario = usuarioTCREAROMODANEXOMATpthisUsuario != null ? usuarioTCREAROMODANEXOMATpthisUsuario.getOid() : null;
    }

    private void checkUsuarioTCREAROMODANEXOMATpthisUsuario() throws NotNullArgumentException {
        if(this.getUsuarioTCREAROMODANEXOMATpthisUsuarioInstance() == null || this.getUsuarioTCREAROMODANEXOMATpthisUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TCREAROMODANEXOMAT, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TCREAROMODANEXOMAT_USUARIOTCREAROMODANEXOMATPTHISUSUARIO, UsuarioConstants.SERV_ALIAS_TCREAROMODANEXOMAT, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TCREAROMODANEXOMAT_USUARIOTCREAROMODANEXOMATPTHISUSUARIO);
        }
    }

    @JsonIgnore
    public Date getUsuarioTCREAROMODANEXOMATptpatrFechaUltRegla() {
        return this.usuarioTCREAROMODANEXOMATptpatrFechaUltRegla;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setUsuarioTCREAROMODANEXOMATptpatrFechaUltRegla(Date usuarioTCREAROMODANEXOMATptpatrFechaUltRegla) {
        this.usuarioTCREAROMODANEXOMATptpatrFechaUltRegla = usuarioTCREAROMODANEXOMATptpatrFechaUltRegla;
    }

    private void checkUsuarioTCREAROMODANEXOMATptpatrFechaUltRegla() throws NotNullArgumentException {
        if(this.getUsuarioTCREAROMODANEXOMATptpatrFechaUltRegla() == null) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TCREAROMODANEXOMAT, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TCREAROMODANEXOMAT_USUARIOTCREAROMODANEXOMATPTPATRFECHAULTREGLA, UsuarioConstants.SERV_ALIAS_TCREAROMODANEXOMAT, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TCREAROMODANEXOMAT_USUARIOTCREAROMODANEXOMATPTPATRFECHAULTREGLA);
        }
    }

    @JsonIgnore
    public Long getUsuarioTCREAROMODANEXOMATptpatrNumCuotas() {
        return this.usuarioTCREAROMODANEXOMATptpatrNumCuotas;
    }
    
    public void setUsuarioTCREAROMODANEXOMATptpatrNumCuotas(Long usuarioTCREAROMODANEXOMATptpatrNumCuotas) {
        this.usuarioTCREAROMODANEXOMATptpatrNumCuotas = usuarioTCREAROMODANEXOMATptpatrNumCuotas;
    }

    private void checkUsuarioTCREAROMODANEXOMATptpatrNumCuotas() throws NotNullArgumentException {
        if(this.getUsuarioTCREAROMODANEXOMATptpatrNumCuotas() == null) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TCREAROMODANEXOMAT, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TCREAROMODANEXOMAT_USUARIOTCREAROMODANEXOMATPTPATRNUMCUOTAS, UsuarioConstants.SERV_ALIAS_TCREAROMODANEXOMAT, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TCREAROMODANEXOMAT_USUARIOTCREAROMODANEXOMATPTPATRNUMCUOTAS);
        }
    }

    @JsonIgnore
    public String getUsuarioTCREAROMODANEXOMATptInstitucionMat() {
        return this.usuarioTCREAROMODANEXOMATptInstitucionMat;
    }
    
    public void setUsuarioTCREAROMODANEXOMATptInstitucionMat(String usuarioTCREAROMODANEXOMATptInstitucionMat) {
        this.usuarioTCREAROMODANEXOMATptInstitucionMat = usuarioTCREAROMODANEXOMATptInstitucionMat;
    }

    @JsonIgnore
    public InstitucionMatNeo getUsuarioTCREAROMODANEXOMATptInstitucionMatInstance() {
        return this.usuarioTCREAROMODANEXOMATptInstitucionMatInstance;
    }
    
    public void setUsuarioTCREAROMODANEXOMATptInstitucionMatInstance(InstitucionMatNeo usuarioTCREAROMODANEXOMATptInstitucionMat) {
        this.usuarioTCREAROMODANEXOMATptInstitucionMatInstance = usuarioTCREAROMODANEXOMATptInstitucionMat;
        this.usuarioTCREAROMODANEXOMATptInstitucionMat = usuarioTCREAROMODANEXOMATptInstitucionMat != null ? usuarioTCREAROMODANEXOMATptInstitucionMat.getOid().toJson() : "";
    }

    private void checkUsuarioTCREAROMODANEXOMATptInstitucionMat() throws NotNullArgumentException {
        if(this.getUsuarioTCREAROMODANEXOMATptInstitucionMatInstance() == null || this.getUsuarioTCREAROMODANEXOMATptInstitucionMatInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TCREAROMODANEXOMAT, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TCREAROMODANEXOMAT_USUARIOTCREAROMODANEXOMATPTINSTITUCIONMAT, UsuarioConstants.SERV_ALIAS_TCREAROMODANEXOMAT, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TCREAROMODANEXOMAT_USUARIOTCREAROMODANEXOMATPTINSTITUCIONMAT);
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
