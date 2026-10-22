package com.keralty.aepersonas.viewmodel.municipio.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.MunicipioConstants;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.Municipio;
import com.keralty.aepersonas.persistence.oid.DireccionOid;
import com.keralty.aepersonas.persistence.oid.MunicipioOid;

public class InsMunicipioDireccionRequest {

    @JsonProperty("p_thismunicipio_oid")
    private MunicipioOid municipioInsMunicipioDireccionpthisMunicipio;
    
    @JsonIgnore
    private Municipio municipioInsMunicipioDireccionpthisMunicipioInstance;

    @JsonProperty("p_evcdireccion_oid")
    private DireccionOid municipioInsMunicipioDireccionpevcDireccion;
    
    @JsonIgnore
    private Direccion municipioInsMunicipioDireccionpevcDireccionInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkMunicipioInsMunicipioDireccionpthisMunicipio();
        checkMunicipioInsMunicipioDireccionpevcDireccion();
    }

    @JsonIgnore
    public MunicipioOid getMunicipioInsMunicipioDireccionpthisMunicipio() {
        return this.municipioInsMunicipioDireccionpthisMunicipio;
    }
    
    public void setMunicipioInsMunicipioDireccionpthisMunicipio(MunicipioOid municipioInsMunicipioDireccionpthisMunicipio) {
        this.municipioInsMunicipioDireccionpthisMunicipio = municipioInsMunicipioDireccionpthisMunicipio;
    }

    @JsonIgnore
    public Municipio getMunicipioInsMunicipioDireccionpthisMunicipioInstance() {
        return this.municipioInsMunicipioDireccionpthisMunicipioInstance;
    }
    
    public void setMunicipioInsMunicipioDireccionpthisMunicipioInstance(Municipio municipioInsMunicipioDireccionpthisMunicipio) {
        this.municipioInsMunicipioDireccionpthisMunicipioInstance = municipioInsMunicipioDireccionpthisMunicipio;
        this.municipioInsMunicipioDireccionpthisMunicipio = municipioInsMunicipioDireccionpthisMunicipio != null ? municipioInsMunicipioDireccionpthisMunicipio.getOid() : null;
    }

    private void checkMunicipioInsMunicipioDireccionpthisMunicipio() throws NotNullArgumentException {
        if(this.getMunicipioInsMunicipioDireccionpthisMunicipioInstance() == null || this.getMunicipioInsMunicipioDireccionpthisMunicipioInstance().isNull()) {
            throw new NotNullArgumentException(MunicipioConstants.SERV_ID_INSMUNICIPIODIRECCION, MunicipioConstants.CLASS_ID, MunicipioConstants.ARG_ID_INSMUNICIPIODIRECCION_MUNICIPIOINSMUNICIPIODIRECCIONPTHISMUNICIPIO, MunicipioConstants.SERV_ALIAS_INSMUNICIPIODIRECCION, MunicipioConstants.CLASS_ALIAS, MunicipioConstants.ARG_ALIAS_INSMUNICIPIODIRECCION_MUNICIPIOINSMUNICIPIODIRECCIONPTHISMUNICIPIO);
        }
    }

    @JsonIgnore
    public DireccionOid getMunicipioInsMunicipioDireccionpevcDireccion() {
        return this.municipioInsMunicipioDireccionpevcDireccion;
    }
    
    public void setMunicipioInsMunicipioDireccionpevcDireccion(DireccionOid municipioInsMunicipioDireccionpevcDireccion) {
        this.municipioInsMunicipioDireccionpevcDireccion = municipioInsMunicipioDireccionpevcDireccion;
    }

    @JsonIgnore
    public Direccion getMunicipioInsMunicipioDireccionpevcDireccionInstance() {
        return this.municipioInsMunicipioDireccionpevcDireccionInstance;
    }
    
    public void setMunicipioInsMunicipioDireccionpevcDireccionInstance(Direccion municipioInsMunicipioDireccionpevcDireccion) {
        this.municipioInsMunicipioDireccionpevcDireccionInstance = municipioInsMunicipioDireccionpevcDireccion;
        this.municipioInsMunicipioDireccionpevcDireccion = municipioInsMunicipioDireccionpevcDireccion != null ? municipioInsMunicipioDireccionpevcDireccion.getOid() : null;
    }

    private void checkMunicipioInsMunicipioDireccionpevcDireccion() throws NotNullArgumentException {
        if(this.getMunicipioInsMunicipioDireccionpevcDireccionInstance() == null || this.getMunicipioInsMunicipioDireccionpevcDireccionInstance().isNull()) {
            throw new NotNullArgumentException(MunicipioConstants.SERV_ID_INSMUNICIPIODIRECCION, MunicipioConstants.CLASS_ID, MunicipioConstants.ARG_ID_INSMUNICIPIODIRECCION_MUNICIPIOINSMUNICIPIODIRECCIONPEVCDIRECCION, MunicipioConstants.SERV_ALIAS_INSMUNICIPIODIRECCION, MunicipioConstants.CLASS_ALIAS, MunicipioConstants.ARG_ALIAS_INSMUNICIPIODIRECCION_MUNICIPIOINSMUNICIPIODIRECCIONPEVCDIRECCION);
        }
    }
}
