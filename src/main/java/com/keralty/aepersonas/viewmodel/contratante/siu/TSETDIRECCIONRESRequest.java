package com.keralty.aepersonas.viewmodel.contratante.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.ContratanteConstants;
import com.keralty.aepersonas.persistence.Contratante;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.ContratanteOid;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;

public class TSETDIRECCIONRESRequest {

    @JsonProperty("p_thiscontratante_oid")
    private ContratanteOid contratanteTSETDIRECCIONRESpthisContratante;
    
    @JsonIgnore
    private Contratante contratanteTSETDIRECCIONRESpthisContratanteInstance;

    @JsonProperty("ptdireccionres")
    private String contratanteTSETDIRECCIONRESptDireccionRes;

    @JsonProperty("pt_departamentores_oid")
    private DepartamentoOid contratanteTSETDIRECCIONRESptDepartamentoRes;
    
    @JsonIgnore
    private Departamento contratanteTSETDIRECCIONRESptDepartamentoResInstance;

    @JsonProperty("pt_municipiores_oid")
    private MunicipioOid contratanteTSETDIRECCIONRESptMunicipioRes;
    
    @JsonIgnore
    private Municipio contratanteTSETDIRECCIONRESptMunicipioResInstance;

    @JsonProperty("pt_ruraldirres")
    private Boolean contratanteTSETDIRECCIONRESptRuralDirRes;

    public void checkArguments() throws NotNullArgumentException {
        checkContratanteTSETDIRECCIONRESpthisContratante();
        checkContratanteTSETDIRECCIONRESptRuralDirRes();
    }

    @JsonIgnore
    public ContratanteOid getContratanteTSETDIRECCIONRESpthisContratante() {
        return this.contratanteTSETDIRECCIONRESpthisContratante;
    }
    
    public void setContratanteTSETDIRECCIONRESpthisContratante(ContratanteOid contratanteTSETDIRECCIONRESpthisContratante) {
        this.contratanteTSETDIRECCIONRESpthisContratante = contratanteTSETDIRECCIONRESpthisContratante;
    }

    @JsonIgnore
    public Contratante getContratanteTSETDIRECCIONRESpthisContratanteInstance() {
        return this.contratanteTSETDIRECCIONRESpthisContratanteInstance;
    }
    
    public void setContratanteTSETDIRECCIONRESpthisContratanteInstance(Contratante contratanteTSETDIRECCIONRESpthisContratante) {
        this.contratanteTSETDIRECCIONRESpthisContratanteInstance = contratanteTSETDIRECCIONRESpthisContratante;
        this.contratanteTSETDIRECCIONRESpthisContratante = contratanteTSETDIRECCIONRESpthisContratante != null ? contratanteTSETDIRECCIONRESpthisContratante.getOid() : null;
    }

    private void checkContratanteTSETDIRECCIONRESpthisContratante() throws NotNullArgumentException {
        if(this.getContratanteTSETDIRECCIONRESpthisContratanteInstance() == null || this.getContratanteTSETDIRECCIONRESpthisContratanteInstance().isNull()) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_TSETDIRECCIONRES, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_TSETDIRECCIONRES_CONTRATANTETSETDIRECCIONRESPTHISCONTRATANTE, ContratanteConstants.SERV_ALIAS_TSETDIRECCIONRES, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_TSETDIRECCIONRES_CONTRATANTETSETDIRECCIONRESPTHISCONTRATANTE);
        }
    }

    @JsonIgnore
    public String getContratanteTSETDIRECCIONRESptDireccionRes() {
        return this.contratanteTSETDIRECCIONRESptDireccionRes;
    }
    
    public void setContratanteTSETDIRECCIONRESptDireccionRes(String contratanteTSETDIRECCIONRESptDireccionRes) {
        this.contratanteTSETDIRECCIONRESptDireccionRes = contratanteTSETDIRECCIONRESptDireccionRes;
    }

    @JsonIgnore
    public DepartamentoOid getContratanteTSETDIRECCIONRESptDepartamentoRes() {
        return this.contratanteTSETDIRECCIONRESptDepartamentoRes;
    }
    
    public void setContratanteTSETDIRECCIONRESptDepartamentoRes(DepartamentoOid contratanteTSETDIRECCIONRESptDepartamentoRes) {
        this.contratanteTSETDIRECCIONRESptDepartamentoRes = contratanteTSETDIRECCIONRESptDepartamentoRes;
    }

    @JsonIgnore
    public Departamento getContratanteTSETDIRECCIONRESptDepartamentoResInstance() {
        return this.contratanteTSETDIRECCIONRESptDepartamentoResInstance;
    }
    
    public void setContratanteTSETDIRECCIONRESptDepartamentoResInstance(Departamento contratanteTSETDIRECCIONRESptDepartamentoRes) {
        this.contratanteTSETDIRECCIONRESptDepartamentoResInstance = contratanteTSETDIRECCIONRESptDepartamentoRes;
        this.contratanteTSETDIRECCIONRESptDepartamentoRes = contratanteTSETDIRECCIONRESptDepartamentoRes != null ? contratanteTSETDIRECCIONRESptDepartamentoRes.getOid() : null;
    }

    @JsonIgnore
    public MunicipioOid getContratanteTSETDIRECCIONRESptMunicipioRes() {
        return this.contratanteTSETDIRECCIONRESptMunicipioRes;
    }
    
    public void setContratanteTSETDIRECCIONRESptMunicipioRes(MunicipioOid contratanteTSETDIRECCIONRESptMunicipioRes) {
        this.contratanteTSETDIRECCIONRESptMunicipioRes = contratanteTSETDIRECCIONRESptMunicipioRes;
    }

    @JsonIgnore
    public Municipio getContratanteTSETDIRECCIONRESptMunicipioResInstance() {
        return this.contratanteTSETDIRECCIONRESptMunicipioResInstance;
    }
    
    public void setContratanteTSETDIRECCIONRESptMunicipioResInstance(Municipio contratanteTSETDIRECCIONRESptMunicipioRes) {
        this.contratanteTSETDIRECCIONRESptMunicipioResInstance = contratanteTSETDIRECCIONRESptMunicipioRes;
        this.contratanteTSETDIRECCIONRESptMunicipioRes = contratanteTSETDIRECCIONRESptMunicipioRes != null ? contratanteTSETDIRECCIONRESptMunicipioRes.getOid() : null;
    }

    @JsonIgnore
    public Boolean getContratanteTSETDIRECCIONRESptRuralDirRes() {
        return this.contratanteTSETDIRECCIONRESptRuralDirRes;
    }
    
    public void setContratanteTSETDIRECCIONRESptRuralDirRes(Boolean contratanteTSETDIRECCIONRESptRuralDirRes) {
        this.contratanteTSETDIRECCIONRESptRuralDirRes = contratanteTSETDIRECCIONRESptRuralDirRes;
    }

    private void checkContratanteTSETDIRECCIONRESptRuralDirRes() throws NotNullArgumentException {
        if(this.getContratanteTSETDIRECCIONRESptRuralDirRes() == null) {
            throw new NotNullArgumentException(ContratanteConstants.SERV_ID_TSETDIRECCIONRES, ContratanteConstants.CLASS_ID, ContratanteConstants.ARG_ID_TSETDIRECCIONRES_CONTRATANTETSETDIRECCIONRESPTRURALDIRRES, ContratanteConstants.SERV_ALIAS_TSETDIRECCIONRES, ContratanteConstants.CLASS_ALIAS, ContratanteConstants.ARG_ALIAS_TSETDIRECCIONRES_CONTRATANTETSETDIRECCIONRESPTRURALDIRRES);
        }
    }
}
