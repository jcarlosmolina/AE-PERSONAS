package com.keralty.aepersonas.viewmodel.anexoneo.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.AnexoNeoConstants;
import com.keralty.aepersonas.persistence.AnexoNeo;
import com.keralty.aepersonas.persistence.oid.AnexoNeoOid;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneDeserializer;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneSerializer;
import java.sql.Date;

public class ModificarRequest {

    @JsonProperty("p_thisanexoneo_oid")
    private AnexoNeoOid anexoNeomodificarpthisAnexoNeo;
    
    @JsonIgnore
    private AnexoNeo anexoNeomodificarpthisAnexoNeoInstance;

    @JsonProperty("p_fechaultregla")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date anexoNeomodificarpFechaUltRegla;

    @JsonProperty("p_numhijos")
    private Long anexoNeomodificarpNumHijos;

    @JsonProperty("p_numcuotas")
    private Long anexoNeomodificarpNumCuotas;

    public void checkArguments() throws NotNullArgumentException {
        checkAnexoNeomodificarpthisAnexoNeo();
        checkAnexoNeomodificarpFechaUltRegla();
        checkAnexoNeomodificarpNumHijos();
        checkAnexoNeomodificarpNumCuotas();
    }

    @JsonIgnore
    public AnexoNeoOid getAnexoNeomodificarpthisAnexoNeo() {
        return this.anexoNeomodificarpthisAnexoNeo;
    }
    
    public void setAnexoNeomodificarpthisAnexoNeo(AnexoNeoOid anexoNeomodificarpthisAnexoNeo) {
        this.anexoNeomodificarpthisAnexoNeo = anexoNeomodificarpthisAnexoNeo;
    }

    @JsonIgnore
    public AnexoNeo getAnexoNeomodificarpthisAnexoNeoInstance() {
        return this.anexoNeomodificarpthisAnexoNeoInstance;
    }
    
    public void setAnexoNeomodificarpthisAnexoNeoInstance(AnexoNeo anexoNeomodificarpthisAnexoNeo) {
        this.anexoNeomodificarpthisAnexoNeoInstance = anexoNeomodificarpthisAnexoNeo;
        this.anexoNeomodificarpthisAnexoNeo = anexoNeomodificarpthisAnexoNeo != null ? anexoNeomodificarpthisAnexoNeo.getOid() : null;
    }

    private void checkAnexoNeomodificarpthisAnexoNeo() throws NotNullArgumentException {
        if(this.getAnexoNeomodificarpthisAnexoNeoInstance() == null || this.getAnexoNeomodificarpthisAnexoNeoInstance().isNull()) {
            throw new NotNullArgumentException(AnexoNeoConstants.SERV_ID_MODIFICAR, AnexoNeoConstants.CLASS_ID, AnexoNeoConstants.ARG_ID_MODIFICAR_ANEXONEOMODIFICARPTHISANEXONEO, AnexoNeoConstants.SERV_ALIAS_MODIFICAR, AnexoNeoConstants.CLASS_ALIAS, AnexoNeoConstants.ARG_ALIAS_MODIFICAR_ANEXONEOMODIFICARPTHISANEXONEO);
        }
    }

    @JsonIgnore
    public Date getAnexoNeomodificarpFechaUltRegla() {
        return this.anexoNeomodificarpFechaUltRegla;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setAnexoNeomodificarpFechaUltRegla(Date anexoNeomodificarpFechaUltRegla) {
        this.anexoNeomodificarpFechaUltRegla = anexoNeomodificarpFechaUltRegla;
    }

    private void checkAnexoNeomodificarpFechaUltRegla() throws NotNullArgumentException {
        if(this.getAnexoNeomodificarpFechaUltRegla() == null) {
            throw new NotNullArgumentException(AnexoNeoConstants.SERV_ID_MODIFICAR, AnexoNeoConstants.CLASS_ID, AnexoNeoConstants.ARG_ID_MODIFICAR_ANEXONEOMODIFICARPFECHAULTREGLA, AnexoNeoConstants.SERV_ALIAS_MODIFICAR, AnexoNeoConstants.CLASS_ALIAS, AnexoNeoConstants.ARG_ALIAS_MODIFICAR_ANEXONEOMODIFICARPFECHAULTREGLA);
        }
    }

    @JsonIgnore
    public Long getAnexoNeomodificarpNumHijos() {
        return this.anexoNeomodificarpNumHijos;
    }
    
    public void setAnexoNeomodificarpNumHijos(Long anexoNeomodificarpNumHijos) {
        this.anexoNeomodificarpNumHijos = anexoNeomodificarpNumHijos;
    }

    private void checkAnexoNeomodificarpNumHijos() throws NotNullArgumentException {
        if(this.getAnexoNeomodificarpNumHijos() == null) {
            throw new NotNullArgumentException(AnexoNeoConstants.SERV_ID_MODIFICAR, AnexoNeoConstants.CLASS_ID, AnexoNeoConstants.ARG_ID_MODIFICAR_ANEXONEOMODIFICARPNUMHIJOS, AnexoNeoConstants.SERV_ALIAS_MODIFICAR, AnexoNeoConstants.CLASS_ALIAS, AnexoNeoConstants.ARG_ALIAS_MODIFICAR_ANEXONEOMODIFICARPNUMHIJOS);
        }
    }

    @JsonIgnore
    public Long getAnexoNeomodificarpNumCuotas() {
        return this.anexoNeomodificarpNumCuotas;
    }
    
    public void setAnexoNeomodificarpNumCuotas(Long anexoNeomodificarpNumCuotas) {
        this.anexoNeomodificarpNumCuotas = anexoNeomodificarpNumCuotas;
    }

    private void checkAnexoNeomodificarpNumCuotas() throws NotNullArgumentException {
        if(this.getAnexoNeomodificarpNumCuotas() == null) {
            throw new NotNullArgumentException(AnexoNeoConstants.SERV_ID_MODIFICAR, AnexoNeoConstants.CLASS_ID, AnexoNeoConstants.ARG_ID_MODIFICAR_ANEXONEOMODIFICARPNUMCUOTAS, AnexoNeoConstants.SERV_ALIAS_MODIFICAR, AnexoNeoConstants.CLASS_ALIAS, AnexoNeoConstants.ARG_ALIAS_MODIFICAR_ANEXONEOMODIFICARPNUMCUOTAS);
        }
    }
}
