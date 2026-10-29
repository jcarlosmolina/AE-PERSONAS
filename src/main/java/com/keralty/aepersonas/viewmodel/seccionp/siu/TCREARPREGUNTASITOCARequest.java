package com.keralty.aepersonas.viewmodel.seccionp.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.SeccionPConstants;
import com.keralty.aepersonas.persistence.oid.PreguntaOid;
import com.keralty.aepersonas.persistence.oid.SeccionPOid;
import com.keralty.aepersonas.persistence.Pregunta;
import com.keralty.aepersonas.persistence.SeccionP;

public class TCREARPREGUNTASITOCARequest {

    @JsonProperty("p_thisseccionp_oid")
    private SeccionPOid seccionPTCREARPREGUNTASITOCApthisSeccionP;
    
    @JsonIgnore
    private SeccionP seccionPTCREARPREGUNTASITOCApthisSeccionPInstance;

    @JsonProperty("p_pregunta_oid")
    private PreguntaOid seccionPTCREARPREGUNTASITOCApPregunta;
    
    @JsonIgnore
    private Pregunta seccionPTCREARPREGUNTASITOCApPreguntaInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkSeccionPTCREARPREGUNTASITOCApthisSeccionP();
        checkSeccionPTCREARPREGUNTASITOCApPregunta();
    }

    @JsonIgnore
    public SeccionPOid getSeccionPTCREARPREGUNTASITOCApthisSeccionP() {
        return this.seccionPTCREARPREGUNTASITOCApthisSeccionP;
    }
    
    public void setSeccionPTCREARPREGUNTASITOCApthisSeccionP(SeccionPOid seccionPTCREARPREGUNTASITOCApthisSeccionP) {
        this.seccionPTCREARPREGUNTASITOCApthisSeccionP = seccionPTCREARPREGUNTASITOCApthisSeccionP;
    }

    @JsonIgnore
    public SeccionP getSeccionPTCREARPREGUNTASITOCApthisSeccionPInstance() {
        return this.seccionPTCREARPREGUNTASITOCApthisSeccionPInstance;
    }
    
    public void setSeccionPTCREARPREGUNTASITOCApthisSeccionPInstance(SeccionP seccionPTCREARPREGUNTASITOCApthisSeccionP) {
        this.seccionPTCREARPREGUNTASITOCApthisSeccionPInstance = seccionPTCREARPREGUNTASITOCApthisSeccionP;
        this.seccionPTCREARPREGUNTASITOCApthisSeccionP = seccionPTCREARPREGUNTASITOCApthisSeccionP != null ? seccionPTCREARPREGUNTASITOCApthisSeccionP.getOid() : null;
    }

    private void checkSeccionPTCREARPREGUNTASITOCApthisSeccionP() throws NotNullArgumentException {
        if(this.getSeccionPTCREARPREGUNTASITOCApthisSeccionPInstance() == null || this.getSeccionPTCREARPREGUNTASITOCApthisSeccionPInstance().isNull()) {
            throw new NotNullArgumentException(SeccionPConstants.SERV_ID_TCREARPREGUNTASITOCA, SeccionPConstants.CLASS_ID, SeccionPConstants.ARG_ID_TCREARPREGUNTASITOCA_SECCIONPTCREARPREGUNTASITOCAPTHISSECCIONP, SeccionPConstants.SERV_ALIAS_TCREARPREGUNTASITOCA, SeccionPConstants.CLASS_ALIAS, SeccionPConstants.ARG_ALIAS_TCREARPREGUNTASITOCA_SECCIONPTCREARPREGUNTASITOCAPTHISSECCIONP);
        }
    }

    @JsonIgnore
    public PreguntaOid getSeccionPTCREARPREGUNTASITOCApPregunta() {
        return this.seccionPTCREARPREGUNTASITOCApPregunta;
    }
    
    public void setSeccionPTCREARPREGUNTASITOCApPregunta(PreguntaOid seccionPTCREARPREGUNTASITOCApPregunta) {
        this.seccionPTCREARPREGUNTASITOCApPregunta = seccionPTCREARPREGUNTASITOCApPregunta;
    }

    @JsonIgnore
    public Pregunta getSeccionPTCREARPREGUNTASITOCApPreguntaInstance() {
        return this.seccionPTCREARPREGUNTASITOCApPreguntaInstance;
    }
    
    public void setSeccionPTCREARPREGUNTASITOCApPreguntaInstance(Pregunta seccionPTCREARPREGUNTASITOCApPregunta) {
        this.seccionPTCREARPREGUNTASITOCApPreguntaInstance = seccionPTCREARPREGUNTASITOCApPregunta;
        this.seccionPTCREARPREGUNTASITOCApPregunta = seccionPTCREARPREGUNTASITOCApPregunta != null ? seccionPTCREARPREGUNTASITOCApPregunta.getOid() : null;
    }

    private void checkSeccionPTCREARPREGUNTASITOCApPregunta() throws NotNullArgumentException {
        if(this.getSeccionPTCREARPREGUNTASITOCApPreguntaInstance() == null || this.getSeccionPTCREARPREGUNTASITOCApPreguntaInstance().isNull()) {
            throw new NotNullArgumentException(SeccionPConstants.SERV_ID_TCREARPREGUNTASITOCA, SeccionPConstants.CLASS_ID, SeccionPConstants.ARG_ID_TCREARPREGUNTASITOCA_SECCIONPTCREARPREGUNTASITOCAPPREGUNTA, SeccionPConstants.SERV_ALIAS_TCREARPREGUNTASITOCA, SeccionPConstants.CLASS_ALIAS, SeccionPConstants.ARG_ALIAS_TCREARPREGUNTASITOCA_SECCIONPTCREARPREGUNTASITOCAPPREGUNTA);
        }
    }
}
