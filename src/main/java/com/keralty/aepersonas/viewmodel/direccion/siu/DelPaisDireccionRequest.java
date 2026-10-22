package com.keralty.aepersonas.viewmodel.direccion.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.DireccionConstants;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.oid.DireccionOid;
import com.keralty.aepersonas.persistence.oid.PaisOid;
import com.keralty.aepersonas.persistence.Pais;

public class DelPaisDireccionRequest {

    @JsonProperty("p_thisdireccion_oid")
    private DireccionOid direccionDelPaisDireccionpthisDireccion;
    
    @JsonIgnore
    private Direccion direccionDelPaisDireccionpthisDireccionInstance;

    @JsonProperty("p_evcpais_oid")
    private PaisOid direccionDelPaisDireccionpevcPais;
    
    @JsonIgnore
    private Pais direccionDelPaisDireccionpevcPaisInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkDireccionDelPaisDireccionpthisDireccion();
        checkDireccionDelPaisDireccionpevcPais();
    }

    @JsonIgnore
    public DireccionOid getDireccionDelPaisDireccionpthisDireccion() {
        return this.direccionDelPaisDireccionpthisDireccion;
    }
    
    public void setDireccionDelPaisDireccionpthisDireccion(DireccionOid direccionDelPaisDireccionpthisDireccion) {
        this.direccionDelPaisDireccionpthisDireccion = direccionDelPaisDireccionpthisDireccion;
    }

    @JsonIgnore
    public Direccion getDireccionDelPaisDireccionpthisDireccionInstance() {
        return this.direccionDelPaisDireccionpthisDireccionInstance;
    }
    
    public void setDireccionDelPaisDireccionpthisDireccionInstance(Direccion direccionDelPaisDireccionpthisDireccion) {
        this.direccionDelPaisDireccionpthisDireccionInstance = direccionDelPaisDireccionpthisDireccion;
        this.direccionDelPaisDireccionpthisDireccion = direccionDelPaisDireccionpthisDireccion != null ? direccionDelPaisDireccionpthisDireccion.getOid() : null;
    }

    private void checkDireccionDelPaisDireccionpthisDireccion() throws NotNullArgumentException {
        if(this.getDireccionDelPaisDireccionpthisDireccionInstance() == null || this.getDireccionDelPaisDireccionpthisDireccionInstance().isNull()) {
            throw new NotNullArgumentException(DireccionConstants.SERV_ID_DELPAISDIRECCION, DireccionConstants.CLASS_ID, DireccionConstants.ARG_ID_DELPAISDIRECCION_DIRECCIONDELPAISDIRECCIONPTHISDIRECCION, DireccionConstants.SERV_ALIAS_DELPAISDIRECCION, DireccionConstants.CLASS_ALIAS, DireccionConstants.ARG_ALIAS_DELPAISDIRECCION_DIRECCIONDELPAISDIRECCIONPTHISDIRECCION);
        }
    }

    @JsonIgnore
    public PaisOid getDireccionDelPaisDireccionpevcPais() {
        return this.direccionDelPaisDireccionpevcPais;
    }
    
    public void setDireccionDelPaisDireccionpevcPais(PaisOid direccionDelPaisDireccionpevcPais) {
        this.direccionDelPaisDireccionpevcPais = direccionDelPaisDireccionpevcPais;
    }

    @JsonIgnore
    public Pais getDireccionDelPaisDireccionpevcPaisInstance() {
        return this.direccionDelPaisDireccionpevcPaisInstance;
    }
    
    public void setDireccionDelPaisDireccionpevcPaisInstance(Pais direccionDelPaisDireccionpevcPais) {
        this.direccionDelPaisDireccionpevcPaisInstance = direccionDelPaisDireccionpevcPais;
        this.direccionDelPaisDireccionpevcPais = direccionDelPaisDireccionpevcPais != null ? direccionDelPaisDireccionpevcPais.getOid() : null;
    }

    private void checkDireccionDelPaisDireccionpevcPais() throws NotNullArgumentException {
        if(this.getDireccionDelPaisDireccionpevcPaisInstance() == null || this.getDireccionDelPaisDireccionpevcPaisInstance().isNull()) {
            throw new NotNullArgumentException(DireccionConstants.SERV_ID_DELPAISDIRECCION, DireccionConstants.CLASS_ID, DireccionConstants.ARG_ID_DELPAISDIRECCION_DIRECCIONDELPAISDIRECCIONPEVCPAIS, DireccionConstants.SERV_ALIAS_DELPAISDIRECCION, DireccionConstants.CLASS_ALIAS, DireccionConstants.ARG_ALIAS_DELPAISDIRECCION_DIRECCIONDELPAISDIRECCIONPEVCPAIS);
        }
    }
}
