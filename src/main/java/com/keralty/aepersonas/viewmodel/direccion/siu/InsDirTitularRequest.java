package com.keralty.aepersonas.viewmodel.direccion.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.DireccionConstants;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.oid.DireccionOid;
import com.keralty.aepersonas.persistence.oid.TitularOid;
import com.keralty.aepersonas.persistence.Titular;

public class InsDirTitularRequest {

    @JsonProperty("p_thisdireccion_oid")
    private DireccionOid direccionInsDirTitularpthisDireccion;
    
    @JsonIgnore
    private Direccion direccionInsDirTitularpthisDireccionInstance;

    @JsonProperty("p_evctitular_oid")
    private TitularOid direccionInsDirTitularpevcTitular;
    
    @JsonIgnore
    private Titular direccionInsDirTitularpevcTitularInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkDireccionInsDirTitularpthisDireccion();
        checkDireccionInsDirTitularpevcTitular();
    }

    @JsonIgnore
    public DireccionOid getDireccionInsDirTitularpthisDireccion() {
        return this.direccionInsDirTitularpthisDireccion;
    }
    
    public void setDireccionInsDirTitularpthisDireccion(DireccionOid direccionInsDirTitularpthisDireccion) {
        this.direccionInsDirTitularpthisDireccion = direccionInsDirTitularpthisDireccion;
    }

    @JsonIgnore
    public Direccion getDireccionInsDirTitularpthisDireccionInstance() {
        return this.direccionInsDirTitularpthisDireccionInstance;
    }
    
    public void setDireccionInsDirTitularpthisDireccionInstance(Direccion direccionInsDirTitularpthisDireccion) {
        this.direccionInsDirTitularpthisDireccionInstance = direccionInsDirTitularpthisDireccion;
        this.direccionInsDirTitularpthisDireccion = direccionInsDirTitularpthisDireccion != null ? direccionInsDirTitularpthisDireccion.getOid() : null;
    }

    private void checkDireccionInsDirTitularpthisDireccion() throws NotNullArgumentException {
        if(this.getDireccionInsDirTitularpthisDireccionInstance() == null || this.getDireccionInsDirTitularpthisDireccionInstance().isNull()) {
            throw new NotNullArgumentException(DireccionConstants.SERV_ID_INSDIRTITULAR, DireccionConstants.CLASS_ID, DireccionConstants.ARG_ID_INSDIRTITULAR_DIRECCIONINSDIRTITULARPTHISDIRECCION, DireccionConstants.SERV_ALIAS_INSDIRTITULAR, DireccionConstants.CLASS_ALIAS, DireccionConstants.ARG_ALIAS_INSDIRTITULAR_DIRECCIONINSDIRTITULARPTHISDIRECCION);
        }
    }

    @JsonIgnore
    public TitularOid getDireccionInsDirTitularpevcTitular() {
        return this.direccionInsDirTitularpevcTitular;
    }
    
    public void setDireccionInsDirTitularpevcTitular(TitularOid direccionInsDirTitularpevcTitular) {
        this.direccionInsDirTitularpevcTitular = direccionInsDirTitularpevcTitular;
    }

    @JsonIgnore
    public Titular getDireccionInsDirTitularpevcTitularInstance() {
        return this.direccionInsDirTitularpevcTitularInstance;
    }
    
    public void setDireccionInsDirTitularpevcTitularInstance(Titular direccionInsDirTitularpevcTitular) {
        this.direccionInsDirTitularpevcTitularInstance = direccionInsDirTitularpevcTitular;
        this.direccionInsDirTitularpevcTitular = direccionInsDirTitularpevcTitular != null ? direccionInsDirTitularpevcTitular.getOid() : null;
    }

    private void checkDireccionInsDirTitularpevcTitular() throws NotNullArgumentException {
        if(this.getDireccionInsDirTitularpevcTitularInstance() == null || this.getDireccionInsDirTitularpevcTitularInstance().isNull()) {
            throw new NotNullArgumentException(DireccionConstants.SERV_ID_INSDIRTITULAR, DireccionConstants.CLASS_ID, DireccionConstants.ARG_ID_INSDIRTITULAR_DIRECCIONINSDIRTITULARPEVCTITULAR, DireccionConstants.SERV_ALIAS_INSDIRTITULAR, DireccionConstants.CLASS_ALIAS, DireccionConstants.ARG_ALIAS_INSDIRTITULAR_DIRECCIONINSDIRTITULARPEVCTITULAR);
        }
    }
}
