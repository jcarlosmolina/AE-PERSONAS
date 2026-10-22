package com.keralty.aepersonas.viewmodel.asesor.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Asesor;
public class DSAsesorPIUMaestroProductos {

    @JsonProperty("usuario")
    private String dSAsesorPIUMaestroProductosUsuario;

    @JsonProperty("drvnombrecompleto")
    private String dSAsesorPIUMaestroProductosDrvNombreCompleto;

    public DSAsesorPIUMaestroProductos() {
    
    }

    public DSAsesorPIUMaestroProductos(Asesor instance) {
        if (instance != null) {
            try {
                this.dSAsesorPIUMaestroProductosUsuario = instance.getFuncionarioUsuario();
                this.dSAsesorPIUMaestroProductosDrvNombreCompleto = instance.getFuncionariodrvNombreCompleto();
            } catch (Exception e) {
                org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage());
            }
        }
    }

    @JsonIgnore
    public String getDSAsesorPIUMaestroProductosUsuario() {
        return this.dSAsesorPIUMaestroProductosUsuario;
    }
    
    public void setDSAsesorPIUMaestroProductosUsuario(String dSAsesorPIUMaestroProductosUsuario) {
        this.dSAsesorPIUMaestroProductosUsuario = dSAsesorPIUMaestroProductosUsuario;
    }

    @JsonIgnore
    public String getDSAsesorPIUMaestroProductosDrvNombreCompleto() {
        return this.dSAsesorPIUMaestroProductosDrvNombreCompleto;
    }
    
    public void setDSAsesorPIUMaestroProductosDrvNombreCompleto(String dSAsesorPIUMaestroProductosDrvNombreCompleto) {
        this.dSAsesorPIUMaestroProductosDrvNombreCompleto = dSAsesorPIUMaestroProductosDrvNombreCompleto;
    }
}
