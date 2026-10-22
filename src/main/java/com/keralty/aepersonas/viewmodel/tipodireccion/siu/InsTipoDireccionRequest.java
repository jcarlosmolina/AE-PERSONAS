package com.keralty.aepersonas.viewmodel.tipodireccion.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.TipoDireccionConstants;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.oid.DireccionOid;
import com.keralty.aepersonas.persistence.oid.TipoDireccionOid;
import com.keralty.aepersonas.persistence.TipoDireccion;

public class InsTipoDireccionRequest {

    @JsonProperty("p_thistipodireccion_oid")
    private TipoDireccionOid tipoDireccionInsTipoDireccionpthisTipoDireccion;
    
    @JsonIgnore
    private TipoDireccion tipoDireccionInsTipoDireccionpthisTipoDireccionInstance;

    @JsonProperty("p_evcdireccion_oid")
    private DireccionOid tipoDireccionInsTipoDireccionpevcDireccion;
    
    @JsonIgnore
    private Direccion tipoDireccionInsTipoDireccionpevcDireccionInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkTipoDireccionInsTipoDireccionpthisTipoDireccion();
        checkTipoDireccionInsTipoDireccionpevcDireccion();
    }

    @JsonIgnore
    public TipoDireccionOid getTipoDireccionInsTipoDireccionpthisTipoDireccion() {
        return this.tipoDireccionInsTipoDireccionpthisTipoDireccion;
    }
    
    public void setTipoDireccionInsTipoDireccionpthisTipoDireccion(TipoDireccionOid tipoDireccionInsTipoDireccionpthisTipoDireccion) {
        this.tipoDireccionInsTipoDireccionpthisTipoDireccion = tipoDireccionInsTipoDireccionpthisTipoDireccion;
    }

    @JsonIgnore
    public TipoDireccion getTipoDireccionInsTipoDireccionpthisTipoDireccionInstance() {
        return this.tipoDireccionInsTipoDireccionpthisTipoDireccionInstance;
    }
    
    public void setTipoDireccionInsTipoDireccionpthisTipoDireccionInstance(TipoDireccion tipoDireccionInsTipoDireccionpthisTipoDireccion) {
        this.tipoDireccionInsTipoDireccionpthisTipoDireccionInstance = tipoDireccionInsTipoDireccionpthisTipoDireccion;
        this.tipoDireccionInsTipoDireccionpthisTipoDireccion = tipoDireccionInsTipoDireccionpthisTipoDireccion != null ? tipoDireccionInsTipoDireccionpthisTipoDireccion.getOid() : null;
    }

    private void checkTipoDireccionInsTipoDireccionpthisTipoDireccion() throws NotNullArgumentException {
        if(this.getTipoDireccionInsTipoDireccionpthisTipoDireccionInstance() == null || this.getTipoDireccionInsTipoDireccionpthisTipoDireccionInstance().isNull()) {
            throw new NotNullArgumentException(TipoDireccionConstants.SERV_ID_INSTIPODIRECCION, TipoDireccionConstants.CLASS_ID, TipoDireccionConstants.ARG_ID_INSTIPODIRECCION_TIPODIRECCIONINSTIPODIRECCIONPTHISTIPODIRECCION, TipoDireccionConstants.SERV_ALIAS_INSTIPODIRECCION, TipoDireccionConstants.CLASS_ALIAS, TipoDireccionConstants.ARG_ALIAS_INSTIPODIRECCION_TIPODIRECCIONINSTIPODIRECCIONPTHISTIPODIRECCION);
        }
    }

    @JsonIgnore
    public DireccionOid getTipoDireccionInsTipoDireccionpevcDireccion() {
        return this.tipoDireccionInsTipoDireccionpevcDireccion;
    }
    
    public void setTipoDireccionInsTipoDireccionpevcDireccion(DireccionOid tipoDireccionInsTipoDireccionpevcDireccion) {
        this.tipoDireccionInsTipoDireccionpevcDireccion = tipoDireccionInsTipoDireccionpevcDireccion;
    }

    @JsonIgnore
    public Direccion getTipoDireccionInsTipoDireccionpevcDireccionInstance() {
        return this.tipoDireccionInsTipoDireccionpevcDireccionInstance;
    }
    
    public void setTipoDireccionInsTipoDireccionpevcDireccionInstance(Direccion tipoDireccionInsTipoDireccionpevcDireccion) {
        this.tipoDireccionInsTipoDireccionpevcDireccionInstance = tipoDireccionInsTipoDireccionpevcDireccion;
        this.tipoDireccionInsTipoDireccionpevcDireccion = tipoDireccionInsTipoDireccionpevcDireccion != null ? tipoDireccionInsTipoDireccionpevcDireccion.getOid() : null;
    }

    private void checkTipoDireccionInsTipoDireccionpevcDireccion() throws NotNullArgumentException {
        if(this.getTipoDireccionInsTipoDireccionpevcDireccionInstance() == null || this.getTipoDireccionInsTipoDireccionpevcDireccionInstance().isNull()) {
            throw new NotNullArgumentException(TipoDireccionConstants.SERV_ID_INSTIPODIRECCION, TipoDireccionConstants.CLASS_ID, TipoDireccionConstants.ARG_ID_INSTIPODIRECCION_TIPODIRECCIONINSTIPODIRECCIONPEVCDIRECCION, TipoDireccionConstants.SERV_ALIAS_INSTIPODIRECCION, TipoDireccionConstants.CLASS_ALIAS, TipoDireccionConstants.ARG_ALIAS_INSTIPODIRECCION_TIPODIRECCIONINSTIPODIRECCIONPEVCDIRECCION);
        }
    }
}
