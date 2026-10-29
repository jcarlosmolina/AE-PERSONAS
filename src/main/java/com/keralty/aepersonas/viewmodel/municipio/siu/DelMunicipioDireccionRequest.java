package com.keralty.aepersonas.viewmodel.municipio.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.MunicipioConstants;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.DireccionOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;

public class DelMunicipioDireccionRequest {

    @JsonProperty("p_thismunicipio_oid")
    private MunicipioOid municipioDelMunicipioDireccionpthisMunicipio;
    
    @JsonIgnore
    private Municipio municipioDelMunicipioDireccionpthisMunicipioInstance;

    @JsonProperty("p_evcdireccion_oid")
    private DireccionOid municipioDelMunicipioDireccionpevcDireccion;
    
    @JsonIgnore
    private Direccion municipioDelMunicipioDireccionpevcDireccionInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkMunicipioDelMunicipioDireccionpthisMunicipio();
        checkMunicipioDelMunicipioDireccionpevcDireccion();
    }

    @JsonIgnore
    public MunicipioOid getMunicipioDelMunicipioDireccionpthisMunicipio() {
        return this.municipioDelMunicipioDireccionpthisMunicipio;
    }
    
    public void setMunicipioDelMunicipioDireccionpthisMunicipio(MunicipioOid municipioDelMunicipioDireccionpthisMunicipio) {
        this.municipioDelMunicipioDireccionpthisMunicipio = municipioDelMunicipioDireccionpthisMunicipio;
    }

    @JsonIgnore
    public Municipio getMunicipioDelMunicipioDireccionpthisMunicipioInstance() {
        return this.municipioDelMunicipioDireccionpthisMunicipioInstance;
    }
    
    public void setMunicipioDelMunicipioDireccionpthisMunicipioInstance(Municipio municipioDelMunicipioDireccionpthisMunicipio) {
        this.municipioDelMunicipioDireccionpthisMunicipioInstance = municipioDelMunicipioDireccionpthisMunicipio;
        this.municipioDelMunicipioDireccionpthisMunicipio = municipioDelMunicipioDireccionpthisMunicipio != null ? municipioDelMunicipioDireccionpthisMunicipio.getOid() : null;
    }

    private void checkMunicipioDelMunicipioDireccionpthisMunicipio() throws NotNullArgumentException {
        if(this.getMunicipioDelMunicipioDireccionpthisMunicipioInstance() == null || this.getMunicipioDelMunicipioDireccionpthisMunicipioInstance().isNull()) {
            throw new NotNullArgumentException(MunicipioConstants.SERV_ID_DELMUNICIPIODIRECCION, MunicipioConstants.CLASS_ID, MunicipioConstants.ARG_ID_DELMUNICIPIODIRECCION_MUNICIPIODELMUNICIPIODIRECCIONPTHISMUNICIPIO, MunicipioConstants.SERV_ALIAS_DELMUNICIPIODIRECCION, MunicipioConstants.CLASS_ALIAS, MunicipioConstants.ARG_ALIAS_DELMUNICIPIODIRECCION_MUNICIPIODELMUNICIPIODIRECCIONPTHISMUNICIPIO);
        }
    }

    @JsonIgnore
    public DireccionOid getMunicipioDelMunicipioDireccionpevcDireccion() {
        return this.municipioDelMunicipioDireccionpevcDireccion;
    }
    
    public void setMunicipioDelMunicipioDireccionpevcDireccion(DireccionOid municipioDelMunicipioDireccionpevcDireccion) {
        this.municipioDelMunicipioDireccionpevcDireccion = municipioDelMunicipioDireccionpevcDireccion;
    }

    @JsonIgnore
    public Direccion getMunicipioDelMunicipioDireccionpevcDireccionInstance() {
        return this.municipioDelMunicipioDireccionpevcDireccionInstance;
    }
    
    public void setMunicipioDelMunicipioDireccionpevcDireccionInstance(Direccion municipioDelMunicipioDireccionpevcDireccion) {
        this.municipioDelMunicipioDireccionpevcDireccionInstance = municipioDelMunicipioDireccionpevcDireccion;
        this.municipioDelMunicipioDireccionpevcDireccion = municipioDelMunicipioDireccionpevcDireccion != null ? municipioDelMunicipioDireccionpevcDireccion.getOid() : null;
    }

    private void checkMunicipioDelMunicipioDireccionpevcDireccion() throws NotNullArgumentException {
        if(this.getMunicipioDelMunicipioDireccionpevcDireccionInstance() == null || this.getMunicipioDelMunicipioDireccionpevcDireccionInstance().isNull()) {
            throw new NotNullArgumentException(MunicipioConstants.SERV_ID_DELMUNICIPIODIRECCION, MunicipioConstants.CLASS_ID, MunicipioConstants.ARG_ID_DELMUNICIPIODIRECCION_MUNICIPIODELMUNICIPIODIRECCIONPEVCDIRECCION, MunicipioConstants.SERV_ALIAS_DELMUNICIPIODIRECCION, MunicipioConstants.CLASS_ALIAS, MunicipioConstants.ARG_ALIAS_DELMUNICIPIODIRECCION_MUNICIPIODELMUNICIPIODIRECCIONPEVCDIRECCION);
        }
    }
}
