package com.keralty.aepersonas.viewmodel.estadobeneficiario.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.EstadoBeneficiarioConstants;
import com.keralty.aepersonas.persistence.EstadoBeneficiario;
import com.keralty.aepersonas.persistence.oid.EstadoBeneficiarioOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Usuario;

public class InsEstadoBeneficiarioCORERequest {

    @JsonProperty("p_thisestadobeneficiario_oid")
    private EstadoBeneficiarioOid estadoBeneficiarioInsEstadoBeneficiarioCOREpthisEstadoBeneficiario;
    
    @JsonIgnore
    private EstadoBeneficiario estadoBeneficiarioInsEstadoBeneficiarioCOREpthisEstadoBeneficiarioInstance;

    @JsonProperty("p_evcusuario_oid")
    private UsuarioOid estadoBeneficiarioInsEstadoBeneficiarioCOREpevcUsuario;
    
    @JsonIgnore
    private Usuario estadoBeneficiarioInsEstadoBeneficiarioCOREpevcUsuarioInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkEstadoBeneficiarioInsEstadoBeneficiarioCOREpthisEstadoBeneficiario();
        checkEstadoBeneficiarioInsEstadoBeneficiarioCOREpevcUsuario();
    }

    @JsonIgnore
    public EstadoBeneficiarioOid getEstadoBeneficiarioInsEstadoBeneficiarioCOREpthisEstadoBeneficiario() {
        return this.estadoBeneficiarioInsEstadoBeneficiarioCOREpthisEstadoBeneficiario;
    }
    
    public void setEstadoBeneficiarioInsEstadoBeneficiarioCOREpthisEstadoBeneficiario(EstadoBeneficiarioOid estadoBeneficiarioInsEstadoBeneficiarioCOREpthisEstadoBeneficiario) {
        this.estadoBeneficiarioInsEstadoBeneficiarioCOREpthisEstadoBeneficiario = estadoBeneficiarioInsEstadoBeneficiarioCOREpthisEstadoBeneficiario;
    }

    @JsonIgnore
    public EstadoBeneficiario getEstadoBeneficiarioInsEstadoBeneficiarioCOREpthisEstadoBeneficiarioInstance() {
        return this.estadoBeneficiarioInsEstadoBeneficiarioCOREpthisEstadoBeneficiarioInstance;
    }
    
    public void setEstadoBeneficiarioInsEstadoBeneficiarioCOREpthisEstadoBeneficiarioInstance(EstadoBeneficiario estadoBeneficiarioInsEstadoBeneficiarioCOREpthisEstadoBeneficiario) {
        this.estadoBeneficiarioInsEstadoBeneficiarioCOREpthisEstadoBeneficiarioInstance = estadoBeneficiarioInsEstadoBeneficiarioCOREpthisEstadoBeneficiario;
        this.estadoBeneficiarioInsEstadoBeneficiarioCOREpthisEstadoBeneficiario = estadoBeneficiarioInsEstadoBeneficiarioCOREpthisEstadoBeneficiario != null ? estadoBeneficiarioInsEstadoBeneficiarioCOREpthisEstadoBeneficiario.getOid() : null;
    }

    private void checkEstadoBeneficiarioInsEstadoBeneficiarioCOREpthisEstadoBeneficiario() throws NotNullArgumentException {
        if(this.getEstadoBeneficiarioInsEstadoBeneficiarioCOREpthisEstadoBeneficiarioInstance() == null || this.getEstadoBeneficiarioInsEstadoBeneficiarioCOREpthisEstadoBeneficiarioInstance().isNull()) {
            throw new NotNullArgumentException(EstadoBeneficiarioConstants.SERV_ID_INSESTADOBENEFICIARIOCORE, EstadoBeneficiarioConstants.CLASS_ID, EstadoBeneficiarioConstants.ARG_ID_INSESTADOBENEFICIARIOCORE_ESTADOBENEFICIARIOINSESTADOBENEFICIARIOCOREPTHISESTADOBENEFICIARIO, EstadoBeneficiarioConstants.SERV_ALIAS_INSESTADOBENEFICIARIOCORE, EstadoBeneficiarioConstants.CLASS_ALIAS, EstadoBeneficiarioConstants.ARG_ALIAS_INSESTADOBENEFICIARIOCORE_ESTADOBENEFICIARIOINSESTADOBENEFICIARIOCOREPTHISESTADOBENEFICIARIO);
        }
    }

    @JsonIgnore
    public UsuarioOid getEstadoBeneficiarioInsEstadoBeneficiarioCOREpevcUsuario() {
        return this.estadoBeneficiarioInsEstadoBeneficiarioCOREpevcUsuario;
    }
    
    public void setEstadoBeneficiarioInsEstadoBeneficiarioCOREpevcUsuario(UsuarioOid estadoBeneficiarioInsEstadoBeneficiarioCOREpevcUsuario) {
        this.estadoBeneficiarioInsEstadoBeneficiarioCOREpevcUsuario = estadoBeneficiarioInsEstadoBeneficiarioCOREpevcUsuario;
    }

    @JsonIgnore
    public Usuario getEstadoBeneficiarioInsEstadoBeneficiarioCOREpevcUsuarioInstance() {
        return this.estadoBeneficiarioInsEstadoBeneficiarioCOREpevcUsuarioInstance;
    }
    
    public void setEstadoBeneficiarioInsEstadoBeneficiarioCOREpevcUsuarioInstance(Usuario estadoBeneficiarioInsEstadoBeneficiarioCOREpevcUsuario) {
        this.estadoBeneficiarioInsEstadoBeneficiarioCOREpevcUsuarioInstance = estadoBeneficiarioInsEstadoBeneficiarioCOREpevcUsuario;
        this.estadoBeneficiarioInsEstadoBeneficiarioCOREpevcUsuario = estadoBeneficiarioInsEstadoBeneficiarioCOREpevcUsuario != null ? estadoBeneficiarioInsEstadoBeneficiarioCOREpevcUsuario.getOid() : null;
    }

    private void checkEstadoBeneficiarioInsEstadoBeneficiarioCOREpevcUsuario() throws NotNullArgumentException {
        if(this.getEstadoBeneficiarioInsEstadoBeneficiarioCOREpevcUsuarioInstance() == null || this.getEstadoBeneficiarioInsEstadoBeneficiarioCOREpevcUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(EstadoBeneficiarioConstants.SERV_ID_INSESTADOBENEFICIARIOCORE, EstadoBeneficiarioConstants.CLASS_ID, EstadoBeneficiarioConstants.ARG_ID_INSESTADOBENEFICIARIOCORE_ESTADOBENEFICIARIOINSESTADOBENEFICIARIOCOREPEVCUSUARIO, EstadoBeneficiarioConstants.SERV_ALIAS_INSESTADOBENEFICIARIOCORE, EstadoBeneficiarioConstants.CLASS_ALIAS, EstadoBeneficiarioConstants.ARG_ALIAS_INSESTADOBENEFICIARIOCORE_ESTADOBENEFICIARIOINSESTADOBENEFICIARIOCOREPEVCUSUARIO);
        }
    }
}
