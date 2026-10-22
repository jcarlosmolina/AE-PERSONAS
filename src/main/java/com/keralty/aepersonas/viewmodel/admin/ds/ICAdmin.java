package com.keralty.aepersonas.viewmodel.admin.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Admin;
public class ICAdmin {

    @JsonProperty("primernombre")
    private String iCAdminPrimerNombre;

    @JsonProperty("segundonombre")
    private String iCAdminSegundoNombre;

    @JsonProperty("primerapellido")
    private String iCAdminPrimerApellido;

    public ICAdmin() {
    
    }

    public ICAdmin(Admin instance) {
        if (instance != null) {
            try {
                this.iCAdminPrimerNombre = instance.getFuncionarioPrimerNombre();
                this.iCAdminSegundoNombre = instance.getFuncionarioSegundoNombre();
                this.iCAdminPrimerApellido = instance.getFuncionarioPrimerApellido();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getICAdminPrimerNombre() {
        return this.iCAdminPrimerNombre;
    }
    
    public void setICAdminPrimerNombre(String iCAdminPrimerNombre) {
        this.iCAdminPrimerNombre = iCAdminPrimerNombre;
    }

    @JsonIgnore
    public String getICAdminSegundoNombre() {
        return this.iCAdminSegundoNombre;
    }
    
    public void setICAdminSegundoNombre(String iCAdminSegundoNombre) {
        this.iCAdminSegundoNombre = iCAdminSegundoNombre;
    }

    @JsonIgnore
    public String getICAdminPrimerApellido() {
        return this.iCAdminPrimerApellido;
    }
    
    public void setICAdminPrimerApellido(String iCAdminPrimerApellido) {
        this.iCAdminPrimerApellido = iCAdminPrimerApellido;
    }
}
