package com.keralty.aepersonas.viewmodel.direccion.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.DireccionConstants;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.oid.DireccionOid;
import com.keralty.aepersonas.persistence.oid.PaisOid;
import com.keralty.aepersonas.persistence.Pais;

public class InsPaisDireccionRequest {

    @JsonProperty("p_thisdireccion_oid")
    private DireccionOid direccionInsPaisDireccionpthisDireccion;
    
    @JsonIgnore
    private Direccion direccionInsPaisDireccionpthisDireccionInstance;

    @JsonProperty("p_evcpais_oid")
    private PaisOid direccionInsPaisDireccionpevcPais;
    
    @JsonIgnore
    private Pais direccionInsPaisDireccionpevcPaisInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkDireccionInsPaisDireccionpthisDireccion();
        checkDireccionInsPaisDireccionpevcPais();
    }

    @JsonIgnore
    public DireccionOid getDireccionInsPaisDireccionpthisDireccion() {
        return this.direccionInsPaisDireccionpthisDireccion;
    }
    
    public void setDireccionInsPaisDireccionpthisDireccion(DireccionOid direccionInsPaisDireccionpthisDireccion) {
        this.direccionInsPaisDireccionpthisDireccion = direccionInsPaisDireccionpthisDireccion;
    }

    @JsonIgnore
    public Direccion getDireccionInsPaisDireccionpthisDireccionInstance() {
        return this.direccionInsPaisDireccionpthisDireccionInstance;
    }
    
    public void setDireccionInsPaisDireccionpthisDireccionInstance(Direccion direccionInsPaisDireccionpthisDireccion) {
        this.direccionInsPaisDireccionpthisDireccionInstance = direccionInsPaisDireccionpthisDireccion;
        this.direccionInsPaisDireccionpthisDireccion = direccionInsPaisDireccionpthisDireccion != null ? direccionInsPaisDireccionpthisDireccion.getOid() : null;
    }

    private void checkDireccionInsPaisDireccionpthisDireccion() throws NotNullArgumentException {
        if(this.getDireccionInsPaisDireccionpthisDireccionInstance() == null || this.getDireccionInsPaisDireccionpthisDireccionInstance().isNull()) {
            throw new NotNullArgumentException(DireccionConstants.SERV_ID_INSPAISDIRECCION, DireccionConstants.CLASS_ID, DireccionConstants.ARG_ID_INSPAISDIRECCION_DIRECCIONINSPAISDIRECCIONPTHISDIRECCION, DireccionConstants.SERV_ALIAS_INSPAISDIRECCION, DireccionConstants.CLASS_ALIAS, DireccionConstants.ARG_ALIAS_INSPAISDIRECCION_DIRECCIONINSPAISDIRECCIONPTHISDIRECCION);
        }
    }

    @JsonIgnore
    public PaisOid getDireccionInsPaisDireccionpevcPais() {
        return this.direccionInsPaisDireccionpevcPais;
    }
    
    public void setDireccionInsPaisDireccionpevcPais(PaisOid direccionInsPaisDireccionpevcPais) {
        this.direccionInsPaisDireccionpevcPais = direccionInsPaisDireccionpevcPais;
    }

    @JsonIgnore
    public Pais getDireccionInsPaisDireccionpevcPaisInstance() {
        return this.direccionInsPaisDireccionpevcPaisInstance;
    }
    
    public void setDireccionInsPaisDireccionpevcPaisInstance(Pais direccionInsPaisDireccionpevcPais) {
        this.direccionInsPaisDireccionpevcPaisInstance = direccionInsPaisDireccionpevcPais;
        this.direccionInsPaisDireccionpevcPais = direccionInsPaisDireccionpevcPais != null ? direccionInsPaisDireccionpevcPais.getOid() : null;
    }

    private void checkDireccionInsPaisDireccionpevcPais() throws NotNullArgumentException {
        if(this.getDireccionInsPaisDireccionpevcPaisInstance() == null || this.getDireccionInsPaisDireccionpevcPaisInstance().isNull()) {
            throw new NotNullArgumentException(DireccionConstants.SERV_ID_INSPAISDIRECCION, DireccionConstants.CLASS_ID, DireccionConstants.ARG_ID_INSPAISDIRECCION_DIRECCIONINSPAISDIRECCIONPEVCPAIS, DireccionConstants.SERV_ALIAS_INSPAISDIRECCION, DireccionConstants.CLASS_ALIAS, DireccionConstants.ARG_ALIAS_INSPAISDIRECCION_DIRECCIONINSPAISDIRECCIONPEVCPAIS);
        }
    }
}
