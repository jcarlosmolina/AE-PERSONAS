package com.keralty.aepersonas.viewmodel.anexoneo.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.AnexoNeoConstants;
import com.keralty.aepersonas.persistence.AnexoNeo;
import com.keralty.aepersonas.persistence.InstitucionMatNeo;
import com.keralty.aepersonas.persistence.oid.AnexoNeoOid;
import com.keralty.aepersonas.persistence.oid.InstitucionMatNeoOid;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneDeserializer;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneSerializer;
import java.sql.Date;

public class TMODIFICARRequest {

    @JsonProperty("p_thisanexoneo_oid")
    private AnexoNeoOid anexoNeoTMODIFICARpthisAnexoNeo;
    
    @JsonIgnore
    private AnexoNeo anexoNeoTMODIFICARpthisAnexoNeoInstance;

    @JsonProperty("pt_p_fechaultregla")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date anexoNeoTMODIFICARptpFechaUltRegla;

    @JsonProperty("pt_p_numhijos")
    private Long anexoNeoTMODIFICARptpNumHijos;

    @JsonProperty("pt_p_numcuotas")
    private Long anexoNeoTMODIFICARptpNumCuotas;

    @JsonProperty("pt_institucionneo_oid")
    private InstitucionMatNeoOid anexoNeoTMODIFICARptInstitucionNeo;
    
    @JsonIgnore
    private InstitucionMatNeo anexoNeoTMODIFICARptInstitucionNeoInstance;

    @JsonProperty("preconditionId")
    private String preconditionId;

    public void checkArguments() throws NotNullArgumentException {
        checkAnexoNeoTMODIFICARpthisAnexoNeo();
        checkAnexoNeoTMODIFICARptpFechaUltRegla();
        checkAnexoNeoTMODIFICARptpNumHijos();
        checkAnexoNeoTMODIFICARptpNumCuotas();
        checkAnexoNeoTMODIFICARptInstitucionNeo();
    }

    @JsonIgnore
    public AnexoNeoOid getAnexoNeoTMODIFICARpthisAnexoNeo() {
        return this.anexoNeoTMODIFICARpthisAnexoNeo;
    }
    
    public void setAnexoNeoTMODIFICARpthisAnexoNeo(AnexoNeoOid anexoNeoTMODIFICARpthisAnexoNeo) {
        this.anexoNeoTMODIFICARpthisAnexoNeo = anexoNeoTMODIFICARpthisAnexoNeo;
    }

    @JsonIgnore
    public AnexoNeo getAnexoNeoTMODIFICARpthisAnexoNeoInstance() {
        return this.anexoNeoTMODIFICARpthisAnexoNeoInstance;
    }
    
    public void setAnexoNeoTMODIFICARpthisAnexoNeoInstance(AnexoNeo anexoNeoTMODIFICARpthisAnexoNeo) {
        this.anexoNeoTMODIFICARpthisAnexoNeoInstance = anexoNeoTMODIFICARpthisAnexoNeo;
        this.anexoNeoTMODIFICARpthisAnexoNeo = anexoNeoTMODIFICARpthisAnexoNeo != null ? anexoNeoTMODIFICARpthisAnexoNeo.getOid() : null;
    }

    private void checkAnexoNeoTMODIFICARpthisAnexoNeo() throws NotNullArgumentException {
        if(this.getAnexoNeoTMODIFICARpthisAnexoNeoInstance() == null || this.getAnexoNeoTMODIFICARpthisAnexoNeoInstance().isNull()) {
            throw new NotNullArgumentException(AnexoNeoConstants.SERV_ID_TMODIFICAR, AnexoNeoConstants.CLASS_ID, AnexoNeoConstants.ARG_ID_TMODIFICAR_ANEXONEOTMODIFICARPTHISANEXONEO, AnexoNeoConstants.SERV_ALIAS_TMODIFICAR, AnexoNeoConstants.CLASS_ALIAS, AnexoNeoConstants.ARG_ALIAS_TMODIFICAR_ANEXONEOTMODIFICARPTHISANEXONEO);
        }
    }

