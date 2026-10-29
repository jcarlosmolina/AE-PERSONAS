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

public class TCREAROMODANEXONEORequest {

    @JsonProperty("p_thisusuario_oid")
    private UsuarioOid usuarioTCREAROMODANEXONEOpthisUsuario;
    
    @JsonIgnore
    private Usuario usuarioTCREAROMODANEXONEOpthisUsuarioInstance;

    @JsonProperty("pt_p_atrfechaultregla")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date usuarioTCREAROMODANEXONEOptpatrFechaUltRegla;

    @JsonProperty("pt_p_atrnumhijos")
    private Long usuarioTCREAROMODANEXONEOptpatrNumHijos;

    @JsonProperty("pt_p_atrnumcuotas")
    private Long usuarioTCREAROMODANEXONEOptpatrNumCuotas;

    @JsonProperty("pt_institucionneo_json")
    private String usuarioTCREAROMODANEXONEOptInstitucionNeo;
    
    @JsonIgnore
    private InstitucionMatNeo usuarioTCREAROMODANEXONEOptInstitucionNeoInstance;

    @JsonProperty("preconditionId")
    private String preconditionId;

    public void checkArguments() throws NotNullArgumentException {
        checkUsuarioTCREAROMODANEXONEOpthisUsuario();
        checkUsuarioTCREAROMODANEXONEOptpatrFechaUltRegla();
        checkUsuarioTCREAROMODANEXONEOptpatrNumHijos();
        checkUsuarioTCREAROMODANEXONEOptpatrNumCuotas();
        checkUsuarioTCREAROMODANEXONEOptInstitucionNeo();
    }

    @JsonIgnore
    public UsuarioOid getUsuarioTCREAROMODANEXONEOpthisUsuario() {
        return this.usuarioTCREAROMODANEXONEOpthisUsuario;
    }
    
    public void setUsuarioTCREAROMODANEXONEOpthisUsuario(UsuarioOid usuarioTCREAROMODANEXONEOpthisUsuario) {
        this.usuarioTCREAROMODANEXONEOpthisUsuario = usuarioTCREAROMODANEXONEOpthisUsuario;
    }

    @JsonIgnore
    public Usuario getUsuarioTCREAROMODANEXONEOpthisUsuarioInstance() {
        return this.usuarioTCREAROMODANEXONEOpthisUsuarioInstance;
    }
    
    public void setUsuarioTCREAROMODANEXONEOpthisUsuarioInstance(Usuario usuarioTCREAROMODANEXONEOpthisUsuario) {
        this.usuarioTCREAROMODANEXONEOpthisUsuarioInstance = usuarioTCREAROMODANEXONEOpthisUsuario;
        this.usuarioTCREAROMODANEXONEOpthisUsuario = usuarioTCREAROMODANEXONEOpthisUsuario != null ? usuarioTCREAROMODANEXONEOpthisUsuario.getOid() : null;
    }

