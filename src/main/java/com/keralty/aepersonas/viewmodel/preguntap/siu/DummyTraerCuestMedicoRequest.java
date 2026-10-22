package com.keralty.aepersonas.viewmodel.preguntap.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PreguntaPConstants;
import com.keralty.aepersonas.persistence.oid.PreguntaPOid;
import com.keralty.aepersonas.persistence.PreguntaP;

public class DummyTraerCuestMedicoRequest {

    @JsonProperty("p_thispreguntap_oid")
    private PreguntaPOid preguntaPdummyTraerCuestMedicopthisPreguntaP;
    
    @JsonIgnore
    private PreguntaP preguntaPdummyTraerCuestMedicopthisPreguntaPInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkPreguntaPdummyTraerCuestMedicopthisPreguntaP();
    }

    @JsonIgnore
    public PreguntaPOid getPreguntaPdummyTraerCuestMedicopthisPreguntaP() {
        return this.preguntaPdummyTraerCuestMedicopthisPreguntaP;
    }
    
    public void setPreguntaPdummyTraerCuestMedicopthisPreguntaP(PreguntaPOid preguntaPdummyTraerCuestMedicopthisPreguntaP) {
        this.preguntaPdummyTraerCuestMedicopthisPreguntaP = preguntaPdummyTraerCuestMedicopthisPreguntaP;
    }

    @JsonIgnore
    public PreguntaP getPreguntaPdummyTraerCuestMedicopthisPreguntaPInstance() {
        return this.preguntaPdummyTraerCuestMedicopthisPreguntaPInstance;
    }
    
    public void setPreguntaPdummyTraerCuestMedicopthisPreguntaPInstance(PreguntaP preguntaPdummyTraerCuestMedicopthisPreguntaP) {
        this.preguntaPdummyTraerCuestMedicopthisPreguntaPInstance = preguntaPdummyTraerCuestMedicopthisPreguntaP;
        this.preguntaPdummyTraerCuestMedicopthisPreguntaP = preguntaPdummyTraerCuestMedicopthisPreguntaP != null ? preguntaPdummyTraerCuestMedicopthisPreguntaP.getOid() : null;
    }

    private void checkPreguntaPdummyTraerCuestMedicopthisPreguntaP() throws NotNullArgumentException {
        if(this.getPreguntaPdummyTraerCuestMedicopthisPreguntaPInstance() == null || this.getPreguntaPdummyTraerCuestMedicopthisPreguntaPInstance().isNull()) {
            throw new NotNullArgumentException(PreguntaPConstants.SERV_ID_DUMMYTRAERCUESTMEDICO, PreguntaPConstants.CLASS_ID, PreguntaPConstants.ARG_ID_DUMMYTRAERCUESTMEDICO_PREGUNTAPDUMMYTRAERCUESTMEDICOPTHISPREGUNTAP, PreguntaPConstants.SERV_ALIAS_DUMMYTRAERCUESTMEDICO, PreguntaPConstants.CLASS_ALIAS, PreguntaPConstants.ARG_ALIAS_DUMMYTRAERCUESTMEDICO_PREGUNTAPDUMMYTRAERCUESTMEDICOPTHISPREGUNTAP);
        }
    }
}
