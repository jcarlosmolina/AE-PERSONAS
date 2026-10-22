package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class FusubstringTextRequest {

    @JsonProperty("pfu_text")
    private String pfuText;

    @JsonProperty("pfu_desde")
    private Long pfuDesde;

    @JsonProperty("pfu_hasta")
    private Long pfuHasta;

    public FusubstringTextRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public String getPfuText() {
        return this.pfuText;
    }
    
    public void setPfuText(String pfuText) {
        this.pfuText = pfuText;
    }
    @JsonIgnore
    public Long getPfuDesde() {
        return this.pfuDesde;
    }
    
    public void setPfuDesde(Long pfuDesde) {
        this.pfuDesde = pfuDesde;
    }
    @JsonIgnore
    public Long getPfuHasta() {
        return this.pfuHasta;
    }
    
    public void setPfuHasta(Long pfuHasta) {
        this.pfuHasta = pfuHasta;
    }
}
