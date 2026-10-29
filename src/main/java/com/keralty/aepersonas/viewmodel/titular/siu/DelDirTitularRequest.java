package com.keralty.aepersonas.viewmodel.titular.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.TitularConstants;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.oid.DireccionOid;
import com.keralty.aepersonas.persistence.oid.TitularOid;
import com.keralty.aepersonas.persistence.Titular;

public class DelDirTitularRequest {

    @JsonProperty("p_thistitular_oid")
    private TitularOid titularDelDirTitularpthisTitular;
    
    @JsonIgnore
    private Titular titularDelDirTitularpthisTitularInstance;

    @JsonProperty("p_evcdireccion_oid")
    private DireccionOid titularDelDirTitularpevcDireccion;
    
    @JsonIgnore
    private Direccion titularDelDirTitularpevcDireccionInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkTitularDelDirTitularpthisTitular();
        checkTitularDelDirTitularpevcDireccion();
    }

    @JsonIgnore
    public TitularOid getTitularDelDirTitularpthisTitular() {
        return this.titularDelDirTitularpthisTitular;
    }
    
    public void setTitularDelDirTitularpthisTitular(TitularOid titularDelDirTitularpthisTitular) {
        this.titularDelDirTitularpthisTitular = titularDelDirTitularpthisTitular;
    }

    @JsonIgnore
    public Titular getTitularDelDirTitularpthisTitularInstance() {
        return this.titularDelDirTitularpthisTitularInstance;
    }
    
    public void setTitularDelDirTitularpthisTitularInstance(Titular titularDelDirTitularpthisTitular) {
        this.titularDelDirTitularpthisTitularInstance = titularDelDirTitularpthisTitular;
        this.titularDelDirTitularpthisTitular = titularDelDirTitularpthisTitular != null ? titularDelDirTitularpthisTitular.getOid() : null;
    }

    private void checkTitularDelDirTitularpthisTitular() throws NotNullArgumentException {
        if(this.getTitularDelDirTitularpthisTitularInstance() == null || this.getTitularDelDirTitularpthisTitularInstance().isNull()) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_DELDIRTITULAR, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_DELDIRTITULAR_TITULARDELDIRTITULARPTHISTITULAR, TitularConstants.SERV_ALIAS_DELDIRTITULAR, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_DELDIRTITULAR_TITULARDELDIRTITULARPTHISTITULAR);
        }
    }

    @JsonIgnore
    public DireccionOid getTitularDelDirTitularpevcDireccion() {
        return this.titularDelDirTitularpevcDireccion;
    }
    
    public void setTitularDelDirTitularpevcDireccion(DireccionOid titularDelDirTitularpevcDireccion) {
        this.titularDelDirTitularpevcDireccion = titularDelDirTitularpevcDireccion;
    }

    @JsonIgnore
    public Direccion getTitularDelDirTitularpevcDireccionInstance() {
        return this.titularDelDirTitularpevcDireccionInstance;
    }
    
    public void setTitularDelDirTitularpevcDireccionInstance(Direccion titularDelDirTitularpevcDireccion) {
        this.titularDelDirTitularpevcDireccionInstance = titularDelDirTitularpevcDireccion;
        this.titularDelDirTitularpevcDireccion = titularDelDirTitularpevcDireccion != null ? titularDelDirTitularpevcDireccion.getOid() : null;
    }

    private void checkTitularDelDirTitularpevcDireccion() throws NotNullArgumentException {
        if(this.getTitularDelDirTitularpevcDireccionInstance() == null || this.getTitularDelDirTitularpevcDireccionInstance().isNull()) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_DELDIRTITULAR, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_DELDIRTITULAR_TITULARDELDIRTITULARPEVCDIRECCION, TitularConstants.SERV_ALIAS_DELDIRTITULAR, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_DELDIRTITULAR_TITULARDELDIRTITULARPEVCDIRECCION);
        }
    }
}
