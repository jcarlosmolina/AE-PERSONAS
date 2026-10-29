package com.keralty.aepersonas.viewmodel.estadobeneficiario.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.exception.NotNullArgumentException;
import com.keralty.aepersonas.global.EstadoBeneficiarioConstants;
import com.keralty.aepersonas.persistence.EstadoBeneficiario;
import com.keralty.aepersonas.persistence.oid.EstadoBeneficiarioOid;
import com.keralty.aepersonas.persistence.oid.UsuarioOid;
import com.keralty.aepersonas.persistence.Usuario;

public class DelEstadoBeneficiarioCORERequest {

    @JsonProperty("p_thisestadobeneficiario_oid")
    private EstadoBeneficiarioOid estadoBeneficiarioDelEstadoBeneficiarioCOREpthisEstadoBeneficiario;
    
    @JsonIgnore
    private EstadoBeneficiario estadoBeneficiarioDelEstadoBeneficiarioCOREpthisEstadoBeneficiarioInstance;

    @JsonProperty("p_evcusuario_oid")
    private UsuarioOid estadoBeneficiarioDelEstadoBeneficiarioCOREpevcUsuario;
    
    @JsonIgnore
    private Usuario estadoBeneficiarioDelEstadoBeneficiarioCOREpevcUsuarioInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkEstadoBeneficiarioDelEstadoBeneficiarioCOREpthisEstadoBeneficiario();
        checkEstadoBeneficiarioDelEstadoBeneficiarioCOREpevcUsuario();
    }

    @JsonIgnore
    public EstadoBeneficiarioOid getEstadoBeneficiarioDelEstadoBeneficiarioCOREpthisEstadoBeneficiario() {
        return this.estadoBeneficiarioDelEstadoBeneficiarioCOREpthisEstadoBeneficiario;
    }
    
    public void setEstadoBeneficiarioDelEstadoBeneficiarioCOREpthisEstadoBeneficiario(EstadoBeneficiarioOid estadoBeneficiarioDelEstadoBeneficiarioCOREpthisEstadoBeneficiario) {
        this.estadoBeneficiarioDelEstadoBeneficiarioCOREpthisEstadoBeneficiario = estadoBeneficiarioDelEstadoBeneficiarioCOREpthisEstadoBeneficiario;
    }

    @JsonIgnore
    public EstadoBeneficiario getEstadoBeneficiarioDelEstadoBeneficiarioCOREpthisEstadoBeneficiarioInstance() {
        return this.estadoBeneficiarioDelEstadoBeneficiarioCOREpthisEstadoBeneficiarioInstance;
    }
    
    public void setEstadoBeneficiarioDelEstadoBeneficiarioCOREpthisEstadoBeneficiarioInstance(EstadoBeneficiario estadoBeneficiarioDelEstadoBeneficiarioCOREpthisEstadoBeneficiario) {
        this.estadoBeneficiarioDelEstadoBeneficiarioCOREpthisEstadoBeneficiarioInstance = estadoBeneficiarioDelEstadoBeneficiarioCOREpthisEstadoBeneficiario;
        this.estadoBeneficiarioDelEstadoBeneficiarioCOREpthisEstadoBeneficiario = estadoBeneficiarioDelEstadoBeneficiarioCOREpthisEstadoBeneficiario != null ? estadoBeneficiarioDelEstadoBeneficiarioCOREpthisEstadoBeneficiario.getOid() : null;
    }

    private void checkEstadoBeneficiarioDelEstadoBeneficiarioCOREpthisEstadoBeneficiario() throws NotNullArgumentException {
        if(this.getEstadoBeneficiarioDelEstadoBeneficiarioCOREpthisEstadoBeneficiarioInstance() == null || this.getEstadoBeneficiarioDelEstadoBeneficiarioCOREpthisEstadoBeneficiarioInstance().isNull()) {
            throw new NotNullArgumentException(EstadoBeneficiarioConstants.SERV_ID_DELESTADOBENEFICIARIOCORE, EstadoBeneficiarioConstants.CLASS_ID, EstadoBeneficiarioConstants.ARG_ID_DELESTADOBENEFICIARIOCORE_ESTADOBENEFICIARIODELESTADOBENEFICIARIOCOREPTHISESTADOBENEFICIARIO, EstadoBeneficiarioConstants.SERV_ALIAS_DELESTADOBENEFICIARIOCORE, EstadoBeneficiarioConstants.CLASS_ALIAS, EstadoBeneficiarioConstants.ARG_ALIAS_DELESTADOBENEFICIARIOCORE_ESTADOBENEFICIARIODELESTADOBENEFICIARIOCOREPTHISESTADOBENEFICIARIO);
        }
    }

    @JsonIgnore
    public UsuarioOid getEstadoBeneficiarioDelEstadoBeneficiarioCOREpevcUsuario() {
        return this.estadoBeneficiarioDelEstadoBeneficiarioCOREpevcUsuario;
    }
    
    public void setEstadoBeneficiarioDelEstadoBeneficiarioCOREpevcUsuario(UsuarioOid estadoBeneficiarioDelEstadoBeneficiarioCOREpevcUsuario) {
        this.estadoBeneficiarioDelEstadoBeneficiarioCOREpevcUsuario = estadoBeneficiarioDelEstadoBeneficiarioCOREpevcUsuario;
    }

    @JsonIgnore
    public Usuario getEstadoBeneficiarioDelEstadoBeneficiarioCOREpevcUsuarioInstance() {
        return this.estadoBeneficiarioDelEstadoBeneficiarioCOREpevcUsuarioInstance;
    }
    
    public void setEstadoBeneficiarioDelEstadoBeneficiarioCOREpevcUsuarioInstance(Usuario estadoBeneficiarioDelEstadoBeneficiarioCOREpevcUsuario) {
        this.estadoBeneficiarioDelEstadoBeneficiarioCOREpevcUsuarioInstance = estadoBeneficiarioDelEstadoBeneficiarioCOREpevcUsuario;
        this.estadoBeneficiarioDelEstadoBeneficiarioCOREpevcUsuario = estadoBeneficiarioDelEstadoBeneficiarioCOREpevcUsuario != null ? estadoBeneficiarioDelEstadoBeneficiarioCOREpevcUsuario.getOid() : null;
    }

    private void checkEstadoBeneficiarioDelEstadoBeneficiarioCOREpevcUsuario() throws NotNullArgumentException {
        if(this.getEstadoBeneficiarioDelEstadoBeneficiarioCOREpevcUsuarioInstance() == null || this.getEstadoBeneficiarioDelEstadoBeneficiarioCOREpevcUsuarioInstance().isNull()) {
            throw new NotNullArgumentException(EstadoBeneficiarioConstants.SERV_ID_DELESTADOBENEFICIARIOCORE, EstadoBeneficiarioConstants.CLASS_ID, EstadoBeneficiarioConstants.ARG_ID_DELESTADOBENEFICIARIOCORE_ESTADOBENEFICIARIODELESTADOBENEFICIARIOCOREPEVCUSUARIO, EstadoBeneficiarioConstants.SERV_ALIAS_DELESTADOBENEFICIARIOCORE, EstadoBeneficiarioConstants.CLASS_ALIAS, EstadoBeneficiarioConstants.ARG_ALIAS_DELESTADOBENEFICIARIOCORE_ESTADOBENEFICIARIODELESTADOBENEFICIARIOCOREPEVCUSUARIO);
        }
    }
}
