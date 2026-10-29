package com.keralty.aepersonas.viewmodel.cuestionariop.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.CuestionarioPConstants;
import com.keralty.aepersonas.persistence.CuestionarioP;
import com.keralty.aepersonas.persistence.oid.CuestionarioPOid;

public class EliminarRequest {

    @JsonProperty("p_thiscuestionariop_oid")
    private CuestionarioPOid cuestionarioPeliminarpthisCuestionarioP;
    
    @JsonIgnore
    private CuestionarioP cuestionarioPeliminarpthisCuestionarioPInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkCuestionarioPeliminarpthisCuestionarioP();
    }

    @JsonIgnore
    public CuestionarioPOid getCuestionarioPeliminarpthisCuestionarioP() {
        return this.cuestionarioPeliminarpthisCuestionarioP;
    }
    
    public void setCuestionarioPeliminarpthisCuestionarioP(CuestionarioPOid cuestionarioPeliminarpthisCuestionarioP) {
        this.cuestionarioPeliminarpthisCuestionarioP = cuestionarioPeliminarpthisCuestionarioP;
    }

    @JsonIgnore
    public CuestionarioP getCuestionarioPeliminarpthisCuestionarioPInstance() {
        return this.cuestionarioPeliminarpthisCuestionarioPInstance;
    }
    
    public void setCuestionarioPeliminarpthisCuestionarioPInstance(CuestionarioP cuestionarioPeliminarpthisCuestionarioP) {
        this.cuestionarioPeliminarpthisCuestionarioPInstance = cuestionarioPeliminarpthisCuestionarioP;
        this.cuestionarioPeliminarpthisCuestionarioP = cuestionarioPeliminarpthisCuestionarioP != null ? cuestionarioPeliminarpthisCuestionarioP.getOid() : null;
    }

    private void checkCuestionarioPeliminarpthisCuestionarioP() throws NotNullArgumentException {
        if(this.getCuestionarioPeliminarpthisCuestionarioPInstance() == null || this.getCuestionarioPeliminarpthisCuestionarioPInstance().isNull()) {
            throw new NotNullArgumentException(CuestionarioPConstants.SERV_ID_ELIMINAR, CuestionarioPConstants.CLASS_ID, CuestionarioPConstants.ARG_ID_ELIMINAR_CUESTIONARIOPELIMINARPTHISCUESTIONARIOP, CuestionarioPConstants.SERV_ALIAS_ELIMINAR, CuestionarioPConstants.CLASS_ALIAS, CuestionarioPConstants.ARG_ALIAS_ELIMINAR_CUESTIONARIOPELIMINARPTHISCUESTIONARIOP);
        }
    }
}
