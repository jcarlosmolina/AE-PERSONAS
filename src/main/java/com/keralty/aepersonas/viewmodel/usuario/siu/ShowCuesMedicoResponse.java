package com.keralty.aepersonas.viewmodel.usuario.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.CuestionarioP;
import com.keralty.aepersonas.persistence.oid.CuestionarioPOid;
import com.keralty.aepersonas.viewmodel.ServiceResponse;
import java.util.HashMap;
import java.util.Map;

public class ShowCuesMedicoResponse extends ServiceResponse {


    @JsonProperty("ps_cuesmedico")
    private CuestionarioPOid usuarioshowCuesMedicopsCuesMedico;
    
    @JsonIgnore
    private CuestionarioP usuarioshowCuesMedicopsCuesMedicoInstance;

    public ShowCuesMedicoResponse() {
        super();
    }

    @JsonIgnore
    public CuestionarioPOid getUsuarioshowCuesMedicopsCuesMedico() {
        return this.usuarioshowCuesMedicopsCuesMedico;
    }
    
    public void setUsuarioshowCuesMedicopsCuesMedico(CuestionarioPOid usuarioshowCuesMedicopsCuesMedico) {
        this.usuarioshowCuesMedicopsCuesMedico = usuarioshowCuesMedicopsCuesMedico;
    }
    @JsonIgnore
    public CuestionarioP getUsuarioshowCuesMedicopsCuesMedicoInstance() {
        return this.usuarioshowCuesMedicopsCuesMedicoInstance;
    }
    
    public void setUsuarioshowCuesMedicopsCuesMedicoInstance(CuestionarioP usuarioshowCuesMedicopsCuesMedico) {
        if (usuarioshowCuesMedicopsCuesMedico != null && !usuarioshowCuesMedicopsCuesMedico.isNull()) {
            this.usuarioshowCuesMedicopsCuesMedico = usuarioshowCuesMedicopsCuesMedico.getOid();
            this.usuarioshowCuesMedicopsCuesMedicoInstance = usuarioshowCuesMedicopsCuesMedico;
        } else {
            this.usuarioshowCuesMedicopsCuesMedico = null;
            this.usuarioshowCuesMedicopsCuesMedicoInstance = null;
        }
    }

    @Override
    public Map<String, Object> buildOutArgs() {
        Map<String, Object> outArgs = new HashMap<>();
        outArgs.put("usuarioshowCuesMedicopsCuesMedico", usuarioshowCuesMedicopsCuesMedico);
        return outArgs;
    }
}
