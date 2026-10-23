package com.keralty.integraciones.contract.cover.response;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {
    private String text;
    private City city;
    private City regional;
    private City state;
    private City country;
    private List<Telecom> telecom;

    @JsonProperty("text")
    public String getText() { return text; }
    @JsonProperty("text")
    public void setText(String value) { this.text = value; }

    @JsonProperty("city")
    public City getCity() { return city; }
    @JsonProperty("city")
    public void setCity(City value) { this.city = value; }

    @JsonProperty("regional")
    public City getRegional() { return regional; }
    @JsonProperty("regional")
    public void setRegional(City value) { this.regional = value; }

    @JsonProperty("state")
    public City getState() { return state; }
    @JsonProperty("state")
    public void setState(City value) { this.state = value; }

    @JsonProperty("country")
    public City getCountry() { return country; }
    @JsonProperty("country")
    public void setCountry(City value) { this.country = value; }

    @JsonProperty("telecom")
    public List<Telecom> getTelecom() { return telecom; }
    @JsonProperty("telecom")
    public void setTelecom(List<Telecom> value) { this.telecom = value; }
}
