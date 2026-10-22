package com.keralty.aepersonas.viewmodel.direccion.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.DireccionConstants;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.oid.DireccionOid;

public class EliminarRequest {

    @JsonProperty("p_thisdireccion_oid")
    private DireccionOid direccioneliminarpthisDireccion;
    
    @JsonIgnore
    private Direccion direccioneliminarpthisDireccionInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkDireccioneliminarpthisDireccion();
    }

    @JsonIgnore
    public DireccionOid getDireccioneliminarpthisDireccion() {
        return this.direccioneliminarpthisDireccion;
    }
    
    public void setDireccioneliminarpthisDireccion(DireccionOid direccioneliminarpthisDireccion) {
        this.direccioneliminarpthisDireccion = direccioneliminarpthisDireccion;
    }

    @JsonIgnore
    public Direccion getDireccioneliminarpthisDireccionInstance() {
        return this.direccioneliminarpthisDireccionInstance;
    }
    
    public void setDireccioneliminarpthisDireccionInstance(Direccion direccioneliminarpthisDireccion) {
        this.direccioneliminarpthisDireccionInstance = direccioneliminarpthisDireccion;
        this.direccioneliminarpthisDireccion = direccioneliminarpthisDireccion != null ? direccioneliminarpthisDireccion.getOid() : null;
    }

    private void checkDireccioneliminarpthisDireccion() throws NotNullArgumentException {
        if(this.getDireccioneliminarpthisDireccionInstance() == null || this.getDireccioneliminarpthisDireccionInstance().isNull()) {
            throw new NotNullArgumentException(DireccionConstants.SERV_ID_ELIMINAR, DireccionConstants.CLASS_ID, DireccionConstants.ARG_ID_ELIMINAR_DIRECCIONELIMINARPTHISDIRECCION, DireccionConstants.SERV_ALIAS_ELIMINAR, DireccionConstants.CLASS_ALIAS, DireccionConstants.ARG_ALIAS_ELIMINAR_DIRECCIONELIMINARPTHISDIRECCION);
        }
    }
}
