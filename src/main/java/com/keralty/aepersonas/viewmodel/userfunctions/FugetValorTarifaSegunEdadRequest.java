package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.keralty.aepersonas.persistence.oid.PlanesOid;
import com.keralty.aepersonas.persistence.oid.ProductosOid;
import com.keralty.aepersonas.persistence.Planes;
import com.keralty.aepersonas.persistence.Productos;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneDeserializer;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneSerializer;
import java.sql.Date;
public class FugetValorTarifaSegunEdadRequest {

    @JsonProperty("pfu_producto")
    private ProductosOid pfuProducto;

    @JsonIgnore
    private Productos pfuProductoInstance;

    @JsonProperty("pfu_plan")
    private PlanesOid pfuPlan;

    @JsonIgnore
    private Planes pfuPlanInstance;

    @JsonProperty("pfu_edad")
    private Long pfuEdad;

    @JsonProperty("pfu_tipocontrato")
    private Long pfuTipoContrato;

    @JsonProperty("pfu_vienetraslado")
    private Boolean pfuVieneTraslado;

    @JsonProperty("pfu_fechacontratacion")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date pfuFechaContratacion;

    public FugetValorTarifaSegunEdadRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public ProductosOid getPfuProducto() {
        return this.pfuProducto;
    }
    
    public void setPfuProducto(ProductosOid pfuProducto) {
        this.pfuProducto = pfuProducto;
    }

    @JsonIgnore
    public Productos getPfuProductoInstance() {
        if (this.pfuProductoInstance == null)
            this.pfuProductoInstance = new Productos();
        return this.pfuProductoInstance;
    }
    
    public void setPfuProductoInstance(Productos pfuProducto) {
        this.pfuProductoInstance = pfuProducto;
        this.pfuProducto = pfuProducto != null ? pfuProducto.getOid() : null;
    }
    @JsonIgnore
    public PlanesOid getPfuPlan() {
        return this.pfuPlan;
    }
    
    public void setPfuPlan(PlanesOid pfuPlan) {
        this.pfuPlan = pfuPlan;
    }

    @JsonIgnore
    public Planes getPfuPlanInstance() {
        if (this.pfuPlanInstance == null)
            this.pfuPlanInstance = new Planes();
        return this.pfuPlanInstance;
    }
    
    public void setPfuPlanInstance(Planes pfuPlan) {
        this.pfuPlanInstance = pfuPlan;
        this.pfuPlan = pfuPlan != null ? pfuPlan.getOid() : null;
    }
    @JsonIgnore
    public Long getPfuEdad() {
        return this.pfuEdad;
    }
    
    public void setPfuEdad(Long pfuEdad) {
        this.pfuEdad = pfuEdad;
    }
    @JsonIgnore
    public Long getPfuTipoContrato() {
        return this.pfuTipoContrato;
    }
    
    public void setPfuTipoContrato(Long pfuTipoContrato) {
        this.pfuTipoContrato = pfuTipoContrato;
    }
    @JsonIgnore
    public Boolean getPfuVieneTraslado() {
        return this.pfuVieneTraslado;
    }
    
    public void setPfuVieneTraslado(Boolean pfuVieneTraslado) {
        this.pfuVieneTraslado = pfuVieneTraslado;
    }
    @JsonIgnore
    public Date getPfuFechaContratacion() {
        return this.pfuFechaContratacion;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setPfuFechaContratacion(Date pfuFechaContratacion) {
        this.pfuFechaContratacion = pfuFechaContratacion;
    }
}
