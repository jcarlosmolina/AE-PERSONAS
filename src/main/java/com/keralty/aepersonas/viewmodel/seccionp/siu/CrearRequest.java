package com.keralty.aepersonas.viewmodel.seccionp.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.SeccionPConstants;
import com.keralty.aepersonas.persistence.CuestionarioP;
import com.keralty.aepersonas.persistence.oid.CuestionarioPOid;

public class CrearRequest {

    @JsonProperty("p_agrcuestionario_oid")
    private CuestionarioPOid seccionPcrearpagrCuestionario;
    
    @JsonIgnore
    private CuestionarioP seccionPcrearpagrCuestionarioInstance;

    @JsonProperty("p_atrnombre")
    private String seccionPcrearpatrNombre;

    @JsonProperty("p_atrnumorden")
    private Long seccionPcrearpatrNumOrden;

    public void checkArguments() throws NotNullArgumentException {
        checkSeccionPcrearpagrCuestionario();
        checkSeccionPcrearpatrNombre();
        checkSeccionPcrearpatrNumOrden();
    }

    @JsonIgnore
    public CuestionarioPOid getSeccionPcrearpagrCuestionario() {
        return this.seccionPcrearpagrCuestionario;
    }
    
    public void setSeccionPcrearpagrCuestionario(CuestionarioPOid seccionPcrearpagrCuestionario) {
        this.seccionPcrearpagrCuestionario = seccionPcrearpagrCuestionario;
    }

    @JsonIgnore
    public CuestionarioP getSeccionPcrearpagrCuestionarioInstance() {
        return this.seccionPcrearpagrCuestionarioInstance;
    }
    
    public void setSeccionPcrearpagrCuestionarioInstance(CuestionarioP seccionPcrearpagrCuestionario) {
        this.seccionPcrearpagrCuestionarioInstance = seccionPcrearpagrCuestionario;
        this.seccionPcrearpagrCuestionario = seccionPcrearpagrCuestionario != null ? seccionPcrearpagrCuestionario.getOid() : null;
    }

    private void checkSeccionPcrearpagrCuestionario() throws NotNullArgumentException {
        if(this.getSeccionPcrearpagrCuestionarioInstance() == null || this.getSeccionPcrearpagrCuestionarioInstance().isNull()) {
            throw new NotNullArgumentException(SeccionPConstants.SERV_ID_CREAR, SeccionPConstants.CLASS_ID, SeccionPConstants.ARG_ID_CREAR_SECCIONPCREARPAGRCUESTIONARIO, SeccionPConstants.SERV_ALIAS_CREAR, SeccionPConstants.CLASS_ALIAS, SeccionPConstants.ARG_ALIAS_CREAR_SECCIONPCREARPAGRCUESTIONARIO);
        }
    }

    @JsonIgnore
    public String getSeccionPcrearpatrNombre() {
        return this.seccionPcrearpatrNombre;
    }
    
    public void setSeccionPcrearpatrNombre(String seccionPcrearpatrNombre) {
        this.seccionPcrearpatrNombre = seccionPcrearpatrNombre;
    }

    private void checkSeccionPcrearpatrNombre() throws NotNullArgumentException {
        if(this.getSeccionPcrearpatrNombre() == null) {
            throw new NotNullArgumentException(SeccionPConstants.SERV_ID_CREAR, SeccionPConstants.CLASS_ID, SeccionPConstants.ARG_ID_CREAR_SECCIONPCREARPATRNOMBRE, SeccionPConstants.SERV_ALIAS_CREAR, SeccionPConstants.CLASS_ALIAS, SeccionPConstants.ARG_ALIAS_CREAR_SECCIONPCREARPATRNOMBRE);
        }
    }

    @JsonIgnore
    public Long getSeccionPcrearpatrNumOrden() {
        return this.seccionPcrearpatrNumOrden;
    }
    
    public void setSeccionPcrearpatrNumOrden(Long seccionPcrearpatrNumOrden) {
        this.seccionPcrearpatrNumOrden = seccionPcrearpatrNumOrden;
    }

    private void checkSeccionPcrearpatrNumOrden() throws NotNullArgumentException {
        if(this.getSeccionPcrearpatrNumOrden() == null) {
            throw new NotNullArgumentException(SeccionPConstants.SERV_ID_CREAR, SeccionPConstants.CLASS_ID, SeccionPConstants.ARG_ID_CREAR_SECCIONPCREARPATRNUMORDEN, SeccionPConstants.SERV_ALIAS_CREAR, SeccionPConstants.CLASS_ALIAS, SeccionPConstants.ARG_ALIAS_CREAR_SECCIONPCREARPATRNUMORDEN);
        }
    }
}
