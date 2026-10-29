package com.keralty.aepersonas.viewmodel.superadmin.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.SuperAdmin;
public class ICSuperAdmin {

    @JsonProperty("primernombre")
    private String iCSuperAdminPrimerNombre;

    @JsonProperty("segundonombre")
    private String iCSuperAdminSegundoNombre;

    @JsonProperty("primerapellido")
    private String iCSuperAdminPrimerApellido;

    public ICSuperAdmin() {
    
    }

    public ICSuperAdmin(SuperAdmin instance) {
        if (instance != null) {
            try {
                this.iCSuperAdminPrimerNombre = instance.getFuncionarioPrimerNombre();
                this.iCSuperAdminSegundoNombre = instance.getFuncionarioSegundoNombre();
                this.iCSuperAdminPrimerApellido = instance.getFuncionarioPrimerApellido();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getICSuperAdminPrimerNombre() {
        return this.iCSuperAdminPrimerNombre;
    }
    
    public void setICSuperAdminPrimerNombre(String iCSuperAdminPrimerNombre) {
        this.iCSuperAdminPrimerNombre = iCSuperAdminPrimerNombre;
    }

    @JsonIgnore
    public String getICSuperAdminSegundoNombre() {
        return this.iCSuperAdminSegundoNombre;
    }
    
    public void setICSuperAdminSegundoNombre(String iCSuperAdminSegundoNombre) {
        this.iCSuperAdminSegundoNombre = iCSuperAdminSegundoNombre;
    }

    @JsonIgnore
    public String getICSuperAdminPrimerApellido() {
        return this.iCSuperAdminPrimerApellido;
    }
    
    public void setICSuperAdminPrimerApellido(String iCSuperAdminPrimerApellido) {
        this.iCSuperAdminPrimerApellido = iCSuperAdminPrimerApellido;
    }
}
