package com.keralty.integraciones.patient.basicdata.response;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ValueAddress {
    private City city;
    private City state;
    private City country;

    @JsonProperty("city")
    public City getCity() { return city; }
    @JsonProperty("city")
    public void setCity(City value) { this.city = value; }

    @JsonProperty("state")
    public City getState() { return state; }
    @JsonProperty("state")
    public void setState(City value) { this.state = value; }

    @JsonProperty("country")
    public City getCountry() { return country; }
    @JsonProperty("country")
    public void setCountry(City value) { this.country = value; }
}
