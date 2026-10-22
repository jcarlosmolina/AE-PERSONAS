package com.keralty.aepersonas.viewmodel.seccionp.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.SeccionPConstants;
import com.keralty.aepersonas.persistence.oid.SeccionPOid;
import com.keralty.aepersonas.persistence.SeccionP;

public class TELIMINARRequest {

    @JsonProperty("p_thisseccionp_oid")
    private SeccionPOid seccionPTELIMINARpthisSeccionP;
    
    @JsonIgnore
    private SeccionP seccionPTELIMINARpthisSeccionPInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkSeccionPTELIMINARpthisSeccionP();
    }

    @JsonIgnore
    public SeccionPOid getSeccionPTELIMINARpthisSeccionP() {
        return this.seccionPTELIMINARpthisSeccionP;
    }
    
    public void setSeccionPTELIMINARpthisSeccionP(SeccionPOid seccionPTELIMINARpthisSeccionP) {
        this.seccionPTELIMINARpthisSeccionP = seccionPTELIMINARpthisSeccionP;
    }

    @JsonIgnore
    public SeccionP getSeccionPTELIMINARpthisSeccionPInstance() {
        return this.seccionPTELIMINARpthisSeccionPInstance;
    }
    
    public void setSeccionPTELIMINARpthisSeccionPInstance(SeccionP seccionPTELIMINARpthisSeccionP) {
        this.seccionPTELIMINARpthisSeccionPInstance = seccionPTELIMINARpthisSeccionP;
        this.seccionPTELIMINARpthisSeccionP = seccionPTELIMINARpthisSeccionP != null ? seccionPTELIMINARpthisSeccionP.getOid() : null;
    }

    private void checkSeccionPTELIMINARpthisSeccionP() throws NotNullArgumentException {
        if(this.getSeccionPTELIMINARpthisSeccionPInstance() == null || this.getSeccionPTELIMINARpthisSeccionPInstance().isNull()) {
            throw new NotNullArgumentException(SeccionPConstants.SERV_ID_TELIMINAR, SeccionPConstants.CLASS_ID, SeccionPConstants.ARG_ID_TELIMINAR_SECCIONPTELIMINARPTHISSECCIONP, SeccionPConstants.SERV_ALIAS_TELIMINAR, SeccionPConstants.CLASS_ALIAS, SeccionPConstants.ARG_ALIAS_TELIMINAR_SECCIONPTELIMINARPTHISSECCIONP);
        }
    }
}
