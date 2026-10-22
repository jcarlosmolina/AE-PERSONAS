package com.keralty.aepersonas.viewmodel.cuestionariop.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.CuestionarioPConstants;
import com.keralty.aepersonas.persistence.CuestionarioP;
import com.keralty.aepersonas.persistence.oid.CuestionarioPOid;

public class TCAMBIARPREGUNTA108Request {

    @JsonProperty("p_thiscuestionariop_oid")
    private CuestionarioPOid cuestionarioPTCAMBIARPREGUNTA108pthisCuestionarioP;
    
    @JsonIgnore
    private CuestionarioP cuestionarioPTCAMBIARPREGUNTA108pthisCuestionarioPInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkCuestionarioPTCAMBIARPREGUNTA108pthisCuestionarioP();
    }

    @JsonIgnore
    public CuestionarioPOid getCuestionarioPTCAMBIARPREGUNTA108pthisCuestionarioP() {
        return this.cuestionarioPTCAMBIARPREGUNTA108pthisCuestionarioP;
    }
    
    public void setCuestionarioPTCAMBIARPREGUNTA108pthisCuestionarioP(CuestionarioPOid cuestionarioPTCAMBIARPREGUNTA108pthisCuestionarioP) {
        this.cuestionarioPTCAMBIARPREGUNTA108pthisCuestionarioP = cuestionarioPTCAMBIARPREGUNTA108pthisCuestionarioP;
    }

    @JsonIgnore
    public CuestionarioP getCuestionarioPTCAMBIARPREGUNTA108pthisCuestionarioPInstance() {
        return this.cuestionarioPTCAMBIARPREGUNTA108pthisCuestionarioPInstance;
    }
    
    public void setCuestionarioPTCAMBIARPREGUNTA108pthisCuestionarioPInstance(CuestionarioP cuestionarioPTCAMBIARPREGUNTA108pthisCuestionarioP) {
        this.cuestionarioPTCAMBIARPREGUNTA108pthisCuestionarioPInstance = cuestionarioPTCAMBIARPREGUNTA108pthisCuestionarioP;
        this.cuestionarioPTCAMBIARPREGUNTA108pthisCuestionarioP = cuestionarioPTCAMBIARPREGUNTA108pthisCuestionarioP != null ? cuestionarioPTCAMBIARPREGUNTA108pthisCuestionarioP.getOid() : null;
    }

    private void checkCuestionarioPTCAMBIARPREGUNTA108pthisCuestionarioP() throws NotNullArgumentException {
        if(this.getCuestionarioPTCAMBIARPREGUNTA108pthisCuestionarioPInstance() == null || this.getCuestionarioPTCAMBIARPREGUNTA108pthisCuestionarioPInstance().isNull()) {
            throw new NotNullArgumentException(CuestionarioPConstants.SERV_ID_TCAMBIARPREGUNTA108, CuestionarioPConstants.CLASS_ID, CuestionarioPConstants.ARG_ID_TCAMBIARPREGUNTA108_CUESTIONARIOPTCAMBIARPREGUNTA108PTHISCUESTIONARIOP, CuestionarioPConstants.SERV_ALIAS_TCAMBIARPREGUNTA108, CuestionarioPConstants.CLASS_ALIAS, CuestionarioPConstants.ARG_ALIAS_TCAMBIARPREGUNTA108_CUESTIONARIOPTCAMBIARPREGUNTA108PTHISCUESTIONARIOP);
        }
    }
}
