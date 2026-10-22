package com.keralty.aepersonas.viewmodel.seccionp.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.SeccionPConstants;
import com.keralty.aepersonas.persistence.oid.SeccionPOid;
import com.keralty.aepersonas.persistence.SeccionP;

public class EliminarRequest {

    @JsonProperty("p_thisseccionp_oid")
    private SeccionPOid seccionPeliminarpthisSeccionP;
    
    @JsonIgnore
    private SeccionP seccionPeliminarpthisSeccionPInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkSeccionPeliminarpthisSeccionP();
    }

    @JsonIgnore
    public SeccionPOid getSeccionPeliminarpthisSeccionP() {
        return this.seccionPeliminarpthisSeccionP;
    }
    
    public void setSeccionPeliminarpthisSeccionP(SeccionPOid seccionPeliminarpthisSeccionP) {
        this.seccionPeliminarpthisSeccionP = seccionPeliminarpthisSeccionP;
    }

    @JsonIgnore
    public SeccionP getSeccionPeliminarpthisSeccionPInstance() {
        return this.seccionPeliminarpthisSeccionPInstance;
    }
    
    public void setSeccionPeliminarpthisSeccionPInstance(SeccionP seccionPeliminarpthisSeccionP) {
        this.seccionPeliminarpthisSeccionPInstance = seccionPeliminarpthisSeccionP;
        this.seccionPeliminarpthisSeccionP = seccionPeliminarpthisSeccionP != null ? seccionPeliminarpthisSeccionP.getOid() : null;
    }

    private void checkSeccionPeliminarpthisSeccionP() throws NotNullArgumentException {
        if(this.getSeccionPeliminarpthisSeccionPInstance() == null || this.getSeccionPeliminarpthisSeccionPInstance().isNull()) {
            throw new NotNullArgumentException(SeccionPConstants.SERV_ID_ELIMINAR, SeccionPConstants.CLASS_ID, SeccionPConstants.ARG_ID_ELIMINAR_SECCIONPELIMINARPTHISSECCIONP, SeccionPConstants.SERV_ALIAS_ELIMINAR, SeccionPConstants.CLASS_ALIAS, SeccionPConstants.ARG_ALIAS_ELIMINAR_SECCIONPELIMINARPTHISSECCIONP);
        }
    }
}
