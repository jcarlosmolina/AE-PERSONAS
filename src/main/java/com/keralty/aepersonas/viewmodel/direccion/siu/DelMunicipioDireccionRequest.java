package com.keralty.aepersonas.viewmodel.direccion.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.DireccionConstants;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.DireccionOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;

public class DelMunicipioDireccionRequest {

    @JsonProperty("p_thisdireccion_oid")
    private DireccionOid direccionDelMunicipioDireccionpthisDireccion;
    
    @JsonIgnore
    private Direccion direccionDelMunicipioDireccionpthisDireccionInstance;

    @JsonProperty("p_evcmunicipio_oid")
    private MunicipioOid direccionDelMunicipioDireccionpevcMunicipio;
    
    @JsonIgnore
    private Municipio direccionDelMunicipioDireccionpevcMunicipioInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkDireccionDelMunicipioDireccionpthisDireccion();
        checkDireccionDelMunicipioDireccionpevcMunicipio();
    }

    @JsonIgnore
    public DireccionOid getDireccionDelMunicipioDireccionpthisDireccion() {
        return this.direccionDelMunicipioDireccionpthisDireccion;
    }
    
    public void setDireccionDelMunicipioDireccionpthisDireccion(DireccionOid direccionDelMunicipioDireccionpthisDireccion) {
        this.direccionDelMunicipioDireccionpthisDireccion = direccionDelMunicipioDireccionpthisDireccion;
    }

    @JsonIgnore
    public Direccion getDireccionDelMunicipioDireccionpthisDireccionInstance() {
        return this.direccionDelMunicipioDireccionpthisDireccionInstance;
    }
    
    public void setDireccionDelMunicipioDireccionpthisDireccionInstance(Direccion direccionDelMunicipioDireccionpthisDireccion) {
        this.direccionDelMunicipioDireccionpthisDireccionInstance = direccionDelMunicipioDireccionpthisDireccion;
        this.direccionDelMunicipioDireccionpthisDireccion = direccionDelMunicipioDireccionpthisDireccion != null ? direccionDelMunicipioDireccionpthisDireccion.getOid() : null;
    }

    private void checkDireccionDelMunicipioDireccionpthisDireccion() throws NotNullArgumentException {
        if(this.getDireccionDelMunicipioDireccionpthisDireccionInstance() == null || this.getDireccionDelMunicipioDireccionpthisDireccionInstance().isNull()) {
            throw new NotNullArgumentException(DireccionConstants.SERV_ID_DELMUNICIPIODIRECCION, DireccionConstants.CLASS_ID, DireccionConstants.ARG_ID_DELMUNICIPIODIRECCION_DIRECCIONDELMUNICIPIODIRECCIONPTHISDIRECCION, DireccionConstants.SERV_ALIAS_DELMUNICIPIODIRECCION, DireccionConstants.CLASS_ALIAS, DireccionConstants.ARG_ALIAS_DELMUNICIPIODIRECCION_DIRECCIONDELMUNICIPIODIRECCIONPTHISDIRECCION);
        }
    }

    @JsonIgnore
    public MunicipioOid getDireccionDelMunicipioDireccionpevcMunicipio() {
        return this.direccionDelMunicipioDireccionpevcMunicipio;
    }
    
    public void setDireccionDelMunicipioDireccionpevcMunicipio(MunicipioOid direccionDelMunicipioDireccionpevcMunicipio) {
        this.direccionDelMunicipioDireccionpevcMunicipio = direccionDelMunicipioDireccionpevcMunicipio;
    }

    @JsonIgnore
    public Municipio getDireccionDelMunicipioDireccionpevcMunicipioInstance() {
        return this.direccionDelMunicipioDireccionpevcMunicipioInstance;
    }
    
    public void setDireccionDelMunicipioDireccionpevcMunicipioInstance(Municipio direccionDelMunicipioDireccionpevcMunicipio) {
        this.direccionDelMunicipioDireccionpevcMunicipioInstance = direccionDelMunicipioDireccionpevcMunicipio;
        this.direccionDelMunicipioDireccionpevcMunicipio = direccionDelMunicipioDireccionpevcMunicipio != null ? direccionDelMunicipioDireccionpevcMunicipio.getOid() : null;
    }

    private void checkDireccionDelMunicipioDireccionpevcMunicipio() throws NotNullArgumentException {
        if(this.getDireccionDelMunicipioDireccionpevcMunicipioInstance() == null || this.getDireccionDelMunicipioDireccionpevcMunicipioInstance().isNull()) {
            throw new NotNullArgumentException(DireccionConstants.SERV_ID_DELMUNICIPIODIRECCION, DireccionConstants.CLASS_ID, DireccionConstants.ARG_ID_DELMUNICIPIODIRECCION_DIRECCIONDELMUNICIPIODIRECCIONPEVCMUNICIPIO, DireccionConstants.SERV_ALIAS_DELMUNICIPIODIRECCION, DireccionConstants.CLASS_ALIAS, DireccionConstants.ARG_ALIAS_DELMUNICIPIODIRECCION_DIRECCIONDELMUNICIPIODIRECCIONPEVCMUNICIPIO);
        }
    }
}
