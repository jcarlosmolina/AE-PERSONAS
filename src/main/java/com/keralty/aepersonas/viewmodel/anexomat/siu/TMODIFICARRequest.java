package com.keralty.aepersonas.viewmodel.anexomat.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.AnexoMatConstants;
import com.keralty.aepersonas.persistence.AnexoMat;
import com.keralty.aepersonas.persistence.InstitucionMatNeo;
import com.keralty.aepersonas.persistence.oid.AnexoMatOid;
import com.keralty.aepersonas.persistence.oid.InstitucionMatNeoOid;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneDeserializer;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneSerializer;
import java.sql.Date;

public class TMODIFICARRequest {

    @JsonProperty("p_thisanexomat_oid")
    private AnexoMatOid anexoMatTMODIFICARpthisAnexoMat;
    
    @JsonIgnore
    private AnexoMat anexoMatTMODIFICARpthisAnexoMatInstance;

    @JsonProperty("pt_p_fechaultregla")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date anexoMatTMODIFICARptpFechaUltRegla;

    @JsonProperty("pt_p_numcuotas")
    private Long anexoMatTMODIFICARptpNumCuotas;

    @JsonProperty("pt_institucionmat_oid")
    private InstitucionMatNeoOid anexoMatTMODIFICARptInstitucionMat;
    
    @JsonIgnore
    private InstitucionMatNeo anexoMatTMODIFICARptInstitucionMatInstance;

    @JsonProperty("preconditionId")
    private String preconditionId;

    public void checkArguments() throws NotNullArgumentException {
        checkAnexoMatTMODIFICARpthisAnexoMat();
        checkAnexoMatTMODIFICARptpFechaUltRegla();
        checkAnexoMatTMODIFICARptpNumCuotas();
        checkAnexoMatTMODIFICARptInstitucionMat();
    }

    @JsonIgnore
    public AnexoMatOid getAnexoMatTMODIFICARpthisAnexoMat() {
        return this.anexoMatTMODIFICARpthisAnexoMat;
    }
    
    public void setAnexoMatTMODIFICARpthisAnexoMat(AnexoMatOid anexoMatTMODIFICARpthisAnexoMat) {
        this.anexoMatTMODIFICARpthisAnexoMat = anexoMatTMODIFICARpthisAnexoMat;
    }

    @JsonIgnore
    public AnexoMat getAnexoMatTMODIFICARpthisAnexoMatInstance() {
        return this.anexoMatTMODIFICARpthisAnexoMatInstance;
    }
    
    public void setAnexoMatTMODIFICARpthisAnexoMatInstance(AnexoMat anexoMatTMODIFICARpthisAnexoMat) {
        this.anexoMatTMODIFICARpthisAnexoMatInstance = anexoMatTMODIFICARpthisAnexoMat;
        this.anexoMatTMODIFICARpthisAnexoMat = anexoMatTMODIFICARpthisAnexoMat != null ? anexoMatTMODIFICARpthisAnexoMat.getOid() : null;
    }

    private void checkAnexoMatTMODIFICARpthisAnexoMat() throws NotNullArgumentException {
        if(this.getAnexoMatTMODIFICARpthisAnexoMatInstance() == null || this.getAnexoMatTMODIFICARpthisAnexoMatInstance().isNull()) {
            throw new NotNullArgumentException(AnexoMatConstants.SERV_ID_TMODIFICAR, AnexoMatConstants.CLASS_ID, AnexoMatConstants.ARG_ID_TMODIFICAR_ANEXOMATTMODIFICARPTHISANEXOMAT, AnexoMatConstants.SERV_ALIAS_TMODIFICAR, AnexoMatConstants.CLASS_ALIAS, AnexoMatConstants.ARG_ALIAS_TMODIFICAR_ANEXOMATTMODIFICARPTHISANEXOMAT);
        }
    }

