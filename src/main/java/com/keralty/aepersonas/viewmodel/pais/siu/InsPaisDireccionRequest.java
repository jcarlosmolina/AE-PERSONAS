package com.keralty.aepersonas.viewmodel.pais.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.PaisConstants;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.oid.DireccionOid;
import com.keralty.aepersonas.persistence.oid.PaisOid;
import com.keralty.aepersonas.persistence.Pais;

public class InsPaisDireccionRequest {

    @JsonProperty("p_thispais_oid")
    private PaisOid paisInsPaisDireccionpthisPais;
    
    @JsonIgnore
    private Pais paisInsPaisDireccionpthisPaisInstance;

    @JsonProperty("p_evcdireccion_oid")
    private DireccionOid paisInsPaisDireccionpevcDireccion;
    
    @JsonIgnore
    private Direccion paisInsPaisDireccionpevcDireccionInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkPaisInsPaisDireccionpthisPais();
        checkPaisInsPaisDireccionpevcDireccion();
    }

    @JsonIgnore
    public PaisOid getPaisInsPaisDireccionpthisPais() {
        return this.paisInsPaisDireccionpthisPais;
    }
    
    public void setPaisInsPaisDireccionpthisPais(PaisOid paisInsPaisDireccionpthisPais) {
        this.paisInsPaisDireccionpthisPais = paisInsPaisDireccionpthisPais;
    }

    @JsonIgnore
    public Pais getPaisInsPaisDireccionpthisPaisInstance() {
        return this.paisInsPaisDireccionpthisPaisInstance;
    }
    
    public void setPaisInsPaisDireccionpthisPaisInstance(Pais paisInsPaisDireccionpthisPais) {
        this.paisInsPaisDireccionpthisPaisInstance = paisInsPaisDireccionpthisPais;
        this.paisInsPaisDireccionpthisPais = paisInsPaisDireccionpthisPais != null ? paisInsPaisDireccionpthisPais.getOid() : null;
    }

    private void checkPaisInsPaisDireccionpthisPais() throws NotNullArgumentException {
        if(this.getPaisInsPaisDireccionpthisPaisInstance() == null || this.getPaisInsPaisDireccionpthisPaisInstance().isNull()) {
            throw new NotNullArgumentException(PaisConstants.SERV_ID_INSPAISDIRECCION, PaisConstants.CLASS_ID, PaisConstants.ARG_ID_INSPAISDIRECCION_PAISINSPAISDIRECCIONPTHISPAIS, PaisConstants.SERV_ALIAS_INSPAISDIRECCION, PaisConstants.CLASS_ALIAS, PaisConstants.ARG_ALIAS_INSPAISDIRECCION_PAISINSPAISDIRECCIONPTHISPAIS);
        }
    }

    @JsonIgnore
    public DireccionOid getPaisInsPaisDireccionpevcDireccion() {
        return this.paisInsPaisDireccionpevcDireccion;
    }
    
    public void setPaisInsPaisDireccionpevcDireccion(DireccionOid paisInsPaisDireccionpevcDireccion) {
        this.paisInsPaisDireccionpevcDireccion = paisInsPaisDireccionpevcDireccion;
    }

    @JsonIgnore
    public Direccion getPaisInsPaisDireccionpevcDireccionInstance() {
        return this.paisInsPaisDireccionpevcDireccionInstance;
    }
    
    public void setPaisInsPaisDireccionpevcDireccionInstance(Direccion paisInsPaisDireccionpevcDireccion) {
        this.paisInsPaisDireccionpevcDireccionInstance = paisInsPaisDireccionpevcDireccion;
        this.paisInsPaisDireccionpevcDireccion = paisInsPaisDireccionpevcDireccion != null ? paisInsPaisDireccionpevcDireccion.getOid() : null;
    }

    private void checkPaisInsPaisDireccionpevcDireccion() throws NotNullArgumentException {
        if(this.getPaisInsPaisDireccionpevcDireccionInstance() == null || this.getPaisInsPaisDireccionpevcDireccionInstance().isNull()) {
            throw new NotNullArgumentException(PaisConstants.SERV_ID_INSPAISDIRECCION, PaisConstants.CLASS_ID, PaisConstants.ARG_ID_INSPAISDIRECCION_PAISINSPAISDIRECCIONPEVCDIRECCION, PaisConstants.SERV_ALIAS_INSPAISDIRECCION, PaisConstants.CLASS_ALIAS, PaisConstants.ARG_ALIAS_INSPAISDIRECCION_PAISINSPAISDIRECCIONPEVCDIRECCION);
        }
    }
}
