package com.keralty.aepersonas.viewmodel.companyia.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aepersonas.persistence.Companyia;
public class ICCompanyia {

    @JsonProperty("nombre")
    private String iCCompanyiaNombre;

    public ICCompanyia() {
    
    }

    public ICCompanyia(Companyia instance) {
        if (instance != null) {
            this.iCCompanyiaNombre = instance.getCompanyiaNombre();
        }
    }

    @JsonIgnore
    public String getICCompanyiaNombre() {
        return this.iCCompanyiaNombre;
    }
    
    public void setICCompanyiaNombre(String iCCompanyiaNombre) {
        this.iCCompanyiaNombre = iCCompanyiaNombre;
    }
}