    private void checkUsuarioTCREAROMODANEXONEOpthisUsuario() throws NotNullArgumentException {
        if(this.getUsuarioTCREAROMODANEXONEOpthisUsuarioInstance() == null || this.getUsuarioTCREAROMODANEXONEOpthisUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TCREAROMODANEXONEO, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TCREAROMODANEXONEO_USUARIOTCREAROMODANEXONEOPTHISUSUARIO, UsuarioConstants.SERV_ALIAS_TCREAROMODANEXONEO, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TCREAROMODANEXONEO_USUARIOTCREAROMODANEXONEOPTHISUSUARIO);
        }
    }

    @JsonIgnore
    public Date getUsuarioTCREAROMODANEXONEOptpatrFechaUltRegla() {
        return this.usuarioTCREAROMODANEXONEOptpatrFechaUltRegla;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setUsuarioTCREAROMODANEXONEOptpatrFechaUltRegla(Date usuarioTCREAROMODANEXONEOptpatrFechaUltRegla) {
        this.usuarioTCREAROMODANEXONEOptpatrFechaUltRegla = usuarioTCREAROMODANEXONEOptpatrFechaUltRegla;
    }

    private void checkUsuarioTCREAROMODANEXONEOptpatrFechaUltRegla() throws NotNullArgumentException {
        if(this.getUsuarioTCREAROMODANEXONEOptpatrFechaUltRegla() == null) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TCREAROMODANEXONEO, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TCREAROMODANEXONEO_USUARIOTCREAROMODANEXONEOPTPATRFECHAULTREGLA, UsuarioConstants.SERV_ALIAS_TCREAROMODANEXONEO, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TCREAROMODANEXONEO_USUARIOTCREAROMODANEXONEOPTPATRFECHAULTREGLA);
        }
    }

    @JsonIgnore
    public Long getUsuarioTCREAROMODANEXONEOptpatrNumHijos() {
        return this.usuarioTCREAROMODANEXONEOptpatrNumHijos;
    }
    
    public void setUsuarioTCREAROMODANEXONEOptpatrNumHijos(Long usuarioTCREAROMODANEXONEOptpatrNumHijos) {
        this.usuarioTCREAROMODANEXONEOptpatrNumHijos = usuarioTCREAROMODANEXONEOptpatrNumHijos;
    }

    private void checkUsuarioTCREAROMODANEXONEOptpatrNumHijos() throws NotNullArgumentException {
        if(this.getUsuarioTCREAROMODANEXONEOptpatrNumHijos() == null) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TCREAROMODANEXONEO, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TCREAROMODANEXONEO_USUARIOTCREAROMODANEXONEOPTPATRNUMHIJOS, UsuarioConstants.SERV_ALIAS_TCREAROMODANEXONEO, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TCREAROMODANEXONEO_USUARIOTCREAROMODANEXONEOPTPATRNUMHIJOS);
        }
    }

    @JsonIgnore
    public Long getUsuarioTCREAROMODANEXONEOptpatrNumCuotas() {
        return this.usuarioTCREAROMODANEXONEOptpatrNumCuotas;
    }
    
    public void setUsuarioTCREAROMODANEXONEOptpatrNumCuotas(Long usuarioTCREAROMODANEXONEOptpatrNumCuotas) {
        this.usuarioTCREAROMODANEXONEOptpatrNumCuotas = usuarioTCREAROMODANEXONEOptpatrNumCuotas;
    }

    private void checkUsuarioTCREAROMODANEXONEOptpatrNumCuotas() throws NotNullArgumentException {
        if(this.getUsuarioTCREAROMODANEXONEOptpatrNumCuotas() == null) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TCREAROMODANEXONEO, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TCREAROMODANEXONEO_USUARIOTCREAROMODANEXONEOPTPATRNUMCUOTAS, UsuarioConstants.SERV_ALIAS_TCREAROMODANEXONEO, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TCREAROMODANEXONEO_USUARIOTCREAROMODANEXONEOPTPATRNUMCUOTAS);
        }
    }

    @JsonIgnore
    public String getUsuarioTCREAROMODANEXONEOptInstitucionNeo() {
        return this.usuarioTCREAROMODANEXONEOptInstitucionNeo;
    }
    
    public void setUsuarioTCREAROMODANEXONEOptInstitucionNeo(String usuarioTCREAROMODANEXONEOptInstitucionNeo) {
        this.usuarioTCREAROMODANEXONEOptInstitucionNeo = usuarioTCREAROMODANEXONEOptInstitucionNeo;
    }

    @JsonIgnore
    public InstitucionMatNeo getUsuarioTCREAROMODANEXONEOptInstitucionNeoInstance() {
        return this.usuarioTCREAROMODANEXONEOptInstitucionNeoInstance;
    }
    
    public void setUsuarioTCREAROMODANEXONEOptInstitucionNeoInstance(InstitucionMatNeo usuarioTCREAROMODANEXONEOptInstitucionNeo) {
        this.usuarioTCREAROMODANEXONEOptInstitucionNeoInstance = usuarioTCREAROMODANEXONEOptInstitucionNeo;
        this.usuarioTCREAROMODANEXONEOptInstitucionNeo = usuarioTCREAROMODANEXONEOptInstitucionNeo != null ? usuarioTCREAROMODANEXONEOptInstitucionNeo.getOid().toJson() : "";
    }

    private void checkUsuarioTCREAROMODANEXONEOptInstitucionNeo() throws NotNullArgumentException {
        if(this.getUsuarioTCREAROMODANEXONEOptInstitucionNeoInstance() == null || this.getUsuarioTCREAROMODANEXONEOptInstitucionNeoInstance().isNull()) {
            throw new NotNullArgumentException(UsuarioConstants.SERV_ID_TCREAROMODANEXONEO, UsuarioConstants.CLASS_ID, UsuarioConstants.ARG_ID_TCREAROMODANEXONEO_USUARIOTCREAROMODANEXONEOPTINSTITUCIONNEO, UsuarioConstants.SERV_ALIAS_TCREAROMODANEXONEO, UsuarioConstants.CLASS_ALIAS, UsuarioConstants.ARG_ALIAS_TCREAROMODANEXONEO_USUARIOTCREAROMODANEXONEOPTINSTITUCIONNEO);
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
