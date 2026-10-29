package com.keralty.aepersonas.viewmodel.direccion.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.DireccionConstants;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.oid.DireccionOid;

public class RegistrarCodigoRequest {

    @JsonProperty("p_thisdireccion_oid")
    private DireccionOid direccionregistrarCodigopthisDireccion;
    
    @JsonIgnore
    private Direccion direccionregistrarCodigopthisDireccionInstance;

    @JsonProperty("p_codigo")
    private Long direccionregistrarCodigopCodigo;

    public void checkArguments() throws NotNullArgumentException {
        checkDireccionregistrarCodigopthisDireccion();
        checkDireccionregistrarCodigopCodigo();
    }

    @JsonIgnore
    public DireccionOid getDireccionregistrarCodigopthisDireccion() {
        return this.direccionregistrarCodigopthisDireccion;
    }
    
    public void setDireccionregistrarCodigopthisDireccion(DireccionOid direccionregistrarCodigopthisDireccion) {
        this.direccionregistrarCodigopthisDireccion = direccionregistrarCodigopthisDireccion;
    }

    @JsonIgnore
    public Direccion getDireccionregistrarCodigopthisDireccionInstance() {
        return this.direccionregistrarCodigopthisDireccionInstance;
    }
    
    public void setDireccionregistrarCodigopthisDireccionInstance(Direccion direccionregistrarCodigopthisDireccion) {
        this.direccionregistrarCodigopthisDireccionInstance = direccionregistrarCodigopthisDireccion;
        this.direccionregistrarCodigopthisDireccion = direccionregistrarCodigopthisDireccion != null ? direccionregistrarCodigopthisDireccion.getOid() : null;
    }

    private void checkDireccionregistrarCodigopthisDireccion() throws NotNullArgumentException {
        if(this.getDireccionregistrarCodigopthisDireccionInstance() == null || this.getDireccionregistrarCodigopthisDireccionInstance().isNull()) {
            throw new NotNullArgumentException(DireccionConstants.SERV_ID_REGISTRARCODIGO, DireccionConstants.CLASS_ID, DireccionConstants.ARG_ID_REGISTRARCODIGO_DIRECCIONREGISTRARCODIGOPTHISDIRECCION, DireccionConstants.SERV_ALIAS_REGISTRARCODIGO, DireccionConstants.CLASS_ALIAS, DireccionConstants.ARG_ALIAS_REGISTRARCODIGO_DIRECCIONREGISTRARCODIGOPTHISDIRECCION);
        }
    }

    @JsonIgnore
    public Long getDireccionregistrarCodigopCodigo() {
        return this.direccionregistrarCodigopCodigo;
    }
    
    public void setDireccionregistrarCodigopCodigo(Long direccionregistrarCodigopCodigo) {
        this.direccionregistrarCodigopCodigo = direccionregistrarCodigopCodigo;
    }

    private void checkDireccionregistrarCodigopCodigo() throws NotNullArgumentException {
        if(this.getDireccionregistrarCodigopCodigo() == null) {
            throw new NotNullArgumentException(DireccionConstants.SERV_ID_REGISTRARCODIGO, DireccionConstants.CLASS_ID, DireccionConstants.ARG_ID_REGISTRARCODIGO_DIRECCIONREGISTRARCODIGOPCODIGO, DireccionConstants.SERV_ALIAS_REGISTRARCODIGO, DireccionConstants.CLASS_ALIAS, DireccionConstants.ARG_ALIAS_REGISTRARCODIGO_DIRECCIONREGISTRARCODIGOPCODIGO);
        }
    }
}
