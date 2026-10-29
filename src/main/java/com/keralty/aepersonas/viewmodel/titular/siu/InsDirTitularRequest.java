package com.keralty.aepersonas.viewmodel.titular.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.TitularConstants;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.oid.DireccionOid;
import com.keralty.aepersonas.persistence.oid.TitularOid;
import com.keralty.aepersonas.persistence.Titular;

public class InsDirTitularRequest {

    @JsonProperty("p_thistitular_oid")
    private TitularOid titularInsDirTitularpthisTitular;
    
    @JsonIgnore
    private Titular titularInsDirTitularpthisTitularInstance;

    @JsonProperty("p_evcdireccion_oid")
    private DireccionOid titularInsDirTitularpevcDireccion;
    
    @JsonIgnore
    private Direccion titularInsDirTitularpevcDireccionInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkTitularInsDirTitularpthisTitular();
        checkTitularInsDirTitularpevcDireccion();
    }

    @JsonIgnore
    public TitularOid getTitularInsDirTitularpthisTitular() {
        return this.titularInsDirTitularpthisTitular;
    }
    
    public void setTitularInsDirTitularpthisTitular(TitularOid titularInsDirTitularpthisTitular) {
        this.titularInsDirTitularpthisTitular = titularInsDirTitularpthisTitular;
    }

    @JsonIgnore
    public Titular getTitularInsDirTitularpthisTitularInstance() {
        return this.titularInsDirTitularpthisTitularInstance;
    }
    
    public void setTitularInsDirTitularpthisTitularInstance(Titular titularInsDirTitularpthisTitular) {
        this.titularInsDirTitularpthisTitularInstance = titularInsDirTitularpthisTitular;
        this.titularInsDirTitularpthisTitular = titularInsDirTitularpthisTitular != null ? titularInsDirTitularpthisTitular.getOid() : null;
    }

    private void checkTitularInsDirTitularpthisTitular() throws NotNullArgumentException {
        if(this.getTitularInsDirTitularpthisTitularInstance() == null || this.getTitularInsDirTitularpthisTitularInstance().isNull()) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_INSDIRTITULAR, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_INSDIRTITULAR_TITULARINSDIRTITULARPTHISTITULAR, TitularConstants.SERV_ALIAS_INSDIRTITULAR, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_INSDIRTITULAR_TITULARINSDIRTITULARPTHISTITULAR);
        }
    }

    @JsonIgnore
    public DireccionOid getTitularInsDirTitularpevcDireccion() {
        return this.titularInsDirTitularpevcDireccion;
    }
    
    public void setTitularInsDirTitularpevcDireccion(DireccionOid titularInsDirTitularpevcDireccion) {
        this.titularInsDirTitularpevcDireccion = titularInsDirTitularpevcDireccion;
    }

    @JsonIgnore
    public Direccion getTitularInsDirTitularpevcDireccionInstance() {
        return this.titularInsDirTitularpevcDireccionInstance;
    }
    
    public void setTitularInsDirTitularpevcDireccionInstance(Direccion titularInsDirTitularpevcDireccion) {
        this.titularInsDirTitularpevcDireccionInstance = titularInsDirTitularpevcDireccion;
        this.titularInsDirTitularpevcDireccion = titularInsDirTitularpevcDireccion != null ? titularInsDirTitularpevcDireccion.getOid() : null;
    }

    private void checkTitularInsDirTitularpevcDireccion() throws NotNullArgumentException {
        if(this.getTitularInsDirTitularpevcDireccionInstance() == null || this.getTitularInsDirTitularpevcDireccionInstance().isNull()) {
            throw new NotNullArgumentException(TitularConstants.SERV_ID_INSDIRTITULAR, TitularConstants.CLASS_ID, TitularConstants.ARG_ID_INSDIRTITULAR_TITULARINSDIRTITULARPEVCDIRECCION, TitularConstants.SERV_ALIAS_INSDIRTITULAR, TitularConstants.CLASS_ALIAS, TitularConstants.ARG_ALIAS_INSDIRTITULAR_TITULARINSDIRTITULARPEVCDIRECCION);
        }
    }
}
