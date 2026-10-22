package com.keralty.aepersonas.viewmodel.departamento.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.DepartamentoConstants;
import com.keralty.aepersonas.persistence.Departamento;
import com.keralty.aepersonas.persistence.oid.DepartamentoOid;
import com.keralty.aepersonas.persistence.oid.PersonaOid;
import com.keralty.aepersonas.persistence.Persona;

public class DelDptoNacimientoPersonaRequest {

    @JsonProperty("p_thisdepartamento_oid")
    private DepartamentoOid departamentoDelDptoNacimientoPersonapthisDepartamento;
    
    @JsonIgnore
    private Departamento departamentoDelDptoNacimientoPersonapthisDepartamentoInstance;

    @JsonProperty("p_evcpersona_oid")
    private PersonaOid departamentoDelDptoNacimientoPersonapevcPersona;
    
    @JsonIgnore
    private Persona departamentoDelDptoNacimientoPersonapevcPersonaInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkDepartamentoDelDptoNacimientoPersonapthisDepartamento();
        checkDepartamentoDelDptoNacimientoPersonapevcPersona();
    }

    @JsonIgnore
    public DepartamentoOid getDepartamentoDelDptoNacimientoPersonapthisDepartamento() {
        return this.departamentoDelDptoNacimientoPersonapthisDepartamento;
    }
    
    public void setDepartamentoDelDptoNacimientoPersonapthisDepartamento(DepartamentoOid departamentoDelDptoNacimientoPersonapthisDepartamento) {
        this.departamentoDelDptoNacimientoPersonapthisDepartamento = departamentoDelDptoNacimientoPersonapthisDepartamento;
    }

    @JsonIgnore
    public Departamento getDepartamentoDelDptoNacimientoPersonapthisDepartamentoInstance() {
        return this.departamentoDelDptoNacimientoPersonapthisDepartamentoInstance;
    }
    
    public void setDepartamentoDelDptoNacimientoPersonapthisDepartamentoInstance(Departamento departamentoDelDptoNacimientoPersonapthisDepartamento) {
        this.departamentoDelDptoNacimientoPersonapthisDepartamentoInstance = departamentoDelDptoNacimientoPersonapthisDepartamento;
        this.departamentoDelDptoNacimientoPersonapthisDepartamento = departamentoDelDptoNacimientoPersonapthisDepartamento != null ? departamentoDelDptoNacimientoPersonapthisDepartamento.getOid() : null;
    }

    private void checkDepartamentoDelDptoNacimientoPersonapthisDepartamento() throws NotNullArgumentException {
        if(this.getDepartamentoDelDptoNacimientoPersonapthisDepartamentoInstance() == null || this.getDepartamentoDelDptoNacimientoPersonapthisDepartamentoInstance().isNull()) {
            throw new NotNullArgumentException(DepartamentoConstants.SERV_ID_DELDPTONACIMIENTOPERSONA, DepartamentoConstants.CLASS_ID, DepartamentoConstants.ARG_ID_DELDPTONACIMIENTOPERSONA_DEPARTAMENTODELDPTONACIMIENTOPERSONAPTHISDEPARTAMENTO, DepartamentoConstants.SERV_ALIAS_DELDPTONACIMIENTOPERSONA, DepartamentoConstants.CLASS_ALIAS, DepartamentoConstants.ARG_ALIAS_DELDPTONACIMIENTOPERSONA_DEPARTAMENTODELDPTONACIMIENTOPERSONAPTHISDEPARTAMENTO);
        }
    }

    @JsonIgnore
    public PersonaOid getDepartamentoDelDptoNacimientoPersonapevcPersona() {
        return this.departamentoDelDptoNacimientoPersonapevcPersona;
    }
    
    public void setDepartamentoDelDptoNacimientoPersonapevcPersona(PersonaOid departamentoDelDptoNacimientoPersonapevcPersona) {
        this.departamentoDelDptoNacimientoPersonapevcPersona = departamentoDelDptoNacimientoPersonapevcPersona;
    }

    @JsonIgnore
    public Persona getDepartamentoDelDptoNacimientoPersonapevcPersonaInstance() {
        return this.departamentoDelDptoNacimientoPersonapevcPersonaInstance;
    }
    
    public void setDepartamentoDelDptoNacimientoPersonapevcPersonaInstance(Persona departamentoDelDptoNacimientoPersonapevcPersona) {
        this.departamentoDelDptoNacimientoPersonapevcPersonaInstance = departamentoDelDptoNacimientoPersonapevcPersona;
        this.departamentoDelDptoNacimientoPersonapevcPersona = departamentoDelDptoNacimientoPersonapevcPersona != null ? departamentoDelDptoNacimientoPersonapevcPersona.getOid() : null;
    }

    private void checkDepartamentoDelDptoNacimientoPersonapevcPersona() throws NotNullArgumentException {
        if(this.getDepartamentoDelDptoNacimientoPersonapevcPersonaInstance() == null || this.getDepartamentoDelDptoNacimientoPersonapevcPersonaInstance().isNull()) {
            throw new NotNullArgumentException(DepartamentoConstants.SERV_ID_DELDPTONACIMIENTOPERSONA, DepartamentoConstants.CLASS_ID, DepartamentoConstants.ARG_ID_DELDPTONACIMIENTOPERSONA_DEPARTAMENTODELDPTONACIMIENTOPERSONAPEVCPERSONA, DepartamentoConstants.SERV_ALIAS_DELDPTONACIMIENTOPERSONA, DepartamentoConstants.CLASS_ALIAS, DepartamentoConstants.ARG_ALIAS_DELDPTONACIMIENTOPERSONA_DEPARTAMENTODELDPTONACIMIENTOPERSONAPEVCPERSONA);
        }
    }
}
