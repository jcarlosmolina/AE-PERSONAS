package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.oid.PlanesOid;
import com.keralty.aepersonas.persistence.oid.ProductosOid;
import com.keralty.aepersonas.persistence.Planes;
import com.keralty.aepersonas.persistence.Productos;
public class FuGetCodTarifaProdPlanAnyoRequest {

    @JsonProperty("pfproducto")
    private ProductosOid pfProducto;

    @JsonIgnore
    private Productos pfProductoInstance;

    @JsonProperty("pfplan")
    private PlanesOid pfPlan;

    @JsonIgnore
    private Planes pfPlanInstance;

    @JsonProperty("pfanyo")
    private Long pfAnyo;

    @JsonProperty("pftipocontrato")
    private Long pfTipoContrato;

    public FuGetCodTarifaProdPlanAnyoRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public ProductosOid getPfProducto() {
        return this.pfProducto;
    }
    
    public void setPfProducto(ProductosOid pfProducto) {
        this.pfProducto = pfProducto;
    }

    @JsonIgnore
    public Productos getPfProductoInstance() {
        if (this.pfProductoInstance == null)
            this.pfProductoInstance = new Productos();
        return this.pfProductoInstance;
    }
    
    public void setPfProductoInstance(Productos pfProducto) {
        this.pfProductoInstance = pfProducto;
        this.pfProducto = pfProducto != null ? pfProducto.getOid() : null;
    }
    @JsonIgnore
    public PlanesOid getPfPlan() {
        return this.pfPlan;
    }
    
    public void setPfPlan(PlanesOid pfPlan) {
        this.pfPlan = pfPlan;
    }

    @JsonIgnore
    public Planes getPfPlanInstance() {
        if (this.pfPlanInstance == null)
            this.pfPlanInstance = new Planes();
        return this.pfPlanInstance;
    }
    
    public void setPfPlanInstance(Planes pfPlan) {
        this.pfPlanInstance = pfPlan;
        this.pfPlan = pfPlan != null ? pfPlan.getOid() : null;
    }
    @JsonIgnore
    public Long getPfAnyo() {
        return this.pfAnyo;
    }
    
    public void setPfAnyo(Long pfAnyo) {
        this.pfAnyo = pfAnyo;
    }
    @JsonIgnore
    public Long getPfTipoContrato() {
        return this.pfTipoContrato;
    }
    
    public void setPfTipoContrato(Long pfTipoContrato) {
        this.pfTipoContrato = pfTipoContrato;
    }
}
