package com.keralty.aepersonas.viewmodel.preguntap.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PreguntaPConstants;
import com.keralty.aepersonas.persistence.oid.PreguntaPOid;
import com.keralty.aepersonas.persistence.PreguntaP;

public class CambiarVieneDeCoreRequest {

    @JsonProperty("p_thispreguntap_oid")
    private PreguntaPOid preguntaPcambiarVieneDeCorepthisPreguntaP;
    
    @JsonIgnore
    private PreguntaP preguntaPcambiarVieneDeCorepthisPreguntaPInstance;

    @JsonProperty("peviene")
    private Boolean preguntaPcambiarVieneDeCorepeViene;

    public void checkArguments() throws NotNullArgumentException {
        checkPreguntaPcambiarVieneDeCorepthisPreguntaP();
        checkPreguntaPcambiarVieneDeCorepeViene();
    }

    @JsonIgnore
    public PreguntaPOid getPreguntaPcambiarVieneDeCorepthisPreguntaP() {
        return this.preguntaPcambiarVieneDeCorepthisPreguntaP;
    }
    
    public void setPreguntaPcambiarVieneDeCorepthisPreguntaP(PreguntaPOid preguntaPcambiarVieneDeCorepthisPreguntaP) {
        this.preguntaPcambiarVieneDeCorepthisPreguntaP = preguntaPcambiarVieneDeCorepthisPreguntaP;
    }

    @JsonIgnore
    public PreguntaP getPreguntaPcambiarVieneDeCorepthisPreguntaPInstance() {
        return this.preguntaPcambiarVieneDeCorepthisPreguntaPInstance;
    }
    
    public void setPreguntaPcambiarVieneDeCorepthisPreguntaPInstance(PreguntaP preguntaPcambiarVieneDeCorepthisPreguntaP) {
        this.preguntaPcambiarVieneDeCorepthisPreguntaPInstance = preguntaPcambiarVieneDeCorepthisPreguntaP;
        this.preguntaPcambiarVieneDeCorepthisPreguntaP = preguntaPcambiarVieneDeCorepthisPreguntaP != null ? preguntaPcambiarVieneDeCorepthisPreguntaP.getOid() : null;
    }

    private void checkPreguntaPcambiarVieneDeCorepthisPreguntaP() throws NotNullArgumentException {
        if(this.getPreguntaPcambiarVieneDeCorepthisPreguntaPInstance() == null || this.getPreguntaPcambiarVieneDeCorepthisPreguntaPInstance().isNull()) {
            throw new NotNullArgumentException(PreguntaPConstants.SERV_ID_CAMBIARVIENEDECORE, PreguntaPConstants.CLASS_ID, PreguntaPConstants.ARG_ID_CAMBIARVIENEDECORE_PREGUNTAPCAMBIARVIENEDECOREPTHISPREGUNTAP, PreguntaPConstants.SERV_ALIAS_CAMBIARVIENEDECORE, PreguntaPConstants.CLASS_ALIAS, PreguntaPConstants.ARG_ALIAS_CAMBIARVIENEDECORE_PREGUNTAPCAMBIARVIENEDECOREPTHISPREGUNTAP);
        }
    }

    @JsonIgnore
    public Boolean getPreguntaPcambiarVieneDeCorepeViene() {
        return this.preguntaPcambiarVieneDeCorepeViene;
    }
    
    public void setPreguntaPcambiarVieneDeCorepeViene(Boolean preguntaPcambiarVieneDeCorepeViene) {
        this.preguntaPcambiarVieneDeCorepeViene = preguntaPcambiarVieneDeCorepeViene;
    }

    private void checkPreguntaPcambiarVieneDeCorepeViene() throws NotNullArgumentException {
        if(this.getPreguntaPcambiarVieneDeCorepeViene() == null) {
            throw new NotNullArgumentException(PreguntaPConstants.SERV_ID_CAMBIARVIENEDECORE, PreguntaPConstants.CLASS_ID, PreguntaPConstants.ARG_ID_CAMBIARVIENEDECORE_PREGUNTAPCAMBIARVIENEDECOREPEVIENE, PreguntaPConstants.SERV_ALIAS_CAMBIARVIENEDECORE, PreguntaPConstants.CLASS_ALIAS, PreguntaPConstants.ARG_ALIAS_CAMBIARVIENEDECORE_PREGUNTAPCAMBIARVIENEDECOREPEVIENE);
        }
    }
}
