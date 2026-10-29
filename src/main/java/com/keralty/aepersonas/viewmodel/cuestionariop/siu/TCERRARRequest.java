package com.keralty.aepersonas.viewmodel.cuestionariop.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.CuestionarioPConstants;
import com.keralty.aepersonas.persistence.CuestionarioP;
import com.keralty.aepersonas.persistence.oid.CuestionarioPOid;

public class TCERRARRequest {

    @JsonProperty("p_thiscuestionariop_oid")
    private CuestionarioPOid cuestionarioPTCERRARpthisCuestionarioP;
    
    @JsonIgnore
    private CuestionarioP cuestionarioPTCERRARpthisCuestionarioPInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkCuestionarioPTCERRARpthisCuestionarioP();
    }

    @JsonIgnore
    public CuestionarioPOid getCuestionarioPTCERRARpthisCuestionarioP() {
        return this.cuestionarioPTCERRARpthisCuestionarioP;
    }
    
    public void setCuestionarioPTCERRARpthisCuestionarioP(CuestionarioPOid cuestionarioPTCERRARpthisCuestionarioP) {
        this.cuestionarioPTCERRARpthisCuestionarioP = cuestionarioPTCERRARpthisCuestionarioP;
    }

    @JsonIgnore
    public CuestionarioP getCuestionarioPTCERRARpthisCuestionarioPInstance() {
        return this.cuestionarioPTCERRARpthisCuestionarioPInstance;
    }
    
    public void setCuestionarioPTCERRARpthisCuestionarioPInstance(CuestionarioP cuestionarioPTCERRARpthisCuestionarioP) {
        this.cuestionarioPTCERRARpthisCuestionarioPInstance = cuestionarioPTCERRARpthisCuestionarioP;
        this.cuestionarioPTCERRARpthisCuestionarioP = cuestionarioPTCERRARpthisCuestionarioP != null ? cuestionarioPTCERRARpthisCuestionarioP.getOid() : null;
    }

    private void checkCuestionarioPTCERRARpthisCuestionarioP() throws NotNullArgumentException {
        if(this.getCuestionarioPTCERRARpthisCuestionarioPInstance() == null || this.getCuestionarioPTCERRARpthisCuestionarioPInstance().isNull()) {
            throw new NotNullArgumentException(CuestionarioPConstants.SERV_ID_TCERRAR, CuestionarioPConstants.CLASS_ID, CuestionarioPConstants.ARG_ID_TCERRAR_CUESTIONARIOPTCERRARPTHISCUESTIONARIOP, CuestionarioPConstants.SERV_ALIAS_TCERRAR, CuestionarioPConstants.CLASS_ALIAS, CuestionarioPConstants.ARG_ALIAS_TCERRAR_CUESTIONARIOPTCERRARPTHISCUESTIONARIOP);
        }
    }
}
