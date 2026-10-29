package com.keralty.aepersonas.viewmodel.cuestionariop.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.CuestionarioPConstants;
import com.keralty.aepersonas.persistence.CuestionarioP;
import com.keralty.aepersonas.persistence.oid.CuestionarioPOid;

public class TMARCARDATOSPREGUNTACORERequest {

    @JsonProperty("p_thiscuestionariop_oid")
    private CuestionarioPOid cuestionarioPTMARCARDATOSPREGUNTACOREpthisCuestionarioP;
    
    @JsonIgnore
    private CuestionarioP cuestionarioPTMARCARDATOSPREGUNTACOREpthisCuestionarioPInstance;

    @JsonProperty("pt_p_respuestasino")
    private Boolean cuestionarioPTMARCARDATOSPREGUNTACOREptpRespuestaSiNo;

    @JsonProperty("pt_p_respuestaobs")
    private String cuestionarioPTMARCARDATOSPREGUNTACOREptpRespuestaObs;

    @JsonProperty("ptnumpregunta")
    private Long cuestionarioPTMARCARDATOSPREGUNTACOREptNumPregunta;

    public void checkArguments() throws NotNullArgumentException {
        checkCuestionarioPTMARCARDATOSPREGUNTACOREpthisCuestionarioP();
        checkCuestionarioPTMARCARDATOSPREGUNTACOREptNumPregunta();
    }

    @JsonIgnore
    public CuestionarioPOid getCuestionarioPTMARCARDATOSPREGUNTACOREpthisCuestionarioP() {
        return this.cuestionarioPTMARCARDATOSPREGUNTACOREpthisCuestionarioP;
    }
    
    public void setCuestionarioPTMARCARDATOSPREGUNTACOREpthisCuestionarioP(CuestionarioPOid cuestionarioPTMARCARDATOSPREGUNTACOREpthisCuestionarioP) {
        this.cuestionarioPTMARCARDATOSPREGUNTACOREpthisCuestionarioP = cuestionarioPTMARCARDATOSPREGUNTACOREpthisCuestionarioP;
    }

    @JsonIgnore
    public CuestionarioP getCuestionarioPTMARCARDATOSPREGUNTACOREpthisCuestionarioPInstance() {
        return this.cuestionarioPTMARCARDATOSPREGUNTACOREpthisCuestionarioPInstance;
    }
    
    public void setCuestionarioPTMARCARDATOSPREGUNTACOREpthisCuestionarioPInstance(CuestionarioP cuestionarioPTMARCARDATOSPREGUNTACOREpthisCuestionarioP) {
        this.cuestionarioPTMARCARDATOSPREGUNTACOREpthisCuestionarioPInstance = cuestionarioPTMARCARDATOSPREGUNTACOREpthisCuestionarioP;
        this.cuestionarioPTMARCARDATOSPREGUNTACOREpthisCuestionarioP = cuestionarioPTMARCARDATOSPREGUNTACOREpthisCuestionarioP != null ? cuestionarioPTMARCARDATOSPREGUNTACOREpthisCuestionarioP.getOid() : null;
    }

    private void checkCuestionarioPTMARCARDATOSPREGUNTACOREpthisCuestionarioP() throws NotNullArgumentException {
        if(this.getCuestionarioPTMARCARDATOSPREGUNTACOREpthisCuestionarioPInstance() == null || this.getCuestionarioPTMARCARDATOSPREGUNTACOREpthisCuestionarioPInstance().isNull()) {
            throw new NotNullArgumentException(CuestionarioPConstants.SERV_ID_TMARCARDATOSPREGUNTACORE, CuestionarioPConstants.CLASS_ID, CuestionarioPConstants.ARG_ID_TMARCARDATOSPREGUNTACORE_CUESTIONARIOPTMARCARDATOSPREGUNTACOREPTHISCUESTIONARIOP, CuestionarioPConstants.SERV_ALIAS_TMARCARDATOSPREGUNTACORE, CuestionarioPConstants.CLASS_ALIAS, CuestionarioPConstants.ARG_ALIAS_TMARCARDATOSPREGUNTACORE_CUESTIONARIOPTMARCARDATOSPREGUNTACOREPTHISCUESTIONARIOP);
        }
    }

    @JsonIgnore
    public Boolean getCuestionarioPTMARCARDATOSPREGUNTACOREptpRespuestaSiNo() {
        return this.cuestionarioPTMARCARDATOSPREGUNTACOREptpRespuestaSiNo;
    }
    
    public void setCuestionarioPTMARCARDATOSPREGUNTACOREptpRespuestaSiNo(Boolean cuestionarioPTMARCARDATOSPREGUNTACOREptpRespuestaSiNo) {
        this.cuestionarioPTMARCARDATOSPREGUNTACOREptpRespuestaSiNo = cuestionarioPTMARCARDATOSPREGUNTACOREptpRespuestaSiNo;
    }

    @JsonIgnore
    public String getCuestionarioPTMARCARDATOSPREGUNTACOREptpRespuestaObs() {
        return this.cuestionarioPTMARCARDATOSPREGUNTACOREptpRespuestaObs;
    }
    
    public void setCuestionarioPTMARCARDATOSPREGUNTACOREptpRespuestaObs(String cuestionarioPTMARCARDATOSPREGUNTACOREptpRespuestaObs) {
        this.cuestionarioPTMARCARDATOSPREGUNTACOREptpRespuestaObs = cuestionarioPTMARCARDATOSPREGUNTACOREptpRespuestaObs;
    }

    @JsonIgnore
    public Long getCuestionarioPTMARCARDATOSPREGUNTACOREptNumPregunta() {
        return this.cuestionarioPTMARCARDATOSPREGUNTACOREptNumPregunta;
    }
    
    public void setCuestionarioPTMARCARDATOSPREGUNTACOREptNumPregunta(Long cuestionarioPTMARCARDATOSPREGUNTACOREptNumPregunta) {
        this.cuestionarioPTMARCARDATOSPREGUNTACOREptNumPregunta = cuestionarioPTMARCARDATOSPREGUNTACOREptNumPregunta;
    }

    private void checkCuestionarioPTMARCARDATOSPREGUNTACOREptNumPregunta() throws NotNullArgumentException {
        if(this.getCuestionarioPTMARCARDATOSPREGUNTACOREptNumPregunta() == null) {
            throw new NotNullArgumentException(CuestionarioPConstants.SERV_ID_TMARCARDATOSPREGUNTACORE, CuestionarioPConstants.CLASS_ID, CuestionarioPConstants.ARG_ID_TMARCARDATOSPREGUNTACORE_CUESTIONARIOPTMARCARDATOSPREGUNTACOREPTNUMPREGUNTA, CuestionarioPConstants.SERV_ALIAS_TMARCARDATOSPREGUNTACORE, CuestionarioPConstants.CLASS_ALIAS, CuestionarioPConstants.ARG_ALIAS_TMARCARDATOSPREGUNTACORE_CUESTIONARIOPTMARCARDATOSPREGUNTACOREPTNUMPREGUNTA);
        }
    }
}
