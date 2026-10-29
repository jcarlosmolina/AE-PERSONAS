package com.keralty.aepersonas.viewmodel.direccion.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.DireccionConstants;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.oid.DireccionOid;
import com.keralty.aepersonas.persistence.oid.TipoDireccionOid;
import com.keralty.aepersonas.persistence.TipoDireccion;

public class InsTipoDireccionRequest {

    @JsonProperty("p_thisdireccion_oid")
    private DireccionOid direccionInsTipoDireccionpthisDireccion;
    
    @JsonIgnore
    private Direccion direccionInsTipoDireccionpthisDireccionInstance;

    @JsonProperty("p_evctipodireccion_oid")
    private TipoDireccionOid direccionInsTipoDireccionpevcTipoDireccion;
    
    @JsonIgnore
    private TipoDireccion direccionInsTipoDireccionpevcTipoDireccionInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkDireccionInsTipoDireccionpthisDireccion();
        checkDireccionInsTipoDireccionpevcTipoDireccion();
    }

    @JsonIgnore
    public DireccionOid getDireccionInsTipoDireccionpthisDireccion() {
        return this.direccionInsTipoDireccionpthisDireccion;
    }
    
    public void setDireccionInsTipoDireccionpthisDireccion(DireccionOid direccionInsTipoDireccionpthisDireccion) {
        this.direccionInsTipoDireccionpthisDireccion = direccionInsTipoDireccionpthisDireccion;
    }

    @JsonIgnore
    public Direccion getDireccionInsTipoDireccionpthisDireccionInstance() {
        return this.direccionInsTipoDireccionpthisDireccionInstance;
    }
    
    public void setDireccionInsTipoDireccionpthisDireccionInstance(Direccion direccionInsTipoDireccionpthisDireccion) {
        this.direccionInsTipoDireccionpthisDireccionInstance = direccionInsTipoDireccionpthisDireccion;
        this.direccionInsTipoDireccionpthisDireccion = direccionInsTipoDireccionpthisDireccion != null ? direccionInsTipoDireccionpthisDireccion.getOid() : null;
    }

    private void checkDireccionInsTipoDireccionpthisDireccion() throws NotNullArgumentException {
        if(this.getDireccionInsTipoDireccionpthisDireccionInstance() == null || this.getDireccionInsTipoDireccionpthisDireccionInstance().isNull()) {
            throw new NotNullArgumentException(DireccionConstants.SERV_ID_INSTIPODIRECCION, DireccionConstants.CLASS_ID, DireccionConstants.ARG_ID_INSTIPODIRECCION_DIRECCIONINSTIPODIRECCIONPTHISDIRECCION, DireccionConstants.SERV_ALIAS_INSTIPODIRECCION, DireccionConstants.CLASS_ALIAS, DireccionConstants.ARG_ALIAS_INSTIPODIRECCION_DIRECCIONINSTIPODIRECCIONPTHISDIRECCION);
        }
    }

    @JsonIgnore
    public TipoDireccionOid getDireccionInsTipoDireccionpevcTipoDireccion() {
        return this.direccionInsTipoDireccionpevcTipoDireccion;
    }
    
    public void setDireccionInsTipoDireccionpevcTipoDireccion(TipoDireccionOid direccionInsTipoDireccionpevcTipoDireccion) {
        this.direccionInsTipoDireccionpevcTipoDireccion = direccionInsTipoDireccionpevcTipoDireccion;
    }

    @JsonIgnore
    public TipoDireccion getDireccionInsTipoDireccionpevcTipoDireccionInstance() {
        return this.direccionInsTipoDireccionpevcTipoDireccionInstance;
    }
    
    public void setDireccionInsTipoDireccionpevcTipoDireccionInstance(TipoDireccion direccionInsTipoDireccionpevcTipoDireccion) {
        this.direccionInsTipoDireccionpevcTipoDireccionInstance = direccionInsTipoDireccionpevcTipoDireccion;
        this.direccionInsTipoDireccionpevcTipoDireccion = direccionInsTipoDireccionpevcTipoDireccion != null ? direccionInsTipoDireccionpevcTipoDireccion.getOid() : null;
    }

    private void checkDireccionInsTipoDireccionpevcTipoDireccion() throws NotNullArgumentException {
        if(this.getDireccionInsTipoDireccionpevcTipoDireccionInstance() == null || this.getDireccionInsTipoDireccionpevcTipoDireccionInstance().isNull()) {
            throw new NotNullArgumentException(DireccionConstants.SERV_ID_INSTIPODIRECCION, DireccionConstants.CLASS_ID, DireccionConstants.ARG_ID_INSTIPODIRECCION_DIRECCIONINSTIPODIRECCIONPEVCTIPODIRECCION, DireccionConstants.SERV_ALIAS_INSTIPODIRECCION, DireccionConstants.CLASS_ALIAS, DireccionConstants.ARG_ALIAS_INSTIPODIRECCION_DIRECCIONINSTIPODIRECCIONPEVCTIPODIRECCION);
        }
    }
}
