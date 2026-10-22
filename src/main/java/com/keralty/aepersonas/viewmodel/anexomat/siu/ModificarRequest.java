package com.keralty.aepersonas.viewmodel.anexomat.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.AnexoMatConstants;
import com.keralty.aepersonas.persistence.AnexoMat;
import com.keralty.aepersonas.persistence.oid.AnexoMatOid;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneDeserializer;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneSerializer;
import java.sql.Date;

public class ModificarRequest {

    @JsonProperty("p_thisanexomat_oid")
    private AnexoMatOid anexoMatmodificarpthisAnexoMat;
    
    @JsonIgnore
    private AnexoMat anexoMatmodificarpthisAnexoMatInstance;

    @JsonProperty("p_fechaultregla")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date anexoMatmodificarpFechaUltRegla;

    @JsonProperty("p_numcuotas")
    private Long anexoMatmodificarpNumCuotas;

    public void checkArguments() throws NotNullArgumentException {
        checkAnexoMatmodificarpthisAnexoMat();
        checkAnexoMatmodificarpFechaUltRegla();
        checkAnexoMatmodificarpNumCuotas();
    }

    @JsonIgnore
    public AnexoMatOid getAnexoMatmodificarpthisAnexoMat() {
        return this.anexoMatmodificarpthisAnexoMat;
    }
    
    public void setAnexoMatmodificarpthisAnexoMat(AnexoMatOid anexoMatmodificarpthisAnexoMat) {
        this.anexoMatmodificarpthisAnexoMat = anexoMatmodificarpthisAnexoMat;
    }

    @JsonIgnore
    public AnexoMat getAnexoMatmodificarpthisAnexoMatInstance() {
        return this.anexoMatmodificarpthisAnexoMatInstance;
    }
    
    public void setAnexoMatmodificarpthisAnexoMatInstance(AnexoMat anexoMatmodificarpthisAnexoMat) {
        this.anexoMatmodificarpthisAnexoMatInstance = anexoMatmodificarpthisAnexoMat;
        this.anexoMatmodificarpthisAnexoMat = anexoMatmodificarpthisAnexoMat != null ? anexoMatmodificarpthisAnexoMat.getOid() : null;
    }

    private void checkAnexoMatmodificarpthisAnexoMat() throws NotNullArgumentException {
        if(this.getAnexoMatmodificarpthisAnexoMatInstance() == null || this.getAnexoMatmodificarpthisAnexoMatInstance().isNull()) {
            throw new NotNullArgumentException(AnexoMatConstants.SERV_ID_MODIFICAR, AnexoMatConstants.CLASS_ID, AnexoMatConstants.ARG_ID_MODIFICAR_ANEXOMATMODIFICARPTHISANEXOMAT, AnexoMatConstants.SERV_ALIAS_MODIFICAR, AnexoMatConstants.CLASS_ALIAS, AnexoMatConstants.ARG_ALIAS_MODIFICAR_ANEXOMATMODIFICARPTHISANEXOMAT);
        }
    }

    @JsonIgnore
    public Date getAnexoMatmodificarpFechaUltRegla() {
        return this.anexoMatmodificarpFechaUltRegla;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setAnexoMatmodificarpFechaUltRegla(Date anexoMatmodificarpFechaUltRegla) {
        this.anexoMatmodificarpFechaUltRegla = anexoMatmodificarpFechaUltRegla;
    }

    private void checkAnexoMatmodificarpFechaUltRegla() throws NotNullArgumentException {
        if(this.getAnexoMatmodificarpFechaUltRegla() == null) {
            throw new NotNullArgumentException(AnexoMatConstants.SERV_ID_MODIFICAR, AnexoMatConstants.CLASS_ID, AnexoMatConstants.ARG_ID_MODIFICAR_ANEXOMATMODIFICARPFECHAULTREGLA, AnexoMatConstants.SERV_ALIAS_MODIFICAR, AnexoMatConstants.CLASS_ALIAS, AnexoMatConstants.ARG_ALIAS_MODIFICAR_ANEXOMATMODIFICARPFECHAULTREGLA);
        }
    }

    @JsonIgnore
    public Long getAnexoMatmodificarpNumCuotas() {
        return this.anexoMatmodificarpNumCuotas;
    }
    
    public void setAnexoMatmodificarpNumCuotas(Long anexoMatmodificarpNumCuotas) {
        this.anexoMatmodificarpNumCuotas = anexoMatmodificarpNumCuotas;
    }

    private void checkAnexoMatmodificarpNumCuotas() throws NotNullArgumentException {
        if(this.getAnexoMatmodificarpNumCuotas() == null) {
            throw new NotNullArgumentException(AnexoMatConstants.SERV_ID_MODIFICAR, AnexoMatConstants.CLASS_ID, AnexoMatConstants.ARG_ID_MODIFICAR_ANEXOMATMODIFICARPNUMCUOTAS, AnexoMatConstants.SERV_ALIAS_MODIFICAR, AnexoMatConstants.CLASS_ALIAS, AnexoMatConstants.ARG_ALIAS_MODIFICAR_ANEXOMATMODIFICARPNUMCUOTAS);
        }
    }
}
