package com.keralty.aepersonas.viewmodel.direccion.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.DireccionConstants;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.persistence.oid.DireccionOid;

public class InsDepartamentoDireccionRequest {

    @JsonProperty("p_thisdireccion_oid")
    private DireccionOid direccionInsDepartamentoDireccionpthisDireccion;
    
    @JsonIgnore
    private Direccion direccionInsDepartamentoDireccionpthisDireccionInstance;

    @JsonProperty("p_evcdepartamento_oid")
    private DepartamentoOid direccionInsDepartamentoDireccionpevcDepartamento;
    
    @JsonIgnore
    private Departamento direccionInsDepartamentoDireccionpevcDepartamentoInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkDireccionInsDepartamentoDireccionpthisDireccion();
        checkDireccionInsDepartamentoDireccionpevcDepartamento();
    }

    @JsonIgnore
    public DireccionOid getDireccionInsDepartamentoDireccionpthisDireccion() {
        return this.direccionInsDepartamentoDireccionpthisDireccion;
    }
    
    public void setDireccionInsDepartamentoDireccionpthisDireccion(DireccionOid direccionInsDepartamentoDireccionpthisDireccion) {
        this.direccionInsDepartamentoDireccionpthisDireccion = direccionInsDepartamentoDireccionpthisDireccion;
    }

    @JsonIgnore
    public Direccion getDireccionInsDepartamentoDireccionpthisDireccionInstance() {
        return this.direccionInsDepartamentoDireccionpthisDireccionInstance;
    }
    
    public void setDireccionInsDepartamentoDireccionpthisDireccionInstance(Direccion direccionInsDepartamentoDireccionpthisDireccion) {
        this.direccionInsDepartamentoDireccionpthisDireccionInstance = direccionInsDepartamentoDireccionpthisDireccion;
        this.direccionInsDepartamentoDireccionpthisDireccion = direccionInsDepartamentoDireccionpthisDireccion != null ? direccionInsDepartamentoDireccionpthisDireccion.getOid() : null;
    }

    private void checkDireccionInsDepartamentoDireccionpthisDireccion() throws NotNullArgumentException {
        if(this.getDireccionInsDepartamentoDireccionpthisDireccionInstance() == null || this.getDireccionInsDepartamentoDireccionpthisDireccionInstance().isNull()) {
            throw new NotNullArgumentException(DireccionConstants.SERV_ID_INSDEPARTAMENTODIRECCION, DireccionConstants.CLASS_ID, DireccionConstants.ARG_ID_INSDEPARTAMENTODIRECCION_DIRECCIONINSDEPARTAMENTODIRECCIONPTHISDIRECCION, DireccionConstants.SERV_ALIAS_INSDEPARTAMENTODIRECCION, DireccionConstants.CLASS_ALIAS, DireccionConstants.ARG_ALIAS_INSDEPARTAMENTODIRECCION_DIRECCIONINSDEPARTAMENTODIRECCIONPTHISDIRECCION);
        }
    }

    @JsonIgnore
    public DepartamentoOid getDireccionInsDepartamentoDireccionpevcDepartamento() {
        return this.direccionInsDepartamentoDireccionpevcDepartamento;
    }
    
    public void setDireccionInsDepartamentoDireccionpevcDepartamento(DepartamentoOid direccionInsDepartamentoDireccionpevcDepartamento) {
        this.direccionInsDepartamentoDireccionpevcDepartamento = direccionInsDepartamentoDireccionpevcDepartamento;
    }

    @JsonIgnore
    public Departamento getDireccionInsDepartamentoDireccionpevcDepartamentoInstance() {
        return this.direccionInsDepartamentoDireccionpevcDepartamentoInstance;
    }
    
    public void setDireccionInsDepartamentoDireccionpevcDepartamentoInstance(Departamento direccionInsDepartamentoDireccionpevcDepartamento) {
        this.direccionInsDepartamentoDireccionpevcDepartamentoInstance = direccionInsDepartamentoDireccionpevcDepartamento;
        this.direccionInsDepartamentoDireccionpevcDepartamento = direccionInsDepartamentoDireccionpevcDepartamento != null ? direccionInsDepartamentoDireccionpevcDepartamento.getOid() : null;
    }

    private void checkDireccionInsDepartamentoDireccionpevcDepartamento() throws NotNullArgumentException {
        if(this.getDireccionInsDepartamentoDireccionpevcDepartamentoInstance() == null || this.getDireccionInsDepartamentoDireccionpevcDepartamentoInstance().isNull()) {
            throw new NotNullArgumentException(DireccionConstants.SERV_ID_INSDEPARTAMENTODIRECCION, DireccionConstants.CLASS_ID, DireccionConstants.ARG_ID_INSDEPARTAMENTODIRECCION_DIRECCIONINSDEPARTAMENTODIRECCIONPEVCDEPARTAMENTO, DireccionConstants.SERV_ALIAS_INSDEPARTAMENTODIRECCION, DireccionConstants.CLASS_ALIAS, DireccionConstants.ARG_ALIAS_INSDEPARTAMENTODIRECCION_DIRECCIONINSDEPARTAMENTODIRECCIONPEVCDEPARTAMENTO);
        }
    }
}
