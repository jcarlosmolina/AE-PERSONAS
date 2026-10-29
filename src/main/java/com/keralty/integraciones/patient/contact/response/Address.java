package com.keralty.integraciones.patient.contact.response;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {
    private String code;
    private String use;
    private String text;
    private City city;
    private City state;
    private City country;

    @JsonProperty("code")
    public String getCode() { return code; }
    @JsonProperty("code")
    public void setCode(String value) { this.code = value; }

    @JsonProperty("use")
    public String getUse() { return use; }
    @JsonProperty("use")
    public void setUse(String value) { this.use = value; }

    @JsonProperty("text")
    public String getText() { return text; }
    @JsonProperty("text")
    public void setText(String value) { this.text = value; }

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
