package com.keralty.aepersonas.viewmodel.tipodireccion.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.TipoDireccionConstants;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.oid.DireccionOid;
import com.keralty.aepersonas.persistence.oid.TipoDireccionOid;
import com.keralty.aepersonas.persistence.TipoDireccion;

public class DelTipoDireccionRequest {

    @JsonProperty("p_thistipodireccion_oid")
    private TipoDireccionOid tipoDireccionDelTipoDireccionpthisTipoDireccion;
    
    @JsonIgnore
    private TipoDireccion tipoDireccionDelTipoDireccionpthisTipoDireccionInstance;

    @JsonProperty("p_evcdireccion_oid")
    private DireccionOid tipoDireccionDelTipoDireccionpevcDireccion;
    
    @JsonIgnore
    private Direccion tipoDireccionDelTipoDireccionpevcDireccionInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkTipoDireccionDelTipoDireccionpthisTipoDireccion();
        checkTipoDireccionDelTipoDireccionpevcDireccion();
    }

    @JsonIgnore
    public TipoDireccionOid getTipoDireccionDelTipoDireccionpthisTipoDireccion() {
        return this.tipoDireccionDelTipoDireccionpthisTipoDireccion;
    }
    
    public void setTipoDireccionDelTipoDireccionpthisTipoDireccion(TipoDireccionOid tipoDireccionDelTipoDireccionpthisTipoDireccion) {
        this.tipoDireccionDelTipoDireccionpthisTipoDireccion = tipoDireccionDelTipoDireccionpthisTipoDireccion;
    }

    @JsonIgnore
    public TipoDireccion getTipoDireccionDelTipoDireccionpthisTipoDireccionInstance() {
        return this.tipoDireccionDelTipoDireccionpthisTipoDireccionInstance;
    }
    
    public void setTipoDireccionDelTipoDireccionpthisTipoDireccionInstance(TipoDireccion tipoDireccionDelTipoDireccionpthisTipoDireccion) {
        this.tipoDireccionDelTipoDireccionpthisTipoDireccionInstance = tipoDireccionDelTipoDireccionpthisTipoDireccion;
        this.tipoDireccionDelTipoDireccionpthisTipoDireccion = tipoDireccionDelTipoDireccionpthisTipoDireccion != null ? tipoDireccionDelTipoDireccionpthisTipoDireccion.getOid() : null;
    }

    private void checkTipoDireccionDelTipoDireccionpthisTipoDireccion() throws NotNullArgumentException {
        if(this.getTipoDireccionDelTipoDireccionpthisTipoDireccionInstance() == null || this.getTipoDireccionDelTipoDireccionpthisTipoDireccionInstance().isNull()) {
            throw new NotNullArgumentException(TipoDireccionConstants.SERV_ID_DELTIPODIRECCION, TipoDireccionConstants.CLASS_ID, TipoDireccionConstants.ARG_ID_DELTIPODIRECCION_TIPODIRECCIONDELTIPODIRECCIONPTHISTIPODIRECCION, TipoDireccionConstants.SERV_ALIAS_DELTIPODIRECCION, TipoDireccionConstants.CLASS_ALIAS, TipoDireccionConstants.ARG_ALIAS_DELTIPODIRECCION_TIPODIRECCIONDELTIPODIRECCIONPTHISTIPODIRECCION);
        }
    }

    @JsonIgnore
    public DireccionOid getTipoDireccionDelTipoDireccionpevcDireccion() {
        return this.tipoDireccionDelTipoDireccionpevcDireccion;
    }
    
    public void setTipoDireccionDelTipoDireccionpevcDireccion(DireccionOid tipoDireccionDelTipoDireccionpevcDireccion) {
        this.tipoDireccionDelTipoDireccionpevcDireccion = tipoDireccionDelTipoDireccionpevcDireccion;
    }

    @JsonIgnore
    public Direccion getTipoDireccionDelTipoDireccionpevcDireccionInstance() {
        return this.tipoDireccionDelTipoDireccionpevcDireccionInstance;
    }
    
    public void setTipoDireccionDelTipoDireccionpevcDireccionInstance(Direccion tipoDireccionDelTipoDireccionpevcDireccion) {
        this.tipoDireccionDelTipoDireccionpevcDireccionInstance = tipoDireccionDelTipoDireccionpevcDireccion;
        this.tipoDireccionDelTipoDireccionpevcDireccion = tipoDireccionDelTipoDireccionpevcDireccion != null ? tipoDireccionDelTipoDireccionpevcDireccion.getOid() : null;
    }

    private void checkTipoDireccionDelTipoDireccionpevcDireccion() throws NotNullArgumentException {
        if(this.getTipoDireccionDelTipoDireccionpevcDireccionInstance() == null || this.getTipoDireccionDelTipoDireccionpevcDireccionInstance().isNull()) {
            throw new NotNullArgumentException(TipoDireccionConstants.SERV_ID_DELTIPODIRECCION, TipoDireccionConstants.CLASS_ID, TipoDireccionConstants.ARG_ID_DELTIPODIRECCION_TIPODIRECCIONDELTIPODIRECCIONPEVCDIRECCION, TipoDireccionConstants.SERV_ALIAS_DELTIPODIRECCION, TipoDireccionConstants.CLASS_ALIAS, TipoDireccionConstants.ARG_ALIAS_DELTIPODIRECCION_TIPODIRECCIONDELTIPODIRECCIONPEVCDIRECCION);
        }
    }
}
