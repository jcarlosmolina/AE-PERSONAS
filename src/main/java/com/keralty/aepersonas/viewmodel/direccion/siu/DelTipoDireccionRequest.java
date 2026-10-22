package com.keralty.aepersonas.viewmodel.direccion.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.DireccionConstants;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.oid.DireccionOid;
import com.keralty.aepersonas.persistence.oid.TipoDireccionOid;
import com.keralty.aepersonas.persistence.TipoDireccion;

public class DelTipoDireccionRequest {

    @JsonProperty("p_thisdireccion_oid")
    private DireccionOid direccionDelTipoDireccionpthisDireccion;
    
    @JsonIgnore
    private Direccion direccionDelTipoDireccionpthisDireccionInstance;

    @JsonProperty("p_evctipodireccion_oid")
    private TipoDireccionOid direccionDelTipoDireccionpevcTipoDireccion;
    
    @JsonIgnore
    private TipoDireccion direccionDelTipoDireccionpevcTipoDireccionInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkDireccionDelTipoDireccionpthisDireccion();
        checkDireccionDelTipoDireccionpevcTipoDireccion();
    }

    @JsonIgnore
    public DireccionOid getDireccionDelTipoDireccionpthisDireccion() {
        return this.direccionDelTipoDireccionpthisDireccion;
    }
    
    public void setDireccionDelTipoDireccionpthisDireccion(DireccionOid direccionDelTipoDireccionpthisDireccion) {
        this.direccionDelTipoDireccionpthisDireccion = direccionDelTipoDireccionpthisDireccion;
    }

    @JsonIgnore
    public Direccion getDireccionDelTipoDireccionpthisDireccionInstance() {
        return this.direccionDelTipoDireccionpthisDireccionInstance;
    }
    
    public void setDireccionDelTipoDireccionpthisDireccionInstance(Direccion direccionDelTipoDireccionpthisDireccion) {
        this.direccionDelTipoDireccionpthisDireccionInstance = direccionDelTipoDireccionpthisDireccion;
        this.direccionDelTipoDireccionpthisDireccion = direccionDelTipoDireccionpthisDireccion != null ? direccionDelTipoDireccionpthisDireccion.getOid() : null;
    }

    private void checkDireccionDelTipoDireccionpthisDireccion() throws NotNullArgumentException {
        if(this.getDireccionDelTipoDireccionpthisDireccionInstance() == null || this.getDireccionDelTipoDireccionpthisDireccionInstance().isNull()) {
            throw new NotNullArgumentException(DireccionConstants.SERV_ID_DELTIPODIRECCION, DireccionConstants.CLASS_ID, DireccionConstants.ARG_ID_DELTIPODIRECCION_DIRECCIONDELTIPODIRECCIONPTHISDIRECCION, DireccionConstants.SERV_ALIAS_DELTIPODIRECCION, DireccionConstants.CLASS_ALIAS, DireccionConstants.ARG_ALIAS_DELTIPODIRECCION_DIRECCIONDELTIPODIRECCIONPTHISDIRECCION);
        }
    }

    @JsonIgnore
    public TipoDireccionOid getDireccionDelTipoDireccionpevcTipoDireccion() {
        return this.direccionDelTipoDireccionpevcTipoDireccion;
    }
    
    public void setDireccionDelTipoDireccionpevcTipoDireccion(TipoDireccionOid direccionDelTipoDireccionpevcTipoDireccion) {
        this.direccionDelTipoDireccionpevcTipoDireccion = direccionDelTipoDireccionpevcTipoDireccion;
    }

    @JsonIgnore
    public TipoDireccion getDireccionDelTipoDireccionpevcTipoDireccionInstance() {
        return this.direccionDelTipoDireccionpevcTipoDireccionInstance;
    }
    
    public void setDireccionDelTipoDireccionpevcTipoDireccionInstance(TipoDireccion direccionDelTipoDireccionpevcTipoDireccion) {
        this.direccionDelTipoDireccionpevcTipoDireccionInstance = direccionDelTipoDireccionpevcTipoDireccion;
        this.direccionDelTipoDireccionpevcTipoDireccion = direccionDelTipoDireccionpevcTipoDireccion != null ? direccionDelTipoDireccionpevcTipoDireccion.getOid() : null;
    }

    private void checkDireccionDelTipoDireccionpevcTipoDireccion() throws NotNullArgumentException {
        if(this.getDireccionDelTipoDireccionpevcTipoDireccionInstance() == null || this.getDireccionDelTipoDireccionpevcTipoDireccionInstance().isNull()) {
            throw new NotNullArgumentException(DireccionConstants.SERV_ID_DELTIPODIRECCION, DireccionConstants.CLASS_ID, DireccionConstants.ARG_ID_DELTIPODIRECCION_DIRECCIONDELTIPODIRECCIONPEVCTIPODIRECCION, DireccionConstants.SERV_ALIAS_DELTIPODIRECCION, DireccionConstants.CLASS_ALIAS, DireccionConstants.ARG_ALIAS_DELTIPODIRECCION_DIRECCIONDELTIPODIRECCIONPEVCTIPODIRECCION);
        }
    }
}
