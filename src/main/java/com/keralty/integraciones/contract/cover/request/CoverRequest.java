package com.keralty.integraciones.contract.cover.request;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Añade el campo 'lastValid' al request de 'cover'
 */
public class CoverRequest extends CoverRequestBase {
    private Boolean lastValid;
    
    @JsonProperty("lastValid")
    public Boolean getLastValid() { return lastValid; }
    @JsonProperty("lastValid")
    public void setLastValid(Boolean value) { this.lastValid = value; }
}
