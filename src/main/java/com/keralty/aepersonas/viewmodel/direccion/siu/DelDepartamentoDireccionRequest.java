package com.keralty.aepersonas.viewmodel.direccion.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.DireccionConstants;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.persistence.oid.DireccionOid;

public class DelDepartamentoDireccionRequest {

    @JsonProperty("p_thisdireccion_oid")
    private DireccionOid direccionDelDepartamentoDireccionpthisDireccion;
    
    @JsonIgnore
    private Direccion direccionDelDepartamentoDireccionpthisDireccionInstance;

    @JsonProperty("p_evcdepartamento_oid")
    private DepartamentoOid direccionDelDepartamentoDireccionpevcDepartamento;
    
    @JsonIgnore
    private Departamento direccionDelDepartamentoDireccionpevcDepartamentoInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkDireccionDelDepartamentoDireccionpthisDireccion();
        checkDireccionDelDepartamentoDireccionpevcDepartamento();
    }

    @JsonIgnore
    public DireccionOid getDireccionDelDepartamentoDireccionpthisDireccion() {
        return this.direccionDelDepartamentoDireccionpthisDireccion;
    }
    
    public void setDireccionDelDepartamentoDireccionpthisDireccion(DireccionOid direccionDelDepartamentoDireccionpthisDireccion) {
        this.direccionDelDepartamentoDireccionpthisDireccion = direccionDelDepartamentoDireccionpthisDireccion;
    }

    @JsonIgnore
    public Direccion getDireccionDelDepartamentoDireccionpthisDireccionInstance() {
        return this.direccionDelDepartamentoDireccionpthisDireccionInstance;
    }
    
    public void setDireccionDelDepartamentoDireccionpthisDireccionInstance(Direccion direccionDelDepartamentoDireccionpthisDireccion) {
        this.direccionDelDepartamentoDireccionpthisDireccionInstance = direccionDelDepartamentoDireccionpthisDireccion;
        this.direccionDelDepartamentoDireccionpthisDireccion = direccionDelDepartamentoDireccionpthisDireccion != null ? direccionDelDepartamentoDireccionpthisDireccion.getOid() : null;
    }

    private void checkDireccionDelDepartamentoDireccionpthisDireccion() throws NotNullArgumentException {
        if(this.getDireccionDelDepartamentoDireccionpthisDireccionInstance() == null || this.getDireccionDelDepartamentoDireccionpthisDireccionInstance().isNull()) {
            throw new NotNullArgumentException(DireccionConstants.SERV_ID_DELDEPARTAMENTODIRECCION, DireccionConstants.CLASS_ID, DireccionConstants.ARG_ID_DELDEPARTAMENTODIRECCION_DIRECCIONDELDEPARTAMENTODIRECCIONPTHISDIRECCION, DireccionConstants.SERV_ALIAS_DELDEPARTAMENTODIRECCION, DireccionConstants.CLASS_ALIAS, DireccionConstants.ARG_ALIAS_DELDEPARTAMENTODIRECCION_DIRECCIONDELDEPARTAMENTODIRECCIONPTHISDIRECCION);
        }
    }

    @JsonIgnore
    public DepartamentoOid getDireccionDelDepartamentoDireccionpevcDepartamento() {
        return this.direccionDelDepartamentoDireccionpevcDepartamento;
    }
    
    public void setDireccionDelDepartamentoDireccionpevcDepartamento(DepartamentoOid direccionDelDepartamentoDireccionpevcDepartamento) {
        this.direccionDelDepartamentoDireccionpevcDepartamento = direccionDelDepartamentoDireccionpevcDepartamento;
    }

    @JsonIgnore
    public Departamento getDireccionDelDepartamentoDireccionpevcDepartamentoInstance() {
        return this.direccionDelDepartamentoDireccionpevcDepartamentoInstance;
    }
    
    public void setDireccionDelDepartamentoDireccionpevcDepartamentoInstance(Departamento direccionDelDepartamentoDireccionpevcDepartamento) {
        this.direccionDelDepartamentoDireccionpevcDepartamentoInstance = direccionDelDepartamentoDireccionpevcDepartamento;
        this.direccionDelDepartamentoDireccionpevcDepartamento = direccionDelDepartamentoDireccionpevcDepartamento != null ? direccionDelDepartamentoDireccionpevcDepartamento.getOid() : null;
    }

    private void checkDireccionDelDepartamentoDireccionpevcDepartamento() throws NotNullArgumentException {
        if(this.getDireccionDelDepartamentoDireccionpevcDepartamentoInstance() == null || this.getDireccionDelDepartamentoDireccionpevcDepartamentoInstance().isNull()) {
            throw new NotNullArgumentException(DireccionConstants.SERV_ID_DELDEPARTAMENTODIRECCION, DireccionConstants.CLASS_ID, DireccionConstants.ARG_ID_DELDEPARTAMENTODIRECCION_DIRECCIONDELDEPARTAMENTODIRECCIONPEVCDEPARTAMENTO, DireccionConstants.SERV_ALIAS_DELDEPARTAMENTODIRECCION, DireccionConstants.CLASS_ALIAS, DireccionConstants.ARG_ALIAS_DELDEPARTAMENTODIRECCION_DIRECCIONDELDEPARTAMENTODIRECCIONPEVCDEPARTAMENTO);
        }
    }
}
