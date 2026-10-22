package com.keralty.aepersonas.viewmodel.direccion.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.DireccionConstants;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.DireccionOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;

public class InsMunicipioDireccionRequest {

    @JsonProperty("p_thisdireccion_oid")
    private DireccionOid direccionInsMunicipioDireccionpthisDireccion;
    
    @JsonIgnore
    private Direccion direccionInsMunicipioDireccionpthisDireccionInstance;

    @JsonProperty("p_evcmunicipio_oid")
    private MunicipioOid direccionInsMunicipioDireccionpevcMunicipio;
    
    @JsonIgnore
    private Municipio direccionInsMunicipioDireccionpevcMunicipioInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkDireccionInsMunicipioDireccionpthisDireccion();
        checkDireccionInsMunicipioDireccionpevcMunicipio();
    }

    @JsonIgnore
    public DireccionOid getDireccionInsMunicipioDireccionpthisDireccion() {
        return this.direccionInsMunicipioDireccionpthisDireccion;
    }
    
    public void setDireccionInsMunicipioDireccionpthisDireccion(DireccionOid direccionInsMunicipioDireccionpthisDireccion) {
        this.direccionInsMunicipioDireccionpthisDireccion = direccionInsMunicipioDireccionpthisDireccion;
    }

    @JsonIgnore
    public Direccion getDireccionInsMunicipioDireccionpthisDireccionInstance() {
        return this.direccionInsMunicipioDireccionpthisDireccionInstance;
    }
    
    public void setDireccionInsMunicipioDireccionpthisDireccionInstance(Direccion direccionInsMunicipioDireccionpthisDireccion) {
        this.direccionInsMunicipioDireccionpthisDireccionInstance = direccionInsMunicipioDireccionpthisDireccion;
        this.direccionInsMunicipioDireccionpthisDireccion = direccionInsMunicipioDireccionpthisDireccion != null ? direccionInsMunicipioDireccionpthisDireccion.getOid() : null;
    }

    private void checkDireccionInsMunicipioDireccionpthisDireccion() throws NotNullArgumentException {
        if(this.getDireccionInsMunicipioDireccionpthisDireccionInstance() == null || this.getDireccionInsMunicipioDireccionpthisDireccionInstance().isNull()) {
            throw new NotNullArgumentException(DireccionConstants.SERV_ID_INSMUNICIPIODIRECCION, DireccionConstants.CLASS_ID, DireccionConstants.ARG_ID_INSMUNICIPIODIRECCION_DIRECCIONINSMUNICIPIODIRECCIONPTHISDIRECCION, DireccionConstants.SERV_ALIAS_INSMUNICIPIODIRECCION, DireccionConstants.CLASS_ALIAS, DireccionConstants.ARG_ALIAS_INSMUNICIPIODIRECCION_DIRECCIONINSMUNICIPIODIRECCIONPTHISDIRECCION);
        }
    }

    @JsonIgnore
    public MunicipioOid getDireccionInsMunicipioDireccionpevcMunicipio() {
        return this.direccionInsMunicipioDireccionpevcMunicipio;
    }
    
    public void setDireccionInsMunicipioDireccionpevcMunicipio(MunicipioOid direccionInsMunicipioDireccionpevcMunicipio) {
        this.direccionInsMunicipioDireccionpevcMunicipio = direccionInsMunicipioDireccionpevcMunicipio;
    }

    @JsonIgnore
    public Municipio getDireccionInsMunicipioDireccionpevcMunicipioInstance() {
        return this.direccionInsMunicipioDireccionpevcMunicipioInstance;
    }
    
    public void setDireccionInsMunicipioDireccionpevcMunicipioInstance(Municipio direccionInsMunicipioDireccionpevcMunicipio) {
        this.direccionInsMunicipioDireccionpevcMunicipioInstance = direccionInsMunicipioDireccionpevcMunicipio;
        this.direccionInsMunicipioDireccionpevcMunicipio = direccionInsMunicipioDireccionpevcMunicipio != null ? direccionInsMunicipioDireccionpevcMunicipio.getOid() : null;
    }

    private void checkDireccionInsMunicipioDireccionpevcMunicipio() throws NotNullArgumentException {
        if(this.getDireccionInsMunicipioDireccionpevcMunicipioInstance() == null || this.getDireccionInsMunicipioDireccionpevcMunicipioInstance().isNull()) {
            throw new NotNullArgumentException(DireccionConstants.SERV_ID_INSMUNICIPIODIRECCION, DireccionConstants.CLASS_ID, DireccionConstants.ARG_ID_INSMUNICIPIODIRECCION_DIRECCIONINSMUNICIPIODIRECCIONPEVCMUNICIPIO, DireccionConstants.SERV_ALIAS_INSMUNICIPIODIRECCION, DireccionConstants.CLASS_ALIAS, DireccionConstants.ARG_ALIAS_INSMUNICIPIODIRECCION_DIRECCIONINSMUNICIPIODIRECCIONPEVCMUNICIPIO);
        }
    }
}