    @JsonIgnore
    public Date getAnexoNeoTMODIFICARptpFechaUltRegla() {
        return this.anexoNeoTMODIFICARptpFechaUltRegla;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setAnexoNeoTMODIFICARptpFechaUltRegla(Date anexoNeoTMODIFICARptpFechaUltRegla) {
        this.anexoNeoTMODIFICARptpFechaUltRegla = anexoNeoTMODIFICARptpFechaUltRegla;
    }

    private void checkAnexoNeoTMODIFICARptpFechaUltRegla() throws NotNullArgumentException {
        if(this.getAnexoNeoTMODIFICARptpFechaUltRegla() == null) {
            throw new NotNullArgumentException(AnexoNeoConstants.SERV_ID_TMODIFICAR, AnexoNeoConstants.CLASS_ID, AnexoNeoConstants.ARG_ID_TMODIFICAR_ANEXONEOTMODIFICARPTPFECHAULTREGLA, AnexoNeoConstants.SERV_ALIAS_TMODIFICAR, AnexoNeoConstants.CLASS_ALIAS, AnexoNeoConstants.ARG_ALIAS_TMODIFICAR_ANEXONEOTMODIFICARPTPFECHAULTREGLA);
        }
    }

    @JsonIgnore
    public Long getAnexoNeoTMODIFICARptpNumHijos() {
        return this.anexoNeoTMODIFICARptpNumHijos;
    }
    
    public void setAnexoNeoTMODIFICARptpNumHijos(Long anexoNeoTMODIFICARptpNumHijos) {
        this.anexoNeoTMODIFICARptpNumHijos = anexoNeoTMODIFICARptpNumHijos;
    }

    private void checkAnexoNeoTMODIFICARptpNumHijos() throws NotNullArgumentException {
        if(this.getAnexoNeoTMODIFICARptpNumHijos() == null) {
            throw new NotNullArgumentException(AnexoNeoConstants.SERV_ID_TMODIFICAR, AnexoNeoConstants.CLASS_ID, AnexoNeoConstants.ARG_ID_TMODIFICAR_ANEXONEOTMODIFICARPTPNUMHIJOS, AnexoNeoConstants.SERV_ALIAS_TMODIFICAR, AnexoNeoConstants.CLASS_ALIAS, AnexoNeoConstants.ARG_ALIAS_TMODIFICAR_ANEXONEOTMODIFICARPTPNUMHIJOS);
        }
    }

    @JsonIgnore
    public Long getAnexoNeoTMODIFICARptpNumCuotas() {
        return this.anexoNeoTMODIFICARptpNumCuotas;
    }
    
    public void setAnexoNeoTMODIFICARptpNumCuotas(Long anexoNeoTMODIFICARptpNumCuotas) {
        this.anexoNeoTMODIFICARptpNumCuotas = anexoNeoTMODIFICARptpNumCuotas;
    }

    private void checkAnexoNeoTMODIFICARptpNumCuotas() throws NotNullArgumentException {
        if(this.getAnexoNeoTMODIFICARptpNumCuotas() == null) {
            throw new NotNullArgumentException(AnexoNeoConstants.SERV_ID_TMODIFICAR, AnexoNeoConstants.CLASS_ID, AnexoNeoConstants.ARG_ID_TMODIFICAR_ANEXONEOTMODIFICARPTPNUMCUOTAS, AnexoNeoConstants.SERV_ALIAS_TMODIFICAR, AnexoNeoConstants.CLASS_ALIAS, AnexoNeoConstants.ARG_ALIAS_TMODIFICAR_ANEXONEOTMODIFICARPTPNUMCUOTAS);
        }
    }

    @JsonIgnore
    public InstitucionMatNeoOid getAnexoNeoTMODIFICARptInstitucionNeo() {
        return this.anexoNeoTMODIFICARptInstitucionNeo;
    }
    
    public void setAnexoNeoTMODIFICARptInstitucionNeo(InstitucionMatNeoOid anexoNeoTMODIFICARptInstitucionNeo) {
        this.anexoNeoTMODIFICARptInstitucionNeo = anexoNeoTMODIFICARptInstitucionNeo;
    }

    @JsonIgnore
    public InstitucionMatNeo getAnexoNeoTMODIFICARptInstitucionNeoInstance() {
        return this.anexoNeoTMODIFICARptInstitucionNeoInstance;
    }
    
    public void setAnexoNeoTMODIFICARptInstitucionNeoInstance(InstitucionMatNeo anexoNeoTMODIFICARptInstitucionNeo) {
        this.anexoNeoTMODIFICARptInstitucionNeoInstance = anexoNeoTMODIFICARptInstitucionNeo;
        this.anexoNeoTMODIFICARptInstitucionNeo = anexoNeoTMODIFICARptInstitucionNeo != null ? anexoNeoTMODIFICARptInstitucionNeo.getOid() : null;
    }

    private void checkAnexoNeoTMODIFICARptInstitucionNeo() throws NotNullArgumentException {
        if(this.getAnexoNeoTMODIFICARptInstitucionNeoInstance() == null || this.getAnexoNeoTMODIFICARptInstitucionNeoInstance().isNull()) {
            throw new NotNullArgumentException(AnexoNeoConstants.SERV_ID_TMODIFICAR, AnexoNeoConstants.CLASS_ID, AnexoNeoConstants.ARG_ID_TMODIFICAR_ANEXONEOTMODIFICARPTINSTITUCIONNEO, AnexoNeoConstants.SERV_ALIAS_TMODIFICAR, AnexoNeoConstants.CLASS_ALIAS, AnexoNeoConstants.ARG_ALIAS_TMODIFICAR_ANEXONEOTMODIFICARPTINSTITUCIONNEO);
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
