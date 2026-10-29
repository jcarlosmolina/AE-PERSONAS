package com.keralty.aepersonas.viewmodel.pregcuesmedc.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PregCuesMedCConstants;
import com.keralty.aepersonas.persistence.oid.PregCuesMedCOid;
import com.keralty.aepersonas.persistence.PregCuesMedC;

public class ModificarRequest {

    @JsonProperty("p_thispregcuesmedc_oid")
    private PregCuesMedCOid pregCuesMedCmodificarpthisPregCuesMedC;
    
    @JsonIgnore
    private PregCuesMedC pregCuesMedCmodificarpthisPregCuesMedCInstance;

    @JsonProperty("p_rptapregunta")
    private Boolean pregCuesMedCmodificarpRptaPregunta;

    @JsonProperty("p_observacions")
    private String pregCuesMedCmodificarpObservacions;

    public void checkArguments() throws NotNullArgumentException {
        checkPregCuesMedCmodificarpthisPregCuesMedC();
        checkPregCuesMedCmodificarpRptaPregunta();
    }

    @JsonIgnore
    public PregCuesMedCOid getPregCuesMedCmodificarpthisPregCuesMedC() {
        return this.pregCuesMedCmodificarpthisPregCuesMedC;
    }
    
    public void setPregCuesMedCmodificarpthisPregCuesMedC(PregCuesMedCOid pregCuesMedCmodificarpthisPregCuesMedC) {
        this.pregCuesMedCmodificarpthisPregCuesMedC = pregCuesMedCmodificarpthisPregCuesMedC;
    }

    @JsonIgnore
    public PregCuesMedC getPregCuesMedCmodificarpthisPregCuesMedCInstance() {
        return this.pregCuesMedCmodificarpthisPregCuesMedCInstance;
    }
    
    public void setPregCuesMedCmodificarpthisPregCuesMedCInstance(PregCuesMedC pregCuesMedCmodificarpthisPregCuesMedC) {
        this.pregCuesMedCmodificarpthisPregCuesMedCInstance = pregCuesMedCmodificarpthisPregCuesMedC;
        this.pregCuesMedCmodificarpthisPregCuesMedC = pregCuesMedCmodificarpthisPregCuesMedC != null ? pregCuesMedCmodificarpthisPregCuesMedC.getOid() : null;
    }

    private void checkPregCuesMedCmodificarpthisPregCuesMedC() throws NotNullArgumentException {
        if(this.getPregCuesMedCmodificarpthisPregCuesMedCInstance() == null || this.getPregCuesMedCmodificarpthisPregCuesMedCInstance().isNull()) {
            throw new NotNullArgumentException(PregCuesMedCConstants.SERV_ID_MODIFICAR, PregCuesMedCConstants.CLASS_ID, PregCuesMedCConstants.ARG_ID_MODIFICAR_PREGCUESMEDCMODIFICARPTHISPREGCUESMEDC, PregCuesMedCConstants.SERV_ALIAS_MODIFICAR, PregCuesMedCConstants.CLASS_ALIAS, PregCuesMedCConstants.ARG_ALIAS_MODIFICAR_PREGCUESMEDCMODIFICARPTHISPREGCUESMEDC);
        }
    }

    @JsonIgnore
    public Boolean getPregCuesMedCmodificarpRptaPregunta() {
        return this.pregCuesMedCmodificarpRptaPregunta;
    }
    
    public void setPregCuesMedCmodificarpRptaPregunta(Boolean pregCuesMedCmodificarpRptaPregunta) {
        this.pregCuesMedCmodificarpRptaPregunta = pregCuesMedCmodificarpRptaPregunta;
    }

    private void checkPregCuesMedCmodificarpRptaPregunta() throws NotNullArgumentException {
        if(this.getPregCuesMedCmodificarpRptaPregunta() == null) {
            throw new NotNullArgumentException(PregCuesMedCConstants.SERV_ID_MODIFICAR, PregCuesMedCConstants.CLASS_ID, PregCuesMedCConstants.ARG_ID_MODIFICAR_PREGCUESMEDCMODIFICARPRPTAPREGUNTA, PregCuesMedCConstants.SERV_ALIAS_MODIFICAR, PregCuesMedCConstants.CLASS_ALIAS, PregCuesMedCConstants.ARG_ALIAS_MODIFICAR_PREGCUESMEDCMODIFICARPRPTAPREGUNTA);
        }
    }

    @JsonIgnore
    public String getPregCuesMedCmodificarpObservacions() {
        return this.pregCuesMedCmodificarpObservacions;
    }
    
    public void setPregCuesMedCmodificarpObservacions(String pregCuesMedCmodificarpObservacions) {
        this.pregCuesMedCmodificarpObservacions = pregCuesMedCmodificarpObservacions;
    }
}