    @JsonIgnore
    public Date getAnexoMatTMODIFICARptpFechaUltRegla() {
        return this.anexoMatTMODIFICARptpFechaUltRegla;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setAnexoMatTMODIFICARptpFechaUltRegla(Date anexoMatTMODIFICARptpFechaUltRegla) {
        this.anexoMatTMODIFICARptpFechaUltRegla = anexoMatTMODIFICARptpFechaUltRegla;
    }

    private void checkAnexoMatTMODIFICARptpFechaUltRegla() throws NotNullArgumentException {
        if(this.getAnexoMatTMODIFICARptpFechaUltRegla() == null) {
            throw new NotNullArgumentException(AnexoMatConstants.SERV_ID_TMODIFICAR, AnexoMatConstants.CLASS_ID, AnexoMatConstants.ARG_ID_TMODIFICAR_ANEXOMATTMODIFICARPTPFECHAULTREGLA, AnexoMatConstants.SERV_ALIAS_TMODIFICAR, AnexoMatConstants.CLASS_ALIAS, AnexoMatConstants.ARG_ALIAS_TMODIFICAR_ANEXOMATTMODIFICARPTPFECHAULTREGLA);
        }
    }

    @JsonIgnore
    public Long getAnexoMatTMODIFICARptpNumCuotas() {
        return this.anexoMatTMODIFICARptpNumCuotas;
    }
    
    public void setAnexoMatTMODIFICARptpNumCuotas(Long anexoMatTMODIFICARptpNumCuotas) {
        this.anexoMatTMODIFICARptpNumCuotas = anexoMatTMODIFICARptpNumCuotas;
    }

    private void checkAnexoMatTMODIFICARptpNumCuotas() throws NotNullArgumentException {
        if(this.getAnexoMatTMODIFICARptpNumCuotas() == null) {
            throw new NotNullArgumentException(AnexoMatConstants.SERV_ID_TMODIFICAR, AnexoMatConstants.CLASS_ID, AnexoMatConstants.ARG_ID_TMODIFICAR_ANEXOMATTMODIFICARPTPNUMCUOTAS, AnexoMatConstants.SERV_ALIAS_TMODIFICAR, AnexoMatConstants.CLASS_ALIAS, AnexoMatConstants.ARG_ALIAS_TMODIFICAR_ANEXOMATTMODIFICARPTPNUMCUOTAS);
        }
    }

    @JsonIgnore
    public InstitucionMatNeoOid getAnexoMatTMODIFICARptInstitucionMat() {
        return this.anexoMatTMODIFICARptInstitucionMat;
    }
    
    public void setAnexoMatTMODIFICARptInstitucionMat(InstitucionMatNeoOid anexoMatTMODIFICARptInstitucionMat) {
        this.anexoMatTMODIFICARptInstitucionMat = anexoMatTMODIFICARptInstitucionMat;
    }

    @JsonIgnore
    public InstitucionMatNeo getAnexoMatTMODIFICARptInstitucionMatInstance() {
        return this.anexoMatTMODIFICARptInstitucionMatInstance;
    }
    
    public void setAnexoMatTMODIFICARptInstitucionMatInstance(InstitucionMatNeo anexoMatTMODIFICARptInstitucionMat) {
        this.anexoMatTMODIFICARptInstitucionMatInstance = anexoMatTMODIFICARptInstitucionMat;
        this.anexoMatTMODIFICARptInstitucionMat = anexoMatTMODIFICARptInstitucionMat != null ? anexoMatTMODIFICARptInstitucionMat.getOid() : null;
    }

    private void checkAnexoMatTMODIFICARptInstitucionMat() throws NotNullArgumentException {
        if(this.getAnexoMatTMODIFICARptInstitucionMatInstance() == null || this.getAnexoMatTMODIFICARptInstitucionMatInstance().isNull()) {
            throw new NotNullArgumentException(AnexoMatConstants.SERV_ID_TMODIFICAR, AnexoMatConstants.CLASS_ID, AnexoMatConstants.ARG_ID_TMODIFICAR_ANEXOMATTMODIFICARPTINSTITUCIONMAT, AnexoMatConstants.SERV_ALIAS_TMODIFICAR, AnexoMatConstants.CLASS_ALIAS, AnexoMatConstants.ARG_ALIAS_TMODIFICAR_ANEXOMATTMODIFICARPTINSTITUCIONMAT);
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
