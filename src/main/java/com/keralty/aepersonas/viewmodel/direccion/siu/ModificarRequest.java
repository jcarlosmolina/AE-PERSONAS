package com.keralty.aepersonas.viewmodel.direccion.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.DireccionConstants;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.oid.DireccionOid;

public class ModificarRequest {

    @JsonProperty("p_thisdireccion_oid")
    private DireccionOid direccionmodificarpthisDireccion;
    
    @JsonIgnore
    private Direccion direccionmodificarpthisDireccionInstance;

    @JsonProperty("p_direccioncompleta")
    private String direccionmodificarpDireccionCompleta;

    @JsonProperty("p_rural")
    private Boolean direccionmodificarpRural;

    public void checkArguments() throws NotNullArgumentException {
        checkDireccionmodificarpthisDireccion();
    }

    @JsonIgnore
    public DireccionOid getDireccionmodificarpthisDireccion() {
        return this.direccionmodificarpthisDireccion;
    }
    
    public void setDireccionmodificarpthisDireccion(DireccionOid direccionmodificarpthisDireccion) {
        this.direccionmodificarpthisDireccion = direccionmodificarpthisDireccion;
    }

    @JsonIgnore
    public Direccion getDireccionmodificarpthisDireccionInstance() {
        return this.direccionmodificarpthisDireccionInstance;
    }
    
    public void setDireccionmodificarpthisDireccionInstance(Direccion direccionmodificarpthisDireccion) {
        this.direccionmodificarpthisDireccionInstance = direccionmodificarpthisDireccion;
        this.direccionmodificarpthisDireccion = direccionmodificarpthisDireccion != null ? direccionmodificarpthisDireccion.getOid() : null;
    }

    private void checkDireccionmodificarpthisDireccion() throws NotNullArgumentException {
        if(this.getDireccionmodificarpthisDireccionInstance() == null || this.getDireccionmodificarpthisDireccionInstance().isNull()) {
            throw new NotNullArgumentException(DireccionConstants.SERV_ID_MODIFICAR, DireccionConstants.CLASS_ID, DireccionConstants.ARG_ID_MODIFICAR_DIRECCIONMODIFICARPTHISDIRECCION, DireccionConstants.SERV_ALIAS_MODIFICAR, DireccionConstants.CLASS_ALIAS, DireccionConstants.ARG_ALIAS_MODIFICAR_DIRECCIONMODIFICARPTHISDIRECCION);
        }
    }

    @JsonIgnore
    public String getDireccionmodificarpDireccionCompleta() {
        return this.direccionmodificarpDireccionCompleta;
    }
    
    public void setDireccionmodificarpDireccionCompleta(String direccionmodificarpDireccionCompleta) {
        this.direccionmodificarpDireccionCompleta = direccionmodificarpDireccionCompleta;
    }

    @JsonIgnore
    public Boolean getDireccionmodificarpRural() {
        return this.direccionmodificarpRural;
    }
    
    public void setDireccionmodificarpRural(Boolean direccionmodificarpRural) {
        this.direccionmodificarpRural = direccionmodificarpRural;
    }
}
