package com.keralty.aepersonas.viewmodel.departamento.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.DepartamentoConstants;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.Direccion;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.persistence.oid.DireccionOid;

public class InsDepartamentoDireccionRequest {

    @JsonProperty("p_thisdepartamento_oid")
    private DepartamentoOid departamentoInsDepartamentoDireccionpthisDepartamento;
    
    @JsonIgnore
    private Departamento departamentoInsDepartamentoDireccionpthisDepartamentoInstance;

    @JsonProperty("p_evcdireccion_oid")
    private DireccionOid departamentoInsDepartamentoDireccionpevcDireccion;
    
    @JsonIgnore
    private Direccion departamentoInsDepartamentoDireccionpevcDireccionInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkDepartamentoInsDepartamentoDireccionpthisDepartamento();
        checkDepartamentoInsDepartamentoDireccionpevcDireccion();
    }

    @JsonIgnore
    public DepartamentoOid getDepartamentoInsDepartamentoDireccionpthisDepartamento() {
        return this.departamentoInsDepartamentoDireccionpthisDepartamento;
    }
    
    public void setDepartamentoInsDepartamentoDireccionpthisDepartamento(DepartamentoOid departamentoInsDepartamentoDireccionpthisDepartamento) {
        this.departamentoInsDepartamentoDireccionpthisDepartamento = departamentoInsDepartamentoDireccionpthisDepartamento;
    }

    @JsonIgnore
    public Departamento getDepartamentoInsDepartamentoDireccionpthisDepartamentoInstance() {
        return this.departamentoInsDepartamentoDireccionpthisDepartamentoInstance;
    }
    
    public void setDepartamentoInsDepartamentoDireccionpthisDepartamentoInstance(Departamento departamentoInsDepartamentoDireccionpthisDepartamento) {
        this.departamentoInsDepartamentoDireccionpthisDepartamentoInstance = departamentoInsDepartamentoDireccionpthisDepartamento;
        this.departamentoInsDepartamentoDireccionpthisDepartamento = departamentoInsDepartamentoDireccionpthisDepartamento != null ? departamentoInsDepartamentoDireccionpthisDepartamento.getOid() : null;
    }

    private void checkDepartamentoInsDepartamentoDireccionpthisDepartamento() throws NotNullArgumentException {
        if(this.getDepartamentoInsDepartamentoDireccionpthisDepartamentoInstance() == null || this.getDepartamentoInsDepartamentoDireccionpthisDepartamentoInstance().isNull()) {
            throw new NotNullArgumentException(DepartamentoConstants.SERV_ID_INSDEPARTAMENTODIRECCION, DepartamentoConstants.CLASS_ID, DepartamentoConstants.ARG_ID_INSDEPARTAMENTODIRECCION_DEPARTAMENTOINSDEPARTAMENTODIRECCIONPTHISDEPARTAMENTO, DepartamentoConstants.SERV_ALIAS_INSDEPARTAMENTODIRECCION, DepartamentoConstants.CLASS_ALIAS, DepartamentoConstants.ARG_ALIAS_INSDEPARTAMENTODIRECCION_DEPARTAMENTOINSDEPARTAMENTODIRECCIONPTHISDEPARTAMENTO);
        }
    }

    @JsonIgnore
    public DireccionOid getDepartamentoInsDepartamentoDireccionpevcDireccion() {
        return this.departamentoInsDepartamentoDireccionpevcDireccion;
    }
    
    public void setDepartamentoInsDepartamentoDireccionpevcDireccion(DireccionOid departamentoInsDepartamentoDireccionpevcDireccion) {
        this.departamentoInsDepartamentoDireccionpevcDireccion = departamentoInsDepartamentoDireccionpevcDireccion;
    }

    @JsonIgnore
    public Direccion getDepartamentoInsDepartamentoDireccionpevcDireccionInstance() {
        return this.departamentoInsDepartamentoDireccionpevcDireccionInstance;
    }
    
    public void setDepartamentoInsDepartamentoDireccionpevcDireccionInstance(Direccion departamentoInsDepartamentoDireccionpevcDireccion) {
        this.departamentoInsDepartamentoDireccionpevcDireccionInstance = departamentoInsDepartamentoDireccionpevcDireccion;
        this.departamentoInsDepartamentoDireccionpevcDireccion = departamentoInsDepartamentoDireccionpevcDireccion != null ? departamentoInsDepartamentoDireccionpevcDireccion.getOid() : null;
    }

    private void checkDepartamentoInsDepartamentoDireccionpevcDireccion() throws NotNullArgumentException {
        if(this.getDepartamentoInsDepartamentoDireccionpevcDireccionInstance() == null || this.getDepartamentoInsDepartamentoDireccionpevcDireccionInstance().isNull()) {
            throw new NotNullArgumentException(DepartamentoConstants.SERV_ID_INSDEPARTAMENTODIRECCION, DepartamentoConstants.CLASS_ID, DepartamentoConstants.ARG_ID_INSDEPARTAMENTODIRECCION_DEPARTAMENTOINSDEPARTAMENTODIRECCIONPEVCDIRECCION, DepartamentoConstants.SERV_ALIAS_INSDEPARTAMENTODIRECCION, DepartamentoConstants.CLASS_ALIAS, DepartamentoConstants.ARG_ALIAS_INSDEPARTAMENTODIRECCION_DEPARTAMENTOINSDEPARTAMENTODIRECCIONPEVCDIRECCION);
        }
    }
}
