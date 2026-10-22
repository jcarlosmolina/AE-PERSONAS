package com.keralty.aepersonas.viewmodel.cuestionariop.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.CuestionarioPConstants;
import com.keralty.aepersonas.persistence.CuestionarioP;
import com.keralty.aepersonas.persistence.oid.CuestionarioPOid;

public class CerrarRequest {

    @JsonProperty("p_thiscuestionariop_oid")
    private CuestionarioPOid cuestionarioPcerrarpthisCuestionarioP;
    
    @JsonIgnore
    private CuestionarioP cuestionarioPcerrarpthisCuestionarioPInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkCuestionarioPcerrarpthisCuestionarioP();
    }

    @JsonIgnore
    public CuestionarioPOid getCuestionarioPcerrarpthisCuestionarioP() {
        return this.cuestionarioPcerrarpthisCuestionarioP;
    }
    
    public void setCuestionarioPcerrarpthisCuestionarioP(CuestionarioPOid cuestionarioPcerrarpthisCuestionarioP) {
        this.cuestionarioPcerrarpthisCuestionarioP = cuestionarioPcerrarpthisCuestionarioP;
    }

    @JsonIgnore
    public CuestionarioP getCuestionarioPcerrarpthisCuestionarioPInstance() {
        return this.cuestionarioPcerrarpthisCuestionarioPInstance;
    }
    
    public void setCuestionarioPcerrarpthisCuestionarioPInstance(CuestionarioP cuestionarioPcerrarpthisCuestionarioP) {
        this.cuestionarioPcerrarpthisCuestionarioPInstance = cuestionarioPcerrarpthisCuestionarioP;
        this.cuestionarioPcerrarpthisCuestionarioP = cuestionarioPcerrarpthisCuestionarioP != null ? cuestionarioPcerrarpthisCuestionarioP.getOid() : null;
    }

    private void checkCuestionarioPcerrarpthisCuestionarioP() throws NotNullArgumentException {
        if(this.getCuestionarioPcerrarpthisCuestionarioPInstance() == null || this.getCuestionarioPcerrarpthisCuestionarioPInstance().isNull()) {
            throw new NotNullArgumentException(CuestionarioPConstants.SERV_ID_CERRAR, CuestionarioPConstants.CLASS_ID, CuestionarioPConstants.ARG_ID_CERRAR_CUESTIONARIOPCERRARPTHISCUESTIONARIOP, CuestionarioPConstants.SERV_ALIAS_CERRAR, CuestionarioPConstants.CLASS_ALIAS, CuestionarioPConstants.ARG_ALIAS_CERRAR_CUESTIONARIOPCERRARPTHISCUESTIONARIOP);
        }
    }
}
