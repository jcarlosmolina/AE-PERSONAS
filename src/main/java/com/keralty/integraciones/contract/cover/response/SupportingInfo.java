package com.keralty.integraciones.contract.cover.response;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SupportingInfo {
    private Long generalSystemSocialSecurityHealth;

    @JsonProperty("generalSystemSocialSecurityHealth")
    public Long getGeneralSystemSocialSecurityHealth() { return generalSystemSocialSecurityHealth; }
    @JsonProperty("generalSystemSocialSecurityHealth")
    public void setGeneralSystemSocialSecurityHealth(Long value) { this.generalSystemSocialSecurityHealth = value; }
}
