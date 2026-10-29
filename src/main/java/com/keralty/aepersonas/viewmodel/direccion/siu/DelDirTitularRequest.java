package com.keralty.aepersonas.viewmodel.direccion.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.DireccionConstants;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.oid.DireccionOid;
import com.keralty.aepersonas.persistence.oid.TitularOid;
import com.keralty.aepersonas.persistence.Titular;

public class DelDirTitularRequest {

    @JsonProperty("p_thisdireccion_oid")
    private DireccionOid direccionDelDirTitularpthisDireccion;
    
    @JsonIgnore
    private Direccion direccionDelDirTitularpthisDireccionInstance;

    @JsonProperty("p_evctitular_oid")
    private TitularOid direccionDelDirTitularpevcTitular;
    
    @JsonIgnore
    private Titular direccionDelDirTitularpevcTitularInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkDireccionDelDirTitularpthisDireccion();
        checkDireccionDelDirTitularpevcTitular();
    }

    @JsonIgnore
    public DireccionOid getDireccionDelDirTitularpthisDireccion() {
        return this.direccionDelDirTitularpthisDireccion;
    }
    
    public void setDireccionDelDirTitularpthisDireccion(DireccionOid direccionDelDirTitularpthisDireccion) {
        this.direccionDelDirTitularpthisDireccion = direccionDelDirTitularpthisDireccion;
    }

    @JsonIgnore
    public Direccion getDireccionDelDirTitularpthisDireccionInstance() {
        return this.direccionDelDirTitularpthisDireccionInstance;
    }
    
    public void setDireccionDelDirTitularpthisDireccionInstance(Direccion direccionDelDirTitularpthisDireccion) {
        this.direccionDelDirTitularpthisDireccionInstance = direccionDelDirTitularpthisDireccion;
        this.direccionDelDirTitularpthisDireccion = direccionDelDirTitularpthisDireccion != null ? direccionDelDirTitularpthisDireccion.getOid() : null;
    }

    private void checkDireccionDelDirTitularpthisDireccion() throws NotNullArgumentException {
        if(this.getDireccionDelDirTitularpthisDireccionInstance() == null || this.getDireccionDelDirTitularpthisDireccionInstance().isNull()) {
            throw new NotNullArgumentException(DireccionConstants.SERV_ID_DELDIRTITULAR, DireccionConstants.CLASS_ID, DireccionConstants.ARG_ID_DELDIRTITULAR_DIRECCIONDELDIRTITULARPTHISDIRECCION, DireccionConstants.SERV_ALIAS_DELDIRTITULAR, DireccionConstants.CLASS_ALIAS, DireccionConstants.ARG_ALIAS_DELDIRTITULAR_DIRECCIONDELDIRTITULARPTHISDIRECCION);
        }
    }

    @JsonIgnore
    public TitularOid getDireccionDelDirTitularpevcTitular() {
        return this.direccionDelDirTitularpevcTitular;
    }
    
    public void setDireccionDelDirTitularpevcTitular(TitularOid direccionDelDirTitularpevcTitular) {
        this.direccionDelDirTitularpevcTitular = direccionDelDirTitularpevcTitular;
    }

    @JsonIgnore
    public Titular getDireccionDelDirTitularpevcTitularInstance() {
        return this.direccionDelDirTitularpevcTitularInstance;
    }
    
    public void setDireccionDelDirTitularpevcTitularInstance(Titular direccionDelDirTitularpevcTitular) {
        this.direccionDelDirTitularpevcTitularInstance = direccionDelDirTitularpevcTitular;
        this.direccionDelDirTitularpevcTitular = direccionDelDirTitularpevcTitular != null ? direccionDelDirTitularpevcTitular.getOid() : null;
    }

    private void checkDireccionDelDirTitularpevcTitular() throws NotNullArgumentException {
        if(this.getDireccionDelDirTitularpevcTitularInstance() == null || this.getDireccionDelDirTitularpevcTitularInstance().isNull()) {
            throw new NotNullArgumentException(DireccionConstants.SERV_ID_DELDIRTITULAR, DireccionConstants.CLASS_ID, DireccionConstants.ARG_ID_DELDIRTITULAR_DIRECCIONDELDIRTITULARPEVCTITULAR, DireccionConstants.SERV_ALIAS_DELDIRTITULAR, DireccionConstants.CLASS_ALIAS, DireccionConstants.ARG_ALIAS_DELDIRTITULAR_DIRECCIONDELDIRTITULARPEVCTITULAR);
        }
    }
}
