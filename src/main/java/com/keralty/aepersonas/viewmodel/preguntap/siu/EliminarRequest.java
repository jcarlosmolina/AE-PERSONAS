package com.keralty.aepersonas.viewmodel.preguntap.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PreguntaPConstants;
import com.keralty.aepersonas.persistence.oid.PreguntaPOid;
import com.keralty.aepersonas.persistence.PreguntaP;

public class EliminarRequest {

    @JsonProperty("p_thispreguntap_oid")
    private PreguntaPOid preguntaPeliminarpthisPreguntaP;
    
    @JsonIgnore
    private PreguntaP preguntaPeliminarpthisPreguntaPInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkPreguntaPeliminarpthisPreguntaP();
    }

    @JsonIgnore
    public PreguntaPOid getPreguntaPeliminarpthisPreguntaP() {
        return this.preguntaPeliminarpthisPreguntaP;
    }
    
    public void setPreguntaPeliminarpthisPreguntaP(PreguntaPOid preguntaPeliminarpthisPreguntaP) {
        this.preguntaPeliminarpthisPreguntaP = preguntaPeliminarpthisPreguntaP;
    }

    @JsonIgnore
    public PreguntaP getPreguntaPeliminarpthisPreguntaPInstance() {
        return this.preguntaPeliminarpthisPreguntaPInstance;
    }
    
    public void setPreguntaPeliminarpthisPreguntaPInstance(PreguntaP preguntaPeliminarpthisPreguntaP) {
        this.preguntaPeliminarpthisPreguntaPInstance = preguntaPeliminarpthisPreguntaP;
        this.preguntaPeliminarpthisPreguntaP = preguntaPeliminarpthisPreguntaP != null ? preguntaPeliminarpthisPreguntaP.getOid() : null;
    }

    private void checkPreguntaPeliminarpthisPreguntaP() throws NotNullArgumentException {
        if(this.getPreguntaPeliminarpthisPreguntaPInstance() == null || this.getPreguntaPeliminarpthisPreguntaPInstance().isNull()) {
            throw new NotNullArgumentException(PreguntaPConstants.SERV_ID_ELIMINAR, PreguntaPConstants.CLASS_ID, PreguntaPConstants.ARG_ID_ELIMINAR_PREGUNTAPELIMINARPTHISPREGUNTAP, PreguntaPConstants.SERV_ALIAS_ELIMINAR, PreguntaPConstants.CLASS_ALIAS, PreguntaPConstants.ARG_ALIAS_ELIMINAR_PREGUNTAPELIMINARPTHISPREGUNTAP);
        }
    }
}
