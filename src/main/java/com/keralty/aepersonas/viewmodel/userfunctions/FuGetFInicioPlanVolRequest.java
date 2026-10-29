package com.keralty.aepersonas.viewmodel.userfunctions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneDeserializer;
import com.keralty.aepersonas.viewmodel.SqlDateWithoutTimezoneSerializer;
import java.sql.Date;
public class FuGetFInicioPlanVolRequest {

    @JsonProperty("pftipotramite")
    private Long pfTipoTramite;

    @JsonProperty("pftipocontrato")
    private Long pfTipoContrato;

    @JsonProperty("pffecha")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date pfFecha;

    public FuGetFInicioPlanVolRequest() {
        // Default constructor
    }
    
    @JsonIgnore
    public Long getPfTipoTramite() {
        return this.pfTipoTramite;
    }
    
    public void setPfTipoTramite(Long pfTipoTramite) {
        this.pfTipoTramite = pfTipoTramite;
    }
    @JsonIgnore
    public Long getPfTipoContrato() {
        return this.pfTipoContrato;
    }
    
    public void setPfTipoContrato(Long pfTipoContrato) {
        this.pfTipoContrato = pfTipoContrato;
    }
    @JsonIgnore
    public Date getPfFecha() {
        return this.pfFecha;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setPfFecha(Date pfFecha) {
        this.pfFecha = pfFecha;
    }
}
