package com.keralty.aepersonas.viewmodel.departamento.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.DepartamentoConstants;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.Persona;

public class InsDptoNacimientoPersonaRequest {

    @JsonProperty("p_thisdepartamento_oid")
    private DepartamentoOid departamentoInsDptoNacimientoPersonapthisDepartamento;
    
    @JsonIgnore
    private Departamento departamentoInsDptoNacimientoPersonapthisDepartamentoInstance;

    @JsonProperty("p_evcpersona_oid")
    private PersonaOid departamentoInsDptoNacimientoPersonapevcPersona;
    
    @JsonIgnore
    private Persona departamentoInsDptoNacimientoPersonapevcPersonaInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkDepartamentoInsDptoNacimientoPersonapthisDepartamento();
        checkDepartamentoInsDptoNacimientoPersonapevcPersona();
    }

    @JsonIgnore
    public DepartamentoOid getDepartamentoInsDptoNacimientoPersonapthisDepartamento() {
        return this.departamentoInsDptoNacimientoPersonapthisDepartamento;
    }
    
    public void setDepartamentoInsDptoNacimientoPersonapthisDepartamento(DepartamentoOid departamentoInsDptoNacimientoPersonapthisDepartamento) {
        this.departamentoInsDptoNacimientoPersonapthisDepartamento = departamentoInsDptoNacimientoPersonapthisDepartamento;
    }

    @JsonIgnore
    public Departamento getDepartamentoInsDptoNacimientoPersonapthisDepartamentoInstance() {
        return this.departamentoInsDptoNacimientoPersonapthisDepartamentoInstance;
    }
    
    public void setDepartamentoInsDptoNacimientoPersonapthisDepartamentoInstance(Departamento departamentoInsDptoNacimientoPersonapthisDepartamento) {
        this.departamentoInsDptoNacimientoPersonapthisDepartamentoInstance = departamentoInsDptoNacimientoPersonapthisDepartamento;
        this.departamentoInsDptoNacimientoPersonapthisDepartamento = departamentoInsDptoNacimientoPersonapthisDepartamento != null ? departamentoInsDptoNacimientoPersonapthisDepartamento.getOid() : null;
    }

    private void checkDepartamentoInsDptoNacimientoPersonapthisDepartamento() throws NotNullArgumentException {
        if(this.getDepartamentoInsDptoNacimientoPersonapthisDepartamentoInstance() == null || this.getDepartamentoInsDptoNacimientoPersonapthisDepartamentoInstance().isNull()) {
            throw new NotNullArgumentException(DepartamentoConstants.SERV_ID_INSDPTONACIMIENTOPERSONA, DepartamentoConstants.CLASS_ID, DepartamentoConstants.ARG_ID_INSDPTONACIMIENTOPERSONA_DEPARTAMENTOINSDPTONACIMIENTOPERSONAPTHISDEPARTAMENTO, DepartamentoConstants.SERV_ALIAS_INSDPTONACIMIENTOPERSONA, DepartamentoConstants.CLASS_ALIAS, DepartamentoConstants.ARG_ALIAS_INSDPTONACIMIENTOPERSONA_DEPARTAMENTOINSDPTONACIMIENTOPERSONAPTHISDEPARTAMENTO);
        }
    }

    @JsonIgnore
    public PersonaOid getDepartamentoInsDptoNacimientoPersonapevcPersona() {
        return this.departamentoInsDptoNacimientoPersonapevcPersona;
    }
    
    public void setDepartamentoInsDptoNacimientoPersonapevcPersona(PersonaOid departamentoInsDptoNacimientoPersonapevcPersona) {
        this.departamentoInsDptoNacimientoPersonapevcPersona = departamentoInsDptoNacimientoPersonapevcPersona;
    }

    @JsonIgnore
    public Persona getDepartamentoInsDptoNacimientoPersonapevcPersonaInstance() {
        return this.departamentoInsDptoNacimientoPersonapevcPersonaInstance;
    }
    
    public void setDepartamentoInsDptoNacimientoPersonapevcPersonaInstance(Persona departamentoInsDptoNacimientoPersonapevcPersona) {
        this.departamentoInsDptoNacimientoPersonapevcPersonaInstance = departamentoInsDptoNacimientoPersonapevcPersona;
        this.departamentoInsDptoNacimientoPersonapevcPersona = departamentoInsDptoNacimientoPersonapevcPersona != null ? departamentoInsDptoNacimientoPersonapevcPersona.getOid() : null;
    }

    private void checkDepartamentoInsDptoNacimientoPersonapevcPersona() throws NotNullArgumentException {
        if(this.getDepartamentoInsDptoNacimientoPersonapevcPersonaInstance() == null || this.getDepartamentoInsDptoNacimientoPersonapevcPersonaInstance().isNull()) {
            throw new NotNullArgumentException(DepartamentoConstants.SERV_ID_INSDPTONACIMIENTOPERSONA, DepartamentoConstants.CLASS_ID, DepartamentoConstants.ARG_ID_INSDPTONACIMIENTOPERSONA_DEPARTAMENTOINSDPTONACIMIENTOPERSONAPEVCPERSONA, DepartamentoConstants.SERV_ALIAS_INSDPTONACIMIENTOPERSONA, DepartamentoConstants.CLASS_ALIAS, DepartamentoConstants.ARG_ALIAS_INSDPTONACIMIENTOPERSONA_DEPARTAMENTOINSDPTONACIMIENTOPERSONAPEVCPERSONA);
        }
    }
}
